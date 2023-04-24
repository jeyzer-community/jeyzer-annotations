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
 * <p>Generates a Jeyzer analysis pattern executor thread name entry.<br>Examples :</p>
 * <code>&lt;executor_thread_name name=&quot;HTTP request processor&quot; pattern_regex=&quot;HTTP worker.*&quot; priority=&quot;500&quot; /&gt;</code><br>
 * <code>&lt;executor_thread_name name=&quot;HTTP request processor&quot; pattern=&quot;HTTP worker&quot; priority=&quot;500&quot; /&gt;</code> 
 * <p>Pattern entry is generated in the <code>jeyzer_patterns.xml</code> file located in the <code>jeyzer</code> directory under the target/generated-sources build directory.<br>If file creation is not possible there, file will be created under the standard generated source code directory.<br>
 * <p>Pattern executor thread name attributes are :
 * <ul>
 * <li>Name. It is provided as mandatory annotation attribute.</li>
 * <li>Thread name pattern or regular expression. It is provided as mandatory annotation attribute.</li>
 * <li>Priority. It is optional. If specified, value must be set between 101 and 1000.</li>
 * </ul>
 */
@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface ExecutorThreadName {
	/**
	 * The executor_thread_name name. Mandatory
	 * @return the name
	 */
	String name() default "";
	/**
	 * The executor_thread_name pattern. This field or the patternRegex one must be set.
	 * @return the thread name pattern
	 */
	String pattern() default "";
	/**
	 * The executor_thread_name regex pattern. This field or the pattern one must be set.
	 * @return the thread name regex pattern
	 */
	String patternRegex() default "";
	/**
	 * The executor_thread_name priority. Optional
	 * @return the priority
	 */
	int priority() default -1;
}
