/**********************************************************************************
* $URL: https://source.sakaiproject.org/svn/osp/branches/sakai-2.8.x/matrix/api/src/java/org/theospi/portfolio/matrix/model/ScaffoldingUploadForm.java $
* $Id: ScaffoldingUploadForm.java 59678 2009-04-03 23:20:50Z arwhyte@umich.edu $
***********************************************************************************
*
 * Copyright (c) 2005, 2006, 2008 The Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*
**********************************************************************************/
package org.theospi.portfolio.matrix.model;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sakaiproject.entity.api.Reference;

public class ScaffoldingUploadForm {
   protected final transient Log logger = LogFactory.getLog(getClass());

   private String scaffoldingFileName;
   private Reference uploadedScaffolding;

   public Reference getUploadedScaffolding() {
      return uploadedScaffolding;
   }

   public void setUploadedScaffolding(Reference uploadedScaffolding) {
      this.uploadedScaffolding = uploadedScaffolding;
   }

   public String getScaffoldingFileName() {
      return scaffoldingFileName;
   }

   public void setScaffoldingFileName(String scaffoldingFileName) {
      this.scaffoldingFileName = scaffoldingFileName;
   }

}