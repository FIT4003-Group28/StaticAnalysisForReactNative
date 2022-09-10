package defpackage;
/* compiled from: PG */
/* renamed from: abfa  reason: default package */
/* loaded from: classes.dex */
public class abfa {
    public final btvo a;

    public abfa(btvo btvoVar) {
        this.a = btvoVar;
    }

    public final boolean a() {
        dkiy enableFeatureParameters = this.a.getEnableFeatureParameters();
        if (enableFeatureParameters.i == 301) {
            return ((Boolean) enableFeatureParameters.j).booleanValue();
        }
        return false;
    }

    public final boolean b() {
        return a() && this.a.getEnableFeatureParameters().bh;
    }

    public final boolean c() {
        dktp dktpVar = this.a.getPassiveAssistParameters().a().y;
        if (dktpVar == null) {
            dktpVar = dktp.e;
        }
        int a = dkto.a(dktpVar.b);
        return a != 0 && a == 4;
    }

    public final boolean d() {
        int a = dkix.a(this.a.getEnableFeatureParameters().bd);
        return (a == 0 || a == 1) ? false : true;
    }

    public final boolean e() {
        int a;
        return d() && (a = dkix.a(this.a.getEnableFeatureParameters().bd)) != 0 && a == 4;
    }

    public final boolean f() {
        return this.a.getPassiveAssistParameters().s() != 1;
    }

    public final boolean g() {
        return f() && this.a.getPassiveAssistParameters().s() == 2;
    }

    public final boolean h() {
        return this.a.getHotelBookingModuleParameters().d();
    }

    public final boolean i() {
        return this.a.getPassiveAssistParameters().a().aq;
    }

    public final boolean j() {
        int a = dkiv.a(this.a.getEnableFeatureParameters().bf);
        return (a == 0 || a == 1) ? false : true;
    }

    public final boolean k() {
        int a;
        return j() && (a = dkiv.a(this.a.getEnableFeatureParameters().bf)) != 0 && a == 2;
    }

    public final boolean l() {
        int a;
        return j() && (a = dkiv.a(this.a.getEnableFeatureParameters().bf)) != 0 && a == 3;
    }

    public final boolean m() {
        return this.a.getEnableFeatureParameters().bj;
    }

    public final boolean n() {
        return this.a.getPassiveAssistParameters().a().ar;
    }

    public final boolean o() {
        dktp dktpVar = this.a.getPassiveAssistParameters().a().D;
        if (dktpVar == null) {
            dktpVar = dktp.e;
        }
        int a = dkto.a(dktpVar.b);
        return a != 0 && a == 4;
    }

    public final boolean p() {
        dktp dktpVar = this.a.getPassiveAssistParameters().a().T;
        if (dktpVar == null) {
            dktpVar = dktp.e;
        }
        int a = dkto.a(dktpVar.b);
        return a != 0 && a == 4;
    }

    public final boolean q() {
        dktp dktpVar = this.a.getPassiveAssistParameters().a().G;
        if (dktpVar == null) {
            dktpVar = dktp.e;
        }
        int a = dkto.a(dktpVar.b);
        return a != 0 && a == 4;
    }

    public final boolean r() {
        dktp dktpVar = this.a.getPassiveAssistParameters().a().H;
        if (dktpVar == null) {
            dktpVar = dktp.e;
        }
        int a = dkto.a(dktpVar.b);
        return a != 0 && a == 4;
    }

    public final boolean s() {
        dktp dktpVar = this.a.getPassiveAssistParameters().a().I;
        if (dktpVar == null) {
            dktpVar = dktp.e;
        }
        int a = dkto.a(dktpVar.b);
        return a != 0 && a == 4;
    }

    public final boolean t() {
        dktp dktpVar = this.a.getPassiveAssistParameters().a().K;
        if (dktpVar == null) {
            dktpVar = dktp.e;
        }
        int a = dkto.a(dktpVar.b);
        return a != 0 && a == 4;
    }

    public final boolean u() {
        dktp dktpVar = this.a.getPassiveAssistParameters().a().L;
        if (dktpVar == null) {
            dktpVar = dktp.e;
        }
        int a = dkto.a(dktpVar.b);
        return a != 0 && a == 4;
    }

    public final boolean v() {
        dktp dktpVar = this.a.getPassiveAssistParameters().a().P;
        if (dktpVar == null) {
            dktpVar = dktp.e;
        }
        int a = dkto.a(dktpVar.b);
        return a != 0 && a == 4;
    }

    public final boolean w() {
        dktp dktpVar = this.a.getPassiveAssistParameters().a().E;
        if (dktpVar == null) {
            dktpVar = dktp.e;
        }
        int a = dkto.a(dktpVar.b);
        return a != 0 && a == 4;
    }

    public final boolean x() {
        return this.a.getPassiveAssistParameters().a().R;
    }

    public final boolean y() {
        return this.a.getPassiveAssistParameters().q().b;
    }
}
