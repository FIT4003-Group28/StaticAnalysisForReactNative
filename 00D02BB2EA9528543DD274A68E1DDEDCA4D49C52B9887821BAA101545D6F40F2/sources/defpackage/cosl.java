package defpackage;

import android.os.SystemClock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cosl  reason: default package */
/* loaded from: classes5.dex */
public abstract class cosl implements Runnable {
    final long f;
    final long g;
    final boolean h;
    final /* synthetic */ cosu i;

    public cosl(cosu cosuVar) {
        this(cosuVar, true);
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        if (this.i.d) {
            return;
        }
        try {
            a();
        } catch (Exception e) {
            this.i.b(e, false, this.h);
        }
    }

    public cosl(cosu cosuVar, boolean z) {
        this.i = cosuVar;
        this.f = System.currentTimeMillis();
        this.g = SystemClock.elapsedRealtime();
        this.h = z;
    }
}
