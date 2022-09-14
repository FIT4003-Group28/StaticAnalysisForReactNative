package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cvld  reason: default package */
/* loaded from: classes5.dex */
public final class cvld implements cvkt, cvle {
    private final cvjs a;
    private final cvtz b;
    private final cvpp c;
    private final cvnp d;
    private final Set<cvpv> e;
    private final cvtq f;

    public cvld(cvjs cvjsVar, cvtq cvtqVar, cvtz cvtzVar, cvpp cvppVar, cvnp cvnpVar, Set set) {
        this.a = cvjsVar;
        this.f = cvtqVar;
        this.b = cvtzVar;
        this.c = cvppVar;
        this.d = cvnpVar;
        this.e = set;
    }

    @Override // defpackage.cvkt
    public final boolean a(Intent intent) {
        return intent != null && ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction()) || "android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction()));
    }

    @Override // defpackage.cvkt
    public final void b(Intent intent, cvix cvixVar, long j) {
        cvlw.a("RestartIntentHandler", "Re-surface notifications and sync registrations due to Restart Intent", new Object[0]);
        if (this.a.e() != null) {
            int o = this.a.e().o();
            int i = o - 1;
            if (o == 0) {
                throw null;
            }
            if (i == 0) {
                this.b.b();
            } else if (i == 1) {
                if (dxya.a.a().c()) {
                    try {
                        this.d.a(null, 10, "restart_job_handler_key", new Bundle());
                    } catch (cvno unused) {
                        cvlw.f("RestartIntentHandler", "Unable to schedule task for refreshing notifications.", new Object[0]);
                    }
                } else {
                    this.b.c(cvixVar);
                }
            }
        }
        dcpd it = ((dcnn) this.e).iterator();
        while (it.hasNext()) {
            ((cvpv) it.next()).a();
        }
        this.f.a("android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction()) ? 3 : 2);
        this.c.a();
    }

    @Override // defpackage.cvle
    public final String c() {
        return "restart_job_handler_key";
    }

    @Override // defpackage.cvle
    public final cviw d(Bundle bundle) {
        this.b.c(cvix.d());
        return cviw.a;
    }
}
