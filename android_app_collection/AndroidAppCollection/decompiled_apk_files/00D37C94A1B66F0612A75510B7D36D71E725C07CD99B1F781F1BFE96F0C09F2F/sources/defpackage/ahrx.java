package defpackage;

import android.opengl.GLES20;
/* compiled from: PG */
/* renamed from: ahrx  reason: default package */
/* loaded from: classes.dex */
public class ahrx extends ahrk {
    public final int h;
    public final int i;

    public ahrx(String str, String str2) {
        super(str, str2);
        this.h = e("aTextureCoords");
        this.i = f("uBrightness");
    }

    @Override // defpackage.ahrk
    public final void c(ahon ahonVar) {
        ahonVar.e.a(this.h);
        super.c(ahonVar);
    }

    @Override // defpackage.ahrk
    public final void d() {
        super.d();
        GLES20.glEnableVertexAttribArray(this.h);
        Boolean bool = ahom.a;
    }

    @Override // defpackage.ahrk
    public final void k() {
        super.k();
        GLES20.glDisableVertexAttribArray(this.h);
        Boolean bool = ahom.a;
    }
}
