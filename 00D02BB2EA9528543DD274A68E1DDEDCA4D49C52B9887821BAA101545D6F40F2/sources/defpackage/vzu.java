package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: vzu  reason: default package */
/* loaded from: classes7.dex */
public final class vzu implements vzq {
    public final Activity a;
    public final dxio<akzh> b;
    public final amub c;
    public final akox d;
    public final akpq e;
    @dzsi
    public final area f;
    @dzsi
    public ardc g;
    @dzsi
    public arce h;
    public int i;
    public final Object j = new Object();
    public final Runnable k = new vzt(this);
    private final gft l;
    private final vtp m;
    private final askv n;
    private final dxio<qbt> o;
    private final gll p;
    private final dbsz<Integer> q;
    private final int r;
    private final int s;
    private final dbty<Integer> t;

    public vzu(Activity activity, akox akoxVar, dxio<akzh> dxioVar, akpq akpqVar, dxio<qbt> dxioVar2, gll gllVar, gft gftVar, amub amubVar, dbty<Integer> dbtyVar, int i, int i2, boolean z, askv askvVar, dbsz<Integer> dbszVar) {
        this.a = activity;
        this.b = dxioVar;
        this.l = gftVar;
        this.c = amubVar;
        this.r = i;
        this.s = i2;
        this.q = dbszVar;
        if (amubVar.h() == 0) {
            String valueOf = String.valueOf(amubVar.a());
            throw new RuntimeException(valueOf.length() != 0 ? "Attempting to preview a route with 0 steps: ".concat(valueOf) : new String("Attempting to preview a route with 0 steps: "));
        }
        this.t = dbtyVar;
        this.n = askvVar;
        this.d = akoxVar;
        this.o = dxioVar2;
        this.p = gllVar;
        this.e = akpqVar;
        if (z) {
            area areaVar = new area();
            this.f = areaVar;
            areaVar.a = amubVar.X(this.i);
            areaVar.e = 0.0f;
            areaVar.i = 30;
        } else {
            this.f = null;
        }
        this.m = amubVar.an() ? albo.a : albq.a;
    }

    @Override // defpackage.vzq
    public final void a(int i, int i2) {
        if (!((ges) this.l).aD) {
            return;
        }
        int i3 = 0;
        int b = akn.b(i2, 0, this.c.D);
        aslg a = this.n.a(dvdm.CAMERA_2D_NORTH_UP, this.d.w(), this.c.h == dqvj.WALK);
        Rect b2 = this.p.b();
        Rect rect = new Rect(b2.left, b2.top + this.r, b2.right, b2.bottom - this.s);
        Point i4 = this.p.i();
        alad p = this.b.a().p();
        if (i == 2) {
            amuo o = this.c.o(this.t.a().intValue());
            alad e = a.e(o, rect, i4.x, i4.y);
            qbo f = this.o.a().f();
            dbsk.s(f);
            vut I = vuv.I();
            I.A(amuh.e(0, this.c));
            I.H(this.m);
            I.E(false);
            I.o(this.c.ag());
            I.D(false);
            I.x(false);
            ((vur) I).a = o;
            I.Q(alfa.SHOW_NONE);
            f.e(I.O());
            p = e;
        } else if (i == 3) {
            akra X = this.c.X(b);
            dbsk.s(X);
            akqq S = X.S();
            alaa a2 = alad.a();
            a2.c(S);
            a2.e = p.m;
            a2.c = p.k;
            a2.d = 0.0f;
            a2.f = p.n;
            p = a2.a();
        } else if (i == 4) {
            p = a.f(this.c, b, 500.0f, rect, i4.x, i4.y, this.a.getResources().getDisplayMetrics().density);
            dbsk.s(p);
        }
        this.q.NU(Integer.valueOf(b));
        if (i != 1) {
            this.d.p(akyt.e(p));
        }
        if (i != 2) {
            i3 = b;
        }
        this.i = i3;
        this.e.b(this.k);
        this.e.d();
    }

    public final void b() {
        a(2, (int) this.c.K(this.c.o(this.t.a().intValue()).j));
    }
}
