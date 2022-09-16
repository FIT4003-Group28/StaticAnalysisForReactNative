package defpackage;

import java.security.InvalidParameterException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: PG */
/* renamed from: yxb  reason: default package */
/* loaded from: classes4.dex */
public final class yxb implements Runnable {
    final Runnable a;
    public final String b;
    public final int c;
    public yxj d;
    public Queue e;
    snc f;
    boolean g;
    boolean h;
    yxa i;

    public yxb(int i, snc sncVar) {
        sncVar.getClass();
        this.b = null;
        this.c = i;
        this.a = null;
        this.i = null;
        this.f = sncVar;
        this.e = new ConcurrentLinkedQueue();
        this.d = new yxj(i, sncVar, 5);
    }

    public yxb(String str, Runnable runnable) {
        this.b = str;
        this.c = -1;
        this.a = runnable;
    }

    private static String c(Object obj) {
        return obj == null ? "null" : "ok";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(yxj yxjVar) {
        Queue queue = this.e;
        if (queue != null) {
            queue.add(yxjVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(yxa yxaVar, boolean z) {
        yxaVar.getClass();
        this.i = yxaVar;
        this.g = z;
        snc sncVar = yxaVar.k;
        if (sncVar != null) {
            this.f = sncVar;
            this.e = new ConcurrentLinkedQueue();
            this.d = new yxj(this.b, this.f, 1);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a == null || this.i == null) {
            if (this.d == null) {
                return;
            }
            String str = this.b;
            if (str == null) {
                str = String.valueOf(this.c);
            }
            this.d.g = new InvalidParameterException(String.format("Task %s, cmd=%s, pool=%s", str, c(this.a), c(this.i)));
            return;
        }
        if (this.d != null) {
            yxd.k(this);
            this.d.b();
        }
        try {
            this.a.run();
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.interrupted();
            }
            yxj yxjVar = this.d;
            if (yxjVar != null) {
                yxjVar.g = e;
            }
        }
        yxj yxjVar2 = this.d;
        if (yxjVar2 != null) {
            yxjVar2.a();
            yxd.j(this);
        }
        yxa yxaVar = this.i;
        synchronized (yxaVar) {
            yxaVar.g -= this.g ? 1 : 0;
            yxaVar.d.add(this);
            yxaVar.f++;
            yxaVar.g();
        }
        if (!this.g) {
            return;
        }
        yxaVar.h();
    }
}
