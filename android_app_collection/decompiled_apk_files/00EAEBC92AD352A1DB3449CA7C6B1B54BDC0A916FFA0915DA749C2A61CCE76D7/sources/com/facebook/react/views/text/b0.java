package com.facebook.react.views.text;

import java.text.BreakIterator;
/* loaded from: classes.dex */
public enum b0 {
    NONE,
    UPPERCASE,
    LOWERCASE,
    CAPITALIZE,
    UNSET;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6268a = new int[b0.values().length];

        static {
            try {
                f6268a[b0.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6268a[b0.LOWERCASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6268a[b0.CAPITALIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static String a(String str) {
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb = new StringBuilder(str.length());
        int first = wordInstance.first();
        while (true) {
            int i = first;
            first = wordInstance.next();
            if (first != -1) {
                String substring = str.substring(i, first);
                if (Character.isLetterOrDigit(substring.charAt(0))) {
                    sb.append(Character.toUpperCase(substring.charAt(0)));
                    substring = substring.substring(1).toLowerCase();
                }
                sb.append(substring);
            } else {
                return sb.toString();
            }
        }
    }

    public static String a(String str, b0 b0Var) {
        if (str == null) {
            return null;
        }
        int i = a.f6268a[b0Var.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? str : a(str) : str.toLowerCase() : str.toUpperCase();
    }
}
