package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqer  reason: default package */
/* loaded from: classes5.dex */
public final class cqer implements GoogleApiClient.ConnectionCallbacks {
    final /* synthetic */ GoogleApiClient a;
    final /* synthetic */ Account b;
    final /* synthetic */ cqet c;

    public cqer(GoogleApiClient googleApiClient, Account account, cqet cqetVar) {
        this.a = googleApiClient;
        this.b = account;
        this.c = cqetVar;
    }

    @Override // defpackage.cnpv
    public final void Ph(Bundle bundle) {
        Api<cnnv> api = coqk.a;
        cnoh<cora> c = corc.c(this.a, this.b);
        final GoogleApiClient googleApiClient = this.a;
        final cqet cqetVar = this.c;
        c.i(new cnon(googleApiClient, cqetVar) { // from class: cqeq
            private final GoogleApiClient a;
            private final cqet b;

            {
                this.a = googleApiClient;
                this.b = cqetVar;
            }

            @Override // defpackage.cnon
            public final void Om(cnom cnomVar) {
                cqeo cqeoVar;
                GoogleApiClient googleApiClient2 = this.a;
                cqet cqetVar2 = this.b;
                cora coraVar = (cora) cnomVar;
                googleApiClient2.disconnect();
                if (!coraVar.a.d()) {
                    cqes cqesVar = cqeu.a;
                    coraVar.a.toString();
                    cqetVar2.a(cqeu.a);
                    return;
                }
                cqes cqesVar2 = cqeu.a;
                if (coraVar.h()) {
                    cqeoVar = cqeo.ALREADY_CONSENTED;
                } else if (!coraVar.f() || !coraVar.j()) {
                    cqeoVar = cqeo.CANNOT_CONSENT;
                } else {
                    cqeoVar = cqeo.CAN_ASK_FOR_CONSENT;
                }
                if (cqeoVar == cqeo.CANNOT_CONSENT && coraVar.i() != 3500) {
                    coraVar.i();
                }
                cqetVar2.a(cqes.d(cqeoVar, coraVar.e(), coraVar.c()));
            }
        });
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
        cqes cqesVar = cqeu.a;
    }
}
