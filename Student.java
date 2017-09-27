import java.util.Scanner;
class Student
{
int a[][]=new int [5][2];
public void get()
{
for(int i=0;i<5;i++)
  {
     for(int j=0;j<2;j++)
     {
        Scanner obj=new Scanner(System.in);
        a[i][j]=obj.nextInt();
     }
  }
}
public int result(int a[5][2])
{
  int count=0;
  for(int i=0;i<5;i++)
  {
     if(a[i][0]>5.5&&a[i][1]<80)
     count++;
  }
return count;
}
public static void main(String args[])
{ 
  int x;
  Student s=new Student();
  s.get();
  x=s.result(a[5][2]);
 System.out.println(x);
}

}