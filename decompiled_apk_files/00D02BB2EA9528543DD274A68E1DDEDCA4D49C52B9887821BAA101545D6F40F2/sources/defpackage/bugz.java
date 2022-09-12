package defpackage;

import java.util.PriorityQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bugz  reason: default package */
/* loaded from: classes4.dex */
public final class bugz<T> implements bugr<T> {
    public final dehq a;
    public final cqat d;
    public final bugq e;
    private final bugh g;
    public final PriorityQueue<bugp> c = new PriorityQueue<>(10, dcmw.a.g(bugs.a));
    @dzsi
    public dehu f = null;
    public final ExecutorService b = Executors.newSingleThreadExecutor();

    public bugz(dehq dehqVar, bugh bughVar, cqat cqatVar, bugq bugqVar) {
        this.a = dehqVar;
        this.g = bughVar;
        this.d = cqatVar;
        this.e = bugqVar;
    }

    public final void b(final dbsg<bugp> dbsgVar) {
        if (!dbsgVar.a()) {
            return;
        }
        this.b.execute(new Runnable(this, dbsgVar) { // from class: bugu
            private final bugz a;
            private final dbsg b;

            {
                this.a = this;
                this.b = dbsgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.c.remove(this.b.b());
            }
        });
    }

    public final void c(long j) {
        dehu dehuVar = this.f;
        if (dehuVar != null) {
            dehuVar.cancel(true);
        }
        this.f = this.a.d(new Runnable(this) { // from class: bugv
            private final bugz a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final bugz bugzVar = this.a;
                bugzVar.b.execute(new Runnable(bugzVar) { // from class: bugw
                    private final bugz a;

                    {
                        this.a = bugzVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bugp peek;
                        final bugz bugzVar2 = this.a;
                        if (bugzVar2.c.isEmpty()) {
                            bugzVar2.f = null;
                            return;
                        }
                        bugp peek2 = bugzVar2.c.peek();
                        if (peek2 == null) {
                            return;
                        }
                        long j2 = peek2.a;
                        long e = bugzVar2.d.e();
                        if (j2 <= e) {
                            while (j2 <= e) {
                                bugzVar2.c.poll();
                                if (bugzVar2.c.isEmpty() || (peek = bugzVar2.c.peek()) == null) {
                                    break;
                                }
                                j2 = peek.a;
                            }
                            bugzVar2.a.execute(new Runnable(bugzVar2) { // from class: bugx
                                private final bugz a;

                                {
                                    this.a = bugzVar2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.a.e.c();
                                }
                            });
                        }
                        if (bugzVar2.c.isEmpty()) {
                            return;
                        }
                        bugzVar2.c(j2 - e);
                    }
                });
            }
        }, j, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.bugr
    public final void a(Object obj, dehn<?> dehnVar, T t) {
        dbsg dbsgVar;
        final long j = ((buad) t).b.e;
        if (j <= 0 || obj == null) {
            if (obj != null) {
                obj.getClass();
            }
            dbsgVar = dbpy.a;
        } else if (!this.e.a()) {
            dbsgVar = dbpy.a;
        } else {
            final bugp bugpVar = new bugp(this.d.e() + j);
            obj.getClass();
            this.b.execute(new Runnable(this, bugpVar, j) { // from class: bugt
                private final bugz a;
                private final bugp b;
                private final long c;

                {
                    this.a = this;
                    this.b = bugpVar;
                    this.c = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bugz bugzVar = this.a;
                    bugp bugpVar2 = this.b;
                    long j2 = this.c;
                    bugzVar.c.offer(bugpVar2);
                    bugzVar.d.e();
                    if (bugzVar.c.peek() == bugpVar2) {
                        bugzVar.c(j2);
                    }
                }
            });
            dbsgVar = dbsg.i(bugpVar);
        }
        if (dbsgVar.a()) {
            deha.q(dehnVar, new bugy(this, dbsgVar), this.a);
        }
    }
}
