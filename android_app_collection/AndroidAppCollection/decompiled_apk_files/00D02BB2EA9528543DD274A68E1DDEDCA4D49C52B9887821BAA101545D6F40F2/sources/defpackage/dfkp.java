package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
/* compiled from: PG */
/* renamed from: dfkp  reason: default package */
/* loaded from: classes6.dex */
public final class dfkp extends SurfaceView {
    public final dfkq a;

    public dfkp(Context context) {
        this(context, null);
    }

    public void setArloViewBridge(@dzsi dfel dfelVar) {
        this.a.d(dfelVar);
    }

    public void setScene(@dzsi dfeh dfehVar) {
        this.a.c(dfehVar);
    }

    public dfkp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new dfkq();
        dfko dfkoVar = new dfko(this, context);
        SurfaceHolder holder = getHolder();
        holder.addCallback(dfkoVar);
        holder.setSizeFromLayout();
        setZOrderMediaOverlay(true);
    }
}
