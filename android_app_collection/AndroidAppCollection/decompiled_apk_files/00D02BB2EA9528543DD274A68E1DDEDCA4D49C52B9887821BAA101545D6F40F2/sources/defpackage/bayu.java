package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bayu  reason: default package */
/* loaded from: classes3.dex */
public class bayu extends bazi {
    public final axwg a;
    public final dzsj<amfi> c;
    public final dzsj<axwy> d;
    public final dzsj<bvsl> e;
    public final axwq f;
    public final dndr g;
    public final Long h;
    @dzsi
    public final String i;
    @dzsi
    public final String j;
    @dzsi
    public final decq k;
    @dzsi
    public final akqi l;
    @dzsi
    public final akqq m;
    @dzsi
    public final Integer n;
    public final axwu o;

    public bayu(gga ggaVar, axwq axwqVar, bwqv bwqvVar, btrm btrmVar, ania aniaVar, axwg axwgVar, dzsj<amfi> dzsjVar, dzsj<axwy> dzsjVar2, dzsj<bvsl> dzsjVar3, batz batzVar, wdw wdwVar, dxio<wdy> dxioVar, dxio<wdx> dxioVar2, dndr dndrVar, Long l, @dzsi akqi akqiVar, @dzsi String str, @dzsi akqq akqqVar, @dzsi String str2, @dzsi decq decqVar, @dzsi Integer num, axwu axwuVar) {
        super(ggaVar, bwqvVar, btrmVar, aniaVar, batzVar, wdwVar, dxioVar, dxioVar2);
        this.a = axwgVar;
        this.c = dzsjVar;
        this.f = axwqVar;
        this.d = dzsjVar2;
        this.e = dzsjVar3;
        this.g = dndrVar;
        this.h = l;
        this.i = str;
        this.j = str2;
        this.k = decqVar;
        this.l = akqiVar;
        this.m = akqqVar;
        this.n = num;
        this.o = axwuVar;
        if (dndrVar == dndr.WORK) {
            bayh bayhVar = bayh.NONE;
        } else {
            bayh bayhVar2 = bayh.NONE;
        }
    }

    private final boolean B() {
        return !akqi.d(this.l) && this.m != null;
    }

    private final boolean D() {
        return this.g == dndr.HOME || this.g == dndr.WORK;
    }

    @Override // defpackage.bayj
    public String a() {
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        int ordinal = this.g.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return this.t.getString(R.string.WORK_LOCATION);
            }
            return ordinal != 4 ? "" : dbsj.e(this.j);
        }
        return this.t.getString(R.string.HOME_LOCATION);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    @Override // defpackage.bayj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.jic c() {
        /*
            r7 = this;
            boolean r0 = r7.x()
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = r1
            goto L2b
        L9:
            decq r0 = r7.k
            defpackage.dbsk.s(r0)
            java.lang.String r0 = defpackage.bhzs.a(r0)
            java.lang.Class<bayu> r2 = defpackage.bayu.class
            java.lang.String r2 = r2.getName()
            dzsj<amfi> r3 = r7.c
            java.lang.Object r3 = r3.a()
            amfi r3 = (defpackage.amfi) r3
            amfu r0 = r3.h(r0, r2, r1)
            if (r0 != 0) goto L27
            goto L7
        L27:
            cqtd r0 = r0.j()
        L2b:
            jic r2 = new jic
            ckqc r3 = defpackage.ckqc.FULLY_QUALIFIED
            if (r0 == 0) goto L32
            goto L79
        L32:
            axwg r0 = r7.a
            boolean r0 = r0.f()
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L5c
            dndr r0 = r7.g
            baab r6 = defpackage.baab.FAVORITES
            int r0 = r0.ordinal()
            if (r0 == r5) goto L50
            if (r0 == r4) goto L4c
            r0 = 2131231394(0x7f0802a2, float:1.8078868E38)
            goto L53
        L4c:
            r0 = 2131232467(0x7f0806d3, float:1.8081044E38)
            goto L53
        L50:
            r0 = 2131232292(0x7f080624, float:1.808069E38)
        L53:
            cqss r4 = defpackage.ibm.x()
            cqtd r0 = defpackage.cqrt.g(r0, r4)
            goto L79
        L5c:
            dndr r0 = r7.g
            int r0 = r0.ordinal()
            if (r0 == r5) goto L6e
            if (r0 == r4) goto L6a
            r0 = 2131231285(0x7f080235, float:1.8078647E38)
            goto L71
        L6a:
            r0 = 2131231777(0x7f080421, float:1.8079645E38)
            goto L71
        L6e:
            r0 = 2131231654(0x7f0803a6, float:1.8079395E38)
        L71:
            cqss r4 = defpackage.ibm.x()
            cqtd r0 = defpackage.cqrt.g(r0, r4)
        L79:
            r4 = 0
            r2.<init>(r1, r3, r0, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bayu.c():jic");
    }

    @Override // defpackage.bayj
    public String d() {
        return this.t.getString(R.string.YOUR_PLACES_NICKNAMED_PLACES);
    }

    @Override // defpackage.bayj
    @dzsi
    public ilo f() {
        ilo a = batz.a(this.i, this.l, this.m);
        if (a != null) {
            dndi bZ = dndj.e.bZ();
            dndk bZ2 = dndl.d.bZ();
            dndr dndrVar = this.g;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dndl dndlVar = (dndl) bZ2.b;
            dndlVar.b = dndrVar.h;
            dndlVar.a |= 1;
            String l = this.h.toString();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dndl dndlVar2 = (dndl) bZ2.b;
            l.getClass();
            dndlVar2.a |= 2;
            dndlVar2.c = l;
            dndl bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dndj dndjVar = (dndj) bZ.b;
            bK.getClass();
            dndjVar.b = bK;
            dndjVar.a |= 1;
            dndj bK2 = bZ.bK();
            dvyw h = a.h();
            dsqp dsqpVar = (dsqp) h.cu(5);
            dsqpVar.bC(h);
            dvya dvyaVar = (dvya) dsqpVar;
            dndm bZ3 = dndn.c.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dndn dndnVar = (dndn) bZ3.b;
            bK2.getClass();
            dndnVar.b = bK2;
            dndnVar.a |= 1;
            dndn bK3 = bZ3.bK();
            if (dvyaVar.c) {
                dvyaVar.bF();
                dvyaVar.c = false;
            }
            dvyw dvywVar = (dvyw) dvyaVar.b;
            dvyw dvywVar2 = dvyw.bv;
            bK3.getClass();
            dvywVar.ah = bK3;
            dvywVar.b |= 4194304;
            String e = dbsj.e(this.i);
            if (dvyaVar.c) {
                dvyaVar.bF();
                dvyaVar.c = false;
            }
            dvyw dvywVar3 = (dvyw) dvyaVar.b;
            e.getClass();
            dvywVar3.a |= 1024;
            dvywVar3.p = e;
            ily g = a.g();
            g.E(dvyaVar.bK());
            return g.d();
        }
        return null;
    }

    @Override // defpackage.bayj
    public cjtd g() {
        if (A().booleanValue()) {
            dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
            int ordinal = this.g.ordinal();
            if (ordinal == 1) {
                return cjtd.a(dtyd.cL);
            }
            if (ordinal == 2) {
                return cjtd.a(dtyd.dq);
            }
            return cjtd.a(dtyd.cA);
        }
        return cjtd.a(dtyd.cD);
    }

    @Override // defpackage.bayj
    /* renamed from: i */
    public String b() {
        if (B()) {
            return this.t.getString(R.string.DROPPED_PIN);
        }
        return dbsj.e(this.i);
    }

    @Override // defpackage.bbal, defpackage.bayj
    public String k() {
        return D() ? "" : batx.b(this.n, this.e.a());
    }

    @Override // defpackage.bbal, defpackage.bayj
    public cqkl m() {
        u();
        return cqkl.a;
    }

    @Override // defpackage.bbal, defpackage.bayj
    @dzsi
    public akqq q() {
        return this.m;
    }

    public final void u() {
        String e;
        if (D()) {
            axwv n = axww.n();
            n.b(this.g);
            if (B()) {
                e = this.m.a();
            } else {
                e = dbsj.e(this.i);
            }
            n.c(e);
            n.d(B());
            ((axvv) n).e = this.m;
            this.d.a().M(n.h());
        }
    }

    @Override // defpackage.bazi
    @dzsi
    protected final wdv v() {
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        int ordinal = this.g.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return wdv.d();
            }
            if (ordinal == 4) {
                return wdv.g(this.h.longValue());
            }
            return null;
        }
        return wdv.c();
    }

    public dndr w() {
        return this.g;
    }

    public final boolean x() {
        decq decqVar = this.k;
        return decqVar != null && !decqVar.equals(decq.a);
    }

    private final void C(jhq jhqVar) {
        int i;
        cjtd a;
        if (this.g == dndr.HOME) {
            i = R.string.YOUR_PLACES_ITEM_OVERFLOW_MENU_REMOVE_HOME;
        } else {
            i = this.g == dndr.WORK ? R.string.YOUR_PLACES_ITEM_OVERFLOW_MENU_REMOVE_WORK : R.string.YOUR_PLACES_ITEM_OVERFLOW_MENU_REMOVE_LABEL;
        }
        jhm jhmVar = new jhm();
        jhmVar.l = i;
        jhmVar.a = this.t.getString(i);
        if (A().booleanValue()) {
            int ordinal = this.g.ordinal();
            if (ordinal == 1) {
                a = cjtd.a(dtyd.cJ);
            } else if (ordinal == 2) {
                a = cjtd.a(dtyd.f24do);
            } else {
                a = cjtd.a(dtyd.cz);
            }
        } else {
            a = cjtd.a(dtyd.cB);
        }
        jhmVar.f = a;
        jhmVar.d(new bayt(this));
        ((jhu) jhqVar).d(jhmVar.c());
    }

    @Override // defpackage.bayj
    public jht h() {
        cjtd a;
        cjtd a2;
        if (this.l != null || this.m != null) {
            jhu h = jhv.h();
            jhi jhiVar = (jhi) h;
            jhiVar.e = this.t.getString(R.string.YOUR_PLACES_PLACE_ITEM_OVERFLOW_MENU_CONTENT_DESCRIPTION_FORMAT, new Object[]{a()});
            if (D()) {
                int i = this.g == dndr.HOME ? R.string.YOUR_PLACES_ITEM_OVERFLOW_MENU_EDIT_HOME : R.string.YOUR_PLACES_ITEM_OVERFLOW_MENU_EDIT_WORK;
                jhm jhmVar = new jhm();
                jhmVar.l = i;
                jhmVar.a = this.t.getString(i);
                if (A().booleanValue()) {
                    int ordinal = this.g.ordinal();
                    if (ordinal == 1) {
                        a = cjtd.a(dtyd.cK);
                    } else if (ordinal == 2) {
                        a = cjtd.a(dtyd.dp);
                    } else {
                        a = cjtd.b;
                    }
                } else {
                    a = cjtd.a(dtyd.cC);
                }
                jhmVar.f = a;
                jhmVar.d(new bayr(this));
                h.d(jhmVar.c());
                jhm jhmVar2 = new jhm();
                jhmVar2.l = R.string.YOUR_PLACES_ITEM_OVERFLOW_MENU_CHANGE_ICON;
                jhmVar2.a = this.t.getString(R.string.YOUR_PLACES_ITEM_OVERFLOW_MENU_CHANGE_ICON);
                if (A().booleanValue()) {
                    int ordinal2 = this.g.ordinal();
                    if (ordinal2 != 1) {
                        a2 = ordinal2 != 2 ? cjtd.b : cjtd.a(dtyd.cG);
                    } else {
                        a2 = cjtd.a(dtyd.cE);
                    }
                } else {
                    a2 = cjtd.a(dtyd.cF);
                }
                jhmVar2.f = a2;
                jhmVar2.d(new bays(this));
                h.d(jhmVar2.c());
                C(h);
            } else {
                C(h);
            }
            y(h);
            return jhiVar.b();
        }
        return jhv.h().b();
    }
}
