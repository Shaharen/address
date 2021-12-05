package Exam02;

public class Address {
	private String name;	// 이름
	private int age; 	// 나이
	private String phoneNumber;//번호

	public Address(String name, int age, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}
	public int getage() {
		return age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
}
