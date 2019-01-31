
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Jan 30 22:20:26 CST 2019
//----------------------------------------------------

package Analizadores;

import Compiler.*;
import java_cup.runtime.*;
import java.util.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Jan 30 22:20:26 CST 2019
  */
public class SintacticoParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public SintacticoParser() {super();}

  /** Constructor which sets the default scanner. */
  public SintacticoParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public SintacticoParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\015\000\002\002\004\000\002\007\002\000\002\002" +
    "\004\000\002\010\002\000\002\011\002\000\002\003\007" +
    "\000\002\004\004\000\002\004\003\000\002\005\005\000" +
    "\002\005\003\000\002\006\003\000\002\006\003\000\002" +
    "\006\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\023\000\004\004\000\001\002\000\004\004\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\012\004\ufffe\010\ufffe\011\ufffe\012\ufffe\001\002\000" +
    "\004\002\uffff\001\002\000\012\004\007\010\015\011\017" +
    "\012\013\001\002\000\014\004\007\005\ufffd\010\015\011" +
    "\017\012\013\001\002\000\004\006\ufff5\001\002\000\014" +
    "\004\ufffa\005\ufffa\010\ufffa\011\ufffa\012\ufffa\001\002\000" +
    "\004\006\ufff7\001\002\000\004\006\021\001\002\000\004" +
    "\006\ufff6\001\002\000\014\004\ufff8\005\ufff8\010\ufff8\011" +
    "\ufff8\012\ufff8\001\002\000\004\007\022\001\002\000\014" +
    "\004\ufff9\005\ufff9\010\ufff9\011\ufff9\012\ufff9\001\002\000" +
    "\014\004\ufffb\005\ufffb\010\ufffb\011\ufffb\012\ufffb\001\002" +
    "\000\004\005\025\001\002\000\016\002\ufffc\004\ufffc\005" +
    "\ufffc\010\ufffc\011\ufffc\012\ufffc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\023\000\006\002\004\007\003\001\001\000\004\003" +
    "\007\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\010\010\001\001\000\002\001\001\000\012\003\017\004" +
    "\011\005\013\006\015\001\001\000\012\003\017\005\022" +
    "\006\015\011\023\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$SintacticoParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$SintacticoParser$actions(this);
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
    return action_obj.CUP$SintacticoParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$SintacticoParser$actions {


    //se declaran variables globales etc.
    public Entorno sup;
    public Entorno guardado;
    public int contador = 0;

  private final SintacticoParser parser;

  /** Constructor */
  CUP$SintacticoParser$actions(SintacticoParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$SintacticoParser$do_action(
    int                        CUP$SintacticoParser$act_num,
    java_cup.runtime.lr_parser CUP$SintacticoParser$parser,
    java.util.Stack            CUP$SintacticoParser$stack,
    int                        CUP$SintacticoParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$SintacticoParser$result;

      /* select the action based on the action number */
      switch (CUP$SintacticoParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // T ::= booL 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()).right;
		token x = (token)((java_cup.runtime.Symbol) CUP$SintacticoParser$stack.peek()).value;
		 RESULT = x.getCadena(); 
              CUP$SintacticoParser$result = parser.getSymbolFactory().newSymbol("T",4, ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), RESULT);
            }
          return CUP$SintacticoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // T ::= chaR 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()).right;
		token x = (token)((java_cup.runtime.Symbol) CUP$SintacticoParser$stack.peek()).value;
		 RESULT = x.getCadena(); 
              CUP$SintacticoParser$result = parser.getSymbolFactory().newSymbol("T",4, ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), RESULT);
            }
          return CUP$SintacticoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // T ::= inT 
            {
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()).right;
		token x = (token)((java_cup.runtime.Symbol) CUP$SintacticoParser$stack.peek()).value;
		 RESULT = x.getCadena(); 
              CUP$SintacticoParser$result = parser.getSymbolFactory().newSymbol("T",4, ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), RESULT);
            }
          return CUP$SintacticoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // INST ::= B 
            {
              Object RESULT =null;
		    
              CUP$SintacticoParser$result = parser.getSymbolFactory().newSymbol("INST",3, ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), RESULT);
            }
          return CUP$SintacticoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // INST ::= T id pyc 
            {
              Object RESULT =null;
		int tipoleft = ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.elementAt(CUP$SintacticoParser$top-2)).left;
		int tiporight = ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.elementAt(CUP$SintacticoParser$top-2)).right;
		Object tipo = (Object)((java_cup.runtime.Symbol) CUP$SintacticoParser$stack.elementAt(CUP$SintacticoParser$top-2)).value;
		int idenleft = ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.elementAt(CUP$SintacticoParser$top-1)).left;
		int idenright = ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.elementAt(CUP$SintacticoParser$top-1)).right;
		token iden = (token)((java_cup.runtime.Symbol) CUP$SintacticoParser$stack.elementAt(CUP$SintacticoParser$top-1)).value;
		
                    Simbolo s = new Simbolo();
                    s.type = (String)tipo;
                    s.name = iden.getCadena();
                    this.sup.put(iden.getCadena(), s);

                  
              CUP$SintacticoParser$result = parser.getSymbolFactory().newSymbol("INST",3, ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.elementAt(CUP$SintacticoParser$top-2)), ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), RESULT);
            }
          return CUP$SintacticoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // L ::= INST 
            {
              Object RESULT =null;

              CUP$SintacticoParser$result = parser.getSymbolFactory().newSymbol("L",2, ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), RESULT);
            }
          return CUP$SintacticoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // L ::= L INST 
            {
              Object RESULT =null;

              CUP$SintacticoParser$result = parser.getSymbolFactory().newSymbol("L",2, ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.elementAt(CUP$SintacticoParser$top-1)), ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), RESULT);
            }
          return CUP$SintacticoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // B ::= alla NT$1 L NT$2 clla 
            {
              Object RESULT =null;
              // propagate RESULT from NT$2
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$SintacticoParser$stack.elementAt(CUP$SintacticoParser$top-1)).value;
		
                    this.sup = this.guardado;

                
              CUP$SintacticoParser$result = parser.getSymbolFactory().newSymbol("B",1, ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.elementAt(CUP$SintacticoParser$top-4)), ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), RESULT);
            }
          return CUP$SintacticoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // NT$2 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$SintacticoParser$stack.elementAt(CUP$SintacticoParser$top-1)).value;
this.sup.ImprimirSimbolos(this.contador);  this.contador++; 
              CUP$SintacticoParser$result = parser.getSymbolFactory().newSymbol("NT$2",7, ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), RESULT);
            }
          return CUP$SintacticoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // NT$1 ::= 
            {
              Object RESULT =null;

                    this.guardado = this.sup; 
                    this.sup = new Entorno(sup);
                    
                
              CUP$SintacticoParser$result = parser.getSymbolFactory().newSymbol("NT$1",6, ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), RESULT);
            }
          return CUP$SintacticoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= NT$0 B 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$SintacticoParser$stack.elementAt(CUP$SintacticoParser$top-1)).value;

              CUP$SintacticoParser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.elementAt(CUP$SintacticoParser$top-1)), ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), RESULT);
            }
          return CUP$SintacticoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // NT$0 ::= 
            {
              Object RESULT =null;
this.sup=null;
              CUP$SintacticoParser$result = parser.getSymbolFactory().newSymbol("NT$0",5, ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), RESULT);
            }
          return CUP$SintacticoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.elementAt(CUP$SintacticoParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.elementAt(CUP$SintacticoParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$SintacticoParser$stack.elementAt(CUP$SintacticoParser$top-1)).value;
		RESULT = start_val;
              CUP$SintacticoParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.elementAt(CUP$SintacticoParser$top-1)), ((java_cup.runtime.Symbol)CUP$SintacticoParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$SintacticoParser$parser.done_parsing();
          return CUP$SintacticoParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

