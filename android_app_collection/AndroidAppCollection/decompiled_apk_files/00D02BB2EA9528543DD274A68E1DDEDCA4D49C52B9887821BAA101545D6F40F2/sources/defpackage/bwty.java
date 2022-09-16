package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bwty  reason: default package */
/* loaded from: classes4.dex */
final class bwty implements bwzk {
    public static final /* synthetic */ int C = 0;
    static final ddho a;
    static final cjtd b;
    @dzsi
    public bwtl A;
    public final abal B;
    private final akox D;
    private final cjqy E;
    @dzsi
    private cjql F;
    public final bwud c;
    public final Executor d;
    public final btrm e;
    public final bwsh f;
    public final alhv g;
    public final bxce h;
    public final befw j;
    public final akzh k;
    public final bwuy l;
    public final qbo m;
    @dzsi
    public cjqp n;
    @dzsi
    public View o;
    @dzsi
    public akqq q;
    @dzsi
    public akqq s;
    public float w;
    public boolean x;
    @dzsi
    public akqq y;
    public boolean p = true;
    public boolean t = false;
    public boolean u = false;
    public boolean v = false;
    final alht z = new bwtt(this);
    public final bwue i = new bwue();
    public dhkb r = dhkb.e;

    static {
        ddho ddhoVar = dtyb.ed;
        a = ddhoVar;
        b = cjtd.a(ddhoVar);
    }

    public bwty(akto aktoVar, Executor executor, btrm btrmVar, bwsh bwshVar, alhv alhvVar, akox akoxVar, befw befwVar, cjqy cjqyVar, akzh akzhVar, abal abalVar, bwuy bwuyVar, dzsj dzsjVar, bxce bxceVar) {
        this.d = executor;
        this.e = btrmVar;
        this.f = bwshVar;
        this.g = alhvVar;
        this.h = bxceVar;
        this.D = akoxVar;
        this.j = befwVar;
        this.E = cjqyVar;
        this.k = akzhVar;
        this.B = abalVar;
        this.l = bwuyVar;
        this.m = ((qbt) dzsjVar.a()).f();
        this.c = new bwud(aktoVar);
    }

    @Override // defpackage.bwzk
    public final void a(akqq akqqVar, boolean z) {
        if (akqqVar.a == dcyn.a && akqqVar.b == dcyn.a) {
            return;
        }
        if (this.h.x().booleanValue()) {
            this.c.a(akqqVar, this.r, this.i, z);
        }
        View view = this.o;
        if (view != null) {
            int i = true != z ? 1200 : 0;
            int i2 = view.getResources().getConfiguration().orientation;
            View view2 = this.o;
            dbsk.s(view2);
            e(akqqVar, i2, i, view2);
        }
        this.s = akqqVar;
    }

    @Override // defpackage.bwzk
    public final void b() {
        View view;
        akqq akqqVar = this.q;
        if (akqqVar == null || (view = this.o) == null) {
            return;
        }
        int i = view.getResources().getConfiguration().orientation;
        View view2 = this.o;
        dbsk.s(view2);
        e(akqqVar, i, 1200, view2);
    }

    public final void c(cjte cjteVar) {
        cjql cjqlVar = this.F;
        if (cjqlVar != null) {
            this.E.n(cjqlVar, cjteVar, b);
        }
    }

    @Override // defpackage.bwzk
    public final void d(boolean z) {
        View view;
        cjqp cjqpVar;
        if (z && this.F == null && (cjqpVar = this.n) != null) {
            this.F = cjqpVar.d(b);
        }
        this.h.w(z);
        if (z) {
            akqq akqqVar = this.q;
            if (akqqVar != null && (view = this.o) != null) {
                int i = view.getResources().getConfiguration().orientation;
                View view2 = this.o;
                dbsk.s(view2);
                e(akqqVar, i, 0, view2);
            }
            akqq akqqVar2 = this.s;
            if (akqqVar2 != null) {
                this.c.a(akqqVar2, this.r, this.i, true);
            }
        }
        this.p = z;
    }

    public final void e(akqq akqqVar, int i, int i2, View view) {
        this.q = akqqVar;
        if (this.h.x().booleanValue() && !this.t) {
            DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
            int i3 = displayMetrics.widthPixels;
            int i4 = displayMetrics.heightPixels;
            Rect rect = new Rect(0, 0, i3, i4);
            float H = this.h.H();
            if (i == 2) {
                double F = (i3 * this.h.F()) / (this.h.F() + this.h.G());
                Double.isNaN(F);
                rect.offset((int) (F * 0.5d), (int) (H * (-0.5f)));
            } else {
                rect.offset(0, (int) ((((i4 * this.h.F()) / (this.h.F() + this.h.G())) - H) * 0.5f));
            }
            akox akoxVar = this.D;
            bwtx bwtxVar = new bwtx(rect, i3, i4, akqqVar);
            bwtxVar.b = i2;
            akoxVar.p(bwtxVar);
        }
    }
}
