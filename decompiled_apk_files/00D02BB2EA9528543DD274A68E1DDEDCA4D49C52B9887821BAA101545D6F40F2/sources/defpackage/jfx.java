package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: jfx  reason: default package */
/* loaded from: classes7.dex */
public final class jfx extends LinearLayout {
    private static final Paint a;
    private static final Map<Integer, Bitmap> b;
    @dzsi
    private Bitmap c;
    private Rect d;
    private int e;
    private int f;

    static {
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        a = paint;
        dchm dchmVar = new dchm();
        dchmVar.j();
        b = dchmVar.e();
    }

    public jfx(Context context) {
        this(context, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jfx.class, cqmpVarArr);
    }

    private final void b(int i, int i2) {
        this.d = new Rect(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getWidth() == 0) {
            getWidth();
            getHeight();
            return;
        }
        if (this.d == null) {
            b(getWidth(), getHeight());
        }
        int width = getWidth();
        Map<Integer, Bitmap> map = b;
        Integer valueOf = Integer.valueOf(width);
        Bitmap bitmap = map.get(valueOf);
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
            Paint paint = new Paint(1);
            paint.setAlpha(255);
            float f = width;
            new Canvas(bitmap).drawOval(new RectF(0.0f, 0.0f, f, f), paint);
            map.put(valueOf, bitmap);
        }
        canvas.drawBitmap(bitmap, (Rect) null, this.d, a);
        if (this.e == 0) {
            return;
        }
        int width2 = getWidth();
        Bitmap bitmap2 = this.c;
        if (bitmap2 == null || bitmap2.getWidth() < width2) {
            int i = this.e;
            int i2 = this.f;
            Bitmap createBitmap = Bitmap.createBitmap(width2, width2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            Paint paint2 = new Paint(1);
            paint2.setColor(i);
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(i2);
            float f2 = width2 / 2;
            double d = (width2 - i2) / 2;
            Double.isNaN(d);
            canvas2.drawCircle(f2, f2, (float) (d + 0.5d), paint2);
            this.c = createBitmap;
        }
        canvas.drawBitmap(this.c, (Rect) null, this.d, new Paint());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        b(i, i2);
    }

    public void setBorderColorResourceId(int i) {
        int color = getResources().getColor(i);
        if (this.e == color) {
            return;
        }
        this.e = color;
        this.c = null;
    }

    public void setBorderWidth(int i) {
        this.f = i;
    }

    public jfx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public jfx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayerType(2, null);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, cpj.f, i, 0);
        this.e = obtainStyledAttributes.getColor(0, 0);
        this.f = getResources().getDimensionPixelSize(R.dimen.circularmasklayout_border_width);
        obtainStyledAttributes.recycle();
    }
}
