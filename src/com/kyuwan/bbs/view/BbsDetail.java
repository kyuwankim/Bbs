package com.kyuwan.bbs.view;

import com.kyuwan.bbs.model.Bbs;

public class BbsDetail {

	public void showDetail(Bbs bbs) {
		System.out.println(" �۹�ȣ : " + bbs.getId());
		System.out.println(" ���� : " + bbs.getTitle());
		System.out.println(" �ۼ��� : " + bbs.getAuthor());
		System.out.println(" ���� : " + bbs.getDate());
		System.out.println(" ��ȸ�� : " + bbs.getViewcount());
		System.out.println(" ���� : " + bbs.getContent());

	}

}
