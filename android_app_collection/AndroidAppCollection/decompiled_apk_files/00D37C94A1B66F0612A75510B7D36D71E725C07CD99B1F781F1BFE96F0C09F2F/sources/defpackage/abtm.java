package defpackage;

import android.opengl.GLES20;
/* compiled from: PG */
/* renamed from: abtm  reason: default package */
/* loaded from: classes.dex */
public final class abtm {
    public final int a;

    public abtm(int i) {
        this.a = i;
    }

    public abtm(String str, int i) {
        boolean z = true;
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i);
        this.a = glCreateShader;
        aqxo.y(glCreateShader == 0 ? false : z);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new abtn(glGetShaderInfoLog);
    }

    public final void a() {
        GLES20.glDeleteShader(this.a);
    }
}
