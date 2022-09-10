package defpackage;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: csvk  reason: default package */
/* loaded from: classes5.dex */
public final class csvk implements dyey {
    static final dyhs<String> a = dyhs.d("X-Goog-Spatula", dyhw.b);
    public volatile String b;
    public volatile deig<Void> c;
    private final Context d;

    public csvk(Context context) {
        this.d = context;
        b();
    }

    @Override // defpackage.dyey
    public final <ReqT, RespT> dyex<ReqT, RespT> a(dyib<ReqT, RespT> dyibVar, dyet dyetVar, dyeu dyeuVar) {
        try {
            b().get(20L, TimeUnit.SECONDS);
        } catch (Exception e) {
            if (String.valueOf(e.getMessage()).length() == 0) {
                new String("Error connecting GoogleApiClient: ");
            }
            cstl.a("ClntIntrcptrFctryV12");
        }
        return new csvj(this, dyeuVar.a(dyibVar, dyetVar));
    }

    public final synchronized dehn<Void> b() {
        deig<Void> deigVar = this.c;
        if (deigVar != null) {
            return deigVar;
        }
        final deig<Void> d = deig.d();
        this.c = d;
        GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.d);
        builder.addApi(cmso.c);
        final GoogleApiClient build = builder.build();
        build.registerConnectionCallbacks(new csvi(this, build, d));
        build.registerConnectionFailedListener(new GoogleApiClient.OnConnectionFailedListener(this, d, build) { // from class: csvg
            private final csvk a;
            private final deig b;
            private final GoogleApiClient c;

            {
                this.a = this;
                this.b = d;
                this.c = build;
            }

            @Override // defpackage.cnsi
            public final void Pi(ConnectionResult connectionResult) {
                csvk csvkVar = this.a;
                deig deigVar2 = this.b;
                GoogleApiClient googleApiClient = this.c;
                String valueOf = String.valueOf(connectionResult);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb.append("Error connecting GoogleApiClient: ");
                sb.append(valueOf);
                sb.toString();
                cstl.a("ClntIntrcptrFctryV12");
                csvkVar.c = null;
                String valueOf2 = String.valueOf(connectionResult.e);
                deigVar2.k(new Exception(valueOf2.length() != 0 ? "Error calling GMS Core API: ".concat(valueOf2) : new String("Error calling GMS Core API: ")));
                googleApiClient.disconnect();
            }
        });
        build.connect();
        return d;
    }
}
