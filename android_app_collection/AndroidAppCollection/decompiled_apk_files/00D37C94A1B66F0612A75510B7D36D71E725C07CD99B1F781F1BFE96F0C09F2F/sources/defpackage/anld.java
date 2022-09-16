package defpackage;
/* compiled from: PG */
/* renamed from: anld  reason: default package */
/* loaded from: classes.dex */
final class anld extends ania implements Runnable {
    private final Runnable a;

    public anld(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anie
    public final String c() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            e(th);
            throw amqs.a(th);
        }
    }
}
