package defpackage;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: azkc  reason: default package */
/* loaded from: classes3.dex */
public final class azkc implements axwi {
    public static final dcep<baab> a = dcep.E(baab.FAVORITES, baab.WANT_TO_GO, baab.STARRED_PLACES, baab.CUSTOM);
    static final baad b = azvp.a;
    public final dxio<axxa> c;
    public final btrm d;
    public final dxio<axyh> e;
    public final dxio<axwk> f;
    public final dxio<ckcw> g;
    public final axyz h;
    private final Context i;
    private final akfa j;
    private final dxio<axwp> k;
    private final batm l;
    private final axwg m;
    private final ArrayDeque<baad> n = new ArrayDeque<>();

    public azkc(Context context, btrm btrmVar, akfa akfaVar, batm batmVar, dxio<axwp> dxioVar, dxio<axyh> dxioVar2, dxio<axxa> dxioVar3, dxio<axwk> dxioVar4, dxio<ckcw> dxioVar5, axwg axwgVar, axyz axyzVar) {
        this.i = context;
        this.d = btrmVar;
        this.j = akfaVar;
        this.l = batmVar;
        this.k = dxioVar;
        this.e = dxioVar2;
        this.c = dxioVar3;
        this.f = dxioVar4;
        this.g = dxioVar5;
        this.m = axwgVar;
        this.h = axyzVar;
    }

    private static <T> dbrn<T, T> x(final bvqg<T> bvqgVar) {
        return new dbrn(bvqgVar) { // from class: azja
            private final bvqg a;

            {
                this.a = bvqgVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bvqg bvqgVar2 = this.a;
                dcep<baab> dcepVar = azkc.a;
                bvqgVar2.NU(obj);
                return obj;
            }
        };
    }

    @Override // defpackage.axwi
    public final baad a(String str) {
        String s = dbra.b.s(str);
        dpou bZ = dpov.f.bZ();
        dprc dprcVar = dprc.CUSTOM_ENTITY_LIST;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpov dpovVar = (dpov) bZ.b;
        dpovVar.c = dprcVar.f;
        dpovVar.a |= 2;
        dpoq bZ2 = dpot.m.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpot dpotVar = (dpot) bZ2.b;
        s.getClass();
        dpotVar.a |= 16;
        dpotVar.f = s;
        dpqw dpqwVar = dpqw.OWNER_ENTITY_LIST;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpot dpotVar2 = (dpot) bZ2.b;
        dpotVar2.c = dpqwVar.f;
        dpotVar2.a |= 2;
        dpov bK = bZ.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpot dpotVar3 = (dpot) bZ2.b;
        bK.getClass();
        dpotVar3.b = bK;
        dpotVar3.a |= 1;
        dpot bK2 = bZ2.bK();
        doln bZ3 = dolo.d.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dolo doloVar = (dolo) bZ3.b;
        bK2.getClass();
        doloVar.b = bK2;
        doloVar.a |= 1;
        azzu aq = azzu.aq(new azxh(bZ3.bK()).b());
        aq.i = true;
        return aq;
    }

    @Override // defpackage.axwi
    public final baad b(dibq dibqVar) {
        return azzu.aq(this.c.a().i(dibqVar));
    }

    @Override // defpackage.axwi
    public final baad c(dpot dpotVar) {
        return azzu.aq(this.c.a().j(dpotVar));
    }

    @Override // defpackage.axwi
    public final baal d(baad baadVar, ilo iloVar) {
        if (baadVar instanceof azzu) {
            azxi azxiVar = ((azzu) baadVar).j;
            akqq aj = iloVar.aj();
            dolj bZ = dolk.h.bZ();
            boolean aV = iloVar.aV();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dolk dolkVar = (dolk) bZ.b;
            dolkVar.a |= 8;
            dolkVar.f = aV;
            String B = iloVar.B();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dolk dolkVar2 = (dolk) bZ.b;
            B.getClass();
            dolkVar2.a |= 2;
            dolkVar2.d = B;
            String n = iloVar.n();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dolk dolkVar3 = (dolk) bZ.b;
            n.getClass();
            dolkVar3.a |= 1;
            dolkVar3.b = n;
            if (akqi.d(iloVar.ai())) {
                String o = iloVar.ai().o();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dolk dolkVar4 = (dolk) bZ.b;
                o.getClass();
                dolkVar4.a |= 16;
                dolkVar4.g = o;
            }
            if (aj != null) {
                dnoh g = aj.g();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dolk dolkVar5 = (dolk) bZ.b;
                g.getClass();
                dolkVar5.e = g;
                dolkVar5.a |= 4;
            }
            dppu bZ2 = dppv.g.bZ();
            String B2 = iloVar.B();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dppv dppvVar = (dppv) bZ2.b;
            B2.getClass();
            dppvVar.a |= 8;
            dppvVar.e = B2;
            String cG = iloVar.cG();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dppv dppvVar2 = (dppv) bZ2.b;
            cG.getClass();
            dppvVar2.a |= 16;
            dppvVar2.f = cG;
            if (akqi.d(iloVar.ai())) {
                dpsn i = iloVar.ai().i();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dppv dppvVar3 = (dppv) bZ2.b;
                i.getClass();
                dppvVar3.b = i;
                dppvVar3.a |= 1;
                if (iloVar.aV()) {
                    String y = iloVar.y();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dppv dppvVar4 = (dppv) bZ2.b;
                    y.getClass();
                    dppvVar4.a |= 4;
                    dppvVar4.d = y;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dolk dolkVar6 = (dolk) bZ.b;
                    y.getClass();
                    dolkVar6.a |= 2;
                    dolkVar6.d = y;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dppv dppvVar5 = (dppv) bZ2.b;
                    y.getClass();
                    dppvVar5.a |= 8;
                    dppvVar5.e = y;
                }
            }
            if (aj != null) {
                dpum h = aj.h();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dppv dppvVar6 = (dppv) bZ2.b;
                h.getClass();
                dppvVar6.c = h;
                dppvVar6.a |= 2;
            }
            dppq bZ3 = dppt.e.bZ();
            dppw bZ4 = dppz.c.bZ();
            dppy dppyVar = dppy.PLACE_ENTITY_LIST_ITEM;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dppz dppzVar = (dppz) bZ4.b;
            dppzVar.b = dppyVar.e;
            dppzVar.a |= 1;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dppt dpptVar = (dppt) bZ3.b;
            dppz bK = bZ4.bK();
            bK.getClass();
            dpptVar.d = bK;
            dpptVar.a |= 1;
            if (akqi.d(iloVar.ai())) {
                dpsn i2 = iloVar.ai().i();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dppt dpptVar2 = (dppt) bZ3.b;
                i2.getClass();
                dpptVar2.c = i2;
                dpptVar2.b = 2;
            } else if (aj != null) {
                dpum h2 = aj.h();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dppt dpptVar3 = (dppt) bZ3.b;
                h2.getClass();
                dpptVar3.c = h2;
                dpptVar3.b = 3;
            }
            dpoy bZ5 = dppl.m.bZ();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dppl dpplVar = (dppl) bZ5.b;
            dppv bK2 = bZ2.bK();
            bK2.getClass();
            dpplVar.c = bK2;
            dpplVar.b = 2;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dppl dpplVar2 = (dppl) bZ5.b;
            dppt bK3 = bZ3.bK();
            bK3.getClass();
            dpplVar2.d = bK3;
            dpplVar2.a |= 1;
            String n2 = iloVar.n();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dppl dpplVar3 = (dppl) bZ5.b;
            n2.getClass();
            dpplVar3.a |= 16;
            dpplVar3.e = n2;
            dppl bK4 = bZ5.bK();
            doll bZ6 = dolm.f.bZ();
            dolk bK5 = bZ.bK();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dolm dolmVar = (dolm) bZ6.b;
            bK5.getClass();
            dolmVar.d = bK5;
            int i3 = dolmVar.a | 4;
            dolmVar.a = i3;
            bK4.getClass();
            dolmVar.b = bK4;
            dolmVar.a = i3 | 1;
            if (azxiVar.n().a()) {
                String b2 = azxiVar.n().b();
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                dolm dolmVar2 = (dolm) bZ6.b;
                b2.getClass();
                dolmVar2.a |= 2;
                dolmVar2.c = b2;
            }
            azzv u = azzv.u(new azxf(bZ6.bK()).b());
            u.t();
            return u;
        }
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.axwi
    public final baal e(baad baadVar, dppl dpplVar) {
        doll bZ = dolm.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dolm dolmVar = (dolm) bZ.b;
        dpplVar.getClass();
        dolmVar.b = dpplVar;
        dolmVar.a |= 1;
        azxi azxiVar = ((azzu) baadVar).j;
        if (azxiVar.n().a()) {
            String b2 = azxiVar.n().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dolm dolmVar2 = (dolm) bZ.b;
            b2.getClass();
            dolmVar2.a |= 2;
            dolmVar2.c = b2;
        }
        azzv u = azzv.u(new azxf(bZ.bK()).b());
        u.t();
        return u;
    }

    @Override // defpackage.axwi
    public final dehn<dcdc<baad>> f() {
        return this.l.c(new Callable(this) { // from class: azih
            private final azkc a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                final azkc azkcVar = this.a;
                dccx dccxVar = new dccx();
                baad baadVar = azkcVar.i(baab.FAVORITES).get();
                if (baadVar != null) {
                    dccxVar.g(baadVar);
                }
                baad baadVar2 = azkcVar.i(baab.WANT_TO_GO).get();
                if (baadVar2 != null) {
                    dccxVar.g(baadVar2);
                }
                dcdc A = dcbg.b(azkcVar.c.a().a()).s(new dbrn(azkcVar) { // from class: azjl
                    private final azkc a;

                    {
                        this.a = azkcVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        azkc azkcVar2 = this.a;
                        try {
                            dbsg<azxi> b2 = azkcVar2.c.a().b((azxi) obj);
                            if (!b2.a()) {
                                return dbpy.a;
                            }
                            azzu aq = azzu.aq(b2.b());
                            azkcVar2.t(aq);
                            return dbsg.i(aq);
                        } catch (axxc | InterruptedException | ExecutionException e) {
                            throw new IllegalArgumentException(e);
                        }
                    }
                }).o(azjm.a).s(azjn.a).o(azjp.a).A(dcmw.a.g(azjq.a));
                final dcep B = dcbg.b(A).o(azjr.a).s(azjs.a).B();
                dccxVar.i(dcft.i(A, new dbsl(B) { // from class: azjt
                    private final Set a;

                    {
                        this.a = B;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        Set set = this.a;
                        baad baadVar3 = (baad) obj;
                        dcep<baab> dcepVar = azkc.a;
                        return !baadVar3.z() || !set.contains(baadVar3.l());
                    }
                }));
                return dccxVar.f();
            }
        });
    }

    @Override // defpackage.axwi
    public final dehn<dcdc<baal>> g() {
        final dehn h = deew.h(f(), azis.a, dege.a);
        final dehn h2 = deew.h(i(baab.LOCAL_FOLLOWING_STARRED_PLACES), azjd.a, dege.a);
        final dehn h3 = deew.h(i(baab.LOCAL_DEAL), azjo.a, dege.a);
        return deee.g(deha.k(h, h2, h3).b(new Callable(h, h2, h3) { // from class: azju
            private final dehn a;
            private final dehn b;
            private final dehn c;

            {
                this.a = h;
                this.b = h2;
                this.c = h3;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                dehn dehnVar = this.a;
                dehn dehnVar2 = this.b;
                dehn dehnVar3 = this.c;
                dcep<baab> dcepVar = azkc.a;
                dccx F = dcdc.F();
                F.i((Iterable) deha.s(dehnVar));
                F.i((Iterable) deha.s(dehnVar2));
                F.i((Iterable) deha.s(dehnVar3));
                return F.f();
            }
        }, dege.a), Throwable.class, azjv.a, dege.a);
    }

    @Override // defpackage.axwi
    public final dehn<baad> h(String str) {
        return this.l.c(new azka(this, str));
    }

    @Override // defpackage.axwi
    public final dehn<baad> i(baab baabVar) {
        return this.l.c(new azkb(this, baabVar));
    }

    @Override // defpackage.axwi
    public final dehn<baad> j(baad baadVar) {
        dehn c = deha.c();
        boolean z = true;
        if (baadVar.r() && baadVar.E(this.i).isEmpty()) {
            z = false;
        }
        dbsk.b(z, "Custom list can not have empty list title.");
        final boolean ab = baadVar.ab();
        if (baadVar instanceof azzu) {
            final azzu azzuVar = (azzu) baadVar;
            c = this.l.c(new Callable(this, ab, azzuVar) { // from class: azjw
                private final azkc a;
                private final boolean b;
                private final azzu c;

                {
                    this.a = this;
                    this.b = ab;
                    this.c = azzuVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final azkc azkcVar = this.a;
                    boolean z2 = this.b;
                    final azzu azzuVar2 = this.c;
                    if (z2 || azzuVar2.h) {
                        azzuVar2.ap(new azzo(azkcVar) { // from class: azjj
                            private final azkc a;

                            {
                                this.a = azkcVar;
                            }

                            @Override // defpackage.azzo
                            public final Object a(Object obj, boolean z3) {
                                try {
                                    return this.a.c.a().k((azxi) obj);
                                } catch (axxc e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        });
                        if (z2) {
                            azzuVar2.ar(new azzo(azkcVar, azzuVar2) { // from class: azjy
                                private final azkc a;
                                private final azzu b;

                                {
                                    this.a = azkcVar;
                                    this.b = azzuVar2;
                                }

                                @Override // defpackage.azzo
                                public final Object a(Object obj, boolean z3) {
                                    azkc azkcVar2 = this.a;
                                    azzu azzuVar3 = this.b;
                                    try {
                                        azxg l = azkcVar2.c.a().l((azxg) obj, azzuVar3.j);
                                        azzv u = azzv.u(l);
                                        u.c = azzuVar3;
                                        azkcVar2.e.a().b(u);
                                        return l;
                                    } catch (axxc e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                            });
                            azkcVar.f.a().g(azzuVar2);
                            azzuVar2.i = false;
                            return azzuVar2;
                        }
                    } else if (!azzuVar2.j.n().a()) {
                        azzuVar2.ap(new azzo(azkcVar) { // from class: azjk
                            private final azkc a;

                            {
                                this.a = azkcVar;
                            }

                            @Override // defpackage.azzo
                            public final Object a(Object obj, boolean z3) {
                                azxi azxiVar = (azxi) obj;
                                try {
                                    azwl azwlVar = azxiVar.j;
                                    dbsk.s(azwlVar);
                                    return this.a.c.a().c(azwlVar.a).c(azxiVar);
                                } catch (axxc e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        });
                    }
                    dbsg<azxi> b2 = azkcVar.c.a().b(azzuVar2.j);
                    dbsk.a(b2.a());
                    azzuVar2.ar(new azzo(azkcVar, dcbg.b(b2.b().a).o(dbss.NOT_NULL).D(azjz.a), azzuVar2) { // from class: azii
                        private final azkc a;
                        private final dcdn b;
                        private final azzu c;

                        {
                            this.a = azkcVar;
                            this.b = r2;
                            this.c = azzuVar2;
                        }

                        @Override // defpackage.azzo
                        public final Object a(Object obj, boolean z3) {
                            azkc azkcVar2 = this.a;
                            dcdn dcdnVar = this.b;
                            azzu azzuVar3 = this.c;
                            azxg azxgVar = (azxg) obj;
                            if (!z3) {
                                try {
                                    azwl azwlVar = azxgVar.j;
                                    dbsk.s(azwlVar);
                                    if (dcdnVar.containsKey(azwlVar.a)) {
                                        return azxgVar;
                                    }
                                } catch (axxc e) {
                                    throw new RuntimeException(e);
                                }
                            }
                            azxg l = azkcVar2.c.a().l(azxgVar, azzuVar3.j);
                            azzv u = azzv.u(l);
                            u.c = azzuVar3;
                            azkcVar2.e.a().b(u);
                            return l;
                        }
                    });
                    dcdc z3 = dcbg.b(azzuVar2.as()).o(azij.a).z();
                    if (!z3.isEmpty()) {
                        ckco ckcoVar = (ckco) azkcVar.g.a().a(ckiv.a);
                        int size = z3.size();
                        int i = 1;
                        dbsk.a(size > 0);
                        if (size >= 500) {
                            i = 8;
                        } else if (size >= 100) {
                            i = 7;
                        } else if (size >= 50) {
                            i = 6;
                        } else if (size >= 30) {
                            i = 5;
                        } else if (size >= 20) {
                            i = 4;
                        } else if (size >= 10) {
                            i = 3;
                        } else if (size >= 5) {
                            i = 2;
                        }
                        ckcoVar.a(i - 1);
                        int size2 = z3.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            azzp azzpVar = (azzp) z3.get(i2);
                            try {
                                azxg azxgVar = (azxg) azzpVar.ao();
                                azzv.u(azxgVar).c = azzuVar2;
                                azkcVar.e.a().d(azzpVar);
                                azkcVar.c.a().s(azxgVar);
                            } catch (axxc e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    azzuVar2.i = false;
                    return azzuVar2;
                }
            });
        }
        return deew.h(c, x(new bvqg(this, ab) { // from class: azjx
            private final azkc a;
            private final boolean b;

            {
                this.a = this;
                this.b = ab;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                azkc azkcVar = this.a;
                boolean z2 = this.b;
                baad baadVar2 = (baad) obj;
                btrm btrmVar = azkcVar.d;
                int i = 1;
                if (true != z2) {
                    i = 2;
                }
                btrmVar.b(azrb.b(i, baadVar2));
            }
        }), dege.a);
    }

    @Override // defpackage.axwi
    public final dehn<baad> k(axwf axwfVar, dbsg<dpqy> dbsgVar) {
        return deew.h(this.c.a().h(axwfVar, dbsgVar), azim.a, dege.a);
    }

    @Override // defpackage.axwi
    public final dehn<baad> l(baad baadVar, baac baacVar) {
        dehn<azxi> n;
        dehn c = deha.c();
        if (baadVar instanceof azzu) {
            if (baadVar.t().equals(baacVar)) {
                return deha.a(baadVar);
            }
            boolean z = false;
            if (!baadVar.ab() && !baadVar.X()) {
                z = true;
            }
            dbsk.b(z, "Illegal state. We don't expect list be sharable if list is dirty or new.");
            final azzu azzuVar = (azzu) baadVar;
            azxi azxiVar = azzuVar.j;
            baac t = baadVar.t();
            int ordinal = baacVar.ordinal();
            if (ordinal == 0) {
                n = this.c.a().n(azxiVar, dpqn.PRIVATE_ENTITY_LIST);
            } else if (ordinal == 1) {
                if (t.equals(baac.PRIVATE)) {
                    n = this.c.a().n(azxiVar, dpqn.READABLE_ENTITY_LIST);
                } else {
                    if (t.equals(baac.PUBLISHED)) {
                        n = this.c.a().t(azxiVar, 2);
                    }
                    n = deha.b(new IllegalStateException("Fail to issue share request."));
                }
            } else {
                if (ordinal == 2) {
                    n = this.c.a().t(azxiVar, 3);
                }
                n = deha.b(new IllegalStateException("Fail to issue share request."));
            }
            c = deew.h(n, new dbrn(azzuVar) { // from class: azin
                private final azzu a;

                {
                    this.a = azzuVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    azzu azzuVar2 = this.a;
                    final azxi azxiVar2 = (azxi) obj;
                    azzuVar2.ap(new azzo(azxiVar2) { // from class: azji
                        private final azxi a;

                        {
                            this.a = azxiVar2;
                        }

                        @Override // defpackage.azzo
                        public final Object a(Object obj2, boolean z2) {
                            azxi azxiVar3 = this.a;
                            azxi azxiVar4 = (azxi) obj2;
                            dcep<baab> dcepVar = azkc.a;
                            return azxiVar3;
                        }
                    });
                    return azzuVar2;
                }
            }, dege.a);
        }
        return deew.h(c, x(new bvqg(this) { // from class: azio
            private final azkc a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.d.b(azrc.a((baad) obj));
            }
        }), dege.a);
    }

    @Override // defpackage.axwi
    public final dehn<baad> m(baad baadVar, dpqn dpqnVar) {
        dehn c = deha.c();
        if (baadVar instanceof azzu) {
            dpri dpriVar = baadVar.p().d;
            if (dpriVar == null) {
                dpriVar = dpri.f;
            }
            dpqn b2 = dpqn.b(dpriVar.b);
            if (b2 == null) {
                b2 = dpqn.PRIVATE_ENTITY_LIST;
            }
            if (b2.equals(dpqnVar)) {
                return deha.a(baadVar);
            }
            boolean z = false;
            if (!baadVar.ab() && !baadVar.X()) {
                z = true;
            }
            dbsk.b(z, "Illegal state. We don't expect list be sharable if list is dirty or new.");
            final azzu azzuVar = (azzu) baadVar;
            c = deew.h(this.c.a().n(azzuVar.j, dpqnVar), new dbrn(azzuVar) { // from class: azip
                private final azzu a;

                {
                    this.a = azzuVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    azzu azzuVar2 = this.a;
                    final azxi azxiVar = (azxi) obj;
                    azzuVar2.ap(new azzo(azxiVar) { // from class: azjh
                        private final azxi a;

                        {
                            this.a = azxiVar;
                        }

                        @Override // defpackage.azzo
                        public final Object a(Object obj2, boolean z2) {
                            azxi azxiVar2 = this.a;
                            azxi azxiVar3 = (azxi) obj2;
                            dcep<baab> dcepVar = azkc.a;
                            return azxiVar2;
                        }
                    });
                    return azzuVar2;
                }
            }, dege.a);
        }
        return deew.h(c, x(new bvqg(this) { // from class: aziq
            private final azkc a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.d.b(azrc.a((baad) obj));
            }
        }), dege.a);
    }

    @Override // defpackage.axwi
    public final dehn<baad> n(baad baadVar) {
        dehn c = deha.c();
        if (baadVar instanceof azzu) {
            final azzu azzuVar = (azzu) baadVar;
            if (baadVar.z()) {
                c = deew.h(this.c.a().p(azzuVar.j), new dbrn(this, azzuVar) { // from class: azix
                    private final azkc a;
                    private final azzu b;

                    {
                        this.a = this;
                        this.b = azzuVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        azkc azkcVar = this.a;
                        azzu azzuVar2 = this.b;
                        final azxi azxiVar = (azxi) obj;
                        azzuVar2.ap(new azzo(azxiVar) { // from class: azjc
                            private final azxi a;

                            {
                                this.a = azxiVar;
                            }

                            @Override // defpackage.azzo
                            public final Object a(Object obj2, boolean z) {
                                azxi azxiVar2 = this.a;
                                azxi azxiVar3 = (azxi) obj2;
                                dcep<baab> dcepVar = azkc.a;
                                return azxiVar2;
                            }
                        });
                        azzuVar2.R(azzuVar2.d - 1);
                        if (azzuVar2.g) {
                            azzuVar2.Z();
                            azkcVar.f.a().g(azzuVar2);
                        }
                        return azzuVar2;
                    }
                }, dege.a);
            } else {
                c = deew.h(this.c.a().o(azzuVar.j), new dbrn(this, azzuVar) { // from class: aziy
                    private final azkc a;
                    private final azzu b;

                    {
                        this.a = this;
                        this.b = azzuVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        azkc azkcVar = this.a;
                        azzu azzuVar2 = this.b;
                        final azxi azxiVar = (azxi) obj;
                        azzuVar2.ap(new azzo(azxiVar) { // from class: azjb
                            private final azxi a;

                            {
                                this.a = azxiVar;
                            }

                            @Override // defpackage.azzo
                            public final Object a(Object obj2, boolean z) {
                                azxi azxiVar2 = this.a;
                                azxi azxiVar3 = (azxi) obj2;
                                dcep<baab> dcepVar = azkc.a;
                                return azxiVar2;
                            }
                        });
                        azzuVar2.R(azzuVar2.d + 1);
                        azkcVar.f.a().g(azzuVar2);
                        return azzuVar2;
                    }
                }, dege.a);
            }
        }
        return deew.h(c, x(new bvqg(this) { // from class: aziz
            private final azkc a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                baad baadVar2 = (baad) obj;
                btrm btrmVar = this.a.d;
                int i = 1;
                if (true != baadVar2.z()) {
                    i = 3;
                }
                btrmVar.b(azrb.b(i, baadVar2));
            }
        }), dege.a);
    }

    @Override // defpackage.axwi
    public final dehn<baad> o(final baad baadVar) {
        dehn c = deha.c();
        if (!baadVar.C() || !this.m.a()) {
            throw new UnsupportedOperationException();
        }
        if (baadVar instanceof azzu) {
            final azzu azzuVar = (azzu) baadVar;
            if (baadVar.A()) {
                c = deew.h(this.c.a().r(azzuVar.j), new dbrn(this, azzuVar, baadVar) { // from class: aziu
                    private final azkc a;
                    private final azzu b;
                    private final baad c;

                    {
                        this.a = this;
                        this.b = azzuVar;
                        this.c = baadVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        azkc azkcVar = this.a;
                        azzu azzuVar2 = this.b;
                        baad baadVar2 = this.c;
                        final azxi azxiVar = (azxi) obj;
                        azzuVar2.ap(new azzo(azxiVar) { // from class: azjf
                            private final azxi a;

                            {
                                this.a = azxiVar;
                            }

                            @Override // defpackage.azzo
                            public final Object a(Object obj2, boolean z) {
                                azxi azxiVar2 = this.a;
                                azxi azxiVar3 = (azxi) obj2;
                                dcep<baab> dcepVar = azkc.a;
                                return azxiVar2;
                            }
                        });
                        if (azzuVar2.g) {
                            azzuVar2.Z();
                            azkcVar.f.a().g(azzuVar2);
                        }
                        azkcVar.h.c(baadVar2.n());
                        return azzuVar2;
                    }
                }, dege.a);
            } else {
                c = deew.h(this.c.a().q(azzuVar.j), new dbrn(this, azzuVar, baadVar) { // from class: aziv
                    private final azkc a;
                    private final azzu b;
                    private final baad c;

                    {
                        this.a = this;
                        this.b = azzuVar;
                        this.c = baadVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        azkc azkcVar = this.a;
                        azzu azzuVar2 = this.b;
                        baad baadVar2 = this.c;
                        final azxi azxiVar = (azxi) obj;
                        azzuVar2.ap(new azzo(azxiVar) { // from class: azje
                            private final azxi a;

                            {
                                this.a = azxiVar;
                            }

                            @Override // defpackage.azzo
                            public final Object a(Object obj2, boolean z) {
                                azxi azxiVar2 = this.a;
                                azxi azxiVar3 = (azxi) obj2;
                                dcep<baab> dcepVar = azkc.a;
                                return azxiVar2;
                            }
                        });
                        azkcVar.f.a().g(azzuVar2);
                        azkcVar.h.c(baadVar2.n());
                        return azzuVar2;
                    }
                }, dege.a);
            }
        }
        return deew.h(c, x(new bvqg(this) { // from class: aziw
            private final azkc a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                baad baadVar2 = (baad) obj;
                btrm btrmVar = this.a.d;
                int i = 1;
                if (true != baadVar2.A()) {
                    i = 3;
                }
                btrmVar.b(azrb.b(i, baadVar2));
            }
        }), dege.a);
    }

    @Override // defpackage.axwi
    @dzsi
    public final synchronized baad p() {
        if (q()) {
            return null;
        }
        return this.n.peek();
    }

    @Override // defpackage.axwi
    public final synchronized boolean q() {
        return this.n.peek() == b;
    }

    @Override // defpackage.axwi
    public final void r(final baad baadVar) {
        dehn c = deha.c();
        if (baadVar instanceof azzu) {
            final azzu azzuVar = (azzu) baadVar;
            c = this.l.c(new Callable(this, azzuVar) { // from class: azik
                private final azkc a;
                private final azzu b;

                {
                    this.a = this;
                    this.b = azzuVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    azkc azkcVar = this.a;
                    azzu azzuVar2 = this.b;
                    try {
                        boolean m = azkcVar.c.a().m(azzuVar2.j);
                        if (m) {
                            dcdc<baal> i = azzuVar2.i();
                            int size = i.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                azkcVar.e.a().d((azzv) i.get(i2));
                            }
                            if (azzuVar2.g) {
                                azzuVar2.Z();
                                azkcVar.f.a().g(azzuVar2);
                            }
                        }
                        return Boolean.valueOf(m);
                    } catch (axxc e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
        deew.h(c, x(new bvqg(this, baadVar) { // from class: azil
            private final azkc a;
            private final baad b;

            {
                this.a = this;
                this.b = baadVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                azkc azkcVar = this.a;
                baad baadVar2 = this.b;
                if (((Boolean) obj).booleanValue()) {
                    azkcVar.d.b(azrb.b(3, baadVar2));
                }
            }
        }), dege.a);
    }

    @Override // defpackage.axwi
    public final dehn<baad> s(baad baadVar, int i) {
        dehn c = deha.c();
        if (baadVar instanceof azzu) {
            dpri dpriVar = baadVar.p().d;
            if (dpriVar == null) {
                dpriVar = dpri.f;
            }
            int a2 = dpqr.a(dpriVar.c);
            if (a2 == 0) {
                a2 = 2;
            }
            if (a2 == i) {
                return deha.a(baadVar);
            }
            boolean z = false;
            if (!baadVar.ab() && !baadVar.X()) {
                z = true;
            }
            dbsk.b(z, "Illegal state. We don't expect list be sharable if list is dirty or new.");
            final azzu azzuVar = (azzu) baadVar;
            c = deew.h(this.c.a().t(azzuVar.j, i), new dbrn(azzuVar) { // from class: azir
                private final azzu a;

                {
                    this.a = azzuVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    azzu azzuVar2 = this.a;
                    final azxi azxiVar = (azxi) obj;
                    azzuVar2.ap(new azzo(azxiVar) { // from class: azjg
                        private final azxi a;

                        {
                            this.a = azxiVar;
                        }

                        @Override // defpackage.azzo
                        public final Object a(Object obj2, boolean z2) {
                            azxi azxiVar2 = this.a;
                            azxi azxiVar3 = (azxi) obj2;
                            dcep<baab> dcepVar = azkc.a;
                            return azxiVar2;
                        }
                    });
                    return azzuVar2;
                }
            }, dege.a);
        }
        return deew.h(c, x(new bvqg(this) { // from class: azit
            private final azkc a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.d.b(azrc.a((baad) obj));
            }
        }), dege.a);
    }

    public final void t(baad baadVar) {
        bvrj.BACKGROUND_THREADPOOL.c();
        if (this.f.a().a(baadVar).get().booleanValue() || !((azzm) baadVar).g) {
            return;
        }
        baadVar.Z();
    }

    public final synchronized void u(azrb azrbVar) {
        baad baadVar = azrbVar.a;
        if (baadVar == null && azrbVar.a()) {
            baadVar = b;
        }
        if (baadVar != null) {
            int i = azrbVar.b;
            v(i, baadVar);
            w(i, baadVar);
        }
        this.d.b(azre.a(this.j.j(), this.k.a()));
    }

    final synchronized void v(int i, baad baadVar) {
        baac baacVar = baac.PRIVATE;
        int i2 = i - 1;
        if (i2 == 1) {
            baad peek = this.n.peek();
            if (peek != null && peek.aa(baadVar)) {
                this.n.pop();
                this.n.push(baadVar);
            }
        } else if (i2 != 4) {
            if (i2 == 5 && this.n.peek() == baadVar) {
                this.n.pop();
            }
        } else {
            this.n.push(baadVar);
        }
    }

    final synchronized void w(int i, baad baadVar) {
        if (baadVar == b) {
            return;
        }
        baac baacVar = baac.PRIVATE;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 == 4) {
            if (!baadVar.y() && !baadVar.z()) {
                dcdc<baal> i4 = baadVar.i();
                int size = i4.size();
                while (i3 < size) {
                    this.e.a().b((azzp) i4.get(i3));
                    i3++;
                }
            }
        } else if (i2 == 5 && !baadVar.y() && !baadVar.z()) {
            dcdc<baal> i5 = baadVar.i();
            int size2 = i5.size();
            while (i3 < size2) {
                this.e.a().d((azzp) i5.get(i3));
                i3++;
            }
        }
    }
}
