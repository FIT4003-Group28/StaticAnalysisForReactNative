package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ewf  reason: default package */
/* loaded from: classes.dex */
public final class ewf {
    final /* synthetic */ ftt a;

    public ewf(ftt fttVar) {
        this.a = fttVar;
    }

    public final affy a() {
        asio qF = this.a.eW.qF();
        dcdg q = dcdn.q(90);
        afid afidVar = afid.MADDEN;
        ftt fttVar = this.a;
        jon jonVar = new jon(fttVar.eW.cu());
        dzsj<gga> ad = fttVar.ad();
        dzsj<bvrb> R = fttVar.eW.R();
        dzsj<aufl> ax = fttVar.eW.ax();
        dzsj<bvjj> aw = fttVar.eW.aw();
        dzsj dzsjVar = fttVar.eI;
        if (dzsjVar == null) {
            dzsjVar = new fns(fttVar, 1446);
            fttVar.eI = dzsjVar;
        }
        q.f(afidVar, new afic(jonVar, new jop(ad, R, ax, aw, dxjh.c(dzsjVar), dxjh.c(fttVar.eW.k()), fttVar.eW.V())));
        q.f(afid.RESUME_DIRECTIONS, new afic(umz.d, new una(dxjh.c(this.a.H()))));
        afid afidVar2 = afid.SHARE_TRIP;
        ftt fttVar2 = this.a;
        q.f(afidVar2, new afic(unc.b, new und(dxjh.c(fttVar2.cB()), dxjh.c(fttVar2.eW.nX()))));
        afid afidVar3 = afid.DIRECTIONS;
        ftt fttVar3 = this.a;
        q.f(afidVar3, new afic(umw.a, new umx(dxjh.c(fttVar3.H()), fttVar3.so(), fttVar3.eW.al())));
        q.f(afid.START_COMMUTE_SETUP, new afic(unf.a, new ung(this.a.hP())));
        afid afidVar4 = afid.COMMUTE_SETTINGS;
        ftt fttVar4 = this.a;
        q.f(afidVar4, new afic(umq.a, new umr(fttVar4.hP(), fttVar4.H(), fttVar4.eW.ik())));
        q.f(afid.DIRECTIONS_ACTION, this.a.vJ());
        q.f(afid.WELCOME_TO_DESTINATION_NOTIFICATION, new afic(abfp.a, new abfq(dxjh.c(this.a.az()))));
        q.f(afid.FEEDBACK, this.a.vK());
        q.f(afid.IN_APP_SURVEY_NOTIFICATION, new afic(aezs.a, new aezt(dxjh.c(this.a.kV()))));
        afid afidVar5 = afid.INCOGNITO;
        ftt fttVar5 = this.a;
        q.f(afidVar5, new afic(afdz.a, new afea(fttVar5.eW.I(), dxjh.c(fttVar5.m()))));
        afid afidVar6 = afid.RESET_ACTIVITY;
        ftt fttVar6 = this.a;
        q.f(afidVar6, new afic(afjr.d, new afjs(fttVar6.ad(), dxjh.c(fttVar6.H()), dxjh.c(fttVar6.aK()), fttVar6.eW.cB(), dxjh.c(fttVar6.eW.at()))));
        q.f(afid.GMM_SETTINGS, this.a.vL());
        afid afidVar7 = afid.EXTERNAL_INVOCATION;
        ftt fttVar7 = this.a;
        dzsj dzsjVar2 = fttVar7.eJ;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fns(fttVar7, 1450);
            fttVar7.eJ = dzsjVar2;
        }
        afjc afjcVar = new afjc(dxjc.c(dzsjVar2));
        btvo rp = fttVar7.eW.a.rp();
        dxjg.e(rp);
        q.f(afidVar7, new afic(new afjd(rp), afjcVar));
        afid afidVar8 = afid.SHORT_URL;
        ftt fttVar8 = this.a;
        q.f(afidVar8, new afic(afjy.d, new afjz(fttVar8.ad(), fttVar8.eW.R(), fttVar8.cx())));
        q.f(afid.MAYBE_LOGIN_THEN_CONTINUE, this.a.vM());
        q.f(afid.FDL, this.a.vO());
        afid afidVar9 = afid.LOCAL_STREAM_FOCUS_ITEM_ACTION;
        ftt fttVar9 = this.a;
        q.f(afidVar9, new afic(agby.b, new agbz(dxjh.c(fttVar9.eW.ik()), dxjh.c(fttVar9.eW.aw()), dxjh.c(fttVar9.G()), dxjh.c(fttVar9.eW.p()), dxjh.c(fttVar9.P()), dxjh.c(fttVar9.L()))));
        afid afidVar10 = afid.LOCATION_SHARE;
        ftt fttVar10 = this.a;
        btvo rp2 = fttVar10.eW.a.rp();
        dxjg.e(rp2);
        q.f(afidVar10, new afic(new ahye(rp2), new ahyg(fttVar10.cB())));
        afid afidVar11 = afid.LOCATION_SHARES_FOR_PERSONAL_SAFETY_SHORTCUT;
        ftt fttVar11 = this.a;
        btvo rp3 = fttVar11.eW.a.rp();
        dxjg.e(rp3);
        q.f(afidVar11, new afic(new ahyh(rp3), new ahyj(fttVar11.cB())));
        afid afidVar12 = afid.LOCATION_SHARE_SHORTCUT;
        ftt fttVar12 = this.a;
        btvo rp4 = fttVar12.eW.a.rp();
        dxjg.e(rp4);
        q.f(afidVar12, new afic(new ahyq(rp4), new ahys(fttVar12.cB(), fttVar12.eW.V(), fttVar12.eW.n())));
        afid afidVar13 = afid.REQUEST_LOCATION;
        ftt fttVar13 = this.a;
        btvo rp5 = fttVar13.eW.a.rp();
        dxjg.e(rp5);
        q.f(afidVar13, new afic(new ahym(rp5), new ahyo(fttVar13.cB())));
        afid afidVar14 = afid.LOCATION_SHARING_FIX_MISCONFIGURATIONS;
        ftt fttVar14 = this.a;
        ahws ahwsVar = new ahws(dxjh.c(fttVar14.cB()));
        btvo rp6 = fttVar14.eW.a.rp();
        dxjg.e(rp6);
        q.f(afidVar14, new afic(new ahwq(rp6), ahwsVar));
        q.f(afid.EVENT_NOTIFICATION, this.a.vP());
        q.f(afid.MAJOR_EVENT, new afic(akmq.c, new akmr(dxjh.c(this.a.bo()))));
        afid afidVar15 = afid.MAP_ONLY_ACTION;
        ftt fttVar15 = this.a;
        q.f(afidVar15, new afic(alun.k, new aluo(fttVar15.ad(), fttVar15.vH(), fttVar15.vI(), fttVar15.fN(), fttVar15.as(), dxjh.c(fttVar15.eW.k()), fttVar15.eW.R(), dxjh.c(fttVar15.cl()), dxjh.c(fttVar15.cu()))));
        afid afidVar16 = afid.TIMELINE_NOTIFICATION;
        ftt fttVar16 = this.a;
        dzsj<gga> ad2 = fttVar16.ad();
        dzsj<anhg> aX = fttVar16.aX();
        dzsj<akdv> P = fttVar16.P();
        dzsj dzsjVar3 = fttVar16.eK;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fns(fttVar16, 1452);
            fttVar16.eK = dzsjVar3;
        }
        q.f(afidVar16, new afic(annl.b, new annm(ad2, aX, P, dzsjVar3, fttVar16.fN())));
        afid afidVar17 = afid.TIMELINE_PUBLIC_URL;
        ftt fttVar17 = this.a;
        q.f(afidVar17, new afic(annq.j, new annr(fttVar17.ad(), fttVar17.aX(), fttVar17.eW.al(), fttVar17.P(), fttVar17.eW.p())));
        afid afidVar18 = afid.TIMELINE_GOOGLE_INTERNAL;
        ftt fttVar18 = this.a;
        q.f(afidVar18, new afic(annf.b, new anng(fttVar18.P(), fttVar18.aX())));
        afid afidVar19 = afid.NEW_BUSINESS_REVIEW;
        ftt fttVar19 = this.a;
        q.f(afidVar19, new afic(apst.k, new apsu(fttVar19.ad(), fttVar19.vQ(), fttVar19.eW.aw(), fttVar19.eW.R(), fttVar19.eW.ax(), dxjh.c(fttVar19.az()), dxjh.c(fttVar19.ig()))));
        afid afidVar20 = afid.BUSINESS_INSIGHTS;
        ftt fttVar20 = this.a;
        q.f(afidVar20, new afic(apsl.l, new apsm(dxjh.c(fttVar20.az()), fttVar20.ad(), fttVar20.eW.hN(), fttVar20.vQ(), fttVar20.eW.aw(), fttVar20.eW.R(), fttVar20.eW.ax(), fttVar20.l(), dxjh.c(fttVar20.cM()), dxjh.c(fttVar20.uj()))));
        afid afidVar21 = afid.MERCHANT_FRESHNESS_WIZARD;
        ftt fttVar21 = this.a;
        dzsj<gga> ad3 = fttVar21.ad();
        dzsj<avae> vQ = fttVar21.vQ();
        dzsj<bvjj> aw2 = fttVar21.eW.aw();
        dzsj<bvrb> R2 = fttVar21.eW.R();
        dzsj<aufl> ax2 = fttVar21.eW.ax();
        dzsj c = dxjh.c(fttVar21.az());
        dzsj dzsjVar4 = fttVar21.eL;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fns(fttVar21, 1454);
            fttVar21.eL = dzsjVar4;
        }
        q.f(afidVar21, new afic(apsp.j, new apsq(ad3, vQ, aw2, R2, ax2, c, dxjh.c(dzsjVar4))));
        afid afidVar22 = afid.BUSINESS_MESSAGING_GCM_NOTIFICATION;
        ftt fttVar22 = this.a;
        q.f(afidVar22, new afic(aqqv.a, new aqqw(dxjh.c(fttVar22.x()), dxjh.c(fttVar22.eW.at()), dxjh.c(fttVar22.eW.al()))));
        q.f(afid.BUSINESS_MESSAGING_START_CONVERSATION, new afic(aqrh.a, new aqri(this.a.vR())));
        afid afidVar23 = afid.BUSINESS_MESSAGING_OPT_OUT;
        ftt fttVar23 = this.a;
        q.f(afidVar23, new afic(aqre.a, new aqrf(fttVar23.eW.ip(), fttVar23.eW.ne(), dxjh.c(fttVar23.x()), dxjh.c(fttVar23.Z()), dxjh.c(fttVar23.eW.p()))));
        afid afidVar24 = afid.BUSINESS_MESSAGING_MAPS_ONLY;
        ftt fttVar24 = this.a;
        q.f(afidVar24, new afic(aqqp.a, new aqqq(fttVar24.vR(), fttVar24.eW.ip())));
        afid afidVar25 = afid.BUSINESS_MESSAGING_MERCHANT;
        ftt fttVar25 = this.a;
        q.f(afidVar25, new afic(aqqs.a, new aqqt(dxjh.c(fttVar25.Z()), dxjh.c(fttVar25.x()), dxjh.c(fttVar25.eW.p()), fttVar25.eW.ip(), fttVar25.eW.cn(), fttVar25.eW.al())));
        afid afidVar26 = afid.LAUNCHER_SHORTCUT;
        ftt fttVar26 = this.a;
        q.f(afidVar26, new afic(arpw.a, new arpx(fttVar26.ad(), dxjh.c(fttVar26.bT()), fttVar26.eW.al(), fttVar26.eW.hN())));
        afid afidVar27 = afid.ENROUTE;
        ftt fttVar27 = this.a;
        btvo rp7 = fttVar27.eW.a.rp();
        dxjg.e(rp7);
        q.f(afidVar27, new afic(new arpp(rp7, dxjc.c(fttVar27.bT()), fttVar27.m21if()), new arpr(fttVar27.eW.al(), dxjh.c(fttVar27.bT()), fttVar27.hG(), fttVar27.eW.cB(), dxjh.c(fttVar27.eW.at()), dxjh.c(fttVar27.eW.iV()))));
        afid afidVar28 = afid.RESUME_NAVIGATION;
        ftt fttVar28 = this.a;
        q.f(afidVar28, new afic(arpz.a, new arqa(fttVar28.bT(), fttVar28.hG(), fttVar28.eW.cB(), fttVar28.eW.at())));
        q.f(afid.FREE_NAV_ACTION, this.a.vS());
        afid afidVar29 = afid.GOOGLE_MY_BUSINESS_PLAYSTORE;
        ftt fttVar29 = this.a;
        q.f(afidVar29, new afic(ausc.a, new ausd(fttVar29.ad(), fttVar29.eW.aw(), dxjh.c(fttVar29.m()))));
        q.f(afid.GENERIC_WEB_VIEW_NOTIFICATION, new afic(aurz.c, new ausa(this.a.ai())));
        afid afidVar30 = afid.OFFLINE;
        ftt fttVar30 = this.a;
        dzsj dzsjVar5 = fttVar30.eM;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fns(fttVar30, 1456);
            fttVar30.eM = dzsjVar5;
        }
        q.f(afidVar30, new afic(avsp.a, new avsq(dxjh.c(dzsjVar5))));
        q.f(afid.OOB_FLOW_ONLY, new afic(awny.a, new awnz(this.a.ad())));
        afid afidVar31 = afid.PARKING_LOCATION;
        ftt fttVar31 = this.a;
        q.f(afidVar31, new afic(awri.b, new awrj(fttVar31.ad(), dxjh.c(fttVar31.st()))));
        afid afidVar32 = afid.PARKING_PAYMENT;
        ftt fttVar32 = this.a;
        q.f(afidVar32, new afic(awpn.a, new awpo(fttVar32.eW.V(), dxjh.c(fttVar32.tP()))));
        afid afidVar33 = afid.PEOPLE_FOLLOWER_LIST;
        ftt fttVar33 = this.a;
        q.f(afidVar33, new afic(axjo.a, new axjp(fttVar33.cN(), fttVar33.eW.ax())));
        afid afidVar34 = afid.EDIT_ALIAS;
        ftt fttVar34 = this.a;
        q.f(afidVar34, new afic(azty.c, new aztz(fttVar34.ad(), dxjh.c(fttVar34.J()), fttVar34.P())));
        afid afidVar35 = afid.PLACE_LIST_SHARED_URL;
        ftt fttVar35 = this.a;
        q.f(afidVar35, new afic(azuc.a, new azud(fttVar35.ad(), fttVar35.fN(), fttVar35.J())));
        q.f(afid.YOUR_SAVED_PLACES, new afic(azui.b, new azuj(this.a.J())));
        q.f(afid.PROFILE_PAGE, new afic(azuf.a, new azug(this.a.J())));
        afid afidVar36 = afid.PERSONAL_SCORE_MARKETING;
        ftt fttVar36 = this.a;
        dzsj<gga> ad4 = fttVar36.ad();
        dzsj c2 = dxjh.c(fttVar36.jr());
        dzsj c3 = dxjh.c(fttVar36.aK());
        dzsj<Executor> di = fttVar36.eW.di();
        dzsj<cjqy> al = fttVar36.eW.al();
        dzsj c4 = dxjh.c(fttVar36.eW.aw());
        dzsj dzsjVar6 = fttVar36.eN;
        if (dzsjVar6 == null) {
            dzsjVar6 = new fns(fttVar36, 1457);
            fttVar36.eN = dzsjVar6;
        }
        q.f(afidVar36, new afic(bbis.b, new bbit(ad4, c2, c3, di, al, c4, dzsjVar6, fttVar36.eW.V())));
        afid afidVar37 = afid.PHOTO_SHARE;
        ftt fttVar37 = this.a;
        btvo rp8 = fttVar37.eW.a.rp();
        dxjg.e(rp8);
        q.f(afidVar37, new afic(new bcov(rp8), new bcox(fttVar37.bf())));
        afid afidVar38 = afid.PLACE_QA;
        ftt fttVar38 = this.a;
        q.f(afidVar38, new afic(bfxf.k, new bfxg(fttVar38.ad(), fttVar38.az(), fttVar38.fF(), fttVar38.fN(), fttVar38.eW.ax(), fttVar38.eW.aw(), fttVar38.eW.R())));
        afid afidVar39 = afid.RIDDLER_UGC;
        ftt fttVar39 = this.a;
        q.f(afidVar39, new afic(bfxl.a, new bfxm(fttVar39.ly(), dxjh.c(fttVar39.bh()), dxjh.c(fttVar39.tk()), dxjh.c(fttVar39.M()), dxjh.c(fttVar39.cQ()), dxjh.c(fttVar39.aR()), dxjh.c(fttVar39.aV()), dxjh.c(fttVar39.eW.V()), dxjh.c(fttVar39.eW.aB()))));
        q.f(afid.LOCAL_STREAM_CONTINUATION_ACTION, new afic(bfwx.a, new bfwy(dxjh.c(this.a.G()))));
        afid afidVar40 = afid.PLACESHEET_TAB_ACTION;
        ftt fttVar40 = this.a;
        q.f(afidVar40, new afic(bfxi.a, new bfxj(fttVar40.eW.mj(), fttVar40.ly(), dxjh.c(fttVar40.az()))));
        afid afidVar41 = afid.PLACE_ACTION;
        ftt fttVar41 = this.a;
        q.f(afidVar41, new afic(bfxb.a, new bfxc(fttVar41.ad(), fttVar41.vH(), fttVar41.vI(), dxjh.c(fttVar41.az()), dxjh.c(fttVar41.bf()), fttVar41.fN(), dxjh.c(fttVar41.cu()), fttVar41.vT(), dxjh.c(fttVar41.eW.V()), dxjh.c(fttVar41.aR()), dxjh.c(fttVar41.M()), dxjh.c(fttVar41.cQ()), fttVar41.eW.mj())));
        afid afidVar42 = afid.REPLAY;
        ftt fttVar42 = this.a;
        dzsj<gga> ad5 = fttVar42.ad();
        fyu fyuVar = fttVar42.eW;
        dzsj dzsjVar7 = fyuVar.dR;
        if (dzsjVar7 == null) {
            dzsjVar7 = new fxy(fyuVar, 734);
            fyuVar.dR = dzsjVar7;
        }
        q.f(afidVar42, new afic(bnwx.c, new bnwy(ad5, dzsjVar7, fttVar42.vI())));
        afid afidVar43 = afid.REPORT_A_PROBLEM;
        ftt fttVar43 = this.a;
        q.f(afidVar43, new afic(bota.b, new botb(dxjh.c(fttVar43.az()), dxjh.c(fttVar43.cn()))));
        q.f(afid.RAP_MISSING_ROAD_DEBUG, new afic(bqdp.a, new bqdq(dxjh.c(this.a.ls()))));
        q.f(afid.APP_SEARCH_ACTION, this.a.vU());
        afid afidVar44 = afid.PLUS_CODES;
        ftt fttVar44 = this.a;
        q.f(afidVar44, new afic(brha.c, new brhb(fttVar44.aK(), fttVar44.as())));
        q.f(afid.WRITE_REVIEW, new afic(brhk.a, new brhl(this.a.aJ())));
        afid afidVar45 = afid.SEARCH_ACTION;
        ftt fttVar45 = this.a;
        q.f(afidVar45, new afic(brhd.j, new brhe(fttVar45.ad(), fttVar45.vH(), fttVar45.vI(), fttVar45.fN(), fttVar45.eW.al(), fttVar45.eW.cB(), dxjh.c(fttVar45.eW.at()), dxjh.c(fttVar45.az()), fttVar45.hG(), dxjh.c(fttVar45.aK()), dxjh.c(fttVar45.bT()), dxjh.c(fttVar45.eW.k()), fttVar45.as(), dxjh.c(fttVar45.cu()), fttVar45.vT(), fttVar45.eW.mj())));
        q.f(afid.SERVICE_RECOMMENDATION, new afic(ccfq.a, new ccfr(dxjh.c(this.a.vq()))));
        afid afidVar46 = afid.NOTIFICATION_SETTINGS;
        ftt fttVar46 = this.a;
        q.f(afidVar46, new afic(btbb.a, new btbc(dxjh.c(fttVar46.aV()), fttVar46.eW.ci(), fttVar46.eW.ax())));
        afid afidVar47 = afid.MANAGE_NETWORK_ACTION;
        ftt fttVar47 = this.a;
        q.f(afidVar47, new afic(btay.b, new btaz(fttVar47.ad(), dxjh.c(fttVar47.aV()))));
        afid afidVar48 = afid.SHOW_SEARCH_ALONG_ROUTE;
        ftt fttVar48 = this.a;
        q.f(afidVar48, new afic(bxey.b, new bxez(fttVar48.eW.R(), dxjh.c(fttVar48.bT()))));
        afid afidVar49 = afid.TRAFFIC_HUB;
        ftt fttVar49 = this.a;
        q.f(afidVar49, new afic(bynu.d, new bynv(fttVar49.ad(), fttVar49.eW.ax(), dxjh.c(fttVar49.cC()), fttVar49.eW.al(), fttVar49.eW.ci())));
        afid afidVar50 = afid.TRANSIT_STATION;
        ftt fttVar50 = this.a;
        q.f(afidVar50, new afic(bzgy.a, new bzgz(dxjh.c(fttVar50.H()), fttVar50.eW.al())));
        afid afidVar51 = afid.TRANSIT_COMMUTE_BOARD;
        ftt fttVar51 = this.a;
        q.f(afidVar51, new afic(bzgs.a, new bzgt(dxjh.c(fttVar51.H()), fttVar51.eW.ig())));
        q.f(afid.TRANSIT_SCHEMATIC_MAP, new afic(bzgv.c, new bzgw(dxjh.c(this.a.H()))));
        afid afidVar52 = afid.TRANSIT_GUIDANCE_QUESTIONS;
        ftt fttVar52 = this.a;
        dzsj dzsjVar8 = fttVar52.eO;
        if (dzsjVar8 == null) {
            dzsjVar8 = new fns(fttVar52, 1459);
            fttVar52.eO = dzsjVar8;
        }
        q.f(afidVar52, new afic(bzbk.a, new bzbl(dxjh.c(dzsjVar8))));
        afid afidVar53 = afid.TODO_PHOTO;
        ftt fttVar53 = this.a;
        q.f(afidVar53, new afic(ccft.a, new ccfu(fttVar53.ly(), dxjh.c(fttVar53.fD()), dxjh.c(fttVar53.M()), dxjh.c(fttVar53.cQ()))));
        q.f(afid.CONTRIBUTION_PAGE, new afic(ccel.d, this.a.vV()));
        afid afidVar54 = afid.EDIT_PUBLISHED;
        ftt fttVar54 = this.a;
        dzsj<gga> ad6 = fttVar54.ad();
        dzsj<bvjj> aw3 = fttVar54.eW.aw();
        dzsj c5 = dxjh.c(fttVar54.eW.ax());
        dzsj<begg> az = fttVar54.az();
        dzsj<cafi> aR = fttVar54.aR();
        dzsj<akfa> p = fttVar54.eW.p();
        dzsj<akdv> P2 = fttVar54.P();
        dzsj<bvrb> R3 = fttVar54.eW.R();
        dzsj dzsjVar9 = fttVar54.eP;
        if (dzsjVar9 == null) {
            dzsjVar9 = new fns(fttVar54, 1460);
            fttVar54.eP = dzsjVar9;
        }
        q.f(afidVar54, new afic(ccey.k, new ccez(ad6, aw3, c5, az, aR, p, P2, R3, dzsjVar9, fttVar54.eW.mR(), fttVar54.y())));
        afid afidVar55 = afid.UGC_INTERSTITIAL_WEB_VIEW;
        ftt fttVar55 = this.a;
        dzsj ai = fttVar55.ai();
        dzsj<btvo> V = fttVar55.eW.V();
        dzsj dzsjVar10 = fttVar55.eQ;
        if (dzsjVar10 == null) {
            dzsjVar10 = new fns(fttVar55, 1461);
            fttVar55.eQ = dzsjVar10;
        }
        dzsj dzsjVar11 = dzsjVar10;
        dzsj dzsjVar12 = fttVar55.eS;
        if (dzsjVar12 == null) {
            dzsjVar12 = new fns(fttVar55, 1462);
            fttVar55.eS = dzsjVar12;
        }
        q.f(afidVar55, new afic(ccga.a, new ccgb(ai, V, dzsjVar11, dzsjVar12, fttVar55.M(), fttVar55.cQ(), fttVar55.eW.ax())));
        afid afidVar56 = afid.LOCAL_GUIDE_SIGN_UP;
        ftt fttVar56 = this.a;
        q.f(afidVar56, new afic(ccfc.c, new ccfd(fttVar56.bb(), fttVar56.ad())));
        afid afidVar57 = afid.REVIEW;
        ftt fttVar57 = this.a;
        q.f(afidVar57, new afic(ccfn.a, new ccfo(dxjh.c(fttVar57.aJ()), dxjh.c(fttVar57.az()), dxjh.c(fttVar57.fr()), dxjh.c(fttVar57.eW.V()), dxjh.c(fttVar57.aR()), dxjh.c(fttVar57.M()), dxjh.c(fttVar57.cQ()), dxjh.c(fttVar57.eW.ax()))));
        q.f(afid.PHOTO_UPDATES, new afic(ccff.a, new ccfg(dxjh.c(this.a.oh()))));
        q.f(afid.DIDNT_GO_HERE, new afic(cceo.a, new ccep(this.a.ad())));
        q.f(afid.UGC_POST_TRIP_QUESTIONS, new afic(ccgd.a, new ccge(dxjh.c(this.a.tK()))));
        afid afidVar58 = afid.UGC_TASKS;
        ftt fttVar58 = this.a;
        q.f(afidVar58, new afic(ccgh.b, new ccgi(fttVar58.ad(), fttVar58.ly(), fttVar58.eW.al(), dxjh.c(fttVar58.gA()), dxjh.c(fttVar58.aV()))));
        q.f(afid.TODO_LIST, new afic(ccfx.j, this.a.vX()));
        afid afidVar59 = afid.CREATOR_PROFILE;
        ftt fttVar59 = this.a;
        dzsj<btvo> V2 = fttVar59.eW.V();
        dzsj<ceet> cN = fttVar59.cN();
        dzsj<cfrt> M = fttVar59.M();
        dzsj<chnm> cQ = fttVar59.cQ();
        dzsj<ccem> vW = fttVar59.vW();
        dzsj dzsjVar13 = fttVar59.eT;
        if (dzsjVar13 == null) {
            dzsjVar13 = new fns(fttVar59, 1465);
            fttVar59.eT = dzsjVar13;
        }
        q.f(afidVar59, new afic(ccfi.a, new ccfj(V2, cN, M, cQ, vW, dzsjVar13, fttVar59.fN(), fttVar59.eW.p(), fttVar59.eW.ax())));
        afid afidVar60 = afid.STREET_VIEW_ACTION;
        ftt fttVar60 = this.a;
        q.f(afidVar60, new afic(bwuh.a, new bwui(fttVar60.ad(), fttVar60.vH(), fttVar60.vI(), dxjh.c(fttVar60.da()), fttVar60.fN(), dxjh.c(fttVar60.cu()), fttVar60.vT())));
        afid afidVar61 = afid.VOICE_ACTION;
        ftt fttVar61 = this.a;
        dzsj<gga> ad7 = fttVar61.ad();
        dzsj<bvrb> R4 = fttVar61.eW.R();
        dzsj dzsjVar14 = fttVar61.eU;
        if (dzsjVar14 == null) {
            dzsjVar14 = new fns(fttVar61, 1466);
            fttVar61.eU = dzsjVar14;
        }
        q.f(afidVar61, new afic(ckrl.l, new ckrm(ad7, R4, dxjh.c(dzsjVar14), fttVar61.vI(), dxjh.c(fttVar61.eW.cB()), dxjh.c(fttVar61.eW.lm()), dxjh.c(fttVar61.eW.p()), dxjh.c(fttVar61.eW.at()))));
        afid afidVar62 = afid.ZERO_RATING_ACTIVATION;
        ftt fttVar62 = this.a;
        q.f(afidVar62, new afic(ckvw.b, new ckvx(fttVar62.vN(), fttVar62.ad(), fttVar62.eW.V(), dxjh.c(fttVar62.eW.at()))));
        return new affy(qF, q.b());
    }
}
