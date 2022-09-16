package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: bkkf  reason: default package */
/* loaded from: classes3.dex */
public final class bkkf extends bfdi implements bknf {
    public cqkj a;
    public bhhf ad;
    public bhhy ae;
    private bwrs<ilo> af;
    private bklk ag;
    private ViewGroup ah;
    private cqkf<bklk> ai;
    private boolean aj;
    public bkke b;
    public bwqv c;
    public btvo d;
    public dxio<bhng> e;
    public dxio<bbut> f;
    public dxio<cclq> g;

    @Override // defpackage.bknf
    public final void QX() {
        if (!this.aD) {
            return;
        }
        if (!this.ad.b(this.af)) {
            this.g.a().k(this.af);
        } else {
            this.g.a().n(this.af);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<bklk> cqkfVar = this.ai;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            ViewGroup viewGroup = this.ah;
            if (viewGroup != null) {
                viewGroup.removeView(this.ai.c());
            }
            this.ai = null;
        }
        this.ah = null;
        super.Qe();
    }

    @Override // defpackage.fd
    public final void X(boolean z) {
        super.X(z);
        bwrs<ilo> bwrsVar = this.af;
    }

    @Override // defpackage.bknf
    public final void aJ(ccln cclnVar) {
        if (!this.aD || this.af == null) {
            return;
        }
        this.e.a().a(cclnVar, this.af);
    }

    @Override // defpackage.begd
    public final bege aR() {
        return bege.MENU;
    }

    @Override // defpackage.bknf
    public final void aS() {
        ilo iloVar = (ilo) bwrs.b(this.af);
        if (!this.aD || iloVar == null) {
            return;
        }
        if (this.ad.p(iloVar)) {
            bhhy bhhyVar = this.ae;
            bhhu e = bhhx.e();
            bhhq bhhqVar = (bhhq) e;
            bhhqVar.d = 2;
            bhhqVar.a = bhhw.g();
            bhhqVar.c = dwyd.MERCHANT_MODE_MENU_TAB;
            bhhqVar.b = iloVar;
            bhhyVar.e(e.a());
            return;
        }
        bbuz m = bbve.m();
        m.b(bbuy.POP_OUT_OF_PHOTO_UPLOAD_FLOW);
        m.e(dwyd.MENU_TAB);
        ((bbsu) m).b = iloVar;
        this.f.a().j(m.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bfdi
    public final bwrs<ilo> aV() {
        bwrs<ilo> bwrsVar = this.af;
        return bwrsVar != null ? bwrsVar : bwrs.a(null);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ah = viewGroup;
        if (this.ag == null) {
            return null;
        }
        dbsk.l(this.ai == null);
        cqkf<bklk> d = this.a.d(new bkmh(this.aj), viewGroup, false);
        this.ai = d;
        bklk bklkVar = this.ag;
        dbsk.s(bklkVar);
        d.e(bklkVar);
        this.ag.g();
        cqkf<bklk> cqkfVar = this.ai;
        dbsk.s(cqkfVar);
        return cqkfVar.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        this.ag.h();
        super.am();
    }

    @Override // defpackage.bfdi, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        bwrs<ilo> b = cctq.b(this.o, this.c);
        this.af = b;
        this.ag = this.b.b(this, b);
        this.aj = this.d.getPlaceOfferingsParameters().h();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.dc;
    }
}
