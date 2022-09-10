package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
/* compiled from: PG */
/* renamed from: cvyo  reason: default package */
/* loaded from: classes.dex */
public final class cvyo<T> {
    public final cvze<T> a;
    public final SelectedAccountDisc<T> b;
    public final cvzf<T> c = new cvyn(this);
    public final cvzm d = new cvzm(this) { // from class: cvyf
        private final cvyo a;

        {
            this.a = this;
        }

        @Override // defpackage.cvzm
        public final void a(boolean z) {
            this.a.c(z);
        }
    };
    public final cvur<T> e = new cvur(this) { // from class: cvyg
        private final cvyo a;

        {
            this.a = this;
        }

        @Override // defpackage.cvur
        public final void a() {
            this.a.d();
        }
    };
    private final cvyt<T> f;

    public cvyo(SelectedAccountDisc<T> selectedAccountDisc, cvze<T> cvzeVar) {
        dbsk.s(cvzeVar);
        this.a = cvzeVar;
        dbsk.s(selectedAccountDisc);
        this.b = selectedAccountDisc;
        this.f = new cvyt<>(cvzeVar, selectedAccountDisc);
    }

    public final void a() {
        final cvzg<T> a = this.a.a();
        if (a.a) {
            cwjf.a(new Runnable(this, a) { // from class: cvyh
                private final cvyo a;
                private final cvzg b;

                {
                    this.a = this;
                    this.b = a;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cvyo cvyoVar = this.a;
                    cvyoVar.b.b.setAccount(this.b.e());
                    cvyoVar.b.e = (View.OnTouchListener) cvyoVar.e().f();
                    cvyoVar.d();
                }
            });
        }
    }

    public final void b(T t) {
        cwjw<T> e = this.a.e();
        dtga bZ = dtgb.g.bZ();
        dtgh dtghVar = dtgh.ACCOUNT_PARTICLE_DISC_COMPONENT;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtgb dtgbVar = (dtgb) bZ.b;
        dtgbVar.c = dtghVar.u;
        dtgbVar.a |= 2;
        dtgb dtgbVar2 = (dtgb) bZ.b;
        dtgbVar2.e = 8;
        dtgbVar2.a |= 32;
        dtgb dtgbVar3 = (dtgb) bZ.b;
        dtgbVar3.d = 3;
        dtgbVar3.a = 8 | dtgbVar3.a;
        dtgb dtgbVar4 = (dtgb) bZ.b;
        dtgbVar4.b = 36;
        dtgbVar4.a |= 1;
        e.a(t, bZ.bK());
    }

    public final void c(final boolean z) {
        cwjf.a(new Runnable(this, z) { // from class: cvyi
            private final cvyo a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cvyo cvyoVar = this.a;
                boolean z2 = this.b;
                SelectedAccountDisc<T> selectedAccountDisc = cvyoVar.b;
                int i = 0;
                selectedAccountDisc.b.setVisibility(true != z2 ? 0 : 8);
                ImageView imageView = selectedAccountDisc.a;
                if (true != z2) {
                    i = 8;
                }
                imageView.setVisibility(i);
                cvyoVar.b.e = (View.OnTouchListener) cvyoVar.e().f();
                cvyoVar.d();
            }
        });
    }

    public final void d() {
        cvzg<T> a = this.a.a();
        if (!a.a) {
            cwjf.a(new Runnable(this) { // from class: cvyj
                private final cvyo a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cvyo cvyoVar = this.a;
                    cvyoVar.b.setContentDescription(null);
                    od.m(cvyoVar.b, 4);
                }
            });
            return;
        }
        final String str = "";
        if (!this.a.g().a() || !this.a.g().b().a) {
            if (a.c() > 0) {
                T e = a.e();
                if (e != null) {
                    AccountParticleDisc<T> accountParticleDisc = this.b.b;
                    T t = accountParticleDisc.j;
                    this.a.o();
                    String m = accountParticleDisc.m();
                    if (!m.isEmpty()) {
                        str = String.valueOf(this.b.getContext().getString(R.string.og_signed_in_as_account, m)).concat("\n");
                    }
                    e.equals(t);
                }
                String valueOf = String.valueOf(str);
                String valueOf2 = String.valueOf(this.b.getContext().getString(R.string.og_account_particle_disc_not_signed_in_a11y));
                str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            } else {
                str = this.b.getContext().getString(R.string.og_account_particle_disc_no_accounts_available_a11y);
            }
        } else {
            cwef f = this.a.c().a().f();
            if (f != null) {
                str = this.b.getContext().getString(f.c());
            }
        }
        cwjf.a(new Runnable(this, str) { // from class: cvyk
            private final cvyo a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cvyo cvyoVar = this.a;
                cvyoVar.b.setContentDescription(this.b);
                od.m(cvyoVar.b, 1);
            }
        });
    }

    public final dbsg<cvyt<T>> e() {
        if ((this.a.g().a() && this.a.g().b().a) || this.a.a().e() == null) {
            return dbpy.a;
        }
        return dbsg.i(this.f);
    }
}
