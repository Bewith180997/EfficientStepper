public class EfficientStepper
{

	public static void main(String[] args) throws Throwable
	{

		System.out.println("Number of Steps required: " + returnSteps(10, 85, 30));
		System.out.println("Number of Steps required: " + returnStepsAdd(10, 85, 30));
		System.out.println("Number of Steps required: " + returnStepsEff(10, 85, 30));

		System.out.println("Number of Steps required: " + returnSteps(10, 850000000, 30));
		System.out.println("Number of Steps required: " + returnStepsAdd(10, 850000000, 30));
		System.out.println("Number of Steps required: " + returnStepsEff(10, 850000000, 30));
	}

	public static int returnSteps(int start, int fin, int distance) throws Throwable
	{
		if (fin < start)
		{

			throw new Exception("Start number should be lower than Finish number");
		}

		int jumps = 0;

		do
		{
			fin -= distance;
			jumps++;

		} while (fin > start);
		return jumps;

	}

	public static int returnStepsAdd(int start, int fin, int distance) throws Throwable
	{
		if (fin < start)
		{

			throw new Exception("Start number should be lower than Finish number");
		}

		int jumps = 0;

		do
		{
			start += distance;
			jumps++;

		} while (fin > start);
		return jumps;
	}

	public static int returnStepsEff(int start, int fin, int distance) throws Throwable
	{
		if (fin < start)
		{

			throw new Exception("Start number should be lower than Finish number");
		}

		int jumps = 0;

		int scale = fin / distance;
		if (scale < 1)
		{
			scale = 1;
		}

		do
		{
			fin -= distance * scale;
			if (fin + distance < start)
			{
				fin += distance * scale;

			}

			jumps += scale;
			scale--;
		} while (fin > start);
		return jumps;

	}

	public static int returnStepsSmall(int start, int fin, int distance) throws Throwable
	{
		if (fin < start)
		{

			throw new Exception("Start number should be lower than Finish number");
		}

		int jumps = 0;

		int scale = fin / distance;
		if (scale < 1)
		{
			scale = 1;
		}

		do
		{

			fin -= distance * scale;
			if (fin + distance < start)
			{
				fin += distance * scale;
			}

			jumps += scale;
			scale--;
		} while (fin > start);
		return jumps;

	}

}
