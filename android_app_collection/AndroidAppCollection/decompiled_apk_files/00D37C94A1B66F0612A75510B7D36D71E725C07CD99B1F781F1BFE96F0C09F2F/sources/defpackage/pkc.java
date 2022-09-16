package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: pkc  reason: default package */
/* loaded from: classes4.dex */
public final class pkc {
    public final pkb a;
    public int b;
    public Object c;
    public final Looper d;
    public final long e = -9223372036854775807L;
    private final pka f;
    private boolean g;
    private boolean h;
    private boolean i;

    public pkc(pka pkaVar, pkb pkbVar, Looper looper) {
        this.f = pkaVar;
        this.a = pkbVar;
        this.d = looper;
    }

    public final synchronized void a(boolean z) {
        this.h = z | this.h;
        this.i = true;
        notifyAll();
    }

    public final synchronized void b(long j) {
        ptx.e(this.g);
        ptx.e(this.d.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (!this.i) {
            if (j > 0) {
                wait(j);
                j = elapsedRealtime - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
    }

    public final synchronized void c() {
    }

    public final void d() {
        ptx.e(!this.g);
        ptx.c(true);
        this.g = true;
        this.f.d(this);
    }

    public final void e(Object obj) {
        ptx.e(!this.g);
        this.c = obj;
    }

    public final void f(int i) {
        ptx.e(!this.g);
        this.b = i;
    }
}
