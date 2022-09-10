package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aidl  reason: default package */
/* loaded from: classes2.dex */
final class aidl extends amlq {
    public final aifb a;
    public final aidc b;
    public final aiei c;
    public final dzsj<aifu> d;
    public final akvx e;
    public boolean f;
    public final Map<Integer, aifa> g = new HashMap();
    public dcdn<PersonId, aics> h = dcmn.a;
    public final dbsz<PersonId> i = new aidk(this);
    @dzsi
    public aidn j;

    public aidl(aifb aifbVar, aiei aieiVar, dzsj<aifu> dzsjVar, aida aidaVar, akvz akvzVar, gce gceVar) {
        this.a = aifbVar;
        this.c = aieiVar;
        this.d = dzsjVar;
        akvx g = akvzVar.g();
        this.e = g;
        this.b = new aidd(aidaVar, g, gceVar);
    }

    public static void c(aifa aifaVar, aics aicsVar) {
        aifq m = m(aicsVar);
        if (!aicsVar.g) {
            aifaVar.d(m, 1);
        } else {
            aifaVar.f(m, 4, 2500, true);
        }
    }

    private final void d() {
        if (!this.f) {
            return;
        }
        HashSet<aifa> hashSet = new HashSet(this.g.values());
        dcpd<aics> it = this.h.values().iterator();
        while (it.hasNext()) {
            final aics next = it.next();
            aifa aifaVar = this.g.get(Integer.valueOf(next.b()));
            if (aifaVar == null) {
                aidb a = this.b.a(next, this.i);
                aifaVar = this.a.b(a.a, m(next), a.b, this.e, dcdc.g(this.c.a(), this.d.a()), new Runnable(this, next) { // from class: aidj
                    private final aidl a;
                    private final aics b;

                    {
                        this.a = this;
                        this.b = next;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b(this.b.b());
                    }
                });
                this.g.put(Integer.valueOf(next.b()), aifaVar);
            }
            c(aifaVar, next);
            hashSet.remove(aifaVar);
        }
        for (aifa aifaVar2 : hashSet) {
            this.g.values().remove(aifaVar2);
            aifaVar2.c();
        }
    }

    private static aifq m(aics aicsVar) {
        float f;
        aifp j = aifq.j();
        j.e = aicsVar.c;
        if (!aicsVar.i) {
            f = aicr.SELECTED.c;
        } else {
            f = (aicsVar.e ? aicr.SELECTED : aicr.REGULAR).c;
        }
        j.f(f);
        j.b(1.0f);
        j.k(0.0f, akwd.SCREEN_RELATIVE);
        aiem aiemVar = new aiem();
        int e = aicsVar.b.get(0).e();
        if (!aicsVar.e || e < 20) {
            e = 0;
        }
        aiemVar.b(e);
        j.j(aiek.class, aiemVar.a());
        aies aiesVar = null;
        if (aicsVar.e && !aicsVar.f.a().a().equals(PersonId.a)) {
            dbsg<ahvj> f2 = aicsVar.f.f();
            if (f2.a()) {
                aier aierVar = new aier();
                aierVar.b = false;
                aierVar.d = true;
                aierVar.c = -1L;
                amub a = f2.b().a();
                if (a != null) {
                    aierVar.a = a;
                    String str = aierVar.a == null ? " routeDescription" : "";
                    if (aierVar.b == null) {
                        str = str.concat(" showEtaOnRoute");
                    }
                    if (aierVar.c == null) {
                        str = String.valueOf(str).concat(" expectedArrivalTimeSecOverride");
                    }
                    if (aierVar.d == null) {
                        str = String.valueOf(str).concat(" useRouteOverviewConfigSet");
                    }
                    if (!str.isEmpty()) {
                        String valueOf = String.valueOf(str);
                        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                    }
                    aiesVar = new aies(aierVar.a, aierVar.b.booleanValue(), aierVar.c.longValue(), aierVar.d.booleanValue());
                } else {
                    throw new NullPointerException("Null routeDescription");
                }
            }
        }
        j.j(aifw.class, aiesVar);
        return j.i();
    }

    public final synchronized void a(Iterable<aics> iterable) {
        dcdg p = dcdn.p();
        for (aics aicsVar : iterable) {
            p.f(aicsVar.f.a().a(), aicsVar);
        }
        this.h = p.b();
        d();
    }

    public final void b(int i) {
        dcdn<PersonId, aics> dcdnVar;
        aidn aidnVar = this.j;
        if (aidnVar == null) {
            return;
        }
        synchronized (this) {
            dcdnVar = this.h;
        }
        dcpd<aics> it = dcdnVar.values().iterator();
        while (it.hasNext()) {
            final aics next = it.next();
            if (next.b() == i) {
                final aidy aidyVar = aidnVar.a;
                aidnVar.b.b(new Runnable(aidyVar, next) { // from class: aidp
                    private final aidy a;
                    private final aics b;

                    {
                        this.a = aidyVar;
                        this.b = next;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        aidy aidyVar2 = this.a;
                        aics aicsVar = this.b;
                        ahup ahupVar = aidyVar2.e;
                        if (ahupVar == null) {
                            return;
                        }
                        if (aicsVar.a() == 1) {
                            PersonId a = aicsVar.f.a().a();
                            if (!ahupVar.a.w()) {
                                return;
                            }
                            ahupVar.a.d.i(cjtd.a(dtxu.dg));
                            ahupVar.a.s(dbsg.i(a), ahwe.MAP_TAP, false);
                            return;
                        }
                        btlu btluVar = aidyVar2.d;
                        if (!ahupVar.a.w()) {
                            return;
                        }
                        Iterable o = dcft.o(aicsVar, new ahun(ahupVar, btluVar));
                        ahuu ahuuVar = ahupVar.a;
                        ajfk ajfkVar = new ajfk(o, ahuuVar.f, ahuuVar.b.getResources(), ahupVar.a.h);
                        ahuu ahuuVar2 = ahupVar.a;
                        ajfd ajfdVar = new ajfd(ahuuVar2.b, ajfkVar, ahuuVar2.c);
                        ajfdVar.show();
                        ajfkVar.b(new ahuo(ahupVar, ajfdVar));
                    }
                }, bvrj.UI_THREAD);
                return;
            }
        }
    }

    @Override // defpackage.amlq, defpackage.amjm
    public final synchronized void g(amjl amjlVar) {
    }

    @Override // defpackage.amlq, defpackage.amjm
    public final synchronized void h(amii amiiVar) {
        this.f = true;
        d();
    }

    @Override // defpackage.amlq, defpackage.amjm
    public final synchronized void i(amii amiiVar) {
        this.f = false;
        for (aifa aifaVar : this.g.values()) {
            aifaVar.c();
        }
        this.g.clear();
    }

    public final synchronized String toString() {
        dbsb b;
        b = dbsc.b(this);
        b.f("count", this.g.size());
        return b.toString();
    }
}
