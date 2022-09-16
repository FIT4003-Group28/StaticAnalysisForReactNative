package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aync  reason: default package */
/* loaded from: classes2.dex */
public final class aync extends anie {
    public final axyg a;

    public aync(axyg axygVar) {
        this.a = axygVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anie
    public final String c() {
        ampp c = akzj.c(this);
        c.b("clientCall", this.a);
        return c.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anie
    public final boolean e(Throwable th) {
        return super.e(th);
    }

    @Override // defpackage.anie
    protected final void m() {
        this.a.b("GrpcFuture was cancelled", null);
    }
}
