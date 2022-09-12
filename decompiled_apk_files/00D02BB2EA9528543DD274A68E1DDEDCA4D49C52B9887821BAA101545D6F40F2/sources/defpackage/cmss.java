package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cmss  reason: default package */
/* loaded from: classes5.dex */
public final class cmss extends cnuw<cmst> {
    private final cmsn a;

    public cmss(Context context, Looper looper, cnum cnumVar, cmsn cmsnVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, cnumVar, connectionCallbacks, onConnectionFailedListener);
        cmsm cmsmVar = new cmsm(cmsnVar == null ? cmsn.a : cmsnVar);
        cmsmVar.b = cofd.a();
        this.a = cmsmVar.a();
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 12800000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof cmst ? (cmst) queryLocalInterface : new cmst(iBinder);
    }

    @Override // defpackage.cnui
    protected final Bundle i() {
        cmsn cmsnVar = this.a;
        Bundle bundle = new Bundle();
        String str = cmsnVar.b;
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", cmsnVar.c);
        bundle.putString("log_session_id", cmsnVar.d);
        return bundle;
    }
}
