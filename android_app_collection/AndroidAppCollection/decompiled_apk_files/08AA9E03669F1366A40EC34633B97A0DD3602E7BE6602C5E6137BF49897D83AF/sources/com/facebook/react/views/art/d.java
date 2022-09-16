package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.w;
/* compiled from: ARTSurfaceViewShadowNode.java */
/* loaded from: classes.dex */
public class d extends com.facebook.react.uimanager.g implements TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    private Surface f3942a;

    /* renamed from: b  reason: collision with root package name */
    private Integer f3943b;

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public boolean isVirtual() {
        return false;
    }

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public boolean isVirtualAnchor() {
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @com.facebook.react.uimanager.a.a(a = "backgroundColor", b = "Color")
    public void setBackgroundColor(Integer num) {
        this.f3943b = num;
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.x
    public void onCollectExtraUpdates(ao aoVar) {
        super.onCollectExtraUpdates(aoVar);
        a();
        aoVar.a(getReactTag(), this);
    }

    private void a() {
        if (this.f3942a == null || !this.f3942a.isValid()) {
            a(this);
            return;
        }
        try {
            Canvas lockCanvas = this.f3942a.lockCanvas(null);
            lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            if (this.f3943b != null) {
                lockCanvas.drawColor(this.f3943b.intValue());
            }
            Paint paint = new Paint();
            for (int i = 0; i < getChildCount(); i++) {
                f fVar = (f) getChildAt(i);
                fVar.a(lockCanvas, paint, 1.0f);
                fVar.markUpdateSeen();
            }
            if (this.f3942a == null) {
                return;
            }
            this.f3942a.unlockCanvasAndPost(lockCanvas);
        } catch (IllegalArgumentException | IllegalStateException e) {
            com.facebook.common.e.a.d("ReactNative", e.getClass().getSimpleName() + " in Surface.unlockCanvasAndPost");
        }
    }

    private void a(w wVar) {
        for (int i = 0; i < wVar.getChildCount(); i++) {
            w childAt = wVar.getChildAt(i);
            childAt.markUpdateSeen();
            a(childAt);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f3942a = new Surface(surfaceTexture);
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
        this.f3942a = null;
        return true;
    }
}
