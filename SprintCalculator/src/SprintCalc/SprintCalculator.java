package SprintCalc;

 

import javax.swing.JFrame;

import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JTextField;

import javax.swing.JLabel;

import javax.swing.JTextPane;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

 

import javax.swing.JButton;

 

 
/**
 * Sprint Calculator is a short script i made within 30 minutes to help my scrum master calculate sprints.
 * 
 * I had to copy this code over from another PC due to security proxy. 
 * This is why there are additional newlines
 * 
 * Takes no parameters. Just compile to a .jar and run. When my scrum master used it, I converted the .jar to an exe with http://launch4j.sourceforge.net/
 */
public class SprintCalculator extends JFrame

{

			   //TextField labels for inputs
	
               private JTextField ttlPoints;

               private JTextField variance;

               private JTextField velocity;

               public SprintCalculator()

               {

            	   
            	   			  //SetUp window layouts
            	   
                              this.setSize(400, 400);

                             

                              JPanel panel = new JPanel();

                              getContentPane().add(panel, BorderLayout.CENTER);

                              panel.setLayout(new BorderLayout(0, 0));

                             

                              JPanel panel_2 = new JPanel();

                              panel.add(panel_2, BorderLayout.CENTER);

                              panel_2.setLayout(new BorderLayout(0, 0));

                             

                              JTextPane textPane = new JTextPane();

                              panel_2.add(textPane, BorderLayout.CENTER);



                              JPanel panel_1 = new JPanel();

                              panel.add(panel_1, BorderLayout.NORTH);

                              panel_1.setLayout(new GridLayout(0, 2, 0, 0));

                             

                              JLabel lblTtl = new JLabel("Total Points");

                              panel_1.add(lblTtl);

                             

                              ttlPoints = new JTextField();

                              panel_1.add(ttlPoints);

                              ttlPoints.setColumns(10);

                             

                              JLabel lblNewLabel = new JLabel("% Variance");

                              panel_1.add(lblNewLabel);

                             

                              variance = new JTextField();

                              panel_1.add(variance);

                              variance.setColumns(10);

                             

                              JLabel lblNewLabel_1 = new JLabel("Velocity");

                              panel_1.add(lblNewLabel_1);

                             

                              velocity = new JTextField();

                              panel_1.add(velocity);

                              velocity.setColumns(10);

                             
                              //Calculate button is where the sprint calculations are made (when pressed)
                              //As this was a quick tool, I did not have time to implement error handling, so be careful with your inputs!

                              JButton btnNewButton = new JButton("Calculate");

                             

                              (btnNewButton).addActionListener(new ActionListener()

                              {

                                             public void actionPerformed(ActionEvent e)

                                             {

                                                            double totalcost = (Integer.parseInt(ttlPoints.getText())*Double.parseDouble(variance.getText()));

                                                            textPane.setText(ttlPoints.getText()+" x "+variance.getText()+" = "+

                                                   totalcost+"\n"+

                                                            "Developer velocity set at: "+velocity.getText()+". Therefore, \n"+

                                                            "One Developer: "+totalcost+"/"+velocity.getText()+"="+(totalcost/Double.parseDouble(velocity.getText()))+" sprints.\n"+

                                                            "Two Developers: "+totalcost+"/"+(Double.parseDouble(velocity.getText())*2+"="+(totalcost/(Double.parseDouble(velocity.getText())*2)))+" sprints.\n"+

                                                            "Three Developers: "+totalcost+"/"+(Double.parseDouble(velocity.getText())*3+"="+(totalcost/(Double.parseDouble(velocity.getText())*3)))+" sprints.\n"+

                                                            "Four Developer: "+totalcost+"/"+(Double.parseDouble(velocity.getText())*4+"="+(totalcost/(Double.parseDouble(velocity.getText())*4)))+" sprints.\n"

                                                  );

                                                           

                                                           

                                             }

                              }

                              );

                              panel_2.add(btnNewButton, BorderLayout.NORTH);

                              this.setVisible(true);

               }

               
               //Main method. Takes no arguments. Simply run from the command line
               
               public static void main(String[]args)

               {

                              SprintCalculator c = new SprintCalculator();

                             

               }
}
              