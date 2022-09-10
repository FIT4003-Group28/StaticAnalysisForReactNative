package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cpes  reason: default package */
/* loaded from: classes5.dex */
public final class cpes extends cnuw<cpeb> {
    public cpes(Context context, Looper looper, cnum cnumVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 35, cnumVar, connectionCallbacks, onConnectionFailedListener);
        cnwc.n(cnumVar.a, "Must pass an account via UdcOptions or call GoogleApiClient.Builder.setAccount()");
    }

    @Override // defpackage.cnui
    public final boolean M() {
        return true;
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.udc.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.udc.internal.IUdcService";
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.udc.internal.IUdcService");
        return queryLocalInterface instanceof cpeb ? (cpeb) queryLocalInterface : new cpeb(iBinder);
    }
}
