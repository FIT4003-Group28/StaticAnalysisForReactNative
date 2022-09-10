package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bhnf  reason: default package */
/* loaded from: classes3.dex */
public final class bhnf extends ges implements gfw, bhtj {
    private static final dcqe ah = dcqe.c("bhnf");
    public dxio<bbut> a;
    public ccsk ad;
    public gfq ae;
    public cpv af;
    public ccsj ag;
    @dzsi
    private cqkf<bhsc> aj;
    private bhtk ak;
    public bhtl b;
    public gga c;
    public bwqv d;
    public cqkj e;
    public efg f;
    public dxio<cclq> g;
    private final ccsf ai = new bhne(this);
    private bhrw al = bhrw.c;
    private bwrs<ilo> am = bwrs.a(null);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ges
    public final void Oo(View view) {
        if (this.aj != null) {
            if (this.ak.b().isEmpty()) {
                this.af.f(view, this.c.getResources().getString(R.string.OFFERING_DETAILS_UNNAMED_DISH_ACCESSIBILITY_ANNOUNCEMENT));
            } else {
                this.af.f(view, this.c.getResources().getString(R.string.OFFERING_DETAILS_ACCESSIBILITY_ANNOUNCEMENT, this.ak.b()));
            }
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<bhsc> cqkfVar = this.aj;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        this.aj = null;
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof ccwy) {
            bhtk bhtkVar = this.ak;
            ccwu ccwuVar = ((ccwy) obj).b;
            if (ccwuVar == null) {
                ccwuVar = ccwu.d;
            }
            bhtkVar.C(ccwuVar.b);
        } else if (!(obj instanceof bbuf)) {
        } else {
            List<bbtm> a = ((bbuf) obj).a();
            if (a.isEmpty() || !this.ak.h().booleanValue()) {
                return;
            }
            ccwj bZ = ccwk.m.bZ();
            String str = this.ak.A().f;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccwk ccwkVar = (ccwk) bZ.b;
            str.getClass();
            ccwkVar.a |= 4;
            ccwkVar.f = str;
            dgfb b = dgfb.b(this.ak.A().e);
            if (b == null) {
                b = dgfb.UNKNOWN_OFFERING_TYPE;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccwk ccwkVar2 = (ccwk) bZ.b;
            ccwkVar2.b = b.f;
            ccwkVar2.a |= 1;
            ccxa B = this.ak.B();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccwk ccwkVar3 = (ccwk) bZ.b;
            B.getClass();
            ccwkVar3.c = B;
            ccwkVar3.a |= 2;
            ccwk ccwkVar4 = (ccwk) bZ.b;
            ccwkVar4.k = 2;
            ccwkVar4.a |= 128;
            String str2 = this.ak.A().d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccwk ccwkVar5 = (ccwk) bZ.b;
            str2.getClass();
            ccwkVar5.a |= 64;
            ccwkVar5.j = str2;
            bZ.a(dcbg.b(a).s(bhnd.a));
            ccsj ccsjVar = this.ag;
            ccsh g = ccsi.g();
            g.e(bZ.bK());
            g.d(a);
            g.i(8);
            ccsjVar.b(g.j());
        }
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<bhsc> d = this.e.d(new bhrg(), viewGroup, false);
        this.aj = d;
        return d.c();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (!this.aD) {
            return false;
        }
        this.c.g().f();
        return true;
    }

    @Override // defpackage.bhtj
    public final void g() {
        if (!this.aD) {
            return;
        }
        ccln cclnVar = this.al.b;
        if (cclnVar == null) {
            cclnVar = ccln.p;
        }
        if (cclnVar.i.size() <= 0) {
            bvoo.h("Attempted to start add-a-name on offering without photo", new Object[0]);
            return;
        }
        cclq a = this.g.a();
        ccln cclnVar2 = this.al.b;
        if (cclnVar2 == null) {
            cclnVar2 = ccln.p;
        }
        String str = cclnVar2.i.get(0).h;
        ccwj bZ = ccwk.m.bZ();
        dgfb b = dgfb.b(this.ak.A().e);
        if (b == null) {
            b = dgfb.UNKNOWN_OFFERING_TYPE;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccwk ccwkVar = (ccwk) bZ.b;
        ccwkVar.b = b.f;
        ccwkVar.a |= 1;
        ccxa B = this.ak.B();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccwk ccwkVar2 = (ccwk) bZ.b;
        B.getClass();
        ccwkVar2.c = B;
        ccwkVar2.a |= 2;
        String str2 = this.ak.A().d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccwk ccwkVar3 = (ccwk) bZ.b;
        str2.getClass();
        ccwkVar3.a |= 64;
        ccwkVar3.j = str2;
        ccwk bK = bZ.bK();
        ccmb bZ2 = ccme.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ccme ccmeVar = (ccme) bZ2.b;
        ccmeVar.d = 6;
        ccmeVar.a |= 4;
        ccme ccmeVar2 = (ccme) bZ2.b;
        ccmeVar2.b = 2;
        int i = ccmeVar2.a | 1;
        ccmeVar2.a = i;
        ccmeVar2.a = i | 8;
        ccmeVar2.e = true;
        String string = this.c.getResources().getString(R.string.OFFERING_SUGGESTION_DONE_BUTTON);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ccme ccmeVar3 = (ccme) bZ2.b;
        string.getClass();
        ccmeVar3.a |= 2;
        ccmeVar3.c = string;
        a.f("", str, bK, bZ2.bK(), this);
    }

    @Override // defpackage.bhtj
    public final void i() {
        if (!this.aD) {
            return;
        }
        gga ggaVar = this.c;
        ccln A = this.ak.A();
        ccxa B = this.ak.B();
        cclx bZ = ccma.c.bZ();
        bZ.a(cclz.EDIT_NAME);
        bZ.a(cclz.WRONG_NAME);
        bZ.a(cclz.INAPPROPRIATE_NAME);
        bZ.a(cclz.NOT_SERVED);
        ggaVar.D(cclg.g(A, B, bZ.bK()));
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        Bundle bundle2;
        super.l(bundle);
        if (bundle == null) {
            bundle2 = this.o;
            dbsk.s(bundle2);
        } else {
            bundle2 = bundle;
        }
        bhrw bhrwVar = (bhrw) bvrs.e(bundle2, bhrw.class, (dssr) bhrw.c.cu(7));
        dbsk.s(bhrwVar);
        this.al = bhrwVar;
        this.am = cctq.b(bundle2, this.d);
        ccsj a = this.ad.a(this.ai);
        this.ag = a;
        a.e = this.am;
        bhtl bhtlVar = this.b;
        cqhn a2 = bhtlVar.a.a();
        bhtl.a(a2, 1);
        bvrb a3 = bhtlVar.b.a();
        bhtl.a(a3, 2);
        butl a4 = bhtlVar.c.a();
        bhtl.a(a4, 3);
        bvds a5 = bhtlVar.d.a();
        bhtl.a(a5, 4);
        ff ffVar = (ff) ((dxjd) bhtlVar.e).a;
        bhtl.a(ffVar, 5);
        dxio a6 = ((dxjh) bhtlVar.f).a();
        bhtl.a(a6, 6);
        isd a7 = bhtlVar.g.a();
        bhtl.a(a7, 7);
        dxio a8 = ((dxjh) bhtlVar.h).a();
        bhtl.a(a8, 8);
        dxio a9 = ((dxjh) bhtlVar.i).a();
        bhtl.a(a9, 9);
        ccrf a10 = bhtlVar.j.a();
        bhtl.a(a10, 10);
        ccst a11 = bhtlVar.k.a();
        bhtl.a(a11, 11);
        anhk a12 = bhtlVar.l.a();
        bhtl.a(a12, 12);
        bvjj a13 = bhtlVar.m.a();
        bhtl.a(a13, 13);
        btvo a14 = bhtlVar.n.a();
        bhtl.a(a14, 14);
        bvpe a15 = bhtlVar.o.a();
        bhtl.a(a15, 15);
        cclp a16 = bhtlVar.p.a();
        bhtl.a(a16, 16);
        huc a17 = bhtlVar.q.a();
        bhtl.a(a17, 17);
        blnq a18 = bhtlVar.r.a();
        bhtl.a(a18, 18);
        bhsk a19 = bhtlVar.s.a();
        bhtl.a(a19, 19);
        bhhf a20 = bhtlVar.t.a();
        bhtl.a(a20, 20);
        bhtl.a(this, 21);
        bhtk bhtkVar = new bhtk(a2, a3, a4, a5, ffVar, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, this);
        this.ak = bhtkVar;
        dbsk.s(bhtkVar);
        ccln cclnVar = this.al.b;
        if (cclnVar == null) {
            cclnVar = ccln.p;
        }
        bhtkVar.z(cclnVar, this.am, dcdc.e());
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxx.M;
    }

    @Override // defpackage.bhtj
    public final void q() {
        if (!this.aD || !this.ak.h().booleanValue()) {
            return;
        }
        bbuz m = bbve.m();
        ilo c = this.am.c();
        dbsk.s(c);
        ((bbsu) m).b = c;
        m.e(dwyd.OFFERING);
        this.a.a().k(m.a(), this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (!this.ak.H()) {
            this.ak.F();
        }
        if (!this.ak.k().booleanValue()) {
            this.ak.G();
        }
        cqkf<bhsc> cqkfVar = this.aj;
        dbsk.s(cqkfVar);
        cqkfVar.e(this.ak);
        View view = this.P;
        dbsk.s(view);
        efg efgVar = this.f;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(view);
        egjVar.e(this);
        egjVar.J(new egq(this) { // from class: bhnc
            private final bhnf a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                this.a.ag.a();
            }
        });
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        bhrw bhrwVar = this.al;
        dsqp dsqpVar = (dsqp) bhrwVar.cu(5);
        dsqpVar.bC(bhrwVar);
        bhrv bhrvVar = (bhrv) dsqpVar;
        ccln A = this.ak.A();
        if (bhrvVar.c) {
            bhrvVar.bF();
            bhrvVar.c = false;
        }
        bhrw bhrwVar2 = (bhrw) bhrvVar.b;
        bhrw bhrwVar3 = bhrw.c;
        A.getClass();
        bhrwVar2.b = A;
        bhrwVar2.a |= 1;
        this.al = bhrvVar.bK();
        cctq.a(bundle, this.d, this.am);
        bvrs.l(bundle, this.al);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        jmw.d(this.c, null);
        cqkf<bhsc> cqkfVar = this.aj;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        super.u();
    }

    @Override // defpackage.bhtj
    public final void w() {
        if (!this.aD) {
            return;
        }
        gfq.m(this);
    }
}
