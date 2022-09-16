package defpackage;

import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: anxy  reason: default package */
/* loaded from: classes2.dex */
public class anxy extends anul implements anxw, aoaa {
    private static final dcqe a = dcqe.c("anxy");
    private static final cqss b = irg.a();
    private final anry c;
    private final anwn d;
    private final anxv e;
    private final izw f;
    private dbsg<anod> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anxy(aoge aogeVar, dvay dvayVar, anwn anwnVar, String str, anrz anrzVar, apkr apkrVar) {
        super(str);
        dcdc f;
        final anry a2 = anrzVar.a(dvayVar, aogeVar, false, false);
        cqss cqssVar = b;
        anri anriVar = new anri(cqssVar, cqssVar, apkrVar);
        this.c = a2;
        this.d = anwnVar;
        anxv anxvVar = new anxv(a2);
        this.e = anxvVar;
        anxx anxxVar = new anxx(anxvVar, a2);
        dccx F = dcdc.F();
        if (a2.d()) {
            F.g(anriVar.a(anxxVar, a2));
            F.g(anriVar.c(a2));
            f = F.f();
        } else if (a2.e()) {
            F.g(new ivd(cqrt.h(2131231586, anriVar.a), cqrt.l(R.string.MAPS_ACTIVITY_ADD_VISIT), anriVar.b, new ivc(a2) { // from class: anra
                private final anrr a;

                {
                    this.a = a2;
                }

                @Override // defpackage.ivc
                public final void a(cjqm cjqmVar) {
                    this.a.y();
                }
            }, a2.R(dtyc.aw)));
            f = F.f();
        } else {
            if (a2.c()) {
                F.g(anriVar.b(anxxVar, a2));
            }
            F.g(anriVar.c(a2));
            f = F.f();
        }
        this.f = new ivb(f, null);
        this.g = dbpy.a;
    }

    @Override // defpackage.anxw
    public anwn a() {
        return this.d;
    }

    @Override // defpackage.anxw
    public Boolean c() {
        return Boolean.valueOf(this.c.B());
    }

    @Override // defpackage.anul
    public dcdc<dvan> d() {
        return this.c.k;
    }

    @Override // defpackage.anxw
    public Boolean e() {
        return Boolean.valueOf(this.c.C());
    }

    @Override // defpackage.anul
    public final Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("has-pending-edit", l().k().booleanValue());
        return bundle;
    }

    @Override // defpackage.anul
    public final void g(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("has-pending-edit")) {
            bvoo.h("Expected bundle with key has-pending-edit", new Object[0]);
        } else {
            l().r(bundle.getBoolean("has-pending-edit"));
        }
    }

    @Override // defpackage.anxw
    public Boolean h() {
        return Boolean.valueOf(this.c.e());
    }

    @Override // defpackage.anxw
    public aoij i() {
        return this.c.D();
    }

    @Override // defpackage.anxw
    public aoiu j() {
        return this.c.E();
    }

    @Override // defpackage.anxw
    public cqkl k() {
        this.c.x();
        return cqkl.a;
    }

    @Override // defpackage.anxw
    public Boolean m() {
        boolean z = true;
        if (!this.c.c() && !this.c.d()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.anxw
    public izw n() {
        return this.f;
    }

    @Override // defpackage.anxw
    public jic o() {
        return this.c.J();
    }

    @Override // defpackage.anxw
    public Boolean p() {
        return this.c.F();
    }

    @Override // defpackage.anxw
    public anod q() {
        if (!this.g.a()) {
            this.g = dbsg.i(new anoe(this.c));
        }
        return this.g.b();
    }

    @Override // defpackage.anxw
    public cjtd r() {
        anry anryVar = this.c;
        int a2 = dqjn.a(anryVar.g.n);
        return anryVar.R((a2 != 0 && a2 == 2) ? dtyi.ax : dtyi.at);
    }

    @Override // defpackage.anxw
    public Boolean s() {
        return Boolean.valueOf(this.c.s());
    }

    @Override // defpackage.anxw
    public aofb t() {
        return this.c.t();
    }

    @Override // defpackage.anxw
    /* renamed from: u */
    public anxv l() {
        return this.e;
    }

    @Override // defpackage.aoaa
    public eapd v() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        dwyn dwynVar = x().f;
        if (dwynVar == null) {
            dwynVar = dwyn.d;
        }
        return new eapd(timeUnit.toMillis(dwynVar.b));
    }

    @Override // defpackage.aoaa
    public eapd w() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        dwyn dwynVar = x().g;
        if (dwynVar == null) {
            dwynVar = dwyn.d;
        }
        return new eapd(timeUnit.toMillis(dwynVar.b));
    }

    public dvay x() {
        return this.c.g;
    }
}
