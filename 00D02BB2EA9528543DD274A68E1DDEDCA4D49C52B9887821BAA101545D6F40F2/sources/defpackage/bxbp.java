package defpackage;

import com.google.geo.imagery.viewer.api.IconRenderer;
import com.google.geo.imagery.viewer.api.IconRendererSwigJNI;
import com.google.geo.imagery.viewer.api.Renderer;
import com.google.geo.imagery.viewer.api.RendererSwigJNI;
/* compiled from: PG */
/* renamed from: bxbp  reason: default package */
/* loaded from: classes4.dex */
public final class bxbp implements Runnable {
    final /* synthetic */ bxbs a;

    public bxbp(bxbs bxbsVar) {
        this.a = bxbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dfua dfuaVar = this.a.j.b;
        if (dfuaVar != null) {
            synchronized (dfuaVar.b) {
                Renderer renderer = dfuaVar.a;
                if (renderer != null) {
                    RendererSwigJNI.Renderer_clearCache(renderer.a, renderer);
                }
            }
        }
        dftz dftzVar = this.a.j.c;
        if (dftzVar != null) {
            synchronized (dftzVar.b) {
                IconRenderer iconRenderer = dftzVar.a;
                if (iconRenderer == null) {
                    return;
                }
                IconRendererSwigJNI.IconRenderer_clearCache(iconRenderer.a, iconRenderer);
            }
        }
    }
}
