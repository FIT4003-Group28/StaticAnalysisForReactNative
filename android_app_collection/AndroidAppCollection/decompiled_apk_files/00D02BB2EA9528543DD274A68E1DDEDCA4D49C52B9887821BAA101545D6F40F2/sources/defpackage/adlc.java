package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: adlc  reason: default package */
/* loaded from: classes2.dex */
public final class adlc extends cqiw<adle> {
    public static final /* synthetic */ int a = 0;
    private static final cqrp b = cqrp.d(2.0d);
    private static final cqss c = cqta.d(Color.argb(102, 60, 64, 67));
    private static final cqtv d = cqsv.f(dcyn.a, dcyn.a, 20.0d, dcyn.a);

    private static cqjb<adle, Boolean> e(final adld adldVar) {
        return new cqjb(adldVar) { // from class: adla
            private final adld a;

            {
                this.a = adldVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                adld adldVar2 = this.a;
                int i = adlc.a;
                return Boolean.valueOf(adldVar2 == ((adle) cqkpVar).h());
            }
        };
    }

    private static cqmj<adle> f() {
        return cqgr.fY(cqgr.cd(-1), cqgr.bq(b));
    }

    private static cqmj<adle> h() {
        return cqgr.fY(cqgr.ce(b), cqgr.bp(-1));
    }

    @SafeVarargs
    private static cqmj<adle> i(int i, cqmp<adle>... cqmpVarArr) {
        cqmj<adle> gd = cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqgr.dr(Integer.valueOf(i)), cqgr.ca(Float.valueOf(1.0f)));
        gd.f(cqmpVarArr);
        return gd;
    }

    private static cqmj<adle> j(final int i, float f) {
        return WebImageView.a(WebImageView.l(new cqlc(i) { // from class: adkr
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i2 = this.a;
                int i3 = adlc.a;
                return ((adle) cqkpVar).j(i2);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.ei(ImageView.ScaleType.CENTER_CROP), cqgr.cd(-1), cqgr.bp(-1), cqgr.ca(Float.valueOf(f)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<adle> a() {
        cqtv cqtvVar = d;
        cqmp[] cqmpVarArr = {cqgr.eM(adkt.a)};
        Float valueOf = Float.valueOf(1.1f);
        return aczv.b(iue.c(adkq.a), cqgr.cW(adks.a), cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.bR(cqtvVar), cqgr.bG(cqtvVar), cqgr.dr(1), abjc.d(cqmpVarArr), jgn.a(cqgr.bq(cqrp.d(224.0d)), cqgr.cd(-1), cqgr.bR(cqrp.d(8.0d)), cqgr.bG(cqrp.d(8.0d)), jgn.b(cqrp.d(8.0d)), cqgr.bD(cqrp.d(16.0d)), new cqmh(adlb.class, cqgr.cd(-1), cqgr.bp(-1), cqgr.bw(17), cqgr.ek(valueOf), cqgr.el(valueOf), cqgr.ef(Float.valueOf(10.0f)), i(0, cqgr.aH(e(adld.THREE_CARDS_LEFT_SPLIT)), i(1, j(0, 1.0f), f(), j(1, 1.4f)), h(), j(2, 1.0f)), i(0, cqgr.aH(e(adld.TWO_CARDS)), j(0, 1.0f), h(), j(2, 1.0f)), i(0, cqgr.aH(e(adld.THREE_CARDS_RIGHT_SPLIT)), j(0, 1.0f), h(), i(1, j(1, 1.0f), f(), j(2, 1.3f)))), cqgr.gs(cqgr.bq(cqrp.d(224.0d)), cqgr.cd(-1), cqgr.z(c)), cqgr.gd(cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(1), cqgr.dQ(cqrp.d(16.0d)), cqgr.dF(cqrp.d(16.0d)), cqgr.bw(17), cqgr.gq(cqgr.bp(-2), cqgr.cd(-1), cqgr.bV(cqrp.d(74.0d)), cqgr.eN(4), ibq.n(), cqgr.eU(ibl.b()), cqgr.eM(adku.a)), cqgr.gq(cqgr.bp(-2), cqgr.cd(-1), cqgr.eN(4), ibq.c(), cqgr.eU(ibl.b()), cqgr.eM(adkv.a))), hyw.w(cqkz.a(null), adkw.a, adkx.a, cqkz.a(hyw.G()), cqkz.a(null), cqkz.a(true), cqkz.a(false), hyw.J(), cqgr.eM(adky.a), cqgr.V(adkz.a), cqgr.bw(81), cqgr.bD(cqrp.d(16.0d))))));
    }
}
