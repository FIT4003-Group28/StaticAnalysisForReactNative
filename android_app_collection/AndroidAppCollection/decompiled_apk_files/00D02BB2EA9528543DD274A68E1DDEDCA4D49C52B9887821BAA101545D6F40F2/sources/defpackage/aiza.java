package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aiza  reason: default package */
/* loaded from: classes2.dex */
public final class aiza {
    static final eaow a = eaow.d(3);
    public final aizd b;
    private final aijz c;
    private final aiok d;
    private final Executor e;
    private final bvrb f;
    private final aihe<ailh, aigm> g;
    private final Map<dbsg<btlu>, aiyz> h = new HashMap();

    public aiza(aijz aijzVar, aiok aiokVar, Executor executor, bvrb bvrbVar, cqat cqatVar, cjqy cjqyVar, aihe<ailh, aigm> aiheVar) {
        this.c = aijzVar;
        this.d = aiokVar;
        this.e = executor;
        this.f = bvrbVar;
        this.b = new aizd(cqatVar, cjqyVar);
        this.g = aiheVar;
    }

    private final boolean d(dbsg<btlu> dbsgVar) {
        return !this.h.containsKey(dbsgVar) || this.h.get(dbsgVar).a.isDone();
    }

    private final long e(dbsg<btlu> dbsgVar) {
        return this.g.c(dbsgVar).c(0L).longValue();
    }

    public final void a(dbsg<btlu> dbsgVar, List<aioe> list) {
        dbsg<eaow> dbsgVar2;
        bvrj.UI_THREAD.c();
        for (aioe aioeVar : list) {
            int c = aioeVar.c();
            int i = c - 1;
            aizc aizcVar = null;
            dbsg<aink> dbsgVar3 = null;
            if (c == 0) {
                throw null;
            }
            int i2 = 7;
            if (i != 0) {
                if (i == 1) {
                    this.b.c(dbsgVar, aioeVar.b(), 7);
                } else if (i != 2) {
                }
            }
            if (aioeVar.a().a()) {
                aink b = aioeVar.a().b();
                if (b.k()) {
                    if (this.b.a(dbsgVar, b.b())) {
                        aizd aizdVar = this.b;
                        long e = e(dbsgVar);
                        bvrj.UI_THREAD.c();
                        Map<PersonId, aizc> map = aizdVar.d.get(dbsgVar);
                        if (map != null) {
                            aizcVar = map.get(b.b());
                        }
                        if (aizcVar != null) {
                            bvrj.UI_THREAD.c();
                            if (aizcVar.e) {
                                bvoo.h("Cannot update log state for something already logged", new Object[0]);
                            } else if (!b.b().equals(aizcVar.b)) {
                                bvoo.h("Cannot update log state for different person", new Object[0]);
                            } else {
                                aizcVar.c = dbsg.i(b);
                                if (aizcVar.d != e) {
                                    aizcVar.d = e;
                                    dnom dnomVar = aizcVar.a;
                                    dnon bZ = dnoo.c.bZ();
                                    int a2 = decl.a(TimeUnit.MILLISECONDS.toSeconds(e));
                                    if (bZ.c) {
                                        bZ.bF();
                                        bZ.c = false;
                                    }
                                    dnoo dnooVar = (dnoo) bZ.b;
                                    dnooVar.a = 1 | dnooVar.a;
                                    dnooVar.b = a2;
                                    if (dnomVar.c) {
                                        dnomVar.bF();
                                        dnomVar.c = false;
                                    }
                                    dnop dnopVar = (dnop) dnomVar.b;
                                    dnoo bK = bZ.bK();
                                    dnop dnopVar2 = dnop.j;
                                    bK.getClass();
                                    dsrj<dnoo> dsrjVar = dnopVar.f;
                                    if (!dsrjVar.a()) {
                                        dnopVar.f = dsqw.cl(dsrjVar);
                                    }
                                    dnopVar.f.add(bK);
                                }
                            }
                        }
                    } else {
                        this.b.b(dbsgVar, dbsg.i(b), b.b(), 1, e(dbsgVar));
                    }
                } else if (this.b.a(dbsgVar, b.b())) {
                    aizd aizdVar2 = this.b;
                    PersonId b2 = b.b();
                    bvrj.UI_THREAD.c();
                    if (aizdVar2.a(dbsgVar, b2)) {
                        Map<PersonId, aizc> map2 = aizdVar2.d.get(dbsgVar);
                        dbsk.s(map2);
                        aizc aizcVar2 = map2.get(b2);
                        dbsk.s(aizcVar2);
                        dbsgVar3 = aizcVar2.c;
                    }
                    dbsk.s(dbsgVar3);
                    eapd a3 = eapd.a();
                    dbsg<eaow> p = b.p(a3);
                    if (dbsgVar3.a()) {
                        dbsgVar2 = dbsgVar3.b().p(a3);
                    } else {
                        dbsgVar2 = dbpy.a;
                    }
                    if (!b.d().isEmpty()) {
                        if (!b.n().a() || !p.a()) {
                            i2 = 1;
                        } else {
                            aihl aihlVar = (aihl) this.g;
                            dbsg<Long> c2 = aihlVar.c(dbsgVar);
                            if (!c2.a() || c2.b().longValue() + aihl.b < aihlVar.i.e()) {
                                i2 = 3;
                            } else {
                                i2 = (!dbsgVar3.a() || !dbsgVar2.a() || p.b().q(dbsgVar2.b())) ? 6 : 2;
                            }
                        }
                    }
                    this.b.c(dbsgVar, b.b(), i2);
                }
            }
        }
    }

    public final void b(dbsg<btlu> dbsgVar, dbsg<PersonId> dbsgVar2) {
        if ((!this.h.containsKey(dbsgVar) || !this.h.get(dbsgVar).b.containsKey(dbsgVar2) || this.h.get(dbsgVar).b.get(dbsgVar2).isDone()) && d(dbsgVar)) {
            aiok aiokVar = this.d;
            PersonId personId = (PersonId) ((dbsu) dbsgVar2).a;
            aioj aiojVar = aioj.INCOMING_SHARING_STATE;
            aioi b = aiokVar.b(dbsgVar);
            if (b.a.containsKey(personId)) {
                b.a.get(personId).remove(aiojVar);
            }
            aiokVar.c(dbsgVar, dbsg.i(personId));
        }
    }

    public final void c(final dbsg<btlu> dbsgVar, PersonId personId, dbsg<aink> dbsgVar2, int i) {
        bvrj.UI_THREAD.c();
        if (i != 7 && dbsgVar2.a()) {
            if (dbsgVar2.b().d().isEmpty()) {
                return;
            }
            dbsg<ahvf> r = dbsgVar2.b().r(eapd.a());
            if (r.a() && r.b() == ahvf.SUPER_FRESH) {
                return;
            }
        }
        if (d(dbsgVar)) {
            dbsg i2 = dbsg.i(personId);
            dehn<Boolean> b = this.c.b(dbsgVar.f());
            deha.q(b, new aiyy(this, b, dbsgVar, i2), this.e);
            if (!this.h.containsKey(dbsgVar)) {
                this.h.put(dbsgVar, new aiyz(b));
            } else {
                this.h.get(dbsgVar).a.cancel(false);
                this.h.get(dbsgVar).a = b;
            }
        }
        if (!this.b.a(dbsgVar, personId)) {
            this.b.b(dbsgVar, dbsgVar2, personId, i, e(dbsgVar));
        }
        final dbsg<PersonId> i3 = dbsg.i(personId);
        if (this.h.containsKey(dbsgVar)) {
            aiyz aiyzVar = this.h.get(dbsgVar);
            if (aiyzVar.b.containsKey(i3)) {
                aiyzVar.b.get(i3).cancel(false);
            }
            final deig d = deig.d();
            this.f.a(new Runnable(d) { // from class: aiyw
                private final deig a;

                {
                    this.a = d;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.j(true);
                }
            }, bvrj.BACKGROUND_THREADPOOL, a.b);
            deha.q(d, bvqj.b(new bvqg(this, d, dbsgVar, i3) { // from class: aiyx
                private final aiza a;
                private final dehn b;
                private final dbsg c;
                private final dbsg d;

                {
                    this.a = this;
                    this.b = d;
                    this.c = dbsgVar;
                    this.d = i3;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    aiza aizaVar = this.a;
                    dehn dehnVar = this.b;
                    dbsg<btlu> dbsgVar3 = this.c;
                    dbsg<PersonId> dbsgVar4 = this.d;
                    Boolean bool = (Boolean) obj;
                    if (dehnVar.isCancelled()) {
                        return;
                    }
                    aizaVar.b(dbsgVar3, dbsgVar4);
                }
            }), this.e);
            aiyzVar.b.put(i3, d);
        }
        aiok aiokVar = this.d;
        aioj aiojVar = aioj.INCOMING_SHARING_STATE;
        aioi b2 = aiokVar.b(dbsgVar);
        if (!b2.a.containsKey(personId)) {
            b2.a.put(personId, dcnm.g());
        }
        b2.a.get(personId).add(aiojVar);
        aiokVar.c(dbsgVar, dbsg.i(personId));
    }
}
