package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cics  reason: default package */
/* loaded from: classes4.dex */
public final class cics extends cqiw<cict> {
    public static final /* synthetic */ int a = 0;
    private final cicq b;
    private final cicr c;

    public cics(cicq cicqVar, cicr cicrVar) {
        super(cicqVar, cicrVar);
        this.b = cicqVar;
        this.c = cicrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends cqkp> cqmj<T> e(cqmj<T> cqmjVar, cqmj<T> cqmjVar2) {
        cqmjVar.f(cqgr.ca(Float.valueOf(1.0f)));
        cqmjVar2.f(cqgr.bR(cqrp.d(6.0d)));
        return cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqmjVar, cqmjVar2);
    }

    public static jic f(cict cictVar) {
        ckqc ckqcVar;
        String n = cictVar.n();
        if (dbsj.d(n) || !dsna.e(n)) {
            ckqcVar = ckqc.FULLY_QUALIFIED;
        } else {
            ckqcVar = ckqc.FIFE;
        }
        return new jic(n, ckqcVar, cqrt.g(2131232390, ibm.S()), 0);
    }

    private static cqmj<cict> h(cqmj<cict> cqmjVar, cqmj<cict> cqmjVar2) {
        cqmj a2 = jgn.a(cqgr.bR(cqrp.d(20.0d)), cqgr.bV(cqrp.d(20.0d)), jgn.b(cqrp.d(8.0d)), WebImageView.a(cqgr.ch(cqrp.d(74.0d)), cqgr.z(ibm.P()), cqgr.ei(ImageView.ScaleType.CENTER), WebImageView.m(cicb.a)));
        Float valueOf = Float.valueOf(1.0f);
        cqmjVar.f(cqgr.ca(valueOf));
        cqmjVar2.f(cqgr.bR(cqrp.d(6.0d)));
        return cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.gd(cqgr.dr(0), cqgr.cd(-2), cqgr.bp(-2), cqgr.ca(valueOf), cqgr.cW(cqgr.q(cicc.a)), a2, cqmjVar), cqmjVar2);
    }

    private static cqmj<cict> i(cqmj<cict> cqmjVar) {
        return cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqmjVar, cqgr.gd(cqgr.cd(-1), cqgr.bV(cqrp.d(12.0d)), cqgr.dr(1), cqgr.dU(cqrp.d(12.0d)), ibn.s(), jgn.a(jgn.b(cqrp.d(16.0d)), cqgr.bD(cqrp.d(12.0d)), cqgr.aI(cicd.a), cqgr.cW(cqgr.q(cice.a)), cqgr.U(cqiq.b(Integer.valueOf((int) R.string.HEADER_STATIC_MAP_IMAGE_A11Y), cqiq.h(cicf.a))), WebImageView.a(cqgr.cd(-1), cqgr.bq(cqrp.d(137.0d)), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.m(cicg.a))), cqgr.gq(ibq.q(), cqgr.en(true), cqgr.aW(1), cqgr.eN(5), cqgr.eM(cici.a))));
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cict cictVar, Context context, cqiv cqivVar) {
        cict cictVar2 = cictVar;
        for (cqix<? extends cqkp> cqixVar : cictVar2.o()) {
            if (!cictVar2.p()) {
                gva.c(cqivVar, cqixVar.b(), cqixVar.a(), cqkp.T, ict.p(false, cqgr.bJ(cqrp.d(20.0d))));
            } else if ((cqixVar.a() instanceof cioi) && (cqixVar.b() instanceof cioj)) {
                cqivVar.a(cqixVar.a(), cqixVar.b());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cict> a() {
        int i;
        cqmj gb;
        cqmn a2;
        int i2;
        Object e;
        if (this.c != cicr.DISMISS) {
            i = 7;
            gb = cqgr.gb(cqgr.ch(cqrp.d(48.0d)), cqgr.x(irn.J()), cqgr.bV(cqrp.d(10.0d)), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eE(cqrt.g(2131231593, ibm.n())), cqgr.U(cqiq.b(Integer.valueOf((int) R.string.PLACE_MENU_BUTTON_DESCRIPTION_WITH_PLACE), cqiq.h(cicj.a))), iue.c(cick.a), cqgr.cW(cqgr.q(cicl.a)));
        } else {
            cqrp d = cqrp.d(15.0d);
            gb = cqgr.gb(cqgr.ch(cqrp.d(48.0d)), cqgr.x(irn.J()), cqgr.dz(d, d, d, d), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.eE(cqrt.g(2131231591, ibm.n())), cqgr.U(cicm.a), cqgr.cW(cqgr.q(cicn.a)));
            i = 7;
        }
        cqmn a3 = cqmn.a(ibq.q(), cqgr.eU(ibm.n()));
        cqmp[] cqmpVarArr = new cqmp[i];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = cqgr.dr(1);
        cqmpVarArr[2] = cqgr.dU(cqrp.d(20.0d));
        cqmpVarArr[3] = cqgr.dQ(cqrp.d(20.0d));
        cqmpVarArr[4] = cqgr.gq(cqgr.cd(-2), cqgr.eN(5), cqgr.eM(cico.a), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), iue.c(cicp.a), ibq.e());
        cqmp[] cqmpVarArr2 = {cqgr.cd(-2), cqgr.eN(5), cqgr.cB(3), cqgr.ar(TextUtils.TruncateAt.END), a3};
        if (this.b == cicq.THUMBNAIL || this.b == cicq.THUMBNAIL_WITH_MAP_IMAGE) {
            cqmj gq = cqgr.gq(cqgr.aF(cqjv.x(cibu.a)), cqgr.eM(cibv.a));
            gq.f(cqmpVarArr2);
            cqmj gq2 = cqgr.gq(cqgr.aF(cqjv.x(cibx.a)), cqgr.eM(ciby.a));
            gq2.f(cqmpVarArr2);
            a2 = cqmn.a(gq, gq2);
        } else {
            cqmj gq3 = cqgr.gq(cqgr.aF(cibt.a), cqjv.l(cibp.a, cqgr.eK(cqiq.c("%s · %s", cqiq.h(cibq.a), cqiq.h(cibr.a))), cqgr.eM(cibs.a)));
            gq3.f(cqmpVarArr2);
            a2 = cqmn.a(gq3);
        }
        cqmpVarArr[5] = a2;
        cqmpVarArr[6] = cqgr.gd(cqgr.dr(0), cqgr.aI(cibm.a), cqgr.gq(cqgr.eM(cibn.a), a3), jfb.a(jfb.c(cibo.a), cqgr.bp(-2), cqgr.cd(-2), cqgr.bR(cqrp.d(4.0d)), cqgr.bw(16), jfb.f(jfo.e)));
        cqmj gd = cqgr.gd(cqmpVarArr);
        Object obj = cqmp.e;
        int ordinal = this.b.ordinal();
        if (ordinal == 0) {
            i2 = 3;
            gd.f(cqgr.cW(cqgr.q(cibl.a)));
            e = e(gd, gb);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                obj = h(gd, gb);
            } else if (ordinal == 3) {
                obj = i(h(gd, gb));
            } else if (ordinal == 4) {
                gd.f(cqgr.cW(cqgr.q(cibw.a)));
                obj = i(e(gd, gb));
            }
            e = obj;
            i2 = 3;
        } else {
            cqmj a4 = jgn.a(cqgr.cd(-1), cqgr.bp(-2), cqgr.bV(cqrp.d(20.0d)), cqgr.bJ(cqrp.d(20.0d)), jgn.b(cqrp.d(16.0d)), WebImageView.a(cqgr.cd(-1), cqgr.bq(cqrp.d(140.0d)), cqgr.z(ibm.P()), cqgr.ei(ImageView.ScaleType.CENTER), WebImageView.m(cibz.a)));
            gd.f(cqgr.bG(cqrp.d(48.0d)));
            gb.f(cqgr.bV(cqrp.d(170.0d)), cqgr.bw(8388661));
            i2 = 3;
            e = cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.gd(cqgr.dr(1), cqgr.cW(cqgr.q(cica.a)), a4, gd), gb);
        }
        cqmp[] cqmpVarArr3 = new cqmp[i2];
        cqmpVarArr3[0] = cqgr.aW(2);
        cqmp[] cqmpVarArr4 = new cqmp[i2];
        cqmpVarArr4[0] = cqgr.dr(1);
        cqmpVarArr4[1] = e;
        cqmpVarArr4[2] = cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.L(false), cqgr.P(false), cqgr.aJ(1), cqgr.aW(2), cqgr.p(false), cqgr.ck(C()));
        cqmpVarArr3[1] = cqgr.gd(cqmpVarArr4);
        cqmpVarArr3[2] = iue.c(cich.a);
        cqmj fY = cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.x(ibm.b()));
        fY.f(cqmpVarArr3);
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), fY);
    }
}
