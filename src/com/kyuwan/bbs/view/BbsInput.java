package com.kyuwan.bbs.view;

import java.util.Scanner;

import com.kyuwan.bbs.model.Bbs;

public class BbsInput {

	public Bbs process(Scanner sc){
		
		System.out.println("제목을 입력하세요");
		String title = sc.nextLine();
		
		System.out.println("작성자를 입력하세요");
		String author = sc.nextLine();
		
		System.out.println("내용을 입력하세요");
		String content = sc.nextLine();
	
		Bbs bbs = new Bbs();
		bbs.setTitle(title);
		bbs.setAuthor(author);
		bbs.setContent(content);
		
		
		return bbs;
	}
	
	
}
