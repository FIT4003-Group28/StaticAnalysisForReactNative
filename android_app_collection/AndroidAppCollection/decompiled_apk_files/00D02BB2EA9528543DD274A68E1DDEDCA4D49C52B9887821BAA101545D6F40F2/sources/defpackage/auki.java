package defpackage;

import android.app.Application;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: auki  reason: default package */
/* loaded from: classes.dex */
public final class auki implements aukk {
    private final Application b;
    private final auhi c;
    private final dxio<NotificationManager> d;
    private boolean e = false;

    static {
        dcep.G(Integer.toString(dpyv.ANNOUNCEMENTS.dm), Integer.toString(dpyv.BUSINESS_LISTINGS.dm), Integer.toString(dpyv.BUSINESS_MESSAGE_FROM_CUSTOMER.dm), Integer.toString(dpyv.BUSINESS_MESSAGE_FROM_MERCHANT.dm), Integer.toString(dpyv.BUSINESS_OWNER_HOURS.dm), Integer.toString(dpyv.DESKTOP_CALL.dm), Integer.toString(dpyv.EDIT_PUBLISHED.dm), Integer.toString(dpyv.EMPLOYEE_HOURS.dm), Integer.toString(dpyv.GEO_PHOTO_UPLOADS.dm), Integer.toString(dpyv.IN_APP_SHARE.dm), Integer.toString(dpyv.I_AM_HERE.dm), Integer.toString(dpyv.JOURNEY_SHARING_ARRIVAL_NOTIFICATION_RECEIVED.dm), String.format("%s:2)", Integer.valueOf(dpyv.LOCAL_DISCOVERY_NEWLY_OPENED_PLACES.dm)), String.format("%s:4)", Integer.valueOf(dpyv.LOCAL_DISCOVERY_NEWLY_OPENED_PLACES.dm)), Integer.toString(dpyv.LOCATION_SHARING_DEBUG.dm), Integer.toString(dpyv.MADDEN_GROWTH.dm), Integer.toString(dpyv.MAPS_BADGES.dm), Integer.toString(dpyv.NAVIGATION_START_DRIVING_MODE.dm), Integer.toString(dpyv.OFFLINE_COVERAGE_LOST.dm), Integer.toString(dpyv.OFFLINE_DOWNLOAD.dm), Integer.toString(dpyv.OFFLINE_DYNAMIC_PADDING.dm), Integer.toString(dpyv.OFFLINE_MAP_EXPIRED.dm), String.format("%s_1)", Integer.valueOf(dpyv.OFFLINE_MAP_EXPIRED.dm)), Integer.toString(dpyv.OFFLINE_TRIPS.dm), Integer.toString(dpyv.PHOTO_TAKEN.dm), Integer.toString(dpyv.PLACE_QA.dm), Integer.toString(dpyv.POST_CONTRIBUTION_IMPACT.dm), Integer.toString(dpyv.REVIEW_AT_A_PLACE.dm), Integer.toString(dpyv.RIDDLER.dm), Integer.toString(dpyv.ROVER.dm), Integer.toString(dpyv.SAVED_PARKING_LOCATION.dm), String.format("%s_1)", Integer.valueOf(dpyv.SAVED_PARKING_LOCATION.dm)), Integer.toString(dpyv.SAVED_PARKING_LOCATION_EXPIRE_TIME.dm), Integer.toString(dpyv.SEND_TO_PHONE.dm), Integer.toString(dpyv.SET_ALIAS.dm), Integer.toString(dpyv.TIMELINE_RECEIPTS_PARSED.dm), Integer.toString(dpyv.TIME_TO_LEAVE.dm), String.format("%s_1", Integer.valueOf(dpyv.TIME_TO_LEAVE.dm)), String.format("%s_1)", Integer.valueOf(dpyv.TIME_TO_LEAVE.dm)), Integer.toString(dpyv.TODO_LIST.dm), Integer.toString(dpyv.TODO_PHOTO.dm), Integer.toString(dpyv.TRAFFIC_TO_PLACE.dm), String.format("%s:2", Integer.valueOf(dpyv.TRAFFIC_TO_PLACE.dm)), String.format("%s:3", Integer.valueOf(dpyv.TRAFFIC_TO_PLACE.dm)), String.format("%s_1)", Integer.valueOf(dpyv.TRAFFIC_TO_PLACE.dm)), String.format("%s_2)", Integer.valueOf(dpyv.TRAFFIC_TO_PLACE.dm)), Integer.toString(dpyv.TRANSIT_COMMUTE_BOARDS_DEPARTURE_ALARM_NOTIFICATION.dm), Integer.toString(dpyv.TRANSIT_GUIDANCE.dm), Integer.toString(dpyv.TRANSIT_GUIDANCE_QUESTIONS.dm), Integer.toString(dpyv.TRANSIT_REROUTING.dm), Integer.toString(dpyv.TRANSIT_SCHEMATIC_MAP.dm), Integer.toString(dpyv.TRANSIT_SEND_TRACK.dm), Integer.toString(dpyv.TRANSIT_STATION.dm), String.format("%s_1)", Integer.valueOf(dpyv.TRANSIT_STATION.dm)), Integer.toString(dpyv.UGC_HOME_STREET.dm), Integer.toString(dpyv.UGC_POST_TRIP_QUESTIONS.dm), Integer.toString(dpyv.UGC_TASKS_NEARBY_NEED.dm), Integer.toString(dpyv.UGC_TASKS_NEARBY_PLACE_REMINDER.dm), Integer.toString(dpyv.UPDATE_COMMUTE_TRAVEL_MODE.dm), "127057887", "TEST_CHANNEL");
    }

    public auki(Application application, auhi auhiVar) {
        this.b = application;
        this.c = auhiVar;
        this.d = btsp.b(new aukh(application));
    }

    @Override // defpackage.aukk
    public final void a(boolean z) {
        auin w;
        auin w2;
        if ((!this.e || z) && ako.a()) {
            NotificationManager a = this.d.a();
            dcdn<Integer, aujb> b = this.c.b();
            HashSet hashSet = new HashSet();
            ArrayList<aujb> arrayList = new ArrayList();
            dcpd<aujb> it = b.values().iterator();
            while (it.hasNext()) {
                aujb next = it.next();
                if (next.f() && (w2 = next.w()) != null) {
                    arrayList.add(next);
                    hashSet.add(w2);
                }
            }
            dcen N = dcep.N();
            for (aujb aujbVar : arrayList) {
                N.i(dcbg.b(aujbVar.a().a()).s(aukg.a).B());
            }
            N.b(aukk.a.a());
            N.b("miscellaneous");
            dcpd it2 = dcnm.p(dcbg.b(a.getNotificationChannels()).s(aukf.a).B(), N.f()).iterator();
            while (it2.hasNext()) {
                a.deleteNotificationChannel((String) it2.next());
            }
            List<NotificationChannelGroup> notificationChannelGroups = a.getNotificationChannelGroups();
            Iterator it3 = hashSet.iterator();
            while (true) {
                NotificationChannelGroup notificationChannelGroup = null;
                if (!it3.hasNext()) {
                    break;
                }
                auin auinVar = (auin) it3.next();
                String string = this.b.getString(auinVar.i);
                Iterator<NotificationChannelGroup> it4 = notificationChannelGroups.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    NotificationChannelGroup next2 = it4.next();
                    if (dbsd.a(next2.getId(), auinVar.h)) {
                        notificationChannelGroup = next2;
                        break;
                    }
                }
                if (notificationChannelGroup == null || !notificationChannelGroup.getName().toString().equals(string)) {
                    a.createNotificationChannelGroup(new NotificationChannelGroup(auinVar.h, string));
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                aujb aujbVar2 = (aujb) arrayList.get(i);
                dcdc<auiu> a2 = aujbVar2.a().a();
                if (a2 != null && (w = aujbVar2.w()) != null) {
                    int size2 = a2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        aukj.a(this.b, a2.get(i2), w.h, a);
                    }
                }
            }
            aukj.a(this.b, a, null, a);
            this.e = true;
        }
    }
}
