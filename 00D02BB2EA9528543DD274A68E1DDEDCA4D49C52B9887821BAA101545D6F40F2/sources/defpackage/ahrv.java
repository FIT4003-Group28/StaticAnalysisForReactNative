package defpackage;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.google.android.apps.gmm.location.rawlocationevents.AndroidLocationEvent;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahrv  reason: default package */
/* loaded from: classes2.dex */
final class ahrv implements LocationListener {
    final /* synthetic */ ahrx a;
    private final String b;
    private boolean c;
    private boolean d;
    private Location e;
    private final int f;

    public ahrv(ahrx ahrxVar, String str, int i) {
        this.a = ahrxVar;
        this.b = str;
        this.f = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (this.c) {
            return;
        }
        List<String> allProviders = this.a.b.getAllProviders();
        boolean z = false;
        if (allProviders == null || !allProviders.contains(this.b)) {
            this.c = false;
            if (this.d) {
                return;
            }
            ahou.a(this.a.e, this.f, false);
            this.d = true;
            return;
        }
        try {
            ahrx ahrxVar = this.a;
            ahrxVar.b.requestLocationUpdates(this.b, 900L, 0.0f, this, ahrxVar.d);
            this.c = true;
            int i = ckfu.a;
            z = true;
        } catch (SecurityException unused) {
            this.c = false;
        }
        if (this.d) {
            return;
        }
        ahou.a(this.a.e, this.f, z);
        this.d = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.c) {
            try {
                this.a.b.removeUpdates(this);
                int i = ckfu.a;
            } catch (SecurityException unused) {
            }
        }
        this.c = false;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            if (this.e != null && (location.getElapsedRealtimeNanos() - this.e.getElapsedRealtimeNanos()) / 1000000 < 800) {
                return;
            }
            this.a.a.b(AndroidLocationEvent.fromLocation(location));
            this.e = location;
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("provider", this.b);
        b.h("updatesActive", this.c);
        return b.toString();
    }
}
