package defpackage;

import android.content.Context;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: bbje  reason: default package */
/* loaded from: classes3.dex */
public final class bbje extends cqiw<bbnf> {
    public static final cqjg a = cqjg.a();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bbnf bbnfVar, Context context, cqiv cqivVar) {
        cqiw bbjdVar;
        Collection a2;
        bbnf bbnfVar2 = bbnfVar;
        if (bbnfVar2.c().booleanValue()) {
            bbjdVar = new bbiy();
            a2 = bbnfVar2.b();
        } else {
            bbjdVar = new bbjd();
            a2 = bbnfVar2.a();
        }
        cqivVar.f(bbjdVar, a2);
    }

    @Override // defpackage.cqiw
    public final cqmj<bbnf> a() {
        return cqgr.gd(cqgr.aT(a), cqgr.cd(-1), cqgr.bp(-2), iue.b(cjtd.a(dtxy.ba)), cqgr.dU(cqrp.d(8.0d)), cqgr.dB(cqrp.d(8.0d)), cqgr.cH(irh.a()), cqgr.dr(1), cqgr.x(ibm.b()), cqgr.ck(C()));
    }
}
