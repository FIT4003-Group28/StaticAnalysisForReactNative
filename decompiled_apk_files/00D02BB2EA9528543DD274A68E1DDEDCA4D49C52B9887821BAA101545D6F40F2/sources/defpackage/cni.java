package defpackage;

import android.content.Context;
import com.google.android.apps.auto.sdk.nav.ClientMode;
import com.google.android.apps.auto.sdk.nav.NavigationClientConfig;
import com.google.android.apps.auto.sdk.nav.NavigationProviderConfig;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cni  reason: default package */
/* loaded from: classes.dex */
public final class cni extends cnf {
    final /* synthetic */ cnj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cni(cnj cnjVar, Context context) {
        super(context);
        this.a = cnjVar;
    }

    private final <T> T h(cne<T> cneVar) {
        if (cneVar != null && i()) {
            return cneVar.a();
        }
        return null;
    }

    private final boolean i() {
        synchronized (this.a) {
            return this.a.a != null;
        }
    }

    @Override // defpackage.cnd
    public final NavigationProviderConfig b() {
        return new NavigationProviderConfig(this.a.d(), this.a.e());
    }

    @Override // defpackage.cnd
    public final void c(NavigationClientConfig navigationClientConfig) {
        synchronized (this.a) {
            this.a.a = navigationClientConfig;
            ArrayList<cne> arrayList = new ArrayList();
            arrayList.add(this.a.b());
            arrayList.add(this.a.c());
            for (cne cneVar : arrayList) {
                if (cneVar != null) {
                    cneVar.a = navigationClientConfig;
                }
            }
        }
    }

    @Override // defpackage.cnd
    public final void d(final ClientMode clientMode) {
        if (!i()) {
            return;
        }
        this.a.b.a(new Runnable(this, clientMode) { // from class: cng
            private final cni a;
            private final ClientMode b;

            {
                this.a = this;
                this.b = clientMode;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cni cniVar = this.a;
                cniVar.a.f(this.b);
            }
        });
    }

    @Override // defpackage.cnd
    public final void e() {
        if (!i()) {
            return;
        }
        final cnj cnjVar = this.a;
        cnjVar.b.a(new Runnable(cnjVar) { // from class: cnh
            private final cnj a;

            {
                this.a = cnjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.g();
            }
        });
    }

    @Override // defpackage.cnd
    public final cnw f() {
        return (cnw) h(this.a.b());
    }

    @Override // defpackage.cnd
    public final cob g() {
        return (cob) h(this.a.c());
    }
}
