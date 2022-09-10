package defpackage;

import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bkzy  reason: default package */
/* loaded from: classes3.dex */
public abstract class bkzy extends cqiw<blkw> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<blkw> a() {
        cqlc cqlcVar = bkzt.a;
        cqmp[] cqmpVarArr = {cqgr.aF(bkzu.a), cqgr.bG(cqrp.d(12.0d))};
        cqmj e = WebImageView.e(cqlcVar, new cqmp[0]);
        e.f(cqmpVarArr);
        cqlc cqlcVar2 = bkzv.a;
        cqmp[] cqmpVarArr2 = {cqgr.aI(bkzw.a), cqgr.bG(cqrp.d(12.0d))};
        cqmj a = WebImageView.a(WebImageView.l(cqlcVar2), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.ce(ibn.b()), cqgr.bq(ibn.b()));
        a.f(cqmpVarArr2);
        cqmp[] cqmpVarArr3 = {cqgr.cH(ibn.a()), cqgr.ca(Float.valueOf(1.0f)), cqgr.aJ(16), cqgr.K(bkzp.a), cqgr.cW(acly.a(bkzq.a)), cqgr.cs(bkzr.a), cqgr.dn(acly.b(bkzs.a)), e, a, e()};
        cqlc cqlcVar3 = bkzx.a;
        cqlc cqlcVar4 = bkzo.a;
        return cqgr.gd(cqgr.cd(-1), cqgr.dF(cqrp.d(4.0d)), iue.c(bkzn.a), cqgr.gd(cqmpVarArr3), jhc.d(cqlcVar3, cqgr.aF(cqjv.x(cqlcVar3)), cqjv.l(cqjv.x(cqlcVar4), cqgr.T(cqrt.l(R.string.ACCESSIBILITY_OVERFLOW_MENU)), cqgr.V(cqlcVar4)), cqgr.ca(Float.valueOf(0.0f)), cqgr.ce(ibn.a()), cqgr.bq(ibn.a())), f());
    }

    protected abstract cqmj<blkw> e();

    protected cqmn<blkw> f() {
        return cqmn.a(new cqmp[0]);
    }
}
