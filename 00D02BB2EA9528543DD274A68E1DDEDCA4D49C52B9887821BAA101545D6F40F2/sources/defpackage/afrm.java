package defpackage;

import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: afrm  reason: default package */
/* loaded from: classes2.dex */
public class afrm implements afrk {
    afrl a;
    private final btvo b;
    private final dxio<afwr> c;
    private final afwo d;
    private final dxio<arfm> e;
    private final dxio<abwo> f;
    private final dxio<bwsh> g;
    private final bvjj h;
    private boolean i;

    public afrm(btvo btvoVar, dxio<afwr> dxioVar, dxio<arfm> dxioVar2, cqhn cqhnVar, dxio<abwo> dxioVar3, dxio<bwsh> dxioVar4, bvjj bvjjVar, boolean z, afrl afrlVar) {
        this.b = btvoVar;
        this.c = dxioVar;
        this.d = dxioVar.a().l();
        this.e = dxioVar2;
        this.f = dxioVar3;
        this.g = dxioVar4;
        this.h = bvjjVar;
        this.a = afrlVar;
        this.i = z;
    }

    private final void B(@dzsi afwm afwmVar) {
        if (afwmVar == null) {
            this.c.a().k(afwm.SATELLITE, false);
            this.c.a().k(afwm.TERRAIN, false);
        } else {
            this.c.a().k(afwmVar, true);
        }
        cqkx.p(this);
    }

    private final void C(afwm afwmVar) {
        this.c.a().j(afwmVar);
        cqkx.p(this);
    }

    @Override // defpackage.afrk
    public void A(boolean z) {
        this.i = z;
    }

    @Override // defpackage.afrk
    public cqkl a() {
        B(null);
        return cqkl.a;
    }

    @Override // defpackage.afrk
    public cqkl b() {
        B(afwm.SATELLITE);
        return cqkl.a;
    }

    @Override // defpackage.afrk
    public cqkl c() {
        B(afwm.TERRAIN);
        return cqkl.a;
    }

    @Override // defpackage.afrk
    public cqkl d() {
        C(afwm.TRANSIT);
        return cqkl.a;
    }

    @Override // defpackage.afrk
    public cqkl e() {
        C(afwm.TRAFFIC);
        return cqkl.a;
    }

    @Override // defpackage.afrk
    public cqkl f() {
        C(afwm.BICYCLING);
        return cqkl.a;
    }

    @Override // defpackage.afrk
    public cqkl g() {
        C(afwm.THREE_DIMENSIONAL);
        return cqkl.a;
    }

    @Override // defpackage.afrk
    public cqkl h() {
        this.h.S(bvjk.gl, true);
        C(afwm.COVID19);
        this.a.a();
        return cqkl.a;
    }

    @Override // defpackage.afrk
    public cqkl i() {
        this.f.a().a();
        this.a.a();
        return cqkl.a;
    }

    @Override // defpackage.afrk
    public cqkl j() {
        this.g.a().j();
        return cqkl.a;
    }

    @Override // defpackage.afrk
    public cqkl k() {
        PopupWindow popupWindow;
        this.e.a().m(!u().booleanValue());
        cqkx.p(this);
        afpa afpaVar = (afpa) this.a;
        if (btpf.c(afpaVar.a.c).f && (popupWindow = afpaVar.a.e) != null && popupWindow.isShowing()) {
            afpaVar.a.e.dismiss();
            afpaVar.a.h();
        }
        return cqkl.a;
    }

    @Override // defpackage.afrk
    public Boolean l() {
        boolean z = false;
        if (!m().booleanValue() && !n().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.afrk
    public Boolean m() {
        return Boolean.valueOf(this.d.d(afwm.SATELLITE));
    }

    @Override // defpackage.afrk
    public Boolean n() {
        return Boolean.valueOf(this.d.d(afwm.TERRAIN));
    }

    @Override // defpackage.afrk
    public Boolean o() {
        return Boolean.valueOf(this.d.d(afwm.TRANSIT));
    }

    @Override // defpackage.afrk
    public Boolean p() {
        return Boolean.valueOf(this.d.d(afwm.TRAFFIC));
    }

    @Override // defpackage.afrk
    public Boolean q() {
        return Boolean.valueOf(this.d.d(afwm.BICYCLING));
    }

    @Override // defpackage.afrk
    public Boolean r() {
        return Boolean.valueOf(this.d.d(afwm.THREE_DIMENSIONAL));
    }

    @Override // defpackage.afrk
    public Boolean s() {
        return Boolean.valueOf(this.d.d(afwm.COVID19));
    }

    @Override // defpackage.afrk
    public Boolean t() {
        return Boolean.valueOf(this.g.a().i());
    }

    @Override // defpackage.afrk
    public Boolean u() {
        arfk c = this.e.a().C().c();
        boolean z = false;
        if (c != null && c.f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.afrk
    public Boolean v() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.afrk
    public Boolean w() {
        return Boolean.valueOf(this.b.getMapLayersParameters().c);
    }

    @Override // defpackage.afrk
    public Boolean x() {
        return Boolean.valueOf(this.b.getMapLayersParameters().d);
    }

    @Override // defpackage.afrk
    public Boolean y() {
        return Boolean.valueOf(this.b.getEnableFeatureParameters().be);
    }

    @Override // defpackage.afrk
    public cqsn z() {
        arfk c = this.e.a().C().c();
        if (c == null) {
            return cqsk.a("");
        }
        dvcx e = c.e();
        if (c.c != arfj.MAP_LOADED || e == null) {
            return cqsk.a("");
        }
        dvcr dvcrVar = e.b;
        if (dvcrVar == null) {
            dvcrVar = dvcr.h;
        }
        return cqsk.a(dvcrVar.b);
    }
}
