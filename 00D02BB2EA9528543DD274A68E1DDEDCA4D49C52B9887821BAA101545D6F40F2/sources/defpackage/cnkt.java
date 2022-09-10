package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.filament.R;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cnkt  reason: default package */
/* loaded from: classes.dex */
public final class cnkt extends cnuw<cnlc> {
    public cnkt(Context context, Looper looper, cnum cnumVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, R.styleable.AppCompatTheme_windowMinWidthMajor, cnumVar, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.clearcut.bootcount.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.clearcut.internal.IBootCountService";
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IBootCountService");
        return queryLocalInterface instanceof cnlc ? (cnlc) queryLocalInterface : new cnlc(iBinder);
    }
}
