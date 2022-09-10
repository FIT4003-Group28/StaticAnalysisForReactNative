package defpackage;

import android.opengl.GLES20;
/* compiled from: PG */
/* renamed from: amnm  reason: default package */
/* loaded from: classes2.dex */
public final class amnm extends bnuv {
    public boolean a;
    @dzsi
    private final aqzx b;
    private float c;
    private float d;

    public amnm() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bnuv
    public final void a(bntb bntbVar, bnsa bnsaVar, bnrr bnrrVar, float[] fArr, float[] fArr2, float[] fArr3) {
        super.a(bntbVar, bnsaVar, bnrrVar, fArr, fArr2, fArr3);
        amnl amnlVar = (amnl) this.l;
        dbsk.s(amnlVar);
        bntb.T(amnlVar.a, fArr);
        bntb.T(amnlVar.b, fArr2);
        GLES20.glUniform1i(amnlVar.e, this.a ? 1 : 0);
        float f = fArr[0];
        GLES20.glUniform1f(amnlVar.c, 5.3687091E8f * f);
        GLES20.glUniform1f(amnlVar.d, f * 1.07374182E9f);
        aqzx aqzxVar = this.b;
        if (aqzxVar != null) {
            this.d = aqzxVar.a();
        }
        GLES20.glUniform2f(amnlVar.g, -3.4028235E38f, this.c);
        GLES20.glUniform1f(amnlVar.h, this.d);
    }

    public amnm(@dzsi aqzx aqzxVar) {
        super(amnl.class);
        this.a = false;
        this.c = Float.MAX_VALUE;
        this.d = -3.4028235E38f;
        this.b = aqzxVar;
    }
}
