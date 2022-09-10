package defpackage;

import android.view.View;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cvxn  reason: default package */
/* loaded from: classes5.dex */
public final class cvxn implements View.OnAttachStateChangeListener {
    final /* synthetic */ AccountParticleDisc a;
    final /* synthetic */ cvur b;
    final /* synthetic */ cvxo c;

    public cvxn(cvxo cvxoVar, AccountParticleDisc accountParticleDisc, cvur cvurVar) {
        this.c = cvxoVar;
        this.a = accountParticleDisc;
        this.b = cvurVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.i(this.b);
        this.c.C();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.j(this.b);
    }
}
