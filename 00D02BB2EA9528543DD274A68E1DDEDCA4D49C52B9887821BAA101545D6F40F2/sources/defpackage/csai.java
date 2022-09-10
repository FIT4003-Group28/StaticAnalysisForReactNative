package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: csai  reason: default package */
/* loaded from: classes5.dex */
final class csai extends dyga {
    final /* synthetic */ csaj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csai(csaj csajVar, dyew dyewVar) {
        super(dyewVar);
        this.a = csajVar;
    }

    @Override // defpackage.dyir, defpackage.dyew
    public final void b(dyjb dyjbVar, dyhw dyhwVar) {
        csam csamVar = this.a.a;
        synchronized (csamVar.a) {
            if (!csamVar.c) {
                csamVar.c = true;
                csak csakVar = csamVar.b;
                if (csakVar == null) {
                    csamVar.d.u = dyjbVar.p.r;
                    cwsy.b().d(csamVar.d);
                } else {
                    synchronized (csakVar.a) {
                        cxaj cxajVar = csakVar.b;
                        int i = csakVar.d;
                        int i2 = csakVar.e;
                        cxajVar.c = SystemClock.elapsedRealtime() - cxajVar.a;
                        cxajVar.d = i;
                        cxajVar.e = i2;
                        csakVar.b.u = dyjbVar.p.r;
                        cwsy.b().d(csakVar.b);
                        csakVar.c = true;
                    }
                }
            }
        }
        super.b(dyjbVar, dyhwVar);
    }
}
