package com.facebook.react.flat;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.react.uimanager.ao;
import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.YogaValue;
/* compiled from: FlatARTSurfaceViewShadowNode.java */
/* loaded from: classes.dex */
class o extends q implements TextureView.SurfaceTextureListener {

    /* renamed from: d  reason: collision with root package name */
    private boolean f3407d = false;
    private Surface e;

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

    /* JADX INFO: Access modifiers changed from: package-private */
    public o() {
        d();
        a();
    }

    @Override // com.facebook.react.uimanager.x
    public void onCollectExtraUpdates(ao aoVar) {
        super.onCollectExtraUpdates(aoVar);
        f();
        aoVar.a(getReactTag(), this);
    }

    private void f() {
        if (this.e == null || !this.e.isValid()) {
            a(this);
            return;
        }
        try {
            Canvas lockCanvas = this.e.lockCanvas(null);
            lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            Paint paint = new Paint();
            for (int i = 0; i < getChildCount(); i++) {
                com.facebook.react.views.art.f fVar = (com.facebook.react.views.art.f) getChildAt(i);
                fVar.a(lockCanvas, paint, 1.0f);
                fVar.markUpdateSeen();
            }
            if (this.e == null) {
                return;
            }
            this.e.unlockCanvasAndPost(lockCanvas);
        } catch (IllegalArgumentException | IllegalStateException e) {
            Log.e("ReactNative", e.getClass().getSimpleName() + " in Surface.unlockCanvasAndPost");
        }
    }

    private void a(com.facebook.react.uimanager.w wVar) {
        for (int i = 0; i < wVar.getChildCount(); i++) {
            com.facebook.react.uimanager.w childAt = wVar.getChildAt(i);
            childAt.markUpdateSeen();
            a(childAt);
        }
    }

    @Override // com.facebook.react.uimanager.x
    public void setPadding(int i, float f) {
        YogaValue stylePadding = getStylePadding(i);
        if (stylePadding.e == YogaUnit.POINT && stylePadding.f4287d == f) {
            return;
        }
        super.setPadding(i, f);
        this.f3407d = true;
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.x
    public void setPaddingPercent(int i, float f) {
        YogaValue stylePadding = getStylePadding(i);
        if (stylePadding.e == YogaUnit.PERCENT && stylePadding.f4287d == f) {
            return;
        }
        super.setPadding(i, f);
        this.f3407d = true;
        markUpdated();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.e = new Surface(surfaceTexture);
        f();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
        this.e = null;
        return true;
    }
}
