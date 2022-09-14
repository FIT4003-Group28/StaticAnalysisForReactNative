package com.facebook.imageutils;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.Pair;
import c.d.d.d.i;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final androidx.core.util.f<ByteBuffer> f5295a = new androidx.core.util.f<>(12);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imageutils.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0116a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5296a = new int[Bitmap.Config.values().length];

        static {
            try {
                f5296a[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5296a[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5296a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5296a[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5296a[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int a(int i, int i2, Bitmap.Config config) {
        return i * i2 * a(config);
    }

    public static int a(Bitmap.Config config) {
        int i = C0116a.f5296a[config.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3 || i == 4) {
                return 2;
            }
            if (i != 5) {
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
            }
            return 8;
        }
        return 4;
    }

    @SuppressLint({"NewApi"})
    public static int a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT > 19) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
            }
        }
        return Build.VERSION.SDK_INT >= 12 ? bitmap.getByteCount() : bitmap.getRowBytes() * bitmap.getHeight();
    }

    public static Pair<Integer, Integer> a(InputStream inputStream) {
        i.a(inputStream);
        ByteBuffer a2 = f5295a.a();
        if (a2 == null) {
            a2 = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = a2.array();
            Pair<Integer, Integer> pair = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (options.outWidth != -1 && options.outHeight != -1) {
                pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            }
            return pair;
        } finally {
            f5295a.a(a2);
        }
    }

    public static b b(InputStream inputStream) {
        i.a(inputStream);
        ByteBuffer a2 = f5295a.a();
        if (a2 == null) {
            a2 = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = a2.array();
            ColorSpace colorSpace = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (Build.VERSION.SDK_INT >= 26) {
                colorSpace = options.outColorSpace;
            }
            return new b(options.outWidth, options.outHeight, colorSpace);
        } finally {
            f5295a.a(a2);
        }
    }
}
