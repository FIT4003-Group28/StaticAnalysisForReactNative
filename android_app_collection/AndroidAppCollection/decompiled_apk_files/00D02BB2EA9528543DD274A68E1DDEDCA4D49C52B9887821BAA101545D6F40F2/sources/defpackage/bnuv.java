package defpackage;

import android.opengl.GLES20;
/* compiled from: PG */
/* renamed from: bnuv  reason: default package */
/* loaded from: classes.dex */
public class bnuv {
    private int a = 0;
    @dzsi
    protected bnuu l;
    protected final Class<? extends bnuu> m;

    /* JADX INFO: Access modifiers changed from: protected */
    public bnuv(Class<? extends bnuu> cls) {
        this.m = cls;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(bntb bntbVar, bnsa bnsaVar, bnrr bnrrVar, float[] fArr, float[] fArr2, float[] fArr3) {
        bnuu bnuuVar = this.l;
        if (bnuuVar != null) {
            bntb.T(bnuuVar.x, fArr3);
        }
    }

    public final boolean c() {
        return this.a > 0;
    }

    public final void d(bntb bntbVar) {
        int i = this.a + 1;
        this.a = i;
        if (i == 1) {
            bnuu l = bntbVar.l(this.m);
            this.l = l;
            if (l.w != 0) {
                return;
            }
            l.w = bntbVar.k(l.c(), l.d(), l.b());
            int[] iArr = {0};
            GLES20.glGetIntegerv(35725, iArr, 0);
            bntbVar.h(l.w);
            l.a(bntbVar, l.w);
            bntbVar.h(iArr[0]);
        }
    }

    public final void e() {
        dbsk.l(this.a > 0);
        int i = this.a - 1;
        this.a = i;
        if (i == 0) {
            this.l = null;
        }
    }
}
