package defpackage;

import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: dcpf  reason: default package */
/* loaded from: classes5.dex */
public final class dcpf {
    public static final Pattern a;
    private static final dbrb b;
    private static final dbrb c;

    static {
        Pattern.compile("^[,\\s]+");
        Pattern.compile("^<([^<>]+)>$");
        Pattern.compile("^\\s*([^<]+)<([^<>]+)@([^<>@]+)>\\s*$");
        Pattern.compile("^\\s*([^<>]+)@([^<>@]+)\\s*$");
        dbrb.o(" \t");
        Pattern.compile("^(?:[^\\(\\)\\\\]|\\\\.)+");
        StringBuilder sb = new StringBuilder(10);
        sb.append("(?:");
        sb.append("\\x20");
        sb.append("*+)");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(10);
        sb3.append("(?:");
        sb3.append("\\x20");
        sb3.append("++)");
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder(35);
        sb5.append("(?:");
        sb5.append("\"(?:[^\\\\\"]++|(?:\\\\");
        sb5.append("(?s:.)");
        sb5.append(")++)*+\"");
        sb5.append(")");
        String sb6 = sb5.toString();
        StringBuilder sb7 = new StringBuilder(45);
        sb7.append("(?:");
        sb7.append("[^");
        sb7.append("\\(\\)<>@,;:\\\\\"\\.\\[\\]");
        sb7.append("\\x00-\\x1f\\x7f");
        sb7.append("\\x20");
        sb7.append("]++");
        sb7.append(")");
        String sb8 = sb7.toString();
        StringBuilder sb9 = new StringBuilder(String.valueOf(sb8).length() + 5 + String.valueOf(sb6).length());
        sb9.append("(?:");
        sb9.append(sb8);
        sb9.append("|");
        sb9.append(sb6);
        sb9.append(")");
        String sb10 = sb9.toString();
        StringBuilder sb11 = new StringBuilder(String.valueOf(sb10).length() + 10 + String.valueOf(sb2).length() + String.valueOf(sb10).length());
        sb11.append("(?:");
        sb11.append(sb10);
        sb11.append("(?:");
        sb11.append(sb2);
        sb11.append(sb10);
        sb11.append(")*+)");
        String sb12 = sb11.toString();
        StringBuilder sb13 = new StringBuilder(13);
        sb13.append("[^\\[\\]\\\\");
        sb13.append("\\x0f");
        sb13.append("]");
        String sb14 = sb13.toString();
        StringBuilder sb15 = new StringBuilder(String.valueOf(sb14).length() + 22);
        sb15.append("(?:");
        sb15.append("\\[");
        sb15.append("(?:");
        sb15.append(sb14);
        sb15.append("|\\\\");
        sb15.append("(?s:.)");
        sb15.append(")");
        sb15.append("*\\]");
        sb15.append(")");
        String sb16 = sb15.toString();
        StringBuilder sb17 = new StringBuilder(String.valueOf(sb10).length() + 9 + String.valueOf(sb10).length());
        sb17.append("(");
        sb17.append(sb10);
        sb17.append("(?:\\.");
        sb17.append(sb10);
        sb17.append(")*");
        sb17.append(")");
        String sb18 = sb17.toString();
        StringBuilder sb19 = new StringBuilder(String.valueOf(sb8).length() + 11 + String.valueOf(sb8).length());
        sb19.append("(?:");
        sb19.append(sb8);
        sb19.append("(?:\\.");
        sb19.append(sb8);
        sb19.append(")*");
        sb19.append(")");
        String sb20 = sb19.toString();
        StringBuilder sb21 = new StringBuilder(String.valueOf(sb18).length() + 3 + String.valueOf(sb20).length());
        sb21.append("(");
        sb21.append(sb18);
        sb21.append("@");
        sb21.append(sb20);
        sb21.append(")");
        String sb22 = sb21.toString();
        StringBuilder sb23 = new StringBuilder(String.valueOf(sb18).length() + 5 + String.valueOf(sb20).length());
        sb23.append("(");
        sb23.append(sb18);
        sb23.append("@(");
        sb23.append(sb20);
        sb23.append("))");
        String sb24 = sb23.toString();
        StringBuilder sb25 = new StringBuilder(String.valueOf(sb18).length() + 11 + String.valueOf(sb20).length());
        sb25.append("(");
        sb25.append(sb18);
        sb25.append("(?:@(");
        sb25.append(sb20);
        sb25.append(")?)?)");
        String sb26 = sb25.toString();
        StringBuilder sb27 = new StringBuilder(String.valueOf(sb20).length() + 14 + String.valueOf(sb20).length());
        sb27.append("(?:");
        sb27.append("@");
        sb27.append(sb20);
        sb27.append("(?:");
        sb27.append(",+@");
        sb27.append(sb20);
        sb27.append(")*:");
        sb27.append(")");
        String sb28 = sb27.toString();
        StringBuilder sb29 = new StringBuilder(String.valueOf(sb28).length() + 7 + String.valueOf(sb22).length());
        sb29.append("(?:");
        sb29.append("<");
        sb29.append(sb28);
        sb29.append("?");
        sb29.append(sb22);
        sb29.append(">");
        sb29.append(")");
        String sb30 = sb29.toString();
        int length = String.valueOf(sb22).length();
        int length2 = String.valueOf(sb12).length();
        StringBuilder sb31 = new StringBuilder(length + 11 + length2 + String.valueOf(sb2).length() + String.valueOf(sb30).length());
        sb31.append("(?:");
        sb31.append(sb22);
        sb31.append("|(?:(");
        sb31.append(sb12);
        sb31.append(")");
        sb31.append(sb2);
        sb31.append(sb30);
        sb31.append(")");
        sb31.append(")");
        String sb32 = sb31.toString();
        int length3 = String.valueOf(sb6).length();
        int length4 = String.valueOf(sb16).length();
        StringBuilder sb33 = new StringBuilder(length3 + 8 + length4 + String.valueOf(sb8).length() + String.valueOf(sb4).length());
        sb33.append("^(?:");
        sb33.append(sb6);
        sb33.append("|");
        sb33.append(sb16);
        sb33.append("|");
        sb33.append(sb8);
        sb33.append("|");
        sb33.append(sb4);
        sb33.append(")");
        String sb34 = sb33.toString();
        Pattern.compile(sb22);
        Pattern.compile(sb24);
        Pattern.compile(sb26);
        a = Pattern.compile(sb32);
        StringBuilder sb35 = new StringBuilder(String.valueOf(sb6).length() + 26);
        sb35.append("^(?:[^@\"]++|");
        sb35.append(sb6);
        sb35.append("++)*+@[^\\s,]*+");
        Pattern.compile(sb35.toString());
        StringBuilder sb36 = new StringBuilder(String.valueOf(sb6).length() + 25);
        sb36.append("^(?:\\.+|\\s+|");
        sb36.append(sb6);
        sb36.append("|");
        sb36.append("[^\"<>@.\\s]+");
        sb36.append(")");
        Pattern.compile(sb36.toString());
        StringBuilder sb37 = new StringBuilder(21);
        sb37.append("[");
        sb37.append("\\(\\)<>@,;:\\\\\"\\.\\[\\]");
        sb37.append("]");
        Pattern.compile(sb37.toString());
        Pattern.compile(sb34);
        dbrb o = dbrb.o("()<>@,;:\\\".[]");
        b = o;
        dbrb j = dbrb.p((char) 0, (char) 31).j(dbrb.n((char) 127));
        c = j;
        o.j(dbrb.n(' ')).j(j).k().m();
    }
}