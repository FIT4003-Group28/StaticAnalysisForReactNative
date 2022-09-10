package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import com.google.android.apps.viewer.client.Dimensions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yxi  reason: default package */
/* loaded from: classes7.dex */
public final class yxi implements Runnable {
    final /* synthetic */ Dimensions a;
    final /* synthetic */ yxm b;

    public yxi(yxm yxmVar, Dimensions dimensions) {
        this.b = yxmVar;
        this.a = dimensions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.c || !dbsd.a(this.a, this.b.d)) {
            return;
        }
        Dimensions dimensions = this.b.b;
        int i = dimensions.a;
        Dimensions dimensions2 = this.a;
        int max = Math.max(i / dimensions2.a, dimensions.b / dimensions2.b);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = max;
        yxm yxmVar = this.b;
        BitmapRegionDecoder bitmapRegionDecoder = yxmVar.a;
        Dimensions dimensions3 = yxmVar.b;
        Bitmap decodeRegion = bitmapRegionDecoder.decodeRegion(new Rect(0, 0, dimensions3.a, dimensions3.b), options);
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        yxm yxmVar2 = this.b;
        yxmVar2.e.a.b(new yxj(yxmVar2, this.a, decodeRegion), bvrj.UI_THREAD);
    }
}
