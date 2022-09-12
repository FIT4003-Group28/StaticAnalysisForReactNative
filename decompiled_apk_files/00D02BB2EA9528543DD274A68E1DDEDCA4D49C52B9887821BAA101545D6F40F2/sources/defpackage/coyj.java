package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: coyj  reason: default package */
/* loaded from: classes.dex */
public final class coyj extends cnuw<coyi> {
    public coyj(Context context, Looper looper, cnum cnumVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 51, cnumVar, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // defpackage.cnui
    public final Feature[] Sm() {
        return coxm.e;
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.phenotype.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 9410000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return queryLocalInterface instanceof coyi ? (coyi) queryLocalInterface : new coyi(iBinder);
    }
}
