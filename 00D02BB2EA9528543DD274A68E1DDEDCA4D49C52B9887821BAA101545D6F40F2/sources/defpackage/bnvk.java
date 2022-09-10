package defpackage;

import android.opengl.GLES20;
/* compiled from: PG */
/* renamed from: bnvk  reason: default package */
/* loaded from: classes.dex */
public final class bnvk extends bnuv implements bnvp {
    public float a;
    private final float[] b;

    public bnvk() {
        super(bnvj.class);
        float[] fArr = new float[4];
        this.b = fArr;
        this.a = 0.0f;
        System.arraycopy(new float[]{1.0f, 1.0f, 1.0f, 1.0f}, 0, fArr, 0, 4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bnuv
    public final void a(bntb bntbVar, bnsa bnsaVar, bnrr bnrrVar, float[] fArr, float[] fArr2, float[] fArr3) {
        super.a(bntbVar, bnsaVar, bnrrVar, fArr, fArr2, fArr3);
        bnvj bnvjVar = (bnvj) this.l;
        dbsk.s(bnvjVar);
        GLES20.glUniform1i(bnvjVar.b, 0);
        GLES20.glUniform1f(bnvjVar.c, this.a);
        bnvl D = bnsaVar.D(0);
        if (D != null) {
            bntb.L(bnvjVar.a, D.d.a);
        }
        bntb.M(this.b);
    }

    public final void b(float f, float f2, float f3, float f4) {
        if (c()) {
            bnuq bnuqVar = bnuq.INVALID;
        }
        float[] fArr = this.b;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }

    @Override // defpackage.bnvp
    public final void f(float f) {
        if (c()) {
            bnuq bnuqVar = bnuq.INVALID;
        }
        float[] fArr = this.b;
        fArr[0] = 1.0f;
        fArr[1] = 1.0f;
        fArr[2] = 1.0f;
        fArr[3] = f;
    }
}
