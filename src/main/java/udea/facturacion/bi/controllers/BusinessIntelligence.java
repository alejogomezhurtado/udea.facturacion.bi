package udea.facturacion.bi.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import udea.facturacion.bi.modelo.DtoFactura;

public class BusinessIntelligence {
	private static final Logger logger = LogManager.getLogger(BusinessIntelligence.class);

	public static void ingresar(DtoFactura factura){
		logger.info("Ingreso de Factura \n{"+factura.toString()+"}");
	}
}
