package model.logic;


import java.util.Date;



public class Comparendo implements Comparable<Comparendo> {
	private int objectId;
	private Date fecha_hora;
	private String des_infrac;
	private String medio_dete;
	private String clase_vehi;
	private String tipo_servi;
	private String infraccion;
	private String localidad;

	private double latitud;
	private double longitud;

	public Comparendo(int objeId, Date fecha, String descripcion, String detencion, String claseVeh, String tipoSer, String codInfraccion, String localidadP, double lonP, double latP)
	{
		objectId = objeId;
		fecha_hora = fecha;
		des_infrac = descripcion;
		medio_dete = detencion;
		clase_vehi = claseVeh;
		tipo_servi = tipoSer;
		infraccion = codInfraccion;
		localidad = localidadP;
		longitud = lonP;
		latitud = latP;
	}

	@Override
	public String toString() {
		return "Comparendo [OBJECTID=" + objectId + ", FECHA_HORA=" + fecha_hora + ", DES_INFRAC=" + des_infrac
				+ ", MEDIO_DETE=" + medio_dete + ", CLASE_VEHI=" + clase_vehi + ", TIPO_SERVI=" + tipo_servi
				+ ", INFRACCION=" + infraccion + ", LOCALIDAD=" + localidad + ", latitud=" + latitud + ", longitud="
				+ longitud + "]";
	}



	public String darMedioDete() {
		return medio_dete;
	}
	public String darInfraccion() {
		return infraccion;
	}

	public String darDesInfraccion() {
		return des_infrac;
	}


	public String darClaseVehi() {
		return clase_vehi;

	}

	public String darTipoServi() {

		return tipo_servi;
	}

	public String darLocalidad() {
		return localidad;

	}

	public double  darLatitud() {
		return latitud;

	}

	public double  darLongitud() {
		return longitud;

	}
	public int darObjectId() {
		return objectId;
	}

	public Date darFecha() {
		return fecha_hora;
	}

	@Override
	public int compareTo(Comparendo entrada) {
		int respuesta= 666;
		if(this.darFecha().compareTo(entrada.darFecha()) == -1){
			respuesta = -1;
		}
		if(this.darFecha().compareTo(entrada.darFecha()) == 1){
			respuesta = 1;
		}
		if(this.darFecha().compareTo(entrada.darFecha()) == 0){
			return this.darObjectId();
		}
		return respuesta;
	}


}