package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: bvlm  reason: default package */
/* loaded from: classes.dex */
public final class bvlm extends Drawable {
    private static final ThreadLocal<Matrix> a = new bvlh();
    private static final ThreadLocal<float[]> b = new bvli();
    private bvlk c;
    private boolean d;
    @dzsi
    private Bitmap e;
    private final RectF f = new RectF();

    public bvlm(bvlk bvlkVar) {
        this.c = bvlkVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect;
        ggt f;
        Bitmap a2;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        Matrix matrix = a.get();
        float[] fArr = b.get();
        canvas.getMatrix(matrix);
        matrix.getValues(fArr);
        float hypot = (float) Math.hypot(fArr[0], fArr[3]);
        float hypot2 = (float) Math.hypot(fArr[4], fArr[1]);
        float f2 = fArr[2];
        float f3 = fArr[5];
        float floor = f2 - ((float) Math.floor(f2));
        float floor2 = f3 - ((float) Math.floor(f3));
        float f4 = width * hypot;
        float f5 = height * hypot2;
        float f6 = floor + f4;
        float f7 = floor2 + f5;
        int ceil = (int) (Math.ceil(f6) - Math.floor(floor));
        int ceil2 = (int) (Math.ceil(f7) - Math.floor(floor2));
        this.f.left = bounds.left - (floor / hypot);
        this.f.top = bounds.top - (floor2 / hypot2);
        this.f.right = bounds.left + ((ceil - floor) / hypot);
        this.f.bottom = bounds.top + ((ceil2 - floor2) / hypot2);
        if (ceil <= 0 || ceil2 <= 0) {
            rect = null;
            this.e = null;
        } else {
            bvll bvllVar = this.c.a;
            bvlu bvluVar = bvllVar.a;
            int i = bvllVar.f;
            int i2 = bvllVar.g;
            Picture picture = bvllVar.b;
            ggt ggtVar = bvllVar.c;
            Bitmap.Config config = bvllVar.d;
            if (i <= 0 || i2 <= 0) {
                f = ggt.f(floor, floor2, f6, f7);
            } else {
                float f8 = f4 / i;
                float f9 = f5 / i2;
                f = ggt.f((ggtVar.a() * f8) + floor, (ggtVar.b() * f9) + floor2, floor + (ggtVar.c() * f8), floor2 + (ggtVar.d() * f9));
            }
            bvla bvlaVar = new bvla();
            bvlaVar.a = picture;
            bvlaVar.b = f;
            bvlaVar.c = config;
            bvlaVar.d = Integer.valueOf(ceil);
            bvlaVar.e = Integer.valueOf(ceil2);
            String str = bvlaVar.a == null ? " picture" : "";
            if (bvlaVar.b == null) {
                str = str.concat(" pictureBounds");
            }
            if (bvlaVar.c == null) {
                str = String.valueOf(str).concat(" bitmapConfig");
            }
            if (bvlaVar.d == null) {
                str = String.valueOf(str).concat(" bitmapWidth");
            }
            if (bvlaVar.e == null) {
                str = String.valueOf(str).concat(" bitmapHeight");
            }
            if (!str.isEmpty()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            bvlb bvlbVar = new bvlb(bvlaVar.a, bvlaVar.b, bvlaVar.c, bvlaVar.d.intValue(), bvlaVar.e.intValue());
            bvlj bvljVar = new bvlj(picture, f, ceil, ceil2, config);
            synchronized (bvluVar.b) {
                a2 = bvluVar.b.a(bvlbVar);
                if (a2 == null) {
                    a2 = bvluVar.d.c(bvlbVar);
                    if (a2 == null) {
                        a2 = bvljVar.a();
                    }
                    bvluVar.b.Pz(bvlbVar, a2);
                }
                bvluVar.d.d(bvlbVar, a2);
            }
            this.e = a2;
            rect = null;
        }
        Bitmap bitmap = this.e;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, rect, this.f, this.c.b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.c.a.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c.a.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.c.a.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.d) {
            bvlk bvlkVar = this.c;
            this.c = new bvlk(bvlkVar.a, new Paint(bvlkVar.b));
            this.d = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.c.b.setDither(z);
        invalidateSelf();
    }
}
