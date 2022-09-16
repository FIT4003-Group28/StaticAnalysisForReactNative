package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: ids  reason: default package */
/* loaded from: classes3.dex */
final class ids extends yyj {
    final /* synthetic */ idw a;
    private final Rect b = new Rect();

    public ids(idw idwVar) {
        this.a = idwVar;
    }

    @Override // defpackage.yyj, defpackage.yyo
    public final void a(ImageView imageView, Bitmap bitmap) {
        avhn avhnVar;
        int i;
        int i2;
        idw idwVar = this.a;
        if (imageView != idwVar.e && ((avhnVar = idwVar.h) == null || !avhnVar.f)) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            double d = width;
            double d2 = height;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            if (d3 < 0.5625d) {
                Double.isNaN(d);
                i2 = (int) (d / 0.5625d);
                i = width;
            } else {
                if (d3 > 0.5625d) {
                    Double.isNaN(d2);
                    i = (int) (d2 * 0.5625d);
                } else {
                    i = width;
                }
                i2 = height;
            }
            int i3 = (width - i) / 2;
            int i4 = (height - i2) / 2;
            if (i != width || i2 != height) {
                bitmap = Bitmap.createBitmap(bitmap, i3, i4, i, i2);
            }
        }
        imageView.setImageBitmap(bitmap);
        double height2 = bitmap.getHeight();
        double width2 = bitmap.getWidth();
        Double.isNaN(height2);
        Double.isNaN(width2);
        double d4 = height2 / width2;
        imageView.getWindowVisibleDisplayFrame(this.b);
        double height3 = this.b.height();
        double width3 = this.b.width();
        Double.isNaN(height3);
        Double.isNaN(width3);
        double d5 = height3 / width3;
        Object obj = this.a.b.get();
        if (obj != null) {
            aull aullVar = (aull) obj;
            if ((aullVar.b & 268435456) != 0 && aullVar.v && this.a.i && d4 > 1.5d) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return;
            }
        }
        if (!this.a.i || d4 >= d5) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }
}
