package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: btsm  reason: default package */
/* loaded from: classes.dex */
public final class btsm {
    public static final GoogleApiClient.ConnectionCallbacks b;
    public static final GoogleApiClient.OnConnectionFailedListener c;
    public final GoogleApiClient.Builder a;
    private GoogleApiClient d;

    static {
        new AtomicInteger(0);
        b = new btsk();
        c = new btsl();
    }

    private btsm(Context context) {
        this.a = new GoogleApiClient.Builder(context);
    }

    public static void a(int i) {
        ckcw rU;
        ckcu ckcuVar = (ckcu) btsr.a(ckcu.class);
        if (ckcuVar == null || (rU = ckcuVar.rU()) == null) {
            return;
        }
        ((ckco) rU.a(ckja.K)).a(i);
    }

    @dzsi
    public static btsm b(Context context) {
        return d(context, true);
    }

    public static btsm c(Context context) {
        dbsk.l(true);
        return d(context, false);
    }

    @dzsi
    static btsm d(Context context, boolean z) {
        if (!z || btsj.b(context)) {
            return new btsm(context);
        }
        return null;
    }

    public final GoogleApiClient e() {
        if (this.d == null) {
            this.d = this.a.build();
        }
        return this.d;
    }

    public final boolean f(String str) {
        if (this.d != null) {
            bvoo.f(new IllegalStateException(str.concat("() was called after getGoogleApiClient() on GoogleApiClientHelper")));
            return true;
        }
        return false;
    }

    public final void g(Api<? extends cnnw> api) {
        if (api == LocationServices.API) {
            int i = ckfu.a;
        }
        if (!f("addApi")) {
            this.a.addApi(api);
        }
    }

    public final void h(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        if (!f("addConnectionCallbacks")) {
            this.a.addConnectionCallbacks(connectionCallbacks);
        }
    }

    public final void i(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        if (!f("addOnConnectionFailedListener")) {
            this.a.addOnConnectionFailedListener(onConnectionFailedListener);
        }
    }

    public final void j(String str) {
        if (!f("setAccountName")) {
            this.a.setAccountName(str);
        }
    }
}
