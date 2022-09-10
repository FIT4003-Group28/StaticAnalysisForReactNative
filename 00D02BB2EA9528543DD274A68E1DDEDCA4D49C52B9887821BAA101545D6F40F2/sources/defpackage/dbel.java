package defpackage;

import com.google.android.filament.IndexBuffer;
import com.google.android.filament.Scene;
import com.google.android.filament.VertexBuffer;
import com.google.ar.sceneform.rendering.EngineInstance;
/* compiled from: PG */
/* renamed from: dbel  reason: default package */
/* loaded from: classes5.dex */
final class dbel implements Runnable {
    private final Scene a;
    private final int b;
    private final IndexBuffer c;
    private final VertexBuffer d;

    public dbel(Scene scene, int i, IndexBuffer indexBuffer, VertexBuffer vertexBuffer) {
        this.a = scene;
        this.b = i;
        this.c = indexBuffer;
        this.d = vertexBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dbix.a();
        dbet a = EngineInstance.a();
        a.getClass();
        int i = this.b;
        if (i != -1) {
            this.a.remove(i);
        }
        a.g(this.c);
        a.h(this.d);
    }
}
