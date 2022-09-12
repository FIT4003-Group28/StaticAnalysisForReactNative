package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmsl  reason: default package */
/* loaded from: classes5.dex */
final class cmsl extends cnnp<cmtp, GoogleSignInOptions> {
    @Override // defpackage.cnnp
    public final /* bridge */ /* synthetic */ cmtp b(Context context, Looper looper, cnum cnumVar, GoogleSignInOptions googleSignInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new cmtp(context, looper, cnumVar, googleSignInOptions, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // defpackage.cnny
    public final /* bridge */ /* synthetic */ List c(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.b();
    }
}
