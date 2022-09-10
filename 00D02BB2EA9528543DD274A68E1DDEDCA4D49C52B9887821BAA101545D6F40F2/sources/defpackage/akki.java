package defpackage;

import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: akki  reason: default package */
/* loaded from: classes2.dex */
public final class akki extends cqiw<aklg> {
    public static final /* synthetic */ int a = 0;
    private final akgn<aklg> b;
    private final akkh c;

    public akki(akgn<aklg> akgnVar, akkh akkhVar) {
        super(akgnVar, akkhVar);
        this.b = akgnVar;
        this.c = akkhVar;
    }

    private static cqmj<aklg> e() {
        return WebImageView.a(cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(akjx.a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aklg> a() {
        cqtv cqtvVar;
        cqtv cqtvVar2;
        cqmj a2;
        akkh akkhVar = akkh.STANDALONE;
        int ordinal = this.c.ordinal();
        int i = 48;
        if (ordinal == 0) {
            cqtvVar = akhn.c;
            cqtvVar2 = akhn.b;
        } else if (ordinal == 2) {
            cqtvVar = cqrp.d(8.0d);
            cqtvVar2 = akhn.a;
            i = 16;
        } else {
            cqtvVar = akhn.a;
            cqtvVar2 = akhn.a;
        }
        akgn<aklg> akgnVar = this.b;
        cqmp<aklg>[] cqmpVarArr = new cqmp[1];
        cqmp[] cqmpVarArr2 = new cqmp[12];
        cqmpVarArr2[0] = cqgr.bv(3);
        cqmpVarArr2[1] = cqgr.bp(-2);
        cqmpVarArr2[2] = cqgr.cd(-1);
        cqmpVarArr2[3] = cqgr.dr(0);
        cqmpVarArr2[4] = cqgr.cH(irh.a());
        cqmpVarArr2[5] = cqjv.l(cqjv.x(akjv.a), cqgr.x(ibo.h()), cqgr.w(akjy.a));
        cqmpVarArr2[6] = cqgr.ca(Float.valueOf(1.0f));
        cqmpVarArr2[7] = cqgr.V(akjz.a);
        cqmpVarArr2[8] = cqgr.fP(new akju(this.c), akka.a, cqgr.bw(Integer.valueOf(i)), cqgr.dQ(cqtvVar2), cqgr.dF(cqtvVar2), cqgr.dU(cqtvVar), cqgr.dB(cqtvVar));
        cqlc a3 = cqkz.a(iut.a(cqrt.g(2131232736, ibm.m())));
        cqrp d = cqrp.d(4.0d);
        cqmj b = ict.b(a3, cqgr.bw(8388629), cqgr.dz(d, d, d, d), cqgr.bG(ibn.d()));
        b.f(cqgr.aI(akkb.a));
        cqmpVarArr2[9] = b;
        cqmpVarArr2[10] = WebImageView.a(cqgr.aF(akkc.a), cqgr.bv(3), cqgr.ce(cqrp.d(36.0d)), cqgr.bq(cqrp.d(36.0d)), cqgr.bV(cqtvVar), cqgr.bD(cqtvVar), cqgr.bG(cqtvVar2), cqgr.bw(16), cqgr.ei(ImageView.ScaleType.FIT_CENTER), WebImageView.l(akkd.a));
        if (this.c != akkh.VERTICAL_LIST_SUB_CARD) {
            cqmj<aklg> e = e();
            e.f(cqgr.cd(-1), cqgr.bp(-1));
            a2 = jgn.a(jgn.b(cqrp.d(8.0d)), cqgr.ce(cqrp.d(56.0d)), cqgr.bq(cqrp.d(56.0d)), cqgr.bV(cqrp.d(12.0d)), cqgr.bD(cqrp.d(12.0d)), cqgr.bG(cqrp.d(12.0d)), e);
        } else {
            cqmj<aklg> e2 = e();
            e2.f(cqgr.cd(-1), cqgr.bp(-1));
            a2 = jgn.a(cqgr.ca(Float.valueOf(0.0f)), cqgr.ce(cqrp.d(56.0d)), cqgr.bq(cqrp.d(72.0d)), cqgr.bG(cqrp.d(24.0d)), cqgr.bV(cqrp.d(18.0d)), cqgr.bD(cqrp.d(18.0d)), jgn.b(cqrp.d(8.0d)), e2);
        }
        a2.f(cqgr.aF(cqjv.x(akke.a)), cqgr.bv(3), cqgr.bR(akhn.a), cqgr.bw(Integer.valueOf(i | 8388613)));
        cqmpVarArr2[11] = a2;
        cqmpVarArr[0] = cqgr.gd(cqmpVarArr2);
        cqmj<aklg> a4 = akgnVar.a(cqmpVarArr);
        a4.f(iue.c(akkf.a), cqgr.cW(akkg.a), cqgr.K(akjw.a));
        return a4;
    }
}
