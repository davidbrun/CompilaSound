package java_cup.runtime;

/**
 * Default Implementation for SymbolFactory, creates
 * plain old Symbols
 *
 * @version last updated 27-03-2006
 * @author Michael Petter
 */

/* *************************************************
  class DefaultSymbolFactory

  interface for creating new symbols  
 ***************************************************/
public class SimpleSymbolFactory implements SymbolFactory{
    // Factory methods
    /**
     * SimpleSymbolFactory for CUP and Flex.
     * Same as Default (illegally deprecated)
     */

	public SimpleSymbolFactory(){
    }

	public Symbol newSymbol(String name ,int id, Symbol left, Symbol right, Object value){
        return new Symbol(id,left,right,value);
    }
    
	public Symbol newSymbol(String name, int id, Symbol left, Symbol right){
        return new Symbol(id,left,right);
    }
    
	public Symbol newSymbol(String name, int id, int left, int right, Object value){
        return new Symbol(id,left,right,value);
    }
    
	public Symbol newSymbol(String name, int id, int left, int right){
        return new Symbol(id,left,right);
    }
    
	public Symbol startSymbol(String name, int id, int state){
        return new Symbol(id,state);
    }
    
	public Symbol newSymbol(String name, int id){
        return new Symbol(id);
    }
    
	public Symbol newSymbol(String name, int id, Object value){
        return new Symbol(id,value);
    }
}
