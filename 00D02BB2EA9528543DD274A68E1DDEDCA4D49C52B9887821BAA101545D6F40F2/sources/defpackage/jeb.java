package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: jeb  reason: default package */
/* loaded from: classes7.dex */
public final class jeb extends FrameLayout {
    public static final cqkv a = new jec();
    private final Paint b;
    private final Paint c;
    private int d;
    private int e;
    private int f;

    public jeb(Context context) {
        this(context, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jeb.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(cqss cqssVar) {
        return cqjv.i(jea.CAROUSEL_DOTS_COLOR, cqssVar, a);
    }

    public static <T extends cqkp> cqnf<T> c(cqlc<T, Integer> cqlcVar) {
        return cqjv.g(jea.CAROUSEL_DOTS_COUNT, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> d(cqlc<T, Integer> cqlcVar) {
        return cqjv.g(jea.CAROUSEL_DOTS_INDEX, cqlcVar, a);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        setWillNotDraw(false);
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i;
        int i2;
        super.onDraw(canvas);
        if (this.d < 2) {
            return;
        }
        float f = getContext().getResources().getDisplayMetrics().density;
        float f2 = 5.0f * f;
        float measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        float max = Math.max(Math.min(8.0f * f, (measuredWidth - (this.d * f2)) / (i - 1)), 0.0f) + f2;
        float f3 = (measuredWidth - ((this.d - 1) * max)) / 2.0f;
        float measuredHeight = (getMeasuredHeight() - (f * 15.0f)) - (f2 / 2.0f);
        this.b.setAntiAlias(true);
        this.b.setStyle(Paint.Style.FILL);
        this.b.setColor(this.f);
        this.c.setAntiAlias(true);
        this.c.setStyle(Paint.Style.FILL);
        Paint paint = this.c;
        int i3 = this.f;
        double d = i3 >>> 24;
        Double.isNaN(d);
        paint.setColor((((int) (d * 0.5d)) << 24) | (16777215 & i3));
        int layoutDirection = getLayoutDirection();
        int i4 = 0;
        while (true) {
            if (i4 >= this.d) {
                return;
            }
            int i5 = layoutDirection == 1 ? (i2 - i4) - 1 : i4;
            double d2 = f2;
            Double.isNaN(d2);
            canvas.drawCircle(f3, measuredHeight, (float) (d2 / 1.5d), i5 == this.e ? this.b : this.c);
            f3 += max;
            i4++;
        }
    }

    public void setCarouselDotsColor(cqss cqssVar) {
        this.f = cqssVar.b(getContext());
        invalidate();
    }

    public void setCarouselDotsCount(int i) {
        this.d = i;
        invalidate();
    }

    public void setCarouselDotsIndex(int i) {
        this.e = i;
        invalidate();
    }

    public jeb(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Paint();
        this.c = new Paint();
        this.f = -1;
    }
}
