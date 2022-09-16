package defpackage;

import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.Surface;
/* compiled from: PG */
/* renamed from: abul  reason: default package */
/* loaded from: classes.dex */
final class abul implements absy {
    final /* synthetic */ abus a;

    public abul(abus abusVar) {
        this.a = abusVar;
    }

    @Override // defpackage.absy
    public final void a(long j) {
        absz abszVar = this.a.u;
        EGLContext eGLContext = abszVar.a;
        if (eGLContext == null || !abszVar.h()) {
            String valueOf = String.valueOf(eGLContext);
            this.a.u.h();
            String.valueOf(valueOf).length();
            return;
        }
        this.a.u.c().a(eGLContext);
        abus abusVar = this.a;
        int i = abusVar.v.b;
        if (i == 0) {
            return;
        }
        int b = abusVar.u.b();
        int a = this.a.u.a();
        GLES20.glViewport(0, 0, b, a);
        this.a.t.b(i, b, a, b, a);
        this.a.u.d(j);
    }

    @Override // defpackage.absy
    public final void b(boolean z) {
        absz abszVar = this.a.u;
        if (abszVar != null) {
            abszVar.f(z);
        }
    }

    @Override // defpackage.absy
    public final void c(boolean z) {
        abtw abtwVar = this.a.g;
        if (abtwVar != null) {
            abtwVar.a(z);
        }
    }

    @Override // defpackage.absy
    public final void d(Runnable runnable, Handler handler) {
        this.a.f.h(runnable, handler);
    }

    @Override // defpackage.absy
    public final void e(Surface surface) {
        absz abszVar = this.a.u;
        if (abszVar != null) {
            abszVar.g(surface);
        }
    }
}
