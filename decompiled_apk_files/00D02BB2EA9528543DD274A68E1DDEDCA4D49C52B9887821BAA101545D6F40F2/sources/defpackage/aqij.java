package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aqij  reason: default package */
/* loaded from: classes2.dex */
public final class aqij extends hxf {
    private static final dcqe ax = dcqe.c("aqij");
    private apzb aA;
    @dzsi
    private cuss<Pair<dcdc<cufw>, Boolean>> aB;
    @dzsi
    private cusr<Pair<dcdc<cufw>, Boolean>> aC;
    @dzsi
    private crzp<apsi<dbsg<apzn>>> aO;
    @dzsi
    private btlu aP;
    @dzsi
    private crzm<apsi<dbsg<apzn>>> aQ;
    @dzsi
    private crzp<apsi<dbsg<apsg>>> aR;
    @dzsi
    private crzm<apsi<dbsg<apsg>>> aS;
    private boolean aT;
    private boolean aU;
    public aqhy ad;
    public aqrp ae;
    public dxio<aprv> af;
    public dxio<apyv> ag;
    public dxio<apyz> ah;
    public dxio<cjot> ai;
    public dxio<apyu> aj;
    public dxio<akfa> ak;
    public dxio<aqav> al;
    public dxio<aqgo> am;
    public dxio<aqru> an;
    public dxio<aqci> ao;
    public dxio<cpv> ap;
    public dxio<aqwq> aq;
    public dxio<aqpe> ar;
    @dzsi
    public String as;
    @dzsi
    public String at;
    @dzsi
    public String au;
    @dzsi
    public apzn av;
    public boolean aw;
    @dzsi
    private aqpb ay;
    @dzsi
    private cqkf<aqow> az;
    public acyp b;
    public apzy c;
    public gga d;
    public cqkj e;
    public efg f;
    public aqpc g;

    private final synchronized void aU() {
        if (!bp(this.aP)) {
            return;
        }
        if (dbsj.d(this.au)) {
            bvoo.h("Cannot subscribe: found null businessListingId", new Object[0]);
            return;
        }
        btlu btluVar = this.aP;
        dbsk.s(btluVar);
        if (this.aQ == null && this.aO == null) {
            String str = this.au;
            dbsk.s(str);
            this.aQ = this.aj.a().b(str, btluVar);
            crzp<apsi<dbsg<apzn>>> crzpVar = new crzp(this) { // from class: aqia
                private final aqij a;

                {
                    this.a = this;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    aqij aqijVar = this.a;
                    apsi apsiVar = (apsi) crzmVar.l();
                    if (apsiVar != null) {
                        int b = apsiVar.b();
                        if (b == 0) {
                            throw null;
                        }
                        if (b == 1) {
                            return;
                        }
                        aqijVar.av = (apzn) ((dbsg) apsiVar.a()).f();
                        aqijVar.aR();
                    }
                }
            };
            this.aO = crzpVar;
            this.aQ.d(crzpVar, dege.a);
        }
        if (this.aS == null && this.aR == null) {
            String str2 = this.au;
            dbsk.s(str2);
            this.aS = this.af.a().e(str2, btluVar);
            crzp<apsi<dbsg<apsg>>> crzpVar2 = new crzp(this) { // from class: aqib
                private final aqij a;

                {
                    this.a = this;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    apsg apsgVar;
                    final aqij aqijVar = this.a;
                    apsi apsiVar = (apsi) crzmVar.l();
                    if (apsiVar == null || (apsgVar = (apsg) ((dbsg) apsiVar.a()).f()) == null) {
                        return;
                    }
                    String b = apsgVar.b();
                    String c = apsgVar.c();
                    if (b.equals(aqijVar.as) && c.equals(aqijVar.at)) {
                        return;
                    }
                    dbsg<ModAppBar> w = aqijVar.w();
                    if (!b.equals(aqijVar.as) && w.a()) {
                        aqijVar.w().b().announceForAccessibility(b);
                    }
                    aqijVar.as = b;
                    aqijVar.at = c;
                    aqijVar.d.runOnUiThread(new Runnable(aqijVar) { // from class: aqif
                        private final aqij a;

                        {
                            this.a = aqijVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            aqij aqijVar2 = this.a;
                            aqijVar2.q(aqijVar2.aS());
                        }
                    });
                }
            };
            this.aR = crzpVar2;
            this.aS.d(crzpVar2, dege.a);
        }
        aqpb aqpbVar = this.ay;
        if (aqpbVar == null) {
            return;
        }
        aqpbVar.n(new dbrn(this) { // from class: aqic
            private final aqij a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                this.a.aT((ctyy) obj);
                return null;
            }
        });
    }

    private final synchronized void aV() {
        crzp<apsi<dbsg<apsg>>> crzpVar;
        crzp<apsi<dbsg<apzn>>> crzpVar2;
        crzm<apsi<dbsg<apzn>>> crzmVar = this.aQ;
        if (crzmVar != null && (crzpVar2 = this.aO) != null) {
            crzmVar.c(crzpVar2);
        }
        this.aQ = null;
        this.aO = null;
        crzm<apsi<dbsg<apsg>>> crzmVar2 = this.aS;
        if (crzmVar2 != null && (crzpVar = this.aR) != null) {
            crzmVar2.c(crzpVar);
        }
        this.aS = null;
        this.aR = null;
        aqpb aqpbVar = this.ay;
        if (aqpbVar != null) {
            aqpbVar.n(null);
        }
        aX();
    }

    private final synchronized void aX() {
        cusr<Pair<dcdc<cufw>, Boolean>> cusrVar;
        cuss<Pair<dcdc<cufw>, Boolean>> cussVar = this.aB;
        if (cussVar != null && (cusrVar = this.aC) != null) {
            cussVar.g(cusrVar);
        }
        this.aB = null;
        this.aC = null;
    }

    private final void bn() {
        Bundle bundle = this.o;
        if (bundle == null) {
            return;
        }
        this.as = bundle.getString("kt");
        this.at = bundle.getString("ks");
        this.au = bundle.getString("ksli");
        this.aT = bundle.getBoolean("koiotb");
        this.aA = apzb.a(bundle.getInt("kept"));
    }

    private static boolean bo(apzn apznVar) {
        return !apznVar.e() && apznVar.c() == 3;
    }

    private static boolean bp(@dzsi btlu btluVar) {
        return btluVar != null && btluVar.l();
    }

    @Override // defpackage.ges
    protected final void Nv() {
        ((aqik) btsx.b(aqik.class, this)).cc(this);
    }

    @Override // defpackage.ges
    public final void Oo(View view) {
        if (w().a()) {
            this.ap.a().c(w().b(), 8);
        } else {
            this.ap.a().a(view);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        aV();
        this.aw = false;
        this.aU = false;
        this.av = null;
        cqkf<aqow> cqkfVar = this.az;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        this.az = null;
    }

    public final void aR() {
        final String str;
        apzn apznVar;
        Context H;
        String string;
        cqtd g;
        aqpb aqpbVar = this.ay;
        if (aqpbVar == null || (str = this.au) == null || (apznVar = this.av) == null || (H = H()) == null) {
            return;
        }
        String str2 = null;
        final boolean z = false;
        if ((aqjg.h(apznVar) || bo(apznVar)) && this.aw) {
            this.aU = true;
            boolean bo = bo(apznVar);
            if (this.c.i(this.aP) && !bo) {
                z = true;
            }
            if (z) {
                string = H.getString(R.string.LEARN_MORE);
            } else {
                string = H.getString(R.string.BANNER_ENABLE_BUSINESS_MESSAGING_ACTION);
            }
            aqeb p = aqec.p();
            if (bo) {
                str2 = H.getString(R.string.MERCHANT_MESSAGING_ENABLE_MESSAGING_TITLE);
            }
            aqdk aqdkVar = (aqdk) p;
            aqdkVar.a = str2;
            aqdkVar.b = H.getString(true != bo ? R.string.BANNER_INACTIVE_TEXT : R.string.MERCHANT_MESSAGING_ENABLE_MESSAGING_BODY_TEXT);
            aqdkVar.i = aqdb.a(z ? dtxv.cd : dtxv.bQ, str).a();
            p.b(string);
            if (z) {
                g = cqrt.g(2131232300, ibm.b());
            } else {
                g = cqrt.g(2131232197, ibm.b());
            }
            aqdkVar.c = g;
            aqdkVar.d = new Runnable(this, z, str) { // from class: aqig
                private final aqij a;
                private final boolean b;
                private final String c;

                {
                    this.a = this;
                    this.b = z;
                    this.c = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    aqij aqijVar = this.a;
                    boolean z2 = this.b;
                    String str3 = this.c;
                    if (z2) {
                        aqijVar.ah.a().G(str3);
                    } else {
                        aqijVar.an.a().a(str3);
                    }
                }
            };
            aqdkVar.e = aqdb.a(z ? dtxv.ce : dtxv.bS, str).a();
            aqdkVar.f = z ? "" : H.getString(R.string.LEARN_MORE);
            aqdkVar.g = new Runnable(this) { // from class: aqih
                private final aqij a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.ao.a().a();
                }
            };
            aqdkVar.h = aqdb.a(dtxv.bR, str).a();
            aqpbVar.o(p.a());
            return;
        }
        if (this.aP != null && !dbsj.d(this.as) && apznVar.e() && !apznVar.b()) {
            btlu btluVar = this.aP;
            dbsk.s(btluVar);
            if (!this.aq.a().d(btluVar, str)) {
                this.aU = true;
                btlu btluVar2 = this.aP;
                dbsk.s(btluVar2);
                String str3 = this.as;
                dbsk.s(str3);
                aqpbVar.o(this.ar.a().a(btluVar2, str3, str, new Runnable(this) { // from class: aqii
                    private final aqij a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.aR();
                    }
                }));
                return;
            }
        }
        if (!this.aU) {
            return;
        }
        this.aU = false;
        aqpbVar.o(null);
    }

    public final jib aS() {
        jhz e = jib.g(this.d, dbsj.e(this.as)).e();
        e.b = dbsj.e(this.at);
        e.v = ibm.o();
        e.o = cjtd.a(dtxv.dA);
        if (this.ag.a().a()) {
            jhm a = jhm.a();
            a.a = this.d.getString(R.string.UPDATES_MESSAGING_SETTINGS_ENTRYPOINT);
            a.c = cqrt.f(2131232419);
            a.b = this.d.getString(R.string.UPDATES_MESSAGING_SETTINGS_ENTRYPOINT);
            a.h = 1;
            a.d(new View.OnClickListener(this) { // from class: aqhz
                private final aqij a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aqij aqijVar = this.a;
                    String str = aqijVar.au;
                    dbsk.s(str);
                    aqijVar.ah.a().F(str, dbsj.e(aqijVar.as), dbsj.e(aqijVar.at), ddce.CONVERSATION_LIST_PAGE);
                }
            });
            e.c(a.c());
        }
        return e.b();
    }

    public final synchronized void aT(ctyy ctyyVar) {
        final String str = this.au;
        if (str == null) {
            return;
        }
        aX();
        this.aB = this.al.a().d().b(ctyyVar, 1, 0, new dbsl(this, str) { // from class: aqid
            private final aqij a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                aqij aqijVar = this.a;
                String str2 = this.b;
                return aqijVar.am.a().a((cufw) obj, str2);
            }
        });
        cusr<Pair<dcdc<cufw>, Boolean>> cusrVar = new cusr(this) { // from class: aqie
            private final aqij a;

            {
                this.a = this;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                aqij aqijVar = this.a;
                aqijVar.aw = !((dcdc) ((Pair) obj).first).isEmpty();
                aqijVar.aR();
            }
        };
        this.aC = cusrVar;
        this.aB.q(cusrVar);
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        aqpb aqpbVar;
        if (this.aT) {
            if (this.b.a() && (aqpbVar = this.ay) != null) {
                dbsg<ctyy> p = aqpbVar.p();
                if (p.a()) {
                    dbsk.l(aqda.d(p.b()) == 2);
                    cjot a = this.ai.a();
                    apzu bZ = apzv.c.bZ();
                    apzq bZ2 = apzt.e.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    apzt apztVar = (apzt) bZ2.b;
                    apztVar.b = 2;
                    apztVar.a |= 1;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    apzv apzvVar = (apzv) bZ.b;
                    apzt bK = bZ2.bK();
                    bK.getClass();
                    apzvVar.b = bK;
                    apzvVar.a |= 1;
                    a.b(bZ.bK());
                    return true;
                }
            }
            this.ah.a().f();
            return true;
        }
        return false;
    }

    @Override // defpackage.hxf
    protected final jib g() {
        bn();
        if (this.as == null || this.at == null) {
            bvoo.h("Invalid state: found null title or subtitle", new Object[0]);
        }
        Context H = H();
        if (dbsj.d(this.as) && H != null) {
            this.as = H.getString(R.string.MESSAGING_INBOX_TITLE);
        }
        return aS();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        bn();
        this.az = this.e.e(new aqot());
        if (dbsj.d(this.au)) {
            bvoo.h("Invalid state: found null businessListingId", new Object[0]);
            cqkf<aqow> cqkfVar = this.az;
            dbsk.s(cqkfVar);
            return cqkfVar.c();
        }
        btlu j = this.ak.a().j();
        this.aP = j;
        if (!bp(j)) {
            cqkf<aqow> cqkfVar2 = this.az;
            dbsk.s(cqkfVar2);
            return cqkfVar2.c();
        }
        btlu btluVar = this.aP;
        dbsk.s(btluVar);
        aqpc aqpcVar = this.g;
        aqhy aqhyVar = this.ad;
        apzb apzbVar = this.aA;
        String str = this.au;
        dbsk.s(str);
        dxio a = ((dxjh) aqhyVar.a).a();
        aqhy.a(a, 1);
        dxio a2 = ((dxjh) aqhyVar.b).a();
        aqhy.a(a2, 2);
        aqhy.a(btluVar, 3);
        aqhy.a(apzbVar, 4);
        aqhy.a(str, 5);
        aqhx aqhxVar = new aqhx(a, a2, btluVar, apzbVar, str);
        gga a3 = aqpcVar.a.a();
        aqpc.a(a3, 1);
        cqhn a4 = aqpcVar.b.a();
        aqpc.a(a4, 2);
        bvrb a5 = aqpcVar.c.a();
        aqpc.a(a5, 3);
        aqeh a6 = aqpcVar.d.a();
        aqpc.a(a6, 4);
        aqov a7 = aqpcVar.e.a();
        aqpc.a(a7, 5);
        dxio a8 = ((dxjh) aqpcVar.f).a();
        aqpc.a(a8, 6);
        dxio a9 = ((dxjh) aqpcVar.g).a();
        aqpc.a(a9, 7);
        aqpc.a(this, 8);
        aqpc.a(aqhxVar, 9);
        this.ay = new aqpb(a3, a4, a5, a6, a7, a8, a9, this, aqhxVar);
        cqkf<aqow> cqkfVar3 = this.az;
        dbsk.s(cqkfVar3);
        cqkfVar3.e(this.ay);
        cqkf<aqow> cqkfVar4 = this.az;
        dbsk.s(cqkfVar4);
        return cqkfVar4.c();
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        View view = this.P;
        if (view == null) {
            return;
        }
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.f(false);
        egjVar.w(view);
        egjVar.e(this);
        egjVar.j(false);
        this.f.a(egjVar.a());
        aqpb aqpbVar = this.ay;
        if (aqpbVar != null) {
            aqpbVar.m();
        }
        this.ae.b();
        aU();
    }
}
