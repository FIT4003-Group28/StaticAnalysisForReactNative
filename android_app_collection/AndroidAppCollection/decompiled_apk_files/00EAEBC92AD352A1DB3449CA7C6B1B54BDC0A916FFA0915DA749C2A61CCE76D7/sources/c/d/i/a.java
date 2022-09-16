package c.d.i;

import c.d.d.d.g;
import c.d.d.d.i;
import c.d.i.c;
/* loaded from: classes.dex */
public class a implements c.a {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f3136b = {-1, -40, -1};

    /* renamed from: c  reason: collision with root package name */
    private static final int f3137c = f3136b.length;

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f3138d = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: e  reason: collision with root package name */
    private static final int f3139e = f3138d.length;

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f3140f = e.a("GIF87a");

    /* renamed from: g  reason: collision with root package name */
    private static final byte[] f3141g = e.a("GIF89a");

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f3142h = e.a("BM");
    private static final int i = f3142h.length;
    private static final byte[] j = {0, 0, 1, 0};
    private static final int k = j.length;
    private static final String[] l = {"heic", "heix", "hevc", "hevx", "mif1", "msf1"};
    private static final int m = e.a("ftyp" + l[0]).length;

    /* renamed from: a  reason: collision with root package name */
    final int f3143a = g.a(21, 20, f3137c, f3139e, 6, i, k, m);

    private static c b(byte[] bArr, int i2) {
        i.a(c.d.d.l.c.b(bArr, 0, i2));
        return c.d.d.l.c.d(bArr, 0) ? b.f3149f : c.d.d.l.c.c(bArr, 0) ? b.f3150g : c.d.d.l.c.a(bArr, 0, i2) ? c.d.d.l.c.a(bArr, 0) ? b.j : c.d.d.l.c.b(bArr, 0) ? b.i : b.f3151h : c.f3152b;
    }

    private static boolean c(byte[] bArr, int i2) {
        byte[] bArr2 = f3142h;
        if (i2 < bArr2.length) {
            return false;
        }
        return e.a(bArr, bArr2);
    }

    private static boolean d(byte[] bArr, int i2) {
        if (i2 < 6) {
            return false;
        }
        return e.a(bArr, f3140f) || e.a(bArr, f3141g);
    }

    private static boolean e(byte[] bArr, int i2) {
        String[] strArr;
        if (i2 >= m && bArr[3] >= 8) {
            for (String str : l) {
                if (e.a(bArr, bArr.length, e.a("ftyp" + str), m) > -1) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private static boolean f(byte[] bArr, int i2) {
        byte[] bArr2 = j;
        if (i2 < bArr2.length) {
            return false;
        }
        return e.a(bArr, bArr2);
    }

    private static boolean g(byte[] bArr, int i2) {
        byte[] bArr2 = f3136b;
        return i2 >= bArr2.length && e.a(bArr, bArr2);
    }

    private static boolean h(byte[] bArr, int i2) {
        byte[] bArr2 = f3138d;
        return i2 >= bArr2.length && e.a(bArr, bArr2);
    }

    @Override // c.d.i.c.a
    public int a() {
        return this.f3143a;
    }

    @Override // c.d.i.c.a
    public final c a(byte[] bArr, int i2) {
        i.a(bArr);
        return c.d.d.l.c.b(bArr, 0, i2) ? b(bArr, i2) : g(bArr, i2) ? b.f3144a : h(bArr, i2) ? b.f3145b : d(bArr, i2) ? b.f3146c : c(bArr, i2) ? b.f3147d : f(bArr, i2) ? b.f3148e : e(bArr, i2) ? b.k : c.f3152b;
    }
}
