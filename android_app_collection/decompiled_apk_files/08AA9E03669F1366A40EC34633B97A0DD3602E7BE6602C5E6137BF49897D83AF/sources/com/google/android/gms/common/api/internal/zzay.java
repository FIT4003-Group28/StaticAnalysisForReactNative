package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
final class zzay implements GoogleApiClient.OnConnectionFailedListener {
    private final /* synthetic */ StatusPendingResult zziv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzay(zzav zzavVar, StatusPendingResult statusPendingResult) {
        this.zziv = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zziv.setResult(new Status(8));
    }
}
