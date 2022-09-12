package defpackage;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.google.geo.ar.arlo.api.jni.TextureRegistryJniImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dfke  reason: default package */
/* loaded from: classes6.dex */
public final class dfke implements dfet {
    private final Object a = new Object();
    private final dfew b;
    private final dfem c;
    private final Rect d;
    private final dffk e;
    private final int f;

    public dfke(long j, dffk dffkVar, dfem dfemVar) {
        dfew dfewVar = new dfew(dfke.class, j);
        this.b = dfewVar;
        this.e = dffkVar;
        this.c = dfemVar;
        this.d = new Rect();
        this.f = TextureRegistryJniImpl.nativeGetTextureId(dfewVar.b());
    }

    @Override // defpackage.dfem
    public final SurfaceTexture a() {
        SurfaceTexture surfaceTexture;
        synchronized (this.a) {
            surfaceTexture = ((dfkh) this.c).a;
        }
        return surfaceTexture;
    }

    @Override // defpackage.dfem
    public final Surface b() {
        Surface surface;
        synchronized (this.a) {
            surface = ((dfkh) this.c).b;
        }
        return surface;
    }

    @Override // defpackage.dfem
    public final void c(Picture picture) {
        int width = picture.getWidth();
        int height = picture.getHeight();
        synchronized (this.a) {
            this.b.d();
            dfem dfemVar = this.c;
            ((dfkh) dfemVar).a.setDefaultBufferSize(picture.getWidth(), picture.getHeight());
            Canvas lockHardwareCanvas = ((dfkh) dfemVar).b.lockHardwareCanvas();
            picture.draw(lockHardwareCanvas);
            ((dfkh) dfemVar).b.unlockCanvasAndPost(lockHardwareCanvas);
            if (width != this.d.width() || height != this.d.height()) {
                this.d.set(0, 0, width, height);
                TextureRegistryJniImpl.nativeSetTextureSizePx(this.b.b(), width, height);
            }
        }
    }

    @Override // defpackage.dfet
    public final int d() {
        int i;
        synchronized (this.a) {
            this.b.d();
            i = this.f;
        }
        return i;
    }

    @Override // defpackage.dfet
    public final void e() {
        synchronized (this.a) {
            TextureRegistryJniImpl.nativeDestroyTexture(this.b.b());
            this.b.a();
        }
    }
}
