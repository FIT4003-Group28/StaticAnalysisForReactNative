package defpackage;
/* compiled from: PG */
/* renamed from: afnf  reason: default package */
/* loaded from: classes2.dex */
public final class afnf implements afnu {
    public final dxio<asim> a;

    public afnf(dxio<asim> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.afnu
    public final Runnable a(dvzj dvzjVar) {
        akqq akqqVar;
        String str = null;
        if ((dvzjVar.a & 4) != 0) {
            dhjz dhjzVar = dvzjVar.d;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            akqqVar = akqq.j(dhjzVar);
        } else {
            akqqVar = null;
        }
        if ((dvzjVar.a & 2) != 0) {
            str = dvzjVar.c;
        } else if (akqqVar != null) {
            str = akqqVar.a();
        }
        qcw x = qcx.x();
        amvg P = amvh.P();
        P.b = str;
        P.c = akqi.f(dvzjVar.b);
        P.d = akqqVar;
        x.u(P.a());
        final qcx a = x.a();
        return new Runnable(this, a) { // from class: afne
            private final afnf a;
            private final qcx b;

            {
                this.a = this;
                this.b = a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                afnf afnfVar = this.a;
                afnfVar.a.a().h(this.b);
            }
        };
    }

    @Override // defpackage.afnu
    public final Runnable b(ilo iloVar, boolean z) {
        qcw x = qcx.x();
        x.u(iloVar.d());
        final qcx a = x.a();
        return new Runnable(this, a) { // from class: afnd
            private final afnf a;
            private final qcx b;

            {
                this.a = this;
                this.b = a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                afnf afnfVar = this.a;
                afnfVar.a.a().h(this.b);
            }
        };
    }
}
