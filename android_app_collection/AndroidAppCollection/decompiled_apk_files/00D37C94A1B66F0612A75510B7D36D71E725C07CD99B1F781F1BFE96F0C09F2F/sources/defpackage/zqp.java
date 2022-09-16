package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zqp  reason: default package */
/* loaded from: classes4.dex */
public final class zqp implements TextureView.SurfaceTextureListener {
    final /* synthetic */ zqq a;
    private final String b;

    public zqp(zqq zqqVar, String str) {
        this.a = zqqVar;
        this.b = str;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.a.n) {
            return;
        }
        zqq zqqVar = this.a;
        if (zqqVar.c != null) {
            zqqVar.j.g(this.b);
        } else if (!zqqVar.C()) {
        } else {
            this.a.A();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a.u(surfaceTexture);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
