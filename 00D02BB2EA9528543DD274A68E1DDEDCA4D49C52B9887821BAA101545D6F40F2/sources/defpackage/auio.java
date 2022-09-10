package defpackage;

import com.google.android.apps.maps.R;
/* JADX WARN: Init of enum A can be incorrect */
/* JADX WARN: Init of enum D can be incorrect */
/* JADX WARN: Init of enum E can be incorrect */
/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum d can be incorrect */
/* JADX WARN: Init of enum e can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
/* JADX WARN: Init of enum g can be incorrect */
/* JADX WARN: Init of enum h can be incorrect */
/* JADX WARN: Init of enum i can be incorrect */
/* JADX WARN: Init of enum j can be incorrect */
/* JADX WARN: Init of enum k can be incorrect */
/* JADX WARN: Init of enum l can be incorrect */
/* JADX WARN: Init of enum m can be incorrect */
/* JADX WARN: Init of enum n can be incorrect */
/* JADX WARN: Init of enum o can be incorrect */
/* JADX WARN: Init of enum p can be incorrect */
/* JADX WARN: Init of enum q can be incorrect */
/* JADX WARN: Init of enum r can be incorrect */
/* JADX WARN: Init of enum s can be incorrect */
/* JADX WARN: Init of enum t can be incorrect */
/* JADX WARN: Init of enum u can be incorrect */
/* JADX WARN: Init of enum v can be incorrect */
/* JADX WARN: Init of enum w can be incorrect */
/* JADX WARN: Init of enum x can be incorrect */
/* JADX WARN: Init of enum y can be incorrect */
/* JADX WARN: Init of enum z can be incorrect */
/* compiled from: PG */
/* renamed from: auio  reason: default package */
/* loaded from: classes.dex */
public enum auio {
    YOUR_COMMUTE("YOUR_COMMUTE", r4, r5, r6, r0.a(), r0.a()),
    TRAFFIC_IN_YOUR_AREA("TRAFFIC_IN_YOUR_AREA", r18, r19, r20, r2.a()),
    TRAFFIC_FROM_NEARBY_EVENTS("TRAFFIC_FROM_NEARBY_EVENTS", r25, r26, r27, r3.a()),
    TIME_TO_LEAVE("TIME_TO_LEAVE", r18, r19, r3, r5.a()),
    TRANSIT_INFO_MAPS("TRANSIT_INFO_MAPS", r24, r25, r26, r5.a()),
    PARKING_LOCATION("PARKING_LOCATION", r31, r32, r33, r6.a()),
    OFFLINE_MAPS("OFFLINE_MAPS", r18, r19, r6, r14.a()),
    NEARBY_PLACES_EVENTS("NEARBY_PLACES_EVENTS", r27, r28, r29, r14.a()),
    NEW_TRENDING_PLACES("NEW_TRENDING_PLACES", r34, r35, r36, r14.a()),
    SERVICES_AVAILABLE_BOOKING("SERVICES_AVAILABLE_BOOKING", r27, r28, r10, r15.a()),
    LIKES_MILESTONES_BADGES("LIKES_MILESTONES_BADGES", r33, r34, r35, r15.a()),
    SUGGESTION_WRITE_REVIEW("SUGGESTION_WRITE_REVIEW", r40, r41, r42, r14.a()),
    SHARE_TAG_PHOTOS("SHARE_TAG_PHOTOS", r27, r28, r29, r13.a()),
    PLACES_YOU_VISITED("PLACES_YOU_VISITED", r36, r37, r38, r15.a()),
    YOUR_AREA_ROADS_TRIPS("YOUR_AREA_ROADS_TRIPS", r27, r28, r29, r15.a()),
    MESSAGES_FROM_MERCHANT("MESSAGES_FROM_MERCHANT", r37, r38, r39, r15.a()),
    MESSAGES_FROM_CUSTOMER("MESSAGES_FROM_CUSTOMER", r44, r45, r46, r15.a()),
    GROUP_PLANNING("GROUP_PLANNING", r37, r38, r11, r10.a()),
    GOOGLE_MAPS_TIMELINE("GOOGLE_MAPS_TIMELINE", r43, r44, r45, r14.a()),
    GOOGLE_LOCATION_SHARING_FRIENDS("GOOGLE_LOCATION_SHARING_FRIENDS", r50, r51, r52, r14.a()),
    GOOGLE_LOCATION_SHARING_YOU("GOOGLE_LOCATION_SHARING_YOU", r37, r38, r11, r15.a()),
    COMMUTE_PROFILE("COMMUTE_PROFILE", r43, r44, r45, r15.a()),
    NEW_ON_MAPS("NEW_ON_MAPS", r50, r51, r52, r15.a()),
    GOOGLE_LOCATION_SHARING_UPDATES("GOOGLE_LOCATION_SHARING_UPDATES", r37, null, null, r15.a()),
    YOUR_FEEDBACK("YOUR_FEEDBACK", r44, r45, r46, r14.a()),
    YOUR_PROFILE_AND_FOLLOWING("YOUR_PROFILE_AND_FOLLOWING", r51, r52, r53, r15.a()),
    YOUR_BUSINESS("YOUR_BUSINESS", r40, r41, r42, r15.a()),
    NAVIGATION_PRIORITY_BASED("NAVIGATION_PRIORITY_BASED", auin.MAPS_FEATURES, null, null, auip.i, auip.j),
    NAVIGATION_URGENT("NAVIGATION_URGENT", auin.MAPS_FEATURES, null, null, auip.j),
    MAPS_FEATURES_URGENT("MAPS_FEATURES_URGENT", r49, null, null, r12.a()),
    MAPS_FEATURES_DEBUG("MAPS_FEATURES_DEBUG", r56, null, null, r13.a()),
    OTHER("OTHER", auin.MAPS_FEATURES, null, null, aukk.a);
    
    public final String G;
    public final auin H;
    public final auiv I;
    public final auix J;
    public final dcdc<auiu> K;

    static {
        auin auinVar = auin.GETTING_AROUND;
        auiv.e(dtyg.l, dtyg.k, dtyg.i, dtyg.j);
        new auix(bvjk.cr, R.string.YOUR_COMMUTE_SETTINGS_TITLE, R.string.YOUR_COMMUTE_SETTINGS_SUMMARY, R.string.YOUR_COMMUTE_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtyc.bK);
        auis h = auiu.h(2);
        h.b(String.format("%s_1", Integer.valueOf(dpyv.TRAFFIC_TO_PLACE.dm)));
        h.d(R.string.YOUR_COMMUTE_SETTINGS_TITLE);
        h.c(R.string.YOUR_COMMUTE_SETTINGS_SUMMARY);
        auis h2 = auiu.h(4);
        h2.b(String.format("%s_2", Integer.valueOf(dpyv.TRAFFIC_TO_PLACE.dm)));
        h2.d(R.string.YOUR_COMMUTE_MAJOR_DELAYS_SETTINGS_TITLE);
        h2.c(R.string.YOUR_COMMUTE_MAJOR_DELAYS_SETTINGS_SUMMARY);
        auin auinVar2 = auin.GETTING_AROUND;
        auiv.e(dtyc.bo, dtyc.bn, dtyc.bl, dtyc.bm);
        new auix(bvjk.cY, R.string.TRAFFIC_IN_YOUR_AREA_SETTINGS_TITLE, R.string.TRAFFIC_IN_YOUR_AREA_SETTINGS_SUMMARY, R.string.TRAFFIC_IN_YOUR_AREA_OPT_OUT_SETTINGS_SUMMARY, aufs.DISABLED, dtxj.dm);
        auis h3 = auiu.h(1);
        h3.b(Integer.toString(dpyv.AREA_TRAFFIC.dm));
        h3.d(R.string.TRAFFIC_IN_YOUR_AREA_SETTINGS_TITLE);
        h3.c(R.string.TRAFFIC_IN_YOUR_AREA_SETTINGS_SUMMARY);
        auin auinVar3 = auin.GETTING_AROUND;
        auiv.e(dtyc.aN, dtyc.aM, dtyc.aK, dtyc.aL);
        new auix(bvjk.fn, R.string.TRAFFIC_NEARBY_EVENTS_SETTINGS_TITLE, R.string.TRAFFIC_NEARBY_EVENTS_SETTINGS_SUMMARY, R.string.TRAFFIC_NEARBY_EVENTS_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtxo.aB);
        auis h4 = auiu.h(2);
        h4.b(Integer.toString(dpyv.LOCAL_EVENT.dm));
        h4.d(R.string.TRAFFIC_NEARBY_EVENTS_SETTINGS_TITLE);
        h4.c(R.string.TRAFFIC_NEARBY_EVENTS_SETTINGS_SUMMARY);
        auin auinVar4 = auin.GETTING_AROUND;
        auiv.e(dtyc.ab, dtyc.aa, dtyc.Y, dtyc.Z);
        new auix(bvjk.cH, R.string.TIME_TO_LEAVE_SETTINGS_TITLE, R.string.TIME_TO_LEAVE_SETTINGS_SUMMARY, R.string.TIME_TO_LEAVE_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtyc.X);
        auis h5 = auiu.h(2);
        h5.b(String.format("%s_1", Integer.valueOf(dpyv.TIME_TO_LEAVE_V2.dm)));
        h5.d(R.string.TIME_TO_LEAVE_SETTINGS_TITLE);
        h5.c(R.string.TIME_TO_LEAVE_SETTINGS_SUMMARY);
        auin auinVar5 = auin.GETTING_AROUND;
        auiv.e(dtyc.dn, dtyc.dm, dtyc.dk, dtyc.dl);
        new auix(bvjk.dh, R.string.TRANSIT_INFO_SETTINGS_TITLE, R.string.TRANSIT_INFO_SETTINGS_SUMMARY, R.string.TRANSIT_INFO_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtyc.eG);
        auis h6 = auiu.h(2);
        h6.b(String.format("%s_1", Integer.valueOf(dpyv.TRANSIT_STATION.dm)));
        h6.d(R.string.TRANSIT_INFO_SETTINGS_TITLE);
        h6.c(R.string.TRANSIT_INFO_SETTINGS_SUMMARY);
        auin auinVar6 = auin.GETTING_AROUND;
        auiv.e(dtxy.f, dtxy.e, dtxy.c, dtxy.d);
        new auix(bvjk.hn, R.string.PARKING_LOCATION_SETTINGS_TITLE, R.string.PARKING_LOCATION_SETTINGS_SUMMARY, R.string.PARKING_LOCATION_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtyb.P);
        auis h7 = auiu.h(2);
        h7.b(String.format("%s_1", Integer.valueOf(dpyv.SAVED_PARKING_LOCATION.dm)));
        h7.d(R.string.PARKING_LOCATION_SETTINGS_TITLE);
        h7.c(R.string.PARKING_LOCATION_SETTINGS_SUMMARY);
        auin auinVar7 = auin.GETTING_AROUND;
        auiv.e(dtxx.bi, dtxx.bh, dtxx.bf, dtxx.bg);
        new auix(bvjk.fK, R.string.OFFLINE_MAPS_TITLE, R.string.OFFLINE_MAPS_NOTIFICATION_SETTINGS_SUMMARY, R.string.OFFLINE_MAPS_NOTIFICATION_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtxx.bS);
        auis h8 = auiu.h(2);
        h8.b(String.format("%s_1", Integer.valueOf(dpyv.OFFLINE_MAP_EXPIRED.dm)));
        h8.d(R.string.OFFLINE_MAPS_TITLE);
        h8.c(R.string.OFFLINE_MAPS_NOTIFICATION_SETTINGS_SUMMARY);
        auin auinVar8 = auin.RECOMMENDATIONS_FOR_YOU;
        auiv.e(dtxw.dt, dtxw.ds, dtxw.dq, dtxw.dr);
        new auix(bvjk.iJ, R.string.NEARBY_PLACES_NOTIFICATION_SETTINGS_TITLE, R.string.NEARBY_PLACES_NOTIFICATION_SETTINGS_SUMMARY_V2, R.string.NEARBY_PLACES_NOTIFICATION_OPT_OUT_SETTINGS_SUMMARY_V2, aufs.ENABLED, dtxu.S);
        auis h9 = auiu.h(3);
        h9.b(String.format("%s:%s", Integer.valueOf(dpyv.LOCAL_DISCOVERY_NEWLY_OPENED_PLACES.dm), 4));
        h9.d(R.string.NEARBY_PLACES_NOTIFICATION_SETTINGS_TITLE);
        h9.c(R.string.NEARBY_PLACES_NOTIFICATION_SETTINGS_SUMMARY);
        auin auinVar9 = auin.RECOMMENDATIONS_FOR_YOU;
        auiv.e(dtxw.dB, dtxw.dA, dtxw.dy, dtxw.dz);
        new auix(bvjk.iF, R.string.BASE_LOCAL_DISCOVERY_NOTIFICATION_SETTINGS_TITLE, R.string.BASE_LOCAL_DISCOVERY_NOTIFICATION_SETTINGS_SUMMARY, R.string.BASE_LOCAL_DISCOVERY_NOTIFICATION_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtxu.R);
        auis h10 = auiu.h(2);
        h10.b(String.format("%s:%s", Integer.valueOf(dpyv.LOCAL_DISCOVERY_NEWLY_OPENED_PLACES.dm), 2));
        h10.d(R.string.BASE_LOCAL_DISCOVERY_NOTIFICATION_SETTINGS_TITLE);
        h10.c(R.string.BASE_LOCAL_DISCOVERY_NOTIFICATION_SETTINGS_SUMMARY);
        auin auinVar10 = auin.RECOMMENDATIONS_FOR_YOU;
        auiv.e(dtyb.cI, dtyb.cH, dtyb.cF, dtyb.cG);
        new auix(bvjk.fR, R.string.MADDEN_GROWTH_NOTIFICATION_SETTINGS_TITLE, R.string.MADDEN_GROWTH_NOTIFICATION_SETTINGS_SUMMARY, R.string.MADDEN_GROWTH_NOTIFICATION_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtxv.d);
        auis h11 = auiu.h(2);
        h11.b(String.format("%s_1", Integer.valueOf(dpyv.MADDEN_GROWTH.dm)));
        h11.d(R.string.MADDEN_GROWTH_NOTIFICATION_SETTINGS_TITLE);
        h11.c(R.string.MADDEN_GROWTH_NOTIFICATION_SETTINGS_SUMMARY);
        auin auinVar11 = auin.YOUR_REVIEWS;
        auiv.e(dtxu.E, dtxu.D, dtxu.B, dtxu.C);
        new auix(bvjk.hQ, R.string.UGC_IMPACT_NOTIFICATION_SETTINGS_TITLE, R.string.UGC_IMPACT_NOTIFICATION_SETTINGS_SUMMARY, R.string.UGC_IMPACT_NOTIFICATION_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtxy.nI);
        auis h12 = auiu.h(3);
        h12.b(String.format("%s_1", Integer.valueOf(dpyv.POST_CONTRIBUTION_IMPACT.dm)));
        h12.d(R.string.UGC_IMPACT_NOTIFICATION_SETTINGS_TITLE);
        h12.c(R.string.UGC_IMPACT_NOTIFICATION_SETTINGS_SUMMARY);
        h12.e(auit.c(auip.g));
        auin auinVar12 = auin.YOUR_REVIEWS;
        auiv.e(dtyb.eH, dtyb.eG, dtyb.eE, dtyb.eF);
        new auix(bvjk.fL, R.string.REVIEW_NOTIFICATION_SETTINGS_TITLE, R.string.REVIEW_NOTIFICATION_SETTINGS_SUMMARY, R.string.REVIEW_NOTIFICATION_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtya.dg);
        auis h13 = auiu.h(3);
        h13.b(String.valueOf(auip.e).concat("_1"));
        h13.d(R.string.REVIEW_NOTIFICATION_SETTINGS_TITLE);
        h13.c(R.string.REVIEW_NOTIFICATION_SETTINGS_SUMMARY);
        h13.e(auit.c(auip.e));
        auin auinVar13 = auin.YOUR_REVIEWS;
        auiv.e(dtyb.dw, dtyb.dv, dtyb.dt, dtyb.du);
        new auix(bvjk.fA, R.string.PHOTO_NOTIFICATION_SETTINGS_TITLE, R.string.PHOTO_NOTIFICATION_SETTINGS_SUMMARY, R.string.PHOTO_NOTIFICATION_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtxy.cS);
        auis h14 = auiu.h(3);
        h14.b(String.valueOf(auip.f).concat("_1"));
        h14.d(R.string.PHOTO_NOTIFICATION_SETTINGS_TITLE);
        h14.c(R.string.PHOTO_NOTIFICATION_SETTINGS_SUMMARY);
        h14.e(auit.c(auip.f));
        auin auinVar14 = auin.QA_AND_MESSAGES;
        auiv.e(dtxy.nB, dtxy.nA, dtxy.ny, dtxy.nz);
        new auix(bvjk.fl, R.string.PLACES_NOTIFICATION_SETTINGS_TITLE, R.string.PLACES_NOTIFICATION_SETTINGS_SUMMARY, R.string.PLACES_NOTIFICATION_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtxz.v);
        auis h15 = auiu.h(2);
        h15.b(String.format("%s_1", Integer.valueOf(dpyv.RIDDLER.dm)));
        h15.d(R.string.PLACES_NOTIFICATION_SETTINGS_TITLE);
        h15.c(R.string.PLACES_NOTIFICATION_SETTINGS_SUMMARY);
        auin auinVar15 = auin.QA_AND_MESSAGES;
        auiv.e(dtyg.d, dtyg.c, dtyg.a, dtyg.b);
        new auix(bvjk.hu, R.string.UGC_NOTIFICATION_SETTINGS_TITLE, R.string.UGC_NOTIFICATION_SETTINGS_SUMMARY, R.string.UGC_NOTIFICATION_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtyd.P);
        auis h16 = auiu.h(2);
        h16.b(String.format("%s_1", Integer.valueOf(dpyv.UGC_POST_TRIP_QUESTIONS.dm)));
        h16.d(R.string.UGC_NOTIFICATION_SETTINGS_TITLE);
        h16.c(R.string.UGC_NOTIFICATION_SETTINGS_SUMMARY);
        auin auinVar16 = auin.QA_AND_MESSAGES;
        auiv.e(dtxv.ds, dtxv.dr, dtxv.dp, dtxv.dq);
        new auix(bvjk.iv, R.string.BUSINESS_MESSAGE_FROM_MERCHANT_NOTIFICATION_SETTINGS_TITLE, R.string.BUSINESS_MESSAGE_NOTIFICATION_SETTINGS_SUMMARY, R.string.BUSINESS_MESSAGE_NOTIFICATION_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtxk.J);
        auis h17 = auiu.h(4);
        h17.b(String.format("%s_1", Integer.valueOf(dpyv.BUSINESS_MESSAGE_FROM_MERCHANT.dm)));
        h17.d(R.string.BUSINESS_MESSAGE_FROM_MERCHANT_NOTIFICATION_SETTINGS_TITLE);
        h17.c(R.string.BUSINESS_MESSAGE_NOTIFICATION_SETTINGS_SUMMARY);
        auin auinVar17 = auin.QA_AND_MESSAGES;
        auiv.e(dtxv.f17do, dtxv.dn, dtxv.dl, dtxv.dm);
        new auix(bvjk.iw, R.string.BUSINESS_MESSAGE_FROM_CUSTOMER_NOTIFICATION_SETTINGS_TITLE, R.string.BUSINESS_MESSAGE_FROM_CUSTOMER_NOTIFICATION_SETTINGS_SUMMARY, R.string.BUSINESS_MESSAGE_FROM_CUSTOMER_NOTIFICATION_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtxk.I);
        auis h18 = auiu.h(4);
        h18.b(String.format("%s_1", Integer.valueOf(dpyv.BUSINESS_MESSAGE_FROM_CUSTOMER.dm)));
        h18.d(R.string.BUSINESS_MESSAGE_FROM_CUSTOMER_NOTIFICATION_SETTINGS_TITLE);
        h18.c(R.string.BUSINESS_MESSAGE_FROM_CUSTOMER_NOTIFICATION_SETTINGS_SUMMARY);
        auin auinVar18 = auin.QA_AND_MESSAGES;
        auiv.e(dtxq.s, dtxq.r, dtxq.p, dtxq.q);
        new auix(bvjk.dI, R.string.COLLABORATIVE_LISTS_NOTIFICATION_SETTINGS_TITLE, R.string.COLLABORATIVE_LISTS_NOTIFICATION_SETTINGS_SUMMARY, R.string.COLLABORATIVE_LISTS_NOTIFICATION_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtyb.dJ);
        auis h19 = auiu.h(4);
        h19.b(String.format("%s_1", Integer.valueOf(dpyv.SOCIAL_PLANNING_PLACE_ADDED.dm)));
        h19.d(R.string.COLLABORATIVE_LISTS_NOTIFICATION_SETTINGS_TITLE);
        h19.c(R.string.COLLABORATIVE_LISTS_NOTIFICATION_SETTINGS_SUMMARY);
        auin auinVar19 = auin.GOOGLE;
        auiv.e(dtxq.o, dtxq.n, dtxq.l, dtxq.m);
        new auix(bvjk.dM, R.string.GOOGLE_MAPS_TIMELINE_SETTINGS_TITLE, R.string.GOOGLE_MAPS_TIMELINE_SETTINGS_SUMMARY, R.string.GOOGLE_MAPS_TIMELINE_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtyc.au);
        auis h20 = auiu.h(2);
        h20.b(Integer.toString(dpyv.TIMELINE_VISIT_CONFIRMATION.dm));
        h20.d(R.string.GOOGLE_MAPS_TIMELINE_SETTINGS_TITLE);
        h20.c(R.string.GOOGLE_MAPS_TIMELINE_SETTINGS_SUMMARY);
        auin auinVar20 = auin.GOOGLE;
        auiv.e(dtxq.g, dtxq.f, dtxq.d, dtxq.e);
        new auix(bvjk.fr, R.string.LOCATION_SHARING_FRIENDS_SETTINGS_TITLE, R.string.LOCATION_SHARING_FRIENDS_SETTINGS_SUMMARY, R.string.LOCATION_SHARING_FRIENDS_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtxu.ex);
        auis h21 = auiu.h(4);
        h21.b(Integer.toString(dpyv.SHARED_LOCATION_RECEIVED.dm));
        h21.d(R.string.LOCATION_SHARING_FRIENDS_SETTINGS_TITLE);
        h21.c(R.string.LOCATION_SHARING_FRIENDS_SETTINGS_SUMMARY);
        auin auinVar21 = auin.GOOGLE;
        auiv.e(dtxq.k, dtxq.j, dtxq.h, dtxq.i);
        new auix(bvjk.fs, R.string.LOCATION_SHARING_YOU_SETTINGS_TITLE, R.string.LOCATION_SHARING_YOU_SETTINGS_SUMMARY, R.string.LOCATION_SHARING_YOU_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtxu.eG);
        auis h22 = auiu.h(4);
        h22.b(Integer.toString(dpyv.SHARED_LOCATION_REQUEST.dm));
        h22.d(R.string.LOCATION_SHARING_YOU_SETTINGS_TITLE);
        h22.c(R.string.LOCATION_SHARING_YOU_SETTINGS_SUMMARY);
        auin auinVar22 = auin.GOOGLE;
        auiv.e(dtxl.bT, dtxl.bS, dtxl.bQ, dtxl.bR);
        new auix(bvjk.fG, R.string.COMMUTE_PROFILE_SETTINGS_TITLE, R.string.COMMUTE_PROFILE_SETTINGS_SUMMARY, R.string.COMMUTE_PROFILE_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtxy.ai);
        auis h23 = auiu.h(2);
        h23.b(String.format("%s_1", Integer.valueOf(dpyv.COMMUTE_SETUP.dm)));
        h23.d(R.string.COMMUTE_PROFILE_SETTINGS_TITLE);
        h23.c(R.string.COMMUTE_PROFILE_SETTINGS_SUMMARY);
        auin auinVar23 = auin.GOOGLE;
        auiv.e(dtxw.dx, dtxw.dw, dtxw.du, dtxw.dv);
        new auix(bvjk.fp, R.string.NEW_ON_MAPS_CATEGORY_TITLE, R.string.NEW_ON_MAPS_NOTIFICATION_SETTINGS_SUMMARY, R.string.NEW_ON_MAPS_NOTIFICATION_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtxj.aZ);
        auis h24 = auiu.h(2);
        h24.b(String.format("%s_1", Integer.valueOf(dpyv.ANNOUNCEMENTS.dm)));
        h24.d(R.string.NEW_ON_MAPS_CATEGORY_TITLE);
        h24.c(R.string.NEW_ON_MAPS_NOTIFICATION_SETTINGS_SUMMARY);
        auin auinVar24 = auin.GOOGLE;
        auis h25 = auiu.h(2);
        h25.b(Integer.toString(dpyv.LOCATION_SHARING_ONGOING_BURSTING.dm));
        h25.d(R.string.LOCATION_SHARING_UPDATES_SETTINGS_TITLE);
        h25.c(R.string.LOCATION_SHARING_UPDATES_SETTINGS_SUMMARY);
        auin auinVar25 = auin.GOOGLE;
        auiv.e(dtyg.q, dtyg.p, dtyg.n, dtyg.o);
        new auix(bvjk.jV, R.string.YOUR_FEEDBACK_NOTIFICATION_SETTINGS_TITLE, R.string.YOUR_FEEDBACK_NOTIFICATION_SETTINGS_SUMMARY, R.string.YOUR_FEEDBACK_NOTIFICATION_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtyg.m);
        auis h26 = auiu.h(2);
        h26.b(Integer.toString(dpyv.IN_APP_SURVEY.dm));
        h26.d(R.string.YOUR_FEEDBACK_NOTIFICATION_SETTINGS_TITLE);
        h26.c(R.string.YOUR_FEEDBACK_NOTIFICATION_SETTINGS_SUMMARY);
        auin auinVar26 = auin.GOOGLE;
        auiv.e(dtyg.Y, dtyg.X, dtyg.V, dtyg.W);
        new auix(null, R.string.YOUR_PROFILE_AND_FOLLOWING_NOTIFICATION_SETTING_TITLE, R.string.YOUR_PROFILE_AND_FOLLOWING_NOTIFICATION_SETTING_SUMMARY, R.string.YOUR_PROFILE_AND_FOLLOWING_NOTIFICATION_OPT_OUT_SETTING_SUMMARY, aufs.ENABLED, dtyg.U);
        auis h27 = auiu.h(2);
        h27.b(String.format("%s_1", Integer.valueOf(dpyv.PEOPLE_FOLLOW_NEW_FOLLOWER.dm)));
        h27.d(R.string.YOUR_PROFILE_AND_FOLLOWING_NOTIFICATION_SETTING_TITLE);
        h27.c(R.string.YOUR_PROFILE_AND_FOLLOWING_NOTIFICATION_SETTING_SUMMARY);
        auin auinVar27 = auin.YOUR_BUSINESS;
        auiv.e(dtyg.h, dtyg.g, dtyg.e, dtyg.f);
        new auix(bvjk.ae, R.string.YOUR_BUSINESS_CATEGORY_TITLE, R.string.YOUR_BUSINESS_SETTINGS_SUMMARY, R.string.YOUR_BUSINESS_OPT_OUT_SETTINGS_SUMMARY, aufs.ENABLED, dtxk.H);
        auis h28 = auiu.h(3);
        h28.b(String.format("%s_1", Integer.valueOf(dpyv.BUSINESS_LISTINGS.dm)));
        h28.d(R.string.YOUR_BUSINESS_CATEGORY_TITLE);
        h28.c(R.string.YOUR_BUSINESS_SETTINGS_SUMMARY);
        auin auinVar28 = auin.MAPS_FEATURES;
        auis h29 = auiu.h(4);
        h29.b(auip.h);
        h29.d(R.string.MAPS_FEATURES_URGENT_SETTINGS_TITLE);
        auin auinVar29 = auin.MAPS_FEATURES;
        auis h30 = auiu.h(2);
        h30.b(Integer.toString(dpyv.NAVIGATION_DONATE_SESSION.dm));
        h30.d(R.string.DEBUG_MAPS_FEATURES_SETTINGS_TITLE);
    }

    auio(String str, auin auinVar, auiv auivVar, auix auixVar, auiu... auiuVarArr) {
        this.G = str;
        this.H = auinVar;
        this.I = auivVar;
        this.J = auixVar;
        this.K = dcdc.t(auiuVarArr);
    }
}
