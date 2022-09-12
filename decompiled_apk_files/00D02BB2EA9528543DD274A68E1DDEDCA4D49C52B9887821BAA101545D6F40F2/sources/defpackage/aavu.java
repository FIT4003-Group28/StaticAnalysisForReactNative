package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: aavu  reason: default package */
/* loaded from: classes2.dex */
public final class aavu extends cqiw<aawx> {
    public static final cqrp a = cqrp.d(48.0d);
    public final aavq b;

    public aavu(aavq aavqVar) {
        super(aavqVar);
        this.b = aavqVar;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, aawx aawxVar, Context context, cqiv cqivVar) {
        aawx aawxVar2 = aawxVar;
        if (aawxVar2.c() != null) {
            for (jbi jbiVar : aawxVar2.c()) {
                cqivVar.a(new aavt(this.b), jbiVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aawx> a() {
        cqmp[] cqmpVarArr = new cqmp[8];
        cqmpVarArr[0] = cqgr.aI(aavi.a);
        cqmpVarArr[1] = cqgr.dr(1);
        cqmpVarArr[2] = cqgr.bw(48);
        cqmpVarArr[3] = cqgr.bp(-2);
        cqmpVarArr[4] = WebImageView.a(cqgr.aF(cqjv.x(aavj.a)), cqgr.ch(a), cqgr.by(new cqlc(this) { // from class: aavk
            private final aavu a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                aawx aawxVar = (aawx) cqkpVar;
                return Integer.valueOf(this.a.b == aavq.JUSTIFY_START ? 8388611 : 8388613);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.dE(aavl.a), WebImageView.l(aavm.a), cqgr.ei(ImageView.ScaleType.CENTER_CROP));
        cqmp[] cqmpVarArr2 = new cqmp[4];
        cqmpVarArr2[0] = cqjv.m(true, aahw.k(), aahw.d());
        cqmpVarArr2[1] = cqgr.eM(aavn.a);
        cqmpVarArr2[2] = cqjv.k(true, cqjv.k(Boolean.valueOf(this.b == aavq.JUSTIFY_START), vlb.a(), cqgr.eN(6)), cqgr.eN(4));
        cqmpVarArr2[3] = cqgr.bX(aavo.a);
        cqmpVarArr[5] = cqgr.gq(cqmpVarArr2);
        cqmpVarArr[6] = cqgr.gm(cqgr.aF(aavp.a), cqgr.bq(cqrp.d(4.0d)));
        cqmpVarArr[7] = cqgr.gd(cqgr.aG(true), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(C()));
        return cqgr.gd(cqmpVarArr);
    }
}
