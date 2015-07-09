/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/gradebook/tags/sakai-10.5/sample-grade-finalizer/src/main/java/org/sakaiproject/gradebooksample/GradesFinalizerExec.java $
 * $Id: GradesFinalizerExec.java 105079 2012-02-24 23:08:11Z ottenhoff@longsight.com $
 ***********************************************************************************
 *
 * Copyright (c) 2008 The Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.opensource.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakaiproject.gradebooksample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sakaiproject.test.ComponentContainerEmulator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class GradesFinalizerExec {
    private static final Log log = LogFactory.getLog(GradesFinalizerExec.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] springConfigLocations = new String[] {"classpath*:META-INF/spring/*.xml"};
		ComponentContainerEmulator.startComponentManager(System.getProperty("tomcat.home"), System.getProperty("sakai.home"));
		ApplicationContext springContext = new ClassPathXmlApplicationContext(springConfigLocations, (ApplicationContext)ComponentContainerEmulator.getContainerApplicationContext());
		GradesFinalizer gradesFinalizer = (GradesFinalizer)springContext.getBean("gradesFinalizer");
		String siteUid = System.getProperty("siteUid");
		if (log.isInfoEnabled()) log.info("siteUid=" + siteUid);
		if ((siteUid != null) && (siteUid.trim().length() > 0)) {
			gradesFinalizer.setSiteUid(siteUid);
		} else {
			String academicSessionEid = System.getProperty("academicSessionEid");
			if (log.isInfoEnabled()) log.info("academicSessionEid=" + academicSessionEid);
			if ((academicSessionEid != null) && (academicSessionEid.trim().length() > 0)) {
				gradesFinalizer.setAcademicSessionEid(academicSessionEid);
			}
		}
		gradesFinalizer.execute();
		ComponentContainerEmulator.stopComponentManager();
	}

}
