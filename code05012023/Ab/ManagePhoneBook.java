package Ab;

public class ManagePhoneBook {
public static void main(String[] args) {
	PhoneBook pb = new PhoneBook();
	pb.insertPhone("anh", "0942326385");
	pb.insertPhone("quang", "0942326385");
	pb.removePhone("anh");
	for(String t: pb.phoneList) {
		System.out.println(t);
	}
}
}
