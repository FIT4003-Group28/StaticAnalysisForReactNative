package c.e.a.c.z;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
/* loaded from: classes.dex */
public class a {

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f4807h = new int[3];
    private static final float[] i = {0.0f, 0.5f, 1.0f};
    private static final int[] j = new int[4];
    private static final float[] k = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f4808a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f4809b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f4810c;

    /* renamed from: d  reason: collision with root package name */
    private int f4811d;

    /* renamed from: e  reason: collision with root package name */
    private int f4812e;

    /* renamed from: f  reason: collision with root package name */
    private int f4813f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f4814g;

    public a() {
        this(-16777216);
    }

    public a(int i2) {
        this.f4814g = new Path();
        a(i2);
        this.f4809b = new Paint(4);
        this.f4809b.setStyle(Paint.Style.FILL);
        this.f4808a = new Paint();
        this.f4808a.setColor(this.f4811d);
        this.f4810c = new Paint(this.f4809b);
    }

    public Paint a() {
        return this.f4808a;
    }

    public void a(int i2) {
        this.f4811d = a.g.f.a.c(i2, 68);
        this.f4812e = a.g.f.a.c(i2, 20);
        this.f4813f = a.g.f.a.c(i2, 0);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i2) {
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int[] iArr = f4807h;
        iArr[0] = this.f4813f;
        iArr[1] = this.f4812e;
        iArr[2] = this.f4811d;
        Paint paint = this.f4810c;
        float f2 = rectF.left;
        paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, iArr, i, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f4810c);
        canvas.restore();
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i2, float f2, float f3) {
        boolean z = f3 < 0.0f;
        Path path = this.f4814g;
        if (z) {
            int[] iArr = j;
            iArr[0] = 0;
            iArr[1] = this.f4813f;
            iArr[2] = this.f4812e;
            iArr[3] = this.f4811d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i2;
            rectF.inset(f4, f4);
            int[] iArr2 = j;
            iArr2[0] = 0;
            iArr2[1] = this.f4811d;
            iArr2[2] = this.f4812e;
            iArr2[3] = this.f4813f;
        }
        float width = 1.0f - (i2 / (rectF.width() / 2.0f));
        float[] fArr = k;
        fArr[1] = width;
        fArr[2] = ((1.0f - width) / 2.0f) + width;
        this.f4809b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, j, k, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        canvas.drawArc(rectF, f2, f3, true, this.f4809b);
        canvas.restore();
    }
}
