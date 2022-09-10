package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dypz  reason: default package */
/* loaded from: classes6.dex */
public final class dypz implements dygn, dyvp {
    public final dyps a;
    public final ScheduledExecutorService b;
    public final dygj c;
    public final dyev d;
    public final dyji e;
    public final dypt f;
    public volatile List<dyfw> g;
    public final dbtp h;
    @dzsi
    public dyjh i;
    @dzsi
    public dyjh j;
    @dzsi
    public dysm k;
    @dzsi
    public dymc n;
    @dzsi
    public volatile dysm o;
    public dyjb q;
    public dyog r;
    private final dygo s;
    private final String t;
    private final String u;
    private final dylx v;
    private final dyle w;
    public final Collection<dymc> l = new ArrayList();
    public final dype<dymc> m = new dypg(this);
    public volatile dyfl p = dyfl.a(dyfk.IDLE);

    public dypz(List list, String str, String str2, dylx dylxVar, ScheduledExecutorService scheduledExecutorService, dyji dyjiVar, dyps dypsVar, dygj dygjVar, dyle dyleVar, dygo dygoVar, dyev dyevVar) {
        dbsk.b(!list.isEmpty(), "addressGroups is empty");
        h(list, "addressGroups contains null entry");
        List<dyfw> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.g = unmodifiableList;
        this.f = new dypt(unmodifiableList);
        this.t = str;
        this.u = str2;
        this.v = dylxVar;
        this.b = scheduledExecutorService;
        this.h = dbtp.a();
        this.e = dyjiVar;
        this.a = dypsVar;
        this.c = dygjVar;
        this.w = dyleVar;
        this.s = dygoVar;
        this.d = dyevVar;
    }

    public static void h(List<?> list, String str) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            dbsk.t(it.next(), str);
        }
    }

    public static final String j(dyjb dyjbVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(dyjbVar.p);
        if (dyjbVar.q != null) {
            sb.append("(");
            sb.append(dyjbVar.q);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.dyvp
    public final dylv a() {
        dysm dysmVar = this.o;
        if (dysmVar != null) {
            return dysmVar;
        }
        this.e.execute(new dypi(this));
        return null;
    }

    public final void b() {
        dyge dygeVar;
        this.e.c();
        dbsk.m(this.i == null, "Should have no reconnectTask scheduled");
        dypt dyptVar = this.f;
        if (dyptVar.b == 0 && dyptVar.c == 0) {
            dbtp dbtpVar = this.h;
            dbtpVar.e();
            dbtpVar.f();
        }
        SocketAddress b = this.f.b();
        if (b instanceof dyge) {
            dyge dygeVar2 = (dyge) b;
            dygeVar = dygeVar2;
            b = dygeVar2.b;
        } else {
            dygeVar = null;
        }
        dypt dyptVar2 = this.f;
        dyel dyelVar = dyptVar2.a.get(dyptVar2.b).c;
        String str = (String) dyelVar.a(dyfw.a);
        dylw dylwVar = new dylw();
        if (str == null) {
            str = this.t;
        }
        dbsk.t(str, "authority");
        dylwVar.a = str;
        dylwVar.b = dyelVar;
        dylwVar.c = this.u;
        dylwVar.d = dygeVar;
        dypy dypyVar = new dypy();
        dypyVar.a = this.s;
        dypr dyprVar = new dypr(this.v.a(b, dylwVar, dypyVar), this.w);
        dypyVar.a = dyprVar.k();
        dygj.a(this.c.e, dyprVar);
        this.n = dyprVar;
        this.l.add(dyprVar);
        Runnable c = dyprVar.c(new dypx(this, dyprVar));
        if (c != null) {
            this.e.b(c);
        }
        this.d.b(2, "Started transport {0}", dypyVar.a);
    }

    public final void c(dyfk dyfkVar) {
        this.e.c();
        d(dyfl.a(dyfkVar));
    }

    public final void d(dyfl dyflVar) {
        this.e.c();
        if (this.p.a != dyflVar.a) {
            boolean z = this.p.a != dyfk.SHUTDOWN;
            String valueOf = String.valueOf(dyflVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Cannot transition out of SHUTDOWN to ");
            sb.append(valueOf);
            dbsk.m(z, sb.toString());
            this.p = dyflVar;
            this.a.a(dyflVar);
        }
    }

    public final void e(dyjb dyjbVar) {
        this.e.execute(new dypl(this, dyjbVar));
    }

    public final void f() {
        this.e.execute(new dypm(this));
    }

    public final void g(dymc dymcVar, boolean z) {
        this.e.execute(new dypn(this, dymcVar, z));
    }

    @Override // defpackage.dygs
    public final dygo k() {
        return this.s;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.g("logId", this.s.a);
        b.b("addressGroups", this.g);
        return b.toString();
    }
}
