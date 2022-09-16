package defpackage;

import android.app.Activity;
import com.google.android.apps.gmm.directions.api.GmmNotice;
import java.util.List;
/* compiled from: PG */
/* renamed from: swk  reason: default package */
/* loaded from: classes7.dex */
public class swk implements swd, zfl {
    private static final dcqe a = dcqe.c("swk");
    private final tlv b;
    private final amve c;
    private final sve d;
    private final xzp e;

    public swk(Activity activity, sve sveVar, ycj ycjVar, xkm xkmVar, tlv tlvVar, amve amveVar) {
        this.b = tlvVar;
        this.c = amveVar;
        this.d = sveVar;
        this.e = ycjVar.a(tlvVar.A(amveVar, activity).b(), false, false, false, this, null, false, xkmVar.a(new vnk(dcdc.e())), vwh.n);
    }

    @Override // defpackage.zcw
    public void A(cjqm cjqmVar) {
        bvoo.h("Parking is not supported in Directions Framework.", new Object[0]);
    }

    @Override // defpackage.swd
    public xzp a() {
        return this.e;
    }

    @Override // defpackage.qbp
    public void h(dwao dwaoVar, @dzsi dnqh dnqhVar) {
        bvoo.h("This method is not used in Directions Framework.", new Object[0]);
    }

    @Override // defpackage.zfe
    public void n(amuo amuoVar) {
        this.d.e(this.b, this.c, amuoVar);
    }

    @Override // defpackage.zfe
    public void o(int i, int i2) {
        this.d.d(this.b, dbsg.i(this.c), tkn.f(i2));
    }

    @Override // defpackage.zfb
    public void p(amwb amwbVar, akra akraVar, akqs akqsVar) {
        this.d.f(amwbVar, akraVar, akqsVar);
    }

    @Override // defpackage.zfc
    public void q(int i, cjqm cjqmVar) {
        bvoo.h("This method is not used in Directions Framework.", new Object[0]);
    }

    @Override // defpackage.zfl
    public void r() {
        this.d.b(this.c);
    }

    @Override // defpackage.zfl
    public void s(List<GmmNotice> list, qda qdaVar) {
        this.d.c(list, qdaVar);
    }

    @Override // defpackage.zfd
    public void t(@dzsi qcd qcdVar) {
        bvoo.h("Offline directions are not supported in Directions Framework.", new Object[0]);
    }

    @Override // defpackage.zcz
    public void z() {
        bvoo.h("Parking is not supported in Directions Framework.", new Object[0]);
    }
}
