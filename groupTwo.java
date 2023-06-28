import Z.s.Sy;

import java.util.*;
public class groupTwo {
    int a,b,n,p,pyramid;
    float avg;
    List<String> romanNumerals = Arrays.asList("IX","XXX","III","LX","C","VI","I","LXXX","VIII","II","X","XX","XL","L","IV","LXX","VII","XC","V");
    void first(){
        System.out.println("An applet is a Java program that runs in a Web browser. An applet can be a fully functional \n Java application because it has the entire Java API at its disposal.\n" +
                "There are some important differences between an applet and a standalone Java application, including the following −\n" +
                "\n" +
                "\t\tAn applet is a Java class that extends the java.applet.Applet class.\n" +
                "\t\t A main() method is not invoked on an applet, and an applet class will not define main().\n" +
                "\t\tApplets are designed to be embedded within an HTML page.\n" +
                "\t\tWhen a user views an HTML page that contains an applet, the code for the applet is downloaded to the user's machine.\n" +
                "\t\tA JVM is required to view an applet. The JVM can be either a plug-in of the Web browser or a separate runtime environment.\n" +
                "\t\tThe JVM on the user's machine creates an instance of the applet class and invokes various methods during the applet's lifetime.\n" +
                "\t\tApplets have strict security rules that are enforced by the Web browser. The security of an applet is often referred to as sandbox \n\t\t" +
                "security, comparing the applet to a child playing in a sandbox with various rules that must be followed.\n" +
                "\t\tOther classes that the applet needs can be downloaded in a single Java Archive (JAR) file."+"\n\n\n"+
                "An applet is a small program that performs a specific function or set of simple functions within an enclosed frame and is typically " +
                "\nembedded on a web page in a browser\n1. Applets are often used to make websites more dynamic and entertaining\n2. " +
                "They can also be used in enterprise software, where they enable users to quickly access features without having to load a full app or switch windows \n\n");
    }
    void positive(int p){
        System.out.println("THE NUMBER OF POSITIVE NUMBERS ARE="+p);
    }
    void negative(int n){
        System.out.println("THE NUMBER OF NEGATIVE NUMBERS ARE="+n);
    }
    void avg(int num,int p,int n){
        if((p+n)>0) {
            avg = (num / (p + n));
            System.out.println("THE AVERAGE OF THE ENTERED NUMBERS ARE=" + avg);
        }
        else System.out.println("you entered just zero");
    }
    void pyramid(int na){
        for(int i=1;i<=na;i++){
            for(int j=na;j>=1;j--) {
                if (i < j)
                    System.out.print(" ");
                else
                    System.out.print(j);
            }
             for (int k=2;k<=i;k++){
                 System.out.print(+k);
             }
            System.out.print("\n");
            }
            }
    static void sortRomanNumerals (List<String> romanNumerals) {
        romanNumerals.sort (Comparator.comparing (groupTwo::romanToDecimal));
    }
    static int romanToDecimal(String romanNumber) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < romanNumber.length(); i++) {
            if (i > 0 && map.get(romanNumber.charAt(i)) > map.get(romanNumber.charAt(i - 1))) {
                result += map.get(romanNumber.charAt(i)) - 2 * map.get(romanNumber.charAt(i - 1));
            } else {
                result += map.get(romanNumber.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args){
        groupTwo obj = new groupTwo();
        obj.b=0;
        obj.n=0;
        obj.p=0;
        Scanner input = new Scanner(System.in);
        int z;
        do {
            System.out.println(" \t\t-------------------------------------------------------------------------------------------------");
            System.out.println(" \t\t-------------------------------------------------------------------------------------------------");
            System.out.println(" \t\t\t1.What is Java Applets? What the function of Applets? How does work applets?");
            System.out.println("\t\t\t2.Write a program that reads an unspecified number of integers, determines how many \n" +
                    "\t\t\tpositive and negative values have been read, and computes the total and average of the \n" +
                    "\t\t\tinput values (not counting zeros). Your program ends with the input 0. Display the \n" +
                    "\t\t\taverage as a floating-point number.");
            System.out.println("\t\t\t3.Write a JAVA program to sort entered Roman numbers. I II III IV V VI VII VIII IX X \n" +
                    "\t\t\tXX XXX XL L LX LXX LXXX XC C. These numbers should be unsorted in the file");
            System.out.println("\t\t\t4.Write a program that prompts the user to enter an integer from1to15and displays a pyramid,");
            System.out.println("\t\t\t5.for terminate program press 5");
            System.out.println(" \t\t-------------------------------------------------------------------------------------------------");
            System.out.println(" \t\t--------------------------------------------------------------------------------------------------");
            System.out.println("enter you choice from 1 to 4=");
            z = input.nextInt();
            switch (z){
                case 1:
                    obj.first();
                    break;
                case 2:System.out.println("enter numbers as much as you want and 0 to terminate=");
                    do {
                        obj.a = input.nextInt();
                        if(obj.a<0)
                            obj.n++;
                        else if(obj.a>0)
                            obj.p++;
                        obj.b=obj.b+obj.a;
                    }while(obj.a!=0);
                    obj.positive(obj.p);
                    obj.negative(obj.n);
                    obj.avg(obj.b,obj.p,obj.n);
                    break;
                case 3:
                    obj.sortRomanNumerals(obj.romanNumerals);
                    System.out.println(obj.romanNumerals);
                    break;
                case 4:
                    System.out.println("please user enter the number between 1 to 15 including 1 and 15");
                    obj.pyramid = input.nextInt();
                    obj.pyramid(obj.pyramid);
                    break;
            }
        }while(z!=5);
    }
}
