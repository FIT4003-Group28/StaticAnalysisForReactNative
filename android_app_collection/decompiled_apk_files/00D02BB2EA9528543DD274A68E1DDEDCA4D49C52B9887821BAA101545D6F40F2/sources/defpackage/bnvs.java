package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bnvs  reason: default package */
/* loaded from: classes.dex */
public final class bnvs {
    public final float[] a;

    public bnvs() {
        this.a = r0;
        float[] fArr = {0.0f, 0.0f, 0.0f};
    }

    public bnvs(float f, float f2, float f3) {
        this.a = r0;
        float[] fArr = {f, f2, f3};
    }

    public bnvs(bnvs bnvsVar) {
        this.a = r0;
        float[] fArr = bnvsVar.a;
        float[] fArr2 = {fArr[0], fArr[1], fArr[2]};
    }

    public final void a(float f, float f2, float f3) {
        float[] fArr = this.a;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
    }

    public final void b(bnvs bnvsVar) {
        float[] fArr = this.a;
        float[] fArr2 = bnvsVar.a;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
    }

    public final float c(bnvs bnvsVar) {
        float[] fArr = this.a;
        float f = fArr[0];
        float[] fArr2 = bnvsVar.a;
        return (f * fArr2[0]) + (fArr[1] * fArr2[1]) + (fArr[2] * fArr2[2]);
    }

    public final float d() {
        float[] fArr = this.a;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        return (float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
    }

    public final float e() {
        return this.a[0];
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnvs)) {
            return false;
        }
        return Arrays.equals(((bnvs) obj).a, this.a);
    }

    public final float f() {
        return this.a[1];
    }

    public final float g() {
        return this.a[2];
    }

    public final void h(bnvs bnvsVar) {
        float[] fArr = this.a;
        float f = fArr[0];
        float[] fArr2 = bnvsVar.a;
        fArr[0] = f + fArr2[0];
        fArr[1] = fArr[1] + fArr2[1];
        fArr[2] = fArr[2] + fArr2[2];
    }

    public final void i(float f, float f2, float f3) {
        float[] fArr = this.a;
        fArr[0] = Math.max(fArr[0], f);
        float[] fArr2 = this.a;
        fArr2[1] = Math.max(fArr2[1], f2);
        float[] fArr3 = this.a;
        fArr3[2] = Math.max(fArr3[2], f3);
    }

    public final void j(float f, float f2, float f3) {
        float[] fArr = this.a;
        fArr[0] = Math.min(fArr[0], f);
        float[] fArr2 = this.a;
        fArr2[1] = Math.min(fArr2[1], f2);
        float[] fArr3 = this.a;
        fArr3[2] = Math.min(fArr3[2], f3);
    }

    public final void k(float f) {
        float[] fArr = this.a;
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
    }

    public final void l(bnvs bnvsVar) {
        float[] fArr = this.a;
        float f = fArr[0];
        float[] fArr2 = bnvsVar.a;
        fArr[0] = f - fArr2[0];
        fArr[1] = fArr[1] - fArr2[1];
        fArr[2] = fArr[2] - fArr2[2];
    }

    public final String toString() {
        float[] fArr = this.a;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        StringBuilder sb = new StringBuilder(51);
        sb.append("[");
        sb.append(f);
        sb.append(", ");
        sb.append(f2);
        sb.append(", ");
        sb.append(f3);
        sb.append("]");
        return sb.toString();
    }
}
