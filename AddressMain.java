package Exam02;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Address> addressList = new ArrayList<Address>();

		while (true) {
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				// 전화번호부(addressList)에 값 추가
				// 이름, 나이, 전화번호를 입력 받아서 -> 객체로 만들어서
				// addressList에 추가시키면 됨
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String phoneNumber = sc.next();

				Address address = new Address(name, age, phoneNumber);
				addressList.add(address);
			} else if (menu == 2) {
				if (addressList.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				} else {
					printList(addressList);
				}
			} else if (menu == 3) {
				printList(addressList);
				// 이름으로 삭제( 번호로 삭제 )
//				System.out.print("삭제할 이름을 입력해주세요 >> ");
//				String delete = sc.next(); // int delete = sc.nextInt();
//				for (int i = 0; i < addressList.size(); i++) {
//					if (delete.equals(addressList.get(i).getName())) {
//						// addressList.get(i).getPhoneNumber()
//						addressList.remove(i);
//					}
//				}
				// 등록번호로 삭제
				System.out.print("삭제할 등록번호를 입력해주세요 >> ");
				int delete = sc.nextInt() - 1;
				addressList.remove(delete);
				printList(addressList);
			} else if (menu == 4) {
				System.out.print("검색할 사람의 이름을 써주세요 >> ");
				String name = sc.next();
				boolean search = false;
				for (int i = 0; i < addressList.size(); i++) {
					if (name.equals(addressList.get(i).getName())) {
						System.out.print((i + 1) + ". " + addressList.get(i).getName());
						System.out.print("( " + addressList.get(i).getage() + "세 ) : ");
						System.out.println(addressList.get(i).getPhoneNumber());
						search = true;
					}
				}
				if (search == false) {
					System.out.println("등록된 연락처가 없습니다.");
				}
			} else if (menu == 5) {
				System.out.println("프로그램 종료을 종료하시겠습니까?");
				System.out.println(" Y / N ");
				String end = sc.next();
				if (end.equals("N")) {
					System.out.println("^^");
				} else {
					System.out.println("프로그램 종료");
					break;
				}
			} else {
				System.out.println("다시 입력해주세요");
			}
		}
	}

	// 리스트 출력 메소드
	public static void printList(ArrayList<Address> address) {
		System.out.println();
		System.out.println("리스트를 출력합니다.");
		for (int i = 0; i < address.size(); i++) {
			System.out.print((i + 1) + ". " + address.get(i).getName());
			System.out.print("( " + address.get(i).getage() + "세 ) : ");
			System.out.println(address.get(i).getPhoneNumber());
		}
		System.out.println();
	}
}
