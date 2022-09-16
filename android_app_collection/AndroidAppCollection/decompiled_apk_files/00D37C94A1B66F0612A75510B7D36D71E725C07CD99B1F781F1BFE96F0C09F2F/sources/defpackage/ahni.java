package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
/* compiled from: PG */
/* renamed from: ahni  reason: default package */
/* loaded from: classes.dex */
public class ahni extends ahjj {
    public Bitmap i;
    public boolean j;
    public float k;
    private final azqb m;
    private final int[] n;
    private boolean o;

    public ahni(Bitmap bitmap, ahon ahonVar, ahoo ahooVar, azqb azqbVar) {
        super(ahonVar, ahooVar, azqbVar);
        this.i = bitmap;
        this.m = azqbVar;
        int[] iArr = new int[1];
        this.n = iArr;
        this.k = 1.0f;
        this.j = true;
        GLES20.glGenTextures(1, iArr, 0);
        ahom.g(iArr[0]);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, this.i, 0);
    }

    public final void g() {
        this.o = true;
    }

    @Override // defpackage.ahjj
    protected final boolean p() {
        return true;
    }

    @Override // defpackage.ahjj
    public final void q() {
        if (this.i == null || this.n[0] == 0) {
            return;
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBlendFunc(770, 771);
        GLES20.glUniform1f(((ahrx) this.m.get()).i, this.k);
        GLES20.glBindTexture(3553, this.n[0]);
        if (this.o) {
            if (this.j) {
                GLUtils.texImage2D(3553, 0, this.i, 0);
            } else {
                GLUtils.texSubImage2D(3553, 0, 0, 0, this.i);
            }
            this.o = false;
        }
        Boolean bool = ahom.a;
        this.f.e.a(((ahrx) this.m.get()).h);
    }
}
