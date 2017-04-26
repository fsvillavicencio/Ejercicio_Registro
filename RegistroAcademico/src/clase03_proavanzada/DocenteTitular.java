package clase03_proavanzada;

public class DocenteTitular extends Docente {

    private String strHorarioClase;

    public DocenteTitular(String strIdentificacion, String strNombres, String strEmail) {//Constructor de la clase.
        super(strIdentificacion, strNombres, strEmail);
    }

    public DocenteTitular(String strIdentificacion, String strNombres, String strEmail, String strHorarioClase, String strIdDocente, String strEspecializacion, String strTipo) {//Constructor de la clase.
        super(strIdDocente, strEspecializacion, strTipo, strIdentificacion, strNombres, strEmail);
        this.strHorarioClase = strHorarioClase;
    }

    @Override
    public String toString() {//to String.
        return super.toString() + "Horario de Clases: " + strHorarioClase + '\n';
    }

}
