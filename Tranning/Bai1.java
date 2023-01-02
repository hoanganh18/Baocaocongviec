package Tranning;

import java.util.ArrayList;

public class Bai1 {
	private Integer id; 
	private String name;
	private String address;
	
	public Bai1() {
		
	}
	public Bai1(Integer id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Bai1 [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public static void main(String[] args) {
		ArrayList<Bai1> list = new ArrayList<Bai1>();
		Bai1 b1 = new Bai1();
		b1.setId(2);
		b1.setAddress("Ha Noi");
		b1.setName("Anh");
		
		Bai1 b2 = new Bai1();
		b2.setId(5);
		b2.setAddress("Ha Noi");
		b2.setName("Thanh");
		
		Bai1 b3 = new Bai1();
		b3.setId(1);
		b3.setAddress("Ha Nam");
		b3.setName("Quang");
		
		Bai1 b4 = new Bai1();
		b4.setId(4);
		b4.setAddress("Thai Binh");
		b4.setName("Dat");
		
		Bai1 b5 = new Bai1();
		b5.setId(6);
		b5.setAddress("Quang Nam");
		b5.setName("Chinh");
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		System.out.println(list);
		
		for(Bai1 b: list) {
			if(b.getName().equals("Anh")) {
				System.out.println(b);
			}
		}
		
		for(Bai1 b:list) {
			for(int i=0; i<list.size()-1;i++) {
				for(int j=i+1)
			}
		}
	}


}
