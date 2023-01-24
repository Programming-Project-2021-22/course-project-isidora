package org.unibz.file.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.unibz.exceptions.CustomException;

class FileReaderTest {

	@Test
	void whenFileExists_thenSuccess() {
		String filePath = FileReaderTest.class.getClassLoader().getResource("test.txt").getPath();
		String content = FileReader.read(filePath);
		assertTrue(StringUtils.isNotBlank(content));
		assertEquals("test", content);
	}

	@Test
	void whenFileMissing_thenCustomException() {
		assertThrows(CustomException.class, () -> FileReader.read("test1.txt"));
	}

	@Test
	void whenWrongFilePath_thenCustomException() {
		assertThrows(CustomException.class, () -> FileReader.read(""));
	}

	@Test
	void whenNullFilePath_thenCustomException() {
		assertThrows(CustomException.class, () -> FileReader.read(null));
	}

}
