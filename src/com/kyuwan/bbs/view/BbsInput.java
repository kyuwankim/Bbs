package com.kyuwan.bbs.view;

import java.util.Scanner;

import com.kyuwan.bbs.model.Bbs;

public class BbsInput {

	public Bbs process(Scanner sc){
		
		System.out.println("������ �Է��ϼ���");
		String title = sc.nextLine();
		
		System.out.println("�ۼ��ڸ� �Է��ϼ���");
		String author = sc.nextLine();
		
		System.out.println("������ �Է��ϼ���");
		String content = sc.nextLine();
	
		Bbs bbs = new Bbs();
		bbs.setTitle(title);
		bbs.setAuthor(author);
		bbs.setContent(content);
		
		
		return bbs;
	}
	
	
}
