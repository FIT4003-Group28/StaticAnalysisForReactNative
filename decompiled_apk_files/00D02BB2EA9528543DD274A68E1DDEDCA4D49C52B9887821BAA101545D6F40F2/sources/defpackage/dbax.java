package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.ar.core.InstallActivity;
/* compiled from: PG */
/* renamed from: dbax  reason: default package */
/* loaded from: classes5.dex */
public final class dbax extends AnimatorListenerAdapter {
    final /* synthetic */ InstallActivity a;

    public dbax(InstallActivity installActivity) {
        this.a = installActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.showSpinner();
    }
}
