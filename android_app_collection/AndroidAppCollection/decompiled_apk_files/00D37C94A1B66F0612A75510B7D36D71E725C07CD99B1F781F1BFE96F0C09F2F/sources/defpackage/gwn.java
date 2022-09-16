package defpackage;

import android.view.animation.Animation;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsCameraFeatureDescriptionView;
/* compiled from: PG */
/* renamed from: gwn  reason: default package */
/* loaded from: classes3.dex */
public final class gwn implements Animation.AnimationListener {
    final /* synthetic */ ShortsCameraFeatureDescriptionView a;

    public gwn(ShortsCameraFeatureDescriptionView shortsCameraFeatureDescriptionView) {
        this.a = shortsCameraFeatureDescriptionView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.a.setVisibility(0);
    }
}
