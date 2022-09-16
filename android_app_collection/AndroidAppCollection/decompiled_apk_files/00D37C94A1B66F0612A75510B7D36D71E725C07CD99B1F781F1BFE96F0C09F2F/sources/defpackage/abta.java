package defpackage;

import android.graphics.Rect;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.util.EnumSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: abta  reason: default package */
/* loaded from: classes.dex */
public final class abta implements absu {
    public final absj a;
    public SurfaceHolder c;
    public int d;
    public int e;
    private final SurfaceView f;
    private EGLSurface g;
    public final Object b = new Object();
    private Set h = absw.b;

    public abta(SurfaceView surfaceView, absj absjVar) {
        this.f = surfaceView;
        this.a = absjVar;
        Rect surfaceFrame = surfaceView.getHolder().getSurfaceFrame();
        int i = 0;
        this.d = surfaceFrame == null ? 0 : surfaceFrame.width();
        this.e = surfaceFrame != null ? surfaceFrame.height() : i;
    }

    private static boolean d(abry abryVar) {
        return abryVar != null && abryVar.d;
    }

    public final void a(abry abryVar) {
        EGLSurface eGLSurface;
        if (d(abryVar) && (eGLSurface = this.g) != null) {
            abryVar.f(eGLSurface);
            abryVar.d();
            this.g = null;
        }
        this.c = null;
    }

    public final void b(boolean z) {
        this.h = z ? EnumSet.of(absv.a) : absw.b;
    }

    @Override // defpackage.absu
    public final void c(abry abryVar) {
        synchronized (this.b) {
            a(abryVar);
        }
    }

    @Override // defpackage.absu
    public final boolean e(boolean z, absw abswVar, abry abryVar) {
        if (this.f.getVisibility() != 0) {
            return false;
        }
        synchronized (this.b) {
            if (!d(abryVar)) {
                return false;
            }
            SurfaceHolder surfaceHolder = this.c;
            if (surfaceHolder == null) {
                return false;
            }
            if (this.g == null) {
                this.g = abryVar.b(surfaceHolder.getSurface());
            }
            Surface surface = this.c.getSurface();
            if (surface != null && surface.isValid()) {
                abryVar.c(this.g);
                GLES20.glViewport(0, 0, this.d, this.e);
                abswVar.ra(z, this.d, this.e, this.h);
                if (!abryVar.g(this.g)) {
                    zep.l("WARNING: swapBuffers() failed");
                }
                return true;
            }
            c(abryVar);
            return false;
        }
    }
}
