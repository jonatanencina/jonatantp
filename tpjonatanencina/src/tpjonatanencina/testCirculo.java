package tpjonatanencina;

import org.junit.Test; 

import static org.junit.Assert.*; 

public class testCirculo {
  

@Test
	public void crearcirculoConRadio2(){
	  
	Circulos micirculo1=new Circulos(2.0);
	   
	   assertEquals(2.0,micirculo1.getRadio(),0.01);
   }
@Test
public void  crearUnCirculoConRadio3Punto7(){
	
	Circulos micirculo2=new Circulos(3.7);
	
	assertEquals(3.7,micirculo2.getRadio(),0.01);
}
@Test
public void crearUnCirculoConRadio5(){
	
	Circulos micirculo3=new Circulos();
	
	assertEquals(5.0,micirculo3.getRadio(),0.01);
}
@Test
public void crearUnCirculoConRadio10Punto9(){
	
	Circulos micirculo4=new Circulos(10.9);
    
	assertEquals(10.9,micirculo4.getRadio(),0.01);
}
@Test 
public void queElAreaDeUnCirculoConRadio9Punto8es615Punto73(){
	
	Circulos micirculo5=new Circulos(9.8);
	
	assertNotEquals(615.73,micirculo5.carcularArea(),0.01);
   
	assertEquals(301.71,micirculo5.carcularArea(),0.01);
}
@Test
public void queElAreaDeUnCirculoConRadio16Punto6es865Punto69(){
	
	Circulos micirculo6= new Circulos(16.6);
	
	assertEquals(865.69,micirculo6.carcularArea(),0.01);

}
@Test
public void elPerimetroDeUncirculoConRadio9Punto8es615Punto73(){
 
	Circulos micirculo7=new Circulos(9.8);
	
  assertNotEquals(615.73,micirculo7.calcularPerimetro(),0.01);
	 
	assertEquals(61.57,micirculo7.calcularPerimetro(),0.01);
}

@Test 
public void elPerimetroDeUnCirculoConRadio16Punto6es865Punto67(){
	
	Circulos micirculo8=new Circulos(16.6);
    
	assertNotEquals(865.67,micirculo8.calcularPerimetro(),0.01);
	
	assertEquals(104.30,micirculo8.calcularPerimetro(),0.01);
}
}
