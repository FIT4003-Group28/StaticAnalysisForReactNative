package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azmy  reason: default package */
/* loaded from: classes3.dex */
public final class azmy implements axxa {
    public static final /* synthetic */ int d = 0;
    private static final dcdc<dppz> e;
    private static final dcdc<dppz> f;
    public final btrg a;
    public final azof b;
    public final dxio<azhi> c;
    private final cqat g;
    private final batm h;

    static {
        dppw bZ = dppz.c.bZ();
        dppy dppyVar = dppy.PLACE_ENTITY_LIST_ITEM;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dppz dppzVar = (dppz) bZ.b;
        dppzVar.b = dppyVar.e;
        dppzVar.a |= 1;
        e = dcdc.f(bZ.bK());
        dppw bZ2 = dppz.c.bZ();
        dppy dppyVar2 = dppy.DEAL_ENTITY_LIST_ITEM;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dppz dppzVar2 = (dppz) bZ2.b;
        dppzVar2.b = dppyVar2.e;
        dppzVar2.a |= 1;
        f = dcdc.f(bZ2.bK());
    }

    public azmy(azof azofVar, dxio<azhi> dxioVar, btrg btrgVar, cqat cqatVar, batm batmVar) {
        this.b = azofVar;
        this.c = dxioVar;
        this.a = btrgVar;
        this.g = cqatVar;
        this.h = batmVar;
    }

    private final azxi A(azxi azxiVar, @dzsi final List<dppz> list) {
        try {
            azxm<azxg> azxmVar = azxm.k;
            String str = azxiVar.l;
            dbsk.s(str);
            dcdc<azxg> r = azof.r(azxmVar, str);
            if (list == null) {
                if (r.isEmpty()) {
                    return azxiVar;
                }
                azxh i = azxiVar.i();
                i.b = r;
                return i.b();
            }
            Iterable i2 = dcft.i(r, new dbsl(list) { // from class: azml
                private final List a;

                {
                    this.a = list;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    List list2 = this.a;
                    int i3 = azmy.d;
                    dppl dpplVar = ((azxg) obj).g().b;
                    if (dpplVar == null) {
                        dpplVar = dppl.m;
                    }
                    dppt dpptVar = dpplVar.d;
                    if (dpptVar == null) {
                        dpptVar = dppt.e;
                    }
                    dppz dppzVar = dpptVar.d;
                    if (dppzVar == null) {
                        dppzVar = dppz.c;
                    }
                    return list2.contains(dppzVar);
                }
            });
            if (dcft.w(i2)) {
                return azxiVar;
            }
            azxh i3 = azxiVar.i();
            i3.b = dcdc.q(i2);
            return i3.b();
        } catch (axxc unused) {
            return azxiVar;
        }
    }

    private final azxi B(azxi azxiVar) {
        azxh i = azxiVar.i();
        dojy bZ = dojz.c.bZ();
        long b = this.g.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dojz dojzVar = (dojz) bZ.b;
        dojzVar.a |= 1;
        dojzVar.b = b;
        dojz bK = bZ.bK();
        i.f = bK;
        dolo doloVar = i.a;
        dsqp dsqpVar = (dsqp) doloVar.cu(5);
        dsqpVar.bC(doloVar);
        doln dolnVar = (doln) dsqpVar;
        if (dolnVar.c) {
            dolnVar.bF();
            dolnVar.c = false;
        }
        dolo doloVar2 = (dolo) dolnVar.b;
        dolo doloVar3 = dolo.d;
        bK.getClass();
        doloVar2.c = bK;
        doloVar2.a |= 2;
        i.a = dolnVar.bK();
        return i.b();
    }

    private final dehn<azxi> w(final azxi azxiVar, final dbrn<azxi, dehn<azxi>> dbrnVar) {
        return deew.g(deew.g(degp.q(this.h.c(new Callable(this, azxiVar) { // from class: azmu
            private final azmy a;
            private final azxi b;

            {
                this.a = this;
                this.b = azxiVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                azmy azmyVar = this.a;
                azxi azxiVar2 = this.b;
                dbsg<String> n = azxiVar2.n();
                try {
                    return n.a() ? azmyVar.d(n.b()).c(azxiVar2) : azxiVar2;
                } catch (axxc e2) {
                    throw new IllegalStateException("Failed to retrieve list locally before sync", e2);
                }
            }
        })), new defg(this) { // from class: azmv
            private final azmy a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                azof azofVar;
                azxl azxlVar;
                azwl azwlVar;
                List<aznp> e2;
                azmy azmyVar = this.a;
                azxi azxiVar2 = (azxi) obj;
                deig d2 = deig.d();
                azwl azwlVar2 = azxiVar2.j;
                dbsk.s(azwlVar2);
                if (!dbsj.d(azwlVar2.b)) {
                    try {
                        azofVar = azmyVar.b;
                        azxlVar = azxl.SAVES_LIST;
                        azwlVar = azxiVar2.j;
                        dbsk.s(azwlVar);
                    } catch (axxc unused) {
                    }
                    if (azofVar.c(azxlVar, azwlVar.a)) {
                        azxl azxlVar2 = azxl.SAVES_ITEM;
                        azwl azwlVar3 = azxiVar2.j;
                        dbsk.s(azwlVar3);
                        try {
                            String[] strArr = {Integer.toString(azxlVar2.n), azwlVar3.a};
                            synchronized (aznn.class) {
                                Cursor c = aznn.c("corpus = ? AND string_index = ? ", strArr, null);
                                e2 = aznn.e(c);
                                if (c != null) {
                                    c.close();
                                }
                            }
                            for (aznp aznpVar : e2) {
                                if (aznpVar.e != aznl.SYNCED) {
                                }
                            }
                            d2.j(azxiVar2);
                            return d2;
                        } catch (azom e3) {
                            throw new axxc("Read transaction error.", e3);
                        }
                    }
                }
                azmyVar.c.a().b(new axxd(azmyVar, azxiVar2, d2) { // from class: azmm
                    private final azmy a;
                    private final azxi b;
                    private final deig c;

                    {
                        this.a = azmyVar;
                        this.b = azxiVar2;
                        this.c = d2;
                    }

                    @Override // defpackage.axxd
                    public final void a(boolean z) {
                        azmy azmyVar2 = this.a;
                        azxi azxiVar3 = this.b;
                        deig deigVar = this.c;
                        try {
                            dbsg<azxi> b = azmyVar2.b(azxiVar3);
                            if (b.a()) {
                                deigVar.j(b.b());
                            } else {
                                deigVar.k(new IllegalStateException("Fail to retrieve the list after forced sync."));
                            }
                        } catch (axxc e4) {
                            deigVar.k(e4);
                        }
                    }
                });
                return d2;
            }
        }, dege.a), new defg(dbrnVar) { // from class: azme
            private final dbrn a;

            {
                this.a = dbrnVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                int i = azmy.d;
                return (dehn) this.a.a((azxi) obj);
            }
        }, dege.a);
    }

    private final dehn<azxi> x(azxi azxiVar, dbrn<azxi, dehn<azxi>> dbrnVar) {
        deig d2 = deig.d();
        deha.q(dbrnVar.a(azxiVar), new azmx(this, d2), dege.a);
        return d2;
    }

    @dzsi
    private final azxi y(dprc dprcVar, List<dppz> list, dpqj dpqjVar, boolean z) {
        azxi azxiVar = null;
        try {
            dcdc<azxi> a = a();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                azxi azxiVar2 = a.get(i);
                if (azxiVar2.k().a() && azxiVar2.m().a() && azxiVar2.k().b() == dprcVar && azxiVar2.m().b() == dpqjVar) {
                    List<dppz> l = azxiVar2.l();
                    if ((!z || list.size() == l.size()) && (l.size() == 0 || l.containsAll(list))) {
                        dpot dpotVar = azxiVar2.j().b;
                        if (dpotVar == null) {
                            dpotVar = dpot.m;
                        }
                        dpqw b = dpqw.b(dpotVar.c);
                        if (b == null) {
                            b = dpqw.UNKNOWN_ENTITY_LIST_ROLE;
                        }
                        if (b != dpqw.OWNER_ENTITY_LIST) {
                            continue;
                        } else if (azxiVar2.n().a()) {
                            return azxiVar2;
                        } else {
                            azxiVar = azxiVar2;
                        }
                    }
                }
            }
        } catch (axxc unused) {
        }
        return azxiVar;
    }

    private final azxi z(azxi azxiVar) {
        return A(azxiVar, null);
    }

    @Override // defpackage.axxa
    public final dbsg<azxi> b(azxi azxiVar) {
        bvrj.UI_THREAD.d();
        azwl azwlVar = azxiVar.j;
        dbsk.s(azwlVar);
        return c(azwlVar.a);
    }

    @Override // defpackage.axxa
    public final dbsg<azxi> c(String str) {
        bvrj.UI_THREAD.d();
        dbsg b = this.b.b(azxm.j, str);
        return !b.a() ? dbpy.a : dbsg.i(z((azxi) b.b()));
    }

    @Override // defpackage.axxa
    public final dbsg<azxi> d(String str) {
        bvrj.UI_THREAD.d();
        azxi azxiVar = (azxi) dcft.r(azof.q(azxm.j, str), null);
        return azxiVar == null ? dbpy.a : dbsg.i(z(azxiVar));
    }

    @Override // defpackage.axxa
    public final dbsg<azxi> e(dpov dpovVar) {
        bvrj.UI_THREAD.d();
        int i = dpovVar.a;
        boolean z = true;
        dbsk.b(((i & 2) == 0 || (i & 4) == 0) ? false : true, "EntityListDescriptor for a built-in list must set a listType and listNamespace.");
        dprc b = dprc.b(dpovVar.c);
        if (b == null) {
            b = dprc.UNKNOWN_ENTITY_LIST_TYPE;
        }
        boolean z2 = (b == dprc.UNKNOWN_ENTITY_LIST_TYPE || b == dprc.CUSTOM_ENTITY_LIST) ? false : true;
        dprc b2 = dprc.b(dpovVar.c);
        if (b2 == null) {
            b2 = dprc.UNKNOWN_ENTITY_LIST_TYPE;
        }
        dbsk.e(z2, "Specified list type (%s) does not refer to a built-in list.", b2.f);
        dprc b3 = dprc.b(dpovVar.c);
        if (b3 == null) {
            b3 = dprc.UNKNOWN_ENTITY_LIST_TYPE;
        }
        dsrj<dppz> dsrjVar = dpovVar.d;
        dpqj b4 = dpqj.b(dpovVar.e);
        if (b4 == null) {
            b4 = dpqj.UNKNOWN_ENTITY_LIST_NAMESPACE;
        }
        dprc b5 = dprc.b(dpovVar.c);
        if (b5 == null) {
            b5 = dprc.UNKNOWN_ENTITY_LIST_TYPE;
        }
        if (b5 == dprc.WANT_TO_GO_ENTITY_LIST) {
            z = false;
        }
        azxi y = y(b3, dsrjVar, b4, z);
        return y == null ? dbpy.a : dbsg.i(z(y));
    }

    @Override // defpackage.axxa
    public final dbsg<azxi> f() {
        bvrj.UI_THREAD.d();
        dprc dprcVar = dprc.STARRED_ENTITY_LIST;
        dcdc<dppz> dcdcVar = e;
        azxi y = y(dprcVar, dcdcVar, dpqj.LOCAL_FOLLOWING, false);
        return y == null ? dbpy.a : dbsg.i(A(y, dcdcVar));
    }

    @Override // defpackage.axxa
    public final dbsg<azxi> g() {
        bvrj.UI_THREAD.d();
        dprc dprcVar = dprc.FAVORITES_ENTITY_LIST;
        dcdc<dppz> dcdcVar = f;
        azxi y = y(dprcVar, dcdcVar, dpqj.UNIVERSAL_ENTITY_LIST, false);
        return y == null ? dbpy.a : dbsg.i(A(y, dcdcVar));
    }

    @Override // defpackage.axxa
    public final dehn<azxi> h(axwf axwfVar, dbsg<dpqy> dbsgVar) {
        dibn bZ;
        dpqy bK;
        axvr axvrVar = (axvr) axwfVar;
        final String str = axvrVar.a;
        final String str2 = axvrVar.b;
        if (str.isEmpty()) {
            return deha.c();
        }
        if (str2 != null) {
            bZ = dibo.i.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dibo diboVar = (dibo) bZ.b;
            str2.getClass();
            diboVar.b = 14;
            diboVar.c = str2;
        } else {
            bZ = dibo.i.bZ();
            dpou bZ2 = dpov.f.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dpov dpovVar = (dpov) bZ2.b;
            str.getClass();
            dpovVar.a |= 1;
            dpovVar.b = str;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dibo diboVar2 = (dibo) bZ.b;
            dpov bK2 = bZ2.bK();
            bK2.getClass();
            diboVar2.c = bK2;
            diboVar2.b = 1;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dibo diboVar3 = (dibo) bZ.b;
        diboVar3.d = 2;
        int i = diboVar3.a | 16;
        diboVar3.a = i;
        diboVar3.a = i | 32;
        diboVar3.e = 10000;
        if (dbsgVar.a()) {
            bK = dbsgVar.b();
        } else {
            dpqx bZ3 = dpqy.d.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dpqy dpqyVar = (dpqy) bZ3.b;
            dpqyVar.a |= 1;
            dpqyVar.b = true;
            bK = bZ3.bK();
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dibo diboVar4 = (dibo) bZ.b;
        bK.getClass();
        diboVar4.h = bK;
        diboVar4.a |= 4096;
        final dibo bK3 = bZ.bK();
        return deew.h(deee.h(degp.q(this.a.a(bK3)), Exception.class, new defg(this, str2, bK3, str) { // from class: azmn
            private final azmy a;
            private final String b;
            private final dibo c;
            private final String d;

            {
                this.a = this;
                this.b = str2;
                this.c = bK3;
                this.d = str;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                azmy azmyVar = this.a;
                String str3 = this.b;
                dibo diboVar5 = this.c;
                String str4 = this.d;
                Exception exc = (Exception) obj;
                if (str3 != null) {
                    dsqp dsqpVar = (dsqp) diboVar5.cu(5);
                    dsqpVar.bC(diboVar5);
                    dibn dibnVar = (dibn) dsqpVar;
                    if (dibnVar.c) {
                        dibnVar.bF();
                        dibnVar.c = false;
                    }
                    dibo diboVar6 = (dibo) dibnVar.b;
                    dibo diboVar7 = dibo.i;
                    if (diboVar6.b == 14) {
                        diboVar6.b = 0;
                        diboVar6.c = null;
                    }
                    dpou bZ4 = dpov.f.bZ();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dpov dpovVar2 = (dpov) bZ4.b;
                    str4.getClass();
                    dpovVar2.a |= 1;
                    dpovVar2.b = str4;
                    if (dibnVar.c) {
                        dibnVar.bF();
                        dibnVar.c = false;
                    }
                    dibo diboVar8 = (dibo) dibnVar.b;
                    dpov bK4 = bZ4.bK();
                    bK4.getClass();
                    diboVar8.c = bK4;
                    diboVar8.b = 1;
                    return azmyVar.a.a(dibnVar.bK());
                }
                return deha.b(exc);
            }
        }, dege.a), new dbrn(this) { // from class: azmd
            private final azmy a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                azmy azmyVar = this.a;
                dibq dibqVar = (dibq) obj;
                if ((dibqVar.a & 32) == 0) {
                    return azmyVar.i(dibqVar);
                }
                dqhy dqhyVar = dqhy.UNKNOWN_STATUS_CODE;
                dpql dpqlVar = dibqVar.e;
                if (dpqlVar == null) {
                    dpqlVar = dpql.c;
                }
                dqhy b = dqhy.b(dpqlVar.a);
                if (b == null) {
                    b = dqhy.UNKNOWN_STATUS_CODE;
                }
                int ordinal = b.ordinal();
                if (ordinal == 4 || ordinal == 5) {
                    throw new axzg();
                }
                throw new IllegalStateException("Failed to fetch saves list.");
            }
        }, dege.a);
    }

    @Override // defpackage.axxa
    public final azxi i(dibq dibqVar) {
        dpot dpotVar = dibqVar.b;
        if (dpotVar == null) {
            dpotVar = dpot.m;
        }
        return j(dpotVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b9 A[SYNTHETIC] */
    @Override // defpackage.axxa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.azxi j(defpackage.dpot r17) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azmy.j(dpot):azxi");
    }

    @Override // defpackage.axxa
    public final azxi k(azxi azxiVar) {
        bvrj.UI_THREAD.d();
        azxi azxiVar2 = (azxi) this.b.g(azxm.j, B(azxiVar));
        this.c.a().a();
        return azxiVar2;
    }

    @Override // defpackage.axxa
    public final azxg l(azxg azxgVar, azxi azxiVar) {
        bvrj.UI_THREAD.d();
        azof azofVar = this.b;
        azxm<azxg> azxmVar = azxm.k;
        azxf i = azxgVar.i();
        i.h = azxiVar.l;
        azxf i2 = i.b().i();
        dojy bZ = dojz.c.bZ();
        long b = this.g.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dojz dojzVar = (dojz) bZ.b;
        dojzVar.a |= 1;
        dojzVar.b = b;
        dojz bK = bZ.bK();
        i2.f = bK;
        dolm dolmVar = i2.a;
        dsqp dsqpVar = (dsqp) dolmVar.cu(5);
        dsqpVar.bC(dolmVar);
        doll dollVar = (doll) dsqpVar;
        if (dollVar.c) {
            dollVar.bF();
            dollVar.c = false;
        }
        dolm dolmVar2 = (dolm) dollVar.b;
        dolm dolmVar3 = dolm.f;
        bK.getClass();
        dolmVar2.e = bK;
        dolmVar2.a |= 8;
        i2.a = dollVar.bK();
        azxg azxgVar2 = (azxg) azofVar.g(azxmVar, i2.b());
        this.c.a().a();
        return azxgVar2;
    }

    @Override // defpackage.axxa
    public final boolean m(azxi azxiVar) {
        bvrj.UI_THREAD.d();
        dbsg<azxi> b = b(azxiVar);
        if (b.a()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(azxiVar);
            arrayList.addAll(b.b().a);
            boolean k = this.b.k(arrayList);
            if (k) {
                this.c.a().a();
            }
            return k;
        }
        return true;
    }

    @Override // defpackage.axxa
    public final dehn<azxi> n(azxi azxiVar, final dpqn dpqnVar) {
        dpqn b = dpqn.b(azxiVar.v().b);
        if (b == null) {
            b = dpqn.PRIVATE_ENTITY_LIST;
        }
        if (b.equals(dpqnVar)) {
            return deha.a(azxiVar);
        }
        return w(azxiVar, new dbrn(this, dpqnVar) { // from class: azmt
            private final azmy a;
            private final dpqn b;

            {
                this.a = this;
                this.b = dpqnVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                azmy azmyVar = this.a;
                dpqn dpqnVar2 = this.b;
                azxi azxiVar2 = (azxi) obj;
                if (!azxiVar2.n().a()) {
                    return deha.b(new IllegalArgumentException("ListId is required to issue change list permission request."));
                }
                btrg btrgVar = azmyVar.a;
                dpot dpotVar = azxiVar2.j().b;
                if (dpotVar == null) {
                    dpotVar = dpot.m;
                }
                dpov dpovVar = dpotVar.b;
                if (dpovVar == null) {
                    dpovVar = dpov.f;
                }
                return deew.h(btrgVar.c(dpovVar, dpqnVar2), new dbrn(azmyVar, azxiVar2) { // from class: azmj
                    private final azmy a;
                    private final azxi b;

                    {
                        this.a = azmyVar;
                        this.b = azxiVar2;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        azmy azmyVar2 = this.a;
                        azxi azxiVar3 = this.b;
                        dpri dpriVar = (dpri) obj2;
                        dpot dpotVar2 = azxiVar3.j().b;
                        if (dpotVar2 == null) {
                            dpotVar2 = dpot.m;
                        }
                        azxh i = azxiVar3.i();
                        dsqp dsqpVar = (dsqp) dpotVar2.cu(5);
                        dsqpVar.bC(dpotVar2);
                        dpoq dpoqVar = (dpoq) dsqpVar;
                        if (dpoqVar.c) {
                            dpoqVar.bF();
                            dpoqVar.c = false;
                        }
                        dpot dpotVar3 = (dpot) dpoqVar.b;
                        dpriVar.getClass();
                        dpotVar3.d = dpriVar;
                        dpotVar3.a |= 4;
                        i.c(dpoqVar.bK());
                        return azmyVar2.v(i.b());
                    }
                }, dege.a);
            }
        });
    }

    @Override // defpackage.axxa
    public final dehn<azxi> o(azxi azxiVar) {
        try {
            azof azofVar = this.b;
            azxm<azxi> azxmVar = azxm.j;
            azwl azwlVar = azxiVar.j;
            dbsk.s(azwlVar);
            if (azofVar.b(azxmVar, azwlVar.a).a()) {
                return deha.a(azxiVar);
            }
            return x(azxiVar, new dbrn(this) { // from class: azmo
                private final azmy a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    azmy azmyVar = this.a;
                    azxi azxiVar2 = (azxi) obj;
                    if (!azxiVar2.n().a()) {
                        return deha.b(new IllegalArgumentException("ListId is required to issue follow list request."));
                    }
                    btrg btrgVar = azmyVar.a;
                    dpot dpotVar = azxiVar2.j().b;
                    if (dpotVar == null) {
                        dpotVar = dpot.m;
                    }
                    return deew.h(btrgVar.e(dpotVar, dpqw.READER_ENTITY_LIST, dpqw.FOLLOWER_ENTITY_LIST), new dbrn(azxiVar2) { // from class: azmf
                        private final azxi a;

                        {
                            this.a = azxiVar2;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj2) {
                            azxi azxiVar3 = this.a;
                            dpqw dpqwVar = (dpqw) obj2;
                            int i = azmy.d;
                            dpot dpotVar2 = azxiVar3.j().b;
                            if (dpotVar2 == null) {
                                dpotVar2 = dpot.m;
                            }
                            azxh i2 = azxiVar3.i();
                            dsqp dsqpVar = (dsqp) dpotVar2.cu(5);
                            dsqpVar.bC(dpotVar2);
                            dpoq dpoqVar = (dpoq) dsqpVar;
                            if (dpoqVar.c) {
                                dpoqVar.bF();
                                dpoqVar.c = false;
                            }
                            dpot dpotVar3 = (dpot) dpoqVar.b;
                            dpotVar3.c = dpqwVar.f;
                            dpotVar3.a |= 2;
                            i2.c(dpoqVar.bK());
                            return i2.b();
                        }
                    }, dege.a);
                }
            });
        } catch (axxc e2) {
            return deha.b(e2);
        }
    }

    @Override // defpackage.axxa
    public final dehn<azxi> p(azxi azxiVar) {
        return x(azxiVar, new dbrn(this) { // from class: azmp
            private final azmy a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                azmy azmyVar = this.a;
                azxi azxiVar2 = (azxi) obj;
                if (!azxiVar2.n().a()) {
                    return deha.b(new IllegalArgumentException("ListId is required to issue un-follow list request."));
                }
                btrg btrgVar = azmyVar.a;
                dpot dpotVar = azxiVar2.j().b;
                if (dpotVar == null) {
                    dpotVar = dpot.m;
                }
                return deew.h(btrgVar.e(dpotVar, dpqw.FOLLOWER_ENTITY_LIST, dpqw.READER_ENTITY_LIST), new dbrn(azxiVar2) { // from class: azmg
                    private final azxi a;

                    {
                        this.a = azxiVar2;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        azxi azxiVar3 = this.a;
                        dpqw dpqwVar = (dpqw) obj2;
                        int i = azmy.d;
                        dpot dpotVar2 = azxiVar3.j().b;
                        if (dpotVar2 == null) {
                            dpotVar2 = dpot.m;
                        }
                        azxh i2 = azxiVar3.i();
                        dsqp dsqpVar = (dsqp) dpotVar2.cu(5);
                        dsqpVar.bC(dpotVar2);
                        dpoq dpoqVar = (dpoq) dsqpVar;
                        if (dpoqVar.c) {
                            dpoqVar.bF();
                            dpoqVar.c = false;
                        }
                        dpot dpotVar3 = (dpot) dpoqVar.b;
                        dpotVar3.c = dpqwVar.f;
                        dpotVar3.a |= 2;
                        i2.c(dpoqVar.bK());
                        return i2.b();
                    }
                }, dege.a);
            }
        });
    }

    @Override // defpackage.axxa
    public final dehn<azxi> q(azxi azxiVar) {
        try {
            azof azofVar = this.b;
            azxm<azxi> azxmVar = azxm.j;
            azwl azwlVar = azxiVar.j;
            dbsk.s(azwlVar);
            dbsg b = azofVar.b(azxmVar, azwlVar.a);
            if (!b.a() || ((azxi) b.b()).w() == dpqw.FOLLOWER_ENTITY_LIST) {
                return x(azxiVar, new dbrn(this) { // from class: azmq
                    private final azmy a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        azmy azmyVar = this.a;
                        azxi azxiVar2 = (azxi) obj;
                        if (!azxiVar2.n().a()) {
                            return deha.b(new IllegalArgumentException("ListId is required to issue join list request."));
                        }
                        btrg btrgVar = azmyVar.a;
                        dpot dpotVar = azxiVar2.j().b;
                        if (dpotVar == null) {
                            dpotVar = dpot.m;
                        }
                        dpri dpriVar = dpotVar.d;
                        if (dpriVar == null) {
                            dpriVar = dpri.f;
                        }
                        boolean z = false;
                        if ((dpriVar.a & 8) != 0) {
                            dpri dpriVar2 = dpotVar.d;
                            if (dpriVar2 == null) {
                                dpriVar2 = dpri.f;
                            }
                            if (!dpriVar2.e.isEmpty()) {
                                z = true;
                            }
                        }
                        dbsk.b(z, "List is not shared to begin with");
                        return deew.h(btrgVar.e(dpotVar, dpqw.READER_ENTITY_LIST, dpqw.COLLABORATOR_ENTITY_LIST), new dbrn(azxiVar2) { // from class: azmh
                            private final azxi a;

                            {
                                this.a = azxiVar2;
                            }

                            @Override // defpackage.dbrn
                            public final Object a(Object obj2) {
                                azxi azxiVar3 = this.a;
                                dpqw dpqwVar = (dpqw) obj2;
                                int i = azmy.d;
                                dpot dpotVar2 = azxiVar3.j().b;
                                if (dpotVar2 == null) {
                                    dpotVar2 = dpot.m;
                                }
                                azxh i2 = azxiVar3.i();
                                dsqp dsqpVar = (dsqp) dpotVar2.cu(5);
                                dsqpVar.bC(dpotVar2);
                                dpoq dpoqVar = (dpoq) dsqpVar;
                                if (dpoqVar.c) {
                                    dpoqVar.bF();
                                    dpoqVar.c = false;
                                }
                                dpot dpotVar3 = (dpot) dpoqVar.b;
                                dpotVar3.c = dpqwVar.f;
                                dpotVar3.a |= 2;
                                i2.c(dpoqVar.bK());
                                return i2.b();
                            }
                        }, dege.a);
                    }
                });
            }
            return deha.a(azxiVar);
        } catch (axxc e2) {
            return deha.b(e2);
        }
    }

    @Override // defpackage.axxa
    public final dehn<azxi> r(azxi azxiVar) {
        return x(azxiVar, new dbrn(this) { // from class: azmr
            private final azmy a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                azmy azmyVar = this.a;
                azxi azxiVar2 = (azxi) obj;
                if (!azxiVar2.n().a()) {
                    return deha.b(new IllegalArgumentException("ListId is required to issue leave list request."));
                }
                btrg btrgVar = azmyVar.a;
                dpot dpotVar = azxiVar2.j().b;
                if (dpotVar == null) {
                    dpotVar = dpot.m;
                }
                dpri dpriVar = dpotVar.d;
                if (dpriVar == null) {
                    dpriVar = dpri.f;
                }
                boolean z = false;
                if ((dpriVar.a & 8) != 0) {
                    dpri dpriVar2 = dpotVar.d;
                    if (dpriVar2 == null) {
                        dpriVar2 = dpri.f;
                    }
                    if (!dpriVar2.e.isEmpty()) {
                        z = true;
                    }
                }
                dbsk.b(z, "List is not shared to begin with");
                return deew.h(btrgVar.e(dpotVar, dpqw.COLLABORATOR_ENTITY_LIST, dpqw.READER_ENTITY_LIST), new dbrn(azxiVar2) { // from class: azmi
                    private final azxi a;

                    {
                        this.a = azxiVar2;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        azxi azxiVar3 = this.a;
                        dpqw dpqwVar = (dpqw) obj2;
                        int i = azmy.d;
                        dpot dpotVar2 = azxiVar3.j().b;
                        if (dpotVar2 == null) {
                            dpotVar2 = dpot.m;
                        }
                        azxh i2 = azxiVar3.i();
                        dsqp dsqpVar = (dsqp) dpotVar2.cu(5);
                        dsqpVar.bC(dpotVar2);
                        dpoq dpoqVar = (dpoq) dsqpVar;
                        if (dpoqVar.c) {
                            dpoqVar.bF();
                            dpoqVar.c = false;
                        }
                        dpot dpotVar3 = (dpot) dpoqVar.b;
                        dpotVar3.c = dpqwVar.f;
                        dpotVar3.a |= 2;
                        i2.c(dpoqVar.bK());
                        return i2.b();
                    }
                }, dege.a);
            }
        });
    }

    @Override // defpackage.axxa
    public final void s(azxg azxgVar) {
        bvrj.UI_THREAD.d();
        if (this.b.j(azxgVar)) {
            this.c.a().a();
        }
    }

    @Override // defpackage.axxa
    public final dehn<azxi> t(azxi azxiVar, final int i) {
        int a = dpqr.a(azxiVar.v().c);
        if (a == 0) {
            a = 2;
        }
        if (a == i) {
            return deha.a(azxiVar);
        }
        return w(azxiVar, new dbrn(this, i) { // from class: azms
            private final azmy a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                azmy azmyVar = this.a;
                int i2 = this.b;
                azxi azxiVar2 = (azxi) obj;
                if (!azxiVar2.n().a()) {
                    return deha.b(new IllegalArgumentException("ListId is required to issue change list publication state request."));
                }
                btrg btrgVar = azmyVar.a;
                dpot dpotVar = azxiVar2.j().b;
                if (dpotVar == null) {
                    dpotVar = dpot.m;
                }
                dpov dpovVar = dpotVar.b;
                if (dpovVar == null) {
                    dpovVar = dpov.f;
                }
                dkat bZ = dkau.f.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dkau dkauVar = (dkau) bZ.b;
                dpovVar.getClass();
                dkauVar.d = dpovVar;
                dkauVar.a |= 1;
                dkauVar.c = Integer.valueOf(i2 - 1);
                dkauVar.b = 3;
                dnqh h = btrg.h(ddda.aE);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dkau dkauVar2 = (dkau) bZ.b;
                h.getClass();
                dkauVar2.e = h;
                dkauVar2.a |= 8;
                return deew.h(deew.h(deew.h(degp.q(btrgVar.f(btrgVar.h, bZ.bK(), btpu.a, btpv.a)), btrg.g(btpx.a), dege.a), btpy.a, dege.a), new dbrn(azmyVar, azxiVar2) { // from class: azmk
                    private final azmy a;
                    private final azxi b;

                    {
                        this.a = azmyVar;
                        this.b = azxiVar2;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        azmy azmyVar2 = this.a;
                        azxi azxiVar3 = this.b;
                        dpri dpriVar = (dpri) obj2;
                        dpot dpotVar2 = azxiVar3.j().b;
                        if (dpotVar2 == null) {
                            dpotVar2 = dpot.m;
                        }
                        azxh i3 = azxiVar3.i();
                        dsqp dsqpVar = (dsqp) dpotVar2.cu(5);
                        dsqpVar.bC(dpotVar2);
                        dpoq dpoqVar = (dpoq) dsqpVar;
                        if (dpoqVar.c) {
                            dpoqVar.bF();
                            dpoqVar.c = false;
                        }
                        dpot dpotVar3 = (dpot) dpoqVar.b;
                        dpriVar.getClass();
                        dpotVar3.d = dpriVar;
                        dpotVar3.a |= 4;
                        i3.c(dpoqVar.bK());
                        return azmyVar2.v(i3.b());
                    }
                }, dege.a);
            }
        });
    }

    @Override // defpackage.axxa
    /* renamed from: u */
    public final dcdc<azxi> a() {
        bvrj.UI_THREAD.d();
        return this.b.a(azxm.j);
    }

    public final azxi v(azxi azxiVar) {
        try {
            azof azofVar = this.b;
            azxl azxlVar = azxl.SAVES_LIST;
            azwl azwlVar = azxiVar.j;
            dbsk.s(azwlVar);
            if (azofVar.c(azxlVar, azwlVar.a)) {
                azxi azxiVar2 = (azxi) this.b.h(azxm.j, B(azxiVar));
                dbsk.s(azxiVar2);
                return azxiVar2;
            }
            azxi azxiVar3 = (azxi) this.b.g(azxm.j, B(azxiVar));
            dbsk.s(azxiVar3);
            return azxiVar3;
        } catch (axxc | azom unused) {
            return azxiVar;
        }
    }
}
