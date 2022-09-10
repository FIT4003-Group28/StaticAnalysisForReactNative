package com.google.android.libraries.onegoogle.accountmenu.gmshead;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class GmsheadAccountsModelUpdater implements e {
    final cwfx a;
    public final cvzg<cwfm> b;
    public final cwfy c;
    public final Handler d = new Handler(Looper.getMainLooper());
    final cwfs e;

    public GmsheadAccountsModelUpdater(cvzg<cwfm> cvzgVar, cwfx cwfxVar, cwfy cwfyVar) {
        dbsk.s(cvzgVar);
        this.b = cvzgVar;
        this.a = cwfxVar;
        this.e = new cwfs(this);
        this.c = cwfyVar == null ? cwft.a : cwfyVar;
    }

    @Override // defpackage.f
    public final void a(m mVar) {
    }

    @Override // defpackage.f
    public final void b(m mVar) {
        g();
        i();
    }

    @Override // defpackage.f
    public final void c(m mVar) {
    }

    @Override // defpackage.f
    public final void d(m mVar) {
    }

    @Override // defpackage.f
    public final void e(m mVar) {
        h();
    }

    @Override // defpackage.f
    public final void f(m mVar) {
    }

    protected abstract void g();

    protected abstract void h();

    public final void i() {
        deha.q(deew.h(deee.g(degp.q(((cwfr) this.a).a.b()), Exception.class, cwfp.a, dege.a), cwfq.a, dege.a), new cwfv(this), dege.a);
    }
}
