package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: brwg  reason: default package */
/* loaded from: classes4.dex */
public class brwg implements bruv {
    private static final dcdn<dghs, bsqm> h;
    public final btvo c;
    public final boolean d;
    public int e;
    public dcdn<dghs, brvb> f;
    private final Map<dghs, brva> i;
    private final bmom j;
    private final brrv k;
    private final jba l;
    private dcdc<brvb> m;
    @dzsi
    private bwrs<ilo> n;
    @dzsi
    private cjtd o;
    private static final dcdc<dghs> g = dcdc.l(dghs.CALL, dghs.DIRECTIONS, dghs.ADD_STOP, dghs.ADD_PARKING, dghs.SAVE, dghs.SHARE, dghs.SEE_ON_MAP);
    public static final dcep<Integer> a = dcep.G(2, 9, 8, 0, 11, 10, new Integer[0]);
    public static final dcep<Integer> b = dcep.D(2, 0, 11);

    static {
        dcdg p = dcdn.p();
        p.f(dghs.CALL, bsqm.b(dtyb.aS, dtyb.bb));
        p.f(dghs.ADD_STOP, bsqm.b(dtyb.aR, dtyb.aQ));
        p.f(dghs.DIRECTIONS, bsqm.b(dtyb.aT, dtyb.bc));
        p.f(dghs.SAVE, bsqm.a(dtyb.aW));
        p.f(dghs.SHARE, bsqm.a(dtyb.aY));
        p.f(dghs.ADD_PARKING, bsqm.a(dtyb.be));
        p.f(dghs.SEE_ON_MAP, bsqm.a(dtyb.aX));
        h = p.b();
    }

    public brwg(Map<dghs, brva> map, btvo btvoVar, bmom bmomVar, boolean z, int i, jba jbaVar, @dzsi bnhz bnhzVar) {
        this.i = map;
        this.c = btvoVar;
        this.j = bmomVar;
        this.d = z;
        this.e = i;
        this.l = jbaVar;
        brru c = brrv.c();
        c.c(null);
        this.k = c.a();
        this.m = dcdc.e();
        this.f = dcmn.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.dcdn<defpackage.dghs, defpackage.brvb> h() {
        /*
            r9 = this;
            dcdg r0 = defpackage.dcdn.p()
            dcdn<dghs, bsqm> r1 = defpackage.brwg.h
            dcep r1 = r1.keySet()
            dcpd r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La8
            java.lang.Object r2 = r1.next()
            dghs r2 = (defpackage.dghs) r2
            java.util.Map<dghs, brva> r3 = r9.i
            java.lang.Object r3 = r3.get(r2)
            brva r3 = (defpackage.brva) r3
            if (r3 == 0) goto L92
            jba r4 = r9.l
            brrs r5 = defpackage.brrx.j()
            r5.b(r2)
            brrv r6 = r9.k
            r5.c(r6)
            brrw r6 = defpackage.brrw.CATEGORICAL_SEARCH_LIST
            r5.f(r6)
            int r6 = r9.e
            if (r6 == 0) goto L4f
            r7 = 2
            if (r6 == r7) goto L4c
            r7 = 9
            if (r6 == r7) goto L49
            r7 = 11
            if (r6 == r7) goto L4f
            ddhb r6 = defpackage.ddhb.UNKNOWN
            goto L51
        L49:
            ddhb r6 = defpackage.ddhb.PARKING
            goto L51
        L4c:
            ddhb r6 = defpackage.ddhb.HOTEL
            goto L51
        L4f:
            ddhb r6 = defpackage.ddhb.DINING
        L51:
            ddhc r7 = defpackage.ddhc.b
            dsqp r7 = r7.bZ()
            ddgz r7 = (defpackage.ddgz) r7
            r7.a(r6)
            dsqw r6 = r7.bK()
            ddhc r6 = (defpackage.ddhc) r6
            dbsg r6 = defpackage.dbsg.i(r6)
            r7 = r5
            brry r7 = (defpackage.brry) r7
            r7.b = r6
            dcdn<dghs, bsqm> r6 = defpackage.brwg.h
            java.lang.Object r6 = r6.get(r2)
            bsqm r6 = (defpackage.bsqm) r6
            if (r6 == 0) goto L85
            jba r8 = r9.l
            java.lang.Boolean r8 = r8.L()
            boolean r8 = r8.booleanValue()
            ddho r6 = r6.c(r8)
            r7.a = r6
        L85:
            brrx r5 = r5.a()
            brvb r3 = r3.a(r4, r5)
            r0.f(r2, r3)
            goto Le
        L92:
            bvon r3 = new bvon
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            java.lang.String r2 = r2.name()
            r4[r5] = r2
            java.lang.String r2 = "Factory is not provided for PlaceActionType: %s"
            r3.<init>(r2, r4)
            defpackage.bvoo.j(r3)
            goto Le
        La8:
            dcdn r0 = r0.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brwg.h():dcdn");
    }

    private final dcdc<brvb> i() {
        if (this.f.isEmpty()) {
            this.f = h();
        }
        return dcbg.b(g).o(new dbsl(this) { // from class: brwe
            private final brwg a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                ilo f;
                brwg brwgVar = this.a;
                dghs dghsVar = (dghs) obj;
                brvb brvbVar = brwgVar.f.get(dghsVar);
                if (brvbVar != null) {
                    dghs dghsVar2 = dghs.UNKNOWN_ACTION_TYPE;
                    int ordinal = dghsVar.ordinal();
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return brwgVar.d || brvbVar.d().booleanValue();
                        } else if (ordinal == 8) {
                            boolean z = !brwgVar.d && (brwgVar.g(3) || !brwg.a.contains(Integer.valueOf(brwgVar.e))) && ((f = brwgVar.f()) == null || f.T(dnwv.CALL_BUSINESS) == null);
                            if (brwgVar.e != 11 ? z : !brwgVar.c.getCategoricalSearchParameters().A() && z) {
                                if (brvbVar.d().booleanValue()) {
                                    return true;
                                }
                            }
                        } else if (ordinal != 17) {
                            switch (ordinal) {
                                case 10:
                                    if (brwgVar.e == 9 && brvbVar.d().booleanValue()) {
                                        return true;
                                    }
                                    break;
                                case 11:
                                    if (!brwgVar.d && brwgVar.g(5) && brvbVar.d().booleanValue()) {
                                        return true;
                                    }
                                    break;
                                case 12:
                                    if (!brwgVar.d && brwgVar.g(2) && brvbVar.d().booleanValue()) {
                                        return true;
                                    }
                                    break;
                            }
                        } else if (brwgVar.g(7) && brvbVar.d().booleanValue()) {
                            return true;
                        }
                    } else if (!brwgVar.d && ((brwgVar.g(4) || !brwg.b.contains(Integer.valueOf(brwgVar.e))) && brvbVar.d().booleanValue())) {
                        return true;
                    }
                }
                return false;
            }
        }).s(new dbrn(this) { // from class: brwf
            private final brwg a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                brvb brvbVar = this.a.f.get((dghs) obj);
                dbsk.s(brvbVar);
                return brvbVar;
            }
        }).z();
    }

    @Override // defpackage.bruv
    public List<brvb> a() {
        ilo f = f();
        if (f == null || !f.an()) {
            if (this.m.isEmpty()) {
                this.m = i();
            }
            return this.m;
        }
        return dcdc.e();
    }

    @Override // defpackage.bruv
    public cjtd b() {
        cjta c = cjtd.c(this.o);
        c.d = dtxy.dd;
        return c.a();
    }

    @Override // defpackage.bruv
    public Boolean c(ckgz ckgzVar) {
        return Boolean.valueOf(this.j.a(ckgzVar, f()));
    }

    public void d(int i) {
        this.e = i;
        this.m = i();
    }

    public void e(bwrs<ilo> bwrsVar) {
        this.n = bwrsVar;
        if (this.f.isEmpty()) {
            this.f = h();
        }
        dcpd<brvb> it = this.f.values().iterator();
        while (it.hasNext()) {
            it.next().i(bwrsVar);
        }
        this.m = i();
        ilo c = bwrsVar.c();
        this.o = c != null ? c.bZ() : null;
    }

    @dzsi
    public final ilo f() {
        bwrs<ilo> bwrsVar = this.n;
        if (bwrsVar != null) {
            return bwrsVar.c();
        }
        return null;
    }

    public final boolean g(int i) {
        int i2 = this.e;
        boolean z = true;
        if (i2 != 0) {
            if (i2 == 2) {
                int G = this.c.getCategoricalSearchParameters().G();
                if (G != i) {
                    z = false;
                }
                if (G == 0) {
                    throw null;
                }
                return z;
            } else if (i2 != 11) {
                return false;
            }
        }
        int F = this.c.getCategoricalSearchParameters().F();
        if (F != i) {
            z = false;
        }
        if (F != 0) {
            return z;
        }
        throw null;
    }
}
