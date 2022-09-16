package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.google.android.youtube.R;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Set;
/* compiled from: PG */
/* renamed from: zku  reason: default package */
/* loaded from: classes4.dex */
public final class zku extends Drawable implements zkw, vqs {
    public int a;
    public final Paint b;
    private final zkx c;
    private final vqr d;
    private final vqp e;
    private final Paint f;
    private final Handler g;

    public zku(zkx zkxVar, vqr vqrVar, vqp vqpVar, Resources resources) {
        zkxVar.getClass();
        this.c = zkxVar;
        vqrVar.getClass();
        this.d = vqrVar;
        vqrVar.q(this);
        vqpVar.getClass();
        this.e = vqpVar;
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(resources.getColor(R.color.video_trim_view_waveform_background));
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f = paint2;
        paint2.setColor(resources.getColor(R.color.video_trim_view_waveform_fill));
        paint2.setStyle(Paint.Style.FILL);
        this.g = new Handler(Looper.getMainLooper());
        zkxVar.f = this;
    }

    @Override // defpackage.vqs
    public final void a(vqr vqrVar, Set set) {
    }

    @Override // defpackage.vqs
    public final void b(vqr vqrVar, int i) {
        if (i == 0 || i == 3) {
            d();
        }
    }

    @Override // defpackage.vqs
    public final void c(vqr vqrVar, Set set) {
    }

    public final void d() {
        this.g.post(new zkt(this));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        canvas.drawRect(bounds, this.b);
        if (this.c.c() <= 0) {
            return;
        }
        int width = bounds.width();
        float f = this.a / (width - (i + i));
        long e = this.e.e(-f);
        long e2 = this.e.e(f + 1.0f);
        ShortBuffer asShortBuffer = ByteBuffer.wrap(this.c.d.toByteArray()).asShortBuffer();
        long d = this.c.d();
        int n = (int) ((this.d.n() + this.d.g()) / d);
        int i2 = ((int) (e / d)) - n;
        int i3 = (((int) (e2 / d)) - n) + 1;
        Rect rect = new Rect(bounds.left + this.a, bounds.top, bounds.right - this.a, bounds.bottom);
        Path path = new Path();
        vqp vqpVar = this.e;
        int max = Math.max(i2, 0);
        int min = Math.min(i3, asShortBuffer.limit());
        float f2 = bounds.left - 2.0f;
        float f3 = (float) ((e2 - e) / (i3 - i2));
        int i4 = max;
        float f4 = 0.0f;
        while (i4 < min) {
            f4 = Math.max(f4, asShortBuffer.get(i4) / 32767.0f);
            float f5 = f3;
            float b = rect.left + (vqpVar.b(((i4 - i2) * f3) + e) * rect.width());
            if (i4 == max) {
                path.moveTo(b, rect.centerY());
            }
            if (b >= 2.0f + f2) {
                path.lineTo(b, rect.centerY() + (f4 * rect.height() * 0.5f));
                f2 = b;
                f4 = 0.0f;
            }
            if (i4 == min - 1) {
                path.lineTo(b, rect.centerY());
            }
            i4++;
            f3 = f5;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, -1.0f, 0.0f, bounds.centerY());
        path.addPath(path, matrix);
        canvas.save();
        canvas.clipRect(bounds);
        canvas.drawPath(path, this.f);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
