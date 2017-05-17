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

	// ������ �ӽ� �����
	ArrayList<Bbs> datas;

	int number = 0;

	Scanner sc;
	BbsInput input;
	BbsList list;
	BbsDetail detail;

	/**
	 * ����� ��ü���� �̸� �޸𸮿� �ε��صд�, �ʱ�ȭ
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
			System.out.println("��ɾ� �Է� [ l: ��� w: ���� d:�󼼺��� ]");
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
		// �۹�ȣ�� �߰��ϱ� ���� ����

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

	// �󼼺��� �̵�
	public void goDetail() {
		System.out.println("�۹�ȣ�� �Է��ϼ���");
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
