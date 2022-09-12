package defpackage;

import android.graphics.Color;
/* compiled from: PG */
/* renamed from: bnry  reason: default package */
/* loaded from: classes3.dex */
public final class bnry extends bnuv {
    private final float[] a;

    public bnry() {
        this(-1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bnuv
    public final void a(bntb bntbVar, bnsa bnsaVar, bnrr bnrrVar, float[] fArr, float[] fArr2, float[] fArr3) {
        super.a(bntbVar, bnsaVar, bnrrVar, fArr, fArr2, fArr3);
        bntb.M(this.a);
    }

    public bnry(int i) {
        super(bnrx.class);
        this.a = r0;
        float[] fArr = {Color.red(i) / 255.0f, Color.green(i) / 255.0f, Color.blue(i) / 255.0f, Color.alpha(i) / 255.0f};
    }
}
