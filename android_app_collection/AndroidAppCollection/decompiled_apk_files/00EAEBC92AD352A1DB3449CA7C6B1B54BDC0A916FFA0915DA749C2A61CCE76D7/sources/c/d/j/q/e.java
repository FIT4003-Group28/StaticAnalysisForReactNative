package c.d.j.q;

import android.graphics.Matrix;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final c.d.d.d.e<Integer> f3659a = c.d.d.d.e.a(2, 7, 4, 5);

    public static float a(c.d.j.e.e eVar, int i, int i2) {
        if (eVar == null) {
            return 1.0f;
        }
        float f2 = i;
        float f3 = i2;
        float max = Math.max(eVar.f3266a / f2, eVar.f3267b / f3);
        float f4 = eVar.f3268c;
        if (f2 * max > f4) {
            max = f4 / f2;
        }
        float f5 = eVar.f3268c;
        return f3 * max > f5 ? f5 / f3 : max;
    }

    public static int a(float f2, float f3) {
        return (int) (f3 + (f2 * 8.0f));
    }

    public static int a(int i) {
        return Math.max(1, 8 / i);
    }

    public static int a(c.d.j.e.f fVar, c.d.j.e.e eVar, c.d.j.k.d dVar, boolean z) {
        if (z && eVar != null) {
            int b2 = b(fVar, dVar);
            boolean z2 = false;
            int a2 = f3659a.contains(Integer.valueOf(dVar.e())) ? a(fVar, dVar) : 0;
            if (b2 == 90 || b2 == 270 || a2 == 5 || a2 == 7) {
                z2 = true;
            }
            int a3 = a(a(eVar, z2 ? dVar.f() : dVar.A(), z2 ? dVar.A() : dVar.f()), eVar.f3269d);
            if (a3 > 8) {
                return 8;
            }
            if (a3 >= 1) {
                return a3;
            }
            return 1;
        }
        return 8;
    }

    public static int a(c.d.j.e.f fVar, c.d.j.k.d dVar) {
        int indexOf = f3659a.indexOf(Integer.valueOf(dVar.e()));
        if (indexOf >= 0) {
            int i = 0;
            if (!fVar.d()) {
                i = fVar.b();
            }
            c.d.d.d.e<Integer> eVar = f3659a;
            return eVar.get((indexOf + (i / 90)) % eVar.size()).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    private static int a(c.d.j.k.d dVar) {
        int i = dVar.i();
        if (i == 90 || i == 180 || i == 270) {
            return dVar.i();
        }
        return 0;
    }

    public static Matrix a(c.d.j.k.d dVar, c.d.j.e.f fVar) {
        if (f3659a.contains(Integer.valueOf(dVar.e()))) {
            return b(a(fVar, dVar));
        }
        int b2 = b(fVar, dVar);
        if (b2 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(b2);
        return matrix;
    }

    public static int b(c.d.j.e.f fVar, c.d.j.k.d dVar) {
        if (!fVar.c()) {
            return 0;
        }
        int a2 = a(dVar);
        return fVar.d() ? a2 : (a2 + fVar.b()) % 360;
    }

    private static Matrix b(int i) {
        float f2;
        Matrix matrix = new Matrix();
        if (i != 2) {
            if (i == 7) {
                f2 = -90.0f;
            } else if (i == 4) {
                f2 = 180.0f;
            } else if (i != 5) {
                return null;
            } else {
                f2 = 90.0f;
            }
            matrix.setRotate(f2);
            matrix.postScale(-1.0f, 1.0f);
        } else {
            matrix.setScale(-1.0f, 1.0f);
        }
        return matrix;
    }

    public static boolean c(int i) {
        switch (i) {
            case 1:
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

    public static boolean d(int i) {
        return i >= 0 && i <= 270 && i % 90 == 0;
    }
}
