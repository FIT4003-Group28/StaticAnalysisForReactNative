package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: trn  reason: default package */
/* loaded from: classes7.dex */
public class trn implements trd {
    private static final dcqe b = dcqe.c("trn");
    private static final dcdn<tnz, Integer> c;
    private static final dcdn<tnz, Integer> d;
    private static final dcdn<tnz, ddho> e;
    private static final dcdn<tob, Integer> f;
    private static final dcdn<tob, ddho> g;
    private static final dcdn<drsm, Integer> h;
    private static final dcdn<drsm, ddho> i;
    public final tof a;
    private final Activity j;
    private final trj k;
    private final toi l;
    private final btlu m;
    private final tog n;
    private final trh<tnz> o;
    private final trh<tob> p;
    private final trh<drsm> q;
    private trb r;
    private trb s;
    private trb t;

    static {
        dcdg p = dcdn.p();
        p.f(tnz.BICYCLE, Integer.valueOf(ssv.PREFERENCES_PREFERRED_MODE_BICYCLE));
        p.f(tnz.BIKESHARING, Integer.valueOf(ssv.PREFERENCES_PREFERRED_MODE_BIKESHARING));
        p.f(tnz.BUS, Integer.valueOf(ssv.PREFERENCES_PREFERRED_MODE_BUS));
        p.f(tnz.DRIVE, Integer.valueOf(ssv.PREFERENCES_PREFERRED_MODE_DRIVE));
        p.f(tnz.FERRY, Integer.valueOf(ssv.PREFERENCES_PREFERRED_MODE_FERRY));
        p.f(tnz.FLY, Integer.valueOf(ssv.PREFERENCES_PREFERRED_MODE_FLY));
        p.f(tnz.RAIL, Integer.valueOf(ssv.PREFERENCES_PREFERRED_MODE_RAIL));
        p.f(tnz.SUBWAY, Integer.valueOf(ssv.PREFERENCES_PREFERRED_MODE_SUBWAY));
        p.f(tnz.TAXI, Integer.valueOf(ssv.PREFERENCES_PREFERRED_MODE_TAXI));
        p.f(tnz.TRAIN, Integer.valueOf(ssv.PREFERENCES_PREFERRED_MODE_TRAIN));
        p.f(tnz.TRAM, Integer.valueOf(ssv.PREFERENCES_PREFERRED_MODE_TRAM));
        p.f(tnz.TWO_WHEELER, Integer.valueOf(ssv.PREFERENCES_PREFERRED_MODE_TWO_WHEELER));
        p.f(tnz.WALK, Integer.valueOf(ssv.PREFERENCES_PREFERRED_MODE_WALK));
        c = p.b();
        dcdg p2 = dcdn.p();
        p2.f(tnz.DRIVE, 2131232231);
        p2.f(tnz.WALK, 2131232237);
        p2.f(tnz.RAIL, 2131232452);
        p2.f(tnz.BUS, 2131232227);
        p2.f(tnz.FERRY, 2131232226);
        p2.f(tnz.TWO_WHEELER, 2131231606);
        p2.f(tnz.BICYCLE, 2131232224);
        p2.f(tnz.BIKESHARING, 2131232224);
        p2.f(tnz.TAXI, 2131232283);
        d = p2.b();
        dcdg p3 = dcdn.p();
        p3.f(tnz.BICYCLE, dtya.ez);
        p3.f(tnz.BIKESHARING, dtya.eA);
        p3.f(tnz.BUS, dtya.eL);
        p3.f(tnz.DRIVE, dtya.eD);
        p3.f(tnz.FERRY, dtya.eM);
        p3.f(tnz.RAIL, dtya.eP);
        p3.f(tnz.SUBWAY, dtya.eO);
        p3.f(tnz.TAXI, dtya.eE);
        p3.f(tnz.TRAIN, dtya.eP);
        p3.f(tnz.TRAM, dtya.eQ);
        p3.f(tnz.TWO_WHEELER, dtya.eF);
        p3.f(tnz.WALK, dtya.eG);
        e = p3.b();
        dcdg p4 = dcdn.p();
        p4.f(tob.AVOID_TOLLS, Integer.valueOf(ssv.PREFERENCES_ROUTE_OPTION_AVOID_TOLLS));
        p4.f(tob.AVOID_HIGHWAYS, Integer.valueOf(ssv.PREFERENCES_ROUTE_OPTION_AVOID_HIGHWAYS));
        p4.f(tob.AVOID_FERRIES, Integer.valueOf(ssv.PREFERENCES_ROUTE_OPTION_AVOID_FERRIES));
        p4.f(tob.WHEELCHAIR_ACCESSIBLE, Integer.valueOf(ssv.PREFERENCES_ROUTE_OPTION_WHEELCHAIR_ACCESSIBLE));
        f = p4.b();
        dcdg p5 = dcdn.p();
        p5.f(tob.AVOID_TOLLS, dtya.eq);
        p5.f(tob.AVOID_HIGHWAYS, dtya.eo);
        p5.f(tob.AVOID_FERRIES, dtya.en);
        p5.f(tob.WHEELCHAIR_ACCESSIBLE, dtya.eH);
        g = p5.b();
        dcdg p6 = dcdn.p();
        p6.f(drsm.DRIVE, Integer.valueOf((int) R.string.DIRECTIONS_TRANSIT_OPTIONS_CONNECTING_MODES_CAR));
        p6.f(drsm.TWO_WHEELER, Integer.valueOf((int) R.string.DIRECTIONS_TRANSIT_OPTIONS_CONNECTING_MODES_TWO_WHEELER));
        p6.f(drsm.BICYCLE, Integer.valueOf((int) R.string.DIRECTIONS_TRANSIT_OPTIONS_CONNECTING_MODES_BICYCLE));
        p6.f(drsm.ONLINE_TAXI, Integer.valueOf((int) R.string.DIRECTIONS_TRANSIT_OPTIONS_CONNECTING_MODES_RIDESHARING));
        p6.f(drsm.OFFLINE_TAXI, Integer.valueOf((int) R.string.DIRECTIONS_TRANSIT_OPTIONS_CONNECTING_MODES_RICKSHAW));
        h = p6.b();
        dcdg p7 = dcdn.p();
        p7.f(drsm.DRIVE, dtya.eu);
        p7.f(drsm.TWO_WHEELER, dtya.ey);
        p7.f(drsm.BICYCLE, dtya.ev);
        p7.f(drsm.ONLINE_TAXI, dtya.et);
        p7.f(drsm.OFFLINE_TAXI, dtya.ew);
        i = p7.b();
    }

    public trn(Activity activity, trj trjVar, toh tohVar, toi toiVar, tnv tnvVar, cqhn cqhnVar, btlu btluVar) {
        this.j = activity;
        this.k = trjVar;
        this.l = toiVar;
        this.m = btluVar;
        tog l = tohVar.a(btluVar).l();
        dbsk.s(l);
        this.n = l;
        final tof d2 = l.d();
        this.a = d2;
        d2.getClass();
        this.o = new trh(d2) { // from class: trk
            private final tof a;

            {
                this.a = d2;
            }

            @Override // defpackage.trh
            public final void a(Object obj, Boolean bool) {
                tof tofVar = this.a;
                tnz tnzVar = (tnz) obj;
                boolean booleanValue = bool.booleanValue();
                int ordinal = tnzVar.ordinal();
                if (ordinal != 3 && ordinal != 4 && ordinal != 5 && ordinal != 6) {
                    tofVar.h(tnzVar, booleanValue);
                    return;
                }
                tofVar.h(tnz.RAIL, booleanValue);
                tofVar.h(tnz.TRAIN, booleanValue);
                tofVar.h(tnz.TRAM, booleanValue);
                tofVar.h(tnz.SUBWAY, booleanValue);
            }
        };
        d2.getClass();
        this.p = new trh(d2) { // from class: trl
            private final tof a;

            {
                this.a = d2;
            }

            @Override // defpackage.trh
            public final void a(Object obj, Boolean bool) {
                this.a.i((tob) obj, bool.booleanValue());
            }
        };
        this.q = new trh(this) { // from class: trm
            private final trn a;

            {
                this.a = this;
            }

            @Override // defpackage.trh
            public final void a(Object obj, Boolean bool) {
                dcep<drsm> K;
                drsm drsmVar = (drsm) obj;
                tof tofVar = this.a.a;
                if (!bool.booleanValue()) {
                    dcen N = dcep.N();
                    N.i(tofVar.c());
                    N.b(drsmVar);
                    K = N.f();
                } else {
                    K = dcep.K(dbze.a(tofVar.c(), new dbsl(drsmVar) { // from class: tod
                        private final drsm a;

                        {
                            this.a = drsmVar;
                        }

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj2) {
                            return !dbsd.a((drsm) obj2, this.a);
                        }
                    }));
                }
                tofVar.g(K);
            }
        };
    }

    private final trg f() {
        cqtd f2;
        dccx F = dcdc.F();
        dcdc<tnz> dcdcVar = ton.a;
        int size = dcdcVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            tnz tnzVar = dcdcVar.get(i2);
            trj trjVar = this.k;
            boolean contains = this.n.a().contains(tnzVar);
            CharSequence i3 = i(tnzVar);
            Integer num = d.get(tnzVar);
            if (num == null) {
                bvoo.h("Attempted to get icon for invalid preferred mode.", new Object[0]);
                f2 = null;
            } else {
                f2 = cqrt.f(num.intValue());
            }
            F.g(trjVar.a(tnzVar, contains, i3, null, f2, k(tnzVar, e), this.o));
        }
        return new trg(this.j.getString(ssv.PREFERENCES_PREFERRED_MODES_GROUP_TITLE), F.f(), this.j.getString(ssv.PREFERENCES_PREFERRED_MODES_GROUP_SUBTITLE), cqrt.f(2131232565), true);
    }

    private final trb g() {
        String string;
        dccx F = dcdc.F();
        dcdc<tob> dcdcVar = ton.b;
        int size = dcdcVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            tob tobVar = dcdcVar.get(i2);
            trj trjVar = this.k;
            boolean contains = this.n.b().contains(tobVar);
            Integer num = f.get(tobVar);
            if (num == null) {
                bvoo.h("Attempted to get label for invalid route option.", new Object[0]);
                string = "";
            } else {
                string = this.j.getString(num.intValue());
            }
            F.g(trjVar.a(tobVar, contains, string, j(tobVar), null, k(tobVar, g), this.p));
        }
        return new trg(this.j.getString(ssv.PREFERENCES_ROUTE_OPTIONS_GROUP_TITLE), F.f(), null, iup.e(R.raw.ic_alternate_route), false);
    }

    private final trb h() {
        String string;
        dccx F = dcdc.F();
        dcdc<drsm> dcdcVar = ton.c;
        int size = dcdcVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            drsm drsmVar = dcdcVar.get(i2);
            trj trjVar = this.k;
            boolean z = !this.n.c().contains(drsmVar);
            Integer num = h.get(drsmVar);
            if (num == null) {
                bvoo.h("Attempted to get label for invalid connecting non-transit mode.", new Object[0]);
                string = "";
            } else {
                string = this.j.getString(num.intValue());
            }
            F.g(trjVar.a(drsmVar, z, string, null, null, k(drsmVar, i), this.q));
        }
        return new trg(this.j.getString(ssv.PREFERENCES_CONNECTING_MODES_GROUP_TITLE), F.f(), this.j.getString(ssv.PREFERENCES_CONNECTING_MODES_GROUP_SUBTITLE), cqrt.f(2131232214), false);
    }

    private final CharSequence i(tnz tnzVar) {
        if (tnzVar == tnz.RAIL) {
            Activity activity = this.j;
            return stf.b(activity, activity.getString(ssv.PREFERENCES_PREFERRED_MODE_TRAIN), this.j.getString(ssv.PREFERENCES_PREFERRED_MODE_RAIL));
        }
        Integer num = c.get(tnzVar);
        if (num == null) {
            bvoo.h("Attempted to get label for invalid preferred mode.", new Object[0]);
            return "";
        }
        return this.j.getString(num.intValue());
    }

    @dzsi
    private final CharSequence j(tob tobVar) {
        if (tobVar == tob.AVOID_FERRIES) {
            return this.j.getString(ssv.AVOID_FERRIES_PREFERENCE_ITEM_DESCRIPTION);
        }
        return null;
    }

    @dzsi
    private static <T> cjtd k(T t, dcdn<T, ddho> dcdnVar) {
        if (!dcdnVar.containsKey(t)) {
            return null;
        }
        return cjtd.a(dcdnVar.get(t));
    }

    @Override // defpackage.trd
    public trb a() {
        if (this.r == null) {
            this.r = f();
        }
        return this.r;
    }

    @Override // defpackage.trd
    public trb b() {
        if (this.s == null) {
            this.s = g();
        }
        return this.s;
    }

    @Override // defpackage.trd
    public trb c() {
        if (this.t == null) {
            this.t = h();
        }
        return this.t;
    }

    @Override // defpackage.trd
    @dzsi
    public tra d() {
        return null;
    }

    public cqkl e() {
        this.l.b(this.m, this.a.d());
        return cqkl.a;
    }
}
