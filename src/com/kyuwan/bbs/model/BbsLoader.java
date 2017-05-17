package com.kyuwan.bbs.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BbsLoader {
	final String DATABASE_DIR = "/Users/kimkyuwan/Desktop";
	final String DATABASE_NAME = "bbs.db";
	final String COLUMN_SEPERATOR = "^^"; // 한칸단위
	final String RECORD_SEPERATOR = "\r\n"; // 한줄단위

	/**
	 * 저장소에서 데이터를 읽어옴
	 * 
	 * @return
	 */
	public String read() {
		String result = "";

		// TODO

		return result;
	}

	/**
	 * 저장소에 데이터를 저장
	 * 
	 * @param bbs
	 */
	public void write(Bbs bbs) {
		// bbs에 있는 데이터를 텍스트 파일에 저장한다
		// 1. 디텍토리의 존재여부 검사
		File dir = new File(DATABASE_DIR);
		if (!dir.exists()) {
			dir.mkdirs();
		}

		// 1.1 파일의 존재여부 검사
		File database = new File(DATABASE_DIR + DATABASE_NAME);
		if (!database.exists()) {
			try {
				database.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// 1.1 없으면 텍스트 파일 생성

		// 2. bbs의 내용을 database 파일에 저장을 한다
		// 2.1 저장하는 데이터의 구조를 설계해야 한다
		// 2.1.1 구분자를 정의한다
		// 2.2 bbs의 내용을 횡으로 펼친다
		String oneData = bbs.getId() + COLUMN_SEPERATOR + bbs.getTitle() + COLUMN_SEPERATOR + bbs.getAuthor()
				+ COLUMN_SEPERATOR + bbs.getDate() + COLUMN_SEPERATOR + bbs.getViewcount() + COLUMN_SEPERATOR
				+ bbs.getContent() + RECORD_SEPERATOR;

		// 3. 행으로 펼쳐진 데이터를 파일의 제일 마지막줄에 저장한다
		// 3.1 FileWriter 객체를 사용해서 기존 데이터에 계속 더해쓴다 
		try {
			FileWriter writer = new FileWriter(database, true); // 두번째 인자가 append를 통해 이어쓸지 덮어쓸지 설정 
			writer.append(oneData);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
