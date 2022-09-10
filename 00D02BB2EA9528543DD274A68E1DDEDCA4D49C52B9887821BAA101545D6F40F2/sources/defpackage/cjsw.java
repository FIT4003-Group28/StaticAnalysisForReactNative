package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cjsw  reason: default package */
/* loaded from: classes.dex */
public final class cjsw {
    public int a;
    private final float b;
    private final float c;
    private final int d;
    private final boolean e;
    private float[] f;
    private int[] g;

    public cjsw(float f, float f2, int i) {
        this(f, f2, i, false);
    }

    public cjsw(float f, float f2, int i, boolean z) {
        this.e = z;
        if (z) {
            this.b = (float) Math.log(f);
            this.c = (float) Math.log(f2);
        } else {
            this.b = f;
            this.c = f2;
        }
        this.d = i;
        this.f = new float[i];
        this.g = null;
    }

    private final float c(float f, int i, float f2) {
        dbsk.b(i < this.d, "bucket must be smaller than numBuckets!");
        int i2 = i - 1;
        while (i2 >= 0 && this.g[i2] == 0) {
            i2--;
        }
        if (i2 < 0) {
            i2 = i;
        }
        int i3 = this.g[i];
        float f3 = this.b;
        float f4 = f3 + ((((i2 + 0.5f) + (((i - i2) * (f2 - f)) / i3)) * (this.c - f3)) / this.d);
        return this.e ? (float) Math.exp(f4) : f4;
    }

    public final void a(float f) {
        if (this.g == null) {
            int i = this.a;
            int i2 = this.d;
            if (i == i2) {
                this.g = new int[i2];
                this.a = 0;
                for (int i3 = 0; i3 < this.d; i3++) {
                    a(this.f[i3]);
                }
                this.f = null;
            }
        }
        if (this.g == null) {
            this.f[this.a] = f;
        } else {
            if (this.e) {
                f = (float) Math.log(Math.max(Float.MIN_NORMAL, f));
            }
            int i4 = this.d;
            float f2 = this.b;
            float f3 = this.c;
            int[] iArr = this.g;
            int max = Math.max(0, Math.min(i4 - 1, Math.round((i4 * (f - f2)) / (f3 - f2))));
            iArr[max] = iArr[max] + 1;
        }
        this.a++;
    }

    public final ddmg b() {
        double d;
        double d2;
        double d3;
        ddmf bZ = ddmg.f.bZ();
        int i = this.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddmg ddmgVar = (ddmg) bZ.b;
        ddmgVar.a |= 1;
        ddmgVar.b = i;
        int i2 = this.a;
        if (i2 == 0) {
            return bZ.bK();
        }
        float[] fArr = this.f;
        if (fArr != null) {
            Arrays.sort(fArr, 0, i2);
            float[] fArr2 = this.f;
            Double.isNaN(this.a);
            float f = fArr2[((int) Math.ceil(d * 0.5d)) - 1];
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddmg ddmgVar2 = (ddmg) bZ.b;
            ddmgVar2.a |= 2;
            ddmgVar2.c = f;
            float[] fArr3 = this.f;
            Double.isNaN(this.a);
            float f2 = fArr3[((int) Math.ceil(d2 * 0.75d)) - 1];
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddmg ddmgVar3 = (ddmg) bZ.b;
            ddmgVar3.a |= 4;
            ddmgVar3.d = f2;
            float[] fArr4 = this.f;
            Double.isNaN(this.a);
            float f3 = fArr4[((int) Math.ceil(d3 * 0.9d)) - 1];
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddmg ddmgVar4 = (ddmg) bZ.b;
            ddmgVar4.a |= 8;
            ddmgVar4.e = f3;
        } else {
            float f4 = i2 * 0.5f;
            float f5 = 0.0f;
            int i3 = 0;
            while (i3 < this.d) {
                float f6 = this.g[i3] + f5;
                if (f6 >= f4) {
                    break;
                }
                i3++;
                f5 = f6;
            }
            float c = c(f5, i3, f4);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddmg ddmgVar5 = (ddmg) bZ.b;
            ddmgVar5.a |= 2;
            ddmgVar5.c = c;
            float f7 = this.a * 0.75f;
            while (i3 < this.d) {
                float f8 = this.g[i3] + f5;
                if (f8 >= f7) {
                    break;
                }
                i3++;
                f5 = f8;
            }
            float c2 = c(f5, i3, f7);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddmg ddmgVar6 = (ddmg) bZ.b;
            ddmgVar6.a |= 4;
            ddmgVar6.d = c2;
            float f9 = this.a * 0.9f;
            while (i3 < this.d) {
                float f10 = this.g[i3] + f5;
                if (f10 >= f9) {
                    break;
                }
                i3++;
                f5 = f10;
            }
            float c3 = c(f5, i3, f9);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddmg ddmgVar7 = (ddmg) bZ.b;
            ddmgVar7.a |= 8;
            ddmgVar7.e = c3;
        }
        return bZ.bK();
    }

    public final String toString() {
        dbsb d = dbsc.d("QuantilesTracker");
        d.h("logScale", this.e);
        d.e("minValue", this.b);
        d.e("maxValue", this.c);
        d.b("values", Arrays.toString(this.f));
        d.b("counts", Arrays.toString(this.g));
        return d.toString();
    }
}
