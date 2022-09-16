package defpackage;

import android.opengl.GLES20;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahry  reason: default package */
/* loaded from: classes.dex */
public final class ahry {
    private final boolean a;
    private final int b;
    private final int c;
    private final int d;

    public ahry(ahrp ahrpVar, boolean z) {
        int i;
        this.a = z;
        if (z) {
            this.b = ahrpVar.f("uNoiseOffset");
            this.c = ahrpVar.f("uNoiseScale");
            i = ahrpVar.f("uNoiseSeed");
        } else {
            i = -1;
            this.b = -1;
            this.c = -1;
        }
        this.d = i;
    }

    public static String a(ahrz ahrzVar, boolean z) {
        String str = true != z ? "" : "#define ENABLE_WHITE_NOISE\n";
        String a = ahrzVar.a(R.raw.gl_white_noise_program_ext_frag);
        return a.length() != 0 ? str.concat(a) : new String(str);
    }

    public final void b(float f, float f2, float f3) {
        if (this.a) {
            GLES20.glUniform1f(this.b, f3);
            GLES20.glUniform1f(this.c, f2);
            GLES20.glUniform1f(this.d, f);
            Boolean bool = ahom.a;
        }
    }
}
