package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: adrj  reason: default package */
/* loaded from: classes2.dex */
final class adrj extends cqiw<advo> {
    static final cqtv a = cqsg.d(cqrp.d(32.0d), cqsg.f(cqrp.f(22.0d), Float.valueOf(5.0f)), cqsg.k(cqrp.d(16.0d), cqrp.f(22.0d)));
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<advo> a() {
        cqmp[] cqmpVarArr = {cqgr.bD(cqrp.d(4.0d)), ibq.p(), cqgr.eU(ibm.t()), cqgr.cB(5), cqgr.co(cqrp.f(4.0d), true), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eN(5), cqgr.eM(adre.a)};
        final cqlc cqlcVar = adrf.a;
        cqlc cqlcVar2 = adrg.a;
        final cqlc cqlcVar3 = adrh.a;
        return cqgr.gd(cqgr.cd(-1), cqgr.bq(a), cqgr.dr(1), cqgr.dQ(cqrp.d(16.0d)), cqgr.dF(cqrp.d(16.0d)), cqgr.dU(cqrp.d(12.0d)), cqgr.x(irn.G()), cqgr.cW(cqgr.q(adrc.a)), iue.c(adrd.a), cqgr.gq(cqmpVarArr), cqgr.gd(cqgr.aF(new cqlc(cqlcVar, cqlcVar3) { // from class: adri
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar;
                this.b = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar4 = this.a;
                cqlc cqlcVar5 = this.b;
                advo advoVar = (advo) cqkpVar;
                int i = adrj.b;
                boolean z = false;
                if (cqjv.v((jic) cqlcVar4.a(advoVar)).booleanValue() && cqjv.v((CharSequence) cqlcVar5.a(advoVar)).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.aJ(16), cqgr.bD(cqrp.d(12.0d)), WebImageView.a(cqgr.aF(cqjv.x(cqlcVar)), cqgr.ch(cqrp.d(16.0d)), cqgr.bG(cqrp.d(8.0d)), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE), cqgr.fH(cqlcVar2), WebImageView.l(cqlcVar)), iue.f(cqgr.aF(cqjv.x(cqlcVar3)), ibq.q(), cqgr.eU(ibm.n()), cqgr.eM(cqlcVar3))));
    }
}
