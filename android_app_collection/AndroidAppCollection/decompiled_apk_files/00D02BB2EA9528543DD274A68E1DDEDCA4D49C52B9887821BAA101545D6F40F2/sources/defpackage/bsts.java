package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bsts  reason: default package */
/* loaded from: classes4.dex */
public final class bsts extends bszv {
    public Context ad;
    public auhi ae;
    public btwr af;
    public bvjj ag;
    public btlc ah;

    @Override // defpackage.bszv
    protected final String aQ() {
        return Rp(R.string.AREA_TRAFFIC_NOTIFICATION_SETTINGS_PAGE_TITLE);
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
        this.b.b = this.ag.h();
        PreferenceScreen b = this.b.b(J());
        e(b);
        aujb h = this.ae.h(dpyv.AREA_TRAFFIC.dm);
        dbsk.s(h);
        if (h.e(this.af.a()) && h.b() != null) {
            b.aj(this.ah.a(this.ad, h));
        }
    }
}
