package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aluu  reason: default package */
/* loaded from: classes2.dex */
public final class aluu implements Serializable {
    public final dcdn<String, dbsi<String, dmqc>> a;
    public final String b;
    private final int c;

    public aluu(String str, int i, boolean z) {
        this.b = str;
        int i2 = i & 16777215;
        this.c = i2;
        dcdg p = dcdn.p();
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_AIRPORT, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_AIRPORT, "AIRPORT", "airport");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_PARK, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_PARK, "PARK", "tree");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_NATURE_RESERVE, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_NATURE_RESERVE, "NATURE_RESERVE", "tree");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_BOATING, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_BOATING, "BOATING", "boating");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_FISHING, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_FISHING, "FISHING", "fishing");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_GOLF, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_GOLF, "GOLF", "golf");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_HIKING, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_HIKING, "HIKING", "hiking");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_TRAIL_HEAD, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_TRAIL_HEAD, "TRAIL_HEAD", "hiking");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_CEMETERY, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_CEMETERY, "CEMETERY", "cemetery");
        f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_CEMETERY_JP, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_CEMETERY_JP, "CEMETERY", "cemetery_jp", "JP");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_HOTSPRING, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_HOTSPRING, "HOTSPRING", "hotspring");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_HOSPITAL, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_HOSPITAL, "HOSPITAL", "hospital_H");
        f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_HOSPITAL_CN, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_HOSPITAL_CN, "HOSPITAL", "hospital_cross", "CN");
        f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_HOSPITAL_IL, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_HOSPITAL_IL, "HOSPITAL", "hospital_star", "IL");
        f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_HOSPITAL_JP, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_HOSPITAL_JP, "HOSPITAL", "hospital_shield", "JP");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_DOCTOR, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_DOCTOR, "DOCTOR", "hospital_H");
        f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_DOCTOR_JP, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_DOCTOR_JP, "DOCTOR", "hospital_shield", "JP");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_DENTIST, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_DENTIST, "DENTIST", "hospital_H");
        f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_DENTIST_CN, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_DENTIST_CN, "DENTIST", "hospital_cross", "CN");
        f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_DENTIST_JP, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_DENTIST_JP, "DENTIST", "hospital_shield", "JP");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_PHARMACY, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_PHARMACY, "PHARMACY", "pharmacy");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_RESTAURANT, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_RESTAURANT, "RESTAURANT", "restaurant");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_FOOD_AND_DRINK, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_FOOD_AND_DRINK, "FOOD_AND_DRINK", "restaurant");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_FAST_FOOD, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_FAST_FOOD, "FAST_FOOD", "restaurant");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_COFFEE, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_COFFEE, "COFFEE", "cafe");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_CAFE, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_CAFE, "CAFE", "cafe");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_BAR, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_BAR, "BAR", "bar");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_WINERY, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_WINERY, "WINERY", "glass");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_CASH_MACHINE, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_CASH_MACHINE, "CASH_MACHINE", "atm");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_BANKING, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_BANKING, "BANKING", "bank_intl");
        f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_BANKING_DOLLAR, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_BANKING_DOLLAR, "BANKING", "bank_dollar", "AU", "CA", "HK", "US", "SG");
        f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_BANKING_EURO, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_BANKING_EURO, "BANKING", "bank_euro", "AT", "BE", "CY", "DE", "ES", "FI", "FR", "GR", "IE", "IT", "LU", "MT", "NL", "PT", "SI", "SK");
        f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_BANKING_JP, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_BANKING_JP, "BANKING", "bank_jp", "JP");
        f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_BANKING_POUND, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_BANKING_POUND, "BANKING", "bank_pound", "GB", "GG", "IM", "JE");
        f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_BANKING_RMB, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_BANKING_RMB, "BANKING", "bank_rmb", "CN");
        f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_BANKING_WON, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_BANKING_WON, "BANKING", "bank_won", "KR");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_GAS_STATION, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_GAS_STATION, "GAS_STATION", "gas");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_GROCERY, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_GROCERY, "GROCERY", "shoppingcart");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_MARKET, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_MARKET, "MARKET", "shoppingcart");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_MOVIE_THEATER, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_MOVIE_THEATER, "MOVIE_THEATER", "movie");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_SHOPPING, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_SHOPPING, "SHOPPING", "shoppingbag");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_LODGING, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_LODGING, "LODGING", "lodging");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_PARKING, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_PARKING, "PARKING", "parking");
        f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_PARKING_ES, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_PARKING_ES, "PARKING", "parking_es", "AR", "BR", "MX");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_POST_OFFICE, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_POST_OFFICE, "POST_OFFICE", "postoffice");
        f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_POST_OFFICE_JP, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_POST_OFFICE_JP, "POST_OFFICE", "postoffice_jp", "JP");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_LOCALITY, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_LOCALITY, "LOCALITY", "neighborhood");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_TRANSPORTATION, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_TRANSPORTATION, "TRANSPORTATION", "street");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_PUBLIC_TRANSIT, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_PUBLIC_TRANSIT, "PUBLIC_TRANSIT", "transit");
        e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_ELECTRIC_VEHICLE_CHARGING_STATION, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_ELECTRIC_VEHICLE_CHARGING_STATION, "ELECTRIC_VEHICLE_CHARGING_STATION", "electric_vehicle_charging_station");
        if (z) {
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_AMUSEMENT_PARK, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_AMUSEMENT_PARK, "AMUSEMENT_PARK", "amusement_park");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_AQUARIUM, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_AQUARIUM, "AQUARIUM", "aquarium");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_ARTS, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_ARTS, "ARTS", "arts");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_BOTANICAL_GARDEN, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_BOTANICAL_GARDEN, "BOTANICAL_GARDEN", "botanical_garden");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_BRIDGE, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_BRIDGE, "BRIDGE", "bridge");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_BUDDHIST_TEMPLE, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_BUDDHIST_TEMPLE, "BUDDHIST_TEMPLE", "buddhist_temple");
            f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_BUDDHIST_TEMPLE_JP, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_BUDDHIST_TEMPLE_JP, "BUDDHIST_TEMPLE", "buddhist_temple_jp", "jp");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_CAMPGROUNDS, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_CAMPGROUNDS, "CAMPGROUNDS", "campgrounds");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_CAR_RENTAL, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_CAR_RENTAL, "CAR_RENTAL", "car_rental");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_CASINO, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_CASINO, "CASINO", "casino");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_CHURCH, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_CHURCH, "CHURCH", "church");
            f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_CITY_HALL_JP, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_CITY_HALL_JP, "CITY_HALL", "city_hall_jp", "jp");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_CONCERT_HALL, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_CONCERT_HALL, "CONCERT_HALL", "concert_hall");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_EVENT_VENUE, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_EVENT_VENUE, "EVENT_VENUE", "event_venue");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_FIRE, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_FIRE, "FIRE", "fire");
            f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_FIRE_JP, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_FIRE_JP, "FIRE", "fire_jp", "jp");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_GOVERNMENT, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_GOVERNMENT, "GOVERNMENT", "government");
            f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_GOVERNMENT_CN, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_GOVERNMENT_CN, "GOVERNMENT", "government_cn", "cn");
            f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_GOVERNMENT_JP, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_GOVERNMENT_JP, "GOVERNMENT", "government_jp", "jp");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_GURUDWARA, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_GURUDWARA, "GURUDWARA", "gurudwara");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_HINDU_TEMPLE, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_HINDU_TEMPLE, "HINDU_TEMPLE", "hindu_temple");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_HISTORICAL, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_HISTORICAL, "HISTORICAL", "historical");
            f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_HISTORICAL_CN, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_HISTORICAL_CN, "HISTORICAL", "historical_cn", "cn");
            f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_HISTORICAL_JP, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_HISTORICAL_JP, "HISTORICAL", "historical_jp", "jp");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_JAIN_TEMPLE, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_JAIN_TEMPLE, "JAIN_TEMPLE", "jain_temple");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_LIBRARY, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_LIBRARY, "LIBRARY", "library");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_LIGHTHOUSE, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_LIGHTHOUSE, "LIGHTHOUSE", "lighthouse");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_MONUMENT, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_MONUMENT, "MONUMENT", "monument");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_MORMON_TEMPLE, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_MORMON_TEMPLE, "MORMON_TEMPLE", "mormon_temple");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_MOSQUE, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_MOSQUE, "MOSQUE", "mosque");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_MOVIES, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_MOVIES, "MOVIES", "movies");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_MUSEUM, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_MUSEUM, "MUSEUM", "museum");
            f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_MUSEUM_JP, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_MUSEUM_JP, "MUSEUM", "museum_jp", "jp");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_PERFORMING_ARTS, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_PERFORMING_ARTS, "PERFORMING_ARTS", "performing_arts");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_POLICE, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_POLICE, "POLICE", "police");
            f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_POLICE_JP, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_POLICE_JP, "POLICE", "police_jp", "jp");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_RESORT, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_RESORT, "RESORT", "resort");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_REST_ROOM, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_REST_ROOM, "REST_ROOM", "rest_room");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_SCHOOL, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_SCHOOL, "SCHOOL", "school");
            f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_SCHOOL_CN, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_SCHOOL_CN, "SCHOOL", "school_cn", "cn");
            f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_SCHOOL_JP, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_SCHOOL_JP, "SCHOOL", "school_jp", "jp");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_SHINTO_TEMPLE, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_SHINTO_TEMPLE, "SHINTO_TEMPLE", "shinto_temple");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_STADIUM, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_STADIUM, "STADIUM", "stadium");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_SYNAGOGUE, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_SYNAGOGUE, "SYNAGOGUE", "synagogue");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_TEMPLE, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_TEMPLE, "TEMPLE", "temple");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_TOURIST_DESTINATION, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_TOURIST_DESTINATION, "TOURIST_DESTINATION", "tourist_destination");
            f(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_TOURIST_DESTINATION_JP, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_TOURIST_DESTINATION_JP, "TOURIST_DESTINATION", "tourist_destination_jp", "jp");
            e(i2, p, dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_ZOO, dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_ZOO, "ZOO", "zoo");
        }
        this.a = p.b();
    }

    public static List<String> b(dpxe dpxeVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        String str = dpxeVar.a;
        String str2 = true != z ? "" : ".Ad";
        String g = g(dpxeVar.b);
        if (!g.isEmpty()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(g).length() + str2.length());
            sb.append(str);
            sb.append(g);
            sb.append(str2);
            arrayList.add(sb.toString());
        }
        String valueOf = String.valueOf(str);
        arrayList.add(str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf));
        return arrayList;
    }

    public static String c(String str) {
        return String.format("icon/name=assets/icons/search-experiment/container_background-2-medium.png,assets/icons/search-experiment/container-2-medium.png,assets/icons/search-experiment/%s-2-medium.png&highlight=%s&scale=4", str, "00000000,ab2314,fefdfc");
    }

    private static void e(int i, dcdg<String, dbsi<String, dmqc>> dcdgVar, dmqc dmqcVar, dmqc dmqcVar2, String str, String str2) {
        f(i, dcdgVar, dmqcVar, dmqcVar2, str, str2, "");
    }

    private static void f(int i, dcdg<String, dbsi<String, dmqc>> dcdgVar, dmqc dmqcVar, dmqc dmqcVar2, String str, String str2, String... strArr) {
        for (String str3 : strArr) {
            dcdgVar.f(h(str, false, str3), dbsi.a(i(i, str2, false), dmqcVar));
            dcdgVar.f(h(str, true, str3), dbsi.a(i(i, str2, true), dmqcVar2));
            String g = g(str3);
            StringBuilder sb = new StringBuilder(str.length() + 24 + String.valueOf(g).length());
            sb.append("SearchResult.TYPE_");
            sb.append(str);
            sb.append(g);
            sb.append(".Night");
            dcdgVar.f(sb.toString(), dbsi.a(c(str2), dmqcVar));
        }
    }

    private static String g(String str) {
        if (!str.equals("")) {
            String valueOf = String.valueOf(str);
            return valueOf.length() != 0 ? ".".concat(valueOf) : new String(".");
        }
        return "";
    }

    private static String h(String str, boolean z, String str2) {
        String g = g(str2);
        StringBuilder sb = new StringBuilder(str.length() + 18 + String.valueOf(g).length());
        sb.append("SearchResult.TYPE_");
        sb.append(str);
        sb.append(g);
        String sb2 = sb.toString();
        return z ? String.valueOf(sb2).concat(".Ad") : sb2;
    }

    private static String i(int i, String str, boolean z) {
        String str2;
        if (z) {
            String hexString = Integer.toHexString(i);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 14);
            sb.append("ffffff,");
            sb.append(hexString);
            sb.append(",ffffff");
            str2 = sb.toString();
        } else {
            str2 = "ffffff,db4437,ffffff";
        }
        return String.format("icon/name=assets/icons/search-experiment/container_background-2-medium.png,assets/icons/search-experiment/container-2-medium.png,assets/icons/search-experiment/%s-2-medium.png&highlight=%s&scale=4", str, str2);
    }

    public final dmqc a(dpxe dpxeVar, boolean z) {
        for (String str : b(dpxeVar, z)) {
            if (this.a.containsKey(str)) {
                return this.a.get(str).b;
            }
        }
        if (z) {
            return dmqc.LEGEND_STYLE_POI_AD_SEARCH_RESULT_GENERIC;
        }
        return dmqc.LEGEND_STYLE_POI_SEARCH_RESULT_GENERIC;
    }

    @Deprecated
    public final String d(dpxe dpxeVar) {
        for (String str : b(dpxeVar, false)) {
            if (this.a.containsKey(str)) {
                String valueOf = String.valueOf(this.b);
                String valueOf2 = String.valueOf(this.a.get(str).a);
                return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            }
        }
        String valueOf3 = String.valueOf(this.b);
        String valueOf4 = String.valueOf(i(this.c, "generic", false));
        return valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
    }
}
