package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.Set;
/* compiled from: PG */
/* renamed from: qvq  reason: default package */
/* loaded from: classes4.dex */
final class qvq implements Runnable {
    final /* synthetic */ SignInResponse a;
    final /* synthetic */ qvr b;

    public qvq(qvr qvrVar, SignInResponse signInResponse) {
        this.b = qvrVar;
        this.a = signInResponse;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qvr qvrVar = this.b;
        SignInResponse signInResponse = this.a;
        ConnectionResult connectionResult = signInResponse.b;
        if (connectionResult.c()) {
            ResolveAccountResponse resolveAccountResponse = signInResponse.c;
            qnm.b(resolveAccountResponse);
            ConnectionResult connectionResult2 = resolveAccountResponse.c;
            if (!connectionResult2.c()) {
                String valueOf = String.valueOf(connectionResult2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                qvrVar.f.b(connectionResult2);
                qvrVar.e.l();
                return;
            }
            qup qupVar = qvrVar.f;
            qxk a = resolveAccountResponse.a();
            Set set = qvrVar.c;
            if (a == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                qupVar.b(new ConnectionResult(4));
            } else {
                qupVar.f = a;
                qupVar.c = set;
                qupVar.c();
            }
        } else {
            qvrVar.f.b(connectionResult);
        }
        qvrVar.e.l();
    }
}
