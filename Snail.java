public class Snail {
    public static int[] snail(int[][] array) {
        //check if empty
        if(array[0].length==0) return new int[]{};
      
        //create counter
        int counter = 0;
      
        //create an array thet we will return
        int elementsNumber = array.length * array.length;
        int[] result = new int[elementsNumber];
      
        //create borders
        int eastBorder = array.length-1;
        int southBorder = array.length-1;
        int westBorder = 0;
        int northBorder = 0;
          
        //move in a cycle of movements in 4 directions until counter did not reach the number of elements
        int[] position = {0,0};
        northBorder++;
      
        //every movement of the 4 is made until we reach the border
        //after reaching the border increase it by 1
        //when visiting every element put it into the resulting array
      
        while(counter<elementsNumber ) {
            //go east
            while(position[1]!=eastBorder && counter!=elementsNumber)  {
                result[counter] = array[position[0]][position[1]];
                counter++;
                position[1]++;
            }
            eastBorder--;


            //go south
            while(position[0]!=southBorder && counter!=elementsNumber)  {
                result[counter] = array[position[0]][position[1]];
                counter++;
                position[0]++;
            }
            southBorder--;


            //go west
            while(position[1]!=westBorder && counter!=elementsNumber)  {
                result[counter] = array[position[0]][position[1]];
                counter++;
                position[1]--;
            }
            westBorder++;


            //go north
            while(position[0]!=northBorder && counter!=elementsNumber)  {
                result[counter] = array[position[0]][position[1]];
                counter++;
                position[0]--;
            }
            northBorder++;


        }
        return result;
    }
}
Best Practices0Clever0
 0ForkCompare with your solutionLink
Stepan Andreev

public class Snail {
    public static int[] snail(int[][] array) {
        //проверка на пустоту
        if(array[0].length==0) return new int[]{};
      
        //сделать каунтер
        int counter = 0;
      
        //сделать результатный массив
        int elementsNumber = array.length * array.length;
        int[] result = new int[elementsNumber];
      
        //создать четыре границы, которые были бы "по нулям"
        int eastBorder = array.length-1;
        int southBorder = array.length-1;
        int westBorder = 0;
        int northBorder = 0;
          
        //пока каунтер не достиг числа элементов осуществлять четыре разных движения по очереди
        int[] position = {0,0};
        northBorder++;
      
        //каждое из четырёх движений это движение пока не достигнешь края
        //по достижению края нужно увеличить толщину края на 1
        //проходя каждый элемент нужно добавлять его в массив
      
        while(counter<elementsNumber ) {
            //go east
            while(position[1]!=eastBorder && counter!=elementsNumber)  {
                result[counter] = array[position[0]][position[1]];
                counter++;
                position[1]++;
            }
            eastBorder--;


            //go south
            while(position[0]!=southBorder && counter!=elementsNumber)  {
                result[counter] = array[position[0]][position[1]];
                counter++;
                position[0]++;
            }
            southBorder--;


            //go west
            while(position[1]!=westBorder && counter!=elementsNumber)  {
                result[counter] = array[position[0]][position[1]];
                counter++;
                position[1]--;
            }
            westBorder++;


            //go north
            while(position[0]!=northBorder && counter!=elementsNumber)  {
                result[counter] = array[position[0]][position[1]];
                counter++;
                position[0]--;
            }
            northBorder++;


        }
        return result;
    }
}
