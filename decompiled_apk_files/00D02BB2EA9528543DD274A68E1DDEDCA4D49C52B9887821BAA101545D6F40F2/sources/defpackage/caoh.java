package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: caoh  reason: default package */
/* loaded from: classes4.dex */
public final class caoh extends cqiw<caft> {
    public static final /* synthetic */ int a = 0;
    private static final int b = cqir.a();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, caft caftVar, Context context, cqiv cqivVar) {
        caft caftVar2 = caftVar;
        cqivVar.a(new cajj(), caftVar2);
        if (caftVar2.p().booleanValue()) {
            caue caueVar = new caue();
            bzyw q = caftVar2.q();
            dbsk.s(q);
            cqivVar.a(caueVar, q);
        }
        cqivVar.a(new cany(), caftVar2.d());
        if (caftVar2.i().isEmpty()) {
            cqivVar.c(new gvb());
        }
        cafs g = caftVar2.g();
        if (g != null && g.a().booleanValue()) {
            cqivVar.a(new caog(), g);
        }
        cqivVar.f(new cans(), caftVar2.i());
        if (caftVar2.b().booleanValue()) {
            cqivVar.a(new oag(), caftVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<caft> a() {
        return cqgr.fY(iue.c(cams.a), cqqx.D(cqgr.aR(Integer.valueOf(b)), cqgr.aT(cajs.b), cqqx.F(), cqgr.z(irg.a()), cqqx.v(camt.a), cqgr.bp(-1), cqgr.cd(-1), cqqx.x(camu.a), cqgr.ck(C())));
    }
}
