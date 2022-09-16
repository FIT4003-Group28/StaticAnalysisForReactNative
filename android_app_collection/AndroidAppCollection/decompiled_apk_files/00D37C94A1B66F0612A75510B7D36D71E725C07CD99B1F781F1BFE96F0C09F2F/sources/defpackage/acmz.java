package defpackage;

import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.Surface;
/* compiled from: PG */
/* renamed from: acmz  reason: default package */
/* loaded from: classes.dex */
public final class acmz implements absy {
    final /* synthetic */ acnf a;

    public acmz(acnf acnfVar) {
        this.a = acnfVar;
    }

    @Override // defpackage.absy
    public final void b(boolean z) {
        absz abszVar = this.a.g;
        if (abszVar != null) {
            abszVar.f(z);
        }
    }

    @Override // defpackage.absy
    public final void c(boolean z) {
        abtj abtjVar = this.a.m;
        if (abtjVar != null) {
            abtjVar.h(z);
        }
    }

    @Override // defpackage.absy
    public final void d(Runnable runnable, Handler handler) {
        this.a.d.h(runnable, handler);
    }

    @Override // defpackage.absy
    public final void e(Surface surface) {
        this.a.g.g(surface);
    }

    @Override // defpackage.absy
    public final void a(long j) {
        absz abszVar = this.a.g;
        EGLContext eGLContext = abszVar == null ? null : abszVar.a;
        if (eGLContext == null || !abszVar.h()) {
            String valueOf = String.valueOf(eGLContext);
            this.a.g.h();
            String.valueOf(valueOf).length();
            return;
        }
        this.a.g.c().a(eGLContext);
        acnf acnfVar = this.a;
        abrz abrzVar = acnfVar.h;
        int i = abrzVar != null ? abrzVar.b : 0;
        if (i == 0) {
            return;
        }
        int b = acnfVar.g.b();
        int a = this.a.g.a();
        GLES20.glViewport(0, 0, b, a);
        this.a.j.b(i, b, a, b, a);
        this.a.g.d(j);
    }
}
