package defpackage;

import android.content.IntentSender;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.ConsentFlowConfig;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bzpq  reason: default package */
/* loaded from: classes4.dex */
public final class bzpq implements cnon<cpdp> {
    @dzsi
    final bzpu a;
    @dzsi
    final awnl b;
    final /* synthetic */ bzpv c;

    public bzpq(bzpv bzpvVar, awnl awnlVar) {
        this.c = bzpvVar;
        this.a = null;
        this.b = new bzpt(awnlVar);
    }

    private final void e(cpdp cpdpVar) {
        if (this.b != null) {
            ConsentFlowConfig consentFlowConfig = new ConsentFlowConfig(false, true, false, 0, 0, true, 0);
            cpde.a(consentFlowConfig);
            cpde.b(consentFlowConfig);
            this.c.d.d(this.b);
            this.c.e.e();
            try {
                cpdpVar.b(this.c.c, ((bzpt) this.b).a.ordinal(), consentFlowConfig);
                return;
            } catch (IntentSender.SendIntentException unused) {
                bzpv.c(this.c.c);
                d();
                return;
            }
        }
        this.a.b();
    }

    @Override // defpackage.cnon
    public final /* bridge */ /* synthetic */ void Om(cpdp cpdpVar) {
        cpdp cpdpVar2 = cpdpVar;
        Status a = cpdpVar2.a();
        if (a.d()) {
            b();
        } else {
            int i = a.g;
            if (i == 4500) {
                e(cpdpVar2);
            } else if (i != 4501) {
                d();
            } else {
                c();
            }
        }
        GoogleApiClient googleApiClient = this.c.a;
        if (googleApiClient != null) {
            googleApiClient.disconnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        awnl awnlVar = this.b;
        if (awnlVar != null) {
            int i = bzpv.f;
            awnlVar.b(this.c.c, -1, null);
            return;
        }
        int i2 = bzpv.f;
        this.a.a();
    }

    public final void c() {
        int i = bzpv.f;
        bzpv.c(this.c.c);
        d();
    }

    public final void d() {
        awnl awnlVar = this.b;
        if (awnlVar != null) {
            awnlVar.b(this.c.c, 0, null);
        }
    }

    public bzpq(bzpv bzpvVar, bzpu bzpuVar) {
        this.c = bzpvVar;
        dbsk.s(bzpuVar);
        this.a = bzpuVar;
        this.b = null;
    }
}
