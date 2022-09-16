package defpackage;

import android.opengl.GLES20;
import org.webrtc.Logging;
/* compiled from: PG */
/* renamed from: bang  reason: default package */
/* loaded from: classes2.dex */
public final class bang {
    public int a;

    public bang() {
    }

    public bang(String str) {
        int e = e(35633, "varying vec2 tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n}\n");
        int e2 = e(35632, str);
        int glCreateProgram = GLES20.glCreateProgram();
        this.a = glCreateProgram;
        if (glCreateProgram == 0) {
            int glGetError = GLES20.glGetError();
            StringBuilder sb = new StringBuilder(51);
            sb.append("glCreateProgram() failed. GLES20 error: ");
            sb.append(glGetError);
            throw new RuntimeException(sb.toString());
        }
        GLES20.glAttachShader(glCreateProgram, e);
        GLES20.glAttachShader(this.a, e2);
        GLES20.glLinkProgram(this.a);
        int[] iArr = {0};
        GLES20.glGetProgramiv(this.a, 35714, iArr, 0);
        if (iArr[0] != 1) {
            String valueOf = String.valueOf(GLES20.glGetProgramInfoLog(this.a));
            Logging.b("GlShader", valueOf.length() != 0 ? "Could not link program: ".concat(valueOf) : new String("Could not link program: "));
            throw new RuntimeException(GLES20.glGetProgramInfoLog(this.a));
        }
        GLES20.glDeleteShader(e);
        GLES20.glDeleteShader(e2);
        banl.d("Creating GlShader");
    }

    private static int e(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            int glGetError = GLES20.glGetError();
            StringBuilder sb = new StringBuilder(50);
            sb.append("glCreateShader() failed. GLES20 error: ");
            sb.append(glGetError);
            throw new RuntimeException(sb.toString());
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            StringBuilder sb2 = new StringBuilder(String.valueOf(glGetShaderInfoLog).length() + 26 + String.valueOf(str).length());
            sb2.append("Compile error ");
            sb2.append(glGetShaderInfoLog);
            sb2.append(" in shader:\n");
            sb2.append(str);
            Logging.b("GlShader", sb2.toString());
            throw new RuntimeException(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        banl.d("compileShader");
        return glCreateShader;
    }

    public final void c() {
        Logging.a("GlShader", "Deleting shader.");
        int i = this.a;
        if (i != -1) {
            GLES20.glDeleteProgram(i);
            this.a = -1;
        }
    }

    public final int a(String str) {
        int i = this.a;
        if (i == -1) {
            throw new RuntimeException("The program has been released");
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(i, str);
        if (glGetAttribLocation >= 0) {
            return glGetAttribLocation;
        }
        StringBuilder sb = new StringBuilder(str.length() + 30);
        sb.append("Could not locate '");
        sb.append(str);
        sb.append("' in program");
        throw new RuntimeException(sb.toString());
    }

    public final int b(String str) {
        int i = this.a;
        if (i == -1) {
            throw new RuntimeException("The program has been released");
        }
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, str);
        if (glGetUniformLocation >= 0) {
            return glGetUniformLocation;
        }
        StringBuilder sb = new StringBuilder(str.length() + 38);
        sb.append("Could not locate uniform '");
        sb.append(str);
        sb.append("' in program");
        throw new RuntimeException(sb.toString());
    }

    public final void d() {
        if (this.a == -1) {
            throw new RuntimeException("The program has been released");
        }
        synchronized (bams.b) {
            GLES20.glUseProgram(this.a);
        }
        banl.d("glUseProgram");
    }
}
