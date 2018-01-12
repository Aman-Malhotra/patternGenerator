
import java.util.*;
import java.io.*;


class arayInput
{
    public static void main(String args[])
    {
        Scanner aman = new Scanner(System.in);
        int ar[]= new int[9];
        int counter =0,count =0,length=0,repeat;
        System.out.println("Enter the length of aray you want to tell ");
        int n = aman.nextInt();
        for(int i=0;i<9;i++ )
            {
                ar[i]= aman.nextInt();
            }
        Random rand = new Random();
        
        
        while(true)
            {
                back:
                {
                repeat =0;
                int a = rand.nextInt(9)+1;
                for(int c:ar) // To check if the point a is already connected or not .
                {
                    if(a==c)
                        counter++; 
                }   
                
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
                            switch(ar[count-2])
                            {
                                case 3:
                                {
                                    for(int check : ar)
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
                                    for(int check : ar)
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
                                    for(int check : ar)
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
                            if(ar[count-2]==8)
                            {
                                for(int check : ar)
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
                            switch(ar[count-2])
                            {
                                case 1:
                                {
                                    for(int check : ar)
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
                                    for(int check : ar)
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
                                    for(int check : ar)
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
                            if(ar[count-2]==6)
                            {
                                for(int check : ar)
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
                        case 5:
                        {
                            repeat++;
                        }
                        break;
                        case 6:
                        {
//                            System.out.println("I am here at "+ a);
                            if(ar[count-2]==4)
                            {
                                for(int check : ar)
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
                            switch(ar[count-2])
                            {
                                case 1:
                                {
                                    for(int check : ar)
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
                                    for(int check : ar)
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
                                    for(int check : ar)
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
                            if(ar[count-2]==2)
                            {
                                for(int check : ar)
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
                            switch(ar[count-2])
                            {
                                case 1:
                                {
                                    for(int check : ar)
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
                                    for(int check : ar)
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
                                    for(int check : ar)
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
                    
                    ar[count-1]=a;
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
        
    }
}