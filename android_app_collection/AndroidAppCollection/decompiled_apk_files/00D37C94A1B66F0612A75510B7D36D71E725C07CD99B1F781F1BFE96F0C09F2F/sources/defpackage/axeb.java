package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: axeb  reason: default package */
/* loaded from: classes2.dex */
public final class axeb implements axee {
    private final Runnable a;
    private final Runnable b;
    private final Handler c;

    public axeb(Runnable runnable, Runnable runnable2, Handler handler) {
        this.a = runnable;
        this.b = runnable2;
        this.c = handler;
    }

    @Override // defpackage.axee
    public final void a() {
        this.c.removeCallbacks(this.a);
        Runnable runnable = this.b;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
    }

    @Override // defpackage.axee
    public final void b() {
        Runnable runnable = this.b;
        if (runnable != null) {
            this.c.post(runnable);
        }
    }

    @Override // defpackage.axee
    public final void c() {
        this.c.post(this.a);
    }
}
