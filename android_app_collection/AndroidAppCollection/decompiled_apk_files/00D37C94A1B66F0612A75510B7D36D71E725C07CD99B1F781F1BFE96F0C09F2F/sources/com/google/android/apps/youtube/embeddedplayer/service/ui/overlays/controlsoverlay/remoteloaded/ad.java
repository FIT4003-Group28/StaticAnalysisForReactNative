package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.view.animation.Animation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ad implements Animation.AnimationListener {
    final /* synthetic */ al a;

    public ad(al alVar) {
        this.a = alVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        al alVar = this.a;
        if (animation == alVar.A) {
            alVar.nf();
        } else if (animation != alVar.B) {
        } else {
            alVar.t.setVisibility(4);
            this.a.K = true;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
