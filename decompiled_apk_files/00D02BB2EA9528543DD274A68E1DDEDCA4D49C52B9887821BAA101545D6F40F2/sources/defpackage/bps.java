package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
/* compiled from: PG */
/* renamed from: bps  reason: default package */
/* loaded from: classes4.dex */
public final class bps {
    private static final PathMeasure b = new PathMeasure();
    private static final Path c = new Path();
    private static final Path d = new Path();
    public static final float[] a = new float[4];
    private static final float e = (float) Math.sqrt(2.0d);
    private static float f = -1.0f;

    public static Path a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        return path;
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static float c(Matrix matrix) {
        float[] fArr = a;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f2 = e;
        fArr[2] = f2;
        fArr[3] = f2;
        matrix.mapPoints(fArr);
        return ((float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1])) / 2.0f;
    }

    public static void d(Path path, bla blaVar) {
        if (blaVar == null || blaVar.a) {
            return;
        }
        e(path, ((ble) blaVar.b).k() / 100.0f, ((ble) blaVar.c).k() / 100.0f, ((ble) blaVar.d).k() / 360.0f);
    }

    public static void e(Path path, float f2, float f3, float f4) {
        PathMeasure pathMeasure = b;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f2 != 1.0f || f3 != 0.0f) {
            if (length < 1.0f || Math.abs((f3 - f2) - 1.0f) < 0.01d) {
                bim.a();
                return;
            }
            float f5 = f2 * length;
            float f6 = f3 * length;
            float f7 = f4 * length;
            float min = Math.min(f5, f6) + f7;
            float max = Math.max(f5, f6) + f7;
            if (min >= length && max >= length) {
                min = bpr.f(min, length);
                max = bpr.f(max, length);
            }
            if (min < 0.0f) {
                min = bpr.f(min, length);
            }
            if (max < 0.0f) {
                max = bpr.f(max, length);
            }
            if (min == max) {
                path.reset();
                bim.a();
                return;
            }
            if (min >= max) {
                min -= length;
            }
            Path path2 = c;
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                Path path3 = d;
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                Path path4 = d;
                path4.reset();
                pathMeasure.getSegment(min + length, length, path4, true);
                path2.addPath(path4);
            }
            path.set(path2);
            bim.a();
            return;
        }
        bim.a();
    }

    public static int f(float f2, float f3, float f4, float f5) {
        int i = f2 != 0.0f ? (int) (f2 * 527.0f) : 17;
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        if (f4 != 0.0f) {
            i = (int) (i * 31 * f4);
        }
        return f5 != 0.0f ? (int) (i * 31 * f5) : i;
    }

    public static float g() {
        if (f == -1.0f) {
            f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f;
    }

    public static float h(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap i(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static boolean j(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static void k(Canvas canvas, RectF rectF, Paint paint) {
        l(canvas, rectF, paint, 31);
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, int i) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        bim.a();
    }

    public static boolean m(int i, int i2, int i3) {
        if (i < 4) {
            return false;
        }
        if (i > 4) {
            return true;
        }
        if (i2 < 4) {
            return false;
        }
        return i2 > 4 || i3 >= 0;
    }
}
