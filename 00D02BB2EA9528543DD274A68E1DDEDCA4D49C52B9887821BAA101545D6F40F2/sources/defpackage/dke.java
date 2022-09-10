package defpackage;

import android.os.Bundle;
import com.google.android.apps.gmm.ar.api.ArLauncherParams;
/* compiled from: PG */
/* renamed from: dke  reason: default package */
/* loaded from: classes6.dex */
public final class dke implements dfeq<dfgv> {
    @dzsi
    public dfeo a;
    private final gn b;
    private final czh c;
    private final boolean d;
    private final dnv e;

    public dke(ff ffVar, czh czhVar, boolean z, dnv dnvVar) {
        this.b = ffVar.g();
        this.c = czhVar;
        this.d = z;
        this.e = dnvVar;
    }

    @dzsi
    private final dkc c() {
        for (fd fdVar : this.b.q()) {
            if (fdVar instanceof dkc) {
                return (dkc) fdVar;
            }
        }
        return null;
    }

    public final void b() {
        dkc c = c();
        if (c != null) {
            c.f();
        }
    }

    @Override // defpackage.dfeq
    public final /* bridge */ /* synthetic */ void n(@dzsi dfgv dfgvVar) {
        dfgv dfgvVar2 = dfgvVar;
        if (dfgvVar2 == null) {
            return;
        }
        dfgu b = dfgu.b(dfgvVar2.b);
        if (b == null) {
            b = dfgu.NONE;
        }
        if (b != dfgu.FAILED) {
            if (b == dfgu.STOPPED) {
                return;
            }
            b();
            return;
        }
        final dfeo dfeoVar = this.a;
        if (dfeoVar == null) {
            return;
        }
        dfeoVar.b();
        if (c() != null) {
            return;
        }
        dkc dkcVar = new dkc();
        ArLauncherParams p = ArLauncherParams.p(this.c, false, dcdc.e());
        Bundle bundle = new Bundle();
        p.q(bundle);
        bundle.putBoolean("IS_ARLO", this.d);
        bundle.putString("ARG_GEO_AR_SESSION_ID", this.e.a.A());
        dkcVar.B(bundle);
        dkcVar.ar = new Runnable(dfeoVar) { // from class: dkd
            private final dfeo a;

            {
                this.a = dfeoVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        };
        dkcVar.e(this.b, gfu.DIALOG_FRAGMENT.c);
    }
}
