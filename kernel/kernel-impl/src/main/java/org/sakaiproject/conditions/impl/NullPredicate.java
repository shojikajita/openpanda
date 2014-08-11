/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/kernel/branches/kernel-1.2.x/kernel-impl/src/main/java/org/sakaiproject/conditions/impl/NullPredicate.java $
 * $Id: NullPredicate.java 76892 2010-04-30 16:45:19Z zach@aeroplanesoftware.com $
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2007, 2008 Sakai Foundation
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
package org.sakaiproject.conditions.impl;

import org.apache.commons.collections.Predicate;

public class NullPredicate implements Predicate {

	public boolean evaluate(Object object) {
		throw new IllegalStateException("Cannot call evaluate() on a NullPredicate. NullPredicate is a placeholder only.");
	}

}