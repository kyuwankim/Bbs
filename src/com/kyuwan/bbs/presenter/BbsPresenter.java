package com.kyuwan.bbs.presenter;

import java.util.ArrayList;
import java.util.Scanner;

import com.kyuwan.bbs.model.Bbs;
import com.kyuwan.bbs.view.BbsInput;

public class BbsPresenter {

	final boolean START = true;
	final boolean FINISH = false;
	boolean runFLAG = START;

	// 데이터 임시 저장소
	ArrayList<Bbs> datas;

	Scanner sc;
	BbsInput input;

	/**
	 * 사용할 객체들을 미리 메모리에 로드해둔다, 초기화
	 */
	public BbsPresenter() {
		sc = new Scanner(System.in);
		input = new BbsInput();
		datas = new ArrayList<>();
	}

	public void start() {

		while (runFLAG) {
			System.out.println(" 명령어 입력 [ 1: 목록 2: 쓰기 3:상세보기 ]");
			int command = sc.nextInt();

			switch (command) {
			case 1: {
				break;
			}
			case 2: {
				Bbs bbs = input.process(sc);
				datas.add(bbs);
				
				// datas.add(input.process(sc));

				break;
			}
			case 3: {
				break;
			}
			}

		}

	}

	public void end() {
		runFLAG = FINISH;
	}

}
