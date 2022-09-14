package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e5 extends Thread {

    /* renamed from: b  reason: collision with root package name */
    private final Object f7268b;

    /* renamed from: c  reason: collision with root package name */
    private final BlockingQueue<b5<?>> f7269c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7270d = false;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ a5 f7271e;

    public e5(a5 a5Var, String str, BlockingQueue<b5<?>> blockingQueue) {
        this.f7271e = a5Var;
        com.google.android.gms.common.internal.s.a(str);
        com.google.android.gms.common.internal.s.a(blockingQueue);
        this.f7268b = new Object();
        this.f7269c = blockingQueue;
        setName(str);
    }

    private final void a(InterruptedException interruptedException) {
        this.f7271e.c().v().a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    private final void b() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        e5 e5Var;
        e5 e5Var2;
        obj = this.f7271e.i;
        synchronized (obj) {
            if (!this.f7270d) {
                semaphore = this.f7271e.j;
                semaphore.release();
                obj2 = this.f7271e.i;
                obj2.notifyAll();
                e5Var = this.f7271e.f7160c;
                if (this == e5Var) {
                    this.f7271e.f7160c = null;
                } else {
                    e5Var2 = this.f7271e.f7161d;
                    if (this == e5Var2) {
                        this.f7271e.f7161d = null;
                    } else {
                        this.f7271e.c().s().a("Current scheduler thread is neither worker nor network");
                    }
                }
                this.f7270d = true;
            }
        }
    }

    public final void a() {
        synchronized (this.f7268b) {
            this.f7268b.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        Semaphore semaphore;
        boolean z2 = false;
        while (!z2) {
            try {
                semaphore = this.f7271e.j;
                semaphore.acquire();
                z2 = true;
            } catch (InterruptedException e2) {
                a(e2);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                b5<?> poll = this.f7269c.poll();
                if (poll == null) {
                    synchronized (this.f7268b) {
                        if (this.f7269c.peek() == null) {
                            z = this.f7271e.k;
                            if (!z) {
                                try {
                                    this.f7268b.wait(30000L);
                                } catch (InterruptedException e3) {
                                    a(e3);
                                }
                            }
                        }
                    }
                    obj = this.f7271e.i;
                    synchronized (obj) {
                        if (this.f7269c.peek() == null) {
                            break;
                        }
                    }
                } else {
                    Process.setThreadPriority(poll.f7189c ? threadPriority : 10);
                    poll.run();
                }
            }
            if (this.f7271e.l().a(r.y0)) {
                b();
            }
        } finally {
            b();
        }
    }
}
