package defpackage;

import android.app.Application;
import android.icu.text.DateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.os.Build;
import com.google.android.apps.maps.R;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bmuo  reason: default package */
/* loaded from: classes3.dex */
public final class bmuo {
    private final Application a;
    private final apjz b;

    public bmuo(Application application, apjz apjzVar) {
        this.a = application;
        this.b = apjzVar;
    }

    public static final String c(eapg eapgVar, eapg eapgVar2) {
        int i = eaov.c(eapgVar, eapgVar2).p;
        Locale locale = Locale.getDefault();
        if (i <= 0) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 24) {
            return new SimpleDateFormat("y", Locale.getDefault()).format(eapgVar.n());
        }
        Calendar calendar = Calendar.getInstance(TimeZone.GMT_ZONE);
        calendar.set(eapgVar.r(), eapgVar.s() - 1, eapgVar.t());
        return DateFormat.getInstanceForSkeleton(calendar, "y", locale).format(calendar, new StringBuffer(64), new FieldPosition(0)).toString();
    }

    private final String d(eapg eapgVar, eapg eapgVar2, boolean z) {
        int i = eapk.c(eapgVar.v(1), eapgVar2).p;
        Locale locale = Locale.getDefault();
        if (eaov.c(eapgVar, eapgVar2).p > 0) {
            if (z) {
                return new SimpleDateFormat("EEE", locale).format(eapgVar.n());
            }
            return this.b.a(eapgVar, 65560);
        }
        return this.a.getResources().getString(R.string.TODAY_ABBREVIATED);
    }

    public final String a(eapg eapgVar, eapg eapgVar2) {
        return d(eapgVar, eapgVar2, false);
    }

    public final String b(eapg eapgVar, eapg eapgVar2) {
        return d(eapgVar, eapgVar2, true);
    }
}
