package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;
/* compiled from: PG */
/* renamed from: covi  reason: default package */
/* loaded from: classes5.dex */
public final class covi extends AnimatorListenerAdapter {
    final /* synthetic */ SelectedAccountNavigationView a;

    public covi(SelectedAccountNavigationView selectedAccountNavigationView) {
        this.a = selectedAccountNavigationView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.c();
        this.a.b();
        this.a.e();
        this.a.H = null;
    }
}
