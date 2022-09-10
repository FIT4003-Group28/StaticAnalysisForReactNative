package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: sht  reason: default package */
/* loaded from: classes7.dex */
public final class sht {
    private static final dcco<Integer, dpol> a;

    static {
        dccm b = dcco.b();
        b.d(2, dpol.MONDAY);
        b.d(3, dpol.TUESDAY);
        b.d(4, dpol.WEDNESDAY);
        b.d(5, dpol.THURSDAY);
        b.d(6, dpol.FRIDAY);
        b.d(7, dpol.SATURDAY);
        b.d(1, dpol.SUNDAY);
        a = b.b();
    }

    public static CharSequence a(Context context, dcep<Integer> dcepVar, boolean z, dngu dnguVar, dngu dnguVar2) {
        String str;
        SimpleDateFormat f;
        if (dcepVar.isEmpty()) {
            return context.getString(R.string.COMMUTE_TIMES_NONE_TEXT);
        }
        CharSequence[] charSequenceArr = new CharSequence[3];
        if (dcepVar.isEmpty()) {
            str = context.getString(R.string.COMMUTE_TIMES_NONE_TEXT);
        } else if (dcepVar.size() != 7) {
            String str2 = null;
            if ((!z || !dbqt.a.g(context.getString(R.string.COMMUTE_DAY_RANGE, "", ""))) && dcepVar.size() >= 3 && dcepVar.size() <= 6) {
                dpol b = dpol.b(dcepVar.iterator().next().intValue());
                dpol dpolVar = b;
                while (dcepVar.contains(Integer.valueOf(d(dpolVar, -1).i))) {
                    dpolVar = d(dpolVar, -1);
                }
                while (dcepVar.contains(Integer.valueOf(d(b, 1).i))) {
                    b = d(b, 1);
                }
                if (d(dpolVar, dcepVar.size() - 1) == b) {
                    SimpleDateFormat f2 = f(context);
                    str2 = context.getString(R.string.COMMUTE_DAY_RANGE, e(dpolVar, f2), e(b, f2));
                }
            }
            if (str2 == null) {
                if (z || dcepVar.size() <= 2) {
                    f = f(context);
                } else {
                    f = new SimpleDateFormat("EEE", z(context));
                }
                ArrayList arrayList = new ArrayList();
                dpol c = c(context);
                for (int i = 0; i < 7; i++) {
                    dpol d = d(c, i);
                    if (dcepVar.contains(Integer.valueOf(d.i))) {
                        arrayList.add(e(d, f));
                    }
                }
                str = TextUtils.join(context.getString(R.string.COMMUTE_DAY_SEPARATOR), arrayList);
            } else {
                str = str2;
            }
        } else {
            str = context.getString(R.string.COMMUTE_DAY_EVERY_DAY_TEXT);
        }
        charSequenceArr[0] = str;
        charSequenceArr[1] = "\n";
        charSequenceArr[2] = y(context, dnguVar, dnguVar2, R.string.GO_HOME_AT_NEXT_DAY_TITLE, R.string.COMMUTE_TIMES_TEXT);
        return TextUtils.concat(charSequenceArr);
    }

    public static CharSequence b(Context context, dngu dnguVar, dngu dnguVar2) {
        return y(context, dnguVar, dnguVar2, R.string.GO_HOME_AT_NEXT_DAY_SHORT_TITLE, rny.WORK_TIMES_TEXT);
    }

    public static dpol c(Context context) {
        return a.get(Integer.valueOf(Calendar.getInstance(z(context)).getFirstDayOfWeek()));
    }

    public static dpol d(dpol dpolVar, int i) {
        return dpol.b((((((dpolVar.i + i) - 1) % 7) + 7) % 7) + 1);
    }

    public static String e(dpol dpolVar, SimpleDateFormat simpleDateFormat) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(7, ((Integer) ((dcmh) a).e.get(dpolVar)).intValue());
        return simpleDateFormat.format(calendar.getTime());
    }

    public static SimpleDateFormat f(Context context) {
        return new SimpleDateFormat("EEEE", z(context));
    }

    public static boolean g(dngu dnguVar, dngu dnguVar2) {
        return h(new eapi(dnguVar.b, dnguVar.c, dnguVar.d), new eapi(dnguVar2.b, dnguVar2.c, dnguVar2.d));
    }

    public static boolean h(eapi eapiVar, eapi eapiVar2) {
        return !eapiVar2.B(eapiVar);
    }

    public static dngu i(dngu dnguVar) {
        int i = dnguVar.b;
        int i2 = ((i % 24) + 24) % 24;
        if (i2 != i) {
            dngt ca = dngu.e.ca(dnguVar);
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dngu dnguVar2 = (dngu) ca.b;
            dnguVar2.a |= 1;
            dnguVar2.b = i2;
            return ca.bK();
        }
        return dnguVar;
    }

    public static boolean j(dngu dnguVar) {
        return dnguVar.b >= 24;
    }

    public static String k(Context context, @dzsi azva azvaVar) {
        if (azvaVar == null) {
            return context.getString(R.string.SETTING_NOT_SET_TEXT);
        }
        if (akqi.d(azvaVar.c) || azvaVar.e == null) {
            return dbsj.e(azvaVar.d);
        }
        return context.getString(R.string.DROPPED_PIN);
    }

    public static String l(Context context, String str) {
        return context.getString(R.string.ROUTE_TO_WORK_SUMMARY, str);
    }

    public static String m(Context context, String str) {
        return context.getString(R.string.ROUTE_TO_HOME_SUMMARY, str);
    }

    @dzsi
    public static cqtd n(domy domyVar) {
        domy domyVar2 = domy.UNKNOWN_TRAVEL_MODE;
        switch (domyVar.ordinal()) {
            case 1:
                return iut.a(cqrt.f(2131232231));
            case 2:
                return iut.a(cqrt.f(2131232235));
            case 3:
                return iut.a(cqrt.f(2131232237));
            case 4:
                return iut.a(cqrt.f(2131232224));
            case 5:
                return iut.a(cqrt.f(2131231606));
            case 6:
                return iut.a(cqrt.f(2131232214));
            default:
                return null;
        }
    }

    @dzsi
    public static cqtd o(domy domyVar) {
        domy domyVar2 = domy.UNKNOWN_TRAVEL_MODE;
        switch (domyVar.ordinal()) {
            case 0:
                return iut.a(cqrt.f(2131232225));
            case 1:
                return iut.a(cqrt.f(2131232230));
            case 2:
                return iut.a(cqrt.f(2131232234));
            case 3:
                return iut.a(cqrt.f(2131232236));
            case 4:
                return iut.a(cqrt.f(2131232223));
            case 5:
                return iut.a(cqrt.f(2131231605));
            case 6:
                return iut.a(cqrt.f(2131232213));
            default:
                return null;
        }
    }

    @dzsi
    public static String p(Context context, btvo btvoVar, domy domyVar) {
        domy domyVar2 = domy.UNKNOWN_TRAVEL_MODE;
        switch (domyVar.ordinal()) {
            case 0:
                return context.getString(R.string.COMMUTE_MINIMALLY_SUPPORTED_TRAVEL_MODE_SUBTITLE);
            case 1:
                return context.getString(R.string.COMMUTE_DRIVE_SUBTITLE);
            case 2:
                return context.getString(R.string.COMMUTE_TRANSIT_SUBTITLE);
            case 3:
            case 4:
                return "";
            case 5:
                return context.getString(R.string.COMMUTE_TWO_WHEELERS_SUBTITLE);
            case 6:
                return sif.b(btvoVar) ? context.getString(R.string.COMMUTE_MULTIMODAL_SUBTITLE) : "";
            default:
                return null;
        }
    }

    public static String q(Context context, btvo btvoVar, domy domyVar) {
        return r(context, btvoVar, domyVar, false, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String r(Context context, btvo btvoVar, domy domyVar, boolean z, boolean z2) {
        domy domyVar2 = domy.UNKNOWN_TRAVEL_MODE;
        switch (domyVar.ordinal()) {
            case 0:
                break;
            case 1:
                return context.getString(R.string.COMMUTE_DRIVE_TITLE);
            case 2:
                return context.getString(R.string.COMMUTE_TRANSIT_TITLE);
            case 3:
                return context.getString(R.string.COMMUTE_WALKING_TITLE);
            case 4:
                return context.getString(R.string.COMMUTE_BIKING_TITLE);
            case 5:
                return context.getString(R.string.COMMUTE_TWO_WHEELERS_TITLE);
            case 6:
                if (sif.b(btvoVar)) {
                    return context.getString(R.string.COMMUTE_MULTIMODAL_TITLE);
                }
                break;
            default:
                return domyVar.name();
        }
        if (z) {
            return context.getString(R.string.COMMUTE_UNKNOWN_TRAVEL_MODE_TITLE);
        }
        if (z2) {
            return context.getString(R.string.COMMUTE_UNLISTED_TRAVEL_MODE_TEXT);
        }
        return context.getString(R.string.COMMUTE_UNKNOWN_TRAVEL_MODE_SUMMARY);
    }

    @dzsi
    public static ddho s(domy domyVar) {
        domy domyVar2 = domy.UNKNOWN_TRAVEL_MODE;
        switch (domyVar.ordinal()) {
            case 0:
                return dtxl.cE;
            case 1:
                return dtxl.cB;
            case 2:
                return dtxl.cG;
            case 3:
                return dtxl.cI;
            case 4:
                return dtxl.cz;
            case 5:
                return dtxl.cH;
            case 6:
                return dtxl.cC;
            default:
                return null;
        }
    }

    public static rzo t(domy domyVar) {
        if (domyVar == domy.UNKNOWN_TRAVEL_MODE) {
            return new rzo(ror.MULTIMODAL_ROUTE_TO_HOME, ror.MULTIMODAL_ROUTE_TO_WORK).f(new rzo(ror.SCHEDULE).f(rzo.c()));
        }
        if (domyVar == domy.TRANSIT) {
            return rzo.d();
        }
        if (domyVar == domy.MULTIMODAL) {
            return rzo.c();
        }
        return rzo.c().f(rzo.d());
    }

    public static dngu u(eapi eapiVar) {
        dngt bZ = dngu.e.bZ();
        int c = eapiVar.c();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dngu dnguVar = (dngu) bZ.b;
        dnguVar.a |= 1;
        dnguVar.b = c;
        int d = eapiVar.d();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dngu dnguVar2 = (dngu) bZ.b;
        dnguVar2.a |= 2;
        dnguVar2.c = d;
        return bZ.bK();
    }

    public static eapi v(dngu dnguVar) {
        return new eapi(((dnguVar.b % 24) + 24) % 24, ((dnguVar.c % 60) + 60) % 60, ((dnguVar.d % 60) + 60) % 60);
    }

    @dzsi
    public static jhk w(dopk dopkVar) {
        for (doph dophVar : dopkVar.e) {
            jhk c = xkg.c(dophVar);
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    public static amvh x(dopk dopkVar) {
        amvg P = amvh.P();
        P.a = dpjs.ENTITY_TYPE_DEFAULT;
        P.c = akqi.b(dopkVar.d);
        dnoh dnohVar = dopkVar.g;
        if (dnohVar == null) {
            dnohVar = dnoh.d;
        }
        P.d = akqq.e(dnohVar);
        P.j = dopkVar.b;
        P.k = true;
        P.B = true;
        return P.a();
    }

    private static CharSequence y(Context context, dngu dnguVar, dngu dnguVar2, int i, int i2) {
        String j = bvtb.j(context, dnguVar.b, dnguVar.c, dnguVar.d);
        dngu i3 = i(dnguVar2);
        CharSequence j2 = bvtb.j(context, i3.b, i3.c, i3.d);
        if (g(dnguVar, i3)) {
            j2 = TextUtils.concat(j2, " ", context.getString(i));
        }
        return context.getString(i2, j, j2);
    }

    private static Locale z(Context context) {
        return akr.a(context.getResources().getConfiguration()).d();
    }
}
