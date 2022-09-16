package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
/* compiled from: PG */
/* renamed from: yk  reason: default package */
/* loaded from: classes4.dex */
public class yk {
    private final yi a;
    public int b;
    public RecyclerView c;
    public xw d;
    public boolean e;
    public boolean f;
    public View g;
    public boolean h;
    protected final LinearInterpolator i;
    protected final DecelerateInterpolator j;
    protected PointF k;
    protected int l;
    protected int m;
    private final DisplayMetrics n;
    private boolean o;
    private float p;

    public yk(Context context) {
        this.b = -1;
        this.a = new yi();
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.o = false;
        this.l = 0;
        this.m = 0;
        this.n = context.getResources().getDisplayMetrics();
    }

    public static final int m(View view) {
        yo l = RecyclerView.l(view);
        if (l != null) {
            return l.c();
        }
        return -1;
    }

    private static int n(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float a(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b(int i) {
        float abs = Math.abs(i);
        if (!this.o) {
            this.p = a(this.n);
            this.o = true;
        }
        return (int) Math.ceil(abs * this.p);
    }

    protected void c(View view, yi yiVar) {
        int h = h(view, k());
        int i = i(view, l());
        int j = j((int) Math.sqrt((h * h) + (i * i)));
        if (j > 0) {
            yiVar.b(-h, -i, j, this.j);
        }
    }

    public PointF d(int i) {
        xw xwVar = this.d;
        if (xwVar instanceof yj) {
            return ((yj) xwVar).O(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + yj.class.getCanonicalName());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i, int i2) {
        PointF d;
        RecyclerView recyclerView = this.c;
        if (this.b == -1 || recyclerView == null) {
            f();
        }
        if (this.e && this.g == null && this.d != null && (d = d(this.b)) != null && (d.x != 0.0f || d.y != 0.0f)) {
            recyclerView.aa((int) Math.signum(d.x), (int) Math.signum(d.y), null);
        }
        this.e = false;
        View view = this.g;
        if (view != null) {
            if (m(view) == this.b) {
                View view2 = this.g;
                yl ylVar = recyclerView.M;
                c(view2, this.a);
                this.a.a(recyclerView);
                f();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.g = null;
            }
        }
        if (this.f) {
            yl ylVar2 = recyclerView.M;
            yi yiVar = this.a;
            if (this.c.n.aq() == 0) {
                f();
            } else {
                this.l = n(this.l, i);
                int n = n(this.m, i2);
                this.m = n;
                if (this.l == 0 && n == 0) {
                    PointF d2 = d(this.b);
                    if (d2 == null || (d2.x == 0.0f && d2.y == 0.0f)) {
                        yiVar.a = this.b;
                        f();
                    } else {
                        float sqrt = (float) Math.sqrt((d2.x * d2.x) + (d2.y * d2.y));
                        d2.x /= sqrt;
                        d2.y /= sqrt;
                        this.k = d2;
                        this.l = (int) (d2.x * 10000.0f);
                        this.m = (int) (d2.y * 10000.0f);
                        yiVar.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (b(10000) * 1.2f), this.i);
                    }
                }
            }
            yi yiVar2 = this.a;
            int i3 = yiVar2.a;
            yiVar2.a(recyclerView);
            if (i3 < 0 || !this.f) {
                return;
            }
            this.e = true;
            recyclerView.f66J.a();
        }
    }

    public final void f() {
        if (!this.f) {
            return;
        }
        this.f = false;
        this.m = 0;
        this.l = 0;
        this.k = null;
        this.c.M.a = -1;
        this.g = null;
        this.b = -1;
        this.e = false;
        xw xwVar = this.d;
        if (xwVar.x == this) {
            xwVar.x = null;
        }
        this.d = null;
        this.c = null;
    }

    public int g(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
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

    public final int h(View view, int i) {
        xw xwVar = this.d;
        if (xwVar == null || !xwVar.ad()) {
            return 0;
        }
        xx xxVar = (xx) view.getLayoutParams();
        return g(xw.bx(view) - xxVar.leftMargin, xw.by(view) + xxVar.rightMargin, xwVar.getPaddingLeft(), xwVar.H - xwVar.getPaddingRight(), i);
    }

    public int i(View view, int i) {
        xw xwVar = this.d;
        if (xwVar == null || !xwVar.ae()) {
            return 0;
        }
        xx xxVar = (xx) view.getLayoutParams();
        return g(xw.bz(view) - xxVar.topMargin, xw.bw(view) + xxVar.bottomMargin, xwVar.getPaddingTop(), xwVar.I - xwVar.getPaddingBottom(), i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int j(int i) {
        double b = b(i);
        Double.isNaN(b);
        return (int) Math.ceil(b / 0.3356d);
    }

    protected int k() {
        PointF pointF = this.k;
        if (pointF == null || pointF.x == 0.0f) {
            return 0;
        }
        return this.k.x <= 0.0f ? -1 : 1;
    }

    protected int l() {
        PointF pointF = this.k;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        return this.k.y <= 0.0f ? -1 : 1;
    }

    public yk() {
        this.b = -1;
        this.a = new yi();
    }
}
