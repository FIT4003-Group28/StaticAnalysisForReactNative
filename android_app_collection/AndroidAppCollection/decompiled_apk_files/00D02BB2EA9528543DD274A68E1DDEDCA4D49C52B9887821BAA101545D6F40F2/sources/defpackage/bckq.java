package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bckq  reason: default package */
/* loaded from: classes3.dex */
public final class bckq extends cqtd {
    private final int a;

    public bckq(int i) {
        super(new Object[]{Integer.valueOf(i)});
        this.a = i;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        Drawable a = cqrt.f(this.a).a(context);
        if (a instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) a).getBitmap();
            float height = bitmap.getHeight() * 0.05f;
            if (Math.floor(height) <= dcyn.a) {
                return a;
            }
            Resources resources = context.getResources();
            int color = context.getResources().getColor(R.color.ic_comment_shadow);
            int i = (int) (height + height);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() + i, bitmap.getHeight() + i, Bitmap.Config.ALPHA_8);
            Paint paint = new Paint(1);
            Canvas canvas = new Canvas(createBitmap);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            paint.reset();
            paint.setAntiAlias(true);
            paint.setColor(color);
            paint.setMaskFilter(new BlurMaskFilter(height, BlurMaskFilter.Blur.NORMAL));
            paint.setFilterBitmap(true);
            Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap.getWidth(), createBitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.drawBitmap(createBitmap, 0.0f, height, paint);
            createBitmap.recycle();
            paint.reset();
            paint.setAntiAlias(true);
            canvas2.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            return new BitmapDrawable(resources, createBitmap2);
        }
        return a;
    }
}
