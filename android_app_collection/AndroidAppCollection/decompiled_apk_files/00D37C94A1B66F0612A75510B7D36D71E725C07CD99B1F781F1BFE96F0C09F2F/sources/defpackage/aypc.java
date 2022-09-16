package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: aypc  reason: default package */
/* loaded from: classes2.dex */
final class aypc implements Runnable, aypg {
    private final Handler a;
    private final Runnable b;
    private volatile boolean c;

    public aypc(Handler handler, Runnable runnable) {
        this.a = handler;
        this.b = runnable;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.a.removeCallbacks(this);
        this.c = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            azqc.d(th);
        }
    }
}
