package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: jja  reason: default package */
/* loaded from: classes3.dex */
public final class jja implements akuk {
    private final jnn a;

    public jja(jnn jnnVar) {
        this.a = jnnVar;
    }

    @Override // defpackage.akuk
    public final void a(String str, Bundle bundle) {
        bundle.putString(agks.WIFI_POLICY, String.valueOf(this.a.l()));
        bundle.putString("offline_use_sd_card", String.valueOf(this.a.P()));
        bundle.putString(agks.DOWNLOAD_NETWORK_PREFERENCE, this.a.w().name());
    }

    @Override // defpackage.akuk
    public final void d(Bundle bundle) {
    }
}
