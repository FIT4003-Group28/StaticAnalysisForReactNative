package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cqeu  reason: default package */
/* loaded from: classes5.dex */
final class cqeu {
    public static final cqes a = cqes.d(cqeo.CANNOT_CONSENT, false, false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(cqes cqesVar) {
        cqde cqdeVar = (cqde) cqesVar;
        boolean z = cqdeVar.b;
        boolean z2 = cqdeVar.c;
        return z ? !z2 ? 2 : 4 : z2 ? 3 : 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Context context, Account account, final cqet cqetVar) {
        if (dyab.a.a().b(context)) {
            cqetVar.a(cqes.d(cqeo.CONSENT_DEPRECATED, false, false));
            return;
        }
        GoogleApiClient.Builder builder = new GoogleApiClient.Builder(context);
        builder.addApi(coqk.a);
        GoogleApiClient build = builder.build();
        build.registerConnectionCallbacks(new cqer(build, account, cqetVar));
        build.registerConnectionFailedListener(new GoogleApiClient.OnConnectionFailedListener(cqetVar) { // from class: cqep
            private final cqet a;

            {
                this.a = cqetVar;
            }

            @Override // defpackage.cnsi
            public final void Pi(ConnectionResult connectionResult) {
                cqet cqetVar2 = this.a;
                cqes cqesVar = cqeu.a;
                connectionResult.toString();
                cqetVar2.a(cqeu.a);
            }
        });
        build.connect();
    }
}
