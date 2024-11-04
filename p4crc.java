package cnlab;
import java.io.*;
import java.util.Scanner;
class Crc
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter message bits: ");
String message = sc.nextLine();
System.out.print("Enter generator: ");
String generator = sc.nextLine();
int data[] = new int[message.length() +
generator.length() - 1];
int divisor[] = new int[generator.length()];
for(int i=0;i<message.length();i++)
data[i] = Integer.parseInt(message.charAt(i)+"");
for(int i=0;i<generator.length();i++)
divisor[i] =
Integer.parseInt(generator.charAt(i)+"");
for(int i=0;i<message.length();i++)
{
if(data[i]==1)
for(int j=0;j<divisor.length;j++) data[i+j] ^=
divisor[j];
}
System.out.print("The checksum code is: ");
for(int i=0;i<message.length();i++)
data[i] = Integer.parseInt(message.charAt(i)+"");
for(int i=0;i<data.length;i++)
System.out.print(data[i]);
System.out.println();
System.out.print("Enter checksum code: ");
message = sc.nextLine();
Computer Networks Laboratory- BCS502
Department of ISE Page 36
System.out.print("Enter generator: ");
generator = sc.nextLine();
data = new int[message.length() + generator.length() -1];
divisor = new int[generator.length()];
for(int i=0;i<message.length();i++)
data[i] = Integer.parseInt(message.charAt(i)+"");
for(int i=0;i<generator.length();i++)
divisor[i] =
Integer.parseInt(generator.charAt(i)+"");
for(int i=0;i<message.length();i++)
{
if(data[i]==1)
for(int j=0;j<divisor.length;j++) data[i+j] ^=
divisor[j];
}
boolean valid = true;
for(int i=0;i<data.length;i++)
if(data[i]==1)
{
valid = false;
break;
}
if(valid==true)
System.out.println("Data stream is valid");
else
System.out.println("Data stream is invalid. CRC
error occurred.");}}