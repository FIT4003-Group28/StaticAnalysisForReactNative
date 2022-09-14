package defpackage;
/* compiled from: PG */
/* renamed from: dzxu  reason: default package */
/* loaded from: classes6.dex */
class dzxu extends dzxr {
    public static final int b(CharSequence charSequence) {
        dzvx.c(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    public static final boolean c(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        dzvx.c(charSequence, "$this$regionMatchesImpl");
        dzvx.c(charSequence2, "other");
        if (i < 0 || charSequence.length() - i2 < 0 || i > charSequence2.length() - i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!dzxa.b(charSequence.charAt(i3), charSequence2.charAt(i + i3))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String d(String str) {
        int lastIndexOf;
        dzvx.c(str, "$this$substringAfterLast");
        dzvx.c(str, "missingDelimiterValue");
        int b = dzxg.b(str);
        dzvx.c(str, "$this$lastIndexOf");
        if (!(str instanceof String)) {
            char[] cArr = {'.'};
            dzvx.c(str, "$this$lastIndexOfAny");
            lastIndexOf = dzwj.b(b, dzxg.b(str));
            while (true) {
                if (lastIndexOf < 0) {
                    lastIndexOf = -1;
                    break;
                } else if (dzxa.b(cArr[0], str.charAt(lastIndexOf))) {
                    break;
                } else {
                    lastIndexOf--;
                }
            }
        } else {
            lastIndexOf = str.lastIndexOf(46, b);
        }
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        dzvx.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }
}
