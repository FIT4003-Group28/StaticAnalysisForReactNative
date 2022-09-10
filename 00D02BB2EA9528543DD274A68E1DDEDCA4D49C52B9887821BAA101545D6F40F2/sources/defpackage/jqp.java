package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: jqp  reason: default package */
/* loaded from: classes7.dex */
public final class jqp extends cqiw<jrb> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, jrb jrbVar, Context context, cqiv cqivVar) {
        jrb jrbVar2 = jrbVar;
        cqivVar.c(new jqo());
        jra c = jrbVar2.c();
        if (c != null) {
            cqivVar.a(new jqn(), c);
        }
        jqk jqkVar = new jqk();
        jps jpsVar = new jps();
        for (jre jreVar : jrbVar2.a()) {
            cqivVar.a(jpsVar, jreVar);
            cqivVar.c(jqkVar);
        }
        jqz d = jrbVar2.d();
        if (d != null) {
            cqivVar.a(new jou(), d);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<jrb> a() {
        return cqgr.gk(cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.z(irg.f()), cqgr.ck(C()), cqgr.L(false), iue.c(jqj.a)));
    }
}
