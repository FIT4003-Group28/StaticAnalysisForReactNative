package com.google.android.gms.measurement.internal;

import c.e.a.b.d.g.v0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class na {

    /* renamed from: a  reason: collision with root package name */
    String f7534a;

    /* renamed from: b  reason: collision with root package name */
    int f7535b;

    /* renamed from: c  reason: collision with root package name */
    Boolean f7536c;

    /* renamed from: d  reason: collision with root package name */
    Boolean f7537d;

    /* renamed from: e  reason: collision with root package name */
    Long f7538e;

    /* renamed from: f  reason: collision with root package name */
    Long f7539f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public na(String str, int i) {
        this.f7534a = str;
        this.f7535b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean a(double d2, c.e.a.b.d.g.t0 t0Var) {
        try {
            return a(new BigDecimal(d2), t0Var, Math.ulp(d2));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean a(long j, c.e.a.b.d.g.t0 t0Var) {
        try {
            return a(new BigDecimal(j), t0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean a(String str, c.e.a.b.d.g.t0 t0Var) {
        if (!v9.a(str)) {
            return null;
        }
        try {
            return a(new BigDecimal(str), t0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean a(String str, v0.b bVar, boolean z, String str2, List<String> list, String str3, z3 z3Var) {
        boolean startsWith;
        if (str == null) {
            return null;
        }
        if (bVar == v0.b.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && bVar != v0.b.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (ja.f7409a[bVar.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (z3Var != null) {
                        z3Var.v().a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                startsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean a(String str, c.e.a.b.d.g.v0 v0Var, z3 z3Var) {
        List<String> list;
        com.google.android.gms.common.internal.s.a(v0Var);
        if (str == null || !v0Var.n() || v0Var.o() == v0.b.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (v0Var.o() == v0.b.IN_LIST) {
            if (v0Var.u() == 0) {
                return null;
            }
        } else if (!v0Var.p()) {
            return null;
        }
        v0.b o = v0Var.o();
        boolean s = v0Var.s();
        String q = (s || o == v0.b.REGEXP || o == v0.b.IN_LIST) ? v0Var.q() : v0Var.q().toUpperCase(Locale.ENGLISH);
        if (v0Var.u() == 0) {
            list = null;
        } else {
            List<String> t = v0Var.t();
            if (!s) {
                ArrayList arrayList = new ArrayList(t.size());
                for (String str2 : t) {
                    arrayList.add(str2.toUpperCase(Locale.ENGLISH));
                }
                t = Collections.unmodifiableList(arrayList);
            }
            list = t;
        }
        return a(str, o, s, q, list, o == v0.b.REGEXP ? q : null, z3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
        if (r2 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Boolean a(java.math.BigDecimal r9, c.e.a.b.d.g.t0 r10, double r11) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.na.a(java.math.BigDecimal, c.e.a.b.d.g.t0, double):java.lang.Boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean c();
}
