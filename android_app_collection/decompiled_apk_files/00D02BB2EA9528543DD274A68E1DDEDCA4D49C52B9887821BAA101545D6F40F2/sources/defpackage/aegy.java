package defpackage;
/* compiled from: PG */
/* renamed from: aegy  reason: default package */
/* loaded from: classes2.dex */
public final class aegy implements aeht {
    @dzsi
    public dnnn a;
    private final btrm b;
    private final aehr c;
    private final bvrb d;
    @dzsi
    private bvpk g;
    private final crzo<Boolean> e = new crzo<>(Boolean.FALSE);
    private long f = 0;
    private int i = 1;
    private final aegx h = new aegx(this);

    public aegy(btrm btrmVar, aehr aehrVar, bvrb bvrbVar) {
        this.b = btrmVar;
        this.c = aehrVar;
        this.d = bvrbVar;
    }

    @Override // defpackage.aeht
    public final void a(final dnnn dnnnVar) {
        if (!this.c.i()) {
            this.a = dnnnVar;
        }
        h(true);
        bvpk bvpkVar = this.g;
        if (bvpkVar != null) {
            bvpkVar.b();
        }
        bvpk a = bvpk.a(new Runnable(this, dnnnVar) { // from class: aegw
            private final aegy a;
            private final dnnn b;

            {
                this.a = this;
                this.b = dnnnVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.c(this.b);
            }
        });
        this.g = a;
        this.d.a(a, bvrj.UI_THREAD, (Math.min(6L, this.f) * 250) + 750);
        this.f++;
    }

    @Override // defpackage.aeht
    public final void b(dnnn dnnnVar) {
        if (!this.c.i()) {
            this.a = dnnnVar;
        }
        c(dnnnVar);
        h(true);
    }

    @Override // defpackage.aeht
    public final dnnn d() {
        dnnn dnnnVar = this.a;
        if (dnnnVar == null) {
            dnnnVar = aehr.a();
        }
        dsqp dsqpVar = (dsqp) dnnnVar.cu(5);
        dsqpVar.bC(dnnnVar);
        dnnh dnnhVar = (dnnh) dsqpVar;
        if (this.i != 2) {
            if (dnnhVar.c) {
                dnnhVar.bF();
                dnnhVar.c = false;
            }
            dnnn dnnnVar2 = (dnnn) dnnhVar.b;
            dnnn dnnnVar3 = dnnn.l;
            dnnnVar2.a &= -17;
            dnnnVar2.f = 0;
            return dnnhVar.bK();
        }
        if (dnnhVar.c) {
            dnnhVar.bF();
            dnnhVar.c = false;
        }
        dnnn dnnnVar4 = (dnnn) dnnhVar.b;
        dnnn dnnnVar5 = dnnn.l;
        dnnnVar4.f = 1;
        dnnnVar4.a |= 16;
        return dnnhVar.bK();
    }

    @Override // defpackage.aeht
    public final dnnn e(dbsg<dnnn> dbsgVar) {
        return this.c.h(dbsgVar.c(d()));
    }

    @Override // defpackage.aeht
    public final void f() {
        btrm btrmVar = this.b;
        aegx aegxVar = this.h;
        dceq a = dcet.a();
        a.b(gds.class, new aegz(gds.class, aegxVar, bvrj.UI_THREAD));
        btrmVar.g(aegxVar, a.a());
    }

    @Override // defpackage.aeht
    public final void g() {
        this.b.a(this.h);
    }

    @Override // defpackage.aeht
    public final void h(boolean z) {
        this.e.a(Boolean.valueOf(z));
    }

    @Override // defpackage.aeht
    public final crzm<Boolean> i() {
        return this.e.a;
    }

    @Override // defpackage.aeht
    public final void j(int i) {
        this.i = i;
    }

    public final void c(dnnn dnnnVar) {
        dnnn bK;
        this.f = 0L;
        if (this.i == 2) {
            dsqp dsqpVar = (dsqp) dnnnVar.cu(5);
            dsqpVar.bC(dnnnVar);
            dnnh dnnhVar = (dnnh) dsqpVar;
            int i = this.i;
            if (dnnhVar.c) {
                dnnhVar.bF();
                dnnhVar.c = false;
            }
            dnnn dnnnVar2 = (dnnn) dnnhVar.b;
            int i2 = i - 1;
            dnnn dnnnVar3 = dnnn.l;
            if (i == 0) {
                throw null;
            }
            dnnnVar2.f = i2;
            dnnnVar2.a |= 16;
            bK = dnnhVar.bK();
        } else {
            dsqp dsqpVar2 = (dsqp) dnnnVar.cu(5);
            dsqpVar2.bC(dnnnVar);
            dnnh dnnhVar2 = (dnnh) dsqpVar2;
            if (dnnhVar2.c) {
                dnnhVar2.bF();
                dnnhVar2.c = false;
            }
            dnnn dnnnVar4 = (dnnn) dnnhVar2.b;
            dnnn dnnnVar5 = dnnn.l;
            dnnnVar4.a &= -17;
            dnnnVar4.f = 0;
            bK = dnnhVar2.bK();
        }
        this.b.b(new aehq(bK));
    }
}
