package defpackage;
/* compiled from: PG */
/* renamed from: ahru  reason: default package */
/* loaded from: classes.dex */
public final class ahru {
    int b = 0;
    public final float[] a = new float[10];

    public final void b(float f) {
        if (!Float.isNaN(f)) {
            int i = this.b;
            if (i == 10) {
                float[] fArr = this.a;
                System.arraycopy(fArr, 1, fArr, 0, 9);
                this.a[this.b - 1] = f;
                return;
            }
            float[] fArr2 = this.a;
            this.b = i + 1;
            fArr2[i] = f;
        }
    }

    public final void c() {
        this.b = 0;
    }

    public final float d(int i) {
        if (this.b <= i) {
            return Float.NaN;
        }
        return this.a[i];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.b; i++) {
            float f = this.a[i];
            StringBuilder sb2 = new StringBuilder(16);
            sb2.append(f);
            sb2.append(" ");
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    public final double a() {
        int i;
        double d;
        int i2;
        int i3 = this.b;
        double d2 = dcyn.a;
        if (i3 != 0) {
            int i4 = 0;
            if (i3 == 0) {
                d = 0.0d;
            } else {
                double d3 = 0.0d;
                int i5 = 0;
                while (true) {
                    i = this.b;
                    if (i5 >= i) {
                        break;
                    }
                    double d4 = this.a[i5];
                    Double.isNaN(d4);
                    d3 += d4;
                    i5++;
                }
                double d5 = i;
                Double.isNaN(d5);
                d = d3 / d5;
            }
            while (true) {
                i2 = this.b;
                if (i4 >= i2) {
                    break;
                }
                double d6 = this.a[i4];
                Double.isNaN(d6);
                double d7 = d6 - d;
                d2 += d7 * d7;
                i4++;
            }
            double d8 = i2;
            Double.isNaN(d8);
            d2 /= d8;
        }
        return Math.sqrt(d2);
    }
}
