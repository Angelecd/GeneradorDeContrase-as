import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.FileOutputStream;  
import java.util.Random;

public class Topic{
	String nombre;
	String palabra[] = new String[20];
	String pass;

//Getters
	public String getNombre(){
		return nombre;
	}
	public String[] getPalabras(){
		return palabra;
	}
	public String getPalabra(int i){
		return palabra[i];
	}
	public String getPass(){
		return pass;
	}

//Setters
	public void setNombre(String s){
		nombre = s;
	}
	public void setPalabras(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10,String s11,String s12,String s13,String s14,String s15,String s16,String s17,String s18,String s19,String s20){	
		palabra[0]  =  s1; palabra[1]  =  s2; palabra[2]  =  s3; palabra[3]  =  s4; 
		palabra[4]  =  s5; palabra[5]  =  s6; palabra[6]  =  s7; palabra[7]  =  s8; 
		palabra[8]  =  s9; palabra[9]  = s10; palabra[10] = s11; palabra[11] = s12;   
		palabra[12] = s13; palabra[13] = s14; palabra[14] = s15; palabra[15] = s16;
		palabra[16] = s17; palabra[17] = s18; palabra[18] = s19; palabra[19] = s20;  
	}
	public void setPalabra(String s, int i){
		palabra[i]=s;
	}

//Metodos
	public String getPalabraRandom(){
		Random rand = new Random();
		return getPalabra(rand.nextInt(20));
	}
}