package Exam02;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Address> addressList = new ArrayList<Address>();

		while (true) {
			System.out.print("[1]�߰� [2]��ü��ȸ [3]���� [4]�˻� [5]���� >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				// ��ȭ��ȣ��(addressList)�� �� �߰�
				// �̸�, ����, ��ȭ��ȣ�� �Է� �޾Ƽ� -> ��ü�� ����
				// addressList�� �߰���Ű�� ��
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("���� : ");
				int age = sc.nextInt();
				System.out.print("��ȭ��ȣ : ");
				String phoneNumber = sc.next();

				Address address = new Address(name, age, phoneNumber);
				addressList.add(address);
			} else if (menu == 2) {
				if (addressList.size() == 0) {
					System.out.println("��ϵ� ����ó�� �����ϴ�.");
				} else {
					printList(addressList);
				}
			} else if (menu == 3) {
				printList(addressList);
				// �̸����� ����( ��ȣ�� ���� )
//				System.out.print("������ �̸��� �Է����ּ��� >> ");
//				String delete = sc.next(); // int delete = sc.nextInt();
//				for (int i = 0; i < addressList.size(); i++) {
//					if (delete.equals(addressList.get(i).getName())) {
//						// addressList.get(i).getPhoneNumber()
//						addressList.remove(i);
//					}
//				}
				// ��Ϲ�ȣ�� ����
				System.out.print("������ ��Ϲ�ȣ�� �Է����ּ��� >> ");
				int delete = sc.nextInt() - 1;
				addressList.remove(delete);
				printList(addressList);
			} else if (menu == 4) {
				System.out.print("�˻��� ����� �̸��� ���ּ��� >> ");
				String name = sc.next();
				boolean search = false;
				for (int i = 0; i < addressList.size(); i++) {
					if (name.equals(addressList.get(i).getName())) {
						System.out.print((i + 1) + ". " + addressList.get(i).getName());
						System.out.print("( " + addressList.get(i).getage() + "�� ) : ");
						System.out.println(addressList.get(i).getPhoneNumber());
						search = true;
					}
				}
				if (search == false) {
					System.out.println("��ϵ� ����ó�� �����ϴ�.");
				}
			} else if (menu == 5) {
				System.out.println("���α׷� ������ �����Ͻðڽ��ϱ�?");
				System.out.println(" Y / N ");
				String end = sc.next();
				if (end.equals("N")) {
					System.out.println("^^");
				} else {
					System.out.println("���α׷� ����");
					break;
				}
			} else {
				System.out.println("�ٽ� �Է����ּ���");
			}
		}
	}

	// ����Ʈ ��� �޼ҵ�
	public static void printList(ArrayList<Address> address) {
		System.out.println();
		System.out.println("����Ʈ�� ����մϴ�.");
		for (int i = 0; i < address.size(); i++) {
			System.out.print((i + 1) + ". " + address.get(i).getName());
			System.out.print("( " + address.get(i).getage() + "�� ) : ");
			System.out.println(address.get(i).getPhoneNumber());
		}
		System.out.println();
	}
}
