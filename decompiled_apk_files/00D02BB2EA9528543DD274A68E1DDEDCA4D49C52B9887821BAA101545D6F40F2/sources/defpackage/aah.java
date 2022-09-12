package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
/* compiled from: PG */
/* renamed from: aah  reason: default package */
/* loaded from: classes.dex */
public class aah extends ach {
    protected PointF c;
    private final DisplayMetrics f;
    private float o;
    protected final LinearInterpolator a = new LinearInterpolator();
    protected final DecelerateInterpolator b = new DecelerateInterpolator();
    private boolean n = false;
    protected int d = 0;
    protected int e = 0;

    public aah(Context context) {
        this.f = context.getResources().getDisplayMetrics();
    }

    public static final int i(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
                }
                return i4 - i2;
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 >= 0) {
                return 0;
            }
            return i7;
        }
        return i3 - i;
    }

    private static final int r(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    @Override // defpackage.ach
    protected final void a() {
        this.e = 0;
        this.d = 0;
        this.c = null;
    }

    protected float b(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c(int i) {
        double d = d(i);
        Double.isNaN(d);
        return (int) Math.ceil(d / 0.3356d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int d(int i) {
        float abs = Math.abs(i);
        if (!this.n) {
            this.o = b(this.f);
            this.n = true;
        }
        return (int) Math.ceil(abs * this.o);
    }

    protected int e() {
        PointF pointF = this.c;
        if (pointF == null || pointF.x == 0.0f) {
            return 0;
        }
        return this.c.x <= 0.0f ? -1 : 1;
    }

    protected int f() {
        PointF pointF = this.c;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        return this.c.y <= 0.0f ? -1 : 1;
    }

    public final int g(View view, int i) {
        abs absVar = this.i;
        if (absVar == null || !absVar.E()) {
            return 0;
        }
        abt abtVar = (abt) view.getLayoutParams();
        return i(abs.bD(view) - abtVar.topMargin, abs.bA(view) + abtVar.bottomMargin, absVar.getPaddingTop(), absVar.E - absVar.getPaddingBottom(), i);
    }

    public int h(View view, int i) {
        abs absVar = this.i;
        if (absVar == null || !absVar.D()) {
            return 0;
        }
        abt abtVar = (abt) view.getLayoutParams();
        return i(abs.bB(view) - abtVar.leftMargin, abs.bC(view) + abtVar.rightMargin, absVar.getPaddingLeft(), absVar.D - absVar.getPaddingRight(), i);
    }

    @Override // defpackage.ach
    protected final void j(int i, int i2, acf acfVar) {
        if (q() == 0) {
            m();
            return;
        }
        this.d = r(this.d, i);
        int r = r(this.e, i2);
        this.e = r;
        if (this.d != 0 || r != 0) {
            return;
        }
        PointF l = l(n());
        if (l == null || (l.x == 0.0f && l.y == 0.0f)) {
            acfVar.a = n();
            m();
            return;
        }
        float sqrt = (float) Math.sqrt((l.x * l.x) + (l.y * l.y));
        l.x /= sqrt;
        l.y /= sqrt;
        this.c = l;
        this.d = (int) (l.x * 10000.0f);
        this.e = (int) (l.y * 10000.0f);
        acfVar.b((int) (this.d * 1.2f), (int) (this.e * 1.2f), (int) (d(10000) * 1.2f), this.a);
    }

    @Override // defpackage.ach
    protected void k(View view, acf acfVar) {
        int h = h(view, e());
        int g = g(view, f());
        int c = c((int) Math.sqrt((h * h) + (g * g)));
        if (c > 0) {
            acfVar.b(-h, -g, c, this.b);
        }
    }
}
