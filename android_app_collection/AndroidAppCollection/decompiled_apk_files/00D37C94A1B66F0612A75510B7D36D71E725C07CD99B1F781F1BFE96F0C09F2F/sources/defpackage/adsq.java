package defpackage;

import android.view.animation.Animation;
import com.google.android.libraries.youtube.mdx.smartremote.MicrophoneView;
/* compiled from: PG */
/* renamed from: adsq  reason: default package */
/* loaded from: classes.dex */
public final class adsq implements Animation.AnimationListener {
    final /* synthetic */ MicrophoneView a;

    public adsq(MicrophoneView microphoneView) {
        this.a = microphoneView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.b.setAlpha(0.0f);
        this.a.c();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.a.b.setAlpha(1.0f);
    }
}
