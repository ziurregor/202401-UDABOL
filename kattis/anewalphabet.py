mapa_idioma  =  {
    "A" :  "@" ,
    "B" :  "8" ,
    "C" :  "(" ,
    "D" :  "|)" ,
    "E" :  "3" ,
    "F" :  "#" ,
    "G" :  "6" ,
    "H" :  "[-]" ,
    "Yo" :  "|" ,
    "J" :  "_|" ,
    "K" :  "|<" ,
    "L" :  "1" ,
    "M" :  "[] \\ /[]" ,
    "N" :  "[] \\ []" ,
    "O" :  "0" ,
    "P" :  "|D" ,
    "Q" :  "(,)" ,
    "R" :  "|Z" ,
    "S" :  "$" ,
    "T" :  "']['" ,
    "U" :  "|_|" ,
    "V" :  " \\ /" ,
    "W" :  " \\ / \\ /" ,
    "X" :  "}{" ,
    "Y" :  "`/" ,
    "Z" :  "2"
}


def  idioma ( s ) :
    o  =  orden ( s )
    si  97  <=  o  <=  122 :
        devolver  mapa_idioma [ chr ( o  -  32 )]
    si  65  <=  o  <=  90 :
        devolver  mapa_idioma [ s ]
    devoluciones ​


para  i  en  la entrada ( ) :
    imprimir ( idioma ( i ) ,  fin = '' )
