package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: ayio  reason: default package */
/* loaded from: classes3.dex */
public final class ayio extends cqiw<aymt> {
    public static final cqjg a = cqjg.a();
    private static final cqjb<aymt, abp> b = ayij.a;

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, aymt aymtVar, Context context, cqiv cqivVar) {
        aymt aymtVar2 = aymtVar;
        ayju ayjuVar = new ayju();
        ayms q = aymtVar2.q();
        dbsk.s(q);
        cqivVar.a(ayjuVar, q);
        if (!aymtVar2.u().booleanValue()) {
            cqivVar.a(new ayim(), aymtVar2);
        }
        cqivVar.f(new ayif(), aymtVar2.b());
        if (aymtVar2.c().booleanValue()) {
            cqivVar.a(new ayin(), aymtVar2);
        }
        if (aymtVar2.s().booleanValue()) {
            aykm aykmVar = new aykm();
            aymv t = aymtVar2.t();
            dbsk.s(t);
            cqivVar.a(aykmVar, t);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aymt> a() {
        return cqgr.fY(cqgr.aT(a), cqgr.cd(-1), cqgr.bp(-1), cqgr.z(ibm.b()), cqgr.fR(new bfix(), ayig.a, new cqmp[0]), cqgr.L(false), GmmRecyclerView.aw(C(), cqgr.cd(-1), cqgr.bp(-1), cqgr.L(false), cqqx.K(b), cqqx.v(ayih.a)));
    }
}
