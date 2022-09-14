package defpackage;

import com.google.android.apps.maps.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.particle.AccountParticle;
/* compiled from: PG */
/* renamed from: cvxo  reason: default package */
/* loaded from: classes5.dex */
public final class cvxo<T> extends acl {
    public final AccountParticle<T> s;
    public final dbsg<cvwn<T>> t;

    public cvxo(AccountParticle accountParticle, cwfn cwfnVar, cvuu cvuuVar, boolean z, dbsg dbsgVar) {
        super(accountParticle);
        this.s = accountParticle;
        this.t = dbsgVar;
        AccountParticleDisc<AccountT> accountParticleDisc = accountParticle.d;
        cvur cvurVar = new cvur(this) { // from class: cvxl
            private final cvxo a;

            {
                this.a = this;
            }

            @Override // defpackage.cvur
            public final void a() {
                this.a.C();
            }
        };
        accountParticle.addOnAttachStateChangeListener(new cvxn(this, accountParticleDisc, cvurVar));
        if (od.ak(accountParticle)) {
            accountParticleDisc.i(cvurVar);
            C();
        }
        accountParticleDisc.setAllowRings(z);
        accountParticle.d.l(cvuuVar, cwfnVar);
        accountParticle.c = new cvwp<>(accountParticle, cwfnVar, dbsgVar);
    }

    public final void C() {
        if (this.s.d.j == null) {
            this.a.setContentDescription(null);
        } else {
            this.a.setContentDescription(this.a.getContext().getString(R.string.og_use_account_a11y_no_period, this.s.c.b()));
        }
    }
}
