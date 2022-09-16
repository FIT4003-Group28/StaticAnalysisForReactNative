package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: jde  reason: default package */
/* loaded from: classes3.dex */
public final class jde extends jap {
    private final aagi a;

    public jde(aagi aagiVar) {
        this.a = aagiVar;
    }

    private static awka s(aajl aajlVar) {
        return (awka) aajlVar.f(emn.i()).g(awka.class).W();
    }

    private static awkb t(String str) {
        aopa createBuilder = awkb.a.createBuilder();
        String g = emn.g(str);
        createBuilder.copyOnWrite();
        awkb awkbVar = (awkb) createBuilder.instance;
        g.getClass();
        awkbVar.b = 2;
        awkbVar.c = g;
        return (awkb) createBuilder.mo39build();
    }

    private static awkb u(String str) {
        aopa createBuilder = awkb.a.createBuilder();
        String h = emn.h(str);
        createBuilder.copyOnWrite();
        awkb awkbVar = (awkb) createBuilder.instance;
        h.getClass();
        awkbVar.b = 1;
        awkbVar.c = h;
        return (awkb) createBuilder.mo39build();
    }

    @Override // defpackage.jap
    protected final amvn a(agvx agvxVar) {
        String i = emn.i();
        i.getClass();
        aqxo.z(!i.isEmpty(), "key cannot be empty");
        aopa createBuilder = awkc.a.createBuilder();
        createBuilder.copyOnWrite();
        awkc awkcVar = (awkc) createBuilder.instance;
        awkcVar.c |= 1;
        awkcVar.d = i;
        awjy awjyVar = new awjy(createBuilder);
        Iterator it = agvxVar.i().j().iterator();
        while (it.hasNext()) {
            awjyVar.b(t(((agqh) it.next()).a.a));
        }
        Iterator it2 = agvxVar.m().k().iterator();
        while (it2.hasNext()) {
            awjyVar.b(u(((agqv) it2.next()).m()));
        }
        return amvn.r(awjyVar);
    }

    @Override // defpackage.jap
    protected final void c(aajs aajsVar, agqh agqhVar) {
        awka s = s(this.a.c());
        if (s == null) {
            return;
        }
        awkb t = t(agqhVar.a.a);
        if (s.getDownloads().contains(t)) {
            return;
        }
        awjy e = s.e();
        e.b(t);
        aajsVar.j(e);
    }

    @Override // defpackage.jap
    protected final void d(aajs aajsVar, String str) {
        awka s = s(this.a.c());
        if (s == null) {
            return;
        }
        awkb t = t(str);
        awjy e = s.e();
        e.c(t);
        aajsVar.j(e);
    }

    @Override // defpackage.jap
    protected final void f(aajs aajsVar, agqv agqvVar) {
        awka s = s(this.a.c());
        if (s != null && agqvVar.e) {
            awkb u = u(agqvVar.m());
            if (s.getDownloads().contains(u)) {
                return;
            }
            awjy e = s.e();
            e.b(u);
            aajsVar.j(e);
        }
    }

    @Override // defpackage.jap
    protected final void g(aajs aajsVar, String str) {
        awka s = s(this.a.c());
        if (s == null) {
            return;
        }
        awkb u = u(str);
        awjy e = s.e();
        e.c(u);
        aajsVar.j(e);
    }
}
