package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: copa  reason: default package */
/* loaded from: classes5.dex */
public final class copa extends cnuw<copd> {
    public final PlacesParams a;

    public copa(Context context, Looper looper, cnum cnumVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str) {
        super(context, looper, 65, cnumVar, connectionCallbacks, onConnectionFailedListener);
        Locale locale = Locale.getDefault();
        Account account = cnumVar.a;
        this.a = new PlacesParams(str, locale, account != null ? account.name : null);
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.location.places.GeoDataApi";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.location.places.internal.IGooglePlacesService";
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
        return queryLocalInterface instanceof copd ? (copd) queryLocalInterface : new copd(iBinder);
    }
}
