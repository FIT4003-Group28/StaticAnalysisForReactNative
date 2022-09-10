package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import defpackage.cnnz;
/* compiled from: PG */
/* renamed from: cnnp  reason: default package */
/* loaded from: classes.dex */
public class cnnp<T extends cnnz, O> extends cnny<T, O> {
    public T a(Context context, Looper looper, cnum cnumVar, O o, cnpv cnpvVar, cnsi cnsiVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    @Deprecated
    public T b(Context context, Looper looper, cnum cnumVar, O o, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return a(context, looper, cnumVar, o, connectionCallbacks, onConnectionFailedListener);
    }
}
