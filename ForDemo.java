package Java_20191120;

public class ForDemo {
	public static void main(String[] args) {
		String str = "hello";
		int a1 = 10;
		int a2 = 20;
		double d1 = 12.4567;
		System.out.printf("%s , %d, %d, %.2f %n", str, a1, a2, d1);
		System.out.printf(str + " , " + a1 + " , " + a2 + ", " + d1);

		int sum = 0;
		long start = System.currentTimeMillis();
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("경과 시간 : " + (end - start));
		System.out.printf("1부터 100까지 합은 %d 입니다. %n", sum);
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("2 * %d = %d%n",i, 2*i);
		}
		
		for (int first = 2; first <= 9; first++) {
			for (int second =1; second < 9; second++){			
				System.out.printf("%d + %d = %d%n",
						first, second, first*second);
			
			}
		}
		
		for (int first = 9; first <= 2; first++) {
			for (int second =1; second < 9; second++){			
				System.out.printf("%d + %d = %d%n",
						first, second, first*second);
			
			}
		}
	}
}

for (int first = "*"; first <= 5; first++) {
	for (int second ="*"; second <= 4; second++){
		for (int three ="*"; three <= 3; three++){
			for (int four = "*"; four <= 2; four++){
			}
		}
	}
}
			}
		}

	

