package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cofb  reason: default package */
/* loaded from: classes.dex */
public final class cofb extends cnuw<cofa> {
    public cofb(Context context, Looper looper, cnum cnumVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 50, cnumVar, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.herrevad.services.LightweightNetworkQualityAndroidService.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 12800000;
    }

    @Override // defpackage.cnui
    public final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
        return queryLocalInterface instanceof cofa ? (cofa) queryLocalInterface : new cofa(iBinder);
    }
}
