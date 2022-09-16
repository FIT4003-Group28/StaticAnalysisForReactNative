package defpackage;

import android.os.SystemClock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rii  reason: default package */
/* loaded from: classes4.dex */
public abstract class rii implements Runnable {
    final long f;
    final long g;
    final boolean h;
    final /* synthetic */ rir i;

    public rii(rir rirVar) {
        this(rirVar, true);
    }

    public abstract void a();

    protected void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.i.e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            this.i.a(e, false, this.h);
            b();
        }
    }

    public rii(rir rirVar, boolean z) {
        this.i = rirVar;
        this.f = System.currentTimeMillis();
        this.g = SystemClock.elapsedRealtime();
        this.h = z;
    }
}
