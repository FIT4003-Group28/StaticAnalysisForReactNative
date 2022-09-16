package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cnqt  reason: default package */
/* loaded from: classes5.dex */
final class cnqt implements GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ cnsx a;

    public cnqt(cnsx cnsxVar) {
        this.a = cnsxVar;
    }

    @Override // defpackage.cnsi
    public final void Pi(ConnectionResult connectionResult) {
        this.a.p(new Status(8));
    }
}
