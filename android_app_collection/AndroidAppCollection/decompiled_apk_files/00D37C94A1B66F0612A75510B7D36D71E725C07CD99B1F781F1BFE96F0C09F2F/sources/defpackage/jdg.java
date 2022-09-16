package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: jdg  reason: default package */
/* loaded from: classes3.dex */
public final class jdg extends jat {
    private final Map a = new ConcurrentHashMap();

    public static amvn g(agqh agqhVar, Set set) {
        amvl i = amvn.i();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            i.c(jjd.j(agqhVar.a.a, (String) it.next()));
        }
        return i.g();
    }

    public static void l(aajs aajsVar, agqh agqhVar, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aajsVar.g(emn.u(agqhVar.a.a, (String) it.next()));
        }
    }

    private final amvn m(agqh agqhVar) {
        amvl i = amvn.i();
        String str = agqhVar.a.a;
        for (String str2 : agqhVar.b) {
            i.c(jjd.j(str, str2));
        }
        this.a.put(str, new HashSet(agqhVar.b));
        return i.g();
    }

    @Override // defpackage.jat
    protected final amvn a(agvv agvvVar) {
        amvl i = amvn.i();
        for (agqh agqhVar : agvvVar.j()) {
            i.j(m(agqhVar));
        }
        return i.g();
    }

    @Override // defpackage.jat
    protected final void c(aajs aajsVar, agqh agqhVar) {
        jfw.d(aajsVar, m(agqhVar));
    }

    @Override // defpackage.jat
    protected final void d(aajs aajsVar, String str) {
        Set<String> set = (Set) this.a.remove(str);
        if (set != null) {
            for (String str2 : set) {
                aajsVar.g(emn.u(str, str2));
            }
        }
    }

    @Override // defpackage.jat
    protected final void e(aajs aajsVar, agqh agqhVar, agqg agqgVar) {
        jfw.e(aajsVar, this.a, agqhVar, new jbs(agqhVar, 2), new jcn(aajsVar, agqhVar, 2));
    }

    @Override // defpackage.jat
    protected final void f(aajs aajsVar, agqh agqhVar) {
        jfw.e(aajsVar, this.a, agqhVar, new jbs(agqhVar, 3), new jcn(aajsVar, agqhVar, 3));
    }
}
