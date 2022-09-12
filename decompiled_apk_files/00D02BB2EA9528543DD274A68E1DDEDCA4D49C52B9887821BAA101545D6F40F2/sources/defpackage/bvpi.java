package defpackage;
/* compiled from: PG */
/* renamed from: bvpi  reason: default package */
/* loaded from: classes.dex */
public final class bvpi {
    private int a;
    private final Runnable b;

    public bvpi(int i, Runnable runnable) {
        dbsk.a(i > 0);
        this.a = i;
        this.b = runnable;
    }

    public final void a() {
        synchronized (this) {
            int i = this.a;
            if (i > 0) {
                int i2 = i - 1;
                this.a = i2;
                if (i2 != 0) {
                    return;
                }
                this.b.run();
            }
        }
    }
}
