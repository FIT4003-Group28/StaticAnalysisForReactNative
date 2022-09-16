package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
/* compiled from: PG */
/* renamed from: ahki  reason: default package */
/* loaded from: classes.dex */
final class ahki extends GLSurfaceView {
    final /* synthetic */ ahkj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahki(ahkj ahkjVar, Context context) {
        super(context);
        this.a = ahkjVar;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.e = true;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        this.a.k();
        this.a.e = false;
        super.onDetachedFromWindow();
    }
}
