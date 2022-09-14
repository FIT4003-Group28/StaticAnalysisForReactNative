package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvqr  reason: default package */
/* loaded from: classes.dex */
public final class bvqr implements Executor {
    private final Executor a;
    private final Object b;
    private final List<Runnable> c;
    private volatile boolean d;

    public bvqr(Executor executor) {
        this(executor, false);
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        synchronized (this.b) {
            for (Runnable runnable : this.c) {
                this.a.execute(runnable);
            }
            this.c.clear();
            this.d = false;
        }
    }

    public final void b() {
        synchronized (this.b) {
            this.d = true;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (!this.d) {
            this.a.execute(runnable);
            return;
        }
        synchronized (this.b) {
            if (this.d) {
                this.c.add(runnable);
            } else {
                this.a.execute(runnable);
            }
        }
    }

    public bvqr(Executor executor, boolean z) {
        this.b = new Object();
        this.c = new ArrayList();
        dbsk.s(executor);
        this.a = executor;
        this.d = z;
    }
}
