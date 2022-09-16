package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: ggw  reason: default package */
/* loaded from: classes3.dex */
public final class ggw {
    public Runnable a;
    private final Handler b;
    private final Runnable c;

    public ggw(Handler handler) {
        handler.getClass();
        this.b = handler;
        this.c = new ggv(this);
    }

    public final synchronized void a() {
        this.b.removeCallbacks(this.c);
        this.a = null;
    }

    public final synchronized void b() {
        this.b.removeCallbacks(this.c);
        this.c.run();
    }

    public final synchronized void c(Runnable runnable, long j) {
        runnable.getClass();
        this.b.removeCallbacks(this.c);
        this.a = runnable;
        this.b.postDelayed(this.c, j);
    }
}
