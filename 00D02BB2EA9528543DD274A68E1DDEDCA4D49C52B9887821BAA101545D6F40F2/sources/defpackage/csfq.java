package defpackage;

import android.location.Location;
import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: csfq  reason: default package */
/* loaded from: classes5.dex */
public final class csfq {
    public final csfo a;

    public csfq() {
        csfo csfoVar = new csfo();
        this.a = csfoVar;
        csfoVar.d(csfh.c.bS());
        csfoVar.e(SystemClock.elapsedRealtimeNanos());
        csfoVar.a.putLong("start_streaming_time_nanos", 0L);
        csfoVar.f();
        csfoVar.c(0);
        csfoVar.a.putInt("theme", 0);
        csfoVar.b(0L);
        csfoVar.a.putBoolean("is_from_incognito", false);
        csfoVar.a.putBoolean("requires_confirmation", false);
        csfoVar.a.putLong("lens_session_id", 0L);
    }

    public final void a(Location location) {
        this.a.a.putParcelable("image_location", location);
    }
}
