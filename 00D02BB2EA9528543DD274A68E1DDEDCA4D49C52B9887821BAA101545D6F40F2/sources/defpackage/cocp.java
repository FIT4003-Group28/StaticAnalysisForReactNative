package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cocp  reason: default package */
/* loaded from: classes5.dex */
final class cocp extends cnnp<codb, cnnv> {
    @Override // defpackage.cnnp
    public final /* bridge */ /* synthetic */ codb b(Context context, Looper looper, cnum cnumVar, cnnv cnnvVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new codb(context, looper, connectionCallbacks, onConnectionFailedListener, cnumVar);
    }
}
