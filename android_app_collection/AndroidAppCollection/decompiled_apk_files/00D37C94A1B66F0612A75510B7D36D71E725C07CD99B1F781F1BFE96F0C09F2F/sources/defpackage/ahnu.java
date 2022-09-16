package defpackage;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: PG */
/* renamed from: ahnu  reason: default package */
/* loaded from: classes.dex */
public final class ahnu implements GLSurfaceView.Renderer {
    private static final float[] e = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    public ahoq a;
    public ahog b;
    public volatile boolean c;
    public ahru d;
    private final Handler f;
    private final ahrz g;

    public ahnu(ahrz ahrzVar, Handler handler) {
        this.f = handler;
        this.g = ahrzVar;
    }

    private final void a(ahok ahokVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(ahokVar.getMessage());
        sb.append("\n");
        for (StackTraceElement stackTraceElement : ahokVar.getStackTrace()) {
            sb.append(stackTraceElement);
            sb.append("\n");
        }
        zep.b(sb.toString());
        this.f.obtainMessage(3, ahokVar).sendToTarget();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16384);
        ahog ahogVar = this.b;
        if (ahogVar != null) {
            ahogVar.f();
        }
        ahru ahruVar = this.d;
        if (ahruVar != null) {
            ahruVar.d(this.b);
        }
        if (this.c) {
            GLES20.glDrawArrays(5, 0, 4);
        }
        try {
            ahom.f();
        } catch (ahok e2) {
            a(e2);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        try {
            ahru ahruVar = new ahru(this.g, true, false);
            this.d = ahruVar;
            ahruVar.j();
            this.d.c();
            ahoq ahoqVar = new ahoq(e, 3);
            this.a = ahoqVar;
            ahoqVar.a(this.d.a);
            this.b = new ahog(this.f);
        } catch (ahok e2) {
            a(e2);
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
