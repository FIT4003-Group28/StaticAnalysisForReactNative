package defpackage;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abtk  reason: default package */
/* loaded from: classes.dex */
public final class abtk {
    private final abtm a;
    private final abtm b;
    private final int c;
    private final Map d;
    private final Map e;

    public abtk(abtl abtlVar) {
        abtm abtmVar = new abtm(abtlVar.a, 35633);
        abtm abtmVar2 = new abtm(abtlVar.b, 35632);
        this.d = new HashMap();
        this.e = new HashMap();
        this.a = abtmVar;
        this.b = abtmVar2;
        int glCreateProgram = GLES20.glCreateProgram();
        this.c = glCreateProgram;
        aqxo.y(glCreateProgram != 0);
        GLES20.glAttachShader(glCreateProgram, abtmVar.a);
        GLES20.glAttachShader(glCreateProgram, abtmVar2.a);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            return;
        }
        GLES20.glDeleteProgram(glCreateProgram);
        throw new abtn("Program link failed");
    }

    public static final void g(int i, int i2) {
        GLES20.glActiveTexture(33984);
        abse.b("glActiveTexture");
        GLES20.glBindTexture(i, i2);
        abse.b("glBindTexture");
    }

    public static final void h() {
        GLES20.glBindTexture(36197, 0);
        abse.b("glBindTexture");
        GLES20.glUseProgram(0);
        abse.b("glUseProgram");
    }

    private final int i(String str) {
        if (this.e.containsKey(str)) {
            return ((Integer) this.e.get(str)).intValue();
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.c, str);
        abse.c(glGetAttribLocation, str);
        abse.b("glGetAttribLocation");
        this.e.put(str, Integer.valueOf(glGetAttribLocation));
        return glGetAttribLocation;
    }

    private final int j(String str) {
        if (this.d.containsKey(str)) {
            return ((Integer) this.d.get(str)).intValue();
        }
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.c, str);
        abse.c(glGetUniformLocation, str);
        abse.b("glGetUniformLocation");
        this.d.put(str, Integer.valueOf(glGetUniformLocation));
        return glGetUniformLocation;
    }

    public final void a(int i, int i2) {
        GLES20.glUseProgram(this.c);
        abse.b("glUseProgram");
        GLES20.glBindTexture(i, i2);
        abse.b("glBindTexture");
    }

    public final void b(String str) {
        GLES20.glDisableVertexAttribArray(i(str));
        abse.b("glDisableVertexAttribArray");
    }

    public final void c(String str, FloatBuffer floatBuffer) {
        int i = i(str);
        GLES20.glEnableVertexAttribArray(i);
        abse.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(i, 2, 5126, false, 8, (Buffer) floatBuffer);
        abse.b("glVertexAttribPointer");
    }

    public final void d() {
        GLES20.glDeleteProgram(this.c);
        this.a.a();
        this.b.a();
    }

    public final void e(String str, float f) {
        GLES20.glUniform1f(j(str), f);
    }

    public final void f(String str, float[] fArr) {
        GLES20.glUniformMatrix4fv(j(str), 1, false, fArr, 0);
    }
}
