package testproject;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SampleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={5, 9, 1, 6 , 2, 3, 8, 2, 3, 4, 5, 1, 6, 7, 8, 2, 1};
		//op:-9,4
		
		Map<Integer,Integer> umap= new LinkedHashMap();
		for(int i=0;i<arr.length;i++)
		{
			if(umap.get(arr[i])==null)
			{
				umap.put(arr[i], 1);
			}
			else
			{
				umap.put(arr[i], umap.get(arr[i])+1);
			}
		}
		int count=0;
		for(Entry<Integer,Integer> entry:umap.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey());
				count++;
				if(count==2)
				{
					break;
				}
			}
		}

	}
	

}
