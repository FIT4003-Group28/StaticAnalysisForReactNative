package c.d.h.e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class l extends o {
    private final Paint E;
    private final Paint F;
    private final Bitmap G;
    private WeakReference<Bitmap> H;

    public l(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        this.E = new Paint();
        this.F = new Paint(1);
        this.G = bitmap;
        if (paint != null) {
            this.E.set(paint);
        }
        this.E.setFlags(1);
        this.F.setStyle(Paint.Style.STROKE);
    }

    private void e() {
        WeakReference<Bitmap> weakReference = this.H;
        if (weakReference == null || weakReference.get() != this.G) {
            this.H = new WeakReference<>(this.G);
            Paint paint = this.E;
            Bitmap bitmap = this.G;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f3065g = true;
        }
        if (this.f3065g) {
            this.E.getShader().setLocalMatrix(this.y);
            this.f3065g = false;
        }
        this.E.setFilterBitmap(a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.d.h.e.o
    public boolean b() {
        return super.b() && this.G != null;
    }

    @Override // c.d.h.e.o, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("RoundedBitmapDrawable#draw");
        }
        if (!b()) {
            super.draw(canvas);
            if (!c.d.j.p.b.c()) {
                return;
            }
            c.d.j.p.b.a();
            return;
        }
        d();
        c();
        e();
        int save = canvas.save();
        canvas.concat(this.v);
        canvas.drawPath(this.f3064f, this.E);
        float f2 = this.f3063e;
        if (f2 > 0.0f) {
            this.F.setStrokeWidth(f2);
            this.F.setColor(f.a(this.f3066h, this.E.getAlpha()));
            canvas.drawPath(this.i, this.F);
        }
        canvas.restoreToCount(save);
        if (!c.d.j.p.b.c()) {
            return;
        }
        c.d.j.p.b.a();
    }

    @Override // c.d.h.e.o, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        super.setAlpha(i);
        if (i != this.E.getAlpha()) {
            this.E.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // c.d.h.e.o, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.E.setColorFilter(colorFilter);
    }
}
