package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akxm  reason: default package */
/* loaded from: classes2.dex */
public abstract class akxm implements akxi {
    private final akuh a;
    final /* synthetic */ akxn b;
    private final AtomicInteger c = new AtomicInteger(1);
    private boolean d = false;

    public akxm(akxn akxnVar, akuh akuhVar) {
        this.b = akxnVar;
        this.a = akuhVar;
    }

    @Override // defpackage.akxi
    public final akuh a() {
        boolean z = true;
        dbsk.l(!this.d);
        if (this.c.get() <= 0) {
            z = false;
        }
        dbsk.l(z);
        return this.a;
    }

    @Override // defpackage.akxi
    public final void b() {
        synchronized (this.b) {
            dbsk.l(!this.d);
            if (this.c.decrementAndGet() == 0) {
                this.b.a.j(this.a);
                this.d = true;
                c();
            }
        }
    }

    protected abstract void c();

    public final void d() {
        boolean z = true;
        dbsk.l(!this.d);
        if (this.c.incrementAndGet() <= 1) {
            z = false;
        }
        dbsk.l(z);
    }
}
