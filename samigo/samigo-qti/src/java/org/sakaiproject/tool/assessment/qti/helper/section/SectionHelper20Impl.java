/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/sam/tags/sakai-10.5/samigo-qti/src/java/org/sakaiproject/tool/assessment/qti/helper/section/SectionHelper20Impl.java $
 * $Id: SectionHelper20Impl.java 106463 2012-04-02 12:20:09Z david.horwitz@uct.ac.za $
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2008 The Sakai Foundation
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



package org.sakaiproject.tool.assessment.qti.helper.section;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.sakaiproject.tool.assessment.qti.constants.QTIVersion;

/**
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Organization: Sakai Project</p>
 * <p>Support any QTI 2.0 only XML handling code</p>
 * @author Ed Smiley esmiley@stanford.edu
 * @version $Id: SectionHelper20Impl.java 106463 2012-04-02 12:20:09Z david.horwitz@uct.ac.za $
 */

// Note sections for QTI 1.2 and 2.0 are nearly identical
public class SectionHelper20Impl extends SectionHelperBase
{
  private static Log log = LogFactory.getLog(SectionHelper20Impl.class);

  public SectionHelper20Impl()
  {
    log.debug("SectionHelper20Impl");
  }

  /**
   * implementation of base class method
   * @return
   */
  protected int getQtiVersion()
  {
    return QTIVersion.VERSION_2_0;
  }

}
