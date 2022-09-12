package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: alxo  reason: default package */
/* loaded from: classes.dex */
public final class alxo {
    static final int[] a = new int[0];
    static final alxl[] b;
    public static final alxo c;
    public final float A;
    public final float B;
    public final float C;
    public final float[] D;
    public final int E;
    public final float F;
    public final int G;
    public final int H;
    public final amgj I;
    public final amgj J;
    public final dmnd K;
    public final dmmz L;
    public final dmnb M;
    private final int N;
    private final float O;
    private final Object P;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;
    public final alxl[] n;
    public final alxl[] o;
    public final alxl[] p;
    @dzsi
    public final alyf q;
    @dzsi
    public final alyd r;
    @dzsi
    public final alwe s;
    @dzsi
    public final Integer t;
    @dzsi
    public final dmmm u;
    public final int v;
    @dzsi
    public final dmlo w;
    public final dcdc<alwj> x;
    @dzsi
    public final dmps y;
    @dzsi
    public final dmlu z;

    static {
        alxl[] alxlVarArr = new alxl[0];
        b = alxlVarArr;
        c = new alxo(-1, false, false, false, false, false, false, 0, 0, alxlVarArr, alyf.m, alyd.a, null, null, null, 0, null, dcdc.e(), 0.0f, 0.0f, 0.0f, null, 0, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public alxo(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, int i3, alxl[] alxlVarArr, @dzsi alyf alyfVar, @dzsi alyd alydVar, @dzsi alwe alweVar, @dzsi Integer num, @dzsi dmmm dmmmVar, int i4, @dzsi dmlo dmloVar, dcdc<alwj> dcdcVar, float f, float f2, float f3, float[] fArr, int i5, @dzsi dmps dmpsVar, @dzsi dmlu dmluVar) {
        this.P = new Object();
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = i2;
        this.l = i2;
        this.m = i3;
        this.n = alxlVarArr;
        this.o = alxlVarArr;
        this.p = alxlVarArr;
        this.q = alyfVar;
        this.r = alydVar;
        this.s = alweVar;
        this.A = f;
        this.B = f2;
        this.C = f3;
        this.y = dmpsVar;
        this.N = i2;
        this.D = fArr;
        this.E = i5;
        this.F = 0.375f;
        this.O = 0.375f;
        this.G = 0;
        this.H = 0;
        this.I = amgj.a;
        this.J = amgj.a;
        this.K = dmnd.TEXTURE_UNKNOWN;
        this.L = dmmz.BLEND_NORMAL;
        this.M = dmnb.OFFSET_NONE;
        this.w = dmloVar;
        this.x = dcdcVar;
        this.t = num;
        this.u = dmmmVar;
        this.v = i4;
        this.z = dmluVar;
    }

    public static alxn l() {
        return new alxn();
    }

    public static alxn m(long j) {
        alxn alxnVar = new alxn();
        alxnVar.a = j;
        return alxnVar;
    }

    private static void n(int[] iArr, alxl[] alxlVarArr, alxl[] alxlVarArr2, alxm alxmVar) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 <= alxlVarArr.length; i4++) {
            while (i3 < iArr.length && iArr[i3] == i4) {
                i2++;
                i3++;
            }
            if (i4 < alxlVarArr.length) {
                alxl alxlVar = alxlVarArr[i4];
                alxl alxlVar2 = alxlVarArr2[i2];
                int o = (o(alxlVar.a, alxlVar2.a) + o(alxlVar.b, alxlVar2.b)) / 2;
                if (alxlVar.b() != alxlVar2.b()) {
                    o += 2048;
                }
                i += o;
                i2++;
            }
        }
        if (i < alxmVar.b) {
            alxmVar.b = i;
            System.arraycopy(iArr, 0, alxmVar.a, 0, iArr.length);
        }
    }

    private static int o(int i, int i2) {
        return Math.abs(anaa.d(i) - anaa.d(i2)) + Math.abs(anaa.a(i) - anaa.a(i2)) + Math.abs(anaa.b(i) - anaa.b(i2)) + Math.abs(anaa.c(i) - anaa.c(i2));
    }

    public final alxn a() {
        alxn alxnVar = new alxn();
        alxnVar.a = this.d;
        alxnVar.b = this.e;
        alxnVar.c = this.f;
        alxnVar.d = this.g;
        alxnVar.e = this.h;
        alxnVar.f = this.i;
        alxnVar.g = this.j;
        alxnVar.h = this.k;
        alxnVar.i = this.l;
        alxnVar.j = this.m;
        alxnVar.k = this.n;
        alxnVar.l = this.o;
        alxnVar.m = this.p;
        alxnVar.n = this.q;
        alxnVar.o = this.r;
        alxnVar.p = this.s;
        alxnVar.q = this.A;
        alxnVar.r = this.B;
        alxnVar.s = this.C;
        alxnVar.u = this.D;
        alxnVar.v = this.E;
        alxnVar.w = this.F;
        alxnVar.x = this.O;
        alxnVar.y = this.G;
        alxnVar.z = this.H;
        alxnVar.A = this.I;
        alxnVar.B = this.J;
        alxnVar.C = this.K;
        alxnVar.D = this.L;
        alxnVar.E = this.M;
        alxnVar.F = this.t;
        alxnVar.G = this.u;
        alxnVar.H = this.v;
        alxnVar.I = this.w;
        alxnVar.J = this.x;
        alxnVar.K = this.y;
        alxnVar.b(this.z);
        synchronized (this.P) {
            alxnVar.t = this.N;
        }
        return alxnVar;
    }

    public final boolean b() {
        return this.q != null;
    }

    public final boolean c() {
        return this.r != null;
    }

    public final boolean d() {
        return this.s != null;
    }

    public final boolean e() {
        return this.l != 0;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        alxo alxoVar = (alxo) obj;
        if (this.e != alxoVar.e || this.f != alxoVar.f || this.g != alxoVar.g || this.h != alxoVar.h || this.i != alxoVar.i || this.j != alxoVar.j || this.k != alxoVar.k || this.l != alxoVar.l || this.m != alxoVar.m || this.d != alxoVar.d || !Arrays.equals(this.n, alxoVar.n) || !Arrays.equals(this.o, alxoVar.o) || !Arrays.equals(this.p, alxoVar.p)) {
            return false;
        }
        alyd alydVar = this.r;
        if (alydVar == null) {
            if (alxoVar.r != null) {
                return false;
            }
        } else if (!alydVar.equals(alxoVar.r)) {
            return false;
        }
        alyf alyfVar = this.q;
        if (alyfVar == null) {
            if (alxoVar.q != null) {
                return false;
            }
        } else if (!alyfVar.equals(alxoVar.q)) {
            return false;
        }
        if (this.E != alxoVar.E) {
            return false;
        }
        alwe alweVar = this.s;
        if (alweVar == null) {
            if (alxoVar.s != null) {
                return false;
            }
        } else if (!alweVar.equals(alxoVar.s)) {
            return false;
        }
        return this.A == alxoVar.A && this.B == alxoVar.B && this.C == alxoVar.C && j() == alxoVar.j() && Arrays.equals(this.D, alxoVar.D) && this.I.equals(alxoVar.I) && this.J.equals(alxoVar.J) && this.K.equals(alxoVar.K) && this.L.equals(alxoVar.L) && this.M.equals(alxoVar.M) && dbsd.a(this.t, alxoVar.t) && dbsd.a(this.u, alxoVar.u) && this.v == alxoVar.v && dbsd.a(this.w, alxoVar.w) && dchl.m(this.x, alxoVar.x) && dbsd.a(this.y, alxoVar.y);
    }

    public final boolean f() {
        return this.m != 0;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.P) {
            z = this.N != 0;
        }
        return z;
    }

    public final boolean h() {
        return this.w != null;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        int i3 = (((((((((((((int) this.d) + 31) * 31) + (true != this.e ? 1237 : 1231)) * 31) + (true != this.f ? 1237 : 1231)) * 31) + (true != this.g ? 1237 : 1231)) * 31) + (true != this.h ? 1237 : 1231)) * 31) + (true != this.i ? 1237 : 1231)) * 31;
        if (true == this.j) {
            i2 = 1231;
        }
        int i4 = this.k;
        int i5 = this.l;
        int i6 = this.m;
        int hashCode = Arrays.hashCode(this.n);
        int hashCode2 = Arrays.hashCode(this.o);
        int hashCode3 = Arrays.hashCode(this.p);
        int hashCode4 = Arrays.hashCode(new Object[]{this.q});
        int hashCode5 = Arrays.hashCode(new Object[]{this.r});
        int hashCode6 = Arrays.hashCode(new Object[]{this.s});
        int hashCode7 = Arrays.hashCode(new Object[]{Float.valueOf(this.A)});
        int hashCode8 = Arrays.hashCode(new Object[]{Float.valueOf(this.B)});
        int hashCode9 = Arrays.hashCode(new Object[]{Float.valueOf(this.C)});
        int hashCode10 = Arrays.hashCode(new Object[]{this.t});
        int hashCode11 = Arrays.hashCode(new Object[]{this.u});
        int hashCode12 = (((((((((((((((((((((((((((((((((((((i3 + i2) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + Arrays.hashCode(new Object[]{Integer.valueOf(this.v)})) * 31) + Arrays.hashCode(new Object[]{this.w})) * 31) + this.x.hashCode()) * 31) + Arrays.hashCode(new Object[]{this.y})) * 31;
        int hashCode13 = Arrays.hashCode(new Object[]{this.I});
        int hashCode14 = Arrays.hashCode(new Object[]{this.J});
        int hashCode15 = Arrays.hashCode(new Object[]{this.K});
        int hashCode16 = Arrays.hashCode(new Object[]{this.L});
        int hashCode17 = Arrays.hashCode(new Object[]{this.M});
        synchronized (this.P) {
            i = ((((((((((hashCode12 + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + this.N;
        }
        return (((i * 31) + Arrays.hashCode(this.D)) * 31) + this.E;
    }

    public final boolean i() {
        return this.y != null;
    }

    public final int j() {
        int i;
        synchronized (this.P) {
            i = this.N;
        }
        return i;
    }

    public final alxo k(alxo alxoVar) {
        alxl[] alxlVarArr = this.o;
        int length = alxlVarArr.length;
        alxl[] alxlVarArr2 = alxoVar.o;
        int length2 = alxlVarArr2.length;
        if (length >= length2) {
            return this;
        }
        int i = length2 - length;
        int[] iArr = new int[i];
        alxm alxmVar = new alxm(i);
        for (int i2 = 0; i2 <= length; i2++) {
            iArr[0] = i2;
            if (i > 1) {
                for (int i3 = i2; i3 <= length; i3++) {
                    iArr[1] = i3;
                    if (i > 2) {
                        for (int i4 = i3; i4 <= length; i4++) {
                            iArr[2] = i4;
                            if (i > 3) {
                                for (int i5 = i4; i5 <= length; i5++) {
                                    iArr[3] = i5;
                                    n(iArr, alxlVarArr, alxlVarArr2, alxmVar);
                                }
                            } else {
                                n(iArr, alxlVarArr, alxlVarArr2, alxmVar);
                            }
                        }
                    } else {
                        n(iArr, alxlVarArr, alxlVarArr2, alxmVar);
                    }
                }
            } else {
                n(iArr, alxlVarArr, alxlVarArr2, alxmVar);
            }
        }
        if (alxmVar.b != Integer.MAX_VALUE) {
            alxl[] alxlVarArr3 = new alxl[length2];
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 <= length; i8++) {
                while (true) {
                    int[] iArr2 = alxmVar.a;
                    if (i7 >= iArr2.length || iArr2[i7] != i8) {
                        break;
                    }
                    alxl alxlVar = alxlVarArr2[i6];
                    alxlVarArr3[i6] = new alxl(alxlVar.a, alxlVar.b, 0.0f, a, alxlVar.g, amgj.a, 0.0f, 0.0f, amgj.a, amgj.a);
                    i6++;
                    i7++;
                }
                if (i8 < length) {
                    alxlVarArr3[i6] = alxlVarArr[i8];
                    i6++;
                }
            }
            alxn a2 = a();
            a2.l = alxlVarArr3;
            return a2.a();
        }
        throw new IllegalStateException("Couldn't find best insertion indices");
    }

    public alxo(alxn alxnVar) {
        this.P = new Object();
        this.d = alxnVar.a;
        this.e = alxnVar.b;
        this.f = alxnVar.c;
        this.g = alxnVar.d;
        this.h = alxnVar.e;
        this.i = alxnVar.f;
        this.j = alxnVar.g;
        this.k = alxnVar.h;
        this.l = alxnVar.i;
        this.m = alxnVar.j;
        this.n = alxnVar.k;
        this.o = alxnVar.l;
        this.p = alxnVar.m;
        this.q = alxnVar.n;
        this.r = alxnVar.o;
        this.s = alxnVar.p;
        this.A = alxnVar.q;
        this.B = alxnVar.r;
        this.C = alxnVar.s;
        this.N = alxnVar.t;
        this.D = alxnVar.u;
        this.E = alxnVar.v;
        this.F = alxnVar.w;
        this.O = alxnVar.x;
        this.G = alxnVar.y;
        this.H = alxnVar.z;
        this.I = alxnVar.A;
        this.J = alxnVar.B;
        this.K = alxnVar.C;
        this.L = alxnVar.D;
        this.M = alxnVar.E;
        this.t = alxnVar.F;
        this.u = alxnVar.G;
        this.v = alxnVar.H;
        this.w = alxnVar.I;
        this.x = alxnVar.J;
        this.y = alxnVar.K;
        this.z = alxnVar.L;
    }
}
