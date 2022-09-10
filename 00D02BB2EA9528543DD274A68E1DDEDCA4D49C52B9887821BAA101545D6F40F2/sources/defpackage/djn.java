package defpackage;

import android.location.Location;
import com.google.android.apps.gmm.location.rawlocationevents.GeoArLocationEvent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: djn  reason: default package */
/* loaded from: classes6.dex */
public final class djn implements aa<dad> {
    private final btrm a;
    private final cqat b;
    private final deia c;
    private final deia d;

    public djn(btrm btrmVar, cqat cqatVar, deia deiaVar, deia deiaVar2) {
        this.a = btrmVar;
        this.b = cqatVar;
        this.c = deiaVar;
        this.d = deiaVar2;
    }

    @Override // defpackage.aa
    public final /* bridge */ /* synthetic */ void m(@dzsi dad dadVar) {
        dad dadVar2 = dadVar;
        if (dadVar2 == null) {
            return;
        }
        if (this.c.c()) {
            Location location = new Location(GeoArLocationEvent.GEO_AR_PROVIDER);
            dsza e = dadVar2.e();
            location.setLatitude(e.b);
            location.setLongitude(e.c);
            location.setAltitude(e.d);
            location.setAccuracy((float) dadVar2.b().d);
            location.setTime(this.b.b());
            location.setElapsedRealtimeNanos(this.b.f());
            this.a.b(new GeoArLocationEvent(location));
        }
        if (!this.d.c()) {
            return;
        }
        btrm btrmVar = this.a;
        double c = dadVar2.c();
        btrmVar.b(new ahky((float) c, (float) dadVar2.b().c, this.b.e()));
    }
}
