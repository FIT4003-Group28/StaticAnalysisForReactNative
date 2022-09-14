package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: astj  reason: default package */
/* loaded from: classes2.dex */
public final class astj {
    static final dcdc<byeb> a = dcdc.n(byeb.CLOSING_SOON_WILL_REOPEN, byeb.CLOSING_SOON_LAST_INTERVAL, byeb.CLOSED_NOW_WILL_REOPEN, byeb.OPENS_SOON, byeb.OPENS_SOON_NEXT_DAY, byeb.CLOSED_FOR_DAY, byeb.CLOSED_ALL_DAY, byeb.PERMANENTLY_CLOSED, byeb.TEMPORARILY_CLOSED);

    @dzsi
    public static String a(byed byedVar, Resources resources) {
        byeb byebVar = byeb.PERMANENTLY_CLOSED;
        int ordinal = byedVar.a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 16) {
                    return resources.getString(R.string.ENROUTE_CALLOUT_PLACE_TEMPORARILY_CLOSED);
                }
                switch (ordinal) {
                    case 4:
                    case 5:
                        return resources.getString(R.string.ENROUTE_CALLOUT_PLACE_CLOSING_SOON);
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        break;
                    default:
                        return null;
                }
            }
            return resources.getString(R.string.ENROUTE_CALLOUT_PLACE_CLOSED);
        }
        return resources.getString(R.string.ENROUTE_CALLOUT_PLACE_PERMANENTLY_CLOSED);
    }

    @dzsi
    public static String b(@dzsi String str, Resources resources) {
        if (dbsj.d(str)) {
            return null;
        }
        return resources.getString(R.string.SEARCH_LIST_GAS_PRICE_LABELED, str, resources.getString(R.string.PLACE_GAS_PRICE_REGULAR), "");
    }

    public static List<asth> c(List<aryr> list, boolean z) {
        boolean z2;
        boolean z3;
        Iterator<aryr> it = list.iterator();
        while (true) {
            z2 = true;
            if (it.hasNext()) {
                if (it.next().k != null) {
                    z3 = true;
                    break;
                }
            } else {
                z3 = false;
                break;
            }
        }
        Iterator<aryr> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (it2.next().l != null) {
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (aryr aryrVar : list) {
            asth asthVar = asth.NONE;
            if (z3 && aryrVar.k != null) {
                asthVar = asth.GAS_PRICE;
            } else if (z2 && aryrVar.l != null) {
                asthVar = asth.HOTEL_PRICE;
            } else if (!z3 && !z2) {
                if (aryrVar.h != null && a.contains(aryrVar.h.a())) {
                    asthVar = asth.OPENING_HOURS;
                } else if (z && aryrVar.m != null) {
                    asthVar = asth.USER_STAR_RATING;
                }
            }
            arrayList.add(asthVar);
        }
        return arrayList;
    }

    public static asth d(aryr aryrVar) {
        return aryrVar.k != null ? asth.GAS_PRICE : aryrVar.l != null ? asth.HOTEL_PRICE : (aryrVar.h == null || !a.contains(aryrVar.h.a())) ? aryrVar.m == null ? asth.NONE : asth.USER_STAR_RATING : asth.OPENING_HOURS;
    }

    public static List<asti> e(float f, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            float f2 = i;
            if (f2 <= (-0.75f) + f) {
                arrayList.add(asti.FULL);
            } else if (f2 <= (-0.25f) + f) {
                arrayList.add(asti.HALF);
            } else {
                arrayList.add(asti.EMPTY);
            }
        }
        return z ? dchl.l(arrayList) : arrayList;
    }

    public static amvh f(aryr aryrVar) {
        amvg P = amvh.P();
        P.j = aryrVar.a;
        P.d(aryrVar.c);
        P.c = aryrVar.e;
        return P.a();
    }
}
