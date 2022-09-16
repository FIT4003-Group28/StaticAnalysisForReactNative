package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: cloj  reason: default package */
/* loaded from: classes5.dex */
public final class cloj {
    public final cloi a;
    public final clpb b;
    public int c;
    public Object d;
    public final Handler e;
    public final int f;
    public final long g = -9223372036854775807L;
    public final boolean h = true;
    private final cloh i;
    private boolean j;
    private boolean k;
    private boolean l;

    public cloj(cloh clohVar, cloi cloiVar, clpb clpbVar, int i, Handler handler) {
        this.i = clohVar;
        this.a = cloiVar;
        this.b = clpbVar;
        this.e = handler;
        this.f = i;
    }

    public final synchronized void a(boolean z) {
        this.k = z | this.k;
        this.l = true;
        notifyAll();
    }

    public final void b() {
        cmmn.c(!this.j);
        cmmn.a(true);
        this.j = true;
        this.i.a(this);
    }

    public final void c(Object obj) {
        cmmn.c(!this.j);
        this.d = obj;
    }

    public final void d(int i) {
        cmmn.c(!this.j);
        this.c = i;
    }

    public final synchronized void e() {
        f();
    }

    final synchronized void f() {
        cmmn.c(this.j);
        cmmn.c(this.e.getLooper().getThread() != Thread.currentThread());
        long j = 2000;
        long elapsedRealtime = SystemClock.elapsedRealtime() + 2000;
        while (!this.l) {
            if (j > 0) {
                wait(j);
                j = elapsedRealtime - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
    }

    public final synchronized void g() {
    }
}
