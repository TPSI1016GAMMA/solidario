package solidario_gamma.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 *  @author Missy M and Mighty Arroz
 */
public interface Diversos {
        Scanner scan=new Scanner(System.in);
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date data = new Date();
}
