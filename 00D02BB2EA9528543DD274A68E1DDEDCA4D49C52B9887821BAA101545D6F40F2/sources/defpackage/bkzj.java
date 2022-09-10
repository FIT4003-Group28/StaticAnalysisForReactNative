package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: bkzj  reason: default package */
/* loaded from: classes3.dex */
public final class bkzj extends cqiw<bhtu> {
    public static final /* synthetic */ int a = 0;

    private static cqjb<bhtu, Boolean> e(final int i) {
        return new cqjb(i) { // from class: bkyy
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                int i2;
                int i3 = this.a;
                bhtu bhtuVar = (bhtu) cqkpVar;
                int i4 = bkzj.a;
                boolean z = true;
                if (bhtuVar.f().booleanValue()) {
                    i2 = 3;
                } else {
                    i2 = bhtuVar.g().booleanValue() ? 1 : 2;
                }
                if (i2 != i3) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bhtu> a() {
        cqmp[] cqmpVarArr = {cqgr.bR(cqrp.d(24.0d)), cqgr.bp(-1), cqgr.ce(cqrp.d(2.0d)), cqgr.z(ibm.i())};
        cqmp[] cqmpVarArr2 = {cqgr.bR(cqrp.d(12.0d)), cqgr.bG(cqrp.d(12.0d)), cqgr.ca(Float.valueOf(1.0f)), cqgr.dr(1), cqgr.V(bkzb.a), cqgr.gq(cqgr.cd(-2), cqgr.ar(TextUtils.TruncateAt.MIDDLE), ibq.q(), ibq.x(), cqgr.aw(cqgm.d), cqgr.cB(1), cqgr.eM(bkzc.a)), cqgr.gq(cqgr.cd(-2), ibq.q(), ibq.y(), cqgr.cB(1), cqgr.eM(bkzd.a))};
        cqlc cqlcVar = bkze.a;
        return cqgr.gd(cqgr.dr(0), cqgr.aI(bkyv.a), cqgr.bp(-2), cqgr.cd(-1), cqgr.bD(cqrp.d(16.0d)), iuh.c(cqmpVarArr), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bR(cqrp.d(16.0d)), cqgr.dU(cqrp.d(10.0d)), cqgr.dB(cqrp.d(10.0d)), cqgr.bR(cqrp.d(16.0d)), cqgr.bG(cqrp.d(4.0d)), cqgr.gd(cqgr.bD(cqrp.d(16.0d)), cqgr.cd(-1), cqgr.aJ(16), WebImageView.i(bkza.a, cqkz.a(cqrp.d(32.0d)), new cqmp[0]), cqgr.gd(cqmpVarArr2), jhc.d(cqlcVar, cqgr.aF(cqjv.x(cqlcVar)), cqgr.ca(Float.valueOf(0.0f)), cqgr.ce(ibn.a()), cqgr.bq(ibn.a()))), cqgr.fY(cqgr.bp(-1), cqgr.cd(-1), cqgr.V(bkzf.a), bzyz.a(cqgr.aH(e(1)), bzyz.c(bkzg.a), bzyz.b(bkzh.a), bzyz.d(), cqgr.bG(cqrp.d(12.0d))), cqgr.gq(cqgr.aH(e(2)), cqgr.cd(-2), cqgr.bG(cqrp.d(12.0d)), ibq.p(), ibq.x(), cqgr.co(cqrp.d(5.0d), false), cqgr.eM(bkzi.a)), cqgr.gq(cqgr.aH(e(3)), cqgr.cd(-2), cqgr.bG(cqrp.d(12.0d)), cqgr.cD(bkyw.a), ibq.p(), ibq.x(), cqgr.cm(cqrp.d(5.0d)), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(bkyx.a))), cqgr.fR(new cjcr(dtyd.dt), bkyz.a, new cqmp[0])));
    }
}
