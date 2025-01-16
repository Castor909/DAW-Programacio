import java.util.HashMap;
import java.util.Map;

public class SimpleAssembler {
  
  static HashMap<String, Integer> registers;
  
  public static int getArgumentValue(String argument) {
    try  { return Integer.parseInt(argument); }  catch (NumberFormatException e)  { return registers.get(argument); }
  }
  
  public static Map<String, Integer> interpret(String[] program)  { 
    registers = new HashMap<>();
    for(int i = 0; i < program.length;i++)  {
      String[] instruction = program[i].split(" ");
      switch(instruction[0])  {
          case "mov" -> { registers.put(instruction[1], getArgumentValue(instruction[2])); }
          case "inc" -> { registers.put(instruction[1], registers.getOrDefault(instruction[1], 0) + 1); }
          case "dec" -> { registers.put(instruction[1], registers.getOrDefault(instruction[1], 0) - 1); }
          case "jnz" -> { if(getArgumentValue(instruction[1]) != 0) i+=getArgumentValue(instruction[2])-1; }
      }
    }
    return registers;
  }
}
