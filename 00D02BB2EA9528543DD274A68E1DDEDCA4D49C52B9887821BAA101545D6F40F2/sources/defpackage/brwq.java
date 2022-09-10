package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: brwq  reason: default package */
/* loaded from: classes4.dex */
public class brwq implements bruv {
    public static final dcep<dghs> e;
    private static final dcdn<dghs, bsqm> m;
    public final btvo f;
    public final boolean g;
    public int h;
    public boolean i;
    public dcdn<dghs, brvb> j;
    private final Map<dghs, brva> n;
    private final bmom o;
    private final brrv p;
    private final jba q;
    private dcdc<brvb> r;
    @dzsi
    private bwrs<ilo> s;
    @dzsi
    private cjtd t;
    private static final dcqe k = dcqe.c("brwq");
    private static final dcdc<dghs> l = dcdc.o(dghs.DIRECTIONS, dghs.ADD_STOP, dghs.BOOK, dghs.ORDER_FOOD, dghs.RESTAURANT_RESERVATION, dghs.APPOINTMENT, dghs.CALL, dghs.ADD_PARKING, dghs.SAVE, dghs.SHARE, dghs.SEARCH_RESULT_MORE_INFO);
    public static final dcep<Integer> a = dcep.F(9, 8, 3, 1, 4);
    public static final dcep<Integer> b = dcep.B(10);
    public static final dcep<Integer> c = dcep.B(11);
    public static final dcep<dghs> d = dcep.C(dghs.DIRECTIONS, dghs.ADD_STOP);

    static {
        dcep.D(dghs.DIRECTIONS, dghs.ADD_STOP, dghs.BOOK);
        e = dcep.C(dghs.ORDER_FOOD, dghs.RESTAURANT_RESERVATION);
        dcdg p = dcdn.p();
        p.f(dghs.CALL, bsqm.b(dtyb.bR, dtyb.bJ));
        p.f(dghs.ADD_STOP, bsqm.b(dtyb.bP, dtyb.bH));
        p.f(dghs.DIRECTIONS, bsqm.b(dtyb.bS, dtyb.bK));
        p.f(dghs.SAVE, bsqm.a(dtyb.bX));
        p.f(dghs.ORDER_FOOD, bsqm.a(dtyb.bU));
        p.f(dghs.APPOINTMENT, bsqm.a(dtyb.bQ));
        p.f(dghs.RESTAURANT_RESERVATION, bsqm.a(dtyb.bW));
        p.f(dghs.SHARE, bsqm.a(dtyb.bZ));
        p.f(dghs.ADD_PARKING, bsqm.a(dtyb.bO));
        p.f(dghs.BOOK, bsqm.a(dtyb.bT));
        p.f(dghs.SEARCH_RESULT_MORE_INFO, bsqm.a(dtyb.bY));
        m = p.b();
    }

    public brwq(Map<dghs, brva> map, btvo btvoVar, bmom bmomVar, boolean z, int i, jba jbaVar, @dzsi bnhz bnhzVar) {
        this.n = map;
        this.f = btvoVar;
        this.o = bmomVar;
        this.g = z;
        this.h = i;
        this.q = jbaVar;
        brru c2 = brrv.c();
        c2.c(bnhzVar);
        this.p = c2.a();
        this.r = dcdc.e();
        this.j = dcmn.a;
    }

    private final dcdn<dghs, brvb> g() {
        dcdg p = dcdn.p();
        dcpd<dghs> it = m.keySet().iterator();
        while (it.hasNext()) {
            dghs next = it.next();
            brva brvaVar = this.n.get(next);
            if (brvaVar != null) {
                p.f(next, brvaVar.a(this.q, f(next)));
            } else {
                bvoo.j(new bvon("Factory is not provided for PlaceActionType: %s", next.name()));
            }
        }
        return p.b();
    }

    private final dcdc<brvb> h() {
        this.i = false;
        if (this.j.isEmpty()) {
            this.j = g();
        }
        return dcbg.b(l).o(new dbsl(this) { // from class: brwo
            private final brwq a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                brwq brwqVar = this.a;
                dghs dghsVar = (dghs) obj;
                brvb brvbVar = brwqVar.j.get(dghsVar);
                if (brvbVar != null) {
                    dghs dghsVar2 = dghs.UNKNOWN_ACTION_TYPE;
                    int ordinal = dghsVar.ordinal();
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return brwqVar.g || brvbVar.d().booleanValue();
                        } else if (ordinal != 7) {
                            if (ordinal != 8) {
                                if (ordinal != 22) {
                                    switch (ordinal) {
                                        case 10:
                                            if (brwqVar.h == 9 && brvbVar.d().booleanValue()) {
                                                return true;
                                            }
                                            break;
                                        case 11:
                                            if (!brwqVar.g && brwq.a.contains(Integer.valueOf(brwqVar.h)) && brvbVar.d().booleanValue()) {
                                                return true;
                                            }
                                            break;
                                        case 12:
                                            if (!brwqVar.g && !brwq.a.contains(Integer.valueOf(brwqVar.h)) && brvbVar.d().booleanValue()) {
                                                return true;
                                            }
                                            break;
                                        default:
                                            return brvbVar.d().booleanValue();
                                    }
                                } else if (brwqVar.h == 10 && brvbVar.d().booleanValue()) {
                                    return true;
                                }
                            } else if (!brwq.b.contains(Integer.valueOf(brwqVar.h))) {
                                if (brwqVar.h == 11 && brwqVar.f.getCategoricalSearchParameters().A()) {
                                    dcpd<dghs> it = brwq.e.iterator();
                                    while (it.hasNext()) {
                                        brvb brvbVar2 = brwqVar.j.get(it.next());
                                        if (brvbVar2 == null || !brvbVar2.d().booleanValue()) {
                                        }
                                    }
                                }
                                return brvbVar.d().booleanValue();
                            }
                        } else if (brwqVar.h == 2 && brvbVar.d().booleanValue()) {
                            return true;
                        }
                    } else if (!brwqVar.g && !brwq.c.contains(Integer.valueOf(brwqVar.h)) && brvbVar.d().booleanValue()) {
                        return true;
                    }
                }
                return false;
            }
        }).s(new dbrn(this) { // from class: brwp
            private final brwq a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                brwq brwqVar = this.a;
                dghs dghsVar = (dghs) obj;
                brvb brvbVar = brwqVar.j.get(dghsVar);
                dbsk.s(brvbVar);
                if (brwq.d.contains(dghsVar)) {
                    brrs i = brwqVar.f(dghsVar).i();
                    boolean z = true;
                    if (!brwq.d.contains(dghsVar) || brwqVar.i) {
                        z = false;
                    } else {
                        brwqVar.i = true;
                    }
                    i.d(z);
                    brvbVar.j(i.a());
                }
                return brvbVar;
            }
        }).z();
    }

    @dzsi
    private final ilo i() {
        bwrs<ilo> bwrsVar = this.s;
        if (bwrsVar != null) {
            return bwrsVar.c();
        }
        return null;
    }

    @Override // defpackage.bruv
    public List<brvb> a() {
        ilo i = i();
        if (i == null || !i.an()) {
            if (this.r.isEmpty()) {
                this.r = h();
            }
            return this.r;
        }
        return dcdc.e();
    }

    @Override // defpackage.bruv
    public cjtd b() {
        cjta c2 = cjtd.c(this.t);
        c2.d = dtxy.dd;
        return c2.a();
    }

    @Override // defpackage.bruv
    public Boolean c(ckgz ckgzVar) {
        return Boolean.valueOf(this.o.a(ckgzVar, i()));
    }

    public void d(int i) {
        this.h = i;
        this.r = h();
    }

    public void e(bwrs<ilo> bwrsVar) {
        this.s = bwrsVar;
        if (this.j.isEmpty()) {
            this.j = g();
        }
        dcpd<brvb> it = this.j.values().iterator();
        while (it.hasNext()) {
            it.next().i(bwrsVar);
        }
        this.r = h();
        ilo c2 = bwrsVar.c();
        this.t = c2 != null ? c2.bZ() : null;
    }

    public final brrx f(dghs dghsVar) {
        brrs j = brrx.j();
        j.b(dghsVar);
        j.c(this.p);
        ilo i = i();
        if (i == null || i.cK() != null || (dghsVar != dghs.SAVE && dghsVar != dghs.SHARE)) {
            j.f(brrw.TRAVERSAL);
        } else {
            j.f(brrw.TRAVERSAL_SIDE_SECTION);
        }
        bsqm bsqmVar = m.get(dghsVar);
        if (bsqmVar != null) {
            ((brry) j).a = bsqmVar.c(this.q.L().booleanValue());
        } else {
            bvoo.h("Missing VE Type for Action Button: %s", Integer.valueOf(dghsVar.G));
        }
        return j.a();
    }
}
