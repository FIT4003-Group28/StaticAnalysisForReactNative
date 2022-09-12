package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cehc  reason: default package */
/* loaded from: classes4.dex */
public final class cehc extends cqiw<cesn> {
    public static final /* synthetic */ int a = 0;
    private static final cqrp b = cqrp.d(8.0d);
    private static final cqrp c = cqrp.d(4.0d);
    private static final cqjg d = cqjg.a();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cesn cesnVar, Context context, cqiv cqivVar) {
        cqiw cegvVar;
        cesn cesnVar2;
        cesn cesnVar3 = cesnVar;
        if (cesnVar3 instanceof cesm) {
            cegvVar = new cehb();
            cesnVar2 = (cesm) cesnVar3;
        } else if (!(cesnVar3 instanceof cesl)) {
            return;
        } else {
            cegvVar = new cegv();
            cesnVar2 = (cesl) cesnVar3;
        }
        cqivVar.a(cegvVar, cesnVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cesn> a() {
        cqrp cqrpVar = c;
        cqjg cqjgVar = d;
        return cqgr.gd(cqgr.cd(-1), cqgr.dr(1), cqgr.gj(cqgr.cH(ibn.a()), cqgr.cd(-1), cqgr.bT(cegn.a), cqgr.bG(b), cqgr.bV(cqrpVar), cqgr.bD(cqrpVar), cqgr.gq(cqgr.cd(-1), cqgr.bY(cqjd.t(), cqjd.e(), cqjd.y(cqjgVar)), cqjv.l(cego.a, ibq.p(), ibq.l()), cqgr.eU(ibm.n()), cqgr.eN(5), cqgr.eM(cegp.a)), cqgr.fY(cqgr.aT(cqjgVar), cqgr.bY(cqjd.f(), cqjd.t()), cqgr.ck(C()))), ict.n(false, cqgr.aI(cegq.a)));
    }
}
