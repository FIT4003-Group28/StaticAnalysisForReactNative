package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.SurfaceHolder;
import com.google.mediapipe.framework.TextureFrame;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: sjk  reason: default package */
/* loaded from: classes4.dex */
public final class sjk {
    public static final amzy a = amzy.l("com/google/android/libraries/ar/faceviewer/components/rendering/GLViewManager");
    public final GLSurfaceView b;
    public final aoib c;
    public final aoic d;
    public final sjj e;
    final SurfaceHolder.Callback f;
    public skr g;

    public sjk(Context context, aoik aoikVar, sjj sjjVar) {
        this.e = sjjVar;
        GLSurfaceView gLSurfaceView = new GLSurfaceView(context);
        this.b = gLSurfaceView;
        gLSurfaceView.setEGLContextClientVersion(aoikVar.d);
        gLSurfaceView.setEGLContextFactory(new sjg(aoikVar));
        aoib aoibVar = new aoib();
        this.c = aoibVar;
        if (aoibVar.c == 0) {
            aoibVar.d = 3553;
            gLSurfaceView.setRenderer(aoibVar);
            gLSurfaceView.setRenderMode(0);
            sji sjiVar = new sji(this);
            this.f = sjiVar;
            gLSurfaceView.getHolder().addCallback(sjiVar);
            this.d = new aoic() { // from class: sjf
                @Override // defpackage.aoic
                public final void a(TextureFrame textureFrame) {
                    sjk sjkVar = sjk.this;
                    TextureFrame textureFrame2 = (TextureFrame) sjkVar.c.g.getAndSet(textureFrame);
                    if (textureFrame2 != null && (textureFrame == null || textureFrame2.getTextureName() != textureFrame.getTextureName())) {
                        textureFrame2.release();
                    }
                    sjkVar.b.requestRender();
                    skr skrVar = sjkVar.g;
                    if (skrVar != null) {
                        shu shuVar = skrVar.e.b;
                        amqi amqiVar = shuVar.a;
                        if (!amqiVar.a) {
                            for (int i = 0; i < Math.min(1800, shuVar.d); i++) {
                                shuVar.c.set(i, 0);
                            }
                            shuVar.d = 0;
                            shv shvVar = shuVar.b;
                            shvVar.b = 0;
                            shvVar.c = 0;
                            shvVar.d = 0;
                            shvVar.e = 0;
                            for (int i2 = 0; i2 < 60; i2++) {
                                shvVar.a.set(i2, 0);
                            }
                            shuVar.a.f();
                            return;
                        }
                        int a2 = (int) amqiVar.a(TimeUnit.MILLISECONDS);
                        shuVar.a.e();
                        shuVar.a.f();
                        ArrayList arrayList = shuVar.c;
                        int i3 = shuVar.d;
                        Integer valueOf = Integer.valueOf(a2);
                        arrayList.set(i3 % 1800, valueOf);
                        shuVar.d++;
                        shv shvVar2 = shuVar.b;
                        if (shvVar2.d == shvVar2.e && shvVar2.b > 0) {
                            shvVar2.a();
                        }
                        shvVar2.a.set(shvVar2.d, valueOf);
                        shvVar2.b++;
                        shvVar2.c += a2;
                        shvVar2.d = (shvVar2.d + 1) % 60;
                        while (shvVar2.c > 2000) {
                            shvVar2.a();
                        }
                    }
                }
            };
            return;
        }
        throw new IllegalStateException("setTextureTarget must be called before the surface is created");
    }
}
