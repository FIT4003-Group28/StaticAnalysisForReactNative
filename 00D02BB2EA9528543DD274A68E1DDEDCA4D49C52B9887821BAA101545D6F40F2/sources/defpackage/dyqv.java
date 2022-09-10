package defpackage;

import java.util.HashSet;
/* compiled from: PG */
/* renamed from: dyqv  reason: default package */
/* loaded from: classes6.dex */
final class dyqv<ReqT> extends dyut<ReqT> {
    final /* synthetic */ dyib a;
    final /* synthetic */ dyet b;
    final /* synthetic */ dyfo c;
    final /* synthetic */ dyqw d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dyqv(defpackage.dyqw r15, defpackage.dyib r16, defpackage.dyhw r17, defpackage.dyet r18, defpackage.dyuu r19, defpackage.dyoy r20, defpackage.dyus r21, defpackage.dyfo r22) {
        /*
            r14 = this;
            r13 = r14
            r0 = r15
            r1 = r18
            r13.d = r0
            r2 = r16
            r13.a = r2
            r13.b = r1
            r3 = r22
            r13.c = r3
            dyrz r3 = r0.a
            dyuh r4 = r3.N
            long r5 = r3.O
            long r7 = r3.P
            java.util.concurrent.Executor r9 = r3.s(r1)
            dyrz r0 = r0.a
            dylx r0 = r0.i
            java.util.concurrent.ScheduledExecutorService r10 = r0.b()
            r0 = r14
            r1 = r16
            r2 = r17
            r3 = r4
            r4 = r5
            r6 = r7
            r8 = r9
            r9 = r10
            r10 = r19
            r11 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyqv.<init>(dyqw, dyib, dyhw, dyet, dyuu, dyoy, dyus, dyfo):void");
    }

    @Override // defpackage.dyut
    public final dyjb o() {
        dyry dyryVar = this.d.a.z;
        synchronized (dyryVar.a) {
            dyjb dyjbVar = dyryVar.c;
            if (dyjbVar != null) {
                return dyjbVar;
            }
            dyryVar.b.add(this);
            return null;
        }
    }

    @Override // defpackage.dyut
    public final void p() {
        dyjb dyjbVar;
        dyry dyryVar = this.d.a.z;
        synchronized (dyryVar.a) {
            dyryVar.b.remove(this);
            if (dyryVar.b.isEmpty()) {
                dyjbVar = dyryVar.c;
                dyryVar.b = new HashSet();
            } else {
                dyjbVar = null;
            }
        }
        if (dyjbVar != null) {
            dyryVar.d.y.e(dyjbVar);
        }
    }

    @Override // defpackage.dyut
    public final dyls q(dyfb dyfbVar, dyhw dyhwVar) {
        dyet c = this.b.c(dyfbVar);
        dylv a = this.d.a(new dytf(this.a, dyhwVar, c));
        dyfo b = this.c.b();
        try {
            return a.d(this.a, dyhwVar, c);
        } finally {
            this.c.c(b);
        }
    }
}
