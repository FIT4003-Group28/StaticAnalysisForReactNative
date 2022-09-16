package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cofy  reason: default package */
/* loaded from: classes.dex */
public final class cofy extends cnuw<cofx> {
    public cofy(Context context, Looper looper, cnum cnumVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 167, cnumVar, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // defpackage.cnui
    public final Feature[] Sm() {
        return cofm.b;
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.languageprofile.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.languageprofile.internal.ILanguageProfileService";
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.languageprofile.internal.ILanguageProfileService");
        return queryLocalInterface instanceof cofx ? (cofx) queryLocalInterface : new cofx(iBinder);
    }
}
