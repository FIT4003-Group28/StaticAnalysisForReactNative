package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dyrw  reason: default package */
/* loaded from: classes6.dex */
final class dyrw implements Runnable {
    final /* synthetic */ dyrx a;

    public dyrw(dyrx dyrxVar) {
        this.a = dyrxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dyjh dyjhVar;
        dyrx dyrxVar = this.a;
        dyrxVar.i.m.c();
        if (dyrxVar.e == null) {
            dyrxVar.g = true;
            return;
        }
        if (!dyrxVar.g) {
            dyrxVar.g = true;
        } else if (!dyrxVar.i.C || (dyjhVar = dyrxVar.h) == null) {
            return;
        } else {
            dyjhVar.a();
            dyrxVar.h = null;
        }
        if (!dyrxVar.i.C) {
            dyrxVar.h = dyrxVar.i.m.d(new dyqh(new dyru(dyrxVar)), 5L, TimeUnit.SECONDS, dyrxVar.i.i.b());
        } else {
            dyrxVar.e.e(dyrz.d);
        }
    }
}
