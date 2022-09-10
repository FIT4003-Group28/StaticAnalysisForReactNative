package defpackage;

import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: eark  reason: default package */
/* loaded from: classes6.dex */
final class eark {
    private static final ConcurrentMap<Locale, eark> n = new ConcurrentHashMap();
    public final String[] a;
    public final String[] b;
    public final String[] c;
    public final String[] d;
    public final String[] e;
    public final String[] f;
    public final TreeMap<String, Integer> g;
    public final TreeMap<String, Integer> h;
    public final TreeMap<String, Integer> i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;

    private eark(Locale locale) {
        DateFormatSymbols h = eaor.h(locale);
        this.a = h.getEras();
        this.b = c(h.getWeekdays());
        this.c = c(h.getShortWeekdays());
        this.d = b(h.getMonths());
        this.e = b(h.getShortMonths());
        this.f = h.getAmPmStrings();
        Integer[] numArr = new Integer[13];
        for (int i = 0; i < 13; i++) {
            numArr[i] = Integer.valueOf(i);
        }
        TreeMap<String, Integer> treeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        this.g = treeMap;
        d(treeMap, this.a, numArr);
        if ("en".equals(locale.getLanguage())) {
            treeMap.put("BCE", numArr[0]);
            treeMap.put("CE", numArr[1]);
        }
        TreeMap<String, Integer> treeMap2 = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        this.h = treeMap2;
        d(treeMap2, this.b, numArr);
        d(treeMap2, this.c, numArr);
        f(treeMap2, 7, numArr);
        TreeMap<String, Integer> treeMap3 = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        this.i = treeMap3;
        d(treeMap3, this.d, numArr);
        d(treeMap3, this.e, numArr);
        f(treeMap3, 12, numArr);
        this.j = e(this.a);
        this.k = e(this.b);
        e(this.c);
        this.l = e(this.d);
        e(this.e);
        this.m = e(this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static eark a(Locale locale) {
        eark putIfAbsent;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        ConcurrentMap<Locale, eark> concurrentMap = n;
        eark earkVar = concurrentMap.get(locale);
        return (earkVar != null || (putIfAbsent = concurrentMap.putIfAbsent(locale, (earkVar = new eark(locale)))) == null) ? earkVar : putIfAbsent;
    }

    private static String[] b(String[] strArr) {
        String[] strArr2 = new String[13];
        for (int i = 1; i < 13; i++) {
            strArr2[i] = strArr[i - 1];
        }
        return strArr2;
    }

    private static String[] c(String[] strArr) {
        String[] strArr2 = new String[8];
        int i = 1;
        while (i < 8) {
            strArr2[i] = strArr[i < 7 ? i + 1 : 1];
            i++;
        }
        return strArr2;
    }

    private static void d(TreeMap<String, Integer> treeMap, String[] strArr, Integer[] numArr) {
        int length = strArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                String str = strArr[length];
                if (str != null) {
                    treeMap.put(str, numArr[length]);
                }
            } else {
                return;
            }
        }
    }

    private static int e(String[] strArr) {
        int length;
        int length2 = strArr.length;
        int i = 0;
        while (true) {
            length2--;
            if (length2 >= 0) {
                String str = strArr[length2];
                if (str != null && (length = str.length()) > i) {
                    i = length;
                }
            } else {
                return i;
            }
        }
    }

    private static void f(TreeMap<String, Integer> treeMap, int i, Integer[] numArr) {
        for (int i2 = 1; i2 <= i; i2++) {
            treeMap.put(String.valueOf(i2).intern(), numArr[i2]);
        }
    }
}
