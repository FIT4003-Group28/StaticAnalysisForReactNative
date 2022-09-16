package defpackage;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
/* compiled from: PG */
/* renamed from: ahmb  reason: default package */
/* loaded from: classes.dex */
public final class ahmb implements Runnable {
    final /* synthetic */ ahmc a;

    public ahmb(ahmc ahmcVar) {
        this.a = ahmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        if (this.a.c != null && !egl10.eglGetCurrentContext().equals(EGL10.EGL_NO_CONTEXT)) {
            try {
                this.a.c.updateTexImage();
                ahmc ahmcVar = this.a;
                ahmcVar.c.getTransformMatrix(ahmcVar.b);
                ahmc ahmcVar2 = this.a;
                ahmcVar2.e = ahmcVar2.c.getTimestamp() / 1000;
                return;
            } catch (RuntimeException e) {
                zep.b(e.getMessage());
                return;
            }
        }
        this.a.d = true;
    }
}
