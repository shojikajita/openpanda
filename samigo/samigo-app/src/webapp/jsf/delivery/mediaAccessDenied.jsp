<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://www.sakaiproject.org/samigo" prefix="samigo" %>
<!DOCTYPE html
     PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
     "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<!--
* $Id: mediaAccessDenied.jsp 104800 2012-02-17 01:07:35Z ktsao@stanford.edu $
<%--
***********************************************************************************
*
* Copyright (c) 2004, 2005, 2006 The Sakai Foundation.
*
* Licensed under the Educational Community License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.osedu.org/licenses/ECL-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License. 
*
**********************************************************************************/
--%>
-->
  <f:view>
    <html xmlns="http://www.w3.org/1999/xhtml">
      <head><%= request.getAttribute("html.head") %>
      <title><h:outputText value="#{deliveryMessages.access_denied}"/></title>
      </head>
      <body onload="<%= request.getAttribute("html.body.onload") %>">

<div class="portletBody">
<h:form id="redirectLoginForm">
  <h:outputText value="#{deliveryMessages.access_denied}"/>
   <div class="messageSamigo">
  <h:outputText  value="#{deliveryMessages.media_access_denied_message}" /></h3>
  </div>
 <p class="act">
  <h:commandButton value="#{deliveryMessages.button_ok}" type="button"
     styleClass="active" onclick="javascript:window.open('#{delivery.portal}/login','_top')" onkeypress="javascript:window.open('#{delivery.portal}/login','_top')" />

<%--
  <h:commandButton value="#{deliveryMessages.button_ok}" type="submit"
     style="act" action="#{delivery.doit}" >
     <f:actionListener
       type="org.sakaiproject.tool.assessment.ui.listener.delivery.RedirectLoginListener" />
  </h:commandButton>
--%>
</h:form>
</div>
      </body>
    </html>
  </f:view>

