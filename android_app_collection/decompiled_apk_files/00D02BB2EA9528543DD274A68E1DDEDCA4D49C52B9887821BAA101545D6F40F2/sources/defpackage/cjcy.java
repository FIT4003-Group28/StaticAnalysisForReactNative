package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cjcy  reason: default package */
/* loaded from: classes4.dex */
public final class cjcy {
    public final angp a;
    public final cjdf b;

    public cjcy(angp angpVar, cjdf cjdfVar) {
        this.a = angpVar;
        this.b = cjdfVar;
    }

    public static dwyn a(long j) {
        dwym bZ = dwyn.d.bZ();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwyn dwynVar = (dwyn) bZ.b;
        dwynVar.a |= 1;
        dwynVar.b = seconds;
        return bZ.bK();
    }
}
