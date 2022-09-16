package defpackage;

import android.content.Context;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: eav  reason: default package */
/* loaded from: classes6.dex */
public final class eav extends cqiw<ebm> {
    public static final /* synthetic */ int a = 0;
    private static final cqrp b = cqrp.d(27.0d);
    private final boolean c;
    private final boolean d;
    private final cqtv e;
    private final cqtv f;
    private final cqtv g;

    public eav(boolean z, boolean z2, cqtv cqtvVar, cqtv cqtvVar2, cqtv cqtvVar3) {
        super(Boolean.valueOf(z), Boolean.valueOf(z2), cqtvVar, cqtvVar2, cqtvVar3);
        this.c = z;
        this.d = z2;
        this.e = cqtvVar;
        this.f = cqtvVar2;
        this.g = cqtvVar3;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, ebm ebmVar, Context context, cqiv cqivVar) {
        ebm ebmVar2 = ebmVar;
        Iterator<ebn> it = ebmVar2.b().subList(0, Math.min(5, ebmVar2.b().size())).iterator();
        while (it.hasNext()) {
            cqivVar.a(new eas(this.d, this.e, this.f, this.g), it.next());
            if (it.hasNext()) {
                cqivVar.a(new hsd(), hsd.d(cqsg.g(cqrp.d(20.0d), cqsg.f(this.g, Float.valueOf(2.0f)))));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ebm> a() {
        cqmj cqmjVar;
        cqmp cqmpVar;
        cqmp[] cqmpVarArr = new cqmp[9];
        cqmpVarArr[0] = cqgr.dr(1);
        cqmpVarArr[1] = cqgr.ce(cquz.b);
        cqmpVarArr[2] = cqgr.bq(cquz.a);
        cqmpVarArr[3] = cqgr.aF(eat.a);
        int i = 8388611;
        cqmpVarArr[4] = cqgr.aJ(8388611);
        cqmpVarArr[5] = cqgr.L(false);
        cqmpVarArr[6] = cqgr.P(false);
        if (this.d) {
            cqlc cqlcVar = eau.a;
            cqmp[] cqmpVarArr2 = {cqgr.bD(cqrp.d(16.0d))};
            cqrp cqrpVar = b;
            cqmj gq = cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.bR(cqrpVar), cqgr.bG(cqrpVar), irn.i(), cqgr.eU(irg.J()), cqgr.fh(cqrp.f(14.0d)), cqgr.eM(cqlcVar));
            gq.f(cqmpVarArr2);
            cqmjVar = gq;
        } else {
            cqmjVar = cqmp.e;
        }
        cqmpVarArr[7] = cqmjVar;
        cqmp[] cqmpVarArr3 = new cqmp[8];
        cqmpVarArr3[0] = cqgr.ce(cquz.a);
        cqmpVarArr3[1] = cqgr.bq(cquz.a);
        if (true == this.c) {
            i = 1;
        }
        cqmpVarArr3[2] = cqgr.bw(Integer.valueOf(i));
        if (this.d) {
            cqmpVar = cqgr.dJ(b);
        } else {
            cqmpVar = cqmp.e;
        }
        cqmpVarArr3[3] = cqmpVar;
        cqmpVarArr3[4] = cqgr.P(false);
        cqmpVarArr3[5] = cqgr.L(false);
        cqmpVarArr3[6] = cqgr.ep(false);
        cqmpVarArr3[7] = cqgr.gd(cqgr.dr(0), cqgr.ce(cquz.a), cqgr.bq(cquz.a), cqgr.ck(C()), cqgr.L(false), cqgr.P(false));
        cqmpVarArr[8] = cqgr.ga(cqmpVarArr3);
        return cqgr.gd(cqmpVarArr);
    }
}
