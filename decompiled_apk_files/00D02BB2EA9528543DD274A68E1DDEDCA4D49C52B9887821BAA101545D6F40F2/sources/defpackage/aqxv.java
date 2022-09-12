package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: aqxv  reason: default package */
/* loaded from: classes.dex */
public final class aqxv implements cnon<Status> {
    public static final String a = String.valueOf(aqxv.class.getName()).concat(".ACTIVITY_RECOGNITION");
    public final aqxw b;
    public final btrm c;
    public final PendingIntent d;
    @dzsi
    public final GoogleApiClient e;
    private final aqxq f;
    private final Application g;
    private boolean h;
    @dzsi
    private deig<Void> i;
    private final GoogleApiClient.ConnectionCallbacks j;
    private final colw k;

    public aqxv(Application application, btrm btrmVar) {
        colw colwVar = coje.b;
        btsm b = btsm.b(application);
        this.i = null;
        aqxr aqxrVar = new aqxr(this);
        this.j = aqxrVar;
        this.g = application;
        this.c = btrmVar;
        this.k = colwVar;
        this.b = new aqxw();
        this.f = new aqxq();
        this.h = false;
        Intent intent = new Intent(a);
        intent.setPackage(application.getPackageName());
        this.d = PendingIntent.getBroadcast(application, 0, intent, 134217728);
        if (b == null) {
            this.e = null;
            return;
        }
        b.g(coje.a);
        b.h(aqxrVar);
        b.i(new aqxs());
        this.e = b.e();
    }

    @Override // defpackage.cnon
    public final /* bridge */ /* synthetic */ void Om(Status status) {
        GoogleApiClient googleApiClient;
        d();
        if (!status.d() && (googleApiClient = this.e) != null) {
            googleApiClient.disconnect();
        }
    }

    public final void b(@dzsi deig<Void> deigVar) {
        this.i = deigVar;
        c(new aqxu(this));
    }

    public final synchronized void c(Runnable runnable) {
        GoogleApiClient googleApiClient;
        this.b.a = runnable;
        GoogleApiClient googleApiClient2 = this.e;
        if (googleApiClient2 != null && googleApiClient2.isConnected()) {
            this.b.a();
            return;
        }
        GoogleApiClient googleApiClient3 = this.e;
        if ((googleApiClient3 == null || !googleApiClient3.isConnecting()) && btsj.b(this.g) && (googleApiClient = this.e) != null) {
            googleApiClient.connect();
        }
    }

    public final void d() {
        deig<Void> deigVar = this.i;
        if (deigVar != null) {
            deigVar.j(null);
        }
    }

    public final synchronized void e() {
        if (!this.h) {
            this.g.registerReceiver(this.f, new IntentFilter(a));
            this.h = true;
        }
    }

    public final synchronized void f() {
        if (this.h) {
            try {
                this.g.unregisterReceiver(this.f);
            } catch (IllegalArgumentException unused) {
            }
            this.h = false;
        }
    }
}
