package defpackage;
/* compiled from: PG */
/* renamed from: afnc  reason: default package */
/* loaded from: classes2.dex */
public final class afnc implements afni {
    public final dxio<asim> a;
    private final gga b;

    public afnc(gga ggaVar, dxio<asim> dxioVar) {
        this.b = ggaVar;
        this.a = dxioVar;
    }

    @Override // defpackage.afni
    public final Runnable a(vun vunVar, amsy amsyVar, qbs qbsVar) {
        amtd amtdVar = new amtd();
        amtdVar.d(vunVar.b);
        amtdVar.a = amsyVar;
        amtdVar.e(amvj.e(amsyVar, this.b));
        amtdVar.b = vunVar.a();
        final amte a = amtdVar.a();
        final int o = amsyVar.o();
        return new Runnable(this, a, o) { // from class: afna
            private final afnc a;
            private final amte b;
            private final int c;

            {
                this.a = this;
                this.b = a;
                this.c = o;
            }

            @Override // java.lang.Runnable
            public final void run() {
                afnc afncVar = this.a;
                afncVar.a.a().i(this.b, this.c);
            }
        };
    }

    @Override // defpackage.afni
    public final Runnable b(vun vunVar, qbs qbsVar) {
        qcw x = qcx.x();
        x.k(qbsVar);
        x.s(vunVar.a());
        x.r(vunVar.l.get(0));
        x.u(vunVar.l.get(1));
        x.w(vunVar.b);
        x.g(vunVar.e);
        x.h(vunVar.f);
        x.v(vunVar.p);
        final qcx a = x.a();
        return new Runnable(this, a) { // from class: afnb
            private final afnc a;
            private final qcx b;

            {
                this.a = this;
                this.b = a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                afnc afncVar = this.a;
                afncVar.a.a().h(this.b);
            }
        };
    }
}
