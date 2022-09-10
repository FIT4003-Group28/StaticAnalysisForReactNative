package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cour  reason: default package */
/* loaded from: classes.dex */
final class cour extends cnnp<cowh, couv> {
    @Override // defpackage.cnnp
    public final /* bridge */ /* synthetic */ cowh b(Context context, Looper looper, cnum cnumVar, couv couvVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        couv couvVar2 = couvVar;
        cnwc.n(couvVar2, "Must provide valid PeopleOptions!");
        return new cowh(context, looper, connectionCallbacks, onConnectionFailedListener, String.valueOf(couvVar2.a), cnumVar);
    }
}
