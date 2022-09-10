package defpackage;

import com.google.android.filament.Camera;
import com.google.android.filament.Engine;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.LightManager;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.Scene;
import com.google.android.filament.SwapChain;
import com.google.android.filament.Texture;
import com.google.android.filament.TransformManager;
import com.google.android.filament.VertexBuffer;
import com.google.android.filament.View;
/* compiled from: PG */
/* renamed from: dbet  reason: default package */
/* loaded from: classes5.dex */
public final class dbet {
    public final Engine a;

    public dbet(Engine engine) {
        this.a = engine;
    }

    public final boolean a() {
        return this.a.isValid();
    }

    public final void b(SwapChain swapChain) {
        this.a.destroySwapChain(swapChain);
    }

    public final View c() {
        return this.a.createView();
    }

    public final void d(View view) {
        this.a.destroyView(view);
    }

    public final Camera e() {
        return this.a.createCamera();
    }

    public final Scene f() {
        return this.a.createScene();
    }

    public final void g(IndexBuffer indexBuffer) {
        this.a.destroyIndexBuffer(indexBuffer);
    }

    public final void h(VertexBuffer vertexBuffer) {
        this.a.destroyVertexBuffer(vertexBuffer);
    }

    public final void i(IndirectLight indirectLight) {
        this.a.destroyIndirectLight(indirectLight);
    }

    public final void j(Texture texture) {
        this.a.destroyTexture(texture);
    }

    public final TransformManager k() {
        return this.a.getTransformManager();
    }

    public final LightManager l() {
        return this.a.getLightManager();
    }

    public final RenderableManager m() {
        return this.a.getRenderableManager();
    }
}
