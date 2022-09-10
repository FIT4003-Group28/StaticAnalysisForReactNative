package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cnpb  reason: default package */
/* loaded from: classes5.dex */
public final class cnpb implements GoogleApiClient.OnConnectionFailedListener {
    public final int a;
    public final GoogleApiClient b;
    public final GoogleApiClient.OnConnectionFailedListener c;
    final /* synthetic */ cnpc d;

    public cnpb(cnpc cnpcVar, int i, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.d = cnpcVar;
        this.a = i;
        this.b = googleApiClient;
        this.c = onConnectionFailedListener;
    }

    @Override // defpackage.cnsi
    public final void Pi(ConnectionResult connectionResult) {
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("beginFailureResolution for ");
        sb.append(valueOf);
        sb.toString();
        this.d.l(connectionResult, this.a);
    }
}
