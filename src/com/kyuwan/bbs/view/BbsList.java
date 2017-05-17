package com.kyuwan.bbs.view;

import java.util.ArrayList;

import com.kyuwan.bbs.model.Bbs;

public class BbsList {
	// 리스트에서 보여줄 저장소
	ArrayList<Bbs> datas = new ArrayList<>();

	// 목록 보여주기
	public void showList() {
		for (Bbs bbs : datas) {
			System.out.print(bbs.getId() + " | ");
			System.out.print(bbs.getTitle() + " | ");
			System.out.print(bbs.getAuthor() + " | ");
			System.out.print(bbs.getDate() + " | ");
			System.out.println(bbs.getViewcount() + " | ");
		}
	}

	// 쓰기이동
	public void goInput() {

	}

	// 상세보기 이동
	public void goDetail(long id) {

	}

	// 검색
	public void search(String word) {

	}

	// 삭제
	public void delete(long id) {

	}

}
