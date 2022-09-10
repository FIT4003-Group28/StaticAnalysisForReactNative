package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cihe  reason: default package */
/* loaded from: classes4.dex */
public final class cihe extends cqiw<cihf> {
    private final boolean d;
    private static final cqjg c = cqjg.a();
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();

    public cihe() {
        this(false);
    }

    public cihe(boolean z) {
        super(Boolean.valueOf(z));
        this.d = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cihf> a() {
        cqmp cqmpVar;
        cqmp[] cqmpVarArr = new cqmp[2];
        cqmp[] cqmpVarArr2 = new cqmp[3];
        cqmpVarArr2[0] = cqgr.dr(1);
        cqmp[] cqmpVarArr3 = new cqmp[0];
        cqmp[] cqmpVarArr4 = new cqmp[12];
        cqmpVarArr4[0] = cqgr.aT(a);
        cqmpVarArr4[1] = cqgr.cd(-1);
        cqmpVarArr4[2] = cqgr.bp(-2);
        cqmpVarArr4[3] = cqgr.dr(1);
        cqmp[] cqmpVarArr5 = {ibn.s()};
        if (this.d) {
            cqmpVar = cibk.a(cqgr.eL(Integer.valueOf((int) R.string.PUBLISH_LIST_CARD_ACTION_HEADER)), cqgr.bV(cqrp.d(20.0d)), cqmn.a(cqmpVarArr5));
        } else {
            cqmpVar = cqmp.e;
        }
        cqmpVarArr4[4] = cqmpVar;
        cqmp[] cqmpVarArr6 = {ibn.s(), cqgr.aF(cqjv.x(cigv.a))};
        cqmj fY = cqgr.fY(jgn.a(cqgr.cd(-1), cqgr.bp(-2), jgn.b(cqrp.d(16.0d)), cqgr.bV(cqrp.d(20.0d)), WebImageView.a(cqgr.cd(-1), cqgr.bq(cqrp.d(140.0d)), cqgr.z(ibm.P()), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(cigy.a))));
        fY.f(cqmpVarArr6);
        cqmpVarArr4[5] = fY;
        cqjg cqjgVar = c;
        cqjd[] cqjdVarArr = {cqjd.i(), cqjd.e(), cqjd.y(cqjgVar)};
        cqmp[] cqmpVarArr7 = {cqgr.ch(cqrp.d(36.0d))};
        cqmj b2 = ict.b(ciha.a, new cqmp[0]);
        b2.f(cqmpVarArr7);
        cqmj gd = cqgr.gd(cqgr.dr(1), cqgr.bR(cqrp.d(16.0d)), cqgr.cd(-1), cqgr.gq(cqgr.cd(-2), cqgr.eM(cihb.a), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), ibq.e()), cqgr.gq(cqgr.cd(-2), cqgr.eM(cihc.a), cqgr.eN(5), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), ibq.q(), cqgr.eU(ibm.n())));
        gd.f(new cqmp[0]);
        cqmp[] cqmpVarArr8 = {cqgr.bY(cqjdVarArr), cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.bV(cqrp.d(20.0d)), b2, gd};
        cqmp[] cqmpVarArr9 = {cqgr.aT(cqjgVar), iue.c(cigz.a), cqgr.bY(cqjd.f(), cqjd.i())};
        cqmj d = jhc.d(cigu.a, cqgr.bR(cqrp.d(6.0d)), cqgr.bV(cqrp.d(10.0d)));
        d.f(cqmpVarArr9);
        cqmj gj = cqgr.gj(cqgr.dr(0), cqgr.cd(-1), cqgr.dQ(cqrp.d(20.0d)), cqgr.aJ(48), cqgr.gd(cqmpVarArr8), d);
        gj.f(new cqmp[0]);
        cqmpVarArr4[6] = gj;
        cqmp[] cqmpVarArr10 = {ibn.s()};
        cqmj gq = cqgr.gq(cqgr.aF(cqjv.x(cigr.a)), cqgr.cd(-1), cqgr.eM(cigs.a), cqgr.eN(5), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), ibq.p(), cqgr.eU(ibm.t()), cqgr.bV(cqrp.d(12.0d)));
        gq.f(cqmpVarArr10);
        cqmpVarArr4[7] = gq;
        cqmpVarArr4[8] = cqmp.e;
        cqmpVarArr4[9] = cqgr.J(true);
        cqmpVarArr4[10] = cqgr.cW(cqgr.q(cigw.a));
        cqmpVarArr4[11] = iue.c(cigx.a);
        cqmj gd2 = cqgr.gd(cqmpVarArr4);
        gd2.f(cqmpVarArr3);
        cqmpVarArr2[1] = gd2;
        cqmj gd3 = cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.L(false), cqgr.P(false), cqgr.aJ(1), cqgr.aW(2), cqgr.an(cigt.a));
        gd3.f(new cqmp[0]);
        cqmpVarArr2[2] = gd3;
        cqmpVarArr[0] = cqgr.gd(cqmpVarArr2);
        cqmpVarArr[1] = iue.c(cigq.a);
        cqmj fY2 = cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.x(ibm.b()));
        fY2.f(cqmpVarArr);
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), fY2);
    }
}
