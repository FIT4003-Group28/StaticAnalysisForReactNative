package defpackage;

import android.os.Build;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: amna  reason: default package */
/* loaded from: classes.dex */
public final class amna {
    public static int f;
    public static amlv h;
    static final vgt i = new vgt("tiktok_systrace");
    public static final WeakHashMap a = new WeakHashMap();
    private static final ThreadLocal j = new ammw();
    public static final Deque b = new ArrayDeque();
    public static final Deque c = new ArrayDeque();
    public static final Object d = new Object();
    public static final Runnable e = ajsy.g;
    public static int g = 0;

    public static amlv a() {
        return ((ammz) j.get()).d;
    }

    static amlv b() {
        return (amlv) c.peek();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amlv c() {
        amlv a2 = a();
        return a2 == null ? new amle() : a2;
    }

    public static amlv d() {
        amlv amlvVar = h;
        if (amlvVar != null) {
            h = null;
            return amlvVar;
        }
        return null;
    }

    public static amlv e(amlv amlvVar) {
        return r((ammz) j.get(), amlvVar);
    }

    public static amlw f() {
        amlv b2;
        f++;
        if (g == 0) {
            ammz ammzVar = (ammz) j.get();
            if (ammzVar.d == null && (b2 = b()) != null) {
                r(ammzVar, b2);
                g = f;
            }
        }
        return ammv.b;
    }

    public static String g(amlv amlvVar) {
        int i2 = 0;
        amlv amlvVar2 = amlvVar;
        while (amlvVar2 != null) {
            i2 += amlvVar2.b().length();
            amlvVar2 = amlvVar2.a();
            if (amlvVar2 != null) {
                i2 += 4;
            }
        }
        char[] cArr = new char[i2];
        while (amlvVar != null) {
            String b2 = amlvVar.b();
            i2 -= b2.length();
            b2.getChars(0, b2.length(), cArr, i2);
            amlvVar = amlvVar.a();
            if (amlvVar != null) {
                i2 -= 4;
                " -> ".getChars(0, 4, cArr, i2);
            }
        }
        return new String(cArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map h() {
        HashMap hashMap = new HashMap();
        WeakHashMap weakHashMap = a;
        synchronized (weakHashMap) {
            for (Map.Entry entry : weakHashMap.entrySet()) {
                amlv amlvVar = ((ammz) entry.getValue()).d;
                if (amlvVar != null) {
                    hashMap.put((Thread) entry.getKey(), amlvVar);
                }
            }
        }
        return hashMap;
    }

    public static void i(amlv amlvVar) {
        amlvVar.getClass();
        ammz ammzVar = (ammz) j.get();
        amlv amlvVar2 = ammzVar.d;
        aqxo.E(amlvVar == amlvVar2, "Wrong trace, expected %s but got %s", amlvVar2.b(), amlvVar.b());
        r(ammzVar, amlvVar2.a());
    }

    public static void j() {
        int i2 = f;
        int i3 = i2 - 1;
        f = i3;
        if (i3 >= 0) {
            if (g != i2) {
                return;
            }
            aqxo.z(!c.isEmpty(), "current async trace should not be null");
            e(null);
            g = 0;
            return;
        }
        throw new IllegalStateException("More calls to pause than to resume");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(amlv amlvVar, String str) {
        if (amlvVar instanceof amkx) {
            String g2 = g(amlvVar);
            if (!"".equals(g2)) {
                g2 = g2.length() != 0 ? ": ".concat(g2) : new String(": ");
            }
            amkv amkvVar = new amkv(g2, str, ((amkx) amlvVar).e());
            ammu.c();
            throw amkvVar;
        }
        amkv amkvVar2 = new amkv(str);
        ammu.c();
        throw amkvVar2;
    }

    public static amlp l(String str) {
        return m(str, amls.a);
    }

    public static amlp m(String str, amlt amltVar) {
        return n(str, amltVar, true);
    }

    public static amlp n(String str, amlt amltVar, boolean z) {
        amlv f2;
        amlv a2 = a();
        if (a2 == null) {
            f2 = new amlf(str, amltVar, z);
        } else if (a2 instanceof amkx) {
            f2 = ((amkx) a2).d(str, amltVar, z);
        } else {
            f2 = a2.f(str, amltVar);
        }
        e(f2);
        return new amlp(f2);
    }

    public static boolean o() {
        return a() != null;
    }

    public static amlw p() {
        ammz ammzVar = (ammz) j.get();
        if (!ammzVar.a) {
            return ammv.a;
        }
        amln amlnVar = ammzVar.d;
        if (amlnVar == null) {
            amlnVar = new amle();
        }
        b.add(amlnVar);
        uwp.h(e);
        return ammv.c;
    }

    public static boolean q() {
        amlv b2;
        amlv b3 = b();
        if (b3 == null || (b3 instanceof amkx)) {
            return false;
        }
        f++;
        if (g == 0) {
            ammz ammzVar = (ammz) j.get();
            if (ammzVar.d == null && (b2 = b()) != null) {
                r(ammzVar, b2);
                g = f;
            }
        }
        return true;
    }

    private static amlv r(ammz ammzVar, amlv amlvVar) {
        boolean a2;
        amlv amlvVar2 = ammzVar.d;
        if (amlvVar2 == amlvVar) {
            return amlvVar;
        }
        if (amlvVar2 == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                a2 = ammx.a();
            } else {
                a2 = vgu.a(i);
            }
            ammzVar.c = a2;
        }
        if (ammzVar.c) {
            v(amlvVar2, amlvVar);
        }
        ammzVar.d = amlvVar;
        ammy ammyVar = ammzVar.b;
        return amlvVar2;
    }

    private static void s(String str) {
        if (str.length() > 127) {
            str.substring(0, 127);
        }
    }

    private static void t(amlv amlvVar) {
        if (amlvVar.a() != null) {
            t(amlvVar.a());
        }
        s(amlvVar.b());
    }

    private static void u(amlv amlvVar) {
        if (amlvVar.a() != null) {
            u(amlvVar.a());
        }
    }

    private static void v(amlv amlvVar, amlv amlvVar2) {
        if (amlvVar != null) {
            if (amlvVar2 != null) {
                if (amlvVar.a() == amlvVar2) {
                    return;
                }
                if (amlvVar == amlvVar2.a()) {
                    s(amlvVar2.b());
                    return;
                }
            }
            u(amlvVar);
        }
        if (amlvVar2 != null) {
            t(amlvVar2);
        }
    }
}
