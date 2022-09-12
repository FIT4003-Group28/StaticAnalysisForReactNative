package com.google.android.apps.gmm.map.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.gmm.map.ui.CompassButtonView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public class CompassButtonView extends FrameLayout implements amzi {
    @dzsi
    private Drawable A;
    @dzsi
    private Drawable B;
    @dzsi
    private amzr C;
    private boolean D;
    public amzh b;
    public boolean c;
    public amzf d;
    public float e;
    public cjxf f;
    public boolean g;
    @dzsi
    public amzg h;
    public int i;
    @dzsi
    private ImageView m;
    @dzsi
    private akpq n;
    private float o;
    @dzsi
    private Matrix p;
    @dzsi
    private Matrix q;
    private int r;
    private int s;
    @dzsi
    private Drawable t;
    @dzsi
    private Drawable u;
    private int v;
    private int w;
    private boolean x;
    @dzsi
    private Drawable y;
    @dzsi
    private Drawable z;
    private static final cqkv j = new amzv();
    private static final cqtv k = cqrp.d(2.5d);
    private static final cqtv l = cqrp.d(4.0d);
    public static final cqtv a = cqrp.d(0.8d);

    public CompassButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 1;
        this.b = amzh.OFF_IF_NORTH_UP_TOP_DOWN;
        this.c = true;
        this.d = amzf.AUTO;
        this.v = -1;
        this.w = -1;
        this.f = cjxf.SMALL;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> d(cqmp<T>... cqmpVarArr) {
        return new cqmh(CompassButtonView.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> e(cqtd cqtdVar) {
        return cqjv.i(amzt.COMPASS_BUTTON_NEEDLE, cqtdVar, j);
    }

    public static <T extends cqkp> cqnf<T> f(cqtd cqtdVar) {
        return cqjv.i(amzt.COMPASS_BUTTON_NORTH, cqtdVar, j);
    }

    public static boolean h(cjxf cjxfVar) {
        return cjxfVar == cjxf.MOD_SMALL;
    }

    private final boolean j() {
        float f = this.e;
        return f < 0.5f || f > 359.5f;
    }

    private final Drawable k() {
        int b;
        if (h(this.f)) {
            if (this.g) {
                return ((gdh) gdj.c(R.color.mod_grey50_alpha10, R.color.mod_grey900_with_elevation_1, gdj.f)).b(getContext());
            }
            return ((gdh) irm.w).b(getContext());
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        if (this.g) {
            b = iuy.l().b.b(getContext());
        } else {
            b = iuy.l().a.b(getContext());
        }
        paint.setColor(b);
        paint.setStyle(Paint.Style.FILL);
        setLayerType(1, paint);
        return shapeDrawable;
    }

    private final Drawable l() {
        int b;
        int e;
        if (h(this.f)) {
            return cqrt.f(2131231689).a(getContext());
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        if (this.g) {
            b = iuy.m().b.b(getContext());
        } else {
            b = iuy.m().a.b(getContext());
        }
        paint.setColor(b);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(cqsg.f(a, Float.valueOf(2.0f)).a(getContext()));
        if (this.g) {
            e = l.e(getContext());
        } else {
            e = k.e(getContext());
        }
        paint.setShadowLayer(e, 0.0f, 0.0f, paint.getColor());
        return shapeDrawable;
    }

    private final int m() {
        amzh amzhVar = amzh.ALWAYS_OFF;
        cjxf cjxfVar = cjxf.SMALL;
        amzf amzfVar = amzf.NORTH;
        int ordinal = this.f.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return amzp.MOD_SMALL.f.NR(getContext());
            }
            if (ordinal == 2) {
                return amzp.MEDIUM.f.NR(getContext());
            }
            if (ordinal == 3) {
                return amzp.LARGE.f.NR(getContext());
            }
            if (ordinal == 4) {
                return amzp.EXTRA_LARGE.f.NR(getContext());
            }
            String valueOf = String.valueOf(this.f);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Unrecognized compass size: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        return amzp.SMALL.f.NR(getContext());
    }

    private final void n() {
        Drawable drawable;
        int e;
        amyn.b.a();
        amzh amzhVar = amzh.ALWAYS_OFF;
        cjxf cjxfVar = cjxf.SMALL;
        amzf amzfVar = amzf.NORTH;
        int ordinal = this.b.ordinal();
        if (ordinal == 0) {
            p(false);
        } else if (ordinal == 1) {
            o();
        } else if (ordinal == 2) {
            if (a()) {
                p(true);
            } else {
                o();
            }
        }
        if (this.m == null) {
            if (this.i == 1 && getVisibility() != 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.m = imageView;
            imageView.setScaleType(ImageView.ScaleType.MATRIX);
            addView(this.m, new FrameLayout.LayoutParams(-1, -1));
        }
        ImageView imageView2 = this.m;
        dbsk.s(imageView2);
        int i = this.v;
        if (i != -1) {
            if (i != 0) {
                this.t = getContext().getResources().getDrawable(this.v);
            } else {
                this.t = null;
            }
            this.v = -1;
        }
        int i2 = this.w;
        if (i2 != -1) {
            if (i2 != 0) {
                this.u = getContext().getResources().getDrawable(this.w);
            } else {
                this.u = null;
            }
            this.w = -1;
        }
        if (!this.x) {
            if (this.z == null && this.g) {
                this.z = new LayerDrawable(new Drawable[]{l(), k()});
            } else if (this.y == null && !this.g) {
                this.y = new LayerDrawable(new Drawable[]{l(), k()});
            }
            if (this.B == null && this.g) {
                Drawable drawable2 = this.z;
                dbsk.s(drawable2);
                amzs amzsVar = new amzs(drawable2, m());
                this.B = amzsVar;
                if (h(this.f)) {
                    Context context = getContext();
                    ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                    Paint paint = shapeDrawable.getPaint();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(cqrp.d(1.0d).a(context));
                    paint.setColor(ibl.A().b(context));
                    this.B = new LayerDrawable(new Drawable[]{amzsVar, new amzs(shapeDrawable, cqsg.d(cqsg.f(cqsg.g(cjxh.c(this.f), cjxh.b(this.f)), Float.valueOf(0.5f)), cqrp.d(0.4d)).NR(context))});
                }
            } else if (this.A == null && !this.g) {
                Drawable drawable3 = this.y;
                dbsk.s(drawable3);
                this.A = new amzs(drawable3, m());
            }
            if (this.g) {
                setBackground(this.B);
            } else {
                setBackground(this.A);
            }
        }
        boolean j2 = j();
        int ordinal2 = this.d.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    throw new IllegalStateException();
                }
                if (j2) {
                    drawable = this.t;
                }
            }
            drawable = this.u;
        } else {
            drawable = this.t;
        }
        imageView2.setImageDrawable(drawable);
        if (drawable != null) {
            int width = getWidth();
            int height = getHeight();
            if (!this.x) {
                int ordinal3 = this.f.ordinal();
                if (ordinal3 == 0) {
                    e = amzp.SMALL.g.e(getContext());
                } else if (ordinal3 == 1) {
                    e = amzp.MOD_SMALL.g.e(getContext());
                } else if (ordinal3 == 2) {
                    e = amzp.MEDIUM.g.e(getContext());
                } else if (ordinal3 == 3) {
                    e = amzp.LARGE.g.e(getContext());
                } else if (ordinal3 != 4) {
                    String valueOf = String.valueOf(this.f);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                    sb.append("Unrecognized compass size: ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                } else {
                    e = amzp.EXTRA_LARGE.g.e(getContext());
                }
                width = e;
                height = width;
            }
            Matrix matrix = this.p;
            Matrix matrix2 = this.q;
            if (this.r != width || this.s != height) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView2.getLayoutParams();
                if (this.x) {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                } else {
                    layoutParams.width = width;
                    layoutParams.height = height;
                    layoutParams.gravity = 17;
                }
                imageView2.setLayoutParams(layoutParams);
                matrix = new Matrix();
                matrix2 = new Matrix();
                this.p = matrix;
                this.q = matrix2;
                matrix.setRectToRect(new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()), new RectF(0.0f, 0.0f, width, height), Matrix.ScaleToFit.CENTER);
                this.r = width;
                this.s = height;
            }
            if (matrix == null || matrix2 == null) {
                return;
            }
            matrix2.set(matrix);
            matrix2.postRotate(-this.e, width / 2.0f, height / 2.0f);
            imageView2.setImageMatrix(matrix2);
        }
    }

    private final void o() {
        if (this.D) {
            p(false);
            return;
        }
        int i = this.i;
        if (i == 2) {
            return;
        }
        if (i == 1 && getVisibility() == 0) {
            return;
        }
        if (this.i == 3) {
            animate().cancel();
            setVisibility(0);
            setAlpha(1.0f);
            this.i = 1;
            return;
        }
        animate().setDuration(true != this.c ? 0L : 100L).setStartDelay(0L).alpha(1.0f).setInterpolator(irf.b).withStartAction(new Runnable(this) { // from class: amzj
            private final CompassButtonView a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CompassButtonView compassButtonView = this.a;
                compassButtonView.setVisibility(0);
                amzg amzgVar = compassButtonView.h;
                if (amzgVar != null) {
                    amzgVar.a();
                }
            }
        }).withEndAction(new Runnable(this) { // from class: amzk
            private final CompassButtonView a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.i = 1;
            }
        });
        this.i = 2;
    }

    private final void p(boolean z) {
        int i;
        if (getVisibility() != 0 || (i = this.i) == 4) {
            return;
        }
        if (z && i == 3) {
            return;
        }
        long j2 = 0;
        ViewPropertyAnimator duration = animate().setDuration(true != this.c ? 0L : 500L);
        if (true == z) {
            j2 = 1600;
        }
        duration.setStartDelay(j2).alpha(0.0f).setInterpolator(irf.c).withStartAction(new Runnable(this) { // from class: amzl
            private final CompassButtonView a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.i = 4;
            }
        }).withEndAction(new Runnable(this) { // from class: amzm
            private final CompassButtonView a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CompassButtonView compassButtonView = this.a;
                compassButtonView.setVisibility(4);
                compassButtonView.i = 1;
                amzg amzgVar = compassButtonView.h;
                if (amzgVar != null) {
                    amzgVar.a();
                }
            }
        });
        this.i = 3;
    }

    @Override // defpackage.amzi
    public final boolean a() {
        return j() && this.o < 0.5f;
    }

    @Override // defpackage.amzi
    public final void b(akzh akzhVar, akpq akpqVar) {
        this.n = akpqVar;
        amzr amzrVar = new amzr(this, akzhVar, akpqVar);
        this.C = amzrVar;
        akpqVar.a(amzrVar);
        akpqVar.b(this.C);
        akpqVar.d();
        alad p = akzhVar.p();
        g(p.m, p.l);
    }

    @Override // defpackage.amzi
    public final void c() {
        amzr amzrVar;
        akpq akpqVar = this.n;
        if (akpqVar != null && (amzrVar = this.C) != null) {
            akpqVar.c(amzrVar);
        }
        this.C = null;
        this.n = null;
    }

    public final void g(float f, float f2) {
        this.e = f;
        this.o = f2;
        n();
    }

    public final void i(boolean z) {
        this.D = z;
        n();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setContentDescription(getContext().getString(R.string.ACCESSIBILITY_COMPASS));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.A = null;
            this.B = null;
            n();
        }
    }

    @Override // defpackage.amzi
    public void setBackgroundDrawableId(int i) {
    }

    public void setCompassSize(cjxf cjxfVar) {
        dbsk.l(true);
        if (this.f == cjxfVar) {
            return;
        }
        this.f = cjxfVar;
        this.A = null;
        this.B = null;
        this.z = null;
        this.y = null;
        n();
    }

    @Override // defpackage.amzi
    public void setDisplayMode(amzf amzfVar) {
        this.d = amzfVar;
        n();
    }

    public void setIsCompassNeedleOnly(boolean z) {
        dbsk.l(true);
        if (this.x == z) {
            return;
        }
        this.x = z;
        if (z) {
            if (getBackground() == this.A || getBackground() == this.B) {
                setBackground(null);
            }
            this.A = null;
            this.B = null;
            this.y = null;
            this.z = null;
        }
        n();
    }

    @Override // defpackage.amzi
    public void setIsNightMode(boolean z) {
        dbsk.l(true);
        if (this.g == z) {
            return;
        }
        this.g = z;
        n();
    }

    @Override // defpackage.amzi
    public void setIsNorthUpModeForAccessibility(boolean z) {
    }

    public void setNeedleDrawable(@dzsi Drawable drawable) {
        this.u = drawable;
        n();
    }

    @Override // defpackage.amzi
    public void setNeedleDrawableId(int i) {
        this.w = i;
        if (i != -1) {
            n();
        }
    }

    public void setNorthDrawable(@dzsi Drawable drawable) {
        this.t = drawable;
        n();
    }

    @Override // defpackage.amzi
    public void setNorthDrawableId(int i) {
        this.v = i;
        if (i != -1) {
            n();
        }
    }

    public void setVisibilityChangeListener(@dzsi amzg amzgVar) {
        this.h = amzgVar;
    }

    @Override // defpackage.amzi
    public void setVisibilityMode(amzh amzhVar) {
        setVisibilityMode(amzhVar, true);
    }

    @Override // defpackage.amzi
    public void setVisibilityMode(amzh amzhVar, boolean z) {
        this.b = amzhVar;
        this.c = z;
        n();
    }
}
