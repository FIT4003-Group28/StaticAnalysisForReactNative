package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: airr  reason: default package */
/* loaded from: classes2.dex */
public final class airr extends ges implements aito, aisp, aiod, aiog {
    public cqkj a;
    public bvjj aA;
    public aitz aB;
    public dxio<ajoj> aC;
    public dbsg<drn> aO;
    public cpv aP;
    public Executor aQ;
    public Executor aR;
    public dbsg<btlu> aS;
    @dzsi
    public PersonId aT;
    @dzsi
    public aink aU;
    @dzsi
    public akqq aV;
    @dzsi
    public dro aW;
    public dkog aX;
    public aiua aY;
    public aisq aZ;
    public cqat ad;
    public ajsc ae;
    public cqhn af;
    public btvo ag;
    public cqhu ah;
    public aigf ai;
    public btrm aj;
    public bvsl ak;
    public akfa al;
    public dxio<ahjq> am;
    public aiza an;
    public ajsm ao;
    public ahyd ap;
    public dxio<afha> aq;
    public amfi ar;
    public dxio<qbt> as;
    public ahvo at;
    public ajsu au;
    public aihe<aimj, aiig> av;
    public ajof aw;
    public cjmt ax;
    public ajcb ay;
    public ajad az;
    public efg b;
    public boolean ba;
    public boolean bb;
    public boolean bc;
    public btxc bd;
    @dzsi
    public int be;
    @dzsi
    private String bf;
    private cqkf<aisg> bh;
    private cqkf<aiqv> bi;
    private boolean bj;
    public dxio<ahwf> c;
    public gfq d;
    public aioh e;
    public ajsj f;
    public ajei g;
    private final airq bg = new airq(this);
    private final crzp<btvo> bk = new crzp(this) { // from class: aiqx
        private final airr a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            airr airrVar = this.a;
            btvo btvoVar = (btvo) crzmVar.l();
            dbsk.s(btvoVar);
            dkog locationSharingParameters = btvoVar.getLocationSharingParameters();
            if (!locationSharingParameters.equals(airrVar.aX)) {
                airrVar.aX = locationSharingParameters;
                airrVar.w();
            }
        }
    };
    private final crzp<btlu> bl = new crzp(this) { // from class: aird
        private final airr a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            Object obj;
            airr airrVar = this.a;
            btlu btluVar = (btlu) crzmVar.l();
            boolean z = true;
            boolean z2 = btluVar != null && btluVar.m();
            if (btluVar == null || btluVar.o()) {
                obj = dbpy.a;
            } else {
                obj = dbsg.i(btluVar);
            }
            dbsg<btlu> dbsgVar = airrVar.aS;
            if (dbsgVar == null || dbsgVar.equals(obj)) {
                z = false;
            }
            if (z2 || z) {
                Executor executor = airrVar.aQ;
                dbsk.s(executor);
                executor.execute(new Runnable(airrVar) { // from class: airc
                    private final airr a;

                    {
                        this.a = airrVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        dxio<ahwf> dxioVar = this.a.c;
                        dbsk.s(dxioVar);
                        dxioVar.a().q();
                    }
                });
            }
        }
    };
    private final aigd bm = new airn(this);

    public airr() {
        new airo(this);
    }

    public static void br(Activity activity, CharSequence charSequence, @dzsi CharSequence charSequence2, @dzsi View.OnClickListener onClickListener) {
        dafk a = ckos.a(activity.findViewById(16908290), charSequence, 0);
        if (charSequence2 != null && onClickListener != null) {
            a.p(charSequence2, onClickListener);
        }
        a.c();
    }

    private final void bt(airr airrVar) {
        jjn jjnVar = jjn.COLLAPSED;
        aS(jjnVar);
        egj egjVar = new egj(airrVar);
        egjVar.k(false);
        egjVar.ad(false);
        egjVar.f(false);
        egjVar.D(2);
        egjVar.w(null);
        egjVar.ao(aU());
        egjVar.G(this.bh.c(), 6);
        egjVar.az(this.bi.c(), new Callable(this) { // from class: aiqy
            private final airr a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                airr airrVar2 = this.a;
                int aV = airrVar2.aV();
                int bp = airrVar2.bp();
                if (!airrVar2.aU()) {
                    aV = bp / 2;
                }
                return Integer.valueOf(aV);
            }
        });
        egjVar.ai(jjnVar);
        egjVar.t(new airm(this));
        egjVar.J(new egq(this) { // from class: aiqz
            private final airr a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                airr airrVar2 = this.a;
                if (airrVar2.S()) {
                    airrVar2.aY.p(!airrVar2.aU());
                }
            }
        });
        egjVar.ak(aT(), aT());
        egf a = egf.a();
        a.l(true);
        a.x = false;
        egjVar.A(a);
        boolean bu = bu();
        this.bj = bu;
        if (bu) {
            egjVar.g(this.aW);
        }
        this.b.a(egjVar.a());
    }

    private final boolean bu() {
        aink ainkVar;
        return this.aW != null && this.aO.b().b() && (ainkVar = this.aU) != null && ainkVar.m().a();
    }

    private final boolean bv() {
        gfq gfqVar = this.d;
        if (gfqVar != null) {
            return gfqVar.e(aiws.class);
        }
        return false;
    }

    @Override // defpackage.aiod
    public final void a(List<aioe> list) {
        dbsg<btlu> dbsgVar;
        if (H() == null || (dbsgVar = this.aS) == null) {
            return;
        }
        this.an.a(dbsgVar, list);
        aioe aioeVar = (aioe) dcft.c(dcft.i(list, new dbsl(this) { // from class: aire
            private final airr a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((aioe) obj).b().equals(this.a.aT);
            }
        }));
        if (aioeVar.c() == 2) {
            br(J(), Rp(R.string.NO_LONGER_SHARING_THEIR_LOCATION), null, null);
            this.c.a().q();
            return;
        }
        dbsk.m(aioeVar.a().a(), "PersonUiState is expected given the type is UPDATED and CREATED");
        this.aU = aioeVar.a().b();
        aJ();
        w();
        bq();
        aR();
    }

    public final void aJ() {
        dbsg<btlu> dbsgVar;
        aink ainkVar = this.aU;
        if (ainkVar == null || ainkVar.d().isEmpty() || !this.aU.a().a() || (dbsgVar = this.aS) == null) {
            return;
        }
        ajad ajadVar = this.az;
        aink ainkVar2 = this.aU;
        dbsk.s(ainkVar2);
        ajadVar.a(new aizz(dbsgVar, ainkVar2.a().b()));
    }

    public final void aR() {
        if (!this.ba || this.bj == bu()) {
            return;
        }
        bt(this);
    }

    public final void aS(jjn jjnVar) {
        boolean z = jjnVar == jjn.FULLY_EXPANDED;
        aiua aiuaVar = this.aY;
        if (aiuaVar != null) {
            aiuaVar.r(z);
        }
        aisq aisqVar = this.aZ;
        if (aisqVar != null) {
            aisqVar.g(z);
        }
    }

    public final jkc aT() {
        if (this.aP.d(H())) {
            return jkc.l;
        }
        if (!aU() || Rn().getConfiguration().orientation == 2) {
            return jkc.l;
        }
        return jkc.o;
    }

    public final boolean aU() {
        return ((double) (((float) aV()) / ((float) bp()))) <= 0.5d;
    }

    public final int aV() {
        View c = this.bi.c();
        View a = cqhu.a(c, aiqw.b);
        if (a != null) {
            a.measure(View.MeasureSpec.makeMeasureSpec(Rn().getDisplayMetrics().widthPixels, 1073741824), 0);
            return a.getMeasuredHeight();
        }
        c.measure(View.MeasureSpec.makeMeasureSpec(Rn().getDisplayMetrics().widthPixels, 1073741824), 0);
        return c.getMeasuredHeight();
    }

    public final boolean aX() {
        return (!this.ba || this.aS == null || this.aU == null) ? false : true;
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
        this.bh = this.a.c(new aish(), null);
        this.bi = this.a.c(new aiqw(), null);
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        bo();
    }

    public final void bn() {
        if (this.aS == null) {
            return;
        }
        aioh aiohVar = this.e;
        PersonId personId = this.aT;
        dbsk.s(personId);
        dcdc f = dcdc.f(personId);
        dbsg<btlu> dbsgVar = this.aS;
        dbsk.s(dbsgVar);
        aiohVar.a(f, this, dbsgVar);
        aioh aiohVar2 = this.e;
        dbsg<btlu> dbsgVar2 = this.aS;
        dbsk.s(dbsgVar2);
        aiohVar2.e(this, dbsgVar2);
    }

    public final void bo() {
        dbsg<btlu> dbsgVar = this.aS;
        if (dbsgVar == null) {
            return;
        }
        this.e.b(this, dbsgVar);
        this.e.f(this, this.aS);
    }

    public final int bp() {
        int i = Rn().getDisplayMetrics().heightPixels;
        View c = this.bh.c();
        int i2 = 0;
        if (c != null) {
            c.measure(View.MeasureSpec.makeMeasureSpec(Rn().getDisplayMetrics().widthPixels, 1073741824), 0);
            i2 = c.getMeasuredHeight();
        }
        return ((i - this.ax.e()) - this.ax.h()) - i2;
    }

    public final void bq() {
        dbsg<btlu> dbsgVar;
        aink ainkVar;
        if (!this.bb || (dbsgVar = this.aS) == null || !dbsgVar.a() || (ainkVar = this.aU) == null || !ainkVar.a().a()) {
            return;
        }
        aink ainkVar2 = this.aU;
        dbsk.s(ainkVar2);
        if (!ainkVar2.a().b().e().a()) {
            return;
        }
        dbsg<btlu> dbsgVar2 = this.aS;
        dbsk.s(dbsgVar2);
        aink ainkVar3 = this.aU;
        dbsk.s(ainkVar3);
        final dehn<Boolean> a = this.aC.a().a(dbsgVar2.b(), ainkVar3.a().b());
        a.Pk(new Runnable(this, a) { // from class: aira
            private final airr a;
            private final dehn b;

            {
                this.a = this;
                this.b = a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                airr airrVar = this.a;
                if (((Boolean) deha.s(this.b)).booleanValue()) {
                    airrVar.g();
                }
            }
        }, this.aQ);
        this.bb = false;
    }

    public final int bs() {
        int i = this.be;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.aiog
    public final void c(dbsg<aion> dbsgVar) {
        if (H() == null || this.aS == null) {
            return;
        }
        this.aZ.h(dbsgVar);
    }

    @Override // defpackage.aito
    public final void g() {
        if (!aX()) {
            return;
        }
        ajei ajeiVar = this.g;
        dbsg<btlu> dbsgVar = this.aS;
        dbsk.s(dbsgVar);
        aink ainkVar = this.aU;
        dbsk.s(ainkVar);
        ajeiVar.b(dbsgVar.f(), ainkVar);
    }

    public final void i(String str) {
        ((ClipboardManager) J().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(Rp(R.string.COPIED_LINK_LABEL), str));
        br(J(), Rp(R.string.COPIED_LINK_TOAST), null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ges, defpackage.fd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(@defpackage.dzsi android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.airr.l(android.os.Bundle):void");
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bt(this);
    }

    public final dbsi<dbsg<aink>, dbsg<aion>> q() {
        dbsg<aink> dbsgVar = dbpy.a;
        dbsg<aion> dbsgVar2 = dbpy.a;
        if (this.aS != null) {
            aioh aiohVar = this.e;
            PersonId personId = this.aT;
            dbsk.s(personId);
            dbsgVar = aiohVar.d(personId, this.aS);
            dbsgVar2 = this.e.g(this.aS);
            if (dbsgVar.a()) {
                this.aU = dbsgVar.b();
            }
            aiza aizaVar = this.an;
            dbsg<btlu> dbsgVar3 = this.aS;
            dbsk.s(dbsgVar3);
            PersonId personId2 = this.aT;
            dbsk.s(personId2);
            aizaVar.c(dbsgVar3, personId2, dbsgVar, bs());
            aJ();
        } else {
            final ajsj ajsjVar = this.f;
            final dbsg j = dbsg.j(this.bf);
            final dbsz dbszVar = new dbsz(this) { // from class: airk
                private final airr a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbsz
                public final void NU(Object obj) {
                    airr airrVar = this.a;
                    dbsg<btlu> dbsgVar4 = (dbsg) obj;
                    if (airrVar.D()) {
                        return;
                    }
                    airrVar.aS = dbsgVar4;
                    aioh aiohVar2 = airrVar.e;
                    PersonId personId3 = airrVar.aT;
                    dbsk.s(personId3);
                    dbsg<aink> d = aiohVar2.d(personId3, dbsgVar4);
                    aiza aizaVar2 = airrVar.an;
                    PersonId personId4 = airrVar.aT;
                    dbsk.s(personId4);
                    aizaVar2.c(dbsgVar4, personId4, d, airrVar.bs());
                    aisq aisqVar = airrVar.aZ;
                    if (aisqVar != null) {
                        aisqVar.h(airrVar.e.g(dbsgVar4));
                    }
                    airrVar.bn();
                    if (d.a() && airrVar.aS != null) {
                        airrVar.aU = d.b();
                        airrVar.aJ();
                        airrVar.w();
                        airrVar.aR();
                    }
                    airrVar.bq();
                }
            };
            final Runnable runnable = new Runnable(this) { // from class: airl
                private final airr a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c.a().q();
                }
            };
            ajsjVar.a.execute(new Runnable(ajsjVar, j, dbszVar, runnable) { // from class: ajsd
                private final ajsj a;
                private final dbsg b;
                private final dbsz c;
                private final Runnable d;

                {
                    this.a = ajsjVar;
                    this.b = j;
                    this.c = dbszVar;
                    this.d = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ajsj ajsjVar2 = this.a;
                    dbsg dbsgVar4 = this.b;
                    final dbsz dbszVar2 = this.c;
                    Runnable runnable2 = this.d;
                    final dbsg j2 = dbsg.j(ajsjVar2.c());
                    if (dbsgVar4.a() || j2.a()) {
                        if (!dbsgVar4.a() || !j2.a() || !((String) dbsgVar4.b()).equals(btlu.h((btlu) j2.b()))) {
                            ajsjVar2.b.execute(runnable2);
                            return;
                        } else {
                            ajsjVar2.b.execute(new Runnable(dbszVar2, j2) { // from class: ajsh
                                private final dbsz a;
                                private final dbsg b;

                                {
                                    this.a = dbszVar2;
                                    this.b = j2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.a.NU(this.b);
                                }
                            });
                            return;
                        }
                    }
                    ajsjVar2.b.execute(new Runnable(dbszVar2, j2) { // from class: ajsg
                        private final dbsz a;
                        private final dbsg b;

                        {
                            this.a = dbszVar2;
                            this.b = j2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.NU(this.b);
                        }
                    });
                }
            });
        }
        return dbsi.a(dbsgVar, dbsgVar2);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.bc = false;
        if (this.aS != null) {
            aioh aiohVar = this.e;
            PersonId personId = this.aT;
            dbsk.s(personId);
            dbsg<aink> d = aiohVar.d(personId, this.aS);
            if (d.a() && !d.b().equals(this.aU)) {
                this.aU = d.b();
                w();
            }
            aioh aiohVar2 = this.e;
            dbsg<btlu> dbsgVar = this.aS;
            dbsk.s(dbsgVar);
            dbsg<aion> g = aiohVar2.g(dbsgVar);
            aisq aisqVar = this.aZ;
            if (aisqVar != null && !aisqVar.i().equals(g)) {
                this.aZ.h(g);
            }
        }
        this.bh.e(this.aZ);
        this.bi.e(this.aY);
        this.ai.a(this.bm);
        btrm btrmVar = this.aj;
        airq airqVar = this.bg;
        dceq a = dcet.a();
        a.b(amqo.class, new airs(amqo.class, airqVar, bvrj.UI_THREAD));
        btrmVar.g(airqVar, a.a());
        this.bd.a().d(this.bk, this.aQ);
        this.al.C().d(this.bl, this.aQ);
        bt(this);
        bn();
        bq();
        dro droVar = this.aW;
        if (droVar != null) {
            PersonId personId2 = this.aT;
            dbsk.s(personId2);
            droVar.d(personId2);
        }
        this.ba = true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        String str = this.bf;
        if (str != null) {
            bundle.putString("account_id", str);
        }
        bundle.putParcelable("person_id", this.aT);
        bundle.putBoolean("open_requested_location_dialog", this.bb);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        this.ba = false;
        this.aj.a(this.bg);
        this.bd.a().c(this.bk);
        this.al.C().c(this.bl);
        this.az.c();
        this.bh.e(null);
        this.bi.e(null);
        dbsg<btlu> dbsgVar = this.aS;
        if (dbsgVar != null && !this.bc) {
            aiza aizaVar = this.an;
            PersonId personId = this.aT;
            dbsk.s(personId);
            int i = this.u ? 4 : 5;
            bvrj.UI_THREAD.c();
            aizaVar.b.c(dbsgVar, personId, i);
        }
        this.ai.c(this.bm);
    }

    public final void w() {
        aink ainkVar;
        if (this.aS == null || (ainkVar = this.aU) == null || this.aY == null) {
            return;
        }
        aisq aisqVar = this.aZ;
        boolean z = true;
        if (aisqVar != null) {
            dbsg<aink> j = dbsg.j(ainkVar);
            dkog dkogVar = this.aX;
            akqq akqqVar = this.aV;
            dbsg<btlu> dbsgVar = this.aS;
            aisqVar.f(j, dkogVar, akqqVar, dbsgVar != null && dbsgVar.a() && btlu.i(this.aS.b()) == btlt.GOOGLE, !bv());
        }
        aiua aiuaVar = this.aY;
        aink ainkVar2 = this.aU;
        dbsk.s(ainkVar2);
        dkog dkogVar2 = this.aX;
        akqq akqqVar2 = this.aV;
        dbsg<btlu> dbsgVar2 = this.aS;
        if (dbsgVar2 == null || !dbsgVar2.a() || btlu.i(this.aS.b()) != btlt.GOOGLE) {
            z = false;
        }
        aiuaVar.u(ainkVar2, dkogVar2, akqqVar2, z);
    }
}
