package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: xcb  reason: default package */
/* loaded from: classes7.dex */
public final class xcb extends ges implements egq {
    public static final /* synthetic */ int ae = 0;
    private static final afwn[] af = {afwn.e(afwm.TRAFFIC, false), afwn.e(afwm.TRANSIT, false)};
    public efg a;
    public vos ad;
    private jbk ag;
    private xcg ah;
    private vne ai;
    @dzsi
    private cqkf<jbk> aj;
    public cqkj b;
    public xch c;
    public qkc d;
    public btrm e;
    public vot f;
    public cqkf<xce> g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.aj = null;
        super.Qe();
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        this.ah.c();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<xce> d = this.b.d(new xcd(), viewGroup, false);
        this.g = d;
        aegc aegcVar = (aegc) d.c();
        aegcVar.setShowGrippy(true);
        aegcVar.setShouldUseRoundedCornersShadow(true);
        aegcVar.h(i());
        cqkf<jbk> d2 = this.b.d(new hxj(), viewGroup, false);
        this.aj = d2;
        this.ad = this.f.a(d2);
        aegcVar.setMinExposurePixels(jmj.a(J(), 56));
        zut zutVar = (zut) aegcVar;
        zutVar.setNestedScrollViewProvider(aegv.a(aegv.b(qmd.a), aegu.a, aegv.b(qks.a)));
        zutVar.setSnapPoints(dcdc.h(aegg.c, new aegf(0.5f), aegg.b));
        zutVar.l(new xca(this, zutVar));
        zutVar.setProgrammaticNestedScrollListener(this.ah.e());
        zutVar.setSoftMinimumHeightPixels(i());
        zutVar.setScrollEachNestedScrollViewIndividually(true);
        return null;
    }

    @dzsi
    public final aegc g() {
        return (aegc) this.g.c();
    }

    public final int i() {
        ff J = J();
        dbsk.s(J);
        return (int) (bvsc.a(J) * 0.5f);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    @Override // defpackage.ges, defpackage.fd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(@defpackage.dzsi android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xcb.l(android.os.Bundle):void");
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtyc.cy;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ah.b((acyu) this.g.c());
        this.g.e(this.ah);
        cqkf<jbk> cqkfVar = this.aj;
        if (cqkfVar != null) {
            cqkfVar.e(this.ag);
        }
        efg efgVar = this.a;
        ViewGroup viewGroup = this.ad.c;
        egj egjVar = new egj(this);
        egjVar.w(null);
        egjVar.r(viewGroup);
        egjVar.q(this.ad.d);
        egjVar.E(new zvv(viewGroup));
        egjVar.ag(null);
        egf b = egf.b();
        b.x = true;
        b.m();
        b.l = af;
        egjVar.A(b);
        egjVar.J(this);
        aegc aegcVar = (aegc) this.g.c();
        aegcVar.setShowGrippy(true);
        aegcVar.setShouldUseRoundedCornersShadow(true);
        egjVar.H(aegcVar);
        egjVar.N(i());
        efgVar.a(egjVar.a());
        this.d.a();
        vnf.c(this.e, this.ai);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.g.e(null);
        this.ah.d();
        cqkf<jbk> cqkfVar = this.aj;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        this.d.b();
        vnf.b(this.e, this.ai);
        super.u();
    }
}
