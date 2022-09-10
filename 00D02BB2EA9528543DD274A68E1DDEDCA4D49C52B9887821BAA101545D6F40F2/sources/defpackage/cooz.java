package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cooz  reason: default package */
/* loaded from: classes5.dex */
public final class cooz extends cnnp<copa, cooq> {
    @Override // defpackage.cnnp
    public final /* bridge */ /* synthetic */ copa b(Context context, Looper looper, cnum cnumVar, cooq cooqVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new copa(context, looper, cnumVar, connectionCallbacks, onConnectionFailedListener, context.getPackageName());
    }
}
