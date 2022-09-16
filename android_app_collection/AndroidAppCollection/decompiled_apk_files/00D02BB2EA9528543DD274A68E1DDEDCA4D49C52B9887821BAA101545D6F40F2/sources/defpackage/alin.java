package defpackage;
/* compiled from: PG */
/* renamed from: alin  reason: default package */
/* loaded from: classes.dex */
public final class alin {
    private float[] c = new float[0];
    public float[] a = i(16, new float[0]);
    private boolean d = false;
    public int b = 0;

    private static float[] i(int i, float[] fArr) {
        int length = fArr.length;
        int i2 = length >> 1;
        if (i2 < i) {
            int max = Math.max(i2 + i2, i);
            float[] fArr2 = new float[max + max];
            if (length == 0) {
                return fArr2;
            }
            System.arraycopy(fArr, 0, fArr2, 0, length);
            return fArr2;
        }
        return fArr;
    }

    private final void j() {
        if (this.d) {
            return;
        }
        int length = this.c.length;
        int i = this.b;
        if (length < i) {
            this.c = new float[i];
        }
        this.c[0] = 0.0f;
        for (int i2 = 1; i2 < this.b; i2++) {
            int i3 = i2 - 1;
            int i4 = i3 + i3;
            float[] fArr = this.a;
            float f = fArr[i4];
            float f2 = fArr[i4 + 1];
            float f3 = fArr[i4 + 2];
            float f4 = fArr[i4 + 3];
            float[] fArr2 = this.c;
            fArr2[i2] = fArr2[i3] + ((float) Math.hypot(f3 - f, f4 - f2));
        }
        this.d = true;
    }

    public final void a(int i) {
        this.a = i(i, this.a);
    }

    public final float b() {
        if (this.b < 2) {
            return 0.0f;
        }
        j();
        return this.c[this.b - 1];
    }

    public final float c(int i) {
        dbsk.z(i, this.b - 1);
        j();
        float[] fArr = this.c;
        return fArr[i + 1] - fArr[i];
    }

    public final void d() {
        this.d = false;
    }

    public final int e(float f, akse akseVar) {
        j();
        int i = this.b;
        int i2 = 0;
        while (i2 < i - 2) {
            int i3 = i2 + 1;
            if (this.c[i3] >= f) {
                break;
            }
            i2 = i3;
        }
        float[] fArr = this.c;
        float f2 = fArr[i2 + 1];
        float f3 = fArr[i2];
        float f4 = (f - f3) / (f2 - f3);
        int i4 = i2 + i2;
        float[] fArr2 = this.a;
        float f5 = fArr2[i4];
        float f6 = fArr2[i4 + 1];
        akseVar.r(((fArr2[i4 + 2] - f5) * f4) + f5, (f4 * (fArr2[i4 + 3] - f6)) + f6);
        return i2;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alin)) {
            return false;
        }
        alin alinVar = (alin) obj;
        if (this.b != alinVar.b) {
            return false;
        }
        int i = 0;
        while (true) {
            int i2 = this.b;
            if (i >= i2 + i2) {
                return true;
            }
            if (this.a[i] != alinVar.a[i]) {
                return false;
            }
            i++;
        }
    }

    public final void f(int i, akse akseVar) {
        dbsk.z(i, this.b - 1);
        int i2 = i + i;
        float[] fArr = this.a;
        akseVar.r(fArr[i2 + 2] - fArr[i2], fArr[i2 + 3] - fArr[i2 + 1]);
    }

    public final void g(int i, akse akseVar) {
        float[] fArr = this.a;
        int i2 = i + i;
        akseVar.r(fArr[i2], fArr[i2 + 1]);
    }

    public final void h(float f, akse akseVar) {
        int i = this.b;
        if (i < 2) {
            return;
        }
        if (f <= 0.0f) {
            g(0, akseVar);
        } else if (f >= 1.0f) {
            g(i - 1, akseVar);
        } else {
            e(f * b(), akseVar);
        }
    }

    public final int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            int i3 = this.b;
            if (i2 < i3 + i3) {
                int floatToIntBits = Float.floatToIntBits(this.a[i2]);
                i = (i * 31) + (floatToIntBits ^ (floatToIntBits >>> 16));
                i2++;
            } else {
                return i;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < this.b; i++) {
            float[] fArr = this.a;
            int i2 = i + i;
            float f = fArr[i2];
            float f2 = fArr[i2 + 1];
            sb.append("(");
            sb.append(f);
            sb.append(",");
            sb.append(f2);
            sb.append(")");
            if (i < this.b - 1) {
                sb.append(" ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
