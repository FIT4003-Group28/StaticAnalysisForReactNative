package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
/* compiled from: PG */
/* renamed from: conr  reason: default package */
/* loaded from: classes.dex */
public final class conr extends coly {
    public final conn t;

    public conr(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str, @dzsi cnum cnumVar) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, str, cnumVar);
        this.t = new conn(context, this.a);
    }

    public final void Q(long j, PendingIntent pendingIntent) {
        K();
        cnwc.a(pendingIntent);
        cnwc.e(j >= 0, "detectionIntervalMillis must be >= 0");
        ((cond) L()).s(j, pendingIntent);
    }

    public final void R(PendingIntent pendingIntent) {
        K();
        cnwc.a(pendingIntent);
        ((cond) L()).h(pendingIntent);
    }

    public final void S(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, cnph<Status> cnphVar) {
        K();
        cnwc.n(pendingIntent, "PendingIntent must be specified.");
        cnwc.n(cnphVar, "ResultHolder not provided.");
        ((cond) L()).e(geofencingRequest, pendingIntent, new cono(cnphVar));
    }

    @Override // defpackage.cnui
    public final boolean So() {
        return true;
    }

    public final LocationAvailability T() {
        conn connVar = this.t;
        connVar.f.a();
        return connVar.f.b().p(connVar.a.getPackageName());
    }

    public final void U(LocationRequestInternal locationRequestInternal, cnsd<cola> cnsdVar, comz comzVar) {
        coni coniVar;
        synchronized (this.t) {
            conn connVar = this.t;
            connVar.f.a();
            cnsb<cola> cnsbVar = cnsdVar.b;
            if (cnsbVar == null) {
                coniVar = null;
            } else {
                synchronized (connVar.e) {
                    coni coniVar2 = connVar.e.get(cnsbVar);
                    if (coniVar2 == null) {
                        coniVar2 = new coni(cnsdVar);
                    }
                    coniVar = coniVar2;
                    connVar.e.put(cnsbVar, coniVar);
                }
            }
            coni coniVar3 = coniVar;
            if (coniVar3 != null) {
                connVar.f.b().k(new LocationRequestUpdateData(1, locationRequestInternal, null, null, coniVar3, comzVar.asBinder()));
            }
        }
    }

    public final void V(LocationRequest locationRequest, cnsd<LocationListener> cnsdVar, comz comzVar) {
        synchronized (this.t) {
            conn connVar = this.t;
            connVar.f.a();
            conm a = connVar.a(cnsdVar);
            if (a != null) {
                connVar.f.b().k(LocationRequestUpdateData.a(LocationRequestInternal.a(locationRequest), a, comzVar));
            }
        }
    }

    public final void W(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent, comz comzVar) {
        conn connVar = this.t;
        connVar.f.a();
        connVar.f.b().k(LocationRequestUpdateData.c(locationRequestInternal, pendingIntent, comzVar));
    }

    public final void X(PendingIntent pendingIntent, comz comzVar) {
        conn connVar = this.t;
        connVar.f.a();
        connVar.f.b().k(new LocationRequestUpdateData(2, null, null, pendingIntent, null, comzVar.asBinder()));
    }

    public final void Y(cnsb<cola> cnsbVar, comz comzVar) {
        conn connVar = this.t;
        connVar.f.a();
        cnwc.n(cnsbVar, "Invalid null listener key");
        synchronized (connVar.e) {
            coni remove = connVar.e.remove(cnsbVar);
            if (remove != null) {
                remove.b();
                connVar.f.b().k(LocationRequestUpdateData.d(remove, comzVar));
            }
        }
    }

    public final void Z(LocationSettingsRequest locationSettingsRequest, cnph<LocationSettingsResult> cnphVar) {
        K();
        boolean z = true;
        cnwc.e(true, "locationSettingsRequest can't be null nor empty.");
        if (cnphVar == null) {
            z = false;
        }
        cnwc.e(z, "listener can't be null.");
        ((cond) L()).r(locationSettingsRequest, new conq(cnphVar));
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final void o() {
        synchronized (this.t) {
            if (r()) {
                try {
                    conn connVar = this.t;
                    synchronized (connVar.c) {
                        for (conm conmVar : connVar.c.values()) {
                            if (conmVar != null) {
                                connVar.f.b().k(LocationRequestUpdateData.b(conmVar, null));
                            }
                        }
                        connVar.c.clear();
                    }
                    synchronized (connVar.e) {
                        for (coni coniVar : connVar.e.values()) {
                            if (coniVar != null) {
                                connVar.f.b().k(LocationRequestUpdateData.d(coniVar, null));
                            }
                        }
                        connVar.e.clear();
                    }
                    synchronized (connVar.d) {
                        for (conk conkVar : connVar.d.values()) {
                            if (conkVar != null) {
                                connVar.f.b().q(DeviceOrientationRequestUpdateData.a(conkVar));
                            }
                        }
                        connVar.d.clear();
                    }
                    conn connVar2 = this.t;
                    if (connVar2.b) {
                        connVar2.b(false);
                    }
                } catch (Exception unused) {
                }
            }
            super.o();
        }
    }
}
