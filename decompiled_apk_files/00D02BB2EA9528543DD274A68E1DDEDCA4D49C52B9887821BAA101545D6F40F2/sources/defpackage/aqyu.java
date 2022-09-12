package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.text.Html;
import android.text.Spanned;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aqyu  reason: default package */
/* loaded from: classes2.dex */
public final class aqyu implements aqyr {
    public final cjqy a;
    @dzsi
    public cjql b;
    private final Activity c;
    private final ahjq d;
    private final cjxd e;
    private final cjqq f;

    public aqyu(Activity activity, ahjq ahjqVar, cjxd cjxdVar, cjqy cjqyVar, cjqq cjqqVar) {
        this.c = activity;
        this.d = ahjqVar;
        this.e = cjxdVar;
        this.a = cjqyVar;
        this.f = cjqqVar;
    }

    public static boolean a(ahjq ahjqVar) {
        return ahjqVar.h().c(ahjs.DISABLED_BY_SETTING);
    }

    @Override // defpackage.aqyr
    public final void c(boolean z, boolean z2, boolean z3, @dzsi aqyq aqyqVar) {
        araf arafVar;
        String str = "android.settings.LOCATION_SOURCE_SETTINGS";
        if (z3) {
            Activity activity = this.c;
            ahjq ahjqVar = this.d;
            cjxd cjxdVar = this.e;
            if (cjxdVar.a()) {
                arafVar = araf.ANOTHER_DIALOG_SHOWN;
            } else {
                ahjt h = ahjqVar.h();
                ahjs ahjsVar = ahjs.UNKNOWN;
                int ordinal = h.a.ordinal();
                if (ordinal == 0) {
                    arafVar = araf.NO_LOCATION_DEVICE;
                } else if (ordinal == 1) {
                    cjxdVar.e(new AlertDialog.Builder(activity).setTitle(activity.getString(R.string.ERROR_TITLE_GPS_HARDWARE)).setMessage(activity.getString(R.string.ERROR_GPS_HARDWARE)).setOnCancelListener(new aqys(aqyqVar)).create());
                    arafVar = araf.NOT_OPTIMIZED_OR_DISABLED;
                } else if (ordinal == 3) {
                    cjxdVar.c(false, aqyqVar, R.string.ERROR_TITLE_GPS_LOCATION_KITKAT, R.string.ERROR_GPS_LOCATION_KITKAT, R.string.SETTINGS, new Intent(str));
                    arafVar = araf.NOT_OPTIMIZED_OR_DISABLED;
                } else if (ordinal == 4) {
                    cjxdVar.c(false, aqyqVar, R.string.ERROR_TITLE_LOCATION_SERVICES, R.string.ERROR_LOCATION_SERVICES, R.string.SETTINGS, new Intent("com.google.android.gsf.GOOGLE_LOCATION_SETTINGS"));
                    arafVar = araf.NOT_OPTIMIZED_OR_DISABLED;
                } else {
                    arafVar = araf.OPTIMIZED;
                }
            }
        } else if (this.e.a()) {
            arafVar = araf.ANOTHER_DIALOG_SHOWN;
        } else {
            ahjt h2 = this.d.h();
            ahjs ahjsVar2 = h2.a;
            ahjs ahjsVar3 = h2.b;
            if ((ahjsVar2 == ahjs.HARDWARE_MISSING || ahjsVar2 == ahjs.UNKNOWN) && (ahjsVar3 == ahjs.HARDWARE_MISSING || ahjsVar3 == ahjs.UNKNOWN)) {
                arafVar = araf.NO_LOCATION_DEVICE;
            } else if (ahjsVar2 == ahjs.DISABLED_BY_SECURITY) {
                this.e.c(false, aqyqVar, R.string.ERROR_TITLE_LOCATION_SERVICES, R.string.ERROR_LOCATION_SERVICES, R.string.SETTINGS, new Intent("com.google.android.gsf.GOOGLE_LOCATION_SETTINGS"));
                arafVar = araf.NOT_OPTIMIZED_OR_DISABLED;
            } else {
                aqyt aqytVar = new aqyt(this, aqyqVar);
                if ((ahjsVar2 == ahjs.DISABLED_BY_SETTING || ahjsVar2 == ahjs.HARDWARE_MISSING) && (ahjsVar3 == ahjs.DISABLED_BY_SETTING || ahjsVar3 == ahjs.HARDWARE_MISSING)) {
                    this.e.c(false, aqytVar, R.string.ERROR_TITLE_LOCATION_SERVICES, R.string.ERROR_LOCATION_SERVICES, R.string.SETTINGS, new Intent(str));
                    arafVar = araf.NOT_OPTIMIZED_OR_DISABLED;
                } else if (!z2 || z) {
                    if (this.e.f(true, aqyqVar)) {
                        arafVar = araf.NOT_OPTIMIZED_OR_DISABLED;
                    } else if (a(this.d)) {
                        ahjs ahjsVar4 = ahjs.DISABLED_BY_SETTING;
                        ahjs ahjsVar5 = ahjs.DISABLED_BY_SETTING;
                        ahjs ahjsVar6 = h2.c;
                        ahjs ahjsVar7 = ahjs.DISABLED_BY_SETTING;
                        if (ahjsVar2 != ahjsVar4 && ahjsVar3 != ahjsVar5) {
                            str = "android.settings.WIFI_SETTINGS";
                        }
                        Intent intent = new Intent(str);
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.c.getString(R.string.TURNING_ON_FOLLOWINGS_TO_IMPROVE_LOCATION));
                        if (ahjsVar2 == ahjsVar4 || ahjsVar3 == ahjsVar5) {
                            sb.append("<br/>");
                            sb.append(this.c.getString(R.string.LIST_BULLET));
                            sb.append(this.c.getString(R.string.LOCATION_MODE_HIGH_ACCURACY));
                        }
                        if (ahjsVar6 == ahjsVar7) {
                            sb.append("<br/>");
                            sb.append(this.c.getString(R.string.LIST_BULLET));
                            sb.append(this.c.getString(R.string.LOCATION_SOURCE_WIFI));
                        }
                        Spanned fromHtml = Html.fromHtml(sb.toString());
                        this.f.g().d(cjtd.a(dtxs.j));
                        this.b = this.f.g().d(cjtd.a(dtxs.i));
                        this.e.d(true, aqytVar, R.string.IMPROVE_YOUR_LOCATION, fromHtml, R.string.SETTINGS, intent);
                        arafVar = araf.NOT_OPTIMIZED_OR_DISABLED;
                    } else {
                        arafVar = araf.OPTIMIZED;
                    }
                } else {
                    arafVar = araf.RECENTLY_SHOWN;
                }
            }
        }
        aqyqVar.a(arafVar);
    }
}
