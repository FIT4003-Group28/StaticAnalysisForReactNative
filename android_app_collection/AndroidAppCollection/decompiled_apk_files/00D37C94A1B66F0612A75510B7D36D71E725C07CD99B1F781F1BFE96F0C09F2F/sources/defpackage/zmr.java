package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.edit.camera.GalleryCameraRecordButtonView;
/* compiled from: PG */
/* renamed from: zmr  reason: default package */
/* loaded from: classes4.dex */
final class zmr extends AnimatorListenerAdapter {
    final /* synthetic */ GalleryCameraRecordButtonView a;

    public zmr(GalleryCameraRecordButtonView galleryCameraRecordButtonView) {
        this.a = galleryCameraRecordButtonView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.b.setVisibility(8);
    }
}
