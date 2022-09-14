package com.facebook.common.m;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import org.spongycastle.math.ec.Tnaf;
/* compiled from: WebpSupportStatus.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f2329a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f2330b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f2331c;

    /* renamed from: d  reason: collision with root package name */
    public static b f2332d = null;
    private static boolean e = false;
    private static final byte[] f;
    private static final byte[] g;
    private static final byte[] h;
    private static final byte[] i;
    private static final byte[] j;

    static {
        boolean z = false;
        f2329a = Build.VERSION.SDK_INT <= 17;
        if (Build.VERSION.SDK_INT >= 14) {
            z = true;
        }
        f2330b = z;
        f2331c = b();
        f = a("RIFF");
        g = a("WEBP");
        h = a("VP8 ");
        i = a("VP8L");
        j = a("VP8X");
    }

    public static b a() {
        if (e) {
            return f2332d;
        }
        b bVar = null;
        try {
            bVar = (b) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        } catch (Throwable unused) {
        }
        e = true;
        return bVar;
    }

    private static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }

    private static boolean b() {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (Build.VERSION.SDK_INT == 17) {
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

    public static boolean a(byte[] bArr, int i2) {
        return a(bArr, i2 + 12, j) && ((bArr[i2 + 20] & 2) == 2);
    }

    public static boolean b(byte[] bArr, int i2) {
        return a(bArr, i2 + 12, h);
    }

    public static boolean c(byte[] bArr, int i2) {
        return a(bArr, i2 + 12, i);
    }

    public static boolean a(byte[] bArr, int i2, int i3) {
        return i3 >= 21 && a(bArr, i2 + 12, j);
    }

    public static boolean d(byte[] bArr, int i2) {
        return a(bArr, i2 + 12, j) && ((bArr[i2 + 20] & Tnaf.POW_2_WIDTH) == 16);
    }

    public static boolean b(byte[] bArr, int i2, int i3) {
        return i3 >= 20 && a(bArr, i2, f) && a(bArr, i2 + 8, g);
    }

    private static boolean a(byte[] bArr, int i2, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i2 > bArr.length) {
            return false;
        }
        for (int i3 = 0; i3 < bArr2.length; i3++) {
            if (bArr[i3 + i2] != bArr2[i3]) {
                return false;
            }
        }
        return true;
    }
}
