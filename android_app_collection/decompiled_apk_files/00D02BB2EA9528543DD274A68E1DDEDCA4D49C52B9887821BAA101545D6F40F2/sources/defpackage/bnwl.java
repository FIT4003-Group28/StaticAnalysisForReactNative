package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnwl  reason: default package */
/* loaded from: classes3.dex */
public final class bnwl {
    public final bnvw a;
    public volatile boolean b;
    private final bvrb c;
    private boolean d;
    private int f = 3;
    private long e = 0;

    public bnwl(bvrb bvrbVar, bnvw bnvwVar) {
        dbsk.s(bvrbVar);
        this.c = bvrbVar;
        dbsk.s(bnvwVar);
        this.a = bnvwVar;
    }

    public final synchronized void a(bnwd bnwdVar) {
        dbsk.l(!this.d);
        dbsk.l(!this.b);
        this.d = true;
        this.c.b(new bnwk(this, bnwdVar), bvrj.BACKGROUND_THREADPOOL);
    }

    public final synchronized void b() {
        this.f = 1;
        notifyAll();
    }

    public final synchronized void c() {
        this.b = true;
        notifyAll();
    }

    public final synchronized boolean d() {
        while (!this.b && this.f == 3) {
            try {
                wait();
            } catch (InterruptedException unused) {
                return false;
            }
        }
        return !this.b;
    }

    public final synchronized void e() {
        this.e++;
        if (this.f == 2) {
            this.f = 3;
        }
        notifyAll();
    }

    public final synchronized void f() {
        long currentTimeMillis = System.currentTimeMillis();
        while (!this.b) {
            long currentTimeMillis2 = 1000 - (System.currentTimeMillis() - currentTimeMillis);
            if (currentTimeMillis2 <= 0) {
                return;
            }
            try {
                wait(currentTimeMillis2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
