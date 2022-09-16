package defpackage;

import io.grpc.Status;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: ayix  reason: default package */
/* loaded from: classes2.dex */
public final class ayix implements Runnable {
    final /* synthetic */ aybe a;
    final /* synthetic */ aybc b;

    public ayix(aybc aybcVar, aybe aybeVar) {
        this.b = aybcVar;
        this.a = aybeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ayjr ayjrVar;
        Status status;
        Object obj;
        aybe aybeVar = this.a;
        List list = aybeVar.a;
        this.b.c.G.b(1, "Resolved address: {0}, config={1}", list, aybeVar.b);
        ayji ayjiVar = this.b.c;
        if (ayjiVar.S != 2) {
            ayjiVar.G.b(2, "Address resolved: {0}", list);
            this.b.c.S = 2;
        }
        this.b.c.T = null;
        aybe aybeVar2 = this.a;
        ayba aybaVar = aybeVar2.c;
        axzq axzqVar = (axzq) aybeVar2.b.c(axzq.a);
        ayjr ayjrVar2 = (aybaVar == null || (obj = aybaVar.b) == null) ? null : (ayjr) obj;
        Status status2 = aybaVar != null ? aybaVar.a : null;
        ayji ayjiVar2 = this.b.c;
        if (!ayjiVar2.L) {
            if (ayjrVar2 != null) {
                ayjiVar2.G.a(2, "Service config from name resolver discarded by channel settings");
            }
            ayjrVar = ayji.f;
            if (axzqVar != null) {
                this.b.c.G.a(2, "Config selector from name resolver discarded by channel settings");
            }
            this.b.c.I.d(ayjrVar.a());
        } else {
            if (ayjrVar2 != null) {
                if (axzqVar != null) {
                    ayjiVar2.I.d(axzqVar);
                    if (ayjrVar2.a() != null) {
                        this.b.c.G.a(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                    }
                } else {
                    ayjiVar2.I.d(ayjrVar2.a());
                }
            } else if (status2 == null) {
                ayjrVar2 = ayji.f;
                this.b.c.I.d(null);
            } else if (!ayjiVar2.K) {
                ayjiVar2.G.a(2, "Fallback to error due to invalid first service config without default config");
                this.b.b(aybaVar.a);
                return;
            } else {
                ayjrVar2 = ayjiVar2.f134J;
            }
            if (!ayjrVar2.equals(this.b.c.f134J)) {
                axyf axyfVar = this.b.c.G;
                Object[] objArr = new Object[1];
                objArr[0] = ayjrVar2 == ayji.f ? " to empty" : "";
                axyfVar.b(2, "Service config changed{0}", objArr);
                this.b.c.f134J = ayjrVar2;
            }
            try {
                this.b.c.K = true;
            } catch (RuntimeException e) {
                Logger logger = ayji.a;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(this.b.c.i);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
                sb.append("[");
                sb.append(valueOf);
                sb.append("] Unexpected exception from parsing service config");
                logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener$1NamesResolved", "run", sb.toString(), (Throwable) e);
            }
            ayjrVar = ayjrVar2;
        }
        axyb axybVar = this.a.b;
        aybc aybcVar = this.b;
        if (aybcVar.a == aybcVar.c.s) {
            axxz b = axybVar.b();
            axya axyaVar = axzq.a;
            if (b.a.b.containsKey(axyaVar)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(b.a.b);
                identityHashMap.remove(axyaVar);
                b.a = new axyb(identityHashMap);
            }
            Map map = b.b;
            if (map != null) {
                map.remove(axyaVar);
            }
            Map map2 = ayjrVar.c;
            if (map2 != null) {
                b.b(ayai.a, map2);
                b.a();
            }
            aydw aydwVar = this.b.a.a;
            ayae a = ayaf.a();
            a.a = list;
            a.b = b.a();
            a.c = ayjrVar.b;
            ayaf a2 = a.a();
            List list2 = a2.a;
            axyb axybVar2 = a2.b;
            aymd aymdVar = (aymd) a2.c;
            if (aymdVar == null) {
                try {
                    ayeb ayebVar = aydwVar.d;
                    String str = ayebVar.b;
                    ayaj a3 = ayebVar.a.a(str);
                    if (a3 == null) {
                        StringBuilder sb2 = new StringBuilder(str.length() + 68);
                        sb2.append("Trying to load '");
                        sb2.append(str);
                        sb2.append("' because ");
                        sb2.append("using default policy");
                        sb2.append(", but it's unavailable");
                        throw new ayea(sb2.toString());
                    }
                    aymdVar = new aymd(a3, null);
                } catch (ayea e2) {
                    aydwVar.a.b(axyt.TRANSIENT_FAILURE, new aydy(Status.n.withDescription(e2.getMessage())));
                    aydwVar.b.c();
                    aydwVar.c = null;
                    aydwVar.b = new aydz();
                    status = Status.b;
                }
            }
            if (aydwVar.c == null || !aymdVar.a.b().equals(aydwVar.c.b())) {
                aydwVar.a.b(axyt.CONNECTING, new aydx());
                aydwVar.b.c();
                aydwVar.c = aymdVar.a;
                ayai ayaiVar = aydwVar.b;
                aydwVar.b = aydwVar.c.a(aydwVar.a);
                aydwVar.a.a().b(2, "Load balancer changed from {0} to {1}", ayaiVar.getClass().getSimpleName(), aydwVar.b.getClass().getSimpleName());
            }
            Object obj2 = aymdVar.b;
            if (obj2 != null) {
                aydwVar.a.a().b(1, "Load-balancing config: {0}", aymdVar.b);
            }
            ayai ayaiVar2 = aydwVar.b;
            if (a2.a.isEmpty()) {
                Status status3 = Status.o;
                String valueOf2 = String.valueOf(list2);
                String valueOf3 = String.valueOf(axybVar2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 55 + String.valueOf(valueOf3).length());
                sb3.append("NameResolver returned no usable address. addrs=");
                sb3.append(valueOf2);
                sb3.append(", attrs=");
                sb3.append(valueOf3);
                status = status3.withDescription(sb3.toString());
            } else {
                ayae a4 = ayaf.a();
                a4.a = a2.a;
                a4.b = axybVar2;
                a4.c = obj2;
                ayaiVar2.b(a4.a());
                status = Status.b;
            }
            if (status.f()) {
                return;
            }
            aybc aybcVar2 = this.b;
            String valueOf4 = String.valueOf(aybcVar2.b);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 9);
            sb4.append(valueOf4);
            sb4.append(" was used");
            aybcVar2.a(status.a(sb4.toString()));
        }
    }
}
