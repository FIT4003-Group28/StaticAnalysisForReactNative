package defpackage;

import com.google.android.filament.Stream;
import com.google.android.filament.Texture;
import com.google.ar.sceneform.rendering.EngineInstance;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dber  reason: default package */
/* loaded from: classes5.dex */
public final class dber implements Runnable {
    private final Texture a;
    private final Stream b;

    public dber(Texture texture, Stream stream) {
        this.a = texture;
        this.b = stream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dbix.a();
        dbet a = EngineInstance.a();
        if (a == null || !a.a()) {
            return;
        }
        Texture texture = this.a;
        if (texture != null) {
            a.j(texture);
        }
        Stream stream = this.b;
        if (stream == null) {
            return;
        }
        a.a.destroyStream(stream);
    }
}
