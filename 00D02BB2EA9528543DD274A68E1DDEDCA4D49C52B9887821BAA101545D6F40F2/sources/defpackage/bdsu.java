package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdsu  reason: default package */
/* loaded from: classes3.dex */
public final class bdsu extends cqiw<bdtp> {
    private static final cqjg b = cqjg.a();
    private static final cqjg c = cqjg.a();
    private static final cqjg d = cqjg.a();
    public static final cqsv a = cqsv.f(190.0d, 130.0d, 247.0d, 195.0d);

    public static CharSequence e(bdtp bdtpVar, Context context) {
        if (bdtpVar.q().booleanValue()) {
            return context.getString(R.string.UPLOAD_PHOTO_DISCLAIMER_WITH_UPLOADER_NAME, bdtpVar.i().a());
        }
        return context.getString(R.string.POSTING_PUBLICLY);
    }

    public static cjtd f(bdtp bdtpVar) {
        if (bdtpVar.q().booleanValue()) {
            cjta c2 = cjtd.c(bdtpVar.n());
            c2.d = dtxj.V;
            return c2.a();
        }
        return cjtd.b;
    }

    public static jic g(bdtp bdtpVar) {
        return new jic(bdtpVar.p(), ckqc.FIFE_MERGE, 2131232998);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bdtp> a() {
        bdtj bdtjVar = new bdtj();
        cqlc cqlcVar = bdse.a;
        cqmp[] cqmpVarArr = {cqgr.bp(-2)};
        cqjg cqjgVar = b;
        cqmp[] cqmpVarArr2 = {cqgr.aT(cqjgVar), cqgr.bG(cqrp.d(16.0d))};
        cqmj fY = cqgr.fY(cqgr.cg(new cqlc() { // from class: bdsi
            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqsv cqsvVar = bdsu.a;
                return cqrp.d(((bdtp) cqkpVar).q().booleanValue() ? 45.0d : 36.0d);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), jfx.a(cqgr.bp(-2), cqgr.cd(-2), WebImageView.a(cqgr.bw(8388659), cqgr.ch(cqrp.d(36.0d)), WebImageView.m(bdsj.a))), cqgr.gc(cqgr.aI(bdsk.a), cqgr.bq(cqrp.d(18.0d)), cqgr.ce(cqrp.d(18.0d)), cqgr.eE(cqrt.g(2131232966, ibm.x())), cqgr.bw(8388693)));
        fY.f(cqmpVarArr2);
        cqjg cqjgVar2 = c;
        cqmp[] cqmpVarArr3 = {cqgr.aF(bdsl.a), cqgr.dQ(ibn.o()), iue.c(bdsm.a), fY, cqgr.gq(cqgr.aT(cqjgVar2), cqgr.bY(cqjd.A(cqjgVar)), ibq.l(), cqgr.eM(bdsn.a)), cqgr.gq(cqgr.aT(d), cqgr.bY(cqjd.A(cqjgVar), cqjd.u(cqjgVar2)), ibq.q(), cqgr.eK(bdso.a))};
        cqml e = cayj.e(bdsp.a);
        ((cqmm) e).a(cqgr.aF(bdsq.a), cqgr.dQ(ibn.o()));
        return cqgr.fY(cqgr.bp(-1), cqgr.cd(-1), cqgr.z(ibm.b()), cqgr.gd(cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(1), cqgr.fP(bdtjVar, cqlcVar, cqmpVarArr), cqgr.gj(cqmpVarArr3), cqgr.fY(e, cqgr.gq(cqgr.aI(bdsr.a), cqgr.bp(-2), cqgr.cd(-2), cqgr.bw(8388693), ibq.q(), cqgr.dF(ibn.o()), cqgr.dB(cqrp.d(8.0d)), cqgr.eM(bdss.a))), cqgr.fP(new bdkr(), bdst.a, cqgr.bq(a)), cqgr.fY(cqgr.bp(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.fP(new bdnx(bdro.BELOW, 500L, 500), bdsf.a, cqgr.bp(-1), cqgr.cd(-1)), cqgr.fP(new bdui(bdro.BELOW), bdsg.a, cqgr.bp(-2), cqgr.cd(-1), cqgr.bw(80)))), cqgr.fP(new bdrb(), bdsh.a, cqgr.bp(-1), cqgr.cd(-1)));
    }
}
