package defpackage;

import com.google.geo.ar.arlo.api.jni.TextureRegistryJniImpl;
/* compiled from: PG */
/* renamed from: dfkg  reason: default package */
/* loaded from: classes6.dex */
public final class dfkg {
    public final Object a;
    public final dfew b;
    private final dffk c;
    private final dfkd d;

    public dfkg(long j) {
        TextureRegistryJniImpl textureRegistryJniImpl = new TextureRegistryJniImpl();
        dfkd dfkdVar = dfkd.a;
        this.a = new Object();
        dfew dfewVar = new dfew(TextureRegistryJniImpl.class, j);
        this.b = dfewVar;
        this.c = textureRegistryJniImpl;
        this.d = dfkdVar;
        dfewVar.d();
    }

    public final dfet a() {
        synchronized (this.a) {
            if (!this.b.c()) {
                dfkh dfkhVar = new dfkh();
                return new dfke(TextureRegistryJniImpl.nativeRegisterExternalTexture(this.b.b(), dfkhVar.a), this.c, dfkhVar);
            }
            return new dfkf();
        }
    }
}
