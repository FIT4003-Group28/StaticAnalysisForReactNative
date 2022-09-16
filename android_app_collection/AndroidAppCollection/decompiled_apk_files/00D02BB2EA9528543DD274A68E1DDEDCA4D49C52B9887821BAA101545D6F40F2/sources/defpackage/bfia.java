package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
/* compiled from: PG */
/* renamed from: bfia  reason: default package */
/* loaded from: classes3.dex */
public final class bfia implements jkh {
    public static final /* synthetic */ int c = 0;
    private static final cqtv d = ibn.k();
    private static final int[] e = new int[2];
    public final bfkk a;
    final bfhz b = new bfhz(this);
    private final Activity f;
    private final eeu g;
    private final dzsj<glj> h;
    private final jkf i;
    private final dbty<View> j;
    @dzsi
    private final bnig k;
    @dzsi
    private final bnih l;
    @dzsi
    private final begc m;
    @dzsi
    private View n;
    @dzsi
    private View o;
    @dzsi
    private View p;
    private float q;
    private float r;
    private boolean s;
    private float t;

    public bfia(Activity activity, eeu eeuVar, dzsj<glj> dzsjVar, jkf jkfVar, dbty<View> dbtyVar, bfkk bfkkVar, @dzsi bnig bnigVar, @dzsi bnih bnihVar, @dzsi begc begcVar) {
        this.f = activity;
        this.g = eeuVar;
        this.h = dzsjVar;
        this.i = jkfVar;
        this.j = dbtyVar;
        this.a = bfkkVar;
        this.k = bnigVar;
        this.l = bnihVar;
        this.m = begcVar;
    }

    private static float f(jjn jjnVar, float f) {
        if (jjnVar != jjn.COLLAPSED || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min((1.0f - f) / 0.125f, 1.0f);
    }

    private final cqtv g(jjn jjnVar, float f) {
        jjn jjnVar2 = jjn.HIDDEN;
        int ordinal = jjnVar.ordinal();
        if (ordinal == 1) {
            if (f <= 0.5f) {
                return d;
            }
            return cqrp.c(((1.0f - f) / 0.5f) * this.q);
        } else if (ordinal != 2 && ordinal != 3) {
            return d;
        } else {
            return cqrp.d(dcyn.a);
        }
    }

    private static float h(jjn jjnVar, float f, float f2, float f3, float f4, float f5) {
        jjn jjnVar2 = jjn.HIDDEN;
        int ordinal = jjnVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                f2 = f3;
                f3 = f4;
            } else if (ordinal == 2) {
                f2 = f4;
                f3 = f5;
            } else if (ordinal == 3) {
                return f5;
            } else {
                f2 = 0.0f;
                f3 = 0.0f;
            }
        }
        return ((1.0f - f) * f2) + (f * f3);
    }

    private final boolean i() {
        return this.a.b().booleanValue() || this.a.i().booleanValue();
    }

    private final int j() {
        View view = this.o;
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }

    @dzsi
    private final bhdw k() {
        bnih bnihVar = this.l;
        if (bnihVar != null) {
            return bnihVar.Z();
        }
        return null;
    }

    private static int l(View view) {
        int[] iArr = e;
        view.getLocationOnScreen(iArr);
        return iArr[1];
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.jkh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(defpackage.jkj r13, defpackage.jjn r14, float r15) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfia.P(jkj, jjn, float):void");
    }

    public final void a() {
        View a = this.j.a();
        View rootView = a.getRootView();
        this.n = cqhu.a(rootView, bfzt.m);
        this.o = cqhu.a(rootView, bgzm.a);
        this.p = cqhu.a(rootView, bfzt.o);
        this.q = d.a(this.f);
        this.r = ise.b.a(this.f);
        this.s = k() != null;
        this.t = jmj.a(this.f, 102);
        jkj l = this.i.l();
        View j = l.j();
        if (j != null) {
            if (a != j) {
                for (ViewParent parent = a.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != j) {
                    }
                }
            }
            P(l, l.L(), 0.0f);
            break;
        }
        this.a.Pq(false);
    }

    final int b() {
        if (!this.g.b()) {
            return 0;
        }
        return (int) (this.j.a().getWidth() / bfki.a(this.f.getResources()));
    }

    public final float c(jkj jkjVar, jjn jjnVar, float f) {
        float f2;
        float f3;
        if (i() && (jjnVar != jjn.EXPANDED || this.s)) {
            int b = b();
            if (this.s) {
                int i = -b;
                f2 = j() + i;
                f3 = i;
            } else {
                f2 = -bfki.g(jkjVar, jjn.EXPANDED, 0.0f);
                f3 = 0.0f;
            }
            return h(jjnVar, f, 0.0f, 0.0f, f2, f3);
        }
        return -bfki.g(jkjVar, jjnVar, f);
    }

    public final void d() {
        this.h.a().e(this);
        this.h.a().f(this.b);
    }

    public final void e() {
        this.h.a().j(this);
        this.h.a().i(this.b);
        this.a.Pq(false);
    }
}
