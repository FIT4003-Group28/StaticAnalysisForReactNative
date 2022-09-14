package defpackage;

import android.opengl.GLES20;
import java.util.List;
/* compiled from: PG */
/* renamed from: amqb  reason: default package */
/* loaded from: classes.dex */
public final class amqb extends bnuv {
    protected float a;
    private final int[] b;
    private int c;

    public amqb() {
        super(amqa.class);
        this.b = new int[384];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bnuv
    public final void a(bntb bntbVar, bnsa bnsaVar, bnrr bnrrVar, float[] fArr, float[] fArr2, float[] fArr3) {
        super.a(bntbVar, bnsaVar, bnrrVar, fArr, fArr2, fArr3);
        amqa amqaVar = (amqa) this.l;
        dbsk.s(amqaVar);
        bntb.S(amqaVar.a, this.c * 3, this.b);
        GLES20.glUniform1f(amqaVar.b, this.a);
    }

    public final void b(List<amqj> list) {
        this.c = Math.min(list.size(), 64);
        int i = 0;
        for (int i2 = 0; i2 < this.c; i2++) {
            amqj amqjVar = list.get(i2);
            int i3 = amqjVar.a;
            int i4 = amqjVar.b;
            int i5 = amqjVar.c;
            boolean z = amqjVar.d;
            boolean z2 = amqjVar.e;
            int[] iArr = this.b;
            int i6 = i + 1;
            int i7 = 131072;
            iArr[i] = (i3 >>> 16) + (true != z ? 0 : 131072);
            int i8 = i6 + 1;
            iArr[i6] = (char) i3;
            int i9 = i8 + 1;
            int i10 = i4 >>> 16;
            if (true != z2) {
                i7 = 0;
            }
            iArr[i8] = i10 + i7;
            int i11 = i9 + 1;
            iArr[i9] = (char) i4;
            int i12 = i11 + 1;
            iArr[i11] = i5 >>> 16;
            i = i12 + 1;
            iArr[i12] = (char) i5;
        }
    }
}
