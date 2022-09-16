package defpackage;

import android.opengl.GLES20;
/* compiled from: PG */
/* renamed from: ahrk  reason: default package */
/* loaded from: classes.dex */
public class ahrk extends ahrp {
    public final int a;
    private final int b;
    private final int d;

    public ahrk(String str, String str2) {
        super(str, str2);
        this.b = e("aPosition");
        this.d = f("uMVP");
        this.a = f("uOpacity");
    }

    public void c(ahon ahonVar) {
        ahonVar.d.a(this.b);
        GLES20.glDrawArrays(ahonVar.g, 0, ahonVar.f);
        Boolean bool = ahom.a;
    }

    public void d() {
        GLES20.glEnableVertexAttribArray(this.b);
        Boolean bool = ahom.a;
    }

    public void k() {
        GLES20.glDisableVertexAttribArray(this.b);
        Boolean bool = ahom.a;
    }

    public final void l(float[] fArr) {
        GLES20.glUniformMatrix4fv(this.d, 1, false, fArr, 0);
        Boolean bool = ahom.a;
    }
}
