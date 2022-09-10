package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
import java.lang.reflect.Type;
/* compiled from: PG */
/* renamed from: bffj  reason: default package */
/* loaded from: classes3.dex */
public final class bffj extends cqiw<bfgt> {
    public static final /* synthetic */ int a = 0;
    private static final cqjg b = cqjg.a();
    private static final cqjb<bfgt, Integer> d = bffg.a;
    private static final cqjb<bfgt, CharSequence> e = bfex.a;
    private final boolean c;

    public bffj() {
        this(false);
    }

    public static boolean e(bfgt bfgtVar) {
        jaz au = bfgtVar.au();
        return au != null && au.i().booleanValue();
    }

    private final cqmj<bfgt> f(boolean z) {
        cqmp cqmpVar;
        cqmp[] cqmpVarArr = new cqmp[8];
        cqmpVarArr[0] = cqgr.eN(5);
        cqmpVarArr[1] = cqjv.k(B().aq(), ibq.f(), ibq.e());
        cqmpVarArr[2] = ibq.v();
        cqmpVarArr[3] = z ? cqmp.e : ibq.z();
        cqmpVarArr[4] = cqjv.k(B().aq(), cqgr.aZ(false), cqgr.aZ(true));
        cqmpVarArr[5] = cqgr.cn(bfey.a);
        cqmpVarArr[6] = cqgr.eI(B().a());
        if (z) {
            cqmpVar = cqgr.R(B().at());
        } else {
            cqmpVar = cqmp.e;
        }
        cqmpVarArr[7] = cqmpVar;
        return cqgr.gq(cqmpVarArr);
    }

    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v75 */
    private final cqmj<bfgt> h(boolean z) {
        int i;
        cqmp cqmpVar;
        char c;
        cqmp gc;
        char c2;
        cqmp cqmpVar2;
        int i2;
        cqmj cqmjVar;
        cqnf cqnfVar;
        int i3;
        cqmj gd;
        char c3;
        char c4;
        char c5;
        cqnj d2;
        Integer num;
        Integer num2;
        char c6;
        cqnf eH;
        char c7;
        int i4;
        cqmp cqmpVar3;
        bffj bffjVar;
        int i5;
        cqmp cqmpVar4;
        cqmp fO;
        char c8;
        cqmp aG;
        ?? r7;
        cqmp aG2;
        int i6;
        cqmp aG3;
        cqnf k = cqjv.k(B().aq(), cqgr.dU(cqrp.d(dcyn.a)), cqgr.dU(bfgf.a));
        cqmp[] cqmpVarArr = new cqmp[9];
        cqmpVarArr[0] = cqgr.dQ(ibn.g());
        cqmpVarArr[1] = cqgr.dF(ibn.g());
        cqmpVarArr[2] = cqgr.cd(-1);
        cqmpVarArr[3] = cqgr.bp(-2);
        cqmpVarArr[4] = z ? cqgr.bp(-2) : cqgr.bq(cqrp.d(88.0d));
        cqmp[] cqmpVarArr2 = new cqmp[19];
        cqmpVarArr2[0] = cqgr.bp(-2);
        cqmpVarArr2[1] = cqgr.cd(0);
        Float valueOf = Float.valueOf(1.0f);
        cqmpVarArr2[2] = cqgr.ca(valueOf);
        cqmpVarArr2[3] = cqgr.dr(1);
        cqmpVarArr2[4] = k;
        cqmpVarArr2[5] = z ? cqgr.dB(cqsg.g(bfgf.a, irh.h())) : cqgr.dB(cqrp.d(dcyn.a));
        cqmp[] cqmpVarArr3 = new cqmp[2];
        if (z) {
            cqmp[] cqmpVarArr4 = new cqmp[4];
            cqmpVarArr4[0] = cqgr.aT(b);
            cqmpVarArr4[1] = cqgr.bY(cqjd.f());
            Boolean r = cqjv.r(B().al(), cqjv.u(B().ak()));
            cqmp[] cqmpVarArr5 = new cqmp[3];
            cqmpVarArr5[0] = this.c ? cqic.d(r, new cqmp[0]) : cqgr.aG(r);
            cqmpVarArr5[1] = cqgr.dQ(ibn.f());
            cqmpVarArr5[2] = WebImageView.a(cqgr.ce(cqrp.d(61.0d)), cqgr.bq(cqrp.d(48.0d)), WebImageView.k(B().ae()));
            cqmpVarArr4[2] = cqgr.fY(cqmpVarArr5);
            Boolean r2 = cqjv.r(B().ak(), cqjv.u(B().al()));
            cqmp[] cqmpVarArr6 = new cqmp[10];
            cqmpVarArr6[0] = cqgr.cH(ibn.a());
            cqmpVarArr6[1] = cqgr.cL(ibn.a());
            cqmpVarArr6[2] = this.c ? cqic.d(r2, new cqmp[0]) : cqgr.aG(r2);
            cqmpVarArr6[3] = cqgr.R(B().ag());
            cqmpVarArr6[4] = cqgr.cU(B().ai());
            cqmpVarArr6[5] = cqgr.J(B().ah());
            cqmpVarArr6[6] = cqgr.dQ(ibn.f());
            cqmpVarArr6[7] = iue.b(B().aj());
            cqmpVarArr6[8] = WebImageView.d(B().af(), new cqmp[0]);
            i = 9;
            cqmpVarArr6[9] = cqgr.fG(new bffh());
            cqmpVarArr4[3] = cqgr.fY(cqmpVarArr6);
            cqmpVar = cqgr.fY(cqmpVarArr4);
        } else {
            i = 9;
            cqmpVar = cqmp.e;
        }
        cqmpVarArr3[0] = cqmpVar;
        cqmp[] cqmpVarArr7 = new cqmp[i];
        cqmpVarArr7[0] = cqgr.bp(-2);
        cqmpVarArr7[1] = cqgr.cd(-1);
        cqmpVarArr7[2] = cqgr.dr(1);
        Boolean valueOf2 = Boolean.valueOf(z);
        cqmpVarArr7[3] = cqjv.k(cqjv.r(valueOf2, cqjv.t(B().ak(), B().al())), cqgr.bY(cqjd.y(b)), cqgr.bY(cqjd.e()));
        cqmp[] cqmpVarArr8 = new cqmp[0];
        cqmp[] cqmpVarArr9 = new cqmp[9];
        cqmpVarArr9[0] = cqgr.bp(-2);
        cqmpVarArr9[1] = cqgr.cd(-2);
        cqmpVarArr9[2] = cqgr.dr(0);
        cqmpVarArr9[3] = cqjv.k(B().aq(), cqgr.bD(cqrp.d(4.0d)), cqgr.bD(cqrp.d(dcyn.a)));
        cqmpVarArr9[4] = cqgr.aJ(16);
        if (z) {
            gc = cqmp.e;
            c = 5;
        } else {
            c = 5;
            gc = cqgr.gc(cqgr.aG(B().J()), cqgr.bw(16), cqgr.ce(cqrp.d(20.0d)), cqgr.bq(cqrp.d(20.0d)), cqgr.bG(irh.g()), cqgr.eE(itd.d(ibm.m())));
        }
        cqmpVarArr9[c] = gc;
        cqmj<bfgt> f = f(z);
        f.f(cqgr.cd(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.aG(cqjv.r(B().v(), cqjv.v(B().R()))));
        cqmpVarArr9[6] = f;
        cqmpVarArr9[7] = cye.a(cqic.a(cqjv.v(B().R()), new cqmp[0]), cqgr.cd(0), cqgr.ca(Float.valueOf(1.0f)), f(z), cqgr.fQ(new cyc(), B().R(), cqgr.bV(cqrp.d(-13.0d))));
        if (z) {
            cqmp[] cqmpVarArr10 = new cqmp[5];
            cqmpVarArr10[0] = cqgr.ca(Float.valueOf(0.0f));
            cqmpVarArr10[1] = cqgr.bp(-1);
            cqmpVarArr10[2] = cqgr.L(false);
            cqmpVarArr10[3] = this.c ? cqic.d(B().s(), new cqmp[0]) : cqgr.aG(B().s());
            c2 = 4;
            cqmpVarArr10[4] = cqgr.fQ(new bmgr(), B().q(), new cqmp[0]);
            cqmpVar2 = cqgr.fY(cqmpVarArr10);
        } else {
            c2 = 4;
            cqmpVar2 = cqmp.e;
        }
        cqmpVarArr9[8] = cqmpVar2;
        cqmj gd2 = cqgr.gd(cqmpVarArr9);
        gd2.f(cqmpVarArr8);
        cqmpVarArr7[c2] = gd2;
        if (z) {
            cqmp[] cqmpVarArr11 = new cqmp[6];
            if (this.c) {
                r7 = 0;
                aG2 = cqic.d(B().p(), new cqmp[0]);
            } else {
                r7 = 0;
                aG2 = cqgr.aG(B().p());
            }
            char c9 = r7 == true ? 1 : 0;
            char c10 = r7 == true ? 1 : 0;
            cqmpVarArr11[c9] = aG2;
            cqmpVarArr11[1] = cqgr.dr(0);
            cqmpVarArr11[2] = cqgr.cd(-2);
            cqmpVarArr11[3] = cqgr.aJ(16);
            cqmp[] cqmpVarArr12 = new cqmp[6];
            cqmpVarArr12[r7] = cqgr.eN(5);
            cqmpVarArr12[1] = cqgr.ca(valueOf);
            cqmpVarArr12[2] = irn.j();
            cqmpVarArr12[3] = ibq.y();
            cqmpVarArr12[4] = cqgr.co(cqrp.f(3.0d), r7);
            cqmpVarArr12[5] = cqgr.eI(B().x());
            cqmpVarArr11[4] = cqgr.gq(cqmpVarArr12);
            cqmp[] cqmpVarArr13 = new cqmp[4];
            if (this.c) {
                i6 = 0;
                aG3 = cqic.d(B().r(), new cqmp[0]);
            } else {
                i6 = 0;
                aG3 = cqgr.aG(B().r());
            }
            cqmpVarArr13[i6] = aG3;
            cqmpVarArr13[1] = cqgr.bq(bmgr.a);
            cqmpVarArr13[2] = cqgr.L(false);
            cqmpVarArr13[3] = cqgr.fQ(new bmgr(), B().q(), new cqmp[i6]);
            i2 = 5;
            cqmpVarArr11[5] = cqgr.fY(cqmpVarArr13);
            cqmjVar = cqgr.gd(cqmpVarArr11);
        } else {
            i2 = 5;
            cqmjVar = cqmp.e;
        }
        cqmpVarArr7[i2] = cqmjVar;
        cqmp[] cqmpVarArr14 = new cqmp[8];
        cqmpVarArr14[0] = cqgr.aG(B().o());
        cqmpVarArr14[1] = cqgr.eN(Integer.valueOf(i2));
        cqmpVarArr14[2] = cqgr.aR(Integer.valueOf((int) R.id.title_textbox));
        cqmpVarArr14[3] = irn.r();
        cqmpVarArr14[4] = ibq.x();
        cqmpVarArr14[5] = z ? cqmp.e : ibq.z();
        cqmpVarArr14[6] = cqgr.co(cqrp.f(3.0d), false);
        cqmpVarArr14[7] = cqgr.eI(B().a());
        cqmpVarArr7[6] = cqgr.gq(cqmpVarArr14);
        cqmp[] cqmpVarArr15 = new cqmp[6];
        cqmpVarArr15[0] = cqgr.aD(B().z());
        cqmpVarArr15[1] = cqgr.bp(-2);
        cqmpVarArr15[2] = cqgr.dr(1);
        cqmpVarArr15[3] = cqgr.gm(cqgr.aD(cqjv.r(B().Z(), cqjv.u(B().h()))), cqgr.cd(-1), cqjv.k(B().h(), cqgr.bq(cqrp.d(4.0d)), cqgr.bq(irh.h())));
        cqmpVarArr15[4] = z ? cqmp.e : cqgr.gg(cqgr.aD(cqjv.t(cqjv.u(B().L()), B().d())), irn.A());
        cqrp d3 = cqrp.d(8.0d);
        cqrp d4 = cqrp.d(32.0d);
        cqmp<cqkp> k2 = cqjv.k(B().aq(), cqgr.dU(cqrp.d(dcyn.a)), cqgr.dU(irh.h()));
        cqnf k3 = cqjv.k(B().aq(), cqgr.dB(cqrp.d(dcyn.a)), cqgr.dB(irh.h()));
        cqmp[] cqmpVarArr16 = new cqmp[6];
        cqmpVarArr16[0] = cqgr.aG(B().Z());
        cqmpVarArr16[1] = cqgr.aJ(16);
        cqmpVarArr16[2] = cqgr.bp(-2);
        if (z) {
            cqnfVar = k3;
            gd = cqgr.fY(cqgr.aG(B().D()), cqgr.bG(ibn.e()), cqgr.aJ(17), cqgr.fO(new acmu(), B().C(), new cqmp[0]));
            c3 = 3;
            i3 = 0;
        } else {
            cqnfVar = k3;
            i3 = 0;
            gd = cqgr.gd(cqgr.aG(B().B()), cqgr.dU(d3), cqgr.bq(d4), cqgr.bG(irh.g()), cqgr.aJ(17), cqgr.dM(cqrp.d(2.0d)), cqgr.fO(new acmu(), B().C(), new cqmp[0]));
            c3 = 3;
        }
        cqmpVarArr16[c3] = gd;
        cqmm fO2 = cqgr.fO(bfgf.a(z), B().N(), new cqmp[i3]);
        cqmp[] cqmpVarArr17 = new cqmp[2];
        cqmpVarArr17[i3] = k2;
        cqmpVarArr17[1] = z ? cqnfVar : cqmp.e;
        fO2.a(cqmpVarArr17);
        cqmpVarArr16[4] = fO2;
        cqnf b2 = iue.b(B().Y());
        cqmp[] cqmpVarArr18 = new cqmp[6];
        if (z) {
            c4 = 1;
            c5 = 0;
            d2 = cqic.d(B().U(), b2);
        } else {
            c4 = 1;
            c5 = 0;
            d2 = cqic.d(B().T(), b2);
        }
        cqmpVarArr18[c5] = d2;
        cqmpVarArr18[c4] = cqgr.bp(-1);
        cqmpVarArr18[2] = cqgr.cd(-2);
        cqmpVarArr18[3] = cqgr.aJ(16);
        cqmp[] cqmpVarArr19 = new cqmp[6];
        cqmpVarArr19[0] = z ? cqmp.e : k2;
        cqmpVarArr19[1] = ibq.p();
        cqmpVarArr19[2] = ibq.y();
        cqmpVarArr19[3] = cqgr.aZ(false);
        cqmpVarArr19[4] = cqgr.eB(true);
        cqmpVarArr19[5] = cqgr.eI(" · ");
        cqmpVarArr18[4] = cqgr.gq(cqmpVarArr19);
        cqmp[] cqmpVarArr20 = new cqmp[6];
        cqmpVarArr20[0] = cqgr.dr(0);
        cqmpVarArr20[1] = cqgr.cH(irh.a());
        cqmpVarArr20[2] = cqgr.cd(-2);
        cqmpVarArr20[3] = cqgr.aJ(16);
        cqmp[] cqmpVarArr21 = new cqmp[5];
        cqmpVarArr21[0] = cqgr.eE(iut.a(iup.e(R.raw.personal_score_circle)));
        cqmpVarArr21[1] = z ? cqmp.e : cqgr.bw(80);
        cqmpVarArr21[2] = cqgr.bG(cqrp.f(4.0d));
        cqmpVarArr21[3] = cqgr.ce(cqrp.f(14.0d));
        cqmpVarArr21[4] = cqgr.bq(cqrp.f(14.0d));
        cqmpVarArr20[4] = cqgr.gc(cqmpVarArr21);
        cqmp[] cqmpVarArr22 = new cqmp[11];
        cqmpVarArr22[0] = cqgr.aT(bfzt.i);
        if (z) {
            k2 = cqmp.e;
        }
        cqmpVarArr22[1] = k2;
        cqmpVarArr22[2] = cqgr.cd(-2);
        cqmpVarArr22[3] = z ? ibq.l() : ibq.p();
        cqmpVarArr22[4] = z ? cqgr.eU(ibm.x()) : ibq.y();
        cqmpVarArr22[5] = cqgr.aJ(16);
        cqmpVarArr22[6] = cqgr.fG(new bffi());
        cqmpVarArr22[7] = cqgr.aZ(false);
        cqmpVarArr22[8] = cqjv.k(B().T(), cqgr.cB(2), cqgr.cB(1));
        cqmpVarArr22[9] = cqgr.ar(TextUtils.TruncateAt.END);
        if (z) {
            num2 = -2;
            num = 1;
            eH = cqjv.k(B().V(), cqgr.eL(Integer.valueOf((int) R.string.PERSONAL_SCORE_UPDATING)), cqjv.k(B().T(), cqgr.eH(Integer.valueOf((int) R.string.PERSONAL_SCORE_LONG), B().W()), cqgr.eL(Integer.valueOf((int) R.string.PERSONAL_SCORE_UNDEFINED))));
            c7 = '\n';
            c6 = 0;
        } else {
            num = 1;
            num2 = -2;
            c6 = 0;
            eH = cqgr.eH(Integer.valueOf((int) R.string.PERSONAL_SCORE_SHORT), B().W());
            c7 = '\n';
        }
        cqmpVarArr22[c7] = eH;
        cqmpVarArr20[5] = cqgr.gq(cqmpVarArr22);
        cqmj gd3 = cqgr.gd(cqmpVarArr20);
        if (z) {
            cqmp[] cqmpVarArr23 = new cqmp[1];
            cqmpVarArr23[c6] = gd3;
            gd3 = ect.a(cqmpVarArr23);
        }
        cqmp[] cqmpVarArr24 = new cqmp[2];
        cqmpVarArr24[c6] = b2;
        cqmpVarArr24[1] = z ? cqgr.cU(B().X()) : cqmp.e;
        gd3.f(cqmpVarArr24);
        cqmpVarArr18[5] = gd3;
        cqmpVarArr16[5] = cqgr.gd(cqmpVarArr18);
        cqmpVarArr15[5] = jga.a(cqmpVarArr16);
        cqmpVarArr7[7] = cqgr.gd(cqmpVarArr15);
        cqmpVarArr7[8] = cqgr.gq(cqgr.aG(B().z()), cqgr.bV(cqrp.d(4.0d)), cqgr.bD(cqrp.d(8.0d)), cqgr.aZ(false), cqgr.ai(cqrt.g(2131232558, ibm.D())), cqgr.al(cqrp.d(4.0d)), ibq.z(), cqgr.eI(B().A()), irn.t(), cqgr.eU(ibm.D()), cqgr.aJ(16));
        cqmpVarArr3[1] = cqgr.gd(cqmpVarArr7);
        cqmpVarArr2[6] = cqgr.gj(cqmpVarArr3);
        cqmpVarArr2[7] = j(z);
        cqmpVarArr2[8] = cqgr.gm(cqgr.aG(cqjv.r(valueOf2, B().h())), cqgr.bq(irh.h()), cqgr.cd(-1));
        if (z) {
            i4 = 3;
            cqmpVar3 = cqgr.gd(cqgr.aG(B().aa()), cqgr.aJ(16), cqgr.gg(cqgr.ce(cqrp.d(16.0d)), cqgr.bq(cqrp.d(16.0d)), cqgr.Z(com.google.android.filament.R.style.Widget_AppCompat_ProgressBar)), cqgr.gq(cqgr.bR(irh.g()), ibq.y(), ibq.z(), cqgr.aJ(16), cqgr.eL(Integer.valueOf((int) R.string.OFFLINE_DETAILS_LOADING))));
        } else {
            i4 = 3;
            cqmpVar3 = cqmp.e;
        }
        cqmpVarArr2[9] = cqmpVar3;
        cqmp[] cqmpVarArr25 = new cqmp[i4];
        cqmpVarArr25[0] = cqgr.aG(cqjv.r(valueOf2, B().aa()));
        cqmpVarArr25[1] = cqgr.bq(irh.h());
        cqmpVarArr25[2] = cqgr.cd(-1);
        cqmpVarArr2[10] = cqgr.gm(cqmpVarArr25);
        if (z) {
            cqmp[] cqmpVarArr26 = new cqmp[4];
            bffjVar = this;
            if (bffjVar.c) {
                c8 = 0;
                aG = cqic.d(B().K(), new cqmp[0]);
            } else {
                c8 = 0;
                aG = cqgr.aG(B().K());
            }
            cqmpVarArr26[c8] = aG;
            cqmpVarArr26[1] = cqgr.aJ(16);
            cqmp[] cqmpVarArr27 = new cqmp[3];
            cqmpVarArr27[c8] = cqgr.ch(cqrp.d(20.0d));
            cqmpVarArr27[1] = cqgr.bG(cqrp.d(-1.0d));
            cqmpVarArr27[2] = cqgr.eE(itd.d(ibm.m()));
            cqmpVarArr26[2] = cqgr.gc(cqmpVarArr27);
            i5 = 3;
            cqmpVarArr26[3] = cqgr.gq(cqgr.bR(irh.g()), ibq.y(), ibq.z(), cqgr.aJ(16), cqgr.eL(Integer.valueOf((int) R.string.OFFLINE_PLACE_STATE_LIMITED_INFO)));
            cqmpVar4 = cqgr.gd(cqmpVarArr26);
        } else {
            bffjVar = this;
            i5 = 3;
            cqmpVar4 = cqmp.e;
        }
        cqmpVarArr2[11] = cqmpVar4;
        cqmp[] cqmpVarArr28 = new cqmp[i5];
        cqmpVarArr28[0] = cqgr.aG(cqjv.r(valueOf2, B().K()));
        cqmpVarArr28[1] = cqgr.bq(irh.h());
        cqmpVarArr28[2] = cqgr.cd(-1);
        cqmpVarArr2[12] = cqgr.gm(cqmpVarArr28);
        cqmpVarArr2[13] = z ? k() : cqmp.e;
        cqmpVarArr2[14] = z ? cqgr.fY(cqgr.dU(cqrp.d(6.0d)), cqic.a(cqjv.v(B().au()), new cqmp[0]), cqgr.fO(new brji(), B().au(), cqgr.aI(bfez.a))) : cqmp.e;
        cqmpVarArr2[15] = cqgr.gq(cqic.d(B().ac(), new cqmp[0]), irn.m(), cqgr.eN(5), cqgr.eU(ibm.S()), cqgr.cB(num), cqgr.eI(B().ad()));
        cqmpVarArr2[16] = z ? bffjVar.c ? cqgr.fS(new bhfs(), bffa.a, iue.c(bffb.a), cqgr.bF(bffc.a)) : cqgr.fQ(new bhfs(), B().ar(), iue.b(B().as()), cqjv.k(B().ao(), cqgr.bD(cqrp.d(-8.0d)), cqgr.bC(-1))) : cqmp.e;
        cqmpVarArr2[17] = z ? i() : cqmp.e;
        cqmpVarArr2[18] = cqgr.gm(cqgr.aG(cqjv.q(valueOf2, cqjv.t(B().ab(), B().ac()), cqjv.u(B().ao()))), cqgr.bq(irh.h()), cqgr.cd(-1));
        cqmpVarArr[5] = cqgr.gd(cqmpVarArr2);
        if (bffjVar.c) {
            cqmp[] cqmpVarArr29 = new cqmp[2];
            cqmpVarArr29[0] = cqic.a(cqjv.t(cqjv.v(B().am()), cqjv.u(B().am().a())), new cqmp[0]);
            cqiw bfggVar = z ? new bfgg() : new bfgm();
            bfgs am = B().am();
            Boolean valueOf3 = Boolean.valueOf(!z);
            cqmpVarArr29[1] = cqgr.fO(bfggVar, am, cqjv.k(cqjv.r(valueOf3, E()), cqgr.dU(cqrp.d(dcyn.a)), k), cqjv.k(cqjv.r(valueOf3, E()), cqgr.bw(16), cqgr.bw(48)));
            fO = cqgr.fY(cqmpVarArr29);
        } else {
            cqiw bfggVar2 = z ? new bfgg() : new bfgm();
            bfgs am2 = B().am();
            Boolean valueOf4 = Boolean.valueOf(!z);
            fO = cqgr.fO(bfggVar2, am2, cqjv.k(cqjv.r(valueOf4, E()), cqgr.dU(cqrp.d(dcyn.a)), k), cqjv.k(cqjv.r(valueOf4, E()), cqgr.bw(16), cqgr.bw(48)), cqgr.aD(cqjv.t(cqjv.v(B().am()), cqjv.u(B().am().a()))));
        }
        cqmpVarArr[6] = fO;
        cqmpVarArr[7] = z ? cqgr.fS(new aeou(), bffd.a, new cqmp[0]) : cqmp.e;
        cqmpVarArr[8] = z ? cqmp.e : cqgr.gd(cqgr.bw(8388629), cqgr.aG(E()), cqgr.fO(new gzl(cqrp.d(dcyn.a)), B().S(), cqgr.dQ(irh.b())));
        cqmj gd4 = cqgr.gd(cqmpVarArr);
        cqmp[] cqmpVarArr30 = new cqmp[5];
        cqmpVarArr30[0] = cqgr.aT(z ? bfzt.e : bfzt.f);
        cqmpVarArr30[1] = cqgr.dr(num);
        cqmpVarArr30[2] = cqgr.bp(num2);
        cqmpVarArr30[3] = bfgf.c(cqic.d(B().aq(), new cqmp[0]));
        cqmpVarArr30[4] = gd4;
        return cqgr.gd(cqmpVarArr30);
    }

    private final cqmj<bfgt> i() {
        return cqgr.gd(cqic.d(B().ao(), new cqmp[0]), cqgr.cd(-2), cqgr.bp(-2), cqgr.aJ(16), cqgr.dr(0), cqgr.fY(cqgr.aG(B().ao()), cqgr.fO(new bexe(), B().an(), new cqmp[0])));
    }

    private final cqmj<bfgt> j(boolean z) {
        cqmp aG;
        cqmp[] cqmpVarArr = new cqmp[6];
        if (this.c) {
            aG = cqic.d(B().h(), new cqmp[0]);
        } else {
            aG = cqgr.aG(B().h());
        }
        cqmpVarArr[0] = aG;
        cqmpVarArr[1] = cqgr.cd(-1);
        cqmpVarArr[2] = cqgr.bp(-2);
        cqmpVarArr[3] = cqgr.aJ(16);
        Float valueOf = Float.valueOf(0.0f);
        cqmpVarArr[4] = cqgr.gc(cqgr.aD(cqjv.A(B().j(), 0)), cqgr.fm(ibm.o()), cqgr.ca(valueOf), irn.A(), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eD(B().j()));
        cqmp[] cqmpVarArr2 = new cqmp[2];
        Float valueOf2 = Float.valueOf(1.0f);
        cqmpVarArr2[0] = cqgr.ca(valueOf2);
        cqmp[] cqmpVarArr3 = new cqmp[6];
        cqmpVarArr3[0] = cqgr.ca(valueOf2);
        cqmpVarArr3[1] = cqgr.cd(-2);
        cqmpVarArr3[2] = cqgr.bw(8388611);
        cqmpVarArr3[3] = cqgr.aJ(16);
        cqmp[] cqmpVarArr4 = new cqmp[7];
        cqmpVarArr4[0] = cqgr.ca(valueOf2);
        cqmpVarArr4[1] = cqjv.k(cqjv.u(cqjv.A(B().j(), 0)), cqgr.bR(irh.g()), cqgr.bQ(0));
        cqmpVarArr4[2] = irn.m();
        cqmp[] cqmpVarArr5 = new cqmp[3];
        cqmpVarArr5[0] = cqgr.cB(Integer.valueOf(true != z ? 1 : Integer.MAX_VALUE));
        cqmpVarArr5[1] = cqgr.eB(Boolean.valueOf(!z));
        cqmpVarArr5[2] = cqgr.ar(z ? null : TextUtils.TruncateAt.END);
        cqmpVarArr4[3] = cqmn.a(cqmpVarArr5);
        cqmpVarArr4[4] = cqgr.aZ(false);
        cqmpVarArr4[5] = ibq.x();
        cqmpVarArr4[6] = cqgr.eI(B().i());
        cqmpVarArr3[4] = cqgr.gq(cqmpVarArr4);
        cqmj<bfgt> l = l(z ? ibm.b() : ibm.o());
        l.f(cqgr.ca(valueOf));
        cqmpVarArr3[5] = l;
        cqmpVarArr2[1] = cqgr.gd(cqmpVarArr3);
        cqmpVarArr[5] = cqgr.fY(cqmpVarArr2);
        return cqgr.gd(cqmpVarArr);
    }

    private final cqmj<bfgt> k() {
        return cqgr.gd(cqic.d(B().ab(), new cqmp[0]), cqgr.cd(-1), cqgr.aJ(16), cqgr.gq(cqgr.aG(B().e()), cqgr.cd(-2), irn.m(), ibq.y(), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eI(B().f())), cqgr.gq(cqic.d(cqjv.r(B().I(), B().e()), new cqmp[0]), ibq.z(), irn.m(), ibq.y(), cqgr.eI(" · ")), cqgr.gc(cqic.d(B().I(), new cqmp[0]), itj.i(dtxy.gT), cqgr.U(e), cqgr.bw(16), cqgr.bR(cqrp.f(-2.0d)), cqgr.bG(cqrp.f(-2.0d)), cqgr.fm(ibm.o()), cqgr.eF(d)), cqgr.gq(cqic.a(cqjv.v(B().k(true)), new cqmp[0]), ibq.z(), irn.m(), ibq.y(), cqgr.eI(B().k(true))), l(ibm.n()));
    }

    private final cqmj<bfgt> l(cqss cqssVar) {
        return bfgf.b(cqkz.a(cqssVar), irn.m(), bffe.a, bfff.a, cqkz.a(true), cqgr.aD(cqjv.t(B().M(), cqjv.v(B().c()))));
    }

    @Override // defpackage.cqiw
    protected final Type ND() {
        return bfgt.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bfgt> a() {
        Boolean t = cqjv.t(cqjv.u(B().aq()), cqjv.v(B().ap()));
        Boolean g = B().g();
        Boolean r = cqjv.r(cqjv.t(B().O(), B().P()), cqjv.u(cqjv.t(B().l(), cqjv.u(B().m()))));
        cqmj<bfgt> h = h(true);
        cqmj fY = cqgr.fY(cqgr.fQ(new brsw(false), B().ap(), new cqmp[0]), cqgr.aR(Integer.valueOf((int) R.id.business_place_card)));
        fY.g(cqic.a(t, new cqmp[0]));
        cqmj<bfgt> h2 = h(true);
        h2.g(cqic.d(cqjv.r(t, g), new cqmp[0]));
        cqmj<bfgt> h3 = h(false);
        h3.g(cqic.d(cqjv.r(t, cqjv.u(g)), new cqmp[0]));
        cqmj fY2 = cqgr.fY(fY, h2, h3, cqgr.aT(bfzt.l));
        cqmp[] cqmpVarArr = new cqmp[5];
        cqmpVarArr[0] = cqgr.dr(1);
        cqmpVarArr[1] = cqgr.fD(bfew.a);
        cqmpVarArr[2] = iue.b(B().F());
        cqmpVarArr[3] = cqgr.gv(cqgr.e(R.id.persistent_footer_secondary_button), cqgr.aT(bfzt.d), cqgr.cT(B().y()), iue.b(B().G()), cqgr.cd(-1), cqgr.bp(-2), cqgr.cF(false), cqgr.o(false), cqmn.a(cqgr.aY(bfzu.b()), cqgr.du(bfzu.c())), cqjv.k(B().l(), cqgr.ac(h.c()), cqgr.ac(fY2.c())), cqgr.bl(B().n()), h, fY2);
        cqmp[] cqmpVarArr2 = new cqmp[6];
        cqmpVarArr2[0] = this.c ? cqic.d(r, new cqmp[0]) : cqgr.aG(r);
        cqmpVarArr2[1] = cqgr.bV(irh.h());
        cqmpVarArr2[2] = cqgr.dr(1);
        cqmpVarArr2[3] = ict.n(false, new cqmp[0]);
        cqmpVarArr2[4] = cqgr.fO(new beeb(), B().Q(), new cqmp[0]);
        cqmpVarArr2[5] = ict.n(false, new cqmp[0]);
        cqmpVarArr[4] = cqgr.gd(cqmpVarArr2);
        return cqgr.gd(cqmpVarArr);
    }

    public bffj(boolean z) {
        super(Boolean.valueOf(z));
        this.c = z;
    }
}
