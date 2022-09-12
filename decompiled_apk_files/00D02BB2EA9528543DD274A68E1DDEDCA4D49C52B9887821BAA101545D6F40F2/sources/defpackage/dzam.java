package defpackage;
/* compiled from: PG */
/* renamed from: dzam  reason: default package */
/* loaded from: classes6.dex */
public final class dzam extends dzal<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    public dzam(Runnable runnable) {
        super(runnable);
    }

    @Override // defpackage.dzal
    protected final /* bridge */ /* synthetic */ void b(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        boolean z = get() == null;
        String valueOf = String.valueOf(get());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("RunnableDisposable(disposed=");
        sb.append(z);
        sb.append(", ");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
