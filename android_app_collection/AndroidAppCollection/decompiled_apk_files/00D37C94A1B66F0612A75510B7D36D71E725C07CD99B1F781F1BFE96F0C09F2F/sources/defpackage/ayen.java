package defpackage;

import io.grpc.Status;
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
/* renamed from: ayen  reason: default package */
/* loaded from: classes2.dex */
public final class ayen extends axyg {
    private static final Logger h = Logger.getLogger(ayen.class.getName());
    public final ayax a;
    public final Executor b;
    public final ayee c;
    public final axyx d;
    public ayeo e;
    public volatile boolean f;
    public axzb g = axzb.b;
    private final boolean i;
    private volatile ScheduledFuture j;
    private final boolean k;
    private axyd l;
    private boolean m;
    private boolean n;
    private final ScheduledExecutorService o;
    private final ayin p;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
    }

    public ayen(ayax ayaxVar, Executor executor, axyd axydVar, ayin ayinVar, ScheduledExecutorService scheduledExecutorService, ayee ayeeVar) {
        axys axysVar = axys.a;
        this.a = ayaxVar;
        String str = ayaxVar.b;
        System.identityHashCode(this);
        int i = aynn.a;
        boolean z = false;
        if (executor == anjk.a) {
            this.b = new aylx();
            this.i = true;
        } else {
            this.b = new aymb(executor);
            this.i = false;
        }
        this.c = ayeeVar;
        this.d = axyx.b();
        this.k = (ayaxVar.a == ayaw.UNARY || ayaxVar.a == ayaw.SERVER_STREAMING) ? true : z;
        this.l = axydVar;
        this.p = ayinVar;
        this.o = scheduledExecutorService;
    }

    private final void h(Object obj) {
        aqxo.z(this.e != null, "Not started");
        aqxo.z(!this.m, "call was cancelled");
        aqxo.z(!this.n, "call was half-closed");
        try {
            ayeo ayeoVar = this.e;
            if (!(ayeoVar instanceof aylv)) {
                ayeoVar.n(this.a.b(obj));
            } else {
                aylv aylvVar = (aylv) ayeoVar;
                ayll ayllVar = aylvVar.r;
                if (ayllVar.a) {
                    ayllVar.f.a.n(aylvVar.e.b(obj));
                } else {
                    aylvVar.s(new ayla(aylvVar, obj));
                }
            }
            if (this.k) {
                return;
            }
            this.e.d();
        } catch (Error e) {
            this.e.c(Status.c.withDescription("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.e.c(Status.c.c(e2).withDescription("Failed to stream message"));
        }
    }

    @Override // defpackage.axyg
    public final void b(String str, Throwable th) {
        Status withDescription;
        int i = aynn.a;
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            h.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.m) {
            return;
        }
        this.m = true;
        if (this.e != null) {
            Status status = Status.c;
            if (str != null) {
                withDescription = status.withDescription(str);
            } else {
                withDescription = status.withDescription("Call cancelled without message");
            }
            if (th != null) {
                withDescription = withDescription.c(th);
            }
            this.e.c(withDescription);
        }
        g();
    }

    @Override // defpackage.axyg
    public final void c() {
        int i = aynn.a;
        aqxo.z(this.e != null, "Not started");
        aqxo.z(!this.m, "call was cancelled");
        aqxo.z(!this.n, "call already half-closed");
        this.n = true;
        this.e.e();
    }

    @Override // defpackage.axyg
    public final void d(int i) {
        int i2 = aynn.a;
        aqxo.z(this.e != null, "Not started");
        aqxo.q(true, "Number requested must be non-negative");
        this.e.g(i);
    }

    @Override // defpackage.axyg
    public final void e(Object obj) {
        int i = aynn.a;
        h(obj);
    }

    public final axyy f() {
        axyy axyyVar = this.l.b;
        if (axyyVar == null) {
            return null;
        }
        return axyyVar;
    }

    public final void g() {
        ScheduledFuture scheduledFuture = this.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    @Override // defpackage.axyg
    public final void k(axzl axzlVar, ayat ayatVar) {
        axyd axydVar;
        ayeo aylvVar;
        int i = aynn.a;
        aqxo.z(this.e == null, "Already started");
        aqxo.z(!this.m, "call was cancelled");
        ayjp ayjpVar = (ayjp) this.l.e(ayjp.a);
        if (ayjpVar != null) {
            Long l = ayjpVar.b;
            if (l != null) {
                axyy c = axyy.c(l.longValue(), TimeUnit.NANOSECONDS);
                axyy axyyVar = this.l.b;
                if (axyyVar == null || c.compareTo(axyyVar) < 0) {
                    this.l = this.l.a(c);
                }
            }
            Boolean bool = ayjpVar.c;
            if (bool != null) {
                if (bool.booleanValue()) {
                    axydVar = new axyd(this.l);
                    axydVar.e = Boolean.TRUE;
                } else {
                    axydVar = new axyd(this.l);
                    axydVar.e = Boolean.FALSE;
                }
                this.l = axydVar;
            }
            Integer num = ayjpVar.d;
            if (num != null) {
                axyd axydVar2 = this.l;
                Integer num2 = axydVar2.f;
                if (num2 != null) {
                    this.l = axydVar2.b(Math.min(num2.intValue(), ayjpVar.d.intValue()));
                } else {
                    this.l = axydVar2.b(num.intValue());
                }
            }
            Integer num3 = ayjpVar.e;
            if (num3 != null) {
                axyd axydVar3 = this.l;
                Integer num4 = axydVar3.g;
                if (num4 != null) {
                    this.l = axydVar3.c(Math.min(num4.intValue(), ayjpVar.e.intValue()));
                } else {
                    this.l = axydVar3.c(num3.intValue());
                }
            }
        }
        axyq axyqVar = axyp.a;
        axzb axzbVar = this.g;
        ayatVar.d(ayhf.b);
        if (axyqVar != axyp.a) {
            ayatVar.f(ayhf.b, "identity");
        }
        ayatVar.d(ayhf.c);
        byte[] bArr = axzbVar.d;
        if (bArr.length != 0) {
            ayatVar.f(ayhf.c, bArr);
        }
        ayatVar.d(ayhf.d);
        ayatVar.d(ayhf.e);
        axyy f = f();
        if (f != null && f.d()) {
            azqj[] k = ayhf.k(this.l, ayatVar, 0, false);
            Status status = Status.f;
            String valueOf = String.valueOf(f);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb.append("ClientCall started after deadline exceeded: ");
            sb.append(valueOf);
            this.e = new aygt(status.withDescription(sb.toString()), k, null, null);
        } else {
            axyy axyyVar2 = this.l.b;
            Logger logger = h;
            if (logger.isLoggable(Level.FINE) && f != null && f.equals(null)) {
                StringBuilder sb2 = new StringBuilder(String.format("Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(Math.max(0L, f.b(TimeUnit.NANOSECONDS)))));
                if (axyyVar2 == null) {
                    sb2.append(" Explicit call timeout was not set.");
                } else {
                    sb2.append(String.format(" Explicit call timeout was '%d' ns.", Long.valueOf(axyyVar2.b(TimeUnit.NANOSECONDS))));
                }
                logger.logp(Level.FINE, "io.grpc.internal.ClientCallImpl", "logIfContextNarrowedTimeout", sb2.toString());
            }
            ayin ayinVar = this.p;
            ayax ayaxVar = this.a;
            axyd axydVar4 = this.l;
            axyx axyxVar = this.d;
            ayji ayjiVar = ayinVar.a;
            if (!ayjiVar.P) {
                ayer a = ayinVar.a(new ayad(ayaxVar, ayatVar, axydVar4));
                axyx a2 = axyxVar.a();
                aylvVar = a.l(ayaxVar, ayatVar, axydVar4, ayhf.k(axydVar4, ayatVar, 0, false));
                axyxVar.c(a2);
            } else {
                aylu ayluVar = ayjiVar.f134J.a;
                ayjp ayjpVar2 = (ayjp) axydVar4.e(ayjp.a);
                aylvVar = new aylv(ayinVar, ayaxVar, ayatVar, axydVar4, ayjpVar2 == null ? null : ayjpVar2.f, ayjpVar2 == null ? null : ayjpVar2.g, ayluVar, axyxVar);
            }
            this.e = aylvVar;
        }
        if (this.i) {
            this.e.f();
        }
        Integer num5 = this.l.f;
        if (num5 != null) {
            this.e.k(num5.intValue());
        }
        Integer num6 = this.l.g;
        if (num6 != null) {
            this.e.l(num6.intValue());
        }
        if (f != null) {
            this.e.i(f);
        }
        this.e.h(axyqVar);
        this.e.j(this.g);
        this.c.b();
        this.e.m(new ayel(this, axzlVar, null));
        axyx.d(anjk.a, "executor");
        if (f != null && !f.equals(null) && this.o != null) {
            long b = f.b(TimeUnit.NANOSECONDS);
            this.j = this.o.schedule(new ayid(new ayem(this, b)), b, TimeUnit.NANOSECONDS);
        }
        if (this.f) {
            g();
        }
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("method", this.a);
        return c.toString();
    }
}
