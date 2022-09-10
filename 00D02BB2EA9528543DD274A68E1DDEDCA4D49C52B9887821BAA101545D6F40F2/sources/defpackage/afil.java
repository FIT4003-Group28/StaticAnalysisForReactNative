package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: afil  reason: default package */
/* loaded from: classes.dex */
public final class afil implements afip {
    static {
        dcdg p = dcdn.p();
        p.f("gas_station", afik.GAS_STATIONS);
        p.f("gas_stations", afik.GAS_STATIONS);
        p.f("restaurant", afik.RESTAURANTS);
        p.f("restaurants", afik.RESTAURANTS);
        p.f("cafe", afik.CAFES);
        p.f("cafes", afik.CAFES);
        p.f("parking", afik.PARKING);
        p.f("electric_vehicle_charging_station", afik.ELECTRIC_VEHICLE_CHARGING_STATIONS);
        p.b();
    }

    public afil(Resources resources) {
        dbsk.s(resources);
    }

    @Override // defpackage.afip
    public final boolean a(Intent intent) {
        return "geo".equalsIgnoreCase(intent.getData().getScheme());
    }

    @Override // defpackage.afip
    public final afia b(Intent intent, @dzsi String str) {
        String substring;
        String str2;
        String str3;
        dbsk.l(a(intent));
        Uri data = intent.getData();
        Bundle extras = intent.getExtras();
        String encodedSchemeSpecificPart = data.getEncodedSchemeSpecificPart();
        Float f = null;
        if (dbsj.d(encodedSchemeSpecificPart)) {
            return null;
        }
        afim afimVar = new afim();
        int indexOf = encodedSchemeSpecificPart.indexOf("?");
        if (indexOf == -1) {
            substring = null;
        } else {
            String substring2 = encodedSchemeSpecificPart.substring(0, indexOf);
            substring = encodedSchemeSpecificPart.substring(indexOf + 1);
            encodedSchemeSpecificPart = substring2;
        }
        akqq b = afhi.b(cjxq.a(encodedSchemeSpecificPart));
        if (substring != null) {
            afimVar.parseQuery(substring);
            Float r = afhi.r(afimVar);
            str3 = afimVar.getValue("q");
            if (dbsj.d(afimVar.getValue("c"))) {
                afhh f2 = afhi.f(str3);
                if (f2 != null) {
                    String a = f2.a();
                    str2 = f2.a;
                    str3 = a;
                } else {
                    str2 = null;
                }
                f = r;
            } else {
                return afia.R;
            }
        } else {
            str2 = null;
            str3 = null;
        }
        afhz e = afia.e();
        e.h = f;
        e.f = b;
        e.G = str;
        if (extras != null) {
            e.N = extras.getBoolean("GMM_ENABLE_ONE_BACK_TAP", false);
        }
        if (dbsj.d(str3)) {
            e.a = afib.MAP_ONLY;
            return e.a();
        }
        e.a = afib.SEARCH;
        e.b = str3;
        e.e = str2;
        return e.a();
    }
}
