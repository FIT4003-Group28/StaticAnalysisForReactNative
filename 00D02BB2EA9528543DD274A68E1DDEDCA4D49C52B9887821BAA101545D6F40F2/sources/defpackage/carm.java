package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: carm  reason: default package */
/* loaded from: classes4.dex */
public final class carm extends cqiw<cagb> {
    public static final /* synthetic */ int a = 0;
    private static final jfo b;

    static {
        jfn h = jfo.f.h();
        h.h(cqrp.d(36.0d));
        h.b(cqrp.d(38.0d));
        b = h.a();
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cagb cagbVar, Context context, cqiv cqivVar) {
        cagb cagbVar2 = cagbVar;
        int intValue = cagbVar2.S().intValue();
        dcdc z = dcbg.b(cagbVar2.R()).x(intValue).z();
        int i2 = 0;
        while (i2 < z.size()) {
            cqivVar.a(new casj(i2 == intValue + (-1)), (cagc) z.get(i2));
            i2++;
        }
        if (z.size() < intValue) {
            cqivVar.a(new capu(), cagbVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cagb> a() {
        cqrp d = cqrp.d(4.0d);
        return cqqx.E(cqgr.cd(-1), cqgr.aI(caop.a), cqgr.bL(cqrp.d(8.0d)), cqgr.bV(cqrp.d(4.0d)), cqgr.bO(cqrp.d(8.0d)), cqgr.bD(cqrp.d(4.0d)), cqqx.g(cqrp.d(2.0d)), cqqx.i(cqrp.d(2.0d)), cqqx.d(irg.a()), cqgr.gd(cqgr.cd(-1), itj.i(dtyd.bF), cqgr.fY(cqgr.bA(cqrp.d(12.0d)), cqgr.dz(d, d, d, d), cqgr.cW(cqgr.q(capa.a)), cqgr.V(capj.a), iue.d(capk.a, cqkz.a(dtyd.bw)), jfx.a(cqgr.bp(-2), cqgr.cd(-2), WebImageView.a(WebImageView.l(capl.a), cqgr.ei(ImageView.ScaleType.CENTER_CROP), cqgr.ce(cqrp.d(40.0d)), cqgr.bq(cqrp.d(40.0d))))), cqgr.gd(cqgr.dr(1), cqgr.ca(Float.valueOf(1.0f)), cqgr.fY(jhc.d(capm.a, cqgr.bw(8388661), cqgr.bV(cqrp.d(4.0d)), iue.d(capn.a, cqkz.a(dtyd.bv))), cqgr.gd(cqgr.dr(1), cqgr.bw(8388659), cqgr.bV(cqrp.d(16.0d)), cqgr.bD(cqrp.d(10.0d)), cqgr.bG(cqrp.d(56.0d)), cqgr.gq(cqgr.cd(-2), ibq.l(), cqgr.eM(capo.a), cqgr.eB(true), cqgr.ar(TextUtils.TruncateAt.END), cqgr.cW(cqgr.q(capp.a)), cqgr.aW(2), cqgr.x(irn.G())), cqgr.gq(cqgr.cd(-2), ibq.q(), cqgr.eM(capq.a), cqgr.eB(true), cqgr.ar(TextUtils.TruncateAt.END)), cqgr.gq(cqgr.cd(-2), cqgr.aF(cqjv.x(caoq.a)), ibq.q(), cqgr.eM(caor.a), cqgr.V(caos.a)))), jfb.a(cqgr.aI(caot.a), cqgr.bp(-2), cqgr.cd(-2), cqgr.bD(cqrp.d(10.0d)), cqgr.bG(cqrp.d(16.0d)), jfb.c(caou.a), jfb.f(b), jfb.g(caov.a), iue.d(caow.a, cqkz.a(dtyd.bx))), cqgr.gd(cqgr.aF(caox.a), cqgr.dr(1), cqgr.bp(-2), cqgr.cd(-1), cqgr.bV(cqrp.d(2.0d)), cqgr.bD(cqrp.d(16.0d)), iuh.b(cqgr.aI(caoy.a)), cqgr.gq(cqgr.bp(-2), cqgr.cd(-2), cqgr.bX(caoz.a), cqgr.bD(cqrp.d(12.0d)), cqgr.bG(cqrp.d(16.0d)), cqgr.J(true), cqgr.cW(capb.a), cqgr.fh(cqrp.f(14.0d)), cqgr.eN(5), cqgr.eB(true), irn.v(), cqgr.eM(capc.a)), cqqx.D(cqqx.G(), cqgr.cd(-1), cqgr.bp(-2), cqgr.bG(cqrp.d(16.0d)), iue.d(capd.a, cqkz.a(dtyd.bW)), cqqx.M(cqtt.i(cqtt.c(), cqrp.d(2.0d), cqrp.d(2.0d)), 0), cqgr.ck(C()))), cqgr.gd(cqgr.aI(cape.a), cqgr.dr(1), cqgr.bV(cqrp.d(6.0d)), iuh.b(new cqmp[0]), hyb.d(cqgr.eM(capf.a), cqgr.dQ(cqrp.d(dcyn.a)), cqgr.dF(cqrp.d(dcyn.a)), cqgr.cW(cqgr.q(capg.a)), cqgr.l(true), cqgr.V(caph.a), iue.d(capi.a, cqkz.a(dtyd.bA)))))));
    }
}
