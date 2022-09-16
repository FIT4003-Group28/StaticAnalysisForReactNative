package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: beeb  reason: default package */
/* loaded from: classes3.dex */
public class beeb extends cqiw<beer> {
    public static final /* synthetic */ int b = 0;
    private static final cqjg c = cqjg.a();
    public final boolean a;
    private final int d;
    private final boolean e;

    public beeb() {
        this(true, 16, false);
    }

    private final cqmp<beer> e() {
        return this.e ? cqgr.a(new bnhx()) : cqmp.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public cqmj<beer> a() {
        cqmp[] cqmpVarArr = {cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.aJ(16), cqgr.bY(cqjd.t(), cqjd.y(cyc.a)), cqgr.gd(cqgr.gd(cqgr.aI(cqjv.x(becy.a)), cqgr.dr(0), cqgr.fP(new acmu(), bedj.a, new cqmp[0]), cqgr.gq(cqgr.bR(irh.g()), cqgr.co(cqrp.f(3.0d), true), irn.m(), e(), cqgr.eU(irg.J()), cqgr.eM(bedt.a))), cqgr.gq(cqgr.aF(cqjv.x(bedu.a)), irn.m(), cqgr.fg(bedv.a), cqgr.cD(bedw.a), e(), cqgr.ar(TextUtils.TruncateAt.END), cqgr.co(cqrp.f(3.0d), true), cqgr.eU(irg.J()), cqgr.eM(bedx.a))), cqgr.gq(cqgr.aF(cqjv.x(bedy.a)), irn.m(), cqgr.fg(bedz.a), cqgr.eU(irg.J()), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eN(5), cqgr.bX(beea.a), cqgr.co(cqrp.f(3.0d), true), e(), cqgr.eM(becz.a)), cqgr.gd(cqgr.aF(cqjv.x(beda.a)), cqgr.bV(cqrp.d(2.0d)), cqgr.cB(1), cqgr.gq(cqgr.aF(bedb.a), irn.l(), iue.c(bedc.a), cqgr.eM(bedd.a), cqgr.cx(22), cqgr.fh(cqrp.f(13.0d)), cqgr.cm(cqrp.f(4.0d)), e(), cqgr.eU(ibm.x())), cqgr.gq(cqgr.aF(cqjv.x(bede.a)), irn.m(), cqgr.fh(cqrp.f(13.0d)), cqgr.cm(cqrp.f(4.0d)), cqgr.eU(irg.j()), e(), cqgr.eI(" · ")), cqgr.gq(cqgr.aF(cqjv.x(bedf.a)), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), irn.m(), cqgr.fh(cqrp.f(13.0d)), cqgr.cm(cqrp.f(4.0d)), e(), cqgr.eU(irg.j()), cqgr.eM(bedg.a)))};
        cyc cycVar = new cyc();
        cqlc cqlcVar = bedo.a;
        cqjg cqjgVar = c;
        return cqgr.gj(cqgr.aI(bedh.a), cqjv.l(bedi.a, cqgr.bp(-2), cqgr.bq(cqrp.c(dcyn.a))), cqgr.cd(-1), cqgr.eN(5), cqgr.x(irn.G()), cqgr.cW(cqgr.q(bedk.a)), iue.c(bedl.a), cqgr.dU(cqrp.d(this.d)), cqgr.dB(cqrp.d(this.d)), cqgr.dT(new cqlc(this) { // from class: bedm
            private final beeb a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                beer beerVar = (beer) cqkpVar;
                return this.a.a ? irh.b() : cqrp.d(dcyn.a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.dI(new cqlc(this) { // from class: bedn
            private final beeb a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                beer beerVar = (beer) cqkpVar;
                return this.a.a ? irh.b() : cqrp.d(dcyn.a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.gd(cqmpVarArr), cqgr.fP(cycVar, cqlcVar, cqgr.aI(bedp.a), cqgr.bV(cqrp.d(-17.0d)), e(), cqgr.bY(cqjd.y(cqjgVar))), cqgr.gd(cqgr.dr(1), cqgr.aJ(16), cqgr.aT(cqjgVar), cqgr.bY(cqjd.f(), cqjd.t()), WebImageView.a(cqgr.cg(bedq.a), cqgr.bs(bedr.a), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(beds.a))));
    }

    public beeb(int i) {
        this(false, i, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public beeb(boolean z, int i, boolean z2) {
        super(Boolean.valueOf(z), Integer.valueOf(i), Boolean.valueOf(z2));
        this.a = z;
        this.d = i;
        this.e = z2;
    }
}
