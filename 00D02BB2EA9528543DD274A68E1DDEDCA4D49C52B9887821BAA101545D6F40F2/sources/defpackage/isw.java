package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: isw  reason: default package */
/* loaded from: classes6.dex */
public final class isw {
    public static final dcdn<dqfn, Integer> a;
    public static final dcdn<dqfn, Integer> b;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(dqfn.UNKNOWN, 2131232414);
        dcdgVar.f(dqfn.ATMS, 2131232157);
        dcdgVar.f(dqfn.ATTRACTIONS, 2131232158);
        dcdgVar.f(dqfn.ART, 2131232376);
        dcdgVar.f(dqfn.BAKERY, 2131232160);
        dcdgVar.f(dqfn.BARS, 2131232319);
        dcdgVar.f(dqfn.BEAUTY_SALONS, 2131232285);
        dcdgVar.f(dqfn.BEAUTY_SUPPLIES, 2131232285);
        dcdgVar.f(dqfn.BRUNCH, 2131232188);
        dcdgVar.f(dqfn.BOOK_STORES, 2131232328);
        dcdgVar.f(dqfn.CAR_DEALERS, 2131232230);
        dcdgVar.f(dqfn.CAR_REPAIR, 2131232195);
        dcdgVar.f(dqfn.CAR_RENTALS, 2131232194);
        dcdgVar.f(dqfn.CAR_WASH, 2131232321);
        dcdgVar.f(dqfn.CLOTHING_STORES, 2131232146);
        dcdgVar.f(dqfn.COFFEE, 2131232320);
        dcdgVar.f(dqfn.CONVENIENCE_STORES, 2131232322);
        dcdgVar.f(dqfn.DEALS, Integer.valueOf((int) R.drawable.deals_alt_rupee));
        dcdgVar.f(dqfn.DESSERT, 2131232296);
        dcdgVar.f(dqfn.DELIVERY, 2131232601);
        dcdgVar.f(dqfn.DRY_CLEANERS, 2131232247);
        dcdgVar.f(dqfn.ELECTRIC_VEHICLE_CHARGING, 2131232653);
        dcdgVar.f(dqfn.ELECTRONICS, 2131232221);
        dcdgVar.f(dqfn.EVENTS, 2131232335);
        dcdgVar.f(dqfn.FLEA_MARKETS, 2131232435);
        dcdgVar.f(dqfn.GAS_STATIONS, 2131232324);
        dcdgVar.f(dqfn.GROCERIES, 2131232325);
        dcdgVar.f(dqfn.GYMS, 2131232279);
        dcdgVar.f(dqfn.HARDWARE_STORES, 2131232284);
        dcdgVar.f(dqfn.HOME_IMPROVEMENT_STORES, 2131232712);
        dcdgVar.f(dqfn.HOSPITALS, 2131232326);
        dcdgVar.f(dqfn.HOTELS, 2131232295);
        dcdgVar.f(dqfn.LIBRARIES, 2131232328);
        dcdgVar.f(dqfn.LIVE_MUSIC, 2131232797);
        dcdgVar.f(dqfn.MAIL, 2131232336);
        dcdgVar.f(dqfn.MOVIES, 2131232354);
        dcdgVar.f(dqfn.MUSEUMS, 2131232355);
        dcdgVar.f(dqfn.NIGHTLIFE, 2131232363);
        dcdgVar.f(dqfn.PARKING, 2131232331);
        dcdgVar.f(dqfn.PARKS, 2131232377);
        dcdgVar.f(dqfn.PHARMACIES, 2131232332);
        dcdgVar.f(dqfn.POST_OFFICES, 2131232336);
        dcdgVar.f(dqfn.RAMEN, 2131232396);
        dcdgVar.f(dqfn.RESTAURANTS, 2131232403);
        dcdgVar.f(dqfn.RESERVATIONS, 2131232404);
        dcdgVar.f(dqfn.SHOPPING, 2131232329);
        dcdgVar.f(dqfn.SHOPPING_CENTERS, 2131232434);
        dcdgVar.f(dqfn.SPORTING_GOODS, 2131232920);
        dcdgVar.f(dqfn.TAKEOUT, 2131232437);
        a = dcdgVar.b();
        dcdg dcdgVar2 = new dcdg();
        dcdgVar2.f(dqfn.FOOD_BANKS, Integer.valueOf((int) R.raw.food_bank_shortcut));
        dcdgVar2.f(dqfn.NIGHT_SHELTERS, Integer.valueOf((int) R.raw.night_shelter_shortcut));
        b = dcdgVar2.b();
    }

    public static cjtd a(dqfo dqfoVar, ddho ddhoVar) {
        cjta b2 = cjtd.b();
        d(b2, dqfoVar, ddhoVar, dbpy.a, dbpy.a);
        return b2.a();
    }

    public static cjtd b(dqfo dqfoVar, ddho ddhoVar, int i, ddfn ddfnVar) {
        cjta b2 = cjtd.b();
        d(b2, dqfoVar, ddhoVar, dbsg.i(Integer.valueOf(i)), dbsg.i(ddfnVar));
        return b2.a();
    }

    public static void c(cjta cjtaVar, dqfo dqfoVar, ddho ddhoVar, int i, ddfn ddfnVar) {
        d(cjtaVar, dqfoVar, ddhoVar, dbsg.i(Integer.valueOf(i)), dbsg.i(ddfnVar));
    }

    private static void d(cjta cjtaVar, dqfo dqfoVar, ddho ddhoVar, dbsg<Integer> dbsgVar, dbsg<ddfn> dbsgVar2) {
        ddes bZ;
        cjtaVar.d = ddhoVar;
        ddfl bZ2 = ddfo.f.bZ();
        if ((dqfoVar.a & 1024) != 0) {
            dqfn b2 = dqfn.b(dqfoVar.h);
            if (b2 == null) {
                b2 = dqfn.UNKNOWN;
            }
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddfo ddfoVar = (ddfo) bZ2.b;
            ddfoVar.b = b2.ah;
            ddfoVar.a |= 1;
        }
        if ((dqfoVar.a & 2048) != 0) {
            int i = dqfoVar.i;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddfo ddfoVar2 = (ddfo) bZ2.b;
            ddfoVar2.a |= 16;
            ddfoVar2.e = i;
        }
        if (dbsgVar.a()) {
            cjtaVar.i(dbsgVar.b().intValue());
            int intValue = dbsgVar.b().intValue();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddfo ddfoVar3 = (ddfo) bZ2.b;
            ddfoVar3.a |= 4;
            ddfoVar3.c = intValue;
        }
        if (dbsgVar2.a()) {
            ddfn b3 = dbsgVar2.b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddfo ddfoVar4 = (ddfo) bZ2.b;
            ddfoVar4.d = b3.k;
            ddfoVar4.a |= 8;
        }
        if (cjtaVar.e() != null) {
            ddet e = cjtaVar.e();
            dbsk.s(e);
            dsqp dsqpVar = (dsqp) e.cu(5);
            dsqpVar.bC(e);
            bZ = (ddes) dsqpVar;
        } else {
            bZ = ddet.D.bZ();
        }
        ddfo bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        bK.getClass();
        ddetVar.e = bK;
        ddetVar.a |= 4;
        cjtaVar.s(bZ.bK());
    }
}
