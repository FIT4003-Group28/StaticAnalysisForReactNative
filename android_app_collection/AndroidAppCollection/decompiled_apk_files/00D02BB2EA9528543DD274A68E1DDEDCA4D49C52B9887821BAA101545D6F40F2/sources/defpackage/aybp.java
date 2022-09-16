package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aybp  reason: default package */
/* loaded from: classes3.dex */
public final class aybp {
    public final boolean a;
    private final gga b;
    private final baal c;
    private final baad d;
    private final bbtu e;
    private final bnju f;
    private final dxio<bdhl> g;

    public aybp(gga ggaVar, bbtu bbtuVar, dxio<bdhl> dxioVar, baal baalVar, bnju bnjuVar) {
        this.b = ggaVar;
        this.g = dxioVar;
        this.e = bbtuVar;
        this.c = baalVar;
        baad b = baalVar.b();
        this.d = b;
        this.f = bnjuVar;
        boolean z = false;
        if (b != null && bnjuVar != null && b.y()) {
            z = true;
        }
        this.a = z;
    }

    public final izx a(final gfw gfwVar) {
        final bvqg bvqgVar = new bvqg(this, gfwVar) { // from class: aybn
            private final aybp a;
            private final gfw b;

            {
                this.a = this;
                this.b = gfwVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.b(this.b, (bdhg) obj);
            }
        };
        if (this.a) {
            cqtd i = cqtt.i(cqrt.g(2131232718, ibl.b()), cqrp.d(18.0d), cqrp.d(18.0d));
            cqvf l = cqrt.l(R.string.CHOOSE_PHOTO_BUTTON_TEXT);
            cqss b = ibl.b();
            ivc ivcVar = new ivc(this, bvqgVar) { // from class: aybo
                private final aybp a;
                private final bvqg b;

                {
                    this.a = this;
                    this.b = bvqgVar;
                }

                @Override // defpackage.ivc
                public final void a(cjqm cjqmVar) {
                    this.b.NU(this.a.c());
                }
            };
            baad baadVar = this.d;
            dbsk.s(baadVar);
            return new ivd(i, l, b, ivcVar, false, false, cjtd.a(baadVar.x() ? dtxo.V : dtxo.R), cqrt.m(R.string.CHOOSE_PHOTO_BUTTON_CONTENT_DESCRIPTION, this.c.y(this.b.getApplicationContext())));
        }
        return null;
    }

    public final void b(gfw gfwVar, bdhg bdhgVar) {
        if (this.b.aZ) {
            this.g.a().e(gfwVar, bdhgVar);
        }
    }

    public final bdhg c() {
        bdhe k = bdhg.k();
        bnju bnjuVar = this.f;
        dbsk.s(bnjuVar);
        k.c(bnjuVar.aH().ai().o());
        k.g(cqrt.l(R.string.CHOOSE_PHOTO_BUTTON_TEXT).a(this.b).toString());
        bnju bnjuVar2 = this.f;
        dbsk.s(bnjuVar2);
        k.f(bnjuVar2.aH().n());
        k.e(bdhf.SINGLE);
        bdhb bdhbVar = (bdhb) k;
        bdhbVar.d = 1;
        baad baadVar = this.d;
        dbsk.s(baadVar);
        bdhbVar.b = baadVar.l();
        if (this.c.j() != null) {
            dwfl j = this.c.j();
            dbsk.s(j);
            dsqp dsqpVar = (dsqp) j.cu(5);
            dsqpVar.bC(j);
            dwfi dwfiVar = (dwfi) dsqpVar;
            dizh dizhVar = j.p;
            if (dizhVar == null) {
                dizhVar = dizh.j;
            }
            dsqp dsqpVar2 = (dsqp) dizhVar.cu(5);
            dsqpVar2.bC(dizhVar);
            dizg dizgVar = (dizg) dsqpVar2;
            dghj bZ = dghk.g.bZ();
            dggc dggcVar = dggc.PHOTO;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dghk dghkVar = (dghk) bZ.b;
            dghkVar.b = dggcVar.f;
            dghkVar.a |= 2;
            if (dizgVar.c) {
                dizgVar.bF();
                dizgVar.c = false;
            }
            dizh dizhVar2 = (dizh) dizgVar.b;
            dghk bK = bZ.bK();
            bK.getClass();
            dizhVar2.c = bK;
            dizhVar2.a |= 2;
            if (dwfiVar.c) {
                dwfiVar.bF();
                dwfiVar.c = false;
            }
            dwfl dwflVar = (dwfl) dwfiVar.b;
            dizh bK2 = dizgVar.bK();
            bK2.getClass();
            dwflVar.p = bK2;
            dwflVar.a |= 32768;
            k.d(dcdc.f(this.e.a(dwfiVar.bK(), eaou.i())));
        }
        return k.a();
    }
}
