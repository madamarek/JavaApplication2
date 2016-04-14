/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Mateusz
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int i,j,liczbaZnakow,k;

liczbaZnakow=5;
for(i=0;i<liczbaZnakow;i++)
{
	for(k=i;k<liczbaZnakow;k++)
		System.out.print(" ");
	for(j=0;j<i;j++)
		System.out.print("* ");
	System.out.println();
}
for(i=0;i<liczbaZnakow;i++)
{
	for(j=0;j<i;j++)
		System.out.print(" ");
	for(k=i;k<liczbaZnakow;k++)
		System.out.print("* ");
	System.out.println();
}
    }
    
}
