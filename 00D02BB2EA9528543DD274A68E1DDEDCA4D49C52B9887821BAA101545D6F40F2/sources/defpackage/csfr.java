package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: csfr  reason: default package */
/* loaded from: classes5.dex */
public final class csfr {
    private static final AtomicInteger a = new AtomicInteger();
    private static final long b;
    private static final long c;
    private static final ddyb d;

    static {
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        b = currentTimeMillis;
        c = SystemClock.elapsedRealtime() * 1000;
        ddya bZ = ddyb.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddyb ddybVar = (ddyb) bZ.b;
        int i = ddybVar.a | 2;
        ddybVar.a = i;
        ddybVar.c = 0;
        ddybVar.a = i | 4;
        ddybVar.d = 0;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddyb ddybVar2 = (ddyb) bZ.b;
        ddybVar2.a |= 1;
        ddybVar2.b = currentTimeMillis;
        d = bZ.bK();
    }

    public static ddxz a() {
        ddxy bZ = ddxz.d.bZ();
        long andIncrement = a.getAndIncrement();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddxz ddxzVar = (ddxz) bZ.b;
        ddxzVar.a |= 2;
        ddxzVar.c = andIncrement;
        ddyb ddybVar = d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddxz ddxzVar2 = (ddxz) bZ.b;
        ddybVar.getClass();
        ddxzVar2.b = ddybVar;
        ddxzVar2.a |= 1;
        return bZ.bK();
    }

    public static long b(long j) {
        return (b + j) - c;
    }
}
