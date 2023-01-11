package Exercise;

public class Testlncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		int iInc;

		// demonstrate postfix increment operator
		iInc = i++;
		System.out.println("demonstrate postfix increment operator " + "iInc = " + iInc + ", i = " + i);

		// demonstrate prefix increment operator
		i = 5;
		iInc = ++i;
		System.out.println("demonstrate prefix increment operator " + "iInc = " + iInc + ", i = " + i);
	}

}
