package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: uux  reason: default package */
/* loaded from: classes7.dex */
public class uux extends cqiw<zcd> {
    private static final cqtv b = cqrp.d(88.0d);
    private static final cqtv c = cqrp.d(52.0d);
    public static final cqtv a = cqrp.d(8.0d);

    /* JADX INFO: Access modifiers changed from: protected */
    public static final <T extends zcd> cqmj<T> f(cqlc<T, Boolean> cqlcVar, int i, int i2) {
        return cqgr.fY(cqic.f(cqlcVar, new cqmp[0]), WebImageView.a(cqgr.S(Integer.valueOf((int) R.string.STREET_VIEW)), cqgr.cd(-1), cqgr.bp(-1), cqgr.bV(cqrp.d(i)), cqgr.bR(cqrp.d(i2)), cqgr.ei(ImageView.ScaleType.FIT_XY), iue.c(uut.a), cqgr.cW(cqgr.q(uuj.a)), WebImageView.l(uuk.a)), cqgr.gc(cqgr.bw(80), cqgr.cd(-2), cqgr.bp(-2), cqgr.bR(cqrp.d(5.0d)), cqgr.eE(cqrt.f(2131231803))));
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, zcd zcdVar, Context context, cqiv cqivVar) {
        cqivVar.f(new uuw(), zcdVar.h());
    }

    @Override // defpackage.cqiw
    public cqmj<zcd> a() {
        return e(false, true, dtxw.cM);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cqmj<zcd> e(boolean z, boolean z2, final ddho ddhoVar) {
        cqmj cqmjVar;
        cqmp[] cqmpVarArr = new cqmp[8];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = cqgr.bp(-2);
        cqmpVarArr[2] = cqgr.x(ibo.i());
        cqmpVarArr[3] = iue.c(new cqlc(ddhoVar) { // from class: uui
            private final ddho a;

            {
                this.a = ddhoVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                ddho ddhoVar2 = this.a;
                cqtv cqtvVar = uux.a;
                return ((zcd) cqkpVar).i(ddhoVar2);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr[4] = cqgr.cW(acly.a(uul.a));
        cqmpVarArr[5] = cqgr.K(uum.a);
        cqmp[] cqmpVarArr2 = new cqmp[5];
        cqmpVarArr2[0] = cqgr.bY(cqjd.t());
        cqmpVarArr2[1] = cqgr.dQ(z ? irh.c() : irh.b());
        cqmpVarArr2[2] = cqgr.dU(cqrp.d(16.0d));
        cqmpVarArr2[3] = cqgr.dB(cqrp.d(16.0d));
        cqmpVarArr2[4] = cqgr.gc(cqgr.bq(irh.r()), cqgr.ce(irh.r()), cqgr.bR(a), cqgr.eG(uun.a));
        cqmpVarArr[6] = cqgr.fY(cqmpVarArr2);
        cqmp[] cqmpVarArr3 = new cqmp[12];
        cqmpVarArr3[0] = cqgr.bY(cqjd.t());
        cqmpVarArr3[1] = cqgr.cd(-1);
        cqmpVarArr3[2] = cqgr.bp(-2);
        cqmpVarArr3[3] = cqgr.dU(cqrp.d(18.0d));
        cqmpVarArr3[4] = cqgr.dB(cqrp.d(18.0d));
        cqmpVarArr3[5] = cqgr.dQ(z ? irh.f() : irh.e());
        cqmpVarArr3[6] = cqgr.dF(z ? irh.c() : irh.b());
        cqmpVarArr3[7] = cqgr.dr(0);
        cqmpVarArr3[8] = cqgr.aJ(16);
        cqmpVarArr3[9] = cqgr.gd(cqgr.ca(Float.valueOf(1.0f)), cqgr.cd(-2), cqgr.bp(-2), cqgr.dr(1), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqjv.n(uuo.a, vle.c(), cqjv.m(false, cqmn.a(ibq.o(), ibq.y()), vle.a())), itj.n(false), cqgr.eM(uup.a), cqgr.eN(5)), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), vle.b(), cqgr.eM(uuq.a), cqgr.eN(5), cqgr.aF(cqjv.x(uur.a))), cqgr.gd(cqgr.bp(-2), cqgr.dr(1), cqgr.ck(C())));
        cqmpVarArr3[10] = cqmp.e;
        if (z2) {
            cqmj f = f(uus.a, 0, 8);
            f.f(cqgr.ce(b), cqgr.bq(c));
            cqmjVar = f;
        } else {
            cqmjVar = cqmp.e;
        }
        cqmpVarArr3[11] = cqmjVar;
        cqmpVarArr[7] = cqgr.gd(cqmpVarArr3);
        return cqgr.gj(cqmpVarArr);
    }
}
