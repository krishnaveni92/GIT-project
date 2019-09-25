package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileOperations {
public static void main(String[] args) throws IOException {
	File f=new File("F:\\Add\\sub\\test\\java");
	FileUtils.write(f, "java Technology");
}
}
