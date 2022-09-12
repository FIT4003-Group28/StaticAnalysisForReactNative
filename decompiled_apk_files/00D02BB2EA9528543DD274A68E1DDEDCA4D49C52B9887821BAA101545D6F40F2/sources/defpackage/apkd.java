package defpackage;

import android.app.Application;
import android.location.LocationManager;
import android.provider.Settings;
/* compiled from: PG */
/* renamed from: apkd  reason: default package */
/* loaded from: classes2.dex */
public final class apkd {
    private final Application a;

    public apkd(Application application) {
        this.a = application;
    }

    public final boolean a() {
        dbsg<Integer> b = b();
        return b.a() ? b.b().intValue() != 0 : !((LocationManager) this.a.getSystemService("location")).getProviders(true).isEmpty();
    }

    public final dbsg<Integer> b() {
        int i = Settings.Secure.getInt(this.a.getContentResolver(), "location_mode", -1);
        return i == -1 ? dbpy.a : dbsg.i(Integer.valueOf(i));
    }
}
