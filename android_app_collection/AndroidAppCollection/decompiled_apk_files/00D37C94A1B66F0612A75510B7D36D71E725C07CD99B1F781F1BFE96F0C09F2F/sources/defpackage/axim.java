package defpackage;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axim  reason: default package */
/* loaded from: classes2.dex */
public final class axim implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ Handler b;
    final /* synthetic */ axin c;

    public axim(axin axinVar, Runnable runnable, Handler handler) {
        this.c = axinVar;
        this.a = runnable;
        this.b = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
        this.b.removeCallbacks(this);
        this.b.postDelayed(this, this.c.c);
    }
}
