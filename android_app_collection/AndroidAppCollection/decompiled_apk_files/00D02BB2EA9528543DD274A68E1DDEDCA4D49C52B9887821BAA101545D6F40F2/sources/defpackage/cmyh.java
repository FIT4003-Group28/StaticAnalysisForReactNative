package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cmyh  reason: default package */
/* loaded from: classes5.dex */
final class cmyh extends cnnp<cmwb, cnag> {
    @Override // defpackage.cnnp
    public final /* bridge */ /* synthetic */ cmwb b(Context context, Looper looper, cnum cnumVar, cnag cnagVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        cnag cnagVar2 = cnagVar;
        dbsk.t(cnagVar2, "Setting the API options is required.");
        return new cmwb(context, looper, cnumVar, cnagVar2.a, cnagVar2.b, connectionCallbacks, onConnectionFailedListener);
    }
}
