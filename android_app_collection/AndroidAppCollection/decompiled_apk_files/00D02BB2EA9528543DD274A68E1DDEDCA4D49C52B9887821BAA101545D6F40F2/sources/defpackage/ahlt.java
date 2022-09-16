package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ahlt  reason: default package */
/* loaded from: classes2.dex */
public final class ahlt {
    private final float[] a;
    private final int[] b;

    private ahlt(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public static ahlt d() {
        return new ahlt(new float[3], new int[3]);
    }

    public final void a(float[] fArr) {
        int length = fArr.length;
        int length2 = this.a.length;
        if (length != length2) {
            StringBuilder sb = new StringBuilder(70);
            sb.append("invalid event values length: ");
            sb.append(length);
            sb.append(". Must have length ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.a.length; i++) {
            if (!Float.isNaN(fArr[i])) {
                float[] fArr2 = this.a;
                fArr2[i] = fArr2[i] + fArr[i];
                int[] iArr = this.b;
                iArr[i] = iArr[i] + 1;
            }
        }
    }

    public final float[] b() {
        float[] fArr = (float[]) this.a.clone();
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = fArr[i] / this.b[i];
        }
        return fArr;
    }

    public final void c() {
        Arrays.fill(this.a, 0.0f);
        Arrays.fill(this.b, 0);
    }
}
