package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.widget.ImageView;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: jhb  reason: default package */
/* loaded from: classes3.dex */
public final class jhb extends srn {
    private final float g;
    private final BitmapShader h;

    public jhb(Bitmap bitmap, ImageView.ScaleType scaleType, teb tebVar, float f) {
        super(bitmap, scaleType, tebVar);
        this.g = f;
        this.h = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    }

    @Override // defpackage.srn, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawColor(etk.p(biq.b(this.e).b(), CellularSignalStrengthError.ERROR_NOT_SUPPORTED, CellularSignalStrengthError.ERROR_NOT_SUPPORTED, CellularSignalStrengthError.ERROR_NOT_SUPPORTED, CellularSignalStrengthError.ERROR_NOT_SUPPORTED, this.e.getWidth(), this.e.getHeight()).a);
        float f = this.g;
        canvas.scale(f, f, this.c.centerX(), this.c.centerY());
        this.h.setLocalMatrix(this.a);
        this.b.setShader(this.h);
        canvas.drawCircle(this.c.centerX(), this.c.centerY(), Math.min(this.c.width() * 0.5f, this.c.height() * 0.5f), this.b);
    }
}
