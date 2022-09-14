package c.d.j.q;

import c.d.d.d.i;
/* loaded from: classes.dex */
public class a {
    public static float a(c.d.j.e.f fVar, c.d.j.e.e eVar, c.d.j.k.d dVar) {
        i.a(c.d.j.k.d.d(dVar));
        if (eVar == null || eVar.f3267b <= 0 || eVar.f3266a <= 0 || dVar.A() == 0 || dVar.f() == 0) {
            return 1.0f;
        }
        int a2 = a(fVar, dVar);
        boolean z = a2 == 90 || a2 == 270;
        int f2 = z ? dVar.f() : dVar.A();
        int A = z ? dVar.A() : dVar.f();
        float f3 = eVar.f3266a / f2;
        float f4 = eVar.f3267b / A;
        float max = Math.max(f3, f4);
        c.d.d.e.a.b("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(eVar.f3266a), Integer.valueOf(eVar.f3267b), Integer.valueOf(f2), Integer.valueOf(A), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(max));
        return max;
    }

    public static int a(float f2) {
        if (f2 > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            double d2 = i;
            if ((1.0d / d2) + ((1.0d / (Math.pow(d2, 2.0d) - d2)) * 0.3333333432674408d) <= f2) {
                return i - 1;
            }
            i++;
        }
    }

    public static int a(c.d.j.e.f fVar, c.d.j.e.e eVar, c.d.j.k.d dVar, int i) {
        if (!c.d.j.k.d.d(dVar)) {
            return 1;
        }
        float a2 = a(fVar, eVar, dVar);
        int b2 = dVar.g() == c.d.i.b.f3144a ? b(a2) : a(a2);
        int max = Math.max(dVar.f(), dVar.A());
        float f2 = eVar != null ? eVar.f3268c : i;
        while (max / b2 > f2) {
            b2 = dVar.g() == c.d.i.b.f3144a ? b2 * 2 : b2 + 1;
        }
        return b2;
    }

    private static int a(c.d.j.e.f fVar, c.d.j.k.d dVar) {
        boolean z = false;
        if (!fVar.d()) {
            return 0;
        }
        int i = dVar.i();
        if (i == 0 || i == 90 || i == 180 || i == 270) {
            z = true;
        }
        i.a(z);
        return i;
    }

    public static int b(float f2) {
        if (f2 > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            int i2 = i * 2;
            double d2 = 1.0d / i2;
            if (d2 + (0.3333333432674408d * d2) <= f2) {
                return i;
            }
            i = i2;
        }
    }
}
