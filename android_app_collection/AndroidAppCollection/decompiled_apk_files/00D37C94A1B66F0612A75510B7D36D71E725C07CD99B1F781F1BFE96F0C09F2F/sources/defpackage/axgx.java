package defpackage;

import android.opengl.GLES20;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axgx  reason: default package */
/* loaded from: classes2.dex */
public final class axgx implements baob {
    private static final float[] d = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public final axgt a = new axgt();
    public final baoz b;
    public volatile boolean c;

    public axgx() {
        baoz baozVar = new baoz();
        this.b = baozVar;
        baozVar.b();
    }

    @Override // defpackage.baob
    public final void a(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        axgt axgtVar = this.a;
        float[] fArr2 = d;
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        axgtVar.a(i2, i3);
        baob baobVar = axgtVar.b;
        banh banhVar = axgtVar.a;
        baobVar.a(i, fArr2, i2, i3, 0, 0, banhVar.c, banhVar.d);
        GLES20.glBindFramebuffer(36160, iArr[0]);
    }

    @Override // defpackage.baob
    public final void b(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        axgt axgtVar = this.a;
        float[] fArr2 = d;
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        axgtVar.a(i2, i3);
        baob baobVar = axgtVar.b;
        banh banhVar = axgtVar.a;
        baobVar.b(i, fArr2, i2, i3, 0, 0, banhVar.c, banhVar.d);
        GLES20.glBindFramebuffer(36160, iArr[0]);
    }

    @Override // defpackage.baob
    public final void c() {
        this.b.a();
        axgt axgtVar = this.a;
        axgtVar.a.a();
        baob baobVar = axgtVar.b;
        if (baobVar != null) {
            baobVar.c();
        }
        this.b.b();
    }
}
