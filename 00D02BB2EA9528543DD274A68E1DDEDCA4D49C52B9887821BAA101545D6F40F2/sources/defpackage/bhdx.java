package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bhdx  reason: default package */
/* loaded from: classes3.dex */
public class bhdx implements bhdw {
    private static final ddho a = dtxv.bj;
    private static final ddho b = dtxv.br;
    private final bhat c;
    private final bhiu d;
    private final dxio<bheb> e;
    private final apus f;
    private final bhhf g;
    private final dxio<bhdv> h;
    private final dxio<bzmm> i;
    private final dxio<cqhn> j;
    private final dxio<cqhu> k;
    private final acpa l;
    @dzsi
    private final bgvr m;
    @dzsi
    private final bhdo n;
    private final gga o;
    @dzsi
    private bwrs<ilo> p;
    private boolean q;
    private boolean r;
    private float s;
    private float u;
    private final String v;
    private cqtv t = ibn.k();
    private cjtd w = r(a);
    private cjtd x = r(b);

    public bhdx(gga ggaVar, bhat bhatVar, bhiu bhiuVar, dxio<bheb> dxioVar, apus apusVar, dxio<bgvr> dxioVar2, bhhf bhhfVar, dxio<bhdo> dxioVar3, dxio<bhdv> dxioVar4, dxio<bzmm> dxioVar5, dxio<cqhn> dxioVar6, dxio<cqhu> dxioVar7) {
        this.o = ggaVar;
        this.c = bhatVar;
        this.d = bhiuVar;
        this.e = dxioVar;
        this.f = apusVar;
        this.g = bhhfVar;
        bhdo bhdoVar = null;
        this.m = bhatVar.d() ? dxioVar2.a() : null;
        this.n = bhatVar.a.getMerchantExperienceParameters().e ? dxioVar3.a() : bhdoVar;
        this.h = dxioVar4;
        this.i = dxioVar5;
        this.j = dxioVar6;
        this.k = dxioVar7;
        String string = ggaVar.getString(R.string.MANAGE_BUSINESS_ONLY_YOU_CAN_SEE);
        this.l = new acpc(string, string, cqrt.g(2131232726, ibm.n()));
        this.v = bhatVar.b() ? ggaVar.getString(R.string.MERCHANT_YOUR_BUSINESS_TITLE) : "";
    }

    private static cjtd r(ddho ddhoVar) {
        return s(ddhoVar, null);
    }

    private static cjtd s(ddho ddhoVar, @dzsi ilo iloVar) {
        cjta c = cjtd.c(iloVar == null ? null : iloVar.a());
        c.d = ddhoVar;
        return c.a();
    }

    @Override // defpackage.bhdw
    public Float a() {
        return Float.valueOf(this.s);
    }

    @Override // defpackage.bhdw
    public void b(float f) {
        this.s = f;
    }

    @Override // defpackage.bhdw
    public cjtd c() {
        return this.w;
    }

    @Override // defpackage.bhdw
    public cjtd d() {
        return this.x;
    }

    @Override // defpackage.bhdw
    public Boolean e() {
        return Boolean.valueOf(!this.c.c(btpf.c(this.o), (ilo) bwrs.b(this.p)));
    }

    @Override // defpackage.bhdw
    public bhio f() {
        return this.d;
    }

    @Override // defpackage.bhdw
    public cqkl g() {
        bwrs<ilo> bwrsVar = this.p;
        if (bwrsVar != null) {
            this.f.e(bwrsVar, false);
        }
        return cqkl.a;
    }

    @Override // defpackage.bhdw
    public Boolean h() {
        return Boolean.valueOf(this.r);
    }

    @Override // defpackage.bhdw
    @dzsi
    public bgvm i() {
        return this.m;
    }

    @Override // defpackage.bhdw
    @dzsi
    public bhdi j() {
        return this.n;
    }

    @Override // defpackage.bhdw
    public acpa k() {
        return this.l;
    }

    @Override // defpackage.bhdw
    public cqtv l() {
        return this.t;
    }

    @Override // defpackage.bhdw
    public void m(cqtv cqtvVar) {
        this.t = cqtvVar;
    }

    @Override // defpackage.bhdw
    public Float n() {
        return Float.valueOf(this.u);
    }

    @Override // defpackage.bhdw
    public void o(float f) {
        this.u = f;
    }

    @Override // defpackage.bhdw
    public jib p() {
        jhz a2 = jhz.a();
        a2.a = this.v;
        a2.E = 2;
        a2.x = false;
        a2.g = ibm.b();
        jhm a3 = jhm.a();
        a3.c = cqrt.f(2131231736);
        a3.h = 2;
        jho c = a3.c();
        jhm a4 = jhm.a();
        a4.c = cqrt.f(2131231593);
        a4.h = 2;
        a2.d(dcdc.g(c, a4.c()));
        return a2.b();
    }

    @Override // defpackage.bhdw
    public void q() {
        bhdv a2 = this.h.a();
        a2.b = (ilo) bwrs.b(this.p);
        ilo iloVar = a2.b;
        a2.d = iloVar == null ? null : iloVar.cQ();
        if (a2.e() != bzmk.VISIBLE) {
            return;
        }
        this.j.a();
        for (View view : cqkx.n(this)) {
            this.k.a();
            View a3 = cqhu.a(view, bhas.a);
            if (a3 != null) {
                a2.c = a3;
                this.i.a().a(a2);
            }
        }
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        if (!bhat.f((ilo) bwrs.b(bwrsVar))) {
            return;
        }
        this.p = bwrsVar;
        this.d.t(bwrsVar);
        ilo c = bwrsVar.c();
        c.getClass();
        this.e.a().a(c, this.d);
        bgvr bgvrVar = this.m;
        if (bgvrVar != null) {
            bgvrVar.t(bwrsVar);
        }
        bhdo bhdoVar = this.n;
        if (bhdoVar != null) {
            bhdoVar.t(bwrsVar);
        }
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        boolean z = false;
        if (this.c.a() && bhat.f(iloVar)) {
            z = true;
        }
        this.q = z;
        this.r = this.g.m(bwrsVar);
        this.w = s(a, iloVar);
        this.x = s(b, iloVar);
    }

    @Override // defpackage.bega
    public void u() {
        this.d.u();
        bgvr bgvrVar = this.m;
        if (bgvrVar != null) {
            bgvrVar.u();
        }
        bhdo bhdoVar = this.n;
        if (bhdoVar != null) {
            bhdoVar.u();
        }
        this.p = null;
        this.q = false;
        this.r = false;
        this.w = r(a);
        this.x = r(b);
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.q);
    }
}
