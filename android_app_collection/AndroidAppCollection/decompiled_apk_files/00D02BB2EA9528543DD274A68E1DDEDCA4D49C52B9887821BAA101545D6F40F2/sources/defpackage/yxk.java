package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.google.android.apps.viewer.client.Dimensions;
/* compiled from: PG */
/* renamed from: yxk  reason: default package */
/* loaded from: classes7.dex */
public final class yxk implements Runnable {
    final /* synthetic */ clbs a;
    final /* synthetic */ int b;
    final /* synthetic */ yxm c;

    public yxk(yxm yxmVar, clbs clbsVar, int i) {
        this.c = yxmVar;
        this.a = clbsVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.c) {
            return;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        Rect d = this.a.d();
        Bitmap a = clbu.b.a(new Dimensions(d.width(), d.height()));
        if (a == null) {
            return;
        }
        options.inBitmap = a;
        options.inSampleSize = this.b;
        float f = this.b;
        d.set((int) Math.floor(d.left * f), (int) Math.floor(d.top * f), (int) Math.ceil(d.right * f), (int) Math.ceil(d.bottom * f));
        try {
            Bitmap decodeRegion = this.c.a.decodeRegion(d, options);
            if (decodeRegion == null) {
                d.bottom = Math.min(d.bottom, this.c.b.b - 1);
                decodeRegion = this.c.a.decodeRegion(d, options);
            }
            yxm yxmVar = this.c;
            yxmVar.e.a.b(new yxl(yxmVar, this.a, decodeRegion), bvrj.UI_THREAD);
        } catch (RuntimeException e) {
            this.a.d();
            throw e;
        }
    }
}
