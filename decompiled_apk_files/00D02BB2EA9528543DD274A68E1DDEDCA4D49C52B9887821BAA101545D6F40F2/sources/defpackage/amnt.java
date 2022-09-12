package defpackage;

import android.opengl.GLES20;
/* compiled from: PG */
/* renamed from: amnt  reason: default package */
/* loaded from: classes.dex */
public final class amnt extends bnuv {
    public boolean a;
    public float b;
    public float c;
    public float d;
    private float e;
    private final float f;
    private final amxe g;
    private float h;
    private boolean i;
    private final float[] j;
    @dzsi
    private final aqzx k;
    private final float n;

    public amnt(float f, amxe amxeVar, @dzsi aqzx aqzxVar) {
        super(amns.class);
        this.a = false;
        this.e = -3.4028235E38f;
        this.b = 1.0f;
        this.c = 1.0f;
        this.h = 0.0f;
        this.d = 1.0f;
        this.i = false;
        this.j = new float[16];
        this.n = Float.MAX_VALUE;
        this.f = (float) Math.pow(2.0d, 22.0f - f);
        this.g = amxeVar;
        this.k = aqzxVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bnuv
    public final void a(bntb bntbVar, bnsa bnsaVar, bnrr bnrrVar, float[] fArr, float[] fArr2, float[] fArr3) {
        bntv bntvVar;
        int i;
        super.a(bntbVar, this.g, bnrrVar, fArr, fArr2, fArr3);
        amns amnsVar = (amns) this.l;
        dbsk.s(amnsVar);
        aqzx aqzxVar = this.k;
        if (aqzxVar != null) {
            this.e = aqzxVar.a();
        }
        bntb.T(amnsVar.g, fArr);
        bntb.T(amnsVar.h, fArr2);
        GLES20.glUniform2f(amnsVar.u, -3.4028235E38f, Float.MAX_VALUE);
        GLES20.glUniform1f(amnsVar.v, this.e);
        amxe amxeVar = this.g;
        amxd amxdVar = amxeVar.b.get(amxeVar.c);
        for (int i2 = 0; i2 < 8; i2++) {
            float[] fArr4 = amxdVar.b;
            if (i2 >= 8) {
                break;
            }
            this.j[i2 + i2] = fArr4[i2];
        }
        GLES20.glUniform2fv(amnsVar.i, 8, this.j, 0);
        GLES20.glUniform1f(amnsVar.j, this.b);
        float f = fArr[0];
        GLES20.glUniform1f(amnsVar.k, 5.3687091E8f * f);
        GLES20.glUniform1f(amnsVar.l, f * 1.07374182E9f);
        float f2 = 1.0f;
        GLES20.glUniform1f(amnsVar.n, 1.0f);
        GLES20.glUniform1i(amnsVar.m, this.i ? 1 : 0);
        GLES20.glUniform1f(amnsVar.o, this.h);
        GLES20.glUniform1f(amnsVar.p, this.d);
        int i3 = amnsVar.q;
        bnvl D = this.g.D(3);
        if (D != null && (bntvVar = D.b) != null && (i = bntvVar.g) > 0) {
            f2 = bntvVar.f / i;
        }
        GLES20.glUniform1f(i3, f2);
        GLES20.glUniform1i(amnsVar.r, this.g.c);
        GLES20.glUniform1f(amnsVar.s, amxdVar.c);
        GLES20.glUniform1f(amnsVar.t, amxdVar.d);
    }

    public final void b(float f, float f2, boolean z) {
        double d = f;
        Double.isNaN(d);
        double d2 = f2;
        Double.isNaN(d2);
        double floor = (Math.floor(d / 0.25d) * 0.25d) - d2;
        if (!this.a) {
            this.b = this.c * this.f * ((float) Math.pow(2.0d, -floor));
        }
        this.h = f;
        this.i = z;
    }
}
