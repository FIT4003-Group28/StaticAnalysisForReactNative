package defpackage;
/* compiled from: PG */
/* renamed from: azbt  reason: default package */
/* loaded from: classes2.dex */
public final class azbt extends ayoc implements ayrl {
    final Object a;

    public azbt(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ayoc
    protected final void Y(ayod ayodVar) {
        ayodVar.sj(ayqj.INSTANCE);
        ayodVar.sh(this.a);
    }

    @Override // defpackage.ayrl, java.util.concurrent.Callable
    public final Object call() {
        return this.a;
    }
}
