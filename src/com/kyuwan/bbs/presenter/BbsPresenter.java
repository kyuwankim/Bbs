package com.kyuwan.bbs.presenter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import com.kyuwan.bbs.model.Bbs;
import com.kyuwan.bbs.view.BbsDetail;
import com.kyuwan.bbs.view.BbsInput;
import com.kyuwan.bbs.view.BbsList;

public class BbsPresenter {

	final boolean START = true;
	final boolean FINISH = false;
	boolean runFLAG = START;

	// 데이터 임시 저장소
	ArrayList<Bbs> datas;

	int number = 0;

	Scanner sc;
	BbsInput input;
	BbsList list;
	BbsDetail detail;

	/**
	 * 사용할 객체들을 미리 메모리에 로드해둔다, 초기화
	 */
	public BbsPresenter() {
		sc = new Scanner(System.in);
		input = new BbsInput();
		list = new BbsList();
		detail = new BbsDetail();
		datas = new ArrayList<>();
	}

	public void start() {

		while (runFLAG) {
			System.out.println("명령어 입력 [ l: 목록 w: 쓰기 d:상세보기 ]");
			String command = sc.nextLine();

			switch (command) {
			case "l": {
				list.showList(datas);
				break;
			}
			case "w": {

				write();
				break;
			}
			case "d": {

				goDetail();
				break;
			}
			}

		}

	}

	public void write() {
		Bbs bbs = input.process(sc);
		// 글번호를 추가하기 위한 영역

		number = number + 1;

		bbs.setId(number);
		bbs.setDate(getDate());
		datas.add(bbs);
		// datas.add(input.process(sc));
	}
	
	private String getDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		long currentTime = System.currentTimeMillis();
		return sdf.format(currentTime);
	}

	// 상세보기 이동
	public void goDetail() {
		System.out.println("글번호를 입력하세요");
		String temp = sc.nextLine();
		long id = Long.parseLong(temp);

		for (Bbs bbs : datas) {
			if (bbs.getId() == id) {
				detail.showDetail(bbs);

				break;
			}
		}
	}

	public void end() {
		runFLAG = FINISH;
	}

}
