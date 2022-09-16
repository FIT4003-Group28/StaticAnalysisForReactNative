package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
/* compiled from: PG */
/* renamed from: acgo  reason: default package */
/* loaded from: classes2.dex */
final class acgo implements Runnable {
    final /* synthetic */ Bitmap a;
    final /* synthetic */ acgp b;

    public acgo(acgp acgpVar, Bitmap bitmap) {
        this.b = acgpVar;
        this.a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acgp acgpVar = this.b;
        Bitmap bitmap = this.a;
        if (acgpVar.b != null) {
            Canvas canvas = new Canvas(acgpVar.b);
            int height = acgpVar.b.getHeight();
            int width = acgpVar.b.getWidth();
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, height - bitmap.getHeight(), paint);
            }
            Bitmap bitmap2 = acgpVar.c;
            if (bitmap2 != null) {
                int height2 = bitmap2.getHeight();
                int width2 = bitmap2.getWidth();
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
                canvas.drawBitmap(bitmap2, (width - width2) / 2, (height - height2) / 2, paint);
            }
        }
        this.b.a = true;
        acgp acgpVar2 = this.b;
        acgpVar2.c = null;
        achf achfVar = acgpVar2.d;
        if (achfVar != null) {
            achfVar.a(acgpVar2.b);
        }
    }
}
