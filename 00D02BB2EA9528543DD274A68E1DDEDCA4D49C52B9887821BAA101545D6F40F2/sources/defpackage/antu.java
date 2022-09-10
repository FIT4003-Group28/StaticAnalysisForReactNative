package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: antu  reason: default package */
/* loaded from: classes2.dex */
public final class antu extends cqiw<antv> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, antv antvVar, Context context, cqiv cqivVar) {
        antv antvVar2 = antvVar;
        if (antvVar2.e().booleanValue()) {
            cqivVar.a(new antt(), antvVar2);
        } else {
            cqivVar.a(new antn(), antvVar2);
            if (!antvVar2.g().a().isEmpty()) {
                cqivVar.a(new anzz(), antvVar2.g());
            }
        }
        if (antvVar2.h().booleanValue()) {
            cqivVar.a(new aokh(), antvVar2.i());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<antv> a() {
        return jgi.d(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.dU(irh.c()), cqgr.dB(irh.c()), jgi.e(irh.c()), cqgr.x(irn.G()), iue.c(antf.a), cqgr.cW(cqgr.q(antg.a)), cqgr.cr(true), cqgr.dn(cqgr.s(anth.a)), cqgr.ck(C()));
    }
}
