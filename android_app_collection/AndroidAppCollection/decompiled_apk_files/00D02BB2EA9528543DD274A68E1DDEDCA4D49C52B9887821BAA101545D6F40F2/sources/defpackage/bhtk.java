package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bhtk  reason: default package */
/* loaded from: classes3.dex */
public class bhtk implements bhsc {
    private static final dcqe m = dcqe.c("bhtk");
    private final blnq A;
    private final bhsk B;
    private final bhhf C;
    private final boolean D;
    private final View.OnClickListener E;
    public final ff f;
    public final bvrb g;
    public final dxio<bbut> h;
    public final dxio<bhng> i;
    public final ccst j;
    public final btvo k;
    public final cjtd l;
    @dzsi
    private bhrz p;
    @dzsi
    private bhrx q;
    private final butl r;
    private final bvds s;
    private final dxio<cclq> t;
    private final bhtj u;
    private final ccrf v;
    private final anhk w;
    private final bvpe x;
    private final cclp y;
    private final huc z;
    public ccln a = ccln.p;
    private ccxa n = ccxa.f;
    public bwrs<ilo> b = bwrs.a(null);
    public boolean c = false;
    public boolean d = false;
    private List<bhsb> o = dcdc.e();
    public dcdc<blla> e = dcdc.e();

    public bhtk(cqhn cqhnVar, bvrb bvrbVar, butl butlVar, bvds bvdsVar, ff ffVar, dxio<cclq> dxioVar, final isd isdVar, dxio<bbut> dxioVar2, dxio<bhng> dxioVar3, ccrf ccrfVar, ccst ccstVar, anhk anhkVar, bvjj bvjjVar, btvo btvoVar, bvpe bvpeVar, cclp cclpVar, huc hucVar, blnq blnqVar, bhsk bhskVar, bhhf bhhfVar, bhtj bhtjVar) {
        cjtd cjtdVar;
        boolean z = false;
        this.g = bvrbVar;
        this.r = butlVar;
        this.s = bvdsVar;
        this.f = ffVar;
        this.t = dxioVar;
        this.h = dxioVar2;
        this.i = dxioVar3;
        this.v = ccrfVar;
        this.j = ccstVar;
        this.w = anhkVar;
        this.k = btvoVar;
        this.x = bvpeVar;
        this.y = cclpVar;
        this.z = hucVar;
        this.A = blnqVar;
        this.B = bhskVar;
        this.C = bhhfVar;
        boolean m2 = bvjjVar.m(bvjk.kg, false);
        this.D = m2;
        if (M(btvoVar)) {
            this.q = L(dcdc.e(), bvpeVar, hucVar, (m2 || btvoVar.getPlaceOfferingsParametersWithoutLogging().i) ? true : z, this.b);
        } else {
            this.p = K(dcdc.e(), bvpeVar, hucVar);
        }
        this.u = bhtjVar;
        this.E = new View.OnClickListener(this, isdVar) { // from class: bhso
            private final bhtk a;
            private final isd b;

            {
                this.a = this;
                this.b = isdVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final bhtk bhtkVar = this.a;
                isc a = this.b.a(view);
                Resources resources = view.getResources();
                dccx F = dcdc.F();
                if (bhtkVar.h().booleanValue()) {
                    jhm jhmVar = new jhm();
                    jhmVar.a = resources.getString(R.string.OFFERING_DETAILS_ADD_A_PHOTO);
                    jhmVar.d(new View.OnClickListener(bhtkVar) { // from class: bhsu
                        private final bhtk a;

                        {
                            this.a = bhtkVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            this.a.d();
                        }
                    });
                    F.g(jhmVar.c());
                }
                jhm jhmVar2 = new jhm();
                jhmVar2.a = resources.getString(R.string.OFFERING_DETAILS_SUGGEST_AN_EDIT_LABEL);
                jhmVar2.d(new View.OnClickListener(bhtkVar) { // from class: bhsv
                    private final bhtk a;

                    {
                        this.a = bhtkVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.a.e();
                    }
                });
                F.g(jhmVar2.c());
                a.a(F.f());
                a.show();
            }
        };
        ilo c = this.b.c();
        if (c != null) {
            cjta c2 = cjtd.c(c.ca());
            c2.d = dtxx.N;
            cjtdVar = c2.a();
        } else {
            cjtdVar = cjtd.b;
        }
        this.l = cjtdVar;
    }

    private final void J(Runnable runnable) {
        this.t.a().m(runnable, this.g.h());
    }

    private static bhrz K(dcdc<bhsl> dcdcVar, bvpe bvpeVar, huc hucVar) {
        return new bhsn(dcdcVar, bvpeVar, hucVar);
    }

    private static bhrx L(dcdc<bhsl> dcdcVar, bvpe bvpeVar, huc hucVar, boolean z, bwrs<ilo> bwrsVar) {
        return new bhse(dcdcVar, bvpeVar, hucVar, z, bwrsVar);
    }

    private static boolean M(btvo btvoVar) {
        return btvoVar.getPlaceOfferingsParameters().h();
    }

    public ccln A() {
        return this.a;
    }

    public ccxa B() {
        return this.n;
    }

    public void C(String str) {
        ccln cclnVar = this.a;
        dsqp dsqpVar = (dsqp) cclnVar.cu(5);
        dsqpVar.bC(cclnVar);
        cclm cclmVar = (cclm) dsqpVar;
        if (cclmVar.c) {
            cclmVar.bF();
            cclmVar.c = false;
        }
        ccln cclnVar2 = (ccln) cclmVar.b;
        ccln cclnVar3 = ccln.p;
        str.getClass();
        cclnVar2.a |= 8;
        cclnVar2.f = str;
        this.a = cclmVar.bK();
        cqkx.p(this);
    }

    public final dcdc<blla> D(Iterable<docg> iterable) {
        dccx dccxVar = new dccx();
        int i = 0;
        for (docg docgVar : iterable) {
            if ((docgVar.a & 16) != 0 && docgVar.r.toLowerCase().contains(this.a.f.toLowerCase())) {
                blnp a = this.A.a(cdjk.OFFERING_DETAILS, false);
                a.s(cdrr.q(docgVar, dqgr.PUBLISHED), this.b, i, this.a.f, dbpy.a);
                dccxVar.g(a);
                i++;
            }
        }
        return dccxVar.f();
    }

    public final void E(List<dwfl> list) {
        dccx dccxVar = new dccx();
        dccxVar.i(this.o);
        for (int i = 0; i < list.size(); i++) {
            dwfl dwflVar = list.get(i);
            dccxVar.g(new bhti(this, new jic(dwflVar.h, jfv.b(dwflVar), ibm.h(), 250), this.o.size() + i));
        }
        this.o = dccxVar.f();
    }

    public void F() {
        dwfs d = cknx.d(false, false, false);
        dicn bZ = dico.h.bZ();
        String str = this.n.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dico dicoVar = (dico) bZ.b;
        str.getClass();
        dicoVar.a |= 2;
        dicoVar.e = str;
        String str2 = this.a.d;
        str2.getClass();
        dicoVar.b = 12;
        dicoVar.c = str2;
        dwfv bK = d.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dico dicoVar2 = (dico) bZ.b;
        bK.getClass();
        dicoVar2.f = bK;
        dicoVar2.a |= 16;
        dnwb a = this.w.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dico dicoVar3 = (dico) bZ.b;
        a.getClass();
        dicoVar3.g = a;
        dicoVar3.a |= 32;
        if (this.n.d.isEmpty()) {
            bvoo.h("Place mid was missing on offering details request with feature id: %s", this.n.b);
        } else {
            String str3 = this.n.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dico dicoVar4 = (dico) bZ.b;
            str3.getClass();
            dicoVar4.a = 1 | dicoVar4.a;
            dicoVar4.d = str3;
        }
        bvds bvdsVar = this.s;
        ccts cctsVar = new ccts(new bvqg(this) { // from class: bhtg
            private final bhtk a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                bhtk bhtkVar = this.a;
                dicq dicqVar = (dicq) obj;
                if ((dicqVar.a & 1) != 0) {
                    dbrn<djul, ccln> dbrnVar = cclt.a;
                    djul djulVar = dicqVar.b;
                    if (djulVar == null) {
                        djulVar = djul.o;
                    }
                    ccln a2 = dbrnVar.a(djulVar);
                    bhtkVar.d = true;
                    HashMap hashMap = new HashMap();
                    for (dwfl dwflVar : a2.i) {
                        hashMap.put(dwflVar.d, dwflVar);
                    }
                    for (int i = 0; i < bhtkVar.a.i.size(); i++) {
                        if (hashMap.containsKey(bhtkVar.a.i.get(i).d)) {
                            ccln cclnVar = bhtkVar.a;
                            dsqp dsqpVar = (dsqp) cclnVar.cu(5);
                            dsqpVar.bC(cclnVar);
                            cclm cclmVar = (cclm) dsqpVar;
                            dwfl dwflVar2 = (dwfl) hashMap.get(bhtkVar.a.i.get(i).d);
                            dbsk.s(dwflVar2);
                            if (cclmVar.c) {
                                cclmVar.bF();
                                cclmVar.c = false;
                            }
                            ccln cclnVar2 = (ccln) cclmVar.b;
                            dwflVar2.getClass();
                            cclnVar2.b();
                            cclnVar2.i.set(i, dwflVar2);
                            bhtkVar.a = cclmVar.bK();
                        }
                    }
                    dcep B = dcbg.b(bhtkVar.a.i).o(bhsp.a).s(bhsq.a).B();
                    dccx dccxVar = new dccx();
                    for (String str4 : hashMap.keySet()) {
                        if (!B.contains(str4)) {
                            dccxVar.g((dwfl) hashMap.get(str4));
                        }
                    }
                    bhtkVar.E(dccxVar.f());
                    dsqp dsqpVar2 = (dsqp) a2.cu(5);
                    dsqpVar2.bC(a2);
                    cclm cclmVar2 = (cclm) dsqpVar2;
                    if (cclmVar2.c) {
                        cclmVar2.bF();
                        cclmVar2.c = false;
                    }
                    ((ccln) cclmVar2.b).i = ccln.ck();
                    cclmVar2.a(bhtkVar.a.i);
                    cclmVar2.a(dccxVar.f());
                    bhtkVar.a = cclmVar2.bK();
                    bhtkVar.g.h().execute(new Runnable(bhtkVar) { // from class: bhsz
                        private final bhtk a;

                        {
                            this.a = bhtkVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            cqkx.p(this.a);
                        }
                    });
                }
            }
        }, new bvqg() { // from class: bhth
            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                btzy btzyVar = (btzy) obj;
            }
        });
        Executor g = this.g.g(bvrj.BACKGROUND_THREADPOOL);
        dbsk.s(g);
        bvdsVar.b(bZ.bK(), cctsVar, g);
    }

    public void G() {
        if (!b().isEmpty()) {
            String b = b();
            this.c = true;
            djus bZ = djuv.i.bZ();
            String str = this.n.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djuv djuvVar = (djuv) bZ.b;
            str.getClass();
            djuvVar.a |= 1;
            djuvVar.b = str;
            djuv.b(djuvVar);
            djuu djuuVar = djuu.NEWEST_FIRST;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djuv djuvVar2 = (djuv) bZ.b;
            djuvVar2.d = djuuVar.f;
            int i = djuvVar2.a | 8;
            djuvVar2.a = i;
            b.getClass();
            djuvVar2.a = i | 128;
            djuvVar2.g = b;
            dnqh dnqhVar = dnqh.p;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djuv djuvVar3 = (djuv) bZ.b;
            dnqhVar.getClass();
            djuvVar3.e = dnqhVar;
            djuvVar3.a |= 16;
            djuv bK = bZ.bK();
            dwhk bZ2 = dwhl.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dwhl dwhlVar = (dwhl) bZ2.b;
            bK.getClass();
            dwhlVar.b = bK;
            dwhlVar.a |= 1;
            butl butlVar = this.r;
            ccts cctsVar = new ccts(new bvqg(this) { // from class: bhsr
                private final bhtk a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    final bhtk bhtkVar = this.a;
                    djux djuxVar = ((dwhn) obj).a;
                    if (djuxVar == null) {
                        djuxVar = djux.c;
                    }
                    bhtkVar.e = bhtkVar.D(djuxVar.a);
                    bhtkVar.c = false;
                    bhtkVar.g.h().execute(new Runnable(bhtkVar) { // from class: bhsx
                        private final bhtk a;

                        {
                            this.a = bhtkVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            cqkx.p(this.a);
                        }
                    });
                }
            }, new bvqg(this) { // from class: bhss
                private final bhtk a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    final bhtk bhtkVar = this.a;
                    btzy btzyVar = (btzy) obj;
                    bhtkVar.c = false;
                    bhtkVar.g.h().execute(new Runnable(bhtkVar) { // from class: bhsw
                        private final bhtk a;

                        {
                            this.a = bhtkVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            cqkx.p(this.a);
                        }
                    });
                }
            });
            Executor g = this.g.g(bvrj.BACKGROUND_THREADPOOL);
            dbsk.s(g);
            butlVar.b(bZ2.bK(), cctsVar, g);
        }
    }

    public boolean H() {
        return this.d;
    }

    public final void I(int i) {
        ccln cclnVar = this.a;
        dsqp dsqpVar = (dsqp) cclnVar.cu(5);
        dsqpVar.bC(cclnVar);
        cclm cclmVar = (cclm) dsqpVar;
        int a = draz.a(this.a.k);
        final int i2 = 1;
        if (a == 0) {
            a = 1;
        }
        if (i == a) {
            i = 1;
        }
        if (cclmVar.c) {
            cclmVar.bF();
            cclmVar.c = false;
        }
        ccln cclnVar2 = (ccln) cclmVar.b;
        cclnVar2.k = i - 1;
        cclnVar2.a |= 128;
        this.a = cclmVar.bK();
        cqkx.p(this);
        int a2 = draz.a(this.a.k);
        if (a2 != 0) {
            i2 = a2;
        }
        deha.q(this.v.a(new dbty(this, i2) { // from class: bhte
            private final bhtk a;
            private final int b;

            {
                this.a = this;
                this.b = i2;
            }

            @Override // defpackage.dbty
            public final Object a() {
                bhtk bhtkVar = this.a;
                int i3 = this.b;
                ccst ccstVar = bhtkVar.j;
                String str = bhtkVar.a.d;
                ilo c = bhtkVar.b.c();
                dbsk.s(c);
                return ccstVar.d(str, c, i3);
            }
        }), bvqj.b(new bvqg(this, i2) { // from class: bhtf
            private final bhtk a;
            private final int b;

            {
                this.a = this;
                this.b = i2;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                bhtk bhtkVar = this.a;
                if (this.b != 1) {
                    ff ffVar = bhtkVar.f;
                    cjxu.m(ffVar, ffVar.getString(R.string.OFFERING_DETAILS_RECOMMENDATION_THANK_YOU_TOAST));
                }
            }
        }), this.g.h());
    }

    @Override // defpackage.bhsc
    public String a() {
        return this.n.e;
    }

    @Override // defpackage.bhsc
    public String b() {
        return this.a.f;
    }

    @Override // defpackage.bhsc
    public cqkl c() {
        if (this.a.f.isEmpty() && !g().booleanValue()) {
            final bhtj bhtjVar = this.u;
            bhtjVar.getClass();
            J(new Runnable(bhtjVar) { // from class: bhsy
                private final bhtj a;

                {
                    this.a = bhtjVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.g();
                }
            });
        }
        return cqkl.a;
    }

    @Override // defpackage.bhsc
    public cqkl d() {
        if (h().booleanValue()) {
            final bhtj bhtjVar = this.u;
            bhtjVar.getClass();
            J(new Runnable(bhtjVar) { // from class: bhta
                private final bhtj a;

                {
                    this.a = bhtjVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.q();
                }
            });
        }
        return cqkl.a;
    }

    @Override // defpackage.bhsc
    public cqkl e() {
        final bhtj bhtjVar = this.u;
        bhtjVar.getClass();
        J(new Runnable(bhtjVar) { // from class: bhtb
            private final bhtj a;

            {
                this.a = bhtjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.i();
            }
        });
        return cqkl.a;
    }

    @Override // defpackage.bhsc
    public View.OnClickListener f() {
        return this.E;
    }

    @Override // defpackage.bhsc
    public Boolean g() {
        return Boolean.valueOf(!this.k.getUgcOfferingsParameters().a());
    }

    @Override // defpackage.bhsc
    public Boolean h() {
        boolean z = false;
        if (!g().booleanValue() && !this.a.f.isEmpty() && !this.C.b(this.b)) {
            ilo c = this.b.c();
            dbsk.s(c);
            if (c.aX(this.k.getEnableFeatureParameters())) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bhsc
    public Boolean i() {
        return Boolean.valueOf(this.a.i.size() > 0);
    }

    @Override // defpackage.bhsc
    public Boolean j() {
        boolean z = false;
        if (!g().booleanValue() && this.k.getUgcOfferingsParameters().j()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bhsc
    public Boolean k() {
        return Boolean.valueOf(!this.e.isEmpty());
    }

    @Override // defpackage.bhsc
    public Integer l() {
        return Integer.valueOf(this.a.g);
    }

    @Override // defpackage.bhsc
    public Integer m() {
        return Integer.valueOf(this.a.h);
    }

    @Override // defpackage.bhsc
    public Iterable<bhsb> n() {
        return this.o;
    }

    @Override // defpackage.bhsc
    @dzsi
    public bhrz o() {
        return this.p;
    }

    @Override // defpackage.bhsc
    @dzsi
    public bhrx p() {
        return this.q;
    }

    @Override // defpackage.bhsc
    public cqkl q() {
        this.u.w();
        return cqkl.a;
    }

    @Override // defpackage.bhsc
    public Iterable<blla> r() {
        return this.e;
    }

    @Override // defpackage.bhsc
    public cqkl s() {
        J(new Runnable(this) { // from class: bhtc
            private final bhtk a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.I(2);
            }
        });
        return cqkl.a;
    }

    @Override // defpackage.bhsc
    public cqkl t() {
        J(new Runnable(this) { // from class: bhtd
            private final bhtk a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.I(3);
            }
        });
        return cqkl.a;
    }

    @Override // defpackage.bhsc
    public Boolean u() {
        int a = draz.a(this.a.k);
        return Boolean.valueOf(a != 0 && a == 2);
    }

    @Override // defpackage.bhsc
    public Boolean v() {
        int a = draz.a(this.a.k);
        return Boolean.valueOf(a != 0 && a == 3);
    }

    @Override // defpackage.bhsc
    public Boolean w() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.bhsc
    public View.OnAttachStateChangeListener x() {
        return this.x.b;
    }

    @Override // defpackage.bhsc
    public Boolean y() {
        return false;
    }

    public void z(ccln cclnVar, bwrs<ilo> bwrsVar, dcdc<docg> dcdcVar) {
        this.a = cclnVar;
        E(cclnVar.i);
        ilo c = bwrsVar.c();
        dbsk.s(c);
        this.n = cclt.a(c);
        this.e = D(dcdcVar);
        this.b = bwrsVar;
        this.y.a(bwrsVar);
        bhsk bhskVar = this.B;
        cclp cclpVar = this.y;
        dgfb dgfbVar = dgfb.DISH;
        bvqg<ccln> bvqgVar = new bvqg(this) { // from class: bhst
            private final bhtk a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                bhtk bhtkVar = this.a;
                bhtkVar.i.a().a((ccln) obj, bhtkVar.b);
            }
        };
        final ccln cclnVar2 = this.a;
        dcdc<bhsl> b = bhskVar.b(dcbg.b(cclpVar.b(dgfbVar)).o(new dbsl(cclnVar2) { // from class: bhsj
            private final ccln a;

            {
                this.a = cclnVar2;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return !((ccln) obj).d.equals(this.a.d);
            }
        }).z(), bvqgVar);
        if (M(this.k)) {
            bvpe bvpeVar = this.x;
            huc hucVar = this.z;
            boolean z = true;
            if (!this.D && !this.k.getPlaceOfferingsParametersWithoutLogging().i) {
                z = false;
            }
            this.q = L(b, bvpeVar, hucVar, z, bwrsVar);
            return;
        }
        this.p = K(b, this.x, this.z);
    }
}
