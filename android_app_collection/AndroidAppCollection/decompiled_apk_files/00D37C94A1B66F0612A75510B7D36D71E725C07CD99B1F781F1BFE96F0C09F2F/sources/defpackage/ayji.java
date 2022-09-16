package defpackage;

import io.grpc.Status;
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
import java.util.logging.Logger;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: ayji  reason: default package */
/* loaded from: classes2.dex */
public final class ayji extends ayal implements axzr {
    public static final Logger a = Logger.getLogger(ayji.class.getName());
    static final Pattern b = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
    static final Status c = Status.o.withDescription("Channel shutdownNow invoked");
    public static final Status d = Status.o.withDescription("Channel shutdown invoked");
    static final Status e = Status.o.withDescription("Subchannel shutdown invoked");
    public static final ayjr f = new ayjr(null, new HashMap(), new HashMap(), null, null, null);
    public static final axzq g = new ayif();
    public static final axyg h = new ayil();
    public final AtomicBoolean A;
    public boolean B;
    public boolean C;
    public volatile boolean D;
    public final ayee E;
    public final ayeg F;
    public final axyf G;
    public final axzn H;
    public final ayje I;

    /* renamed from: J  reason: collision with root package name */
    public ayjr f134J;
    public boolean K;
    public final boolean L;
    public final aylg M;
    public final long N;
    public final long O;
    public final boolean P;
    final ayhj Q;
    public aybw R;
    public int S;
    public aygs T;
    public final ayig U;
    public final ayin V;
    private final String W;
    private final aybb X;
    private final ayaz Y;
    private final ayeb Z;
    private final ayir aa;
    private final long ab;
    private final axye ac;
    private aybg ad;
    private boolean ae;
    private final Set af;
    private final CountDownLatch ag;
    private final ayjs ah;
    private final ayks ai;
    private final aymj aj;
    public final axzs i;
    public final ayet j;
    public final ayjf k;
    public final Executor l;
    public final ayir m;
    public final aymp n;
    public final aybx o;
    public final axzb p;
    public final ayfa q;
    public final String r;
    public ayiv s;
    public volatile ayah t;
    public boolean u;
    public final Set v;
    public Collection w;
    public final Object x;
    public final ayfv y;
    public final ayjh z;

    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public ayji(ayjm ayjmVar, ayet ayetVar, aymj aymjVar, amqo amqoVar, List list, aymp aympVar) {
        aybx aybxVar = new aybx(new ayij(this));
        this.o = aybxVar;
        this.q = new ayfa();
        this.v = new HashSet(16, 0.75f);
        this.x = new Object();
        this.af = new HashSet(1, 0.75f);
        this.z = new ayjh(this);
        this.A = new AtomicBoolean(false);
        this.ag = new CountDownLatch(1);
        this.S = 1;
        this.f134J = f;
        this.K = false;
        this.M = new aylg();
        ayiq ayiqVar = new ayiq(this);
        this.ah = ayiqVar;
        this.Q = new ayis(this);
        this.V = new ayin(this);
        String str = ayjmVar.f;
        str.getClass();
        this.W = str;
        axzs b2 = axzs.b("Channel", str);
        this.i = b2;
        this.n = aympVar;
        aymj aymjVar2 = ayjmVar.n;
        aymjVar2.getClass();
        this.aj = aymjVar2;
        ?? b3 = aymjVar2.b();
        b3.getClass();
        this.l = b3;
        ayed ayedVar = new ayed(ayetVar, b3);
        this.j = ayedVar;
        new ayed(ayetVar, b3);
        ayjf ayjfVar = new ayjf(ayedVar.b());
        this.k = ayjfVar;
        long a2 = aympVar.a();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("Channel for '");
        sb.append(str);
        sb.append("'");
        ayeg ayegVar = new ayeg(b2, a2, sb.toString());
        this.F = ayegVar;
        ayef ayefVar = new ayef(ayegVar, aympVar);
        this.G = ayefVar;
        aybn aybnVar = ayhf.i;
        this.P = true;
        ayeb ayebVar = new ayeb(ayak.b());
        this.Z = ayebVar;
        aymj aymjVar3 = ayjmVar.o;
        aymjVar3.getClass();
        this.m = new ayir(aymjVar3);
        aybf aybfVar = new aybf(true, ayebVar);
        ayay ayayVar = new ayay();
        ayayVar.a = 443;
        aybnVar.getClass();
        ayayVar.b = aybnVar;
        ayayVar.c = aybxVar;
        ayayVar.e = ayjfVar;
        ayayVar.d = aybfVar;
        ayayVar.f = ayefVar;
        ayayVar.g = new ayik(this);
        ayaz ayazVar = new ayaz(ayayVar.a, ayayVar.b, ayayVar.c, ayayVar.d, ayayVar.e, ayayVar.f, ayayVar.g);
        this.Y = ayazVar;
        aybb aybbVar = ayjmVar.e;
        this.X = aybbVar;
        this.ad = o(str, aybbVar, ayazVar);
        this.aa = new ayir(aymjVar);
        ayfv ayfvVar = new ayfv(b3, aybxVar);
        this.y = ayfvVar;
        ayfvVar.f = ayiqVar;
        ayfvVar.c = new ayfs(ayiqVar, 1);
        ayfvVar.d = new ayfs(ayiqVar);
        ayfvVar.e = new ayfs(ayiqVar, 2);
        this.L = true;
        ayje ayjeVar = new ayje(this, this.ad.a());
        this.I = ayjeVar;
        this.ac = axyl.a(ayjeVar, list);
        amqoVar.getClass();
        long j = ayjmVar.j;
        if (j == -1) {
            this.ab = j;
        } else {
            aqxo.t(j >= ayjm.b, "invalid idleTimeoutMillis %s", ayjmVar.j);
            this.ab = ayjmVar.j;
        }
        this.ai = new ayks(new ayii(this, 4), aybxVar, ayedVar.b(), amqi.c());
        axzb axzbVar = ayjmVar.h;
        axzbVar.getClass();
        this.p = axzbVar;
        ayjmVar.i.getClass();
        this.r = ayjmVar.g;
        this.O = 16777216L;
        this.N = 1048576L;
        ayig ayigVar = new ayig(aympVar);
        this.U = ayigVar;
        this.E = ayigVar.a();
        axzn axznVar = ayjmVar.k;
        axznVar.getClass();
        this.H = axznVar;
        axzn.a(axznVar.b, this);
    }

    private static aybg o(String str, aybb aybbVar, ayaz ayazVar) {
        URI uri;
        aybg a2;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e2) {
            sb.append(e2.getMessage());
            uri = null;
        }
        if (uri == null || (a2 = aybbVar.a(uri, ayazVar)) == null) {
            String str2 = "";
            if (!b.matcher(str).matches()) {
                try {
                    String b2 = aybbVar.b();
                    String valueOf = String.valueOf(str);
                    aybg a3 = aybbVar.a(new URI(b2, str2, valueOf.length() != 0 ? "/".concat(valueOf) : new String("/"), null), ayazVar);
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

    private final void p() {
        this.o.d();
        aybw aybwVar = this.R;
        if (aybwVar != null) {
            aybwVar.a();
            this.R = null;
            this.T = null;
        }
    }

    @Override // defpackage.axye
    public final axyg a(ayax ayaxVar, axyd axydVar) {
        return this.ac.a(ayaxVar, axydVar);
    }

    @Override // defpackage.axye
    public final String b() {
        return this.ac.b();
    }

    @Override // defpackage.axzw
    public final axzs c() {
        return this.i;
    }

    public final Executor d(axyd axydVar) {
        Executor executor = axydVar.c;
        return executor == null ? this.l : executor;
    }

    public final void e(boolean z) {
        ScheduledFuture scheduledFuture;
        ayks ayksVar = this.ai;
        ayksVar.e = false;
        if (!z || (scheduledFuture = ayksVar.f) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        ayksVar.f = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        this.o.d();
        if (this.A.get() || this.u) {
            return;
        }
        if (this.Q.d()) {
            e(false);
        } else {
            k();
        }
        if (this.s != null) {
            return;
        }
        this.G.a(2, "Exiting idle mode");
        ayiv ayivVar = new ayiv(this);
        ayivVar.a = new aydw(this.Z, ayivVar);
        this.s = ayivVar;
        this.ad.d(new aybc(this, ayivVar, this.ad));
        this.ae = true;
    }

    public final void g() {
        if (this.B) {
            for (ayia ayiaVar : this.v) {
                Status status = c;
                ayiaVar.g(status);
                ayiaVar.e.execute(new ayhq(ayiaVar, status));
            }
            Iterator it = this.af.iterator();
            if (!it.hasNext()) {
                return;
            }
            aykd aykdVar = (aykd) it.next();
            throw null;
        }
    }

    public final void h() {
        if (!this.D && this.A.get() && this.v.isEmpty() && this.af.isEmpty()) {
            this.G.a(2, "Terminated");
            axzn.b(this.H.b, this);
            this.aj.c(this.l);
            this.aa.b();
            this.m.b();
            this.j.close();
            this.D = true;
            this.ag.countDown();
        }
    }

    public final void i() {
        this.o.d();
        p();
        j();
    }

    public final void j() {
        this.o.d();
        if (this.ae) {
            this.ad.b();
        }
    }

    public final void k() {
        long j = this.ab;
        if (j == -1) {
            return;
        }
        ayks ayksVar = this.ai;
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        long a2 = ayksVar.a() + nanos;
        ayksVar.e = true;
        if (a2 - ayksVar.d < 0 || ayksVar.f == null) {
            ScheduledFuture scheduledFuture = ayksVar.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ayksVar.f = ayksVar.a.schedule(new aykr(ayksVar), nanos, TimeUnit.NANOSECONDS);
        }
        ayksVar.d = a2;
    }

    public final void l(boolean z) {
        this.o.d();
        if (z) {
            aqxo.z(this.ae, "nameResolver is not started");
            aqxo.z(this.s != null, "lbHelper is null");
        }
        if (this.ad != null) {
            p();
            this.ad.c();
            this.ae = false;
            if (z) {
                this.ad = o(this.W, this.X, this.Y);
            } else {
                this.ad = null;
            }
        }
        ayiv ayivVar = this.s;
        if (ayivVar != null) {
            aydw aydwVar = ayivVar.a;
            aydwVar.b.c();
            aydwVar.b = null;
            this.s = null;
        }
        this.t = null;
    }

    public final void m(ayah ayahVar) {
        this.t = ayahVar;
        this.y.a(ayahVar);
    }

    public final void n() {
        this.G.a(1, "shutdown() called");
        if (!this.A.compareAndSet(false, true)) {
            return;
        }
        this.o.execute(new ayii(this));
        ayje ayjeVar = this.I;
        ayjeVar.c.o.execute(new ayiz(ayjeVar, 1));
        this.o.execute(new ayii(this, 1));
    }

    public final String toString() {
        ampp c2 = akzj.c(this);
        c2.f("logId", this.i.a);
        c2.b("target", this.W);
        return c2.toString();
    }
}
