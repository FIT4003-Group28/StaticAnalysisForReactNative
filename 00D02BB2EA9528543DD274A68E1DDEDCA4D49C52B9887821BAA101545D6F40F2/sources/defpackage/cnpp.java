package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cnpp  reason: default package */
/* loaded from: classes.dex */
public final class cnpp implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public final Api<?> a;
    public cnpq b;
    private final boolean c;

    public cnpp(Api<?> api, boolean z) {
        this.a = api;
        this.c = z;
    }

    private final cnpq c() {
        cnwc.n(this.b, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.b;
    }

    @Override // defpackage.cnpv
    public final void Ph(Bundle bundle) {
        c().Ph(bundle);
    }

    @Override // defpackage.cnsi
    public final void Pi(ConnectionResult connectionResult) {
        cnpq c = c();
        Api<?> api = this.a;
        boolean z = this.c;
        cnrb cnrbVar = (cnrb) c;
        cnrbVar.a.lock();
        try {
            ((cnrb) c).k.f(connectionResult, api, z);
        } finally {
            cnrbVar.a.unlock();
        }
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
        c().Pj(i);
    }
}
