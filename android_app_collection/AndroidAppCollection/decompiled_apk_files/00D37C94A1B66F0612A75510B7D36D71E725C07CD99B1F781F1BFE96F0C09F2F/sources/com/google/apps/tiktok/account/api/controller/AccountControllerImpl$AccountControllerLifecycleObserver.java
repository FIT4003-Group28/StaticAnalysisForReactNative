package com.google.apps.tiktok.account.api.controller;

import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AccountControllerImpl$AccountControllerLifecycleObserver implements f, amaf {
    public final /* synthetic */ alzt a;
    private boolean b;
    private boolean c = false;
    private Bundle d;

    public AccountControllerImpl$AccountControllerLifecycleObserver(alzt alztVar) {
        this.a = alztVar;
    }

    @Override // defpackage.amaf
    public final ankt g() {
        alzt alztVar = this.a;
        alztVar.n = true;
        if (alztVar.m || alztVar.b.g() || this.a.b.f()) {
            return anlz.q(null);
        }
        return this.a.e();
    }

    @Override // defpackage.f, defpackage.g
    public final void kG(apy apyVar) {
        this.a.j();
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        String sb;
        this.a.b.d(new alzs(this, 1), new alzs(this));
        alzt alztVar = this.a;
        if (alztVar.k == null) {
            alztVar.k = ambj.a().a();
        }
        if (this.a.b.a().hasExtra("$tiktok$for_requirement_activity")) {
            amuk b = this.a.e.b();
            if (b.isEmpty()) {
                sb = "";
            } else {
                String valueOf = String.valueOf(b);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 15);
                sb2.append(" Requirements: ");
                sb2.append(valueOf);
                sb = sb2.toString();
            }
            String valueOf2 = String.valueOf(sb);
            IllegalStateException illegalStateException = new IllegalStateException(valueOf2.length() != 0 ? "Requirement activity's AccountController should be set up with an empty list of account requirements. Did you forget to set the AccountController with Config.forRequirementActivity?".concat(valueOf2) : new String("Requirement activity's AccountController should be set up with an empty list of account requirements. Did you forget to set the AccountController with Config.forRequirementActivity?"));
            if (this.a.h) {
                ((amzw) ((amzw) ((amzw) alzt.a.f()).h(illegalStateException)).i("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$AccountControllerLifecycleObserver", "onCreate", (char) 560, "AccountControllerImpl.java")).q("The requirement activity bit is set while the requirements are not overridden with an empty list. If the activity is not a requirement Activity, then it's likely the app is started by another malicious app which sets the requirement activity bit in the Intent");
            } else {
                throw illegalStateException;
            }
        }
        Bundle a = this.a.p.getSavedStateRegistry().c ? this.a.p.getSavedStateRegistry().a("tiktok_account_controller_saved_instance_state") : null;
        this.d = a;
        boolean z = false;
        if (a == null || (!this.a.g && a.getBoolean("tiktok_accounts_disabled"))) {
            z = true;
        }
        this.b = z;
        if (z) {
            alzt alztVar2 = this.a;
            aopa createBuilder = alzu.a.createBuilder();
            createBuilder.copyOnWrite();
            alzu alzuVar = (alzu) createBuilder.instance;
            alzuVar.b = 1 | alzuVar.b;
            alzuVar.c = -1;
            alztVar2.l = (alzu) createBuilder.mo39build();
            alzt alztVar3 = this.a;
            alztVar3.o = alztVar3.d(alztVar3.k.c);
        } else {
            this.a.l = (alzu) aphq.j(this.d, "state_latest_operation", alzu.a, aoos.a());
            this.a.m = this.d.getBoolean("state_pending_op");
        }
        alzt alztVar4 = this.a;
        alztVar4.d.g(alztVar4.j);
        this.a.f.a(this);
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.a.f.b(this);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (this.c) {
            this.a.j();
            return;
        }
        this.c = true;
        if (this.b) {
            aqxo.q(true ^ this.a.c.j(), "Should not have account before initial start.");
            alzt alztVar = this.a;
            alztVar.o.getClass();
            Bundle bundle = this.d;
            if (bundle != null && !alztVar.g && bundle.getBoolean("tiktok_accounts_disabled")) {
                this.a.c.h();
            }
            alzt alztVar2 = this.a;
            alztVar2.h(alztVar2.o);
            this.a.o = null;
        } else {
            ActivityAccountState activityAccountState = this.a.c;
            AccountId b = AccountId.b(activityAccountState.g());
            ActivityAccountState activityAccountState2 = this.a.c;
            uwp.f();
            ambp ambpVar = activityAccountState2.e;
            activityAccountState.i();
            if (activityAccountState.j()) {
                activityAccountState.a.a(b, ambpVar);
            }
            this.a.n = this.d.getBoolean("state_do_not_revalidate");
            this.a.j();
        }
        Bundle bundle2 = this.d;
        if (bundle2 != null && this.a.g && !bundle2.getBoolean("tiktok_accounts_disabled")) {
            this.a.c.l();
        }
        this.d = null;
    }
}
