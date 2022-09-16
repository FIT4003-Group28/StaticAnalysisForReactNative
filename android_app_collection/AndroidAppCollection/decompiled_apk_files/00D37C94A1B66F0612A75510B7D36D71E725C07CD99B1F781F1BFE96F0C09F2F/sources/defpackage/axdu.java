package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import com.google.vr.ndk.base.GvrSurfaceView;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: axdu  reason: default package */
/* loaded from: classes2.dex */
public final class axdu extends GvrSurfaceView {
    private final axdt a;
    private boolean b;
    private boolean c;
    private ArrayList d;
    private final axdx e;

    public axdu(Context context, axdt axdtVar) {
        super(context);
        this.a = axdtVar;
        axdx axdxVar = new axdx();
        this.e = axdxVar;
        setEGLContextFactory(axdxVar);
        setEGLWindowSurfaceFactory(axdxVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.vr.ndk.base.GvrSurfaceView, android.view.SurfaceView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = false;
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                super.queueEvent((Runnable) arrayList.get(i));
            }
            this.d.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.vr.ndk.base.GvrSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        axdt axdtVar;
        if (this.b && (axdtVar = this.a) != null) {
            axdtVar.onSurfaceViewDetachedFromWindow();
        }
        super.onDetachedFromWindow();
        this.c = true;
    }

    @Override // com.google.vr.ndk.base.GvrSurfaceView
    public final void onPause() {
        if (this.b) {
            super.onPause();
        }
    }

    @Override // com.google.vr.ndk.base.GvrSurfaceView
    public final void onResume() {
        if (this.b) {
            super.onResume();
        }
    }

    @Override // com.google.vr.ndk.base.GvrSurfaceView
    public final void queueEvent(Runnable runnable) {
        if (!this.b) {
            runnable.run();
        } else if (this.c) {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(runnable);
        } else {
            super.queueEvent(runnable);
        }
    }

    @Override // com.google.vr.ndk.base.GvrSurfaceView
    public final void setEGLContextClientVersion(int i) {
        super.setEGLContextClientVersion(2);
        this.e.e = 2;
    }

    @Override // com.google.vr.ndk.base.GvrSurfaceView
    public final void setRenderer(GLSurfaceView.Renderer renderer) {
        super.setRenderer(renderer);
        this.b = true;
    }
}
