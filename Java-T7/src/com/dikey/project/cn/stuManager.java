package com.dikey.project.cn;

import java.util.Scanner;

public class stuManager {
	Scanner sc = new Scanner(System.in);
	student[] stus = new student[10];
	int j = 0;

	public void menu() {
		System.out.println("欢迎使用本学生管理系统！\n制作人：王勇");
		System.out.println("1.登陆\t2.注册\t3.找回密码\t0.注销");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			denglu();
			break;
		case 2:
		case 3:
			System.out.println("功能正在开发中！！！");
			menu();
			break;
		case 0:
			System.out.println("已注销！！！\n欢迎下次使用！！！");
			System.exit(0);
			break;

		}
	}

	public void denglu() {
		System.out.println("请输入账号：");
		String mString = sc.next();
		System.out.println("请输入密码：");
		String nString = sc.next();
		if (mString.equals("dikey") && nString.equals("1234")) {
			System.out.println("登陆成功！！！");
		} else {
			System.out.println("账号或密码输入错误！！！请重新输入！！！");
			denglu();
		}
		manager();
	}

	public void manager() {
		System.out.println("请选择使用功能!!!");
		System.out.println("1.添加学员" + "\t" + "2.显示所有学员" + "\t" + "3.查找学员"
				+ "\t" + "4.修改学员" + "\t" + "5.删除学员" + "\t" + "0.退出");
		int m = sc.nextInt();
		switch (m) {
		case 1:
			add();
			break;
		case 2:
			show();
			break;
		case 3:
			find();
			break;
		case 4:
			change();
			break;
		case 5:
			del();
			break;
		case 0:
			System.out.println("已注销！！！\n欢迎下次使用！！！");
			System.exit(0);
			break;
		default:
			System.out.println("輸入不正確，請重新選擇！！！");
			manager();
		}
	}

	public void add() {
		student stu = new student();
		stu.setId(j + 1);
		System.out.println("請輸入學生姓名！！！");
		stu.setNameString(sc.next());
		System.out.println("請輸入學生性別！！！");
		stu.setSexString(sc.next());
		System.out.println("請輸入學生年齡！！！");
		stu.setAge(sc.nextInt());
		System.out.println("請輸入學生電話號碼！！！");
		stu.setTelString(sc.next());
		stus[j] = stu;
		System.out.println("添加成功！！！");
		j++;
		System.out.println("是否繼續添加？？？（Y/N）");
		String a = sc.next();
		switch (a) {
		case "Y":
			add();
		case "N":
			manager();
		default:
			System.out.println("輸入錯誤！！！");
			manager();
		}
	}

	// 展示學生信息
	public void show() {
		System.out.println("编号" + "\t" + "姓名" + "\t" + "性别" + "\t" + "年龄"
				+ "\t" + "电话号码");
		for (int a = 0; a < j; a++) {
			System.out.println(stus[a].getId() + "\t" + stus[a].getNameString()
					+ "\t" + stus[a].getSexString() + "\t" + stus[a].getAge()
					+ "\t" + stus[a].getTelString());
		}
		manager();
		System.out.println("NullPointerException");
	}

	// 查找學生信息
	public void find() {
		System.out.println("請選擇查找方式！！！");
		System.out.println("1.按編號查找\t2.按姓名查找\t3.按年齡查找\t4.按電話號碼查找");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			findId();
		case 2:
			findName();
		case 3:
			findAge();
		case 4:
			findTel();
		default:
			System.out.println("輸入錯誤，請重新輸入！！！");
			find();
		}
	}

	// 按照學生編號查找學生信息
	public void findId() {
		System.out.println("請輸入要查詢的编号！");
		int i = sc.nextInt();
		for (int a = 0; a < j; a++) {
			if (stus[a].getId() == i) {
				System.out.println("编号" + "\t" + "姓名" + "\t" + "性别" + "\t"
						+ "年龄" + "\t" + "电话号码");
				System.out.println(stus[a].getId() + "\t"
						+ stus[a].getNameString() + "\t"
						+ stus[a].getSexString() + "\t" + stus[a].getAge()
						+ "\t" + stus[a].getTelString());
			}
		}
		System.out.println("是否繼續查找？？？（Y/N）");
		String a = sc.next();
		switch (a) {
		case "Y":
			find();
		case "N":
			manager();
		default:
			System.out.println("輸入錯誤！！！");
			manager();
		}
	}

	// 按照學生姓名查找學生信息
	public void findName() {
		System.out.println("請輸入要查詢的學生姓名！");
		String i = sc.next();
		for (int a = 0; a < j; a++) {
			if (stus[a].getNameString().equals(i)) {
				System.out.println("编号" + "\t" + "姓名" + "\t" + "性别" + "\t"
						+ "年龄" + "\t" + "电话号码");
				System.out.println(stus[a].getId() + "\t"
						+ stus[a].getNameString() + "\t"
						+ stus[a].getSexString() + "\t" + stus[a].getAge()
						+ "\t" + stus[a].getTelString());
			}
		}
		System.out.println("是否繼續查找？？？（Y/N）");
		String a = sc.next();
		switch (a) {
		case "Y":
			find();
		case "N":
			manager();
		default:
			System.out.println("輸入錯誤！！！");
			manager();
		}
	}

	// 按照學生年齡查找學生信息
	public void findAge() {
		System.out.println("請輸入要查詢的學生年齡！");
		int i = sc.nextInt();
		for (int a = 0; a < j; a++) {
			if (stus[a].getAge() == i) {
				System.out.println("编号" + "\t" + "姓名" + "\t" + "性别" + "\t"
						+ "年龄" + "\t" + "电话号码");
				System.out.println(stus[a].getId() + "\t"
						+ stus[a].getNameString() + "\t"
						+ stus[a].getSexString() + "\t" + stus[a].getAge()
						+ "\t" + stus[a].getTelString());
			}
		}
		System.out.println("是否繼續查找？？？（Y/N）");
		String a = sc.next();
		switch (a) {
		case "Y":
			find();
		case "N":
			manager();
		default:
			System.out.println("輸入錯誤！！！");
			manager();
		}
	}

	// 按照學生電話號碼查找學生信息
	public void findTel() {
		System.out.println("請輸入要查詢的學生電話號碼！");
		String i = sc.next();
		for (int a = 0; a < j; a++) {
			if (stus[a].getTelString().equals(i)) {
				System.out.println("编号" + "\t" + "姓名" + "\t" + "性别" + "\t"
						+ "年龄" + "\t" + "电话号码");
				System.out.println(stus[a].getId() + "\t"
						+ stus[a].getNameString() + "\t"
						+ stus[a].getSexString() + "\t" + stus[a].getAge()
						+ "\t" + stus[a].getTelString());
			}
		}
		System.out.println("是否繼續查找？？？（Y/N）");
		String a = sc.next();
		switch (a) {
		case "Y":
			find();
		case "N":
			manager();
		default:
			System.out.println("輸入錯誤！！！");
			manager();
		}
	}

	// 修改學生信息
	public void change() {
		System.out.println("請輸入要修改的學生ID！");
		int i = sc.nextInt();
		for (int a = 0; a < j; a++) {
			if (stus[a].getId() == i) {
				System.out.println("請輸入學生姓名！！！");
				stus[a].setNameString(sc.next());
				System.out.println("請輸入學生性別！！！");
				stus[a].setSexString(sc.next());
				System.out.println("請輸入學生年齡！！！");
				stus[a].setAge(sc.nextInt());
				System.out.println("請輸入學生電話號碼！！！");
				stus[a].setTelString(sc.next());
			}
		}
		System.out.println("是否繼續修改？？？（Y/N）");
		String a = sc.next();
		switch (a) {
		case "Y":
			change();
		case "N":
			manager();
		default:
			System.out.println("輸入錯誤！！！");
			manager();
		}
	}

	// 刪除學生信息
	public void del() {
		System.out.println("請輸入要刪除的學生編號！");
		int i = sc.nextInt();
		if (j != 1) {
			for (int a = 0; a < j; a++) {
				if (stus[a].getId() == i) {
					for (int s = a; s < j; s++) {
						stus[a] = stus[a + 1];
					}
				}
			}
		}
		stus[j - 1] = null;
		j--;
		System.out.println("刪除成功！！！");
		System.out.println("是否繼續刪除？？？（Y/N）");
		String a = sc.next();
		switch (a) {
		case "Y":
			del();
		case "N":
			manager();
		default:
			System.out.println("輸入錯誤！！！");
			manager();
		}
	}
}
