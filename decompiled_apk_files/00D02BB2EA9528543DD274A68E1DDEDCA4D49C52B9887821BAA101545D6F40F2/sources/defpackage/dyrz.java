package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: dyrz  reason: default package */
/* loaded from: classes6.dex */
final class dyrz extends dyhi implements dygn {
    static final Logger a = Logger.getLogger(dyrz.class.getName());
    static final Pattern b = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
    static final dyjb c = dyjb.m.g("Channel shutdownNow invoked");
    static final dyjb d = dyjb.m.g("Channel shutdown invoked");
    static final dyjb e = dyjb.m.g("Subchannel shutdown invoked");
    public static final dysk f = new dysk(null, new HashMap(), new HashMap(), null, null, null);
    public static final dygm g = new dyqk();
    public final AtomicBoolean A;
    public boolean B;
    public volatile boolean C;
    public volatile boolean D;
    public final dyle E;
    public final dylg F;
    public final dyev G;
    public final dygj H;
    public final dyrp I;
    public dysk J;
    @dzsi
    public final dysk K;
    public boolean L;
    public final boolean M;
    public final dyuh N;
    public final long O;
    public final long P;
    public final boolean Q;
    final dype<Object> R;
    @dzsi
    public dyjh S;
    public final dylo T;
    public int U;
    public final dyof V;
    @dzsi
    public dyog W;
    public final dyqm X;
    private final String Y;
    private final dyif Z;
    private final dyid aa;
    private final dyla ab;
    private final Executor ac;
    private final dysx<? extends Executor> ad;
    private final dyqz ae;
    private final long af;
    private final dyeu ag;
    private dyik ah;
    private boolean ai;
    private final Set<dysy> aj;
    private final CountDownLatch ak;
    private final dysl al;
    private final dytr am;
    public final dygo h;
    public final dylx i;
    public final dyrq j;
    public final dyqz k;
    public final dyvn l;
    final dyji m;
    public final dyfu n;
    public final dyfj o;
    public final dbty<dbtp> p;
    public final dyme q;
    @dzsi
    public final String r;
    @dzsi
    public dyrd s;
    @dzsi
    public volatile dyhd t;
    public boolean u;
    public final Set<dypz> v;
    @dzsi
    public Collection<dyro<?, ?>> w;
    public final Object x;
    public final dync y;
    public final dyry z;

    public dyrz(dysf dysfVar, dylx dylxVar, dyof dyofVar, dysx dysxVar, dbty dbtyVar, List list, dyvn dyvnVar) {
        dyji dyjiVar = new dyji(new dyqs(this));
        this.m = dyjiVar;
        this.q = new dyme();
        this.v = new HashSet(16, 0.75f);
        this.x = new Object();
        this.aj = new HashSet(1, 0.75f);
        this.z = new dyry(this);
        this.A = new AtomicBoolean(false);
        this.ak = new CountDownLatch(1);
        this.U = 1;
        this.J = f;
        this.L = false;
        this.N = new dyuh();
        dyqy dyqyVar = new dyqy(this);
        this.al = dyqyVar;
        this.R = new dyra(this);
        this.T = new dyqw(this);
        String str = dysfVar.g;
        dbsk.t(str, "target");
        this.Y = str;
        dygo b2 = dygo.b("Channel", str);
        this.h = b2;
        this.l = dyvnVar;
        dysx<? extends Executor> dysxVar2 = dysfVar.c;
        dbsk.t(dysxVar2, "executorPool");
        this.ad = dysxVar2;
        Executor a2 = dysxVar2.a();
        dbsk.t(a2, "executor");
        this.ac = a2;
        dyld dyldVar = new dyld(dylxVar, a2);
        this.i = dyldVar;
        dyrq dyrqVar = new dyrq(dyldVar.b());
        this.j = dyrqVar;
        long a3 = dyvnVar.a();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("Channel for '");
        sb.append(str);
        sb.append("'");
        dylg dylgVar = new dylg(b2, a3, sb.toString());
        this.F = dylgVar;
        dylf dylfVar = new dylf(dylgVar, dyvnVar);
        this.G = dylfVar;
        dyif dyifVar = dysfVar.f;
        this.Z = dyifVar;
        dyit dyitVar = dyow.j;
        boolean z = dysfVar.q && !dysfVar.r;
        this.Q = z;
        dyla dylaVar = new dyla(dyhh.a(), dysfVar.i);
        this.ab = dylaVar;
        dysx<? extends Executor> dysxVar3 = dysfVar.d;
        dbsk.t(dysxVar3, "offloadExecutorPool");
        this.k = new dyqz(dysxVar3);
        dyrr dyrrVar = new dyrr(z, dysfVar.m, 5, dylaVar);
        dyic dyicVar = new dyic();
        dyicVar.a = Integer.valueOf(dysfVar.w.a());
        dbsk.s(dyitVar);
        dyicVar.b = dyitVar;
        dbsk.s(dyjiVar);
        dyicVar.c = dyjiVar;
        dbsk.s(dyrqVar);
        dyicVar.e = dyrqVar;
        dyicVar.d = dyrrVar;
        dbsk.s(dylfVar);
        dyicVar.f = dylfVar;
        dyicVar.g = new dyqt(this);
        dyid dyidVar = new dyid(dyicVar.a, dyicVar.b, dyicVar.c, dyicVar.d, dyicVar.e, dyicVar.f, dyicVar.g);
        this.aa = dyidVar;
        this.ah = q(str, dyifVar, dyidVar);
        this.ae = new dyqz(dysxVar);
        dync dyncVar = new dync(a2, dyjiVar);
        this.y = dyncVar;
        dyncVar.f = dyqyVar;
        dyncVar.c = new dymw(dyqyVar);
        dyncVar.d = new dymx(dyqyVar);
        dyncVar.e = new dymy(dyqyVar);
        this.V = dyofVar;
        this.K = null;
        this.M = true;
        dyrp dyrpVar = new dyrp(this, this.ah.a());
        this.I = dyrpVar;
        this.ag = dyfa.b(dyrpVar, list);
        dbsk.t(dbtyVar, "stopwatchSupplier");
        this.p = dbtyVar;
        long j = dysfVar.l;
        if (j == -1) {
            this.af = j;
        } else {
            dbsk.f(j >= dysf.b, "invalid idleTimeoutMillis %s", dysfVar.l);
            this.af = dysfVar.l;
        }
        this.am = new dytr(new dyrb(this), dyjiVar, dyldVar.b(), dbtp.a());
        dyfu dyfuVar = dysfVar.j;
        dbsk.t(dyfuVar, "decompressorRegistry");
        this.n = dyfuVar;
        dyfj dyfjVar = dysfVar.k;
        dbsk.t(dyfjVar, "compressorRegistry");
        this.o = dyfjVar;
        this.r = dysfVar.h;
        this.P = 16777216L;
        this.O = 1048576L;
        dyqm dyqmVar = new dyqm(dyvnVar);
        this.X = dyqmVar;
        this.E = dyqmVar.a();
        dygj dygjVar = dysfVar.s;
        dbsk.s(dygjVar);
        this.H = dygjVar;
        dygj.a(dygjVar.c, this);
    }

    static dyik q(String str, dyif dyifVar, dyid dyidVar) {
        URI uri;
        dyik a2;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e2) {
            sb.append(e2.getMessage());
            uri = null;
        }
        if (uri == null || (a2 = dyifVar.a(uri, dyidVar)) == null) {
            String str2 = "";
            if (!b.matcher(str).matches()) {
                try {
                    String b2 = dyifVar.b();
                    String valueOf = String.valueOf(str);
                    dyik a3 = dyifVar.a(new URI(b2, str2, valueOf.length() != 0 ? "/".concat(valueOf) : new String("/"), null), dyidVar);
                    if (a3 != null) {
                        return a3;
                    }
                } catch (URISyntaxException e3) {
                    throw new IllegalArgumentException(e3);
                }
            }
            Object[] objArr = new Object[2];
            objArr[0] = str;
            if (sb.length() > 0) {
                String valueOf2 = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 3);
                sb2.append(" (");
                sb2.append(valueOf2);
                sb2.append(")");
                str2 = sb2.toString();
            }
            objArr[1] = str2;
            throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", objArr));
        }
        return a2;
    }

    @Override // defpackage.dyeu
    public final <ReqT, RespT> dyex<ReqT, RespT> a(dyib<ReqT, RespT> dyibVar, dyet dyetVar) {
        return this.ag.a(dyibVar, dyetVar);
    }

    @Override // defpackage.dyeu
    public final String b() {
        return this.ag.b();
    }

    @Override // defpackage.dyhi
    public final dyfk c(boolean z) {
        dyfk dyfkVar = this.q.a;
        if (dyfkVar != null) {
            if (z && dyfkVar == dyfk.IDLE) {
                this.m.execute(new dyqp(this));
            }
            return dyfkVar;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    @Override // defpackage.dyhi
    public final void d() {
        this.m.execute(new dyqo(this));
    }

    @Override // defpackage.dyhi
    public final boolean e(TimeUnit timeUnit) {
        return this.ak.await(2L, timeUnit);
    }

    public final void h() {
        if (this.B) {
            for (dypz dypzVar : this.v) {
                dyjb dyjbVar = c;
                dypzVar.e(dyjbVar);
                dypzVar.e.execute(new dypo(dypzVar, dyjbVar));
            }
            Iterator<dysy> it = this.aj.iterator();
            if (!it.hasNext()) {
                return;
            }
            it.next();
            throw null;
        }
    }

    public final void i(boolean z) {
        this.m.c();
        if (z) {
            dbsk.m(this.ai, "nameResolver is not started");
            dbsk.m(this.s != null, "lbHelper is null");
        }
        if (this.ah != null) {
            o();
            this.ah.c();
            this.ai = false;
            if (z) {
                this.ah = q(this.Y, this.Z, this.aa);
            } else {
                this.ah = null;
            }
        }
        dyrd dyrdVar = this.s;
        if (dyrdVar != null) {
            dykv dykvVar = dyrdVar.a;
            dykvVar.b.c();
            dykvVar.b = null;
            this.s = null;
        }
        this.t = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        this.m.c();
        if (this.A.get() || this.u) {
            return;
        }
        if (this.R.b()) {
            m(false);
        } else {
            n();
        }
        if (this.s != null) {
            return;
        }
        this.G.a(2, "Exiting idle mode");
        dyrd dyrdVar = new dyrd(this);
        dyrdVar.a = new dykv(this.ab, dyrdVar);
        this.s = dyrdVar;
        this.ah.b(new dyrg(this, dyrdVar, this.ah));
        this.ai = true;
    }

    @Override // defpackage.dygs
    public final dygo k() {
        return this.h;
    }

    public final void l() {
        i(true);
        this.y.b(null);
        this.G.a(2, "Entering IDLE state");
        this.q.a(dyfk.IDLE);
        if (this.R.b()) {
            j();
        }
    }

    public final void m(boolean z) {
        ScheduledFuture<?> scheduledFuture;
        dytr dytrVar = this.am;
        dytrVar.e = false;
        if (!z || (scheduledFuture = dytrVar.f) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        dytrVar.f = null;
    }

    public final void n() {
        long j = this.af;
        if (j == -1) {
            return;
        }
        dytr dytrVar = this.am;
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        long a2 = dytrVar.a() + nanos;
        dytrVar.e = true;
        if (a2 - dytrVar.d < 0 || dytrVar.f == null) {
            ScheduledFuture<?> scheduledFuture = dytrVar.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            dytrVar.f = dytrVar.a.schedule(new dytq(dytrVar), nanos, TimeUnit.NANOSECONDS);
        }
        dytrVar.d = a2;
    }

    public final void o() {
        this.m.c();
        dyjh dyjhVar = this.S;
        if (dyjhVar != null) {
            dyjhVar.a();
            this.S = null;
            this.W = null;
        }
    }

    public final void p() {
        this.m.c();
        if (this.ai) {
            this.ah.d();
        }
    }

    public final void r(dyhd dyhdVar) {
        this.t = dyhdVar;
        this.y.b(dyhdVar);
    }

    public final Executor s(dyet dyetVar) {
        Executor executor = dyetVar.c;
        return executor == null ? this.ac : executor;
    }

    public final void t() {
        if (!this.D && this.A.get() && this.v.isEmpty() && this.aj.isEmpty()) {
            this.G.a(2, "Terminated");
            dygj.b(this.H.c, this);
            this.ad.b(this.ac);
            this.ae.b();
            this.k.b();
            this.i.close();
            this.D = true;
            this.ak.countDown();
        }
    }

    public final String toString() {
        dbsb b2 = dbsc.b(this);
        b2.g("logId", this.h.a);
        b2.b("target", this.Y);
        return b2.toString();
    }

    public final void u(String str) {
        try {
            this.m.c();
        } catch (IllegalStateException e2) {
            a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl", "logWarningIfNotInSyncContext", str.concat(" should be called from SynchronizationContext. This warning will become an exception in a future release. See https://github.com/grpc/grpc-java/issues/5015 for more details"), (Throwable) e2);
        }
    }

    @Override // defpackage.dyhi
    /* renamed from: v */
    public final void f() {
        this.G.a(1, "shutdown() called");
        if (!this.A.compareAndSet(false, true)) {
            return;
        }
        this.m.execute(new dyqq(this));
        dyrp dyrpVar = this.I;
        dyrpVar.b.m.execute(new dyri(dyrpVar));
        this.m.execute(new dyql(this));
    }

    @Override // defpackage.dyhi
    /* renamed from: w */
    public final void g() {
        this.G.a(1, "shutdownNow() called");
        f();
        dyrp dyrpVar = this.I;
        dyrpVar.b.m.execute(new dyrj(dyrpVar));
        this.m.execute(new dyqr(this));
    }
}
