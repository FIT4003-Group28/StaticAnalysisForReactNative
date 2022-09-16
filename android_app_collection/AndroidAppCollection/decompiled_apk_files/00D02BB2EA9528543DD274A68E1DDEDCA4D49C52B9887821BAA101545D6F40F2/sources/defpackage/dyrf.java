package defpackage;

import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dyrf  reason: default package */
/* loaded from: classes6.dex */
final class dyrf implements Runnable {
    final /* synthetic */ dyii a;
    final /* synthetic */ dyrg b;

    public dyrf(dyrg dyrgVar, dyii dyiiVar) {
        this.b = dyrgVar;
        this.a = dyiiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dysk dyskVar;
        dyjb dyjbVar;
        Object obj;
        dyii dyiiVar = this.a;
        List<dyfw> list = dyiiVar.a;
        this.b.c.G.b(1, "Resolved address: {0}, config={1}", list, dyiiVar.b);
        dyrz dyrzVar = this.b.c;
        if (dyrzVar.U != 2) {
            dyrzVar.G.b(2, "Address resolved: {0}", list);
            this.b.c.U = 2;
        }
        this.b.c.W = null;
        dyii dyiiVar2 = this.a;
        dyie dyieVar = dyiiVar2.c;
        dygm dygmVar = (dygm) dyiiVar2.b.a(dygm.a);
        dysk dyskVar2 = (dyieVar == null || (obj = dyieVar.b) == null) ? null : (dysk) obj;
        dyjb dyjbVar2 = dyieVar != null ? dyieVar.a : null;
        dyrz dyrzVar2 = this.b.c;
        if (!dyrzVar2.M) {
            if (dyskVar2 != null) {
                dyrzVar2.G.a(2, "Service config from name resolver discarded by channel settings");
            }
            dyskVar = dyrz.f;
            if (dygmVar != null) {
                this.b.c.G.a(2, "Config selector from name resolver discarded by channel settings");
            }
            this.b.c.I.c(dyskVar.a());
        } else {
            if (dyskVar2 != null) {
                if (dygmVar != null) {
                    dyrzVar2.I.c(dygmVar);
                    if (dyskVar2.a() != null) {
                        this.b.c.G.a(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                    }
                } else {
                    dyrzVar2.I.c(dyskVar2.a());
                }
            } else if (dyjbVar2 == null) {
                dyskVar2 = dyrz.f;
                this.b.c.I.c(null);
            } else if (!dyrzVar2.L) {
                dyrzVar2.G.a(2, "Fallback to error due to invalid first service config without default config");
                this.b.b(dyieVar.a);
                return;
            } else {
                dyskVar2 = dyrzVar2.J;
            }
            if (!dyskVar2.equals(this.b.c.J)) {
                dyev dyevVar = this.b.c.G;
                Object[] objArr = new Object[1];
                objArr[0] = dyskVar2 == dyrz.f ? " to empty" : "";
                dyevVar.b(2, "Service config changed{0}", objArr);
                this.b.c.J = dyskVar2;
            }
            try {
                this.b.c.L = true;
            } catch (RuntimeException e) {
                Logger logger = dyrz.a;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(this.b.c.h);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
                sb.append("[");
                sb.append(valueOf);
                sb.append("] Unexpected exception from parsing service config");
                logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener$1NamesResolved", "run", sb.toString(), (Throwable) e);
            }
            dyskVar = dyskVar2;
        }
        dyel dyelVar = this.a.b;
        dyrg dyrgVar = this.b;
        if (dyrgVar.a == dyrgVar.c.s) {
            dyej c = dyelVar.c();
            dyek<dygm> dyekVar = dygm.a;
            if (c.a.a.containsKey(dyekVar)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(c.a.a);
                identityHashMap.remove(dyekVar);
                c.a = new dyel(identityHashMap);
            }
            Map<dyek<?>, Object> map = c.b;
            if (map != null) {
                map.remove(dyekVar);
            }
            Map<String, ?> map2 = dyskVar.f;
            if (map2 != null) {
                c.b(dyhe.a, map2);
                c.a();
            }
            dykv dykvVar = this.b.a.a;
            dyha a = dyhb.a();
            a.a = list;
            a.b = c.a();
            a.c = dyskVar.e;
            dyhb a2 = a.a();
            List<dyfw> list2 = a2.a;
            dyel dyelVar2 = a2.b;
            dyvb dyvbVar = (dyvb) a2.c;
            if (dyvbVar == null) {
                try {
                    dyla dylaVar = dykvVar.d;
                    String str = dylaVar.b;
                    dyhf b = dylaVar.a.b(str);
                    if (b == null) {
                        StringBuilder sb2 = new StringBuilder(str.length() + 68);
                        sb2.append("Trying to load '");
                        sb2.append(str);
                        sb2.append("' because ");
                        sb2.append("using default policy");
                        sb2.append(", but it's unavailable");
                        throw new dykz(sb2.toString());
                    }
                    dyvbVar = new dyvb(b, null);
                } catch (dykz e2) {
                    dykvVar.a.a(dyfk.TRANSIENT_FAILURE, new dykx(dyjb.l.g(e2.getMessage())));
                    dykvVar.b.c();
                    dykvVar.c = null;
                    dykvVar.b = new dyky();
                    dyjbVar = dyjb.b;
                }
            }
            if (dykvVar.c == null || !dyvbVar.a.d().equals(dykvVar.c.d())) {
                dykvVar.a.a(dyfk.CONNECTING, new dykw());
                dykvVar.b.c();
                dykvVar.c = dyvbVar.a;
                dyhe dyheVar = dykvVar.b;
                dykvVar.b = dykvVar.c.a(dykvVar.a);
                dykvVar.a.b().b(2, "Load balancer changed from {0} to {1}", dyheVar.getClass().getSimpleName(), dykvVar.b.getClass().getSimpleName());
            }
            Object obj2 = dyvbVar.b;
            if (obj2 != null) {
                dykvVar.a.b().b(1, "Load-balancing config: {0}", dyvbVar.b);
            }
            dyhe dyheVar2 = dykvVar.b;
            if (a2.a.isEmpty()) {
                dyjb dyjbVar3 = dyjb.m;
                String valueOf2 = String.valueOf(list2);
                String valueOf3 = String.valueOf(dyelVar2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 55 + String.valueOf(valueOf3).length());
                sb3.append("NameResolver returned no usable address. addrs=");
                sb3.append(valueOf2);
                sb3.append(", attrs=");
                sb3.append(valueOf3);
                dyjbVar = dyjbVar3.g(sb3.toString());
            } else {
                dyha a3 = dyhb.a();
                a3.a = a2.a;
                a3.b = dyelVar2;
                a3.c = obj2;
                dyheVar2.a(a3.a());
                dyjbVar = dyjb.b;
            }
            if (dyjbVar.i()) {
                return;
            }
            dyrg dyrgVar2 = this.b;
            String valueOf4 = String.valueOf(dyrgVar2.b);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 9);
            sb4.append(valueOf4);
            sb4.append(" was used");
            dyrgVar2.c(dyjbVar.h(sb4.toString()));
        }
    }
}
