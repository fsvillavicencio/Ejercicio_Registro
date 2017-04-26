package clase03_proavanzada;
public class DocenteAuxiliar extends Docente{
    private String strHorarioTutoria;
    
    public DocenteAuxiliar(String strIdentificacion, String strNombres, String strEmail) {//Constructor de la clase.
        super(strIdentificacion, strNombres, strEmail);
    }

    public DocenteAuxiliar( String strIdentificacion, String strNombres, String strEmail, String strHorarioTutoria, String strIdDocente, String strEspecializacion, String strTipo) {//Constructor de la clase.
        super(strIdDocente, strEspecializacion, strTipo, strIdentificacion, strNombres, strEmail);
        this.strHorarioTutoria = strHorarioTutoria;
    }

    @Override
    public String toString() {//to String.
        return super.toString() + "Horario de Tutoria: " + strHorarioTutoria + "\n";
    }
    
}
