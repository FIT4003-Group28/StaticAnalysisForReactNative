package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ckvm  reason: default package */
/* loaded from: classes4.dex */
public final class ckvm implements GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ ckvo a;

    public ckvm(ckvo ckvoVar) {
        this.a = ckvoVar;
    }

    @Override // defpackage.cnsi
    public final void Pi(ConnectionResult connectionResult) {
        if (this.a.c != 2) {
            return;
        }
        if (connectionResult.b()) {
            ckvo ckvoVar = this.a;
            ckvoVar.c = 3;
            ckvoVar.d.a(connectionResult);
            return;
        }
        this.a.e();
    }
}
