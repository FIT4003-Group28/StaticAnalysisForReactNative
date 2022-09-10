package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.format.DateUtils;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Formatter;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bvtb  reason: default package */
/* loaded from: classes4.dex */
public final class bvtb {
    static {
        TimeUnit.MINUTES.toSeconds(5L);
    }

    public static long a(long j) {
        return (j / 60) * 60;
    }

    public static dgaw b(dgaw dgawVar, @dzsi dgas dgasVar) {
        if (dgasVar == null) {
            return dgawVar;
        }
        long j = dgawVar.b + dgasVar.b;
        long a = a(j);
        dsqp dsqpVar = (dsqp) dgawVar.cu(5);
        dsqpVar.bC(dgawVar);
        dgav dgavVar = (dgav) dsqpVar;
        if (dgavVar.c) {
            dgavVar.bF();
            dgavVar.c = false;
        }
        dgaw dgawVar2 = (dgaw) dgavVar.b;
        int i = dgawVar2.a | 1;
        dgawVar2.a = i;
        dgawVar2.b = j;
        int i2 = dgawVar.e;
        int i3 = dgasVar.b;
        int i4 = i | 8;
        dgawVar2.a = i4;
        dgawVar2.e = i2 + i3;
        dgawVar2.a = i4 | 16;
        dgawVar2.f = a;
        return dgavVar.bK();
    }

    public static CharSequence c(Resources resources, @dzsi dgas dgasVar, bvsz bvszVar) {
        return d(resources, dgasVar, bvszVar, null);
    }

    public static CharSequence d(Resources resources, @dzsi dgas dgasVar, bvsz bvszVar, @dzsi bvsw bvswVar) {
        if (dgasVar != null) {
            int i = dgasVar.a;
            if ((i & 4) != 0) {
                return f(resources, dgasVar.d, bvszVar, bvswVar);
            }
            if ((i & 1) != 0) {
                return f(resources, dgasVar.b, bvszVar, bvswVar);
            }
            return (i & 2) != 0 ? dgasVar.c : "";
        }
        return "";
    }

    public static Spanned e(Resources resources, int i, bvsz bvszVar) {
        return f(resources, i, bvszVar, null);
    }

    public static Spanned f(Resources resources, int i, bvsz bvszVar, @dzsi bvsw bvswVar) {
        bvsw bvswVar2;
        int i2;
        bvsv w;
        bvsz bvszVar2 = bvszVar;
        if (bvswVar == null) {
            bvswVar2 = new bvsw();
            bvswVar2.c();
        } else {
            bvswVar2 = bvswVar;
        }
        bvsy bvsyVar = new bvsy(i, bvszVar2);
        if (bvszVar2 == bvsz.CLOCK && bvsyVar.a > 0) {
            bvszVar2 = bvsz.ABBREVIATED;
        }
        bvsx bvsxVar = new bvsx(resources);
        NumberFormat numberFormat = NumberFormat.getInstance();
        bvsv a = bvsxVar.a(numberFormat.format(bvsyVar.a));
        a.e(bvswVar2);
        bvsv a2 = bvsxVar.a(numberFormat.format(bvsyVar.b));
        a2.e(bvswVar2);
        bvsv a3 = bvsxVar.a(numberFormat.format(bvsyVar.c));
        a3.e(bvswVar2);
        bvsv a4 = bvsxVar.a(numberFormat.format(bvsyVar.d));
        a4.e(bvswVar2);
        bvsv a5 = bvsxVar.a("");
        int ordinal = bvszVar2.ordinal();
        int i3 = R.plurals.DA_DAYS_ABBREVIATED_SHORT;
        int i4 = R.plurals.DA_HOURS_ABBREVIATED;
        int i5 = R.plurals.DA_MINUTES_ABBREVIATED;
        int i6 = R.plurals.DA_MINUTES;
        switch (ordinal) {
            case 0:
                bvsu c = bvsxVar.c(R.string.DA_TIME_FORMAT_CLOCK);
                bvsv a6 = bvsxVar.a(Integer.valueOf(bvsyVar.b));
                a6.e(bvswVar2);
                bvsv a7 = bvsxVar.a(Integer.valueOf(bvsyVar.c));
                a7.e(bvswVar2);
                c.a(a6, a7);
                return c.c();
            case 1:
            case 3:
                i2 = R.plurals.DA_DAYS_ABBREVIATED;
                i6 = R.plurals.DA_MINUTES_ABBREVIATED;
                i3 = R.plurals.DA_DAYS_ABBREVIATED;
                break;
            case 2:
                i2 = R.plurals.DA_DAYS_ABBREVIATED_SHORT;
                i6 = R.plurals.DA_MINUTES_ABBREVIATED_SHORT;
                i4 = R.plurals.DA_HOURS_ABBREVIATED_SHORT;
                i5 = R.plurals.DA_MINUTES_ABBREVIATED_SHORT;
                break;
            case 4:
            default:
                i2 = R.plurals.DA_DAYS;
                i3 = R.plurals.DA_DAYS;
                i4 = R.plurals.DA_HOURS;
                i5 = R.plurals.DA_MINUTES;
                break;
            case 5:
                int i7 = bvsyVar.a;
                int i8 = bvsyVar.b;
                int i9 = bvsyVar.c;
                int i10 = bvsyVar.d;
                if (i7 > 0) {
                    a5 = w(bvsxVar, R.plurals.DA_DAYS, i7, a);
                }
                if (i8 > 0) {
                    if (i7 > 0) {
                        a5.g(" ");
                        a5.f(w(bvsxVar, R.plurals.DA_HOURS, bvsyVar.b, a2));
                    } else {
                        a5 = w(bvsxVar, R.plurals.DA_HOURS, bvsyVar.b, a2);
                    }
                }
                if (i9 > 0) {
                    if (i7 > 0 || i8 > 0) {
                        a5.g(" ");
                        a5.f(w(bvsxVar, R.plurals.DA_MINUTES, bvsyVar.c, a3));
                    } else {
                        a5 = w(bvsxVar, R.plurals.DA_MINUTES, bvsyVar.c, a3);
                    }
                }
                if (i10 > 0) {
                    if (i7 > 0 || i8 > 0 || i9 > 0) {
                        a5.g(" ");
                        a5.f(w(bvsxVar, R.plurals.DA_SECONDS, bvsyVar.d, a4));
                    } else {
                        a5.f(w(bvsxVar, R.plurals.DA_SECONDS, bvsyVar.d, a4));
                    }
                }
                return a5.c();
            case 6:
            case 7:
            case 8:
                i3 = R.plurals.DA_DAYS_SHORT;
                i2 = R.plurals.DA_DAYS_ABBREVIATED;
                i6 = R.plurals.DA_MINUTES_ABBREVIATED;
                i5 = R.plurals.DA_MINUTES_BARE_FOLLOWING_HOURS;
                break;
        }
        int i11 = bvsyVar.a;
        if (i11 > 0) {
            int i12 = bvsyVar.b;
            if (i12 == 0) {
                w = w(bvsxVar, i3, i11, a);
            } else {
                w = v(bvsxVar, R.string.DA_TIME_FORMAT_DAYS_AND_HOURS, i2, i11, a, i4, i12, a2);
            }
        } else {
            int i13 = bvsyVar.b;
            if (i13 > 0) {
                int i14 = bvsyVar.c;
                if (i14 == 0) {
                    w = w(bvsxVar, i4, i13, a2);
                } else {
                    w = v(bvsxVar, R.string.DA_TIME_FORMAT_HOURS_AND_MINUTES, i4, i13, a2, i5, i14, a3);
                }
            } else {
                w = w(bvsxVar, i6, bvsyVar.c, a3);
            }
        }
        return w.c();
    }

    public static String[] g(Context context, int i, boolean z, boolean z2, boolean z3, bvsz bvszVar) {
        String string;
        String str;
        String str2 = null;
        if (!z) {
            str = e(context.getResources(), i, bvszVar).toString();
            if (z3) {
                str = context.getString(R.string.TBP_TIME_FORMAT_STRING, str);
            }
        } else {
            bvsz bvszVar2 = bvsz.CLOCK;
            int u = u(i, z2) - 1;
            if (u == 0) {
                string = context.getResources().getString(R.string.DA_RELATIVE_FASTER, e(context.getResources(), Math.abs(i), bvszVar));
            } else if (u != 1) {
                string = context.getResources().getString(R.string.DA_RELATIVE_SLOWER, e(context.getResources(), Math.abs(i), bvszVar));
            } else {
                string = context.getResources().getString(R.string.DA_RELATIVE_EQUIVALENT);
            }
            dbsk.s(string);
            String[] split = string.split("\\n");
            str = split[0];
            if (split.length > 1) {
                str2 = dbsj.f(split[1]);
            }
        }
        return new String[]{str, str2};
    }

    public static String i(Context context, long j) {
        return k(context, j, TimeZone.getDefault());
    }

    public static String j(Context context, int i, int i2, int i3) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.set(2014, 0, 15);
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, i3);
        return k(context, calendar.getTime().getTime() / 1000, timeZone);
    }

    @Deprecated
    public static String k(Context context, long j, TimeZone timeZone) {
        DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(context);
        timeFormat.setTimeZone(timeZone);
        return timeFormat.format(Long.valueOf(j * 1000));
    }

    public static String l(long j, eaou eaouVar) {
        eaol eaolVar = new eaol(eaow.d(j).b, eaouVar);
        try {
            return eato.a().f(eaolVar);
        } catch (IllegalArgumentException unused) {
            return eato.b("H:mm").f(eaolVar);
        }
    }

    public static String m(Context context, long j, TimeZone timeZone, int i) {
        return DateUtils.formatDateRange(context, new Formatter(new StringBuilder(50)), TimeUnit.SECONDS.toMillis(j), TimeUnit.SECONDS.toMillis(j), i, timeZone.getID()).toString();
    }

    public static String n(Context context, long j, long j2, TimeZone timeZone, boolean z) {
        return DateUtils.formatDateRange(context, new Formatter(new StringBuilder(50)), TimeUnit.SECONDS.toMillis(j), TimeUnit.SECONDS.toMillis(j2), true != z ? ImageMetadata.LENS_FILTER_DENSITY : 524305, timeZone.getID()).toString();
    }

    @Deprecated
    public static String o(Context context, long j, TimeZone timeZone, long j2, TimeZone timeZone2) {
        return String.format("%s–%s", k(context, j, timeZone), k(context, j2, timeZone2));
    }

    public static String p(long j, eaou eaouVar, long j2, eaou eaouVar2) {
        return String.format("%s–%s", l(j, eaouVar), l(j2, eaouVar2));
    }

    public static Calendar q(dgaw dgawVar) {
        Calendar calendar = Calendar.getInstance();
        if ((dgawVar.a & 2) != 0) {
            calendar.setTimeZone(TimeZone.getTimeZone(dgawVar.c));
        }
        calendar.setTimeInMillis(TimeUnit.SECONDS.toMillis((dgawVar.a & 16) != 0 ? dgawVar.f : dgawVar.b));
        return calendar;
    }

    public static eapg s(long j) {
        return new eapg(j, t(j));
    }

    public static eaou t(long j) {
        TimeZone timeZone = TimeZone.getDefault();
        try {
            return eaou.l(timeZone);
        } catch (IllegalArgumentException unused) {
            return eaou.k(timeZone.getOffset(j));
        }
    }

    public static int u(int i, boolean z) {
        if (Math.abs(i) < 60) {
            return 2;
        }
        if (z) {
            return i < 0 ? 1 : 3;
        } else if (i < -179) {
            return 1;
        } else {
            return i > 0 ? 3 : 2;
        }
    }

    private static bvsv v(bvsx bvsxVar, int i, int i2, int i3, bvsv bvsvVar, int i4, int i5, bvsv bvsvVar2) {
        bvsu d = bvsxVar.d(i2, i3);
        d.a(bvsvVar);
        bvsu d2 = bvsxVar.d(i4, i5);
        d2.a(bvsvVar2);
        bvsu c = bvsxVar.c(i);
        c.a(d, d2);
        return c;
    }

    private static bvsv w(bvsx bvsxVar, int i, int i2, bvsv bvsvVar) {
        bvsu b = bvsxVar.b(bvsxVar.d(i, i2).c().toString());
        b.a(bvsvVar);
        return b;
    }

    public static String h(Context context, dgaw dgawVar) {
        TimeZone timeZone;
        int i = dgawVar.a;
        if ((i & 1) == 0 && (i & 16) == 0) {
            return "";
        }
        long j = (i & 16) != 0 ? dgawVar.f : dgawVar.b;
        if ((i & 2) != 0) {
            timeZone = TimeZone.getTimeZone(dgawVar.c);
        } else {
            timeZone = TimeZone.getDefault();
        }
        return k(context, j, timeZone);
    }

    public static dpol r(int i) {
        switch (i) {
            case 1:
                return dpol.SUNDAY;
            case 2:
                return dpol.MONDAY;
            case 3:
                return dpol.TUESDAY;
            case 4:
                return dpol.WEDNESDAY;
            case 5:
                return dpol.THURSDAY;
            case 6:
                return dpol.FRIDAY;
            case 7:
                return dpol.SATURDAY;
            default:
                return dpol.DAY_OF_WEEK_UNSPECIFIED;
        }
    }
}
