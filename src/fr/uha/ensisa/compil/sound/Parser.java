
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Feb 14 14:38:56 CET 2012
//----------------------------------------------------

package fr.uha.ensisa.compil.sound;

import fr.uha.ensisa.compil.sound.api.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Feb 14 14:38:56 CET 2012
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\023\000\002\002\002\000\002\002\004\000\002\002" +
    "\005\000\002\003\002\000\002\003\004\000\002\003\005" +
    "\000\002\003\005\000\002\004\002\000\002\004\005\000" +
    "\002\005\002\000\002\005\005\000\002\006\007\000\002" +
    "\006\004\000\002\006\007\000\002\006\005\000\002\006" +
    "\003\000\002\007\003\000\002\010\003\000\002\011\003" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\044\000\014\002\001\004\001\010\001\011\001\022" +
    "\001\001\002\000\014\002\007\004\ufffe\010\005\011\010" +
    "\022\011\001\002\000\014\006\013\007\014\013\016\014" +
    "\017\022\020\001\002\000\004\004\045\001\002\000\004" +
    "\002\000\001\002\000\016\006\ufffa\007\ufffa\013\ufffa\014" +
    "\ufffa\016\ufffa\022\ufffa\001\002\000\004\005\012\001\002" +
    "\000\014\006\013\007\014\013\016\014\017\022\020\001" +
    "\002\000\004\020\032\001\002\000\004\020\032\001\002" +
    "\000\004\004\ufffb\001\002\000\016\006\ufffa\007\ufffa\013" +
    "\ufffa\014\ufffa\016\ufffa\022\ufffa\001\002\000\004\017\021" +
    "\001\002\000\004\004\ufff2\001\002\000\004\015\ufff1\001" +
    "\002\000\004\015\023\001\002\000\016\006\ufffa\007\ufffa" +
    "\013\ufffa\014\ufffa\016\ufffa\022\ufffa\001\002\000\016\006" +
    "\013\007\014\013\016\014\017\016\026\022\020\001\002" +
    "\000\004\004\027\001\002\000\004\004\ufff4\001\002\000" +
    "\016\006\ufff9\007\ufff9\013\ufff9\014\ufff9\016\ufff9\022\ufff9" +
    "\001\002\000\016\006\013\007\014\013\016\014\017\016" +
    "\031\022\020\001\002\000\004\004\ufff3\001\002\000\006" +
    "\004\ufff0\012\ufff0\001\002\000\004\004\ufff5\001\002\000" +
    "\004\012\035\001\002\000\006\016\ufff8\021\ufff8\001\002" +
    "\000\006\016\040\021\041\001\002\000\004\004\042\001" +
    "\002\000\004\004\ufff6\001\002\000\004\004\uffef\001\002" +
    "\000\006\016\ufff7\021\ufff7\001\002\000\016\006\013\007" +
    "\014\013\016\014\017\016\044\022\020\001\002\000\004" +
    "\004\ufffc\001\002\000\014\002\uffff\004\uffff\010\uffff\011" +
    "\uffff\022\uffff\001\002\000\004\004\ufffd\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\044\000\004\002\003\001\001\000\004\003\005\001" +
    "\001\000\004\006\045\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\004\042\001\001\000\002\001\001\000" +
    "\004\006\014\001\001\000\004\010\033\001\001\000\004" +
    "\010\032\001\001\000\002\001\001\000\004\004\027\001" +
    "\001\000\004\007\021\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\004\023\001\001\000" +
    "\004\006\024\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\006\024\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\005\035\001\001\000\004\011\036\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\024\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP_actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP_actions();
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP_do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    
    public void report_error(String message, Object info) {
        StringBuffer m = new StringBuffer("Error");
		m.append(info.toString());
        m.append(" : " + message);
        System.err.println(m.toString());
    }
   
    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(1);
    }
	
	private SoundFactory soundFactory = new SoundFactory();
	private SoundPlayer soundPlayer = new SoundPlayer();
	private Map<String, AbstractSound> variables = new HashMap<String, AbstractSound> ();
	
	public void setValue (String name, AbstractSound value) {
		variables.put(name, value);
	}
	
	public AbstractSound getValue (String name) {
		AbstractSound value = null;
		if (variables.containsKey(name))
			value = variables.get(name);
		return value;
	}
	
	public void print(String s) {
		//System.out.println(s);
	}
	


/** Cup generated class to encapsulate user supplied action code.*/
class CUP_actions {

  /** Constructor */

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP_do_action(
    int                        CUP_act_num,
    java_cup.runtime.lr_parser CUP_parser,
    java.util.Stack            CUP_stack,
    int                        CUP_top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP_result;

      /* select the action based on the action number */
      switch (CUP_act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Note ::= NOTE 
            {
              String RESULT =null;
		String n = (String)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 print("note"); RESULT = n; 
              CUP_result = getSymbolFactory().newSymbol("Note",7, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Str ::= STRING 
            {
              String RESULT =null;
		String s = (String)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 print("string"); RESULT = s; 
              CUP_result = getSymbolFactory().newSymbol("Str",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Int ::= NUMBER 
            {
              Integer RESULT =null;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 print("number"); RESULT = n; 
              CUP_result = getSymbolFactory().newSymbol("Int",5, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Expr ::= VARIABLE 
            {
              AbstractSound RESULT =null;
		String n = (String)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 print("variable"); RESULT = getValue(n); 
              CUP_result = getSymbolFactory().newSymbol("Expr",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Expr ::= SEQUENCE SoundList END 
            {
              AbstractSound RESULT =null;
		List<AbstractSound> l = (List<AbstractSound>)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		 print("sequence"); RESULT = soundFactory.createSoundSequence(l); 
              CUP_result = getSymbolFactory().newSymbol("Expr",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Expr ::= REPEAT Int TIMES SoundList END 
            {
              AbstractSound RESULT =null;
		Integer c = (Integer)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-3)).value;
		List<AbstractSound> l = (List<AbstractSound>)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		 print("repeat"); RESULT = soundFactory.createSoundLoop(c, l); 
              CUP_result = getSymbolFactory().newSymbol("Expr",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Expr ::= IMPORT Str 
            {
              AbstractSound RESULT =null;
		String s = (String)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 print("import"); RESULT = soundFactory.createSoundFile(s); 
              CUP_result = getSymbolFactory().newSymbol("Expr",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Expr ::= LOAD Str WITH_NOTES NoteList END 
            {
              AbstractSound RESULT =null;
		String s = (String)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-3)).value;
		List<String> l = (List<String>)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		 print("load"); RESULT = soundFactory.createSoundMidi(s, l); 
              CUP_result = getSymbolFactory().newSymbol("Expr",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // NoteList ::= NoteList Note TERM 
            {
              List<String> RESULT =null;
		List<String> l = (List<String>)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		String n = (String)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		 print("list string add elements"); RESULT = l; if (n != null) l.add(n); 
              CUP_result = getSymbolFactory().newSymbol("NoteList",3, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // NoteList ::= 
            {
              List<String> RESULT =null;
		 print("create list string"); RESULT = soundFactory.createListNotes(); 
              CUP_result = getSymbolFactory().newSymbol("NoteList",3, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SoundList ::= SoundList Expr TERM 
            {
              List<AbstractSound> RESULT =null;
		List<AbstractSound> l = (List<AbstractSound>)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		AbstractSound e = (AbstractSound)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		 print("list sound add elements"); RESULT = l; if (e != null) l.add(e); 
              CUP_result = getSymbolFactory().newSymbol("SoundList",2, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SoundList ::= 
            {
              List<AbstractSound> RESULT =null;
		 print("create list sound"); RESULT = soundFactory.createListSounds(); 
              CUP_result = getSymbolFactory().newSymbol("SoundList",2, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Instruction ::= VARIABLE EQUAL Expr 
            {
              Object RESULT =null;
		String n = (String)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		AbstractSound v = (AbstractSound)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 print("affectation"); setValue(n, v); 
              CUP_result = getSymbolFactory().newSymbol("Instruction",1, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Instruction ::= PLAY_SIMULT SoundList END 
            {
              Object RESULT =null;
		List<AbstractSound> l = (List<AbstractSound>)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		 print("play_simult"); soundPlayer.playSoundSimult(l); 
              CUP_result = getSymbolFactory().newSymbol("Instruction",1, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Instruction ::= PLAY Expr 
            {
              Object RESULT =null;
		AbstractSound e = (AbstractSound)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 print("play"); soundPlayer.playSound(e); 
              CUP_result = getSymbolFactory().newSymbol("Instruction",1, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Instruction ::= 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("Instruction",1, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Instructions ::= Instructions Instruction TERM 
            {
              Object RESULT =null;
		Object inst = (Object)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		 print("list instructions"); 
              CUP_result = getSymbolFactory().newSymbol("Instructions",0, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Instructions EOF 
            {
              Object RESULT =null;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		RESULT = start_val;
              CUP_result = getSymbolFactory().newSymbol("$START",0, RESULT);
            }
          /* ACCEPT */
          CUP_parser.done_parsing();
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Instructions ::= 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("Instructions",0, RESULT);
            }
          return CUP_result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

}
