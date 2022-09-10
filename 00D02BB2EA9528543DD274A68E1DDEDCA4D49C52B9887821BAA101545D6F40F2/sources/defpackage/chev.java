package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: chev  reason: default package */
/* loaded from: classes4.dex */
public final class chev extends chcl<chmp> {
    private final ckln<chmp> a = new ckln<>();

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(jic jicVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> fY = cqgr.fY(cqgr.cd(-1), cqgr.bq(cqrp.d(88.0d)), WebImageView.a(cqgr.cd(-1), cqgr.bp(-1), WebImageView.k(jicVar), cqgr.ei(ImageView.ScaleType.CENTER_CROP)));
        fY.f(cqmpVarArr);
        return fY;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cqkp cqkpVar, Context context, cqiv cqivVar) {
        chmp chmpVar = (chmp) cqkpVar;
        cklj b = this.a.b(cqivVar, 3, cqrp.d(2.0d).NR(context));
        b.b(new cheu(), chmpVar.m());
        chmn t = chmpVar.t();
        if (t != null) {
            b.a(new ches(), t);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<chmp> a() {
        cqmp[] cqmpVarArr = {cqgr.cd(-2), cqgr.bp(-2), cqgr.bV(ibn.o()), cqgr.bR(ibn.f()), cqgr.bG(ibn.f()), cqgr.eN(4), ibq.g(), cqgr.eU(ibm.t()), cqgr.eL(Integer.valueOf((int) R.string.ADD_YOUR_PHOTOS_MORE)), cqgr.aG(((chmp) B()).y())};
        cqml f = cayj.f(cher.a);
        ((cqmm) f).a(cqgr.aG(((chmp) B()).y()), cqgr.aJ(17));
        cqmp[] cqmpVarArr2 = {cqgr.ce(cqrp.d(18.0d)), cqgr.bq(cqrp.d(20.0d)), cqgr.bG(ibn.d()), cqgr.dU(cqrp.d(2.0d)), cqgr.fm(ibm.n()), cqgr.eD(2131232450)};
        Float valueOf = Float.valueOf(1.0f);
        cqmp[] cqmpVarArr3 = {cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.aJ(16), cqgr.dQ(ibn.f()), cqgr.gc(cqmpVarArr2), cqgr.gq(cqgr.ca(valueOf), cqgr.cd(-2), cqgr.bp(-2), cqgr.dU(cqrp.d(2.0d)), cqgr.eN(5), ibq.q(), ibq.y(), cqgr.eL(Integer.valueOf((int) R.string.TODO_PHOTO_FROM_GOOGLE_PHOTOS))), cqgr.gc(cqgr.ce(cqrp.d(50.0d)), cqgr.bq(ibn.a()), cqgr.dU(cqrp.d(16.0d)), cqgr.dB(cqrp.d(14.0d)), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqgr.x(irm.b), cqgr.J(true), cqgr.cU(((chmp) B()).h()), iue.b(((chmp) B()).i()), cqgr.S(Integer.valueOf((int) R.string.HELP)), cqgr.fm(ibm.n()), cqgr.eD(2131232709))};
        cqmp[] cqmpVarArr4 = {cqgr.bp(-2), cqgr.cd(-1), cqgr.bR(ibn.f()), cqgr.bG(ibn.f()), cqgr.bD(ibn.d()), cqgr.ck(C()), ckln.a(this.a)};
        jic j = ((chmp) B()).j();
        cqmp[] cqmpVarArr5 = {cqgr.bw(16), cqgr.bG(cqrp.d(12.0d))};
        cqmp[] cqmpVarArr6 = {cqgr.cd(-2), cqgr.bp(-2), cqgr.aJ(16), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), cqgr.ah(cqrt.g(2131232149, ibm.c())), ibq.n(), ibq.v(), cqgr.eI(((chmp) B()).k())};
        cqmp[] cqmpVarArr7 = {cqgr.aD(cqjv.v(((chmp) B()).l())), cqgr.cd(-2), cqgr.ca(valueOf), ibq.q(), ibq.y(), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eI(((chmp) B()).l())};
        Float valueOf2 = Float.valueOf(0.0f);
        cqmj gd = cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.aJ(1), cqgr.dB(ibn.f()), e(), cqgr.gq(cqmpVarArr), f, cqgr.gd(cqmpVarArr3), cqqx.D(cqmpVarArr4), cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.cH(ibn.a()), cqgr.bR(ibn.f()), cqgr.bG(ibn.f()), cqgr.dU(ibn.d()), cqgr.dB(ibn.d()), iue.b(((chmp) B()).p()), cqgr.cU(((chmp) B()).o()), cqgr.J(true), cqgr.x(irn.G()), WebImageView.f(j, cqmpVarArr5), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.bw(16), cqgr.gq(cqmpVarArr6), cqgr.gd(cqgr.dr(0), cqgr.cd(-2), cqgr.bp(-2), cqgr.aW(1), cqgr.bV(cqrp.d(-2.0d)), cqgr.gq(cqmpVarArr7), cqgr.gq(cqgr.aD(cqjv.v(((chmp) B()).l())), cqgr.ca(valueOf2), ibq.q(), ibq.y(), cqgr.eI("  •  ")), cqgr.gq(cqgr.ca(valueOf2), ibq.q(), ibq.y(), cqgr.cB(1), cqgr.eL(Integer.valueOf((int) R.string.ESTIMATED_LOCATION)))))), cqgr.fO(new chet(), ((chmp) B()).u(), cqgr.cd(-2), cqgr.bR(ibn.f()), cqgr.bG(ibn.f()), cqgr.bV(cqrp.d(6.0d)), cqgr.bD(cqrp.d(2.0d)), cqgr.bw(1)), cqgr.gq(cqgr.cd(-1), cqgr.bp(-2), cqgr.bR(ibn.f()), cqgr.bG(ibn.f()), ibq.q(), cqgr.eN(4), cqgr.eU(ibm.n()), cqgr.eL(Integer.valueOf((int) R.string.TODO_PHOTO_POSTING_PUBLICLY)), cqgr.aD(((chmp) B()).y())));
        gd.f(chfw.g(((chmp) B()).v()));
        return chfw.d(chfw.a(cqgr.bw(49), iue.b(((chmp) B()).w()), chfw.e(((chmp) B()).v()), chfw.f(((chmp) B()).v()), gd));
    }
}
