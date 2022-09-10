package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bkkd  reason: default package */
/* loaded from: classes3.dex */
public final class bkkd extends bfdp implements bknf {
    private static final dcqe af = dcqe.c("bkkd");
    public cqkj a;
    public dxio<bbut> ad;
    public dxio<cclq> ae;
    private bklk ag;
    @dzsi
    private cqkf<bklk> ah;
    private boolean ai;
    public bkke b;
    public btvo c;
    public dxio<bhng> g;

    @Override // defpackage.bknf
    public final void QX() {
        if (!this.aD || this.f == null) {
            return;
        }
        bwrs<ilo> bwrsVar = this.f;
        dbsk.s(bwrsVar);
        this.ae.a().k(bwrsVar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<bklk> cqkfVar = this.ah;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.ah = null;
        }
        super.Qe();
    }

    @Override // defpackage.bknf
    public final void aJ(ccln cclnVar) {
        if (!this.aD || this.f == null) {
            return;
        }
        bwrs<ilo> bwrsVar = this.f;
        dbsk.s(bwrsVar);
        this.g.a().a(cclnVar, bwrsVar);
    }

    @Override // defpackage.bknf
    public final void aS() {
        ilo iloVar = (ilo) bwrs.b(this.f);
        if (!this.aD || this.f == null) {
            return;
        }
        bbuz m = bbve.m();
        m.b(bbuy.POP_OUT_OF_PHOTO_UPLOAD_FLOW);
        m.e(dwyd.MENU_TAB);
        ((bbsu) m).b = iloVar;
        this.ad.a().j(m.a());
    }

    @Override // defpackage.bfdp
    protected final jib g() {
        bwrs<ilo> bwrsVar = this.f;
        ilo c = bwrsVar != null ? bwrsVar.c() : null;
        Object[] objArr = new Object[1];
        objArr[0] = c != null ? c.n() : "";
        return jib.g(J(), Rq(R.string.MENU_PAGE_TITLE, objArr));
    }

    @Override // defpackage.bfdp
    protected final View i(ilo iloVar) {
        if (this.ah != null) {
            bvoo.h("The view hierarchy was non-null upon creating the view.", new Object[0]);
        }
        cqkf<bklk> c = this.a.c(new bkmh(this.ai), null);
        this.ah = c;
        bklk bklkVar = this.ag;
        dbsk.s(bklkVar);
        c.e(bklkVar);
        this.ag.g();
        cqkf<bklk> cqkfVar = this.ah;
        dbsk.s(cqkfVar);
        return cqkfVar.c();
    }

    @Override // defpackage.bfdp, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        bkke bkkeVar = this.b;
        bwrs<ilo> bwrsVar = this.f;
        dbsk.s(bwrsVar);
        this.ag = bkkeVar.b(this, bwrsVar);
        this.ai = this.c.getPlaceOfferingsParameters().h();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.da;
    }
}
