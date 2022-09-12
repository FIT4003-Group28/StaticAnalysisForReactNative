package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.fivestar.FiveStarView;
import com.google.android.apps.gmm.base.views.layout.FixedAspectRatioLayout;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bkbn  reason: default package */
/* loaded from: classes3.dex */
class bkbn extends cqiw<bkdh> {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public cqmj<bkdh> a() {
        cqlc cqlcVar = bkbb.a;
        cqmp[] cqmpVarArr = {cqgr.dA(cqlcVar, cqlcVar, cqlcVar, cqlcVar), itj.b(Float.valueOf(1.3333334f)), cqgr.cd(-1), WebImageView.a(cqgr.cd(-1), cqgr.bp(-1), cqgr.ei(ImageView.ScaleType.FIT_CENTER), WebImageView.l(bkbf.a))};
        cqmp[] cqmpVarArr2 = {cqgr.dz(ibn.f(), cqrp.d(8.0d), ibn.f(), cqrp.d(8.0d)), ibq.p(), cqgr.cl(2), cqgr.eN(5), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(bkbg.a)};
        cqmp[] cqmpVarArr3 = {cqgr.dz(ibn.f(), cqrp.d(dcyn.a), ibn.f(), cqrp.d(8.0d)), ibq.p(), cqgr.cl(1), cqgr.eN(5), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(bkbh.a)};
        final cqlc cqlcVar2 = bkbj.a;
        final cqlc cqlcVar3 = bkbk.a;
        final cqlc cqlcVar4 = new cqlc(cqlcVar2) { // from class: bkbc
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar5 = this.a;
                bkdh bkdhVar = (bkdh) cqkpVar;
                boolean z = true;
                if (!Float.isNaN(((Float) cqlcVar5.a(bkdhVar)).floatValue()) && ((Float) cqlcVar5.a(bkdhVar)).floatValue() > 0.0f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        return hye.b(cqgr.bp(-2), hye.f(cqrp.d(0.5d)), cqqx.i(cqrp.d(1.25d)), cqgr.K(bkba.a), cqgr.cW(cqgr.q(bkbe.a)), cqgr.gd(cqgr.dr(1), cqgr.dB(cqrp.d(4.0d)), FixedAspectRatioLayout.a(cqmpVarArr), cqgr.gq(cqmpVarArr2), cqgr.gq(cqmpVarArr3), cqgr.gd(cqgr.aI(bkbi.a), cqgr.dz(ibn.f(), cqrp.d(dcyn.a), ibn.f(), cqrp.d(8.0d)), cqgr.gd(cqgr.bk(new cqlc(cqlcVar3, cqlcVar4) { // from class: bkbd
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar3;
                this.b = cqlcVar4;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar5 = this.a;
                cqlc cqlcVar6 = this.b;
                bkdh bkdhVar = (bkdh) cqkpVar;
                int i = bkbn.a;
                boolean z = true;
                if (((Integer) cqlcVar5.a(bkdhVar)).intValue() != 0 && !((Boolean) cqlcVar6.a(bkdhVar)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.bw(16), FiveStarView.g(cqlcVar2, jfo.d), cqgr.gq(FiveStarView.b(), cqgr.cl(1), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eK(cqiq.f(R.plurals.REVIEW_COUNT_SHORT, cqlcVar3, cqiq.h(cqlcVar3)))))), cqgr.gd(cqgr.aI(bkbl.a), cqgr.dz(ibn.f(), cqrp.d(dcyn.a), ibn.f(), cqrp.d(8.0d)), cqgr.gq(ibq.q(), ibq.y(), cqgr.cl(1), cqgr.eN(5), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(bkbm.a)))));
    }
}
