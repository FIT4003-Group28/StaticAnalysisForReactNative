package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: agmz  reason: default package */
/* loaded from: classes.dex */
public final class agmz {
    private static final Object m = new Object();
    public final snc j;
    public final Object k = new Object();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final yne l = new yne(new agsf(1));
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final HashMap h = new HashMap();
    public final HashMap i = new HashMap();

    public agmz(snc sncVar) {
        this.j = sncVar;
    }

    public final agml a(String str) {
        agml agmlVar;
        synchronized (this.k) {
            zgh.m(str);
            agmlVar = (agml) this.a.get(str);
        }
        return agmlVar;
    }

    public final Collection b() {
        Collection values;
        synchronized (this.k) {
            values = this.b.values();
        }
        return values;
    }

    public final Set c(String str) {
        Set L;
        synchronized (this.k) {
            L = zew.L(this.f, str);
        }
        return L;
    }

    public final void d(String str) {
        synchronized (this.k) {
            zgh.m(str);
            this.e.put(str, m);
            agmx agmxVar = (agmx) this.b.get(str);
            if (agmxVar != null) {
                agmxVar.g();
                this.l.a(Long.valueOf(agmxVar.c), agmxVar);
            }
        }
    }

    public final void e(String str, String str2) {
        synchronized (this.k) {
            zew.M(this.g, str, str2);
            zew.M(this.f, str2, str);
        }
    }

    public final void f(String str, String str2) {
        synchronized (this.k) {
            zew.M(this.i, str, str2);
            zew.M(this.h, str2, str);
        }
    }

    public final void g(agql agqlVar) {
        String g = agqlVar.g();
        synchronized (this.k) {
            agmw agmwVar = (agmw) this.a.get(g);
            if (agmwVar != null) {
                agmwVar.g(agqlVar);
            }
        }
    }

    public final boolean h(String str) {
        boolean containsKey;
        synchronized (this.k) {
            zgh.m(str);
            containsKey = this.e.containsKey(str);
        }
        return containsKey;
    }

    public final agmv i(String str) {
        agmv agmvVar;
        synchronized (this.k) {
            zgh.m(str);
            agmvVar = (agmv) this.c.get(str);
        }
        return agmvVar;
    }

    public final agmx j(String str) {
        agmx agmxVar;
        synchronized (this.k) {
            zgh.m(str);
            agmxVar = (agmx) this.b.get(str);
        }
        return agmxVar;
    }

    public final agmx k(agqo agqoVar, attl attlVar, int i, byte[] bArr, agqe agqeVar, agqn agqnVar, long j) {
        agqoVar.getClass();
        agmx agmxVar = new agmx(this, agqoVar, attlVar, i, bArr, agqeVar, agqnVar, j);
        synchronized (this.k) {
            this.b.put(agqoVar.f(), agmxVar);
        }
        return agmxVar;
    }

    public final void l(agqq agqqVar, List list, List list2, int i) {
        synchronized (this.k) {
            agqqVar.getClass();
            this.d.put(agqqVar.a, new agmy(this, agqqVar, list, list2, i));
        }
    }

    public final void m(agqf agqfVar, List list, attl attlVar, long j, long j2, int i) {
        synchronized (this.k) {
            agqfVar.getClass();
            this.c.put(agqfVar.a, new agmv(this, agqfVar, list, attlVar, j, j2, i));
        }
    }
}
