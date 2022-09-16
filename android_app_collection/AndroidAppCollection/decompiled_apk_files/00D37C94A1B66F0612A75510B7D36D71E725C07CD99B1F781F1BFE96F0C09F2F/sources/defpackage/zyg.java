package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.edit.ui.SegmentedControl;
/* compiled from: PG */
/* renamed from: zyg  reason: default package */
/* loaded from: classes4.dex */
public final class zyg extends AnimatorListenerAdapter {
    final /* synthetic */ SegmentedControl a;

    public zyg(SegmentedControl segmentedControl) {
        this.a = segmentedControl;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        SegmentedControl segmentedControl = this.a;
        segmentedControl.f(segmentedControl.b.getX());
    }
}
