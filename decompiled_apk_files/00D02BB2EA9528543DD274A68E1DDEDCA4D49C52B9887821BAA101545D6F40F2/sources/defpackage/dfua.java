package defpackage;

import com.google.geo.imagery.viewer.api.PhotoHandle;
import com.google.geo.imagery.viewer.api.PlatformContext;
import com.google.geo.imagery.viewer.api.Renderer;
import com.google.geo.imagery.viewer.api.RendererSwigJNI;
import com.google.geo.imagery.viewer.api.Swipe;
/* compiled from: PG */
/* renamed from: dfua  reason: default package */
/* loaded from: classes6.dex */
public final class dfua {
    @dzsi
    public Renderer a;
    public final Object b = new Object();

    protected dfua(Renderer renderer) {
        this.a = renderer;
    }

    public static synchronized dfua a(PlatformContext platformContext, boolean z) {
        dfua dfuaVar;
        synchronized (dfua.class) {
            dfuaVar = new dfua(Renderer.b(platformContext, z));
        }
        return dfuaVar;
    }

    public final boolean d() {
        boolean z;
        synchronized (this.b) {
            z = this.a == null;
        }
        return z;
    }

    public final void e(PhotoHandle photoHandle) {
        synchronized (this.b) {
            Renderer renderer = this.a;
            if (renderer == null) {
                return;
            }
            renderer.f(photoHandle);
        }
    }

    @dzsi
    public final Swipe b() {
        synchronized (this.b) {
            Renderer renderer = this.a;
            Swipe swipe = null;
            if (renderer == null) {
                return null;
            }
            long Renderer_getSwipe = RendererSwigJNI.Renderer_getSwipe(renderer.a, renderer);
            if (Renderer_getSwipe != 0) {
                swipe = new Swipe(Renderer_getSwipe);
            }
            return swipe;
        }
    }

    @dzsi
    public final dfsg c(dhjx dhjxVar, float f, float f2, long j, dftn dftnVar) {
        synchronized (this.b) {
            Renderer renderer = this.a;
            dfsg dfsgVar = null;
            if (renderer == null) {
                return null;
            }
            byte[] Renderer_findClickTarget__SWIG_0 = RendererSwigJNI.Renderer_findClickTarget__SWIG_0(renderer.a, renderer, dhjxVar == null ? null : dhjxVar.bS(), f, f2, j, dftnVar == null ? null : dftnVar.bS());
            if (Renderer_findClickTarget__SWIG_0 != null) {
                try {
                    dfsgVar = (dfsg) dsqw.cq(dfsg.e, Renderer_findClickTarget__SWIG_0);
                } catch (dsrm e) {
                    throw new RuntimeException("Unable to parse com.google.geo.imagery.viewer.api.ClickResult protocol message.", e);
                }
            }
            return dfsgVar;
        }
    }
}
