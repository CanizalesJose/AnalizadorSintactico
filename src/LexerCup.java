/* The following code was generated by JFlex 1.6.0 */

import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.0
 * from the specification file <tt>C:/Users/DELL/Documents/NetBeansProjects/ProyectoAnalizador/src/LexerCup.flex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\3\1\3\1\3\1\3\22\0\1\1\1\0\1\0"+
    "\1\2\1\0\1\37\1\0\1\0\1\0\1\0\1\35\1\34\1\1"+
    "\1\31\1\33\1\36\1\0\1\0\1\0\1\0\1\0\1\0\1\0"+
    "\1\0\1\0\1\0\1\14\1\0\1\0\1\40\1\0\2\0\1\0"+
    "\1\0\1\0\1\0\1\0\1\0\1\0\1\0\1\0\1\0\1\0"+
    "\1\24\1\0\1\0\1\0\1\0\1\0\1\0\1\0\1\0\1\0"+
    "\1\0\2\0\1\0\1\0\4\0\1\0\1\0\1\5\1\10\1\21"+
    "\1\20\1\12\1\26\1\25\1\0\1\7\2\0\1\11\1\22\1\15"+
    "\1\17\1\30\1\0\1\6\1\13\1\16\1\27\1\4\1\0\1\23"+
    "\2\0\3\0\1\0\1\0\5\0\1\3\32\0\1\1\60\0\1\0"+
    "\17\0\1\0\7\0\1\0\3\0\1\0\5\0\1\32\6\0\1\0"+
    "\1\0\1\0\u0563\0\12\0\206\0\12\0\306\0\12\0\u019c\0\12\0"+
    "\166\0\12\0\166\0\12\0\166\0\12\0\166\0\12\0\166\0\12\0"+
    "\166\0\12\0\166\0\12\0\166\0\12\0\166\0\12\0\140\0\12\0"+
    "\166\0\12\0\106\0\12\0\u0116\0\12\0\106\0\12\0\u05e6\0\1\1"+
    "\u015f\0\12\0\46\0\12\0\u012c\0\12\0\200\0\12\0\246\0\12\0"+
    "\6\0\12\0\266\0\12\0\126\0\12\0\206\0\12\0\6\0\12\0"+
    "\u03a6\0\13\1\35\0\1\3\1\3\5\0\1\1\57\0\1\1\u0fa0\0"+
    "\1\1\u761f\0\12\0\u02a6\0\12\0\46\0\12\0\306\0\12\0\26\0"+
    "\12\0\126\0\12\0\u0196\0\12\0\u5316\0\12\0\u0586\0\12\0\u0bbc\0"+
    "\12\0\200\0\12\0\74\0\12\0\220\0\12\0\u0116\0\12\0\u01d6\0"+
    "\12\0\u0176\0\12\0\146\0\12\0\u0216\0\12\0\u5176\0\12\0\346\0"+
    "\12\0\u6c74\0\62\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u280f\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\1\2\2\5\1\1\3\7\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\5\1\1\13\12\1\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\2\1"+
    "\1\24\14\1\1\25\10\1\1\26\5\1\1\27\1\30"+
    "\3\1\1\31\7\1\1\32\10\1\1\33\1\34\1\35"+
    "\6\1\1\36\5\1\1\37\1\1\1\40\2\1\2\41"+
    "\1\1\1\42\1\43\1\44\1\1\1\45\2\1\1\46"+
    "\1\1\1\47\10\1\1\50\1\1\1\51\1\1\1\52";

  private static int [] zzUnpackAction() {
    int [] result = new int[146];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\41\0\102\0\143\0\204\0\245\0\306\0\347"+
    "\0\u0108\0\41\0\u0129\0\u014a\0\u016b\0\u018c\0\u01ad\0\u01ce"+
    "\0\u01ef\0\u0210\0\41\0\u0231\0\u0252\0\u0273\0\u0294\0\u02b5"+
    "\0\u02d6\0\u02f7\0\u0318\0\u0339\0\u035a\0\u037b\0\u039c\0\u03bd"+
    "\0\u03de\0\u03ff\0\u0420\0\u0441\0\u0462\0\u0483\0\u04a4\0\u04c5"+
    "\0\41\0\41\0\u04e6\0\41\0\41\0\41\0\41\0\41"+
    "\0\u0507\0\u0528\0\41\0\u0549\0\u056a\0\u058b\0\u05ac\0\u05cd"+
    "\0\u05ee\0\u060f\0\u0630\0\u0651\0\u0672\0\u0693\0\u06b4\0\41"+
    "\0\u06d5\0\u06f6\0\u0717\0\u0738\0\u0759\0\u077a\0\u079b\0\u07bc"+
    "\0\41\0\u07dd\0\u07fe\0\u081f\0\u0840\0\u0861\0\41\0\41"+
    "\0\u0882\0\u08a3\0\u08c4\0\41\0\u08e5\0\u0906\0\u0927\0\u0948"+
    "\0\u0969\0\u098a\0\u09ab\0\41\0\u09cc\0\u09ed\0\u0a0e\0\u0a2f"+
    "\0\u0a50\0\u0a71\0\u0a92\0\u0ab3\0\41\0\41\0\41\0\u0ad4"+
    "\0\u0af5\0\u0b16\0\u0b37\0\u0b58\0\u0b79\0\41\0\u0b9a\0\u0bbb"+
    "\0\u0bdc\0\u0bfd\0\u0c1e\0\41\0\u0c3f\0\41\0\u0c60\0\u0c81"+
    "\0\u0ca2\0\41\0\u0cc3\0\u0ce4\0\41\0\41\0\u0d05\0\41"+
    "\0\u0d26\0\u0d47\0\41\0\u0d68\0\41\0\u0d89\0\u0daa\0\u0dcb"+
    "\0\u0dec\0\u0e0d\0\u0e2e\0\u0e4f\0\u0e70\0\u0e91\0\u0eb2\0\41"+
    "\0\u0ed3\0\41";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[146];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\3\1\5\1\2\1\6\1\7"+
    "\2\2\1\10\1\11\1\12\1\2\1\13\1\2\1\14"+
    "\1\15\1\16\1\2\1\17\1\2\1\20\1\2\1\21"+
    "\1\22\1\2\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\42\2\1\3\1\2\1\3\35\2\3\4\1\2\35\4"+
    "\5\2\1\31\52\2\1\32\6\2\1\33\27\2\1\34"+
    "\40\2\1\35\32\2\1\36\43\2\1\37\40\2\1\40"+
    "\45\2\1\41\7\2\1\42\20\2\1\43\50\2\1\44"+
    "\30\2\1\45\17\2\1\46\16\2\1\47\1\50\63\2"+
    "\1\51\6\2\1\52\34\2\1\53\3\2\1\54\40\2"+
    "\1\55\40\2\1\56\40\2\1\57\40\2\1\60\6\2"+
    "\1\61\54\2\1\62\37\2\1\63\26\2\1\64\47\2"+
    "\1\65\37\2\1\66\4\2\1\67\41\2\1\70\21\2"+
    "\1\71\14\2\1\72\37\2\1\73\1\2\1\74\24\2"+
    "\1\75\44\2\1\76\53\2\1\77\30\2\1\100\40\2"+
    "\1\101\31\2\1\102\51\2\1\103\55\2\1\53\13\2"+
    "\1\104\61\2\1\105\31\2\1\106\31\2\1\107\4\2"+
    "\1\110\40\2\1\111\31\2\1\112\46\2\1\113\41\2"+
    "\1\114\30\2\1\115\40\2\1\116\50\2\1\117\51\2"+
    "\1\120\25\2\1\121\32\2\1\122\52\2\1\123\24\2"+
    "\1\124\54\2\1\125\24\2\1\126\45\2\1\127\35\2"+
    "\1\130\37\2\1\131\47\2\1\132\42\2\1\133\40\2"+
    "\1\134\32\2\1\135\51\2\1\136\43\2\1\137\31\2"+
    "\1\140\43\2\1\141\26\2\1\142\43\2\1\143\36\2"+
    "\1\144\36\2\1\145\51\2\1\146\40\2\1\147\42\2"+
    "\1\150\30\2\1\151\33\2\1\152\41\2\1\153\52\2"+
    "\1\154\27\2\1\155\51\2\1\156\40\2\1\157\12\2"+
    "\1\160\26\2\1\161\31\2\1\162\41\2\1\163\45\2"+
    "\1\164\33\2\1\165\37\2\1\166\60\2\1\167\14\2"+
    "\1\170\50\2\1\171\40\2\1\172\32\2\1\173\43\2"+
    "\1\174\41\2\1\175\33\2\1\176\62\2\1\177\23\2"+
    "\1\200\37\2\1\201\50\2\1\202\31\2\1\203\33\2"+
    "\1\204\45\2\1\205\34\2\1\206\40\2\1\207\43\2"+
    "\1\210\43\2\1\211\40\2\1\212\44\2\1\213\35\2"+
    "\1\214\31\2\1\215\50\2\1\216\51\2\1\217\23\2"+
    "\1\220\32\2\1\221\44\2\1\222\27\2";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3828];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\222\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[146];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 478) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;           
    int totalRead = 0;
    while (totalRead < requested) {
      int numRead = zzReader.read(zzBuffer, zzEndRead + totalRead, requested - totalRead);
      if (numRead == -1) {
        break;
      }
      totalRead += numRead;
    }

    if (totalRead > 0) {
      zzEndRead += totalRead;
      if (totalRead == requested) { /* possibly more input available */
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      return false;
    }

    // totalRead = 0: End of stream
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { return new Symbol(sym.TKNDISTINTO, yychar, yyline, yytext());
          }
        case 43: break;
        case 2: 
          { /*Ignore*/
          }
        case 44: break;
        case 3: 
          { return new Symbol(sym.TKNDOSPUNTOS, yychar, yyline, yytext());
          }
        case 45: break;
        case 4: 
          { return new Symbol(sym.TKNRESTA, yychar, yyline, yytext());
          }
        case 46: break;
        case 5: 
          { return new Symbol(sym.TKNPUNTO, yychar, yyline, yytext());
          }
        case 47: break;
        case 6: 
          { return new Symbol(sym.TKNSUMA, yychar, yyline, yytext());
          }
        case 48: break;
        case 7: 
          { return new Symbol(sym.TKNMULTIPLICACION, yychar, yyline, yytext());
          }
        case 49: break;
        case 8: 
          { return new Symbol(sym.TKNDIVISION, yychar, yyline, yytext());
          }
        case 50: break;
        case 9: 
          { return new Symbol(sym.TKNMODULO, yychar, yyline, yytext());
          }
        case 51: break;
        case 10: 
          { return new Symbol(sym.TKNIGUAL, yychar, yyline, yytext());
          }
        case 52: break;
        case 11: 
          { return new Symbol(sym.TKNSI, yychar, yyline, yytext());
          }
        case 53: break;
        case 12: 
          { return new Symbol(sym.TKNDECREMENTO, yychar, yyline, yytext());
          }
        case 54: break;
        case 13: 
          { return new Symbol(sym.TKNRESTAIGUAL, yychar, yyline, yytext());
          }
        case 55: break;
        case 14: 
          { return new Symbol(sym.TKNINCREMENTO, yychar, yyline, yytext());
          }
        case 56: break;
        case 15: 
          { return new Symbol(sym.TKNSUMAIGUAL, yychar, yyline, yytext());
          }
        case 57: break;
        case 16: 
          { return new Symbol(sym.TKNMULTIGUAL, yychar, yyline, yytext());
          }
        case 58: break;
        case 17: 
          { return new Symbol(sym.TKNDIVIGUAL, yychar, yyline, yytext());
          }
        case 59: break;
        case 18: 
          { return new Symbol(sym.TKNMODIGUAL, yychar, yyline, yytext());
          }
        case 60: break;
        case 19: 
          { return new Symbol(sym.TKNIGUALOG, yychar, yyline, yytext());
          }
        case 61: break;
        case 20: 
          { return new Symbol(sym.TKNRFC, yychar, yyline, yytext());
          }
        case 62: break;
        case 21: 
          { return new Symbol(sym.TKNFINESTRUCTURA, yychar, yyline, yytext());
          }
        case 63: break;
        case 22: 
          { return new Symbol(sym.TKNSINO, yychar, yyline, yytext());
          }
        case 64: break;
        case 23: 
          { return new Symbol(sym.TKNCOMO, yychar, yyline, yytext());
          }
        case 65: break;
        case 24: 
          { return new Symbol(sym.TKNCURP, yychar, yyline, yytext());
          }
        case 66: break;
        case 25: 
          { return new Symbol(sym.TKNPARA, yychar, yyline, yytext());
          }
        case 67: break;
        case 26: 
          { return new Symbol(sym.TKNTEXTO, yychar, yyline, yytext());
          }
        case 68: break;
        case 27: 
          { return new Symbol(sym.TKNROMPER, yychar, yyline, yytext());
          }
        case 69: break;
        case 28: 
          { return new Symbol(sym.TKNINICIOESTRUCTURA, yychar, yyline, yytext());
          }
        case 70: break;
        case 29: 
          { return new Symbol(sym.TKNENTERO, yychar, yyline, yytext());
          }
        case 71: break;
        case 30: 
          { return new Symbol(sym.TKNLOGICO, yychar, yyline, yytext());
          }
        case 72: break;
        case 31: 
          { return new Symbol(sym.TKNSIMBOLO, yychar, yyline, yytext());
          }
        case 73: break;
        case 32: 
          { return new Symbol(sym.TKNDECIMAL, yychar, yyline, yytext());
          }
        case 74: break;
        case 33: 
          { return new Symbol(sym.TKNFUNCION, yychar, yyline, yytext());
          }
        case 75: break;
        case 34: 
          { return new Symbol(sym.TKNVARIABLE, yychar, yyline, yytext());
          }
        case 76: break;
        case 35: 
          { return new Symbol(sym.TKNENTONCES, yychar, yyline, yytext());
          }
        case 77: break;
        case 36: 
          { return new Symbol(sym.TKNDEVOLVER, yychar, yyline, yytext());
          }
        case 78: break;
        case 37: 
          { return new Symbol(sym.TKNMIENTRAS, yychar, yyline, yytext());
          }
        case 79: break;
        case 38: 
          { return new Symbol(sym.TKNVARIABLES, yychar, yyline, yytext());
          }
        case 80: break;
        case 39: 
          { return new Symbol(sym.TKNFUNCIONES, yychar, yyline, yytext());
          }
        case 81: break;
        case 40: 
          { return new Symbol(sym.TKNPROCEDIMIENTO, yychar, yyline, yytext());
          }
        case 82: break;
        case 41: 
          { return new Symbol(sym.TKNPROCEDIMIENTOS, yychar, yyline, yytext());
          }
        case 83: break;
        case 42: 
          { return new Symbol(sym.TKNCDPRINCIPAL, yychar, yyline, yytext());
          }
        case 84: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
