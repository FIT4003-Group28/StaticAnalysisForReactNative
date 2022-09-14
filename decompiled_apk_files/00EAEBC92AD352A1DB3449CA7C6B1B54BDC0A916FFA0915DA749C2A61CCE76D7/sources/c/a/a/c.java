package c.a.a;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f2199a = false;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2200b = false;

    /* renamed from: c  reason: collision with root package name */
    private static String[] f2201c;

    /* renamed from: d  reason: collision with root package name */
    private static long[] f2202d;

    /* renamed from: e  reason: collision with root package name */
    private static int f2203e;

    /* renamed from: f  reason: collision with root package name */
    private static int f2204f;

    public static void a(String str) {
        if (!f2200b) {
            return;
        }
        int i = f2203e;
        if (i == 20) {
            f2204f++;
            return;
        }
        f2201c[i] = str;
        f2202d[i] = System.nanoTime();
        a.g.j.d.a(str);
        f2203e++;
    }

    public static float b(String str) {
        int i = f2204f;
        if (i > 0) {
            f2204f = i - 1;
            return 0.0f;
        } else if (!f2200b) {
            return 0.0f;
        } else {
            f2203e--;
            int i2 = f2203e;
            if (i2 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            }
            if (str.equals(f2201c[i2])) {
                a.g.j.d.a();
                return ((float) (System.nanoTime() - f2202d[f2203e])) / 1000000.0f;
            }
            throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f2201c[f2203e] + ".");
        }
    }
}
