import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List.*;
import javax.swing.*;
class pattern_maker extends JFrame
{
    pattern_maker()
    {
        super("Pattern");
        
        JPanel panel = new JPanel();
        boolean yn;
        panel.setLayout(null);
        int user=0,no=1,x=0,y=0,count,counter=0,length=0;
        JButton [][]b= new JButton[3][3];
        int arr[] = new int[9];
        Random rand = new Random();
        Scanner aman = new Scanner (System.in);
        System.out.println("Would you like to tell from where to start ??");
        String input = aman.nextLine();
        if(input.equals("yes"))
        {
            System.out.println("Enter the length of the pattern you want to tell ");
            user = aman.nextInt();
            
            for(int i=0;i<user;i++)
            {
                arr[i]=aman.nextInt();
            }
            System.out.println("Enter the length of pattern you need ");
            length = aman.nextInt();
            count = length ;
            yn = true;
            
        }
        else
        {
            user=0;
            System.out.println("Enter the length of dots you want in your pattern .");
            length = aman.nextInt();
            count =1;
            yn = false;
        }
        System.out.println("****");
        for(int abc:arr)
            System.out.println(abc);
        System.out.println("****");
        for(int n=0;n<3;n++)
        {
            for(int m=0;m<3;m++)
            {
                b[n][m] = new JButton();
                b[n][m].setText(Integer.toString(0));
                b[n][m].setBackground(Color.WHITE);
                b[n][m].setFont(new Font("Arial", Font.BOLD, 20));
                b[n][m].setBounds(x,y,35,35);
                b[n][m].setMargin(new Insets(0, 0, 0, 0));
                panel.add(b[n][m]);
                no++;
                x+=60;
            }
            x=0;
            y+=60;
        }
        add(panel);
        int repeat ;
        
            while(true)
            {
                back:
                {
                repeat =0;
                int a = rand.nextInt(9)+1;
//                System.out.println("Top");
                System.out.println("*"+a+"*");
                for(int c:arr) // To check if the point a is already connected or not .
                {
                    if(a==c)
                        counter++; 
                }
                System.out.println("I am here at "+ a);
                // count starts from 1 beacuse of ease haha ..
                if(counter==0) //if a is not already connected ..
                {
                    if(count>1)
                    {
                    switch(a)
                    {
                        case 1:
                        {
//                            System.out.println("I am here at "+ a);
                            switch(arr[count-2])
                            {
                                case 3:
                                {
                                    for(int check : arr)
                                    {
                                        if(check==2)
                                            repeat ++;
                                    }
                                    if(repeat == 0)
                                        break back;
                                }
                                break;
                                case 7:
                                {
                                    for(int check : arr)
                                    {
                                        if(check==4)
                                            repeat ++;
                                    }
                                    if(repeat == 0)
                                        break back;
                                }
                                break;
                                case 9:
                                {
                                    for(int check : arr)
                                    {
                                        if(check==5)
                                            repeat ++;
                                    }
                                    if(repeat == 0)
                                        break back;
                                }
                                break;
                            }
                        }
//                        System.out.println("I stop here at "+ a);
                        break;
                        case 2:
                        {
//                            System.out.println("I am here at "+ a);
                            if(arr[count-2]==8)
                            {
                                for(int check : arr)
                                    {
                                        if(check==4)
                                            repeat ++;
                                    }
                                if(repeat == 0)
                                        break back;
                            }
                        }
//                        System.out.println("I stop here at "+ a);
                        break;
                        case 3:
                        {
//                            System.out.println("I am here at "+ a);
                            switch(arr[count-2])
                            {
                                case 1:
                                {
                                    for(int check : arr)
                                    {
                                        if(check==2)
                                            repeat ++;
                                    }
                                    if(repeat == 0)
                                        break back;
                                }
                                break;
                                case 7:
                                {
                                    for(int check : arr)
                                    {
                                        if(check==5)
                                            repeat ++;
                                    }
                                    if(repeat == 0)
                                        break back;
                                }
                                break;
                                case 9:
                                {
                                    for(int check : arr)
                                    {
                                        if(check==6)
                                            repeat ++;
                                    }
                                    if(repeat == 0)
                                        break back;
                                }
                                break;
                            }
//                            System.out.println("I stop here at "+ a);
                            break;
                        }
                        case 4:
                        {
//                            System.out.println("I am here at "+ a);
                            if(arr[count-2]==6)
                            {
                                for(int check : arr)
                                    {
                                        if(check==5)
                                            repeat ++;
                                    }
                                if(repeat == 0)
                                        break back;
                            }
                        }
//                        System.out.println("I stop here at "+ a);
                        break;
                        case 6:
                        {
//                            System.out.println("I am here at "+ a);
                            if(arr[count-2]==4)
                            {
                                for(int check : arr)
                                    {
                                        if(check==5)
                                            repeat ++;
                                    }
                                if(repeat == 0)
                                        break back;
                            }
                        }
//                        System.out.println("I stop here at "+ a);
                        break;
                        case 7:
                        {
//                            System.out.println("I am here at "+ a);
                            switch(arr[count-2])
                            {
                                case 1:
                                {
                                    for(int check : arr)
                                    {
                                        if(check==4)
                                            repeat ++;
                                    }
                                    if(repeat == 0)
                                        break back;
                                }
                                break;
                                case 3:
                                {
                                    for(int check : arr)
                                    {
                                        if(check==5)
                                            repeat ++;
                                    }
                                    if(repeat == 0)
                                        break back;
                                }
                                break;
                                case 9:
                                {
                                    for(int check : arr)
                                    {
                                        if(check==8)
                                            repeat ++;
                                    }
                                    if(repeat == 0)
                                        break back;
                                }
                                break;
                            }
                        }
//                        System.out.println("I stop here at "+ a);
                        break;
                        case 8:
                        {
//                            System.out.println("I am here at "+ a);
                            if(arr[count-2]==2)
                            {
                                for(int check : arr)
                                    {
                                        if(check==5)
                                            repeat ++;
                                    }
                                if(repeat == 0)
                                        break back;
                            }
                        }
//                        System.out.println("I stop here at "+ a);
                        break;
                        case 9:
                        {
//                            System.out.println("I am here at "+ a);
                            switch(arr[count-2])
                            {
                                case 1:
                                {
                                    for(int check : arr)
                                    {
                                        if(check==5)
                                            repeat ++;
                                    }
                                    if(repeat == 0)
                                        break back;
                                }
                                break;
                                case 3:
                                {
                                    for(int check : arr)
                                    {
                                        if(check==6)
                                            repeat ++;
                                    }
                                    if(repeat == 0)
                                        break back;
                                }
                                break;
                                case 7:
                                {
                                    for(int check : arr)
                                    {
                                        if(check==8)
                                            repeat ++;
                                    }
                                    if(repeat == 0)
                                        break back;
                                }
                                break;
                            }
                        }
//                        System.out.println("I stop here at "+ a);
                        break;
                    }
                    }
                    System.out.println("I am here at a = "+ a);
                    if(yn)
                        arr[count]=a;
                    else
                        arr[count-1]=a;
                    
//                    System.out.print(a+"    ");
//                    if(count %3 ==0)
//                        System.out.println();
                    count ++;
                }
                
                counter=0;
                if(count == length+1)
                    break;
//                System.out.println("Bottom");
            }
            }
            for(int a:arr)
            {
                if(a==1)
                    {
                        b[0][0].setText(Integer.toString(count));
                    }
                    else if (a==2)
                    {
                        b[0][1].setText(Integer.toString(count));
                    }
                    else if (a==3)
                    {
                        b[0][2].setText(Integer.toString(count));
                    }
                    else if (a==4)
                    {
                        b[1][0].setText(Integer.toString(count));
                    }
                    else if (a==5)
                    {
                        b[1][1].setText(Integer.toString(count));
                    }
                    else if (a==6)
                    {
                        b[1][2].setText(Integer.toString(count));
                    }
                    else if (a==7)
                    {
                        b[2][0].setText(Integer.toString(count));
                    }
                    else if (a==8)
                    {
                        b[2][1].setText(Integer.toString(count));
                    }
                    else if (a==9)
                    {
                        b[2][2].setText(Integer.toString(count));
                    }
            }
    
            panel.revalidate();
            panel.repaint();
    }
}
