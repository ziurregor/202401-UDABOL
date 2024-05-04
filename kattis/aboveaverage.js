const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

function calcularPromedio(numeros) {
  const suma = numeros.reduce(
    (acumulador, valorActual) => acumulador + valorActual,
    0
  );
  return suma / numeros.length;
}

function redondearATresDecimales(numero) {
  return Math.round(numero * 1000) / 1000;
}

function porcentajeSobrePromedio(casosPrueba) {
  for (let i = 0; i < casosPrueba.length; i++) {
    const casoPrueba = casosPrueba[i];
    const cantidadPersonasClase = casoPrueba[0];
    const calificaciones = casoPrueba.slice(1);

    const promedio = calcularPromedio(calificaciones);
    let cantidadSobrePromedio = 0;

    for (let j = 0; j < cantidadPersonasClase; j++) {
      if (calificaciones[j] > promedio) {
        cantidadSobrePromedio++;
      }
    }

    const porcentajeSobrePromedio =
      (cantidadSobrePromedio / cantidadPersonasClase) * 100;
    console.log(
      redondearATresDecimales(porcentajeSobrePromedio).toFixed(3) + "%"
    );
  }
}

// Lectura de la entrada
let casosPrueba = [];
let casosPruebaRestantes = 0;

rl.on("line", (entrada) => {
  if (casosPruebaRestantes === 0) {
    casosPruebaRestantes = parseInt(entrada);
  } else {
    const casoPrueba = entrada.split(" ").map((num) => parseInt(num));
    casosPrueba.push(casoPrueba);
    casosPruebaRestantes--;
    if (casosPruebaRestantes === 0) {
      porcentajeSobrePromedio(casosPrueba);
      rl.close();
    }
  }
});
