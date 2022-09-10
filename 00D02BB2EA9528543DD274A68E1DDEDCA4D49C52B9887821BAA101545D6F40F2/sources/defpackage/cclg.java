package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cclg  reason: default package */
/* loaded from: classes4.dex */
public final class cclg extends gen implements cczc {
    public gga a;
    private cqkf<ccxf> ad;
    private cczd ae;
    private ccma af;
    private Dialog ag;
    public ccze b;
    public cqkj c;
    public ccsq d;
    public ccln e;
    public ccxa g;

    public static cclg g(ccln cclnVar, ccxa ccxaVar, ccma ccmaVar) {
        ccwp bZ = ccwq.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccwq ccwqVar = (ccwq) bZ.b;
        cclnVar.getClass();
        ccwqVar.b = cclnVar;
        int i = ccwqVar.a | 1;
        ccwqVar.a = i;
        ccxaVar.getClass();
        ccwqVar.c = ccxaVar;
        int i2 = i | 2;
        ccwqVar.a = i2;
        ccmaVar.getClass();
        ccwqVar.d = ccmaVar;
        ccwqVar.a = i2 | 4;
        Bundle bundle = new Bundle();
        bvrs.l(bundle, bZ.bK());
        cclg cclgVar = new cclg();
        cclgVar.B(bundle);
        return cclgVar;
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        cqkf<ccxf> c = this.c.c(new ccow(), null);
        this.ad = c;
        c.e(this.ae);
        gdf gdfVar = new gdf(J(), (int) R.style.OfferingAlertDialogTheme);
        this.ag = gdfVar;
        gdfVar.setContentView(this.ad.c());
        return this.ag;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
            dbsk.s(bundle);
        }
        ccwq ccwqVar = (ccwq) bvrs.e(bundle, ccwq.class, (dssr) ccwq.e.cu(7));
        dbsk.s(ccwqVar);
        ccln cclnVar = ccwqVar.b;
        if (cclnVar == null) {
            cclnVar = ccln.p;
        }
        this.e = cclnVar;
        ccxa ccxaVar = ccwqVar.c;
        if (ccxaVar == null) {
            ccxaVar = ccxa.f;
        }
        this.g = ccxaVar;
        ccma ccmaVar = ccwqVar.d;
        if (ccmaVar == null) {
            ccmaVar = ccma.c;
        }
        this.af = ccmaVar;
        ccze cczeVar = this.b;
        ccln cclnVar2 = this.e;
        cqhn a = cczeVar.a.a();
        ccze.a(a, 1);
        ccze.a(cclnVar2, 2);
        ccze.a(this, 3);
        ccze.a(ccmaVar, 4);
        this.ae = new cczd(a, cclnVar2, this, ccmaVar);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxx.aa;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ad.e(this.ae);
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        ccwp bZ = ccwq.e.bZ();
        ccln cclnVar = this.e;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccwq ccwqVar = (ccwq) bZ.b;
        cclnVar.getClass();
        ccwqVar.b = cclnVar;
        int i = ccwqVar.a | 1;
        ccwqVar.a = i;
        ccxa ccxaVar = this.g;
        ccxaVar.getClass();
        ccwqVar.c = ccxaVar;
        int i2 = i | 2;
        ccwqVar.a = i2;
        ccma ccmaVar = this.af;
        ccmaVar.getClass();
        ccwqVar.d = ccmaVar;
        ccwqVar.a = i2 | 4;
        bvrs.l(bundle, bZ.bK());
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void u() {
        this.ad.e(null);
        super.u();
    }
}
