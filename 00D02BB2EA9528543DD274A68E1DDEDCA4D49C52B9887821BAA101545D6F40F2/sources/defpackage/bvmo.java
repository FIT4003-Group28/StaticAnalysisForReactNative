package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: bvmo  reason: default package */
/* loaded from: classes.dex */
public final class bvmo {
    public static final bvmn a = new bvmn(ddda.C, ddda.D);
    public static final bvmn b = new bvmn(ddda.r, ddda.s);
    public static final bvmn c = new bvmn(ddda.z, ddda.A);
    public static final bvmn d = new bvmn(ddda.v, ddda.w);
    public static final bvmn e = new bvmn(ddda.x, ddda.y);
    public static final bvmn f = new bvmn(ddda.t, ddda.u);
    public static ckcy g = new ckda();
    private static cjws h;

    private bvmo() {
    }

    public static void a(cjws cjwsVar) {
        synchronized (bvmo.class) {
            h = cjwsVar;
        }
    }

    public static void b(ddda dddaVar) {
        synchronized (bvmo.class) {
            cjws cjwsVar = h;
            if (cjwsVar == null) {
                return;
            }
            cjwsVar.b(dddaVar);
            ckcy ckcyVar = g;
            if (ckcyVar == null) {
                return;
            }
            ckcyVar.e(dddaVar);
        }
    }

    public static void c(bvmn bvmnVar) {
        ddda dddaVar = bvmnVar.a;
        b(dddaVar);
        dddaVar.c();
    }

    public static void d(bvmn bvmnVar) {
        ddda dddaVar = bvmnVar.b;
        bvmnVar.a.c();
        b(dddaVar);
    }

    public static cxdy e(String str) {
        cxei cxeiVar = cxeq.a.get();
        if (cxeiVar == null) {
            return cxdy.a;
        }
        cxdy cxdyVar = new cxdy(str, Thread.currentThread().getId(), 3);
        cxeiVar.a().push(cxdyVar);
        return cxdyVar;
    }

    public static void f(cxdy cxdyVar) {
        cxeq.a(cxdyVar);
    }

    public static void g(long j) {
        SystemClock.elapsedRealtime();
        synchronized (bvmo.class) {
            cjws cjwsVar = h;
            if (cjwsVar == null) {
                return;
            }
            cjwsVar.c(j);
            ckcy ckcyVar = g;
            if (ckcyVar == null) {
                return;
            }
            ckcyVar.d(j);
        }
    }
}
