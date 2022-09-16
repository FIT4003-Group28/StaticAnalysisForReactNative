package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: iql  reason: default package */
/* loaded from: classes6.dex */
public final class iql {
    public final jkj a;
    public final dbty<Rect> b;
    public final cjxz c;
    public boolean d;
    @dzsi
    public akqq e;
    public final dxio<akzh> f;
    public final akox g;
    public final gll h;
    public final Executor i;
    public final cjyb j;
    private final gft k;
    @dzsi
    private akxp l;
    private boolean m;
    @dzsi
    private akzh n;
    private final Activity o;
    private final bnsn p;

    public iql(gft gftVar, akox akoxVar, hwe hweVar, Executor executor, jkj jkjVar, gll gllVar, Activity activity, dxio<akzh> dxioVar, cjyb cjybVar) {
        iqi iqiVar = new iqi(hweVar);
        this.c = new cjxz();
        new iqh(this);
        this.d = true;
        this.a = jkjVar;
        this.k = gftVar;
        this.b = iqiVar;
        this.o = activity;
        this.p = akoxVar.j();
        this.f = dxioVar;
        this.h = gllVar;
        this.i = executor;
        this.g = akoxVar;
        this.j = cjybVar;
    }

    private static Point g(gll gllVar) {
        Rect e = gllVar.e();
        return new Point(e.centerX(), e.centerY());
    }

    private final akxp h() {
        if (this.l == null) {
            this.l = new iqk(this, this.p);
        }
        return this.l;
    }

    public final void a(boolean z) {
        boolean z2 = true;
        boolean z3 = btpf.b(this.o) && this.o.getResources().getConfiguration().orientation == 2;
        if (z && !z3) {
            z2 = false;
        }
        this.m = z2;
    }

    public final void b() {
        h().b();
    }

    public final void c() {
        h().c();
    }

    public final void d(@dzsi akqq akqqVar, boolean z) {
        this.e = akqqVar;
        if (akqqVar == null || !z) {
            return;
        }
        jjn L = this.a.L();
        e(L, L == jjn.EXPANDED ? 250 : -1);
    }

    public final void e(jjn jjnVar, int i) {
        akqq akqqVar = this.e;
        if (!this.k.bb() || !this.d || akqqVar == null) {
            return;
        }
        float f = this.f.a().p().k;
        if (jjnVar == jjn.EXPANDED && this.m) {
            this.n = this.f.a().b();
            if (!btpf.b(this.o) || this.o.getResources().getConfiguration().orientation != 2) {
                f = Math.max(f, 14.0f);
            }
            Rect e = this.h.e();
            akox akoxVar = this.g;
            akyc j = akyt.j(akqqVar, f, e);
            j.b = i;
            akoxVar.q(j, null);
        } else if (jjnVar == jjn.COLLAPSED) {
            akzh akzhVar = this.n;
            if (akzhVar != null) {
                alao.e(this.g, akzhVar, akqqVar, ((iqi) this.b).a(), this.h.b(), g(this.h), akzhVar.p().k, i, null);
                this.n = null;
                return;
            }
            f(akqqVar, i);
        } else if (jjnVar == jjn.HIDDEN) {
            f(akqqVar, i);
        } else if (jjnVar != jjn.FULLY_EXPANDED || !btpf.b(this.o)) {
        } else {
            f(akqqVar, i);
        }
    }

    public final void f(akqq akqqVar, int i) {
        alad p = this.f.a().p();
        if (p != null) {
            float f = p.k;
            if (dbsd.a(this.f.a().p().i, akqqVar)) {
                return;
            }
            Rect rect = new Rect();
            Rect b = this.h.b();
            if (rect.height() > b.height() || rect.width() > b.width()) {
                akox akoxVar = this.g;
                akyc i2 = akyt.i(akqqVar, f);
                i2.b = i;
                akoxVar.q(i2, null);
                return;
            }
            alao.e(this.g, this.f.a().b(), akqqVar, ((iqi) this.b).a(), b, g(this.h), f, i, null);
        }
    }
}
