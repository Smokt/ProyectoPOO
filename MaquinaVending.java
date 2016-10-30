package tienda;

import fabricante.externo.tarjetas.TarjetaMonedero;

public class MaquinaVending {
	
	private int filas,articuloPorFila; //Los articulos por fila es la profundidad de la fila (suponiendo cada articulo ocupa un hueco)
	

	public MaquinaVending(){
		
	}
	private void setFila(){
		//llena la fila con un producto (se entiende toda la fila del mismo producto)
	}
	private int disponibilidadFila(string idFila){
		//comprueba si hay o no productos en la fila seleccionada
		return cantidadProductos;
	}
	private void entregarProducto(){
		//si hay productos en la fila seleccionada lo entregará y descontara uno a la cantidad de productos de esa fila
	}
	private void comprar(){
		//recibe el IDfila para:
		//						- mirar si hay disponibilidad de esa fila
		//							-si hay productos para esa fila, entregar y descontar tanto de la fila como el dinero
		//							-no hay productos para esa fila, no descontar dinero
	}
	
}
