// def flipCoin(num_of_flips):
//     heads = 0
//     for i in range(num_of_flips):
//         coin=random.randint(1, 2)
//         if coin==1:
//             heads += 1

//     percent = heads / num_of_flips
//     print(percent)

// flipCoin(100) # flip coin 100 times
// flipCoin(5000) # flip coin 5000 times

import java.util.*;
class Flip
{
    public static void main(String[] args){
double heads=0;
double tails=0;
double headsPercent=0;
double tailsPercent=0;
Random rand = new Random(); 


int posiInt =Integer.parseInt(args[0]);

for (int i=0; i< posiInt; i++){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter 0 or 1");
    int coin= sc.nextInt();
    if( coin==1)
    {
      heads += 1;
    }
    else
    {
        tails +=1;
    }
}
headsPercent =  heads/10.0;
tailsPercent = 100.0 - headsPercent;
System.out.println(" percentage of heads"+ " " + headsPercent);   
System.out.println(" percentage of tails"+ " " + tailsPercent); 
 }
}
