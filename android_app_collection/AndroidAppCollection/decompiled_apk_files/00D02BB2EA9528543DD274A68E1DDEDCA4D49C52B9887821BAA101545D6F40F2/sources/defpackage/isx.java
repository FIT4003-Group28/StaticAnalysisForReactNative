package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: isx  reason: default package */
/* loaded from: classes6.dex */
public final class isx {
    public static alad a(akzh akzhVar, gll gllVar, alad aladVar, List<ilo> list) {
        akqq aj;
        ArrayList arrayList = new ArrayList();
        for (ilo iloVar : list) {
            if (iloVar != null && (aj = iloVar.aj()) != null) {
                arrayList.add(aj);
            }
        }
        if (arrayList.isEmpty()) {
            return aladVar;
        }
        Rect f = gllVar.f();
        if (f.height() <= 0 || f.width() <= 0) {
            return aladVar;
        }
        akzh b = akzhVar.b();
        alaa b2 = alad.b(aladVar);
        b2.d = 0.0f;
        b.o(b2.a());
        int[] n = akyx.n(b, aladVar.j);
        if (n == null) {
            return aladVar;
        }
        Point point = new Point(n[0], n[1]);
        float m = (float) akqo.m(b.p().k, b.p().i.a, b.C(), (int) (b.z() / b.B()));
        float f2 = aladVar.k;
        float min = Math.min(f2, c((akqq) arrayList.get(0), f, point, m, b));
        if (Math.abs(min - f2) < 2.0f) {
            int min2 = Math.min(3, arrayList.size());
            for (int i = 1; i < min2; i++) {
                float c = c((akqq) arrayList.get(i), f, point, m, b);
                if (c < min && Math.abs(c - f2) <= 2.0f) {
                    min = c;
                }
            }
        }
        alaa b3 = alad.b(aladVar);
        b3.c = min;
        return b3.a();
    }

    private static int b(float f) {
        return (int) (f * 25.0f);
    }

    private static float c(akqq akqqVar, Rect rect, Point point, float f, akzh akzhVar) {
        int[] n = akyx.n(akzhVar, akra.f(akqqVar));
        if (n == null) {
            return akzhVar.p().k;
        }
        Point point2 = new Point(n[0], n[1]);
        float B = akzhVar.B();
        int width = rect.width();
        float max = Math.max(((Math.abs(point2.x - point.x) + b(B)) * f) / (width / 2.0f), ((Math.abs(point2.y - point.y) + b(B)) * f) / (rect.height() / 2.0f));
        if (max > f) {
            return akyx.b(akzhVar, max);
        }
        return akzhVar.p().k;
    }
}
