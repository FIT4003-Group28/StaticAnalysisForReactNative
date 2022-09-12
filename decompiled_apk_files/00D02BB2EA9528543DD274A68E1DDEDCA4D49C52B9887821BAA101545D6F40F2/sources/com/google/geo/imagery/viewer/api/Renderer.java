package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Renderer {
    public long a;
    protected boolean b = true;

    protected Renderer(long j) {
        this.a = j;
    }

    public static Renderer b(PlatformContext platformContext, boolean z) {
        long Renderer_createRendererWithDefaults = RendererSwigJNI.Renderer_createRendererWithDefaults(PlatformContext.getCPtr(platformContext), platformContext, z);
        if (Renderer_createRendererWithDefaults == 0) {
            return null;
        }
        return new Renderer(Renderer_createRendererWithDefaults);
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                RendererSwigJNI.delete_Renderer(j);
            }
            this.a = 0L;
        }
    }

    public final void c() {
        RendererSwigJNI.Renderer_onSurfaceCreated(this.a, this);
    }

    public final dftp d(dhjx dhjxVar, dftn dftnVar) {
        byte[] Renderer_render = RendererSwigJNI.Renderer_render(this.a, this, dhjxVar == null ? null : dhjxVar.bS(), dftnVar == null ? null : dftnVar.bS());
        if (Renderer_render != null) {
            try {
                return (dftp) dsqw.cq(dftp.e, Renderer_render);
            } catch (dsrm e) {
                throw new RuntimeException("Unable to parse com.google.geo.imagery.viewer.api.RenderResult protocol message.", e);
            }
        }
        return null;
    }

    public final void e(dftb dftbVar, Callback callback) {
        RendererSwigJNI.Renderer_createPhoto(this.a, this, dftbVar == null ? null : dftbVar.bS(), Callback.getCPtr(callback), callback);
    }

    public final void f(PhotoHandle photoHandle) {
        RendererSwigJNI.Renderer_setPhotos__SWIG_0(this.a, this, photoHandle.a, photoHandle);
    }

    protected final void finalize() {
        a();
    }
}
