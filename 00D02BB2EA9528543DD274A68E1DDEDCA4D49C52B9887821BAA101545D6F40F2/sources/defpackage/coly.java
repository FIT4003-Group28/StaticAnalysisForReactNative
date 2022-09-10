package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: coly  reason: default package */
/* loaded from: classes.dex */
public class coly extends cnuw<cond> {
    protected final colx a;
    private final String t;

    public coly(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str, cnum cnumVar) {
        super(context, looper, 23, cnumVar, connectionCallbacks, onConnectionFailedListener);
        this.a = new colx(this);
        this.t = str;
    }

    @Override // defpackage.cnui
    public final Feature[] Sm() {
        return cojn.e;
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 11717000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof cond ? (cond) queryLocalInterface : new conc(iBinder);
    }

    @Override // defpackage.cnui
    protected final Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.t);
        return bundle;
    }
}
