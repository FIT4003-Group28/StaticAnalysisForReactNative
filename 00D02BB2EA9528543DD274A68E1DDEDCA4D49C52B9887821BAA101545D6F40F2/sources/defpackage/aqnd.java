package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aqnd  reason: default package */
/* loaded from: classes2.dex */
public class aqnd implements aqna {
    public final aqni a;
    public final aqmd b;
    public View c;
    public boolean d;
    public boolean e;
    public boolean f;
    private final ckcw h;
    private final apyv i;
    private final ckmm j;
    private final aqhw k;
    private final aqhv l;
    private final aqoi m;
    private boolean p;
    private final View.OnAttachStateChangeListener g = new aqnc(this);
    private int n = 0;
    private btlu o = btlu.a;

    public aqnd(ckcw ckcwVar, apyv apyvVar, ckmm ckmmVar, aqhw aqhwVar, aqhv aqhvVar, aqoi aqoiVar, aqnj aqnjVar, apyx apyxVar, dxio<aqme> dxioVar, ges gesVar) {
        ges gesVar2;
        aqmd aqmdVar;
        aqnd aqndVar;
        this.h = ckcwVar;
        this.i = apyvVar;
        this.j = ckmmVar;
        this.k = aqhwVar;
        this.l = aqhvVar;
        this.m = aqoiVar;
        if (apyxVar.b()) {
            aqme a = dxioVar.a();
            aqwo a2 = a.a.a();
            aqme.a(a2, 1);
            apzy a3 = a.b.a();
            aqme.a(a3, 2);
            cqhn a4 = a.c.a();
            aqme.a(a4, 3);
            gga a5 = a.d.a();
            aqme.a(a5, 4);
            bvrb a6 = a.e.a();
            aqme.a(a6, 5);
            apyv a7 = a.f.a();
            aqme.a(a7, 6);
            aqit a8 = a.g.a();
            aqme.a(a8, 7);
            aqeh a9 = a.h.a();
            aqme.a(a9, 8);
            aqgl a10 = a.i.a();
            aqme.a(a10, 9);
            aqgn a11 = a.j.a();
            aqme.a(a11, 10);
            dxio a12 = ((dxjh) a.k).a();
            aqme.a(a12, 11);
            dxio a13 = ((dxjh) a.l).a();
            aqme.a(a13, 12);
            dxio a14 = ((dxjh) a.m).a();
            aqme.a(a14, 13);
            dxio a15 = ((dxjh) a.n).a();
            aqme.a(a15, 14);
            dxio a16 = ((dxjh) a.o).a();
            aqme.a(a16, 15);
            dxio a17 = ((dxjh) a.p).a();
            aqme.a(a17, 16);
            dxio a18 = ((dxjh) a.q).a();
            aqme.a(a18, 17);
            dxio a19 = ((dxjh) a.r).a();
            aqme.a(a19, 18);
            aqme.a(gesVar, 19);
            gesVar2 = gesVar;
            aqndVar = this;
            aqmdVar = new aqmd(a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, gesVar);
        } else {
            gesVar2 = gesVar;
            aqmdVar = null;
            aqndVar = this;
        }
        aqndVar.b = aqmdVar;
        aqndVar.a = aqnjVar.a(apzb.INBOX_IN_UPDATES_TAB, null, gesVar2);
    }

    @Override // defpackage.aqna
    public aqcc a() {
        return this.a;
    }

    @Override // defpackage.aqna
    public aqls b() {
        return this.b;
    }

    @Override // defpackage.aqna
    public aqoh c() {
        return this.k;
    }

    @Override // defpackage.aqna
    public aqoh d() {
        return this.l;
    }

    @Override // defpackage.aqna
    public aqoh e() {
        return this.m;
    }

    @Override // defpackage.aqna
    public View.OnAttachStateChangeListener f() {
        return this.g;
    }

    @Override // defpackage.aqna
    public Boolean g() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.aqna
    public Boolean h() {
        dbsk.m(!this.o.r(), "setGmmAccount() must be called before this method.");
        return Boolean.valueOf(this.o.m());
    }

    @Override // defpackage.aqna
    public Boolean i() {
        dbsk.m(!this.o.r(), "setGmmAccount() must be called before this method.");
        return Boolean.valueOf(btlu.p(this.o));
    }

    @Override // defpackage.jbt
    public void j(cqiv cqivVar) {
        if (this.f) {
            cqivVar.a(new aqlr(), this);
        } else {
            cqivVar.a(new aqmz(), this);
        }
    }

    @Override // defpackage.jbt
    public cjtd k() {
        return cjtd.a(dtxr.bh);
    }

    @Override // defpackage.aqna
    public cqtv l() {
        return cqrp.c(this.n);
    }

    public void m(btlu btluVar) {
        if (!this.o.equals(btluVar)) {
            this.e = false;
            this.o = btluVar;
            this.f = this.i.b(btluVar);
            cqkx.p(this);
        }
    }

    public void n(int i) {
        this.n = i;
    }

    public void o() {
        t();
    }

    public void p() {
        aqmd aqmdVar = this.b;
        if (aqmdVar != null) {
            aqmdVar.q();
        }
        this.a.n();
    }

    public void q(apzv apzvVar) {
        aqmd aqmdVar = this.b;
        if (aqmdVar == null || (apzvVar.a & 1) == 0) {
            return;
        }
        apzt apztVar = apzvVar.b;
        if (apztVar == null) {
            apztVar = apzt.e;
        }
        aqmdVar.s(apztVar);
    }

    public apzv r() {
        apzu bZ = apzv.c.bZ();
        aqmd aqmdVar = this.b;
        if (aqmdVar != null) {
            apzt r = aqmdVar.r();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            apzv apzvVar = (apzv) bZ.b;
            r.getClass();
            apzvVar.b = r;
            apzvVar.a |= 1;
        }
        return bZ.bK();
    }

    public final void s() {
        cwsv a;
        if (this.p) {
            return;
        }
        if (h().booleanValue()) {
            a = cwsv.a("MessagingInboxTabIncognitoStartedEvent");
        } else {
            a = cwsv.a(i().booleanValue() ? "MessagingInboxTabSignedOutStartedEvent" : "MessagingInboxTabStartedEvent");
        }
        this.j.e(a);
        ((ckhe) this.h.a(ckgs.b)).c();
        this.p = true;
    }

    public final void t() {
        if (!this.f) {
            this.a.m();
            this.a.o(null);
        }
    }
}
