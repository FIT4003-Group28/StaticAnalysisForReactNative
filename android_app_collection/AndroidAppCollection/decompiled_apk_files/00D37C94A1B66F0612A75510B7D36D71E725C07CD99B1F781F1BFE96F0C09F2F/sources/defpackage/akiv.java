package defpackage;

import android.view.animation.Animation;
import com.google.android.libraries.youtube.search.voice.MicrophoneView;
/* compiled from: PG */
/* renamed from: akiv  reason: default package */
/* loaded from: classes.dex */
public final class akiv implements Animation.AnimationListener {
    final /* synthetic */ MicrophoneView a;

    public akiv(MicrophoneView microphoneView) {
        this.a = microphoneView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.a.setAlpha(0.0f);
        this.a.i();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.a.a.setAlpha(1.0f);
    }
}
