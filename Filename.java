&/public class TaskB{
	private static math(){
		double beta = 0;
		for (double x = -6; x <= 2, x += 0.5){
			
			if (x/2 <= -2 || x/2 > 0.2){
				System.out.println('If x/2 = %1.2f Function is out of ident area, a = %1.4d', x/2, alpha);
			}
			
			if(x/2 < -1 || x/2 > -2){
				beta = Math.sin(Math.pow(x, 2)+2.74);
				double alpha = Math.log10(Math.abs(beta + 2.74));
				System.out.printf('if x/2 = %1.2f alpha = %1.4d', x/2, alpha);
			}
			if(x/2 < 0.2 || x/2 > -1){
				beta = Math.cos(Math.pow(x, 2)+2.74);
				double alpha = Math.log10(Math.abs(beta + 2.74));
				System.out.printf('if x/2 = %1.2f alpha = %1.4d', x/2, alpha);
			}
			if(x/2 == 0.2){
				beta = 1 / Math.tan(Math.pow(x, 2)+2.74);
				double alpha = Math.log10(Math.abs(beta + 2.74));
				System.out.printf('if x/2 = %1.2f alpha = %1.4d', x/2, alpha);
			}
	}	
}