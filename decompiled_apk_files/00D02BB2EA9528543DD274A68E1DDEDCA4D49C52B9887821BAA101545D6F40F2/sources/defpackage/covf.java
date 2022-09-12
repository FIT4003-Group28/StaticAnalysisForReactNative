package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;
/* compiled from: PG */
/* renamed from: covf  reason: default package */
/* loaded from: classes5.dex */
public final class covf extends AnimatorListenerAdapter {
    final /* synthetic */ SelectedAccountNavigationView a;

    public covf(SelectedAccountNavigationView selectedAccountNavigationView) {
        this.a = selectedAccountNavigationView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.d.q.setVisibility(8);
        this.a.d.n.setVisibility(8);
        ImageView imageView = this.a.d.r;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        this.a.b();
        this.a.e();
        this.a.H = null;
    }
}
