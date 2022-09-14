package defpackage;

import android.location.Location;
import com.google.android.apps.gmm.location.rawlocationevents.AndroidLocationEvent;
import com.google.android.apps.gmm.location.rawlocationevents.SatelliteStatusEvent;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bnwm  reason: default package */
/* loaded from: classes3.dex */
final class bnwm implements bnvw {
    private final btrm a;
    private final cqat b;
    private final amub c;
    private final float d;
    private final double e;

    public bnwm(btrm btrmVar, cqat cqatVar, amub amubVar, float f, double d) {
        this.a = btrmVar;
        this.b = cqatVar;
        dbsk.s(amubVar);
        this.c = amubVar;
        boolean z = true;
        dbsk.a(f > 0.0f);
        this.d = f;
        dbsk.a(d < dcyn.a ? false : z);
        this.e = d;
    }

    @Override // defpackage.bnvw
    public final void a(bnwl bnwlVar) {
        bnwe bnweVar = new bnwe(this.c, this.d, this.b);
        double d = this.e;
        int i = 5;
        if (d > dcyn.a) {
            dbsk.a(d >= dcyn.a);
            bnweVar.b = d;
            bnweVar.a(0L);
        }
        boolean z = false;
        while (bnwlVar.d()) {
            this.a.d(new SatelliteStatusEvent(6, false));
            Location location = bnweVar.a;
            if (z) {
                location.setTime(this.b.b());
                location.setElapsedRealtimeNanos(TimeUnit.MILLISECONDS.toNanos(this.b.e()));
            }
            this.a.d(AndroidLocationEvent.fromLocation(location));
            bnwlVar.e();
            long e = this.b.e();
            bnwlVar.f();
            long e2 = this.b.e();
            if (!z) {
                z = !bnweVar.a(e2 - e);
            }
            if (z) {
                if (i <= 0) {
                    return;
                }
                i--;
            }
        }
    }
}
