const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// Función para verificar si un número es primo
function esPrimo(num) {
  if (num < 2) return false;
  if (num === 2) return true;
  if (num % 2 === 0) return false;

  const sqrt = Math.sqrt(num);
  for (let i = 3; i <= sqrt; i += 2) {
    if (num % i === 0) return false;
  }
  return true;
}

// Función para generar todos los números primos de 4 dígitos
function generarPrimos() {
  const primos = [];
  for (let i = 1000; i <= 9999; i++) {
    if (esPrimo(i)) {
      primos.push(i);
    }
  }
  return primos;
}

// Función para calcular el costo de cambiar un dígito
function calcularCosto(a, b) {
  let costo = 0;
  const aStr = a.toString();
  const bStr = b.toString();

  for (let i = 0; i < 4; i++) {
    if (aStr[i] !== bStr[i]) {
      costo++;
    }
  }
  return costo;
}

// Función para encontrar el camino de menor costo usando búsqueda en anchura
function caminoMinimoCosto(inicio, fin, primos) {
  const visitados = new Set();
  const cola = [[inicio, [inicio], 0]];
  visitados.add(inicio);

  while (cola.length > 0) {
    const [actual, camino, costo] = cola.shift();

    if (actual === fin) {
      return costo;
    }

    for (const vecino of primos) {
      if (!visitados.has(vecino) && calcularCosto(actual, vecino) === 1) {
        visitados.add(vecino);
        cola.push([vecino, [...camino, vecino], costo + 1]);
      }
    }
  }

  return 'Impossible';
}

// Función principal
function main() {
  let casos;
  rl.once('line', (line) => {
    casos = parseInt(line, 10);
    resolverCasos();
  });

  function resolverCasos() {
    if (casos === 0) {
      rl.close();
      return;
    }

    rl.once('line', (line) => {
      const [inicio, fin] = line.split(' ').map(Number);
      const primos = generarPrimos();
      const costo = caminoMinimoCosto(inicio, fin, primos);
      console.log(costo);
      casos--;
      resolverCasos();
    });
  }
}

main();