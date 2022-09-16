package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: qsq  reason: default package */
/* loaded from: classes7.dex */
public final class qsq {
    public static dosz a(eaph eaphVar, int i) {
        long j = eaphVar.a(eaou.b).a;
        dosy bZ = dosz.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dosz doszVar = (dosz) bZ.b;
        doszVar.c = 2;
        doszVar.a = 2 | doszVar.a;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dosz doszVar2 = (dosz) bZ.b;
        int i2 = doszVar2.a | 4;
        doszVar2.a = i2;
        doszVar2.d = seconds;
        doszVar2.b = i - 1;
        doszVar2.a = i2 | 1;
        return bZ.bK();
    }
}
