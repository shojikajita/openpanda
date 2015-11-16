/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/sam/branches/sakai-10.x/samigo-app/src/java/org/sakaiproject/tool/assessment/ui/listener/questionpool/CancelPoolListener.java $
 * $Id: CancelPoolListener.java 319103 2015-05-21 13:52:58Z enietzel@anisakai.com $
 ***********************************************************************************
 *
 * Copyright (c) 2004, 2005, 2006, 2008 The Sakai Foundation
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

package org.sakaiproject.tool.assessment.ui.listener.questionpool;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sakaiproject.tool.assessment.ui.bean.questionpool.QuestionPoolBean;
import org.sakaiproject.tool.assessment.ui.listener.util.ContextUtil;

/**
 * <p>Title: CancelPoolListener</p>
 * <p>Description: Samigo Cancel Pool Listener</p>
 * @version $Id: CancelPoolListener.java 319103 2015-05-21 13:52:58Z enietzel@anisakai.com $
 */

public class CancelPoolListener implements ActionListener
{
  private static Log log = LogFactory.getLog(CancelPoolListener.class);
  private static ContextUtil cu;


  /**
   * Check if the outcome pool is the parent of the current pool or the current outcome pool.
   * @param ae ActionEvent
   * @throws AbortProcessingException
   */
  public void processAction(ActionEvent ae) throws AbortProcessingException
  {
    QuestionPoolBean  qpoolbean= (QuestionPoolBean) cu.lookupBean("questionpool");
    boolean returnToParentPool = "true".equals((String)ae.getComponent().getAttributes().get("returnToParentPool"));
	if(qpoolbean.getCurrentPool().getId()!=null && qpoolbean.getCurrentPool().getId()==qpoolbean.getOutcomePool() && returnToParentPool){
		qpoolbean.setOutcomePool(qpoolbean.getCurrentPool().getParentPoolId());
	}	  

  }

}