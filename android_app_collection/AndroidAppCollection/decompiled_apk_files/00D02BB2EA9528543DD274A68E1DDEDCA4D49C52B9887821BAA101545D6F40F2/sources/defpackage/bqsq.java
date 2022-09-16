package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
@Deprecated
/* renamed from: bqsq  reason: default package */
/* loaded from: classes4.dex */
public final class bqsq {
    private static final eapy a = eapy.a(earp.W());
    private final Resources b;

    public bqsq(Resources resources) {
        this.b = resources;
    }

    public static String b(Resources resources, eapy eapyVar) {
        String e = eapyVar.o().e();
        return eapyVar.l() == a.l() ? resources.getString(R.string.VISIT_DATE_STRING_THIS_YEAR, e) : resources.getString(R.string.VISIT_DATE_STRING_PREV_YEAR, e, Integer.valueOf(eapyVar.l()));
    }

    public static boolean c(doco docoVar) {
        return docoVar.j;
    }

    public static eapy d(docg docgVar, docg docgVar2, eapy eapyVar) {
        return e(docgVar2).d(e(docgVar)).c(eapyVar);
    }

    public static dbsg<eapy> e(docg docgVar) {
        drfu drfuVar = docgVar.H;
        if (drfuVar == null) {
            drfuVar = drfu.c;
        }
        if ((drfuVar.a & 1) != 0) {
            drfu drfuVar2 = docgVar.H;
            if (drfuVar2 == null) {
                drfuVar2 = drfu.c;
            }
            dpoj dpojVar = drfuVar2.b;
            if (dpojVar == null) {
                dpojVar = dpoj.e;
            }
            return dbsg.i(f(dpojVar));
        }
        return dbpy.a;
    }

    public static eapy f(dpoj dpojVar) {
        return new eapy(dpojVar.b, dpojVar.c);
    }

    public final String a(eapy eapyVar) {
        return b(this.b, eapyVar);
    }
}
