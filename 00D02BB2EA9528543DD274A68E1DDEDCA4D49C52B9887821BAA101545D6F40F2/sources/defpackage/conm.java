package defpackage;

import android.location.Location;
import com.google.android.gms.location.LocationListener;
/* compiled from: PG */
/* renamed from: conm  reason: default package */
/* loaded from: classes5.dex */
final class conm extends cokx {
    private final cnsd<LocationListener> a;

    public conm(cnsd<LocationListener> cnsdVar) {
        this.a = cnsdVar;
    }

    public final synchronized void b() {
        this.a.b();
    }

    @Override // defpackage.coky
    public final synchronized void e(Location location) {
        this.a.a(new conl(location));
    }
}
