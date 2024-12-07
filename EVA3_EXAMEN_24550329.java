/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_examen_24550329;
import java.util.Scanner;
/**
 *
 * @author flac3
 */
public class EVA3_EXAMEN_24550329 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      final String NUMERODECONTROL = "24550329";//este es el numero de control profe
        final String CONTRASEÑA= "examen";//esta es la contraseña profe
         
        String numerodecontrol;
        String contraseña;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Numero de control");
        numerodecontrol = captu.nextLine();
        System.out.println("Contraseña");
        contraseña = captu.nextLine();
        if (numerodecontrol.equals(NUMERODECONTROL) && contraseña.equals(CONTRASEÑA)){
        System.out.println("ACCESO PERMITIDO");
        }else{
        System.out.println("ACCESO DESNEGADO");
         }
        int estudiante,califa;
        
        califa = captu.nextInt();
        System.out.println("ingrese la calificacion del estudiante 1");
        estudiante = captu.nextInt();
 
        System.out.print("");
        System.out.println("ingrese la calificacion del estudiante 2");
        estudiante = captu.nextInt();
        System.out.print("");
        
        System.out.println("ingrese la calificacion del estudiante 3");
        estudiante = captu.nextInt();
        System.out.print("");
        System.out.println("ingrese la calificacion del estudiante 4");
        estudiante = captu.nextInt();
        System.out.println("ingrese la calificacion del estudiante 5");
        estudiante = captu.nextInt();

 
        
        
        System.out.println("calificacion mas alta ");
        califa=captu.nextInt();
         
        System.out.println("calificacion mas baja ");
        califa=captu.nextInt(); 
        if(estudiante >= 0 && estudiante <= 100)
        System.out.println("promedio ");
         // perdon si no hise lo que pidio pero me confundi
         //entre mas escribo el codigo mas me confunde y errores sale xd  
        
        
      
    }
    
}
