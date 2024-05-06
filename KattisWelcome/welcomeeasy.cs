using System;

class Program
{
    static string CountOccurrences(string text)
    {
        // Definimos la frase que queremos buscar
        string phrase = "welcome to code jam";

        // Creamos un array para contar las ocurrencias, inicializado en 0
        int[] count = new int[phrase.Length + 1];
        count[0] = 1;

        // Recorremos el texto
        foreach (char c in text)
        {
            // Recorremos la frase de atrás hacia adelante
            for (int j = phrase.Length - 1; j >= 0; j--)
            {
                // Si el carácter actual del texto coincide con el carácter correspondiente de la frase
                if (c == phrase[j])
                {
                    // Aumentamos el contador de ocurrencias
                    count[j + 1] += count[j];
                }
            }
        }

        // Devolvemos el número de ocurrencias como una cadena de cuatro dígitos, rellenando con ceros si es necesario
        return count[phrase.Length].ToString().PadLeft(4, '0');
    }

    static void Main(string[] args)
    {
        // Número de casos de prueba
        int T = int.Parse(Console.ReadLine());

        // Lectura de entrada y procesamiento
        for (int caseNum = 1; caseNum <= T; caseNum++)
        {
            string text = Console.ReadLine();
            string result = CountOccurrences(text);

            // Imprimimos el resultado en el formato adecuado
            Console.WriteLine($"Case #{caseNum}: {result}");
        }
    }
}
