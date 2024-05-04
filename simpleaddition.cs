using System;

class Program
{
    static void Main(string[] args)
    {  
        string num1 = Console.ReadLine();

        string num2 = Console.ReadLine();
        
        string suma = Adicion(num1, num2);

        Console.WriteLine(suma);
        
    }

    static string Adicion(string num1, string num2)
    {
        
        int max = Math.Max(num1.Length, num2.Length);

        int[] resultado = new int[max + 1];

        int num = 0;

        for (int i = 0; i < max; i++)
        {
            int digit1 = i < num1.Length ? num1[num1.Length - 1 - i] - '0' : 0;
            int digit2 = i < num2.Length ? num2[num2.Length - 1 - i] - '0' : 0;

            int sum = digit1 + digit2 + num;

            resultado[resultado.Length - 1 - i] = sum % 10;
            num = sum / 10; 
        }

       
        if (num > 0)
        {
            resultado[0] = num; 
        }

        
        string sumaString = string.Join("", resultado);

        
        sumaString = sumaString.TrimStart('0');

        
        if (sumaString == "")
        {
            sumaString = "0";
        }

        return sumaString;
    }
}