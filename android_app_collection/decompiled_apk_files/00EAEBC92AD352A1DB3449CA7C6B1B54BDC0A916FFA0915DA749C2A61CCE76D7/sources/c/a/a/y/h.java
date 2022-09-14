package c.a.a.y;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.os.Build;
import android.provider.Settings;
import c.a.a.t.b.t;
import java.io.Closeable;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final PathMeasure f2696a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    private static final Path f2697b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private static final Path f2698c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private static final float[] f2699d = new float[4];

    /* renamed from: e  reason: collision with root package name */
    private static final float f2700e = (float) Math.sqrt(2.0d);

    /* renamed from: f  reason: collision with root package name */
    private static float f2701f = -1.0f;

    public static float a() {
        if (f2701f == -1.0f) {
            f2701f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f2701f;
    }

    public static float a(Context context) {
        int i = Build.VERSION.SDK_INT;
        ContentResolver contentResolver = context.getContentResolver();
        return i >= 17 ? Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) : Settings.System.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    public static float a(Matrix matrix) {
        float[] fArr = f2699d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f2 = f2700e;
        fArr[2] = f2;
        fArr[3] = f2;
        matrix.mapPoints(fArr);
        float[] fArr2 = f2699d;
        return ((float) Math.hypot(fArr2[2] - fArr2[0], fArr2[3] - fArr2[1])) / 2.0f;
    }

    public static int a(float f2, float f3, float f4, float f5) {
        int i = f2 != 0.0f ? (int) (527 * f2) : 17;
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        if (f4 != 0.0f) {
            i = (int) (i * 31 * f4);
        }
        return f5 != 0.0f ? (int) (i * 31 * f5) : i;
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static Path a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f2 = pointF.x;
            float f3 = pointF2.x;
            float f4 = pointF2.y;
            path.cubicTo(pointF3.x + f2, pointF.y + pointF3.y, f3 + pointF4.x, f4 + pointF4.y, f3, f4);
        }
        return path;
    }

    public static void a(Path path, float f2, float f3, float f4) {
        c.a.a.c.a("applyTrimPathIfNeeded");
        f2696a.setPath(path, false);
        float length = f2696a.getLength();
        if (f2 == 1.0f && f3 == 0.0f) {
            c.a.a.c.b("applyTrimPathIfNeeded");
        } else if (length < 1.0f || Math.abs((f3 - f2) - 1.0f) < 0.01d) {
            c.a.a.c.b("applyTrimPathIfNeeded");
        } else {
            float f5 = f2 * length;
            float f6 = f3 * length;
            float f7 = f4 * length;
            float min = Math.min(f5, f6) + f7;
            float max = Math.max(f5, f6) + f7;
            if (min >= length && max >= length) {
                min = g.a(min, length);
                max = g.a(max, length);
            }
            if (min < 0.0f) {
                min = g.a(min, length);
            }
            if (max < 0.0f) {
                max = g.a(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
            } else {
                if (i >= 0) {
                    min -= length;
                }
                f2697b.reset();
                f2696a.getSegment(min, max, f2697b, true);
                if (max > length) {
                    f2698c.reset();
                    f2696a.getSegment(0.0f, max % length, f2698c, true);
                } else {
                    if (min < 0.0f) {
                        f2698c.reset();
                        f2696a.getSegment(min + length, length, f2698c, true);
                    }
                    path.set(f2697b);
                }
                f2697b.addPath(f2698c);
                path.set(f2697b);
            }
            c.a.a.c.b("applyTrimPathIfNeeded");
        }
    }

    public static void a(Path path, t tVar) {
        if (tVar == null || tVar.g()) {
            return;
        }
        a(path, ((c.a.a.t.c.c) tVar.e()).i() / 100.0f, ((c.a.a.t.c.c) tVar.c()).i() / 100.0f, ((c.a.a.t.c.c) tVar.d()).i() / 360.0f);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    public static boolean b(Matrix matrix) {
        float[] fArr = f2699d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        float[] fArr2 = f2699d;
        return fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3];
    }
}
