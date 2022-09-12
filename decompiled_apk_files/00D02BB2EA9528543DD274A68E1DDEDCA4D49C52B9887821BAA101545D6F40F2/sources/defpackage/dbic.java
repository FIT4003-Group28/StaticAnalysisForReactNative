package defpackage;

import com.google.ar.sceneform.rendering.Texture;
/* compiled from: PG */
/* renamed from: dbic  reason: default package */
/* loaded from: classes5.dex */
public final class dbic {
    public Texture.Sampler.MinFilter a;
    public Texture.Sampler.MagFilter b;
    public Texture.Sampler.WrapMode c;
    public Texture.Sampler.WrapMode d;
    public Texture.Sampler.WrapMode e;

    public final Texture.Sampler a() {
        return new Texture.Sampler(this);
    }

    public final void b(Texture.Sampler.WrapMode wrapMode) {
        this.c = wrapMode;
        this.d = wrapMode;
        this.e = wrapMode;
    }
}
