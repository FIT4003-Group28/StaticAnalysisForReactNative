package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aikw  reason: default package */
/* loaded from: classes2.dex */
public final class aikw implements aikh {
    public final ailb<aigo> a;
    public final ailb<aiik> b;
    public final akfa c;
    public final aikb d;
    public final cjqy e;
    public final cqat f;
    public final Map<btlu, Map<PersonId, aikf>> g = new HashMap();
    public final Executor h;
    private final Executor i;
    private final aila j;
    private final aila k;
    private final crzp<btlu> l;

    public aikw(ailb<aigo> ailbVar, ailb<aiik> ailbVar2, akfa akfaVar, aikb aikbVar, cjqy cjqyVar, cqat cqatVar, Executor executor, Executor executor2) {
        new HashMap();
        aikt aiktVar = new aikt(this);
        this.j = aiktVar;
        aiku aikuVar = new aiku(this);
        this.k = aikuVar;
        aikv aikvVar = new aikv(this);
        this.l = aikvVar;
        this.a = ailbVar;
        this.b = ailbVar2;
        this.c = akfaVar;
        this.d = aikbVar;
        this.e = cjqyVar;
        this.f = cqatVar;
        this.h = executor;
        this.i = executor2;
        ailbVar.c(aikuVar);
        ailbVar2.c(aiktVar);
        akfaVar.C().d(aikvVar, executor);
    }

    @Override // defpackage.aikh
    public final void C(@dzsi btlu btluVar, int i) {
        if (!this.g.containsKey(btluVar)) {
            return;
        }
        Iterator<aikf> it = this.g.get(btluVar).values().iterator();
        while (it.hasNext()) {
            aikf next = it.next();
            int i2 = i - 1;
            if (i2 == 0) {
                next.i.writeLock().lock();
                try {
                    next.g = true;
                } finally {
                }
            } else if (i2 == 1) {
                next.i.writeLock().lock();
                try {
                    next.h = true;
                    next.i.writeLock().unlock();
                } finally {
                }
            } else {
                bvrj.UI_THREAD.c();
                next.i.writeLock().lock();
                try {
                    if (next.a()) {
                        next.e.clear();
                        doel c = next.c(true);
                        if (c.c) {
                            c.bF();
                            c.c = false;
                        }
                        doem doemVar = (doem) c.b;
                        doem doemVar2 = doem.f;
                        doemVar.c = 7;
                        doemVar.a |= 2;
                    }
                    if (next.d.size() > 0 && !next.a.f().equals(PersonId.a)) {
                        next.b.u(new aike(next.c, next.d));
                    }
                    next.d.clear();
                    next.i.writeLock().unlock();
                } finally {
                }
            }
        }
    }

    public final void a() {
        this.i.execute(new Runnable(this) { // from class: aikq
            private final aikw a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final aikw aikwVar = this.a;
                final dcdc r = dcdc.r(aikwVar.c.t());
                aikwVar.h.execute(new Runnable(aikwVar, r) { // from class: aiks
                    private final aikw a;
                    private final dcdc b;

                    {
                        this.a = aikwVar;
                        this.b = r;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        aikw aikwVar2 = this.a;
                        dcdc dcdcVar = this.b;
                        bvrj.UI_THREAD.c();
                        int size = dcdcVar.size();
                        for (int i = 0; i < size; i++) {
                            btlu btluVar = (btlu) dcdcVar.get(i);
                            dbsg<aigo> b = aikwVar2.a.b(dbsg.i(btluVar));
                            dbsg<aiik> b2 = aikwVar2.b.b(dbsg.i(btluVar));
                            if (!b2.a()) {
                                aikwVar2.g.remove(btluVar);
                            } else {
                                if (!aikwVar2.g.containsKey(btluVar)) {
                                    aikwVar2.g.put(btluVar, new HashMap());
                                }
                                Map<PersonId, aikf> map = aikwVar2.g.get(btluVar);
                                HashSet hashSet = new HashSet();
                                if (b.a()) {
                                    dcdc<ahvg> a = b.b().a();
                                    int size2 = a.size();
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        ahvg ahvgVar = a.get(i2);
                                        PersonId a2 = ahvgVar.a().a();
                                        if (map.containsKey(a2)) {
                                            aikc aikcVar = map.get(a2).a;
                                            map.get(a2).e(aikcVar.g().z() && !ahvgVar.b().e);
                                            aikcVar.a(ahvgVar.b());
                                        } else {
                                            map.put(a2, new aikf(aikwVar2.d.a(ahvgVar.b()), aikwVar2.e, aikwVar2.f));
                                        }
                                        hashSet.add(a2);
                                    }
                                }
                                dcnk p = dcnm.p(dcep.K(map.keySet()), hashSet);
                                aiik b3 = b2.b();
                                map.keySet().removeAll(dcnm.p(p, dcep.L(dcft.o(dcdc.q(dcbg.e(b3.c, b3.a, b3.b)), aikr.a))));
                            }
                        }
                    }
                });
            }
        });
    }

    @Override // defpackage.aikh
    public final void v(@dzsi btlu btluVar, PersonId personId, aikg aikgVar) {
        if (!this.g.containsKey(btluVar)) {
            return;
        }
        Map<PersonId, aikf> map = this.g.get(btluVar);
        if (!map.containsKey(personId)) {
            return;
        }
        map.get(personId).d(aikgVar);
    }

    @Override // defpackage.aikh
    public final void w(@dzsi btlu btluVar, PersonId personId, aikg aikgVar) {
        if (!this.g.containsKey(btluVar)) {
            return;
        }
        Map<PersonId, aikf> map = this.g.get(btluVar);
        if (!map.containsKey(personId)) {
            return;
        }
        map.get(personId).f(aikgVar);
    }

    @Override // defpackage.aikh
    public final boolean x(@dzsi btlu btluVar, PersonId personId, aikg aikgVar) {
        if (!this.g.containsKey(btluVar)) {
            return false;
        }
        Map<PersonId, aikf> map = this.g.get(btluVar);
        if (map.containsKey(personId)) {
            return map.get(personId).b(aikgVar);
        }
        return false;
    }

    @Override // defpackage.aikh
    public final boolean y(@dzsi btlu btluVar, PersonId personId) {
        if (!this.g.containsKey(btluVar)) {
            return false;
        }
        Map<PersonId, aikf> map = this.g.get(btluVar);
        if (map.containsKey(personId)) {
            return map.get(personId).a();
        }
        return false;
    }

    @Override // defpackage.aikh
    public final dcdc<PersonId> z(@dzsi btlu btluVar) {
        if (!this.g.containsKey(btluVar)) {
            return dcdc.e();
        }
        dccx dccxVar = new dccx();
        for (aikf aikfVar : this.g.get(btluVar).values()) {
            if (aikfVar.a()) {
                dccxVar.g(aikfVar.a.f());
            }
        }
        return dccxVar.f();
    }
}
