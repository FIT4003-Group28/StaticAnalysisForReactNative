package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cnww  reason: default package */
/* loaded from: classes5.dex */
public final class cnww extends cnuw<cnxa> {
    public cnww(Context context, Looper looper, cnum cnumVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 39, cnumVar, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // defpackage.cnui
    public final String a() {
        return "com.google.android.gms.common.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        return queryLocalInterface instanceof cnxa ? (cnxa) queryLocalInterface : new cnxa(iBinder);
    }
}
