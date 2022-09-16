package defpackage;

import android.location.Location;
import com.google.android.gms.location.LocationListener;
/* compiled from: PG */
/* renamed from: conl  reason: default package */
/* loaded from: classes5.dex */
final class conl implements cnsc<LocationListener> {
    final /* synthetic */ Location a;

    public conl(Location location) {
        this.a = location;
    }

    @Override // defpackage.cnsc
    public final /* bridge */ /* synthetic */ void a(LocationListener locationListener) {
        locationListener.onLocationChanged(this.a);
    }

    @Override // defpackage.cnsc
    public final void b() {
    }
}
