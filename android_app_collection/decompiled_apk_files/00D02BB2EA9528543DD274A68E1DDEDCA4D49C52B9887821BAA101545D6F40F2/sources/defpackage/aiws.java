package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aiws  reason: default package */
/* loaded from: classes2.dex */
public final class aiws extends ges implements aiwa, aiwb, aiod, aiog, aiof, aiyn {
    public static final Comparator<aixt> a = aiwn.a;
    public ExtendedFloatingActionButton aA;
    @dzsi
    public PersonId aB;
    private aiyu aQ;
    private cqkf<aivr> aR;
    private cqkf<aiyl> aS;
    private cqkf<aiyu> aT;
    private HashMap<PersonId, aink> aU;
    @dzsi
    private aiyo aV;
    @dzsi
    private crzp<btlu> aX;
    public ajei ad;
    public cqat ae;
    public ajsc af;
    public cqhn ag;
    public ajex ah;
    public ajew ai;
    public aigf aj;
    public aiza ak;
    public dxio<afha> al;
    public ahyd am;
    public dxio<ache> an;
    public cjmt ao;
    public ajcb ap;
    public dxio<ajae> aq;
    public btvo ar;
    public cpv as;
    public akfa at;
    public dxio<ahwf> au;
    public Executor av;
    @dzsi
    public dbsg<btlu> ax;
    public aiwr ay;
    public aiwc az;
    public cqkj b;
    public efg c;
    public gfq d;
    public aioh e;
    public aikp f;
    public ajsj g;
    public boolean aw = false;
    private boolean aO = false;
    private boolean aP = false;
    public final HashMap<PersonId, aixt> aC = new HashMap<>();
    private final aigd aW = new aigd(this) { // from class: aiwf
        private final aiws a;

        {
            this.a = this;
        }

        @Override // defpackage.aigd
        public final void a() {
            for (aixt aixtVar : this.a.aC.values()) {
                aixtVar.c();
            }
        }
    };

    public aiws() {
        new aige(this) { // from class: aiwg
            private final aiws a;

            {
                this.a = this;
            }

            @Override // defpackage.aige
            public final void a() {
                for (aixt aixtVar : this.a.aC.values()) {
                    aixtVar.c();
                }
            }
        };
    }

    public static aiws aU(dbsg<btlu> dbsgVar) {
        aiws aiwsVar = new aiws();
        aiwsVar.ax = dbsgVar;
        return aiwsVar;
    }

    private final boolean aV() {
        return (this.aO == aR() && this.aP == aX()) ? false : true;
    }

    private final boolean aX() {
        return this.ax != null && this.aC.isEmpty() && this.aV == null;
    }

    private final void bn() {
        dbsg<btlu> dbsgVar = this.ax;
        if (dbsgVar != null) {
            this.e.e(this, dbsgVar);
            aioh aiohVar = this.e;
            dcdc e = dcdc.e();
            dbsg<btlu> dbsgVar2 = this.ax;
            dbsk.s(dbsgVar2);
            aiohVar.a(e, this, dbsgVar2);
            aioh aiohVar2 = this.e;
            dbsg<btlu> dbsgVar3 = this.ax;
            dbsk.s(dbsgVar3);
            aioc l = aiohVar2.l(dbsgVar3);
            synchronized (l) {
                l.e.add(this);
            }
        }
    }

    private final void bo(aiws aiwsVar, boolean z) {
        jjn jjnVar;
        egj egjVar = new egj(aiwsVar);
        boolean z2 = false;
        egjVar.k(false);
        egjVar.ad(false);
        egjVar.f(false);
        egjVar.G(this.aR.c(), 6);
        egjVar.ao(!aR());
        egf a2 = egf.a();
        a2.l(true);
        a2.x = false;
        egjVar.A(a2);
        this.aO = aR();
        this.aP = z;
        if (!z) {
            if (aR() || !this.as.d(H())) {
                jjnVar = jjn.COLLAPSED;
            } else {
                jjnVar = jjn.FULLY_EXPANDED;
            }
            aiwr aiwrVar = this.ay;
            if (jjnVar == jjn.FULLY_EXPANDED) {
                z2 = true;
            }
            aiwrVar.a(z2);
            egjVar.w(null);
            egjVar.ah(gwu.a);
            egjVar.an();
            egjVar.ar(true);
            egjVar.al(48);
            egjVar.t(new aiwo(this));
            egjVar.J(new egq(this) { // from class: aiwk
                private final aiws a;

                {
                    this.a = this;
                }

                @Override // defpackage.egq
                public final void Qs(egu eguVar) {
                    aiwr aiwrVar2;
                    boolean z3;
                    aiws aiwsVar2 = this.a;
                    if (!aiwsVar2.S() || (aiwrVar2 = aiwsVar2.ay) == null || aiwrVar2.c == (!aiwsVar2.aR())) {
                        return;
                    }
                    aiwrVar2.c = z3;
                    cqkx.p(aiwrVar2);
                }
            });
            egjVar.az(this.aS.c(), new Callable(this) { // from class: aiwl
                private final aiws a;

                {
                    this.a = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Integer.valueOf(this.a.aJ());
                }
            });
            egjVar.ai(jjnVar);
            egjVar.ak(w(), w());
        } else {
            egjVar.ag(null);
            egjVar.w(this.aT.c());
            egjVar.D(1);
        }
        this.c.a(egjVar.a());
    }

    private final aixt bp(aink ainkVar) {
        return new aixz(ainkVar, new aiwm(this, ainkVar), this.f, J().getResources(), this.ae, this.af, this.ag, this.ah, this.ai);
    }

    private final int bq() {
        int size;
        if (this.aV != null) {
            size = this.aC.size() + 1;
        } else {
            size = this.aC.size();
        }
        return (int) (Rn().getDisplayMetrics().density * size * 96);
    }

    private final int br() {
        int i = Rn().getDisplayMetrics().heightPixels;
        cqkf<aivr> cqkfVar = this.aR;
        View c = cqkfVar != null ? cqkfVar.c() : null;
        int i2 = 0;
        if (c != null) {
            c.measure(View.MeasureSpec.makeMeasureSpec(Rn().getDisplayMetrics().widthPixels, 1073741824), 0);
            i2 = c.getMeasuredHeight();
        }
        return ((i - this.ao.e()) - this.ao.h()) - i2;
    }

    private final void bs() {
        aiwr aiwrVar = this.ay;
        Collection<aixt> values = this.aC.values();
        aiyo aiyoVar = this.aV;
        boolean aR = aR();
        aiwrVar.a = dcdc.r(dclu.d(a).o(values));
        aiwrVar.f = aiyoVar;
        aiwrVar.b = false;
        aiwrVar.c = !aR;
        cqhn cqhnVar = aiwrVar.g;
        cqkx.p(aiwrVar);
    }

    private final void bt(int i) {
        if (i == 0) {
            this.aV = null;
        } else {
            this.aV = new aiyo(J().getResources(), i, this);
        }
    }

    @Override // defpackage.aiod
    public final void a(List<aioe> list) {
        if (H() == null) {
            return;
        }
        boolean z = true;
        for (aioe aioeVar : list) {
            int c = aioeVar.c();
            int i = c - 1;
            if (c == 0) {
                throw null;
            }
            if (i != 0) {
                if (i == 1) {
                    if (this.aC.containsKey(aioeVar.b())) {
                        this.aC.remove(aioeVar.b());
                        z = false;
                    }
                    this.aU.remove(aioeVar.b());
                } else if (i != 2) {
                }
            }
            dbsk.l(aioeVar.a().a());
            this.aU.put(aioeVar.b(), aioeVar.a().b());
            if (this.aC.containsKey(aioeVar.b())) {
                aixt aixtVar = this.aC.get(aioeVar.b());
                dbsk.s(aixtVar);
                aixtVar.a(aioeVar.a().b());
            } else {
                this.aC.put(aioeVar.b(), bp(aioeVar.a().b()));
                z = false;
            }
        }
        if (!z) {
            bs();
        }
        if (aV() && this.aD) {
            bo(this, aX());
        }
        dbsg<btlu> dbsgVar = this.ax;
        if (dbsgVar == null) {
            return;
        }
        this.ak.a(dbsgVar, list);
    }

    public final int aJ() {
        int i;
        int intValue;
        if (aR()) {
            i = bq();
            intValue = aS().intValue();
        } else {
            double br = br();
            Double.isNaN(br);
            double d = ((float) (br / 2.2222222222222223d)) / (Rn().getDisplayMetrics().density * 96.0f);
            Double.isNaN(d);
            Double.isNaN(d);
            double floor = Math.floor(d + d) / 2.0d;
            if (floor % 1.0d == dcyn.a) {
                floor -= 0.5d;
            }
            double d2 = Rn().getDisplayMetrics().density;
            Double.isNaN(d2);
            i = (int) (floor * 96.0d * d2);
            intValue = aS().intValue();
        }
        return i + intValue;
    }

    public final boolean aR() {
        return ((double) (((float) bq()) / ((float) br()))) <= 0.45d;
    }

    public final Integer aS() {
        float f = Rn().getDisplayMetrics().density;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.aA;
        dbsk.s(extendedFloatingActionButton);
        return Integer.valueOf(((int) (f * 24.0f)) + extendedFloatingActionButton.getHeight());
    }

    public final float aT(jkj jkjVar) {
        int aJ = aJ();
        return (jkjVar.U() - aJ) / (jkjVar.M() - aJ);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ae(Activity activity) {
        dxix.a(this);
        super.ae(activity);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        this.aR = this.b.c(new aivs(), null);
        this.aS = this.b.c(new aiym(), null);
        this.aT = this.b.c(new aiyv(), null);
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) cqkx.e(this.aS.c(), aivk.a, ExtendedFloatingActionButton.class);
        dbsk.s(extendedFloatingActionButton);
        this.aA = extendedFloatingActionButton;
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        q();
    }

    @Override // defpackage.aiof
    public final void b(int i) {
        if (H() == null) {
            return;
        }
        bt(i);
        bs();
        if (!aV() || !this.aD) {
            return;
        }
        bo(this, aX());
    }

    @Override // defpackage.aiog
    public final void c(dbsg<aion> dbsgVar) {
        if (H() == null) {
            return;
        }
        this.az.g(dbsgVar);
    }

    @Override // defpackage.aiwa
    public final void d() {
        dbsg<btlu> dbsgVar = this.ax;
        if (dbsgVar == null || !dbsgVar.a()) {
            return;
        }
        this.am.a(this.ax.b());
    }

    public final void g() {
        final ajsj ajsjVar = this.g;
        final dbsz dbszVar = new dbsz(this) { // from class: aiwh
            private final aiws a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                aiws aiwsVar = this.a;
                dbsg<btlu> dbsgVar = (dbsg) obj;
                if (aiwsVar.D() || aiwsVar.H() == null) {
                    return;
                }
                dbsg<btlu> dbsgVar2 = aiwsVar.ax;
                if (dbsgVar2 != null && dbsgVar2.equals(dbsgVar)) {
                    return;
                }
                aiwsVar.i(dbsgVar);
            }
        };
        final Runnable runnable = new Runnable(this) { // from class: aiwi
            private final aiws a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.au.a().q();
            }
        };
        ajsjVar.a.execute(new Runnable(ajsjVar, dbszVar, runnable) { // from class: ajse
            private final ajsj a;
            private final dbsz b;
            private final Runnable c;

            {
                this.a = ajsjVar;
                this.b = dbszVar;
                this.c = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajsj ajsjVar2 = this.a;
                final dbsz dbszVar2 = this.b;
                Runnable runnable2 = this.c;
                final dbsg j = dbsg.j(ajsjVar2.c());
                if (!ajsjVar2.f()) {
                    ajsjVar2.b.execute(new Runnable(dbszVar2, j) { // from class: ajsf
                        private final dbsz a;
                        private final dbsg b;

                        {
                            this.a = dbszVar2;
                            this.b = j;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.NU(this.b);
                        }
                    });
                } else {
                    ajsjVar2.b.execute(runnable2);
                }
            }
        });
    }

    public final void i(dbsg<btlu> dbsgVar) {
        this.ax = dbsgVar;
        bn();
        dcdc<aink> c = this.e.c(dbsgVar);
        this.aU = new HashMap<>();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            aink ainkVar = c.get(i);
            this.aU.put(ainkVar.b(), ainkVar);
        }
        this.aC.clear();
        for (aink ainkVar2 : this.aU.values()) {
            this.aC.put(ainkVar2.b(), bp(ainkVar2));
        }
        this.az.f(dbsgVar.a());
        bt(this.e.l(dbsgVar).c());
        bs();
        this.az.g(this.e.g(dbsgVar));
        if (this.aD) {
            bo(this, aX());
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.ay = new aiwr(this.ag, this.au);
        Context H = H();
        cqhn cqhnVar = this.ag;
        dbsg<btlu> dbsgVar = this.ax;
        this.az = new aiwc(H, this, this, cqhnVar, dbsgVar != null && dbsgVar.a());
        this.aQ = new aiwp(this);
        this.au.a().F();
        dbsg<btlu> dbsgVar2 = this.ax;
        if (dbsgVar2 != null) {
            i(dbsgVar2);
        } else {
            g();
        }
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bo(this, aX());
    }

    public final void q() {
        dbsg<btlu> dbsgVar = this.ax;
        if (dbsgVar == null) {
            return;
        }
        this.e.b(this, dbsgVar);
        aioh aiohVar = this.e;
        dbsg<btlu> dbsgVar2 = this.ax;
        dbsk.s(dbsgVar2);
        aiohVar.f(this, dbsgVar2);
        aioh aiohVar2 = this.e;
        dbsg<btlu> dbsgVar3 = this.ax;
        dbsk.s(dbsgVar3);
        aioc l = aiohVar2.l(dbsgVar3);
        synchronized (l) {
            l.e.remove(this);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.aB = null;
        this.aR.e(this.az);
        this.aS.e(this.ay);
        this.aT.e(this.aQ);
        bs();
        this.aj.a(this.aW);
        bn();
        this.aX = new crzp(this) { // from class: aiwj
            private final aiws a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                this.a.g();
            }
        };
        crzm<btlu> C = this.at.C();
        crzp<btlu> crzpVar = this.aX;
        dbsk.s(crzpVar);
        C.d(crzpVar, this.av);
        bo(this, aX());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        dbsg<btlu> dbsgVar = this.ax;
        if (dbsgVar != null) {
            int i = this.u ? this.aB != null ? 8 : 4 : 5;
            aiza aizaVar = this.ak;
            dbsk.s(dbsgVar);
            dcdc<aink> c = this.e.c(this.ax);
            dbsg j = dbsg.j(this.aB);
            bvrj.UI_THREAD.c();
            for (aink ainkVar : c) {
                if (!ainkVar.b().equals(j.f())) {
                    aizaVar.b.c(dbsgVar, ainkVar.b(), i);
                }
            }
        }
        this.aR.e(null);
        this.aS.e(null);
        this.aT.e(null);
        if (this.aX != null) {
            crzm<btlu> C = this.at.C();
            crzp<btlu> crzpVar = this.aX;
            dbsk.s(crzpVar);
            C.c(crzpVar);
        }
        this.aj.c(this.aW);
    }

    public final jkc w() {
        if (aR()) {
            return jkc.o;
        }
        return jkc.l;
    }
}
