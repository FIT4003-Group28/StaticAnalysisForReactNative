package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: coqt  reason: default package */
/* loaded from: classes.dex */
public final class coqt extends cnuw<coqr> {
    private final String a;

    public coqt(Context context, Looper looper, cnum cnumVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 22, cnumVar, connectionCallbacks, onConnectionFailedListener);
        this.a = cnumVar.e;
    }

    @Override // defpackage.cnui
    public final Feature[] Sm() {
        return cojn.e;
    }

    @Override // defpackage.cnui
    public final boolean So() {
        return true;
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.location.reporting.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.location.reporting.internal.IReportingService";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 12451000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.reporting.internal.IReportingService");
        return queryLocalInterface instanceof coqr ? (coqr) queryLocalInterface : new coqr(iBinder);
    }

    @Override // defpackage.cnui
    protected final Bundle i() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.a)) {
            bundle.putString("real_client_package_name", this.a);
        }
        return bundle;
    }
}
