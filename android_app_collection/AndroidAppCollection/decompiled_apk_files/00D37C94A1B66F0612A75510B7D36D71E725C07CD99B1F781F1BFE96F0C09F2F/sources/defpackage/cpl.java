package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
/* compiled from: PG */
/* renamed from: cpl  reason: default package */
/* loaded from: classes3.dex */
public final class cpl {
    public static final cib a = cib.c("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", chm.c);
    public static final cib b = cib.b("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
    public static final cib c;
    public static final cib d;
    public static final cpk e;
    private static final Set h;
    private static final Queue i;
    public final clb f;
    public final List g;
    private final cld j;
    private final DisplayMetrics k;
    private final cpq l = cpq.a();

    static {
        cpi cpiVar = cpi.a;
        c = cib.c("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false);
        d = cib.c("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false);
        h = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        e = new cpj();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        i = cvd.h(0);
    }

    public cpl(List list, DisplayMetrics displayMetrics, cld cldVar, clb clbVar) {
        this.g = list;
        hy.N(displayMetrics);
        this.k = displayMetrics;
        hy.N(cldVar);
        this.j = cldVar;
        hy.N(clbVar);
        this.f = clbVar;
    }

    private static int b(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static int c(double d2) {
        return (int) (d2 + 0.5d);
    }

    private static Bitmap d(cpu cpuVar, BitmapFactory.Options options, cpk cpkVar, cld cldVar) {
        String sb;
        Bitmap d2;
        Lock lock;
        if (!options.inJustDecodeBounds) {
            cpkVar.b();
            cpuVar.d();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        cqe.b.lock();
        try {
            try {
                d2 = cpuVar.b(options);
                lock = cqe.b;
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
                        cldVar.d(options.inBitmap);
                        options.inBitmap = null;
                        d2 = d(cpuVar, options, cpkVar, cldVar);
                        lock = cqe.b;
                    } catch (IOException unused) {
                        throw iOException;
                    }
                } else {
                    throw iOException;
                }
            }
            lock.unlock();
            return d2;
        } catch (Throwable th) {
            cqe.b.unlock();
            throw th;
        }
    }

    private static synchronized BitmapFactory.Options e() {
        BitmapFactory.Options options;
        synchronized (cpl.class) {
            Queue queue = i;
            synchronized (queue) {
                options = (BitmapFactory.Options) queue.poll();
            }
            if (options == null) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                g(options2);
                return options2;
            }
            return options;
        }
    }

    private static void f(BitmapFactory.Options options) {
        g(options);
        Queue queue = i;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void g(BitmapFactory.Options options) {
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

    private static boolean h(int i2) {
        return i2 == 90 || i2 == 270;
    }

    private static boolean i(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static int[] j(cpu cpuVar, BitmapFactory.Options options, cpk cpkVar, cld cldVar) {
        options.inJustDecodeBounds = true;
        d(cpuVar, options, cpkVar, cldVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x028e A[Catch: all -> 0x0401, TryCatch #6 {all -> 0x0401, blocks: (B:99:0x025d, B:101:0x0269, B:113:0x0296, B:126:0x02d8, B:128:0x02de, B:131:0x02e5, B:134:0x02eb, B:135:0x02ed, B:137:0x02f5, B:139:0x02fb, B:141:0x0301, B:143:0x0305, B:145:0x030d, B:147:0x0312, B:146:0x0310, B:148:0x0319, B:150:0x031d, B:151:0x0325, B:153:0x0332, B:173:0x03dd, B:175:0x03e3, B:156:0x0344, B:157:0x0351, B:166:0x0381, B:168:0x03aa, B:170:0x03b1, B:172:0x03d7, B:169:0x03af, B:159:0x0355, B:160:0x0359, B:161:0x0362, B:162:0x0366, B:163:0x036f, B:164:0x0378, B:165:0x037c, B:179:0x03f0, B:118:0x029f, B:120:0x02a5, B:122:0x02af, B:102:0x0271, B:105:0x0277, B:107:0x0281, B:109:0x0286, B:111:0x028e, B:112:0x0292, B:108:0x0284, B:171:0x03ca), top: B:197:0x025d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cku a(defpackage.cpu r27, int r28, int r29, defpackage.cic r30, defpackage.cpk r31) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpl.a(cpu, int, int, cic, cpk):cku");
    }
}
