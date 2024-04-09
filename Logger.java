/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lorenzo
 */
public class Logger {
    
    private Logger(){}
    
    private static Logger instance;
    
    public static Logger getInstance(){
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }
    
    public void println(String msg){
        System.out.println(msg);
    }
}
