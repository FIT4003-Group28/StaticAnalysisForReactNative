package defpackage;

import defpackage.dssj;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: awvv  reason: default package */
/* loaded from: classes.dex */
public final class awvv<P extends dssj> {
    public static final awvv<dvit> A;
    public static final awvv<dvhw> B;
    public static final awvv<dnus> C;
    public static final awvv<drbr> D;
    public static final awvv<dvjd> E;
    public static final awvv<dvhw> F;
    public static final awvv<dvha> G;
    public static final awvv<dptu> H;
    public static final awvv<dvhq> I;
    public static final awvv<dvhg> J;
    public static final awvv<dviz> K;
    public static final awvv<dnuy> L;
    public static final awvv<dqsb> M;
    public static final awvv<dqsj> N;
    private static final ArrayList<awvv<?>> P = new ArrayList<>(drbk.values().length);
    public static final awvv<dvha> a;
    public static final awvv<dqfq> b;
    public static final awvv<dvho> c;
    public static final awvv<dviz> d;
    public static final awvv<dvhs> e;
    public static final awvv<dvhu> f;
    public static final awvv<dnuw> g;
    public static final awvv<dvjh> h;
    public static final awvv<dnvm> i;
    public static final awvv<dnuk> j;
    public static final awvv<dvhq> k;
    public static final awvv<dpsj> l;
    public static final awvv<dvgu> m;
    public static final awvv<dviz> n;
    public static final awvv<dviz> o;
    public static final awvv<dviz> p;
    public static final awvv<dviz> q;
    public static final awvv<dvhu> r;
    public static final awvv<dvjj> s;
    public static final awvv<dvhu> t;
    public static final awvv<dvhu> u;
    public static final awvv<dvhu> v;
    public static final awvv<dvhu> w;
    public static final awvv<dviz> x;
    public static final awvv<dvhw> y;
    public static final awvv<dvjb> z;
    public final drbk O;

    static {
        new awvv(drbk.EXPLORE_ACTIVITIES);
        a = new awvv<>(drbk.EXPLORE_AREA_SUMMARY);
        b = new awvv<>(drbk.EXPLORE_CATEGORIES);
        new awvv(drbk.EXPLORE_INTENTS);
        c = new awvv<>(drbk.GEO_VERTICALS);
        d = new awvv<>(drbk.NEARBY_PLACE_SETS);
        e = new awvv<>(drbk.MAJOR_EVENT_AMBIENT_COLLECTION);
        f = new awvv<>(drbk.MAJOR_EVENT_CARD_COLLECTION);
        g = new awvv<>(drbk.NEARBY_STATIONS);
        new awvv(drbk.TRAFFIC_REPORT);
        new awvv(drbk.TRANSIT_ALERTS);
        h = new awvv<>(drbk.TRANSIT_SCHEMATIC_MAPS);
        i = new awvv<>(drbk.TRANSIT_DESTINATIONS);
        j = new awvv<>(drbk.DRIVING_DESTINATIONS);
        k = new awvv<>(drbk.RECENT_HISTORY_ITEMS);
        l = new awvv<>(drbk.EXPLORE_CELEBRATION_CONTENT);
        m = new awvv<>(drbk.EXPLORE_EXPERIMENTAL_CONTENT);
        new awvv(drbk.TRAFFIC_EXPERIMENTAL_CONTENT);
        new awvv(drbk.TRANSIT_EXPERIMENTAL_CONTENT);
        new awvv(drbk.EDITORIAL_LISTS);
        n = new awvv<>(drbk.PINNED_PUBLIC_LISTS);
        o = new awvv<>(drbk.GENERAL_PUBLIC_LISTS);
        p = new awvv<>(drbk.VIDEO_LISTS);
        q = new awvv<>(drbk.BEST_OF_LISTS);
        r = new awvv<>(drbk.NEARBY_EXPERIENCES);
        s = new awvv<>(drbk.VISUAL_EXPLORE_ELEMENTS);
        t = new awvv<>(drbk.MAJOR_EVENT_EXPLORE_CARDS);
        u = new awvv<>(drbk.MAJOR_EVENT_EXPLORE_PROMINENT_CARDS);
        v = new awvv<>(drbk.MAJOR_EVENT_DRIVING_CARDS);
        w = new awvv<>(drbk.MAJOR_EVENT_TRANSIT_CARDS);
        new awvv(drbk.DISCOVERY_MAP_HIGHLIGHTS_SET);
        x = new awvv<>(drbk.TOURIST_PLACES);
        y = new awvv<>(drbk.NEARBY_HOTELS);
        z = new awvv<>(drbk.POPULAR_AREAS_PREVIEW);
        A = new awvv<>(drbk.AREA_QUESTIONS_AND_ANSWERS);
        B = new awvv<>(drbk.POPULAR_AREAS_CAROUSEL);
        C = new awvv<>(drbk.EVERYDAY_TRIPS);
        D = new awvv<>(drbk.EXPLORE_TAB_SERVERSIDE_EXPERIMENTS);
        E = new awvv<>(drbk.SEARCH_ZERO_SUGGEST_ADS);
        F = new awvv<>(drbk.PERSONAL_INTEREST_PLACES);
        G = new awvv<>(drbk.EXPLORE_USER_AREA_SUMMARY);
        H = new awvv<>(drbk.INFORMAL_TRANSIT_SUMMARY);
        I = new awvv<>(drbk.PERSONALIZED_HISTORY_ITEMS);
        J = new awvv<>(drbk.EXPLORE_LOCAL_STREAM);
        K = new awvv<>(drbk.IMPORTANT_VENUE_LISTS);
        L = new awvv<>(drbk.PERSONAL_ACTION_CONTENT);
        M = new awvv<>(drbk.AMBIENT_CRISIS_COLLECTION);
        N = new awvv<>(drbk.COVID_LAYER_STATS);
    }

    private awvv(drbk drbkVar) {
        this.O = drbkVar;
        P.add(this);
    }

    public static awvv<?>[] a() {
        return (awvv[]) P.toArray(new awvv[0]);
    }

    public final String b() {
        return this.O.name();
    }

    public final String toString() {
        return this.O.toString();
    }
}
