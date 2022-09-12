package defpackage;

import android.graphics.Color;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: alxl  reason: default package */
/* loaded from: classes.dex */
public final class alxl {
    public final int a;
    public final int b;
    public final float c;
    public final int[] d;
    public final int e;
    public final int f;
    public final float g;
    public amgj h;
    public amgj i;
    public amgj j;
    public final float k;
    public final float l;
    private static final int[] n = new int[0];
    public static final alxl m = new alxl(0, 1.0f, new int[0], 0.0f);

    public alxl(int i, float f, int[] iArr, float f2) {
        this(i, i, f, iArr, f2, amgj.a, 0.0f, 0.0f, amgj.a, amgj.a);
    }

    public static alxl a(dmvh dmvhVar, @dzsi dmue dmueVar) {
        amgj amgjVar;
        amgj amgjVar2;
        int d = (!dmvhVar.o() || dmvhVar.e()) ? dmvhVar.d() : -1;
        float e = alww.e(dmvhVar.h());
        int[] iArr = n;
        if (dmvhVar.k() > 0) {
            iArr = new int[dmvhVar.k()];
            for (int i = 0; i < dmvhVar.k(); i++) {
                iArr[i] = dmvhVar.l(i);
            }
        }
        int[] iArr2 = iArr;
        float e2 = alww.e(dmvhVar.m());
        amgj amgjVar3 = amgj.a;
        amgj amgjVar4 = amgj.a;
        amgj amgjVar5 = amgj.a;
        if (dmvhVar.o()) {
            amgjVar3 = amgj.c(dmvhVar.n(), amgk.WRAP_T);
        }
        amgj amgjVar6 = amgjVar3;
        if (dmvhVar.q()) {
            dmuf p = dmvhVar.p();
            amgjVar = amgj.c(alyp.a(p.d(), p.f(), p.e(), dmueVar), amgk.NO_WRAP);
        } else {
            amgjVar = amgjVar4;
        }
        if (dmvhVar.s()) {
            dmuf r = dmvhVar.r();
            amgjVar2 = amgj.c(alyp.a(r.d(), r.f(), r.e(), dmueVar), amgk.NO_WRAP);
        } else {
            amgjVar2 = amgjVar5;
        }
        return new alxl(d, dmvhVar.g() ? dmvhVar.f() : d, e, iArr2, e2, amgjVar6, 0.0f, 0.0f, amgjVar, amgjVar2);
    }

    public static alxl d(dmsl dmslVar) {
        amgj amgjVar;
        amgj amgjVar2;
        int i = dmslVar.a;
        int i2 = ((i & 32) == 0 || (i & 1) != 0) ? dmslVar.b : -1;
        float e = alww.e(dmslVar.d);
        int[] iArr = n;
        if (dmslVar.e.size() > 0) {
            iArr = new int[dmslVar.e.size()];
            for (int i3 = 0; i3 < dmslVar.e.size(); i3++) {
                iArr[i3] = dmslVar.e.f(i3);
            }
        }
        int[] iArr2 = iArr;
        float e2 = alww.e(dmslVar.f);
        float e3 = alww.e(dmslVar.h);
        float e4 = alww.e(dmslVar.i);
        amgj amgjVar3 = amgj.a;
        amgj amgjVar4 = amgj.a;
        amgj amgjVar5 = amgj.a;
        if ((dmslVar.a & 32) != 0) {
            amgjVar3 = amgj.c(dmslVar.g, amgk.WRAP_T);
        }
        amgj amgjVar6 = amgjVar3;
        if ((dmslVar.a & 512) != 0) {
            dmnt dmntVar = dmslVar.j;
            if (dmntVar == null) {
                dmntVar = dmnt.d;
            }
            String str = dmntVar.b;
            int i4 = dmntVar.a;
            int i5 = dmntVar.c;
            int i6 = alyp.a;
            amgjVar = amgj.c(str, amgk.NO_WRAP);
        } else {
            amgjVar = amgjVar4;
        }
        if ((dmslVar.a & 1024) != 0) {
            dmnt dmntVar2 = dmslVar.k;
            if (dmntVar2 == null) {
                dmntVar2 = dmnt.d;
            }
            String str2 = dmntVar2.b;
            int i7 = dmntVar2.a;
            int i8 = dmntVar2.c;
            int i9 = alyp.a;
            amgjVar2 = amgj.c(str2, amgk.NO_WRAP);
        } else {
            amgjVar2 = amgjVar5;
        }
        return new alxl(i2, (dmslVar.a & 2) != 0 ? dmslVar.c : i2, e, iArr2, e2, amgjVar6, e3, e4, amgjVar, amgjVar2);
    }

    public final boolean b() {
        int[] iArr = this.d;
        return iArr != null && iArr.length > 0;
    }

    public final boolean c() {
        if (this.c > 0.0f) {
            return Color.alpha(this.a) > 0 || Color.alpha(this.b) > 0 || !this.h.d() || !this.i.d() || !this.j.d();
        }
        return false;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof alxl)) {
            return false;
        }
        alxl alxlVar = (alxl) obj;
        return this.a == alxlVar.a && this.b == alxlVar.b && Arrays.equals(this.d, alxlVar.d) && Float.floatToIntBits(this.g) == Float.floatToIntBits(alxlVar.g) && this.i.equals(alxlVar.i) && this.j.equals(alxlVar.j) && this.h.equals(alxlVar.h) && Float.floatToIntBits(this.c) == Float.floatToIntBits(alxlVar.c);
    }

    public final int hashCode() {
        return ((((((((this.a + 31) * 31) + this.b) * 31) + Arrays.hashCode(this.d)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stroke{");
        sb.append("color=");
        sb.append(Integer.toHexString(this.a));
        if (this.a != this.b) {
            sb.append(", endColor=");
            sb.append(Integer.toHexString(this.b));
        }
        sb.append(", width=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.g);
        sb.append(", dashes=");
        sb.append(Arrays.toString(this.d));
        if (!this.h.d()) {
            sb.append(", stampTextureKey=");
            sb.append(this.h);
        }
        if (!this.i.d()) {
            sb.append(", startCapMaskTextureKey=");
            sb.append(this.i);
        }
        if (!this.j.d()) {
            sb.append(", endCapMaskTextureKey=");
            sb.append(this.j);
        }
        sb.append("}");
        return sb.toString();
    }

    public alxl(int i, int i2, float f, int[] iArr, float f2, amgj amgjVar, float f3, float f4, amgj amgjVar2, amgj amgjVar3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = iArr;
        this.g = f2;
        this.k = f3;
        this.l = f4;
        this.h = amgjVar;
        this.i = amgjVar2;
        this.j = amgjVar3;
        int i3 = 0;
        int i4 = 1;
        if (iArr != null && iArr.length != 0) {
            int i5 = 0;
            for (int i6 : iArr) {
                i5 = i5 == 0 ? i6 : i5;
                if (i6 > 0) {
                    i5 = bvop.e(i5, i6);
                }
            }
            if (i5 != 0) {
                i4 = i5;
            }
        }
        this.f = i4;
        if (iArr != null) {
            int length = iArr.length;
            int i7 = 0;
            while (i3 < length) {
                i7 += iArr[i3];
                i3++;
            }
            i3 = i7;
        }
        this.e = i3;
    }
}
