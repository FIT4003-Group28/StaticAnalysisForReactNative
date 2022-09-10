package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: copn  reason: default package */
/* loaded from: classes5.dex */
public final class copn extends cnnp<copo, cooq> {
    @Override // defpackage.cnnp
    public final /* bridge */ /* synthetic */ copo b(Context context, Looper looper, cnum cnumVar, cooq cooqVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new copo(context, looper, cnumVar, connectionCallbacks, onConnectionFailedListener, context.getPackageName());
    }
}
