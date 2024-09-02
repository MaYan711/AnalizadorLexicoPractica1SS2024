package Lexic.StatesMagtnament;

import Enums.TokenTypes;
import Lexic.TokenMagnament.ReserverdToken;
import java.util.ArrayList;

public class SymbolController {

    public ReserverdToken foundedToken = null;

    public boolean isReservedWord(String word) {

        //creamos un conjunto con caracteres reservados o inmutables
        ArrayList<ReserverdToken> rt = new ArrayList<>();

        rt.add(new ReserverdToken("igual", "==", TokenTypes.RELACIONAL.ordinal(), "#6A00FF"));
        rt.add(new ReserverdToken("diferente", "!=", TokenTypes.RELACIONAL.ordinal(), "#3F2212"));
        rt.add(new ReserverdToken("mayorQ", ">", TokenTypes.RELACIONAL.ordinal(), "#D9D441"));
        rt.add(new ReserverdToken("menorQ", "<", TokenTypes.RELACIONAL.ordinal(), "#D94A41"));
        rt.add(new ReserverdToken("mayorIgualQ", ">=", TokenTypes.RELACIONAL.ordinal(), "#E3C800"));
        rt.add(new ReserverdToken("menorIgualQ", "<=", TokenTypes.RELACIONAL.ordinal(), "#F0A30A"));

        rt.add(new ReserverdToken("y", "And", TokenTypes.LOGICOS.ordinal(), "#414ED9"));
        rt.add(new ReserverdToken("o", "Or", TokenTypes.LOGICOS.ordinal(), "#41D95D"));
        rt.add(new ReserverdToken("negacion", "Not", TokenTypes.LOGICOS.ordinal(), "#A741D9"));

        rt.add(new ReserverdToken("asSimple", "=", TokenTypes.ASIGNACION.ordinal(), "#41D9D4"));
        rt.add(new ReserverdToken("asCompuesta", "+=", TokenTypes.ASIGNACION.ordinal(), "#FFFFFF"));
        rt.add(new ReserverdToken("asCompuesta", "-=", TokenTypes.ASIGNACION.ordinal(), "#FFFFFF"));
        rt.add(new ReserverdToken("asCompuesta", "*=", TokenTypes.ASIGNACION.ordinal(), "#FFFFFF"));
        rt.add(new ReserverdToken("asCompuesta", "/=", TokenTypes.ASIGNACION.ordinal(), "#FFFFFF"));

        rt.add(new ReserverdToken("modulo", "Modulo", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("end", "End", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("main", "Main", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("sub", "Sub", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("dim", "Dim", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("as", "As", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("integer", "Integer", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("string", "String", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("boolean", "Boolean", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("double", "Double", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("char", "Char", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("if", "If", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("elseIf", "ElseIf", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("else", "Else", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("then", "Then", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("while", "While", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("do", "Do", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("loop", "Loop", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("for", "For", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("to", "To", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("next", "Next", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("function", "Function", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("return", "Return", TokenTypes.RESERVADAS.ordinal()));
        rt.add(new ReserverdToken("const", "Const", TokenTypes.RESERVADAS.ordinal()));

        rt.add(new ReserverdToken("suma", "+", TokenTypes.ARITMETICOS.ordinal(), "#FF33FF"));
        rt.add(new ReserverdToken("resta", "-", TokenTypes.ARITMETICOS.ordinal(), "#C19A6B"));
        rt.add(new ReserverdToken("exponente", "^", TokenTypes.ARITMETICOS.ordinal(), "#FCD0B4"));
        rt.add(new ReserverdToken("division", "/", TokenTypes.ARITMETICOS.ordinal(), "#B4D941"));
        rt.add(new ReserverdToken("modulo", "Mod", TokenTypes.ARITMETICOS.ordinal(), "#D9AB41"));
        rt.add(new ReserverdToken("multiplicacion", "*", TokenTypes.ARITMETICOS.ordinal(), "#D80073"));

        rt.add(new ReserverdToken("agrupacion", "(", TokenTypes.SIMBOLO.ordinal(), "#9AD8DB"));
        rt.add(new ReserverdToken("agrupacion", ")", TokenTypes.SIMBOLO.ordinal(), "#9AD8DB"));
        rt.add(new ReserverdToken("agrupacion", "{", TokenTypes.SIMBOLO.ordinal(), "#DBD29A"));
        rt.add(new ReserverdToken("agrupacion", "}", TokenTypes.SIMBOLO.ordinal(), "#DBD29A"));
        rt.add(new ReserverdToken("agrupacion", "[", TokenTypes.SIMBOLO.ordinal(), "#DBA49A"));
        rt.add(new ReserverdToken("agrupacion", "]", TokenTypes.SIMBOLO.ordinal(), "#DBA49A"));
        rt.add(new ReserverdToken("puntuacion", ",", TokenTypes.SIMBOLO.ordinal(), "#B79ADB"));
        rt.add(new ReserverdToken("puntuacion", ".", TokenTypes.SIMBOLO.ordinal(), "#9ADBA6"));

        for (ReserverdToken reserverdToken : rt) {
            if (reserverdToken.getLexema().equals(word)) {
                foundedToken = reserverdToken;
                return true;
            }
        }

        return false;
    }

}
