package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: hou  reason: default package */
/* loaded from: classes.dex */
public final class hou extends cqiw<izs> {
    public static final /* synthetic */ int a = 0;
    private static final cqjg b = cqjg.a();

    private static cqmn<izs> e() {
        final cqlc cqlcVar = hok.a;
        final cqlc cqlcVar2 = hol.a;
        final cqlc cqlcVar3 = hon.a;
        return cqmn.a(cqgr.bp(-1), cqgr.aJ(16), cqjv.f(cqfe.TEXT_AND_SELECTION, new cqlc(cqlcVar, cqlcVar2, cqlcVar3) { // from class: cqgf
            private final cqlc a;
            private final cqlc b;
            private final cqlc c;

            {
                this.a = cqlcVar;
                this.b = cqlcVar2;
                this.c = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return new cqgt((CharSequence) this.a.a(cqkpVar), (Integer) this.b.a(cqkpVar), (Integer) this.c.a(cqkpVar));
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.eN(5), ibq.f(), cqgr.eU(iva.b(ibl.w(), ibl.b())), cqgr.eX(ibl.aw()), cqgr.eB(true));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<izs> a() {
        cqmp cqmpVar;
        cqmp cqmpVar2;
        cqmp aI;
        cqmp aI2;
        cqmp aI3;
        cqmp aF;
        cqmp cqmpVar3;
        boolean z = ((btvq) btsr.a(btvq.class)).rp().getHomeScreenParameters().m;
        cqmp[] cqmpVarArr = new cqmp[2];
        if (z) {
            cqmpVar = cqic.f(hnh.a, new cqmp[0]);
        } else {
            cqmpVar = cqmp.e;
        }
        cqmpVarArr[0] = cqmpVar;
        cqmpVarArr[1] = cqgr.fP(new hqd(), hnr.a, new cqmp[0]);
        cqmj fY = cqgr.fY(cqmpVarArr);
        cqmm fP = cqgr.fP(new hpv(), hob.a, new cqmp[0]);
        cqmj fY2 = cqgr.fY(cqgr.fI(8), iue.b(cjtd.a(dtxx.ca)), cqgr.cd(-2), cqgr.bp(-2), cqgr.aR(Integer.valueOf((int) R.id.search_omnibox_one_google_account_disc)));
        cqmp[] cqmpVarArr2 = new cqmp[2];
        if (z) {
            cqmpVar2 = cqic.c(cqjv.x(hom.a), new cqmp[0]);
        } else {
            cqmpVar2 = cqmp.e;
        }
        cqmpVarArr2[0] = cqmpVar2;
        cqmpVarArr2[1] = cqgr.fR(new hrb(), hop.a, new cqmp[0]);
        cqmj fY3 = cqgr.fY(cqmpVarArr2);
        cqmp[] cqmpVarArr3 = new cqmp[15];
        cqmpVarArr3[0] = cqgr.bv(3);
        cqmpVarArr3[1] = cqgr.bp(-1);
        cqmpVarArr3[2] = cqgr.ce(cqrp.d(dcyn.a));
        Float valueOf = Float.valueOf(1.0f);
        cqmpVarArr3[3] = cqgr.ca(valueOf);
        cqmpVarArr3[4] = cqgr.dT(hoq.a);
        cqmpVarArr3[5] = cqgr.aJ(8388627);
        cqmpVarArr3[6] = cqgr.aR(Integer.valueOf((int) R.id.search_omnibox_text_box));
        cqmpVarArr3[7] = cqgr.aC(false);
        cqmpVarArr3[8] = cqgr.cW(cqgr.q(hor.a));
        cqmpVarArr3[9] = iue.c(hos.a);
        cqmpVarArr3[10] = cqgr.gc(cqic.f(hot.a, new cqmp[0]), cqgr.bR(cqsg.d(cqrp.d(2.0d), cqrp.d(10.0d))), cqgr.bG(cqrp.d(10.0d)), cqgr.bq(cqrp.d(28.0d)), cqgr.ce(cqrp.d(28.0d)), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.eE(iup.e(R.raw.ic_maps_pin_icon_2020)), cqmp.e, cqmp.e, cqmp.e);
        cqmpVarArr3[11] = jgk.a(cqgr.fP(new hng(), hni.a, new cqmp[0]), cqic.f(hnj.a, new cqmp[0]));
        cqmp[] cqmpVarArr4 = new cqmp[6];
        cqmpVarArr4[0] = cqgr.aT(b);
        cqmpVarArr4[1] = cqgr.cg(hnk.a);
        cqmpVarArr4[2] = e();
        cqmpVarArr4[3] = cqgr.aQ(hnl.a);
        cqmpVarArr4[4] = cqgr.ar(TextUtils.TruncateAt.END);
        if (z) {
            aI = cqic.f(hnm.a, new cqmp[0]);
        } else {
            aI = cqgr.aI(hnn.a);
        }
        cqmpVarArr4[5] = aI;
        cqmpVarArr3[12] = cqgr.gq(cqmpVarArr4);
        cqmp[] cqmpVarArr5 = new cqmp[13];
        cqmpVarArr5[0] = cqgr.bp(-1);
        cqmpVarArr5[1] = cqgr.ce(cqrp.d(dcyn.a));
        cqmpVarArr5[2] = cqgr.ca(valueOf);
        cqmpVarArr5[3] = cqgr.aJ(16);
        cqmpVarArr5[4] = cqgr.dQ(cqrp.d(4.0d));
        cqmpVarArr5[5] = iue.c(hno.a);
        cqmpVarArr5[6] = cqgr.eM(hnp.a);
        cqmpVarArr5[7] = cqgr.eN(2);
        cqmpVarArr5[8] = ibq.f();
        cqmpVarArr5[9] = cqgr.eU(iva.b(ibl.q(), ibl.h()));
        cqmpVarArr5[10] = cqgr.eB(true);
        cqmpVarArr5[11] = cqgr.ar(TextUtils.TruncateAt.END);
        if (z) {
            aI2 = cqic.f(hnq.a, new cqmp[0]);
        } else {
            aI2 = cqgr.aI(hns.a);
        }
        cqmpVarArr5[12] = aI2;
        cqmpVarArr3[13] = cqgr.gq(cqmpVarArr5);
        cqlc cqlcVar = hnt.a;
        cqrp d = cqrp.d(dcyn.a);
        cqmpVarArr3[14] = new cqmh(hmu.class, cqjv.g(hmv.a, cqlcVar, hmw.a), cqmn.a(cqgr.aT(hqv.a), cqgr.cd(-1), e(), cqgr.aQ(hof.a), cqgr.dz(d, d, d, d), cqgr.bG(cqrp.d(1.0d)), cqgr.aR(Integer.valueOf((int) R.id.search_omnibox_edit_text)), cqgr.v(0), cqgr.bf(hog.a), cqgr.dp(hoh.a), cqgr.dl(hoi.a), cqgr.aV(hoj.a)), cqic.f(hnu.a, new cqmp[0]));
        cqmj a2 = jgk.a(cqmpVarArr3);
        cqmp[] cqmpVarArr6 = new cqmp[9];
        cqmpVarArr6[0] = cqgr.bp(-1);
        cqmpVarArr6[1] = cqgr.cd(-2);
        cqmpVarArr6[2] = cqgr.dU(cqrp.d(12.0d));
        cqmpVarArr6[3] = cqgr.dB(cqrp.d(12.0d));
        cqmpVarArr6[4] = cqgr.aJ(16);
        cqmpVarArr6[5] = cqgr.bR(cqrp.d(8.0d));
        cqmpVarArr6[6] = cqgr.bG(cqrp.d(8.0d));
        cqmpVarArr6[7] = cqgr.gg(cqgr.bq(cqrp.d(24.0d)), cqgr.ce(cqrp.d(24.0d)), cqgr.aR(Integer.valueOf((int) R.id.search_omnibox_loading_spinner)));
        if (z) {
            aI3 = cqic.f(hnv.a, new cqmp[0]);
        } else {
            aI3 = cqgr.aI(hnw.a);
        }
        cqmpVarArr6[8] = aI3;
        cqmj gd = cqgr.gd(cqmpVarArr6);
        cqmp[] cqmpVarArr7 = new cqmp[14];
        cqmpVarArr7[0] = cqgr.aT(hqv.c);
        cqmpVarArr7[1] = cqgr.aR(Integer.valueOf((int) R.id.search_omnibox_text_clear));
        cqmpVarArr7[2] = cqgr.bp(-1);
        cqmpVarArr7[3] = cqgr.cd(-2);
        cqrp d2 = cqrp.d(12.0d);
        cqmpVarArr7[4] = cqgr.dz(d2, d2, d2, d2);
        cqmpVarArr7[5] = cqgr.aJ(16);
        cqmpVarArr7[6] = cqgr.x(irn.J());
        cqmpVarArr7[7] = cqgr.cL(ibn.a());
        cqmpVarArr7[8] = cqgr.cH(ibn.a());
        cqmpVarArr7[9] = cqgr.cW(cqgr.q(hnx.a));
        cqmpVarArr7[10] = iue.c(hny.a);
        cqmpVarArr7[11] = cpp.g(cpp.f());
        if (z) {
            aF = cqic.c(hnz.a, new cqmp[0]);
        } else {
            aF = cqgr.aF(hoa.a);
        }
        cqmpVarArr7[12] = aF;
        cqmpVarArr7[13] = cqgr.gc(cqgr.bq(cqrp.d(24.0d)), cqgr.ce(cqrp.d(24.0d)), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.fm(ibl.av()), cqgr.eG(hoc.a), cqgr.T(cqrt.l(R.string.ACCESSIBILITY_CLEAR)));
        cqmj gd2 = cqgr.gd(cqmpVarArr7);
        cqmp[] cqmpVarArr8 = new cqmp[2];
        if (z) {
            cqmpVar3 = cqic.c(cqjv.x(hod.a), new cqmp[0]);
        } else {
            cqmpVar3 = cqmp.e;
        }
        cqmpVarArr8[0] = cqmpVar3;
        cqmpVarArr8[1] = cqgr.fR(new hna(), hoe.a, new cqmp[0]);
        return cqgr.gd(cqgr.cd(-1), cqgr.bq(cqrp.d(48.0d)), cqgr.aJ(16), fY, a2, gd, gd2, fP, cqgr.fY(cqmpVarArr8), fY2, fY3);
    }
}
