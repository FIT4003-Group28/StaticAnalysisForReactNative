package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
/* compiled from: PG */
/* renamed from: cmtp  reason: default package */
/* loaded from: classes5.dex */
public final class cmtp extends cnuw<cmud> {
    public final GoogleSignInOptions a;

    public cmtp(Context context, Looper looper, cnum cnumVar, GoogleSignInOptions googleSignInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 91, cnumVar, connectionCallbacks, onConnectionFailedListener);
        cmtj cmtjVar;
        if (googleSignInOptions != null) {
            cmtjVar = new cmtj(googleSignInOptions);
        } else {
            cmtjVar = new cmtj();
        }
        cmtjVar.b = cofd.a();
        if (!cnumVar.c.isEmpty()) {
            for (Scope scope : cnumVar.c) {
                cmtjVar.c(scope, new Scope[0]);
            }
        }
        this.a = cmtjVar.a();
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 12451000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof cmud ? (cmud) queryLocalInterface : new cmud(iBinder);
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final boolean k() {
        return true;
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final Intent l() {
        Context context = this.c;
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), this.a);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }
}
