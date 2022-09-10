package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: auhs  reason: default package */
/* loaded from: classes2.dex */
public final class auhs {
    private final Map<Integer, auhr> a;

    public auhs(auhr auhrVar, auhr auhrVar2, auhr auhrVar3, auhr auhrVar4) {
        HashMap d = dcjz.d();
        this.a = d;
        d.put(Integer.valueOf(dpyv.LOCAL_DISCOVERY_AT_A_PLACE.dm), auhrVar);
        d.put(Integer.valueOf(dpyv.LOCAL_DISCOVERY_FOODIE_FAVORITE.dm), auhrVar);
        d.put(Integer.valueOf(dpyv.LOCAL_DISCOVERY_NEWLY_OPENED_PLACES.dm), auhrVar);
        d.put(Integer.valueOf(dpyv.LOCAL_DISCOVERY_NEW_POST.dm), auhrVar);
        d.put(Integer.valueOf(dpyv.LOCAL_DISCOVERY_PERSONALIZED_RECOMMENDATION.dm), auhrVar);
        d.put(Integer.valueOf(dpyv.LOCAL_DISCOVERY_PLACES_IN_THE_NEWS.dm), auhrVar);
        d.put(Integer.valueOf(dpyv.LOCAL_DISCOVERY_PUBLIC_LIST.dm), auhrVar);
        d.put(Integer.valueOf(dpyv.LOCAL_DISCOVERY_SAVED_PLACE_NEARBY.dm), auhrVar);
        d.put(Integer.valueOf(dpyv.LOCAL_DISCOVERY_TRAVEL.dm), auhrVar);
        d.put(Integer.valueOf(dpyv.LOCAL_DISCOVERY_TRENDING_PLACES.dm), auhrVar);
        d.put(Integer.valueOf(dpyv.LOCAL_DISCOVERY_UPCOMING_EVENTS.dm), auhrVar);
        d.put(Integer.valueOf(dpyv.LOCAL_DISCOVERY_WELCOME_TO_DESTINATION.dm), auhrVar);
        d.put(Integer.valueOf(dpyv.PHOTO_TAKEN.dm), auhrVar2);
        d.put(Integer.valueOf(dpyv.REVIEW_AT_A_PLACE.dm), auhrVar3);
        d.put(Integer.valueOf(dpyv.SERVICE_RECOMMENDATION_POST_INTERACTION.dm), auhrVar3);
        d.put(Integer.valueOf(dpyv.TRAFFIC_TO_PLACE.dm), auhrVar4);
        d.put(Integer.valueOf(dpyv.TIME_TO_LEAVE.dm), auhrVar4);
    }

    @dzsi
    public final auhr a(aujb aujbVar) {
        return this.a.get(Integer.valueOf(aujbVar.a));
    }
}
