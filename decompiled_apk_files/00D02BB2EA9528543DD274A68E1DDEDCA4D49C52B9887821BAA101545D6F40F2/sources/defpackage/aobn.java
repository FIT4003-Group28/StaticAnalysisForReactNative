package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aobn  reason: default package */
/* loaded from: classes2.dex */
public class aobn implements aobh {
    private static final dcqe c = dcqe.c("aobn");
    public final cjqy a;
    private final Activity d;
    private final aniy e;
    private final apjz f;
    private final aobv g;
    private final anhg h;
    private final cpv j;
    @dzsi
    private angu<aogb, aoge> l;
    private dcdc<jho> k = dcdc.e();
    private String m = "";
    private String n = "";
    private String o = "";
    private boolean p = false;
    private boolean q = true;
    public boolean b = false;
    private boolean r = true;
    private boolean s = true;
    private final dbsg<View> t = dbpy.a;
    private final cjtd i = cjtd.a(dtyi.bi);

    public aobn(Activity activity, aniz anizVar, apjz apjzVar, aobv aobvVar, anhg anhgVar, cjqy cjqyVar, cpv cpvVar) {
        this.d = activity;
        this.f = apjzVar;
        this.h = anhgVar;
        this.a = cjqyVar;
        this.g = aobvVar;
        this.j = cpvVar;
        this.e = anizVar.a(new aobi(this, anhgVar), new aobj(this, aobvVar));
    }

    private final void v() {
        if (!this.b) {
            this.g.d(this.m);
        }
    }

    private final void w() {
        String string;
        dccx F = dcdc.F();
        if (this.r && !this.b) {
            jhm jhmVar = new jhm();
            jhmVar.a = this.d.getString(R.string.MAPS_ACTIVITY_TIMELINE_EDIT_DAY);
            jhmVar.c = cqrt.g(2131232642, irg.k());
            jhmVar.h = 2;
            jhmVar.d(new aobl(this));
            jhmVar.f = cjtd.a(dtyi.bj);
            F.g(jhmVar.c());
        }
        jhm jhmVar2 = new jhm();
        if (k().booleanValue()) {
            string = this.d.getString(R.string.MAPS_ACTIVITY_TIMELINE_HIDE_CALENDAR);
        } else {
            string = this.d.getString(R.string.MAPS_ACTIVITY_TIMELINE_SHOW_CALENDAR);
        }
        jhmVar2.a = string;
        jhmVar2.c = cqrt.g(2131231596, irg.k());
        jhmVar2.h = 2;
        jhmVar2.d(new aobm(this));
        F.g(jhmVar2.c());
        F.i(this.k);
        this.g.f(F.f());
    }

    @Override // defpackage.aobh
    public Boolean a() {
        return Boolean.valueOf(this.q);
    }

    @Override // defpackage.aobh
    public Boolean b() {
        return Boolean.valueOf(btpf.c(this.d) == btpf.TABLET_LANDSCAPE);
    }

    @Override // defpackage.aobh
    public aobu c() {
        return this.g;
    }

    @Override // defpackage.aobh
    public Boolean d() {
        boolean z = false;
        if (!this.s || this.b) {
            return false;
        }
        if (!this.n.isEmpty() || !this.o.isEmpty() || b().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aobh
    public String e() {
        return this.n;
    }

    @Override // defpackage.aobh
    public String f() {
        return this.o;
    }

    @Override // defpackage.aobh
    public String g() {
        if (!r().booleanValue()) {
            return "";
        }
        if (!e().isEmpty() || !f().isEmpty()) {
            if (e().isEmpty()) {
                return this.d.getString(R.string.MAPS_ACTIVITY_ADD_TITLE);
            }
            return f().isEmpty() ? this.d.getString(R.string.MAPS_ACTIVITY_ADD_NOTE) : "";
        }
        return this.d.getString(R.string.MAPS_ACTIVITY_ADD_TITLE_AND_NOTE);
    }

    @Override // defpackage.aobh
    public cqkl h() {
        u();
        return cqkl.a;
    }

    @Override // defpackage.aobh
    public cjtd i() {
        return this.i;
    }

    @Override // defpackage.aobh
    public aniu j() {
        return this.e;
    }

    @Override // defpackage.aobh
    public Boolean k() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.aobh
    public View.OnTouchListener l() {
        return new aobk(this);
    }

    public void m(angu<aogb, aoge> anguVar) {
        eapg m = anguVar.a().m();
        this.l = anguVar;
        this.m = this.f.b(m, 20);
        angs<aoge> b = anguVar.b();
        if (b.e()) {
            dvba dvbaVar = b.f().a().g;
            if (dvbaVar == null) {
                dvbaVar = dvba.e;
            }
            this.p = true;
            this.n = dvbaVar.b;
            this.o = dvbaVar.c;
        } else {
            this.p = false;
            this.n = "";
            this.o = "";
        }
        v();
        cqkx.p(this);
        this.e.e(new eapy(m));
    }

    public void n(dcdc<jho> dcdcVar) {
        this.k = dcdcVar;
        w();
        cqkx.p(this.g);
    }

    public void o(boolean z) {
        this.r = false;
        w();
        cqkx.p(this.g);
    }

    public void p() {
        angu<aogb, aoge> anguVar = this.l;
        if (anguVar == null) {
            bvoo.h("setSelectedDayRef must be called before toggleCalendar", new Object[0]);
            return;
        }
        boolean z = !this.b;
        this.b = z;
        if (z) {
            eapy eapyVar = new eapy(anguVar.a().m());
            this.e.e(eapyVar);
            this.g.e(eapyVar);
        } else {
            v();
        }
        w();
        cqkx.p(this);
    }

    public boolean q() {
        boolean z = this.b;
        if (z) {
            p();
        }
        return z;
    }

    public Boolean r() {
        return Boolean.valueOf(this.p);
    }

    public void s(boolean z) {
        if (this.q != z) {
            this.q = z;
            cqkx.p(this);
        }
    }

    public void t(boolean z) {
        this.s = false;
    }

    public final void u() {
        angu<aogb, aoge> anguVar = this.l;
        if (anguVar == null) {
            return;
        }
        angs<aoge> b = anguVar.b();
        if (!b.e()) {
            return;
        }
        this.h.i(b.f());
    }
}
