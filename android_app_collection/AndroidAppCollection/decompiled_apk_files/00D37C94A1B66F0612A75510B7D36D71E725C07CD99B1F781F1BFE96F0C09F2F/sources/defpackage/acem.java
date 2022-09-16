package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
/* compiled from: PG */
/* renamed from: acem  reason: default package */
/* loaded from: classes.dex */
final class acem implements TextureView.SurfaceTextureListener {
    final /* synthetic */ aces a;

    public acem(aces acesVar) {
        this.a = acesVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.f(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.d(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
