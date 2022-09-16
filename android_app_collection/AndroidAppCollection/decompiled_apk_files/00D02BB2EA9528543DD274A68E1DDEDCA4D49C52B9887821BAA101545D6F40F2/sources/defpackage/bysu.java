package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bysu  reason: default package */
/* loaded from: classes4.dex */
public final class bysu {
    public final Bundle a;

    public bysu(Bundle bundle) {
        this.a = bundle;
    }

    public static byst a() {
        return new byst(new Bundle());
    }

    public static bysu h(Bundle bundle) {
        return new bysu(bundle);
    }

    public final String b() {
        Bundle bundle = this.a;
        return bundle == null ? "" : bundle.getString("BUNDLE_FEATURE_ID_KEY", "");
    }

    public final String c() {
        Bundle bundle = this.a;
        return bundle == null ? "" : bundle.getString("BUNDLE_STATION_NAME_KEY", "");
    }

    public final String d() {
        Bundle bundle = this.a;
        return bundle == null ? "" : bundle.getString("BUNDLE_LOCALE_KEY", "");
    }

    public final boolean e() {
        Bundle bundle = this.a;
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("BUNDLE_IS_REALTIME_INFO_AVAILABLE_KEY", false);
    }

    public final boolean f() {
        Bundle bundle = this.a;
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("BUNDLE_IS_ALERT_INFO_AVAILABLE_KEY", false);
    }

    public final boolean g() {
        Bundle bundle = this.a;
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("BUNDLE_IS_GLOBAL_BAN_KEY", true);
    }
}
