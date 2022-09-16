package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.video.trim.VideoTrimView;
/* compiled from: PG */
/* renamed from: vwc  reason: default package */
/* loaded from: classes4.dex */
public final class vwc extends AnimatorListenerAdapter {
    final /* synthetic */ vvk a;
    final /* synthetic */ VideoTrimView b;

    public vwc(VideoTrimView videoTrimView, vvk vvkVar) {
        this.b = videoTrimView;
        this.a = vvkVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.i(this.a);
    }
}
