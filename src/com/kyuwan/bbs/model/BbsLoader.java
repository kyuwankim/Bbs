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
	final String COLUMN_SEPERATOR = "^^"; // ��ĭ����
	final String RECORD_SEPERATOR = "\r\n"; // ���ٴ���

	/**
	 * ����ҿ��� �����͸� �о��
	 * 
	 * @return
	 */
	public String read() {
		String result = "";

		// TODO

		return result;
	}

	/**
	 * ����ҿ� �����͸� ����
	 * 
	 * @param bbs
	 */
	public void write(Bbs bbs) {
		// bbs�� �ִ� �����͸� �ؽ�Ʈ ���Ͽ� �����Ѵ�
		// 1. �����丮�� ���翩�� �˻�
		File dir = new File(DATABASE_DIR);
		if (!dir.exists()) {
			dir.mkdirs();
		}

		// 1.1 ������ ���翩�� �˻�
		File database = new File(DATABASE_DIR + DATABASE_NAME);
		if (!database.exists()) {
			try {
				database.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// 1.1 ������ �ؽ�Ʈ ���� ����

		// 2. bbs�� ������ database ���Ͽ� ������ �Ѵ�
		// 2.1 �����ϴ� �������� ������ �����ؾ� �Ѵ�
		// 2.1.1 �����ڸ� �����Ѵ�
		// 2.2 bbs�� ������ Ⱦ���� ��ģ��
		String oneData = bbs.getId() + COLUMN_SEPERATOR + bbs.getTitle() + COLUMN_SEPERATOR + bbs.getAuthor()
				+ COLUMN_SEPERATOR + bbs.getDate() + COLUMN_SEPERATOR + bbs.getViewcount() + COLUMN_SEPERATOR
				+ bbs.getContent() + RECORD_SEPERATOR;

		// 3. ������ ������ �����͸� ������ ���� �������ٿ� �����Ѵ�
		// 3.1 FileWriter ��ü�� ����ؼ� ���� �����Ϳ� ��� ���ؾ��� 
		try {
			FileWriter writer = new FileWriter(database, true); // �ι�° ���ڰ� append�� ���� �̾�� ����� ���� 
			writer.append(oneData);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
