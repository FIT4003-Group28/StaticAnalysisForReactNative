package defpackage;

import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: asdh  reason: default package */
/* loaded from: classes2.dex */
public final class asdh implements akzv {
    private static final float a = (float) (1.0d / Math.log(2.0d));
    private final float b;
    private final gll c;
    private final arbu d;
    private final akzh e;
    private final bvnx f;
    private final akra h;
    private long j;
    private final alaa g = new alaa();
    private Rect i = new Rect();

    public asdh(akzh akzhVar, bvnx bvnxVar, Resources resources, gll gllVar, arbu arbuVar, akra akraVar) {
        dbsk.s(akzhVar);
        this.e = akzhVar;
        dbsk.s(bvnxVar);
        this.f = bvnxVar;
        this.c = gllVar;
        this.b = resources.getDisplayMetrics().density * 256.0f;
        dbsk.s(arbuVar);
        this.d = arbuVar;
        this.h = akraVar;
    }

    @Override // defpackage.akzv
    public final int d() {
        return alad.h;
    }

    @Override // defpackage.akzv
    public final int e(long j) {
        alad a2;
        akra akraVar = this.h;
        Rect b = this.c.b();
        if (!this.i.isEmpty() || !b.isEmpty()) {
            if (!b.equals(this.i) && !b.isEmpty()) {
                this.i = b;
            }
            alaa alaaVar = new alaa();
            Point i = this.c.i();
            alae a3 = alae.a(this.i.exactCenterX(), this.i.exactCenterY(), i.x, i.y);
            akra akraVar2 = new akra();
            if (!this.d.f().f(akraVar2)) {
                akraVar2.aa(akraVar);
            }
            akrp f = akrp.f(new akra[]{akraVar, akraVar2});
            float min = Math.min(17.75f, 30.0f - (((float) Math.log(Math.max(((f.m() + 4000) * this.b) / this.i.width(), ((f.n() + 4000) * this.b) / this.i.height()) / 0.6f)) * a));
            akra akraVar3 = new akra();
            f.t(akraVar3);
            alaaVar.d(akraVar3);
            alaaVar.c = min;
            alaaVar.e = 0.0f;
            alaaVar.d = 0.0f;
            alaaVar.f = a3;
            a2 = alaaVar.a();
        } else {
            a2 = this.e.p();
        }
        long j2 = this.j;
        this.j = j;
        double d = j - j2;
        Double.isNaN(d);
        float exp = (float) (1.0d - Math.exp((-d) / 500.0d));
        alad p = this.e.p();
        float f2 = p.m;
        float f3 = a2.m;
        float abs = Math.abs(f3 - f2);
        if (abs >= 360.0f - abs) {
            f3 = f3 < f2 ? f3 + 360.0f : f3 - 360.0f;
        }
        this.g.d(p.j.I(a2.j, exp));
        alaa alaaVar2 = this.g;
        float f4 = p.k;
        alaaVar2.c = f4 + ((a2.k - f4) * exp);
        float f5 = p.m;
        alaaVar2.e = f5 + ((f3 - f5) * exp);
        float f6 = p.l;
        alaaVar2.d = f6 + ((a2.l - f6) * exp);
        alaaVar2.f = p.n.d(a2.n, exp);
        return 2;
    }

    @Override // defpackage.akzv
    public final long f() {
        return -1L;
    }

    @Override // defpackage.akzv
    public final boolean g() {
        return false;
    }

    @Override // defpackage.akzv
    public final boolean h() {
        return true;
    }

    @Override // defpackage.akzv
    public final void i() {
    }

    @Override // defpackage.akzv
    public final void j(int i) {
        this.j = this.f.a();
    }

    @Override // defpackage.akzv
    @dzsi
    public final Object k(int i) {
        return this.g.e(i);
    }

    @Override // defpackage.akzv
    @dzsi
    public final Object l(int i) {
        return null;
    }

    @Override // defpackage.akzv
    public final boolean m(@dzsi akzv akzvVar, int i) {
        return true;
    }

    @Override // defpackage.akzv
    public final void n(@dzsi akzv akzvVar, int i) {
    }
}
