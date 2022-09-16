package c.a.a.x;

import android.graphics.Color;
import android.graphics.PointF;
import c.a.a.x.k0.c;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
class p {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f2667a = c.a.a("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2668a = new int[c.b.values().length];

        static {
            try {
                f2668a[c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2668a[c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2668a[c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(c.a.a.x.k0.c cVar) {
        cVar.a();
        int h2 = (int) (cVar.h() * 255.0d);
        int h3 = (int) (cVar.h() * 255.0d);
        int h4 = (int) (cVar.h() * 255.0d);
        while (cVar.f()) {
            cVar.C();
        }
        cVar.c();
        return Color.argb(255, h2, h3, h4);
    }

    private static PointF a(c.a.a.x.k0.c cVar, float f2) {
        cVar.a();
        float h2 = (float) cVar.h();
        float h3 = (float) cVar.h();
        while (cVar.A() != c.b.END_ARRAY) {
            cVar.C();
        }
        cVar.c();
        return new PointF(h2 * f2, h3 * f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float b(c.a.a.x.k0.c cVar) {
        c.b A = cVar.A();
        int i = a.f2668a[A.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new IllegalArgumentException("Unknown value for token of type " + A);
            }
            cVar.a();
            float h2 = (float) cVar.h();
            while (cVar.f()) {
                cVar.C();
            }
            cVar.c();
            return h2;
        }
        return (float) cVar.h();
    }

    private static PointF b(c.a.a.x.k0.c cVar, float f2) {
        float h2 = (float) cVar.h();
        float h3 = (float) cVar.h();
        while (cVar.f()) {
            cVar.C();
        }
        return new PointF(h2 * f2, h3 * f2);
    }

    private static PointF c(c.a.a.x.k0.c cVar, float f2) {
        cVar.b();
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (cVar.f()) {
            int a2 = cVar.a(f2667a);
            if (a2 == 0) {
                f3 = b(cVar);
            } else if (a2 != 1) {
                cVar.B();
                cVar.C();
            } else {
                f4 = b(cVar);
            }
        }
        cVar.d();
        return new PointF(f3 * f2, f4 * f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PointF d(c.a.a.x.k0.c cVar, float f2) {
        int i = a.f2668a[cVar.A().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return a(cVar, f2);
            }
            if (i == 3) {
                return c(cVar, f2);
            }
            throw new IllegalArgumentException("Unknown point starts with " + cVar.A());
        }
        return b(cVar, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<PointF> e(c.a.a.x.k0.c cVar, float f2) {
        ArrayList arrayList = new ArrayList();
        cVar.a();
        while (cVar.A() == c.b.BEGIN_ARRAY) {
            cVar.a();
            arrayList.add(d(cVar, f2));
            cVar.c();
        }
        cVar.c();
        return arrayList;
    }
}
