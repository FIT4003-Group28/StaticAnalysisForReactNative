package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: aqwb  reason: default package */
/* loaded from: classes2.dex */
public class aqwb implements aquy {
    public final Activity a;
    public final dehq b;
    public final dxio<aqvd> c;
    @dzsi
    public crzp<Boolean> f;
    @dzsi
    public crzm<Boolean> g;
    private final dxio<akfa> i;
    private final cqhn j;
    private final dxio<aprv> k;
    private final dxio<apyv> l;
    private final dxio<apyx> m;
    private final dxio<apyz> n;
    private final dxio<aqvn> o;
    @dzsi
    private crzm<apsi<Set<apsg>>> q;
    @dzsi
    private crzp<Boolean> r;
    @dzsi
    private crzm<Boolean> s;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public List<aqur> h = dcdc.e();
    @dzsi
    private crzp<apsi<Set<apsg>>> p = null;

    public aqwb(Activity activity, dehq dehqVar, dxio<akfa> dxioVar, dxio<aprv> dxioVar2, dxio<apyv> dxioVar3, dxio<aqvd> dxioVar4, dxio<aqvn> dxioVar5, cqhn cqhnVar, dxio<apyx> dxioVar6, dxio<apyz> dxioVar7) {
        this.a = activity;
        this.b = dehqVar;
        this.i = dxioVar;
        this.k = dxioVar2;
        this.l = dxioVar3;
        this.c = dxioVar4;
        this.j = cqhnVar;
        this.o = dxioVar5;
        this.m = dxioVar6;
        this.n = dxioVar7;
    }

    private final boolean l() {
        this.m.a().g();
        return false;
    }

    @Override // defpackage.aquy
    public List<aqur> a() {
        return k() ? this.h : dcdc.e();
    }

    @Override // defpackage.aquy
    public boolean b() {
        l();
        return false;
    }

    @Override // defpackage.aquy
    public boolean c() {
        return k();
    }

    @Override // defpackage.aquy
    public List<aquu> d() {
        l();
        return dcdc.e();
    }

    @Override // defpackage.aquy
    public Boolean e() {
        boolean z = false;
        if (k()) {
            if (this.h.size() > 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    @Override // defpackage.aquy
    public Boolean f() {
        boolean z = true;
        if (!this.d.get() && !this.e.get()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void g() {
        btlu j = this.i.a().j();
        if (j != null && j.l()) {
            if (this.p == null && this.q == null && k()) {
                this.e.set(true);
                this.p = new crzp(this) { // from class: aqvy
                    private final aqwb a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.crzp
                    public final void On(crzm crzmVar) {
                        final aqwb aqwbVar = this.a;
                        apsi apsiVar = (apsi) crzmVar.l();
                        if (apsiVar == null || ((Set) apsiVar.a()).isEmpty()) {
                            aqwbVar.j();
                            return;
                        }
                        dccx F = dcdc.F();
                        for (apsg apsgVar : (Set) apsiVar.a()) {
                            aqvd a = aqwbVar.c.a();
                            aqvv a2 = a.a.a();
                            aqvd.a(a2, 1);
                            dxio a3 = ((dxjh) a.b).a();
                            aqvd.a(a3, 2);
                            aqvd.a(apsgVar, 3);
                            F.g(new aqvc(a2, a3, apsgVar));
                        }
                        aqwbVar.h = F.f();
                        if (apsiVar.b() == 1) {
                            aqwbVar.i();
                            return;
                        }
                        if (apsiVar.b() == 2) {
                            aqwbVar.j();
                        }
                        if (!aqwbVar.e().booleanValue()) {
                            if (aqwbVar.g != null || aqwbVar.f != null || !aqwbVar.k()) {
                                return;
                            }
                            aqwbVar.e.set(true);
                            aqwbVar.f = new crzp(aqwbVar) { // from class: aqvz
                                private final aqwb a;

                                {
                                    this.a = aqwbVar;
                                }

                                @Override // defpackage.crzp
                                public final void On(crzm crzmVar2) {
                                    aqwb aqwbVar2 = this.a;
                                    Boolean bool = (Boolean) crzmVar2.l();
                                    if (bool == null) {
                                        aqwbVar2.e.set(false);
                                        aqwbVar2.j();
                                        return;
                                    }
                                    aqwbVar2.e.set(!bool.booleanValue());
                                    aqwbVar2.i();
                                }
                            };
                            aqwbVar.g = aqwbVar.h.get(0).b().b();
                            crzm<Boolean> crzmVar2 = aqwbVar.g;
                            crzp<Boolean> crzpVar = aqwbVar.f;
                            dbsk.s(crzpVar);
                            crzmVar2.d(crzpVar, aqwbVar.b);
                            return;
                        }
                        aqwbVar.e.set(false);
                        aqwbVar.i();
                    }
                };
                crzm<apsi<Set<apsg>>> f = this.k.a().f(j);
                this.q = f;
                crzp<apsi<Set<apsg>>> crzpVar = this.p;
                dbsk.s(crzpVar);
                f.d(crzpVar, this.b);
            }
            if (this.s == null && this.r == null) {
                l();
            }
        }
        l();
    }

    public void h() {
        if (this.q != null && this.p != null) {
            this.e.set(false);
            crzm<apsi<Set<apsg>>> crzmVar = this.q;
            dbsk.s(crzmVar);
            crzp<apsi<Set<apsg>>> crzpVar = this.p;
            dbsk.s(crzpVar);
            crzmVar.c(crzpVar);
            this.q = null;
            this.p = null;
        }
        if (this.g != null && this.f != null) {
            this.e.set(false);
            crzm<Boolean> crzmVar2 = this.g;
            dbsk.s(crzmVar2);
            crzp<Boolean> crzpVar2 = this.f;
            dbsk.s(crzpVar2);
            crzmVar2.c(crzpVar2);
            this.g = null;
            this.f = null;
        }
        if (this.s != null && this.r != null) {
            this.d.set(false);
            crzm<Boolean> crzmVar3 = this.s;
            dbsk.s(crzmVar3);
            crzp<Boolean> crzpVar3 = this.r;
            dbsk.s(crzpVar3);
            crzmVar3.c(crzpVar3);
            this.s = null;
            this.r = null;
        }
        l();
        for (aqur aqurVar : this.h) {
            aqurVar.d();
        }
        this.h = dcdc.e();
    }

    public final void i() {
        this.a.runOnUiThread(new apzx(this));
    }

    public final void j() {
        this.a.runOnUiThread(new Runnable(this) { // from class: aqwa
            private final aqwb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aqwb aqwbVar = this.a;
                if (aqwbVar.k()) {
                    ckos.a(aqwbVar.a.findViewById(16908290), aqwbVar.a.getString(R.string.MESSAGING_GENERIC_ERROR_MESSAGE), 0).c();
                }
            }
        });
    }

    public final boolean k() {
        return this.l.a().a() && this.n.a().D();
    }
}
