package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqzc  reason: default package */
/* loaded from: classes.dex */
public final class aqzc extends itb implements SharedPreferences.OnSharedPreferenceChangeListener, araj {
    private final iwv A;
    private aqyo B;
    private final cztz C;
    private final byve D;
    private cqkf<jar> E;
    private final dxio<akox> F;
    private final akpq G;
    private final cqkj H;
    private final eeu I;
    private final axrx J;
    private final gcg K;
    private final dxio<gce> L;
    private final aufc M;
    private final Executor N;
    private final boolean O;
    private View P;
    public final gga a;
    public int b = -1;
    @dzsi
    aqye c;
    public final dxio<akzh> d;
    public final aras e;
    public final btrm f;
    public final bvjj g;
    public final bvrb h;
    public final ahkg i;
    public final aqyb j;
    public final dxio<arag> k;
    public final btvo o;
    public final ahjq p;
    public final cjqy q;
    public final cjqq r;
    public final dxio<bzmm> s;
    public final aral t;
    public final dzsj<dbsg<ddv>> u;
    @dzsi
    amzi v;
    public boolean w;
    boolean x;
    boolean y;
    private final aqxv z;

    public aqzc(gga ggaVar, dxio<akox> dxioVar, dxio<akzh> dxioVar2, akpq akpqVar, aras arasVar, btrm btrmVar, bvjj bvjjVar, cqkj cqkjVar, eeu eeuVar, bvrb bvrbVar, axrx axrxVar, ahkg ahkgVar, aqyb aqybVar, dxio<arag> dxioVar3, btvo btvoVar, ahjq ahjqVar, cztz cztzVar, iwv iwvVar, byve byveVar, cjqy cjqyVar, cjqq cjqqVar, dxio<bzmm> dxioVar4, aral aralVar, gcg gcgVar, dxio<gce> dxioVar5, aufc aufcVar, Executor executor, dzsj<dbsg<ddv>> dzsjVar) {
        new aqyy(this);
        this.a = ggaVar;
        this.F = dxioVar;
        this.d = dxioVar2;
        this.G = akpqVar;
        this.e = arasVar;
        this.f = btrmVar;
        this.g = bvjjVar;
        this.H = cqkjVar;
        this.I = eeuVar;
        this.h = bvrbVar;
        this.J = axrxVar;
        this.i = ahkgVar;
        this.j = aqybVar;
        this.k = dxioVar3;
        this.o = btvoVar;
        this.p = ahjqVar;
        this.C = cztzVar;
        this.A = iwvVar;
        this.q = cjqyVar;
        this.r = cjqqVar;
        this.D = byveVar;
        this.s = dxioVar4;
        this.t = aralVar;
        this.K = gcgVar;
        this.L = dxioVar5;
        this.M = aufcVar;
        this.N = executor;
        this.u = dzsjVar;
        this.z = new aqxv(ggaVar.getApplication(), btrmVar);
        this.O = btvoVar.getLocationParameters().q;
    }

    private final void r() {
        if (this.v != null) {
            dbsk.s(this.B);
            dbsk.s(this.c);
            return;
        }
        View findViewById = this.a.findViewById(R.id.base_compass_button);
        amzi amziVar = (amzi) findViewById;
        this.v = amziVar;
        this.B = new aqyo(this.f, this.e, this.F.a(), this.K, this.L, this.M, this.N);
        final aqyz aqyzVar = new aqyz(this, amziVar, this.B, findViewById);
        this.c = aqyzVar;
        aqyzVar.b.a(aqyzVar.a);
        aqyzVar.a.setOnClickListener(new View.OnClickListener(aqyzVar) { // from class: aqyd
            private final aqye a;

            {
                this.a = aqyzVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aqye aqyeVar = this.a;
                aqyeVar.c(aqyeVar.a);
            }
        });
        View findViewById2 = this.a.findViewById(R.id.qu_mylocation_container);
        dbsk.s(findViewById2);
        this.P = findViewById2;
        gvr d = gvs.d();
        d.a = false;
        d.b = false;
        d.b(7);
        cqkf<jar> a = this.H.a(d.a(), this.P);
        this.E = a;
        a.e(this.A);
        dbsk.s(this.v);
        dbsk.s(this.c);
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        this.e.a(this.F.a(), this.a.getResources());
        this.e.d.k(ardz.MAP);
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        r();
        this.e.b(((efh) this.I).d);
        btrm btrmVar = this.f;
        dceq a = dcet.a();
        a.b(ardp.class, new aqzd(0, ardp.class, this, bvrj.UI_THREAD));
        a.b(alhj.class, new aqzd(1, alhj.class, this, bvrj.UI_THREAD));
        a.b(ardq.class, new aqzd(2, ardq.class, this));
        a.b(ahlc.class, new aqzd(3, ahlc.class, this));
        a.b(crhp.class, new aqzd(4, crhp.class, this));
        btrmVar.g(this, a.a());
        btrm btrmVar2 = this.f;
        iwv iwvVar = this.A;
        dceq a2 = dcet.a();
        a2.b(amwe.class, new iww(0, amwe.class, iwvVar, bvrj.UI_THREAD));
        a2.b(ahjx.class, new iww(1, ahjx.class, iwvVar, bvrj.UI_THREAD));
        btrmVar2.g(iwvVar, a2.a());
        if (this.O) {
            this.A.i();
        }
        aqyo aqyoVar = this.B;
        btrm btrmVar3 = aqyoVar.a;
        aqyn aqynVar = aqyoVar.j;
        dceq a3 = dcet.a();
        a3.b(ege.class, new aqyp(ege.class, aqynVar, bvrj.UI_THREAD));
        btrmVar3.g(aqynVar, a3.a());
        aqyoVar.d.i().d(aqyoVar.h, aqyoVar.e);
        if (aqyoVar.b.a()) {
            aqyoVar.c.a().g().d(aqyoVar.i, aqyoVar.e);
        }
        btrm btrmVar4 = this.f;
        byve byveVar = this.D;
        dceq a4 = dcet.a();
        a4.b(ahjx.class, new byvf(ahjx.class, byveVar, bvrj.UI_THREAD));
        btrmVar4.g(byveVar, a4.a());
        amzi amziVar = this.v;
        if (amziVar != null) {
            amziVar.b(this.d.a(), this.G);
        }
        aqxv aqxvVar = this.z;
        aqxvVar.c(new aqxt(aqxvVar));
    }

    @Override // defpackage.itb
    public final void Nu() {
        aqye aqyeVar = this.c;
        if (aqyeVar != null) {
            aqzz aqzzVar = aqyeVar.c;
            if (aqzzVar != null) {
                aqzzVar.b();
            } else {
                aqyeVar.b.b();
            }
            aqyeVar.a.setOnClickListener(null);
        }
        this.c = null;
        this.v = null;
        this.e.d();
        super.Nu();
        cqkf<jar> cqkfVar = this.E;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
    }

    @Override // defpackage.itb
    public final void PX() {
        super.PX();
        aras arasVar = this.e;
        boolean z = ((efh) this.I).d;
        bvrj.UI_THREAD.c();
        if (z) {
            arasVar.e();
        }
    }

    @Override // defpackage.itb
    public final void PY() {
        j();
        bvrj.UI_THREAD.c();
        super.PY();
    }

    @Override // defpackage.itb
    public final void Po() {
        amzi amziVar = this.v;
        if (amziVar != null) {
            amziVar.c();
        }
        aqxv aqxvVar = this.z;
        if (aqxvVar != null) {
            aqxvVar.b(null);
        }
        this.f.a(this.D);
        aqyo aqyoVar = this.B;
        if (aqyoVar != null) {
            if (aqyoVar.b.a()) {
                aqyoVar.c.a().g().c(aqyoVar.i);
            }
            aqyoVar.d.i().c(aqyoVar.h);
            aqyoVar.a.a(aqyoVar.j);
        }
        this.f.a(this.A);
        if (this.O) {
            this.A.j();
        }
        this.f.a(this);
        this.e.c();
        super.Po();
    }

    @Override // defpackage.araj
    public final jar e() {
        return this.A;
    }

    public final void f() {
        i(false, true);
    }

    public final void i(boolean z, boolean z2) {
        this.J.f(new aqzb(this, z2, z));
    }

    public final void j() {
        this.C.e(3);
    }

    @Override // defpackage.araj
    public final int k() {
        return this.b;
    }

    @Override // defpackage.araj
    public final void l() {
        if (this.e.i() == amwd.OFF) {
            f();
        }
    }

    @Override // defpackage.araj
    public final arbu m() {
        return this.e;
    }

    @Override // defpackage.araj
    public final araa n() {
        r();
        return this.c;
    }

    public final boolean o() {
        return this.e.d.f(null);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
    }

    @Override // defpackage.araj
    public final void p(deig<Void> deigVar) {
        this.z.b(deigVar);
    }

    @Override // defpackage.araj
    public final void q() {
        this.a.D(aqxy.g(this.b));
    }
}
