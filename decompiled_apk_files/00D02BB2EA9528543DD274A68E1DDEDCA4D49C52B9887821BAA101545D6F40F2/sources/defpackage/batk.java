package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import com.google.android.apps.maps.R;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: batk  reason: default package */
/* loaded from: classes3.dex */
public final class batk {
    public static String a(Context context, drjs drjsVar) {
        drjj drjjVar;
        drjj drjjVar2;
        drke drkeVar;
        drix drixVar;
        drkd drkdVar = drkd.UNKNOWN_TRANSPORTATION_TYPE;
        drjr drjrVar = drjr.FLIGHT_RESERVATION;
        switch (drjr.a(drjsVar.a).ordinal()) {
            case 0:
                if (drjsVar.a == 3) {
                    drjjVar = (drjj) drjsVar.b;
                } else {
                    drjjVar = drjj.c;
                }
                drjh drjhVar = drjjVar.a;
                if (drjhVar == null) {
                    drjhVar = drjh.j;
                }
                drir drirVar = drjhVar.b;
                if (drirVar == null) {
                    drirVar = drir.d;
                }
                if (drjsVar.a == 3) {
                    drjjVar2 = (drjj) drjsVar.b;
                } else {
                    drjjVar2 = drjj.c;
                }
                drjh drjhVar2 = drjjVar2.a;
                if (drjhVar2 == null) {
                    drjhVar2 = drjh.j;
                }
                drir drirVar2 = drjhVar2.c;
                if (drirVar2 == null) {
                    drirVar2 = drir.d;
                }
                String r = r(context, drirVar.c, drirVar2.c, "");
                return r.isEmpty() ? r(context, drirVar.a, drirVar2.a, context.getResources().getString(R.string.RESERVATION_FLIGHT_PLACEHOLDER)) : r;
            case 1:
            case 4:
            case 5:
            case 6:
                return e(drjsVar).g;
            case 2:
                if (drjsVar.a == 5) {
                    drkeVar = (drke) drjsVar.b;
                } else {
                    drkeVar = drke.k;
                }
                drdg drdgVar = drkeVar.e;
                if (drdgVar == null) {
                    drdgVar = drdg.q;
                }
                String str = drdgVar.g;
                drdg drdgVar2 = drkeVar.h;
                if (drdgVar2 == null) {
                    drdgVar2 = drdg.q;
                }
                String r2 = r(context, str, drdgVar2.g, "");
                return r2.isEmpty() ? r(context, drkeVar.g, drkeVar.j, context.getResources().getString(R.string.RESERVATION_TRANSPORTATION_PLACEHOLDER)) : r2;
            case 3:
                Resources resources = context.getResources();
                Object[] objArr = new Object[1];
                if (drjsVar.a == 6) {
                    drixVar = (drix) drjsVar.b;
                } else {
                    drixVar = drix.f;
                }
                drkk drkkVar = drixVar.b;
                if (drkkVar == null) {
                    drkkVar = drkk.b;
                }
                objArr[0] = drkkVar.a;
                return resources.getString(R.string.RESERVATION_CAR_RENTAL_WITH, objArr);
            default:
                return "";
        }
    }

    public static String b(Context context, drjs drjsVar) {
        drjj drjjVar;
        drjl drjlVar;
        drke drkeVar;
        drix drixVar;
        drju drjuVar;
        drju drjuVar2;
        drit dritVar;
        drka drkaVar;
        drkd drkdVar = drkd.UNKNOWN_TRANSPORTATION_TYPE;
        drjr drjrVar = drjr.FLIGHT_RESERVATION;
        switch (drjr.a(drjsVar.a).ordinal()) {
            case 0:
                if (drjsVar.a == 3) {
                    drjjVar = (drjj) drjsVar.b;
                } else {
                    drjjVar = drjj.c;
                }
                drjh drjhVar = drjjVar.a;
                if (drjhVar == null) {
                    drjhVar = drjh.j;
                }
                drjf drjfVar = drjhVar.f;
                if (drjfVar == null) {
                    drjfVar = drjf.d;
                }
                String str = drjfVar.a;
                int i = drjhVar.g;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(str);
                sb.append(" ");
                sb.append(i);
                String sb2 = sb.toString();
                dqfu dqfuVar = drjhVar.d;
                if (dqfuVar == null) {
                    dqfuVar = dqfu.d;
                }
                return s(context, sb2, k(context, dqfuVar));
            case 1:
                if (drjsVar.a == 4) {
                    drjlVar = (drjl) drjsVar.b;
                } else {
                    drjlVar = drjl.f;
                }
                int i2 = drjlVar.e;
                return i2 > 0 ? context.getResources().getQuantityString(R.plurals.RESERVATION_HOTEL_NIGHTS, i2, Integer.valueOf(i2)) : "";
            case 2:
                if (drjsVar.a == 5) {
                    drkeVar = (drke) drjsVar.b;
                } else {
                    drkeVar = drke.k;
                }
                String s = s(context, !drkeVar.c.isEmpty() ? drkeVar.c : drkeVar.d, drkeVar.g);
                dqfu dqfuVar2 = drkeVar.f;
                if (dqfuVar2 == null) {
                    dqfuVar2 = dqfu.d;
                }
                return s(context, s, k(context, dqfuVar2));
            case 3:
                Resources resources = context.getResources();
                Object[] objArr = new Object[1];
                if (drjsVar.a == 6) {
                    drixVar = (drix) drjsVar.b;
                } else {
                    drixVar = drix.f;
                }
                driv drivVar = drixVar.a;
                if (drivVar == null) {
                    drivVar = driv.b;
                }
                objArr[0] = drivVar.a;
                return resources.getString(R.string.RESERVATION_CAR_TYPE, objArr);
            case 4:
                if (drjsVar.a == 7) {
                    drjuVar = (drju) drjsVar.b;
                } else {
                    drjuVar = drju.d;
                }
                int i3 = drjuVar.c;
                if (drjsVar.a == 7) {
                    drjuVar2 = (drju) drjsVar.b;
                } else {
                    drjuVar2 = drju.d;
                }
                dqfu dqfuVar3 = drjuVar2.b;
                if (dqfuVar3 == null) {
                    dqfuVar3 = dqfu.d;
                }
                String k = k(context, dqfuVar3);
                return i3 <= 0 ? k : s(context, context.getResources().getString(R.string.RESERVATION_RESTAURANT_TABLE_FOR, Integer.valueOf(i3)), k);
            case 5:
                if (drjsVar.a == 8) {
                    dritVar = (drit) drjsVar.b;
                } else {
                    dritVar = drit.f;
                }
                String str2 = dritVar.a;
                dqfu dqfuVar4 = dritVar.b;
                if (dqfuVar4 == null) {
                    dqfuVar4 = dqfu.d;
                }
                return s(context, str2, k(context, dqfuVar4));
            case 6:
                if (drjsVar.a == 11) {
                    drkaVar = (drka) drjsVar.b;
                } else {
                    drkaVar = drka.f;
                }
                String str3 = drkaVar.e;
                dqfu dqfuVar5 = drkaVar.b;
                if (dqfuVar5 == null) {
                    dqfuVar5 = dqfu.d;
                }
                return s(context, str3, k(context, dqfuVar5));
            default:
                return "";
        }
    }

    public static dqfu c(drjs drjsVar) {
        drjj drjjVar;
        drjl drjlVar;
        drke drkeVar;
        drix drixVar;
        drju drjuVar;
        drit dritVar;
        drka drkaVar;
        if (drjsVar == null) {
            return dqfu.d;
        }
        drkd drkdVar = drkd.UNKNOWN_TRANSPORTATION_TYPE;
        drjr drjrVar = drjr.FLIGHT_RESERVATION;
        switch (drjr.a(drjsVar.a).ordinal()) {
            case 0:
                if (drjsVar.a == 3) {
                    drjjVar = (drjj) drjsVar.b;
                } else {
                    drjjVar = drjj.c;
                }
                drjh drjhVar = drjjVar.a;
                if (drjhVar == null) {
                    drjhVar = drjh.j;
                }
                dqfu dqfuVar = drjhVar.d;
                return dqfuVar == null ? dqfu.d : dqfuVar;
            case 1:
                if (drjsVar.a == 4) {
                    drjlVar = (drjl) drjsVar.b;
                } else {
                    drjlVar = drjl.f;
                }
                dqfu dqfuVar2 = drjlVar.c;
                return dqfuVar2 == null ? dqfu.d : dqfuVar2;
            case 2:
                if (drjsVar.a == 5) {
                    drkeVar = (drke) drjsVar.b;
                } else {
                    drkeVar = drke.k;
                }
                dqfu dqfuVar3 = drkeVar.f;
                return dqfuVar3 == null ? dqfu.d : dqfuVar3;
            case 3:
                if (drjsVar.a == 6) {
                    drixVar = (drix) drjsVar.b;
                } else {
                    drixVar = drix.f;
                }
                dqfu dqfuVar4 = drixVar.d;
                return dqfuVar4 == null ? dqfu.d : dqfuVar4;
            case 4:
                if (drjsVar.a == 7) {
                    drjuVar = (drju) drjsVar.b;
                } else {
                    drjuVar = drju.d;
                }
                dqfu dqfuVar5 = drjuVar.b;
                return dqfuVar5 == null ? dqfu.d : dqfuVar5;
            case 5:
                if (drjsVar.a == 8) {
                    dritVar = (drit) drjsVar.b;
                } else {
                    dritVar = drit.f;
                }
                dqfu dqfuVar6 = dritVar.b;
                return dqfuVar6 == null ? dqfu.d : dqfuVar6;
            case 6:
                if (drjsVar.a == 11) {
                    drkaVar = (drka) drjsVar.b;
                } else {
                    drkaVar = drka.f;
                }
                dqfu dqfuVar7 = drkaVar.b;
                return dqfuVar7 == null ? dqfu.d : dqfuVar7;
            default:
                return dqfu.d;
        }
    }

    public static dqfu d(drjs drjsVar) {
        drjj drjjVar;
        drjl drjlVar;
        drke drkeVar;
        drix drixVar;
        drju drjuVar;
        drit dritVar;
        drka drkaVar;
        if (drjsVar == null) {
            return dqfu.d;
        }
        drkd drkdVar = drkd.UNKNOWN_TRANSPORTATION_TYPE;
        drjr drjrVar = drjr.FLIGHT_RESERVATION;
        switch (drjr.a(drjsVar.a).ordinal()) {
            case 0:
                if (drjsVar.a == 3) {
                    drjjVar = (drjj) drjsVar.b;
                } else {
                    drjjVar = drjj.c;
                }
                drjh drjhVar = drjjVar.a;
                if (drjhVar == null) {
                    drjhVar = drjh.j;
                }
                dqfu dqfuVar = drjhVar.e;
                return dqfuVar == null ? dqfu.d : dqfuVar;
            case 1:
                if (drjsVar.a == 4) {
                    drjlVar = (drjl) drjsVar.b;
                } else {
                    drjlVar = drjl.f;
                }
                dqfu dqfuVar2 = drjlVar.d;
                return dqfuVar2 == null ? dqfu.d : dqfuVar2;
            case 2:
                if (drjsVar.a == 5) {
                    drkeVar = (drke) drjsVar.b;
                } else {
                    drkeVar = drke.k;
                }
                dqfu dqfuVar3 = drkeVar.i;
                return dqfuVar3 == null ? dqfu.d : dqfuVar3;
            case 3:
                if (drjsVar.a == 6) {
                    drixVar = (drix) drjsVar.b;
                } else {
                    drixVar = drix.f;
                }
                dqfu dqfuVar4 = drixVar.e;
                return dqfuVar4 == null ? dqfu.d : dqfuVar4;
            case 4:
                if (drjsVar.a == 7) {
                    drjuVar = (drju) drjsVar.b;
                } else {
                    drjuVar = drju.d;
                }
                dqfu dqfuVar5 = drjuVar.b;
                return dqfuVar5 == null ? dqfu.d : dqfuVar5;
            case 5:
                if (drjsVar.a == 8) {
                    dritVar = (drit) drjsVar.b;
                } else {
                    dritVar = drit.f;
                }
                dqfu dqfuVar6 = dritVar.c;
                return dqfuVar6 == null ? dqfu.d : dqfuVar6;
            case 6:
                if (drjsVar.a == 11) {
                    drkaVar = (drka) drjsVar.b;
                } else {
                    drkaVar = drka.f;
                }
                dqfu dqfuVar7 = drkaVar.c;
                return dqfuVar7 == null ? dqfu.d : dqfuVar7;
            default:
                return dqfu.d;
        }
    }

    public static drdg e(drjs drjsVar) {
        drjj drjjVar;
        drjl drjlVar;
        drke drkeVar;
        drix drixVar;
        drju drjuVar;
        drit dritVar;
        drka drkaVar;
        if (drjsVar == null) {
            return drdg.q;
        }
        drkd drkdVar = drkd.UNKNOWN_TRANSPORTATION_TYPE;
        drjr drjrVar = drjr.FLIGHT_RESERVATION;
        switch (drjr.a(drjsVar.a).ordinal()) {
            case 0:
                if (drjsVar.a == 3) {
                    drjjVar = (drjj) drjsVar.b;
                } else {
                    drjjVar = drjj.c;
                }
                drjh drjhVar = drjjVar.a;
                if (drjhVar == null) {
                    drjhVar = drjh.j;
                }
                drir drirVar = drjhVar.b;
                if (drirVar == null) {
                    drirVar = drir.d;
                }
                drdg drdgVar = drirVar.b;
                return drdgVar == null ? drdg.q : drdgVar;
            case 1:
                if (drjsVar.a == 4) {
                    drjlVar = (drjl) drjsVar.b;
                } else {
                    drjlVar = drjl.f;
                }
                drdg drdgVar2 = drjlVar.b;
                return drdgVar2 == null ? drdg.q : drdgVar2;
            case 2:
                if (drjsVar.a == 5) {
                    drkeVar = (drke) drjsVar.b;
                } else {
                    drkeVar = drke.k;
                }
                drdg drdgVar3 = drkeVar.e;
                return drdgVar3 == null ? drdg.q : drdgVar3;
            case 3:
                if (drjsVar.a == 6) {
                    drixVar = (drix) drjsVar.b;
                } else {
                    drixVar = drix.f;
                }
                drdg drdgVar4 = drixVar.c;
                return drdgVar4 == null ? drdg.q : drdgVar4;
            case 4:
                if (drjsVar.a == 7) {
                    drjuVar = (drju) drjsVar.b;
                } else {
                    drjuVar = drju.d;
                }
                drdg drdgVar5 = drjuVar.a;
                return drdgVar5 == null ? drdg.q : drdgVar5;
            case 5:
                if (drjsVar.a == 8) {
                    dritVar = (drit) drjsVar.b;
                } else {
                    dritVar = drit.f;
                }
                drdg drdgVar6 = dritVar.d;
                return drdgVar6 == null ? drdg.q : drdgVar6;
            case 6:
                if (drjsVar.a == 11) {
                    drkaVar = (drka) drjsVar.b;
                } else {
                    drkaVar = drka.f;
                }
                drdg drdgVar7 = drkaVar.a;
                return drdgVar7 == null ? drdg.q : drdgVar7;
            default:
                return drdg.q;
        }
    }

    public static int f(drjs drjsVar) {
        drke drkeVar;
        drka drkaVar;
        drkd drkdVar = drkd.UNKNOWN_TRANSPORTATION_TYPE;
        drjr drjrVar = drjr.FLIGHT_RESERVATION;
        int i = 1;
        switch (drjr.a(drjsVar.a).ordinal()) {
            case 0:
                return 2131232318;
            case 1:
                return 2131232295;
            case 2:
                if (drjsVar.a == 5) {
                    drkeVar = (drke) drjsVar.b;
                } else {
                    drkeVar = drke.k;
                }
                drkd b = drkd.b(drkeVar.b);
                if (b == null) {
                    b = drkd.UNKNOWN_TRANSPORTATION_TYPE;
                }
                int ordinal = b.ordinal();
                if (ordinal == 1) {
                    return 2131232452;
                }
                if (ordinal == 2) {
                    return 2131232227;
                }
                if (ordinal == 3) {
                    return 2131232338;
                }
                return ordinal != 4 ? 2131232390 : 2131232226;
            case 3:
                return 2131232194;
            case 4:
                return 2131232403;
            case 5:
                return 2131232260;
            case 6:
                if (drjsVar.a == 11) {
                    drkaVar = (drka) drjsVar.b;
                } else {
                    drkaVar = drka.f;
                }
                int a = drjz.a(drkaVar.d);
                if (a != 0) {
                    i = a;
                }
                switch (i - 1) {
                    case 1:
                        return 2131232354;
                    case 2:
                        return 2131232356;
                    case 3:
                        return 2131232429;
                    case 4:
                        return 2131232449;
                    case 5:
                        return 2131232285;
                    case 6:
                    case 7:
                        return 2131232326;
                    case 8:
                        return 2131232279;
                    default:
                        return 2131232317;
                }
            default:
                return 2131232390;
        }
    }

    public static int g(drjs drjsVar) {
        drka drkaVar;
        drkd drkdVar = drkd.UNKNOWN_TRANSPORTATION_TYPE;
        drjr drjrVar = drjr.FLIGHT_RESERVATION;
        int ordinal = drjr.a(drjsVar.a).ordinal();
        if (ordinal != 0) {
            int i = 1;
            if (ordinal == 1) {
                return R.color.reservation_hotels_icon;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return R.color.reservation_services_icon;
                }
                if (ordinal == 4) {
                    return R.color.reservation_food_and_drink_icon;
                }
                if (ordinal != 6) {
                    return R.color.reservation_municipal_generic_religious_icon;
                }
                if (drjsVar.a == 11) {
                    drkaVar = (drka) drjsVar.b;
                } else {
                    drkaVar = drka.f;
                }
                int a = drjz.a(drkaVar.d);
                if (a != 0) {
                    i = a;
                }
                switch (i - 1) {
                    case 1:
                    case 2:
                        return R.color.reservation_entertainment_icon;
                    case 3:
                    case 8:
                        return R.color.reservation_outdoor_icon;
                    case 4:
                    case 5:
                    default:
                        return R.color.reservation_municipal_generic_religious_icon;
                    case 6:
                    case 7:
                        return R.color.reservation_emergency_icon;
                    case 9:
                        return R.color.reservation_transportation_icon;
                }
            }
        }
        return R.color.reservation_transportation_icon;
    }

    public static String h(Context context, int i) {
        long abs = Math.abs(i);
        long minutes = abs - TimeUnit.HOURS.toMinutes(TimeUnit.MINUTES.toHours(abs));
        String str = i < 0 ? "-" : "";
        String valueOf = String.valueOf(bvtb.e(context.getResources(), (int) TimeUnit.MINUTES.toSeconds(abs), minutes != 0 ? bvsz.ABBREVIATED : bvsz.MINIMAL));
        StringBuilder sb = new StringBuilder(str.length() + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(valueOf);
        return sb.toString();
    }

    public static String i(Context context, dqfu dqfuVar) {
        return n(context, dqfuVar, dqfuVar, 524314);
    }

    public static String j(Context context, dqfu dqfuVar) {
        return n(context, dqfuVar, dqfuVar, 524315);
    }

    public static String k(Context context, dqfu dqfuVar) {
        return n(context, dqfuVar, dqfuVar, 1);
    }

    public static String l(Context context, dqfu dqfuVar, dqfu dqfuVar2) {
        return n(context, dqfuVar, dqfuVar2, 524314);
    }

    public static dqfu m(dqfu dqfuVar) {
        eaou eaouVar;
        try {
            eaouVar = eaou.j(dqfuVar.c);
        } catch (IllegalArgumentException unused) {
            String str = dqfuVar.c;
            eaouVar = eaou.b;
        }
        eaol k = new eaol(TimeUnit.SECONDS.toMillis(dqfuVar.b), eaouVar).g().k(1);
        dqft bZ = dqfu.d.bZ();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(k.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqfu dqfuVar2 = (dqfu) bZ.b;
        int i = 1 | dqfuVar2.a;
        dqfuVar2.a = i;
        dqfuVar2.b = seconds;
        String str2 = dqfuVar.c;
        str2.getClass();
        dqfuVar2.a = i | 2;
        dqfuVar2.c = str2;
        return bZ.bK();
    }

    public static eapg p(dpoj dpojVar) {
        return new eapg(dpojVar.b, dpojVar.c, dpojVar.d);
    }

    public static eapg q(dqfu dqfuVar) {
        eaou eaouVar;
        try {
            eaouVar = eaou.j(dqfuVar.c);
        } catch (IllegalArgumentException unused) {
            String str = dqfuVar.c;
            eaouVar = eaou.b;
        }
        eaol eaolVar = new eaol(eaow.d(dqfuVar.b).b, eaouVar);
        return new eapg(eaolVar.y(), eaolVar.z(), eaolVar.A());
    }

    private static String r(Context context, String str, String str2, String str3) {
        return (dbsj.d(str) || dbsj.d(str2)) ? dbsj.d(str) ? !dbsj.d(str2) ? str2 : str3 : str : context.getResources().getString(R.string.RESERVATION_START_TO_END_POINT, str, str2);
    }

    private static String s(Context context, String str, String str2) {
        return (dbsj.d(str) || dbsj.d(str2)) ? !dbsj.d(str) ? str : !dbsj.d(str2) ? str2 : "" : context.getResources().getString(R.string.RESERVATION_DETAILS, str, str2);
    }

    public static String n(Context context, dqfu dqfuVar, dqfu dqfuVar2, int i) {
        int i2 = dqfuVar.a & 1;
        if (i2 == 0 && (dqfuVar2.a & 1) == 0) {
            return "";
        }
        if (i2 != (dqfuVar2.a & 1)) {
            if (1 != i2) {
                dqfuVar = dqfuVar2;
            }
            dqfuVar2 = dqfuVar;
        }
        return DateUtils.formatDateRange(context, new Formatter(new StringBuilder(50), Locale.getDefault()), TimeUnit.SECONDS.toMillis(dqfuVar.b), TimeUnit.SECONDS.toMillis(dqfuVar2.b), i, dqfuVar.c).toString();
    }

    public static String o(Context context, dpoj dpojVar, dpoj dpojVar2, int i) {
        int i2 = dpojVar.a & 1;
        if (i2 == 0 && (dpojVar2.a & 1) == 0) {
            return "";
        }
        if (i2 != (dpojVar2.a & 1)) {
            if (1 != i2) {
                dpojVar = dpojVar2;
            }
            dpojVar2 = dpojVar;
        }
        return DateUtils.formatDateRange(context, new Formatter(new StringBuilder(50), Locale.getDefault()), p(dpojVar).l().a, p(dpojVar2).p(1).l().a, i).toString();
    }
}
