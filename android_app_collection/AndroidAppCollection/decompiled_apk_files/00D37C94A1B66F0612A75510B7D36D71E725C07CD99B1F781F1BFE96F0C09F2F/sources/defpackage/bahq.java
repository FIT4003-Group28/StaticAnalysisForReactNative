package defpackage;

import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bahq  reason: default package */
/* loaded from: classes2.dex */
public final class bahq {
    public static volatile Map a;
    private static final bajw b;
    private static volatile bajw c;

    static {
        bajw bajwVar = new bajw();
        b = bajwVar;
        c = bajwVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("UT", baht.a);
        linkedHashMap.put("UTC", baht.a);
        linkedHashMap.put("GMT", baht.a);
        h(linkedHashMap, "EST", "America/New_York");
        h(linkedHashMap, "EDT", "America/New_York");
        h(linkedHashMap, "CST", "America/Chicago");
        h(linkedHashMap, "CDT", "America/Chicago");
        h(linkedHashMap, "MST", "America/Denver");
        h(linkedHashMap, "MDT", "America/Denver");
        h(linkedHashMap, "PST", "America/Los_Angeles");
        h(linkedHashMap, "PDT", "America/Los_Angeles");
        a = Collections.unmodifiableMap(linkedHashMap);
    }

    public static final long a() {
        return System.currentTimeMillis();
    }

    public static final long b(baig baigVar) {
        if (baigVar == null) {
            return a();
        }
        return baigVar.sx();
    }

    public static final DateFormatSymbols c(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", Locale.class).invoke(null, locale);
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    public static final bahl d(bahl bahlVar) {
        return bahlVar == null ? bajl.O() : bahlVar;
    }

    public static final bahl e(baig baigVar) {
        if (baigVar == null) {
            return bajl.O();
        }
        bahl sy = baigVar.sy();
        return sy == null ? bajl.O() : sy;
    }

    public static final baht f(baht bahtVar) {
        return bahtVar == null ? baht.k() : bahtVar;
    }

    public static final baie g() {
        return baie.d();
    }

    private static void h(Map map, String str, String str2) {
        try {
            map.put(str, baht.i(str2));
        } catch (RuntimeException unused) {
        }
    }
}
