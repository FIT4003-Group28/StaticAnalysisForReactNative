package org.chromium.base;

import J.N;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes4.dex */
public class EarlyTraceEvent {
    static volatile int a;
    static List b;
    static List c;
    private static boolean d;
    private static final Object e = new Object();

    public static void a(String str, boolean z) {
        if (!d()) {
            return;
        }
        babx babxVar = new babx(str, true, z);
        synchronized (e) {
            if (!d()) {
                return;
            }
            b.add(babxVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b() {
        synchronized (e) {
            if (!d()) {
                return;
            }
            if (!b.isEmpty()) {
                g(b);
                b.clear();
            }
            if (!c.isEmpty()) {
                f(c);
                c.clear();
            }
            a = 2;
            b = null;
            c = null;
        }
    }

    public static void c(String str, boolean z) {
        if (!d()) {
            return;
        }
        babx babxVar = new babx(str, false, z);
        synchronized (e) {
            if (!d()) {
                return;
            }
            b.add(babxVar);
        }
    }

    public static boolean d() {
        return a == 1;
    }

    private static long e() {
        return (N.MklbOJun() * 1000) - SystemClock.elapsedRealtimeNanos();
    }

    private static void f(List list) {
        long e2 = e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            babw babwVar = (babw) it.next();
            if (babwVar.a) {
                N.M_Gv8TwM(babwVar.b, babwVar.c, babwVar.d + e2);
            } else {
                N.MrKsqeCD(babwVar.b, babwVar.c, babwVar.d + e2);
            }
        }
    }

    private static void g(List list) {
        long e2 = e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            babx babxVar = (babx) it.next();
            if (babxVar.a) {
                if (babxVar.b) {
                    N.M7UXCmoq(babxVar.c, babxVar.e + e2, babxVar.d, babxVar.f);
                } else {
                    N.MrWG2uUW(babxVar.c, babxVar.e + e2, babxVar.d, babxVar.f);
                }
            } else if (babxVar.b) {
                N.MRlw2LEn(babxVar.c, babxVar.e + e2, babxVar.d, babxVar.f);
            } else {
                N.MmyrhqXB(babxVar.c, babxVar.e + e2, babxVar.d, babxVar.f);
            }
        }
    }

    public static boolean getBackgroundStartupTracingFlag() {
        return d;
    }

    static void setBackgroundStartupTracingFlag(boolean z) {
        babv.a.edit().putBoolean("bg_startup_tracing", z).apply();
    }
}
