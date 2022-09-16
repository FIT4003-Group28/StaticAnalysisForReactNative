package defpackage;

import io.grpc.Status;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aylv  reason: default package */
/* loaded from: classes2.dex */
public final class aylv implements ayeo {
    static final ayaq a = ayaq.c("grpc-previous-rpc-attempts", ayat.a);
    static final ayaq b = ayaq.c("grpc-retry-pushback-ms", ayat.a);
    public static final Status c = Status.c.withDescription("Stream thrown away because RetriableStream committed");
    public static final Random d = new Random();
    final /* synthetic */ axyd A;
    final /* synthetic */ axyx B;
    final /* synthetic */ ayin C;
    private final ayat D;
    private Status E;
    public final ayax e;
    public final Executor f;
    public final Executor g;
    public final ScheduledExecutorService h;
    public final aylw i;
    public final ayhg j;
    public final boolean k;
    public final Object l;
    public final aylg m;
    public final long n;
    public final long o;
    public final aylu p;
    public final ayhk q;
    public volatile ayll r;
    public final AtomicBoolean s;
    public long t;
    public ayeq u;
    public aylh v;
    public aylh w;
    public long x;
    public boolean y;
    final /* synthetic */ ayax z;

    public aylv(ayin ayinVar, ayax ayaxVar, ayat ayatVar, axyd axydVar, aylw aylwVar, ayhg ayhgVar, aylu ayluVar, axyx axyxVar) {
        this.C = ayinVar;
        this.z = ayaxVar;
        this.A = axydVar;
        this.B = axyxVar;
        ayji ayjiVar = ayinVar.a;
        aylg aylgVar = ayjiVar.M;
        long j = ayjiVar.N;
        long j2 = ayjiVar.O;
        Executor d2 = ayjiVar.d(axydVar);
        ScheduledExecutorService b2 = ayinVar.a.j.b();
        this.g = new aybx(new aykt());
        this.l = new Object();
        this.q = new ayhk();
        this.r = new ayll(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);
        this.s = new AtomicBoolean();
        this.e = ayaxVar;
        this.m = aylgVar;
        this.n = j;
        this.o = j2;
        this.f = d2;
        this.h = b2;
        this.D = ayatVar;
        this.i = aylwVar;
        if (aylwVar != null) {
            this.x = aylwVar.b;
        }
        this.j = ayhgVar;
        boolean z = false;
        aqxo.q(aylwVar == null || ayhgVar == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.k = ayhgVar != null ? true : z;
        this.p = ayluVar;
    }

    @Override // defpackage.ayeo
    public final axyb a() {
        throw null;
    }

    @Override // defpackage.ayeo
    public final void b(ayhk ayhkVar) {
        ayll ayllVar;
        synchronized (this.l) {
            ayhkVar.b("closed", this.q);
            ayllVar = this.r;
        }
        if (ayllVar.f != null) {
            ayhk ayhkVar2 = new ayhk();
            ayllVar.f.a.b(ayhkVar2);
            ayhkVar.b("committed", ayhkVar2);
            return;
        }
        ayhk ayhkVar3 = new ayhk();
        for (aylt ayltVar : ayllVar.c) {
            ayhk ayhkVar4 = new ayhk();
            ayltVar.a.b(ayhkVar4);
            ayhkVar3.a(ayhkVar4);
        }
        ayhkVar.b("open", ayhkVar3);
    }

    @Override // defpackage.ayeo
    public final void c(Status status) {
        aylt ayltVar;
        aylt ayltVar2 = new aylt(0);
        ayltVar2.a = new aykc();
        Runnable q = q(ayltVar2);
        if (q != null) {
            q.run();
            this.g.execute(new ayld(this, status));
            return;
        }
        synchronized (this.l) {
            if (this.r.c.contains(this.r.f)) {
                ayltVar = this.r.f;
            } else {
                this.E = status;
                ayltVar = null;
            }
            ayll ayllVar = this.r;
            this.r = new ayll(ayllVar.b, ayllVar.c, ayllVar.d, ayllVar.f, true, ayllVar.a, ayllVar.h, ayllVar.e);
        }
        if (ayltVar == null) {
            return;
        }
        ayltVar.a.c(status);
    }

    @Override // defpackage.ayml
    public final void d() {
        ayll ayllVar = this.r;
        if (ayllVar.a) {
            ayllVar.f.a.d();
        } else {
            s(new ayky(1));
        }
    }

    @Override // defpackage.ayeo
    public final void e() {
        s(new ayky());
    }

    @Override // defpackage.ayml
    public final void f() {
        s(new ayky(2));
    }

    @Override // defpackage.ayml
    public final void g(int i) {
        ayll ayllVar = this.r;
        if (ayllVar.a) {
            ayllVar.f.a.g(i);
        } else {
            s(new aykz(i, 2));
        }
    }

    @Override // defpackage.ayml
    public final void h(axyr axyrVar) {
        s(new aykv(axyrVar));
    }

    @Override // defpackage.ayeo
    public final void i(axyy axyyVar) {
        s(new aykw(axyyVar));
    }

    @Override // defpackage.ayeo
    public final void j(axzb axzbVar) {
        s(new aykx(axzbVar));
    }

    @Override // defpackage.ayeo
    public final void k(int i) {
        s(new aykz(i, 1));
    }

    @Override // defpackage.ayeo
    public final void l(int i) {
        s(new aykz(i));
    }

    @Override // defpackage.ayeo
    public final void m(ayeq ayeqVar) {
        Status status;
        aylh aylhVar;
        aylu ayluVar;
        this.u = ayeqVar;
        ayjh ayjhVar = this.C.a.z;
        synchronized (ayjhVar.a) {
            status = ayjhVar.c;
            aylhVar = null;
            if (status == null) {
                ayjhVar.b.add(this);
                status = null;
            }
        }
        if (status != null) {
            c(status);
            return;
        }
        synchronized (this.l) {
            this.r.b.add(new aylk(this));
        }
        aylt p = p(0, false);
        if (this.k) {
            synchronized (this.l) {
                this.r = this.r.a(p);
                if (v(this.r) && ((ayluVar = this.p) == null || ayluVar.a())) {
                    aylhVar = new aylh(this.l);
                    this.w = aylhVar;
                }
            }
            if (aylhVar != null) {
                aylhVar.b(this.h.schedule(new aylj(this, aylhVar), this.j.b, TimeUnit.NANOSECONDS));
            }
        }
        t(p);
    }

    @Override // defpackage.ayml
    public final void n(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // defpackage.ayml
    public final boolean o() {
        for (aylt ayltVar : this.r.c) {
            if (ayltVar.a.o()) {
                return true;
            }
        }
        return false;
    }

    public final aylt p(int i, boolean z) {
        aylt ayltVar = new aylt(i);
        aylb aylbVar = new aylb(new aylf(this, ayltVar), null, null);
        ayat ayatVar = this.D;
        ayat ayatVar2 = new ayat();
        ayatVar2.e(ayatVar);
        if (i > 0) {
            ayatVar2.f(a, String.valueOf(i));
        }
        axyd axydVar = this.A;
        axyd axydVar2 = new axyd(axydVar);
        ArrayList arrayList = new ArrayList(axydVar.d.size() + 1);
        arrayList.addAll(axydVar.d);
        arrayList.add(aylbVar);
        axydVar2.d = Collections.unmodifiableList(arrayList);
        azqj[] k = ayhf.k(axydVar2, ayatVar2, i, z);
        ayer a2 = this.C.a(new ayad(this.z, ayatVar2, axydVar2));
        axyx a3 = this.B.a();
        try {
            ayeo l = a2.l(this.z, ayatVar2, axydVar2, k);
            this.B.c(a3);
            ayltVar.a = l;
            return ayltVar;
        } catch (Throwable th) {
            this.B.c(a3);
            throw th;
        }
    }

    public final Runnable q(aylt ayltVar) {
        List list;
        Collection emptyList;
        Future future;
        Future future2;
        synchronized (this.l) {
            if (this.r.f != null) {
                return null;
            }
            Collection collection = this.r.c;
            ayll ayllVar = this.r;
            boolean z = true;
            aqxo.z(ayllVar.f == null, "Already committed");
            List list2 = ayllVar.b;
            if (ayllVar.c.contains(ayltVar)) {
                list = null;
                emptyList = Collections.singleton(ayltVar);
            } else {
                list = list2;
                emptyList = Collections.emptyList();
                z = false;
            }
            this.r = new ayll(list, emptyList, ayllVar.d, ayltVar, ayllVar.g, z, ayllVar.h, ayllVar.e);
            this.m.a(-this.t);
            aylh aylhVar = this.v;
            if (aylhVar != null) {
                Future a2 = aylhVar.a();
                this.v = null;
                future = a2;
            } else {
                future = null;
            }
            aylh aylhVar2 = this.w;
            if (aylhVar2 != null) {
                Future a3 = aylhVar2.a();
                this.w = null;
                future2 = a3;
            } else {
                future2 = null;
            }
            return new ayku(this, collection, ayltVar, future, future2);
        }
    }

    public final void r(aylt ayltVar) {
        Runnable q = q(ayltVar);
        if (q != null) {
            q.run();
        }
    }

    public final void s(ayle ayleVar) {
        Collection<aylt> collection;
        synchronized (this.l) {
            if (!this.r.a) {
                this.r.b.add(ayleVar);
            }
            collection = this.r.c;
        }
        for (aylt ayltVar : collection) {
            ayleVar.a(ayltVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
        r18.g.execute(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
        r2 = r19.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
        if (r18.r.f != r19) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009d, code lost:
        r0 = r18.E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a0, code lost:
        r0 = defpackage.aylv.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
        r2.c(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d5, code lost:
        r5 = r6.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00da, code lost:
        if (r7 >= r5) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dc, code lost:
        r8 = (defpackage.ayle) r6.get(r7);
        r8.a(r19);
        r4 = r4 | (r8 instanceof defpackage.aylk);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e8, code lost:
        if (r4 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ea, code lost:
        r8 = r18.r;
        r10 = r8.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ee, code lost:
        if (r10 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f0, code lost:
        if (r10 == r19) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f5, code lost:
        if (r8.g == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f8, code lost:
        r7 = r7 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(defpackage.aylt r19) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aylv.t(aylt):void");
    }

    public final void u() {
        Future future;
        synchronized (this.l) {
            aylh aylhVar = this.w;
            future = null;
            if (aylhVar != null) {
                Future a2 = aylhVar.a();
                this.w = null;
                future = a2;
            }
            this.r = this.r.b();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final boolean v(ayll ayllVar) {
        return ayllVar.f == null && ayllVar.e < this.j.a && !ayllVar.h;
    }
}
