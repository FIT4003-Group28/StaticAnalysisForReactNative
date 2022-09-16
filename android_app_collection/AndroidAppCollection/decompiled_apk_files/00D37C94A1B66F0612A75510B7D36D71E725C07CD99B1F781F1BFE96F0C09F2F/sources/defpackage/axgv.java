package defpackage;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
/* compiled from: PG */
/* renamed from: axgv  reason: default package */
/* loaded from: classes2.dex */
public final class axgv implements baob {
    private static final FloatBuffer a = banl.c(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer b = banl.c(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private final String c;
    private bang d;
    private int e;
    private int f;
    private int g;
    private int h;
    private final axgu i;

    public axgv(String str, axgu axguVar) {
        this.c = str;
        this.i = axguVar;
    }

    private final void d(int i, float[] fArr, int i2, int i3) {
        bang bangVar;
        if (i == this.h) {
            bangVar = this.d;
            bangVar.getClass();
        } else {
            this.h = 0;
            bang bangVar2 = this.d;
            if (bangVar2 != null) {
                bangVar2.c();
                this.d = null;
            }
            String str = this.c;
            StringBuilder sb = new StringBuilder();
            if (i == 1) {
                sb.append("#extension GL_OES_EGL_image_external : require\n");
            }
            String str2 = i == 1 ? "samplerExternalOES" : "sampler2D";
            sb.append("precision mediump float;\nvarying vec2 tc;\nuniform ");
            sb.append(str2);
            sb.append(" tex;\n");
            sb.append(str.replace("sample(", "texture2D(tex, "));
            bang bangVar3 = new bang(sb.toString());
            this.h = i;
            this.d = bangVar3;
            bangVar3.d();
            GLES20.glUniform1i(bangVar3.b("tex"), 0);
            banl.d("Create shader");
            axgu axguVar = this.i;
            axguVar.b = bangVar3.b("xUnit");
            axguVar.c = bangVar3.b("yUnit");
            if (axguVar.a > 2) {
                GLES20.glUniform1i(bangVar3.b("samplingFactor"), axguVar.a);
            }
            this.g = bangVar3.b("tex_mat");
            this.e = bangVar3.a("in_pos");
            this.f = bangVar3.a("in_tc");
            bangVar = bangVar3;
        }
        bangVar.d();
        GLES20.glEnableVertexAttribArray(this.e);
        GLES20.glVertexAttribPointer(this.e, 2, 5126, false, 0, (Buffer) a);
        GLES20.glEnableVertexAttribArray(this.f);
        GLES20.glVertexAttribPointer(this.f, 2, 5126, false, 0, (Buffer) b);
        GLES20.glUniformMatrix4fv(this.g, 1, false, fArr, 0);
        axgu axguVar2 = this.i;
        int i4 = axguVar2.a;
        float f = 1.0f / (i2 * i4);
        float f2 = 1.0f / (i4 * i3);
        GLES20.glUniform2f(axguVar2.b, fArr[0] * f, fArr[1] * f);
        GLES20.glUniform2f(axguVar2.c, fArr[4] * f2, fArr[5] * f2);
        banl.d("Prepare shader");
    }

    @Override // defpackage.baob
    public final void a(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        d(1, fArr, i6, i7);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glViewport(i4, i5, i6, i7);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(36197, 0);
    }

    @Override // defpackage.baob
    public final void b(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        d(2, fArr, i6, i7);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glViewport(i4, i5, i6, i7);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
    }

    @Override // defpackage.baob
    public final void c() {
        bang bangVar = this.d;
        if (bangVar != null) {
            bangVar.c();
            this.d = null;
            this.h = 0;
        }
    }
}
