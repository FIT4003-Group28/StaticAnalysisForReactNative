package defpackage;

import com.google.android.filament.MaterialInstance;
import com.google.android.filament.TextureSampler;
import com.google.ar.sceneform.rendering.MaterialParameters;
import com.google.ar.sceneform.rendering.Texture;
import com.google.ar.sceneform.rendering.TextureInternalData;
/* compiled from: PG */
/* renamed from: dbgr  reason: default package */
/* loaded from: classes5.dex */
public final class dbgr extends dbgq {
    final Texture a;

    public dbgr(String str, Texture texture) {
        this.e = str;
        this.a = texture;
    }

    @Override // defpackage.dbgq
    public final void a(MaterialInstance materialInstance) {
        String str = this.e;
        TextureInternalData textureInternalData = this.a.b;
        dbjb.c(textureInternalData);
        com.google.android.filament.Texture texture = textureInternalData.a;
        if (texture != null) {
            TextureInternalData textureInternalData2 = this.a.b;
            dbjb.c(textureInternalData2);
            Texture.Sampler sampler = textureInternalData2.b;
            TextureSampler textureSampler = new TextureSampler();
            Texture.Sampler.WrapMode wrapMode = Texture.Sampler.WrapMode.CLAMP_TO_EDGE;
            Texture.Sampler.MagFilter magFilter = Texture.Sampler.MagFilter.NEAREST;
            Texture.Sampler.MinFilter minFilter = Texture.Sampler.MinFilter.NEAREST;
            int ordinal = sampler.a.ordinal();
            if (ordinal == 0) {
                textureSampler.setMinFilter(TextureSampler.MinFilter.NEAREST);
            } else if (ordinal == 1) {
                textureSampler.setMinFilter(TextureSampler.MinFilter.LINEAR);
            } else if (ordinal == 2) {
                textureSampler.setMinFilter(TextureSampler.MinFilter.NEAREST_MIPMAP_NEAREST);
            } else if (ordinal == 3) {
                textureSampler.setMinFilter(TextureSampler.MinFilter.LINEAR_MIPMAP_NEAREST);
            } else if (ordinal == 4) {
                textureSampler.setMinFilter(TextureSampler.MinFilter.NEAREST_MIPMAP_LINEAR);
            } else if (ordinal == 5) {
                textureSampler.setMinFilter(TextureSampler.MinFilter.LINEAR_MIPMAP_LINEAR);
            } else {
                throw new IllegalArgumentException("Invalid MinFilter");
            }
            int ordinal2 = sampler.b.ordinal();
            if (ordinal2 == 0) {
                textureSampler.setMagFilter(TextureSampler.MagFilter.NEAREST);
            } else if (ordinal2 == 1) {
                textureSampler.setMagFilter(TextureSampler.MagFilter.LINEAR);
            } else {
                throw new IllegalArgumentException("Invalid MagFilter");
            }
            textureSampler.setWrapModeS(MaterialParameters.b(sampler.c));
            textureSampler.setWrapModeT(MaterialParameters.b(sampler.d));
            textureSampler.setWrapModeR(MaterialParameters.b(sampler.e));
            materialInstance.setParameter(str, texture, textureSampler);
            return;
        }
        throw new IllegalStateException("Filament Texture is null.");
    }

    @Override // defpackage.dbgq
    public final dbgq b() {
        return new dbgr(this.e, this.a);
    }

    @Override // defpackage.dbgq
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }
}
