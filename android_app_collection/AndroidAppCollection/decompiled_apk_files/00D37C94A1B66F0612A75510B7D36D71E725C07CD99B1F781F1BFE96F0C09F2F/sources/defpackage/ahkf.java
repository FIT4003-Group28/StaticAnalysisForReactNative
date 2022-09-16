package defpackage;

import android.opengl.GLSurfaceView;
import com.google.vr.sdk.base.Eye;
import com.google.vr.sdk.base.GvrView;
import com.google.vr.sdk.base.HeadTransform;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: PG */
/* renamed from: ahkf  reason: default package */
/* loaded from: classes.dex */
final class ahkf implements GLSurfaceView.Renderer {
    final /* synthetic */ GvrView.Renderer a;
    final /* synthetic */ ahkj b;

    public ahkf(ahkj ahkjVar, GvrView.Renderer renderer) {
        this.b = ahkjVar;
        this.a = renderer;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        this.b.c.setGLViewport();
        GvrView.Renderer renderer = this.a;
        ahkj ahkjVar = this.b;
        HeadTransform headTransform = ahkjVar.a;
        Eye eye = ahkjVar.b;
        ahkg ahkgVar = (ahkg) renderer;
        ahkgVar.a.onNewFrame(headTransform);
        ahkgVar.a.onDrawEye(eye);
        GvrView.Renderer renderer2 = this.a;
        ((ahkg) renderer2).a.onFinishFrame(this.b.c);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.b.c.setViewport(0, 0, i, i2);
        this.a.onSurfaceChanged(i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.a.onSurfaceCreated(eGLConfig);
    }
}
