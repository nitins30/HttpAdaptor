/*
 * Copyright 2002-2011 the original author or authors.
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
package org.techmytalk.springexample.httpadaptor;
import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.techmytalk.springexample.httpadaptor.RequestGateway;

/**
 * 
 * @author TechMyTalk
 * 
 */
@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class HttpClientDemo {
	@Autowired
	RequestGateway requestGateway;
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	@Test
	public void processOrder() throws InterruptedException {
		Object response = "";
		try {

			String str = "<employees><empName>Robert</empName></employees>";
			File file = new File("/Local/fileLocation/test.xml");
			response = requestGateway.echo(file);
		} catch (Exception e) {

		}

		System.out.println("Replied with: " + response.toString());
	}

}
