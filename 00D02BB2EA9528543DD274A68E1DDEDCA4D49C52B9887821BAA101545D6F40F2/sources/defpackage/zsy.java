package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zsy  reason: default package */
/* loaded from: classes7.dex */
public class zsy extends View {
    public static final Paint e;
    private static final Path n;
    protected final float c;
    protected final int d;
    protected final Resources f;
    @dzsi
    public Float g;
    @dzsi
    public ztf h;
    public final int i;
    public final int j;
    public final int k;
    private int m;
    public static final int a = Color.argb(64, 0, 0, 0);
    public static final int b = Color.argb(255, 66, 133, 244);
    private static final cqss l = ibm.b();

    static {
        Paint paint = new Paint();
        e = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        n = new Path();
    }

    public zsy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f = resources;
        this.d = resources.getDimensionPixelSize(R.dimen.directions_transitdetail_walking_dot_cycle);
        this.m = s(resources);
        this.c = resources.getDimension(R.dimen.directions_transitline_brokenline_gap);
        float f = this.m;
        this.i = (int) (1.5f * f);
        this.k = (int) (f * 0.1f);
        this.j = ztx.v.NR(context);
    }

    public static <T extends cqkp> cqnf<T> a(@dzsi cqtc cqtcVar) {
        return cqjv.i(ztg.LINE_WIDTH, cqtcVar, zth.a);
    }

    public static <T extends cqkp> cqnf<T> b(@dzsi cqss cqssVar) {
        return cqjv.i(ztg.CIRCLE_COLOR, cqssVar, zth.a);
    }

    public static <T extends cqkp> cqnf<T> c(cqlc<T, cqss> cqlcVar) {
        return cqjv.g(ztg.CIRCLE_COLOR, cqlcVar, zth.a);
    }

    public static <T extends cqkp> cqnf<T> d(@dzsi Integer num) {
        return cqjv.i(ztg.INNER_CIRCLE_COLOR, num, zth.a);
    }

    public static <T extends cqkp> cqnf<T> e(cqlc<T, cqss> cqlcVar) {
        return cqjv.g(ztg.INNER_CIRCLE_COLOR, cqlcVar, zth.a);
    }

    private final void q(Canvas canvas, float f, float f2, int i, int i2, boolean z) {
        float f3 = this.m / 2.0f;
        float g = g();
        float f4 = g - f3;
        float f5 = g + f3;
        if (z) {
            e.setColor(i2);
        } else {
            e.setColor(i);
        }
        Path path = n;
        path.rewind();
        path.moveTo(f4, f);
        path.lineTo(f5, f);
        path.lineTo(f5, f2);
        path.lineTo(f4, this.m + f2);
        path.lineTo(f4, f);
        Paint paint = e;
        canvas.drawPath(path, paint);
        if (z) {
            paint.setColor(i);
            float f6 = f4 + 2.0f;
            float f7 = (-2.0f) + f5;
            float f8 = (-0.82f) + f2;
            float f9 = f5 - 2.82f;
            path.rewind();
            path.moveTo(f6, f);
            if (f8 > f) {
                path.lineTo(f7, f8);
            } else {
                path.lineTo(f9, f2);
            }
            path.lineTo(f7, f2);
            path.lineTo(f6, (f2 + this.m) - 4.82f);
            path.lineTo(f6, f);
            canvas.drawPath(path, paint);
        }
    }

    private final void r(Canvas canvas, float f, float f2, int i, int i2, boolean z) {
        float f3 = this.m / 2.0f;
        float g = g();
        float f4 = g - f3;
        float f5 = g + f3;
        if (z) {
            e.setColor(i2);
        } else {
            e.setColor(i);
        }
        Path path = n;
        path.rewind();
        path.moveTo(f4, f2);
        path.lineTo(f5, f2);
        path.lineTo(f5, this.c + f);
        path.lineTo(f4, this.m + f + this.c);
        path.lineTo(f4, f2);
        Paint paint = e;
        canvas.drawPath(path, paint);
        if (z) {
            paint.setColor(i);
            float f6 = f4 + 2.0f;
            float f7 = f5 - 2.0f;
            float f8 = f + this.c;
            int i3 = this.m;
            path.rewind();
            path.moveTo(f6, f2);
            path.lineTo(f7, f2);
            path.lineTo(f7, 4.82f + f8);
            path.lineTo(f6, f8 + i3 + 0.82f);
            path.lineTo(f6, f2);
            canvas.drawPath(path, paint);
        }
    }

    private static int s(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.directions_transitline_width);
    }

    private final void t(Canvas canvas, float f, float f2, float f3) {
        float g = g();
        RectF rectF = new RectF(g - f2, f - f2, g + f2, f + f2);
        Paint paint = e;
        paint.setColor(-6842473);
        canvas.drawArc(rectF, f3, 180.0f, true, paint);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float f() {
        return this.m * 0.25f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int g() {
        return getWidth() / 2;
    }

    protected final void i(Canvas canvas, float f, float f2, int i) {
        float f3 = this.m / 2.0f;
        float g = g();
        Paint paint = e;
        paint.setColor(i);
        canvas.drawRect(g - f3, f, g + f3, f2, paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(Canvas canvas, float f, float f2, float f3, int i, int i2) {
        if (i != 0) {
            if (bvoa.a(i)) {
                q(canvas, f, f2, i, 0, false);
            } else {
                q(canvas, f, f2, i, -6842473, true);
            }
        }
        if (i2 != 0) {
            if (bvoa.a(i2)) {
                r(canvas, f2, f3, i2, 0, false);
            } else {
                r(canvas, f2, f3, i2, -6842473, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(Canvas canvas, float f, float f2, float f3, int i, int i2) {
        o(canvas, f, f2, i);
        l(canvas, f, f3, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(Canvas canvas, float f, float f2, float f3, int i, int i2) {
        if (bvoa.a(i)) {
            k(canvas, f, f2, f3, i, i2);
        } else {
            t(canvas, f, f2, 180.0f);
            k(canvas, f, f2 - 2.0f, f3, i, i2);
        }
        if ((i & (-16777216)) != -16777216) {
            float f4 = f2 + f + 1.0f;
            i(canvas, f, f4, l.b(getContext()));
            h(canvas, f, f4, i);
            l(canvas, f, f3, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(Canvas canvas, float f, float f2, float f3, int i, int i2) {
        if (bvoa.a(i)) {
            k(canvas, f, f2, f3, i, i2);
        } else {
            t(canvas, f, f2, 0.0f);
            k(canvas, f, f2 - 2.0f, f3, i, i2);
        }
        if ((i & (-16777216)) != -16777216) {
            float f4 = (f - f2) - 1.0f;
            i(canvas, f4, f, l.b(getContext()));
            h(canvas, f4, f, i);
            l(canvas, f, f3, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(Canvas canvas, float f, float f2, int i) {
        Paint paint = e;
        paint.setColor(i);
        canvas.drawCircle(g(), f, f2, paint);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p(Canvas canvas, float f, float f2, float f3, Drawable drawable) {
        float f4 = f2 / 2.0f;
        float f5 = f3 / 2.0f;
        float g = g();
        drawable.setBounds((int) (g - f4), (int) (f - f5), (int) (g + f4), (int) (f + f5));
        drawable.draw(canvas);
    }

    public void setLineWidth(@dzsi Integer num) {
        if (num == null) {
            this.m = s(this.f);
        } else {
            this.m = num.intValue();
        }
        invalidate();
    }

    public void setVehicleIcon(@dzsi jhk jhkVar) {
        if (this.h == null) {
            getContext();
            this.h = new zsx(this);
        }
        ztf ztfVar = this.h;
        dbsk.s(ztfVar);
        ztfVar.b(jhkVar);
    }

    public void setVehicleLocationCenter(@dzsi Float f) {
        Float f2 = this.g;
        if (f2 == null || f == null || ((int) (f2.floatValue() * getHeight())) != ((int) (f.floatValue() * getHeight()))) {
            this.g = f;
            invalidate();
        }
    }

    protected final void l(Canvas canvas, float f, float f2, int i, int i2) {
        if (bvoa.a(i) || !bvoa.b(i, i2)) {
            o(canvas, f, f2, i2);
            return;
        }
        o(canvas, f, f2, -6842473);
        o(canvas, f, f2 - 2.0f, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(Canvas canvas, float f, float f2, int i) {
        if (i != 0) {
            if (!bvoa.a(i)) {
                float f3 = this.m / 2.0f;
                float g = g();
                float f4 = g - f3;
                float f5 = g + f3;
                Paint paint = e;
                paint.setColor(-6842473);
                canvas.drawRect(f4, f, f5, f2, paint);
                paint.setColor(i);
                canvas.drawRect(f4 + 2.0f, f, f5 - 2.0f, f2, paint);
                return;
            }
            i(canvas, f, f2, i);
        }
    }
}
