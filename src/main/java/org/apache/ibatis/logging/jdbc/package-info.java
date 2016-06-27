/*
 *    Copyright 2009-2012 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

/**
 * Logging proxies that logs any JDBC statement.
 * 输出sql语句的log？
 * 将jdbc操作以开发者配置的日志框架打印出来，这也就是我们在开发阶段常用的跟踪sql语句，传入参数，影响行数等的调试信息
 *
 */
package org.apache.ibatis.logging.jdbc;
