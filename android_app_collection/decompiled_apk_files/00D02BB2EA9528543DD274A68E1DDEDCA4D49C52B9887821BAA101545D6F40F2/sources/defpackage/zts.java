package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: zts  reason: default package */
/* loaded from: classes7.dex */
public final class zts extends ztx {
    private static final cqrp L = cqrp.d(36.0d);
    private static final Paint N;
    private final int M;
    protected final ztq l;
    protected final ValueAnimator m;
    protected final int n;
    protected final int o;
    protected final int p;
    protected int q;
    protected float r;
    protected float s;
    protected float t;

    static {
        Paint paint = new Paint();
        N = paint;
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zts(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.directions_transitdetail_intermediatestop_radius);
        int color = context.getResources().getColor(R.color.light_line_station_color);
        int color2 = context.getResources().getColor(R.color.qu_white_alpha_54);
        int e = L.e(context);
        dcdc.e();
        this.q = -1;
        this.r = -1.0f;
        this.s = -1.0f;
        this.t = -1.0f;
        this.n = dimensionPixelSize;
        this.o = color;
        this.p = color2;
        Resources resources = context.getResources();
        resources.getDimensionPixelSize(R.dimen.directions_transitline_traffic_outer_width);
        resources.getDimensionPixelSize(R.dimen.directions_transitline_traffic_inner_width);
        resources.getDimensionPixelSize(R.dimen.directions_transitline_traffic_border_width);
        resources.getDimensionPixelSize(R.dimen.directions_transitline_traffic_base_radius);
        resources.getColor(R.color.directions_traffic_border_color);
        resources.getColor(R.color.directions_traffic_outer_color);
        resources.getColor(R.color.directions_traffic_inner_color);
        this.l = new ztq();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[0]);
        this.m = ofFloat;
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new ztr(this));
        this.M = e;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> q(cqmp<T>... cqmpVarArr) {
        return new cqmh(zts.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> r(cqlc<T, Integer> cqlcVar) {
        return cqjv.g(ztg.NUM_INTERMEDIATE_STOPS, cqlcVar, zth.a);
    }

    public static <T extends cqkp> cqnf<T> s(cqlc<T, Float> cqlcVar) {
        return cqjv.g(ztg.USER_LOCATION, cqlcVar, zth.a);
    }

    public static <T extends cqkp> cqnf<T> t(cqlc<T, List> cqlcVar) {
        return cqjv.g(ztg.TRANSIT_TRAFFIC_SEGMENTS, cqlcVar, zth.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ztx, defpackage.ztz, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.t;
        if (f != -1.0f) {
            float K = K() + ((L() - K()) * f);
            ztq ztqVar = this.l;
            float f2 = this.t;
            int i = ztqVar.b;
            float f3 = 0.0f;
            if (i != 0) {
                if (i == 1) {
                    f3 = ztqVar.a[0];
                } else {
                    float a = akn.a(f2, 0.0f, ztqVar.b());
                    int floor = (int) Math.floor(a);
                    float f4 = floor;
                    if (f4 == a) {
                        f3 = ztqVar.a[floor];
                    } else {
                        float[] fArr = ztqVar.a;
                        float f5 = fArr[floor];
                        f3 = f5 + ((fArr[floor + 1] - f5) * (a - f4));
                    }
                }
            }
            float f6 = this.r;
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            shapeDrawable.setShape(new OvalShape());
            shapeDrawable.getPaint().setColor(this.G);
            shapeDrawable.setAlpha(38);
            float f7 = (int) (K + ((f3 - K) * f6));
            float f8 = this.M;
            p(canvas, f7, f8, f8, shapeDrawable);
            C(canvas, f7);
        }
    }

    public void setNumIntermediateStops(int i) {
        if (this.q != i) {
            this.q = i;
            ztq ztqVar = this.l;
            int i2 = i + 2;
            dbsk.a(i2 >= 0);
            ztqVar.b = i2;
            if (ztqVar.a.length != i2) {
                ztqVar.a = new float[i2];
            }
            this.r = -1.0f;
            invalidate();
        }
    }

    public void setTransitTrafficSegments(List list) {
    }

    public void setUserLocation(float f) {
        if (this.t != f) {
            this.t = f;
            invalidate();
        }
    }

    public final void u(ViewGroup viewGroup, Rect rect) {
        if (this.q == -1) {
            return;
        }
        int visibility = viewGroup.getVisibility();
        this.s = visibility == 0 ? 1.0f : 0.0f;
        if (visibility == 0) {
            float f = rect.top;
            int min = Math.min(this.q, viewGroup.getChildCount());
            this.l.a(0, K());
            int i = 0;
            while (i < min) {
                View childAt = viewGroup.getChildAt(i);
                i++;
                this.l.a(i, childAt.getTop() + f + (childAt.getHeight() * 0.3f));
            }
            this.l.a(this.q + 1, L());
        }
        this.m.cancel();
        float f2 = this.r;
        if (f2 == -1.0f) {
            this.r = this.s;
        } else {
            float f3 = this.s;
            if (f3 == 0.0f) {
                this.r = f3;
            } else if (f2 != f3) {
                this.m.setFloatValues(f2, f3);
                this.m.start();
            }
        }
        invalidate();
    }

    @Override // defpackage.ztx
    protected final void v(Canvas canvas) {
        if (this.r > 0.0f) {
            int i = bvoa.a(this.G) ? this.p : this.o;
            for (int i2 = 1; i2 <= this.q; i2++) {
                ztq ztqVar = this.l;
                o(canvas, ztqVar.b == 0 ? 0.0f : ztqVar.a[i2], this.n * this.r, i);
            }
        }
    }

    @Override // defpackage.ztx
    protected final boolean w() {
        return this.t == -1.0f;
    }

    private final float K() {
        float D;
        int i;
        if (this.A.b != null && this.t != -1.0f) {
            D = D();
            i = this.w;
        } else if (this.t != -1.0f) {
            D = D();
            i = this.M / 2;
        } else {
            return D();
        }
        return D + i;
    }

    private final float L() {
        float E;
        int i;
        if (this.B.b != null && this.t != -1.0f) {
            E = E();
            i = this.w;
        } else if (this.t != -1.0f) {
            E = E();
            i = this.M / 2;
        } else {
            return E();
        }
        return E - i;
    }
}
