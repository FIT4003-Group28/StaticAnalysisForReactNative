package defpackage;
/* compiled from: PG */
/* renamed from: amhx  reason: default package */
/* loaded from: classes2.dex */
public final class amhx {
    public static final aksd a = new aksd();
    public static final aksd b = new aksd();
    public final amhw[] c;

    private amhx(amhw[] amhwVarArr) {
        this.c = amhwVarArr;
    }

    public static amhx c(float f, float f2, float[] fArr, float f3) {
        int length = fArr.length - 1;
        amhw[] amhwVarArr = new amhw[length];
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            float f4 = fArr[i2] - fArr[i];
            amhwVarArr[i] = new amhw(f, f2, f4, f3);
            f += f4;
            i = i2;
        }
        return new amhx(amhwVarArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final amhw a(int i) {
        return this.c[i];
    }

    public final int b() {
        return this.c.length;
    }
}
