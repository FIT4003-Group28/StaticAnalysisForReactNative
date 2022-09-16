package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: cjwa  reason: default package */
/* loaded from: classes.dex */
public abstract class cjwa {
    private final dcdn<cjwj, cjwb> a;
    public final ConcurrentMap<String, btlu> b = new ConcurrentHashMap();
    public final akfa c;

    public cjwa(akfa akfaVar) {
        dcdg p = dcdn.p();
        for (cjwj cjwjVar : cjwj.values()) {
            p.f(cjwjVar, new cjwb());
        }
        this.a = p.b();
        this.c = akfaVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean a(cjtk cjtkVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b(@dzsi btlu btluVar, cjtk cjtkVar, cjwj cjwjVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void c(cjvz cjvzVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(@dzsi btlu btluVar, cjtk cjtkVar, cjwj cjwjVar) {
        String h = btlu.h(btluVar);
        if (h != null) {
            dbsk.s(btluVar);
            this.b.putIfAbsent(h, btluVar);
        }
        if (h == null) {
            h = "";
        }
        g(cjwjVar).a(h, cjtkVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(cjwb cjwbVar, cjwj cjwjVar) {
        cjwb g = g(cjwjVar);
        dcpd<Map.Entry<String, cjtk>> it = cjwbVar.b().I().iterator();
        while (it.hasNext()) {
            Map.Entry<String, cjtk> next = it.next();
            g.a(next.getKey(), next.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public final btlu f() {
        return this.c.j();
    }

    public final cjwb g(cjwj cjwjVar) {
        cjwb cjwbVar = this.a.get(cjwjVar);
        dbsk.s(cjwbVar);
        return cjwbVar;
    }
}
