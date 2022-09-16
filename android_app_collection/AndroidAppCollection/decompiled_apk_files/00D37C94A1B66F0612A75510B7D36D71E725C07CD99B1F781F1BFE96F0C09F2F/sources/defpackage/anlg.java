package defpackage;
/* compiled from: PG */
/* renamed from: anlg  reason: default package */
/* loaded from: classes.dex */
public final class anlg implements Runnable {
    final /* synthetic */ Runnable a;
    private final /* synthetic */ int b;

    public anlg(Runnable runnable) {
        this.a = runnable;
    }

    public anlg(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.run();
        } else {
            this.a.run();
        }
    }

    public final String toString() {
        if (this.b == 0) {
            return this.a.toString();
        }
        return this.a.toString();
    }
}
