package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahrv  reason: default package */
/* loaded from: classes.dex */
public final class ahrv extends ahrx {
    public final int b;
    public final int d;

    public ahrv(ahrz ahrzVar) {
        super(ahrzVar.a(R.raw.gl_streaming_texture_program_vert), ahrzVar.a(R.raw.gl_streaming_texture_program_frag));
        this.b = f("uTexMultiplier");
        this.d = f("uTexOffset");
    }
}
