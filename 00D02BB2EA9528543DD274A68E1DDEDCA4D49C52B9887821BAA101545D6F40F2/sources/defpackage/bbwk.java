package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.TextureView;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbwk  reason: default package */
/* loaded from: classes3.dex */
public final class bbwk implements TextureView.SurfaceTextureListener {
    final /* synthetic */ bbwn a;

    public bbwk(bbwn bbwnVar) {
        this.a = bbwnVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Camera camera = this.a.h;
        if (camera == null) {
            return;
        }
        try {
            camera.setPreviewTexture(surfaceTexture);
            this.a.d(i, i2);
            this.a.g.f(camera);
        } catch (IOException unused) {
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        bbwn bbwnVar = this.a;
        Camera camera = bbwnVar.h;
        if (camera == null) {
            return;
        }
        bbwnVar.a();
        this.a.d(i, i2);
        this.a.g.f(camera);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
