package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: deit  reason: default package */
/* loaded from: classes.dex */
public final class deit extends dehm<dehn> {
    final /* synthetic */ deiv a;
    private final deff b;

    public deit(deiv deivVar, deff deffVar) {
        this.a = deivVar;
        dbsk.s(deffVar);
        this.b = deffVar;
    }

    @Override // defpackage.dehm
    public final String a() {
        return this.b.toString();
    }

    @Override // defpackage.dehm
    public final /* bridge */ /* synthetic */ dehn c() {
        dehn a = this.b.a();
        dbsk.w(a, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.b);
        return a;
    }

    @Override // defpackage.dehm
    public final boolean d() {
        return this.a.isDone();
    }

    @Override // defpackage.dehm
    public final /* bridge */ /* synthetic */ void f(dehn dehnVar, Throwable th) {
        dehn dehnVar2 = dehnVar;
        if (th == null) {
            this.a.p(dehnVar2);
        } else {
            this.a.k(th);
        }
    }
}
