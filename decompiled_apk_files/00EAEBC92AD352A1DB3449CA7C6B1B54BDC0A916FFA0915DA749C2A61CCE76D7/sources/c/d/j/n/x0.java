package c.d.j.n;
/* loaded from: classes.dex */
public final class x0 {
    public static int a(int i) {
        return (int) (i * 1.3333334f);
    }

    public static boolean a(int i, int i2, c.d.j.e.e eVar) {
        int a2 = a(i);
        return eVar == null ? ((float) a2) >= 2048.0f && a(i2) >= 2048 : a2 >= eVar.f3266a && a(i2) >= eVar.f3267b;
    }

    public static boolean a(c.d.j.k.d dVar, c.d.j.e.e eVar) {
        int f2;
        int A;
        if (dVar == null) {
            return false;
        }
        int i = dVar.i();
        if (i == 90 || i == 270) {
            f2 = dVar.f();
            A = dVar.A();
        } else {
            f2 = dVar.A();
            A = dVar.f();
        }
        return a(f2, A, eVar);
    }
}
