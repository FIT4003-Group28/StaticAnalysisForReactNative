package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: jdi  reason: default package */
/* loaded from: classes3.dex */
public final class jdi extends jap {
    private final Map a = new ConcurrentHashMap();
    private final azqb b;
    private final axxh c;

    public jdi(azqb azqbVar, axxh axxhVar) {
        this.b = azqbVar;
        this.c = axxhVar;
    }

    private final awkv t(agqv agqvVar, boolean z) {
        if (!agqvVar.s() || !z) {
            return jjd.k(agqvVar.a, this.c.b().booleanValue());
        }
        return null;
    }

    @Override // defpackage.jap
    protected final amvn a(agvx agvxVar) {
        agwh m = agvxVar.m();
        amvl i = amvn.i();
        for (agqv agqvVar : m.j()) {
            awkv t = t(agqvVar, true);
            if (t != null) {
                i.c(t);
            }
        }
        return i.g();
    }

    @Override // defpackage.jap
    protected final void c(aajs aajsVar, agqh agqhVar) {
        HashSet hashSet = new HashSet(agqhVar.b);
        this.a.put(agqhVar.a.a, hashSet);
        amzs it = s(hashSet).iterator();
        while (it.hasNext()) {
            aajsVar.j((awkv) it.next());
        }
    }

    @Override // defpackage.jap
    protected final void d(aajs aajsVar, String str) {
        this.a.remove(str);
    }

    @Override // defpackage.jap
    protected final void e(aajs aajsVar, agqh agqhVar) {
        jfw.e(aajsVar, this.a, agqhVar, new jdh(this), null);
    }

    @Override // defpackage.jap
    protected final void f(aajs aajsVar, agqv agqvVar) {
        awkv t = t(agqvVar, false);
        if (t != null) {
            aajsVar.j(t);
        }
    }

    @Override // defpackage.jap
    protected final void g(aajs aajsVar, String str) {
        aajsVar.g(emn.y(str));
    }

    @Override // defpackage.jap
    protected final void r(aajs aajsVar, agqh agqhVar) {
        jfw.e(aajsVar, this.a, agqhVar, new jdh(this), null);
    }

    public final amvn s(Set set) {
        amvl i = amvn.i();
        agwh m = ((agrf) this.b.get()).a().m();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            agqv e = m.e((String) it.next());
            if (e != null) {
                i.c(jjd.k(e.a, this.c.b().booleanValue()));
            }
        }
        return i.g();
    }
}
