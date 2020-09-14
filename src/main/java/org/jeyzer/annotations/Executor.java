package org.jeyzer.annotations;

/*-
 * ---------------------------LICENSE_START---------------------------
 * Jeyzer Annotations
 * --
 * Copyright (C) 2020 Jeyzer SAS
 * --
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 * ----------------------------LICENSE_END----------------------------
 */

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * <p>Generates a Jeyzer analysis pattern executor entry.<br>Example :</p>
 * <code>&lt;executor name=&quot;HttpServlet.service&quot; pattern=&quot;HTTP request&quot; priority=&quot;900&quot; /&gt;</code>
 * <p>Pattern entry is generated in the <code>jeyzer_patterns.xml</code> file located in the <code>jeyzer</code> directory under the target/generated-sources build directory.<br>If file creation is not possible there, file will be created under the standard generated source code directory.<br>
 * <p>Pattern executor attributes are :
 * <ul>
 * <li>Name. It is either provided as annotation attribute or deduced from the element name.<br>
 *  For example, for a <code>serviceRequest</code> method, name will be set as <i>Service request</i>.</li>
 * <li>Code pattern. It is prefixed with the fully qualified package name.<br>
 *  For example, if the annotation applies on the <code>HttpServlet service</code> method located in the <code>javax.servlet.http</code> package, pattern will be set as <i>javax.servlet.http.HttpServlet.service</i>.</li>
 * <li>Priority. It is optional. If specified, value must be set between 101 and 1000.</li>
 * </ul>
 */
@Inherited
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface Executor {
	/**
	 * The executor name. Optional
	 * @return the name
	 */
	String name() default "";
	/**
	 * The executor priority. Optional
	 * @return the priority
	 */
	int priority() default -1;
}
