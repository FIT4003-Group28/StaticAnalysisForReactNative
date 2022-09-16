package defpackage;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bbhv  reason: default package */
/* loaded from: classes3.dex */
public class bbhv implements bbhq, bbff, bbfe, bbhm {
    public final bbib a;
    private final gga b;
    private final bbfg c;
    private final dxio<bber> d;
    @dzsi
    private final bwrs<ilo> e;
    private final affz f;
    private final cjqy g;
    private dcdc<bbhp> h = dcdc.e();
    private final dccx<bbhp> i = dcdc.F();
    private bbfb j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;

    public bbhv(gga ggaVar, cqhn cqhnVar, bbfg bbfgVar, bbib bbibVar, bbhy bbhyVar, dxio<bbdv> dxioVar, dxio<bber> dxioVar2, affz affzVar, cjqy cjqyVar, @dzsi bwrs<ilo> bwrsVar) {
        this.b = ggaVar;
        this.c = bbfgVar;
        this.a = bbibVar;
        this.d = dxioVar2;
        this.f = affzVar;
        this.g = cjqyVar;
        this.e = bwrsVar;
        if (bwrsVar != null && bwrsVar.c() != null) {
            ilo c = bwrsVar.c();
            dbsk.s(c);
            c.ai();
        }
        bbfgVar.c();
        this.j = bbfgVar.c;
        this.l = false;
        this.m = false;
        dxioVar.a().H(true);
    }

    private final void p(boolean z) {
        Intent intent;
        gn g = this.b.g();
        if (g != null) {
            g.f();
            if (!z || (intent = this.b.getIntent()) == null || !bbis.b.a(this.f.a(intent)) || !this.d.a().a()) {
                return;
            }
            g.f();
        }
    }

    private final void q() {
        if (this.k < this.h.size() - 1) {
            j(this.k + 1);
            return;
        }
        r();
        cqkx.p(this);
    }

    private final void r() {
        if (!h().booleanValue()) {
            this.c.c();
        }
        this.m = true;
    }

    @Override // defpackage.bbfe
    public void a(Throwable th) {
        dcdc<bbhp> dcdcVar = this.h;
        int size = dcdcVar.size();
        int i = 0;
        while (true) {
            if (i < size) {
                int i2 = i + 1;
                if (dcdcVar.get(i).a().equals(bbho.PLACE)) {
                    break;
                }
                i = i2;
            } else {
                p(false);
                break;
            }
        }
        gga ggaVar = this.b;
        Toast.makeText(ggaVar, ggaVar.getString(R.string.EXEMPLAR_ERROR_FAILED_TO_FETCH_PLACES), 0).show();
    }

    @Override // defpackage.bbff
    public void b(bbfb bbfbVar) {
        this.j = bbfbVar;
        this.l = false;
        cqkx.p(this);
        if (this.m) {
            this.m = false;
            q();
        }
    }

    @Override // defpackage.bbhm
    public void c(bbhn bbhnVar, @dzsi bbhp bbhpVar) {
        bbhn bbhnVar2 = bbhn.INTERSTITIAL_DONE;
        bbho bbhoVar = bbho.PLACE;
        switch (bbhnVar.ordinal()) {
            case 0:
                f();
                return;
            case 1:
                r();
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                bber a = this.d.a();
                a.b(a.c() + 1);
                if (this.e != null) {
                    if (this.o || !this.d.a().a()) {
                        if (!this.n && !this.d.a().a()) {
                            bwrs<ilo> bwrsVar = this.e;
                            if (bwrsVar != null) {
                                ilo c = bwrsVar.c();
                                dbsk.s(c);
                                dvyw h = c.h();
                                dsqp dsqpVar = (dsqp) h.cu(5);
                                dsqpVar.bC(h);
                                dvya dvyaVar = (dvya) dsqpVar;
                                dqbf bZ = dqbi.g.bZ();
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                dqbi dqbiVar = (dqbi) bZ.b;
                                dqbiVar.d = 1;
                                dqbiVar.a |= 2;
                                if (dvyaVar.c) {
                                    dvyaVar.bF();
                                    dvyaVar.c = false;
                                }
                                dvyw dvywVar = (dvyw) dvyaVar.b;
                                dqbi bK = bZ.bK();
                                dvyw dvywVar2 = dvyw.bv;
                                bK.getClass();
                                dvywVar.bg = bK;
                                dvywVar.d |= 16384;
                                bwrs<ilo> bwrsVar2 = this.e;
                                ilo c2 = bwrsVar2.c();
                                dbsk.s(c2);
                                ily g = c2.g();
                                g.E(dvyaVar.bK());
                                bwrsVar2.d(g.d());
                            }
                            this.n = true;
                        }
                    } else {
                        bwrs<ilo> bwrsVar3 = this.e;
                        ilo c3 = bwrsVar3.c();
                        dbsk.s(c3);
                        ily g2 = c3.g();
                        g2.I = true;
                        bwrsVar3.d(g2.d());
                        this.o = true;
                    }
                }
                q();
                return;
            case 7:
                cqkx.p(this);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.bbhq
    @dzsi
    public bbho d() {
        if (!this.h.isEmpty()) {
            return this.h.get(this.k).a();
        }
        return null;
    }

    @Override // defpackage.bbhq
    public Boolean e(bbho bbhoVar) {
        boolean z = false;
        if (!l().isEmpty() && l().get(this.k).a() == bbhoVar) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bbhq
    public cqkl f() {
        p(true);
        return cqkl.a;
    }

    @Override // defpackage.bbhq
    public cqkl g() {
        q();
        return cqkl.a;
    }

    @Override // defpackage.bbhq
    public Boolean h() {
        return Boolean.valueOf(this.j.d());
    }

    @Override // defpackage.bbhq
    public Integer i() {
        return Integer.valueOf(this.k);
    }

    @Override // defpackage.bbhq
    public cqkl j(int i) {
        String g;
        if (i < this.h.size() && i >= 0) {
            this.k = i;
            View o = cqkx.o(this);
            if (o != null) {
                bbhp bbhpVar = this.h.get(this.k);
                bbhn bbhnVar = bbhn.INTERSTITIAL_DONE;
                bbho bbhoVar = bbho.PLACE;
                int ordinal = bbhpVar.a().ordinal();
                if (ordinal == 0) {
                    g = ((bbht) bbhpVar).g();
                } else if (ordinal != 1) {
                    g = ordinal != 2 ? "" : this.b.getString(R.string.EXEMPLAR_INTERSTITIAL_TITLE_SUCCESS);
                } else {
                    g = this.b.getString(R.string.EXEMPLAR_INTERSTITIAL_PROGRESS_TITLE);
                }
                cpv.a.f(o, g);
            }
            if (this.h.get(this.k).b(bbho.INTERSTITIAL_PROGRESS).booleanValue()) {
                q();
            }
        }
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.bbhq
    public cqkl k() {
        int i = this.k;
        if (i > 0) {
            dcdc<bbhp> dcdcVar = this.h;
            this.h = dcdcVar.subList(i, dcdcVar.size());
            this.k = 0;
            cqkx.p(this);
        }
        return cqkl.a;
    }

    @Override // defpackage.bbhq
    public List<bbhp> l() {
        dcdc e;
        bbho bbhoVar;
        if (!this.l && !h().booleanValue()) {
            dccx<bbhp> dccxVar = this.i;
            dcdc<dkzl> c = this.j.c();
            if (c.size() > 0) {
                dcbg s = dcbg.b(c).s(new dbrn(this) { // from class: bbhu
                    private final bbhv a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        bbhv bbhvVar = this.a;
                        dkzl dkzlVar = (dkzl) obj;
                        bbib bbibVar = bbhvVar.a;
                        dxio a = ((dxjh) bbibVar.a).a();
                        bbib.a(a, 1);
                        dxio a2 = ((dxjh) bbibVar.b).a();
                        bbib.a(a2, 2);
                        dxio a3 = ((dxjh) bbibVar.c).a();
                        bbib.a(a3, 3);
                        bbif a4 = bbibVar.d.a();
                        bbib.a(a4, 4);
                        bbil a5 = bbibVar.e.a();
                        bbib.a(a5, 5);
                        bbib.a(dkzlVar, 6);
                        bbib.a(bbhvVar, 7);
                        return new bbia(a, a2, a3, a4, a5, dkzlVar, bbhvVar);
                    }
                });
                bbhp[] bbhpVarArr = new bbhp[1];
                if (this.d.a().a()) {
                    bbhoVar = bbho.INTERSTITIAL_COMPLETE;
                } else {
                    bbhoVar = bbho.INTERSTITIAL_PROGRESS;
                }
                bbhpVarArr[0] = new bbhx(this, bbhoVar, this.c);
                e = s.n(bbhpVarArr).z();
            } else {
                e = dcdc.e();
            }
            dccxVar.i(e);
            this.h = dccxVar.f();
            this.l = true;
        }
        return this.h;
    }

    @Override // defpackage.bbhq
    public void m(int i) {
        int i2;
        if (this.h.isEmpty() || i == (i2 = this.k)) {
            return;
        }
        bbhp bbhpVar = this.h.get(i2);
        if (bbhpVar.d() == null || bbhpVar.d() == cjtd.b) {
            return;
        }
        cjqy cjqyVar = this.g;
        cjte cjteVar = new cjte(deaf.SWIPE, dead.LEFT);
        cjtd d = bbhpVar.d();
        dbsk.s(d);
        cjqyVar.m(cjteVar, d);
    }

    public void n() {
        this.c.a.add(this);
        this.c.b.add(this);
    }

    public void o() {
        this.c.a.remove(this);
        this.c.b.remove(this);
    }
}
