package defpackage;

import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: colg  reason: default package */
/* loaded from: classes5.dex */
public final class colg {
    private final ArrayList<LocationRequest> b = new ArrayList<>();
    public boolean a = false;

    public final LocationSettingsRequest a() {
        return new LocationSettingsRequest(this.b, this.a, false, null);
    }

    public final void b(LocationRequest locationRequest) {
        this.b.add(locationRequest);
    }
}
