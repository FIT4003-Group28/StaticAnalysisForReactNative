package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: btsk  reason: default package */
/* loaded from: classes.dex */
final class btsk implements GoogleApiClient.ConnectionCallbacks {
    @Override // defpackage.cnpv
    public final void Ph(@dzsi Bundle bundle) {
        GoogleApiClient.ConnectionCallbacks connectionCallbacks = btsm.b;
        btsm.a(0);
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
        GoogleApiClient.ConnectionCallbacks connectionCallbacks = btsm.b;
        if (i == 2) {
            btsm.a(3);
        } else if (i != 1) {
            btsm.a(2);
        } else {
            btsm.a(4);
        }
    }
}
