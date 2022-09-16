package defpackage;

import com.google.ar.sceneform.rendering.TextureInternalData;
/* compiled from: PG */
/* renamed from: dbib  reason: default package */
/* loaded from: classes5.dex */
public final class dbib implements Runnable {
    private final TextureInternalData a;

    public dbib(TextureInternalData textureInternalData) {
        this.a = textureInternalData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dbix.a();
        TextureInternalData textureInternalData = this.a;
        if (textureInternalData != null) {
            textureInternalData.c();
        }
    }
}
