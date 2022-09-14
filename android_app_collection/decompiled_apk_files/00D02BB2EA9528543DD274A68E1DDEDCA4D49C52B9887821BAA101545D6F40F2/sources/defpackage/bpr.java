package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
/* compiled from: PG */
/* renamed from: bpr  reason: default package */
/* loaded from: classes4.dex */
public final class bpr {
    private static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void b(bnc bncVar, Path path) {
        path.reset();
        PointF pointF = bncVar.b;
        path.moveTo(pointF.x, pointF.y);
        a.set(pointF.x, pointF.y);
        for (int i = 0; i < bncVar.a.size(); i++) {
            blu bluVar = bncVar.a.get(i);
            PointF pointF2 = bluVar.a;
            PointF pointF3 = bluVar.b;
            PointF pointF4 = bluVar.c;
            PointF pointF5 = a;
            if (!pointF2.equals(pointF5) || !pointF3.equals(pointF4)) {
                path.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF4.x, pointF4.y);
            } else {
                path.lineTo(pointF4.x, pointF4.y);
            }
            pointF5.set(pointF4.x, pointF4.y);
        }
        if (bncVar.c) {
            path.close();
        }
    }

    public static float c(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static double d(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    public static int e(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if ((i ^ i2) < 0 && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static float g(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static boolean h(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static void i(bly blyVar, int i, List<bly> list, bly blyVar2, bks bksVar) {
        if (blyVar.e(bksVar.g(), i)) {
            list.add(blyVar2.a(bksVar.g()).b(bksVar));
        }
    }

    public static int j(int i) {
        return Math.max(0, Math.min(255, i));
    }
}
