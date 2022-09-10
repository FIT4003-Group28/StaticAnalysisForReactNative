package defpackage;

import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: debw  reason: default package */
/* loaded from: classes6.dex */
public final class debw {
    public static final Charset a;
    private static final Charset b;
    private static final char[] c;
    private static final dbrb d;

    static {
        Charset forName = Charset.forName("UTF-8");
        b = forName;
        c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        d = dbrb.o("-_.*").j(dbrb.p('0', '9')).j(dbrb.p('A', 'Z')).j(dbrb.p('a', 'z'));
        a = forName;
    }

    public static String a(String str, Charset charset) {
        if (!charset.equals(a)) {
            int length = str.length();
            StringBuilder sb = new StringBuilder(length + length);
            boolean z = false;
            int i = 0;
            for (byte b2 : str.getBytes(charset)) {
                int a2 = decp.a(b2);
                char c2 = (char) a2;
                if (d.b(c2)) {
                    sb.append(c2);
                    i++;
                } else if (a2 == 32) {
                    sb.append('+');
                    i++;
                    z = true;
                } else {
                    sb.append('%');
                    char[] cArr = c;
                    sb.append(cArr[a2 >> 4]);
                    sb.append(cArr[a2 & 15]);
                    i += 3;
                }
            }
            return (z || i != str.length()) ? sb.toString() : str;
        }
        return debr.a.a(str);
    }
}
