package defpackage;

import android.app.Application;
import android.content.Context;
import android.text.format.DateFormat;
import com.google.android.apps.maps.R;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: xig  reason: default package */
/* loaded from: classes7.dex */
public class xig implements xif {
    private final Context a;
    private final eapg b;
    private final eapg c;
    @dzsi
    private final ddho d;

    public xig(Application application, eapg eapgVar, eapg eapgVar2, @dzsi ddho ddhoVar) {
        this.a = application;
        this.b = eapgVar;
        this.c = eapgVar2;
        this.d = ddhoVar;
    }

    private static String c(eapg eapgVar, String str, Locale locale) {
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(locale, str), locale).format(eapgVar.n());
    }

    @Override // defpackage.xif
    public String a() {
        Locale d = akr.a(this.a.getResources().getConfiguration()).d();
        if (this.c.equals(this.b)) {
            return this.a.getString(R.string.TRANSIT_COMMUTE_BOARD_DAY_HEADER_TODAY, c(this.c, "MMM d", d));
        }
        if (this.c.equals(this.b.p(1))) {
            return this.a.getString(R.string.TRANSIT_COMMUTE_BOARD_DAY_HEADER_TOMORROW, c(this.c, "MMM d", d));
        }
        return c(this.c, "EEE, MMM d", d);
    }

    @Override // defpackage.xif
    public cjtd b() {
        return cjtd.a(this.d);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }
}
