package defpackage;

import java.util.HashSet;
/* compiled from: PG */
/* renamed from: ajlj  reason: default package */
/* loaded from: classes2.dex */
public abstract class ajlj {
    public abstract dcep<btlu> a();

    public abstract dced<btlu, ahwl> b();

    public abstract dcdn<btlu, aile> c();

    public abstract int d();

    public abstract eapd e();

    public abstract dkog f();

    public abstract ajli g();

    public abstract int h();

    public final dcep<btlu> i(final eapd eapdVar) {
        dkof dkofVar = f().q;
        if (dkofVar == null) {
            dkofVar = dkof.s;
        }
        if (dkofVar.i) {
            return dcmr.a;
        }
        return dcep.L(dcft.i(a(), new dbsl(this, eapdVar) { // from class: ajkv
            private final ajlj a;
            private final eapd b;

            {
                this.a = this;
                this.b = eapdVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                ajlj ajljVar = this.a;
                btlu btluVar = (btlu) obj;
                if (!ajljVar.l(btluVar, this.b)) {
                    return false;
                }
                dbsg j = dbsg.j(ajljVar.c().get(btluVar));
                if (!j.a()) {
                    return false;
                }
                return ((aile) j.b()).i();
            }
        }));
    }

    public final dcep<btlu> j(final eapd eapdVar) {
        return dcep.L(dcft.i(a(), new dbsl(this, eapdVar) { // from class: ajkz
            private final ajlj a;
            private final eapd b;

            {
                this.a = this;
                this.b = eapdVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.l((btlu) obj, this.b);
            }
        }));
    }

    public final dcep<btlu> k() {
        if (h() != 1) {
            return dcmr.a;
        }
        return i(e());
    }

    public final boolean l(btlu btluVar, eapd eapdVar) {
        if (dcft.j(b().h(btluVar), ajlc.a)) {
            return true;
        }
        return m(eapdVar, btluVar).a();
    }

    public final dbsg<eaow> m(final eapd eapdVar, btlu btluVar) {
        Iterable i = dcft.i(dcft.o(b().h(btluVar), new dbrn(eapdVar) { // from class: ajkx
            private final eapd a;

            {
                this.a = eapdVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return Long.valueOf(((ahwl) obj).E(this.a.a));
            }
        }), ajky.a);
        return !i.iterator().hasNext() ? dbpy.a : dbsg.i(eaow.e(((Long) dcln.a.j(i)).longValue()));
    }

    public final dcdc<dqzk> n() {
        dccx F = dcdc.F();
        F.i(f().I);
        F.i(dcdc.e());
        return F.f();
    }

    public final dbsg<eaow> o(eapd eapdVar) {
        dkof dkofVar = f().q;
        if (dkofVar == null) {
            dkofVar = dkof.s;
        }
        if (!dkofVar.l && !i(eapdVar).isEmpty() && dcft.m(n(), ajla.a).a()) {
            dkoa dkoaVar = f().C;
            if (dkoaVar == null) {
                dkoaVar = dkoa.c;
            }
            if (!ajjt.c(d())) {
                return dbsg.i(eaow.d(dkoaVar.b));
            }
            return dbsg.i(eaow.d(dkoaVar.a));
        }
        return dbpy.a;
    }

    public final dbsg<ajni> p(final eapd eapdVar) {
        dbsg dbsgVar;
        dbsg dbsgVar2;
        int i;
        dcep<btlu> i2 = i(eapdVar);
        if (i2.isEmpty()) {
            return dbpy.a;
        }
        Iterable k = dbsg.k(dcft.o(i2, new dbrn(this, eapdVar) { // from class: ajkw
            private final ajlj a;
            private final eapd b;

            {
                this.a = this;
                this.b = eapdVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.m(this.b, (btlu) obj);
            }
        }));
        dbsg i3 = !k.iterator().hasNext() ? dbpy.a : dbsg.i((eaow) dcln.a.j(k));
        Iterable o = dcft.o(dcft.i(dcft.o(i2, new dbrn(this, eapdVar) { // from class: ajld
            private final ajlj a;
            private final eapd b;

            {
                this.a = this;
                this.b = eapdVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ajlj ajljVar = this.a;
                eapd eapdVar2 = this.b;
                dbsg j = dbsg.j(ajljVar.c().get((btlu) obj));
                if (!j.a()) {
                    return dbpy.a;
                }
                dbsg<eapd> a = ((aile) j.b()).a();
                return !a.a() ? dbpy.a : dbsg.i(new eaow(a.b(), eapdVar2));
            }
        }), ajle.a), ajlf.a);
        dbsg i4 = !o.iterator().hasNext() ? dbpy.a : dbsg.i((eaow) dcln.a.j(o));
        Iterable k2 = dbsg.k(dcft.o(i2, new dbrn(this, eapdVar) { // from class: ajlg
            private final ajlj a;
            private final eapd b;

            {
                this.a = this;
                this.b = eapdVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ajlj ajljVar = this.a;
                eapd eapdVar2 = this.b;
                Iterable o2 = dcft.o(ajljVar.b().h((btlu) obj), ajlh.a);
                return !o2.iterator().hasNext() ? dbpy.a : dbsg.i(new eaow(new eapd(dcln.a.m(o2)), eapdVar2));
            }
        }));
        dbsg i5 = !k2.iterator().hasNext() ? dbpy.a : dbsg.i((eaow) dcln.a.j(k2));
        dccx F = dcdc.F();
        dqzi dqziVar = f().G;
        if (dqziVar == null) {
            dqziVar = dqzi.c;
        }
        if (dqziVar.b != 0) {
            dqzi dqziVar2 = f().G;
            if (dqziVar2 == null) {
                dqziVar2 = dqzi.c;
            }
            dbsgVar = dbsg.i(dqziVar2);
        } else {
            dbsgVar = dbpy.a;
        }
        if (dbsgVar.a()) {
            ajng d = ajnh.d();
            ((ajka) d).a = eaow.e(((dqzi) dbsgVar.b()).b);
            d.c(dqym.CONFIGURED_DEFAULT_BURST);
            F.g(d.a());
        }
        dqzi dqziVar3 = f().H;
        if (dqziVar3 == null) {
            dqziVar3 = dqzi.c;
        }
        if (dqziVar3.b != 0) {
            dqzi dqziVar4 = f().H;
            if (dqziVar4 == null) {
                dqziVar4 = dqzi.c;
            }
            dbsgVar2 = dbsg.i(dqziVar4);
        } else {
            dbsgVar2 = dbpy.a;
        }
        int i6 = 1;
        if (dbsgVar2.a() && h() == 1) {
            ajng d2 = ajnh.d();
            ((ajka) d2).a = eaow.e(((dqzi) dbsgVar2.b()).b);
            d2.c(dqym.APP_IN_FOREGROUND);
            F.g(d2.a());
        }
        boolean c = ajjt.c(d());
        int d3 = d();
        boolean z = d3 == 3 || d3 == 5;
        dcdc<dqzk> n = n();
        int size = n.size();
        int i7 = 0;
        while (i7 < size) {
            dqzk dqzkVar = n.get(i7);
            int i8 = dqzkVar.b;
            if (i8 != 0) {
                switch (i8) {
                    case 2:
                        i = 1;
                        break;
                    case 3:
                        i = 2;
                        break;
                    case 4:
                        i = 3;
                        break;
                    case 5:
                        i = 4;
                        break;
                    case 6:
                        i = 5;
                        break;
                    case 7:
                        i = 6;
                        break;
                    default:
                        i = 0;
                        break;
                }
            } else {
                i = 7;
            }
            int i9 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i9 == 0) {
                eaow e = eaow.e(i8 == 2 ? ((Integer) dqzkVar.c).intValue() : 0);
                if (i3.a() && e.p((eapq) i3.b())) {
                    ajng d4 = ajnh.d();
                    dqzi dqziVar5 = dqzkVar.d;
                    if (dqziVar5 == null) {
                        dqziVar5 = dqzi.c;
                    }
                    ((ajka) d4).a = eaow.e(dqziVar5.b);
                    d4.c(dqym.REPORTING_RULE_SHARE_WILL_FINISH_SOON);
                    d4.b(eapdVar.e((eapq) i3.b()));
                    F.g(d4.a());
                }
            } else if (i9 == i6) {
                eaow e2 = eaow.e(i8 == 3 ? ((Integer) dqzkVar.c).intValue() : 0);
                if (i5.a() && e2.p((eapq) i5.b())) {
                    ajng d5 = ajnh.d();
                    dqzi dqziVar6 = dqzkVar.d;
                    if (dqziVar6 == null) {
                        dqziVar6 = dqzi.c;
                    }
                    ((ajka) d5).a = eaow.e(dqziVar6.b);
                    d5.c(dqym.REPORTING_RULE_SHARE_CREATED_RECENTLY);
                    d5.b(eapdVar.e(e2.k((eapq) i5.b())));
                    F.g(d5.a());
                }
            } else if (i9 != 2) {
                if (i9 == 3) {
                    eaow e3 = eaow.e(i8 == 5 ? ((Integer) dqzkVar.c).intValue() : 0);
                    if (i4.a() && e3.p((eapq) i4.b())) {
                        ajng d6 = ajnh.d();
                        dqzi dqziVar7 = dqzkVar.d;
                        if (dqziVar7 == null) {
                            dqziVar7 = dqzi.c;
                        }
                        ((ajka) d6).a = eaow.e(dqziVar7.b);
                        d6.c(dqym.REPORTING_RULE_OVENFRESH_RECEIVED_RECENTLY);
                        d6.b(eapdVar.e(e3.k((eapq) i4.b())));
                        F.g(d6.a());
                    }
                }
            } else if (i8 == 4 && ((Boolean) dqzkVar.c).booleanValue() && c) {
                ajng d7 = ajnh.d();
                dqzi dqziVar8 = dqzkVar.d;
                if (dqziVar8 == null) {
                    dqziVar8 = dqzi.c;
                }
                ((ajka) d7).a = eaow.e(dqziVar8.b);
                d7.c(dqym.REPORTING_RULE_DEVICE_ON_THE_MOVE);
                F.g(d7.a());
            } else if ((dqzkVar.b != 4 || !((Boolean) dqzkVar.c).booleanValue()) && z) {
                ajng d8 = ajnh.d();
                dqzi dqziVar9 = dqzkVar.d;
                if (dqziVar9 == null) {
                    dqziVar9 = dqzi.c;
                }
                ((ajka) d8).a = eaow.e(dqziVar9.b);
                d8.c(dqym.REPORTING_RULE_DEVICE_STILL);
                F.g(d8.a());
            }
            i7++;
            i6 = 1;
        }
        ajnf k3 = ajni.k();
        if (i2 == null) {
            throw new NullPointerException("Null accounts");
        }
        ajjy ajjyVar = (ajjy) k3;
        ajjyVar.c = i2;
        ajjyVar.d = Boolean.valueOf(h() != 1);
        ajjyVar.e = Boolean.valueOf(f().O);
        dkof dkofVar = f().q;
        if (dkofVar == null) {
            dkofVar = dkof.s;
        }
        ajjyVar.f = Boolean.valueOf(!dkofVar.q);
        dqyy dqyyVar = f().M;
        if (dqyyVar == null) {
            dqyyVar = dqyy.c;
        }
        if (dqyyVar == null) {
            throw new NullPointerException("Null locationCollectionParameters");
        }
        ajjyVar.h = dqyyVar;
        dqza dqzaVar = f().J;
        if (dqzaVar == null) {
            dqzaVar = dqza.c;
        }
        if (dqzaVar == null) {
            throw new NullPointerException("Null locationQualityRequirements");
        }
        ajjyVar.i = dqzaVar;
        dqzg dqzgVar = f().N;
        if (dqzgVar == null) {
            dqzgVar = dqzg.c;
        }
        if (dqzgVar == null) {
            throw new NullPointerException("Null locationUploadParameters");
        }
        ajjyVar.j = dqzgVar;
        dcdc f = F.f();
        eaow d9 = eaow.d(f().p);
        HashSet hashSet = new HashSet();
        dbsg dbsgVar3 = dbpy.a;
        dbsg<eapd> dbsgVar4 = dbpy.a;
        int size2 = f.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ajnh ajnhVar = (ajnh) f.get(i10);
            if (!ajnf.c(ajnhVar.a(), dcep.B(ajnhVar.b())).a()) {
                if (!dbsgVar3.a() || ajnhVar.a().q((eapq) dbsgVar3.b())) {
                    dbsgVar3 = dbsg.i(ajnhVar.a());
                    dbsgVar4 = ajnhVar.c();
                    hashSet.clear();
                    hashSet.add(ajnhVar.b());
                } else if (((eaow) dbsgVar3.b()).equals(ajnhVar.a())) {
                    hashSet.add(ajnhVar.b());
                    if (dbsgVar4.a() && ajnhVar.c().a()) {
                        dbsgVar4 = dbsg.i((eapd) dcln.a.k(dbsgVar4.b(), ajnhVar.c().b()));
                    } else if (ajnhVar.c().a()) {
                        dbsgVar4 = ajnhVar.c();
                    }
                }
            }
        }
        if (k3.a().isEmpty() || hashSet.isEmpty() || !dbsgVar3.a()) {
            return dbpy.a;
        }
        if (ajnf.c((eaow) dbsgVar3.b(), dcep.K(hashSet)).a()) {
            return dbpy.a;
        }
        eapd e4 = eapdVar.f(eaow.e(eapdVar.a % d9.b)).e(d9);
        eaow l = d9.l(2L);
        if (new eaow(eapdVar, e4).q(l)) {
            e4 = e4.e(l);
        }
        if (dbsgVar4.a()) {
            e4 = (eapd) dcln.a.k(dbsgVar4.b(), e4);
        }
        eaow eaowVar = (eaow) dbsgVar3.b();
        if (eaowVar == null) {
            throw new NullPointerException("Null durationBetweenCollections");
        }
        ajjyVar.a = eaowVar;
        if (e4 == null) {
            throw new NullPointerException("Null expiration");
        }
        ajjyVar.b = e4;
        dcep<dqym> K = dcep.K(hashSet);
        if (K == null) {
            throw new NullPointerException("Null collectionReasons");
        }
        ajjyVar.g = K;
        dbsk.m(!k3.a().isEmpty(), "Must have a reporting account");
        dbsk.m(!k3.b().isEmpty(), "Justifications not specified");
        eaow eaowVar2 = ajjyVar.a;
        if (eaowVar2 == null) {
            throw new IllegalStateException("Property \"durationBetweenCollections\" has not been set");
        }
        dbsg<RuntimeException> c2 = ajnf.c(eaowVar2, k3.b());
        if (c2.a()) {
            throw c2.b();
        }
        String str = ajjyVar.a == null ? " durationBetweenCollections" : "";
        if (ajjyVar.b == null) {
            str = str.concat(" expiration");
        }
        if (ajjyVar.c == null) {
            str = String.valueOf(str).concat(" accounts");
        }
        if (ajjyVar.d == null) {
            str = String.valueOf(str).concat(" useForegroundService");
        }
        if (ajjyVar.e == null) {
            str = String.valueOf(str).concat(" usePeriodicCollectionTask");
        }
        if (ajjyVar.f == null) {
            str = String.valueOf(str).concat(" checkInternetConnectivityBeforeReporting");
        }
        if (ajjyVar.g == null) {
            str = String.valueOf(str).concat(" collectionReasons");
        }
        if (ajjyVar.h == null) {
            str = String.valueOf(str).concat(" locationCollectionParameters");
        }
        if (ajjyVar.i == null) {
            str = String.valueOf(str).concat(" locationQualityRequirements");
        }
        if (ajjyVar.j == null) {
            str = String.valueOf(str).concat(" locationUploadParameters");
        }
        if (str.isEmpty()) {
            return dbsg.i(new ajjz(ajjyVar.a, ajjyVar.b, ajjyVar.c, ajjyVar.d.booleanValue(), ajjyVar.e.booleanValue(), ajjyVar.f.booleanValue(), ajjyVar.g, ajjyVar.h, ajjyVar.i, ajjyVar.j));
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }
}
