package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import c.d.d.d.i;
import c.d.d.d.n;
import c.d.d.g.g;
import java.util.Locale;
@c.d.d.d.d
/* loaded from: classes.dex */
public abstract class DalvikPurgeableDecoder implements com.facebook.imagepipeline.platform.f {

    /* renamed from: b  reason: collision with root package name */
    protected static final byte[] f5278b;

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.b f5279a = com.facebook.imagepipeline.memory.c.a();

    /* JADX INFO: Access modifiers changed from: private */
    @com.facebook.soloader.d
    /* loaded from: classes.dex */
    public static class OreoUtils {
        private OreoUtils() {
        }

        @TargetApi(26)
        static void a(BitmapFactory.Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        a.a();
        f5278b = new byte[]{-1, -39};
    }

    public static BitmapFactory.Options a(int i, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        if (Build.VERSION.SDK_INT >= 11) {
            options.inMutable = true;
        }
        return options;
    }

    public static boolean a(c.d.d.h.a<g> aVar, int i) {
        g b2 = aVar.b();
        return i >= 2 && b2.a(i + (-2)) == -1 && b2.a(i - 1) == -39;
    }

    @c.d.d.d.d
    private static native void nativePinBitmap(Bitmap bitmap);

    protected abstract Bitmap a(c.d.d.h.a<g> aVar, int i, BitmapFactory.Options options);

    protected abstract Bitmap a(c.d.d.h.a<g> aVar, BitmapFactory.Options options);

    public c.d.d.h.a<Bitmap> a(Bitmap bitmap) {
        i.a(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f5279a.b(bitmap)) {
                return c.d.d.h.a.a(bitmap, this.f5279a.d());
            }
            int a2 = com.facebook.imageutils.a.a(bitmap);
            bitmap.recycle();
            throw new c.d.j.e.g(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(a2), Integer.valueOf(this.f5279a.a()), Long.valueOf(this.f5279a.e()), Integer.valueOf(this.f5279a.b()), Integer.valueOf(this.f5279a.c())));
        } catch (Exception e2) {
            bitmap.recycle();
            n.a(e2);
            throw null;
        }
    }

    @Override // com.facebook.imagepipeline.platform.f
    public c.d.d.h.a<Bitmap> a(c.d.j.k.d dVar, Bitmap.Config config, Rect rect, int i) {
        return a(dVar, config, rect, i, null);
    }

    @Override // com.facebook.imagepipeline.platform.f
    public c.d.d.h.a<Bitmap> a(c.d.j.k.d dVar, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        BitmapFactory.Options a2 = a(dVar.w(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(a2, colorSpace);
        }
        c.d.d.h.a<g> b2 = dVar.b();
        i.a(b2);
        try {
            return a(a(b2, i, a2));
        } finally {
            c.d.d.h.a.b(b2);
        }
    }

    @Override // com.facebook.imagepipeline.platform.f
    public c.d.d.h.a<Bitmap> a(c.d.j.k.d dVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options a2 = a(dVar.w(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(a2, colorSpace);
        }
        c.d.d.h.a<g> b2 = dVar.b();
        i.a(b2);
        try {
            return a(a(b2, a2));
        } finally {
            c.d.d.h.a.b(b2);
        }
    }
}
