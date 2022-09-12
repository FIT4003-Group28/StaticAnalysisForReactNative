package defpackage;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.google.android.apps.gmm.location.mapinfo.NetworkLocationEvent;
/* compiled from: PG */
/* renamed from: ahmg  reason: default package */
/* loaded from: classes2.dex */
final class ahmg implements LocationListener {
    final /* synthetic */ ahmj a;

    public ahmg(ahmj ahmjVar) {
        this.a = ahmjVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        Bundle extras = location.getExtras();
        if (extras != null && extras.containsKey("networkLocationType") && "wifi".equals(extras.getString("networkLocationType"))) {
            ahmj ahmjVar = this.a;
            ahmjVar.a.b(new NetworkLocationEvent(ahmjVar.b.e(), location.getLatitude(), location.getLongitude(), location.getAccuracy()));
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
}
