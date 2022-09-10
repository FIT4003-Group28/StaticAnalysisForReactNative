package defpackage;

import android.graphics.Typeface;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: kmz  reason: default package */
/* loaded from: classes7.dex */
public final class kmz extends cqiw<bevj> {
    public static final alp a = alp.a();
    public static final cqss b = iva.b(ibl.Y(), cqta.d(1031915925));
    public static final cqss c = iva.b(ibl.h(), cqta.d(1037753568));
    private final int d;
    private final cqjb<bevj, CharSequence> e;

    public kmz(int i) {
        super(Integer.valueOf(i));
        this.e = kml.a;
        this.d = i;
    }

    private static cqnf<bevj> e() {
        return cqgr.fm(nql.c);
    }

    private static cqrp f() {
        return cqrp.d(12.0d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bevj> a() {
        cqmp[] cqmpVarArr = new cqmp[5];
        cqmpVarArr[0] = cqgr.bY(cqjd.e(), cqjd.i());
        cqmpVarArr[1] = cqgr.ce(nqo.aa);
        cqmpVarArr[2] = cqgr.eE(nqu.ag());
        cqmpVarArr[3] = this.d == 1 ? cqgr.fI(8) : cqmp.e;
        cqmpVarArr[4] = cqgr.ei(ImageView.ScaleType.CENTER);
        cqmj gc = cqgr.gc(cqmpVarArr);
        cqjd[] cqjdVarArr = {cqjd.f(), cqjd.i()};
        cqlc cqlcVar = kmt.a;
        cqmn a2 = cqmn.a(cqgr.dQ(f()), cqgr.dF(f()));
        cqmp[] cqmpVarArr2 = {cqgr.dQ(cqrp.d(dcyn.a)), cqgr.dF(cqrp.d(dcyn.a))};
        cqlc cqlcVar2 = kmu.a;
        cqlc cqlcVar3 = kmv.a;
        Typeface typeface = nre.a;
        nrb c2 = nrd.c();
        c2.b(nql.bs);
        cqmj fY = cqgr.fY(cqgr.bY(cqjdVarArr), cqgr.cd(-2), cqgr.bq(nqo.ag), cqjv.n(cqlcVar, a2, cqmn.a(cqmpVarArr2)), cqgr.y(kmq.a), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(17), cqjv.n(cqlcVar2, cqjv.n(cqlcVar3, c2.m(), nrd.c().m()), nre.r()), cqgr.eK(this.e)));
        cqmp[] cqmpVarArr3 = new cqmp[9];
        cqmpVarArr3[0] = cqgr.bY(cqjd.i(), cqjd.e(), cqjd.z(fY), cqjd.l(fY), cqjd.n(fY));
        cqmpVarArr3[1] = cqgr.cd(-2);
        cqmpVarArr3[2] = cqgr.bp(-2);
        cqmpVarArr3[3] = cqgr.aJ(16);
        cqmpVarArr3[4] = vlb.a();
        cqmpVarArr3[5] = cqgr.bR(nqo.aa);
        cqmpVarArr3[6] = cqgr.eB(true);
        int i = this.d;
        cqmpVarArr3[7] = (i == 0 || i == 1) ? cqgr.eM(kmr.a) : cqgr.eM(kms.a);
        cqmpVarArr3[8] = nre.n();
        cqmj gq = cqgr.gq(cqmpVarArr3);
        cqmp gq2 = cqgr.gq(cqgr.bY(cqjd.v(gq), cqjd.e()), cqgr.cd(-2), cqgr.bp(-2), cqgr.bR(nqo.aa), vlb.a(), cqgr.aI(kmw.a), nre.r(), cqgr.eB(true), cqgr.eM(kmx.a));
        cqmp a3 = WebImageView.a(cqgr.bY(cqjd.e(), cqjd.i(), cqjd.n(gq)), cqgr.ce(nqo.aa), cqgr.bq(cqrp.d(36.0d)), e(), WebImageView.l(kmy.a), cqgr.aI(kmm.a), cqgr.ei(ImageView.ScaleType.FIT_CENTER));
        cqmj gc2 = cqgr.gc(cqgr.bY(cqjd.e(), cqjd.i()), cqgr.ce(nqo.aa), cqgr.bq(cqrp.d(36.0d)), cqgr.eG(kmn.a), cqgr.aF(kmo.a), e(), cqgr.ei(ImageView.ScaleType.FIT_CENTER));
        cqmp[] cqmpVarArr4 = new cqmp[10];
        cqmpVarArr4[0] = cqgr.cd(-1);
        cqmpVarArr4[1] = cqgr.bp(-2);
        cqmpVarArr4[2] = iue.c(kmp.a);
        cqmpVarArr4[3] = this.d == 0 ? cqgr.dU(cqrp.d(9.0d)) : cqmp.e;
        cqmpVarArr4[4] = this.d == 0 ? cqgr.dB(cqrp.d(9.0d)) : cqmp.e;
        if (this.d != 0) {
            a3 = cqmp.e;
        }
        cqmpVarArr4[5] = a3;
        int i2 = this.d;
        if (i2 == 0) {
            gc = gc2;
        }
        cqmpVarArr4[6] = gc;
        cqmpVarArr4[7] = gq;
        cqmpVarArr4[8] = fY;
        if (i2 != 0) {
            gq2 = cqmp.e;
        }
        cqmpVarArr4[9] = gq2;
        return cqgr.gj(cqmpVarArr4);
    }
}
