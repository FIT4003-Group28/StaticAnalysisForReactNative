package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cprw  reason: default package */
/* loaded from: classes5.dex */
public final class cprw {
    private static final String[] a;
    private static final int b;

    static {
        String[] strArr = {"f", "p", "n", "µ", "m", "", "k", "M", "B", "T"};
        a = strArr;
        b = Arrays.asList(strArr).indexOf("");
    }

    @Deprecated
    public static String a(Number number, boolean z) {
        String str;
        if (z) {
            number = Long.valueOf(Math.round(number.doubleValue()));
        }
        if (number.doubleValue() == dcyn.a) {
            return "0";
        }
        String str2 = number.doubleValue() >= dcyn.a ? "" : "-";
        double abs = Math.abs(number.doubleValue());
        boolean z2 = !z || abs >= 1000.0d;
        double floor = abs >= 1.0d ? Math.floor(Math.log10(abs) / 3.0d) : Math.floor((Math.log10(abs) + 2.0d) / 3.0d);
        int i = b;
        int max = Math.max(-i, (int) floor);
        String[] strArr = a;
        int length = strArr.length;
        int min = Math.min(9 - i, max);
        double pow = abs / Math.pow(10.0d, min * 3);
        String str3 = strArr[min + i];
        if (z2) {
            if (pow < 10.0d) {
                str = "%.2f";
            } else if (pow < 100.0d) {
                str = "%.1f";
            }
            String format = String.format(str, Double.valueOf(pow));
            StringBuilder sb = new StringBuilder(str2.length() + String.valueOf(format).length() + String.valueOf(str3).length());
            sb.append(str2);
            sb.append(format);
            sb.append(str3);
            return sb.toString();
        }
        str = "%.0f";
        String format2 = String.format(str, Double.valueOf(pow));
        StringBuilder sb2 = new StringBuilder(str2.length() + String.valueOf(format2).length() + String.valueOf(str3).length());
        sb2.append(str2);
        sb2.append(format2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static <D> cpru<D> b(acrf acrfVar) {
        return new cprv(acrfVar);
    }
}
