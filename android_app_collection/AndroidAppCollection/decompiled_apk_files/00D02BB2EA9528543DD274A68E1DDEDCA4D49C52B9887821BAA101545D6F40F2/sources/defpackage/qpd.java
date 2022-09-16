package defpackage;
/* compiled from: PG */
/* renamed from: qpd  reason: default package */
/* loaded from: classes7.dex */
final class qpd implements acyt {
    final /* synthetic */ qph a;
    private ddmo b = ddmo.UNKNOWN_EXPANSION;
    private int c;

    public qpd(qph qphVar, acyu acyuVar) {
        this.a = qphVar;
        this.c = acyuVar.c();
    }

    @Override // defpackage.acyt
    public final void a(boolean z) {
        dead deadVar;
        acyu acyuVar = this.a.l;
        if (acyuVar == null) {
            return;
        }
        ddmo c = aefy.c(acyuVar);
        ddmo ddmoVar = this.b;
        this.b = c;
        boolean equals = c.equals(ddmo.FULL_EXPANSION);
        qph qphVar = this.a;
        if (equals != qphVar.i) {
            qphVar.i = equals;
            cqkx.p(qphVar);
            mw<Boolean> mwVar = this.a.j;
            if (mwVar != null) {
                mwVar.a(Boolean.valueOf(equals));
            }
        }
        acyu acyuVar2 = this.a.l;
        dbsk.s(acyuVar2);
        int c2 = acyuVar2.c();
        if (z && !c.equals(ddmoVar)) {
            ddmp bZ = ddmq.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddmq ddmqVar = (ddmq) bZ.b;
            ddmqVar.c = ddmoVar.f;
            int i = ddmqVar.a | 2;
            ddmqVar.a = i;
            ddmqVar.b = c.f;
            ddmqVar.a = i | 1;
            cjta b = cjtd.b();
            b.d = dtyc.cu;
            b.l(bZ.bK());
            cjtd a = b.a();
            if (c2 - this.c > 0) {
                deadVar = dead.UP;
            } else {
                deadVar = dead.DOWN;
            }
            this.a.e.m(new cjte(deaf.DRAG, deadVar), a);
        }
        this.c = c2;
    }

    @Override // defpackage.acyt
    public final void b(int i) {
    }
}
