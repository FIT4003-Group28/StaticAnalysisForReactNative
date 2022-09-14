package c.e.a.b.e.b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.t;
/* loaded from: classes.dex */
public class a extends com.google.android.gms.common.internal.h<f> implements c.e.a.b.e.e {
    private final Bundle A;
    private Integer B;
    private final boolean y;
    private final com.google.android.gms.common.internal.d z;

    private a(Context context, Looper looper, boolean z, com.google.android.gms.common.internal.d dVar, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.y = true;
        this.z = dVar;
        this.A = bundle;
        this.B = dVar.d();
    }

    public a(Context context, Looper looper, boolean z, com.google.android.gms.common.internal.d dVar, c.e.a.b.e.a aVar, f.a aVar2, f.b bVar) {
        this(context, looper, true, dVar, a(dVar), aVar2, bVar);
    }

    public static Bundle a(com.google.android.gms.common.internal.d dVar) {
        c.e.a.b.e.a h2 = dVar.h();
        Integer d2 = dVar.d();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.a());
        if (d2 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", d2.intValue());
        }
        if (h2 != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", h2.h());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", h2.g());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", h2.e());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", h2.f());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", h2.b());
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", h2.c());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", h2.i());
            if (h2.a() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", h2.a().longValue());
            }
            if (h2.d() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", h2.d().longValue());
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.c
    protected /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new h(iBinder);
    }

    @Override // c.e.a.b.e.e
    public final void a(d dVar) {
        s.a(dVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b2 = this.z.b();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(b2.name)) {
                googleSignInAccount = com.google.android.gms.auth.api.signin.a.a.a(r()).a();
            }
            ((f) v()).a(new j(new t(b2, this.B.intValue(), googleSignInAccount)), dVar);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                dVar.a(new l(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.h, com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public int d() {
        return com.google.android.gms.common.i.f6959a;
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public boolean j() {
        return this.y;
    }

    @Override // c.e.a.b.e.e
    public final void k() {
        a(new c.d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public Bundle s() {
        if (!r().getPackageName().equals(this.z.f())) {
            this.A.putString("com.google.android.gms.signin.internal.realClientPackageName", this.z.f());
        }
        return this.A;
    }

    @Override // com.google.android.gms.common.internal.c
    protected String w() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected String x() {
        return "com.google.android.gms.signin.service.START";
    }
}
