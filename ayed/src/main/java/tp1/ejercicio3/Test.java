package tp1.ejercicio3;

public class Test {
    public static void main(String[]args){
        Estudiante est = new Estudiante("Ivan","Aranda","1A","ivan@email.com","calle 14 151");
        Estudiante est2 = new Estudiante("Guadalupe","Cancio","1A","guadalupe@email.com","Calle 14 151");
        Estudiante est3 = new Estudiante("Paula","Calvo","1B","paula@email.com","Parque La Fuente");

        Profesor pro = new Profesor("Ivan","Aranda","Sistema","ivan@email.com","Informatica");
        Profesor pro2 = new Profesor("Guadalupe","Aranda","Algoritmos","guadalupe@email.com","Informatica");

        Profesor[] profesores = {pro,pro2};
        Estudiante[]estudiantes = {est,est2,est3};

        for(int i=0;i<profesores.length;i++){
            System.out.println(profesores[i].tusDatos());
        }
        for(int i=0;i<estudiantes.length;i++){
            System.out.println(estudiantes[i].tusDatos());
        }
    }
}
