package defpackage;

import android.opengl.GLES20;
/* compiled from: PG */
/* renamed from: amnr  reason: default package */
/* loaded from: classes.dex */
public final class amnr extends bnuv {
    protected float a;
    public float b;
    protected final float c;
    public final float[] d;
    public final float e;
    public float f;
    public final float g;
    public final float h;
    public float i;
    public final float j;
    public float k;

    public amnr(int i, int i2, Class<? extends bnuu> cls, float f, float f2) {
        super(cls);
        this.d = new float[4];
        this.f = 1.0f;
        this.i = 1.0f;
        this.h = f;
        this.g = f2;
        float f3 = i;
        this.e = i2 / f3;
        float f4 = 1.0f / f3;
        this.c = f4;
        this.j = f4 * 4.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bnuv
    public final void a(bntb bntbVar, bnsa bnsaVar, bnrr bnrrVar, float[] fArr, float[] fArr2, float[] fArr3) {
        super.a(bntbVar, bnsaVar, bnrrVar, fArr, fArr2, fArr3);
        amnq amnqVar = (amnq) this.l;
        dbsk.s(amnqVar);
        GLES20.glUniform1f(amnqVar.b, this.a);
        GLES20.glUniform1f(amnqVar.d, this.i);
        GLES20.glUniform1f(amnqVar.e, this.c);
        GLES20.glUniform4fv(amnqVar.f, 1, this.d, 0);
        GLES20.glUniform1f(amnqVar.c, this.f);
        GLES20.glUniform1f(amnqVar.g, this.b);
        GLES20.glUniform1f(amnqVar.h, this.k);
    }

    public final void b(int i) {
        this.a = i;
    }
}
