package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: bxqr  reason: default package */
/* loaded from: classes4.dex */
public class bxqr implements bxol, bxjq {
    public final dxio<glj> a;
    public final Activity b;
    private final bxpz d;
    private final bxko e;
    private final HashSet<Integer> f = new HashSet<>();
    private final HashSet<Integer> g = new HashSet<>();
    public boolean c = true;
    private final cqqw h = new bxqq(this);

    public bxqr(Activity activity, dxio<glj> dxioVar, bxpz bxpzVar, bxko bxkoVar) {
        this.a = dxioVar;
        this.d = bxpzVar;
        this.e = bxkoVar;
        this.b = activity;
    }

    private final void g(cqiv cqivVar) {
        bxoi B = this.d.B();
        if (B != null) {
            h(cqivVar);
            cqivVar.a(new bxnl(), B);
        }
    }

    private final <V extends cqkp> void h(cqiv cqivVar) {
        if (cqivVar.i() == 0) {
            return;
        }
        if (cqivVar.i() == 1 && this.d.t().booleanValue()) {
            return;
        }
        this.f.add(Integer.valueOf(cqivVar.i()));
    }

    @Override // defpackage.bxjq
    public boolean a(int i) {
        return this.f.contains(Integer.valueOf(i));
    }

    @Override // defpackage.bxjq
    public boolean b(int i) {
        return this.g.contains(Integer.valueOf(i));
    }

    @Override // defpackage.bxol
    public void c(cqiv cqivVar) {
        bxoi f;
        bxnz h;
        bxnw j;
        bxoi o;
        bxog y;
        jbi D;
        this.f.clear();
        this.g.clear();
        if (this.d.t().booleanValue() && (D = this.d.D()) != null) {
            cqivVar.a(new bxfe(), D);
        }
        if (this.d.z().booleanValue()) {
            bxnx c = this.d.c();
            h(cqivVar);
            cqivVar.a(new bxms(), c);
        }
        if (this.d.m().booleanValue()) {
            bxof A = this.d.A();
            h(cqivVar);
            cqivVar.a(new bxkl(), A);
        }
        boolean M = this.e.M();
        if (M) {
            g(cqivVar);
        }
        drgv x = this.d.x();
        if (x != null && (x.a & 1) != 0) {
            drgu drguVar = x.b;
            if (drguVar == null) {
                drguVar = drgu.b;
            }
            if (drguVar.a) {
                cqivVar.a(new brhv(), new bsqs(dtyb.eu));
            }
        }
        if (this.d.w().booleanValue() && (y = this.d.y()) != null) {
            h(cqivVar);
            for (int i = 0; i < y.a().size(); i++) {
                if (i != 0) {
                    this.g.add(Integer.valueOf(cqivVar.i()));
                }
                cqivVar.a(new bxhc(), y.a().get(i));
            }
            if (y.c()) {
                if (!y.a().isEmpty()) {
                    this.g.add(Integer.valueOf(cqivVar.i()));
                }
                cqivVar.a(new bxne(), y.b());
            }
            if (y.d()) {
                cqivVar.a(new bxnm(), y);
            }
        }
        if (this.d.C().booleanValue() && (o = this.d.o()) != null) {
            h(cqivVar);
            cqivVar.a(new bxnl(), o);
        }
        if (!M) {
            g(cqivVar);
        }
        if (this.d.n().booleanValue() && (j = this.d.j()) != null) {
            h(cqivVar);
            cqivVar.a(new bxmr(), j);
        }
        if (this.d.g().booleanValue() && (h = this.d.h()) != null) {
            h(cqivVar);
            cqivVar.a(new bxjp(), h);
        }
        if (!this.d.k().booleanValue() || (f = this.d.f()) == null) {
            return;
        }
        h(cqivVar);
        cqivVar.a(new bxml(), f);
    }

    @Override // defpackage.bxol
    public cqqw d() {
        return this.h;
    }

    @Override // defpackage.bxol
    public Boolean e() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.bxol
    public abp f(Context context) {
        return new bxjr(context, this);
    }
}
