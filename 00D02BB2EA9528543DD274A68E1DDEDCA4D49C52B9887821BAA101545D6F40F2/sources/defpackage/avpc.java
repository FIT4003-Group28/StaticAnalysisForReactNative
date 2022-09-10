package defpackage;

import android.location.Location;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: avpc  reason: default package */
/* loaded from: classes3.dex */
public final class avpc extends cola {
    final /* synthetic */ avpe a;

    public avpc(avpe avpeVar) {
        this.a = avpeVar;
    }

    @Override // defpackage.cola
    public final void a(LocationResult locationResult) {
        Location a = locationResult.a();
        if (a == null) {
            return;
        }
        final akqq akqqVar = new akqq(a.getLatitude(), a.getLongitude());
        avpe avpeVar = this.a;
        dehn h = deew.h(degp.q(avpeVar.d.j()).r(10L, TimeUnit.SECONDS, avpeVar.b), avov.a, avpeVar.b);
        deha.q(deew.g(degp.q(h), new defg(this, akqqVar) { // from class: avoz
            private final avpc a;
            private final akqq b;

            {
                this.a = this;
                this.b = akqqVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                avpc avpcVar = this.a;
                akqq akqqVar2 = this.b;
                return avpcVar.a.e.f((dlsw) obj, akqqVar2);
            }
        }, this.a.b), new avpb(this, a, h, akqqVar), this.a.b);
    }

    @Override // defpackage.cola
    public final void b(LocationAvailability locationAvailability) {
        locationAvailability.a();
    }
}
