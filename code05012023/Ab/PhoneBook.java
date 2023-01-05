package Ab;

import java.util.ArrayList;

public class PhoneBook extends Phone {

	ArrayList<String> phoneList = new ArrayList<String>();

	@Override
	void insertPhone(String name, String phone) {
		if (phoneList.isEmpty()) {
			phoneList.add(name + "," + phone);
		} else {
			boolean timthay = false;
			for (String pb : phoneList) {
				if (pb.contains(name + ",")) {
					timthay = true;
				}
				if (!pb.contains(phone)) {
					phoneList.set(phoneList.indexOf(pb), pb + ":" + phone);
				}
				break;
			}
			if (!timthay) {
				phoneList.add(name + "," + phone);
			}
		}

	}

	@Override
	void removePhone(String name) {
		if (phoneList.isEmpty()) {
			System.out.println("Danh sach trong ");
		} else {
			boolean timthay = false;
			for (String t : phoneList) {
				if (t.contains(name + ",")) {
					timthay = true;
					phoneList.remove(t);
					System.out.println("Da xoa nguoi dung" + name + " va so dien thoai");
					break;
				}
				if (!timthay) {
					System.out.println("Khong tim thay nguoi dung" + name);
				}
			}
		}

	}

}
