/*
 * Copyright 2013 Alex Lin.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.opoo.press.highlighter;

import java.util.List;

/**
 * Highlight code block processor.
 * 
 * @author Alex Lin
 *
 */
public interface Highlighter {
	/**
	 * Determine the content contains highlight CodeBlock or not.
	 * @param content the content string
	 * @return is string contains highlight code block, return true
	 */
	boolean containsHighlightCodeBlock(String content);
	
	/**
	 * Return the Highlighter name, such as 'SyntaxHighlighter'.
	 * @return the Highlighter name
	 */
	String getHighlighterName();
	
	
	void highlight(StringBuilder out, List<String> lines, String meta); 
	
	//void highlight(StringBuilder out, String content, Map<String,Object> meta);
}
