package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.SurfaceHolder;
/* compiled from: PG */
/* renamed from: dfko  reason: default package */
/* loaded from: classes6.dex */
final class dfko implements SurfaceHolder.Callback {
    final /* synthetic */ Context a;
    final /* synthetic */ dfkp b;

    public dfko(dfkp dfkpVar, Context context) {
        this.b = dfkpVar;
        this.a = context;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Activity activity;
        dfkq dfkqVar = this.b.a;
        Context context = this.a;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (!(context instanceof Activity)) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                activity = (Activity) context;
                break;
            }
        }
        dfkqVar.b(i2, i3, activity != null ? activity.getWindowManager().getDefaultDisplay().getRotation() : 0);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.b.a.a(surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.b.a.a(null);
    }
}
