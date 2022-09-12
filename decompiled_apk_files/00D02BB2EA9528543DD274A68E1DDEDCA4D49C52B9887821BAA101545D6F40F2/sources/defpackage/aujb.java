package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: aujb  reason: default package */
/* loaded from: classes.dex */
public abstract class aujb {
    public static final dcdn<Integer, auio> b;
    public final int a;
    private final boolean c;
    private final int d;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(Integer.valueOf(dpyv.ANNOUNCEMENTS.dm), auio.NEW_ON_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.AREA_TRAFFIC.dm), auio.TRAFFIC_IN_YOUR_AREA);
        dcdgVar.f(Integer.valueOf(dpyv.AREA_TRAFFIC_WARM_UP.dm), auio.COMMUTE_PROFILE);
        dcdgVar.f(Integer.valueOf(dpyv.AT_A_PLACE_SAMPLE.dm), auio.SUGGESTION_WRITE_REVIEW);
        dcdgVar.f(Integer.valueOf(dpyv.BUSINESS_LISTINGS.dm), auio.YOUR_BUSINESS);
        dcdgVar.f(Integer.valueOf(dpyv.INSIGHTS_BUSINESS_NOTIFICATION.dm), auio.YOUR_BUSINESS);
        dcdgVar.f(Integer.valueOf(dpyv.BUSINESS_OWNER_HOURS.dm), auio.MESSAGES_FROM_MERCHANT);
        dcdgVar.f(Integer.valueOf(dpyv.COMMUTE_SETUP.dm), auio.COMMUTE_PROFILE);
        dcdgVar.f(Integer.valueOf(dpyv.CONTRIBUTION_IMPACT_MILESTONE.dm), auio.LIKES_MILESTONES_BADGES);
        dcdgVar.f(Integer.valueOf(dpyv.DESKTOP_CALL.dm), auio.MAPS_FEATURES_URGENT);
        dcdgVar.f(Integer.valueOf(dpyv.NAVIGATION_START_DRIVING_MODE.dm), auio.YOUR_COMMUTE);
        dcdgVar.f(Integer.valueOf(dpyv.EDIT_PUBLISHED.dm), auio.LIKES_MILESTONES_BADGES);
        dcdgVar.f(Integer.valueOf(dpyv.EMPLOYEE_HOURS.dm), auio.PLACES_YOU_VISITED);
        dcdgVar.f(Integer.valueOf(dpyv.FOOD_REMINDER.dm), auio.NEARBY_PLACES_EVENTS);
        dcdgVar.f(Integer.valueOf(dpyv.IN_APP_SHARE.dm), auio.MESSAGES_FROM_MERCHANT);
        dcdgVar.f(Integer.valueOf(dpyv.IN_APP_SURVEY.dm), auio.YOUR_FEEDBACK);
        dcdgVar.f(Integer.valueOf(dpyv.JOURNEY_SHARING_ARRIVAL_NOTIFICATION_RECEIVED.dm), auio.GOOGLE_LOCATION_SHARING_FRIENDS);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_DISCOVERY_AT_A_PLACE.dm), auio.NEARBY_PLACES_EVENTS);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_DISCOVERY_FOODIE_FAVORITE.dm), auio.NEW_TRENDING_PLACES);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_DISCOVERY_FOODIE_FAVORITE_ONBOARD_BY_NOTIF.dm), auio.NEW_TRENDING_PLACES);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_DISCOVERY_NEWLY_OPENED_PLACES.dm), auio.NEW_TRENDING_PLACES);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_DISCOVERY_NEWLY_OPENED_PLACES_ONBOARD_BY_NOTIF.dm), auio.NEW_TRENDING_PLACES);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_DISCOVERY_NEW_POST.dm), auio.NEW_TRENDING_PLACES);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_DISCOVERY_NEW_POST_ONBOARD_BY_NOTIF.dm), auio.NEW_TRENDING_PLACES);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_DISCOVERY_PERSONALIZED_RECOMMENDATION.dm), auio.NEW_TRENDING_PLACES);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_DISCOVERY_PERSONALIZED_RECOMMENDATION_ONBOARD_BY_NOTIF.dm), auio.NEW_TRENDING_PLACES);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_DISCOVERY_PLACES_IN_THE_NEWS.dm), auio.NEW_TRENDING_PLACES);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_DISCOVERY_PUBLIC_LIST.dm), auio.NEW_TRENDING_PLACES);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_DISCOVERY_PUBLIC_LIST_ONBOARD_BY_NOTIF.dm), auio.NEW_TRENDING_PLACES);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_DISCOVERY_SAVED_PLACE_NEARBY.dm), auio.NEARBY_PLACES_EVENTS);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_DISCOVERY_TRAVEL.dm), auio.NEW_TRENDING_PLACES);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_DISCOVERY_TRAVEL_ONBOARD_BY_NOTIF.dm), auio.NEW_TRENDING_PLACES);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_DISCOVERY_TRENDING_PLACES.dm), auio.NEW_TRENDING_PLACES);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_DISCOVERY_TRENDING_PLACES_ONBOARD_BY_NOTIF.dm), auio.NEW_TRENDING_PLACES);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_DISCOVERY_UPCOMING_EVENTS.dm), auio.NEW_TRENDING_PLACES);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_DISCOVERY_WELCOME_TO_DESTINATION.dm), auio.NEARBY_PLACES_EVENTS);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_EVENT.dm), auio.TRAFFIC_FROM_NEARBY_EVENTS);
        dcdgVar.f(Integer.valueOf(dpyv.LOCAL_GUIDES_PERKS.dm), auio.LIKES_MILESTONES_BADGES);
        dcdgVar.f(Integer.valueOf(dpyv.SHARED_LOCATION_RECEIVED.dm), auio.GOOGLE_LOCATION_SHARING_FRIENDS);
        dcdgVar.f(Integer.valueOf(dpyv.LOCATION_SHARING_ONGOING_BURSTING.dm), auio.GOOGLE_LOCATION_SHARING_UPDATES);
        dcdgVar.f(Integer.valueOf(dpyv.SHARED_LOCATION_REQUEST.dm), auio.GOOGLE_LOCATION_SHARING_YOU);
        dcdgVar.f(Integer.valueOf(dpyv.LOCATION_SHARING_DEBUG.dm), auio.MAPS_FEATURES_DEBUG);
        dcdgVar.f(Integer.valueOf(dpyv.LOCATION_SHARING_USER_SALVAGE_AND_RESCUE.dm), auio.MAPS_FEATURES_DEBUG);
        dcdgVar.f(Integer.valueOf(dpyv.MADDEN_GROWTH.dm), auio.SERVICES_AVAILABLE_BOOKING);
        dcdgVar.f(Integer.valueOf(dpyv.MAPS_BADGES.dm), auio.LIKES_MILESTONES_BADGES);
        dcdgVar.f(Integer.valueOf(dpyv.BUSINESS_MESSAGE_FROM_MERCHANT.dm), auio.MESSAGES_FROM_MERCHANT);
        dcdgVar.f(Integer.valueOf(dpyv.BUSINESS_MESSAGE_FROM_CUSTOMER.dm), auio.MESSAGES_FROM_CUSTOMER);
        dcdgVar.f(Integer.valueOf(dpyv.BUSINESS_MESSAGING_MERCHANT_UNRESPONSIVE_SUMMARY.dm), auio.YOUR_BUSINESS);
        dcdgVar.f(Integer.valueOf(dpyv.NAVIGATION_PROMPTS.dm), auio.NAVIGATION_PRIORITY_BASED);
        dcdgVar.f(Integer.valueOf(dpyv.NAVIGATION_STATUS.dm), auio.NAVIGATION_PRIORITY_BASED);
        dcdgVar.f(Integer.valueOf(dpyv.NAVIGATION_DONATE_SESSION.dm), auio.MAPS_FEATURES_DEBUG);
        dcdgVar.f(Integer.valueOf(dpyv.NEW_BUSINESS_REVIEW.dm), auio.YOUR_BUSINESS);
        dcdgVar.f(Integer.valueOf(dpyv.OFF_ROUTE.dm), auio.MAPS_FEATURES_URGENT);
        dcdgVar.f(Integer.valueOf(dpyv.OFFLINE_APP_UPGRADE.dm), auio.OFFLINE_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.OFFLINE_BACKEND_CLEARED_ERROR.dm), auio.OFFLINE_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.OFFLINE_COVERAGE_LOST.dm), auio.OFFLINE_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.OFFLINE_DOWNLOAD.dm), auio.OFFLINE_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.OFFLINE_DOWNLOAD_FAILED.dm), auio.OFFLINE_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.OFFLINE_DOWNLOAD_SUCCESS.dm), auio.OFFLINE_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.OFFLINE_DYNAMIC_PADDING.dm), auio.OFFLINE_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.OFFLINE_MAP_EXPIRED.dm), auio.OFFLINE_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.OFFLINE_REGION_EXPIRING_SOON.dm), auio.OFFLINE_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.OFFLINE_TRIP_REGION_EXPIRED.dm), auio.OFFLINE_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.OFFLINE_TRIP_REGION_EXPIRING_SOON.dm), auio.OFFLINE_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.OFFLINE_UNUSED_REGION_EXPIRED.dm), auio.OFFLINE_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.OFFLINE_UNUSED_REGION_EXPIRING_SOON.dm), auio.OFFLINE_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.OFFLINE_ONBOARDING_PROMPT.dm), auio.OFFLINE_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.OFFLINE_RECOMMENDATION_FROM_GEOMETRY_CHANGE.dm), auio.OFFLINE_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.OFFLINE_RECOMMENDED_REGIONS_CHANGED.dm), auio.OFFLINE_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.OFFLINE_REGION_PARTLY_REPLACED_FROM_GEOMETRY_CHANGE.dm), auio.OFFLINE_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.OFFLINE_REGION_REPLACED_FROM_GEOMETRY_CHANGE.dm), auio.OFFLINE_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.OFFLINE_REGION_SOURCES_GONE.dm), auio.OFFLINE_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.OFFLINE_TRIPS.dm), auio.OFFLINE_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.SAVED_PARKING_LOCATION.dm), auio.PARKING_LOCATION);
        dcdgVar.f(Integer.valueOf(dpyv.SAVED_PARKING_LOCATION_EXPIRE_TIME.dm), auio.PARKING_LOCATION);
        dcdgVar.f(Integer.valueOf(dpyv.PARKING_PAYMENT_SESSION_EXPIRATION.dm), auio.PARKING_LOCATION);
        dcdgVar.f(Integer.valueOf(dpyv.PEOPLE_FOLLOW_NEW_FOLLOWER.dm), auio.YOUR_PROFILE_AND_FOLLOWING);
        dcdgVar.f(Integer.valueOf(dpyv.PEOPLE_FOLLOW_NEW_REQUEST.dm), auio.YOUR_PROFILE_AND_FOLLOWING);
        dcdgVar.f(Integer.valueOf(dpyv.PHOTO_TAKEN.dm), auio.SHARE_TAG_PHOTOS);
        dcdgVar.f(Integer.valueOf(dpyv.GEO_PHOTO_UPLOADS.dm), auio.SHARE_TAG_PHOTOS);
        dcdgVar.f(Integer.valueOf(dpyv.PLACE_LIST_JOINED.dm), auio.GROUP_PLANNING);
        dcdgVar.f(Integer.valueOf(dpyv.PLACE_QA.dm), auio.PLACES_YOU_VISITED);
        dcdgVar.f(Integer.valueOf(dpyv.PLACE_QA_MERCHANT.dm), auio.MESSAGES_FROM_MERCHANT);
        dcdgVar.f(Integer.valueOf(dpyv.REVIEW_AT_A_PLACE_PLACE_REMOVED_FROM_TIMELINE.dm), auio.SUGGESTION_WRITE_REVIEW);
        dcdgVar.f(Integer.valueOf(dpyv.POST_CONTRIBUTION_IMPACT.dm), auio.LIKES_MILESTONES_BADGES);
        dcdgVar.f(Integer.valueOf(dpyv.POST_INLINE_REVIEW_THANKS.dm), auio.SUGGESTION_WRITE_REVIEW);
        dcdgVar.f(Integer.valueOf(dpyv.POST_PHOTO_VIEWS.dm), auio.LIKES_MILESTONES_BADGES);
        dcdgVar.f(Integer.valueOf(dpyv.POST_PLACE_QA_BEST_ANSWER.dm), auio.LIKES_MILESTONES_BADGES);
        dcdgVar.f(Integer.valueOf(dpyv.POST_PLACE_QA_LIKE.dm), auio.LIKES_MILESTONES_BADGES);
        dcdgVar.f(Integer.valueOf(dpyv.REENGAGEMENT_CATEGORICAL_SEARCH_REOPENED_BUSINESS.dm), auio.NEARBY_PLACES_EVENTS);
        dcdgVar.f(Integer.valueOf(dpyv.REENGAGEMENT_PLACESHEET_REOPENED_BUSINESS.dm), auio.NEARBY_PLACES_EVENTS);
        dcdgVar.f(Integer.valueOf(dpyv.REENGAGEMENT_CATEGORICAL_SEARCH_TAKEOUT.dm), auio.NEARBY_PLACES_EVENTS);
        dcdgVar.f(Integer.valueOf(dpyv.REENGAGEMENT_PLACESHEET_TAKEOUT.dm), auio.NEARBY_PLACES_EVENTS);
        dcdgVar.f(Integer.valueOf(dpyv.REVIEW_AT_A_PLACE.dm), auio.SUGGESTION_WRITE_REVIEW);
        dcdgVar.f(Integer.valueOf(dpyv.REVIEW_AT_A_PLACE_SUBMISSION_FAILURE.dm), auio.SUGGESTION_WRITE_REVIEW);
        dcdgVar.f(Integer.valueOf(dpyv.REVIEW_REPLY.dm), auio.MESSAGES_FROM_MERCHANT);
        dcdgVar.f(Integer.valueOf(dpyv.RIDDLER.dm), auio.PLACES_YOU_VISITED);
        dcdgVar.f(Integer.valueOf(dpyv.SEND_TO_PHONE.dm), auio.MAPS_FEATURES_URGENT);
        dcdgVar.f(Integer.valueOf(dpyv.SERVICE_RECOMMENDATION.dm), auio.SUGGESTION_WRITE_REVIEW);
        dcdgVar.f(Integer.valueOf(dpyv.SERVICE_RECOMMENDATION_POST_INTERACTION.dm), auio.SUGGESTION_WRITE_REVIEW);
        dcdgVar.f(Integer.valueOf(dpyv.SET_ALIAS.dm), auio.COMMUTE_PROFILE);
        dcdgVar.f(Integer.valueOf(dpyv.SOCIAL_PLANNING_PLACE_ADDED.dm), auio.GROUP_PLANNING);
        dcdgVar.f(Integer.valueOf(dpyv.SOCIAL_PLANNING_PLACE_REACTION.dm), auio.GROUP_PLANNING);
        dcdgVar.f(Integer.valueOf(dpyv.SOCIAL_PLANNING_GROUP_SUMMARY.dm), auio.GROUP_PLANNING);
        dcdgVar.f(Integer.valueOf(dpyv.TIME_TO_LEAVE.dm), auio.TIME_TO_LEAVE);
        dcdgVar.f(Integer.valueOf(dpyv.TIMELINE_RECEIPTS_PARSED.dm), auio.GOOGLE_MAPS_TIMELINE);
        dcdgVar.f(Integer.valueOf(dpyv.TIMELINE_VISIT_CONFIRMATION.dm), auio.GOOGLE_MAPS_TIMELINE);
        dcdgVar.f(Integer.valueOf(dpyv.TIMELINE_WARM_WELCOME.dm), auio.GOOGLE_MAPS_TIMELINE);
        dcdgVar.f(Integer.valueOf(dpyv.TODO_LIST.dm), auio.SUGGESTION_WRITE_REVIEW);
        dcdgVar.f(Integer.valueOf(dpyv.TODO_PHOTO.dm), auio.SHARE_TAG_PHOTOS);
        dcdgVar.f(Integer.valueOf(dpyv.TODO_REVIEW.dm), auio.SUGGESTION_WRITE_REVIEW);
        dcdgVar.f(Integer.valueOf(dpyv.TRAFFIC_TO_PLACE.dm), auio.YOUR_COMMUTE);
        dcdgVar.f(Integer.valueOf(dpyv.TRANSIT_COMMUTE_BOARDS_DEPARTURE_ALARM_NOTIFICATION.dm), auio.NAVIGATION_URGENT);
        dcdgVar.f(Integer.valueOf(dpyv.TRANSIT_GUIDANCE.dm), auio.MAPS_FEATURES_URGENT);
        dcdgVar.f(Integer.valueOf(dpyv.TRANSIT_GUIDANCE_QUESTIONS.dm), auio.YOUR_AREA_ROADS_TRIPS);
        dcdgVar.f(Integer.valueOf(dpyv.TRANSIT_REROUTING.dm), auio.MAPS_FEATURES_URGENT);
        dcdgVar.f(Integer.valueOf(dpyv.TRANSIT_SCHEMATIC_MAP.dm), auio.TRANSIT_INFO_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.TRANSIT_SEND_TRACK.dm), auio.MAPS_FEATURES_DEBUG);
        dcdgVar.f(Integer.valueOf(dpyv.TRANSIT_STATION.dm), auio.TRANSIT_INFO_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.TRANSIT_STATION_FEEDBACK.dm), auio.TRANSIT_INFO_MAPS);
        dcdgVar.f(Integer.valueOf(dpyv.TRANSIT_TO_PLACE.dm), auio.YOUR_COMMUTE);
        dcdgVar.f(Integer.valueOf(dpyv.TRANSIT_TO_PLACE_DISRUPTION.dm), auio.YOUR_COMMUTE);
        dcdgVar.f(Integer.valueOf(dpyv.UGC_FACTUAL_IMPACT_ADD_A_PLACE.dm), auio.LIKES_MILESTONES_BADGES);
        dcdgVar.f(Integer.valueOf(dpyv.UGC_FACTUAL_IMPACT_LOCATION_EDIT.dm), auio.LIKES_MILESTONES_BADGES);
        dcdgVar.f(Integer.valueOf(dpyv.UGC_FACTUAL_IMPACT_PHONE_NUMBER_EDIT.dm), auio.LIKES_MILESTONES_BADGES);
        dcdgVar.f(Integer.valueOf(dpyv.UGC_HOME_STREET.dm), auio.YOUR_AREA_ROADS_TRIPS);
        dcdgVar.f(Integer.valueOf(dpyv.UGC_PHOTO_BECAME_PLACE_HERO_IMAGE.dm), auio.YOUR_AREA_ROADS_TRIPS);
        dcdgVar.f(Integer.valueOf(dpyv.UGC_POST_TRIP_QUESTIONS.dm), auio.YOUR_AREA_ROADS_TRIPS);
        dcdgVar.f(Integer.valueOf(dpyv.UGC_TASKS_NEARBY_NEED.dm), auio.YOUR_AREA_ROADS_TRIPS);
        dcdgVar.f(Integer.valueOf(dpyv.UGC_TASKS_NEARBY_PLACE_REMINDER.dm), auio.YOUR_AREA_ROADS_TRIPS);
        dcdgVar.f(Integer.valueOf(dpyv.UPDATE_COMMUTE_TRAVEL_MODE.dm), auio.COMMUTE_PROFILE);
        dcdgVar.f(Integer.valueOf(dpyv.VANAGON_PROMO.dm), auio.COMMUTE_PROFILE);
        b = dcdgVar.b();
    }

    public aujb(aujd aujdVar) {
        this.a = aujdVar.a();
        this.d = aujdVar.c();
        this.c = aujdVar.b();
    }

    private static auio y(int i) {
        return b.get(Integer.valueOf(i));
    }

    private static auin z(int i) {
        auio y = y(i);
        if (y == null) {
            return null;
        }
        return y.H;
    }

    public auir a() {
        auio y = y(this.a);
        dcdc<auiu> dcdcVar = y == null ? null : y.K;
        auiq c = auir.c();
        if (dcdcVar != null && f()) {
            c.b(dcdcVar);
        }
        return c.d();
    }

    public auix b() {
        auio y = y(this.a);
        if (y == null) {
            return null;
        }
        return y.J;
    }

    public dcdc<Preference> c(Activity activity, Context context, btvo btvoVar) {
        return dcdc.e();
    }

    public boolean d() {
        return this.c;
    }

    public final boolean e(btvo btvoVar) {
        return f() && g(btvoVar);
    }

    public boolean f() {
        return true;
    }

    public boolean g(btvo btvoVar) {
        return true;
    }

    public auiw h() {
        int x = x();
        if (x == 1) {
            return null;
        }
        boolean z = x == 3;
        auio v = v();
        auiv auivVar = v == null ? null : v.I;
        if (auivVar == null) {
            return null;
        }
        int i = this.a;
        bvjk bvjkVar = autd.a.get(Integer.valueOf(i));
        if (bvjkVar == null) {
            bvjkVar = new bvjk(String.format("%s_show_notifications_optout_shown_count", String.valueOf(i)), bvjk.c);
        }
        return new auiw(bvjkVar, z, auivVar);
    }

    public void i(btvo btvoVar, boolean z) {
    }

    public auil j() {
        return null;
    }

    public auik k(btvo btvoVar) {
        return null;
    }

    public ddos l(btvo btvoVar) {
        auik k = k(btvoVar);
        if (k != null) {
            return k.a();
        }
        return null;
    }

    public final boolean m(btvo btvoVar) {
        return n(btvoVar) || o(btvoVar) || p(btvoVar);
    }

    public boolean n(btvo btvoVar) {
        return false;
    }

    public final boolean o(btvo btvoVar) {
        return btvoVar.getNotificationsParameters().e && !btvoVar.getNotificationsParameters().g.contains(Integer.valueOf(this.a));
    }

    public final boolean p(btvo btvoVar) {
        for (dkpv dkpvVar : btvoVar.getNotificationsParameters().f) {
            auin z = z(this.a);
            ddho ddhoVar = z == null ? null : z.k;
            if (ddhoVar != null && dkpvVar.a == ((dtxi) ddhoVar).a) {
                return true;
            }
        }
        return false;
    }

    public void q(dlfv dlfvVar) {
    }

    public boolean r(dlfv dlfvVar, btlu btluVar) {
        return false;
    }

    public void s(btlu btluVar, dlfv dlfvVar, boolean z) {
    }

    public boolean t() {
        return false;
    }

    public dbsg<dkmm> u(btvo btvoVar) {
        dkmn dkmnVar = btvoVar.getNotificationsParameters().i;
        if (dkmnVar == null) {
            dkmnVar = dkmn.d;
        }
        dsrj<dkmm> dsrjVar = dkmnVar.a;
        return dcft.m(dsrjVar, new dbsl(this) { // from class: auiz
            private final aujb a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                aujb aujbVar = this.a;
                dkmm dkmmVar = (dkmm) obj;
                dpyv b2 = dpyv.b(dkmmVar.b);
                if (b2 == null) {
                    b2 = dpyv.UNKNOWN_NOTIFICATION_ID;
                }
                return b2.dm == aujbVar.a && dkmmVar.e;
            }
        }).d(dcft.m(dsrjVar, new dbsl(this) { // from class: auja
            private final aujb a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                aujb aujbVar = this.a;
                dpyv b2 = dpyv.b(((dkmm) obj).b);
                if (b2 == null) {
                    b2 = dpyv.UNKNOWN_NOTIFICATION_ID;
                }
                return b2.dm == aujbVar.a;
            }
        }));
    }

    public auio v() {
        return y(this.a);
    }

    public auin w() {
        return z(this.a);
    }

    public int x() {
        return this.d;
    }
}
