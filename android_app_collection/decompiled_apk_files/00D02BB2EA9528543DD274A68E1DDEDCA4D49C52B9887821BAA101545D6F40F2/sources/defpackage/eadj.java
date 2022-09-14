package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: eadj  reason: default package */
/* loaded from: classes6.dex */
public final class eadj {
    public static final Executor a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), eafa.h("OkHttp ConnectionPool", true));
    public final int b;
    public final long c;
    public final Runnable d;
    public final Deque<eafg> e;
    public final eafh f;
    public boolean g;

    public eadj() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.d = new eadi(this);
        this.e = new ArrayDeque();
        this.f = new eafh();
        this.b = 5;
        this.c = timeUnit.toNanos(5L);
    }

    @dzsi
    public final void a(eacx eacxVar, eafm eafmVar, eaes eaesVar) {
        for (eafg eafgVar : this.e) {
            if (eafgVar.b(eacxVar, eaesVar)) {
                eafmVar.g(eafgVar, true);
                return;
            }
        }
    }
}
