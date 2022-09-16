package defpackage;

import io.grpc.Status;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: ayia  reason: default package */
/* loaded from: classes2.dex */
public final class ayia implements axzr, aymr {
    public final ayhu a;
    public final ScheduledExecutorService b;
    public final axzn c;
    public final axyf d;
    public final aybx e;
    public final ayhv f;
    public volatile List g;
    public final amqi h;
    public aybw i;
    public aybw j;
    public ayjt k;
    public ayez n;
    public volatile ayjt o;
    public Status q;
    public aygs r;
    private final axzs s;
    private final String t;
    private final String u;
    private final ayet v;
    private final ayee w;
    public final Collection l = new ArrayList();
    public final ayhj m = new ayhl(this);
    public volatile axyu p = axyu.a(axyt.IDLE);

    public ayia(List list, String str, String str2, ayet ayetVar, ScheduledExecutorService scheduledExecutorService, aybx aybxVar, ayhu ayhuVar, axzn axznVar, ayee ayeeVar, axzs axzsVar, axyf axyfVar) {
        aqxo.q(!list.isEmpty(), "addressGroups is empty");
        j(list);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.g = unmodifiableList;
        this.f = new ayhv(unmodifiableList);
        this.t = str;
        this.u = str2;
        this.v = ayetVar;
        this.b = scheduledExecutorService;
        this.h = amqi.c();
        this.e = aybxVar;
        this.a = ayhuVar;
        this.c = axznVar;
        this.w = ayeeVar;
        this.s = axzsVar;
        this.d = axyfVar;
    }

    public static void j(List list) {
        for (Object obj : list) {
            obj.getClass();
        }
    }

    public static final String k(Status status) {
        StringBuilder sb = new StringBuilder();
        sb.append(status.getCode());
        if (status.getDescription() != null) {
            sb.append("(");
            sb.append(status.getDescription());
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.aymr
    public final ayer a() {
        ayjt ayjtVar = this.o;
        if (ayjtVar != null) {
            return ayjtVar;
        }
        this.e.execute(new ayhm(this));
        return null;
    }

    public final void b(axyt axytVar) {
        this.e.d();
        d(axyu.a(axytVar));
    }

    @Override // defpackage.axzw
    public final axzs c() {
        return this.s;
    }

    public final void d(axyu axyuVar) {
        ayah aykfVar;
        this.e.d();
        if (this.p.a != axyuVar.a) {
            boolean z = this.p.a != axyt.SHUTDOWN;
            String valueOf = String.valueOf(axyuVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Cannot transition out of SHUTDOWN to ");
            sb.append(valueOf);
            aqxo.z(z, sb.toString());
            this.p = axyuVar;
            ayhu ayhuVar = this.a;
            aqxo.z(true, "listener is null");
            ayke aykeVar = ayhuVar.a;
            ayki aykiVar = aykeVar.b;
            ayag ayagVar = aykeVar.a;
            axyt axytVar = axyuVar.a;
            if (axytVar != axyt.SHUTDOWN) {
                if (axyuVar.a == axyt.TRANSIENT_FAILURE || axyuVar.a == axyt.IDLE) {
                    ayiv ayivVar = (ayiv) aykiVar.b;
                    ayivVar.c.o.d();
                    ayivVar.b = true;
                    ayivVar.c.o.execute(new ayit(ayivVar));
                }
                int ordinal = axytVar.ordinal();
                if (ordinal == 0) {
                    aykfVar = new aykf(ayac.a);
                } else if (ordinal == 1) {
                    aykfVar = new aykf(ayac.c(ayagVar));
                } else if (ordinal == 2) {
                    aykfVar = new aykf(ayac.b(axyuVar.b));
                } else if (ordinal == 3) {
                    aykfVar = new aykh(aykiVar, ayagVar);
                } else {
                    String valueOf2 = String.valueOf(axytVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 18);
                    sb2.append("Unsupported state:");
                    sb2.append(valueOf2);
                    throw new IllegalArgumentException(sb2.toString());
                }
                aykiVar.b.b(axytVar, aykfVar);
            }
            if ((axyuVar.a != axyt.TRANSIENT_FAILURE && axyuVar.a != axyt.IDLE) || ayhuVar.b.b.b) {
                return;
            }
            ayji.a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$SubchannelImpl$1ManagedInternalSubchannelCallback", "onStateChange", "LoadBalancer should call Helper.refreshNameResolution() to refresh name resolution if subchannel state becomes TRANSIENT_FAILURE or IDLE. This will no longer happen automatically in the future releases");
            ayhuVar.b.j.i();
            ayhuVar.b.b.b = true;
        }
    }

    public final void e() {
        this.e.execute(new ayhm(this, 2));
    }

    public final void f(ayez ayezVar, boolean z) {
        this.e.execute(new ayhp(this, ayezVar, z));
    }

    public final void g(Status status) {
        this.e.execute(new ayhq(this, status, 1));
    }

    public final void h() {
        axzi axziVar;
        this.e.d();
        aqxo.z(this.i == null, "Should have no reconnectTask scheduled");
        ayhv ayhvVar = this.f;
        if (ayhvVar.b == 0 && ayhvVar.c == 0) {
            amqi amqiVar = this.h;
            amqiVar.e();
            amqiVar.f();
        }
        SocketAddress a = this.f.a();
        if (a instanceof axzi) {
            axzi axziVar2 = (axzi) a;
            axziVar = axziVar2;
            a = axziVar2.a;
        } else {
            axziVar = null;
        }
        ayhv ayhvVar2 = this.f;
        axyb axybVar = ((axzc) ayhvVar2.a.get(ayhvVar2.b)).c;
        String str = (String) axybVar.c(axzc.a);
        ayes ayesVar = new ayes();
        if (str == null) {
            str = this.t;
        }
        str.getClass();
        ayesVar.a = str;
        ayesVar.b = axybVar;
        ayesVar.c = this.u;
        ayesVar.d = axziVar;
        ayhz ayhzVar = new ayhz();
        ayhzVar.a = this.s;
        ayht ayhtVar = new ayht(this.v.a(a, ayesVar, ayhzVar), this.w);
        ayhzVar.a = ayhtVar.c();
        axzn.a(this.c.d, ayhtVar);
        this.n = ayhtVar;
        this.l.add(ayhtVar);
        Runnable d = ayhtVar.d(new ayhy(this, ayhtVar));
        if (d != null) {
            this.e.c(d);
        }
        this.d.b(2, "Started transport {0}", ayhzVar.a);
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.f("logId", this.s.a);
        c.b("addressGroups", this.g);
        return c.toString();
    }
}
