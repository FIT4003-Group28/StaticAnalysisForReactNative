package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: dbaa  reason: default package */
/* loaded from: classes.dex */
public final class dbaa {
    static final czhm a = new czhm();
    public static final WeakHashMap<Thread, dazz> b = new WeakHashMap<>();
    private static final ThreadLocal<dazz> f = new dazx();
    public static final Deque<Object> c = new ArrayDeque();
    public static final Deque<dazn> d = new ArrayDeque();
    public static final Object e = new Object();

    public static dazk a(String str) {
        return b(str, dbab.a);
    }

    public static dazk b(String str, dbab dbabVar) {
        return c(str, dbabVar, dazl.a, true);
    }

    public static dazk c(String str, dbab dbabVar, dazm dazmVar, boolean z) {
        dazn e2;
        dbsk.s(dbabVar);
        dazn e3 = e();
        if (e3 == null) {
            e2 = new dazi(str, dazmVar);
        } else {
            e2 = e3.e(str, dazmVar);
        }
        g(e2);
        return new dazk(e2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(dazn daznVar) {
        dbsk.s(daznVar);
        dazz dazzVar = f.get();
        dazn daznVar2 = dazzVar.b;
        dbsk.r(daznVar == daznVar2, "Wrong trace, expected %s but got %s", daznVar2.c(), daznVar.c());
        j(dazzVar, daznVar2.a());
    }

    static dazn e() {
        return f.get().b;
    }

    public static dazn f() {
        dazn e2 = e();
        return e2 == null ? new dazh() : e2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dazn g(dazn daznVar) {
        return j(f.get(), daznVar);
    }

    public static boolean h(dbab dbabVar) {
        dbsk.s(dbabVar);
        return e() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String i(dazn daznVar) {
        if (daznVar.a() == null) {
            return daznVar.c();
        }
        String i = i(daznVar.a());
        String c2 = daznVar.c();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 4 + String.valueOf(c2).length());
        sb.append(i);
        sb.append(" -> ");
        sb.append(c2);
        return sb.toString();
    }

    private static dazn j(dazz dazzVar, dazn daznVar) {
        boolean equals;
        dazn daznVar2 = dazzVar.b;
        if (daznVar2 == daznVar) {
            return daznVar;
        }
        if (daznVar2 == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                equals = dazy.a();
            } else {
                equals = "true".equals(czhy.a(a.b, "false"));
            }
            dazzVar.a = equals;
        }
        if (dazzVar.a) {
            k(daznVar2, daznVar);
        }
        if ((daznVar != null && daznVar.f()) || (daznVar2 != null && daznVar2.f())) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            int i = dazzVar.c;
            dazzVar.c = (int) currentThreadTimeMillis;
        }
        dazzVar.b = daznVar;
        return daznVar2;
    }

    private static void k(dazn daznVar, dazn daznVar2) {
        if (daznVar != null) {
            if (daznVar2 != null) {
                if (daznVar.a() == daznVar2) {
                    Trace.endSection();
                    return;
                } else if (daznVar == daznVar2.a()) {
                    l(daznVar2.c());
                    return;
                }
            }
            n(daznVar);
        }
        if (daznVar2 != null) {
            m(daznVar2);
        }
    }

    private static void l(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    private static void m(dazn daznVar) {
        if (daznVar.a() != null) {
            m(daznVar.a());
        }
        l(daznVar.c());
    }

    private static void n(dazn daznVar) {
        Trace.endSection();
        if (daznVar.a() != null) {
            n(daznVar.a());
        }
    }
}
