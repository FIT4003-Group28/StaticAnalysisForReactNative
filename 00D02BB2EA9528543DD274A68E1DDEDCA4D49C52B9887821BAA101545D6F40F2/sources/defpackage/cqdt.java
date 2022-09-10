package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.reporting.OptInRequest;
/* compiled from: PG */
/* renamed from: cqdt  reason: default package */
/* loaded from: classes5.dex */
final class cqdt implements GoogleApiClient.ConnectionCallbacks {
    final /* synthetic */ GoogleApiClient a;
    final /* synthetic */ Account b;
    final /* synthetic */ String c;
    final /* synthetic */ cqei d;

    public cqdt(GoogleApiClient googleApiClient, Account account, String str, cqei cqeiVar) {
        this.a = googleApiClient;
        this.b = account;
        this.c = str;
        this.d = cqeiVar;
    }

    @Override // defpackage.cnpv
    public final void Ph(Bundle bundle) {
        Api<cnnv> api = coqk.a;
        GoogleApiClient googleApiClient = this.a;
        coqb coqbVar = new coqb(this.b);
        coqbVar.b = this.c;
        cnpg execute = googleApiClient.execute(new coqv(googleApiClient, new OptInRequest(coqbVar)));
        final cqei cqeiVar = this.d;
        final GoogleApiClient googleApiClient2 = this.a;
        execute.i(new cnon(cqeiVar, googleApiClient2) { // from class: cqds
            private final GoogleApiClient a;
            private final cqei b;

            {
                this.b = cqeiVar;
                this.a = googleApiClient2;
            }

            @Override // defpackage.cnon
            public final void Om(cnom cnomVar) {
                final cqei cqeiVar2 = this.b;
                GoogleApiClient googleApiClient3 = this.a;
                try {
                    if (!((Status) cnomVar).d()) {
                        cqeiVar2.a();
                    } else {
                        new cqem().execute(new Runnable(cqeiVar2) { // from class: cqeg
                            private final cqei a;

                            {
                                this.a = cqeiVar2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.b.c(cqek.CONSENT_WRITTEN);
                            }
                        });
                    }
                } finally {
                    googleApiClient3.disconnect();
                }
            }
        });
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
    }
}
