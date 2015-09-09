
public class Kerbau extends Mamalia {
	public String jenisKelamin;
	//constructor dengan parameter
	public Kerbau(String jenis){
		jenisKelamin = jenis;
	}
	//constructor	
	public Kerbau(){
		jenisKelamin = "jantan";
	}
	
	@Override
	public void menyusui(){
		System.out.println("kambing menyusui");
	}
	
	@Override
	public void melahirkan(){
		System.out.println("kambing melahirkan");
	}
	
	@Override
	public String bersuara(){
		return "maauuuu";
	}

}
