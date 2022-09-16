package defpackage;

import android.graphics.SurfaceTexture;
/* compiled from: PG */
/* renamed from: axec  reason: default package */
/* loaded from: classes2.dex */
final class axec implements SurfaceTexture.OnFrameAvailableListener {
    final /* synthetic */ axed a;

    public axec(axed axedVar) {
        this.a = axedVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        axee axeeVar;
        this.a.d.getAndIncrement();
        synchronized (this.a.k) {
            if (!this.a.j && (axeeVar = this.a.b) != null) {
                axeeVar.b();
            }
        }
    }
}
