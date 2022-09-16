package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: coek  reason: default package */
/* loaded from: classes5.dex */
public final class coek extends cnuw<coen> {
    public coek(Context context, Looper looper, cnum cnumVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 63, cnumVar, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.googlehelp.service.GoogleHelpService.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 11925000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        return queryLocalInterface instanceof coen ? (coen) queryLocalInterface : new coen(iBinder);
    }
}
