package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: brdi  reason: default package */
/* loaded from: classes4.dex */
public final class brdi {
    public final axwd a;
    private final Object c = new Object();
    public final Set<brdh> b = Collections.newSetFromMap(new WeakHashMap());

    public brdi(axwd axwdVar) {
        this.a = axwdVar;
    }

    public static final brcy f() {
        bvrj.UI_THREAD.c();
        dcdc e = dcdc.e();
        bvrj.UI_THREAD.c();
        return brcy.f(UUID.randomUUID().toString(), null, "", e, e);
    }

    private final brcy h(String str) {
        return brcy.f(str, ((azhz) this.a).j.get(str), dbsj.e(this.a.b(str)), this.a.d(str), this.a.c(str));
    }

    @dzsi
    public final brcy a(String str) {
        bvrj.UI_THREAD.c();
        if (this.a.a().contains(str)) {
            return h(str);
        }
        return null;
    }

    public final dcdc<brcy> b() {
        bvrj.UI_THREAD.c();
        dcdc<String> a = this.a.a();
        dccx G = dcdc.G(a.size());
        int size = a.size();
        for (int i = 0; i < size; i++) {
            G.g(h(a.get(i)));
        }
        return G.f();
    }

    @dzsi
    public final brcy c() {
        bvrj.UI_THREAD.c();
        synchronized (this.c) {
        }
        dbsg<String> k = this.a.k();
        if (!k.a()) {
            return null;
        }
        return h(k.b());
    }

    public final void d(String str) {
        bvrj.UI_THREAD.c();
        if (!str.equals(this.a.k().f())) {
            this.a.l(dbsg.i(str));
            e(h(str));
        }
    }

    public final void e(@dzsi brcy brcyVar) {
        if (brcyVar == null) {
            for (brdh brdhVar : this.b) {
                if (brdhVar != null) {
                    brdhVar.b();
                }
            }
            return;
        }
        for (brdh brdhVar2 : this.b) {
            if (brdhVar2 != null) {
                brdhVar2.a(brcyVar);
            }
        }
    }

    public final void g(brcy brcyVar) {
        bvrj.UI_THREAD.c();
        brcx brcxVar = (brcx) brcyVar;
        String str = brcxVar.a;
        dcep<Integer> dcepVar = brcxVar.d;
        dcen N = dcep.N();
        N.i(this.a.d(str));
        N.i(dcepVar);
        dcep f = N.f();
        dcep<Integer> dcepVar2 = brcxVar.e;
        dcen N2 = dcep.N();
        N2.i(this.a.c(str));
        N2.i(dcepVar2);
        dcep f2 = N2.f();
        dccx G = dcdc.G(f.size() + f2.size() + 2);
        G.g(this.a.e(str, brcxVar.c));
        G.g(this.a.h(str, brcxVar.b));
        dcpd it = f.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (dcepVar.contains(Integer.valueOf(intValue))) {
                G.g(this.a.i(str, intValue));
            } else {
                G.g(this.a.j(str, intValue));
            }
        }
        dcpd it2 = f2.iterator();
        while (it2.hasNext()) {
            int intValue2 = ((Integer) it2.next()).intValue();
            if (dcepVar2.contains(Integer.valueOf(intValue2))) {
                G.g(this.a.f(str, intValue2));
            } else {
                G.g(this.a.g(str, intValue2));
            }
        }
        if (str.equals(this.a.k().f())) {
            e(brcyVar);
        }
        deha.j(G.f());
    }
}
