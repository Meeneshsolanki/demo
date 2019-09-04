class Table 
{
void printftable (int n)
{
for(int i=1;i<=5;i++)
{
system.out.println(n*i);
try
{
thread.sleep(400);
}
catch(exception e)
{
system.out.print.ln(e);
}
}
}
class MyThread1 extends Thread
{
Table t;
MyTable(table t)
{ 
   this.t=t;
}

public void run()
{
t.printTable(10);
}
}   
class MyThread2 extends Thread
{
Table t;
MyThread2(Table t)
{
this.t=t;
}
public void run()
{
t.printtable(20);
}
}
class Toy
{
public static void main(string args[])
{
Table obj=new Table();
MyThread1= t1.MyThread(obj);
MyThread1= t2.MyThread(obj);
t1.start();
t2.start();
Table obj=new Table();
MyThread1 obj =new MyThread1();
MyThread2 obj =new MyThread2();
}
}	
	
