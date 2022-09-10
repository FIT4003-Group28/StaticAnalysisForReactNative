package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cmqp  reason: default package */
/* loaded from: classes5.dex */
final class cmqp extends cnnp<cmqu, cnnv> {
    @Override // defpackage.cnnp
    public final /* bridge */ /* synthetic */ cmqu b(Context context, Looper looper, cnum cnumVar, cnnv cnnvVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new cmqu(context, looper, cnumVar, connectionCallbacks, onConnectionFailedListener);
    }
}
