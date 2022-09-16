package defpackage;

import java.security.InvalidParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: yxd  reason: default package */
/* loaded from: classes4.dex */
public final class yxd {
    private static final ThreadLocal d = new ThreadLocal();
    public final yxa[] a;
    public final List b = new CopyOnWriteArrayList();
    public final AtomicReference c;
    private final yxe e;
    private final String f;
    private volatile aypg g;

    public yxd(yxe yxeVar, String str) {
        this.e = yxeVar;
        this.f = str;
        snc sncVar = null;
        if (yxeVar.a) {
            this.c = new AtomicReference();
            sncVar = yxeVar.e;
        } else {
            this.c = null;
        }
        this.a = new yxa[]{new yxa(yxeVar.c(), sncVar), new yxa((Executor) yxeVar.d.get(), sncVar)};
    }

    public static yxb a() {
        Deque deque = (Deque) d.get();
        if (deque == null) {
            return null;
        }
        return (yxb) deque.peek();
    }

    public static yxc b(int i) {
        return new yxc(i, aynr.f());
    }

    public static yxc c(int i, aynr aynrVar) {
        return new yxc(i, aynrVar);
    }

    public static void j(yxb yxbVar) {
        Deque<yxb> deque = (Deque) d.get();
        if (deque == null || deque.isEmpty() || yxbVar != deque.peek()) {
            yxj yxjVar = yxbVar.d;
            if (yxjVar == null) {
                return;
            }
            StringBuilder sb = new StringBuilder("Invalid popCurrentThreadTask. ");
            if (deque == null) {
                sb.append("tasks=null");
            } else {
                sb.append("task:");
                sb.append(yxbVar.b);
                sb.append(" not first in: ");
                for (yxb yxbVar2 : deque) {
                    sb.append(yxbVar2.b);
                }
            }
            yxjVar.g = new InvalidParameterException(sb.toString());
            return;
        }
        deque.pop();
    }

    public static void k(yxb yxbVar) {
        ThreadLocal threadLocal = d;
        Deque deque = (Deque) threadLocal.get();
        if (deque == null) {
            deque = new ArrayDeque();
            threadLocal.set(deque);
        }
        deque.push(yxbVar);
    }

    public final aynr d() {
        yxa[] yxaVarArr = this.a;
        return aynr.y(yxaVarArr[0].b, yxaVarArr[1].b);
    }

    public final void e(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.e.a && this.c.get() == null) {
            final yxj yxjVar = new yxj(this.f, this.a[i].k, 4);
            if (this.c.compareAndSet(null, yxjVar)) {
                yxjVar.b();
                d().S(new aypv() { // from class: ywv
                    @Override // defpackage.aypv
                    public final void a() {
                        yxj.this.a();
                    }
                }, new ayqb() { // from class: ywz
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        yxj yxjVar2 = yxj.this;
                        yxjVar2.g = (Throwable) obj;
                        yxjVar2.a();
                    }
                });
            }
        }
        this.a[i].c(i2);
    }

    public final void f(int i, int i2, Throwable th) {
        if (th != null) {
            this.b.add(th);
        }
        e(0, i2);
        e(1, i);
    }

    public final void g(aynr aynrVar, final int i, final int i2) {
        aynrVar.B(azpj.b(this.e.c())).S(new aypv() { // from class: ywt
            @Override // defpackage.aypv
            public final void a() {
                yxd.this.f(i, i2, null);
            }
        }, new ayqb() { // from class: ywx
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                yxd.this.f(i, i2, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        this.a[0].b.sm();
        this.a[1].b.sm();
    }

    public final void i() {
        this.a[0].i();
        this.a[1].i();
    }

    public final synchronized void l(long j, ayor ayorVar) {
        if (this.g != null) {
            ayqi.c((AtomicReference) this.g);
        }
        this.g = aynr.G(j, TimeUnit.MILLISECONDS, ayorVar).S(new aypv() { // from class: yws
            @Override // defpackage.aypv
            public final void a() {
                yxd.this.h();
            }
        }, new ayqb() { // from class: yww
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                yxd yxdVar = yxd.this;
                yxdVar.b.add((Throwable) obj);
                yxdVar.h();
            }
        });
    }

    public final void m(yxc yxcVar, Throwable th) {
        int i = yxcVar.b;
        if (th != null) {
            this.b.add(th);
            i = 2;
        }
        if (i <= 1) {
            this.a[i].b(yxcVar.c);
            return;
        }
        yxa yxaVar = this.a[this.e.a(i)];
        ArrayList arrayList = yxcVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            yxb yxbVar = (yxb) arrayList.get(i2);
            yxbVar.b(yxaVar, false);
            if (i == 6) {
                yxbVar.run();
                ((ykv) this.e.l.get()).a();
            } else if (i == 3) {
                ((Executor) this.e.j.get()).execute(yxbVar);
            } else if (i != 4) {
                yxaVar.a.execute(yxbVar);
            } else {
                ((Executor) this.e.k.get()).execute(yxbVar);
            }
        }
    }

    public final void n(ayor ayorVar, yxc... yxcVarArr) {
        int i = 0;
        int i2 = 0;
        for (final yxc yxcVar : yxcVarArr) {
            if (!yxcVar.c.isEmpty()) {
                if (yxcVar.b != 6) {
                    yxcVar.a.B(ayorVar).S(new aypv() { // from class: ywu
                        @Override // defpackage.aypv
                        public final void a() {
                            yxd.this.m(yxcVar, null);
                        }
                    }, new ayqb() { // from class: ywy
                        @Override // defpackage.ayqb
                        public final void a(Object obj) {
                            yxd.this.m(yxcVar, (Throwable) obj);
                        }
                    });
                }
                if (this.e.a(yxcVar.b) == 0) {
                    i += yxcVar.c.size();
                } else {
                    i2 += yxcVar.c.size();
                }
            }
        }
        this.a[0].e(i);
        this.a[1].e(i2);
        for (yxc yxcVar2 : yxcVarArr) {
            if (yxcVar2.b == 6 && !yxcVar2.c.isEmpty()) {
                m(yxcVar2, null);
            }
        }
    }
}
