package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cojc  reason: default package */
/* loaded from: classes.dex */
final class cojc extends cnnp<conr, cnnv> {
    @Override // defpackage.cnnp
    public final /* bridge */ /* synthetic */ conr b(Context context, Looper looper, cnum cnumVar, cnnv cnnvVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new conr(context, looper, connectionCallbacks, onConnectionFailedListener, "activity_recognition", cnum.a(context));
    }
}
