package defpackage;

import android.app.Application;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acen  reason: default package */
/* loaded from: classes2.dex */
public final class acen {
    public static String a(dbsg<dqlo> dbsgVar, eaol eaolVar, Application application) {
        eaol f = eaolVar.f(eaou.b);
        if (!dbsgVar.a()) {
            return "";
        }
        Resources resources = application.getResources();
        dpuc dpucVar = dbsgVar.b().b;
        if (dpucVar == null) {
            dpucVar = dpuc.c;
        }
        eaol eaolVar2 = new eaol(dpucVar.b, eaou.b);
        int a = dqln.a(dbsgVar.b().c);
        if (a == 0) {
            a = 1;
        }
        switch (a - 1) {
            case 1:
            case 2:
            case 3:
            case 4:
                int i = eapa.b(eaolVar2, f).p;
                if (i <= 0) {
                    return application.getString(R.string.VISUAL_EXPLORE_JUST_NOW);
                }
                return resources.getQuantityString(R.plurals.VISUAL_EXPLORE_HOURS_AGO, i, Integer.valueOf(i));
            case 5:
                int i2 = eaov.b(eaolVar2, f).p;
                if (i2 <= 0) {
                    return application.getString(R.string.TODAY_ABBREVIATED);
                }
                return resources.getQuantityString(R.plurals.VISUAL_EXPLORE_DAYS_AGO, i2, Integer.valueOf(i2));
            case 6:
                int i3 = eapk.b(eaolVar2, f).p;
                return resources.getQuantityString(R.plurals.VISUAL_EXPLORE_MONTHS_AGO, i3, Integer.valueOf(i3));
            case 7:
                int i4 = eapz.b(eaolVar2, f).p;
                return resources.getQuantityString(R.plurals.VISUAL_EXPLORE_YEARS_AGO, i4, Integer.valueOf(i4));
            default:
                return "";
        }
    }
}
