package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cayj  reason: default package */
/* loaded from: classes4.dex */
public final class cayj extends cqiw<cayf> {
    private final boolean g;
    private final boolean h;
    private static final cqrp b = cqrp.d(18.0d);
    private static final cqrp c = cqrp.d(40.0d);
    static final eaow a = eaow.e(300);
    private static final cqjg d = cqjg.a();
    private static final cqjg e = cqjg.a();
    private static final cqjg f = cqjg.a();

    public cayj(boolean z, boolean z2) {
        super(Boolean.valueOf(z), Boolean.valueOf(z2));
        this.g = z;
        this.h = z2;
    }

    public static <T extends cqkp> cqml<T> e(cqlc<T, cayf> cqlcVar) {
        return cqgr.fP(new cayj(false, false), cqlcVar, new cqmp[0]);
    }

    public static <T extends cqkp> cqml<T> f(cqlc<T, cayf> cqlcVar) {
        return cqgr.fP(new cayj(true, false), cqlcVar, new cqmp[0]);
    }

    public static String i(cayf cayfVar, Context context) {
        Resources resources = context.getResources();
        String i = cayfVar.i();
        if (i.length() == 0) {
            return resources.getString(R.string.ugc_disclosure_posting_publicly);
        }
        return resources.getString(R.string.ugc_disclosure_posting_publicly_description, i);
    }

    public static jic j(cayf cayfVar) {
        return new jic(cayfVar.h(), ckqc.FIFE_MERGE, 2131232998);
    }

    @Override // defpackage.cqiw
    public final cqmj<cayf> a() {
        cqmp[] cqmpVarArr = new cqmp[11];
        cqmpVarArr[0] = cqgr.cH(ibn.a());
        cqmpVarArr[1] = cqgr.cL(ibn.a());
        cqmpVarArr[2] = cqgr.aJ(Integer.valueOf(true != this.h ? 16 : 48));
        cqmpVarArr[3] = cqgr.cW(cqgr.q(caxp.a));
        cqmpVarArr[4] = iue.b(cjtd.a(dtxy.oo));
        cqmpVarArr[5] = cqgr.U(caxu.a);
        cqmpVarArr[6] = cpp.g(cpp.d(cqrt.l(R.string.ugc_disclosure_posting_publicly_action_description)));
        cqjg cqjgVar = d;
        cqrp cqrpVar = c;
        cqmp[] cqmpVarArr2 = {cqgr.aI(caxw.a), cqgr.ch(cqrpVar), WebImageView.k(new jic("", ckqc.FULLY_QUALIFIED, 2131231770))};
        cqlc cqlcVar = caxy.a;
        cqrp cqrpVar2 = b;
        cqmpVarArr[7] = cqgr.fY(cqgr.aT(cqjgVar), cqgr.aF(new cqlc(this) { // from class: caxv
            private final cayj a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return Boolean.valueOf(this.a.h((cayf) cqkpVar));
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.bG(cqrp.d(16.0d)), WebImageView.a(cqmpVarArr2), cqgr.fY(cqgr.aF(caxx.a), cqjv.l(cqlcVar, cqgr.ce(cqsg.d(cqrpVar, cqsg.f(cqrpVar2, Float.valueOf(0.5f)))), cqgr.cd(-2)), jfx.a(cqgr.aI(caxz.a), cqgr.ch(cqrpVar), WebImageView.a(cqgr.ch(cqrpVar), WebImageView.m(caya.a))), WebImageView.a(cqgr.aF(cayb.a), cqgr.ch(cqrpVar), WebImageView.m(cayc.a)), cqgr.gc(cqgr.aI(caxq.a), cqgr.ch(cqrpVar2), cqgr.bw(8388693), cqgr.eE(cqrt.g(2131232966, ibm.x())))));
        cqjg cqjgVar2 = e;
        cqmpVarArr[8] = cqgr.gq(cqgr.aT(cqjgVar2), cqgr.bY(cqjd.A(cqjgVar)), cqgr.aF(new cqlc(this) { // from class: caxr
            private final cayj a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return Boolean.valueOf(this.a.h((cayf) cqkpVar));
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), ibq.l(), cqgr.eM(caxs.a));
        cqjg cqjgVar3 = f;
        cqmpVarArr[9] = cqgr.gq(cqgr.aT(cqjgVar3), cqgr.bY(cqjd.A(cqjgVar), cqjd.u(cqjgVar2)), ibq.q(), cqgr.eL(Integer.valueOf((int) R.string.ugc_disclosure_posting_publicly)));
        cqmpVarArr[10] = cqgr.gc(cqgr.aR(Integer.valueOf((int) R.id.ugc_disclosure_info_link)), cqgr.bR(cqrp.f(2.0d)), cqgr.bY(cqjd.A(cqjgVar3), cqjd.k(cqjgVar3), cqjd.m(cqjgVar3)), cqgr.ch(cqrp.f(14.0d)), cqgr.fF(caxt.a), cqgr.eE(cqrt.g(2131232726, ibm.n())));
        return cqgr.gj(cqmpVarArr);
    }

    public final boolean h(cayf cayfVar) {
        return this.g || cayfVar.i().length() == 0;
    }
}
