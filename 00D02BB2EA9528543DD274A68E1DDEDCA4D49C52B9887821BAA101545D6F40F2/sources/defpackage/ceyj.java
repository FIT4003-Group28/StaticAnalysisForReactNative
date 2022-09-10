package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ceyj  reason: default package */
/* loaded from: classes4.dex */
public class ceyj extends cevg<dwvz, dwwb> implements ceti, ceuz {
    public cesa a;
    private final Activity b;
    private final btrm c;
    private final ceyb d;
    private final ceup e;
    private final cebr h;
    private final cese i;
    private final boolean j;
    @dzsi
    private final String k;
    private final List<cetg> l;
    private List<cetj> m;
    private List<cetj> n;

    public ceyj(Activity activity, btrm btrmVar, cqhn cqhnVar, btvo btvoVar, cese ceseVar, cefh cefhVar, ceyb ceybVar, cebr cebrVar, cgrc cgrcVar, String str, @dzsi String str2, drfs drfsVar, boolean z) {
        super(activity, cqhnVar, cefhVar.a(cgrcVar, cesf.a(str2, btvoVar, duls.g, drfsVar, ceseVar, cebrVar)), str);
        this.l = new ArrayList();
        this.m = dcdc.e();
        this.n = dcdc.e();
        this.a = cesd.g.bZ();
        this.b = activity;
        this.c = btrmVar;
        this.d = ceybVar;
        this.h = cebrVar;
        this.i = ceseVar;
        this.k = str2;
        this.j = z;
        if (!drfsVar.equals(drfs.c)) {
            cesa cesaVar = this.a;
            if (cesaVar.c) {
                cesaVar.bF();
                cesaVar.c = false;
            }
            cesd cesdVar = (cesd) cesaVar.b;
            drfsVar.getClass();
            cesdVar.e = drfsVar;
            cesdVar.a |= 2;
        }
        this.e = new ceup(ceseVar, true);
    }

    private final ceya A(cdjd cdjdVar, drkr drkrVar) {
        dbsg<drfs> dbsgVar;
        ceyb ceybVar = this.d;
        boolean z = this.k == null;
        cesd cesdVar = (cesd) this.a.b;
        if ((cesdVar.a & 2) != 0) {
            drfs drfsVar = cesdVar.e;
            if (drfsVar == null) {
                drfsVar = drfs.c;
            }
            dbsgVar = dbsg.i(drfsVar);
        } else {
            dbsgVar = dbpy.a;
        }
        return ceybVar.a(cdjdVar, drkrVar, z, dbsgVar);
    }

    private final void B() {
        for (cetg cetgVar : this.l) {
            ((cext) cetgVar.a()).p();
        }
    }

    private final void w() {
        cesa cesaVar = this.a;
        if (cesaVar.c) {
            cesaVar.bF();
            cesaVar.c = false;
        }
        cesd cesdVar = cesd.g;
        ((cesd) cesaVar.b).b = cesd.ck();
        cesa cesaVar2 = this.a;
        if (cesaVar2.c) {
            cesaVar2.bF();
            cesaVar2.c = false;
        }
        ((cesd) cesaVar2.b).c = cesd.ck();
        B();
        this.l.clear();
        cqkx.p(this);
        this.f.h();
        cqkx.p(this);
    }

    private final void x() {
        int a;
        drdk drdkVar;
        dccx F = dcdc.F();
        drdu drduVar = ((cesd) this.a.b).d;
        if (drduVar == null) {
            drduVar = drdu.d;
        }
        for (drea dreaVar : drduVar.b) {
            if (cesf.c(dreaVar, this.i)) {
                drec drecVar = dreaVar.b;
                if (drecVar == null) {
                    drecVar = drec.c;
                }
                String str = "";
                String str2 = drecVar.a == 1 ? (String) drecVar.b : str;
                drfs drfsVar = ((cesd) this.a.b).e;
                if (drfsVar == null) {
                    drfsVar = drfs.c;
                }
                if (drfsVar.a == 1) {
                    drdkVar = (drdk) drfsVar.b;
                } else {
                    drdkVar = drdk.c;
                }
                if (drdkVar.a == 1) {
                    str = (String) drdkVar.b;
                }
                F.g(new ceva(dreaVar, this, str2.equals(str)));
            }
        }
        dcdc f = F.f();
        dccx F2 = dcdc.F();
        dccx F3 = dcdc.F();
        if (!f.isEmpty()) {
            ceuy ceuyVar = new ceuy(this.b, this, !((((cesd) this.a.b).a & 2) != 0));
            F3.g(ceuyVar);
            F3.i(f);
            if (!this.j && f.size() >= 6 && (((a = cesc.a(((cesd) this.a.b).f)) == 0 || a != 3) && !dcbg.b(f.subList(4, f.size())).p(new dbsl(this) { // from class: ceyi
                private final ceyj a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    drdk drdkVar2;
                    ceyj ceyjVar = this.a;
                    String k = ((ceva) obj).k();
                    drfs drfsVar2 = ((cesd) ceyjVar.a.b).e;
                    if (drfsVar2 == null) {
                        drfsVar2 = drfs.c;
                    }
                    if (drfsVar2.a == 1) {
                        drdkVar2 = (drdk) drfsVar2.b;
                    } else {
                        drdkVar2 = drdk.c;
                    }
                    return k.equals(drdkVar2.a == 1 ? (String) drdkVar2.b : "");
                }
            }))) {
                F2.g(ceuyVar);
                F2.i(f.subList(0, 4));
                F2.g(new ceux(this, f.size() - 4));
                cesa cesaVar = this.a;
                if (cesaVar.c) {
                    cesaVar.bF();
                    cesaVar.c = false;
                }
                cesd cesdVar = (cesd) cesaVar.b;
                cesdVar.f = 1;
                cesdVar.a |= 4;
            } else {
                cesa cesaVar2 = this.a;
                if (cesaVar2.c) {
                    cesaVar2.bF();
                    cesaVar2.c = false;
                }
                cesd cesdVar2 = (cesd) cesaVar2.b;
                cesdVar2.f = 2;
                cesdVar2.a |= 4;
            }
        }
        this.m = F2.f();
        this.n = F3.f();
    }

    private final void y(List<drdy> list) {
        for (drdy drdyVar : list) {
            docg docgVar = drdyVar.a;
            if (docgVar == null) {
                docgVar = docg.M;
            }
            cdrr r = cdrr.r(docgVar, cdja.PUBLISHED);
            drkr drkrVar = drdyVar.b;
            if (drkrVar == null) {
                drkrVar = drkr.d;
            }
            ceya A = A(r, drkrVar);
            ((cext) A.a()).o();
            this.l.add(A);
            cesa cesaVar = this.a;
            if (cesaVar.c) {
                cesaVar.bF();
                cesaVar.c = false;
            }
            cesd cesdVar = (cesd) cesaVar.b;
            cesd cesdVar2 = cesd.g;
            drdyVar.getClass();
            dsrj<drdy> dsrjVar = cesdVar.b;
            if (!dsrjVar.a()) {
                cesdVar.b = dsqw.cl(dsrjVar);
            }
            cesdVar.b.add(drdyVar);
        }
    }

    private final void z(List<djda> list) {
        for (djda djdaVar : list) {
            dmbw dmbwVar = djdaVar.a;
            if (dmbwVar == null) {
                dmbwVar = dmbw.d;
            }
            if ((dmbwVar.a & 1) != 0) {
                dmbc dmbcVar = dmbwVar.b;
                if (dmbcVar == null) {
                    dmbcVar = dmbc.h;
                }
                dmbg dmbgVar = dmbcVar.d;
                if (dmbgVar == null) {
                    dmbgVar = dmbg.i;
                }
                int i = dmbgVar.a;
                if ((i & 1) != 0 || (i & 2) != 0 || dmbgVar.d.size() > 0) {
                    dmbc dmbcVar2 = dmbwVar.b;
                    if (dmbcVar2 == null) {
                        dmbcVar2 = dmbc.h;
                    }
                    cdsa cdsaVar = new cdsa(dmbcVar2);
                    drkr drkrVar = djdaVar.b;
                    if (drkrVar == null) {
                        drkrVar = drkr.d;
                    }
                    ceya A = A(cdsaVar, drkrVar);
                    ((cext) A.a()).o();
                    this.l.add(A);
                }
            }
            cesa cesaVar = this.a;
            if (cesaVar.c) {
                cesaVar.bF();
                cesaVar.c = false;
            }
            cesd cesdVar = (cesd) cesaVar.b;
            cesd cesdVar2 = cesd.g;
            djdaVar.getClass();
            dsrj<djda> dsrjVar = cesdVar.c;
            if (!dsrjVar.a()) {
                cesdVar.c = dsqw.cl(dsrjVar);
            }
            cesdVar.c.add(djdaVar);
        }
    }

    @Override // defpackage.ceuz
    public void a(drea dreaVar) {
        drdk drdkVar;
        drec drecVar = dreaVar.b;
        if (drecVar == null) {
            drecVar = drec.c;
        }
        String str = "";
        String str2 = drecVar.a == 1 ? (String) drecVar.b : str;
        drfs drfsVar = ((cesd) this.a.b).e;
        if (drfsVar == null) {
            drfsVar = drfs.c;
        }
        if (drfsVar.a == 1) {
            drdkVar = (drdk) drfsVar.b;
        } else {
            drdkVar = drdk.c;
        }
        if (drdkVar.a == 1) {
            str = (String) drdkVar.b;
        }
        if (str.equals(str2)) {
            h();
            return;
        }
        this.l.clear();
        cesa cesaVar = this.a;
        drfr bZ = drfs.c.bZ();
        drdj bZ2 = drdk.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drdk drdkVar2 = (drdk) bZ2.b;
        str2.getClass();
        drdkVar2.a = 1;
        drdkVar2.b = str2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drfs drfsVar2 = (drfs) bZ.b;
        drdk bK = bZ2.bK();
        bK.getClass();
        drfsVar2.b = bK;
        drfsVar2.a = 1;
        if (cesaVar.c) {
            cesaVar.bF();
            cesaVar.c = false;
        }
        cesd cesdVar = (cesd) cesaVar.b;
        drfs bK2 = bZ.bK();
        bK2.getClass();
        cesdVar.e = bK2;
        cesdVar.a |= 2;
        for (cetj cetjVar : this.n) {
            if (cetjVar instanceof ceuy) {
                ((ceuy) cetjVar).j(false);
            } else if (cetjVar instanceof ceva) {
                ceva cevaVar = (ceva) cetjVar;
                cevaVar.j(Boolean.valueOf(cevaVar.k().equals(str2)));
            }
        }
        cqkx.p(this);
        cefg cefgVar = (cefg) this.f;
        drfs drfsVar3 = ((cesd) this.a.b).e;
        if (drfsVar3 == null) {
            drfsVar3 = drfs.c;
        }
        cefgVar.m(drfsVar3);
        cqkx.p(this);
    }

    @Override // defpackage.ceey
    public void c(btzy btzyVar) {
        this.f.g();
    }

    @Override // defpackage.ceti
    public List<cetg> d() {
        return this.l;
    }

    @Override // defpackage.ceti
    public cesn e() {
        return this.e;
    }

    @Override // defpackage.ceuz
    public void f() {
        cesa cesaVar = this.a;
        if (cesaVar.c) {
            cesaVar.bF();
            cesaVar.c = false;
        }
        cesd cesdVar = (cesd) cesaVar.b;
        cesd cesdVar2 = cesd.g;
        cesdVar.f = 2;
        cesdVar.a |= 4;
        cqkx.p(this);
    }

    @Override // defpackage.cesp
    public void g(cqiv cqivVar) {
        cqivVar.a(new cequ(), this);
    }

    @Override // defpackage.ceuz
    public void h() {
        if ((((cesd) this.a.b).a & 2) != 0) {
            this.l.clear();
            cesa cesaVar = this.a;
            if (cesaVar.c) {
                cesaVar.bF();
                cesaVar.c = false;
            }
            cesd cesdVar = (cesd) cesaVar.b;
            cesdVar.e = null;
            cesdVar.a &= -3;
            for (cetj cetjVar : this.n) {
                if (cetjVar instanceof ceuy) {
                    ((ceuy) cetjVar).j(true);
                } else if (cetjVar instanceof ceva) {
                    ((ceva) cetjVar).j(false);
                }
            }
            cqkx.p(this);
            ((cefg) this.f).m(drfs.c);
            cqkx.p(this);
        }
    }

    @Override // defpackage.cesp
    public cjtd i() {
        return cjtd.a(dtxl.fz);
    }

    @Override // defpackage.ceti
    public List<cetj> j() {
        int a = cesc.a(((cesd) this.a.b).f);
        if (a == 0) {
            a = 1;
        }
        return a == 3 ? this.n : a == 2 ? this.m : dcdc.e();
    }

    @Override // defpackage.cevg
    public void k(Bundle bundle) {
        this.f.j(bundle);
        this.e.i(bundle);
        bundle.putByteArray("reviews_leaf_page_model_key", this.a.bK().bS());
    }

    @Override // defpackage.cevg
    public void l(Bundle bundle) {
        this.f.k(bundle);
        this.e.j(bundle);
        cesd cesdVar = (cesd) bvrs.f(bundle, "reviews_leaf_page_model_key", (dssr) cesd.g.cu(7));
        if (cesdVar == null) {
            return;
        }
        dsqp dsqpVar = (dsqp) cesdVar.cu(5);
        dsqpVar.bC(cesdVar);
        this.a = (cesa) dsqpVar;
        if (!this.h.a() || Collections.unmodifiableList(((cesd) this.a.b).c).isEmpty()) {
            y(Collections.unmodifiableList(((cesd) this.a.b).b));
        } else {
            z(Collections.unmodifiableList(((cesd) this.a.b).c));
        }
        x();
        cqkx.p(this);
    }

    @Override // defpackage.ceey
    /* renamed from: m */
    public void b(dwwb dwwbVar) {
        if ((dwwbVar.a & 2) != 0) {
            this.e.h(dwwbVar.f);
        }
        if (!this.h.a() || dwwbVar.e.isEmpty()) {
            y(dwwbVar.d);
        } else {
            z(dwwbVar.e);
        }
        cesa cesaVar = this.a;
        drdu drduVar = dwwbVar.h;
        if (drduVar == null) {
            drduVar = drdu.d;
        }
        if (cesaVar.c) {
            cesaVar.bF();
            cesaVar.c = false;
        }
        cesd cesdVar = (cesd) cesaVar.b;
        cesd cesdVar2 = cesd.g;
        drduVar.getClass();
        cesdVar.d = drduVar;
        cesdVar.a |= 1;
        x();
        cqkx.p(this);
    }

    @Override // defpackage.cevg
    public void n() {
        super.n();
        btrm btrmVar = this.c;
        dceq a = dcet.a();
        a.b(bqje.class, new ceyl(0, bqje.class, this, bvrj.UI_THREAD));
        a.b(bkpe.class, new ceyl(1, bkpe.class, this, bvrj.UI_THREAD));
        a.b(cdjh.class, new ceyl(2, cdjh.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.cevg
    public void o() {
        for (cetg cetgVar : this.l) {
            ((cext) cetgVar.a()).PV(null);
        }
    }

    public void q(bqje bqjeVar) {
        int i = bqjeVar.c;
        if (i == 1 || i == 2) {
            w();
        }
    }

    @Override // defpackage.cevg
    public void s() {
        B();
        this.c.a(this);
    }

    public void u(bkpe bkpeVar) {
        Iterator<cetg> it = this.l.iterator();
        while (it.hasNext()) {
            ((ceya) it.next()).m(bkpeVar);
        }
    }

    public void v(cdjh cdjhVar) {
        int d = cdjhVar.d();
        int i = d - 1;
        if (d != 0) {
            if (i != 0 && i != 1 && i != 2) {
                return;
            }
            w();
            return;
        }
        throw null;
    }
}
