package defpackage;

import android.util.SparseIntArray;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: alxp  reason: default package */
/* loaded from: classes.dex */
public final class alxp {
    public static final alxp e;
    private static final dcqe f = dcqe.c("alxp");
    private static final alxo[] g = new alxo[0];
    private static final byte[] h = new byte[0];
    private static final alxo n;
    public final long a;
    public final alxo[] b;
    @dzsi
    public final SparseIntArray c;
    @dzsi
    public Map<Integer, alxp> d;
    private final alxo[] i;
    private final byte[] j;
    private List<Long> k;
    private Boolean l;
    private boolean m;

    static {
        alxo alxoVar = new alxo(-1, true, true, true, true, true, true, 0, 0, alxo.b, null, null, null, null, null, 0, null, dcdc.e(), 0.0f, 0.0f, 0.0f, null, 0, null, null);
        n = alxoVar;
        e = b(alxoVar, false);
    }

    public alxp(long j, alxo[] alxoVarArr, byte[] bArr, @dzsi SparseIntArray sparseIntArray) {
        this(j, alxoVarArr, bArr, sparseIntArray, false);
    }

    public static alxp b(alxo alxoVar, boolean z) {
        return new alxp(0L, new alxo[]{alxoVar}, new byte[]{0}, null, z);
    }

    private static int m(int i, int i2, int i3, int i4, float f2) {
        if (i3 == i4) {
            return i;
        }
        float f3 = (f2 - i3) / (i4 - i3);
        float f4 = 1.0f - f3;
        return ((int) (((i2 & 255) * f3) + ((i & 255) * f4))) | (((int) ((((i2 >> 24) & 255) * f3) + (((i >> 24) & 255) * f4))) << 24) | (((int) ((((i2 >> 16) & 255) * f3) + (((i >> 16) & 255) * f4))) << 16) | (((int) ((((i2 >> 8) & 255) * f3) + (((i >> 8) & 255) * f4))) << 8);
    }

    private static float n(float f2, float f3, int i, int i2, float f4) {
        double d = i;
        float pow = (float) ((Math.pow(2.0d, f4) - Math.pow(2.0d, d)) / (Math.pow(2.0d, i2) - Math.pow(2.0d, d)));
        return (f3 * pow) + (f2 * (1.0f - pow));
    }

    private static alxl[] o(alxl[] alxlVarArr, alxl[] alxlVarArr2, int i, int i2, float f2) {
        alxl[] alxlVarArr3 = new alxl[Math.max(alxlVarArr.length, alxlVarArr2.length)];
        int i3 = 0;
        while (true) {
            int length = alxlVarArr.length;
            int length2 = alxlVarArr2.length;
            if (i3 < Math.max(length, length2)) {
                alxl alxlVar = i3 < length ? alxlVarArr[i3] : alxl.m;
                alxl alxlVar2 = i3 < length2 ? alxlVarArr2[i3] : alxl.m;
                int m = m(alxlVar.a, alxlVar2.a, i, i2, f2);
                int m2 = m(alxlVar.b, alxlVar2.b, i, i2, f2);
                float n2 = n(alxlVar.c, alxlVar2.c, i, i2, f2);
                float n3 = n(alxlVar.g, alxlVar2.g, i, i2, f2);
                float n4 = n(alxlVar.k, alxlVar2.k, i, i2, f2);
                float n5 = n(alxlVar.l, alxlVar2.l, i, i2, f2);
                if (f2 < i2) {
                    alxlVar2 = alxlVar;
                }
                alxlVarArr3[i3] = new alxl(m, m2, n2, alxlVar.d, n3, alxlVar2.h, n4, n5, alxlVar2.i, alxlVar2.j);
                i3++;
            } else {
                return alxlVarArr3;
            }
        }
    }

    private static alxo p(alxo alxoVar, alxo alxoVar2, int i, int i2, float f2) {
        alxn alxnVar = new alxn();
        int i3 = alxoVar.k;
        if (i3 != 0) {
            alxnVar.h = m(i3, alxoVar2.e ? i3 : alxoVar2.k, i, i2, f2);
        }
        alxnVar.b = alxoVar.e;
        alxl[] alxlVarArr = alxoVar.n;
        if (alxlVarArr.length > 0) {
            alxl[] alxlVarArr2 = alxoVar2.n;
            if (alxlVarArr2.length <= 0) {
                alxlVarArr2 = alxlVarArr;
            }
            alxnVar.k = o(alxlVarArr, alxlVarArr2, i, i2, f2);
        }
        alxnVar.c = alxoVar.f;
        alxnVar.w = alxoVar.F;
        if (!alxoVar.I.d()) {
            alxnVar.A = alxoVar.I;
        }
        if (!alxoVar.J.d()) {
            alxnVar.B = alxoVar.J;
            alxnVar.C = alxoVar.K;
            alxnVar.D = alxoVar.L;
            alxnVar.E = alxoVar.M;
        }
        int i4 = alxoVar.G;
        if (i4 != alxoVar2.G) {
            bvoo.h("lineStrokeRenderingAttributes mismatch for zoom: %d, and zoom: %d", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            alxnVar.y = i4;
        }
        int i5 = alxoVar.H;
        if (i5 != alxoVar2.H) {
            bvoo.h("areaStrokeRenderingAttributes mismatch for zoom: %d, and zoom: %d", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            alxnVar.z = i5;
        }
        if (alxoVar.b()) {
            alyf alyfVar = alxoVar.q;
            alyf alyfVar2 = alxoVar2.b() ? alxoVar2.q : alxoVar.q;
            alxnVar.n = alyf.j(m(alyfVar.a(), alyfVar2.a(), i, i2, f2), m(alyfVar.b(), alyfVar2.b(), i, i2, f2), alyfVar.c(), alyfVar.d(), alyfVar.e(), alyfVar.f(), alyfVar.g(), alyfVar.h());
        }
        if (alxoVar.c()) {
            alxnVar.o = alxoVar.r;
        }
        if (alxoVar.d()) {
            alxnVar.p = alxoVar.s;
        }
        float f3 = alxoVar.A;
        if (f3 != 0.0f) {
            alxnVar.q = f3;
        }
        float f4 = alxoVar.B;
        if (f4 != 0.0f) {
            alxnVar.r = f4;
        }
        float f5 = alxoVar.C;
        if (f5 != 0.0f) {
            alxnVar.s = f5;
        }
        Integer num = alxoVar.t;
        if (num != null) {
            alxnVar.F = num;
        }
        dmmm dmmmVar = alxoVar.u;
        if (dmmmVar != null) {
            alxnVar.G = dmmmVar;
        }
        alxnVar.H = alxoVar.v;
        if (alxoVar.h()) {
            alxnVar.I = alxoVar.w;
        }
        if (!alxoVar.x.isEmpty()) {
            alxnVar.J = alxoVar.x;
        }
        if (alxoVar.i()) {
            alxnVar.K = alxoVar.y;
        }
        dmlu dmluVar = alxoVar.z;
        if (dmluVar != null) {
            alxnVar.b(dmluVar);
        }
        alxnVar.d = alxoVar.g;
        alxl[] alxlVarArr3 = alxoVar.o;
        if (alxlVarArr3.length > 0) {
            alxl[] alxlVarArr4 = alxoVar2.o;
            if (alxlVarArr4.length <= 0) {
                alxlVarArr4 = alxlVarArr3;
            }
            alxnVar.l = o(alxlVarArr3, alxlVarArr4, i, i2, f2);
        }
        if (alxoVar.g()) {
            alxnVar.t = m(alxoVar.j(), alxoVar2.g() ? alxoVar2.j() : alxoVar.j(), i, i2, f2);
        }
        alxnVar.g = alxoVar.j;
        if (alxoVar.e()) {
            alxnVar.i = m(alxoVar.l, alxoVar2.e() ? alxoVar2.l : alxoVar.l, i, i2, f2);
        }
        alxl[] alxlVarArr5 = alxoVar.p;
        if (alxlVarArr5.length > 0) {
            alxl[] alxlVarArr6 = alxoVar2.p;
            if (alxlVarArr6.length <= 0) {
                alxlVarArr6 = alxlVarArr5;
            }
            alxnVar.m = o(alxlVarArr5, alxlVarArr6, i, i2, f2);
        }
        alxnVar.e = alxoVar.h;
        alxnVar.u = alxoVar.D;
        alxnVar.f = alxoVar.i;
        alxnVar.v = alxoVar.E;
        long j = alxoVar.d;
        if (j < 0) {
            j = alxoVar2.d;
        }
        alxnVar.a = j;
        alxo a = alxnVar.a();
        return a.equals(alxoVar) ? alxoVar : a;
    }

    @dzsi
    public final alxp a(int i) {
        Map<Integer, alxp> map = this.d;
        if (map != null) {
            return map.get(Integer.valueOf(i));
        }
        return null;
    }

    public final alxo c(int i) {
        alxo alxoVar;
        int b = akn.b(i, 0, 22);
        alxo alxoVar2 = this.i[b];
        if (alxoVar2 != null) {
            return alxoVar2;
        }
        alxo k = k();
        int i2 = b - 1;
        int i3 = b + 1;
        while (true) {
            if (i2 < 0) {
                break;
            }
            alxo alxoVar3 = this.i[i2];
            if (alxoVar3 != null) {
                k = alxoVar3;
                break;
            }
            i2--;
        }
        while (true) {
            if (i3 >= 23) {
                alxoVar = null;
                break;
            }
            alxoVar = this.i[i3];
            if (alxoVar != null) {
                break;
            }
            i3++;
        }
        return alxoVar == null ? k : p(k, alxoVar, Math.max(0, i2), i3, b);
    }

    public final alxo d(float f2) {
        int i = (int) f2;
        int min = Math.min((int) (1.0f + f2), 22);
        return p(c(i), c(min), i, min, f2);
    }

    public final boolean e() {
        if (this.l == null) {
            this.l = Boolean.FALSE;
            int i = 0;
            while (true) {
                alxo[] alxoVarArr = this.b;
                if (i >= alxoVarArr.length) {
                    break;
                }
                for (alxl alxlVar : alxoVarArr[i].o) {
                    if (alxlVar.c()) {
                        this.l = Boolean.TRUE;
                        return true;
                    }
                }
                i++;
            }
        }
        return this.l.booleanValue();
    }

    @Deprecated
    public final byte f(int i) {
        return this.j[i];
    }

    public final synchronized List<Long> g() {
        if (this.k == null) {
            this.k = dchl.a();
            int i = 0;
            while (true) {
                alxo[] alxoVarArr = this.b;
                if (i >= alxoVarArr.length) {
                    break;
                }
                this.k.add(Long.valueOf(alxoVarArr[i].d));
                i++;
            }
        }
        return this.k;
    }

    public final int h() {
        return this.b.length;
    }

    public final int i(int i) {
        int i2 = 0;
        if (this.b.length == 0) {
            return 0;
        }
        int length = c(i).o.length;
        if (length != 0) {
            while (true) {
                int i3 = i2 + i;
                if (i3 >= 23 || c(i3).o.length != length) {
                    break;
                }
                i2++;
            }
        }
        return i2;
    }

    public final alxo j() {
        alxo[] alxoVarArr = this.b;
        return (alxoVarArr == null || alxoVarArr.length == 0) ? n : alxoVarArr[0];
    }

    final alxo k() {
        alxn a = n.a();
        a.v = j().E;
        return a.a();
    }

    public final void l() {
        if (!this.m) {
            for (int length = this.b.length - 2; length >= 0; length--) {
                alxo[] alxoVarArr = this.b;
                alxo alxoVar = alxoVarArr[length];
                int length2 = alxoVar.o.length;
                int i = length + 1;
                alxo alxoVar2 = alxoVarArr[i];
                int length3 = alxoVar2.o.length;
                if (length2 < length3) {
                    alxoVarArr[length] = alxoVar.k(alxoVar2);
                } else if (length2 > length3) {
                    alxoVarArr[i] = alxoVar2.k(alxoVar);
                }
            }
            this.m = true;
        }
    }

    public alxp(long j, alxo[] alxoVarArr, byte[] bArr, @dzsi SparseIntArray sparseIntArray, boolean z) {
        this.k = null;
        this.l = null;
        this.m = false;
        this.d = null;
        this.a = j;
        this.b = alxoVarArr == null ? g : alxoVarArr;
        this.j = bArr == null ? h : bArr;
        this.c = sparseIntArray;
        this.i = new alxo[23];
        alxo k = k();
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.j;
            if (i >= bArr2.length) {
                break;
            }
            alxo alxoVar = this.b[i];
            int i3 = bArr2[i];
            i3 = (i3 < 0 || i3 > 22) ? Math.max(0, Math.min(22, i3)) : i3;
            this.i[i2] = k;
            if (!z) {
                for (int i4 = i2 + 1; i4 < i3; i4++) {
                    this.i[i4] = p(k, alxoVar, i2, i3, i4);
                }
            }
            i++;
            i2 = i3;
            k = alxoVar;
        }
        while (i2 < 23) {
            this.i[i2] = k;
            i2++;
        }
    }
}
