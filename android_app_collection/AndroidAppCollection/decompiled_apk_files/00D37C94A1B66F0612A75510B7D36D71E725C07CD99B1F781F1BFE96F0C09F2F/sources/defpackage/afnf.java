package defpackage;

import android.content.Context;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
/* compiled from: PG */
/* renamed from: afnf  reason: default package */
/* loaded from: classes.dex */
public final class afnf extends afne {
    public afnf(Context context) {
        super(context);
    }

    @Override // defpackage.afne, defpackage.afnh
    public final afnk C() {
        return afnk.YUV_SURFACE;
    }

    @Override // defpackage.afne, defpackage.afna, defpackage.afnh
    public final SurfaceControl f() {
        return null;
    }

    @Override // defpackage.afne, android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.a.getHolder().setFormat(842094169);
        super.surfaceCreated(surfaceHolder);
    }
}
