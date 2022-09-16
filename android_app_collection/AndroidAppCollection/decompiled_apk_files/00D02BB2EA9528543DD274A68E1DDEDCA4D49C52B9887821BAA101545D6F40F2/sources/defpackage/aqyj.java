package defpackage;

import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
/* compiled from: PG */
/* renamed from: aqyj  reason: default package */
/* loaded from: classes2.dex */
public final class aqyj implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, aqyr, cnon {
    private static final dcqe e = dcqe.c("aqyj");
    public final aqyk a;
    @dzsi
    public cjql b;
    @dzsi
    public cjql c;
    public aqyi d;
    private final gga f;
    private final colo g = LocationServices.SettingsApi;
    private final GoogleApiClient h;
    private final cjqy i;
    private final cjqq j;
    private final atbs k;

    public aqyj(gga ggaVar, cjqy cjqyVar, cjqq cjqqVar, ckcw ckcwVar, atbs atbsVar) {
        this.f = ggaVar;
        this.i = cjqyVar;
        this.j = cjqqVar;
        this.a = new aqyk(ckcwVar);
        this.k = atbsVar;
        btsm c = btsm.c(ggaVar);
        c.g(LocationServices.API);
        c.h(this);
        c.i(this);
        this.h = c.e();
    }

    private final void e() {
        aqyi aqyiVar = this.d;
        if (aqyiVar != null) {
            aqyq aqyqVar = aqyiVar.d;
            if (aqyiVar.e != 1) {
                return;
            }
            aqyqVar.a(araf.SYSTEM_FAILURE);
            this.d = null;
        }
    }

    private final void f(araf arafVar) {
        aqyi aqyiVar = this.d;
        if (aqyiVar != null) {
            aqyiVar.d.a(arafVar);
            this.d = null;
        }
    }

    private final void g(Status status) {
        try {
            aqyi aqyiVar = this.d;
            this.d = new aqyi(aqyiVar.a, aqyiVar.b, aqyiVar.c, aqyiVar.d, 2);
            this.b = this.j.g().d(cjtd.a(dtxs.j));
            this.c = this.j.g().d(cjtd.a(dtxs.i));
            ckcw ckcwVar = this.a.a;
            if (ckcwVar != null) {
                ((ckco) ckcwVar.a(ckfw.a)).a(ckfv.a(3));
            }
            gga ggaVar = this.f;
            int ordinal = awnn.LOCATION_DIALOG.ordinal();
            ggaVar.u();
            status.b(ggaVar, ordinal);
        } catch (IntentSender.SendIntentException e2) {
            bvoo.h("failed to send intent %s", e2);
        }
    }

    @Override // defpackage.cnon
    public final /* bridge */ /* synthetic */ void Om(cnom cnomVar) {
        araf arafVar;
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) cnomVar;
        GoogleApiClient googleApiClient = this.h;
        if (googleApiClient != null) {
            googleApiClient.disconnect();
        }
        aqyi aqyiVar = this.d;
        if (aqyiVar == null) {
            return;
        }
        LocationSettingsStates locationSettingsStates = locationSettingsResult.b;
        Status status = locationSettingsResult.a;
        int i = status.g;
        if (!aqyiVar.c || locationSettingsStates == null || !locationSettingsStates.a) {
            if (this.k.i()) {
                arafVar = araf.CANNOT_BE_SHOWN;
            } else if (i != 0) {
                if (i != 6) {
                    arafVar = araf.NO_LOCATION_DEVICE;
                } else {
                    aqyi aqyiVar2 = this.d;
                    if (aqyiVar2.c) {
                        g(status);
                        return;
                    } else if (aqyiVar2.b) {
                        g(status);
                        return;
                    } else if (!aqyiVar2.a) {
                        g(status);
                        return;
                    } else {
                        arafVar = araf.RECENTLY_SHOWN;
                    }
                }
            }
            f(arafVar);
        }
        arafVar = araf.OPTIMIZED;
        f(arafVar);
    }

    @Override // defpackage.cnpv
    public final void Ph(@dzsi Bundle bundle) {
    }

    @Override // defpackage.cnsi
    public final void Pi(ConnectionResult connectionResult) {
        e();
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
        e();
    }

    @Override // defpackage.aqyr
    public final void c(boolean z, boolean z2, boolean z3, @dzsi aqyq aqyqVar) {
        aqyi aqyiVar = new aqyi(z2, z || z3, z3, aqyqVar, 1);
        bvrj.UI_THREAD.c();
        this.d = aqyiVar;
        colg colgVar = new colg();
        LocationRequest create = LocationRequest.create();
        create.setPriority(100);
        colgVar.b(create);
        colgVar.a = this.d.b;
        this.g.a(this.h, colgVar.a()).i(this);
        if (!this.h.isConnected()) {
            this.h.connect();
        }
    }

    public final void d(@dzsi cjql cjqlVar, ddho ddhoVar) {
        if (cjqlVar != null) {
            this.i.j(cjqlVar, cjtd.a(ddhoVar));
        }
    }
}
