package defpackage;

import android.app.Application;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import com.google.android.apps.maps.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: apjz  reason: default package */
/* loaded from: classes2.dex */
public class apjz {
    private final Application a;
    private final dzsj<eapg> b;

    public apjz(Application application, dzsj<eapg> dzsjVar) {
        this.a = application;
        this.b = dzsjVar;
    }

    public static String c(String str, Date date) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(date);
    }

    public static String d(String str) {
        return DateFormat.getBestDateTimePattern(Locale.getDefault(), str);
    }

    public static final String e(eapy eapyVar) {
        return c(d("MMMM yyyy"), eapyVar.d(1).n());
    }

    public final String a(eapg eapgVar, int i) {
        return DateUtils.formatDateTime(this.a, eapgVar.l().a, i);
    }

    public final String b(eapg eapgVar, int i) {
        dbsg i2;
        eapg a = this.b.a();
        if (eapgVar.equals(a)) {
            i2 = dbsg.i(this.a.getString(R.string.TODAY));
        } else {
            i2 = eapgVar.equals(a.q(1)) ? dbsg.i(this.a.getString(R.string.YESTERDAY)) : dbpy.a;
        }
        if (i2.a()) {
            return (String) i2.b();
        }
        return a(eapgVar, i);
    }
}
