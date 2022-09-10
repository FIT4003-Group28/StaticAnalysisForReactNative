package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: agoc  reason: default package */
/* loaded from: classes2.dex */
public final class agoc extends cqiw<agwu> {
    public static final /* synthetic */ int b = 0;
    public final agob a;

    public agoc(agob agobVar) {
        super(agobVar);
        this.a = agobVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeVarargs
    public static cqmj<agwu> e(cqmp<agwu>... cqmpVarArr) {
        cqmj<agwu> gd = cqgr.gd(cqic.c(agni.a, new cqmp[0]), cqgr.aJ(16), iue.f(cqic.c(cqjv.x(agnj.a), new cqmp[0]), ibq.p(), cqgr.eU(ibm.o()), cqgr.eN(5), cqgr.eM(agnk.a), cqgr.aW(2)), jfb.a(cqic.c(cqjv.x(agnl.a), new cqmp[0]), cqgr.bR(cqrp.d(4.0d)), cqgr.bG(cqrp.d(4.0d)), cqgr.ce(cqrp.d(68.0d)), jfb.f(jfo.d), jfb.c(agnm.a)), iue.f(cqic.c(cqjv.x(agnn.a), new cqmp[0]), ibq.p(), cqgr.eU(ibm.o()), cqgr.eN(5), cqgr.eM(agno.a), cqgr.V(agnq.a)));
        gd.f(cqmpVarArr);
        return gd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<agwu> a() {
        cqmp[] cqmpVarArr = new cqmp[9];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = cqgr.bp(-2);
        cqmpVarArr[2] = cqgr.dQ(cqrp.d(10.0d));
        cqmpVarArr[3] = cqgr.aJ(16);
        cqmpVarArr[4] = cqgr.L(false);
        cqmpVarArr[5] = cqgr.P(false);
        cqmpVarArr[6] = this.a.e() ? iue.f(cqgr.cL(cqrp.d(40.0d)), ibq.m(), cqgr.fh(cqrp.f(20.0d)), cqgr.eU(ibm.t()), cqgr.eN(4), cqgr.eM(agne.a)) : cqmp.e;
        cqmp[] cqmpVarArr2 = {ibq.f(), cqgr.eU(ibm.t()), cqgr.eN(5), cqgr.eM(agnt.a)};
        cqmp[] cqmpVarArr3 = {cqgr.bV(cqrp.d(2.0d))};
        cqmp[] cqmpVarArr4 = {cqic.c(new cqlc(this) { // from class: agnu
            private final agoc a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                agoc agocVar = this.a;
                agwu agwuVar = (agwu) cqkpVar;
                boolean z = false;
                if (cqjv.v(agwuVar.l()).booleanValue() || (agocVar.a.g() && agwuVar.q().booleanValue())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, new cqmp[0]), cqgr.bV(cqrp.d(1.0d)), ibq.p(), cqgr.eU(ibm.o()), cqgr.eN(5), cqgr.cB(Integer.valueOf(this.a.a())), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(agnv.a)};
        cqmj gd = cqgr.gd(cqic.f(agnr.a, new cqmp[0]), cqgr.bV(cqrp.d(1.0d)), cqgr.dr(0), cqgr.aJ(16), itj.i(dtxu.bO), cqgr.gc(cqgr.ch(cqrp.d(18.0d)), cqgr.bG(cqrp.d(5.0d)), cqgr.eE(cqrt.g(2131232199, ibm.x()))), iue.f(ibq.p(), cqgr.eU(ibm.o()), cqgr.eN(5), cqgr.eL(Integer.valueOf((int) R.string.LOCALSTREAM_PLACE_IN_LOCAL_FOLLOW_LIST))));
        gd.f(new cqmp[0]);
        cqmpVarArr[7] = cqgr.gd(cqgr.cd(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.bR(cqrp.d(10.0d)), cqgr.bV(cqrp.d(16.0d)), cqgr.bF(new cqlc(this) { // from class: agnp
            private final agoc a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                agwu agwuVar = (agwu) cqkpVar;
                if (!this.a.a.d() || cqjv.v(agwuVar.k()).booleanValue()) {
                    return cqrp.d(16.0d);
                }
                return cqrp.d(10.0d);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.bI(new cqlc(this) { // from class: agns
            private final agoc a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                agwu agwuVar = (agwu) cqkpVar;
                if (!this.a.a.f() || !agwuVar.n().f().booleanValue()) {
                    return cqrp.d(20.0d);
                }
                return cqrp.d(dcyn.a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.dr(1), iue.f(cqmpVarArr2), e(cqmpVarArr3), cqgr.gq(cqmpVarArr4), gd);
        cqmpVarArr[8] = this.a.f() ? cqgr.fP(new agqs(70, false), agnw.a, cqgr.aI(agnx.a), cqgr.dF(cqrp.d(10.0d))) : cqmp.e;
        cqmj<agwu> gd2 = cqgr.gd(cqmpVarArr);
        if (this.a.b() || this.a.d()) {
            cqmp[] cqmpVarArr5 = new cqmp[6];
            cqmpVarArr5[0] = cqgr.cd(-1);
            cqmpVarArr5[1] = cqgr.bp(-2);
            cqmpVarArr5[2] = cqgr.dr(1);
            cqmpVarArr5[3] = this.a.b() ? WebImageView.a(cqgr.bq(cqrp.d(this.a.c())), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(agny.a)) : cqmp.e;
            cqmpVarArr5[4] = gd2;
            cqmpVarArr5[5] = this.a.d() ? cqgr.gq(cqic.c(cqjv.x(agnz.a), new cqmp[0]), cqgr.bD(cqrp.d(16.0d)), cqgr.bR(cqrp.d(20.0d)), cqgr.bG(cqrp.d(20.0d)), ibq.p(), cqgr.eU(ibm.o()), cqgr.eN(5), cqgr.cB(3), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(agnf.a)) : cqmp.e;
            gd2 = cqgr.gd(cqmpVarArr5);
        }
        if (this.a.g()) {
            cqmp<agwu>[] cqmpVarArr6 = new cqmp[1];
            agob agobVar = this.a;
            cqtv d = cqsg.d(cqrp.d(54.0d), cqrp.f(18.0d), cqrp.f(14.0d), cqsg.f(cqrp.f(14.0d), Float.valueOf(agobVar.a())));
            if (agobVar.b()) {
                d = cqsg.d(d, cqrp.d(agobVar.c()));
            }
            cqmpVarArr6[0] = cqgr.bq(d);
            gd2.f(cqmpVarArr6);
        }
        gd2.f(cqgr.x(irn.G()), cqgr.cW(cqgr.q(agng.a)), iue.c(agnh.a));
        return gd2;
    }
}
