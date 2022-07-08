package com.auto.utility;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;

public class PathFormer {
	public String constructPath(String folder_fileName) {
		Path currentRelativePath = Paths.get("");
		String currentWorkingDirectory = currentRelativePath.toAbsolutePath().toString();
		System.out.println(currentWorkingDirectory);
		System.out.println(MessageFormat.format("{0}{1}",currentWorkingDirectory, folder_fileName));
		return MessageFormat.format("{0}{1}",currentWorkingDirectory, folder_fileName);
	}
}
