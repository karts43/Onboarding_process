package Onboarding_process;
import javax.swing.*;
//import javafx.event.ActionEvent;
import java.util.regex.*;  
import java.awt.*;
import java.awt.event.ActionListener;

public  class Onboarding implements ActionListener
{
    private JFrame JF1;
    public JLabel A1,A2,A3,Icon_JL,AB,Icon_JL2,Icon_JL3,Action_JL;
    public JButton B1,B2;
    public JTextField tf1, tf2, tf5, tf6, tf7;  
    public JTextField JTextField2;
    public JLabel JLabelAAB;
    public JMenuBar JMB;
    public JMenu Home,Information, Program,Dashboard,Setting ;
    public  JMenuItem Home_Pages,Financial,Produt,Intership,Hackcataon,Communiy,Activity, Account, Log_in,Sign_in;
    private  ImageIcon image,image2;
    
    //Cal To Methode
    
    public void Frame_Work (){
      
       JF1 =new  JFrame();
       JF1. setTitle(" IAC 'Campas Ambassters' Onboarding process");
       JF1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       JF1.setLocation(700, 300);
       JF1.setSize(554,444);
       JF1.getContentPane().setBackground(Color.ORANGE);
       JF1.pack();
       JF1. setLayout(null); 

       			// Add One Bar 
       					JMB=new JMenuBar();
       						//JMB.setBounds(350,70,400,80);
       								JMB.setSize(500,150);
       									JMB.setFont(new java.awt.Font("Arial", java.awt.Font.CENTER_BASELINE, 44)); 
       										JMB.setPreferredSize(new Dimension(400,90));

       											//Home_Pages=new JMenuItem("Home Pages");
       											Intership =new JMenuItem("Intership ");
                            Intership.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));

       											Hackcataon=new JMenuItem("Hackcataon");
                            Hackcataon.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));

       											Financial=new JMenuItem("Summer & Winter Intership");
                            Financial.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));

       											Produt=new JMenuItem("Research Intership");
                            Produt.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));

       											Communiy=new JMenuItem("Community");
                            Communiy.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));

       											Activity=new JMenuItem("Activity");
                            Activity.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));

       											Account=new JMenuItem("Account");
                            Account.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));

       											Sign_in=new JMenuItem("Sign In");	
                            Sign_in.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));

       											Log_in=new JMenuItem("Log Out");
                            Log_in.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));
                           
       								//----list Oh Menu------
       											
       											Home=new JMenu();
       											Home.setText("Home");
       											Home.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));

       											Program=new JMenu();
       											Program.setText("Students");
                            Program.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
       											Program.add(Intership);
       											Program.add(Hackcataon);

       											Information=new JMenu();
       											Information.setText("Intership");
                            Information.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
       											Information.add(Financial);
       											Information.add(Produt);

       											Dashboard=new JMenu();
       											Dashboard.setText("Dashboard");
                            Dashboard.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
       											Dashboard.add(Communiy);
       											Dashboard.add(Activity);	

       											Setting=new JMenu();
       											Setting.setText("Activities");
                            Setting.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
       											Setting.add(Account);
       											Setting.add(Sign_in);
       											Setting.add(Log_in);
       											
       							  //--------Add a item in Menu Bar
       											
       											JMB.add(Home);
       											JMB.add(Information);
       											JMB.add(Program);
       											JMB.add(Dashboard);
       											JMB.add(Setting);

       							//-ADD frame ---object--->JF1

       											JF1.setJMenuBar(JMB);
       											JF1.setJMenuBar(JMB);
  
                   //--------Add image Icon  in Front pages
      
       							    image=new ImageIcon("C:\\eclispe\\workspace\\Data\\src\\main\\java\\Onboarding_process\\IACA.png");
       							    Icon_JL=new JLabel();
       								  Icon_JL.setIcon(image);
       							    Icon_JL.setBounds(1600,30,240,190);
       							    JF1.add(Icon_JL);
       								
                        image2=new ImageIcon("C:\\eclispe\\workspace\\Data\\src\\main\\java\\Onboarding_process\\Center1.png");
       							    Icon_JL2=new JLabel();
       							    Icon_JL2.setIcon(image2);
       							    Icon_JL2.setBounds(550, 200, 490, 290);  
       							    Icon_JL.setOpaque(true);
      							    JF1.add(Icon_JL2);

       											  A1=new JLabel();
       										  	A1.setText("IAC INTERNSHIP PROGRAM 2023\t\t\r\n");
       											  A1.setFont(new java.awt.Font("Arial", java.awt.Font.LAYOUT_RIGHT_TO_LEFT, 24)); 
       											  A1.setBounds(550,520,390,90);   
       											  JF1.add(A1);

     // Action_JL=new JLabel();
      //Action_JL.setBounds(580, 630, 190, 40);
    
       											B2=new JButton("Apply Here");
                            B2.setFont(new java.awt.Font("Arial", java.awt.Font.HANGING_BASELINE, 18)); 
       											B2.addActionListener(this);
       											B2.setBounds(550, 590, 200, 40);
//JF1.add(Action_JL);
       											JF1.add(B2);

       											// frame are visiable in perfect
       											JF1.setSize(550,450);  
       											JF1.setLayout(null);  
       											JF1.setVisible(true);
        
// ---Last CarleBacert
   }
 
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) 
    {
                        JFrame newframe =new JFrame();
                        JTextField Sec_TeFi_1,Mob_Tefi_2,Email_TeFi_3,Adders_TeFi_4,Age_Tefi_5;
                        JLabel Sec_Title,Age_Lab_5,Sec_Lab_1,Mob_Lab_2,gender_Lab,Email_Lab_3,Adders_Lab_4,Icon_RF_JLB;
                        JRadioButton male,female;
                        ButtonGroup   Gen_Butt;
                        JTextArea confirmationArea;

                        //  JComboBox date,month,year;
                       // Container c;

                       //---- Add  Day Future----
    /*  String dates[] = { "1", "2", "3", "4", "5","6", "7", "8", "9", "10",
                         "11", "12", "13", "14", "15","16", "17", "18", "19", "20",
                         "21", "22", "23", "24", "25","26", "27", "28", "29", "30", "31" };

      String months[] = { "Jan", "feb", "Mar", "Apr","May", "Jun",
                           "July", "Aug", "Sup", "Oct", "Nov", "Dec" };

       String years[]= { "1995", "1996", "1997", "1998","1999", "2000", "2001", "2002","2003", "2004", "2005", "2006",
                          "2007", "2008", "2009", "2010","2011", "2012", "2013", "2014","2015", "2016", "2017", "2018",
                           "2019", "2020", "2021", "2022","2023" };
     */

   //  ---- add New Windows ro Frame  At Click Submit Button---

    newframe = new JFrame(" Registration/Joinee");
    newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Color c2=new Color(35,90,171,50);
    newframe.getContentPane().setBackground(c2);
    newframe.setSize(800, 500);
    newframe.setLocation(600,450);

   // ADD R.F Icon 
   ImageIcon image_RF=new ImageIcon("C:\\eclispe\\workspace\\Data\\src\\main\\java\\Onboarding_process\\Registration.png");
       											Icon_RF_JLB=new JLabel();
       											Icon_RF_JLB.setIcon(image_RF);
       											Icon_RF_JLB.setBounds(200,80,240,250);
       											newframe.add(Icon_RF_JLB);
       										
                          Sec_Title = new JLabel();  
                          Sec_Title.setText("Registration Form:");
                          Sec_Title.setForeground(Color.BLACK);  
                          Sec_Title.setFont(new Font("Serif", Font.BOLD, 50));  
                          Sec_Title.setBounds(750,110,500,100);
                          newframe.add(Sec_Title);

                           //   <-------ADD Name--------->

                                  Sec_Lab_1 = new JLabel();
                                  Sec_Lab_1.setText("Name:");
                                  Sec_Lab_1.setFont(new Font("Arial", Font.ROMAN_BASELINE, 35));
                                  Sec_Lab_1.setSize(150, 35);
                                  Sec_Lab_1.setLocation(590, 300);
                                  newframe.add(Sec_Lab_1);
        
                                  Sec_TeFi_1 = new JTextField();  
                                  Sec_TeFi_1.setFont(new Font("Arial", Font.TRUETYPE_FONT, 20));
                                  Sec_TeFi_1.setBounds(750, 300, 300, 35);
                                  newframe.add(Sec_TeFi_1);

                                   //   <-------ADD Mobile--------->

                                    Mob_Lab_2=new JLabel();
                                    Mob_Lab_2.setText("Mobile:");
                                    Mob_Lab_2.setFont(new Font("Arial", Font.ROMAN_BASELINE, 35));
                                    Mob_Lab_2.setSize(150,35 );
                                    Mob_Lab_2.setLocation(590, 345);
                                    newframe.add(Mob_Lab_2);

                                    Mob_Tefi_2=new JTextField();
                                    Mob_Tefi_2.setFont(new Font("Arial", Font.TRUETYPE_FONT, 20));
                                    Mob_Tefi_2.setBounds(750,345,300,35);
                                    newframe.add(Mob_Tefi_2);

                                        //<---- Add gendar option----->

                                          gender_Lab = new JLabel("Gender:");
                                          gender_Lab.setFont(new Font("Arial", Font.PLAIN, 35));
                                          gender_Lab.setSize(150, 35);
                                          gender_Lab.setLocation(590, 390);
                                          newframe.add(gender_Lab);
 
                                          male = new JRadioButton("Male");
                                          male.setFont(new Font("Arial", Font.PLAIN, 18));
                                          male.setSelected(true);
                                          male.setSize(75, 20);
                                          male.setLocation(750, 399);
                                          newframe.add(male);
 
                                          female = new JRadioButton("Female");
                                          female.setFont(new Font("Arial", Font.PLAIN, 18));
                                          female.setSelected(false);
                                          female.setSize(90, 20);
                                          female.setLocation(825, 399);
                                          newframe.add(female);
 
                                          Gen_Butt = new ButtonGroup();
                                              Gen_Butt.add(male);
                                              Gen_Butt.add(female);
  
                                              //<---- Add Email option----->

                                                      Email_Lab_3=new JLabel("Email:");
                                                      Email_Lab_3.setFont(new Font("Arial", Font.PLAIN, 35));
                                                      Email_Lab_3.setBounds(590,435,150,35);
                                                      newframe.add(Email_Lab_3);

                                                      Email_TeFi_3=new JTextField("");
                                                      Email_TeFi_3.setFont(new Font("Arial", Font.TRUETYPE_FONT, 20));
                                                      Email_TeFi_3.setBounds(750,435,300,35);
                                                      newframe.add(Email_TeFi_3);
                            
                                                      //<---- Add Age option----->
                                                     
                                                         Age_Lab_5 = new JLabel();
                                                         Age_Lab_5.setText("Age:");
                                                         Age_Lab_5.setFont(new Font("Arial", Font.ROMAN_BASELINE, 35));
                                                         Age_Lab_5.setSize(120, 39);
                                                         Age_Lab_5.setLocation(590, 475);
                                                         newframe.add(Age_Lab_5);

                                                         Age_Tefi_5=new JTextField(5);
                                                         Age_Tefi_5.setText("");
                                                         Age_Tefi_5.setBounds(750, 475, 300, 30);
                                                         Age_Tefi_5.setFont(new Font("Arial", Font.TRUETYPE_FONT, 20));
                                                         newframe.add(Age_Tefi_5);

   /*     date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(750, 475);
       newframe.add(date);
  
        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(810, 475);
        newframe.add(month);
 
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(80, 20);
        year.setLocation(875, 475);
        newframe.add(year);
        */
                                             //<---- Add  Address option----->

                                          Adders_Lab_4=new JLabel("Address:");
                                          Adders_Lab_4.setFont(new Font("Arial", Font.PLAIN, 35));
                                          Adders_Lab_4.setBounds(590, 520, 150, 25);
                                          newframe.add(Adders_Lab_4);

                                          Adders_TeFi_4=new JTextField("");
                                          Adders_TeFi_4.setFont(new Font("Arial", Font.PLAIN, 20));
                                          Adders_TeFi_4.setBounds(750,510,300,80);
                                          newframe.add(Adders_TeFi_4);

                 /*  JPanel mainPanel = new JPanel(new GridLayout());
                      mainPanel.setFont(new Font("Arial", Font.BOLD, 20));
                        Color C3=new Color(130,40,171,50);
                       mainPanel.setBackground(C3);

                              mainPanel.setBounds(1100,400,300,400);
                                 //   newframe.add(mainPanel);
                 */

        JButton submitButton = new JButton("Submit");
                submitButton.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
                submitButton.setBounds(600, 700, 440, 40);
        newframe.add(submitButton);

        confirmationArea = new JTextArea(10, 30);
        confirmationArea.setEditable(false);
       // mainPanel.add(new JScrollPane(confirmationArea), BorderLayout.BEFORE_FIRST_LINE);
            // JOptionPane optionPane = new JOptionPane();
             //optionPane.setMessage(confirmation);

         submitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {

          String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$"; 
              Pattern pattern = Pattern.compile(regex);  
                        
                String name =  Sec_TeFi_1.getText();
                String age = Age_Tefi_5.getText();  
                String email = Email_TeFi_3.getText();

                Matcher matcher = pattern.matcher(email);  
                
                //-------Check User Email  Are  validate  or Not validate 
                if(matcher.matches()==true) {

                                String confirmation = "Thank you, " + name + "! You are age " + age + "."
                                                      + "\n We will contact you at " + email + 
                                                      " for further steps And Received Joinee Form..";

                                 String utmLink = "https://www.industryacademiacommunity.com/?utm_source="+email+ "&utm_medium="
                                                                 + name + "&utm_campaign=onboarding";
                                        
                          confirmationArea.setText(confirmation + "\n\nGenerated UTM Link: " + utmLink);

                             confirmationArea.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 20));
                                confirmationArea.copy();

                                  JOptionPane optionPane = new JOptionPane();
                                              optionPane.setMessage(confirmationArea);
                                              optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);

                                 JDialog dialog = optionPane.createDialog(null, " Successfully Registration..");
                                         dialog.setVisible(true);          
                }

                  //-------Print Message wrong Email  Not validate ----

               else if (matcher.matches()==false)
               {

                              confirmationArea.setText("WARNING : Wrong Emali ");
                              confirmationArea.setFont(new Font("Arial", Font.BOLD, 25));

                                        JOptionPane error = new JOptionPane();
                                                    error.setMessage(confirmationArea);
                                                    error.setMessageType(JOptionPane.WARNING_MESSAGE);

                                        JDialog dialog = error.createDialog(null, " WARNING");
                                                dialog.setVisible(true);
                
              } 
              else{
                    }
            
            }
        });
               newframe.setSize(450,450);  
            newframe.setLayout(null);  
        newframe.setVisible(true);

  }
    					public static void main(String []args) throws Exception             // Main Method
    					{
    						    Onboarding obj =new Onboarding();
    						               obj.Frame_Work();
    
    					}
   

}