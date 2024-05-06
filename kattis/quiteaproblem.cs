namespace ProyectoDavalos
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            
                 string parrafo = "Problematic pair programming\r\n\"There's a joke that pairs, like fish and house guests, go\r\nrotten after three days,\" said Zach Brock, an engineering\r\nmanager.  Working out problems with a pairing partner can be\r\na lot like working out problems with a significant other.\r\nDuring one recent rough patch, Jamie Kite, a developer, sat\r\nher partner down for a talk. \"Hey, it feels like we're\r\ndriving in different directions,\" she recalls saying. \"It's\r\nlike any relationship,\" Ms.  Kite said. \"If you don't talk\r\nabout the problems, it's not going to work.\" When those\r\ntimeouts don't solve the problem, partners can turn to\r\non-staff coaches who can help with counseling.  \"People who\r\nhave been pairing a while, they'll start acting like old\r\nmarried couples,\" said Marc Phillips, one of the coaches.\r\nPeople can be as much of a challenge as writing software.\r\n(Excerpted from \"Computer Programmers Learn Tough Lesson in\r\nSharing\"; Wall Street Journal, August 27, 2012)\r\n";
                 string resultado = "";

                 string[] lineas = parrafo.Split(new[] { "\r\n", "\r", "\n" }, StringSplitOptions.None);

                foreach (string linea in lineas)
                {
                    
                if (linea.ToLower().Contains("problem"))
                    {

                    resultado =resultado+ "yes" + '\n';
                    }
                    else
                    {
                    resultado = resultado + "no" + '\n';
                }
               
                }
                MessageBox.Show(resultado);
        }
        
    }
}
