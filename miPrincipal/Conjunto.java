package miPrincipal;
public class Conjunto {
	static int M = 20; //Aumento de la capacidad
	private Object cto[];
	private int cardinal;
	private int capacidad;
	//Operaciones
	public Conjunto()
	{
		cto = new Object[M];
		cardinal = 0;
		capacidad = M;
	}
	//determina si el conjunto esta vacio
	public boolean esVacio()
	{
	}
	//añade un elemento si no está en el conjunto
	public Conjunto añadir(Object elemento)
	{
		//coloque aquí el código faltante
		
			
		
		
	}
	//quita el elemento del conjunto

	public Conjunto retirar(Object elemento)
	{
		//coloque aquí el código faltante
		
	}
	//busca si un elemento pertenece al conjunto
	public boolean pertenece(Object elemento)
	{
		
	}
	//devuelve el número de elementos
	public int cardinal()
	{
		
	}
	//Operacion union de dos conjuntos
	public Conjunto union(Conjunto c2)
	{
		
	}
	public Object elemento(int n) throws Exception
	{
	  
	}
	
	public String toString()
	{
		String s = "{";
		for(int k = 0;k<cardinal;k++)
			s += cto[k].toString() + ",";
		if (cardinal>0)
			s = s.substring(0,s.length()-1);
		s += "}";
		return s;
	}

}