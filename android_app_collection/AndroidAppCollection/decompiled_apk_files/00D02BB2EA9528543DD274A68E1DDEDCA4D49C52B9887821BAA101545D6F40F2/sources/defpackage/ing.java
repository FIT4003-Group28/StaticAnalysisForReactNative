package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
/* compiled from: PG */
/* renamed from: ing  reason: default package */
/* loaded from: classes.dex */
public final class ing {
    public final cjqy a;
    public final cjqq b;
    public SelectedAccountDisc<cwfm> c;
    private final gga d;
    private final ina e;
    private boolean f = false;

    public ing(gga ggaVar, cjqy cjqyVar, cjqq cjqqVar, ina inaVar) {
        this.d = ggaVar;
        this.e = inaVar;
        this.a = cjqyVar;
        this.b = cjqqVar;
    }

    public final void a() {
        SelectedAccountDisc<cwfm> selectedAccountDisc;
        bvrj.UI_THREAD.c();
        if (this.c == null) {
            return;
        }
        ViewGroup c = c();
        b(true);
        if (c == null || c.getVisibility() != 0 || (selectedAccountDisc = this.c) == null) {
            return;
        }
        c.addView(selectedAccountDisc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(boolean z) {
        if (z || !this.f) {
            this.c = (SelectedAccountDisc) LayoutInflater.from(this.d).inflate(R.layout.selected_account_disc_open_search_bar, (ViewGroup) null);
            gga ggaVar = this.d;
            cvze<cwfm> a = this.e.a();
            SelectedAccountDisc<cwfm> selectedAccountDisc = this.c;
            czhz.b();
            final cwak cwakVar = new cwak(ggaVar, a, selectedAccountDisc);
            czhz.b();
            rb rbVar = cwakVar.a;
            rbVar.g();
            rb rbVar2 = cwakVar.a;
            cvze<T> cvzeVar = cwakVar.b;
            FrameLayout frameLayout = cwakVar.c;
            czhz.b();
            final cwai cwaiVar = new cwai(frameLayout, new cwad(rbVar2.g(), cvzeVar), cvzeVar);
            cwakVar.b.c().g().a();
            cvyo<T> cvyoVar = cwakVar.d;
            SelectedAccountDisc<T> selectedAccountDisc2 = cvyoVar.b;
            cvze<T> cvzeVar2 = cvyoVar.a;
            selectedAccountDisc2.f = cvzeVar2;
            selectedAccountDisc2.b.setAllowRings(cvzeVar2.f().c());
            AccountParticleDisc<T> accountParticleDisc = selectedAccountDisc2.b;
            cvuu h = cvzeVar2.h();
            cwfn o = cvzeVar2.o();
            cvzeVar2.i();
            accountParticleDisc.l(h, o);
            cvzeVar2.k().f(selectedAccountDisc2, cvzeVar2.j());
            int dimensionPixelSize = (selectedAccountDisc2.getResources().getDimensionPixelSize(R.dimen.og_apd_default_disc_min_touch_target_size) - selectedAccountDisc2.b.h()) / 2;
            if (cvzeVar2.c().a().a()) {
                selectedAccountDisc2.a.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                selectedAccountDisc2.a.setImageDrawable(cvzeVar2.c().a().b().d(selectedAccountDisc2.getContext(), new cwgf(selectedAccountDisc2.getContext())));
            }
            cvyl cvylVar = new cvyl(cvyoVar);
            cvym cvymVar = new cvym(cvyoVar);
            cvyoVar.b.addOnAttachStateChangeListener(cvylVar);
            cvyoVar.b.addOnAttachStateChangeListener(cvymVar);
            if (od.ak(cvyoVar.b)) {
                cvylVar.onViewAttachedToWindow(cvyoVar.b);
                cvymVar.onViewAttachedToWindow(cvyoVar.b);
            }
            dbsg e = cwakVar.b.c().e();
            if (e.a() && cwakVar.b.f().c()) {
                SelectedAccountDisc<T> selectedAccountDisc3 = cwakVar.c;
                cweb cwebVar = (cweb) e.b();
                AccountParticleDisc<T> accountParticleDisc2 = selectedAccountDisc3.b;
                if (accountParticleDisc2.i == null && !accountParticleDisc2.m && cwebVar.c() != null && !cwebVar.c().isEmpty()) {
                    cwbd cwbdVar = new cwbd(selectedAccountDisc3.getContext(), cwebVar.c(), rbVar);
                    selectedAccountDisc3.b.setBadgeRetriever(cwbdVar.c);
                    selectedAccountDisc3.b.setRingRetriever(cwbdVar.d);
                    selectedAccountDisc3.g = true;
                }
            }
            cwaiVar.d = new Runnable(cwakVar) { // from class: cwaj
                private final cwak a;

                {
                    this.a = cwakVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cwak cwakVar2 = this.a;
                    cwjw e2 = cwakVar2.b.e();
                    Object e3 = cwakVar2.b.a().e();
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
                    dtgbVar4.b = 32;
                    dtgbVar4.a |= 1;
                    e2.a(e3, bZ.bK());
                }
            };
            czhz.b();
            cwah cwahVar = new cwah(cwaiVar, new cwag(cwaiVar));
            cwaiVar.a.addOnAttachStateChangeListener(cwahVar);
            if (od.ak(cwaiVar.a)) {
                cwahVar.onViewAttachedToWindow(cwaiVar.a);
            }
            cwaiVar.a.setEnabled(cwaiVar.b.a);
            cwad<AccountT> cwadVar = cwaiVar.c;
            final cwac cwacVar = new cwac(cwadVar.b, cwadVar.a);
            cwaiVar.a.setOnClickListener(new View.OnClickListener(cwaiVar, cwacVar) { // from class: cwae
                private final cwai a;
                private final cwac b;

                {
                    this.a = cwaiVar;
                    this.b = cwacVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cwai cwaiVar2 = this.a;
                    cwac cwacVar2 = this.b;
                    Runnable runnable = cwaiVar2.d;
                    if (runnable != null) {
                        runnable.run();
                    }
                    czhz.b();
                    czhz.b();
                    cwql b = cwac.b(cwacVar2.a);
                    if (b == null) {
                        b = new cwql();
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("accountMenuFlavorsStyle", true);
                        b.B(bundle);
                        cwacVar2.a(b);
                    }
                    if (b.S() || cwacVar2.a.J()) {
                        return;
                    }
                    gn gnVar = cwacVar2.a;
                    String str = cwql.ad;
                    b.e = false;
                    b.f = true;
                    gz b2 = gnVar.b();
                    b2.y(b, str);
                    b2.g();
                }
            });
            this.c.setCustomClickListener(new View.OnClickListener(this) { // from class: inf
                private final ing a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cjql e2;
                    ing ingVar = this.a;
                    SelectedAccountDisc<cwfm> selectedAccountDisc4 = ingVar.c;
                    if (selectedAccountDisc4 == null) {
                        return;
                    }
                    ViewParent parent = selectedAccountDisc4.getParent();
                    if ((parent instanceof ViewGroup) && (e2 = cjqg.e((ViewGroup) parent)) != null) {
                        ingVar.a.n(e2, new cjte(deaf.TAP), cjtd.a(dtxx.ca));
                    }
                    ingVar.b.g().d(cjtd.a(dtxv.r));
                    ingVar.b.g().d(cjtd.a(dtxv.u));
                    ingVar.b.g().d(cjtd.a(dtxv.o));
                }
            });
            this.f = true;
        }
    }

    @dzsi
    public final ViewGroup c() {
        SelectedAccountDisc<cwfm> selectedAccountDisc = this.c;
        if (selectedAccountDisc == null) {
            return null;
        }
        ViewParent parent = selectedAccountDisc.getParent();
        if (!(parent instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        viewGroup.removeView(this.c);
        return viewGroup;
    }
}
