package tienda;

public class Producto {
	private double precio;
	private String nombre;
	private String UPC;
	
	
	/**
	 * Crea un objeto producto con los valores introducidos por el cliente
	 * @param precio
	 * 		Tiene que ser un double no negativo
	 * @param nombre
	 * 		No puede estar vacio y tiene que usar caracteres alfabéticos
	 * @param UPC
	 * 		Tiene que ser válido
	 */
	Producto(double precio, String nombre, String UPC){
		assert(precio>=0.0);
		assert(nombre.matches("([a-z]|[A-Z]\\s)+") && nombre!=null);
		assert(checkUPC(UPC));
		this.precio=precio;
		this.nombre=nombre;
		this.UPC=UPC;
		
		
	}
	/**
	 * Comprueba que el UPC sea un código válido, según la formula para comprobar el UPC
	 * @return
	 * 		Si es válido el UPC o no
	 */
	private boolean checkUPC(String UPC){
		String numero = UPC;
		int d,s;
		s= (int)numero.charAt(0) *3+(int)numero.charAt(1)+(int)numero.charAt(2) *3+(int)numero.charAt(3)+(int)numero.charAt(4) *3+(int)numero.charAt(5)+(int)numero.charAt(6) *3+(int)numero.charAt(7)+(int)numero.charAt(8) *3+(int)numero.charAt(9)+(int)numero.charAt(10) *3;
		d=aproxMDiez(s)-s;
		
		if((int)numero.charAt(11)==d){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * Aproxima el numero al multiplo de 10 mas cercano que sea mayor o igual que el mismo
	 * @param numero
	 * @return numero
	 * 		
	 */
	private int aproxMDiez(int numero) {
		if(numero%10==0){
			return numero;
		}else{
			while(numero%10!=0){
				numero++;
			}
		}
		return numero;
	}
	/**
	 * Valor del precio actual
	 * @return
	 * 		precio
	 */
	public double getPrecio(){
		return precio;
	}
	/**
	 * Cambia el precio por el nuevo introducido por el cliente
	 * @param precio
	 * 		Precio, que no puede ser negativo
	 */
	public void setPrecio(double precio){
		assert(precio>=0.0);
		this.precio=precio;
	}
	
	/**
	 * Valor del nombre actual
	 * @return
	 * 		nombre
	 */
	public String getNombre(){
		return nombre;
	}
	/**
	 * Valor del UPC actual
	 * @return
	 * 		UPC
	 */
	public String getUPC(){
		return UPC;
	}
}
