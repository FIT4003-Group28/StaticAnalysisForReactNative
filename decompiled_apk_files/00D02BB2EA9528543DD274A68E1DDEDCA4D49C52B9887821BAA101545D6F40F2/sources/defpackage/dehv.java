package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dehv  reason: default package */
/* loaded from: classes.dex */
public final class dehv extends deeo<Void> implements Runnable {
    private final Runnable a;

    public dehv(Runnable runnable) {
        dbsk.s(runnable);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            k(th);
            throw dbue.d(th);
        }
    }
}
