package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bhoh  reason: default package */
/* loaded from: classes3.dex */
public final class bhoh extends cqiw<bhry> {
    public static final /* synthetic */ int a = 0;
    private static final cqjg b = cqjg.a();
    private static final cqjg c = cqjg.a();
    private static final cqjg d = cqjg.a();
    private static final cqmn<bhry> e = cqmn.a(cqgr.ch(cqrp.d(16.0d)), cqgr.bw(16), cqgr.ei(ImageView.ScaleType.FIT_CENTER));
    private final ddho f;
    private final boolean g;

    public bhoh(boolean z, ddho ddhoVar) {
        super(Boolean.valueOf(z), ddhoVar);
        this.f = ddhoVar;
        this.g = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bhry> a() {
        cqrp d2;
        cqlc x = cqjv.x(bhns.a);
        cqmp[] cqmpVarArr = new cqmp[6];
        int i = -2;
        cqmpVarArr[0] = cqgr.bp(-2);
        if (true == this.g) {
            i = -1;
        }
        cqmpVarArr[1] = cqgr.cd(Integer.valueOf(i));
        cqmpVarArr[2] = cqgr.L(false);
        cqmpVarArr[3] = cqgr.P(false);
        cqmpVarArr[4] = cqgr.dB(cqrp.d(this.g ? dcyn.a : 5.0d));
        cqmp[] cqmpVarArr2 = new cqmp[3];
        cqmpVarArr2[0] = cqgr.cW(cqgr.q(bhny.a));
        cqmpVarArr2[1] = itj.i(this.f);
        cqmp[] cqmpVarArr3 = new cqmp[4];
        cqmpVarArr3[0] = this.g ? cqgr.cd(-1) : cqgr.ce(cqrp.d(152.0d));
        cqmp[] cqmpVarArr4 = new cqmp[6];
        cqjg cqjgVar = b;
        cqmpVarArr4[0] = cqgr.aT(cqjgVar);
        cqmpVarArr4[1] = cqgr.cd(-1);
        cqmpVarArr4[2] = cqgr.bp(-2);
        cqmpVarArr4[3] = cqgr.bw(8388659);
        cqmp[] cqmpVarArr5 = new cqmp[4];
        if (this.g) {
            d2 = cqrp.d(178.0d);
        } else {
            d2 = cqrp.d(141.0d);
        }
        cqmpVarArr5[0] = cqgr.bq(d2);
        cqmpVarArr5[1] = cqgr.cd(-1);
        cqmpVarArr5[2] = cqgr.ei(ImageView.ScaleType.CENTER_CROP);
        cqmpVarArr5[3] = WebImageView.l(bhnz.a);
        cqmpVarArr4[4] = WebImageView.a(cqmpVarArr5);
        cqmpVarArr4[5] = jgn.a(cqgr.bp(-2), cqgr.cd(-2), cqgr.aF(bhoa.a), cqgr.bw(8388691), cqgr.bD(cqrp.d(10.0d)), cqgr.bR(cqrp.d(10.0d)), cqgr.dL(cqrp.d(4.0d)), cqgr.dJ(cqrp.d(8.0d)), jgn.b(cqrp.d(4.0d)), cqgr.x(ibm.b()), cqgr.gq(cqgr.eM(bhob.a), ibq.i()), iue.c(bhoc.a));
        cqmpVarArr3[1] = cqgr.fY(cqmpVarArr4);
        cqjg cqjgVar2 = c;
        cqmpVarArr3[2] = cqgr.gq(cqgr.aT(cqjgVar2), cqgr.bY(cqjd.u(cqjgVar), cqjd.e()), cqgr.dJ(cqrp.d(8.0d)), cqgr.dU(cqrp.d(8.0d)), cqgr.dB(cqrp.d(4.0d)), ibq.o(), cqgr.co(irh.n(), false), cqgr.cl(1), cqgr.ar(TextUtils.TruncateAt.END), cqjv.n(x, cqmn.a(cqgr.eM(bhod.a), cqgr.eU(ibm.n()), cqgr.S(Integer.valueOf((int) R.string.OFFERING_CAROUSEL_UNNAMED_DISH_CONTENT_DESCRIPTION))), cqmn.a(cqgr.eM(bhoe.a), cqgr.eU(ibm.t()), cqgr.V(bhof.a))));
        final cqlc x2 = cqjv.x(bhog.a);
        final cqlc x3 = cqjv.x(bhnt.a);
        cqlc cqlcVar = new cqlc(x3, x2) { // from class: bhnu
            private final cqlc a;
            private final cqlc b;

            {
                this.a = x3;
                this.b = x2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar2 = this.a;
                cqlc cqlcVar3 = this.b;
                bhry bhryVar = (bhry) cqkpVar;
                int i2 = bhoh.a;
                boolean z = false;
                if (((cqju) cqlcVar2).a(bhryVar).booleanValue() && ((cqju) cqlcVar3).a(bhryVar).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        cqmn a2 = cqmn.a(ibq.p(), cqgr.eU(ibm.n()));
        cqmn<bhry> cqmnVar = e;
        cqmj gd = cqgr.gd(cqgr.bk(cqlcVar), cqgr.dr(0), cqgr.gc(cqgr.aF(x2), cqgr.S(Integer.valueOf((int) R.string.OFFERING_CAROUSEL_NUM_REVIEWS)), cqmnVar, cqgr.eE(cqrt.g(2131232397, ibm.n()))), cqgr.gq(cqgr.aF(x2), cqgr.aJ(16), cqgr.dQ(irh.n()), a2, cqgr.eM(bhnv.a)), cqgr.gq(cqgr.aF(new cqlc(x2, x3) { // from class: bhnw
            private final cqlc a;
            private final cqlc b;

            {
                this.a = x2;
                this.b = x3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar2 = this.a;
                cqlc cqlcVar3 = this.b;
                bhry bhryVar = (bhry) cqkpVar;
                int i2 = bhoh.a;
                boolean z = true;
                if (!((cqju) cqlcVar2).a(bhryVar).booleanValue() && !((cqju) cqlcVar3).a(bhryVar).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), a2, cqgr.eI(" · ")), cqgr.gc(cqgr.aF(x3), cqgr.S(Integer.valueOf((int) R.string.OFFERING_CAROUSEL_NUM_PHOTOS)), cqmnVar, cqgr.eE(cqrt.i(iup.e(R.raw.ic_mod_photo_camera), ibm.n()))), cqgr.gq(cqgr.aF(x3), cqgr.aJ(16), cqgr.dQ(irh.n()), a2, cqgr.eM(bhnx.a)));
        gd.f(cqgr.aT(d), cqgr.bq(cqrp.d(20.0d)), cqgr.bY(cqjd.u(cqjgVar2), cqjd.e()), cqgr.bD(cqrp.d(10.0d)), cqgr.bJ(cqrp.d(8.0d)));
        cqmpVarArr3[3] = gd;
        cqmpVarArr2[2] = cqgr.gj(cqmpVarArr3);
        cqmj a3 = this.g ? abjc.a(cqqx.y(false)) : abjc.b(cqqx.y(false), cqqx.B(true));
        a3.f(cqmpVarArr2);
        cqmpVarArr[5] = a3;
        return cqgr.fY(cqmpVarArr);
    }
}
