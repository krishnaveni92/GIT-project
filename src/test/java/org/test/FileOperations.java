package org.test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOperations {
public static void main(String[] args) throws IOException {
	File f=new File("F:\\Add\\sub\\test\\java\\greens.txt");
	List<String> rdlns = FileUtils.readLines(f);
	for(String str:rdlns) {
		System.out.println(str);
}
}
}