package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cnqn  reason: default package */
/* loaded from: classes5.dex */
final class cnqn implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ cnqp a;

    public cnqn(cnqp cnqpVar) {
        this.a = cnqpVar;
    }

    @Override // defpackage.cnpv
    public final void Ph(Bundle bundle) {
        cnum cnumVar = this.a.j;
        cnwc.a(cnumVar);
        if (cnumVar.h) {
            this.a.b.lock();
            try {
                cnqp cnqpVar = this.a;
                coza cozaVar = cnqpVar.e;
                if (cozaVar != null) {
                    cozaVar.d(new cnqm(cnqpVar));
                    return;
                } else {
                    cnqpVar.b.unlock();
                    return;
                }
            } finally {
                this.a.b.unlock();
            }
        }
        coza cozaVar2 = this.a.e;
        cnwc.a(cozaVar2);
        cozaVar2.d(new cnqm(this.a));
    }

    @Override // defpackage.cnsi
    public final void Pi(ConnectionResult connectionResult) {
        this.a.b.lock();
        try {
            if (this.a.m(connectionResult)) {
                this.a.l();
                this.a.j();
            } else {
                this.a.n(connectionResult);
            }
        } finally {
            this.a.b.unlock();
        }
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
    }
}
