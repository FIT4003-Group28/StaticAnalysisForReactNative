package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
/* compiled from: PG */
/* renamed from: ahls  reason: default package */
/* loaded from: classes.dex */
public final class ahls extends ahnp {
    private final ahor a;
    private final ahon b;
    private final ahon c;
    private final azqb d;
    private final ahoo e;
    private final float[] f;
    private final int g;
    private float h;
    private ahot i;
    private float j;

    public ahls(ahon ahonVar, ahon ahonVar2, ahor ahorVar, int i, ahoo ahooVar, azqb azqbVar, ahot ahotVar) {
        this.b = ahonVar;
        this.c = ahonVar2;
        ahorVar.getClass();
        this.a = ahorVar;
        this.d = azqbVar;
        this.g = i;
        this.e = ahooVar;
        this.f = new float[16];
        this.h = 1.0f;
        this.i = ahotVar;
    }

    @Override // defpackage.ahnp
    public final void a(ahot ahotVar) {
        this.i = ahotVar;
    }

    @Override // defpackage.ahnp
    public final void c() {
    }

    @Override // defpackage.ahnp
    public final void d(float f) {
        this.h = 1.0f - f;
    }

    @Override // defpackage.ahmf
    public final void i() {
        this.b.b();
        ahon ahonVar = this.c;
        if (ahonVar != this.b) {
            ahonVar.b();
        }
    }

    @Override // defpackage.ahnp, defpackage.ahmf
    public final void m(ahjy ahjyVar) {
        if (this.i.a() && !this.i.b()) {
            this.j = (float) Math.random();
        }
        this.a.h();
    }

    @Override // defpackage.ahnp, defpackage.ahmf
    public final void n(float f, float f2, float f3) {
        this.e.f(f, f2, f3);
    }

    @Override // defpackage.ahnp, defpackage.ahmf
    public final boolean o(ahjy ahjyVar) {
        return false;
    }

    @Override // defpackage.ahmf
    public final void qQ(ahoh ahohVar) {
        Object obj = this.d.get();
        ahrp ahrpVar = (ahrp) obj;
        ahrpVar.j();
        int i = this.g;
        if (i != 1) {
            if (i != 2) {
                ahrw ahrwVar = (ahrw) obj;
                GLES20.glUniform2f(ahrwVar.e, 1.0f, 1.0f);
                GLES20.glUniform2f(ahrwVar.f, 0.0f, 0.0f);
            } else if (ahohVar.a() != 0 && ahohVar.a() != 1) {
                ahrw ahrwVar2 = (ahrw) obj;
                GLES20.glUniform2f(ahrwVar2.e, 0.5f, 1.0f);
                GLES20.glUniform2f(ahrwVar2.f, 0.5f, 0.0f);
            } else {
                ahrw ahrwVar3 = (ahrw) obj;
                GLES20.glUniform2f(ahrwVar3.e, 0.5f, 1.0f);
                GLES20.glUniform2f(ahrwVar3.f, 0.0f, 0.0f);
            }
        } else if (ahohVar.a() != 0 && ahohVar.a() != 1) {
            ahrw ahrwVar4 = (ahrw) obj;
            GLES20.glUniform2f(ahrwVar4.e, 1.0f, 0.5f);
            GLES20.glUniform2f(ahrwVar4.f, 0.0f, 0.0f);
        } else {
            ahrw ahrwVar5 = (ahrw) obj;
            GLES20.glUniform2f(ahrwVar5.e, 1.0f, 0.5f);
            GLES20.glUniform2f(ahrwVar5.f, 0.0f, 0.5f);
        }
        ahrk ahrkVar = (ahrk) obj;
        ahrkVar.d();
        ahrw ahrwVar6 = (ahrw) obj;
        GLES20.glUniformMatrix4fv(ahrwVar6.g, 1, false, this.a.i(), 0);
        this.a.f();
        ahrwVar6.b.e(this.a);
        float f = this.j;
        ahot ahotVar = this.i;
        ahrwVar6.d.b(f, ahotVar.a, ahotVar.b);
        Matrix.multiplyMM(this.f, 0, ahohVar.c, 0, this.e.a, 0);
        GLES20.glUniform1f(((ahrx) obj).i, this.h);
        GLES20.glUniform1f(ahrkVar.a, 1.0f);
        ahrkVar.l(this.f);
        ahrpVar.h();
        if (ahohVar.a() == 2) {
            ahrkVar.c(this.c);
        } else {
            ahrkVar.c(this.b);
        }
        ahrkVar.k();
        Boolean bool = ahom.a;
    }

    @Override // defpackage.ahnp, defpackage.ahmf
    public final void qR(boolean z, ahjy ahjyVar) {
    }
}
