package org.unibz.file.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.unibz.exceptions.CustomException;

/**
 * The class provides methods to read file content as a string or list of lines.
 * Covered topic: File O/I, try/catch, try (resource), lambda, logging.
 * 
 * @author isidora.erakovic
 *
 */
public class FileReader {
	static Logger log = Logger.getLogger(FileReader.class);

	/**
	 * Reads the file at a given absolute path and returns string content or null.
	 * 
	 * @param filePath absolute file path of the file
	 * @return String content
	 */
	public static String read(String filePath) {
		StringBuilder sb = new StringBuilder();
		List<String> lines = readLines(filePath);
		if (!lines.isEmpty()) {
			lines.forEach(l -> sb.append(l).append(","));
			sb.setLength(sb.length() - 1);
			return sb.toString();
		}

		return null;
	}

	/**
	 * Reads the file at a given absolute path and returns list of lines or empty
	 * list.
	 * 
	 * @param filePath absolute file path of the file
	 * @return list of lines
	 */
	public static List<String> readLines(String filePath) {
		validate(filePath);
		List<String> lines = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new java.io.FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}

		} catch (FileNotFoundException e) {
			log.error(e.getMessage(), e);
			throw new CustomException(e.getMessage(), e);
		} catch (IOException e) {
			log.error(e.getMessage(), e);
			throw new CustomException(e.getMessage(), e);
		}
		log.info("The file with the filepath " + filePath + " contains " + lines.size() + " lines.");

		return lines;
	}

	private static void validate(String filePath) {
		if (filePath == null || filePath.strip().length() == 0) {
			final String message = "filePath argument cannot be null or empty.";
			log.error(message);
			throw new CustomException(message);
		}

	}
}
