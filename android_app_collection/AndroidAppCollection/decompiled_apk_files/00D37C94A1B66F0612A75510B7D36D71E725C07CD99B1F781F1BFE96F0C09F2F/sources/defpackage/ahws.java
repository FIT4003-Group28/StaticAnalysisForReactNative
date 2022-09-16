package defpackage;

import android.animation.ValueAnimator;
import com.google.android.libraries.youtube.player.features.markers.HeatMarkerView;
/* compiled from: PG */
/* renamed from: ahws  reason: default package */
/* loaded from: classes.dex */
public final class ahws implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ HeatMarkerView a;

    public ahws(HeatMarkerView heatMarkerView) {
        this.a = heatMarkerView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.invalidate();
    }
}
