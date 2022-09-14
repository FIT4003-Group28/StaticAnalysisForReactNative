package com.facebook.imagepipeline.n;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: BasePostprocessor.java */
/* loaded from: classes.dex */
public abstract class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final Bitmap.Config f2981a = Bitmap.Config.ARGB_8888;

    @Override // com.facebook.imagepipeline.n.e
    public com.facebook.b.a.d a() {
        return null;
    }

    public void a(Bitmap bitmap) {
    }

    @Override // com.facebook.imagepipeline.n.e
    public String b() {
        return "Unknown postprocessor";
    }

    @Override // com.facebook.imagepipeline.n.e
    public com.facebook.common.h.a<Bitmap> a(Bitmap bitmap, com.facebook.imagepipeline.c.f fVar) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = f2981a;
        }
        com.facebook.common.h.a<Bitmap> a2 = fVar.a(width, height, config);
        try {
            a(a2.a(), bitmap);
            return com.facebook.common.h.a.b(a2);
        } finally {
            com.facebook.common.h.a.c(a2);
        }
    }

    public void a(Bitmap bitmap, Bitmap bitmap2) {
        b(bitmap, bitmap2);
        a(bitmap);
    }

    private static void b(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.getConfig() == bitmap2.getConfig()) {
            Bitmaps.a(bitmap, bitmap2);
        } else {
            new Canvas(bitmap).drawBitmap(bitmap2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        }
    }
}
