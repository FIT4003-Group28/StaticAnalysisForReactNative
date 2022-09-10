package defpackage;

import java.util.concurrent.Executor;
/* renamed from: aqil  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aqil {
    private final aqis a;
    private final Executor b;
    private final cqhn c;

    public aqil(aqis aqisVar, Executor executor, cqhn cqhnVar) {
        this.a = aqisVar;
        this.b = executor;
        this.c = cqhnVar;
    }

    public final void a(aqea aqeaVar) {
        aqis aqisVar = this.a;
        Executor executor = this.b;
        aqisVar.d = aqeaVar;
        executor.execute(new apzx(aqisVar));
    }
}
