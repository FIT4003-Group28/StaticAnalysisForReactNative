package defpackage;

import android.view.View;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
/* compiled from: PG */
/* renamed from: ulh  reason: default package */
/* loaded from: classes4.dex */
final class ulh implements View.OnAttachStateChangeListener {
    final /* synthetic */ AccountParticleDisc a;
    final /* synthetic */ ujw b;
    final /* synthetic */ uli c;

    public ulh(uli uliVar, AccountParticleDisc accountParticleDisc, ujw ujwVar) {
        this.c = uliVar;
        this.a = accountParticleDisc;
        this.b = ujwVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.c(this.b);
        this.c.E();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.d(this.b);
    }
}
