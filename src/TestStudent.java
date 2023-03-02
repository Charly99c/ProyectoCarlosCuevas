public class TestStudent {

    public static void main(String[] args) {

        System.out.println("Probando clase Student");

        Student alumno1500 = new Student();

        alumno1500.setName("Carlos");
        alumno1500.setLastname("Cuevas");
        alumno1500.setControlNumber(Long.parseLong("1500"));
        alumno1500.setSemester((short) 1);
        alumno1500.setCarrer("Informatica");

        System.out.println("Alumno Nombre " + alumno1500.getName());
        System.out.println("alumno Apellido " + alumno1500.getLastname());
        System.out.println("Alumno Numero de control " + alumno1500.getName());
        System.out.println("Alumno Semestre " + alumno1500.getSemester());
        System.out.println("Alumno Carrera " + alumno1500.getCarrer());
    }

}
