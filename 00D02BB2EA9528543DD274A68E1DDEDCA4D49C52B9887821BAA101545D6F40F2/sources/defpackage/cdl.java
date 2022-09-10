package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
/* compiled from: PG */
/* renamed from: cdl  reason: default package */
/* loaded from: classes.dex */
public final class cdl {
    public static final btz<btk> a = btz.b("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", btk.c);
    public static final btz<bub> b = btz.b("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", bub.SRGB);
    public static final btz<Boolean> c;
    public static final btz<Boolean> d;
    public static final cdk e;
    private static final Set<String> h;
    private static final Queue<BitmapFactory.Options> i;
    public final bxl f;
    public final List<btn> g;
    private final bxn j;
    private final DisplayMetrics k;
    private final cdr l = cdr.a();

    static {
        cdi cdiVar = cdi.a;
        c = btz.b("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false);
        d = btz.b("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false);
        h = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        e = new cdj();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        i = cjp.h(0);
    }

    public cdl(List<btn> list, DisplayMetrics displayMetrics, bxn bxnVar, bxl bxlVar) {
        this.g = list;
        cjn.b(displayMetrics);
        this.k = displayMetrics;
        cjn.b(bxnVar);
        this.j = bxnVar;
        cjn.b(bxlVar);
        this.f = bxlVar;
    }

    private static int c(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static int d(double d2) {
        return (int) (d2 + 0.5d);
    }

    private static int[] e(cdu cduVar, BitmapFactory.Options options, cdk cdkVar, bxn bxnVar) {
        options.inJustDecodeBounds = true;
        f(cduVar, options, cdkVar, bxnVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static Bitmap f(cdu cduVar, BitmapFactory.Options options, cdk cdkVar, bxn bxnVar) {
        String sb;
        Bitmap f;
        Lock lock;
        if (!options.inJustDecodeBounds) {
            cdkVar.a();
            cduVar.d();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        cee.a.lock();
        try {
            try {
                f = cduVar.a(options);
                lock = cee.a;
            } catch (IllegalArgumentException e2) {
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    sb = null;
                } else {
                    int allocationByteCount = bitmap.getAllocationByteCount();
                    StringBuilder sb2 = new StringBuilder(14);
                    sb2.append(" (");
                    sb2.append(allocationByteCount);
                    sb2.append(")");
                    String sb3 = sb2.toString();
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    String valueOf = String.valueOf(bitmap.getConfig());
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 26 + String.valueOf(sb3).length());
                    sb4.append("[");
                    sb4.append(width);
                    sb4.append("x");
                    sb4.append(height);
                    sb4.append("] ");
                    sb4.append(valueOf);
                    sb4.append(sb3);
                    sb = sb4.toString();
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 99 + String.valueOf(sb).length());
                sb5.append("Exception decoding bitmap, outWidth: ");
                sb5.append(i2);
                sb5.append(", outHeight: ");
                sb5.append(i3);
                sb5.append(", outMimeType: ");
                sb5.append(str);
                sb5.append(", inBitmap: ");
                sb5.append(sb);
                IOException iOException = new IOException(sb5.toString(), e2);
                if (options.inBitmap != null) {
                    try {
                        bxnVar.a(options.inBitmap);
                        options.inBitmap = null;
                        f = f(cduVar, options, cdkVar, bxnVar);
                        lock = cee.a;
                    } catch (IOException unused) {
                        throw iOException;
                    }
                } else {
                    throw iOException;
                }
            }
            lock.unlock();
            return f;
        } catch (Throwable th) {
            cee.a.unlock();
            throw th;
        }
    }

    private static boolean g(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static synchronized BitmapFactory.Options h() {
        BitmapFactory.Options poll;
        synchronized (cdl.class) {
            Queue<BitmapFactory.Options> queue = i;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                j(options);
                return options;
            }
            return poll;
        }
    }

    private static void i(BitmapFactory.Options options) {
        j(options);
        Queue<BitmapFactory.Options> queue = i;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void j(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static boolean k(int i2) {
        return i2 == 90 || i2 == 270;
    }

    public final bxd<Bitmap> a(InputStream inputStream, int i2, int i3, bua buaVar, cdk cdkVar) {
        return b(new cds(inputStream, this.g, this.f), i2, i3, buaVar, cdkVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0291 A[Catch: all -> 0x03dc, TryCatch #2 {all -> 0x03dc, blocks: (B:103:0x0260, B:105:0x026c, B:117:0x0299, B:130:0x02db, B:132:0x02e1, B:135:0x02e8, B:138:0x02ee, B:139:0x02f0, B:140:0x02f6, B:142:0x02fc, B:144:0x0302, B:146:0x0306, B:148:0x030e, B:150:0x0313, B:154:0x0326, B:156:0x0333, B:170:0x03c0, B:172:0x03c6, B:159:0x0345, B:160:0x0352, B:169:0x0382, B:162:0x0356, B:163:0x035a, B:164:0x0363, B:165:0x0367, B:166:0x0370, B:167:0x0379, B:168:0x037d, B:173:0x03cb, B:149:0x0311, B:151:0x031a, B:153:0x031e, B:122:0x02a2, B:124:0x02a8, B:126:0x02b2, B:106:0x0274, B:109:0x027a, B:111:0x0284, B:113:0x0289, B:115:0x0291, B:116:0x0295, B:112:0x0287), top: B:187:0x0260 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bxd<android.graphics.Bitmap> b(defpackage.cdu r27, int r28, int r29, defpackage.bua r30, defpackage.cdk r31) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdl.b(cdu, int, int, bua, cdk):bxd");
    }
}
