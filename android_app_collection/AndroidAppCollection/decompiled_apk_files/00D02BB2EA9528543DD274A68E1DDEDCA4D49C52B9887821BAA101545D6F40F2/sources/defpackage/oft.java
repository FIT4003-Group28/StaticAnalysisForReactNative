package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: oft  reason: default package */
/* loaded from: classes7.dex */
public class oft extends cqiw<oxi> {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public static cqmj<oxi> d() {
        final cqlc cqlcVar = ofh.a;
        final cqlc cqlcVar2 = ofk.a;
        cqmp[] cqmpVarArr = {cqgr.aI(ofo.a), cqgr.bq(cqrp.d(170.0d)), cqgr.cd(-1), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(ofp.a)};
        cqmj<oxi> g = g(ofq.a);
        g.f(cqgr.aI(cqlcVar), cqgr.bV(cqrp.d(15.0d)), cqgr.bF(new cqlc(cqlcVar2) { // from class: ofr
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i = oft.a;
                return cqrp.d(((Boolean) this.a.a((oxi) cqkpVar)).booleanValue() ? 10.0d : 15.0d);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.bR(irh.d()), cqgr.bG(irh.d()));
        cqmj<oxi> e = e(ofs.a, ofi.a);
        e.f(cqgr.aI(cqlcVar2), cqgr.bX(new cqlc(cqlcVar) { // from class: ofj
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i = oft.a;
                return cqrp.d(((Boolean) this.a.a((oxi) cqkpVar)).booleanValue() ? dcyn.a : 15.0d);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.bD(cqrp.d(15.0d)), cqgr.bR(irh.d()), cqgr.bG(irh.d()));
        return cqgr.gd(cqgr.dr(1), cqgr.bp(-2), cqgr.cd(-1), cqgr.x(irn.G()), iue.c(ofl.a), cqgr.cW(acly.a(ofm.a)), cqgr.K(ofn.a), cqgr.az(true), WebImageView.a(cqmpVarArr), g, e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cqmj<oxi> e(cqlc<oxi, jic> cqlcVar, cqlc<oxi, CharSequence> cqlcVar2) {
        cqmp[] cqmpVarArr = {cqgr.aF(cqjv.x(cqlcVar)), cqgr.bq(cqrp.d(12.0d)), cqgr.ce(cqrp.d(12.0d)), cqgr.bG(cqrp.d(12.0d)), WebImageView.l(cqlcVar)};
        cqmj<oxi> f = f(cqlcVar2);
        f.f(cqgr.aF(cqjv.x(cqlcVar2)));
        return cqgr.gd(cqgr.aJ(16), WebImageView.a(cqmpVarArr), f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cqmj<oxi> f(cqlc<oxi, CharSequence> cqlcVar) {
        return iue.f(cqgr.bp(-2), cqgr.cd(-1), irn.n(), cqgr.eU(ire.q()), cqgr.eN(5), cqgr.eM(cqlcVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cqmj<oxi> g(cqlc<oxi, CharSequence> cqlcVar) {
        return cqgr.gq(cqgr.bp(-2), cqgr.cd(-1), irn.f(), cqgr.eN(5), cqgr.fh(cqrp.f(16.0d)), cqgr.co(cqrp.f(4.0d), false), cqgr.ar(TextUtils.TruncateAt.END), cqgr.cB(2), cqgr.eM(cqlcVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public cqmj<oxi> a() {
        return d();
    }
}
