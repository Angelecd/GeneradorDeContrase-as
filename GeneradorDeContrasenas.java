import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.io.FileOutputStream;  
import java.io.File;

public class GeneradorDeContrasenas{
	public static void main(String[] args) {

		Window window = new Window();

		Topic t01 = new Topic(); Topic t02 = new Topic(); Topic t03 = new Topic();
		Topic t04 = new Topic(); Topic t05 = new Topic(); Topic t06 = new Topic();

		t01.setNombre("Futbol"); 		t01.setPalabras("Balon","Cancha","Portero","Apertura","Defensa","Mesi","Cristiano","Copa","Fifa","Playera","Aguilla","Porra","America","Chivas","CruzAzul","Seleccion","ElBicho","Tarjeta","Cancha","Porteria");
		t02.setNombre("VideoJuegos"); 	t02.setPalabras("GearsOfWar","Halo","Fornite","ElderRing","Minecraft","Mario","Zelda","Kirby","Xbox","Nintendo","PlayStation","CallOfDuty","Xenoblade","FinalFantasy","Atari","Tetris","Pacman","Pokemon","Pikachu","Sega");
		t03.setNombre("Rock"); 			t03.setPalabras("Guitarra","Teclado","Bateria","Bajo","Metallica","Caifanes","Cantante","CafeTacuba","GunsAndRoses","SmashingPumpkins","RollingStones","Killers","Strokes","TameImpala","Radiohead","Pixies","RoyalBlood","Queen","Gorillaz","Deftones");
		t04.setNombre("null"); 			t04.setPalabras("null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null");
		t05.setNombre("null"); 			t05.setPalabras("null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null");
		t06.setNombre("null"); 			t06.setPalabras("null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null");

		window.setTopics(t01, t02, t03, t04, t05, t06);
		window.iniciarWindow();
		 
	}
}