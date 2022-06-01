package clases;

import java.util.Queue;

public class Comanda {

	private int id;
	private Queue<ElementoCarta> productosPedidos;
	private Empleado empleado;

	public Comanda(int id, Queue<ElementoCarta> productosPedidos, Empleado empleado) {
		super();
		this.id = id;
		this.productosPedidos = productosPedidos;
		this.empleado = empleado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Queue<ElementoCarta> getProductosPedidos() {
		return productosPedidos;
	}

	public void setProductosPedidos(Queue<ElementoCarta> productosPedidos) {
		this.productosPedidos = productosPedidos;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

}
