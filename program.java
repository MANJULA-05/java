using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace Rextester
{
    public class Program
    {
        
public void reverse()
        {
            string input;
            it= Console.ReadLine();
            char[] inputarray = it.ToCharArray();
            Array.Sort(inputarray);

            string ot = new string(inputarray);
            Console.WriteLine("op1\t\t{0}", ot);
        }
        
        public static void Main(string[] args)
        {
              Program pg = new Program();
             pg.reverse();
        }
    }
}