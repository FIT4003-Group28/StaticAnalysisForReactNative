package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aiel  reason: default package */
/* loaded from: classes2.dex */
public final class aiel implements aify {
    private final ardc a;
    private final akpq b;
    private final Runnable c = new aieg(this);
    private final akra d = new akra();
    private double e;
    @dzsi
    private ardd f;
    @dzsi
    private ardd g;

    public aiel(ardc ardcVar, akpq akpqVar) {
        this.a = ardcVar;
        this.b = akpqVar;
    }

    @Override // defpackage.aify
    public final void a() {
    }

    @Override // defpackage.aify
    public final synchronized void b(aifq aifqVar) {
        this.d.aa(aifqVar.a().a());
        double a = ((aiek) aifqVar.g(aiek.class)).a();
        this.e = a;
        if (a != dcyn.a) {
            g();
        }
        if (this.f == null || this.g == null) {
            return;
        }
        this.b.b(this.c);
        this.b.d();
    }

    @Override // defpackage.aify
    public final synchronized void c() {
        ardd arddVar = this.f;
        ardd arddVar2 = this.g;
        if (arddVar != null && arddVar2 != null) {
            arddVar.b();
            arddVar2.b();
            this.f = null;
            this.g = null;
            this.b.c(this.c);
        }
        this.a.c();
    }

    @Override // defpackage.aify
    public final void d(aifq aifqVar) {
    }

    @Override // defpackage.aify
    public final dcdc<aifn> e(int i) {
        return dcdc.f(new aieh(i, irf.a));
    }

    public final synchronized void f() {
        ardd arddVar = this.f;
        ardd arddVar2 = this.g;
        if (arddVar != null && arddVar2 != null) {
            float r = (float) (this.e * this.d.r());
            arddVar.c(this.d, r);
            arddVar2.c(this.d, r);
            arddVar.a(true);
            arddVar2.a(true);
        }
    }

    private final synchronized void g() {
        if (this.f == null || this.g == null) {
            this.f = this.a.f(R.color.new_location_accuracy_fill, false, bntn.FRIEND_ACCURACY_CIRCLE, 5);
            this.g = this.a.f(R.color.new_location_accuracy_line, true, bntn.FRIEND_ACCURACY_CIRCLE, 6);
            this.b.a(this.c);
        }
    }
}
