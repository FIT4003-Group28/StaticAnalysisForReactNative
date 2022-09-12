package defpackage;

import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: decb  reason: default package */
/* loaded from: classes6.dex */
public final class decb extends decc {
    public static final Pattern a;

    static {
        StringBuilder sb = new StringBuilder(78);
        sb.append("0[xX]");
        sb.append("(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)");
        sb.append("[pP][+-]?\\d+#[fFdD]?");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?".length() + 23 + String.valueOf(sb2).length());
        sb3.append("[+-]?(?:NaN|Infinity|");
        sb3.append("(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?");
        sb3.append("|");
        sb3.append(sb2);
        sb3.append(")");
        a = Pattern.compile(sb3.toString().replace("#", "+"));
    }

    public static int a(double d) {
        return Double.valueOf(d).hashCode();
    }

    public static double b(double... dArr) {
        dbsk.a(dArr.length > 0);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            d = Math.min(d, dArr[i]);
        }
        return d;
    }

    public static double c(double... dArr) {
        dbsk.a(dArr.length > 0);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            d = Math.max(d, dArr[i]);
        }
        return d;
    }

    public static double d(double d, double d2, double d3) {
        if (d2 <= d3) {
            return Math.min(Math.max(d, d2), d3);
        }
        throw new IllegalArgumentException(dbtx.b("min (%s) must be less than or equal to max (%s)", Double.valueOf(d2), Double.valueOf(d3)));
    }
}
