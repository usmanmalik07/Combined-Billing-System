//<<<<<<<<<<<<<------------------------------IMPORTING MODULES------------------------->>>>>>>>>
import java.util.Scanner;
import java.io.*;
import java.security.SecureRandom;

// <<<<<<<<<<---------------------------CLASS----------------------------------->>>>>>
public class CBS {
    static Scanner sc = new Scanner(System.in);
    static SecureRandom random =  new SecureRandom();
    static Customer_Record[][][][][] rec = new Customer_Record[11][5][11][21][4];
    static int[][] halfYear= new int[6][6];
    static int[][] year= new int[12][5];

    
    


    public static void bill_generation() throws  IOException {

        PrintWriter pwj = new PrintWriter(new BufferedWriter(new FileWriter("January.txt")));
        PrintWriter pwf = new PrintWriter(new BufferedWriter(new FileWriter("February.txt")));
        PrintWriter pwm = new PrintWriter(new BufferedWriter(new FileWriter("March.txt")));
        PrintWriter pwApril = new PrintWriter(new BufferedWriter(new FileWriter("April.txt")));
        PrintWriter pwMay = new PrintWriter(new BufferedWriter(new FileWriter("May.txt")));
        PrintWriter pwJune = new PrintWriter(new BufferedWriter(new FileWriter("June.txt")));
        PrintWriter pwJuly = new PrintWriter(new BufferedWriter(new FileWriter("July.txt")));
        PrintWriter pwAug = new PrintWriter(new BufferedWriter(new FileWriter("August.txt")));
        PrintWriter pwSep = new PrintWriter(new BufferedWriter(new FileWriter("September.txt")));
        PrintWriter pwOct = new PrintWriter(new BufferedWriter(new FileWriter("October.txt")));
        PrintWriter pwNov = new PrintWriter(new BufferedWriter(new FileWriter("November.txt")));
        PrintWriter pwDec = new PrintWriter(new BufferedWriter(new FileWriter("December.txt")));

        Customer_Record[][][][][] rec = new Customer_Record[11][5][11][21][4];
        int p=1001;

        String[] names={"Usman","Hozefa","Hammad","Ahmed","Iqbal","Abbasi","Rayyan","Asghar","Muzammil","Khalil","Nuzaif","Rehman","Zainab","Javeria","Aleena","Shafqat","Amjad","Ali","Yousaf","Khattak","Omer","Zohaib","Shahbaz","Nawaz","Imran","Zahid","Bisma","Usman","Hammad","Saad","Azam","Salahuddin","Nauman","Tayyab","Awais","Rizwan","Tuafeeq"};
        for (int sector =1; sector <= 10; sector++){
            for(int subsector = 1; subsector <= 4; subsector++){
                for( int street = 1; street <=10 ;street++){
                    for(int house = 1; house <=20 ; house++){
                        for(int portion = 1; portion<= 3; portion++){

                            int i=random.nextInt(names.length);
                            int eunits,gm3,wL,localM,interM,iGB;

                            //----------------------january---------------------------------------
                            
                            eunits=50+random.nextInt(701-50);gm3=20+random.nextInt(501-20);wL=500+random.nextInt(3001-500);
                            localM=2+random.nextInt(501-20);interM=random.nextInt(201);iGB=random.nextInt(16);

                            rec[sector][subsector][street][house][portion] = new Customer_Record();
                            rec[sector][subsector][street][house][portion].customer_id =  sector + "" + subsector + "" + street + ""+ house + ""+ portion;

                            //electricity
                            rec[sector][subsector][street][house][portion].bill[0] = electricityCal(eunits);
                            //gas
                            rec[sector][subsector][street][house][portion].bill[1]=gasCal(gm3);
                            //water
                            rec[sector][subsector][street][house][portion].bill[2]=waterCal(wL);
                            //phone
                            rec[sector][subsector][street][house][portion].bill[3]=phoneCal(localM, interM);
                            //internet
                            rec[sector][subsector][street][house][portion].bill[4]=internetCal(iGB);

                            pwj.println(p+" "+names[i]+" "+rec[sector][subsector][street][house][portion].bill[0]+" "+rec[sector][subsector][street][house][portion].bill[1]+" "+rec[sector][subsector][street][house][portion].bill[2]+" "+rec[sector][subsector][street][house][portion].bill[3]+" "+rec[sector][subsector][street][house][portion].bill[4]);
                            //half yearly report
                            halfYear[0][0]+=electricityCal(eunits);halfYear[0][1]+=gasCal(gm3);halfYear[0][2]+=waterCal(wL);halfYear[0][3]+=phoneCal(localM, interM);halfYear[0][4]+=internetCal(iGB);
                            //Full year 
                            year[0][0]+=electricityCal(eunits);year[0][1]+=gasCal(gm3);year[0][2]+=waterCal(wL);year[0][3]+=phoneCal(localM, interM);year[0][4]+=internetCal(iGB);  
                            //-----------------------------Febuary---------------------------------
                            
                            eunits=50+random.nextInt(701-50);gm3=20+random.nextInt(501-20);wL=500+random.nextInt(3001-500);
                            localM=2+random.nextInt(501-20);interM=random.nextInt(201);iGB=random.nextInt(16);

                            rec[sector][subsector][street][house][portion] = new Customer_Record();
                            rec[sector][subsector][street][house][portion].customer_id =  sector + "" + subsector + "" + street + ""+ house + ""+ portion;

                            //electricity
                            rec[sector][subsector][street][house][portion].bill[0] = electricityCal(eunits);
                            //gas
                            rec[sector][subsector][street][house][portion].bill[1]=gasCal(gm3);
                            //water
                            rec[sector][subsector][street][house][portion].bill[2]=waterCal(wL);
                            //phone
                            rec[sector][subsector][street][house][portion].bill[3]=phoneCal(localM, interM);
                            //internet
                            rec[sector][subsector][street][house][portion].bill[4]=internetCal(iGB);

                            pwf.println(p+" "+names[i]+" "+rec[sector][subsector][street][house][portion].bill[0]+" "+rec[sector][subsector][street][house][portion].bill[1]+" "+rec[sector][subsector][street][house][portion].bill[2]+" "+rec[sector][subsector][street][house][portion].bill[3]+" "+rec[sector][subsector][street][house][portion].bill[4]);
                            //half yearly report
                            halfYear[1][0]+=electricityCal(eunits);halfYear[1][1]+=gasCal(gm3);halfYear[1][2]+=waterCal(wL);halfYear[1][3]+=phoneCal(localM, interM);halfYear[1][4]+=internetCal(iGB);
                            //Full year 
                            year[1][0]+=electricityCal(eunits);year[1][1]+=gasCal(gm3);year[1][2]+=waterCal(wL);year[1][3]+=phoneCal(localM, interM);year[1][4]+=internetCal(iGB);
                            //-----------------------------March---------------------------------
                            eunits=50+random.nextInt(701-50);gm3=20+random.nextInt(501-20);wL=500+random.nextInt(3001-500);
                            localM=2+random.nextInt(501-20);interM=random.nextInt(201);iGB=random.nextInt(16);

                            rec[sector][subsector][street][house][portion] = new Customer_Record();
                            rec[sector][subsector][street][house][portion].customer_id =  sector + "" + subsector + "" + street + ""+ house + ""+ portion;

                            // ELECTRICITY BILL CALCULATION
                            rec[sector][subsector][street][house][portion].bill[0] = electricityCal(eunits);
                            //gas
                            rec[sector][subsector][street][house][portion].bill[1]=gasCal(gm3);
                            //water
                            rec[sector][subsector][street][house][portion].bill[2]=waterCal(wL);
                            //phone
                            rec[sector][subsector][street][house][portion].bill[3]=phoneCal(localM, interM);
                            //internet
                            rec[sector][subsector][street][house][portion].bill[4]=internetCal(iGB);

                            pwm.println(p+" "+names[i]+" "+rec[sector][subsector][street][house][portion].bill[0]+" "+rec[sector][subsector][street][house][portion].bill[1]+" "+rec[sector][subsector][street][house][portion].bill[2]+" "+rec[sector][subsector][street][house][portion].bill[3]+" "+rec[sector][subsector][street][house][portion].bill[4]);
                             //half yearly report
                             halfYear[2][0]+=electricityCal(eunits);halfYear[2][1]+=gasCal(gm3);halfYear[2][2]+=waterCal(wL);halfYear[2][3]+=phoneCal(localM, interM);halfYear[2][4]+=internetCal(iGB);
                             //Full year 
                             year[2][0]+=electricityCal(eunits);year[2][1]+=gasCal(gm3);year[2][2]+=waterCal(wL);year[2][3]+=phoneCal(localM, interM);year[2][4]+=internetCal(iGB);

                            //------------------------April-------------------------------------
                            eunits=50+random.nextInt(701-50);gm3=20+random.nextInt(501-20);wL=500+random.nextInt(3001-500);
                            localM=2+random.nextInt(501-20);interM=random.nextInt(201);iGB=random.nextInt(16);

                            rec[sector][subsector][street][house][portion] = new Customer_Record();
                            rec[sector][subsector][street][house][portion].customer_id =  sector + "" + subsector + "" + street + ""+ house + ""+ portion;

                            // ELECTRICITY BILL CALCULATION
                            rec[sector][subsector][street][house][portion].bill[0] = electricityCal(eunits);
                            //gas
                            rec[sector][subsector][street][house][portion].bill[1]=gasCal(gm3);
                            //water
                            rec[sector][subsector][street][house][portion].bill[2]=waterCal(wL);
                            //phone
                            rec[sector][subsector][street][house][portion].bill[3]=phoneCal(localM, interM);
                            //internet
                            rec[sector][subsector][street][house][portion].bill[4]=internetCal(iGB);


                            pwApril.println(p+" "+names[i]+" "+rec[sector][subsector][street][house][portion].bill[0]+" "+rec[sector][subsector][street][house][portion].bill[1]+" "+rec[sector][subsector][street][house][portion].bill[2]+" "+rec[sector][subsector][street][house][portion].bill[3]+" "+rec[sector][subsector][street][house][portion].bill[4]);
                             //half yearly report
                            halfYear[3][0]+=electricityCal(eunits);halfYear[3][1]+=gasCal(gm3);halfYear[3][2]+=waterCal(wL);halfYear[3][3]+=phoneCal(localM, interM);halfYear[3][4]+=internetCal(iGB);
                             //Full year 
                            year[3][0]+=electricityCal(eunits);year[3][1]+=gasCal(gm3);year[3][2]+=waterCal(wL);year[3][3]+=phoneCal(localM, interM);year[3][4]+=internetCal(iGB);
                            //------------------------------May-------------------------------
                            eunits=50+random.nextInt(701-50);gm3=20+random.nextInt(501-20);wL=500+random.nextInt(3001-500);
                            localM=2+random.nextInt(501-20);interM=random.nextInt(201);iGB=random.nextInt(16);


                            rec[sector][subsector][street][house][portion] = new Customer_Record();
                            rec[sector][subsector][street][house][portion].customer_id =  sector + "" + subsector + "" + street + ""+ house + ""+ portion;

                            // ELECTRICITY BILL CALCULATION
                            rec[sector][subsector][street][house][portion].bill[0] = electricityCal(eunits);
                            //gas
                            rec[sector][subsector][street][house][portion].bill[1]=gasCal(gm3);
                            //water
                            rec[sector][subsector][street][house][portion].bill[2]=waterCal(wL);
                            //phone
                            rec[sector][subsector][street][house][portion].bill[3]=phoneCal(localM, interM);
                            //internet
                            rec[sector][subsector][street][house][portion].bill[4]=internetCal(iGB);

                            pwMay.println(p+" "+names[i]+" "+rec[sector][subsector][street][house][portion].bill[0]+" "+rec[sector][subsector][street][house][portion].bill[1]+" "+rec[sector][subsector][street][house][portion].bill[2]+" "+rec[sector][subsector][street][house][portion].bill[3]+" "+rec[sector][subsector][street][house][portion].bill[4]);
                            //half yearly report
                            halfYear[4][0]+=electricityCal(eunits);halfYear[4][1]+=gasCal(gm3);halfYear[4][2]+=waterCal(wL);halfYear[4][3]+=phoneCal(localM, interM);halfYear[4][4]+=internetCal(iGB);
                            //Full year 
                            year[4][0]+=electricityCal(eunits);year[4][1]+=gasCal(gm3);year[4][2]+=waterCal(wL);year[4][3]+=phoneCal(localM, interM);year[4][4]+=internetCal(iGB);
                            //----------------------------June-----------------------------------
                            eunits=50+random.nextInt(701-50);gm3=20+random.nextInt(501-20);wL=500+random.nextInt(3001-500);
                            localM=2+random.nextInt(501-20);interM=random.nextInt(201);iGB=random.nextInt(16);


                            rec[sector][subsector][street][house][portion] = new Customer_Record();
                            rec[sector][subsector][street][house][portion].customer_id =  sector + "" + subsector + "" + street + ""+ house + ""+ portion;


                            // ELECTRICITY BILL CALCULATION
                            rec[sector][subsector][street][house][portion].bill[0] = electricityCal(eunits);
                            //gas
                            rec[sector][subsector][street][house][portion].bill[1]=gasCal(gm3);
                            //water
                            rec[sector][subsector][street][house][portion].bill[2]=waterCal(wL);
                            //phone
                            rec[sector][subsector][street][house][portion].bill[3]=phoneCal(localM, interM);
                            //internet
                            rec[sector][subsector][street][house][portion].bill[4]=internetCal(iGB);


                            pwJune.println(p+" "+names[i]+" "+rec[sector][subsector][street][house][portion].bill[0]+" "+rec[sector][subsector][street][house][portion].bill[1]+" "+rec[sector][subsector][street][house][portion].bill[2]+" "+rec[sector][subsector][street][house][portion].bill[3]+" "+rec[sector][subsector][street][house][portion].bill[4]);
                            //half yearly report
                            halfYear[5][0]+=electricityCal(eunits);halfYear[5][1]+=gasCal(gm3);halfYear[5][2]+=waterCal(wL);halfYear[5][3]+=phoneCal(localM, interM);halfYear[5][4]+=internetCal(iGB);
                            //Full year 
                            year[5][0]+=electricityCal(eunits);year[5][1]+=gasCal(gm3);year[5][2]+=waterCal(wL);year[5][3]+=phoneCal(localM, interM);year[5][4]+=internetCal(iGB);

                            //----------------------------July----------------------------------
                            eunits=50+random.nextInt(701-50);gm3=20+random.nextInt(501-20);wL=500+random.nextInt(3001-500);
                            localM=2+random.nextInt(501-20);interM=random.nextInt(201);iGB=random.nextInt(16);

                            rec[sector][subsector][street][house][portion] = new Customer_Record();
                            rec[sector][subsector][street][house][portion].customer_id =  sector + "" + subsector + "" + street + ""+ house + ""+ portion;

                            // ELECTRICITY BILL CALCULATION
                            rec[sector][subsector][street][house][portion].bill[0] = electricityCal(eunits);
                            //gas
                            rec[sector][subsector][street][house][portion].bill[1]=gasCal(gm3);
                            //water
                            rec[sector][subsector][street][house][portion].bill[2]=waterCal(wL);
                            //phone
                            rec[sector][subsector][street][house][portion].bill[3]=phoneCal(localM, interM);
                            //internet
                            rec[sector][subsector][street][house][portion].bill[4]=internetCal(iGB);

                            pwJuly.println(p+" "+names[i]+" "+rec[sector][subsector][street][house][portion].bill[0]+" "+rec[sector][subsector][street][house][portion].bill[1]+" "+rec[sector][subsector][street][house][portion].bill[2]+" "+rec[sector][subsector][street][house][portion].bill[3]+" "+rec[sector][subsector][street][house][portion].bill[4]);
                             //Full year 
                            year[6][0]+=electricityCal(eunits);year[6][1]+=gasCal(gm3);year[6][2]+=waterCal(wL);year[6][3]+=phoneCal(localM, interM);year[6][4]+=internetCal(iGB);
                            //------------------------------August-------------------------------
                            eunits=50+random.nextInt(701-50);gm3=20+random.nextInt(501-20);wL=500+random.nextInt(3001-500);
                            localM=2+random.nextInt(501-20);interM=random.nextInt(201);iGB=random.nextInt(16);


                            rec[sector][subsector][street][house][portion] = new Customer_Record();
                            rec[sector][subsector][street][house][portion].customer_id =  sector + "" + subsector + "" + street + ""+ house + ""+ portion;
                            
                            // ELECTRICITY BILL CALCULATION
                            rec[sector][subsector][street][house][portion].bill[0] = electricityCal(eunits);
                            //gas
                            rec[sector][subsector][street][house][portion].bill[1]=gasCal(gm3);
                            //water
                            rec[sector][subsector][street][house][portion].bill[2]=waterCal(wL);
                            //phone
                            rec[sector][subsector][street][house][portion].bill[3]=phoneCal(localM, interM);
                            //internet
                            rec[sector][subsector][street][house][portion].bill[4]=internetCal(iGB);

                            pwAug.println(p+" "+names[i]+" "+rec[sector][subsector][street][house][portion].bill[0]+" "+rec[sector][subsector][street][house][portion].bill[1]+" "+rec[sector][subsector][street][house][portion].bill[2]+" "+rec[sector][subsector][street][house][portion].bill[3]+" "+rec[sector][subsector][street][house][portion].bill[4]);
                            //Full year 
                            year[7][0]+=electricityCal(eunits);year[7][1]+=gasCal(gm3);year[7][2]+=waterCal(wL);year[7][3]+=phoneCal(localM, interM);year[7][4]+=internetCal(iGB);
                            //----------------------------September-----------------------------------
                            eunits=50+random.nextInt(701-50);gm3=20+random.nextInt(501-20);wL=500+random.nextInt(3001-500);
                            localM=2+random.nextInt(501-20);interM=random.nextInt(201);iGB=random.nextInt(16);
                            
                            rec[sector][subsector][street][house][portion] = new Customer_Record();
                            rec[sector][subsector][street][house][portion].customer_id =  sector + "" + subsector + "" + street + ""+ house + ""+ portion;
                        
                            // ELECTRICITY BILL CALCULATION
                            rec[sector][subsector][street][house][portion].bill[0] = electricityCal(eunits);
                            //gas
                            rec[sector][subsector][street][house][portion].bill[1]=gasCal(gm3);
                            //water
                            rec[sector][subsector][street][house][portion].bill[2]=waterCal(wL);
                            //phone
                            rec[sector][subsector][street][house][portion].bill[3]=phoneCal(localM, interM);
                            //internet
                            rec[sector][subsector][street][house][portion].bill[4]=internetCal(iGB);

                            pwSep.println(p+" "+names[i]+" "+rec[sector][subsector][street][house][portion].bill[0]+" "+rec[sector][subsector][street][house][portion].bill[1]+" "+rec[sector][subsector][street][house][portion].bill[2]+" "+rec[sector][subsector][street][house][portion].bill[3]+" "+rec[sector][subsector][street][house][portion].bill[4]);
                            //Full year 
                            year[8][0]+=electricityCal(eunits);year[8][1]+=gasCal(gm3);year[8][2]+=waterCal(wL);year[8][3]+=phoneCal(localM, interM);year[8][4]+=internetCal(iGB);
                            //----------------------------October----------------------------------
                            eunits=50+random.nextInt(701-50);gm3=20+random.nextInt(501-20);wL=500+random.nextInt(3001-500);
                            localM=2+random.nextInt(501-20);interM=random.nextInt(201);iGB=random.nextInt(16);

                            rec[sector][subsector][street][house][portion] = new Customer_Record();
                            rec[sector][subsector][street][house][portion].customer_id =  sector + "" + subsector + "" + street + ""+ house + ""+ portion;
                           
                            // ELECTRICITY BILL CALCULATION
                            rec[sector][subsector][street][house][portion].bill[0] = electricityCal(eunits);
                            //gas
                            rec[sector][subsector][street][house][portion].bill[1]=gasCal(gm3);
                            //water
                            rec[sector][subsector][street][house][portion].bill[2]=waterCal(wL);
                            //phone
                            rec[sector][subsector][street][house][portion].bill[3]=phoneCal(localM, interM);
                            //internet
                            rec[sector][subsector][street][house][portion].bill[4]=internetCal(iGB);

                            pwOct.println(p+" "+names[i]+" "+rec[sector][subsector][street][house][portion].bill[0]+" "+rec[sector][subsector][street][house][portion].bill[1]+" "+rec[sector][subsector][street][house][portion].bill[2]+" "+rec[sector][subsector][street][house][portion].bill[3]+" "+rec[sector][subsector][street][house][portion].bill[4]);
                            //Full year 
                            year[9][0]+=electricityCal(eunits);year[9][1]+=gasCal(gm3);year[9][2]+=waterCal(wL);year[9][3]+=phoneCal(localM, interM);year[9][4]+=internetCal(iGB);

                            //------------------------------November-------------------------------
                            eunits=50+random.nextInt(701-50);gm3=20+random.nextInt(501-20);wL=500+random.nextInt(3001-500);
                            localM=2+random.nextInt(501-20);interM=random.nextInt(201);iGB=random.nextInt(16);
                            rec[sector][subsector][street][house][portion] = new Customer_Record();
                            rec[sector][subsector][street][house][portion].customer_id =  sector + "" + subsector + "" + street + ""+ house + ""+ portion;

                            // ELECTRICITY BILL CALCULATION
                            rec[sector][subsector][street][house][portion].bill[0] = electricityCal(eunits);
                            //gas
                            rec[sector][subsector][street][house][portion].bill[1]=gasCal(gm3);
                            //water
                            rec[sector][subsector][street][house][portion].bill[2]=waterCal(wL);
                            //phone
                            rec[sector][subsector][street][house][portion].bill[3]=phoneCal(localM, interM);
                            //internet
                            rec[sector][subsector][street][house][portion].bill[4]=internetCal(iGB);
                            pwNov.println(p+" "+names[i]+" "+rec[sector][subsector][street][house][portion].bill[0]+" "+rec[sector][subsector][street][house][portion].bill[1]+" "+rec[sector][subsector][street][house][portion].bill[2]+" "+rec[sector][subsector][street][house][portion].bill[3]+" "+rec[sector][subsector][street][house][portion].bill[4]);

                            //Full year 
                            year[10][0]+=electricityCal(eunits);year[10][1]+=gasCal(gm3);year[10][2]+=waterCal(wL);year[10][3]+=phoneCal(localM, interM);year[10][4]+=internetCal(iGB);

                            //----------------------------December-----------------------------------
                            eunits=50+random.nextInt(701-50);gm3=20+random.nextInt(501-20);wL=500+random.nextInt(3001-500);
                            localM=2+random.nextInt(501-20);interM=random.nextInt(201);iGB=random.nextInt(16);
                            //customer  
                            rec[sector][subsector][street][house][portion] = new Customer_Record();
                            rec[sector][subsector][street][house][portion].customer_id =  sector + "" + subsector + "" + street + ""+ house + ""+ portion;
                            //electricity
                            rec[sector][subsector][street][house][portion].bill[0] = electricityCal(eunits);
                            //gas
                            rec[sector][subsector][street][house][portion].bill[1]=gasCal(gm3);
                            //water
                            rec[sector][subsector][street][house][portion].bill[2]=waterCal(wL);
                            //phone
                            rec[sector][subsector][street][house][portion].bill[3]=phoneCal(localM, interM);
                            //internet
                            rec[sector][subsector][street][house][portion].bill[4]=internetCal(iGB);
                            pwDec.println(p+" "+names[i]+" "+rec[sector][subsector][street][house][portion].bill[0]+" "+rec[sector][subsector][street][house][portion].bill[1]+" "+rec[sector][subsector][street][house][portion].bill[2]+" "+rec[sector][subsector][street][house][portion].bill[3]+" "+rec[sector][subsector][street][house][portion].bill[4]);
                            
                            //Full year 
                            year[11][0]+=electricityCal(eunits);year[11][1]+=gasCal(gm3);year[11][2]+=waterCal(wL);year[11][3]+=phoneCal(localM, interM);year[11][4]+=internetCal(iGB);
                            p++;
                        }//portion-end
                    }//house-end 
                }//street-end 
            }//subsector-end 
        }//sector-end
        System.out.println("\nRecords added successfully !\n\n");
        pwj.close();pwf.close();pwm.close();pwApril.close();pwMay.close();pwJune.close();pwJuly.close();pwAug.close();pwSep.close();pwOct.close();pwNov.close();pwDec.close();
        showmenu();
        //showMenu();
    }//bill_generation end brace
    public static class Customer_Record {
        String customer_id;String name;
        float[] bill = new float[5];
        int[] current_reading = new int[6];int[] previous_reading = new int[4];int[] new_month_reading = new int[2];


    }
        //<<<<<<<--------------------METHODS for Bill Calculations-------------->>>>>>
    //Electricity Calculation
    public static int electricityCal(int eUnits){
        int eBill=0;
        int above=0;
        if(eUnits>=0 && eUnits<=99){
            eBill= 10 * eUnits;
        }else if(eUnits>=100 && eUnits<=199){
            above=eUnits-100;
            eBill=1000+(above*15);
        }else if(eUnits>=200 && eUnits<=300){
            above=eUnits-200;
            eBill=3000+(above*18);
        }else if(eUnits>300){
            eBill= 25 * eUnits;
        }
        return eBill;
    }
    //Gas Calculation
    public static int gasCal(int gm3){
        int gasBill=0;
        if(gm3>0){ 
            double hm3=(double)gm3/100;
            int gcv=990;        //declared as not understandable in website the range of gcv
            double mmtbu= hm3*(gcv/281.7385);       
            if(hm3<=0.5)gasBill=(int)Math.round(121*mmtbu);
            else if(hm3<=1){
                mmtbu= (hm3-0.5)*(gcv/281.7385);
                gasBill=(int)Math.round(300*mmtbu+ 121*(0.5)*(gcv/281.7385));}
            else if(hm3<=2){
                mmtbu= (hm3-1)*(gcv/281.7385);
                gasBill=(int)Math.round(553*mmtbu+300*(1)*(gcv/281.7385));}
            else if(hm3<=3){
                mmtbu= (hm3-2)*(gcv/281.7385);
                gasBill=(int)Math.round(738*mmtbu+553*(2)*(gcv/281.7385));}
            else if(hm3<=4){
                mmtbu= (hm3-3)*(gcv/281.7385);
                gasBill=(int)Math.round(1107*mmtbu+738*(3)*(gcv/281.7385));}
            else if(hm3>4){
                mmtbu= (hm3-4)*(gcv/281.7385);
                gasBill=(int)Math.round(1460*mmtbu+1107*(4)*(gcv/281.7385));}
        }
        gasBill+=20+226;      //adding rent of meter and 17%gst
        return gasBill;
    }
    //Water Calculation
    public static int waterCal(int waterLiters){
        int waterBill=0;
        if(waterLiters>=0 && waterLiters<=1000){
            waterBill=400;
        }else if(waterLiters>=1001 && waterLiters<=2000){
            waterBill=1000;
        }else if(waterLiters>2000){
            int above=waterLiters-2000;
            waterBill=(int)Math.round(1000+above*1.5);
        }
        return waterBill;
    }
    //Phone Calculation
    public static int phoneCal(int localM,int interM){
        int phoneBill=0;
        if((localM+interM)>0){
            phoneBill=5*localM+7*interM;
        }
        return phoneBill;
    }
    //Internet Calculation
    public static int internetCal(int internetGB){
        int internetBill=0;
        if(internetGB>0){
            internetBill=internetGB*10;
        }
        return internetBill;
    }
    public static void findByID(int custID) throws IOException{
        try{
            
            BufferedReader readJan = new BufferedReader(new FileReader("January.txt"));
            BufferedReader readFeb = new BufferedReader(new FileReader("February.txt"));
            BufferedReader readMar = new BufferedReader(new FileReader("March.txt"));
            BufferedReader readApr = new BufferedReader(new FileReader("April.txt"));
            BufferedReader readMay = new BufferedReader(new FileReader("May.txt"));
            BufferedReader readJun = new BufferedReader(new FileReader("June.txt"));
            BufferedReader readJul = new BufferedReader(new FileReader("July.txt"));
            BufferedReader readAug = new BufferedReader(new FileReader("August.txt"));
            BufferedReader readSep = new BufferedReader(new FileReader("September.txt"));
            BufferedReader readOct = new BufferedReader(new FileReader("October.txt"));
            BufferedReader readNov = new BufferedReader(new FileReader("November.txt"));
            BufferedReader readDec = new BufferedReader(new FileReader("December.txt"));

            
            String str;
            String[][] readings=new String[12][15];
            //char block='A';
            //int[] address={1,1,1,0};
            //int times=0;
            
            while ((str = readJan.readLine()) != null) {
                String strb= readFeb.readLine();
                String strc= readMar.readLine();
                String strd= readApr.readLine();
                String stre= readMay.readLine();
                String strf= readJun.readLine();
                String strg= readJul.readLine();
                String strh= readAug.readLine();
                String stri= readSep.readLine();
                String strj= readOct.readLine();
                String strk= readNov.readLine();
                String strl= readDec.readLine();
                
                for (String[] reading : readings) {     //clearing the array to default
                    for (int j = 0; j < reading.length; j++) {
                        reading[j] = "";
                    }
                }
                
                int spacing=0;
                //for finding if that line has customer id
                for (int i=0;i<str.length();i++){
                    switch(str.charAt(i)){
                        case ' ':spacing++;break;
                        default:
                            switch(spacing){
                                    case 0: readings[0][0]+=str.charAt(i); break;
                                    }
                    }
                    if(spacing>=1)break;
                }              
                //if found that id, only then the program sees the other entries            
                if(custID==Integer.parseInt(readings[0][0])){
                    spacing=0;
                    for (int i=0;i<str.length();i++){
                        switch(str.charAt(i)){
                            case ' ':spacing++;break;
                            case '|':break;
                            default:
                                switch(spacing){
                                        case 1: readings[0][spacing]+=str.charAt(i); break;case 2: readings[0][spacing]+=str.charAt(i); break;case 3: readings[0][spacing]+=str.charAt(i); break;case 4: readings[0][spacing]+=str.charAt(i); break;case 5: readings[0][spacing]+=str.charAt(i); break;case 6: readings[0][spacing]+=str.charAt(i); break;case 7: readings[0][spacing]+=str.charAt(i); break;case 8: readings[0][spacing]+=str.charAt(i); break;case 9: readings[0][spacing]+=str.charAt(i); break;case 10: readings[0][spacing]+=str.charAt(i); break;case 11: readings[0][spacing]+=str.charAt(i); break;case 12: readings[0][spacing]+=str.charAt(i); break;
                                        default: readings[0][13]+=str.charAt(i);         //extras
                                        }
                        }
                    }
                    spacing=0;
                    for (int i=0;i<strb.length();i++){
                        switch(strb.charAt(i)){
                            case ' ':spacing++;break;
                            case '|':break;
                            default:
                                switch(spacing){
                                        case 1: readings[1][spacing]+=strb.charAt(i); break;case 2: readings[1][spacing]+=strb.charAt(i); break;case 3: readings[1][spacing]+=strb.charAt(i); break;case 4: readings[1][spacing]+=strb.charAt(i); break;case 5: readings[1][spacing]+=strb.charAt(i); break;case 6: readings[1][spacing]+=strb.charAt(i); break;case 7: readings[1][spacing]+=strb.charAt(i); break;case 8: readings[1][spacing]+=strb.charAt(i); break;case 9: readings[1][spacing]+=strb.charAt(i); break;case 10: readings[1][spacing]+=strb.charAt(i); break;case 11: readings[1][spacing]+=strb.charAt(i); break;case 12: readings[1][spacing]+=strb.charAt(i); break;
                                        default: readings[1][13]+=strf.charAt(i);         //extras
                                        }
                        }
                    }
                    spacing=0;
                    for (int i=0;i<strc.length();i++){
                        switch(strc.charAt(i)){
                            case ' ':spacing++;break;
                            case '|':break;
                            default:
                                switch(spacing){
                                        case 1: readings[2][spacing]+=strc.charAt(i); break;case 2: readings[2][spacing]+=strc.charAt(i); break;case 3: readings[2][spacing]+=strc.charAt(i); break;case 4: readings[2][spacing]+=strc.charAt(i); break;case 5: readings[2][spacing]+=strc.charAt(i); break;case 6: readings[2][spacing]+=strc.charAt(i); break;case 7: readings[2][spacing]+=strc.charAt(i); break;case 8: readings[2][spacing]+=strc.charAt(i); break;case 9: readings[2][spacing]+=strc.charAt(i); break;case 10: readings[2][spacing]+=strc.charAt(i); break;case 11: readings[2][spacing]+=strc.charAt(i); break;case 12: readings[2][spacing]+=strc.charAt(i); break;
                                        default: readings[2][13]+=strc.charAt(i);         //extras
                                        }
                        }
                    }
                    spacing=0;
                    for (int i=0;i<strd.length();i++){
                        switch(strd.charAt(i)){
                            case ' ':spacing++;break;
                            case '|':break;
                            default:
                                switch(spacing){
                                        case 1: readings[3][spacing]+=strd.charAt(i); break;case 2: readings[3][spacing]+=strd.charAt(i); break;case 3: readings[3][spacing]+=strd.charAt(i); break;case 4: readings[3][spacing]+=strd.charAt(i); break;case 5: readings[3][spacing]+=strd.charAt(i); break;case 6: readings[3][spacing]+=strd.charAt(i); break;case 7: readings[3][spacing]+=strd.charAt(i); break;case 8: readings[3][spacing]+=strd.charAt(i); break;case 9: readings[3][spacing]+=strd.charAt(i); break;case 10: readings[3][spacing]+=strd.charAt(i); break;case 11: readings[3][spacing]+=strd.charAt(i); break;case 12: readings[3][spacing]+=strd.charAt(i); break;
                                        default: readings[3][13]+=strd.charAt(i);         //extras
                                        }
                        }
                    }
                    spacing=0;
                    for (int i=0;i<stre.length();i++){
                        switch(stre.charAt(i)){
                            case ' ':spacing++;break;
                            case '|':break;
                            default:
                                switch(spacing){
                                        case 1: readings[4][spacing]+=stre.charAt(i); break;case 2: readings[4][spacing]+=stre.charAt(i); break;case 3: readings[4][spacing]+=stre.charAt(i); break;case 4: readings[4][spacing]+=stre.charAt(i); break;case 5: readings[4][spacing]+=stre.charAt(i); break;case 6: readings[4][spacing]+=stre.charAt(i); break;case 7: readings[4][spacing]+=stre.charAt(i); break;case 8: readings[4][spacing]+=stre.charAt(i); break;case 9: readings[4][spacing]+=stre.charAt(i); break;case 10: readings[4][spacing]+=stre.charAt(i); break;case 11: readings[4][spacing]+=stre.charAt(i); break;case 12: readings[4][spacing]+=stre.charAt(i); break;
                                        default: readings[4][13]+=stre.charAt(i);         //extras
                                        }
                        }
                    }
                    spacing=0;
                    for (int i=0;i<strf.length();i++){
                        switch(strf.charAt(i)){
                            case ' ':spacing++;break;
                            case '|':break;
                            default:
                                switch(spacing){
                                        case 1: readings[5][spacing]+=strf.charAt(i); break;case 2: readings[5][spacing]+=strf.charAt(i); break;case 3: readings[5][spacing]+=strf.charAt(i); break;case 4: readings[5][spacing]+=strf.charAt(i); break;case 5: readings[5][spacing]+=strf.charAt(i); break;case 6: readings[5][spacing]+=strf.charAt(i); break;case 7: readings[5][spacing]+=strf.charAt(i); break;case 8: readings[5][spacing]+=strf.charAt(i); break;case 9: readings[5][spacing]+=strf.charAt(i); break;case 10: readings[5][spacing]+=strf.charAt(i); break;case 11: readings[5][spacing]+=strf.charAt(i); break;case 12: readings[5][spacing]+=strf.charAt(i); break;
                                        default: readings[5][13]+=strf.charAt(i);         //extras
                                        }
                        }
                    }
                    spacing=0;
                    for (int i=0;i<strg.length();i++){
                        switch(strg.charAt(i)){
                            case ' ':spacing++;break;
                            case '|':break;
                            default:
                                switch(spacing){
                                        case 1: readings[6][spacing]+=strg.charAt(i); break;case 2: readings[6][spacing]+=strg.charAt(i); break;case 3: readings[6][spacing]+=strg.charAt(i); break;case 4: readings[6][spacing]+=strg.charAt(i); break;case 5: readings[6][spacing]+=strg.charAt(i); break;case 6: readings[6][spacing]+=strg.charAt(i); break;case 7: readings[6][spacing]+=strg.charAt(i); break;case 8: readings[6][spacing]+=strg.charAt(i); break;case 9: readings[6][spacing]+=strg.charAt(i); break;case 10: readings[6][spacing]+=strg.charAt(i); break;case 11: readings[6][spacing]+=strg.charAt(i); break;case 12: readings[6][spacing]+=strg.charAt(i); break;
                                        default: readings[6][13]+=strg.charAt(i);         //extras
                                        }
                        }
                    }
                    spacing=0;
                    for (int i=0;i<strh.length();i++){
                        switch(strh.charAt(i)){
                            case ' ':spacing++;break;
                            case '|':break;
                            default:
                                switch(spacing){
                                        case 1: readings[7][spacing]+=strh.charAt(i); break;case 2: readings[7][spacing]+=strh.charAt(i); break;case 3: readings[7][spacing]+=strh.charAt(i); break;case 4: readings[7][spacing]+=strh.charAt(i); break;case 5: readings[7][spacing]+=strh.charAt(i); break;case 6: readings[7][spacing]+=strh.charAt(i); break;case 7: readings[7][spacing]+=strh.charAt(i); break;case 8: readings[7][spacing]+=strh.charAt(i); break;case 9: readings[7][spacing]+=strh.charAt(i); break;case 10: readings[7][spacing]+=strh.charAt(i); break;case 11: readings[7][spacing]+=strh.charAt(i); break;case 12: readings[7][spacing]+=strh.charAt(i); break;
                                        default: readings[7][13]+=strh.charAt(i);         //extras
                                        }
                        }
                    }
                    spacing=0;
                    for (int i=0;i<stri.length();i++){
                        switch(stri.charAt(i)){
                            case ' ':spacing++;break;
                            case '|':break;
                            default:
                                switch(spacing){
                                        case 1: readings[8][spacing]+=stri.charAt(i); break;case 2: readings[8][spacing]+=stri.charAt(i); break;case 3: readings[8][spacing]+=stri.charAt(i); break;case 4: readings[8][spacing]+=stri.charAt(i); break;case 5: readings[8][spacing]+=stri.charAt(i); break;case 6: readings[8][spacing]+=stri.charAt(i); break;case 7: readings[8][spacing]+=stri.charAt(i); break;case 8: readings[8][spacing]+=stri.charAt(i); break;case 9: readings[8][spacing]+=stri.charAt(i); break;case 10: readings[8][spacing]+=stri.charAt(i); break;case 11: readings[8][spacing]+=stri.charAt(i); break;case 12: readings[8][spacing]+=stri.charAt(i); break;
                                        default: readings[8][13]+=stri.charAt(i);         //extras
                                        }
                        }
                    }
                    spacing=0;
                    for (int i=0;i<strj.length();i++){
                        switch(strj.charAt(i)){
                            case ' ':spacing++;break;
                            case '|':break;
                            default:
                                switch(spacing){
                                        case 1: readings[9][spacing]+=strj.charAt(i); break;case 2: readings[9][spacing]+=strj.charAt(i); break;case 3: readings[9][spacing]+=strj.charAt(i); break;case 4: readings[9][spacing]+=strj.charAt(i); break;case 5: readings[9][spacing]+=strj.charAt(i); break;case 6: readings[9][spacing]+=strj.charAt(i); break;case 7: readings[9][spacing]+=strj.charAt(i); break;case 8: readings[9][spacing]+=strj.charAt(i); break;case 9: readings[9][spacing]+=strj.charAt(i); break;case 10: readings[9][spacing]+=strj.charAt(i); break;case 11: readings[9][spacing]+=strj.charAt(i); break;case 12: readings[9][spacing]+=strj.charAt(i); break;
                                        default: readings[9][13]+=strj.charAt(i);         //extras
                                        }
                        }
                    }
                    spacing=0;
                    for (int i=0;i<strk.length();i++){
                        switch(strk.charAt(i)){
                            case ' ':spacing++;break;
                            case '|':break;
                            default:
                                switch(spacing){
                                        case 1: readings[10][spacing]+=strk.charAt(i); break;case 2: readings[10][spacing]+=strk.charAt(i); break;case 3: readings[10][spacing]+=strk.charAt(i); break;case 4: readings[10][spacing]+=strk.charAt(i); break;case 5: readings[10][spacing]+=strk.charAt(i); break;case 6: readings[10][spacing]+=strk.charAt(i); break;case 7: readings[10][spacing]+=strk.charAt(i); break;case 8: readings[10][spacing]+=strk.charAt(i); break;case 9: readings[10][spacing]+=strk.charAt(i); break;case 10: readings[10][spacing]+=strk.charAt(i); break;case 11: readings[10][spacing]+=strk.charAt(i); break;case 12: readings[10][spacing]+=strk.charAt(i); break;
                                        default: readings[10][13]+=strk.charAt(i);         //extras
                                        }
                        }
                    }
                    spacing=0;
                    for (int i=0;i<strl.length();i++){
                        switch(strl.charAt(i)){
                            case ' ':spacing++;break;
                            case '|':break;
                            default:
                                switch(spacing){
                                        case 1: readings[11][spacing]+=strl.charAt(i); break;case 2: readings[11][spacing]+=strl.charAt(i); break;case 3: readings[11][spacing]+=strl.charAt(i); break;case 4: readings[11][spacing]+=strl.charAt(i); break;case 5: readings[11][spacing]+=strl.charAt(i); break;case 6: readings[11][spacing]+=strl.charAt(i); break;case 7: readings[11][spacing]+=strl.charAt(i); break;case 8: readings[11][spacing]+=strl.charAt(i); break;case 9: readings[11][spacing]+=strl.charAt(i); break;case 10: readings[11][spacing]+=strl.charAt(i); break;case 11: readings[11][spacing]+=strl.charAt(i); break;case 12: readings[11][spacing]+=strl.charAt(i); break;
                                        default: readings[11][13]+=strl.charAt(i);         //extras
                                        }
                        }
                    }
                    
                    System.out.println();
                    System.out.println("Customer ID: "+readings[0][0]);
                    System.out.println("Name: "+readings[0][1]);
                    System.out.println("Electricity= January:"+readings[0][2]+", February:"+readings[1][2]+", March:"+readings[2][2]+", April:"+readings[3][2]+",May:"+readings[4][2]+", June:"+readings[5][2]+", July:"+readings[6][2]+", August:"+readings[7][2]+",September:"+readings[8][2]+", October:"+readings[9][2]+", November:"+readings[10][2]+", December:"+readings[11][2]);
                    System.out.println("Gas =  January:"+readings[0][3]+", February:"+readings[1][3]+", March:"+readings[2][3]+", April:"+readings[3][3]+",May:"+readings[4][3]+", June:"+readings[5][3]+", July:"+readings[6][3]+", August:"+readings[7][3]+",September:"+readings[8][3]+", October:"+readings[9][3]+", November:"+readings[10][3]+", December:"+readings[11][3]);
                    System.out.println("Water =  January:"+readings[0][4]+", February:"+readings[1][4]+", March:"+readings[2][4]+", April:"+readings[3][4]+",May:"+readings[4][4]+", June:"+readings[5][4]+", July:"+readings[6][4]+", August:"+readings[7][4]+",September:"+readings[8][4]+", October:"+readings[9][4]+", November:"+readings[10][4]+", December:"+readings[11][4]);
                    System.out.println("Calls =  January:"+readings[0][5]+", February:"+readings[1][5]+", March:"+readings[2][5]+", April:"+readings[3][5]+",May:"+readings[4][5]+", June:"+readings[5][5]+", July:"+readings[6][5]+", August:"+readings[7][5]+",September:"+readings[8][5]+", October:"+readings[9][5]+", November:"+readings[10][5]+", December:"+readings[11][5]);
                    System.out.println("Internet meter=  January:"+readings[0][6]+", February:"+readings[1][6]+", March:"+readings[2][6]+", April:"+readings[3][6]+",May:"+readings[4][6]+", June:"+readings[5][6]+", July:"+readings[6][6]+", August:"+readings[7][6]+",September:"+readings[8][6]+", October:"+readings[9][6]+", November:"+readings[10][6]+", December:"+readings[11][6]);
                    System.out.println();                                                                              
                    break;
                }
            }
            readJan.close();readFeb.close();readMar.close();readApr.close();readMay.close();readJun.close();readJul.close();readAug.close();readSep.close();readOct.close();readNov.close();readDec.close();
            showmenu();
        }
        catch (FileNotFoundException e){
            System.out.println("\nERROR : File not Found !!!");
        }

    }

    //---------------half year report------------
    public static void halfReport() throws IOException{
        System.out.println();
        System.out.println("For January:");
        System.out.println("Total of Bills= Electricity:"+halfYear[0][0]+" Gas:"+halfYear[0][1]+" Water:"+halfYear[0][2]+" Phone bill:"+halfYear[0][3]+" Internet bills:"+halfYear[0][4]);
        
        System.out.println();
        System.out.println("For February:");
        System.out.println("Total of Bills= Electricity:"+halfYear[1][0]+" Gas:"+halfYear[1][1]+" Water:"+halfYear[1][2]+" Phone bill:"+halfYear[1][3]+" Internet bills:"+halfYear[1][4]);
        
        System.out.println();
        System.out.println("For March:");        
        System.out.println("Total of Bills= Electricity:"+halfYear[2][0]+" Gas:"+halfYear[2][1]+" Water:"+halfYear[2][2]+" Phone bill:"+halfYear[2][3]+" Internet bills:"+halfYear[2][4]);
        
        System.out.println();
        System.out.println("For April:");       
        System.out.println("Total of Bills= Electricity:"+halfYear[3][0]+" Gas:"+halfYear[3][1]+" Water:"+halfYear[3][2]+" Phone bill:"+halfYear[3][3]+" Internet bills:"+halfYear[3][4]);
        
        System.out.println();
        System.out.println("For May:");        
        System.out.println("Total of Bills= Electricity:"+halfYear[4][0]+" Gas:"+halfYear[4][1]+" Water:"+halfYear[4][2]+" Phone bill:"+halfYear[4][3]+" Internet bills:"+halfYear[4][4]);
        
        System.out.println();
        System.out.println("For June:");       
        System.out.println("Total of Bills= Electricity:"+halfYear[5][0]+" Gas:"+halfYear[5][1]+" Water:"+halfYear[5][2]+" Phone bill:"+halfYear[5][3]+" Internet bills:"+halfYear[5][4]);

        System.out.println();
        System.out.println("For All Months");        
        System.out.println("Total of Bills= Electricity:"+(halfYear[0][0]+halfYear[1][0]+halfYear[2][0]+halfYear[3][0]+halfYear[4][0]+halfYear[5][0])+" Gas:"+(halfYear[0][1]+halfYear[1][1]+halfYear[2][1]+halfYear[3][1]+halfYear[4][1]+halfYear[5][1])+" Water:"+(halfYear[0][2]+halfYear[1][2]+halfYear[2][2]+halfYear[3][2]+halfYear[4][2]+halfYear[5][2])+" Phone bill:"+(halfYear[0][3]+halfYear[1][3]+halfYear[2][3]+halfYear[3][3]+halfYear[4][3]+halfYear[5][3])+" Internet bills:"+(halfYear[0][4]+halfYear[1][4]+halfYear[2][4]+halfYear[3][4]+halfYear[4][4]+halfYear[5][4]));
        System.out.println();
        
        showmenu();
    }

    //Full year Report Methord
    public static void fullReport() throws IOException{
        System.out.println();
        System.out.println("For January:");
        System.out.println("Total of Bills= Electricity:"+year[0][0]+" Gas:"+year[0][1]+" Water:"+year[0][2]+" Phone bill:"+year[0][3]+" Internet bills:"+year[0][4]);        
        System.out.println();
        System.out.println("For February:");
        System.out.println("Total of Bills= Electricity:"+year[1][0]+" Gas:"+year[1][1]+" Water:"+year[1][2]+" Phone bill:"+year[1][3]+" Internet bills:"+year[1][4]);       
        System.out.println();
        System.out.println("For March:");        
        System.out.println("Total of Bills= Electricity:"+year[2][0]+" Gas:"+year[2][1]+" Water:"+year[2][2]+" Phone bill:"+year[2][3]+" Internet bills:"+year[2][4]);        
        System.out.println();
        System.out.println("For April:");       
        System.out.println("Total of Bills= Electricity:"+year[3][0]+" Gas:"+year[3][1]+" Water:"+year[3][2]+" Phone bill:"+year[3][3]+" Internet bills:"+year[3][4]); 
        System.out.println();
        System.out.println("For May:");        
        System.out.println("Total of Bills= Electricity:"+year[4][0]+" Gas:"+year[4][1]+" Water:"+year[4][2]+" Phone bill:"+year[4][3]+" Internet bills:"+year[4][4]);  
        System.out.println();
        System.out.println("For June:");       
        System.out.println("Total of Bills= Electricity:"+year[5][0]+" Gas:"+year[5][1]+" Water:"+year[5][2]+" Phone bill:"+year[5][3]+" Internet bills:"+year[5][4]);
        System.out.println();
        System.out.println("For July:");
        System.out.println("Total of Bills= Electricity:"+year[6][0]+" Gas:"+year[6][1]+" Water:"+year[6][2]+" Phone bill:"+year[6][3]+" Internet bills:"+year[6][4]);   
        System.out.println();
        System.out.println("For August:");
        System.out.println("Total of Bills= Electricity:"+year[7][0]+" Gas:"+year[7][1]+" Water:"+year[7][2]+" Phone bill:"+year[7][3]+" Internet bills:"+year[7][4]);
        System.out.println();
        System.out.println("For September:");        
        System.out.println("Total of Bills= Electricity:"+year[8][0]+" Gas:"+year[8][1]+" Water:"+year[8][2]+" Phone bill:"+year[8][3]+" Internet bills:"+year[8][4]); 
        System.out.println();
        System.out.println("For October:");       
        System.out.println("Total of Bills= Electricity:"+year[9][0]+" Gas:"+year[9][1]+" Water:"+year[9][2]+" Phone bill:"+year[9][3]+" Internet bills:"+year[9][4]);
        System.out.println();
        System.out.println("For November:");        
        System.out.println("Total of Bills= Electricity:"+year[10][0]+" Gas:"+year[10][1]+" Water:"+year[10][2]+" Phone bill:"+year[10][3]+" Internet bills:"+year[10][4]);  
        System.out.println();
        System.out.println("For December:");       
        System.out.println("Total of Bills= Electricity:"+year[11][0]+" Gas:"+year[11][1]+" Water:"+year[11][2]+" Phone bill:"+year[11][3]+" Internet bills:"+year[11][4]);
        System.out.println();
        System.out.println("For All Months");        
        System.out.println("Total of Bills= Electricity:"+(year[0][0]+year[1][0]+year[2][0]+year[3][0]+year[4][0]+year[5][0]+year[6][0]+year[7][0]+year[8][0]+year[9][0]+year[10][0]+year[11][0])+" Gas:"+(year[0][1]+year[1][1]+year[2][1]+year[3][1]+year[4][1]+year[5][1]+year[6][1]+year[7][1]+year[8][1]+year[9][1]+year[10][1]+year[11][1])+" Water:"+(year[0][2]+year[1][2]+year[2][2]+year[3][2]+year[4][3]+year[5][3]+year[6][3]+year[7][3]+year[8][3]+year[9][3]+year[10][3]+year[11][3])+" Phone bill:"+(year[0][3]+year[1][3]+year[2][3]+year[3][3]+year[4][3]+year[5][3]+year[6][3]+year[7][3]+year[8][3]+year[9][3]+year[10][3]+year[11][3])+" Internet bills:"+(year[0][4]+year[1][4]+year[2][4]+year[3][4]+year[4][4]+year[5][4]+year[6][4]+year[7][4]+year[8][4]+year[9][4]+year[10][4]+year[11][4]));
        System.out.println();
        
        showmenu();
    }
    // <<<<<<<<<<<<<----------------------MAIN HAI G--------------------------->>>>>>>>>>>>>>//
    public static void main(String[] args) throws IOException {
        showmenu();
    }

    //-------------------modify method using id----------------------
    public static void modify(int custID) throws IOException{
        try{
            File janfile=new File("January.txt"),febfile=new File("February.txt"),marfile=new File("March.txt"),aprfile=new File("April.txt"),mayfile=new File("May.txt"),junfile=new File("June.txt"),julfile=new File("July.txt"),augfile=new File("August.txt"),sepfile=new File("September.txt"),octfile=new File("October.txt"),novfile=new File("November.txt"),decfile=new File("December.txt");

            BufferedReader file = new BufferedReader(new FileReader(janfile)),readf = new BufferedReader(new FileReader(febfile)),readm = new BufferedReader(new FileReader(marfile)),reada = new BufferedReader(new FileReader(aprfile)),readmay = new BufferedReader(new FileReader(mayfile)),readjun = new BufferedReader(new FileReader(junfile)),readjul = new BufferedReader(new FileReader(julfile)),readaug = new BufferedReader(new FileReader(augfile)),reads = new BufferedReader(new FileReader(sepfile)),reado = new BufferedReader(new FileReader(octfile)),readn = new BufferedReader(new FileReader(novfile)),readd = new BufferedReader(new FileReader(decfile));

            File tjan=new File("jan1.txt"),tfeb=new File("feb1.txt"),tmar=new File("mar1.txt"),tapr=new File("apr1.txt"),tmay=new File("may1.txt"),tjun=new File("jun1.txt"),tjul=new File("july1.txt"),taug=new File("aug1.txt"),tsep=new File("sep1.txt"),toct=new File("oct1.txt"),tnov=new File("nov1.txt"),tdec=new File("dec1.txt");

            PrintWriter pwj = new PrintWriter(new BufferedWriter(new FileWriter(tjan,true))),pwf = new PrintWriter(new BufferedWriter(new FileWriter(tfeb,true))),pwm = new PrintWriter(new BufferedWriter(new FileWriter(tmar,true))), pwa = new PrintWriter(new BufferedWriter(new FileWriter(tapr,true))),pwmay = new PrintWriter(new BufferedWriter(new FileWriter(tmay,true))),pwjun = new PrintWriter(new BufferedWriter(new FileWriter(tjun,true))),pwjul = new PrintWriter(new BufferedWriter(new FileWriter(tjul,true))), pwaug = new PrintWriter(new BufferedWriter(new FileWriter(taug,true))),pwsep = new PrintWriter(new BufferedWriter(new FileWriter(tsep,true))),pwoct = new PrintWriter(new BufferedWriter(new FileWriter(toct,true))),pwnov = new PrintWriter(new BufferedWriter(new FileWriter(tnov,true))), pwdec = new PrintWriter(new BufferedWriter(new FileWriter(tdec,true)));
                        
            String strj,ID,newJan,newFeb,newMar,newApr,newMay,newJun, newJul, newAug, newSep,newOct,newNov,newDec;
            while ((strj = file.readLine()) != null) {
                String strf= readf.readLine();String strm= readm.readLine();String stra= reada.readLine();String strmay= readmay.readLine();String strjun= readjun.readLine();String strjul= readjul.readLine();String straug= readaug.readLine();String strs= reads.readLine();String stro= reado.readLine();String strn= readn.readLine();String strd= readd.readLine();
                
                ID="";
                
                int spacing=0;
                //for finding if that line has cust id similar to that we require
                for (int i=0;i<strj.length();i++){
                    switch(strj.charAt(i)){
                        case ' ':spacing++;break;
                        default:
                            switch(spacing){
                                    case 0: ID+=strj.charAt(i);break;
                                    }
                    }
                    if(spacing>=1)break;
                }

                if(custID==Integer.parseInt(ID)){
                    newJan=ID;
                    int eunits,gunits,wunits,lunits,iunits,inunits;
                    
                    sc.nextLine();
                    System.out.println("Enter New Name:");
                    newJan+=" "+sc.nextLine();
                    newFeb=newJan; newMar=newJan; newApr=newMar; newMay=newApr; newJun=newMay; newJul=newJun; newAug=newJul; newSep=newAug; newOct=newSep; newNov=newOct; newDec=newNov;

                        System.out.println("Enter Jan Electric units:");
                        eunits=sc.nextInt();
                        System.out.println("Enter Jan Gas gm3:");
                        gunits=sc.nextInt();
                        System.out.println("Enter Jan Water litres:");
                        wunits=sc.nextInt();
                        System.out.println("Enter Jan Local call mins:");
                        lunits=sc.nextInt();
                        System.out.println("Enter Jan International call mins:");
                        iunits=sc.nextInt();
                        System.out.println("Enter Jan Internet GBs:");
                        inunits=sc.nextInt();
                        newJan+=" "+electricityCal(eunits)+" "+gasCal(gunits)+" "+waterCal(wunits)+" "+phoneCal(lunits,iunits)+" "+internetCal(inunits);
                        //newj+=" |"+emeter+" "+gmeter+" "+wmeter+" "+lmeter+" "+imeter+" "+inmeter+" |"+ecal(emeter)+" "+gcal(gmeter)+" "+wcal(wmeter)+" "+pcal(lmeter,imeter)+" "+ical(inmeter);

                        System.out.println("Enter Feb Electric units:");
                        eunits=sc.nextInt();//emeter+=eunits;
                        System.out.println("Enter Feb Gas gm3:");
                        gunits=sc.nextInt();//gmeter+=gunits;
                        System.out.println("Enter Feb Water litres:");
                        wunits=sc.nextInt();//wmeter+=wunits;
                        System.out.println("Enter Feb Local call mins:");
                        lunits=sc.nextInt();//lmeter+=lunits;
                        System.out.println("Enter Feb International call mins:");
                        iunits=sc.nextInt();//imeter+=iunits;
                        System.out.println("Enter Feb Internet GBs:");
                        inunits=sc.nextInt();//inmeter+=inunits;
                    
                        newFeb+=" "+electricityCal(eunits)+" "+gasCal(gunits)+" "+waterCal(wunits)+" "+phoneCal(lunits,iunits)+" "+internetCal(inunits);

                         
                        System.out.println("Enter Mar Electric units:");
                        eunits=sc.nextInt();//emeter+=eunits;
                        System.out.println("Enter Mar Gas gm3:");
                        gunits=sc.nextInt();////gmeter+=gunits;
                        System.out.println("Enter Mar Water litres:");
                        wunits=sc.nextInt();//wmeter+=wunits;
                        System.out.println("Enter Mar Local call mins:");
                        lunits=sc.nextInt();//lmeter+=lunits;
                        System.out.println("Enter Mar International call mins:");
                        iunits=sc.nextInt();//imeter+=iunits;
                        System.out.println("Enter Mar Internet GBs:");
                        inunits=sc.nextInt();//inmeter+=inunits;
                        
                        newMar+=" "+electricityCal(eunits)+" "+gasCal(gunits)+" "+waterCal(wunits)+" "+phoneCal(lunits,iunits)+" "+internetCal(inunits);

                        System.out.println("Enter Apr Electric units:");
                        eunits=sc.nextInt();//emeter+=eunits;
                        System.out.println("Enter Apr Gas gm3:");
                        gunits=sc.nextInt();//gmeter+=gunits;
                        System.out.println("Enter Apr Water litres:");
                        wunits=sc.nextInt();//wmeter+=wunits;
                        System.out.println("Enter Apr Local call mins:");
                        lunits=sc.nextInt();//lmeter+=lunits;
                        System.out.println("Enter Apr International call mins:");
                        iunits=sc.nextInt();//imeter+=iunits;
                        System.out.println("Enter Apr Internet GBs:");
                        inunits=sc.nextInt();//inmeter+=inunits;
                        
                        newApr+=" "+electricityCal(eunits)+" "+gasCal(gunits)+" "+waterCal(wunits)+" "+phoneCal(lunits,iunits)+" "+internetCal(inunits);

                        System.out.println("Enter May Electric units:");
                        eunits=sc.nextInt();//emeter+=eunits;
                        System.out.println("Enter May Gas gm3:");
                        gunits=sc.nextInt();//gmeter+=gunits;
                        System.out.println("Enter May Water litres:");
                        wunits=sc.nextInt();//wmeter+=wunits;
                        System.out.println("Enter May Local call mins:");
                        lunits=sc.nextInt();//lmeter+=lunits;
                        System.out.println("Enter May International call mins:");
                        iunits=sc.nextInt();//imeter+=iunits;
                        System.out.println("Enter May Internet GBs:");
                        inunits=sc.nextInt();//inmeter+=inunits;
                        
                        newMay+=" "+electricityCal(eunits)+" "+gasCal(gunits)+" "+waterCal(wunits)+" "+phoneCal(lunits,iunits)+" "+internetCal(inunits);
                        System.out.println("Enter June Electric units:");
                        eunits=sc.nextInt();
                        System.out.println("Enter June Gas gm3:");
                        gunits=sc.nextInt();
                        System.out.println("Enter June Water litres:");
                        wunits=sc.nextInt();
                        System.out.println("Enter June Local call mins:");
                        lunits=sc.nextInt();
                        System.out.println("Enter June International call mins:");
                        iunits=sc.nextInt();
                        System.out.println("Enter June Internet GBs:");
                        inunits=sc.nextInt();
                    
                        
                        newJun+=" "+electricityCal(eunits)+" "+gasCal(gunits)+" "+waterCal(wunits)+" "+phoneCal(lunits,iunits)+" "+internetCal(inunits);

                        System.out.println("Enter July Electric units:");
                        eunits=sc.nextInt();//emeter+=eunits;
                        System.out.println("Enter July Gas gm3:");
                        gunits=sc.nextInt();//gmeter+=gunits;
                        System.out.println("Enter July Water litres:");
                        wunits=sc.nextInt();//wmeter+=wunits;
                        System.out.println("Enter July Local call mins:");
                        lunits=sc.nextInt();//lmeter+=lunits;
                        System.out.println("Enter July International call mins:");
                        iunits=sc.nextInt();//imeter+=iunits;
                        System.out.println("Enter July Internet GBs:");
                        inunits=sc.nextInt();//inmeter+=inunits;
                    
                        newJul+=" "+electricityCal(eunits)+" "+gasCal(gunits)+" "+waterCal(wunits)+" "+phoneCal(lunits,iunits)+" "+internetCal(inunits);
                         
                        System.out.println("Enter Aug Electric units:");
                        eunits=sc.nextInt();//emeter+=eunits;
                        System.out.println("Enter Aug Gas gm3:");
                        gunits=sc.nextInt();////gmeter+=gunits;
                        System.out.println("Enter Aug Water litres:");
                        wunits=sc.nextInt();//wmeter+=wunits;
                        System.out.println("Enter Aug Local call mins:");
                        lunits=sc.nextInt();//lmeter+=lunits;
                        System.out.println("Enter Aug International call mins:");
                        iunits=sc.nextInt();//imeter+=iunits;
                        System.out.println("Enter Aug Internet GBs:");
                        inunits=sc.nextInt();//inmeter+=inunits;
                        
                        newAug+=" "+electricityCal(eunits)+" "+gasCal(gunits)+" "+waterCal(wunits)+" "+phoneCal(lunits,iunits)+" "+internetCal(inunits);
  
                        System.out.println("Enter Sep Electric units:");
                        eunits=sc.nextInt();//emeter+=eunits;
                        System.out.println("Enter Sept Gas gm3:");
                        gunits=sc.nextInt();//gmeter+=gunits;
                        System.out.println("Enter Sept Water litres:");
                        wunits=sc.nextInt();//wmeter+=wunits;
                        System.out.println("Enter Sept Local call mins:");
                        lunits=sc.nextInt();//lmeter+=lunits;
                        System.out.println("Enter Sept International call mins:");
                        iunits=sc.nextInt();//imeter+=iunits;
                        System.out.println("Enter Sept Internet GBs:");
                        inunits=sc.nextInt();//inmeter+=inunits;
                        
                        newSep+=" "+electricityCal(eunits)+" "+gasCal(gunits)+" "+waterCal(wunits)+" "+phoneCal(lunits,iunits)+" "+internetCal(inunits);

                        System.out.println("Enter Oct Electric units:");
                        eunits=sc.nextInt();//emeter+=eunits;
                        System.out.println("Enter Oct Gas gm3:");
                        gunits=sc.nextInt();//gmeter+=gunits;
                        System.out.println("Enter Oct Water litres:");
                        wunits=sc.nextInt();//wmeter+=wunits;
                        System.out.println("Enter Oct Local call mins:");
                        lunits=sc.nextInt();//lmeter+=lunits;
                        System.out.println("Enter Oct International call mins:");
                        iunits=sc.nextInt();//imeter+=iunits;
                        System.out.println("Enter Oct Internet GBs:");
                        inunits=sc.nextInt();//inmeter+=inunits;
                        
                        newOct+=" "+electricityCal(eunits)+" "+gasCal(gunits)+" "+waterCal(wunits)+" "+phoneCal(lunits,iunits)+" "+internetCal(inunits);

                        System.out.println("Enter   Nov Electric units:");
                        eunits=sc.nextInt();//emeter+=eunits;
                        System.out.println("Enter Nov Gas gm3:");
                        gunits=sc.nextInt();//gmeter+=gunits;
                        System.out.println("Enter Nov Water litres:");
                        wunits=sc.nextInt();//wmeter+=wunits;
                        System.out.println("Enter Nov Local call mins:");
                        lunits=sc.nextInt();//lmeter+=lunits;
                        System.out.println("Enter Nov International call mins:");
                        iunits=sc.nextInt();//imeter+=iunits;
                        System.out.println("Enter Nov Internet GBs:");
                        inunits=sc.nextInt();//inmeter+=inunits;
                        
                        newNov+=" "+electricityCal(eunits)+" "+gasCal(gunits)+" "+waterCal(wunits)+" "+phoneCal(lunits,iunits)+" "+internetCal(inunits);

                        System.out.println("Enter Dec Electric units:");
                        eunits=sc.nextInt();//emeter+=eunits;
                        System.out.println("Enter Dec Gas gm3:");
                        gunits=sc.nextInt();//gmeter+=gunits;
                        System.out.println("Enter Dec Water litres:");
                        wunits=sc.nextInt();//wmeter+=wunits;
                        System.out.println("Enter Dec Local call mins:");
                        lunits=sc.nextInt();//lmeter+=lunits;
                        System.out.println("Enter Dec International call mins:");
                        iunits=sc.nextInt();//imeter+=iunits;
                        System.out.println("Enter Dec Internet GBs:");
                        inunits=sc.nextInt();//inmeter+=inunits;
                        
                        newDec+=" "+electricityCal(eunits)+" "+gasCal(gunits)+" "+waterCal(wunits)+" "+phoneCal(lunits,iunits)+" "+internetCal(inunits);
                    
                    pwj.println(newJan);pwf.println(newFeb);pwm.println(newMar);pwa.println(newApr);pwmay.println(newMay);pwjun.println(newJun);pwjul.println(newJul);pwaug.println(newAug);pwsep.println(newSep);pwoct.println(newOct);pwnov.println(newNov);pwdec.println(newDec);
                    
                    
                    
                    System.out.println();
                    System.out.println("The Record has been updated successfully.");   
                    System.out.println();
                }
                else{
                    pwj.println(strj);pwf.println(strf);pwm.println(strm);pwa.println(stra);pwmay.println(strmay);pwjun.println(strjun);pwjul.println(strjul);pwaug.println(straug);pwsep.println(strs);pwoct.println(stro);pwnov.println(strn);pwdec.println(strd);
                }
                
            }
            
            file.close();readf.close();readm.close();reada.close();readmay.close();readjun.close();readjul.close();readaug.close();reads.close();reado.close();readn.close();readd.close();

            pwj.flush();pwf.flush();pwm.flush();pwa.flush();pwmay.flush();pwjun.flush();pwjul.flush();pwaug.flush();pwsep.flush();pwoct.flush();pwnov.flush();pwdec.flush();

            pwj.close();pwf.close();pwm.close();pwa.close();pwmay.close();pwjun.close();pwjul.close();pwaug.close();pwsep.close();pwoct.close();pwnov.close();pwdec.close();
            
            janfile.delete();febfile.delete();marfile.delete();aprfile.delete();mayfile.delete();junfile.delete();julfile.delete();augfile.delete();sepfile.delete();octfile.delete();novfile.delete();decfile.delete();
            
            
            File jfile=new File("January.txt"),ffile=new File("February.txt"),mfile=new File("March.txt"),afile=new File("April.txt"),mafile=new File("May.txt"),jufile=new File("June.txt"),jlfile=new File("July.txt"),agfile=new File("August.txt"),sfile=new File("September.txt"),ofile=new File("October.txt"),nfile=new File("November.txt"),dfile=new File("December.txt");

            tjan.renameTo(jfile);tfeb.renameTo(ffile);tmar.renameTo(mfile);tapr.renameTo(afile);tmay.renameTo(mafile);tjun.renameTo(jufile);tjul.renameTo(jlfile);taug.renameTo(agfile);tsep.renameTo(sfile);toct.renameTo(ofile);tnov.renameTo(nfile);tdec.renameTo(dfile);
            showmenu();
        }

        catch (FileNotFoundException e){
            System.out.println("\nERROR : File not Found in the folder !!!");
        }
    }
    
    public static void showmenu() throws IOException {
        // THIS WILL SHOW THE MENU IN THE CONSOLE
        System.out.print("<<--WELCOME TO COMBINED BILLING SYSTEM BY USMAN MALIK-->> \n-PLEASE SELECT ANY OPTION FROM BELOW- \n1: Create New Record \n2: View The Records \n3: Manage Records \n4: Delete Records \n5: Half/Full Yearly Report \n6: Exit \nYour choice:: ");
        int choice = sc.nextInt();
        int custID;
        int option;
        switch (choice) {
            case 1:
                bill_generation();
                break;
            case 2:
                System.out.println("Enter customer ID :");
                custID=sc.nextInt();
                findByID(custID);
                break;
            case 3:
                System.out.println("Enter customer ID :");
                custID=sc.nextInt();
                modify(custID);
                break;
            case 4:
                System.out.println("Enter customer ID :");
                custID=sc.nextInt();
                delete(custID);
                break;
            case 5:
                System.out.println("1: Half Year Report \n2: Full Year Report");
                System.out.println("Enter your choice :");
                option=sc.nextInt();
                switch(option){
                    case 1:
                        halfReport();
                        break;
                    case 2:
                        fullReport();
                        break;
                    default:
                        System.out.println("invalid choice");
                }


                break;    
            case 6:
                System.exit(1);
                break;
            default:
                System.out.println("\nInvalid choice");
        }
    }// showmenu-end 

    public static void delete(int custID) throws IOException{
        try{
            File janfile=new File("January.txt"),febfile=new File("February.txt"),marfile=new File("March.txt"),aprfile=new File("April.txt"),mayfile=new File("May.txt"),junfile=new File("June.txt"),julfile=new File("July.txt"),augfile=new File("August.txt"),sepfile=new File("September.txt"),octfile=new File("October.txt"),novfile=new File("November.txt"),decfile=new File("December.txt");

            BufferedReader file = new BufferedReader(new FileReader(janfile)),readf = new BufferedReader(new FileReader(febfile)),readm = new BufferedReader(new FileReader(marfile)),reada = new BufferedReader(new FileReader(aprfile)),readmay = new BufferedReader(new FileReader(mayfile)),readjun = new BufferedReader(new FileReader(junfile)),readjul = new BufferedReader(new FileReader(julfile)),readaug = new BufferedReader(new FileReader(augfile)),reads = new BufferedReader(new FileReader(sepfile)),reado = new BufferedReader(new FileReader(octfile)),readn = new BufferedReader(new FileReader(novfile)),readd = new BufferedReader(new FileReader(decfile));

            File tjan=new File("jan1.txt"),tfeb=new File("feb1.txt"),tmar=new File("mar1.txt"),tapr=new File("apr1.txt"),tmay=new File("may1.txt"),tjun=new File("jun1.txt"),tjul=new File("july1.txt"),taug=new File("aug1.txt"),tsep=new File("sep1.txt"),toct=new File("oct1.txt"),tnov=new File("nov1.txt"),tdec=new File("dec1.txt");

            PrintWriter pwj = new PrintWriter(new BufferedWriter(new FileWriter(tjan,true))),pwf = new PrintWriter(new BufferedWriter(new FileWriter(tfeb,true))),pwm = new PrintWriter(new BufferedWriter(new FileWriter(tmar,true))), pwa = new PrintWriter(new BufferedWriter(new FileWriter(tapr,true))),pwmay = new PrintWriter(new BufferedWriter(new FileWriter(tmay,true))),pwjun = new PrintWriter(new BufferedWriter(new FileWriter(tjun,true))),pwjul = new PrintWriter(new BufferedWriter(new FileWriter(tjul,true))), pwaug = new PrintWriter(new BufferedWriter(new FileWriter(taug,true))),pwsep = new PrintWriter(new BufferedWriter(new FileWriter(tsep,true))),pwoct = new PrintWriter(new BufferedWriter(new FileWriter(toct,true))),pwnov = new PrintWriter(new BufferedWriter(new FileWriter(tnov,true))), pwdec = new PrintWriter(new BufferedWriter(new FileWriter(tdec,true)));
            
            String strj,ID;
            while ((strj = file.readLine()) != null) {
                String strf= readf.readLine();String strm= readm.readLine();String stra= reada.readLine();String strmay= readmay.readLine();String strjun= readjun.readLine();String strjul= readjul.readLine();String straug= readaug.readLine();String strs= reads.readLine();String stro= reado.readLine();String strn= readn.readLine();String strd= readd.readLine();
                
                ID="";
                int spacing=0;
                //for finding if that line has cust id similar to that we require
                for (int i=0;i<strj.length();i++){
                    switch(strj.charAt(i)){
                        case ' ':spacing++;break;
                        default:
                            switch(spacing){
                                    case 0: ID+=strj.charAt(i);break;
                                    }
                    }
                    if(spacing>=1)break;
                }
                if(custID==Integer.parseInt(ID)){
                    pwj.println("0000 null");pwf.println("0000 null");pwm.println("0000 null");pwa.println("0000 null");pwmay.println("0000 null");pwjun.println("0000 null");pwjul.println("0000 null");pwaug.println("0000 null");pwsep.println("0000 null");pwoct.println("0000 null");pwnov.println("0000 null");pwdec.println("0000 null");System.out.println();System.out.println("The Record has been deleted successfully.");System.out.println();
                }
                else{
                    pwj.println(strj);pwf.println(strf);pwm.println(strm);pwa.println(stra);pwmay.println(strmay);
                    pwjun.println(strjun);pwjul.println(strjul);pwaug.println(straug);pwsep.println(strs);pwoct.println(stro);pwnov.println(strn);pwdec.println(strd);
                }
                
            }
            
            file.close();readf.close();readm.close();reada.close();readmay.close();readjun.close();readjul.close();readaug.close();reads.close();reado.close();readn.close();readd.close();

            pwj.flush();pwf.flush();pwm.flush();pwa.flush();pwmay.flush();pwjun.flush();pwjul.flush();pwaug.flush();pwsep.flush();pwoct.flush();pwnov.flush();pwdec.flush();

            pwj.close();pwf.close();pwm.close();pwa.close();pwmay.close();pwjun.close();pwjul.close();pwaug.close();pwsep.close();pwoct.close();pwnov.close();pwdec.close();
            
            janfile.delete();febfile.delete();marfile.delete();aprfile.delete();mayfile.delete();junfile.delete();julfile.delete();augfile.delete();sepfile.delete();octfile.delete();novfile.delete();decfile.delete();

            File jfile=new File("January.txt"),ffile=new File("February.txt"),mfile=new File("March.txt"),afile=new File("April.txt"),mafile=new File("May.txt"),jufile=new File("June.txt"),jlfile=new File("July.txt"),agfile=new File("August.txt"),sfile=new File("September.txt"),ofile=new File("October.txt"),nfile=new File("November.txt"),dfile=new File("December.txt");

            tjan.renameTo(jfile);tfeb.renameTo(ffile);tmar.renameTo(mfile);tapr.renameTo(afile);tmay.renameTo(mafile);tjun.renameTo(jufile);tjul.renameTo(jlfile);taug.renameTo(agfile);tsep.renameTo(sfile);toct.renameTo(ofile);tnov.renameTo(nfile);tdec.renameTo(dfile);
            showmenu();
        }
        catch (FileNotFoundException e){
            System.out.println("\nERROR : File not Found !!!");
        }
    }
    }


