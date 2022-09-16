package defpackage;

import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.Surface;
/* compiled from: PG */
/* renamed from: acoo  reason: default package */
/* loaded from: classes.dex */
final class acoo implements absy {
    final /* synthetic */ acor a;

    public acoo(acor acorVar) {
        this.a = acorVar;
    }

    @Override // defpackage.absy
    public final void a(long j) {
        absz abszVar = this.a.c;
        EGLContext eGLContext = abszVar.a;
        if (eGLContext == null || !abszVar.h()) {
            String valueOf = String.valueOf(eGLContext);
            this.a.c.h();
            String.valueOf(valueOf).length();
            return;
        }
        this.a.c.c().a(eGLContext);
        acor acorVar = this.a;
        int i = acorVar.d.b;
        if (i == 0) {
            return;
        }
        int b = acorVar.c.b();
        int a = this.a.c.a();
        GLES20.glViewport(0, 0, b, a);
        this.a.f.b(i, b, a, b, a);
        this.a.c.d(j);
    }

    @Override // defpackage.absy
    public final void b(boolean z) {
        absz abszVar = this.a.c;
        if (abszVar != null) {
            abszVar.f(z);
        }
    }

    @Override // defpackage.absy
    public final void c(boolean z) {
        abtw abtwVar = this.a.p;
        if (abtwVar != null) {
            abtwVar.a(z);
        }
    }

    @Override // defpackage.absy
    public final void d(Runnable runnable, Handler handler) {
        this.a.e.h(runnable, handler);
    }

    @Override // defpackage.absy
    public final void e(Surface surface) {
        absz abszVar = this.a.c;
        if (abszVar != null) {
            abszVar.g(surface);
        }
    }
}
