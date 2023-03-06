public class Student {
    private long controlNumber;
    private String name;
    private String lastname;
    private String carrer;
    private int semester;
    private double average;

    public Student (long controlNumber, String name, String lastname, String carrer, int semester){
        this.name = name;
        this.lastname = lastname;
        this.controlNumber = controlNumber;
        this.carrer = carrer;
        this.semester = semester;

    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }


    //Metodos Explicitos
    public double getGeneralAverage(long controlNumber) {
        return 0.0;
    }
    public double getSemesterAverage(Long controlNumber, Short semester) {
        return average ;
    }
    public double getsubjectAverage(Long controlNumber, String subject) {
        return 0.0;
    }
    public long getControlNumber() {
        return controlNumber;
    }


    public void setControlNumber(Long controlNumber) {
        this.controlNumber = controlNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getCarrer() {
        return carrer;
    }
    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }


    public String toString(){

        System.out.println("Los datos del estudiante: ");
        System.out.println("nombre: "+ getName());
        System.out.println("apellido: "+ getLastname());
        System.out.println("numero de control: "+getControlNumber());
        System.out.println("carrera: "+getCarrer());
        System.out.println("semestre: "+getSemester());
        return "";
    }


}



