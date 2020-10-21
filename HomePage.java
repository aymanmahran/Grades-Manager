/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  net.miginfocom.swing.MigLayout
 *  org.odftoolkit.simple.SpreadsheetDocument
 *  org.odftoolkit.simple.table.Cell
 *  org.odftoolkit.simple.table.Table
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.Attribute;
import javax.print.attribute.DocAttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.ListModel;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.text.Document;
import net.miginfocom.swing.MigLayout;
import org.odftoolkit.simple.SpreadsheetDocument;
import org.odftoolkit.simple.table.Cell;
import org.odftoolkit.simple.table.Table;

public class HomePage {
    Map<String, Double> mapp = new HashMap<String, Double>();
    Map<String, String> mapo = new HashMap<String, String>();
    Map<String, Double> oval = new HashMap<String, Double>();
    Map<String, Double> maxi = new HashMap<String, Double>();
    int cn = 0;
    String wo;
    JButton Openbutton = new JButton("Open");
    JButton Newbutton = new JButton("New");
    JButton Savebutton = new JButton();
    JButton Homebutton = new JButton();
    JButton Undobutton = new JButton();
    JButton Redobutton = new JButton();
    JButton Settbutton = new JButton();
    JButton Backbutton = new JButton();
    JButton Studentbutton = new JButton("Add student");
    JButton Taskbutton = new JButton("Add assessment");
    JButton Catbutton = new JButton("Add category");
    JButton Printbutton = new JButton(" Print ");
    JButton Sabutton = new JButton("Save as");
    JButton Studentclose = new JButton("Close");
    JButton Studentadd = new JButton(" Add ");
    JButton Taskclose = new JButton("Close");
    JButton Taskadd = new JButton(" Add ");
    JButton Catclose = new JButton("Close");
    JButton Catadd = new JButton(" Add ");
    JProgressBar pbar = new JProgressBar();
    DefaultTableModel tableModel = new DefaultTableModel();
    DefaultTableModel Gradesmodel = new DefaultTableModel();
    DefaultTableModel Stsmodel = new DefaultTableModel();
    JTable table = new JTable();
    JTable Gradeslist = new JTable();
    JTable Stslist = new JTable();
    JButton Openopen = new JButton("Open");
    JButton Openclose = new JButton("Close");
    JButton Newok = new JButton("  OK  ");
    JButton Newclose = new JButton("Close");
    JButton Settok = new JButton("Save");
    JButton Settclose = new JButton("Close");
    JButton Backclose = new JButton("Cancel");
    JButton Printok = new JButton("Print");
    JButton Printclose = new JButton("Cancel");
    static DefaultListModel Sheets = new DefaultListModel();
    JList<String> Chooselist = new JList(Sheets);
    JComboBox Yearlist = new JComboBox();
    JComboBox Classlist = new JComboBox();
    JComboBox Columnlist = new JComboBox();
    JComboBox Sortlist = new JComboBox();
    JComboBox Printerslist = new JComboBox();
    JComboBox Catslist1 = new JComboBox();
    JComboBox Catslist2 = new JComboBox();
    JLabel Year = new JLabel("Year group:");
    JLabel Class = new JLabel("Class of:");
    JLabel Fname = new JLabel("First name:");
    JLabel Lname = new JLabel("Last name:");
    JLabel Tit = new JLabel("Title:");
    JLabel Maxmrk = new JLabel("Max. mark:");
    JLabel Rep = new JLabel("Represents");
    JLabel oof = new JLabel("% of");
    JLabel Tit1 = new JLabel("Title:");
    JLabel Rep1 = new JLabel("Represents");
    JLabel oof1 = new JLabel("% of");
    JLabel Newyear = new JLabel("Year group:");
    JLabel Newclass = new JLabel("Class of:");
    JLabel Ho = new JLabel();
    JLabel stat = new JLabel("Backing up...");
    JLabel Openlabel = new JLabel("Open");
    JLabel Newlabel = new JLabel("New");
    JLabel Printer = new JLabel("Printer:");
    JLabel Copies = new JLabel("No. of copies");
    JFrame Homepage = new JFrame("Grade Manager");
    JFrame Openwindow = new JFrame("Open");
    JFrame Newwindow = new JFrame("New");
    JFrame Settingswindow = new JFrame("Settings");
    JFrame Backwindow = new JFrame("Backup");
    JFrame Studentwindow = new JFrame("Add a student");
    JFrame Taskwindow = new JFrame("Add an assessment");
    JFrame Catwindow = new JFrame("Add a category");
    JFrame Printwindow = new JFrame("Print table");
    JTextField Classtext = new JTextField();
    JTextField Yeartext = new JTextField();
    JTextField Searchtext = new JTextField();
    JTextField Fnametext = new JTextField();
    JTextField Lnametext = new JTextField();
    JTextField Tittext = new JTextField();
    JTextField Catittext = new JTextField();
    JTextField Catreptext = new JTextField();
    JTextField Maxmrktext = new JTextField();
    JTextField Reptext = new JTextField();
    JTextField ooftext = new JTextField();
    JTextField Catooftext = new JTextField();
    JTextField Copiestext = new JTextField();
    JPasswordField Oldpass = new JPasswordField(40);
    JPasswordField Newpass = new JPasswordField(40);
    JPasswordField Confirmpass = new JPasswordField(40);
    JTextField Gmail = new JTextField();
    JPasswordField Gpass = new JPasswordField();
    JPanel nor = new JPanel((LayoutManager)new MigLayout("", "[grow]", "[grow]"));
    JPanel we = new JPanel((LayoutManager)new MigLayout("", "[grow, center]", "[grow][grow]"));
    JPanel spa = new JPanel((LayoutManager)new MigLayout("", "[grow]", "[grow]"));
    static boolean Homestate = true;
    static List<String> Classes = new ArrayList<String>();
    static List<String> Years = new ArrayList<String>();
    static List<String> Colum = new ArrayList<String>();
    String Filename;
    String Chosenyear;
    String Chosenclass;
    String Chosensort;
    String Chosencolumn;
    String Fontname;
    static String selected;
    String item;
    String Fileclass;
    String Fileyear;
    static String place;
    char[] Oldtext;
    char[] Newtext;
    char[] Confirmtext;
    String Gmailtext;
    char[] Gpasstext;
    String[] w = new String[300];
    static String key;
    String inipass = "";
    static int current_state;
    static int next_action;
    static int[] xcol;
    static int[] yrow;
    static String[] oldtxt;
    static String[] newtxt;
    ActionListener actionListener = new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (actionEvent.getSource() == HomePage.this.Openbutton) {
                HomePage.this.St_openscreen();
            } else if (actionEvent.getSource() == HomePage.this.Newbutton) {
                HomePage.this.St_createnew();
            } else if (actionEvent.getSource() == HomePage.this.Openclose) {
                HomePage.this.Openwindow.dispose();
            } else if (actionEvent.getSource() == HomePage.this.Openopen) {
                HomePage.this.Opensheet();
            } else if (actionEvent.getSource() == HomePage.this.Newclose) {
                HomePage.this.Newwindow.dispose();
            } else if (actionEvent.getSource() == HomePage.this.Newok) {
                HomePage.this.Newsheet();
            } else if (actionEvent.getSource() == HomePage.this.Settbutton) {
                HomePage.this.St_settingswindow();
            } else if (actionEvent.getSource() == HomePage.this.Settok) {
                HomePage.this.Updatesett();
            } else if (actionEvent.getSource() == HomePage.this.Settclose) {
                HomePage.this.Settingswindow.dispose();
            } else if (actionEvent.getSource() == HomePage.this.Backbutton) {
                HomePage.this.St_backup();
            } else if (actionEvent.getSource() == HomePage.this.Homebutton) {
                HomePage.this.Maincomp();
            } else if (actionEvent.getSource() == HomePage.this.Studentbutton) {
                HomePage.this.St_addstudent();
            } else if (actionEvent.getSource() == HomePage.this.Taskbutton) {
                HomePage.this.St_addtask();
            } else if (actionEvent.getSource() == HomePage.this.Catbutton) {
                HomePage.this.St_addcat();
            } else if (actionEvent.getSource() == HomePage.this.Printbutton) {
                HomePage.this.St_printing();
            } else if (actionEvent.getSource() == HomePage.this.Printok) {
                HomePage.this.print();
            } else if (actionEvent.getSource() == HomePage.this.Printclose) {
                HomePage.this.Printwindow.dispose();
            } else if (actionEvent.getSource() == HomePage.this.Sabutton) {
                HomePage.this.Saving();
            } else if (actionEvent.getSource() == HomePage.this.Studentclose) {
                HomePage.this.Studentwindow.dispose();
            } else if (actionEvent.getSource() == HomePage.this.Studentadd) {
                HomePage.this.studentadded();
            } else if (actionEvent.getSource() == HomePage.this.Taskclose) {
                HomePage.this.Taskwindow.dispose();
            } else if (actionEvent.getSource() == HomePage.this.Taskadd) {
                HomePage.this.taskadded();
            } else if (actionEvent.getSource() == HomePage.this.Catclose) {
                HomePage.this.Catwindow.dispose();
            } else if (actionEvent.getSource() == HomePage.this.Catadd) {
                HomePage.this.catadded();
            } else if (actionEvent.getSource() == HomePage.this.Undobutton) {
                HomePage.this.Undo();
            } else if (actionEvent.getSource() == HomePage.this.Redobutton) {
                HomePage.this.Redo();
            }
        }
    };
    ItemListener Comboaction = new ItemListener(){

        @Override
        public void itemStateChanged(ItemEvent event) {
            if (HomePage.this.Yearlist.getSelectedItem() != null && HomePage.this.Classlist.getSelectedItem() != null) {
                System.out.print("gf");
                HomePage.this.Chosenyear = (String)HomePage.this.Yearlist.getSelectedItem();
                HomePage.this.Chosenclass = (String)HomePage.this.Classlist.getSelectedItem();
                HomePage.this.Updatelists();
                int i = 0;
                while (i < HomePage.Sheets.size()) {
                    HomePage.this.item = (String)HomePage.Sheets.getElementAt(i);
                    if (HomePage.this.item.contains(HomePage.this.Chosenclass) || HomePage.this.Chosenclass == "All") {
                        if (!HomePage.this.item.endsWith(HomePage.this.Chosenyear) && HomePage.this.Chosenyear != "All") {
                            HomePage.Sheets.removeElementAt(i);
                            --i;
                        }
                    } else {
                        HomePage.Sheets.removeElementAt(i);
                        --i;
                    }
                    ++i;
                }
            }
        }
    };
    ItemListener Combaction = new ItemListener(){

        @Override
        public void itemStateChanged(ItemEvent event) {
            if (HomePage.this.Columnlist.getSelectedItem() == null) {
                return;
            }
            System.out.println("h:" + HomePage.this.Columnlist.getSelectedItem());
            System.out.println("g:" + HomePage.this.tableModel.getColumnCount());
            HomePage.this.Updatetable(HomePage.selected, HomePage.this.tableModel.getColumnCount());
            HomePage.this.Chosencolumn = (String)HomePage.this.Columnlist.getSelectedItem();
            if (HomePage.this.Chosencolumn == " ") {
                return;
            }
            int colindex = HomePage.this.tableModel.findColumn(HomePage.this.Chosencolumn);
            String stxt = HomePage.this.Searchtext.getText();
            int i = 0;
            while (i < HomePage.this.table.getRowCount()) {
                String cone = HomePage.this.tableModel.getValueAt(i, colindex).toString();
                if (!cone.contains(stxt)) {
                    HomePage.this.tableModel.removeRow(i);
                    --i;
                }
                ++i;
            }
        }
    };
    ItemListener def = new ItemListener(){

        @Override
        public void itemStateChanged(ItemEvent event) {
            if (HomePage.this.Sortlist.getSelectedItem() != null) {
                HomePage.this.Chosensort = (String)HomePage.this.Sortlist.getSelectedItem();
                int colindex = HomePage.this.tableModel.findColumn(HomePage.this.Chosensort);
                int i = 0;
                while (i < HomePage.this.table.getRowCount()) {
                    String cone1 = HomePage.this.tableModel.getValueAt(i, colindex).toString();
                    int h = i;
                    int j = i + 1;
                    while (j < HomePage.this.table.getRowCount()) {
                        String cone2 = HomePage.this.tableModel.getValueAt(j, colindex).toString();
                        System.out.println(cone2.compareTo(cone1));
                        if (cone2.compareTo(cone1) < 0) {
                            cone1 = cone2;
                            h = j;
                        }
                        ++j;
                    }
                    HomePage.this.tableModel.moveRow(h, h, i);
                    ++i;
                }
            }
        }
    };

    static {
        place = String.valueOf(System.getProperty("user.home")) + "/Grade_Manager_data";
        key = "#%EvT45_*a@bcv!.fd3K2ls%3#d^esR23)&41bZ1";
        current_state = 0;
        next_action = 0;
        xcol = new int[300];
        yrow = new int[300];
        oldtxt = new String[300];
        newtxt = new String[300];
    }

    public void Maincomp() {
        this.Homepage.setTitle("Grade Manager");
        this.we.removeAll();
        this.we.revalidate();
        this.we.repaint();
        this.spa.removeAll();
        this.spa.revalidate();
        this.spa.repaint();
        ImageIcon Homeimage = new ImageIcon(HomePage.class.getResource("/Home.png"));
        this.Ho.setIcon(Homeimage);
        Font Wholefont = this.Openlabel.getFont();
        this.Fontname = Wholefont.getName();
        ImageIcon Openicon = new ImageIcon(HomePage.class.getResource("/Open-file-icon.png"));
        Image Openimage = Openicon.getImage();
        Image Openimagepro = Openimage.getScaledInstance(75, 75, 4);
        ImageIcon Openlast = new ImageIcon(Openimagepro);
        this.Openbutton.setHorizontalTextPosition(0);
        this.Openbutton.setVerticalTextPosition(3);
        this.Openbutton.setIcon(Openlast);
        this.Openbutton.setFont(new Font(this.Fontname, 1, 15));
        this.Openbutton.setOpaque(false);
        this.Openbutton.setFocusPainted(false);
        this.Openbutton.setToolTipText("Open an existing sheet sheet");
        this.Openbutton.setContentAreaFilled(false);
        this.Openbutton.setBorderPainted(false);
        ImageIcon Newicon = new ImageIcon(HomePage.class.getResource("/New-file-icon.png"));
        Image Newimage = Newicon.getImage();
        Image Newimagepro = Newimage.getScaledInstance(72, 72, 4);
        ImageIcon Newlast = new ImageIcon(Newimagepro);
        this.Newbutton.setHorizontalTextPosition(0);
        this.Newbutton.setVerticalTextPosition(3);
        this.Newbutton.setIcon(Newlast);
        this.Newbutton.setFont(new Font(this.Fontname, 1, 15));
        this.Newbutton.setToolTipText("Create a new sheet");
        this.Newbutton.setOpaque(false);
        this.Newbutton.setContentAreaFilled(false);
        this.Newbutton.setFocusPainted(false);
        this.Newbutton.setBorderPainted(false);
        JSeparator linev = new JSeparator(1);
        linev.setBackground(Color.lightGray);
        this.we.add((Component)linev, "dock east, grow, gapbottom 7");
        this.we.add((Component)this.Openbutton, "wrap");
        this.we.add((Component)this.Newbutton, "top");
        this.spa.add((Component)this.Ho, "center");
        this.Homepage.setVisible(true);
    }

    public HomePage() {
        this.mapp.put("Total", 100.0);
        this.mapo.put("Total", "Total");
        this.Homepage.setSize(850, 674);
        this.Homepage.setLocationRelativeTo(null);
        this.Homepage.setDefaultCloseOperation(3);
        this.Homepage.setLayout((LayoutManager)new MigLayout("", "[grow]", "[grow]"));
        ImageIcon Saveicon = new ImageIcon(HomePage.class.getResource("/Save-file-icon.png"));
        Image Saveimage = Saveicon.getImage();
        Image Saveimagepro = Saveimage.getScaledInstance(35, 35, 4);
        ImageIcon Savelast = new ImageIcon(Saveimagepro);
        this.Savebutton.setIcon(Savelast);
        this.Savebutton.setToolTipText("Save");
        this.Savebutton.setOpaque(false);
        this.Savebutton.setContentAreaFilled(false);
        this.Savebutton.setFocusPainted(false);
        this.Savebutton.setBorderPainted(false);
        this.Savebutton.addActionListener(this.actionListener);
        ImageIcon Homeicon = new ImageIcon(HomePage.class.getResource("/Home-page-icon.png"));
        Image Homeimage = Homeicon.getImage();
        Image Homeimagepro = Homeimage.getScaledInstance(35, 35, 4);
        ImageIcon Homelast = new ImageIcon(Homeimagepro);
        this.Homebutton.setIcon(Homelast);
        this.Homebutton.setToolTipText("Homepage");
        this.Homebutton.setOpaque(false);
        this.Homebutton.setContentAreaFilled(false);
        this.Homebutton.setFocusPainted(false);
        this.Homebutton.setBorderPainted(false);
        this.Homebutton.addActionListener(this.actionListener);
        ImageIcon Undoicon = new ImageIcon(HomePage.class.getResource("/Undo-action-icon.png"));
        Image Undoimage = Undoicon.getImage();
        Image Undoimagepro = Undoimage.getScaledInstance(30, 30, 4);
        ImageIcon Undolast = new ImageIcon(Undoimagepro);
        this.Undobutton.setIcon(Undolast);
        this.Undobutton.setToolTipText("Undo");
        this.Undobutton.setOpaque(false);
        this.Undobutton.setContentAreaFilled(false);
        this.Undobutton.setFocusPainted(false);
        this.Undobutton.setBorderPainted(false);
        this.Undobutton.addActionListener(this.actionListener);
        ImageIcon Redoicon = new ImageIcon(HomePage.class.getResource("/Redo-action-icon.png"));
        Image Redoimage = Redoicon.getImage();
        Image Redoimagepro = Redoimage.getScaledInstance(30, 30, 4);
        ImageIcon Redolast = new ImageIcon(Redoimagepro);
        this.Redobutton.setIcon(Redolast);
        this.Redobutton.setToolTipText("Redo");
        this.Redobutton.setOpaque(false);
        this.Redobutton.setContentAreaFilled(false);
        this.Redobutton.setFocusPainted(false);
        this.Redobutton.setBorderPainted(false);
        this.Redobutton.addActionListener(this.actionListener);
        ImageIcon Setticon = new ImageIcon(HomePage.class.getResource("/Pass-settings-icon.png"));
        Image Settimage = Setticon.getImage();
        Image Settimagepro = Settimage.getScaledInstance(30, 30, 4);
        ImageIcon Settlast = new ImageIcon(Settimagepro);
        this.Settbutton.setIcon(Settlast);
        this.Settbutton.setToolTipText("Password settings");
        this.Settbutton.setOpaque(false);
        this.Settbutton.setContentAreaFilled(false);
        this.Settbutton.setFocusPainted(false);
        this.Settbutton.setBorderPainted(false);
        this.Settbutton.addActionListener(this.actionListener);
        ImageIcon Backicon = new ImageIcon(HomePage.class.getResource("/Back-up-icon.png"));
        Image Backimage = Backicon.getImage();
        Image Backimagepro = Backimage.getScaledInstance(30, 30, 4);
        ImageIcon Backlast = new ImageIcon(Backimagepro);
        this.Backbutton.setIcon(Backlast);
        this.Backbutton.setToolTipText("Backup");
        this.Backbutton.setOpaque(false);
        this.Backbutton.setContentAreaFilled(false);
        this.Backbutton.setFocusPainted(false);
        this.Backbutton.setBorderPainted(false);
        this.Backbutton.addActionListener(this.actionListener);
        this.Openclose.addActionListener(this.actionListener);
        this.Openopen.addActionListener(this.actionListener);
        this.Openbutton.addActionListener(this.actionListener);
        this.Newbutton.addActionListener(this.actionListener);
        this.Newclose.addActionListener(this.actionListener);
        this.Newok.addActionListener(this.actionListener);
        this.Settclose.addActionListener(this.actionListener);
        this.Settok.addActionListener(this.actionListener);
        this.Backclose.addActionListener(this.actionListener);
        this.Studentbutton.addActionListener(this.actionListener);
        this.Studentclose.addActionListener(this.actionListener);
        this.Studentadd.addActionListener(this.actionListener);
        this.Taskbutton.addActionListener(this.actionListener);
        this.Taskclose.addActionListener(this.actionListener);
        this.Catadd.addActionListener(this.actionListener);
        this.Catclose.addActionListener(this.actionListener);
        this.Taskadd.addActionListener(this.actionListener);
        this.Catbutton.addActionListener(this.actionListener);
        this.Printbutton.addActionListener(this.actionListener);
        this.Sabutton.addActionListener(this.actionListener);
        this.Printok.addActionListener(this.actionListener);
        this.Printclose.addActionListener(this.actionListener);
        JSeparator lineh = new JSeparator();
        lineh.setBackground(Color.lightGray);
        JSeparator linev = new JSeparator(1);
        linev.setBackground(Color.lightGray);
        this.nor.add((Component)this.Homebutton, "grow");
        this.nor.add((Component)this.Savebutton, "grow");
        this.nor.add((Component)this.Undobutton, "grow");
        this.nor.add((Component)this.Redobutton, "grow");
        this.nor.add((Component)this.Settbutton, "grow");
        this.nor.add((Component)this.Backbutton, "grow, wrap");
        this.nor.add((Component)lineh, "grow, cell 0 1 6 1");
        this.we.add((Component)linev, "dock east, grow, gapbottom 7");
        this.Homepage.add((Component)this.nor, "dock north, grow");
        this.Homepage.add((Component)this.we, "dock west, grow");
        this.Homepage.add((Component)this.spa, "grow");
        this.Settings();
        this.Createnew();
        this.Openscreen();
        this.Backup();
        this.Addstudent();
        this.Addtask();
        this.Addcat();
        this.Printing();
        this.Homepage.setVisible(true);
        String OS = System.getProperty("os.name").toLowerCase();
        if (OS.indexOf("linux") < 0) {
            try {
                Process process = Runtime.getRuntime().exec("cmd.exe /C attrib -s -h -r your_path");
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.Maincomp();
    }

    public void Tabl(final String name) {
        this.Homepage.setTitle("Grade Manager | " + name);
        this.we.removeAll();
        this.we.revalidate();
        this.we.repaint();
        this.spa.removeAll();
        this.spa.revalidate();
        this.spa.repaint();
        Font Wholefont = this.Openlabel.getFont();
        this.Fontname = Wholefont.getName();
        ImageIcon Studenticon = new ImageIcon(HomePage.class.getResource("/Student-icon.png"));
        Image Studentimage = Studenticon.getImage();
        Image Studentimagepro = Studentimage.getScaledInstance(70, 70, 4);
        ImageIcon Studentlast = new ImageIcon(Studentimagepro);
        this.Studentbutton.setHorizontalTextPosition(0);
        this.Studentbutton.setVerticalTextPosition(3);
        this.Studentbutton.setIcon(Studentlast);
        this.Studentbutton.setFont(new Font(this.Fontname, 1, 11));
        this.Studentbutton.setOpaque(false);
        this.Studentbutton.setFocusPainted(false);
        this.Studentbutton.setToolTipText("Add a new student to the class.");
        this.Studentbutton.setContentAreaFilled(false);
        this.Studentbutton.setBorderPainted(false);
        ImageIcon Taskicon = new ImageIcon(HomePage.class.getResource("/Task-icon.png"));
        Image Taskimage = Taskicon.getImage();
        Image Taskimagepro = Taskimage.getScaledInstance(75, 75, 4);
        ImageIcon Tasklast = new ImageIcon(Taskimagepro);
        this.Taskbutton.setHorizontalTextPosition(0);
        this.Taskbutton.setVerticalTextPosition(3);
        this.Taskbutton.setIcon(Tasklast);
        this.Taskbutton.setFont(new Font(this.Fontname, 1, 11));
        this.Taskbutton.setOpaque(false);
        this.Taskbutton.setFocusPainted(false);
        this.Taskbutton.setToolTipText("Add a new assessment or task.");
        this.Taskbutton.setContentAreaFilled(false);
        this.Taskbutton.setBorderPainted(false);
        ImageIcon Caticon = new ImageIcon(HomePage.class.getResource("/Cat-icon.png"));
        Image Catimage = Caticon.getImage();
        Image Catimagepro = Catimage.getScaledInstance(75, 75, 4);
        ImageIcon Catlast = new ImageIcon(Catimagepro);
        this.Catbutton.setHorizontalTextPosition(0);
        this.Catbutton.setVerticalTextPosition(3);
        this.Catbutton.setIcon(Catlast);
        this.Catbutton.setFont(new Font(this.Fontname, 1, 11));
        this.Catbutton.setOpaque(false);
        this.Catbutton.setFocusPainted(false);
        this.Catbutton.setToolTipText("Add a category to group assessments together.");
        this.Catbutton.setContentAreaFilled(false);
        this.Catbutton.setBorderPainted(false);
        ImageIcon Printicon = new ImageIcon(HomePage.class.getResource("/Print-icon.png"));
        Image Printimage = Printicon.getImage();
        Image Printimagepro = Printimage.getScaledInstance(70, 70, 4);
        ImageIcon Printlast = new ImageIcon(Printimagepro);
        this.Printbutton.setHorizontalTextPosition(0);
        this.Printbutton.setVerticalTextPosition(3);
        this.Printbutton.setIcon(Printlast);
        this.Printbutton.setFont(new Font(this.Fontname, 1, 11));
        this.Printbutton.setOpaque(false);
        this.Printbutton.setFocusPainted(false);
        this.Printbutton.setToolTipText("Print the current table.");
        this.Printbutton.setContentAreaFilled(false);
        this.Printbutton.setBorderPainted(false);
        ImageIcon Saicon = new ImageIcon(HomePage.class.getResource("/Sa-icon.png"));
        Image Saimage = Saicon.getImage();
        Image Saimagepro = Saimage.getScaledInstance(60, 60, 4);
        ImageIcon Salast = new ImageIcon(Saimagepro);
        this.Sabutton.setHorizontalTextPosition(0);
        this.Sabutton.setVerticalTextPosition(3);
        this.Sabutton.setIcon(Salast);
        this.Sabutton.setFont(new Font(this.Fontname, 1, 11));
        this.Sabutton.setOpaque(false);
        this.Sabutton.setFocusPainted(false);
        this.Sabutton.setToolTipText("Save the current table to a different location.");
        this.Sabutton.setContentAreaFilled(false);
        this.Sabutton.setBorderPainted(false);
        JSeparator linev = new JSeparator(1);
        linev.setBackground(Color.lightGray);
        this.we.add((Component)this.Studentbutton, "gaptop 10, gapbottom 10, wrap");
        this.we.add((Component)this.Taskbutton, "gapbottom 5, wrap");
        this.we.add((Component)this.Catbutton, "gapbottom 10, wrap");
        this.we.add((Component)this.Printbutton, "gapbottom 10, wrap");
        this.we.add((Component)this.Sabutton, "gapbottom 10, wrap");
        this.we.add((Component)linev, "dock east, grow, gapbottom 7");
        String cls = name.substring(9, 13);
        String yr = name.substring(20, 22);
        System.out.println(cls);
        System.out.println(yr);
        final String opn = String.valueOf(place) + "/" + cls + "-" + yr + ".ods";
        this.tableModel.setRowCount(0);
        Vector<Object> rw = new Vector<Object>();
        boolean cnt = false;
        this.Columnlist.removeItemListener(this.Combaction);
        this.Sortlist.removeItemListener(this.def);
        try {
            SpreadsheetDocument spreadsheetDoc = SpreadsheetDocument.loadDocument((String)opn);
            Table sheet1 = spreadsheetDoc.getSheetByIndex(0);
            int cs = sheet1.getColumnCount();
            int rs = sheet1.getRowCount();
            this.Columnlist.removeAllItems();
            this.Sortlist.removeAllItems();
            this.tableModel.setColumnCount(0);
            Colum.clear();
            this.Columnlist.addItem(" ");
            this.Sortlist.addItem(" ");
            Colum.add(" ");
            int i = 0;
            while (i < rs) {
                String val;
                rw = new Vector();
                int j = 0;
                while (j < cs) {
                    Cell cell = sheet1.getCellByPosition(j, i);
                    val = cell.getStringValue();
                    if (i > 0 && j > 1) {
                        double fg = Double.parseDouble(val) / 1.0;
                        val = Double.toString(fg);
                    }
                    if (i == 0) {
                        this.tableModel.addColumn(val);
                        this.Columnlist.addItem(val);
                        this.Sortlist.addItem(val);
                        Colum.add(val);
                    } else {
                        rw.add(val);
                    }
                    ++j;
                }
                if (i != 0) {
                    rw.add(0);
                    this.tableModel.addRow(rw);
                } else {
                    val = "Total";
                    this.tableModel.addColumn(val);
                    this.Columnlist.addItem(val);
                    this.Sortlist.addItem(val);
                    Colum.add(val);
                }
                ++i;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        this.table = new JTable(){

            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component component = super.prepareRenderer(renderer, row, column);
                int rendererWidth = component.getPreferredSize().width;
                TableColumn tableColumn = this.getColumnModel().getColumn(column);
                tableColumn.setPreferredWidth(Math.max(rendererWidth + this.getIntercellSpacing().width, tableColumn.getPreferredWidth()));
                return component;
            }
        };
        AbstractAction action = new AbstractAction(){

            @Override
            public void actionPerformed(ActionEvent e) {
                TableCellListener tcl = (TableCellListener)e.getSource();
                HomePage.next_action = HomePage.current_state;
                System.out.println("Row   : " + tcl.getRow());
                System.out.println("Column: " + tcl.getColumn());
                System.out.println("Old   : " + tcl.getOldValue());
                System.out.println("New   : " + tcl.getNewValue());
                if (tcl.getColumn() == HomePage.this.tableModel.getColumnCount() - 1) {
                    HomePage.this.tableModel.setValueAt(tcl.getOldValue(), tcl.getRow(), tcl.getColumn());
                    return;
                }
                HomePage.xcol[HomePage.next_action] = tcl.getColumn();
                HomePage.yrow[HomePage.next_action] = tcl.getRow();
                HomePage.oldtxt[HomePage.next_action] = tcl.getOldValue().toString();
                ++HomePage.current_state;
                HomePage.newtxt[++HomePage.next_action] = tcl.getNewValue().toString();
                try {
                    SpreadsheetDocument spreadsheetDoc = SpreadsheetDocument.loadDocument((String)opn);
                    Table sheet1 = spreadsheetDoc.getSheetByIndex(0);
                    Cell cell = sheet1.getCellByPosition(tcl.getColumn(), tcl.getRow() + 1);
                    cell.setDisplayText(tcl.getNewValue().toString());
                    spreadsheetDoc.save(opn);
                    HomePage.this.Updatetable(name, sheet1.getColumnCount());
                }
                catch (Exception v) {
                    v.printStackTrace();
                }
            }
        };
        TableCellListener tcl = new TableCellListener(this.table, action);
        this.table.setAutoResizeMode(0);
        this.table.setModel(this.tableModel);
        this.table.setRowHeight(30);
        this.table.setFont(new Font(this.Fontname, 0, 15));
        this.table.getTableHeader().setFont(new Font(this.Fontname, 1, 15));
        int v = 22;
        int h = 32;
        JScrollPane scroller = new JScrollPane(this.table, v, h);
        scroller.setColumnHeader(new JViewport(){

            @Override
            public Dimension getPreferredSize() {
                Dimension d = super.getPreferredSize();
                d.height = 30;
                return d;
            }
        });
        this.Columnlist.setMinimumSize(new Dimension(100, 25));
        this.Sortlist.setMinimumSize(new Dimension(100, 25));
        this.Searchtext.getDocument().addDocumentListener(new DocumentListener(){

            @Override
            public void changedUpdate(DocumentEvent e) {
                this.warn();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                this.warn();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                this.warn();
            }

            public void warn() {
                if (HomePage.this.Columnlist.getSelectedItem() == null) {
                    return;
                }
                System.out.println("h:" + HomePage.this.Columnlist.getSelectedItem());
                System.out.println("g:" + HomePage.this.tableModel.getColumnCount());
                HomePage.this.Updatetable(HomePage.selected, HomePage.this.tableModel.getColumnCount());
                HomePage.this.Chosencolumn = (String)HomePage.this.Columnlist.getSelectedItem();
                if (HomePage.this.Chosencolumn == " ") {
                    return;
                }
                int colindex = HomePage.this.tableModel.findColumn(HomePage.this.Chosencolumn);
                String stxt = HomePage.this.Searchtext.getText();
                int i = 0;
                while (i < HomePage.this.table.getRowCount()) {
                    String cone = HomePage.this.tableModel.getValueAt(i, colindex).toString();
                    if (!cone.contains(stxt)) {
                        HomePage.this.tableModel.removeRow(i);
                        --i;
                    }
                    ++i;
                }
            }
        });
        JLabel zz = new JLabel("Search for ");
        zz.setFont(new Font(this.Fontname, 1, 15));
        JPanel edits = new JPanel((LayoutManager)new MigLayout());
        edits.add((Component)zz, "split 2");
        this.Searchtext.setMinimumSize(new Dimension(150, 25));
        edits.add(this.Searchtext);
        zz = new JLabel(" in ");
        zz.setFont(new Font(this.Fontname, 1, 15));
        edits.add(zz);
        edits.add((Component)this.Columnlist, "wrap");
        zz = new JLabel("Sort by ");
        zz.setFont(new Font(this.Fontname, 1, 15));
        edits.add((Component)zz, "split 2, gaptop 5");
        edits.add((Component)this.Sortlist, "wrap, gaptop 5");
        this.spa.add((Component)edits, "dock north, gapleft 20, gaptop 10");
        this.spa.add((Component)scroller, "grow, gapleft 20, gapright 20, gaptop 20, gapbottom 20");
        this.Columnlist.addItemListener(this.Combaction);
        this.Sortlist.addItemListener(this.def);
        this.Homepage.setVisible(true);
        this.assign();
        this.Updatetable(name, this.tableModel.getColumnCount());
    }

    public void Printing() {
        this.Printwindow.setSize(330, 130);
        this.Printwindow.setLocationRelativeTo(null);
        this.Printwindow.setDefaultCloseOperation(2);
        this.Printwindow.setLayout((LayoutManager)new MigLayout("", "20[][]20", "[][][grow]"));
        this.Printwindow.setResizable(false);
        this.Printwindow.add(this.Printer);
        this.Printwindow.add((Component)this.Printerslist, "wrap");
        this.Printwindow.add(this.Copies);
        this.Copiestext.setText("");
        this.Copiestext.setMinimumSize(new Dimension(50, this.Copiestext.getMinimumSize().height));
        this.Printwindow.add((Component)this.Copiestext, " wrap");
        this.Printwindow.add((Component)this.Printok, "cell 0 2 2 1, split 2, center");
        this.Printwindow.add(this.Printclose);
    }

    public void Updatetable(String name, int now) {
        String cls = name.substring(9, 13);
        String yr = name.substring(20, 22);
        String opn = String.valueOf(place) + "/" + cls + "-" + yr + ".ods";
        this.Columnlist.removeItemListener(this.Combaction);
        this.Sortlist.removeItemListener(this.def);
        this.tableModel.setRowCount(0);
        Vector<Object> rw = new Vector<Object>();
        int hg = this.tableModel.getColumnCount();
        this.tableModel.setColumnCount(hg - 1);
        this.Columnlist.removeItemAt(hg);
        this.Sortlist.removeItemAt(hg);
        Colum.remove(hg);
        try {
            SpreadsheetDocument spreadsheetDoc = SpreadsheetDocument.loadDocument((String)opn);
            Table sheet1 = spreadsheetDoc.getSheetByIndex(0);
            int cs = sheet1.getColumnCount();
            int rs = sheet1.getRowCount();
            System.out.println(cs);
            System.out.println(now);
            double cur_grade = 0.0;
            double allof = 0.0;
            int i = 0;
            while (i < rs) {
                rw = new Vector();
                cur_grade = 0.0;
                allof = 0.0;
                int j = 0;
                while (j < cs) {
                    Cell cell = sheet1.getCellByPosition(j, i);
                    String val = cell.getStringValue();
                    if (i > 0 && j > 1) {
                        double fg = Double.parseDouble(val) / 1.0;
                        val = Double.toString(fg);
                    }
                    if (i == 0 && now != -1) {
                        if (now < cs && j >= now) {
                            this.tableModel.addColumn(val);
                            this.Columnlist.addItem(val);
                            this.Sortlist.addItem(val);
                            Colum.add(val);
                        }
                    } else {
                        rw.add(val);
                        if (j >= 2) {
                            String ggg = Colum.get(j + 1);
                            System.out.println(ggg);
                            cur_grade = this.oval.get(ggg) * Double.parseDouble(val) / this.maxi.get(ggg);
                            allof += cur_grade;
                        }
                    }
                    ++j;
                }
                if (i != 0) {
                    rw.add(allof *= 100.0);
                    this.tableModel.addRow(rw);
                } else {
                    this.tableModel.addColumn("Total");
                    this.Columnlist.addItem("Total");
                    this.Sortlist.addItem("Total");
                    Colum.add("Total");
                }
                ++i;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        this.Columnlist.addItemListener(this.Combaction);
        this.Sortlist.addItemListener(this.def);
    }

    public void Openscreen() {
        this.Openwindow.setSize(250, 300);
        this.Openwindow.setResizable(false);
        this.Openwindow.setLocationRelativeTo(null);
        this.Openwindow.setDefaultCloseOperation(2);
        this.Openwindow.setLayout((LayoutManager)new MigLayout("", "15[][grow]15", "10[][]15[grow]15[]10"));
        this.Updatelists();
        this.Classlist.removeItemListener(this.Comboaction);
        this.Classlist.removeAllItems();
        int i = 0;
        while (i < Classes.size()) {
            this.Classlist.addItem(Classes.get(i));
            ++i;
        }
        this.Yearlist.removeItemListener(this.Comboaction);
        this.Yearlist.removeAllItems();
        i = 0;
        while (i < Years.size()) {
            this.Yearlist.addItem(Years.get(i));
            ++i;
        }
        JScrollPane scroller = new JScrollPane(this.Chooselist);
        this.Openwindow.add(this.Class);
        this.Openwindow.add((Component)this.Classlist, "wrap");
        this.Openwindow.add(this.Year);
        this.Openwindow.add((Component)this.Yearlist, "wrap");
        this.Openwindow.add((Component)scroller, "wrap, grow, cell 0 2 2 1");
        this.Openwindow.add((Component)this.Openclose, "cell 0 3 2 1,center, split 2");
        this.Openwindow.add(this.Openopen);
    }

    public void St_openscreen() {
        this.Yearlist.removeItemListener(this.Comboaction);
        this.Classlist.removeItemListener(this.Comboaction);
        this.Updatelists();
        this.Classlist.removeAllItems();
        int i = 0;
        while (i < Classes.size()) {
            this.Classlist.addItem(Classes.get(i));
            ++i;
        }
        this.Yearlist.removeAllItems();
        i = 0;
        while (i < Years.size()) {
            this.Yearlist.addItem(Years.get(i));
            ++i;
        }
        this.Yearlist.addItemListener(this.Comboaction);
        this.Classlist.addItemListener(this.Comboaction);
        this.Openwindow.setVisible(true);
    }

    public void Updatelists() {
        File folder = new File(place);
        File[] listOfFiles = folder.listFiles();
        Classes.clear();
        Years.clear();
        Sheets.clear();
        Classes.add("All");
        Years.add("All");
        int i = 0;
        while (i < listOfFiles.length) {
            if (listOfFiles[i].isFile()) {
                this.Filename = listOfFiles[i].getName();
                if (this.Filename.length() == 11) {
                    this.Fileclass = this.Filename.substring(0, 4);
                    this.Fileyear = this.Filename.substring(5, this.Filename.length() - 4);
                    if (!Classes.contains(this.Fileclass)) {
                        Classes.add(this.Fileclass);
                    }
                    if (!Years.contains(this.Fileyear)) {
                        Years.add(this.Fileyear);
                    }
                    if (!Sheets.contains("Class of " + this.Fileclass + ", Year " + this.Fileyear)) {
                        Sheets.addElement("Class of " + this.Fileclass + ", Year " + this.Fileyear);
                    }
                }
            }
            ++i;
        }
    }

    public void Opensheet() {
        if (this.Chooselist.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "No spreadsheet chosen!", "Error", 0);
            return;
        }
        selected = this.Chooselist.getSelectedValue();
        System.out.println(selected);
        DefaultTableModel dm = new DefaultTableModel(50, 50);
        this.Tabl(selected);
        this.Openwindow.dispose();
    }

    public void Createnew() {
        this.Newwindow.setSize(200, 130);
        this.Newwindow.setLocationRelativeTo(null);
        this.Newwindow.setDefaultCloseOperation(2);
        this.Newwindow.setLayout((LayoutManager)new MigLayout("", "20[][grow,fill]20", "[][][grow]"));
        this.Newwindow.setResizable(false);
        this.Newwindow.add(this.Newclass);
        this.Classtext.setText("");
        this.Newwindow.add((Component)this.Classtext, "wrap");
        this.Newwindow.add(this.Newyear);
        this.Yeartext.setText("");
        this.Newwindow.add((Component)this.Yeartext, "wrap");
        this.Newwindow.add((Component)this.Newclose, "cell 0 2 2 1, split 2, center");
        this.Newwindow.add(this.Newok);
    }

    public void St_createnew() {
        this.Classtext.setText("");
        this.Yeartext.setText("");
        this.Newwindow.setVisible(true);
    }

    public void Settings() {
        this.Settingswindow.setSize(265, 200);
        this.Settingswindow.setLocationRelativeTo(null);
        this.Settingswindow.setResizable(false);
        this.Settingswindow.setDefaultCloseOperation(2);
        this.Settingswindow.setLayout((LayoutManager)new MigLayout("", "[grow]", "10[][]"));
        JPanel Passbox = new JPanel();
        Passbox.setLayout((LayoutManager)new MigLayout("", "[][grow]", "[][][]"));
        Passbox.add(new JLabel("Old:"));
        Passbox.add((Component)this.Oldpass, "wrap, grow");
        Passbox.add(new JLabel("New:"));
        Passbox.add((Component)this.Newpass, "wrap, grow");
        Passbox.add(new JLabel("Confirm:"));
        Passbox.add((Component)this.Confirmpass, "wrap, grow");
        Passbox.setBorder(BorderFactory.createTitledBorder("Password"));
        this.Settingswindow.add((Component)Passbox, "wrap, growx");
        this.Settingswindow.add((Component)this.Settclose, "cell 0 2 2 1, split 2, center");
        this.Settingswindow.add(this.Settok);
    }

    public void St_settingswindow() {
        this.Oldpass.setText("");
        this.Newpass.setText("");
        this.Confirmpass.setText("");
        this.Gmail.setText("");
        this.Gpass.setText("");
        this.Settingswindow.setVisible(true);
    }

    public void St_printing() {
        this.Copiestext.setText("");
        PrintService[] printServices = PrintServiceLookup.lookupPrintServices(DocFlavor.INPUT_STREAM.AUTOSENSE, null);
        if (printServices.length > 0) {
            this.Printerslist.removeAllItems();
            int i = 0;
            while (i < printServices.length) {
                this.Printerslist.addItem(printServices[i].getName());
                ++i;
            }
        }
        this.Printerslist.setSelectedIndex(-1);
        this.Printwindow.setVisible(true);
    }

    public void Saving() {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        chooser.setDialogTitle("Choose Directory");
        chooser.setFileSelectionMode(1);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(null) == 0) {
            String pat = chooser.getSelectedFile().getPath();
            String name = this.Homepage.getTitle().substring(16, this.Homepage.getTitle().length());
            String cls = name.substring(9, 13);
            String yr = name.substring(20, 22);
            pat = String.valueOf(pat) + "/" + cls + "-" + yr + ".ods";
            String sat = String.valueOf(place) + "/" + cls + "-" + yr + ".ods";
            Path sourceDirectory = Paths.get(sat, new String[0]);
            Path targetDirectory = Paths.get(pat, new String[0]);
            try {
                Files.copy(sourceDirectory, targetDirectory, new CopyOption[0]);
                JOptionPane.showMessageDialog(null, "Done copying!", "Done", 1);
            }
            catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error copying..,", "Error", 0);
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a directory!", "Error", 0);
        }
    }

    public double calc(String parent) {
        if (parent == "Total") {
            return 1.0;
        }
        return this.mapp.get(parent) * this.calc(this.mapo.get(parent)) / 100.0;
    }

    public void assign() {
        String name = this.Homepage.getTitle().substring(16, this.Homepage.getTitle().length());
        String cls = name.substring(9, 13);
        String yr = name.substring(20, 22);
        String sat = String.valueOf(place) + "/" + cls + "-" + yr + "-tsk.txt";
        File f = new File(sat);
        try {
            FileReader r = new FileReader(f);
            BufferedReader b = new BufferedReader(r);
            String out = "";
            String k = "";
            while ((out = b.readLine()) != null) {
                k = String.valueOf(k) + out;
            }
            b.close();
            this.wo = "";
            this.cn = 0;
            System.out.println(k);
            int i = 0;
            while (i < k.length()) {
                if (k.charAt(i) != ',') {
                    this.wo = String.valueOf(this.wo) + k.charAt(i);
                } else {
                    this.w[this.cn] = this.wo;
                    if (this.cn % 4 == 2) {
                        this.oval.put(this.w[this.cn - 2], this.calc(this.w[this.cn]) * Double.parseDouble(this.w[this.cn - 1]) / 100.0);
                        System.out.println(this.calc(this.w[this.cn]) * Double.parseDouble(this.w[this.cn - 1]) / 100.0);
                    } else if (this.cn % 4 == 3) {
                        this.maxi.put(this.w[this.cn - 3], Double.parseDouble(this.w[this.cn]));
                    }
                    this.wo = "";
                    ++this.cn;
                }
                ++i;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Newsheet() {
        this.Updatelists();
        this.Fileclass = this.Classtext.getText();
        this.Fileyear = this.Yeartext.getText();
        if (Sheets.contains("Class of " + this.Fileclass + ", Year " + this.Fileyear)) {
            JOptionPane.showMessageDialog(null, "Sheet already exists!", "Error", 0);
        } else {
            try {
                this.Filename = String.valueOf(place) + "/" + this.Fileclass + "-" + this.Fileyear;
                SpreadsheetDocument spreadsheetDoc = SpreadsheetDocument.newSpreadsheetDocument();
                spreadsheetDoc.save(String.valueOf(this.Filename) + ".ods");
                Table sheet1 = spreadsheetDoc.getSheetByIndex(0);
                Cell cell = sheet1.getCellByPosition(0, 0);
                cell.setDisplayText("First name");
                cell = sheet1.getCellByPosition(1, 0);
                cell.setDisplayText("Last name");
                spreadsheetDoc.save(String.valueOf(this.Filename) + ".ods");
                File file = new File(String.valueOf(this.Filename) + "-cat.txt");
                file.createNewFile();
                file = new File(String.valueOf(this.Filename) + "-tsk.txt");
                file.createNewFile();
                this.Newwindow.dispose();
            }
            catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    public static String encryptch(char[] ps) {
        String eps = "";
        int i = 0;
        while (i < ps.length) {
            char c = (char)((ps[i] + key.charAt(i)) / 2);
            eps = String.valueOf(eps) + c;
            ++i;
        }
        return eps;
    }

    public String encrypt(String ps) {
        String eps = "";
        int i = 0;
        while (i < ps.length()) {
            char c = (char)((ps.charAt(i) + key.charAt(i)) / 2);
            eps = String.valueOf(eps) + c;
            ++i;
        }
        return eps;
    }

    public String decrypt(String ps) {
        String eps = "";
        int i = 0;
        while (i < ps.length()) {
            char c = (char)(2 * ps.charAt(i) - key.charAt(i));
            eps = String.valueOf(eps) + c;
            ++i;
        }
        return eps;
    }

    public String decryptch(char[] ps) {
        String eps = "";
        int i = 0;
        while (i < ps.length) {
            char c = (char)(2 * ps[i] - key.charAt(i));
            eps = String.valueOf(eps) + c;
            ++i;
        }
        return eps;
    }

    public void Updatesett() {
        this.Oldtext = this.Oldpass.getPassword();
        this.Newtext = this.Newpass.getPassword();
        this.Confirmtext = this.Confirmpass.getPassword();
        File file = new File(String.valueOf(place) + "/cred.txt");
        if (file.exists() && !file.isDirectory()) {
            try {
                Scanner scanner = new Scanner(file);
                String s1 = scanner.nextLine();
                String h = HomePage.encryptch(this.Oldtext);
                if (this.Newtext.length != 0) {
                    if (h.compareTo(s1) == 0) {
                        if (Arrays.equals(this.Newtext, this.Confirmtext)) {
                            s1 = HomePage.encryptch(this.Newtext);
                        } else {
                            JOptionPane.showMessageDialog(null, "The new passwords don't match!", "Error", 0);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "The old password is incorrect!", "Error", 0);
                    }
                }
                scanner.close();
                try {
                    file.createNewFile();
                    FileWriter writer = new FileWriter(file);
                    writer.write(s1);
                    writer.close();
                    this.Settingswindow.dispose();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            try {
                file.createNewFile();
                FileWriter writer = new FileWriter(file);
                String h = HomePage.encryptch(this.Oldtext);
                if (h.compareTo(this.inipass) == 0) {
                    if (Arrays.equals(this.Newtext, this.Confirmtext)) {
                        if (this.Newtext.length != 0) {
                            writer.write(HomePage.encryptch(this.Newtext));
                            writer.close();
                            this.Settingswindow.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Fill all the fields!", "Error", 0);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "The new passwords don't match!", "Error", 0);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "The old password is incorrect!", "Error", 0);
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void St_backup() {
        Object[] options = new String[]{"Cancel", "Start"};
        int response = JOptionPane.showOptionDialog(null, "Backup is about to start. It cannot be cancelled.", "Backup", 1, 3, null, options, options[0]);
        if (response == 1) {
            this.Start_back();
        }
    }

    public void Backup() {
        this.Backwindow.setSize(400, 100);
        this.pbar.setMinimum(0);
        this.pbar.setMaximum(100);
        this.Backwindow.setLocationRelativeTo(null);
        this.Backwindow.setDefaultCloseOperation(0);
        this.Backwindow.setLayout((LayoutManager)new MigLayout("", "15[grow]15", "15[]10[]15[]"));
        this.Backwindow.add((Component)this.stat, "wrap, grow");
        this.Backwindow.add((Component)this.pbar, "wrap, grow");
    }

    public void Addstudent() {
        this.Studentwindow.setSize(400, 300);
        this.Studentwindow.setResizable(false);
        this.Studentwindow.setLocationRelativeTo(null);
        this.Studentwindow.setDefaultCloseOperation(2);
        this.Studentwindow.setLayout((LayoutManager)new MigLayout("", "15[][grow, fill]15", "10[][]15[grow]15[]10"));
        this.Gradeslist.setAutoResizeMode(0);
        this.Gradeslist.setModel(this.Gradesmodel);
        this.Gradeslist.setRowHeight(25);
        this.Gradeslist.setFont(new Font(this.Fontname, 0, 15));
        this.Gradeslist.getTableHeader().setFont(new Font(this.Fontname, 1, 15));
        this.Gradesmodel.addColumn("Assessment");
        this.Gradesmodel.addColumn("Grade");
        int v = 22;
        int h = 31;
        JScrollPane scroller2 = new JScrollPane(this.Gradeslist, v, h);
        scroller2.setColumnHeader(new JViewport(){

            @Override
            public Dimension getPreferredSize() {
                Dimension d = super.getPreferredSize();
                d.height = 20;
                return d;
            }
        });
        this.Fnametext.setText("");
        this.Lnametext.setText("");
        this.Studentwindow.add(this.Fname);
        this.Studentwindow.add((Component)this.Fnametext, "wrap");
        this.Studentwindow.add(this.Lname);
        this.Studentwindow.add((Component)this.Lnametext, "wrap");
        this.Studentwindow.add((Component)scroller2, "wrap, grow, cell 0 2 2 1");
        this.Studentwindow.add((Component)this.Studentclose, "cell 0 3 2 1,center, split 2");
        this.Studentwindow.add(this.Studentadd);
    }

    public void St_addstudent() {
        this.Gradesmodel.setRowCount(0);
        int i = 3;
        while (i < Colum.size() - 1) {
            Vector<String> vv = new Vector<String>();
            vv.add(Colum.get(i));
            vv.add("0");
            this.Gradesmodel.addRow(vv);
            ++i;
        }
        this.Fnametext.setText("");
        this.Lnametext.setText("");
        this.Studentwindow.setVisible(true);
    }

    public void studentadded() {
        this.Updatetable(selected, this.tableModel.getColumnCount());
        String cls = selected.substring(9, 13);
        String yr = selected.substring(20, 22);
        String opn = String.valueOf(place) + "/" + cls + "-" + yr + ".ods";
        try {
            Cell cell;
            SpreadsheetDocument spreadsheetDoc = SpreadsheetDocument.loadDocument((String)opn);
            Table sheet1 = spreadsheetDoc.getSheetByIndex(0);
            int cs = sheet1.getColumnCount();
            int rs = sheet1.getRowCount();
            int i = 0;
            while (i < cs - 2) {
                cell = sheet1.getCellByPosition(i + 2, rs);
                String content = (String)this.Gradesmodel.getValueAt(i, 1);
                cell.setDisplayText(content);
                ++i;
            }
            cell = sheet1.getCellByPosition(0, rs);
            cell.setDisplayText(this.Fnametext.getText());
            cell = sheet1.getCellByPosition(1, rs);
            cell.setDisplayText(this.Lnametext.getText());
            spreadsheetDoc.save(opn);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        this.Studentwindow.dispose();
        this.Updatetable(selected, this.tableModel.getColumnCount());
    }

    public void Addtask() {
        this.Taskwindow.setSize(400, 300);
        this.Taskwindow.setResizable(false);
        this.Taskwindow.setLocationRelativeTo(null);
        this.Taskwindow.setDefaultCloseOperation(2);
        this.Taskwindow.setLayout((LayoutManager)new MigLayout("", "15[][grow,fill][][grow,fill]15", "10[][][]15[grow]15[]10"));
        this.Stslist.setAutoResizeMode(0);
        this.Stslist.setModel(this.Stsmodel);
        this.Stslist.setRowHeight(25);
        this.Stslist.setFont(new Font(this.Fontname, 0, 15));
        this.Stslist.getTableHeader().setFont(new Font(this.Fontname, 1, 15));
        this.Stsmodel.addColumn("First name");
        this.Stsmodel.addColumn("Last name");
        this.Stsmodel.addColumn("Grade");
        int v = 22;
        int h = 30;
        JScrollPane scroller2 = new JScrollPane(this.Stslist, v, h);
        scroller2.setColumnHeader(new JViewport(){

            @Override
            public Dimension getPreferredSize() {
                Dimension d = super.getPreferredSize();
                d.height = 20;
                return d;
            }
        });
        this.Taskwindow.add(this.Tit);
        this.Taskwindow.add((Component)this.Tittext, "wrap, cell 1 0 3 1");
        this.Taskwindow.add(this.Maxmrk);
        this.Taskwindow.add((Component)this.Maxmrktext, "wrap");
        this.Taskwindow.add(this.Rep);
        this.Taskwindow.add(this.Reptext);
        this.Taskwindow.add(this.oof);
        this.Taskwindow.add((Component)this.Catslist1, "wrap");
        this.Taskwindow.add((Component)scroller2, "wrap, grow, cell 0 3 4 1");
        this.Taskwindow.add((Component)this.Taskclose, "cell 0 4 4 1,center, split 2");
        this.Taskwindow.add(this.Taskadd);
    }

    public void Addcat() {
        this.Catwindow.setSize(400, 140);
        this.Catwindow.setResizable(false);
        this.Catwindow.setLocationRelativeTo(null);
        this.Catwindow.setDefaultCloseOperation(2);
        this.Catwindow.setLayout((LayoutManager)new MigLayout("", "15[][grow,fill][][grow,fill]15", "10[][][]10"));
        this.Catwindow.add(this.Tit1);
        this.Catwindow.add((Component)this.Catittext, "wrap, cell 1 0 3 1");
        this.Catwindow.add(this.Rep1);
        this.Catwindow.add(this.Catreptext);
        this.Catwindow.add(this.oof1);
        this.Catwindow.add((Component)this.Catslist2, "wrap");
        this.Catwindow.add((Component)this.Catclose, "cell 0 4 4 1,center, split 2");
        this.Catwindow.add(this.Catadd);
    }

    public void St_addtask() {
        this.Stsmodel.setRowCount(0);
        this.Updatecat();
        int i = 0;
        while (i < this.tableModel.getRowCount()) {
            Vector<String> vv = new Vector<String>();
            String content = (String)this.tableModel.getValueAt(i, 0);
            vv.add(content);
            content = (String)this.tableModel.getValueAt(i, 1);
            vv.add(content);
            vv.add("0");
            this.Stsmodel.addRow(vv);
            ++i;
        }
        this.Tittext.setText("");
        this.Maxmrktext.setText("");
        this.Reptext.setText("");
        this.Taskwindow.setVisible(true);
    }

    public void final_grade() {
        double allof = 0.0;
        System.out.println(this.oval.get(Colum.get(3)));
        int i = 0;
        while (i < this.tableModel.getRowCount()) {
            double cur_grade;
            Vector vv = new Vector();
            int j = 3;
            while (j < Colum.size() - 1) {
                cur_grade = this.oval.get(Colum.get(j)) * Double.parseDouble((String)this.tableModel.getValueAt(i, j - 1)) / this.maxi.get(Colum.get(j));
                allof += cur_grade;
                ++j;
            }
            System.out.println(allof);
            allof = 0.0;
            cur_grade = 0.0;
            ++i;
        }
    }

    public void St_addcat() {
        this.Updatecat();
        this.Catittext.setText("");
        this.Catreptext.setText("");
        this.Catwindow.setVisible(true);
    }

    public void taskadded() {
        String cls = selected.substring(9, 13);
        String yr = selected.substring(20, 22);
        String opn = String.valueOf(place) + "/" + cls + "-" + yr + ".ods";
        int cs = 0;
        try {
            SpreadsheetDocument spreadsheetDoc = SpreadsheetDocument.loadDocument((String)opn);
            Table sheet1 = spreadsheetDoc.getSheetByIndex(0);
            cs = sheet1.getColumnCount();
            int rs = sheet1.getRowCount();
            Cell cell = sheet1.getCellByPosition(cs, 0);
            String content = this.Tittext.getText();
            cell.setDisplayText(content);
            int i = 0;
            while (i < rs - 1) {
                cell = sheet1.getCellByPosition(cs, i + 1);
                content = (String)this.Stsmodel.getValueAt(i, 2);
                cell.setDisplayText(content);
                ++i;
            }
            spreadsheetDoc.save(opn);
            String name = this.Homepage.getTitle().substring(16, this.Homepage.getTitle().length());
            cls = name.substring(9, 13);
            yr = name.substring(20, 22);
            String sat = String.valueOf(place) + "/" + cls + "-" + yr + "-tsk.txt";
            try {
                File file = new File(sat);
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(String.valueOf(this.Tittext.getText()) + "," + this.Reptext.getText() + "," + (String)this.Catslist1.getSelectedItem() + "," + this.Maxmrktext.getText() + ",");
                bw.close();
                this.Updatecat();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        this.Taskwindow.dispose();
        this.assign();
        this.Updatetable(selected, cs);
    }

    public void print() {
        if (this.Printerslist.getSelectedIndex() != -1) {
            PrintService[] printServices = PrintServiceLookup.lookupPrintServices(DocFlavor.INPUT_STREAM.AUTOSENSE, null);
            PrintService service = printServices[this.Printerslist.getSelectedIndex()];
            try {
                System.out.println(this.Homepage.getTitle());
                String name = this.Homepage.getTitle().substring(16, this.Homepage.getTitle().length());
                String cls = name.substring(9, 13);
                String yr = name.substring(20, 22);
                String opn = String.valueOf(place) + "/" + cls + "-" + yr + ".ods";
                FileInputStream in = new FileInputStream(new File(opn));
                HashPrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
                pras.add(new Copies(Integer.parseInt(this.Copiestext.getText())));
                DocFlavor.INPUT_STREAM flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
                SimpleDoc doc = new SimpleDoc(in, flavor, null);
                DocPrintJob job = service.createPrintJob();
                PrintJobWatcher pjw = new PrintJobWatcher(job);
                try {
                    job.print(doc, pras);
                }
                catch (PrintException e2) {
                    e2.printStackTrace();
                }
                pjw.waitForDone();
                try {
                    in.close();
                }
                catch (IOException e1) {
                    e1.printStackTrace();
                }
                ByteArrayInputStream ff = new ByteArrayInputStream("\f".getBytes());
                SimpleDoc docff = new SimpleDoc(ff, flavor, null);
                DocPrintJob jobff = service.createPrintJob();
                pjw = new PrintJobWatcher(jobff);
                try {
                    jobff.print(docff, null);
                }
                catch (PrintException e) {
                    e.printStackTrace();
                }
                pjw.waitForDone();
            }
            catch (FileNotFoundException e3) {
                e3.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No printer chosen.", "Error", 0);
            return;
        }
    }

    public void catadded() {
        String name = this.Homepage.getTitle().substring(16, this.Homepage.getTitle().length());
        String cls = name.substring(9, 13);
        String yr = name.substring(20, 22);
        String sat = String.valueOf(place) + "/" + cls + "-" + yr + "-cat.txt";
        try {
            File file = new File(sat);
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(this.Catittext.getText()) + "," + this.Catreptext.getText() + "," + (String)this.Catslist2.getSelectedItem() + ",");
            bw.close();
            this.Updatecat();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        this.Catwindow.dispose();
    }

    public void Updatecat() {
        this.Catslist1.removeAllItems();
        this.Catslist2.removeAllItems();
        this.Catslist1.addItem("Total");
        this.Catslist2.addItem("Total");
        String name = this.Homepage.getTitle().substring(16, this.Homepage.getTitle().length());
        String cls = name.substring(9, 13);
        String yr = name.substring(20, 22);
        String sat = String.valueOf(place) + "/" + cls + "-" + yr + "-cat.txt";
        File f = new File(sat);
        try {
            FileReader r = new FileReader(f);
            BufferedReader b = new BufferedReader(r);
            String out = "";
            String k = "";
            while ((out = b.readLine()) != null) {
                k = String.valueOf(k) + out;
            }
            b.close();
            this.wo = "";
            this.cn = 0;
            System.out.println(k);
            int i = 0;
            while (i < k.length()) {
                if (k.charAt(i) != ',') {
                    this.wo = String.valueOf(this.wo) + k.charAt(i);
                } else {
                    this.w[this.cn] = this.wo;
                    if (this.cn % 3 == 0) {
                        this.Catslist1.addItem(this.wo);
                        this.Catslist2.addItem(this.wo);
                    } else if (this.cn % 3 == 2) {
                        System.out.println(this.cn);
                        this.mapp.put(this.w[this.cn - 2], Double.parseDouble(this.w[this.cn - 1]));
                        this.mapo.put(this.w[this.cn - 2], this.w[this.cn]);
                    }
                    this.wo = "";
                    ++this.cn;
                }
                ++i;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Start_back() {
        this.Updatelists();
        int size = this.Chooselist.getModel().getSize();
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        chooser.setDialogTitle("Choose Directory");
        chooser.setFileSelectionMode(1);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(null) == 0) {
            String pat = chooser.getSelectedFile().getPath();
            String k = String.valueOf(pat) + "/Grade_Manager_Backup";
            new File(k).mkdir();
            this.Backwindow.setVisible(true);
            this.pbar.setMaximum(size);
            int i = 0;
            while (i < size) {
                String name = this.Chooselist.getModel().getElementAt(i);
                String cls = name.substring(9, 13);
                String yr = name.substring(20, 22);
                pat = String.valueOf(k) + "/" + cls + "-" + yr + ".ods";
                String sat = String.valueOf(place) + "/" + cls + "-" + yr + ".ods";
                Path sourceDirectory = Paths.get(sat, new String[0]);
                Path targetDirectory = Paths.get(pat, new String[0]);
                try {
                    Files.copy(sourceDirectory, targetDirectory, new CopyOption[0]);
                }
                catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error copying..,", "Error", 0);
                    e.printStackTrace();
                    break;
                }
                this.pbar.setValue(i + 1);
                ++i;
            }
            JOptionPane.showMessageDialog(null, "Backup Done!", "Done", 1);
            this.Backwindow.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Select a directory!", "Error", 0);
        }
    }

    public void Undo() {
        if (current_state != 0) {
            --current_state;
            String cls = selected.substring(9, 13);
            String yr = selected.substring(20, 22);
            String opn = String.valueOf(place) + "/" + cls + "-" + yr + ".ods";
            try {
                SpreadsheetDocument spreadsheetDoc = SpreadsheetDocument.loadDocument((String)opn);
                Table sheet1 = spreadsheetDoc.getSheetByIndex(0);
                Cell cell = sheet1.getCellByPosition(xcol[current_state], yrow[current_state] + 1);
                cell.setDisplayText(oldtxt[current_state]);
                spreadsheetDoc.save(opn);
                this.Updatetable(selected, sheet1.getColumnCount());
            }
            catch (Exception v) {
                v.printStackTrace();
            }
        }
    }

    public void Redo() {
        if (current_state < next_action) {
            ++current_state;
            String cls = selected.substring(9, 13);
            String yr = selected.substring(20, 22);
            String opn = String.valueOf(place) + "/" + cls + "-" + yr + ".ods";
            try {
                SpreadsheetDocument spreadsheetDoc = SpreadsheetDocument.loadDocument((String)opn);
                Table sheet1 = spreadsheetDoc.getSheetByIndex(0);
                Cell cell = sheet1.getCellByPosition(xcol[current_state - 1], yrow[current_state - 1] + 1);
                cell.setDisplayText(newtxt[current_state]);
                spreadsheetDoc.save(opn);
                this.Updatetable(selected, sheet1.getColumnCount());
            }
            catch (Exception v) {
                v.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.print(System.getProperty("user.home"));
        String OS = System.getProperty("os.name").toLowerCase();
        System.out.println(OS);
        place = OS.indexOf("linux") >= 0 ? String.valueOf(System.getProperty("user.home")) + "/.Grade_Manager_data" : String.valueOf(System.getProperty("user.home")) + "/Grade_Manager_data";
        new File(place).mkdir();
        File file = new File(String.valueOf(place) + "/cred.txt");
        String alms = "Enter password:";
        int i = 0;
        while (i < 4) {
            if (i == 3) {
                System.exit(0);
            }
            if (i > 0) {
                alms = "Wrong password, try again:";
            }
            JPanel panel = new JPanel();
            JLabel label = new JLabel(alms);
            JPasswordField pass = new JPasswordField(10);
            panel.add(label);
            panel.add(pass);
            Object[] options = new String[]{"OK", "Cancel"};
            int option = JOptionPane.showOptionDialog(null, panel, "Grade Manager", 1, -1, null, options, options[0]);
            if (option == 0) {
                char[] test1 = pass.getPassword();
                if (file.exists() && !file.isDirectory()) {
                    try {
                        Scanner scanner = new Scanner(file);
                        String s1 = scanner.nextLine();
                        String h = HomePage.encryptch(test1);
                        if (h.compareTo(s1) == 0) break;
                        scanner.close();
                    }
                    catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                System.exit(0);
            }
            ++i;
        }
        HomePage Firstscreen = new HomePage();
    }

}

