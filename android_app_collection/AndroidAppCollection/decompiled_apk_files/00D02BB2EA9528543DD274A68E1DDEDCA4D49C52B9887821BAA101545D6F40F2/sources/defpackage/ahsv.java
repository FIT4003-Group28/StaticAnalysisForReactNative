package defpackage;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Build;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: ahsv  reason: default package */
/* loaded from: classes2.dex */
public final class ahsv implements GpsStatus.Listener {
    public static final /* synthetic */ int d = 0;
    public final ahsu a;
    public final cqat b;
    private final LocationManager e;
    @dzsi
    private ahst i;
    @dzsi
    private OnNmeaMessageListener j;
    public long c = -2000;
    @dzsi
    private GpsStatus g = null;
    private boolean h = false;
    private final boolean f = false;

    public ahsv(ahsu ahsuVar, LocationManager locationManager, cqat cqatVar, boolean z) {
        this.a = ahsuVar;
        this.e = locationManager;
        this.b = cqatVar;
    }

    public final void a() {
        if (!this.h) {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    ahst ahstVar = new ahst(this);
                    this.i = ahstVar;
                    this.e.registerGnssStatusCallback(ahstVar, new Handler());
                } else {
                    this.e.addGpsStatusListener(this);
                }
                this.h = true;
            } catch (SecurityException unused) {
            }
        }
    }

    public final void b() {
        if (this.h) {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    ahst ahstVar = this.i;
                    if (ahstVar != null) {
                        this.e.unregisterGnssStatusCallback(ahstVar);
                    }
                    OnNmeaMessageListener onNmeaMessageListener = this.j;
                    if (onNmeaMessageListener != null) {
                        this.e.removeNmeaListener(onNmeaMessageListener);
                    }
                } else {
                    this.e.removeGpsStatusListener(this);
                }
            } catch (IllegalStateException | SecurityException unused) {
            }
            this.i = null;
            this.j = null;
            this.h = false;
        }
    }

    @Override // android.location.GpsStatus.Listener
    public final void onGpsStatusChanged(int i) {
        try {
            GpsStatus gpsStatus = this.e.getGpsStatus(this.g);
            this.g = gpsStatus;
            if (gpsStatus == null) {
                return;
            }
            float f = -1.0f;
            int i2 = 0;
            for (GpsSatellite gpsSatellite : gpsStatus.getSatellites()) {
                if (gpsSatellite.usedInFix()) {
                    i2++;
                }
                if (f < gpsSatellite.getSnr()) {
                    f = gpsSatellite.getSnr();
                }
            }
            this.a.a(i2, f, false);
        } catch (NullPointerException unused) {
        }
    }
}
