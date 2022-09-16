package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: anzu  reason: default package */
/* loaded from: classes2.dex */
public class anzu implements anzq, angt {
    public final angy a;
    public final cjqy b;
    private final Activity c;
    private final cqat d;
    private final angv e;
    private final anys f;
    private final anum g;
    private final btpc h;
    private final anhg i;
    private final abx j;
    private final dzsj<araj> k;
    private final anqx l;
    private final dzsj<jkf> m;
    private final aovf<aogb, aoge> n;
    private final aoku o;
    private final angu<aogb, aoge> p;
    @dzsi
    private final anzp q;
    private angs<aoge> r;
    private dbsg<anyr> s;
    private dbsg<jam> t;
    private dcdc<anul> u;
    private dbsg<cjtd> v;
    private final dbsg<String> w;
    private dbsg<aoks> x;
    @dzsi
    private aocu y;
    private final boolean z;

    public anzu(aogb aogbVar, @dzsi anzp anzpVar, abx abxVar, dbsg<String> dbsgVar, Activity activity, cqat cqatVar, anys anysVar, angv angvVar, anum anumVar, angy angyVar, btpc btpcVar, anhg anhgVar, dzsj<araj> dzsjVar, anqx anqxVar, dzsj<jkf> dzsjVar2, aovf<aogb, aoge> aovfVar, cjqy cjqyVar, aoku aokuVar, boolean z) {
        this.c = activity;
        this.d = cqatVar;
        this.e = angvVar;
        this.f = anysVar;
        this.g = anumVar;
        this.a = angyVar;
        this.h = btpcVar;
        this.q = anzpVar;
        this.i = anhgVar;
        this.k = dzsjVar;
        this.j = abxVar;
        this.l = anqxVar;
        this.m = dzsjVar2;
        this.n = aovfVar;
        this.b = cjqyVar;
        this.o = aokuVar;
        angu<aogb, aoge> a = angvVar.a(aogbVar);
        this.p = a;
        this.r = a.b();
        this.u = dcdc.e();
        this.s = dbpy.a;
        this.t = dbpy.a;
        this.v = z(this.r);
        this.w = dbsgVar;
        this.x = dbpy.a;
        this.y = null;
        this.z = z;
        x();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void x() {
        /*
            Method dump skipped, instructions count: 1113
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anzu.x():void");
    }

    private final jam y(int i) {
        String string = this.c.getString(i);
        final anhg anhgVar = this.i;
        anhgVar.getClass();
        return new anzt(string, new Runnable(anhgVar) { // from class: anzs
            private final anhg a;

            {
                this.a = anhgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.p();
            }
        });
    }

    private static dbsg<cjtd> z(angs<aoge> angsVar) {
        if (!angsVar.e()) {
            return dbpy.a;
        }
        cjta b = cjtd.b();
        b.d = dtyi.by;
        b.b = angsVar.f().a;
        b.f = dvnp.MAPS_ACTIVITIES_TIMELINE;
        return dbsg.i(b.a());
    }

    @Override // defpackage.angt
    public void a(angu<aogb, aoge> anguVar) {
        x();
        cqkx.p(this);
        if (this.r.b() == angr.ABSENT) {
            this.e.c((aogb) ((aouv) anguVar).b, this.w);
        }
        anzp anzpVar = this.q;
        if (anzpVar != null) {
            anvj anvjVar = ((anvc) anzpVar).a;
            if (anvjVar.m() != this) {
                return;
            }
            anvjVar.t();
        }
    }

    @Override // defpackage.anha
    public aogm b() {
        if (!this.r.e()) {
            return aogm.b;
        }
        aogh i = aogm.i();
        i.g(true);
        Float valueOf = Float.valueOf(14.0f);
        i.i(valueOf);
        aoge f = this.r.f();
        duzv a = f.a();
        if ((a.a & 2) != 0) {
            ((aofq) i).d = this.l.a(f.e(), dbpy.a, f.d);
            if (r().k(aogc.j(this.d))) {
                akra akraVar = new akra();
                if (this.k.a().m().f().f(akraVar)) {
                    i.h(akraVar.S());
                    i.i(valueOf);
                }
            } else {
                dvab dvabVar = a.d;
                if (dvabVar == null) {
                    dvabVar = dvab.b;
                }
                i.b(dcdc.r(dchl.k(dcdc.r(dvabVar.a), aogm.j())));
            }
        }
        i.f(f.f());
        return i.a();
    }

    @Override // defpackage.anim
    @dzsi
    public cjtd c() {
        return this.v.f();
    }

    @Override // defpackage.anzq
    public Boolean d() {
        return Boolean.valueOf(this.r.e());
    }

    @Override // defpackage.anzq
    public Boolean e() {
        boolean z = false;
        if (this.r.b() == angr.PENDING_DIRTY_OR_ABSENT_DATA && !this.r.e() && this.h.i()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.anzq
    public Boolean f() {
        return Boolean.valueOf(this.m.a().l().A(jjn.COLLAPSED));
    }

    @Override // defpackage.anzq
    public cqkl g() {
        if (f().booleanValue()) {
            this.m.a().v();
        }
        return cqkl.a;
    }

    @Override // defpackage.anzq
    @dzsi
    public anyq i() {
        return this.s.f();
    }

    @Override // defpackage.anzq
    @dzsi
    public jam j() {
        return this.t.f();
    }

    @Override // defpackage.anzq
    public abx k() {
        return this.j;
    }

    @Override // defpackage.anzq
    public dbsg<aoks> l() {
        return this.x;
    }

    @Override // defpackage.anzq
    /* renamed from: n */
    public dcdc<anuk> h() {
        return dcdc.r(this.u);
    }

    public cqkl o() {
        if (this.r.e()) {
            aoge f = this.r.f();
            final duzv a = f.a();
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this, a) { // from class: anzr
                private final anzu a;
                private final duzv b;

                {
                    this.a = this;
                    this.b = a;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    anzu anzuVar = this.a;
                    duzv duzvVar = this.b;
                    if (i == -1) {
                        anzuVar.b.i(cjtd.a(dtyi.am));
                        angy angyVar = anzuVar.a;
                        dpop dpopVar = duzvVar.e;
                        if (dpopVar == null) {
                            dpopVar = dpop.d;
                        }
                        dngp bZ = dngq.d.bZ();
                        dngs dngsVar = duzvVar.b;
                        if (dngsVar == null) {
                            dngsVar = dngs.h;
                        }
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dngq dngqVar = (dngq) bZ.b;
                        dngsVar.getClass();
                        dngqVar.b = dngsVar;
                        dngqVar.a |= 1;
                        dngs dngsVar2 = duzvVar.b;
                        if (dngsVar2 == null) {
                            dngsVar2 = dngs.h;
                        }
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dngq dngqVar2 = (dngq) bZ.b;
                        dngsVar2.getClass();
                        dngqVar2.c = dngsVar2;
                        dngqVar2.a |= 2;
                        angyVar.d(dpopVar, bZ.bK());
                    }
                }
            };
            new AlertDialog.Builder(this.c).setTitle(R.string.MAPS_ACTIVITY_DELETE_DAY_TITLE).setMessage(this.c.getString(R.string.MAPS_ACTIVITY_DELETE_DAY_CONFIRM, new Object[]{eato.c(1, 4).h(f.g().m())})).setPositiveButton(R.string.DELETE_BUTTON, onClickListener).setNegativeButton(R.string.CANCEL_BUTTON, onClickListener).show();
        }
        return cqkl.a;
    }

    @Override // defpackage.anzq
    @dzsi
    /* renamed from: p */
    public aocu m() {
        return this.y;
    }

    public boolean q(eapd eapdVar, dbty<Integer> dbtyVar) {
        dbsg dbsgVar;
        dcdc<anuk> h = h();
        int size = h.size();
        for (int i = 0; i < size; i++) {
            anuk anukVar = h.get(i);
            if ((anukVar instanceof anul) && (anukVar instanceof aoaa)) {
                anul anulVar = (anul) anukVar;
                aoaa aoaaVar = (aoaa) anukVar;
                if (new eape(aoaaVar.v(), aoaaVar.w()).h(eapdVar) || eapdVar.L(aoaaVar.w())) {
                    dbsgVar = dbsg.i(anulVar);
                    break;
                }
            }
        }
        dbsgVar = dbpy.a;
        if (!dbsgVar.a()) {
            return false;
        }
        anul anulVar2 = (anul) dbsgVar.b();
        if (anulVar2 instanceof anzo) {
            ((anzo) anulVar2).p(true);
        }
        for (View view : cqkx.n(this)) {
            if (view instanceof RecyclerView) {
                aag aagVar = (aag) ((RecyclerView) view).l;
                int PB = anulVar2.PB();
                if (PB > aagVar.af()) {
                    aagVar.P(PB, dbtyVar.a().intValue());
                }
            }
        }
        return true;
    }

    public aogb r() {
        return this.p.a();
    }

    public angs<aoge> s() {
        return this.r;
    }

    public angu<aogb, aoge> t() {
        return this.p;
    }

    public String toString() {
        dbsb b = dbsc.b(this);
        b.b("day", r());
        return b.toString();
    }

    public void u() {
        this.n.a(this.p, this);
    }

    public void v() {
        this.n.b(this.p, this);
    }

    public dcdc<dvan> w() {
        dccx F = dcdc.F();
        dcdc<anul> dcdcVar = this.u;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            F.i(dcdcVar.get(i).d());
        }
        return F.f();
    }
}
