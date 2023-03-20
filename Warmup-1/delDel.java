
/*Dada uma string, se a string "del" aparecer começando no índice 1,
 retorne uma string onde esse "del" foi deletado. 
 Caso contrário,  retorne a string inalterada.

    delDel("adelbc") → "abc"
    delDel("adelOlá") → "aOlá"
    delDel("adedbc") → "adedbc" */


public class delDel {
    public String delDel(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
        // Primeiro caracter + resto da string começando em 4           
        return str.substring(0, 1) + str.substring(4);
        }
          // Caso contrário, retorne a string original. 

        return str;
    }
    
}
