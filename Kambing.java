
public class Kambing extends Mamalia{
	
	public String jenisKelamin;
	//constructor dengan parameter
	public Kambing(String jenis){
		jenisKelamin = jenis;
	}
	//constructor	
	public Kambing(){
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
		return "mbeek";
	}
	

}
