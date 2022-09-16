package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: jdc  reason: default package */
/* loaded from: classes3.dex */
public final class jdc extends jap {
    private final Map a = new ConcurrentHashMap();
    private final azqb b;

    public jdc(azqb azqbVar) {
        this.b = azqbVar;
    }

    private final amvn t(agqh agqhVar) {
        HashSet hashSet = new HashSet(agqhVar.b);
        this.a.put(agqhVar.a.a, hashSet);
        return s(hashSet);
    }

    private static awjp u(agqv agqvVar, boolean z) {
        if (!agqvVar.s() || !z) {
            return jjd.i(agqvVar.m(), agqvVar.i);
        }
        return null;
    }

    @Override // defpackage.jap
    protected final amvn a(agvx agvxVar) {
        agwh m = agvxVar.m();
        amvl i = amvn.i();
        for (agqv agqvVar : m.j()) {
            awjp u = u(agqvVar, true);
            if (u != null) {
                i.c(u);
            }
        }
        return i.g();
    }

    @Override // defpackage.jap
    protected final void c(aajs aajsVar, agqh agqhVar) {
        amzs it = t(agqhVar).iterator();
        while (it.hasNext()) {
            aajsVar.j((awjp) it.next());
        }
    }

    @Override // defpackage.jap
    protected final void d(aajs aajsVar, String str) {
        this.a.remove(str);
    }

    @Override // defpackage.jap
    protected final void e(aajs aajsVar, agqh agqhVar) {
        jfw.e(aajsVar, this.a, agqhVar, new ampg() { // from class: jdb
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                return jdc.this.s((Set) obj);
            }
        }, null);
    }

    @Override // defpackage.jap
    protected final void f(aajs aajsVar, agqv agqvVar) {
        awjp u = u(agqvVar, false);
        if (u != null) {
            aajsVar.j(u);
        }
    }

    @Override // defpackage.jap
    protected final void g(aajs aajsVar, String str) {
        aajsVar.g(emn.h(str));
    }

    @Override // defpackage.jap
    protected final void r(aajs aajsVar, agqh agqhVar) {
        amzs it = t(agqhVar).iterator();
        while (it.hasNext()) {
            aajsVar.j((awjp) it.next());
        }
    }

    public final amvn s(Set set) {
        amvl i = amvn.i();
        agwh m = ((agrf) this.b.get()).a().m();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            agqv e = m.e(str);
            if (e != null) {
                i.c(jjd.i(str, e.i));
            }
        }
        return i.g();
    }
}
