package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.apps.gmm.notification.optout.NotificationOptOutBroadcastReceiver;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.List;
/* compiled from: PG */
/* renamed from: autv  reason: default package */
/* loaded from: classes2.dex */
public final class autv implements auua {
    private final btwr a;
    private final akfa b;
    private final ckcw c;
    private final Application d;

    public autv(btwr btwrVar, akfa akfaVar, ckcw ckcwVar, Application application) {
        this.a = btwrVar;
        this.b = akfaVar;
        this.c = ckcwVar;
        this.d = application;
    }

    public static dplx c(Context context, int i) {
        dplu bZ = dplx.g.bZ();
        String flattenToString = new ComponentName(context, "com.google.android.maps.MapsActivity").flattenToString();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dplx dplxVar = (dplx) bZ.b;
        flattenToString.getClass();
        int i2 = dplxVar.a | 4;
        dplxVar.a = i2;
        dplxVar.d = flattenToString;
        dplxVar.a = i2 | 1;
        dplxVar.b = "android.intent.action.VIEW";
        dplv bZ2 = dplw.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dplw dplwVar = (dplw) bZ2.b;
        dplwVar.a |= 1;
        dplwVar.d = "use_settings_leaf_page";
        dplwVar.b = 5;
        dplwVar.c = true;
        bZ.a(bZ2);
        dplv bZ3 = dplw.e.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dplw dplwVar2 = (dplw) bZ3.b;
        dplwVar2.a |= 1;
        dplwVar2.d = "notificationSettingIntentExtra";
        dplwVar2.b = 5;
        dplwVar2.c = true;
        bZ.a(bZ3);
        dplv bZ4 = dplw.e.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dplw dplwVar3 = (dplw) bZ4.b;
        dplwVar3.a = 1 | dplwVar3.a;
        dplwVar3.d = "notification_id";
        dplwVar3.b = 4;
        dplwVar3.c = Integer.valueOf(i);
        bZ.a(bZ4);
        return bZ.bK();
    }

    @Override // defpackage.auua
    public final <T> boolean a(@dzsi btlu btluVar, @dzsi aujb aujbVar, List<T> list, dbrn<T, String> dbrnVar, dbrn<T, Intent> dbrnVar2) {
        if (btluVar == null) {
            btluVar = this.b.j();
        }
        if (aujbVar.b() == null || (this.a.b(btluVar).getNotificationsParameters().b & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) == 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 24 || list.size() < 3) {
            if (Build.VERSION.SDK_INT >= 24 || list.size() < 2) {
                for (T t : list) {
                    String a = dbrnVar.a(t);
                    Intent a2 = dbrnVar2.a(t);
                    if (dbqa.e(a, this.d.getString(R.string.OPTIONS)) || dbqa.e(a, this.d.getString(R.string.SETTINGS)) || dbqa.e(a, this.d.getString(R.string.TURN_OFF)) || (a2 != null && a2.hasExtra("notificationSettingIntentExtra"))) {
                        ((ckco) this.c.a(ckht.aW)).a(aujbVar.a);
                        return false;
                    }
                }
                return true;
            }
            ((ckco) this.c.a(ckht.aY)).a(aujbVar.a);
            return false;
        }
        ((ckco) this.c.a(ckht.aX)).a(aujbVar.a);
        return false;
    }

    @Override // defpackage.auua
    public final autz b(@dzsi btlu btluVar, aujb aujbVar, dbsg<ddcu> dbsgVar, dbsg<String> dbsgVar2) {
        dplx bK;
        if (btluVar == null) {
            btluVar = this.b.j();
        }
        dkqj dkqjVar = this.a.b(btluVar).getNotificationsParameters().v;
        if (dkqjVar == null) {
            dkqjVar = dkqj.c;
        }
        boolean z = dkqjVar.b;
        int i = z ? 2 : 5;
        int i2 = 1;
        if (z) {
            bK = c(this.d, aujbVar.a);
        } else {
            Application application = this.d;
            dplu bZ = dplx.g.bZ();
            String flattenToString = new ComponentName(application, NotificationOptOutBroadcastReceiver.class).flattenToString();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dplx dplxVar = (dplx) bZ.b;
            flattenToString.getClass();
            dplxVar.a |= 4;
            dplxVar.d = flattenToString;
            dplv bZ2 = dplw.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dplw dplwVar = (dplw) bZ2.b;
            dplwVar.a |= 1;
            dplwVar.d = "notification_type_id";
            int i3 = aujbVar.a;
            dplwVar.b = 4;
            dplwVar.c = Integer.valueOf(i3);
            bZ.a(bZ2);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dplx dplxVar2 = (dplx) bZ.b;
            dplxVar2.a |= 1;
            dplxVar2.b = "com.google.android.apps.gmm.notification.api.NOTIFICATION_OPT_OUT";
            bK = bZ.bK();
        }
        int a = dkqi.a(dkqjVar.a);
        if (a != 0) {
            i2 = a;
        }
        int i4 = i2 + (-1) != 2 ? R.string.TURN_OFF : R.string.SETTINGS;
        autw autwVar = new autw();
        autwVar.a = 2131232820;
        String string = this.d.getString(i4);
        if (string != null) {
            autwVar.b = string;
            autwVar.f = i;
            if (bK != null) {
                autwVar.c = bK;
                autwVar.d = dbsgVar;
                autwVar.e = dbsgVar2;
                String str = autwVar.a == null ? " icon" : "";
                if (autwVar.b == null) {
                    str = str.concat(" title");
                }
                if (autwVar.f == 0) {
                    str = String.valueOf(str).concat(" intentType");
                }
                if (autwVar.c == null) {
                    str = String.valueOf(str).concat(" androidIntent");
                }
                if (str.isEmpty()) {
                    return new autx(autwVar.a.intValue(), autwVar.b, autwVar.f, autwVar.c, autwVar.d, autwVar.e);
                }
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            throw new NullPointerException("Null androidIntent");
        }
        throw new NullPointerException("Null title");
    }
}
