package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
/* compiled from: PG */
/* renamed from: cxql  reason: default package */
/* loaded from: classes5.dex */
public final class cxql extends BitmapDrawable {
    private static final Matrix a;
    private final Paint b;

    static {
        Matrix matrix = new Matrix();
        a = matrix;
        matrix.postTranslate(-0.5f, -0.5f);
    }

    public cxql(Bitmap bitmap) {
        float f;
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        if (width > height) {
            matrix.postTranslate((width - height) / 2.0f, 0.0f);
            f = 1.0f / height;
        } else {
            if (width < height) {
                matrix.postTranslate(0.0f, (height - width) / 2.0f);
            }
            f = 1.0f / width;
        }
        matrix.postScale(f, f);
        matrix.postConcat(a);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        try {
            Rect bounds = getBounds();
            canvas.translate(bounds.exactCenterX(), bounds.exactCenterY());
            float min = Math.min(bounds.width(), bounds.height());
            canvas.scale(min, min);
            canvas.drawCircle(0.0f, 0.0f, 0.5f, this.b);
        } finally {
            canvas.restore();
        }
    }
}
