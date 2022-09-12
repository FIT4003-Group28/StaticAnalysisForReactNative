package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: bkpj  reason: default package */
/* loaded from: classes3.dex */
public class bkpj extends cqqw {
    public bkrz a;
    private final bksa e;
    private final int f;
    private final int g;
    @dzsi
    private final bksm m;
    private int l = 1;
    private boolean h = false;
    private boolean i = true;
    public dbsg<Integer> b = dbsg.i(0);
    private dbsg<Integer> j = dbpy.a;
    public int d = 1;
    Integer c = null;
    private float k = 0.0f;

    public bkpj(Activity activity, bksa bksaVar, bksm bksmVar) {
        this.e = bksaVar;
        this.m = bksmVar;
        this.f = jmj.a(activity, 58);
        this.g = jmj.a(activity, 58);
    }

    private final boolean g(int i) {
        return i > this.f;
    }

    @dzsi
    private final View h() {
        for (View view : cqkx.n(this.e)) {
            View a = cqhu.a(view, bkqj.a);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        int i2 = 1;
        if (i == 1) {
            this.h = true;
        } else if (!this.h || i != 0) {
        } else {
            this.h = false;
            if (this.a == null || !this.i || !this.b.a() || f(1) >= this.b.b().intValue() || this.b.b().intValue() >= f(2)) {
                return;
            }
            int i3 = this.l;
            if (i3 != 0) {
                if (i3 == 1) {
                    i2 = 2;
                }
                bkrz bkrzVar = this.a;
                int f = f(i2);
                bloj blojVar = (bloj) bkrzVar;
                RecyclerView p = blojVar.a.p();
                if (p == null) {
                    return;
                }
                dbsg<Integer> C = ((bloi) blojVar.b.g).b.c.C();
                if (!C.a()) {
                    return;
                }
                p.t(0, f - C.b().intValue());
                return;
            }
            throw null;
        }
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (i2 > 0) {
            this.l = 1;
        } else if (i2 < 0) {
            this.l = 2;
        }
        c();
    }

    public final void c() {
        dbsg<Integer> i;
        bkrz bkrzVar;
        RecyclerView p;
        View h = h();
        if (h == null) {
            i = dbpy.a;
        } else {
            int height = h.getHeight();
            if (h.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) h.getLayoutParams();
                height = height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            i = dbsg.i(Integer.valueOf(height));
        }
        boolean z = false;
        int intValue = (!this.j.equals(i) && this.c != null && i.a() && g(this.c.intValue()) && g(i.b().intValue())) ? i.b().intValue() - this.c.intValue() : 0;
        if (this.k == 1.0f || !this.b.a()) {
            z = true;
        }
        View h2 = h();
        if (h2 == null || h2.getParent() == null) {
            this.b = dbpy.a;
        } else {
            int top = h2.getTop();
            if (h2.getHeight() + top <= 0) {
                this.b = dbpy.a;
            } else {
                if (h2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    top -= ((ViewGroup.MarginLayoutParams) h2.getLayoutParams()).topMargin;
                }
                this.b = dbsg.i(Integer.valueOf(-top));
            }
        }
        this.j = i;
        if (i.a()) {
            this.c = i.b();
        }
        if (intValue != 0 && (bkrzVar = this.a) != null) {
            bloj blojVar = (bloj) bkrzVar;
            cqkx.p(blojVar.a.f);
            if (z && (p = blojVar.a.p()) != null) {
                blojVar.b.g.c(p, intValue);
                return;
            }
        }
        float d = d();
        if (this.k != 0.0f && d == 0.0f) {
            this.m.a.r();
        }
        if (this.k != d) {
            cqkx.p(this.e);
        }
        if (d == 1.0f) {
            this.d = 2;
        } else if (d == 0.0f) {
            this.d = 1;
        }
        this.k = d;
    }

    public final float d() {
        Integer num;
        if (this.i && (num = this.c) != null && g(num.intValue())) {
            if (!this.j.a() || !this.b.a()) {
                return 1.0f;
            }
            int intValue = this.j.b().intValue() - this.f;
            int max = Math.max(0, intValue - this.g);
            if (this.b.b().intValue() <= max) {
                return 0.0f;
            }
            if (this.b.b().intValue() < intValue) {
                return (this.b.b().intValue() - max) / (intValue - max);
            }
            return 1.0f;
        }
        return 0.0f;
    }

    public final Integer e() {
        return Integer.valueOf(this.f);
    }

    public final int f(int i) {
        Integer num;
        if (i != 0) {
            if (i != 1 && (num = this.c) != null && g(num.intValue())) {
                return this.c.intValue() - this.f;
            }
            return 0;
        }
        throw null;
    }
}
