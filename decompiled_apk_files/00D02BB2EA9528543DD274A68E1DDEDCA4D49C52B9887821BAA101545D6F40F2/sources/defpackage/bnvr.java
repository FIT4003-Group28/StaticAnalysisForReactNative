package defpackage;

import android.opengl.Matrix;
/* compiled from: PG */
/* renamed from: bnvr  reason: default package */
/* loaded from: classes.dex */
public final class bnvr {
    public final float[] a;
    public boolean b = true;

    public bnvr() {
        this.a = r0;
        float[] fArr = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public final void a() {
        this.b = false;
    }

    public final void b(bnvr bnvrVar, bnvr bnvrVar2) {
        if (this.b) {
            bnvrVar.f(bnvrVar2);
        } else if (bnvrVar2.b) {
            bnvrVar.f(this);
        } else {
            Matrix.multiplyMM(bnvrVar.a, 0, this.a, 0, bnvrVar2.a, 0);
            bnvrVar.b = false;
        }
    }

    public final void c(bnvs bnvsVar, float f) {
        float[] fArr = this.a;
        float[] fArr2 = bnvsVar.a;
        Matrix.rotateM(fArr, 0, f, fArr2[0], fArr2[1], fArr2[2]);
        this.b = false;
    }

    public final void d(float f) {
        Matrix.scaleM(this.a, 0, f, f, f);
        this.b = false;
    }

    public final void e(float f, float f2, float f3) {
        Matrix.scaleM(this.a, 0, f, f2, f3);
        this.b = false;
    }

    public final void f(bnvr bnvrVar) {
        System.arraycopy(bnvrVar.a, 0, this.a, 0, 16);
        this.b = bnvrVar.b;
    }

    public final void g() {
        Matrix.setIdentityM(this.a, 0);
        this.b = true;
    }

    public final void h(float f, float f2, float f3) {
        float[] fArr = this.a;
        fArr[12] = f;
        fArr[13] = f2;
        fArr[14] = f3;
        this.b = false;
    }

    public final void i(float f, float f2, float f3) {
        Matrix.translateM(this.a, 0, f, f2, f3);
        this.b = false;
    }

    public final String toString() {
        float[] fArr = this.a;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            float f = fArr[i];
            StringBuilder sb2 = new StringBuilder(17);
            sb2.append(f);
            sb2.append("  ");
            sb.append(sb2.toString());
            if (i % 4 == 3) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
