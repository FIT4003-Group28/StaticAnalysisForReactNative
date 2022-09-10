package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vqd  reason: default package */
/* loaded from: classes7.dex */
public final class vqd extends cqiw<vqw> {
    private static final cqrp a = cqrp.d(88.0d);

    public static CharSequence e(vqw vqwVar, Context context) {
        bvsx bvsxVar = new bvsx(context.getResources());
        bvsu c = bvsxVar.c(vqwVar.e().intValue());
        c.g("\n");
        bvsu c2 = bvsxVar.c(R.string.LEARN_MORE);
        c2.l(ibm.w().b(context));
        c.g(c2.c());
        return c.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<vqw> a() {
        cqvf l = cqrt.l(R.string.SAVE);
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.dB(ibn.f()), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), iue.c(vpx.a), cqgr.z(ibm.b()), cqgr.gq(cqgr.dU(ibn.f()), cqgr.bD(cqrp.d(16.0d)), ibq.m(), ibq.v(), vlb.a(), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(vpy.a)), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), cqgr.gc(cqgr.ce(a), cqgr.bp(-1), cqgr.eE(iup.e(R.raw.license_plate_brazil)), cqgr.ei(ImageView.ScaleType.FIT_CENTER)), cqgr.gq(cqgr.bp(-1), cqgr.cH(ibn.a()), cqgr.dQ(cqrp.d(10.0d)), cqgr.aJ(16), ibq.p(), ibq.x(), vlb.a(), cqgr.J(true), cqgr.cW(cqgr.q(vpz.a)), iue.c(vqa.a), cqgr.eK(vqb.a))), acnm.a(cqgr.fP(new vqn(), vqc.a, cqgr.dU(ibn.f()), cqgr.dB(ibn.f())), hyw.d(cqkz.a(cqrt.g(2131232559, ibm.b())), cqkz.a(l), cqgr.q(vpv.a), cqkz.a(l), vpw.a, cqgr.bw(16))));
    }
}
