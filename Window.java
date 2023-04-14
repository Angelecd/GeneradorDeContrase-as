import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.io.FileOutputStream;  
import java.io.File;
import java.lang.*;
import javax.swing.*;

public class Window{
	String password;
	String topic;
	int noTop;

	//topics
	Topic t01; Topic t02; Topic t03; 
	Topic t04; Topic t05; Topic t06;

	//Texfield
	JTextField newPass; JTextField topicCambio; JTextField cambioPalabraT;

	//Listas
	JList<String> li1; JList<String> li2; JList<String> li3;
	JList<String> li4; JList<String> li5;JList<String> li6;

	JList<String> liTopic1; JList<String> liTopic2; JList<String> liTopic3;
	JList<String> liTopic4; JList<String> liTopic5; JList<String> liTopic6;

	//Scroll
	JScrollPane s1; JScrollPane s2; JScrollPane s3;
	JScrollPane s4;JScrollPane s5;JScrollPane s6;

	JScrollPane sTopic1; JScrollPane sTopic2; JScrollPane sTopic3;
	JScrollPane sTopic4; JScrollPane sTopic5; JScrollPane sTopic6;

	//Crear Frame
	JFrame frame =  new JFrame("Gen");	

	JButton nuevaC; JButton nuevoT;
	JButton modTop; JButton cerrar; JButton menuPr;

	JButton topic1; JButton topic2; JButton topic3;
	JButton topic4; JButton topic5; JButton topic6;
	 
	JButton topicMod1; JButton topicMod2; JButton topicMod3;
	JButton topicMod4; JButton topicMod5; JButton topicMod6;

	JButton cambioTopic; JButton cambioPalabraB;

//Getters

//Setters
	
	public void setPassword(String p){
		password = p;
	}
	public void setTopic(String p){
		topic = p;
	}
	public void setTopics(Topic t1, Topic t2, Topic t3, Topic t4, Topic t5, Topic t6){
		t01 = t1; t02 = t2; t03 = t3;
		t04 = t4; t05 = t5; t06 = t6;
	}

	public void setButtons(){
		//Botones especiales 
		menuPr = new JButton("Menu Principal");
		cerrar = new JButton("Cerrar");
		
		menuPr.setBounds( 10,420,280,30); 	frame.add(menuPr);	menuPr.setVisible(false);
		cerrar.setBounds(310,420,280,30);	frame.add(cerrar);	cerrar.setVisible(false);


		//Botones menuPrincipal
		nuevaC = new JButton("Crear nueva contraseña");
		nuevoT = new JButton("Nuevo Topico");
		modTop = new JButton("Modificar algun topico");

		nuevaC.setBounds( 10,380,280,30); 	frame.add(nuevaC);	nuevaC.setVisible(false);
		nuevoT.setBounds(310,380,280,30); 	frame.add(nuevoT);	nuevoT.setVisible(false);
		modTop.setBounds( 10,420,280,30); 	frame.add(modTop);	modTop.setVisible(false);
		
		//Botones crearNuevaContraseña
		topic1 = new JButton(t01.getNombre());
		topic2 = new JButton(t02.getNombre());
		topic3 = new JButton(t03.getNombre());
		topic4 = new JButton(t04.getNombre());
		topic5 = new JButton(t05.getNombre());
		topic6 = new JButton(t06.getNombre());
		
		topic1.setBounds( 10,80,185,30); 	frame.add(topic1);	topic1.setVisible(false);
		topic2.setBounds(205,80,185,30); 	frame.add(topic2);	topic2.setVisible(false);
		topic3.setBounds(400,80,185,30); 	frame.add(topic3);	topic3.setVisible(false);
		topic4.setBounds( 10,250,185,30); 	frame.add(topic4);	topic4.setVisible(false);
		topic5.setBounds(205,250,185,30); 	frame.add(topic5);	topic5.setVisible(false);
		topic6.setBounds(400,250,185,30); 	frame.add(topic6);	topic6.setVisible(false);

		topicMod1 = new JButton(t01.getNombre());
		topicMod2 = new JButton(t02.getNombre());
		topicMod3 = new JButton(t03.getNombre());
		topicMod4 = new JButton(t04.getNombre());
		topicMod5 = new JButton(t05.getNombre());
		topicMod6 = new JButton(t06.getNombre());

		topicMod1.setBounds( 10, 80,185,30); 	frame.add(topicMod1);	topicMod1.setVisible(false);
		topicMod2.setBounds( 10,120,185,30); 	frame.add(topicMod2);	topicMod2.setVisible(false);
		topicMod3.setBounds( 10,160,185,30); 	frame.add(topicMod3);	topicMod3.setVisible(false);
		topicMod4.setBounds( 10,200,185,30); 	frame.add(topicMod4);	topicMod4.setVisible(false);
		topicMod5.setBounds( 10,240,185,30); 	frame.add(topicMod5);	topicMod5.setVisible(false);
		topicMod6.setBounds( 10,280,185,30); 	frame.add(topicMod6);	topicMod6.setVisible(false);

		cambioTopic = new JButton("Cambiar nombre");
		cambioTopic.setBounds(400,80,185,30); 	frame.add(cambioTopic);	cambioTopic.setVisible(false);

		cambioPalabraB = new JButton("Cambiar Palabra");
		cambioPalabraB.setBounds(400,280,185,30); 	frame.add(cambioPalabraB);	cambioPalabraB.setVisible(false);

		activarActionListeners();
	}

	public void setListas(){

		newPass = new JTextField();
		topicCambio = new JTextField();
		cambioPalabraT = new JTextField();

		newPass.setEditable(false);
		topicCambio.setEditable(true);
		cambioPalabraT.setVisible(true);


		newPass.setBounds(205,40,185,30);
		topicCambio.setBounds( 205, 80,185,30);
		cambioPalabraT.setBounds(400,240,185,30);

		frame.add(newPass); newPass.setVisible(false);	
		frame.add(topicCambio); topicCambio.setVisible(false);	
		frame.add(cambioPalabraT);	cambioPalabraT.setVisible(true);

		li1 = new JList<>(t01.getPalabras());
		li2 = new JList<>(t02.getPalabras());
		li3 = new JList<>(t03.getPalabras());
		li4 = new JList<>(t04.getPalabras());
		li5 = new JList<>(t05.getPalabras());
		li6 = new JList<>(t06.getPalabras());

		liTopic1 = new JList<>(t01.getPalabras());
		liTopic2 = new JList<>(t02.getPalabras());
		liTopic3 = new JList<>(t03.getPalabras());
		liTopic4 = new JList<>(t04.getPalabras());
		liTopic5 = new JList<>(t05.getPalabras());
		liTopic6 = new JList<>(t06.getPalabras());

		frame.add(li1);	li1.setVisible(false);
		frame.add(li2);	li2.setVisible(false);
		frame.add(li3); li3.setVisible(false);
		frame.add(li4); li4.setVisible(false);
		frame.add(li5); li5.setVisible(false);
		frame.add(li6); li6.setVisible(false);

		frame.add(liTopic1); liTopic1.setVisible(false);
		frame.add(liTopic2); liTopic2.setVisible(false);
		frame.add(liTopic3); liTopic3.setVisible(false);
		frame.add(liTopic4); liTopic4.setVisible(false);
		frame.add(liTopic5); liTopic5.setVisible(false);
		frame.add(liTopic6); liTopic6.setVisible(false);
	
		s1 = new JScrollPane(li1);
		s2 = new JScrollPane(li2);
		s3 = new JScrollPane(li3);
		s4 = new JScrollPane(li4);
		s5 = new JScrollPane(li5);
		s6 = new JScrollPane(li6);

		s1.setBounds(  10,120,185,120);	
		s2.setBounds( 205,120,185,120);	
		s3.setBounds( 400,120,185,120);	
		s4.setBounds(  10,290,185,120);	
		s5.setBounds( 205,290,185,120);  	
		s6.setBounds( 400,290,185,120);	

		s1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		s2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		s3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		s4.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		s5.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		s6.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);


		frame.getContentPane().add(s1);
		frame.getContentPane().add(s2);
		frame.getContentPane().add(s3);
		frame.getContentPane().add(s4);
		frame.getContentPane().add(s5);
		frame.getContentPane().add(s6);

		sTopic1 = new JScrollPane(liTopic1);
		sTopic2 = new JScrollPane(liTopic2);
		sTopic3 = new JScrollPane(liTopic3);
		sTopic4 = new JScrollPane(liTopic4);
		sTopic5 = new JScrollPane(liTopic5);
		sTopic6 = new JScrollPane(liTopic6);

		sTopic1.setBounds( 205,120,185,190);	
		sTopic2.setBounds( 205,120,185,190);	
		sTopic3.setBounds( 205,120,185,190);	
		sTopic4.setBounds( 205,120,185,190);	
		sTopic5.setBounds( 205,120,185,190);  	
		sTopic6.setBounds( 205,120,185,190);	

		sTopic1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		sTopic2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		sTopic3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		sTopic4.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		sTopic5.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		sTopic6.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);


		frame.getContentPane().add(sTopic1);
		frame.getContentPane().add(sTopic2);
		frame.getContentPane().add(sTopic3);
		frame.getContentPane().add(sTopic4);
		frame.getContentPane().add(sTopic5);
		frame.getContentPane().add(sTopic6);
	}

	
//Metodos
	public void iniciarWindow(){
		setButtons();
		setListas();
		visibleFalse();
		/*
		Container c = frame.getContentPane();
		JLabel imgBack = new JLabel();
		imgBack.setIcon(new ImageIcon("Img/background.jpg"));
		Dimension size = imgBack.getPreferredSize();
		imgBack.setBounds(0,0,size.width, size.height);
		c.add(imgBack);
		*/


		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().setBackground(new Color(35, 39, 71));
		frame.setSize(600, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		menuPrincipal();
	}

	public void activarActionListeners(){
		Topic top;

		menuPr.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				visibleFalse();
				menuPrincipal();
			}
		});
		cerrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

				System.exit(0);
			}
		});

		nuevaC.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				visibleFalse();
				crearNuevaContraseña();
			}
		});
		nuevoT.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				visibleFalse();
				nuevoTopic();
			}
		});
		modTop.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				visibleFalse(); 
				modificarTopic();
			}
		});

		//Action listeners
		topic1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				visibleFalse();
				setPassword(t01.getPalabraRandom()+t01.getPalabraRandom());
				crearNuevaContraseña();
			}
		});
		topic2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				visibleFalse();
				setPassword(t02.getPalabraRandom()+t02.getPalabraRandom());
				crearNuevaContraseña(); 
			}
		});
		topic3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				visibleFalse();
				setPassword(t03.getPalabraRandom()+t03.getPalabraRandom());
				crearNuevaContraseña(); 
			}
		});
		topic4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				visibleFalse();
				setPassword(t04.getPalabraRandom()+t04.getPalabraRandom());
				crearNuevaContraseña();
			}
		});
		topic5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				visibleFalse();
				setPassword(t05.getPalabraRandom()+t05.getPalabraRandom());
				crearNuevaContraseña();
			}
		});
		topic6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				visibleFalse();
				setPassword(t06.getPalabraRandom()+t06.getPalabraRandom());
				crearNuevaContraseña();
			}
		});
		topicMod1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				noTop = 1;
				visibleFalse();
				setTopic(t01.getNombre());
				sTopic1.setVisible(true);liTopic1.setVisible(true); topicCambio.setVisible(true);
				nuevoTopic();
			}
		});
		topicMod2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				noTop = 2;
				visibleFalse();
				setTopic(t02.getNombre());
				sTopic2.setVisible(true);liTopic2.setVisible(true); topicCambio.setVisible(true);
				nuevoTopic(); 
			}
		});
		topicMod3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				noTop = 3;

				visibleFalse();
				setTopic(t03.getNombre());
				sTopic3.setVisible(true);liTopic3.setVisible(true); topicCambio.setVisible(true);
				nuevoTopic(); 
			}
		});
		topicMod4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				noTop = 4;
				visibleFalse();
				setTopic(t04.getNombre());
				sTopic4.setVisible(true);liTopic4.setVisible(true); topicCambio.setVisible(true);
				nuevoTopic();
			}
		});
		topicMod5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				noTop = 5;
				visibleFalse();
				setTopic(t05.getNombre());
				sTopic5.setVisible(true);liTopic5.setVisible(true); topicCambio.setVisible(true);
				nuevoTopic();
			}
		});
		topicMod6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				noTop = 6;
				visibleFalse();
				setTopic(t06.getNombre());
				sTopic6.setVisible(true);liTopic6.setVisible(true); topicCambio.setVisible(true);
				nuevoTopic();
			}
		});
		cambioTopic.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				visibleFalse();
				switch(noTop){
				case 1:
					t01.setNombre(topicCambio.getText());
					break;
				case 2:
					t02.setNombre(topicCambio.getText());
					break;
				case 3:
					t03.setNombre(topicCambio.getText());
					break;
				case 4:
					t04.setNombre(topicCambio.getText());
					break;
				case 5:
					t05.setNombre(topicCambio.getText());
					break;
				case 6:
					t06.setNombre(topicCambio.getText());
					break;
				}
				menuPrincipal();
			}
		});
		cambioPalabraB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				visibleFalse();
				switch(noTop){
				case 1:
					t01.setPalabra(cambioPalabraT.getText(), liTopic1.getSelectedIndex());
					break;
				case 2:
					t02.setPalabra(cambioPalabraT.getText(), liTopic1.getSelectedIndex()+1);
					break;
				case 3:
					t03.setPalabra(cambioPalabraT.getText(), liTopic1.getSelectedIndex()+1);
					break;
				case 4:
					t04.setPalabra(cambioPalabraT.getText(), liTopic1.getSelectedIndex()+1);
					break;
				case 5:
					t05.setPalabra(cambioPalabraT.getText(), liTopic1.getSelectedIndex()+1);
					break;
				case 6:
					t06.setPalabra(cambioPalabraT.getText(), liTopic1.getSelectedIndex()+1);
					break;
				}
				menuPrincipal();
			}
		});
	}

	public void visibleFalse(){
		nuevaC.setVisible(false);
		nuevoT.setVisible(false);
		modTop.setVisible(false);
		cerrar.setVisible(false);
		menuPr.setVisible(false);

		topic1.setVisible(false);
		topic2.setVisible(false);
		topic3.setVisible(false);
		topic4.setVisible(false);
		topic5.setVisible(false);
		topic6.setVisible(false);

		topicMod1.setVisible(false);
		topicMod2.setVisible(false);
		topicMod3.setVisible(false);
		topicMod4.setVisible(false);
		topicMod5.setVisible(false);
		topicMod6.setVisible(false);

		li1.setVisible(false);
		li2.setVisible(false);
		li3.setVisible(false);
		li4.setVisible(false);
		li5.setVisible(false);
		li6.setVisible(false);

		liTopic1.setVisible(false);
		liTopic2.setVisible(false);
		liTopic3.setVisible(false);
		liTopic4.setVisible(false);
		liTopic5.setVisible(false);
		liTopic6.setVisible(false);

		s1.setVisible(false);
		s2.setVisible(false);
		s3.setVisible(false);
		s4.setVisible(false);
		s5.setVisible(false);
		s6.setVisible(false);

		sTopic1.setVisible(false);
		sTopic2.setVisible(false);
		sTopic3.setVisible(false);
		sTopic4.setVisible(false);
		sTopic5.setVisible(false);
		sTopic6.setVisible(false);


		newPass.setVisible(false);
		cambioTopic.setVisible(false);
		topicCambio.setVisible(false);	

		cambioPalabraB.setVisible(false);
		cambioPalabraT.setVisible(false);
	}

	public void menuPrincipal(){
		setButtons();
		setListas();		
		visibleFalse();



		nuevaC.setVisible(true);
		nuevoT.setVisible(true);
		cerrar.setVisible(true);	
	}

	public void crearNuevaContraseña(){
		newPass.setText(password);
		//Mostrar Botones
		topic1.setVisible(true);
		topic2.setVisible(true);
		topic3.setVisible(true);
		topic4.setVisible(true);
		topic5.setVisible(true);
		topic6.setVisible(true);
		menuPr.setVisible(true);
		cerrar.setVisible(true);

		newPass.setVisible(true);
		

		li1.setVisible(true);
		li2.setVisible(true);
		li3.setVisible(true);
		li4.setVisible(true);
		li5.setVisible(true);
		li6.setVisible(true);

		s1.setVisible(true);
		s2.setVisible(true);
		s3.setVisible(true);
		s4.setVisible(true);
		s5.setVisible(true);
		s6.setVisible(true);	
	}

	public void nuevoTopic(){
		topicCambio.setText(topic);

		topicMod1.setVisible(true);
		topicMod2.setVisible(true);
		topicMod3.setVisible(true);
		topicMod4.setVisible(true);
		topicMod5.setVisible(true);
		topicMod6.setVisible(true);

		cambioTopic.setVisible(true);
		cambioPalabraB.setVisible(true);
		cambioPalabraT.setVisible(true);

		menuPr.setVisible(true);
		cerrar.setVisible(true);


	}
	public void modificarTopic(){
		menuPr.setVisible(true);
		cerrar.setVisible(true);		
	}

}