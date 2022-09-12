package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: cptz  reason: default package */
/* loaded from: classes5.dex */
final class cptz extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public Paint c;
    public float d;
    public int e;
    public int f;
    public cptx g;
    public int h;
    private cptx i;
    private final Point j;
    private final Point k;
    private final Point l;
    private final Path m;
    private final Path n;
    private final RectF o;

    public cptz(Context context) {
        super(context);
        this.g = cptx.NONE;
        this.i = cptx.NONE;
        this.h = 0;
        this.j = new Point();
        this.k = new Point();
        this.l = new Point();
        this.m = new Path();
        this.n = new Path();
        this.o = new RectF();
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(4.0f);
        Paint paint2 = new Paint();
        this.a = paint2;
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(3.0f);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.set(paint);
        this.c.setStyle(Paint.Style.STROKE);
        this.c.clearShadowLayer();
    }

    public final int a(cptx cptxVar) {
        double paddingLeft;
        double ceil;
        int width = getWidth();
        if (width == 0) {
            width = getMeasuredWidth();
        }
        int height = getHeight();
        if (height == 0) {
            height = getMeasuredHeight();
        }
        cptx cptxVar2 = cptx.TOP;
        int ordinal = cptxVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            paddingLeft = (((width - getPaddingLeft()) - getPaddingRight()) - this.e) / 2;
            ceil = Math.ceil(this.d);
            Double.isNaN(paddingLeft);
        } else if (ordinal != 2 && ordinal != 3) {
            return 0;
        } else {
            paddingLeft = (((height - getPaddingTop()) - getPaddingBottom()) - this.e) / 2;
            ceil = Math.ceil(this.d);
            Double.isNaN(paddingLeft);
        }
        return (int) (paddingLeft - ceil);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        view.setLayerType(getLayerType(), null);
        super.addView(view);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int width = canvas.getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = canvas.getHeight() - getPaddingBottom();
        this.b.setStyle(Paint.Style.FILL);
        float f = paddingLeft;
        float f2 = paddingTop;
        this.o.set(f, f2, width, height);
        RectF rectF = this.o;
        float f3 = this.d;
        canvas.drawRoundRect(rectF, f3, f3, this.b);
        RectF rectF2 = this.o;
        float f4 = this.d;
        canvas.drawRoundRect(rectF2, f4, f4, this.a);
        if (this.g != cptx.NONE) {
            if (this.g == cptx.TOP || this.g == cptx.BOTTOM) {
                f = Math.min(width - this.e, Math.max(f, (((width + paddingLeft) / 2) - (this.e / 2)) + this.h));
            }
            if (this.g == cptx.LEFT || this.g == cptx.RIGHT) {
                f2 = Math.min(height - this.e, Math.max(f2, (((height + paddingTop) / 2) - (this.e / 2)) + this.h));
            }
            int ordinal = this.g.ordinal();
            if (ordinal == 0) {
                this.j.set(Math.round(f), paddingTop);
            } else if (ordinal == 2) {
                this.j.set(paddingLeft, Math.round(f2));
            } else if (ordinal == 3) {
                this.j.set(width, Math.round(f2));
            } else {
                this.j.set(Math.round(f), height);
            }
            cptx cptxVar = this.i;
            cptx cptxVar2 = this.g;
            if (cptxVar != cptxVar2) {
                this.i = cptxVar2;
                int ordinal2 = cptxVar2.ordinal();
                if (ordinal2 == 0) {
                    this.k.set(this.e / 2, -this.f);
                    this.l.set(this.e, 0);
                } else if (ordinal2 == 2) {
                    this.k.set(-this.f, this.e / 2);
                    this.l.set(0, this.e);
                } else if (ordinal2 == 3) {
                    this.k.set(this.f, this.e / 2);
                    this.l.set(0, this.e);
                } else {
                    this.k.set(this.e / 2, this.f);
                    this.l.set(this.e, 0);
                }
                this.m.rewind();
                this.m.setFillType(Path.FillType.EVEN_ODD);
                this.m.lineTo(this.k.x, this.k.y);
                this.m.lineTo(this.l.x, this.l.y);
                this.m.lineTo(0.0f, 0.0f);
                this.m.close();
                this.n.rewind();
                this.n.lineTo(this.k.x, this.k.y);
                this.n.lineTo(this.l.x, this.l.y);
            }
            canvas.save();
            canvas.translate(this.j.x, this.j.y);
            canvas.drawPath(this.m, this.b);
            canvas.drawLine(0.0f, 0.0f, this.l.x, this.l.y, this.c);
            canvas.drawPath(this.n, this.a);
            canvas.restore();
        }
    }
}
