package defpackage;

import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: bdrb  reason: default package */
/* loaded from: classes3.dex */
public final class bdrb extends cqiw<bdrc> {
    @SafeVarargs
    private static final cqmj<bdrc> e(cqmp<bdrc>... cqmpVarArr) {
        cqlc cqlcVar = bdra.a;
        cqgq a = itj.a();
        Float valueOf = Float.valueOf(0.9f);
        a.f = valueOf;
        a.g = valueOf;
        a.d = 500;
        a.c = eho.a(0.0f, 1.5f, 0.5f, 1.0f);
        cqnf b = a.b();
        cqgq a2 = itj.a();
        Float valueOf2 = Float.valueOf(0.6f);
        a2.f = valueOf2;
        a2.g = valueOf2;
        a2.d = 0;
        cqmj<bdrc> fY = cqgr.fY(cqjv.l(cqlcVar, b, a2.b()));
        fY.f(cqmpVarArr);
        return fY;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bdrc> a() {
        cqlc cqlcVar = bdqs.a;
        cqgq a = itj.a();
        a.a = Float.valueOf(1.0f);
        a.d = 500;
        cqnf b = a.b();
        cqgq a2 = itj.a();
        a2.a = Float.valueOf(0.0f);
        cqmp[] cqmpVarArr = {cqgr.cd(-1), cqgr.bp(-1), cqgr.x(cqta.d(-1442840576)), cqjv.l(cqlcVar, b, a2.b())};
        cqmp<bdrc>[] cqmpVarArr2 = {cqic.f(bdqt.a, new cqmp[0])};
        cqmj<bdrc> e = e(apqr.j(cqgr.bw(17), apqr.q(apqp.SHRINK_CONTAINER), apqr.o(false), apqr.p(bdqw.a), apqr.m(bdqx.a), apqr.l(bdqy.a), apqr.k(bdqz.a)));
        e.f(cqmpVarArr2);
        cqmp<bdrc>[] cqmpVarArr3 = {cqic.c(bdqu.a, new cqmp[0])};
        cqmj<bdrc> e2 = e(WebImageView.a(cqgr.bw(17), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE), WebImageView.l(bdqv.a)));
        e2.f(cqmpVarArr3);
        return cqgr.fY(cqgr.aI(bdqr.a), cqgr.gs(cqmpVarArr), e, e2);
    }
}
