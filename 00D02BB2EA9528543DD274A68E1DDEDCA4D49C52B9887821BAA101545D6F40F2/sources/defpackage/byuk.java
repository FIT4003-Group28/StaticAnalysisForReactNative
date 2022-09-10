package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: byuk  reason: default package */
/* loaded from: classes4.dex */
public final class byuk {
    @dzsi
    public final GoogleApiClient a;
    public final copm b;
    private final axru c;
    private final bytc d;
    private final btvo e;

    public byuk(GoogleApiClient googleApiClient, copm copmVar, axru axruVar, bytc bytcVar, btvo btvoVar) {
        this.a = googleApiClient;
        this.b = copmVar;
        this.c = axruVar;
        this.d = bytcVar;
        this.e = btvoVar;
    }

    public final boolean a() {
        GoogleApiClient googleApiClient = this.a;
        if (googleApiClient == null) {
            this.d.a(3);
            return false;
        }
        dkqz dkqzVar = this.e.getNotificationsParameters().m;
        if (dkqzVar == null) {
            dkqzVar = dkqz.ap;
        }
        dkqw dkqwVar = dkqzVar.an;
        if (dkqwVar == null) {
            dkqwVar = dkqw.c;
        }
        ConnectionResult blockingConnect = googleApiClient.blockingConnect(dkqwVar.b, TimeUnit.SECONDS);
        if (!blockingConnect.c()) {
            this.d.a(4);
        }
        return blockingConnect.c();
    }

    public final void b() {
        GoogleApiClient googleApiClient = this.a;
        if (googleApiClient == null || !googleApiClient.isConnected()) {
            return;
        }
        this.a.disconnect();
    }

    public final void c() {
        if (!this.c.a("android.permission.ACCESS_FINE_LOCATION")) {
            this.d.a(98);
        }
    }
}
