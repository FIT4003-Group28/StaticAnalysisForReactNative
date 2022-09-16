package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: aems  reason: default package */
/* loaded from: classes.dex */
public final class aems {
    public static final aent a = new aent(new byte[0], "", 0, 0, -1, false, false, "", 0, aent.a);
    public final aemo i;
    public final aemo j;
    public final ankt k;
    public final ankt l;
    public final ExecutorService m;
    public final snc n;
    public final aemg p;
    public final aflm q;
    public volatile int t;
    public int u;
    private final aadd z;
    public final Set b = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Map c = new ConcurrentHashMap();
    public final Set d = Collections.newSetFromMap(new ConcurrentHashMap());
    private final Map v = new ConcurrentHashMap();
    public final Map e = new ConcurrentHashMap();
    private aemq w = null;
    private final aemp x = new aemp(this);
    public final aemr f = new aemr(this);
    public final Map g = new ConcurrentHashMap();
    public final Set h = Collections.synchronizedSet(new HashSet());
    public final AtomicBoolean r = new AtomicBoolean();
    public boolean s = false;
    public final aemf o = new aemf();
    private final aeml y = new aeml(this);

    public aems(ExecutorService executorService, snc sncVar, aadd aaddVar, aflm aflmVar) {
        this.m = executorService;
        this.n = sncVar;
        this.p = new aemg(aaddVar);
        this.z = aaddVar;
        this.q = aflmVar;
        aemo aemoVar = new aemo();
        this.i = aemoVar;
        aemo aemoVar2 = new aemo();
        this.j = aemoVar2;
        this.k = aed.c(new aemi(aemoVar, 1));
        this.l = aed.c(new aemi(aemoVar2));
        this.u = 1;
    }

    private final synchronized aemk s(aent aentVar) {
        long j;
        long j2;
        boolean z = this.s;
        j = -1;
        j2 = z ? aentVar.f : -1L;
        if (!z) {
            j = aentVar.e;
        }
        return new aemk(aentVar.c, aentVar.d, j, j2, aentVar.j);
    }

    private final synchronized void t(aent aentVar, byte[] bArr, int i, int i2) {
        String str = aentVar.c;
        int i3 = aentVar.d;
        String.valueOf(str).length();
        this.o.a(aentVar.c, aentVar.d, aentVar.b.length, aentVar.i, aeme.DECRYPTED, this.q);
        aemk s = s(aentVar);
        aemu aemuVar = (aemu) this.c.get(s);
        if (aemuVar == null) {
            aemuVar = new aelz(aentVar.i);
            this.c.put(s, aemuVar);
            u(aentVar.c, Integer.valueOf(aentVar.d));
        }
        aemuVar.d(bArr, i, i2, aentVar.k);
        if (aentVar.h) {
            aemuVar.c();
        }
        notifyAll();
    }

    private final synchronized void u(String str, Integer num) {
        attt atttVar;
        Set hashSet;
        arhd a2 = this.z.a();
        if (a2 != null) {
            atdy atdyVar = a2.i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            attv attvVar = atdyVar.d;
            if (attvVar == null) {
                attvVar = attv.a;
            }
            atttVar = attvVar.g;
            if (atttVar == null) {
                atttVar = attt.b;
            }
        } else {
            atttVar = attt.b;
        }
        if (atttVar.r) {
            if (this.v.containsKey(str)) {
                hashSet = (Set) this.v.get(str);
            } else {
                hashSet = new HashSet();
            }
            hashSet.add(num);
            this.v.put(str, hashSet);
        }
    }

    private final boolean v() {
        int i = this.u;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final orj a(String str) {
        if (this.r.get()) {
            return null;
        }
        if (this.w == null && this.p.d) {
            this.x.c(str);
        }
        aemq aemqVar = this.w;
        if (aemqVar != null && aemqVar.c.n.d() - aemqVar.b <= 8000 && aemqVar.a.c.equals(str)) {
            return aemqVar.a;
        }
        return null;
    }

    public final synchronized Set b(String str) {
        Set hashSet;
        if (this.v.containsKey(str)) {
            hashSet = (Set) this.v.get(str);
        } else {
            hashSet = new HashSet();
        }
        return hashSet;
    }

    public final synchronized void c(aent aentVar) {
        afms.a(aentVar.b);
        if (!v()) {
            return;
        }
        this.h.add(aentVar.c);
        this.o.a(aentVar.c, aentVar.d, aentVar.b.length, aentVar.i, aeme.RECEIVED, this.q);
        aemk s = s(aentVar);
        boolean contains = this.b.contains(s);
        if (!aentVar.g && !contains) {
            byte[] bArr = aentVar.b;
            t(aentVar, bArr, 0, bArr.length);
            return;
        }
        this.y.a(aentVar);
        if (contains) {
            return;
        }
        this.b.add(s);
    }

    public final synchronized void d(oqx oqxVar) {
        if (v() && this.p.a) {
            int i = oqxVar.b;
            if ((i & 2) == 0 || (i & 1) == 0) {
                afus.b(1, 8, "hostname_change_hint_missing_information");
                return;
            }
            this.g.put(oqxVar.d, new afhk(new HashSet(oqxVar.e), oqxVar.c));
        }
    }

    public final synchronized void e(orj orjVar) {
        if (v()) {
            int i = orjVar.b;
            if ((i & 2) == 0 || (i & 4) == 0 || (i & 8) == 0) {
                afus.b(1, 8, "live_metadata_missing_information");
                return;
            }
            this.s = true;
            this.w = new aemq(this, orjVar);
            this.x.b();
        }
    }

    public final synchronized void f(ori oriVar) {
        if (!v()) {
            return;
        }
        this.x.a(oriVar);
    }

    public final synchronized void g(ajfx ajfxVar) {
        if (!v()) {
            return;
        }
        this.f.c(ajfxVar);
    }

    public final synchronized void h(aenp aenpVar) {
        aemn a2 = aemn.a(aenpVar.a, aenpVar.b, aenpVar.d);
        aenp aenpVar2 = (aenp) this.e.get(a2);
        if (aenpVar2 == null || aenpVar2.c != aenpVar.c) {
            this.e.put(a2, aenpVar);
        } else {
            afus.b(1, 8, "duplicate_stream_metadata");
        }
    }

    public final synchronized void i(String str, int i, long j, long j2, String str2) {
        boolean z = this.s;
        this.d.add(new aemk(str, i, true != z ? j : -1L, true != z ? -1L : j2, str2));
        u(str, Integer.valueOf(i));
    }

    public final synchronized void j(ajfx ajfxVar) {
        ajfx b = this.f.b();
        if (b != null && b.b.equals(ajfxVar.b)) {
            this.f.d();
        }
    }

    public final synchronized void k() {
        this.r.set(true);
        this.c.clear();
        this.d.clear();
        int i = this.u;
        if (i != 0) {
            if (i == 4) {
                return;
            }
            Future future = this.y.a;
            if (future != null) {
                future.cancel(true);
            }
            this.b.clear();
            this.h.clear();
            this.v.clear();
            this.e.clear();
            this.w = null;
            this.x.b();
            this.f.d();
            this.u = 4;
            this.o.b();
            this.i.d();
            this.j.d();
            this.t = 0;
            notifyAll();
            return;
        }
        throw null;
    }

    public final synchronized void m(aent aentVar, byte[] bArr, int i, int i2) {
        t(aentVar, bArr, i, i2);
    }

    public final synchronized void n() {
        this.u = 3;
        notifyAll();
    }

    public final boolean o(String str, int i, String str2) {
        if (this.c.size() + this.b.size() > 20) {
            return false;
        }
        for (aemk aemkVar : this.d) {
            if (aemkVar.a.equals(str) && aemkVar.b == i && TextUtils.equals(str2, aemkVar.c)) {
                return true;
            }
        }
        for (aemk aemkVar2 : this.c.keySet()) {
            if (aemkVar2.a.equals(str) && aemkVar2.b == i && TextUtils.equals(str2, aemkVar2.c)) {
                return true;
            }
        }
        for (aemk aemkVar3 : this.b) {
            if (aemkVar3.a.equals(str) && aemkVar3.b == i && TextUtils.equals(str2, aemkVar3.c)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean p() {
        int i = this.u;
        if (i != 0) {
            return i != 4;
        }
        throw null;
    }

    public final synchronized void q(byte[] bArr) {
        if (!v()) {
            return;
        }
        aeml aemlVar = this.y;
        if (aemlVar.c != null || aemlVar.a != null) {
            return;
        }
        aems aemsVar = aemlVar.b;
        aemlVar.c = new aemy(bArr);
        aemlVar.a = aemlVar.b.m.submit(aemlVar);
    }

    public final synchronized void r() {
        this.x.b();
    }

    public final synchronized void l() {
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.x.b();
            this.f.d();
            aeml aemlVar = this.y;
            if (aemlVar.a == null) {
                this.u = 3;
                notifyAll();
                return;
            }
            aemlVar.a(a);
            this.u = 2;
            return;
        }
        throw null;
    }
}
