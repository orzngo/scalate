/**
 * Copyright (C) 2009-2011 the original author or authors.
 * See the notice.md file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fusesource.scalate.sample

import _root_.javax.servlet.http.HttpServletRequest
import org.fusesource.scalate.servlet.ServletRenderContext

/**
 * @version $Revision : 1.1 $
 */
object ViewFunctions {
  def encode(path: String)(implicit request: HttpServletRequest): String = {
    "encoded '" + path + "' using request: " + request
  }

  def encode2(path: String): String = {
    // lets import the request/response objects
    import org.fusesource.scalate.servlet.ServletRenderContext._
    
    "encoded2 '" + path + "' using request: " + request
  }

  def encode3(path: String)(implicit renderContext: ServletRenderContext): String = {
    "encoded3 '" + path + "' using renderContext: " + renderContext
  }


}