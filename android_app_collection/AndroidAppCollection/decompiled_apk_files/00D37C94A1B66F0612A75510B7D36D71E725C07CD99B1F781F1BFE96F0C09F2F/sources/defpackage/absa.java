package defpackage;

import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import android.view.Surface;
/* compiled from: PG */
/* renamed from: absa  reason: default package */
/* loaded from: classes.dex */
public final class absa {
    public EGLSurface a;
    public abry b;
    public Surface c;
    private EGLContext d;

    public absa(Surface surface) {
        this.c = surface;
    }

    public final void a(EGLContext eGLContext) {
        aqxo.p(this.b == null || this.d.equals(eGLContext));
        try {
            if (this.b == null) {
                this.d = eGLContext;
                abry abryVar = new abry(eGLContext, 1);
                this.b = abryVar;
                this.a = abryVar.b(this.c);
            }
            this.b.c(this.a);
        } catch (absd e) {
            zep.b("EncoderInputSurface: makeCurrent failed: releasing EGLContext");
            b();
            throw e;
        }
    }

    public final void b() {
        abry abryVar = this.b;
        if (abryVar != null) {
            abryVar.f(this.a);
            this.b.e();
            this.b = null;
        }
        this.a = null;
        this.c = null;
    }
}
