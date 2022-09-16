package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aiww  reason: default package */
/* loaded from: classes.dex */
public final class aiww implements aiwj {
    private final afyf a;
    private final afyf b;

    public aiww(Executor executor, yqh yqhVar, zie zieVar, snc sncVar, ykg ykgVar) {
        aftu aftuVar = new aftu(zieVar);
        this.a = afyk.b(ykgVar, afxe.b(executor, new afxv(yqhVar, aftuVar, aftuVar)), sncVar, TimeUnit.HOURS.toMillis(2L));
        this.b = afxe.b(executor, new afxv(yqhVar, aftuVar, new aftl()));
    }

    @Override // defpackage.aiwj
    public final void a(aiwi aiwiVar, yiw yiwVar) {
        zgh.m(aiwiVar.a.i());
        this.a.a(aiwiVar, yiwVar);
    }

    @Override // defpackage.aiwj
    public final void b(aiwi aiwiVar, yiw yiwVar) {
        zgh.m(aiwiVar.a.i());
        this.b.a(aiwiVar, yiwVar);
    }
}
