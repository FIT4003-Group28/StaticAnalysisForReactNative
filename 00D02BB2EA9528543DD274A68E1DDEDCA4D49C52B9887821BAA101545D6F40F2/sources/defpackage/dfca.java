package defpackage;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dfca  reason: default package */
/* loaded from: classes6.dex */
final class dfca<RespT> extends dyga<RespT> {
    public final dcdc<dcdc<dfbd>> a;
    public final Queue<dfbz> b;
    public final Set<dfbd> c;
    public int d;
    public boolean e;
    public boolean f;
    public dyhw g;
    public dyjb h;
    public dyhw i;
    private final Executor k;
    private final LinkedHashMap<dfbd, dehn<?>> l;
    private final LinkedHashMap<dfbd, dehn<?>> m;
    private boolean n;

    public dfca(dyew<RespT> dyewVar, dcdc<dcdc<dfbd>> dcdcVar, Set<dfbd> set) {
        super(dyewVar);
        this.k = dehx.b(dege.a);
        this.l = new LinkedHashMap<>();
        this.b = new ArrayDeque();
        this.m = new LinkedHashMap<>();
        this.a = dcdcVar;
        this.d = dcdcVar.size();
        this.c = set;
    }

    @Override // defpackage.dyir, defpackage.dyew
    public final void a(dyhw dyhwVar) {
        this.g = dyhwVar;
        this.k.execute(new Runnable(this) { // from class: dfbw
            private final dfca a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dfca dfcaVar = this.a;
                dfbb dfbbVar = new dfbb(dfcaVar.g);
                for (List list : dchl.l(dfcaVar.a.subList(0, dfcaVar.d))) {
                    dfcaVar.d--;
                    for (dfbd dfbdVar : dchl.l(list)) {
                        if (dfcaVar.c.contains(dfbdVar)) {
                            try {
                                int i = dfbdVar.d(dfbbVar).b;
                            } catch (Throwable th) {
                                dfcaVar.h = dyjb.c(th);
                                dfcaVar.i = new dyhw();
                                dfcaVar.g();
                                return;
                            }
                        }
                    }
                    if (dfcaVar.d()) {
                        return;
                    }
                }
                dfcaVar.j.a(dfcaVar.g);
                dfcaVar.e = true;
                dfcaVar.e();
            }
        });
    }

    @Override // defpackage.dyir, defpackage.dyew
    public final void b(final dyjb dyjbVar, final dyhw dyhwVar) {
        this.k.execute(new Runnable(this, dyjbVar, dyhwVar) { // from class: dfby
            private final dfca a;
            private final dyjb b;
            private final dyhw c;

            {
                this.a = this;
                this.b = dyjbVar;
                this.c = dyhwVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dfca dfcaVar = this.a;
                dyjb dyjbVar2 = this.b;
                dyhw dyhwVar2 = this.c;
                dfcaVar.h = dyjbVar2;
                dfcaVar.i = dyhwVar2;
                dfcaVar.f = true;
                dfcaVar.f();
            }
        });
    }

    @Override // defpackage.dygb, defpackage.dyew
    public final void c(final RespT respt) {
        this.k.execute(new Runnable(this, respt) { // from class: dfbx
            private final dfca a;
            private final Object b;

            {
                this.a = this;
                this.b = respt;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dfca dfcaVar = this.a;
                dfcaVar.b.add(new dfbz(this.b, dfcaVar.a.size()));
                dfcaVar.e();
            }
        });
    }

    public final boolean d() {
        return !this.l.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        if (!this.e) {
            return;
        }
        for (dfbz dfbzVar : this.b) {
            for (List list : dchl.l(this.a.subList(0, dfbzVar.c))) {
                for (dfbd dfbdVar : dchl.l(list)) {
                    if (this.c.contains(dfbdVar)) {
                        dbsk.m(dfbzVar.a instanceof dssj, "Only MessageLite is supported");
                        try {
                            int i = dfbdVar.e(new dfbc((dssj) dfbzVar.a)).b;
                        } catch (Throwable th) {
                            this.h = dyjb.c(th);
                            this.i = new dyhw();
                            g();
                            this.n = true;
                            return;
                        }
                    }
                }
                if (dfbzVar.a()) {
                    return;
                }
                dfbzVar.c--;
            }
        }
        while (!this.b.isEmpty()) {
            dfbz peek = this.b.peek();
            if (peek.a() || peek.c != 0) {
                break;
            }
            this.j.c(this.b.poll().a);
        }
        f();
    }

    public final void f() {
        if (d() || !this.b.isEmpty() || !this.f || this.n) {
            return;
        }
        g();
    }

    public final void g() {
        for (List list : dchl.l(this.a)) {
            for (dfbd dfbdVar : dchl.l(list)) {
                dfay dfayVar = new dfay(this.h, this.i);
                if (this.c.contains(dfbdVar)) {
                    try {
                        int i = dfbdVar.f(dfayVar).b;
                    } catch (Throwable th) {
                        this.h = dyjb.c(th);
                        this.i = new dyhw();
                    }
                }
            }
        }
        if (this.m.isEmpty()) {
            this.j.b(this.h, this.i);
        }
    }
}
