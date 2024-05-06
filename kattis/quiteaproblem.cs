using System;

namespace ProyectoDavalos
{
    class Program
    {
        static void Main(string[] args)
        {
            string s;

            while ((s = Console.ReadLine()) != null)
            {
                s = s.ToLower();

                if (s.Contains("problem"))
                {
                    Console.WriteLine("yes");
                }
                else
                {
                    Console.WriteLine("no");
                }
            }
        }
    }
}
