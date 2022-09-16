package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
/* compiled from: PG */
/* renamed from: afnc  reason: default package */
/* loaded from: classes.dex */
public final class afnc extends afne implements SurfaceHolder.Callback, afnh {
    public afnc(Context context) {
        super(context);
        this.a.setSecure(true);
    }

    @Override // defpackage.afne, defpackage.afnh
    public final afnk C() {
        return afnk.SECURE_SURFACE;
    }

    @Override // defpackage.afne, defpackage.afna, defpackage.afnh
    public final SurfaceControl f() {
        return null;
    }

    @Override // defpackage.afne, defpackage.afna, defpackage.afmu
    public final void l(Bitmap bitmap, yiw yiwVar) {
        yiwVar.a(bitmap, null);
    }
}
