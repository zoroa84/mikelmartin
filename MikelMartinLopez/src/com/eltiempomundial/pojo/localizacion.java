/**
 * 
 */
package com.eltiempomundial.pojo;

import java.util.Calendar;

/**
 * @author Administrador
 *
 */
public class localizacion implements WeatherAble {
	public String localizacion;
	public localizacion(String localizacion, String temperatura) {

		this.localizacion = localizacion;
		this.getTemperatura(Integer.parseInt(temperatura));
	}

	
	@Override
	public String getLocalizacion() {
		String resul = null;

		if ("Bilbao".equalsIgnoreCase(localizacion)) {

			resul = "Bilbao";
			return resul;
		} else if ("Londres".equalsIgnoreCase(localizacion)) {
			resul = "Londres";
		}

		return resul;
	}

	
	@Override
	public int getTemperatura(int unidad) {

		switch (getLocalizacion()) {
		case "Londres":
			if (UNIDAD_GRADOS_CELSIUS == unidad) {
				return 10;

			} else if (UNIDAD_GRADOS_FHARENHEIT == unidad) {
				return 50;
			}
			break;
		case "Bilbao":
			if (UNIDAD_GRADOS_CELSIUS == unidad) {
				return 18;

			} else if (UNIDAD_GRADOS_FHARENHEIT == unidad) {
				return 64;
			}
			break;
		}
		return 0;

	}


	@Override
	public String getMes() {

		String result = null;
		Calendar now = Calendar.getInstance();

		System.out.println("Fecha actual : " + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE) + "-"
				+ now.get(Calendar.YEAR));

		
		String[] strMonths = new String[] { "Enero", "Febebro", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre" };

		result = strMonths[now.get(Calendar.MONTH)];

		return result;
	}

	
	@Override
	public int getDia() {
	
		int result = 0;
		Calendar now = Calendar.getInstance();
		result = now.get(Calendar.DATE);
		return result;

	}


	@Override
	public char getIconoTiempo() {
		// TODO Auto-generated method stub
		char result = 0;
		switch (getLocalizacion()) {
		case "Londres":
			result = 'B';
			break;
		case "Bilbao":
			result = 'R';
			break;
		}

		return result;
	}

}
