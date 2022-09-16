package defpackage;

import android.opengl.GLES20;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahrl  reason: default package */
/* loaded from: classes.dex */
public final class ahrl extends ahrk {
    public final int b;

    public ahrl(ahrz ahrzVar) {
        super(ahrzVar.a(R.raw.gl_color_program_vert), ahrzVar.a(R.raw.gl_color_program_frag));
        this.b = e("aColor");
    }

    @Override // defpackage.ahrk
    public final void d() {
        super.d();
        GLES20.glEnableVertexAttribArray(this.b);
        Boolean bool = ahom.a;
    }

    @Override // defpackage.ahrk
    public final void k() {
        super.k();
        GLES20.glDisableVertexAttribArray(this.b);
        Boolean bool = ahom.a;
    }
}
