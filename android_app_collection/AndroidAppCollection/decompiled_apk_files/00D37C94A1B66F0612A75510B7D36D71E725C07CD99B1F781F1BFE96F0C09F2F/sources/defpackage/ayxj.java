package defpackage;
/* compiled from: PG */
/* renamed from: ayxj  reason: default package */
/* loaded from: classes2.dex */
public final class ayxj extends aynx implements ayrl {
    private final Object b;

    public ayxj(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        bameVar.f(new azod(bameVar, this.b));
    }

    @Override // defpackage.ayrl, java.util.concurrent.Callable
    public final Object call() {
        return this.b;
    }
}
