package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cnsu  reason: default package */
/* loaded from: classes5.dex */
final class cnsu implements Runnable {
    final /* synthetic */ SignInResponse a;
    final /* synthetic */ cnsv b;

    public cnsu(cnsv cnsvVar, SignInResponse signInResponse) {
        this.b = cnsvVar;
        this.a = signInResponse;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cnsv cnsvVar = this.b;
        SignInResponse signInResponse = this.a;
        ConnectionResult connectionResult = signInResponse.b;
        if (connectionResult.c()) {
            ResolveAccountResponse resolveAccountResponse = signInResponse.c;
            cnwc.a(resolveAccountResponse);
            ConnectionResult connectionResult2 = resolveAccountResponse.c;
            if (!connectionResult2.c()) {
                String valueOf = String.valueOf(connectionResult2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                sb.toString();
                new Exception();
                cnsvVar.g.b(connectionResult2);
                cnsvVar.f.o();
                return;
            }
            cnrm cnrmVar = cnsvVar.g;
            cnvj a = resolveAccountResponse.a();
            Set<Scope> set = cnsvVar.d;
            if (a == null || set == null) {
                new Exception();
                cnrmVar.b(new ConnectionResult(4));
            } else {
                cnrmVar.f = a;
                cnrmVar.c = set;
                cnrmVar.c();
            }
        } else {
            cnsvVar.g.b(connectionResult);
        }
        cnsvVar.f.o();
    }
}
