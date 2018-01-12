
import java.util.*;


class patternCall
{
    int no=1,x=0,y=0,count =1,counter=0,repeat;
    Random rand = new Random();
    int arr[] = new int[9];
    
    public int[] nextNum(int length)
    {
        
        while(true)
            {
                back:
                {
                repeat =0;
                int a = rand.nextInt(9)+1;
//                System.out.println("Top");
//                System.out.println("*"+a+"*");
                for(int c:arr) // To check if the point a is already connected or not .
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
                        case 5:
                        {
                            repeat++;
                        }
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
        return arr;
    }
}