package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: adpu  reason: default package */
/* loaded from: classes2.dex */
public final class adpu extends cqiw<advi> {
    public static final /* synthetic */ int a = 0;
    private final adpt b;

    public adpu(adpt adptVar) {
        super(adptVar);
        this.b = adptVar;
    }

    public static cqtv e(adpt adptVar) {
        if (adptVar.f()) {
            cqtv d = cqsg.d(cqrp.d(3.0d), cqrp.f(16.0d), cqrp.f(20.0d), cqrp.f(20.0d));
            if (adptVar.g()) {
                d = cqsg.k(d, cqrp.d(64.0d));
            }
            return cqsg.d(d, cqrp.d(adptVar.a()), cqrp.d(adptVar.b()));
        }
        throw new IllegalArgumentException("Unsupported options");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<advi> a() {
        cqnf bp;
        cqmp cqmpVar;
        cqmp[] cqmpVarArr = new cqmp[14];
        cqmpVarArr[0] = cqgr.cd(-1);
        if (this.b.f()) {
            bp = cqgr.bq(e(this.b));
        } else {
            bp = cqgr.bp(-2);
        }
        cqmpVarArr[1] = bp;
        cqmpVarArr[2] = cqgr.cH(cqrp.d(48.0d));
        cqmpVarArr[3] = cqgr.dU(cqrp.d(this.b.a()));
        cqmpVarArr[4] = cqgr.dB(cqrp.d(this.b.b()));
        cqmpVarArr[5] = cqgr.dQ(cqrp.d(this.b.c()));
        cqmpVarArr[6] = cqgr.dF(cqrp.d(this.b.d()));
        cqmpVarArr[7] = cqgr.dr(0);
        cqmpVarArr[8] = cqgr.aJ(16);
        cqmpVarArr[9] = cqgr.x(irn.G());
        cqmpVarArr[10] = iue.c(adpg.a);
        cqmpVarArr[11] = cqgr.cW(acly.a(adpj.a));
        cqmpVarArr[12] = cqgr.gd(cqgr.cd(0), cqgr.bp(-2), cqgr.ca(Float.valueOf(1.0f)), cqgr.dr(1), cqgr.aJ(16), iue.f(cqgr.cd(-1), cqgr.bp(-2), cqgr.bD(cqrp.d(3.0d)), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eN(5), ibq.m(), ibq.v(), cqgr.eM(adpk.a)), cqgr.gd(cqic.c(adpl.a, new cqmp[0]), cqgr.bq(cqrp.f(20.0d)), cqgr.dr(0), cqgr.aJ(16), cqgr.gq(cqgr.aW(2), cqgr.bG(cqrp.d(2.0d)), ibq.p(), ibq.y(), cqgr.eM(adpm.a)), jfb.a(cqgr.bG(cqrp.d(2.0d)), jfb.c(adpn.a), jfb.f(jfo.d)), iue.f(ibq.p(), ibq.y(), cqgr.eM(adpo.a), cqgr.V(adpp.a))), iue.f(cqic.c(adpq.a, new cqmp[0]), cqgr.bq(cqrp.f(20.0d)), ibq.p(), ibq.y(), cqgr.eM(adpr.a)));
        if (this.b.g()) {
            cqmpVar = jgn.a(cqgr.bR(cqrp.d(this.b.e())), jgn.b(cqrp.d(8.0d)), cqgr.fH(adph.a), WebImageView.a(cqgr.ch(cqrp.d(64.0d)), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(adpi.a)));
        } else {
            cqmpVar = cqmp.e;
        }
        cqmpVarArr[13] = cqmpVar;
        return cqgr.gd(cqmpVarArr);
    }
}
