package com.kyuwan.bbs.view;

import com.kyuwan.bbs.model.Bbs;

public class BbsDetail {

	public void showDetail(Bbs bbs) {
		System.out.println(" 글번호 : " + bbs.getId());
		System.out.println(" 제목 : " + bbs.getTitle());
		System.out.println(" 작성자 : " + bbs.getAuthor());
		System.out.println(" 날자 : " + bbs.getDate());
		System.out.println(" 조회수 : " + bbs.getViewcount());
		System.out.println(" 내용 : " + bbs.getContent());

	}

}
