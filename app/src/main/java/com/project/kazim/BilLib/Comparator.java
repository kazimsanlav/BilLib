package com.project.kazim.BilLib;

public class Comparator {

	String topline_call="",secondline_call="",thirdline_call="",topline_range="",secondline_range="",thirdline_range ="";
	
	public int CompareTo (String c, String r)
	{
		String call = c.toUpperCase();
		String range = r.toUpperCase();

		

		/*
		 * Each call number is arranged into at least two lines. We refer to the first line as the top line. The
			second line will always begin directly after the “cutter” symbol. A cutter symbol is a period followed by a
			letter. Some call numbers have a third line. This line will not have a separate cutter symbol. There is only
			one cutter symbol per call number. 	
		 */
		if(range.indexOf('.')<0)//if no dot 
		{
			topline_range=range;
		}
		else 
		{
			topline_range=range.substring(0, range.indexOf('.'));
			secondline_range=range.substring(range.indexOf('.')+1, range.length());//******
			if(Character.isDigit(secondline_range.charAt(0)))
			{
				if(secondline_range.indexOf('.')<0)//if no dot 
				{
					topline_range=range;
				}
				else
				{
					int dot = secondline_range.indexOf('.');
					topline_range += secondline_range.substring(0, dot);
					secondline_range = secondline_range.substring(dot+1);
				}

			}

		}

		if(call.indexOf('.')<0)//if no dot 
		{
			topline_call=call;
		}
		else 
		{
			topline_call=call.substring(0, call.indexOf('.'));
			secondline_call=call.substring(call.indexOf('.')+1, call.length());//******
			if(Character.isDigit(secondline_call.charAt(0)))
			{
				if(secondline_call.indexOf('.')<0)//if no dot 
				{
					topline_call=call;
				}
				else
				{
					int dot = secondline_call.indexOf('.');
					topline_call += secondline_call.substring(0, dot);
					secondline_call = secondline_call.substring(dot+1);
				}

			}

		}
		/////////////////////////////TOPLINE/////////////////////////////
		String text_topline_range="";
		String text_topline_call="";
		String num_topline_range="";
		String num_topline_call="";

		int size_topline_range = topline_range.length();
		int size_topline_call = topline_call.length();
		int min = Math.min(size_topline_range, size_topline_call);

		for(int i=0; i<size_topline_call; i++)//define numeric and alphabetic part
		{
			char call_ch = topline_call.charAt(i);
			if(Character.isLetter(call_ch))
				text_topline_call+=call_ch;
			else if(Character.isDigit(call_ch) || call_ch=='.' )
				num_topline_call+=call_ch;
		}
		for(int i=0; i<size_topline_range; i++)//define numeric and alphabetic part
		{
			char range_ch = topline_range.charAt(i);
			if(Character.isLetter(range_ch))
				text_topline_range+=range_ch;
			else if(Character.isDigit(range_ch) || range_ch=='.' )
				num_topline_range+=range_ch;
		}

		if(text_topline_call.compareTo(text_topline_range)<0)//look alfabetic
			return -1;
		else if(text_topline_call.compareTo(text_topline_range)>0)
			return 1;
		if(!num_topline_call.equals(num_topline_range))//look numbers
		{
			if(num_topline_call.isEmpty())
				return -1;
			if(num_topline_range.isEmpty())
				return 1;


			int num_topline_call_base, num_topline_call_decimal;
			if(num_topline_call.contains("."))
			{
				num_topline_call_base=Integer.parseInt(num_topline_call.substring(0,num_topline_call.indexOf('.')));
				num_topline_call_decimal=Integer.parseInt(num_topline_call.substring(num_topline_call.indexOf('.')+1,num_topline_call.length()));
			}
			else
			{
				num_topline_call_base = Integer.parseInt(num_topline_call);
				num_topline_call_decimal = 0;

			}


			int num_topline_range_base, num_topline_range_decimal;
			if(num_topline_range.contains("."))
			{
				num_topline_range_base=Integer.parseInt(num_topline_range.substring(0,num_topline_range.indexOf('.')));
				num_topline_range_decimal=Integer.parseInt(num_topline_range.substring(num_topline_range.indexOf('.')+1,num_topline_range.length()));
			}
			else
			{
				num_topline_range_base = Integer.parseInt(num_topline_range);
				num_topline_range_decimal = 0;

			}



			if(num_topline_call_base<num_topline_range_base)
				return -1;
			if(num_topline_call_base>num_topline_range_base)
				return 1;
			if(num_topline_call_base==num_topline_range_base)
			{
				if(num_topline_call_decimal<num_topline_range_decimal)
					return -1;
				if(num_topline_call_decimal>num_topline_range_decimal)
					return 1;
			}
		}


		/////////////////////////////SECONDLINE/////////////////////////////
		int size_secondline_call = secondline_call.length();
		int size_secondline_range = secondline_range.length();
		

		int min2 = Math.min(size_secondline_range, size_secondline_call);

		for(int i=0; i<min2; i++)// .A343B5 goes before  .A3435G8 
			
		{
			if(Character.isDigit(secondline_call.charAt(i)) && (Character.isLetter(secondline_range.charAt(i))) && (secondline_call.substring(0,i).equals(secondline_range.substring(0,i))))
			{
				if(Character.isLetter(secondline_range.charAt(i-1)))
					return -1;
				else 
					return 1;
			}

			if(Character.isLetter(secondline_call.charAt(i)) && (Character.isDigit(secondline_range.charAt(i))) && (secondline_call.substring(0,i).equals(secondline_range.substring(0,i))))
			{
				if(Character.isLetter(secondline_call.charAt(i-1)))
					return 1;
				else 
					return -1;
			}
		}
		
		if(secondline_call.compareTo(secondline_range)<0)
			return -1;
		if(secondline_call.compareTo(secondline_range)>0)
			return 1;
		

		return 0;//if everything same they are equal

	}

}
