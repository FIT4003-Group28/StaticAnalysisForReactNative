package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: damb  reason: default package */
/* loaded from: classes5.dex */
class damb<T> extends damk {
    final dane<T> a;
    final /* synthetic */ damc b;

    public damb(damc damcVar, dane<T> daneVar) {
        this.b = damcVar;
        this.a = daneVar;
    }

    public void b(Bundle bundle) {
        this.b.c.b();
        damc.a.c("onDeferredLanguageInstall", new Object[0]);
    }

    public void c(Bundle bundle) {
        this.b.c.b();
        damc.a.c("onDeferredLanguageUninstall", new Object[0]);
    }

    public void d(int i, Bundle bundle) {
        this.b.c.b();
        damc.a.c("onStartInstall(%d)", Integer.valueOf(i));
    }

    @Override // defpackage.daml
    public final void e(Bundle bundle) {
        this.b.c.b();
        int i = bundle.getInt("error_code");
        damc.a.b("onError(%d)", Integer.valueOf(i));
        this.a.a(new dalb(i));
    }

    @Override // defpackage.daml
    public final void f(int i) {
        this.b.c.b();
        damc.a.c("onCancelInstall(%d)", Integer.valueOf(i));
    }

    @Override // defpackage.daml
    public final void g(int i) {
        this.b.c.b();
        damc.a.c("onCompleteInstall(%d)", Integer.valueOf(i));
    }

    @Override // defpackage.daml
    public final void h() {
        this.b.c.b();
        damc.a.c("onCompleteInstallForAppUpdate", new Object[0]);
    }

    @Override // defpackage.daml
    public final void i() {
        this.b.c.b();
        damc.a.c("onDeferredInstall", new Object[0]);
    }

    @Override // defpackage.daml
    public final void j() {
        this.b.c.b();
        damc.a.c("onDeferredUninstall", new Object[0]);
    }

    @Override // defpackage.daml
    public final void k(int i) {
        this.b.c.b();
        damc.a.c("onGetSession(%d)", Integer.valueOf(i));
    }

    @Override // defpackage.daml
    public final void l() {
        this.b.c.b();
        damc.a.c("onGetSessionStates", new Object[0]);
    }

    @Override // defpackage.daml
    public final void m() {
        this.b.c.b();
        damc.a.c("onGetSplitsForAppUpdate", new Object[0]);
    }
}
