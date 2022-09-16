package defpackage;
/* compiled from: PG */
/* renamed from: aujk  reason: default package */
/* loaded from: classes.dex */
public final class aujk implements aujn {
    private final boolean a;
    private final dcdn<Integer, dkpl> b;
    private final dcdc<ddos> c;
    private final dcdn<ddos, dkpi> d;

    public aujk(btvo btvoVar, ausy ausyVar) {
        dkre notificationsParameters = btvoVar.getNotificationsParameters();
        boolean z = false;
        if (notificationsParameters != null && (notificationsParameters.a & 2) != 0) {
            dkpm dkpmVar = notificationsParameters.d;
            if ((dkpmVar == null ? dkpm.k : dkpmVar).a) {
                z = true;
            }
        }
        this.a = z;
        dkpm dkpmVar2 = btvoVar.getNotificationsParameters().d;
        dkpmVar2 = dkpmVar2 == null ? dkpm.k : dkpmVar2;
        dcdg p = dcdn.p();
        for (dkpl dkplVar : dkpmVar2.d) {
            p.f(Integer.valueOf(dkplVar.b), dkplVar);
        }
        this.b = p.b();
        dccx F = dcdc.F();
        dcpd<aujb> it = ausyVar.f().values().iterator();
        while (it.hasNext()) {
            ddos l = it.next().l(btvoVar);
            if (l != null) {
                F.g(l);
            }
        }
        this.c = F.f();
        dcdg p2 = dcdn.p();
        dcpd<aujb> it2 = ausyVar.f().values().iterator();
        while (it2.hasNext()) {
            auik k = it2.next().k(btvoVar);
            if (k != null) {
                ddos a = k.a();
                dkpi b = k.b();
                if (b != null) {
                    p2.f(a, b);
                }
            }
        }
        this.d = p2.b();
    }

    @Override // defpackage.aujn
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.aujn
    @dzsi
    public final Integer b(ddos ddosVar) {
        int i;
        dkpi h = h(ddosVar);
        if (h == null || (i = h.b) == 0) {
            return null;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.aujn
    public final Iterable<dkpl> c() {
        return this.b.values();
    }

    @Override // defpackage.aujn
    @dzsi
    public final dkpl d(ddos ddosVar) {
        Integer b = b(ddosVar);
        if (b == null) {
            return null;
        }
        return this.b.get(b);
    }

    @Override // defpackage.aujn
    public final dcdc<ddos> e() {
        return this.c;
    }

    @Override // defpackage.aujn
    public final boolean f(ddos ddosVar) {
        dkpi h = h(ddosVar);
        if (h == null) {
            return false;
        }
        return h.c;
    }

    @Override // defpackage.aujn
    public final boolean g(ddos ddosVar) {
        dkpi h = h(ddosVar);
        return h != null && h.h;
    }

    @Override // defpackage.aujn
    @dzsi
    public final dkpi h(ddos ddosVar) {
        return this.d.get(ddosVar);
    }
}
