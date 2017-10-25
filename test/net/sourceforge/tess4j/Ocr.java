package net.sourceforge.tess4j;

import java.io.File;

public class Ocr {
	public static void main(String[] args) {
		File root = new File("C:\\Users\\Dom\\Pictures\\cmbc");
		ITesseract instance = new Tesseract();
		char[] specialCharacters = { '_', '\'', ',', '"', '“', ' ', '’', '-', '*', '\\', ']', '}' };
		try {
			File[] files = root.listFiles();
			for (File file : files) {
				String result = instance.doOCR(file);
				String fileName = file.toString().substring(file.toString().lastIndexOf("\\") + 1);
				System.out.println("图片名：" + fileName + " 识别结果：" + result);
			}
		} catch (TesseractException e) {
			System.err.println(e.getMessage());
		}
	}

}
