package defpackage;

import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: ckms  reason: default package */
/* loaded from: classes4.dex */
public interface ckms {
    public static final EnumMap<bege, cwsv> a;

    static {
        EnumMap<bege, cwsv> enumMap = new EnumMap<>(bege.class);
        enumMap.put((EnumMap<bege, cwsv>) bege.OVERVIEW, (bege) cwsv.a("Overview"));
        enumMap.put((EnumMap<bege, cwsv>) bege.DIRECTORY, (bege) cwsv.a("Directory"));
        enumMap.put((EnumMap<bege, cwsv>) bege.MENU, (bege) cwsv.a("Menu"));
        enumMap.put((EnumMap<bege, cwsv>) bege.REVIEWS, (bege) cwsv.a("Reviews"));
        enumMap.put((EnumMap<bege, cwsv>) bege.PHOTOS, (bege) cwsv.a("Photos"));
        enumMap.put((EnumMap<bege, cwsv>) bege.UPDATES, (bege) cwsv.a("Updates"));
        enumMap.put((EnumMap<bege, cwsv>) bege.PRICES, (bege) cwsv.a("Prices"));
        enumMap.put((EnumMap<bege, cwsv>) bege.ABOUT, (bege) cwsv.a("About"));
        enumMap.put((EnumMap<bege, cwsv>) bege.PRODUCTS, (bege) cwsv.a("Products"));
        enumMap.put((EnumMap<bege, cwsv>) bege.TICKETS, (bege) cwsv.a("Tickets"));
        a = enumMap;
    }

    @dzsi
    cwsv a();
}
