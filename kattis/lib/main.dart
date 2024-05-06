import 'dart:collection';
import 'dart:io';

void main() {
  int testCases = int.parse(stdin.readLineSync()!);

  for (int i = 0; i < testCases; i++) {
    List<String> input = stdin.readLineSync()!.split(' ');
    int start = int.parse(input[0]);
    int end = int.parse(input[1]);
    print(primePath(start, end));
  }
}

bool isPrime(int n) {
  if (n <= 1) return false;
  if (n <= 3) return true;
  if (n % 2 == 0 || n % 3 == 0) return false;
  int i = 5;
  while (i * i <= n) {
    if (n % i == 0 || n % (i + 2) == 0) return false;
    i += 6;
  }
  return true;
}

int primePath(int start, int end) {
  Queue<List<int>> queue = Queue();
  Set<int> visited = Set();

  queue.add([start, 0]);
  visited.add(start);

  while (queue.isNotEmpty) {
    List<int> current = queue.removeFirst();
    int currentNum = current[0];
    int cost = current[1];

    if (currentNum == end) {
      return cost;
    }

    String digits = currentNum.toString();
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 10; j++) {
        List<String> newDigits = digits.split('');
        newDigits[i] = j.toString();
        int newNumber = int.parse(newDigits.join(''));

        if (newNumber != currentNum &&
            isPrime(newNumber) &&
            !visited.contains(newNumber)) {
          visited.add(newNumber);
          queue.add([newNumber, cost + 1]);
        }
      }
    }
  }

  return -1;
}
