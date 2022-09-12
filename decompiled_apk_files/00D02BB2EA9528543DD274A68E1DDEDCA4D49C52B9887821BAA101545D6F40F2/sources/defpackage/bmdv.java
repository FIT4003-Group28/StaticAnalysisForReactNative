package defpackage;

import android.app.Application;
import android.content.res.Resources;
import android.text.format.DateUtils;
import com.google.android.apps.maps.R;
import java.text.DateFormatSymbols;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: bmdv  reason: default package */
/* loaded from: classes3.dex */
public class bmdv {
    private static final dcqe c = dcqe.c("bmdv");
    public final cqat a;
    public final Application b;

    public bmdv(cqat cqatVar, Application application) {
        this.a = cqatVar;
        this.b = application;
    }

    public static eapg g(long j, @dzsi String str) {
        TimeZone timeZone;
        eaou k;
        if (dbsj.d(str)) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = TimeZone.getTimeZone(str);
        }
        try {
            k = eaou.l(timeZone);
        } catch (IllegalArgumentException unused) {
            k = eaou.k(timeZone.getOffset(j));
        }
        return new eapg(j, k);
    }

    public final String a(dosf dosfVar, String str) {
        return b(dosfVar, str, false);
    }

    public final String b(dosf dosfVar, String str, boolean z) {
        int i = dosfVar.a;
        if ((i & 1) == 0 && (i & 2) == 0) {
            return "";
        }
        return d((i & 2) != 0 ? dosfVar.c - 1 : dosfVar.b, str, z);
    }

    public final String c(long j, String str) {
        return d(j, str, false);
    }

    public final String d(long j, String str, boolean z) {
        return e(j, g(j, str), z);
    }

    public final String e(long j, eapg eapgVar, boolean z) {
        String string;
        String string2;
        long b = this.a.b();
        Resources resources = this.b.getResources();
        eapg g = g(b, null);
        int i = eaov.c(eapgVar, g).p;
        int u = g.u() - 1;
        int i2 = u + 7;
        eapg q = g.q(u);
        eapt q2 = g.q(g.t());
        eapt q3 = g.q(g.b.E().d(g.a));
        int i3 = eapw.c(eapgVar, q).p + 1;
        int i4 = eapk.c(eapgVar, q2).p + 1;
        int i5 = eapz.c(eapgVar, q3).p + 1;
        if (i <= 0) {
            return resources.getString(true != z ? R.string.LAST_HERE_TODAY : R.string.TODAY);
        } else if (i == 1) {
            return resources.getString(true != z ? R.string.LAST_HERE_YESTERDAY : R.string.YESTERDAY);
        } else if (i < 7) {
            String f = f(eapgVar, j);
            return z ? f : resources.getString(R.string.LAST_HERE_DAY_OF_WEEK, f);
        } else if (i <= i2) {
            return resources.getString(true != z ? R.string.LAST_HERE_LAST_WEEK : R.string.LAST_WEEK);
        } else if (i3 <= 4 || eapgVar.equals(q2) || eapgVar.B(q2)) {
            return resources.getQuantityString(true != z ? R.plurals.LAST_HERE_WEEKS_AGO : R.plurals.WEEKS_AGO, i3, Integer.valueOf(i3));
        } else if (i4 == 1) {
            return resources.getString(true != z ? R.string.LAST_HERE_LAST_MONTH : R.string.LAST_MONTH);
        } else if (eapgVar.equals(q3) || eapgVar.B(q3)) {
            if (z) {
                return apjz.c(apjz.d("MMMM"), eapgVar.n());
            }
            int s = eapgVar.s();
            Resources resources2 = this.b.getResources();
            switch (s) {
                case 1:
                    string = resources2.getString(R.string.LAST_HERE_JANUARY);
                    break;
                case 2:
                    string = resources2.getString(R.string.LAST_HERE_FEBRUARY);
                    break;
                case 3:
                    string = resources2.getString(R.string.LAST_HERE_MARCH);
                    break;
                case 4:
                    string = resources2.getString(R.string.LAST_HERE_APRIL);
                    break;
                case 5:
                    string = resources2.getString(R.string.LAST_HERE_MAY);
                    break;
                case 6:
                    string = resources2.getString(R.string.LAST_HERE_JUNE);
                    break;
                case 7:
                    string = resources2.getString(R.string.LAST_HERE_JULY);
                    break;
                case 8:
                    string = resources2.getString(R.string.LAST_HERE_AUGUST);
                    break;
                case 9:
                    string = resources2.getString(R.string.LAST_HERE_SEPTEMBER);
                    break;
                case 10:
                    string = resources2.getString(R.string.LAST_HERE_OCTOBER);
                    break;
                case 11:
                    string = resources2.getString(R.string.LAST_HERE_NOVEMBER);
                    break;
                case 12:
                    string = resources2.getString(R.string.LAST_HERE_DECEMBER);
                    break;
                default:
                    string = null;
                    break;
            }
            if (!dbsj.d(string)) {
                return string;
            }
            bvoo.h("Invalid month.", new Object[0]);
            return resources.getQuantityString(R.plurals.LAST_HERE_MONTHS_AGO, i4, Integer.valueOf(i4));
        } else {
            int i6 = R.plurals.LAST_HERE_YEARS_AGO;
            if (i5 != 1) {
                if (true == z) {
                    i6 = R.plurals.YEARS_AGO;
                }
                return resources.getQuantityString(i6, i5, Integer.valueOf(i5));
            } else if (z) {
                return apjz.e(new eapy(eapgVar));
            } else {
                int s2 = eapgVar.s();
                String c2 = apjz.c(apjz.d("yyyy"), eapgVar.n());
                Resources resources3 = this.b.getResources();
                switch (s2) {
                    case 1:
                        string2 = resources3.getString(R.string.LAST_HERE_JANUARY_LAST_YEAR, c2);
                        break;
                    case 2:
                        string2 = resources3.getString(R.string.LAST_HERE_FEBRUARY_LAST_YEAR, c2);
                        break;
                    case 3:
                        string2 = resources3.getString(R.string.LAST_HERE_MARCH_LAST_YEAR, c2);
                        break;
                    case 4:
                        string2 = resources3.getString(R.string.LAST_HERE_APRIL_LAST_YEAR, c2);
                        break;
                    case 5:
                        string2 = resources3.getString(R.string.LAST_HERE_MAY_LAST_YEAR, c2);
                        break;
                    case 6:
                        string2 = resources3.getString(R.string.LAST_HERE_JUNE_LAST_YEAR, c2);
                        break;
                    case 7:
                        string2 = resources3.getString(R.string.LAST_HERE_JULY_LAST_YEAR, c2);
                        break;
                    case 8:
                        string2 = resources3.getString(R.string.LAST_HERE_AUGUST_LAST_YEAR, c2);
                        break;
                    case 9:
                        string2 = resources3.getString(R.string.LAST_HERE_SEPTEMBER_LAST_YEAR, c2);
                        break;
                    case 10:
                        string2 = resources3.getString(R.string.LAST_HERE_OCTOBER_LAST_YEAR, c2);
                        break;
                    case 11:
                        string2 = resources3.getString(R.string.LAST_HERE_NOVEMBER_LAST_YEAR, c2);
                        break;
                    case 12:
                        string2 = resources3.getString(R.string.LAST_HERE_DECEMBER_LAST_YEAR, c2);
                        break;
                    default:
                        string2 = null;
                        break;
                }
                return dbsj.d(string2) ? resources.getQuantityString(R.plurals.LAST_HERE_YEARS_AGO, 1, 1) : string2;
            }
        }
    }

    public final String f(eapg eapgVar, long j) {
        String[] weekdays = DateFormatSymbols.getInstance().getWeekdays();
        if (weekdays == null || weekdays.length < 7) {
            bvoo.h("Unsupported locale by DateFormatSymbols.", new Object[0]);
            return DateUtils.formatDateTime(this.b.getApplicationContext(), j, 2);
        }
        switch (eapgVar.u()) {
            case 1:
                return weekdays[2];
            case 2:
                return weekdays[3];
            case 3:
                return weekdays[4];
            case 4:
                return weekdays[5];
            case 5:
                return weekdays[6];
            case 6:
                return weekdays[7];
            case 7:
                return weekdays[1];
            default:
                bvoo.h("Unexpected day of week.", new Object[0]);
                return DateUtils.formatDateTime(this.b.getApplicationContext(), j, 2);
        }
    }
}
