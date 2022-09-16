package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dega  reason: default package */
/* loaded from: classes.dex */
public final class dega extends degc<dehn> {
    final /* synthetic */ degd a;
    private final deff c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dega(degd degdVar, deff deffVar, Executor executor) {
        super(degdVar, executor);
        this.a = degdVar;
        dbsk.s(deffVar);
        this.c = deffVar;
    }

    @Override // defpackage.dehm
    public final String a() {
        return this.c.toString();
    }

    @Override // defpackage.degc
    public final /* bridge */ /* synthetic */ void b(dehn dehnVar) {
        this.a.p(dehnVar);
    }

    @Override // defpackage.dehm
    public final /* bridge */ /* synthetic */ Object c() {
        dehn a = this.c.a();
        dbsk.w(a, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.c);
        return a;
    }
}
