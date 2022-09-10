package defpackage;

import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eaor  reason: default package */
/* loaded from: classes6.dex */
public final class eaor {
    public static volatile Map<String, eaou> a;
    private static final eaoq b;
    private static volatile eaoq c;

    static {
        eaoq eaoqVar = new eaoq();
        b = eaoqVar;
        c = eaoqVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("UT", eaou.b);
        linkedHashMap.put("UTC", eaou.b);
        linkedHashMap.put("GMT", eaou.b);
        k(linkedHashMap, "EST", "America/New_York");
        k(linkedHashMap, "EDT", "America/New_York");
        k(linkedHashMap, "CST", "America/Chicago");
        k(linkedHashMap, "CDT", "America/Chicago");
        k(linkedHashMap, "MST", "America/Denver");
        k(linkedHashMap, "MDT", "America/Denver");
        k(linkedHashMap, "PST", "America/Los_Angeles");
        k(linkedHashMap, "PDT", "America/Los_Angeles");
        a = Collections.unmodifiableMap(linkedHashMap);
    }

    public static final long a() {
        return System.currentTimeMillis();
    }

    public static final long b(eapr eaprVar) {
        if (eaprVar == null) {
            return a();
        }
        return eaprVar.Tf();
    }

    public static final eaok c(eapr eaprVar) {
        if (eaprVar == null) {
            return earp.W();
        }
        eaok Tg = eaprVar.Tg();
        return Tg == null ? earp.W() : Tg;
    }

    public static final eaok d(eaok eaokVar) {
        return eaokVar == null ? earp.W() : eaokVar;
    }

    public static final eaou e(eaou eaouVar) {
        return eaouVar == null ? eaou.i() : eaouVar;
    }

    public static final long f(eapq eapqVar) {
        return ((eaqh) eapqVar).b;
    }

    public static final boolean g(eapt eaptVar) {
        eaoz eaozVar = null;
        for (int i = 0; i < eaptVar.e(); i++) {
            eaon y = eaptVar.y(i);
            if (i > 0 && y.t().a() != eaozVar) {
                return false;
            }
            eaozVar = y.s().a();
        }
        return true;
    }

    public static final DateFormatSymbols h(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", Locale.class).invoke(null, locale);
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    public static final eaok i() {
        earp earpVar = earp.E;
        return earpVar == null ? earp.W() : earpVar;
    }

    public static final eapo j() {
        return eapo.a();
    }

    private static void k(Map<String, eaou> map, String str, String str2) {
        try {
            map.put(str, eaou.j(str2));
        } catch (RuntimeException unused) {
        }
    }
}
