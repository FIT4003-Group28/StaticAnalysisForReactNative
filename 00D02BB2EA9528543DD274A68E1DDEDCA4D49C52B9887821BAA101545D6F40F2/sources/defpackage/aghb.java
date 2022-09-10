package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: aghb  reason: default package */
/* loaded from: classes2.dex */
public final class aghb extends cqiw<agzh> {
    public static final /* synthetic */ int b = 0;
    public final agha a;

    public aghb(agha aghaVar) {
        super(aghaVar);
        this.a = aghaVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<agzh> a() {
        cqmp cqmpVar;
        cqmp[] cqmpVarArr = new cqmp[9];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = cqgr.bp(-2);
        cqmpVarArr[2] = cqgr.dr(1);
        cqmpVarArr[3] = cqgr.x(irn.G());
        cqmpVarArr[4] = iue.c(new cqlc(this) { // from class: aggp
            private final aghb a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((agzh) cqkpVar).e(this.a.a.c());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr[5] = cqgr.cW(cqgr.q(aggq.a));
        if (this.a.a()) {
            cqmpVar = WebImageView.a(cqgr.bq(cqrp.d(150.0d)), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(aggr.a));
        } else {
            cqmpVar = cqmp.e;
        }
        cqmpVarArr[6] = cqmpVar;
        cqmp[] cqmpVarArr2 = new cqmp[10];
        cqmpVarArr2[0] = cqgr.bR(cqrp.d(16.0d));
        cqmpVarArr2[1] = cqgr.bG(cqrp.d(16.0d));
        cqmpVarArr2[2] = cqgr.bV(cqrp.d(16.0d));
        cqmpVarArr2[3] = ibq.p();
        cqmpVarArr2[4] = cqgr.eU(ibm.t());
        cqmpVarArr2[5] = cqgr.cp(Float.valueOf(1.2f));
        cqmpVarArr2[6] = cqgr.eN(5);
        cqmpVarArr2[7] = this.a.b() ? cqgr.cl(2) : cqgr.cB(4);
        cqmpVarArr2[8] = cqgr.ar(TextUtils.TruncateAt.END);
        cqmpVarArr2[9] = cqgr.eM(aggs.a);
        cqmpVarArr[7] = cqgr.gq(cqmpVarArr2);
        cqmm fR = cqgr.fR(new aggy(), aggt.a, new cqmp[0]);
        fR.a(cqgr.bk(cqjv.x(aggu.a)));
        cqmpVarArr[8] = fR;
        return cqgr.gd(cqmpVarArr);
    }
}
