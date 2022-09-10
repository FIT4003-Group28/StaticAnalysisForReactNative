package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: awmu  reason: default package */
/* loaded from: classes3.dex */
public final class awmu {
    public final dehp a;
    public final dehn<?> b;
    private final int c;
    private final int d;
    private final awmp e;
    private final awmi<awms<?>> f = new awmi<>();
    private int g;

    public awmu(int i, int i2, awmp awmpVar, dehp dehpVar, dehn<?> dehnVar) {
        this.c = i;
        this.d = i2;
        this.e = awmpVar;
        this.a = dehpVar;
        this.b = dehnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dzsi
    private final synchronized awms<?> f(awms<?> awmsVar) {
        awmi<awms<?>> awmiVar = this.f;
        awmiVar.a++;
        awmiVar.b++;
        final awmh<T> awmhVar = new awmh<>(awmsVar);
        awmhVar.c = null;
        awmh awmhVar2 = awmiVar.c;
        awmhVar.b = awmhVar2;
        if (awmhVar2 != null) {
            awmhVar2.c = awmhVar;
        }
        awmiVar.c = awmhVar;
        if (awmiVar.d == null) {
            awmiVar.d = awmhVar;
        }
        g();
        if (!this.f.c(awmhVar)) {
            final deig<?> deigVar = awmsVar.b;
            deigVar.Pk(new Runnable(this, deigVar, awmhVar) { // from class: awml
                private final awmu a;
                private final dehn b;
                private final awmh c;

                {
                    this.a = this;
                    this.b = deigVar;
                    this.c = awmhVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    awmu awmuVar = this.a;
                    dehn dehnVar = this.b;
                    awmh<awms<?>> awmhVar3 = this.c;
                    if (dehnVar.isCancelled()) {
                        awmuVar.c(awmhVar3);
                    }
                }
            }, this.a);
        }
        awmi<awms<?>> awmiVar2 = this.f;
        if (awmiVar2.a > this.d) {
            return awmiVar2.a();
        }
        return null;
    }

    private final void g() {
        int i;
        awms<?> b;
        while (this.b.isDone() && this.f.c != null && (i = this.g) < this.c) {
            this.g = i + 1;
            dehp dehpVar = this.a;
            awmp awmpVar = awmp.LIFO;
            int ordinal = this.e.ordinal();
            if (ordinal == 0) {
                awmi<awms<?>> awmiVar = this.f;
                b = awmiVar.b(awmiVar.c);
            } else if (ordinal == 1) {
                b = this.f.a();
            } else {
                throw new AssertionError(this.e);
            }
            dehpVar.execute(b);
        }
    }

    public final <R> dehn<R> a(String str, awmn<R> awmnVar) {
        SystemClock.elapsedRealtime();
        awms<?> awmsVar = new awms<>(this, awmnVar);
        awms<?> f = f(awmsVar);
        if (f != null) {
            f.b.k(new awmq());
        }
        return awmsVar.b;
    }

    public final <R> dehn<R> b(String str, final awmt<R> awmtVar) {
        return a(str, new awmn(awmtVar) { // from class: awmk
            private final awmt a;

            {
                this.a = awmtVar;
            }

            @Override // defpackage.awmn
            public final dehn a(dehp dehpVar) {
                return dehpVar.c(this.a);
            }
        });
    }

    public final synchronized void c(awmh<awms<?>> awmhVar) {
        awmi<awms<?>> awmiVar = this.f;
        if (awmiVar.c(awmhVar)) {
            return;
        }
        awmiVar.b(awmhVar);
    }

    public final synchronized void d() {
        this.g--;
        g();
    }

    public final synchronized void e() {
        g();
    }
}
