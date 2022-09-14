package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dfbv  reason: default package */
/* loaded from: classes6.dex */
final class dfbv<ReqT, RespT> extends dyex<ReqT, RespT> {
    public int c;
    public dfbu d;
    public dyew<RespT> e;
    public dyex<ReqT, RespT> h;
    private final dyeu i;
    private final dyib<ReqT, RespT> j;
    private final dcdc<dcdc<dfbd>> k;
    private final Executor l;
    private dyet p;
    private int r;
    private dyhw s;
    public final Set<dehn<?>> a = dcnm.l();
    private final LinkedHashMap<dfbd, dehn<?>> m = new LinkedHashMap<>();
    private final Set<dfbd> n = dcnm.l();
    public boolean f = false;
    public boolean g = false;
    public final Deque<dfbt> b = new ArrayDeque();
    private final Queue<RespT> q = new ArrayDeque();
    private final Queue<ReqT> o = new ArrayDeque();

    public dfbv(dyeu dyeuVar, dyib<ReqT, RespT> dyibVar, dyet dyetVar, dcdc<dcdc<dfbd>> dcdcVar) {
        this.i = dyeuVar;
        this.j = dyibVar;
        this.p = dyetVar;
        this.k = dcdcVar;
        this.d = new dfbu(dcdcVar.size(), 1, 0, 0);
        Executor executor = dyetVar.c;
        final Executor b = dehx.b(executor == null ? dege.a : executor);
        this.l = new Executor(this, b) { // from class: dfbh
            private final dfbv a;
            private final Executor b;

            {
                this.a = this;
                this.b = b;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(final Runnable runnable) {
                final dfbv dfbvVar = this.a;
                this.b.execute(new Runnable(dfbvVar, runnable) { // from class: dfbj
                    private final dfbv a;
                    private final Runnable b;

                    {
                        this.a = dfbvVar;
                        this.b = runnable;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        dfbv dfbvVar2 = this.a;
                        try {
                            this.b.run();
                        } catch (Throwable th) {
                            dyew<RespT> dyewVar = dfbvVar2.e;
                            if (dyewVar == 0) {
                                return;
                            }
                            dyewVar.b(dyjb.c(th), new dyhw());
                            dyex<ReqT, RespT> dyexVar = dfbvVar2.h;
                            if (dyexVar == 0 || dfbvVar2.d.e != 4) {
                                return;
                            }
                            dyexVar.d(null, th);
                        }
                    }
                });
            }
        };
    }

    private final dfaz k(dfaz dfazVar) {
        dyet dyetVar = this.p;
        return dyetVar == dfazVar.b ? dfazVar : l(dyetVar, dfazVar.a, dfazVar.c);
    }

    private final dfaz l(dyet dyetVar, dyhw dyhwVar, String str) {
        dfce dfceVar = dfce.PROCEED;
        dyib<ReqT, RespT> dyibVar = this.j;
        dbsk.s(dyibVar);
        dbsk.s(dyetVar);
        dbsk.s(dyhwVar);
        dbsk.s(str);
        return new dfaz(2, dyibVar, dyetVar, dyhwVar, str);
    }

    private final void m() {
        dfbu dfbuVar;
        dfbu dfbuVar2 = this.d;
        dbsk.m(!(dfbuVar2.e == 4), "UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        int i = dfbuVar2.e;
        if (i == 3) {
            dfbuVar = new dfbu(dfbuVar2.a, 4, dfbuVar2.b, dfbuVar2.c);
        } else if (i != 1 || !dfbuVar2.d) {
            int i2 = dfbuVar2.b;
            int i3 = i2 + 1;
            int i4 = dfbuVar2.a;
            if (i3 < i4) {
                dfbuVar = new dfbu(i4, 1, i3, dfbuVar2.c);
            } else {
                dfbuVar = new dfbu(i4, 3, i2, dfbuVar2.c);
            }
        } else {
            int i5 = dfbuVar2.a;
            int i6 = dfbuVar2.b;
            dfbuVar = new dfbu(i5, 2, i6, i6);
        }
        this.d = dfbuVar;
        dfce dfceVar = dfce.PROCEED;
        int i7 = this.d.e - 1;
        if (i7 == 0) {
            b(this.s);
        } else if (i7 != 2) {
            h();
        } else {
            dyex<ReqT, RespT> a = this.i.a(this.j, this.p);
            this.h = a;
            a.a(this.e, this.s);
            int i8 = this.c;
            if (i8 > 0) {
                this.h.c(i8);
            }
            for (ReqT reqt : this.o) {
                this.h.f(reqt);
            }
            if (this.f && this.b.isEmpty()) {
                this.h.e();
            }
            m();
        }
    }

    private final boolean n(dfcg dfcgVar) {
        dfce dfceVar = dfce.PROCEED;
        int ordinal = dfcgVar.c.ordinal();
        if (ordinal == 0) {
            dyet dyetVar = dfcgVar.f;
            if (dyetVar != null) {
                if (this.d.e != 1) {
                    IllegalStateException illegalStateException = new IllegalStateException("Cannot return proceedWithCallOptions() from message processing methods");
                    this.e.b(dyjb.c(illegalStateException), new dyhw());
                    if (this.d.e == 4) {
                        this.h.d("Interceptor returned invalid outcome", illegalStateException);
                    }
                    return true;
                }
                this.p = dyetVar;
            }
            return false;
        } else if (ordinal == 1) {
            dfcb dfcbVar = dfcgVar.e;
            this.e.b(dfcbVar.a, dfcbVar.b);
            if (this.d.e == 4) {
                this.h.d("Aborted RPC with exception", dfcbVar.a.r);
            }
            this.g = true;
            return true;
        } else if (ordinal == 2) {
            dfcf dfcfVar = dfcgVar.d;
            throw null;
        } else if (ordinal == 3) {
            final dehn<?> d = dfcgVar.d();
            this.a.add(d);
            d.Pk(new Runnable(this, d) { // from class: dfbn
                private final dfbv a;
                private final dehn b;

                {
                    this.a = this;
                    this.b = d;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dfbv dfbvVar = this.a;
                    dfbvVar.a.remove(this.b);
                }
            }, this.l);
            return false;
        } else if (ordinal == 4) {
            this.d.d = true;
            return false;
        } else {
            String valueOf = String.valueOf(dfcgVar.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Unrecognized outcome type: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private final void o(final dfbt dfbtVar, int i, int i2) {
        dbsk.m(dfbtVar.a instanceof dssj, "Only MessageLite is supported");
        final dfba dfbaVar = new dfba((dssj) dfbtVar.a);
        while (i < i2) {
            dcdc<dfbd> dcdcVar = this.k.get(i);
            int size = dcdcVar.size();
            int i3 = 0;
            while (i3 < size) {
                dfbd dfbdVar = dcdcVar.get(i3);
                dfcg c = dfbdVar.c(dfbaVar);
                if (c.c.equals(dfce.CONTINUE_AFTER)) {
                    dehn<?> d = c.d();
                    dfbtVar.b.put(dfbdVar, d);
                    d.Pk(dazv.b(new Runnable(this, dfbaVar, dfbtVar) { // from class: dfbp
                        private final dfbv a;
                        private final dfba b;
                        private final dfbt c;

                        {
                            this.a = this;
                            this.b = dfbaVar;
                            this.c = dfbtVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.i(this.b, this.c);
                        }
                    }), this.l);
                }
                i3++;
                if (n(c)) {
                    return;
                }
            }
            i++;
        }
        dfbtVar.c = i2;
        if (dfbtVar.b.isEmpty()) {
            p();
            j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void p() {
        while (!this.b.isEmpty()) {
            dfbt peek = this.b.peek();
            if (!peek.b.isEmpty() || peek.c != peek.d.d.a) {
                return;
            }
            Object obj = this.b.poll().a;
            if (this.d.e == 4) {
                this.h.f(obj);
            } else {
                this.o.add(obj);
            }
        }
    }

    @Override // defpackage.dyex
    public final void a(dyew<RespT> dyewVar, final dyhw dyhwVar) {
        this.e = new dfcm(new dfca(dyewVar, this.k, this.n));
        this.s = dyhwVar;
        this.l.execute(new Runnable(this, dyhwVar) { // from class: dfbk
            private final dfbv a;
            private final dyhw b;

            {
                this.a = this;
                this.b = dyhwVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(this.b);
            }
        });
    }

    public final void b(dyhw dyhwVar) {
        final dfaz l = l(this.p, dyhwVar, this.i.b());
        dcdc<dfbd> dcdcVar = this.k.get(this.d.b);
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dfbd dfbdVar = dcdcVar.get(i);
            dfcg a = dfbdVar.a(k(l));
            if (a.c.equals(dfce.CONTINUE_AFTER)) {
                dehn<?> d = a.d();
                this.m.put(dfbdVar, d);
                d.Pk(dazv.b(new Runnable(this, l) { // from class: dfbl
                    private final dfbv a;
                    private final dfaz b;

                    {
                        this.a = this;
                        this.b = l;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.g(this.b);
                    }
                }), this.l);
            }
            if (n(a)) {
                return;
            }
            this.n.add(dfbdVar);
        }
        if (this.m.isEmpty()) {
            m();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dyex
    public final void c(final int i) {
        synchronized (this.q) {
            this.r += i;
        }
        ArrayDeque<Object> arrayDeque = new ArrayDeque();
        synchronized (this.q) {
            if (!this.q.isEmpty()) {
                int i2 = this.r;
                for (int i3 = 0; i3 < i2; i3++) {
                    RespT poll = this.q.poll();
                    if (poll != null) {
                        arrayDeque.add(poll);
                        this.r--;
                    }
                }
                boolean isEmpty = this.q.isEmpty();
                for (Object obj : arrayDeque) {
                    this.e.c(obj);
                }
                if (isEmpty) {
                    this.e.b(dyjb.b, null);
                }
            }
        }
        this.l.execute(new Runnable(this, i) { // from class: dfbr
            private final dfbv a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dfbv dfbvVar = this.a;
                int i4 = this.b;
                if (!dfbvVar.g) {
                    if (dfbvVar.d.e == 4) {
                        dfbvVar.h.c(i4);
                    } else {
                        dfbvVar.c += i4;
                    }
                }
            }
        });
    }

    @Override // defpackage.dyex
    public final void d(@dzsi final String str, @dzsi final Throwable th) {
        this.l.execute(new Runnable(this, str, th) { // from class: dfbi
            private final dfbv a;
            private final String b;
            private final Throwable c;

            {
                this.a = this;
                this.b = str;
                this.c = th;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dfbv dfbvVar = this.a;
                String str2 = this.b;
                Throwable th2 = this.c;
                for (dehn<?> dehnVar : dfbvVar.a) {
                    dehnVar.cancel(true);
                }
                dyex<ReqT, RespT> dyexVar = dfbvVar.h;
                if (dyexVar != 0) {
                    dyexVar.d(str2, th2);
                }
            }
        });
    }

    @Override // defpackage.dyex
    public final void e() {
        this.l.execute(new Runnable(this) { // from class: dfbs
            private final dfbv a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dfbv dfbvVar = this.a;
                if (!dfbvVar.g) {
                    dfbvVar.f = true;
                    dfbvVar.j();
                }
            }
        });
    }

    @Override // defpackage.dyex
    public final void f(final ReqT reqt) {
        this.l.execute(new Runnable(this, reqt) { // from class: dfbo
            private final dfbv a;
            private final Object b;

            {
                this.a = this;
                this.b = reqt;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dfbv dfbvVar = this.a;
                dfbvVar.b.add(new dfbt(dfbvVar, this.b));
                dfbvVar.h();
            }
        });
    }

    public final void g(final dfaz dfazVar) {
        if (this.m.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<dfbd, dehn<?>>> it = this.m.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<dfbd, dehn<?>> next = it.next();
            if (!next.getValue().isDone()) {
                break;
            }
            it.remove();
            dfbd key = next.getKey();
            dfcg b = key.b(k(dfazVar));
            if (b.c.equals(dfce.CONTINUE_AFTER)) {
                dehn<?> d = b.d();
                this.m.put(key, d);
                d.Pk(dazv.b(new Runnable(this, dfazVar) { // from class: dfbm
                    private final dfbv a;
                    private final dfaz b;

                    {
                        this.a = this;
                        this.b = dfazVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.g(this.b);
                    }
                }), this.l);
            }
            if (n(b)) {
                return;
            }
        }
        if (!this.m.isEmpty()) {
            return;
        }
        m();
    }

    public final void h() {
        dfce dfceVar = dfce.PROCEED;
        int i = this.d.e - 1;
        if (i != 1) {
            if (i != 3) {
                return;
            }
            for (dfbt dfbtVar : this.b) {
                o(dfbtVar, dfbtVar.c, this.d.a);
            }
            return;
        }
        for (dfbt dfbtVar2 : this.b) {
            int i2 = dfbtVar2.c;
            int i3 = this.d.c;
            if (i2 <= i3) {
                o(dfbtVar2, i2, i3 + 1);
            }
        }
    }

    public final void i(final dfba dfbaVar, final dfbt dfbtVar) {
        Iterator<Map.Entry<dfbd, dehn<?>>> it = dfbtVar.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<dfbd, dehn<?>> next = it.next();
            if (!next.getValue().isDone()) {
                break;
            }
            it.remove();
            dfbd key = next.getKey();
            dfcg g = key.g();
            if (g.c.equals(dfce.CONTINUE_AFTER)) {
                dehn<?> d = g.d();
                dfbtVar.b.put(key, d);
                d.Pk(dazv.b(new Runnable(this, dfbaVar, dfbtVar) { // from class: dfbq
                    private final dfbv a;
                    private final dfba b;
                    private final dfbt c;

                    {
                        this.a = this;
                        this.b = dfbaVar;
                        this.c = dfbtVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.i(this.b, this.c);
                    }
                }), this.l);
            }
            if (n(g)) {
                return;
            }
        }
        if (dfbtVar.b.isEmpty()) {
            p();
            j();
        }
    }

    public final void j() {
        if (this.f) {
            dfbt peekLast = this.b.peekLast();
            dfce dfceVar = dfce.PROCEED;
            int i = this.d.e - 1;
            if (i != 1) {
                if (i != 3 || peekLast != null) {
                    return;
                }
                this.h.e();
            } else if (peekLast != null && (!peekLast.b.isEmpty() || peekLast.c != peekLast.d.d.c + 1)) {
            } else {
                m();
            }
        }
    }
}
