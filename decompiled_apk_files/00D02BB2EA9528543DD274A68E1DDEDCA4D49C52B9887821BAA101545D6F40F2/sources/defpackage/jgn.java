package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: jgn  reason: default package */
/* loaded from: classes.dex */
public final class jgn extends FrameLayout {
    private static final cqkv c = new jgo(cqlg.a);
    private final Path a;
    private float[] b;

    public jgn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new float[8];
        this.a = new Path();
        setCornerRadius(0.0f);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jgn.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(cqtv cqtvVar) {
        return cqjv.i(jgm.CORNER_RADIUS, cqtvVar, c);
    }

    public static <T extends cqkp> cqnf<T> c(cqtv cqtvVar) {
        return cqjv.i(jgm.TOP_CORNER_RADIUS, cqtvVar, c);
    }

    public static <T extends cqkp> cqnf<T> d(cqlc<T, cqtv> cqlcVar) {
        return cqjv.g(jgm.TOP_CORNER_RADIUS, cqlcVar, c);
    }

    public static <T extends cqkp> cqnf<T> e(cqtv cqtvVar) {
        return cqjv.i(jgm.BOTTOM_CORNER_RADIUS, cqtvVar, c);
    }

    public static <T extends cqkp> cqnf<T> f(cqlc<T, cqtv> cqlcVar) {
        return cqjv.g(jgm.BOTTOM_CORNER_RADIUS, cqlcVar, c);
    }

    public static <T extends cqkp> cqnf<T> g(cqtv cqtvVar) {
        return cqjv.i(jgm.START_CORNER_RADIUS, cqtvVar, c);
    }

    private final void h(int i, int i2) {
        this.a.reset();
        this.a.addRoundRect(new RectF(0.0f, 0.0f, i, i2), this.b, Path.Direction.CW);
        invalidate();
    }

    private final void i(float[] fArr) {
        if (Arrays.equals(this.b, fArr)) {
            return;
        }
        this.b = fArr;
        h(getWidth(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        canvas.clipPath(this.a);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.clipPath(this.a);
        super.draw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        h(i, i2);
    }

    public void setBottomCornerRadius(float f) {
        float[] fArr = this.b;
        i(new float[]{fArr[0], fArr[1], fArr[2], fArr[3], f, f, f, f});
    }

    public void setCornerRadius(float f) {
        i(new float[]{f, f, f, f, f, f, f, f});
    }

    public void setEndCornerRadius(float f) {
        float[] fArr;
        if (bvox.a(this)) {
            float[] fArr2 = this.b;
            fArr = new float[]{f, f, fArr2[2], fArr2[3], fArr2[4], fArr2[5], f, f};
        } else {
            float[] fArr3 = this.b;
            fArr = new float[]{fArr3[0], fArr3[1], f, f, f, f, fArr3[6], fArr3[7]};
        }
        i(fArr);
    }

    public void setStartCornerRadius(float f) {
        float[] fArr;
        if (bvox.a(this)) {
            float[] fArr2 = this.b;
            fArr = new float[]{fArr2[0], fArr2[1], f, f, f, f, fArr2[6], fArr2[7]};
        } else {
            float[] fArr3 = this.b;
            fArr = new float[]{f, f, fArr3[2], fArr3[3], fArr3[4], fArr3[5], f, f};
        }
        i(fArr);
    }

    public void setTopCornerRadius(float f) {
        float[] fArr = this.b;
        i(new float[]{f, f, f, f, fArr[4], fArr[5], fArr[6], fArr[7]});
    }
}
