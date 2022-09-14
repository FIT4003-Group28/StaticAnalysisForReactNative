package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;
/* compiled from: PG */
/* renamed from: cnql  reason: default package */
/* loaded from: classes5.dex */
final class cnql extends cnqz {
    final /* synthetic */ cnqp a;
    final /* synthetic */ SignInResponse b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnql(cnqy cnqyVar, cnqp cnqpVar, SignInResponse signInResponse) {
        super(cnqyVar);
        this.a = cnqpVar;
        this.b = signInResponse;
    }

    @Override // defpackage.cnqz
    public final void a() {
        cnqp cnqpVar = this.a;
        SignInResponse signInResponse = this.b;
        if (!cnqpVar.o(0)) {
            return;
        }
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
                cnqpVar.n(connectionResult2);
                return;
            }
            cnqpVar.g = true;
            cnvj a = resolveAccountResponse.a();
            cnwc.a(a);
            cnqpVar.k = a;
            cnqpVar.h = resolveAccountResponse.d;
            cnqpVar.i = resolveAccountResponse.e;
            cnqpVar.j();
        } else if (cnqpVar.m(connectionResult)) {
            cnqpVar.l();
            cnqpVar.j();
        } else {
            cnqpVar.n(connectionResult);
        }
    }
}
