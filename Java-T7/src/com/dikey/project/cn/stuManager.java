package com.dikey.project.cn;

import java.util.Scanner;

public class stuManager {
	Scanner sc = new Scanner(System.in);
	student[] stus = new student[10];
	int j = 0;

	public void menu() {
		System.out.println("��ӭʹ�ñ�ѧ������ϵͳ��\n�����ˣ�����");
		System.out.println("1.��½\t2.ע��\t3.�һ�����\t0.ע��");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			denglu();
			break;
		case 2:
		case 3:
			System.out.println("�������ڿ����У�����");
			menu();
			break;
		case 0:
			System.out.println("��ע��������\n��ӭ�´�ʹ�ã�����");
			System.exit(0);
			break;

		}
	}

	public void denglu() {
		System.out.println("�������˺ţ�");
		String mString = sc.next();
		System.out.println("���������룺");
		String nString = sc.next();
		if (mString.equals("dikey") && nString.equals("1234")) {
			System.out.println("��½�ɹ�������");
		} else {
			System.out.println("�˺Ż�����������󣡣������������룡����");
			denglu();
		}
		manager();
	}

	public void manager() {
		System.out.println("��ѡ��ʹ�ù���!!!");
		System.out.println("1.���ѧԱ" + "\t" + "2.��ʾ����ѧԱ" + "\t" + "3.����ѧԱ"
				+ "\t" + "4.�޸�ѧԱ" + "\t" + "5.ɾ��ѧԱ" + "\t" + "0.�˳�");
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
			System.out.println("��ע��������\n��ӭ�´�ʹ�ã�����");
			System.exit(0);
			break;
		default:
			System.out.println("ݔ�벻���_��Ո�����x�񣡣���");
			manager();
		}
	}

	public void add() {
		student stu = new student();
		stu.setId(j + 1);
		System.out.println("Ոݔ��W������������");
		stu.setNameString(sc.next());
		System.out.println("Ոݔ��W���Ԅe������");
		stu.setSexString(sc.next());
		System.out.println("Ոݔ��W�����g������");
		stu.setAge(sc.nextInt());
		System.out.println("Ոݔ��W���Ԓ̖�a������");
		stu.setTelString(sc.next());
		stus[j] = stu;
		System.out.println("��ӳɹ�������");
		j++;
		System.out.println("�Ƿ��^�m��ӣ�������Y/N��");
		String a = sc.next();
		switch (a) {
		case "Y":
			add();
		case "N":
			manager();
		default:
			System.out.println("ݔ���e�`������");
			manager();
		}
	}

	// չʾ�W����Ϣ
	public void show() {
		System.out.println("���" + "\t" + "����" + "\t" + "�Ա�" + "\t" + "����"
				+ "\t" + "�绰����");
		for (int a = 0; a < j; a++) {
			System.out.println(stus[a].getId() + "\t" + stus[a].getNameString()
					+ "\t" + stus[a].getSexString() + "\t" + stus[a].getAge()
					+ "\t" + stus[a].getTelString());
		}
		manager();
		System.out.println("NullPointerException");
	}

	// ���ҌW����Ϣ
	public void find() {
		System.out.println("Ո�x����ҷ�ʽ������");
		System.out.println("1.����̖����\t2.����������\t3.�����g����\t4.���Ԓ̖�a����");
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
			System.out.println("ݔ���e�`��Ո����ݔ�룡����");
			find();
		}
	}

	// ���ՌW����̖���ҌW����Ϣ
	public void findId() {
		System.out.println("Ոݔ��Ҫ��ԃ�ı�ţ�");
		int i = sc.nextInt();
		for (int a = 0; a < j; a++) {
			if (stus[a].getId() == i) {
				System.out.println("���" + "\t" + "����" + "\t" + "�Ա�" + "\t"
						+ "����" + "\t" + "�绰����");
				System.out.println(stus[a].getId() + "\t"
						+ stus[a].getNameString() + "\t"
						+ stus[a].getSexString() + "\t" + stus[a].getAge()
						+ "\t" + stus[a].getTelString());
			}
		}
		System.out.println("�Ƿ��^�m���ң�������Y/N��");
		String a = sc.next();
		switch (a) {
		case "Y":
			find();
		case "N":
			manager();
		default:
			System.out.println("ݔ���e�`������");
			manager();
		}
	}

	// ���ՌW���������ҌW����Ϣ
	public void findName() {
		System.out.println("Ոݔ��Ҫ��ԃ�ČW��������");
		String i = sc.next();
		for (int a = 0; a < j; a++) {
			if (stus[a].getNameString().equals(i)) {
				System.out.println("���" + "\t" + "����" + "\t" + "�Ա�" + "\t"
						+ "����" + "\t" + "�绰����");
				System.out.println(stus[a].getId() + "\t"
						+ stus[a].getNameString() + "\t"
						+ stus[a].getSexString() + "\t" + stus[a].getAge()
						+ "\t" + stus[a].getTelString());
			}
		}
		System.out.println("�Ƿ��^�m���ң�������Y/N��");
		String a = sc.next();
		switch (a) {
		case "Y":
			find();
		case "N":
			manager();
		default:
			System.out.println("ݔ���e�`������");
			manager();
		}
	}

	// ���ՌW�����g���ҌW����Ϣ
	public void findAge() {
		System.out.println("Ոݔ��Ҫ��ԃ�ČW�����g��");
		int i = sc.nextInt();
		for (int a = 0; a < j; a++) {
			if (stus[a].getAge() == i) {
				System.out.println("���" + "\t" + "����" + "\t" + "�Ա�" + "\t"
						+ "����" + "\t" + "�绰����");
				System.out.println(stus[a].getId() + "\t"
						+ stus[a].getNameString() + "\t"
						+ stus[a].getSexString() + "\t" + stus[a].getAge()
						+ "\t" + stus[a].getTelString());
			}
		}
		System.out.println("�Ƿ��^�m���ң�������Y/N��");
		String a = sc.next();
		switch (a) {
		case "Y":
			find();
		case "N":
			manager();
		default:
			System.out.println("ݔ���e�`������");
			manager();
		}
	}

	// ���ՌW���Ԓ̖�a���ҌW����Ϣ
	public void findTel() {
		System.out.println("Ոݔ��Ҫ��ԃ�ČW���Ԓ̖�a��");
		String i = sc.next();
		for (int a = 0; a < j; a++) {
			if (stus[a].getTelString().equals(i)) {
				System.out.println("���" + "\t" + "����" + "\t" + "�Ա�" + "\t"
						+ "����" + "\t" + "�绰����");
				System.out.println(stus[a].getId() + "\t"
						+ stus[a].getNameString() + "\t"
						+ stus[a].getSexString() + "\t" + stus[a].getAge()
						+ "\t" + stus[a].getTelString());
			}
		}
		System.out.println("�Ƿ��^�m���ң�������Y/N��");
		String a = sc.next();
		switch (a) {
		case "Y":
			find();
		case "N":
			manager();
		default:
			System.out.println("ݔ���e�`������");
			manager();
		}
	}

	// �޸ČW����Ϣ
	public void change() {
		System.out.println("Ոݔ��Ҫ�޸ĵČW��ID��");
		int i = sc.nextInt();
		for (int a = 0; a < j; a++) {
			if (stus[a].getId() == i) {
				System.out.println("Ոݔ��W������������");
				stus[a].setNameString(sc.next());
				System.out.println("Ոݔ��W���Ԅe������");
				stus[a].setSexString(sc.next());
				System.out.println("Ոݔ��W�����g������");
				stus[a].setAge(sc.nextInt());
				System.out.println("Ոݔ��W���Ԓ̖�a������");
				stus[a].setTelString(sc.next());
			}
		}
		System.out.println("�Ƿ��^�m�޸ģ�������Y/N��");
		String a = sc.next();
		switch (a) {
		case "Y":
			change();
		case "N":
			manager();
		default:
			System.out.println("ݔ���e�`������");
			manager();
		}
	}

	// �h���W����Ϣ
	public void del() {
		System.out.println("Ոݔ��Ҫ�h���ČW����̖��");
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
		System.out.println("�h���ɹ�������");
		System.out.println("�Ƿ��^�m�h����������Y/N��");
		String a = sc.next();
		switch (a) {
		case "Y":
			del();
		case "N":
			manager();
		default:
			System.out.println("ݔ���e�`������");
			manager();
		}
	}
}
