package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: cdc  reason: default package */
/* loaded from: classes2.dex */
public final class cdc {
    private static final PointF a = new PointF();

    public static double a(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static float c(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if ((i ^ i2) < 0 && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static int e(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static PointF f(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void g(caw cawVar, Path path) {
        path.reset();
        PointF pointF = cawVar.b;
        path.moveTo(pointF.x, pointF.y);
        a.set(pointF.x, pointF.y);
        for (int i = 0; i < cawVar.a.size(); i++) {
            bzq bzqVar = (bzq) cawVar.a.get(i);
            PointF pointF2 = bzqVar.a;
            PointF pointF3 = bzqVar.b;
            PointF pointF4 = bzqVar.c;
            PointF pointF5 = a;
            if (!pointF2.equals(pointF5) || !pointF3.equals(pointF4)) {
                path.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF4.x, pointF4.y);
            } else {
                path.lineTo(pointF4.x, pointF4.y);
            }
            pointF5.set(pointF4.x, pointF4.y);
        }
        if (cawVar.c) {
            path.close();
        }
    }

    public static void h(bzu bzuVar, int i, List list, bzu bzuVar2, byk bykVar) {
        if (bzuVar.d(bykVar.g(), i)) {
            list.add(bzuVar2.b(bykVar.g()).c(bykVar));
        }
    }

    public static boolean i(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static double j(double d) {
        return Math.max(0.0d, Math.min(1.0d, d));
    }

    public static int k(int i) {
        return Math.max(0, Math.min((int) PrivateKeyType.INVALID, i));
    }
}
