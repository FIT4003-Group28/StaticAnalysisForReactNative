package defpackage;
/* compiled from: PG */
/* renamed from: azgv  reason: default package */
/* loaded from: classes2.dex */
public final class azgv extends ayoi implements ayrl {
    private final Object a;

    public azgv(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ayrl, java.util.concurrent.Callable
    public final Object call() {
        return this.a;
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        azic azicVar = new azic(ayomVar, this.a);
        ayomVar.sj(azicVar);
        azicVar.run();
    }
}
