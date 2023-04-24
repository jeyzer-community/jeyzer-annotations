package org.jeyzer.annotations;

/*-
 * ---------------------------LICENSE_START---------------------------
 * Jeyzer Annotations
 * --
 * Copyright (C) 2020 - 2023 Jeyzer
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
 * <p>Generates a Jeyzer analysis pattern exclude entry.<br>Example :</p>
 * <code>&lt;exclude name=&quot;RMI notification fetch&quot; pattern=&quot;javax.management.remote.rmi.RMIConnectionImpl.fetchNotifications&quot; priority=&quot;900&quot; /&gt;</code>
 * <p>Pattern entry is generated in the <code>jeyzer_patterns.xml</code> file located in the <code>jeyzer</code> directory under the target/generated-sources directory.<br>If file creation is not possible there, file will be created under the standard generated source code directory.<br>
 * <p>Pattern exclude attributes are :
 * <ul>
 * <li>Name. It is either provided as annotation attribute or deduced from the element name.<br>
 *  For example, for a <code>fetchNotifications</code> method, name will be set as <i>Fetch notifications</i>.<br>
 *  In the case of constructors, name will be set with the class name suffixed with <i>instantiation</i></li>
 * <li>Code pattern. It is prefixed with the fully qualified package name.<br>
 *  For example, if the annotation applies on the <code>RMIConnectionImpl</code> class located in the <code>javax.management.remote.rmi</code> package, pattern will be set as <i>javax.management.remote.rmi.Manager</i>.</li>
 * <li>Priority. It is optional. If specified, value must be set between 101 and 1000.</li>
 * </ul>
 */
@Inherited
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE, ElementType.PACKAGE})
@Retention(RetentionPolicy.SOURCE)
public @interface Exclude {
	/**
	 * The exclude name. Optional
	 * @return the name
	 */
	String name() default "";
	/**
	 * The exclude priority. Optional
	 * @return the priority
	 */
	int priority() default -1;
}
