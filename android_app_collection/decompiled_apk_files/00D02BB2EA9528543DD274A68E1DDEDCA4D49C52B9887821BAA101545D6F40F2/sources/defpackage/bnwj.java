package defpackage;

import android.location.Location;
import com.google.android.apps.gmm.location.rawlocationevents.AndroidLocationEvent;
import com.google.android.apps.gmm.location.rawlocationevents.SatelliteStatusEvent;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bnwj  reason: default package */
/* loaded from: classes3.dex */
final class bnwj implements bnvw {
    private final btrm a;
    private final cqat b;
    private final Location c;

    public bnwj(btrm btrmVar, cqat cqatVar, Location location) {
        this.a = btrmVar;
        this.b = cqatVar;
        dbsk.s(location);
        this.c = location;
    }

    @Override // defpackage.bnvw
    public final void a(bnwl bnwlVar) {
        while (bnwlVar.d()) {
            this.c.setTime(this.b.b());
            this.c.setElapsedRealtimeNanos(TimeUnit.MILLISECONDS.toNanos(this.b.e()));
            this.a.d(new SatelliteStatusEvent(6, false));
            this.a.d(AndroidLocationEvent.fromLocation(this.c));
            bnwlVar.e();
            bnwlVar.f();
        }
    }
}
