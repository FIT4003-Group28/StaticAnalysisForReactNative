package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.view.View;
/* compiled from: PG */
/* loaded from: classes2.dex */
final class ao implements View.OnAttachStateChangeListener {
    final /* synthetic */ ar a;

    public ao(ar arVar) {
        this.a = arVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ar arVar = this.a;
        arVar.c.removeCallbacks(arVar.b);
    }
}
