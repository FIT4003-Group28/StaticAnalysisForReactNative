package defpackage;

import android.opengl.GLES20;
import android.view.animation.AnimationUtils;
/* compiled from: PG */
/* renamed from: amqg  reason: default package */
/* loaded from: classes.dex */
public final class amqg extends bnuv {
    public int a;
    public final bnso b;
    public final int[] c;

    public amqg() {
        super(amqf.class);
        this.b = new bnso(true);
        this.c = new int[8];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bnuv
    public final void a(bntb bntbVar, bnsa bnsaVar, bnrr bnrrVar, float[] fArr, float[] fArr2, float[] fArr3) {
        super.a(bntbVar, bnsaVar, bnrrVar, fArr, fArr2, fArr3);
        amqf amqfVar = (amqf) this.l;
        dbsk.s(amqfVar);
        bnvl D = bnsaVar.D(0);
        if (D != null) {
            bntb.L(amqfVar.a, D.d.a);
        }
        bntb.S(amqfVar.b, this.a, this.c);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (!this.b.b(currentAnimationTimeMillis)) {
            bntbVar.h = true;
        }
        GLES20.glUniform1f(amqfVar.c, this.b.a(currentAnimationTimeMillis));
        GLES20.glUniform1i(amqfVar.d, 0);
    }
}
