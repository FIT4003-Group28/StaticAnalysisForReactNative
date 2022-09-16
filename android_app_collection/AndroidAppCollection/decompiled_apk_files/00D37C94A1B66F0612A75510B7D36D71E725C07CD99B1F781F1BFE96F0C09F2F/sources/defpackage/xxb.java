package defpackage;

import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.Animation;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: xxb  reason: default package */
/* loaded from: classes4.dex */
public final class xxb implements yyo {
    private final int a;
    private final int b;

    public xxb(int i, int i2) {
        boolean z = true;
        aqxo.p(i > 0);
        aqxo.p(i2 <= 0 ? false : z);
        this.a = i;
        this.b = i2;
    }

    private static final void d(ImageView imageView, int i) {
        imageView.getLayoutParams().width = -1;
        imageView.getLayoutParams().height = i;
        imageView.requestLayout();
    }

    @Override // defpackage.yyo
    public final void a(ImageView imageView, Bitmap bitmap) {
        if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return;
        }
        int width = (this.b * bitmap.getWidth()) / bitmap.getHeight();
        if (width < this.a) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(imageView.getResources(), Bitmap.createScaledBitmap(bitmap, width, this.b, true));
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            imageView.setBackground(bitmapDrawable);
            d(imageView, this.b);
            return;
        }
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageBitmap(bitmap);
        d(imageView, (this.a * bitmap.getHeight()) / bitmap.getWidth());
    }

    @Override // defpackage.yyo
    public final Animation b() {
        return null;
    }

    @Override // defpackage.yyo
    public final boolean c() {
        return false;
    }
}
