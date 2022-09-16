package defpackage;

import android.graphics.Picture;
import android.graphics.SurfaceTexture;
import android.view.Surface;
/* compiled from: PG */
/* renamed from: dfkh  reason: default package */
/* loaded from: classes6.dex */
public class dfkh implements dfem {
    public final SurfaceTexture a;
    public final Surface b;

    public dfkh() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(false);
        this.a = surfaceTexture;
        this.b = new Surface(surfaceTexture);
    }

    @Override // defpackage.dfem
    public final SurfaceTexture a() {
        return this.a;
    }

    @Override // defpackage.dfem
    public final Surface b() {
        return this.b;
    }

    @Override // defpackage.dfem
    public void c(Picture picture) {
        throw null;
    }
}
