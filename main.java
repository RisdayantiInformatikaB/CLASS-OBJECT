import java.util.Stack;


public class main {

	public static void main(String[] args) {
	System.out.println("*******Object Kelas Kotak*******");
	// membuat object dari class kotak
	kotak main = new kotak();
		
	// method setter kotak
	main.setpanjang(10.23);
	main.setlebar(4.56);
		
	// method getter kotak
	System.out.println("panjang : " + main.getpanjang());
	System.out.println("lebar : " + main.getlebar());
	System.out.println("luas : " + main.getpanjang()*main.getlebar());
	System.out.println("keliling : " + main.getlebar()*main.getpanjang()*main.getlebar()*main.getpanjang());
	
	System.out.println("*******Object Kelas Kotak*******");
	//membuat object dari class mahasiswa
	mahasiswa mahasiswa = new mahasiswa();
	
	//method setter mahasiswa
	mahasiswa.nama = "Risdayanti";
	mahasiswa.nim = "D0217318";
	mahasiswa.alamat = "Tanangan";
	mahasiswa.golonganDarah = "--";
	mahasiswa.status = "Mahasiswi";
	mahasiswa.tinggiBadan = "145";
	mahasiswa.beratBadan = "40";
	
	//method getter mahasiswa
	System.out.println("nama : " + mahasiswa.getnama());
	System.out.println("nim : " + mahasiswa.getnim());
	System.out.println("alamat : " + mahasiswa.getalamat());
	System.out.println("golongan Darah : " + mahasiswa.getgolongnDarah());
	System.out.println("Status : " + mahasiswa.getstatus());
	System.out.println("tinggi badan : " + mahasiswa.getberatBadan());
	System.out.println("berat badan : " + mahasiswa.getberatBadan());

	System.out.println("*******Object Kelas Kotak*******");
	//membuat object dari kelas node
	Node Node = new Node();
	
	//method setter node
	Node.label = "AQUA";
	Node.Value = 1;
	
	//method getter node
	System.out.println("Nama Label : " + Node.getlabel());
	System.out.println("jumlah label : " + Node.getValue());

	System.out.println("------Object Kelas stack------");
	//membuat object dari kelas stack
	stack stack = new stack();
	
	stack.value[0] = "Khodijah";
	stack.value[1] = "Fatimah";
	stack.value[2]= "Aisyah";
	stack.value[3]= "Risdaynti";
	stack.setvalueAt(4 ,"Muhammad");

	//menampilkan stack
	for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};

	
	}
}
