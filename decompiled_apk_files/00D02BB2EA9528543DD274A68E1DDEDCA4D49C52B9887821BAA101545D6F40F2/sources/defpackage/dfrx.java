package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.google.geo.imagery.viewer.api.PhotoHandle;
import com.google.geo.imagery.viewer.api.Renderer;
import com.google.geo.imagery.viewer.api.RendererSwigJNI;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dfrx  reason: default package */
/* loaded from: classes6.dex */
public final class dfrx {
    public final Executor a;
    public final dfuh b;
    public final dfum c;
    @dzsi
    public dfua d;
    public final dfun e;
    @dzsi
    public Animator f = null;
    private final Executor g;

    public dfrx(Executor executor, Executor executor2, dfuh dfuhVar, dfua dfuaVar, dfum dfumVar, dfun dfunVar) {
        this.a = executor;
        this.g = executor2;
        this.b = dfuhVar;
        this.e = dfunVar;
        this.d = dfuaVar;
        this.c = dfumVar;
        dfumVar.setPhotoAOpacity(1.0f);
        dfumVar.setPhotoBOpacity(0.0f);
    }

    public final void a(long j) {
        Animator animator = this.f;
        if (animator == null || !animator.isRunning()) {
            ValueAnimator b = this.c.b("photoBOpacity", 1.0f);
            b.addListener(new dfrw(this));
            this.f = b;
            b.setDuration(j);
            this.f.start();
            this.b.a();
        }
    }

    public final void b(@dzsi final PhotoHandle photoHandle, @dzsi final PhotoHandle photoHandle2) {
        this.g.execute(new Runnable(this, photoHandle, photoHandle2) { // from class: dfru
            private final dfrx a;
            private final PhotoHandle b;
            private final PhotoHandle c;

            {
                this.a = this;
                this.b = photoHandle;
                this.c = photoHandle2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dfrx dfrxVar = this.a;
                PhotoHandle photoHandle3 = this.b;
                PhotoHandle photoHandle4 = this.c;
                dfua dfuaVar = dfrxVar.d;
                if (dfuaVar == null || dfuaVar.d() || photoHandle3 == null) {
                    return;
                }
                dfrxVar.c.setPhotoAOpacity(1.0f);
                dfrxVar.c.setPhotoBOpacity(0.0f);
                if (photoHandle4 == null) {
                    dfuaVar.e(photoHandle3);
                    return;
                }
                synchronized (dfuaVar.b) {
                    Renderer renderer = dfuaVar.a;
                    if (renderer == null) {
                        return;
                    }
                    RendererSwigJNI.Renderer_setPhotos__SWIG_1(renderer.a, renderer, photoHandle3.a, photoHandle3, photoHandle4.a, photoHandle4);
                }
            }
        });
        this.b.a();
    }
}
