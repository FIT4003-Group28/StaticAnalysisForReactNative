package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dylr  reason: default package */
/* loaded from: classes6.dex */
public final class dylr<ReqT, RespT> extends dyex<ReqT, RespT> {
    private static final Logger h = Logger.getLogger(dylr.class.getName());
    public final dyib<ReqT, RespT> a;
    public final Executor b;
    public final dyle c;
    public final dyfo d;
    public dyls e;
    public volatile boolean f;
    private final boolean i;
    private volatile ScheduledFuture<?> j;
    private final boolean k;
    private dyet l;
    private boolean m;
    private boolean n;
    private final dylo o;
    private final ScheduledExecutorService q;
    @dzsi
    private final dygm r;
    private final dylp p = new dylp();
    public dyfu g = dyfu.b;

    static {
        Charset.forName("US-ASCII");
    }

    public dylr(dyib<ReqT, RespT> dyibVar, Executor executor, dyet dyetVar, dylo dyloVar, ScheduledExecutorService scheduledExecutorService, dyle dyleVar, @dzsi dygm dygmVar) {
        dyfj dyfjVar = dyfj.a;
        this.a = dyibVar;
        String str = dyibVar.b;
        int i = dyzn.a;
        boolean z = false;
        if (executor == dege.a) {
            this.b = new dyuv();
            this.i = true;
        } else {
            this.b = new dyuz(executor);
            this.i = false;
        }
        this.c = dyleVar;
        this.d = dyfo.a();
        this.k = (dyibVar.a == dyhz.UNARY || dyibVar.a == dyhz.SERVER_STREAMING) ? true : z;
        this.l = dyetVar;
        this.o = dyloVar;
        this.q = scheduledExecutorService;
        this.r = dygmVar;
    }

    private final void h(ReqT reqt) {
        dbsk.m(this.e != null, "Not started");
        dbsk.m(!this.m, "call was cancelled");
        dbsk.m(!this.n, "call was half-closed");
        try {
            dyls dylsVar = this.e;
            if (!(dylsVar instanceof dyut)) {
                dylsVar.c(this.a.a(reqt));
            } else {
                dyut dyutVar = (dyut) dylsVar;
                dyum dyumVar = dyutVar.t;
                if (dyumVar.a) {
                    dyumVar.f.a.c(dyutVar.h.a(reqt));
                } else {
                    dyutVar.v(new dyud(dyutVar, reqt));
                }
            }
            if (this.k) {
                return;
            }
            this.e.g();
        } catch (Error e) {
            this.e.e(dyjb.c.g("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.e.e(dyjb.c.f(e2).g("Failed to stream message"));
        }
    }

    @Override // defpackage.dyex
    public final void a(dyew<RespT> dyewVar, dyhw dyhwVar) {
        dyls dyqvVar;
        dyet dyetVar;
        int i = dyzn.a;
        dbsk.m(this.e == null, "Already started");
        dbsk.m(!this.m, "call was cancelled");
        dbsk.t(dyewVar, "observer");
        dbsk.t(dyhwVar, "headers");
        if (this.d.d()) {
            this.e = dysw.a;
            this.b.execute(new dyli(this, dyewVar));
            return;
        }
        if (this.r != null) {
            dygl a = this.r.a(new dytf(this.a, dyhwVar, this.l));
            dyjb dyjbVar = a.a;
            if (dyjbVar.i()) {
                this.l = a.c;
                Object obj = a.b;
                dyib<ReqT, RespT> dyibVar = this.a;
                dysj dysjVar = ((dysk) obj).b.get(dyibVar.b);
                if (dysjVar == null) {
                    dysjVar = ((dysk) obj).c.get(dyibVar.c);
                }
                if (dysjVar == null) {
                    dysjVar = ((dysk) obj).a;
                }
                if (dysjVar != null) {
                    this.l = this.l.d(dysj.a, dysjVar);
                    Long l = dysjVar.b;
                    if (l != null) {
                        dyfr a2 = dyfr.a(l.longValue(), TimeUnit.NANOSECONDS);
                        dyfr dyfrVar = this.l.b;
                        if (dyfrVar == null || a2.compareTo(dyfrVar) < 0) {
                            this.l = this.l.b(a2);
                        }
                    }
                    Boolean bool = dysjVar.c;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            dyetVar = new dyet(this.l);
                            dyetVar.f = Boolean.TRUE;
                        } else {
                            dyetVar = new dyet(this.l);
                            dyetVar.f = Boolean.FALSE;
                        }
                        this.l = dyetVar;
                    }
                    Integer num = dysjVar.d;
                    if (num != null) {
                        dyet dyetVar2 = this.l;
                        Integer num2 = dyetVar2.g;
                        if (num2 != null) {
                            this.l = dyetVar2.g(Math.min(num2.intValue(), dysjVar.d.intValue()));
                        } else {
                            this.l = dyetVar2.g(num.intValue());
                        }
                    }
                    Integer num3 = dysjVar.e;
                    if (num3 != null) {
                        dyet dyetVar3 = this.l;
                        Integer num4 = dyetVar3.h;
                        if (num4 != null) {
                            this.l = dyetVar3.h(Math.min(num4.intValue(), dysjVar.e.intValue()));
                        } else {
                            this.l = dyetVar3.h(num3.intValue());
                        }
                    }
                }
            } else {
                this.b.execute(new dylh(this, dyewVar, dyjbVar));
                return;
            }
        }
        dyfh dyfhVar = dyfg.a;
        dyfu dyfuVar = this.g;
        dyhwVar.j(dyow.b);
        if (dyfhVar != dyfg.a) {
            dyhwVar.i(dyow.b, "identity");
        }
        dyhwVar.j(dyow.c);
        byte[] bArr = dyfuVar.d;
        if (bArr.length != 0) {
            dyhwVar.i(dyow.c, bArr);
        }
        dyhwVar.j(dyow.d);
        dyhwVar.j(dyow.e);
        dyfr g = g();
        if (g == null || !g.b()) {
            dyfr f = this.d.f();
            dyfr dyfrVar2 = this.l.b;
            Logger logger = h;
            if (logger.isLoggable(Level.FINE) && g != null && g.equals(f)) {
                StringBuilder sb = new StringBuilder(String.format("Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(Math.max(0L, g.c(TimeUnit.NANOSECONDS)))));
                if (dyfrVar2 == null) {
                    sb.append(" Explicit call timeout was not set.");
                } else {
                    sb.append(String.format(" Explicit call timeout was '%d' ns.", Long.valueOf(dyfrVar2.c(TimeUnit.NANOSECONDS))));
                }
                logger.logp(Level.FINE, "io.grpc.internal.ClientCallImpl", "logIfContextNarrowedTimeout", sb.toString());
            }
            dylo dyloVar = this.o;
            dyib<ReqT, RespT> dyibVar2 = this.a;
            dyet dyetVar4 = this.l;
            dyfo dyfoVar = this.d;
            dyrz dyrzVar = ((dyqw) dyloVar).a;
            if (!dyrzVar.Q) {
                dylv a3 = ((dyqw) dyloVar).a(new dytf(dyibVar2, dyhwVar, dyetVar4));
                dyfo b = dyfoVar.b();
                dyqvVar = a3.d(dyibVar2, dyhwVar, dyetVar4);
                dyfoVar.c(b);
            } else {
                dyus dyusVar = dyrzVar.J.d;
                dysj dysjVar2 = (dysj) dyetVar4.e(dysj.a);
                dyqvVar = new dyqv((dyqw) dyloVar, dyibVar2, dyhwVar, dyetVar4, dysjVar2 == null ? null : dysjVar2.f, dysjVar2 == null ? null : dysjVar2.g, dyusVar, dyfoVar);
            }
            this.e = dyqvVar;
        } else {
            dyjb dyjbVar2 = dyjb.f;
            String valueOf = String.valueOf(g);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb2.append("ClientCall started after deadline exceeded: ");
            sb2.append(valueOf);
            this.e = new dyoh(dyjbVar2.g(sb2.toString()));
        }
        if (this.i) {
            this.e.n();
        }
        Integer num5 = this.l.g;
        if (num5 != null) {
            this.e.j(num5.intValue());
        }
        Integer num6 = this.l.h;
        if (num6 != null) {
            this.e.k(num6.intValue());
        }
        if (g != null) {
            this.e.i(g);
        }
        this.e.h(dyfhVar);
        this.e.m(this.g);
        this.c.a();
        this.e.a(new dyln(this, dyewVar));
        this.d.g(this.p, dege.a);
        if (g != null && !g.equals(this.d.f()) && this.q != null) {
            long c = g.c(TimeUnit.NANOSECONDS);
            this.j = this.q.schedule(new dyqh(new dylq(this, c)), c, TimeUnit.NANOSECONDS);
        }
        if (!this.f) {
            return;
        }
        b();
    }

    public final void b() {
        this.d.i();
        ScheduledFuture<?> scheduledFuture = this.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    @Override // defpackage.dyex
    public final void c(int i) {
        int i2 = dyzn.a;
        dbsk.m(this.e != null, "Not started");
        dbsk.b(true, "Number requested must be non-negative");
        this.e.b(i);
    }

    @Override // defpackage.dyex
    public final void d(@dzsi String str, @dzsi Throwable th) {
        dyjb g;
        int i = dyzn.a;
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            h.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.m) {
            return;
        }
        this.m = true;
        if (this.e != null) {
            dyjb dyjbVar = dyjb.c;
            if (str != null) {
                g = dyjbVar.g(str);
            } else {
                g = dyjbVar.g("Call cancelled without message");
            }
            if (th != null) {
                g = g.f(th);
            }
            this.e.e(g);
        }
        b();
    }

    @Override // defpackage.dyex
    public final void e() {
        int i = dyzn.a;
        dbsk.m(this.e != null, "Not started");
        dbsk.m(!this.m, "call was cancelled");
        dbsk.m(!this.n, "call already half-closed");
        this.n = true;
        this.e.d();
    }

    @Override // defpackage.dyex
    public final void f(ReqT reqt) {
        int i = dyzn.a;
        h(reqt);
    }

    @dzsi
    public final dyfr g() {
        dyfr dyfrVar = this.l.b;
        dyfr f = this.d.f();
        if (dyfrVar == null) {
            return f;
        }
        if (f == null) {
            return dyfrVar;
        }
        dyfrVar.e(f);
        dyfrVar.e(f);
        return dyfrVar.a - f.a < 0 ? dyfrVar : f;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("method", this.a);
        return b.toString();
    }
}
