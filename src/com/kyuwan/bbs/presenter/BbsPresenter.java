package com.kyuwan.bbs.presenter;

import java.util.ArrayList;
import java.util.Scanner;

import com.kyuwan.bbs.model.Bbs;
import com.kyuwan.bbs.view.BbsInput;

public class BbsPresenter {

	final boolean START = true;
	final boolean FINISH = false;
	boolean runFLAG = START;

	// ������ �ӽ� �����
	ArrayList<Bbs> datas;

	Scanner sc;
	BbsInput input;

	/**
	 * ����� ��ü���� �̸� �޸𸮿� �ε��صд�, �ʱ�ȭ
	 */
	public BbsPresenter() {
		sc = new Scanner(System.in);
		input = new BbsInput();
		datas = new ArrayList<>();
	}

	public void start() {

		while (runFLAG) {
			System.out.println(" ��ɾ� �Է� [ 1: ��� 2: ���� 3:�󼼺��� ]");
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
