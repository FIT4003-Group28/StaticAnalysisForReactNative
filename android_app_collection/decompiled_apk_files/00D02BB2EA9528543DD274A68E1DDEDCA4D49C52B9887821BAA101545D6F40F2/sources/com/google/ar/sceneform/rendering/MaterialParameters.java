package com.google.ar.sceneform.rendering;

import com.google.android.filament.MaterialInstance;
import com.google.android.filament.TextureSampler;
import com.google.ar.sceneform.rendering.Texture;
import java.util.HashMap;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class MaterialParameters {
    public final HashMap<String, dbgq> a = new HashMap<>();

    public static TextureSampler.WrapMode b(Texture.Sampler.WrapMode wrapMode) {
        Texture.Sampler.WrapMode wrapMode2 = Texture.Sampler.WrapMode.CLAMP_TO_EDGE;
        Texture.Sampler.MagFilter magFilter = Texture.Sampler.MagFilter.NEAREST;
        Texture.Sampler.MinFilter minFilter = Texture.Sampler.MinFilter.NEAREST;
        int ordinal = wrapMode.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return TextureSampler.WrapMode.REPEAT;
            }
            if (ordinal == 2) {
                return TextureSampler.WrapMode.MIRRORED_REPEAT;
            }
            throw new IllegalArgumentException("Invalid WrapMode");
        }
        return TextureSampler.WrapMode.CLAMP_TO_EDGE;
    }

    public final void a(MaterialInstance materialInstance) {
        com.google.android.filament.Material material = materialInstance.getMaterial();
        for (dbgq dbgqVar : this.a.values()) {
            if (material.hasParameter(dbgqVar.e)) {
                dbgqVar.a(materialInstance);
            }
        }
    }

    public void setBoolean(String str, boolean z) {
        this.a.put(str, new dbgg(str, z));
    }

    public void setBoolean2(String str, boolean z, boolean z2) {
        this.a.put(str, new dbgd(str, z, z2));
    }

    public void setBoolean3(String str, boolean z, boolean z2, boolean z3) {
        this.a.put(str, new dbge(str, z, z2, z3));
    }

    public void setBoolean4(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a.put(str, new dbgf(str, z, z2, z3, z4));
    }

    public void setFloat(String str, float f) {
        this.a.put(str, new dbgl(str, f));
    }

    public void setFloat2(String str, float f, float f2) {
        this.a.put(str, new dbgi(str, f, f2));
    }

    public void setFloat3(String str, float f, float f2, float f3) {
        this.a.put(str, new dbgj(str, f, f2, f3));
    }

    public void setFloat4(String str, float f, float f2, float f3, float f4) {
        this.a.put(str, new dbgk(str, f, f2, f3, f4));
    }

    public void setInt(String str, int i) {
        this.a.put(str, new dbgp(str, i));
    }

    public void setInt2(String str, int i, int i2) {
        this.a.put(str, new dbgm(str, i, i2));
    }

    public void setInt3(String str, int i, int i2, int i3) {
        this.a.put(str, new dbgn(str, i, i2, i3));
    }

    public void setInt4(String str, int i, int i2, int i3, int i4) {
        this.a.put(str, new dbgo(str, i, i2, i3, i4));
    }

    public void setTexture(String str, Texture texture) {
        this.a.put(str, new dbgr(str, texture));
    }
}
