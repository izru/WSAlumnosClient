package com.ipartek.formacion.web_service_soap.test;


import java.rmi.RemoteException;

import com.ipartek.formacion.web_service_soap.AlumnoInfo;
import com.ipartek.formacion.web_service_soap.AlumnosPortProxy;
import com.ipartek.formacion.web_service_soap.GetAlumnoRequest;
import com.ipartek.formacion.web_service_soap.GetAlumnoResponse;


public class App {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Llamando al Web Service de SOAP");
		
		AlumnosPortProxy client =new AlumnosPortProxy();
		GetAlumnoRequest request = new GetAlumnoRequest("1111111H");
		
		GetAlumnoResponse response = client.getAlumno(request);
		AlumnoInfo alumno =response.getAlumnoInfo();
		
		System.out.println("Respuesta: ");
		System.out.println(alumno.getNombre());
	}

}
