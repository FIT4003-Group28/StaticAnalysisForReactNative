package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.filament.R;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: dens  reason: default package */
/* loaded from: classes6.dex */
public final class dens extends cnuw<deoh> {
    static final Api<cnnv> a;
    private static final cnoa<dens> t;
    private static final cnnp<dens, cnnv> u;

    static {
        cnoa<dens> cnoaVar = new cnoa<>();
        t = cnoaVar;
        denr denrVar = new denr();
        u = denrVar;
        a = new Api<>("AppIndexing.API", denrVar, cnoaVar);
    }

    public dens(Context context, Looper looper, cnum cnumVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, R.styleable.AppCompatTheme_toolbarStyle, cnumVar, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.icing.APP_INDEXING_SERVICE";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.firebase.appindexing.internal.IAppIndexingService";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 12600000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        return deog.asInterface(iBinder);
    }
}
