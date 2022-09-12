package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: byst  reason: default package */
/* loaded from: classes4.dex */
public final class byst {
    private final Bundle a;

    public byst(Bundle bundle) {
        this.a = bundle;
    }

    public final bysu a() {
        return new bysu(this.a);
    }

    public final void b(String str) {
        this.a.putString("BUNDLE_FEATURE_ID_KEY", str);
    }

    public final void c(boolean z) {
        this.a.putBoolean("BUNDLE_IS_ALERT_INFO_AVAILABLE_KEY", z);
    }

    public final void d(boolean z) {
        this.a.putBoolean("BUNDLE_IS_GLOBAL_BAN_KEY", z);
    }

    public final void e(boolean z) {
        this.a.putBoolean("BUNDLE_IS_REALTIME_INFO_AVAILABLE_KEY", z);
    }

    public final void f(String str) {
        this.a.putString("BUNDLE_LOCALE_KEY", str);
    }

    public final void g(String str) {
        this.a.putString("BUNDLE_STATION_NAME_KEY", str);
    }
}
