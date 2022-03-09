public void choice2(){
		ArrayList<Integer> choiceCounter = new ArrayList<Integer>();//add the counter to this instead of variabless
		int tempchoiceCount = 0;
		
		for (int i = 0; i < 18; i++)
		{
			choiceCounter.add(0);
		}
		for (int j = 0; j < students.size(); j++)
		{
			for(int i = 1; i <= 18; i++)
			{
				if (students.get(j).choice.get(0) == i || students.get(j).choice.get(1) == i || students.get(j).choice.get(2) == i || students.get(j).choice.get(3) == i || students.get(j).choice.get(4) == i)
				{
					tempchoiceCount = choiceCounter.get(i - 1);
					choiceCounter.set(i - 1, tempchoiceCount+1);
					//need to figure out a way to add to the right counter
				}
			
			}
		}	
		System.out.print(choiceCounter);
	}
