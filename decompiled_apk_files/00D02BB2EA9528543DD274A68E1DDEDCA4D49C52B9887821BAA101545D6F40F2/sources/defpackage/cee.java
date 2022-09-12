package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: PG */
/* renamed from: cee  reason: default package */
/* loaded from: classes.dex */
public final class cee {
    public static final Lock a;
    private static final Paint b = new Paint(6);
    private static final Paint c = new Paint(7);
    private static final Paint d;
    private static final Set<String> e;

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        e = hashSet;
        a = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new ced();
        Paint paint = new Paint(7);
        d = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static Bitmap a(bxn bxnVar, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            f = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f + 0.5f), (int) (height + 0.5f));
        Bitmap b2 = bxnVar.b(i, i2, h(bitmap));
        d(bitmap, b2);
        i(bitmap, b2, matrix);
        return b2;
    }

    public static Bitmap b(bxn bxnVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        float min = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            return bitmap;
        }
        Bitmap b2 = bxnVar.b((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), h(bitmap));
        d(bitmap, b2);
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        i(bitmap, b2, matrix);
        return b2;
    }

    public static Bitmap c(bxn bxnVar, Bitmap bitmap, int i, int i2) {
        return (bitmap.getWidth() > i || bitmap.getHeight() > i2) ? b(bxnVar, bitmap, i, i2) : bitmap;
    }

    public static void d(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    public static int e(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static boolean f(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap g(bxn bxnVar, Bitmap bitmap, int i, int i2) {
        Bitmap b2;
        int min = Math.min(i, i2);
        float f = min;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap.Config j = j(bitmap);
        if (j.equals(bitmap.getConfig())) {
            b2 = bitmap;
        } else {
            b2 = bxnVar.b(bitmap.getWidth(), bitmap.getHeight(), j);
            new Canvas(b2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap b3 = bxnVar.b(min, min, j(bitmap));
        b3.setHasAlpha(true);
        Lock lock = a;
        lock.lock();
        try {
            Canvas canvas = new Canvas(b3);
            canvas.drawCircle(f2, f2, f2, c);
            canvas.drawBitmap(b2, (Rect) null, rectF, d);
            k(canvas);
            lock.unlock();
            if (!b2.equals(bitmap)) {
                bxnVar.a(b2);
            }
            return b3;
        } catch (Throwable th) {
            a.unlock();
            throw th;
        }
    }

    public static Bitmap.Config h(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    public static void i(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = a;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, b);
            k(canvas);
            lock.unlock();
        } catch (Throwable th) {
            a.unlock();
            throw th;
        }
    }

    private static Bitmap.Config j(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    private static void k(Canvas canvas) {
        canvas.setBitmap(null);
    }
}
