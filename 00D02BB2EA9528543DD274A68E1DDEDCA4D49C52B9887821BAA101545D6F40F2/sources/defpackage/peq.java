package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: peq  reason: default package */
/* loaded from: classes.dex */
public final class peq implements SharedPreferences.OnSharedPreferenceChangeListener, pfk {
    public final Application a;
    public final axru b;
    public final pep c;
    public final akfa d;
    private final btrm e;
    private final bvkx f;
    private final bvjj g;

    public peq(Application application, btrm btrmVar, bvkx bvkxVar, bvjj bvjjVar, axru axruVar, akfa akfaVar, btvo btvoVar) {
        String packageName = application.getPackageName();
        this.a = application;
        this.e = btrmVar;
        this.f = bvkxVar;
        this.g = bvjjVar;
        this.b = axruVar;
        this.d = akfaVar;
        pep pepVar = new pep(packageName, btlu.n(akfaVar.j()));
        this.c = pepVar;
        pepVar.f(cres.a(bvjjVar).d);
        pepVar.g(!bvjjVar.m(bvjk.eO, true));
        pepVar.h(f(application, akfaVar, btvoVar));
        bvjjVar.d.registerOnSharedPreferenceChangeListener(this);
        dceq a = dcet.a();
        a.b(crhp.class, new per(0, crhp.class, this));
        a.b(btvr.class, new per(1, btvr.class, this));
        btrmVar.g(this, a.a());
    }

    public static boolean f(Context context, akfa akfaVar, btvo btvoVar) {
        return ckri.a(context, akfaVar, btvoVar.getEnableFeatureParameters());
    }

    @Override // defpackage.pfk
    public final void a() {
        this.e.a(this);
        this.g.d.unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // defpackage.pfk
    public final void b() {
        if (this.c.a()) {
            g(false);
        }
    }

    @Override // defpackage.pfk
    public final void c() {
        if (this.c.b()) {
            g(true);
        }
    }

    @Override // defpackage.pfk
    public final void d() {
        if (this.c.c()) {
            g(true);
        }
    }

    @Override // defpackage.pfk
    public final void e() {
        if (this.c.d()) {
            g(true);
        }
    }

    public final void g(boolean z) {
        peo peoVar = new peo(this);
        if (z) {
            peoVar.run();
        } else {
            this.f.j(peoVar, bvrj.BACKGROUND_THREADPOOL, bvkw.ON_STARTUP_FULLY_COMPLETE);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (bvjk.eL.toString().equals(str)) {
            if (!this.c.f(cres.a(this.g).d)) {
                return;
            }
            g(false);
        } else if (!bvjk.eO.toString().equals(str)) {
        } else {
            if (!this.c.g(!this.g.m(bvjk.eO, true))) {
                return;
            }
            g(false);
        }
    }
}
