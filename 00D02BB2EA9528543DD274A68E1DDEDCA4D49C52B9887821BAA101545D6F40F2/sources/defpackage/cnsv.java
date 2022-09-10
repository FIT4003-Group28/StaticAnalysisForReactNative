package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cnsv  reason: default package */
/* loaded from: classes5.dex */
public final class cnsv extends cozd implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    private static final cnnp<? extends coza, cozb> h = coyz.c;
    public final Context a;
    public final Handler b;
    public final cnnp<? extends coza, cozb> c;
    public final Set<Scope> d;
    public final cnum e;
    public coza f;
    public cnrm g;

    public cnsv(Context context, Handler handler, cnum cnumVar) {
        cnnp<? extends coza, cozb> cnnpVar = h;
        this.a = context;
        this.b = handler;
        this.e = cnumVar;
        this.d = cnumVar.b;
        this.c = cnnpVar;
    }

    @Override // defpackage.cnpv
    public final void Ph(Bundle bundle) {
        this.f.d(this);
    }

    @Override // defpackage.cnsi
    public final void Pi(ConnectionResult connectionResult) {
        this.g.b(connectionResult);
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
        this.f.o();
    }

    @Override // defpackage.cozd, defpackage.cozf
    public final void b(SignInResponse signInResponse) {
        this.b.post(new cnsu(this, signInResponse));
    }
}
