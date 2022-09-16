package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: wcw  reason: default package */
/* loaded from: classes7.dex */
public final class wcw implements wdt {
    public final wdh a;
    public final axvy b;
    public final bvjj c;
    public final akfa d;
    private final Context e;
    private final dehp f;
    private final btvo g;
    private final axwq h;
    private final cqat i;

    public wcw(dehp dehpVar, Context context, btvo btvoVar, wdh wdhVar, axwq axwqVar, axvy axvyVar, bvjj bvjjVar, akfa akfaVar, cqat cqatVar) {
        this.e = context;
        this.f = dehpVar;
        this.g = btvoVar;
        this.a = wdhVar;
        this.h = axwqVar;
        this.b = axvyVar;
        this.c = bvjjVar;
        this.d = akfaVar;
        this.i = cqatVar;
    }

    public static boolean d(SavedTrip savedTrip, dpjs dpjsVar) {
        return savedTrip.b().c() == dqvj.DRIVE && savedTrip.b().b().b == dpjsVar;
    }

    public static SavedTrip e(azva azvaVar, String str) {
        dpjs dpjsVar;
        amvg P = amvh.P();
        dndr dndrVar = azvaVar.a;
        dndr dndrVar2 = dndr.UNKNOWN_ALIAS_TYPE;
        int ordinal = dndrVar.ordinal();
        if (ordinal == 1) {
            dpjsVar = dpjs.ENTITY_TYPE_HOME;
        } else if (ordinal == 2) {
            dpjsVar = dpjs.ENTITY_TYPE_WORK;
        } else if (ordinal == 4) {
            dpjsVar = dpjs.ENTITY_TYPE_NICKNAME;
        } else {
            dpjsVar = dpjs.ENTITY_TYPE_DEFAULT;
        }
        P.a = dpjsVar;
        P.d = azvaVar.e;
        P.c = azvaVar.c;
        return SavedTrip.d(str, SavedTrip.Data.j(null, P.a(), dqvj.DRIVE, 3, null, dbpy.a, 1));
    }

    private final amvh k(final amvh amvhVar, dcdc<azva> dcdcVar) {
        dbsg j;
        amvg amvgVar = new amvg(amvhVar);
        amvgVar.f = true;
        if (!amvhVar.m() || !akqi.d(amvhVar.d)) {
            double d = this.g.getSavedTripsParameters().a;
            if (!amvhVar.n()) {
                j = dbpy.a;
            } else {
                akqq akqqVar = amvhVar.e;
                dbsk.s(akqqVar);
                int size = dcdcVar.size();
                azva azvaVar = null;
                for (int i = 0; i < size; i++) {
                    azva azvaVar2 = dcdcVar.get(i);
                    if (akqq.v(azvaVar2.e, akqqVar, d)) {
                        akqq akqqVar2 = azvaVar2.e;
                        dbsk.s(akqqVar2);
                        d = akqo.e(akqqVar2, akqqVar);
                        azvaVar = azvaVar2;
                    }
                }
                j = dbsg.j(azvaVar);
            }
        } else {
            j = dcbg.b(dcdcVar).r(new dbsl(amvhVar) { // from class: wct
                private final amvh a;

                {
                    this.a = amvhVar;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    azva azvaVar3 = (azva) obj;
                    return akqi.d(azvaVar3.c) && azvaVar3.c.equals(this.a.d);
                }
            });
        }
        if (j.a()) {
            amvgVar.j = ((azva) j.b()).e(this.e);
            dpjs g = amvj.g(((azva) j.b()).a);
            dbsk.s(g);
            amvgVar.a = g;
            amvgVar.c = ((azva) j.b()).c;
        }
        return amvgVar.a();
    }

    @Override // defpackage.wdt
    public final dehn<Void> a(final SavedTrip savedTrip) {
        this.c.Z(bvjk.ku, this.i.b());
        return deew.g(this.h.m(), new defg(this, savedTrip) { // from class: wco
            private final wcw a;
            private final SavedTrip b;

            {
                this.a = this;
                this.b = savedTrip;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                wcw wcwVar = this.a;
                final wdh wdhVar = wcwVar.a;
                SavedTrip j = wcwVar.j(this.b, (dcdc) obj);
                dbsk.l(wdh.a.contains(j.b().c()));
                SavedTrip.Data b = j.b();
                dnln bZ = dnls.g.bZ();
                dnlo bZ2 = dnlr.c.bZ();
                int h = j.b().h();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dnlr dnlrVar = (dnlr) bZ2.b;
                int i = h - 1;
                if (h != 0) {
                    dnlrVar.b = i;
                    dnlrVar.a |= 1;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnls dnlsVar = (dnls) bZ.b;
                    dnlr bK = bZ2.bK();
                    bK.getClass();
                    dnlsVar.b = bK;
                    dnlsVar.a |= 1;
                    String a = j.a();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnls dnlsVar2 = (dnls) bZ.b;
                    a.getClass();
                    dnlsVar2.a |= 2;
                    dnlsVar2.c = a;
                    bZ.a(wdh.a("SOURCE_ID", b.a()));
                    bZ.a(wdh.a("DESTINATION_ID", b.b()));
                    dnku bZ3 = dnlg.c.bZ();
                    if (b.c().equals(dqvj.TRANSIT)) {
                        dbsk.s(b.d());
                        dnkx bZ4 = dnld.e.bZ();
                        dnla bZ5 = dnlc.c.bZ();
                        if (bZ5.c) {
                            bZ5.bF();
                            bZ5.c = false;
                        }
                        dnlc dnlcVar = (dnlc) bZ5.b;
                        dnlcVar.b = 1;
                        dnlcVar.a |= 1;
                        if (bZ4.c) {
                            bZ4.bF();
                            bZ4.c = false;
                        }
                        dnld dnldVar = (dnld) bZ4.b;
                        dnlc bK2 = bZ5.bK();
                        bK2.getClass();
                        dnldVar.b = bK2;
                        dnldVar.a |= 1;
                        dspd d = b.d();
                        dbsk.s(d);
                        if (bZ4.c) {
                            bZ4.bF();
                            bZ4.c = false;
                        }
                        dnld dnldVar2 = (dnld) bZ4.b;
                        d.getClass();
                        dnldVar2.a |= 2;
                        dnldVar2.c = d;
                        if (b.e().a()) {
                            dcbg s = dcbg.b(b.e().b()).s(wdc.a);
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            dnld dnldVar3 = (dnld) bZ4.b;
                            dnldVar3.b();
                            dsod.bv(s, dnldVar3.d);
                        }
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dnlg dnlgVar = (dnlg) bZ3.b;
                        dnld bK3 = bZ4.bK();
                        bK3.getClass();
                        dnlgVar.b = bK3;
                        dnlgVar.a = 3;
                    } else if (b.c().equals(dqvj.DRIVE)) {
                        dnkw dnkwVar = dnkw.a;
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dnlg dnlgVar2 = (dnlg) bZ3.b;
                        dnkwVar.getClass();
                        dnlgVar2.b = dnkwVar;
                        dnlgVar2.a = 4;
                    }
                    dnlj bZ6 = dnlm.e.bZ();
                    dnlk bZ7 = dnll.c.bZ();
                    if (bZ7.c) {
                        bZ7.bF();
                        bZ7.c = false;
                    }
                    dnll dnllVar = (dnll) bZ7.b;
                    dnllVar.a |= 1;
                    dnllVar.b = "SOURCE_ID";
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    dnlm dnlmVar = (dnlm) bZ6.b;
                    dnll bK4 = bZ7.bK();
                    bK4.getClass();
                    dnlmVar.b = bK4;
                    dnlmVar.a |= 1;
                    dnlk bZ8 = dnll.c.bZ();
                    if (bZ8.c) {
                        bZ8.bF();
                        bZ8.c = false;
                    }
                    dnll dnllVar2 = (dnll) bZ8.b;
                    dnllVar2.a |= 1;
                    dnllVar2.b = "DESTINATION_ID";
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    dnlm dnlmVar2 = (dnlm) bZ6.b;
                    dnll bK5 = bZ8.bK();
                    bK5.getClass();
                    dnlmVar2.c = bK5;
                    dnlmVar2.a |= 2;
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    dnlm dnlmVar3 = (dnlm) bZ6.b;
                    dnlg bK6 = bZ3.bK();
                    bK6.getClass();
                    dnlmVar3.b();
                    dnlmVar3.d.add(bK6);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnls dnlsVar3 = (dnls) bZ.b;
                    dnlm bK7 = bZ6.bK();
                    bK7.getClass();
                    dnlsVar3.c();
                    dnlsVar3.f.add(bK7);
                    dokg bZ9 = dokh.d.bZ();
                    if (bZ9.c) {
                        bZ9.bF();
                        bZ9.c = false;
                    }
                    dokh dokhVar = (dokh) bZ9.b;
                    dnls bK8 = bZ.bK();
                    bK8.getClass();
                    dokhVar.b = bK8;
                    dokhVar.a |= 1;
                    final azwc b2 = new azwb(bZ9.bK()).b();
                    return wdhVar.b.c(new Callable(wdhVar, b2) { // from class: wcx
                        private final wdh a;
                        private final azwc b;

                        {
                            this.a = wdhVar;
                            this.b = b2;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            wdh wdhVar2 = this.a;
                            azwc azwcVar = this.b;
                            synchronized (wdhVar2.c) {
                                wdhVar2.c.b(azwcVar);
                                wdhVar2.c.e();
                            }
                            return null;
                        }
                    });
                }
                throw null;
            }
        }, this.f);
    }

    @Override // defpackage.wdt
    public final dehn<Void> b(final String str) {
        btlu j;
        if (rgt.a.containsKey(str) && (j = this.d.j()) != null) {
            this.c.T(rgt.a.get(str), j, true);
        }
        if (rgt.c.contains(str)) {
            return dehk.a;
        }
        final wdh wdhVar = this.a;
        final dbsl dbslVar = new dbsl(str) { // from class: wcy
            private final String a;

            {
                this.a = str;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                String str2 = this.a;
                dcdc<dqvj> dcdcVar = wdh.a;
                return str2.equals(((azwc) obj).g());
            }
        };
        return wdhVar.b.c(new Callable(wdhVar, dbslVar) { // from class: wcz
            private final wdh a;
            private final dbsl b;

            {
                this.a = wdhVar;
                this.b = dbslVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                wdh wdhVar2 = this.a;
                dbsl dbslVar2 = this.b;
                synchronized (wdhVar2.c) {
                    dbsg r = dcbg.b(wdhVar2.c.a()).r(dbslVar2);
                    if (!r.a()) {
                        throw new IllegalStateException("Trip not found in storage");
                    }
                    wdhVar2.c.c((azwc) r.b());
                    wdhVar2.c.e();
                }
                return null;
            }
        });
    }

    @Override // defpackage.wdt
    public final dehn<dcdc<wdp>> c() {
        final wdh wdhVar = this.a;
        final dehn c = wdhVar.b.c(new Callable(wdhVar) { // from class: wda
            private final wdh a;

            {
                this.a = wdhVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                dcdc z;
                final wdh wdhVar2 = this.a;
                synchronized (wdhVar2.c) {
                    z = dcbg.b(wdhVar2.c.a()).s(new dbrn(wdhVar2) { // from class: wde
                        private final wdh a;

                        {
                            this.a = wdhVar2;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            dnki dnkiVar;
                            amvh b;
                            dnki dnkiVar2;
                            dbsg i;
                            dqvj dqvjVar;
                            dnld dnldVar;
                            wdh wdhVar3 = this.a;
                            azwc azwcVar = (azwc) obj;
                            dnls dnlsVar = azwcVar.j().b;
                            if (dnlsVar == null) {
                                dnlsVar = dnls.g;
                            }
                            if (dnlsVar.e.size() == 2) {
                                int i2 = 0;
                                dnkn dnknVar = dnlsVar.e.get(0);
                                domy domyVar = domy.UNKNOWN_TRAVEL_MODE;
                                int a = dnkm.a(dnknVar.b);
                                int i3 = a - 1;
                                dspd dspdVar = null;
                                if (a == 0) {
                                    throw null;
                                }
                                if (i3 == 2) {
                                    if (dnknVar.b == 2) {
                                        dnkiVar = (dnki) dnknVar.c;
                                    } else {
                                        dnkiVar = dnki.f;
                                    }
                                    b = wdh.b(dnkiVar);
                                } else if (i3 != 5) {
                                    if (dnkm.a(dnknVar.b) == 0) {
                                        throw null;
                                    }
                                    return dbpy.a;
                                } else {
                                    b = null;
                                }
                                dnkn dnknVar2 = dnlsVar.e.get(1);
                                int a2 = dnkm.a(dnknVar2.b);
                                int i4 = a2 - 1;
                                if (a2 == 0) {
                                    throw null;
                                }
                                if (i4 != 2) {
                                    if (dnkm.a(dnknVar2.b) == 0) {
                                        throw null;
                                    }
                                    return dbpy.a;
                                }
                                if (dnknVar2.b == 2) {
                                    dnkiVar2 = (dnki) dnknVar2.c;
                                } else {
                                    dnkiVar2 = dnki.f;
                                }
                                amvh b2 = wdh.b(dnkiVar2);
                                if (!rgt.b.contains(azwcVar.g())) {
                                    dbsg<dnlg> c2 = wdh.c(azwcVar);
                                    if (!c2.a()) {
                                        i = dbpy.a;
                                    } else {
                                        int i5 = c2.b().a;
                                        if (i5 == 0) {
                                            i2 = 4;
                                        } else if (i5 == 3) {
                                            i2 = 1;
                                        } else if (i5 == 4) {
                                            i2 = 2;
                                        } else if (i5 == 5) {
                                            i2 = 3;
                                        }
                                        int i6 = i2 - 1;
                                        if (i2 == 0) {
                                            throw null;
                                        }
                                        if (i6 == 0) {
                                            i = dbsg.i(dqvj.TRANSIT);
                                        } else if (i6 != 1) {
                                            i = i6 != 2 ? dbpy.a : dbsg.i(dqvj.TWO_WHEELER);
                                        } else {
                                            i = dbsg.i(dqvj.DRIVE);
                                        }
                                    }
                                    if (i.a()) {
                                        dqvjVar = (dqvj) i.b();
                                    } else {
                                        return dbpy.a;
                                    }
                                } else if (wdhVar3.d.b() == domy.MULTIMODAL) {
                                    return dbpy.a;
                                } else {
                                    int ordinal = wdhVar3.d.b().ordinal();
                                    if (ordinal != 2) {
                                        if (ordinal == 5) {
                                            dqvjVar = dqvj.TWO_WHEELER;
                                        } else if (ordinal != 6) {
                                            dqvjVar = dqvj.DRIVE;
                                        }
                                    }
                                    dqvjVar = dqvj.TRANSIT;
                                }
                                dqvj dqvjVar2 = dqvjVar;
                                if (!wdh.a.contains(dqvjVar2)) {
                                    return dbpy.a;
                                }
                                dcdc e = dcdc.e();
                                if (dqvjVar2 == dqvj.TRANSIT) {
                                    dbsg<dnlg> c3 = wdh.c(azwcVar);
                                    if (!c3.a()) {
                                        return dbpy.a;
                                    }
                                    dnlg b3 = c3.b();
                                    if (b3.a == 3) {
                                        dnldVar = (dnld) b3.b;
                                    } else {
                                        dnldVar = dnld.e;
                                    }
                                    if ((dnldVar.a & 2) != 0) {
                                        dspdVar = dnldVar.c;
                                        e = dcbg.b(dnldVar.d).s(wdd.a).z();
                                    } else {
                                        return dbpy.a;
                                    }
                                }
                                dspd dspdVar2 = dspdVar;
                                String g = azwcVar.g();
                                dbsg i7 = !e.isEmpty() ? dbsg.i(e) : dbpy.a;
                                dnls dnlsVar2 = azwcVar.j().b;
                                if (dnlsVar2 == null) {
                                    dnlsVar2 = dnls.g;
                                }
                                dnlr dnlrVar = dnlsVar2.b;
                                if (dnlrVar == null) {
                                    dnlrVar = dnlr.c;
                                }
                                int a3 = dnlq.a(dnlrVar.b);
                                return dbsg.i(SavedTrip.d(g, SavedTrip.Data.j(b, b2, dqvjVar2, 1, dspdVar2, i7, a3 == 0 ? 1 : a3)));
                            }
                            dnlsVar.e.size();
                            return dbpy.a;
                        }
                    }).o(wdf.a).s(wdg.a).z();
                }
                return z;
            }
        });
        final dehn<dcdc<azva>> m = this.h.m();
        return deha.k(c, m).b(new Callable(this, m, c) { // from class: wcr
            private final wcw a;
            private final dehn b;
            private final dehn c;

            {
                this.a = this;
                this.b = m;
                this.c = c;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                azva azvaVar;
                azva azvaVar2;
                final wcw wcwVar = this.a;
                dehn dehnVar = this.b;
                dehn dehnVar2 = this.c;
                final dcdc dcdcVar = (dcdc) deha.r(dehnVar);
                ArrayList arrayList = new ArrayList();
                dcdc z = dcbg.b(dchl.l((List) deha.r(dehnVar2))).s(new dbrn(wcwVar, dcdcVar) { // from class: wcu
                    private final wcw a;
                    private final dcdc b;

                    {
                        this.a = wcwVar;
                        this.b = dcdcVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        return this.a.j((SavedTrip) obj, this.b);
                    }
                }).z();
                ArrayList arrayList2 = new ArrayList(z);
                btlu j = wcwVar.d.j();
                if (wcwVar.b.b() == domy.DRIVE && j != null) {
                    int size = dcdcVar.size();
                    int i = 0;
                    while (true) {
                        azvaVar = null;
                        if (i >= size) {
                            azvaVar2 = null;
                            break;
                        }
                        azvaVar2 = (azva) dcdcVar.get(i);
                        i++;
                        if (azvaVar2.a == dndr.HOME) {
                            break;
                        }
                    }
                    boolean j2 = dcft.j(z, wcv.a);
                    if (!wcwVar.c.o(bvjk.jO, j, false) && azvaVar2 != null && !j2) {
                        arrayList2.add(wcw.e(azvaVar2, "commute_to_home_synthesized"));
                    }
                    int size2 = dcdcVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size2) {
                            break;
                        }
                        azva azvaVar3 = (azva) dcdcVar.get(i2);
                        i2++;
                        if (azvaVar3.a == dndr.WORK) {
                            azvaVar = azvaVar3;
                            break;
                        }
                    }
                    boolean j3 = dcft.j(z, wcp.a);
                    if (!wcwVar.c.o(bvjk.jN, j, false) && azvaVar != null && !j3) {
                        arrayList2.add(wcw.e(azvaVar, "commute_to_work_synthesized"));
                    }
                }
                int size3 = arrayList2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    final SavedTrip savedTrip = (SavedTrip) arrayList2.get(i3);
                    dbsg r = dcbg.b(arrayList).r(new dbsl(savedTrip) { // from class: wcs
                        private final SavedTrip a;

                        {
                            this.a = savedTrip;
                        }

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj) {
                            return ((wdo) obj).a().e(this.a.b().b(), 1.0d);
                        }
                    });
                    if (!r.a()) {
                        amvh b = savedTrip.b().b();
                        wdk wdkVar = new wdk();
                        if (b != null) {
                            wdkVar.a = b;
                            wdkVar.d(savedTrip);
                            arrayList.add(wdkVar);
                        } else {
                            throw new NullPointerException("Null destination");
                        }
                    } else {
                        ((wdo) r.b()).d(savedTrip);
                    }
                }
                return dcbg.b(arrayList).s(wcq.a).z();
            }
        }, this.f);
    }

    @Override // defpackage.wdt
    public final void f() {
        this.c.Z(bvjk.kv, this.c.w(bvjk.ku, 0L));
    }

    @Override // defpackage.wdt
    public final boolean g() {
        long w = this.c.w(bvjk.ku, 0L);
        return (w == 0 || w == this.c.w(bvjk.kv, 0L)) ? false : true;
    }

    @Override // defpackage.wdt
    public final boolean h() {
        return this.c.w(bvjk.ku, -1L) != -1;
    }

    @Override // defpackage.wdt
    public final boolean i() {
        return this.c.w(bvjk.kv, 0L) != 0;
    }

    public final SavedTrip j(SavedTrip savedTrip, dcdc<azva> dcdcVar) {
        wdq c = savedTrip.c();
        SavedTrip.Data b = savedTrip.b();
        wdr a = c.a();
        amvh a2 = b.a();
        if (a2 != null) {
            a.c(k(a2, dcdcVar));
        }
        a.b(k(b.b(), dcdcVar));
        return c.b();
    }
}
