package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: axin  reason: default package */
/* loaded from: classes2.dex */
public final class axin {
    public final Handler a;
    public final Runnable b;
    public long c;

    public axin(Handler handler, Runnable runnable) {
        handler.getClass();
        runnable.getClass();
        this.a = handler;
        this.b = new axim(this, runnable, handler);
    }

    public final void a(final long j) {
        this.a.post(new Runnable() { // from class: axil
            @Override // java.lang.Runnable
            public final void run() {
                axin axinVar = axin.this;
                long j2 = j;
                axinVar.c = j2;
                axinVar.a.postDelayed(axinVar.b, j2);
            }
        });
    }

    public final void b() {
        this.a.removeCallbacks(this.b);
        this.a.post(new Runnable() { // from class: axik
            @Override // java.lang.Runnable
            public final void run() {
                axin axinVar = axin.this;
                axinVar.a.removeCallbacks(axinVar.b);
            }
        });
    }
}
