package defpackage;

import android.animation.AnimatorSet;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
/* compiled from: PG */
/* renamed from: unc  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class unc implements Runnable {
    public final /* synthetic */ ExpressSignInLayout a;
    private final /* synthetic */ int b;

    public /* synthetic */ unc(ExpressSignInLayout expressSignInLayout) {
        this.a = expressSignInLayout;
    }

    public /* synthetic */ unc(ExpressSignInLayout expressSignInLayout, int i) {
        this.b = i;
        this.a = expressSignInLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            ExpressSignInLayout expressSignInLayout = this.a;
            AnimatorSet animatorSet = expressSignInLayout.q;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            expressSignInLayout.g(true);
            return;
        }
        this.a.j(false);
    }
}
