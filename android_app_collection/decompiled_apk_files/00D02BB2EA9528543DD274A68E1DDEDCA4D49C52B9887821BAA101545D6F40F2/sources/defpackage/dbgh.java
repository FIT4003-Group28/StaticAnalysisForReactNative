package defpackage;

import com.google.android.filament.MaterialInstance;
import com.google.android.filament.Texture;
import com.google.android.filament.TextureSampler;
/* compiled from: PG */
/* renamed from: dbgh  reason: default package */
/* loaded from: classes5.dex */
public final class dbgh extends dbgq {
    private final dbes a;

    public dbgh(String str, dbes dbesVar) {
        this.e = str;
        this.a = dbesVar;
    }

    @Override // defpackage.dbgq
    public final void a(MaterialInstance materialInstance) {
        TextureSampler textureSampler = new TextureSampler();
        textureSampler.setMinFilter(TextureSampler.MinFilter.LINEAR);
        textureSampler.setMagFilter(TextureSampler.MagFilter.LINEAR);
        textureSampler.setWrapModeS(TextureSampler.WrapMode.CLAMP_TO_EDGE);
        textureSampler.setWrapModeT(TextureSampler.WrapMode.CLAMP_TO_EDGE);
        textureSampler.setWrapModeR(TextureSampler.WrapMode.CLAMP_TO_EDGE);
        String str = this.e;
        Texture texture = this.a.a;
        dbjb.c(texture);
        materialInstance.setParameter(str, texture, textureSampler);
    }

    @Override // defpackage.dbgq
    public final dbgq b() {
        return new dbgh(this.e, this.a);
    }

    @Override // defpackage.dbgq
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }
}
