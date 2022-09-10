package com.google.android.apps.gmm.base.views.scalebar;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.gmm.base.views.scalebar.ScalebarView;
import com.google.android.apps.maps.R;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ScalebarView extends View {
    private final int A;
    private final int B;
    private final int C;
    private final Path D;
    private final int E;
    private Integer F;
    private Integer G;
    private String H;
    private String I;
    private boolean J;
    private SharedPreferences.OnSharedPreferenceChangeListener K;
    private crzp<Boolean> L;
    private final jir M;
    public dxio<akzh> a;
    public bvjj b;
    public akpq c;
    public btrm d;
    public gcg e;
    public dxio<gce> f;
    public Executor g;
    jit h;
    final NavigableSet<Integer> i;
    final NavigableSet<Integer> j;
    public final Animator k;
    public Integer l;
    public Integer m;
    public boolean n;
    public boolean o;
    public boolean p;
    public volatile double q;
    public volatile double r;
    public boolean s;
    private final Paint t;
    private final Paint u;
    private final Paint v;
    private final Paint w;
    private final int x;
    private final int y;
    private final int z;

    public ScalebarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = 0;
        this.F = 0;
        this.m = 0;
        this.G = 0;
        this.J = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.M = new jir(this);
        ((jiu) bttc.a(jiu.class, this)).wz(this);
        this.i = f(5280);
        this.j = f(1000);
        this.E = context.getResources().getDimensionPixelSize(R.dimen.scalebar_max_width);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.text_size_xxmicro);
        this.x = dimensionPixelSize;
        this.y = context.getResources().getDimensionPixelSize(R.dimen.scalebar_line_height_bottom_padding);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.scalebar_line_stroke_width);
        this.C = dimensionPixelSize2;
        this.z = context.getResources().getDimensionPixelSize(R.dimen.scalebar_text_bottom_padding);
        this.A = context.getResources().getDimensionPixelSize(R.dimen.scalebar_text_top_padding);
        this.B = context.getResources().getDimensionPixelSize(R.dimen.scalebar_notch_height);
        this.D = new Path();
        Paint paint = new Paint(1);
        this.v = paint;
        paint.setColor(context.getResources().getColor(R.color.scalebar_on_light_background));
        paint.setTextSize(dimensionPixelSize);
        paint.setTextAlign(Paint.Align.RIGHT);
        Paint paint2 = new Paint(1);
        this.w = paint2;
        paint2.setColor(context.getResources().getColor(R.color.scalebar_shadow_for_light_background));
        paint2.setTextSize(dimensionPixelSize);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(jmj.b(context, 1.5f));
        paint2.setTextAlign(Paint.Align.RIGHT);
        Paint paint3 = new Paint(1);
        this.t = paint3;
        paint3.setColor(context.getResources().getColor(R.color.scalebar_on_light_background));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(dimensionPixelSize2);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setStrokeJoin(Paint.Join.ROUND);
        Paint paint4 = new Paint(paint2);
        this.u = paint4;
        paint4.setStrokeWidth(dimensionPixelSize2 + dimensionPixelSize2);
        paint4.setStrokeCap(Paint.Cap.ROUND);
        paint4.setStrokeJoin(Paint.Join.ROUND);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, ALPHA, 0.0f);
        this.k = ofFloat;
        ofFloat.setStartDelay(1600L);
        ofFloat.setDuration(1100L);
    }

    static dbsi<Integer, Integer> b(NavigableSet<Integer> navigableSet, int i) {
        Integer valueOf = Integer.valueOf(i);
        Integer floor = navigableSet.floor(valueOf);
        Integer ceiling = navigableSet.ceiling(valueOf);
        if (floor == null) {
            floor = navigableSet.first();
        }
        if (ceiling == null) {
            ceiling = navigableSet.higher(navigableSet.first());
        }
        return dbsi.a(floor, ceiling);
    }

    public static float c(int i, double d) {
        return ((float) (d / 3.2808399200439453d)) * i;
    }

    private static NavigableSet<Integer> f(int i) {
        TreeSet j = dcnm.j();
        j.addAll(dchl.b(1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000, Integer.valueOf(i), Integer.valueOf(i + i), Integer.valueOf(i * 5), Integer.valueOf(i * 10), Integer.valueOf(i * 20), Integer.valueOf(i * 50), Integer.valueOf(i * 100), Integer.valueOf(i * 200), Integer.valueOf(i * 500), Integer.valueOf(i * 1000), Integer.valueOf(i * 2000), Integer.valueOf(i * 5000)));
        return j;
    }

    private final void g(Canvas canvas, String str, int i) {
        float width = this.J ? 0 : getWidth();
        float f = i;
        canvas.drawText(str, width, f, this.w);
        canvas.drawText(str, width, f, this.v);
    }

    public final boolean a() {
        return this.e.a() && this.f.a().h();
    }

    public final void d() {
        if (getAlpha() != 1.0f || this.k.isRunning() || this.s || this.o) {
            return;
        }
        this.k.cancel();
        this.k.start();
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        btrm btrmVar = this.d;
        jir jirVar = this.M;
        dceq a = dcet.a();
        a.b(afwq.class, new jiv(0, afwq.class, jirVar));
        a.b(alhw.class, new jiv(1, alhw.class, jirVar));
        btrmVar.g(jirVar, a.a());
        this.h = new jit(this);
        this.o = this.b.z(bvjk.H, "fade").equals("always");
        jiq jiqVar = new jiq(this);
        this.K = jiqVar;
        this.b.f(jiqVar);
        this.c.a(this.h);
        this.c.b(this.h);
        this.c.d();
        if (this.e.a()) {
            this.L = new crzp(this) { // from class: jip
                private final ScalebarView a;

                {
                    this.a = this;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    ScalebarView scalebarView = this.a;
                    scalebarView.e(scalebarView.p, scalebarView.a());
                }
            };
            this.f.a().g().d(this.L, this.g);
        }
        setAlpha(0.0f);
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.a(this.M);
        this.c.c(this.h);
        this.b.g(this.K);
        if (this.e.a()) {
            this.f.a().g().c(this.L);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String string;
        String string2;
        if (!this.n) {
            return;
        }
        double d = this.E;
        double d2 = this.q;
        Double.isNaN(d);
        int i = (int) (d / d2);
        int i2 = (int) (i * 3.28084f);
        int i3 = 0;
        if (i2 < this.l.intValue() || i2 > this.F.intValue()) {
            dbsi<Integer, Integer> b = b(this.i, i2);
            Integer num = b.a;
            this.l = num;
            this.F = b.b;
            int intValue = num.intValue();
            if (intValue < 5280.0f) {
                string = getContext().getString(R.string.DA_DISTANCE_FORMAT_FEET_ABBREVIATED, Integer.valueOf(intValue));
            } else {
                string = getContext().getString(R.string.DA_DISTANCE_FORMAT_MILES_ABBREVIATED, Integer.valueOf(intValue / 5280));
            }
            this.H = string;
        }
        if (i < this.m.intValue() || i > this.G.intValue()) {
            dbsi<Integer, Integer> b2 = b(this.j, i);
            Integer num2 = b2.a;
            this.m = num2;
            this.G = b2.b;
            int intValue2 = num2.intValue();
            if (intValue2 < 1000) {
                string2 = getContext().getString(R.string.DA_DISTANCE_FORMAT_METERS_ABBREVIATED, Integer.valueOf(intValue2));
            } else {
                string2 = getContext().getString(R.string.DA_DISTANCE_FORMAT_KILOMETERS_ABBREVIATED, Integer.valueOf(intValue2 / 1000));
            }
            this.I = string2;
        }
        float c = c(this.l.intValue(), this.q);
        if (!this.J) {
            c = getWidth() - c;
        }
        double intValue3 = this.m.intValue();
        double d3 = this.q;
        Double.isNaN(intValue3);
        float f = (float) (intValue3 * d3);
        if (!this.J) {
            f = getWidth() - f;
        }
        int height = getHeight() - this.y;
        float max = this.J ? Math.max(c, f) : Math.min(c, f);
        if (!this.J) {
            i3 = getWidth();
        }
        this.D.rewind();
        float f2 = height;
        this.D.moveTo(max, f2);
        this.D.lineTo(i3, f2);
        this.D.moveTo(c, f2);
        this.D.lineTo(c, height - this.B);
        this.D.moveTo(f, f2);
        this.D.lineTo(f, this.B + height);
        canvas.drawPath(this.D, this.u);
        canvas.drawPath(this.D, this.t);
        g(canvas, this.H, height - this.z);
        g(canvas, this.I, height + this.x + this.A);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (this.J != z) {
            this.J = z;
            Paint.Align align = z ? Paint.Align.LEFT : Paint.Align.RIGHT;
            this.v.setTextAlign(align);
            this.w.setTextAlign(align);
            invalidate();
        }
    }

    public final void e(boolean z, boolean z2) {
        if (z || z2) {
            this.u.setColor(getContext().getResources().getColor(R.color.scalebar_shadow_for_dark_background));
            this.w.setColor(getContext().getResources().getColor(R.color.scalebar_shadow_for_dark_background));
            this.t.setColor(getContext().getResources().getColor(R.color.scalebar_on_dark_background));
            this.v.setColor(getContext().getResources().getColor(R.color.scalebar_on_dark_background));
        } else {
            this.u.setColor(getContext().getResources().getColor(R.color.scalebar_shadow_for_light_background));
            this.w.setColor(getContext().getResources().getColor(R.color.scalebar_shadow_for_light_background));
            this.t.setColor(getContext().getResources().getColor(R.color.scalebar_on_light_background));
            this.v.setColor(getContext().getResources().getColor(R.color.scalebar_on_light_background));
        }
        invalidate();
    }
}
