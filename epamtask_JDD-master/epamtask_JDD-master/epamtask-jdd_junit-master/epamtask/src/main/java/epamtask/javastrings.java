package epamtask;

import java.util.*;
//import java.lang.String;
public class javastrings {
		public String main1(String s1) {
			int k=0;
			String s2 = "";
			char[] s = new char[s1.length()];
			for(int i=0;i<s1.length();i++) {
				 s[i] = s1.charAt(i);
			}
			if(s[0] == 'a' || s[0] == 'A' ) {
				k = 1;
			}
			else if((s[0] == 'a' || s[0] == 'A')&&(s[1] == 'a' || s[1] == 'A')) {
				k = 2;
			}
			for(int i=k;i<s1.length();i++) {
				s2 = s2 + s[i];
			}
			//System.out.print(s2);
			return(s2);
	}
}