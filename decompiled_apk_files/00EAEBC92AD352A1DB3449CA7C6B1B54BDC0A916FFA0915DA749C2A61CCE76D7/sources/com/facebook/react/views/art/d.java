package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.v0;
/* loaded from: classes.dex */
public class d extends i implements TextureView.SurfaceTextureListener, LifecycleEventListener {
    private Surface A;
    private Integer B;

    private void b(boolean z) {
        Surface surface = this.A;
        if (surface == null || !surface.isValid()) {
            f(this);
            return;
        }
        try {
            Canvas lockCanvas = this.A.lockCanvas(null);
            lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            if (this.B != null) {
                lockCanvas.drawColor(this.B.intValue());
            }
            Paint paint = new Paint();
            for (int i = 0; i < a(); i++) {
                f fVar = (f) a(i);
                fVar.a(lockCanvas, paint, 1.0f);
                if (z) {
                    fVar.M();
                } else {
                    fVar.e();
                }
            }
            if (this.A == null) {
                return;
            }
            this.A.unlockCanvasAndPost(lockCanvas);
        } catch (IllegalArgumentException | IllegalStateException e2) {
            c.d.d.e.a.b("ReactNative", e2.getClass().getSimpleName() + " in Surface.unlockCanvasAndPost");
        }
    }

    private void f(a0 a0Var) {
        for (int i = 0; i < a0Var.a(); i++) {
            a0 a2 = a0Var.a(i);
            a2.e();
            f(a2);
        }
    }

    @Override // com.facebook.react.uimanager.b0
    public boolean J() {
        return true;
    }

    @Override // com.facebook.react.uimanager.b0, com.facebook.react.uimanager.a0
    public void a(k0 k0Var) {
        super.a(k0Var);
        if (Build.VERSION.SDK_INT > 24) {
            k0Var.addLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.uimanager.b0
    public void a(v0 v0Var) {
        super.a(v0Var);
        b(false);
        v0Var.a(t(), this);
    }

    public void a(c cVar) {
        SurfaceTexture surfaceTexture = cVar.getSurfaceTexture();
        cVar.setSurfaceTextureListener(this);
        if (surfaceTexture == null || this.A != null) {
            return;
        }
        this.A = new Surface(surfaceTexture);
        b(true);
    }

    @Override // com.facebook.react.uimanager.b0, com.facebook.react.uimanager.a0
    public void f() {
        super.f();
        if (Build.VERSION.SDK_INT > 24) {
            i().removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        b(false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A = new Surface(surfaceTexture);
        b(false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A.release();
        this.A = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        this.B = num;
        M();
    }

    @Override // com.facebook.react.uimanager.b0, com.facebook.react.uimanager.a0
    public boolean y() {
        return false;
    }
}
