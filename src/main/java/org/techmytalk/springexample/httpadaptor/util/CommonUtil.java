/*
 * Copyright 2002-2014 the original author or authors.
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
package org.techmytalk.springexample.httpadaptor.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/**
 * The Class CommonUtil.
 */
public final class CommonUtil {
	private CommonUtil() {

	}

	/** The feed location. */
	public static final String FILE_LOCATION = "/Local/fileLocation/";

	/**
	 * Write to file.
	 * 
	 * @param payload
	 *            the payload
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void writeToFile(Object payload) throws IOException {
		FileWriter fr = new FileWriter(new File(FILE_LOCATION + "abc.xml"),
				false);
		fr.write(payload.toString());
		fr.close();
	}

	/**
	 * Write byte to file.
	 * 
	 * @param paylod
	 *            the paylod
	 * @throws NoSuchAlgorithmException
	 *             the no such algorithm exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void writeByteToFile(Object paylod)
			throws NoSuchAlgorithmException, IOException {
		BufferedOutputStream bos = null;
		try {
			String filename = FILE_LOCATION + "abc1.txt";

			FileOutputStream fos = new FileOutputStream(new File(filename));
			bos = new BufferedOutputStream(fos);
			bos.write((byte[]) paylod);
		} finally {
			if (bos != null)
				bos.close();
		}
	}

}
