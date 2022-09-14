package c.d.d.l;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f2870a;

    /* renamed from: b  reason: collision with root package name */
    public static b f2871b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f2872c;

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f2873d;

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f2874e;

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f2875f;

    /* renamed from: g  reason: collision with root package name */
    private static final byte[] f2876g;

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f2877h;

    static {
        f2870a = Build.VERSION.SDK_INT <= 17;
        int i = Build.VERSION.SDK_INT;
        a();
        f2871b = null;
        f2872c = false;
        f2873d = a("RIFF");
        f2874e = a("WEBP");
        f2875f = a("VP8 ");
        f2876g = a("VP8L");
        f2877h = a("VP8X");
    }

    private static boolean a() {
        int i = Build.VERSION.SDK_INT;
        if (i < 17) {
            return false;
        }
        if (i == 17) {
            byte[] decode = Base64.decode("UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==", 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            if (options.outHeight != 1 || options.outWidth != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(byte[] bArr, int i) {
        return a(bArr, i + 12, f2877h) && ((bArr[i + 20] & 2) == 2);
    }

    public static boolean a(byte[] bArr, int i, int i2) {
        return i2 >= 21 && a(bArr, i + 12, f2877h);
    }

    private static boolean a(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }

    public static b b() {
        if (f2872c) {
            return f2871b;
        }
        b bVar = null;
        try {
            bVar = (b) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        } catch (Throwable unused) {
        }
        f2872c = true;
        return bVar;
    }

    public static boolean b(byte[] bArr, int i) {
        return a(bArr, i + 12, f2877h) && ((bArr[i + 20] & 16) == 16);
    }

    public static boolean b(byte[] bArr, int i, int i2) {
        return i2 >= 20 && a(bArr, i, f2873d) && a(bArr, i + 8, f2874e);
    }

    public static boolean c(byte[] bArr, int i) {
        return a(bArr, i + 12, f2876g);
    }

    public static boolean d(byte[] bArr, int i) {
        return a(bArr, i + 12, f2875f);
    }
}
