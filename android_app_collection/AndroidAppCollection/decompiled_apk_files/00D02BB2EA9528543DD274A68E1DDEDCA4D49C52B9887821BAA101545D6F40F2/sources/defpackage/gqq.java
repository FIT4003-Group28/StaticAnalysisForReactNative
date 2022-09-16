package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.fivestar.FiveStarView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: gqq  reason: default package */
/* loaded from: classes6.dex */
public class gqq extends cqiw<jba> {
    public static final cjzk a;
    private final cqrp b;
    private final cqrp c;
    private final cqrp d;

    static {
        cjzi cjziVar = new cjzi();
        cjziVar.b = 160;
        a = cjziVar.a();
    }

    public gqq() {
        this(cqrp.d(212.0d), cqrp.d(120.0d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<jba> a() {
        cqmp cqmpVar;
        cqmj a2 = WebImageView.a(cqgr.cd(-1), cqgr.bq(this.d), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(gqh.a));
        cqmj gq = cqgr.gq(cqgr.eN(5), cqgr.cd(-1), cqgr.bp(-2), cqgr.bv(3), cqgr.dB(cqrp.d(3.0d)), irn.m(), cqgr.cp(Float.valueOf(0.95f)), cqgr.eU(irg.J()), cqgr.aR(Integer.valueOf((int) R.id.title)), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(gqi.a), cqgr.cB(2));
        cqmj gq2 = cqgr.gq(cqgr.eN(5), cqgr.cd(-1), cqgr.bp(-2), cqgr.eS(Integer.valueOf((int) R.style.XMicroTertiaryText)), irn.n(), cqgr.eU(irg.H()), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(gqj.a), cqgr.cB(2));
        Float valueOf = Float.valueOf(1.0f);
        cqmj gd = cqgr.gd(cqgr.bv(3), cqgr.cd(-1), cqgr.bp(-2), cqgr.ca(valueOf), jgb.a(cqgr.cd(-1), cqgr.bp(-2), cqgr.ca(valueOf), cqgr.dU(cqrp.d(11.0d)), cqgr.dQ(cqrp.d(11.0d)), cqgr.dF(cqrp.d(11.0d)), cqgr.dB(cqrp.d(5.0d)), jgb.b(3), jgb.d(2), gq, gq2), cqgr.gc(cqgr.aI(gqk.a), cqgr.ce(cqrp.d(22.0d)), cqgr.bq(cqrp.d(22.0d)), cqgr.bw(8388661), cqgr.bA(cqrp.d(8.0d)), cqgr.T(cqrt.l(R.string.CHECKIN_CHECKMARK_DESCRIPTION)), cqgr.eD(2131232564)));
        if (e()) {
            cqmpVar = iue.g(cqgr.cd(-1), cqgr.bp(-2), cqgr.dQ(cqrp.d(11.0d)), cqgr.dF(cqrp.d(10.0d)), cqgr.dB(cqrp.d(7.0d)), cqgr.dr(0), cqgr.aJ(16), FiveStarView.e(gql.a, gqm.a, cqgr.aF(gqn.a)), cqgr.gq(cqgr.cd(0), cqgr.ca(valueOf), cqgr.aJ(8388613), irn.n(), cqgr.eU(irg.H()), cqgr.eM(gqe.a)));
        } else {
            cqmpVar = cqmp.e;
        }
        return iue.g(cqgr.bq(this.b), cqgr.ce(this.c), cqgr.bv(3), cqgr.x(irn.F()), d(), cqgr.cW(acly.a(gqd.a)), cqgr.K(gqf.a), cqgr.aR(Integer.valueOf((int) R.id.cardui_place_item)), a2, gd, cqmpVar);
    }

    protected cqmp<jba> d() {
        return iue.c(gqg.a);
    }

    protected boolean e() {
        return true;
    }

    public gqq(cqrp cqrpVar, cqrp cqrpVar2) {
        this(cqrpVar, cqrp.d(a.c), cqrpVar2);
    }

    public gqq(cqrp cqrpVar, cqrp cqrpVar2, cqrp cqrpVar3) {
        super(cqrpVar, cqrpVar3);
        this.b = cqrpVar;
        this.c = cqrpVar2;
        this.d = cqrpVar3;
    }
}
