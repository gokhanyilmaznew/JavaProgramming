package day20_Arrays;
/*2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
*/
public class PracticeTask2 {
    public static void main(String[] args) {

        String[] names = {"Marcel Proust", "Zygmunt Bauman", "Kurt Cobain", "Emile Durkheim", "Sigmund Freud", "Mark Twain", "Harper Lee", "Truman Capote", "Haruki Murakami", "Oscar Wilde"};

        for (int i = 0; i < names.length; i++) {
            String reverseClassmateName = "";
            for (int i1 = names[i].length() - 1; i1 >= 0; i1--) {
                reverseClassmateName += names[i].charAt(i1);
            }
            System.out.println(reverseClassmateName);
        }

    }
}






