package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dfcq  reason: default package */
/* loaded from: classes6.dex */
public final class dfcq implements dfcn {
    public static final dyes<dfcq> b = dyes.a("com.google.frameworks.client.data.android.metrics.MutableMetricsContext");
    public final dews<?, ?> c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicInteger f = new AtomicInteger(0);
    public final AtomicInteger g = new AtomicInteger(0);
    public final AtomicInteger h = new AtomicInteger(0);
    public final AtomicInteger i = new AtomicInteger(-1);
    public final ConcurrentLinkedQueue<Long> j = new ConcurrentLinkedQueue<>();
    public final ConcurrentLinkedQueue<Long> k = new ConcurrentLinkedQueue<>();
    public final AtomicLong l = new AtomicLong(-1);
    public final AtomicReference<dyiy> m = new AtomicReference<>(null);

    public dfcq(dews<?, ?> dewsVar) {
        this.c = dewsVar;
    }

    @Override // defpackage.dfcn
    public final int a() {
        return this.i.get();
    }

    @Override // defpackage.dfcn
    public final dcdc<Long> b() {
        return dcdc.r(this.j);
    }

    @Override // defpackage.dfcn
    public final dcdc<Long> c() {
        return dcdc.r(this.k);
    }

    public final void d() {
        dbsk.m(!this.e.getAndSet(true), "Already recorded cache lookup.");
    }
}
