package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cajh  reason: default package */
/* loaded from: classes4.dex */
public final class cajh extends cqiw<cafe> {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cafe cafeVar, Context context, cqiv cqivVar) {
        cafe cafeVar2 = cafeVar;
        cjzo a2 = cjzp.a(context);
        cqivVar.a(new cajj(), cafeVar2);
        if (cafeVar2.k().booleanValue()) {
            bzxg bzxgVar = new bzxg();
            bzyw o = cafeVar2.o();
            dbsk.s(o);
            cqivVar.a(bzxgVar, o);
        }
        if (cafeVar2.p().booleanValue()) {
            caue caueVar = new caue();
            bzyw q = cafeVar2.q();
            dbsk.s(q);
            cqivVar.a(caueVar, q);
        }
        if (cafeVar2.m().booleanValue()) {
            cajr cajrVar = new cajr();
            cafd n = cafeVar2.n();
            dbsk.s(n);
            cqivVar.a(cajrVar, n);
        }
        if (cafeVar2.s().booleanValue()) {
            cqivVar.a(new cagn(), cafeVar2);
        }
        cjyn.e(a2, cafeVar2.c(), cqivVar);
        if (cafeVar2.b().booleanValue()) {
            cqivVar.c(new oag());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cafe> a() {
        return cqgr.fY(iue.c(caje.a), cjyn.f(C(), cqgr.aR(Integer.valueOf(cajh.class.hashCode())), cqgr.aT(cajs.b), cqqx.v(cajf.a), cqqx.x(cajg.a)));
    }
}
