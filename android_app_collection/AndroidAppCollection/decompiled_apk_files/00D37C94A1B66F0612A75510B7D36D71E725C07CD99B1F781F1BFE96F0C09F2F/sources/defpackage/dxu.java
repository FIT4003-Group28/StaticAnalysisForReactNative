package defpackage;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.PowerManager;
import android.system.Os;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.application.backup.YouTubeBackupAgent;
import com.google.android.apps.youtube.app.extensions.appindexing.WatchVideoIndexer;
import com.google.android.apps.youtube.app.innertube.guide.impl.GuideControllerImpl$WatchWhileLifecycleObserver;
import com.google.android.apps.youtube.app.search.suggest.SuggestVideoStateSubscriber;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivityV2;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchHalfPlateV0Activity;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.g;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.i;
import com.google.android.libraries.elements.interfaces.JSModuleCache;
import com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate;
import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;
import com.google.android.libraries.youtube.mdx.smartremote.MdxSmartRemoteDialListener;
import com.google.android.libraries.youtube.offline.transfer.service.OfflineKeepAliveService;
import com.google.android.libraries.youtube.offline.transfer.service.OfflineTransferService;
import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import com.google.android.libraries.youtube.systemhealth.termination.NativeCrashDetector;
import com.google.android.libraries.youtube.systemhealth.termination.NativeCrashDetectorV2;
import com.google.apps.tiktok.concurrent.AndroidFuturesService;
import com.google.cardboard.sdk.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.security.Key;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;
import org.chromium.net.NetError;
import org.chromium.net.PrivateKeyType;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxu  reason: default package */
/* loaded from: classes3.dex */
public final class dxu implements azqb {
    private final dyo a;
    private final int b;

    public dxu(dyo dyoVar, int i) {
        this.a = dyoVar;
        this.b = i;
    }

    private final Object f() {
        int i = this.b;
        switch (i) {
            case 1300:
                return ooq.d(this.a.e());
            case 1301:
                dyo dyoVar = this.a;
                return new wzb((wkn) dyoVar.cY.get(), (snc) dyoVar.v.get(), (wxb) dyoVar.sp.get());
            case 1302:
                dyo dyoVar2 = this.a;
                return new wxb((wwm) dyoVar2.so.get(), (Executor) dyoVar2.aA.get());
            case 1303:
                return new wwm(this.a.b.a);
            case 1304:
                dyo dyoVar3 = this.a;
                return new xfc((xey) dyoVar3.sr.get(), (afvn) dyoVar3.au.get(), (Executor) dyoVar3.h.get(), (afzo) dyoVar3.sj.get());
            case 1305:
                dyo dyoVar4 = this.a;
                return sno.i((aacz) dyoVar4.D.get(), (afwu) dyoVar4.hL.get(), (afwu) dyoVar4.mu.get(), (snc) dyoVar4.v.get());
            case 1306:
                dyo dyoVar5 = this.a;
                return wms.b((wmd) dyoVar5.sx.get(), (wst) dyoVar5.sy.get(), (wrs) dyoVar5.sz.get(), (wmc) dyoVar5.sK.get(), (wtc) dyoVar5.sQ.get(), (wvg) dyoVar5.sS.get(), (wmw) dyoVar5.sT.get(), (wvi) dyoVar5.sV.get(), (wvj) dyoVar5.sW.get(), (wvl) dyoVar5.sX.get(), (wsj) dyoVar5.sA.get(), (wsn) dyoVar5.sC.get(), (wsl) dyoVar5.sB.get(), (wvm) dyoVar5.sY.get(), (wvn) dyoVar5.sZ.get(), (wvt) dyoVar5.ta.get(), (wtu) dyoVar5.tb.get(), (wtq) dyoVar5.tc.get(), (wst) dyoVar5.sF.get(), (aynx) dyoVar5.eR.get(), (aynx) dyoVar5.oE.get(), (airw) dyoVar5.fP.get());
            case 1307:
                dyo dyoVar6 = this.a;
                return oql.f((wwf) dyoVar6.rQ.get(), wmf.b(dyoVar6.K, (aiji) dyoVar6.lJ.get(), dyoVar6.sn, dyoVar6.su, dyoVar6.sJ));
            case 1308:
                dyo dyoVar7 = this.a;
                return oql.a((tjp) dyoVar7.sm.get(), wkk.b((wkl) dyoVar7.cZ.get()));
            case 1309:
                dyo dyoVar8 = this.a;
                return txr.f(dyoVar8.rT, dyoVar8.K, (wwf) dyoVar8.rQ.get(), (wtv) dyoVar8.sw.get(), (wtx) dyoVar8.sI.get());
            case 1310:
                dyo dyoVar9 = this.a;
                return wpp.d(dyoVar9.sr, dyoVar9.sv);
            case 1311:
                dyo dyoVar10 = this.a;
                wwf wwfVar = (wwf) dyoVar10.rQ.get();
                return i.g((afvn) dyoVar10.au.get(), (Executor) dyoVar10.h.get());
            case 1312:
                dyo dyoVar11 = this.a;
                return i.j((wli) dyoVar11.sH.get(), dyoVar11.hH(), (wwf) dyoVar11.rQ.get());
            case 1313:
                dyo dyoVar12 = this.a;
                return txr.c(dyoVar12.sj, dyoVar12.sq, dyoVar12.K, dyoVar12.sG, (wwf) dyoVar12.rQ.get());
            case 1314:
                return this.a.hH();
            case 1315:
                return wmx.t((wlg) this.a.sx.get());
            case 1316:
                return tfq.m();
            case 1317:
                return tfq.p();
            case 1318:
                return tfq.q();
            case 1319:
                return tfq.n();
            case 1320:
                return tfq.r();
            case 1321:
                return tfq.o();
            case 1322:
                return wsb.b();
            case 1323:
                return wsb.a();
            case 1324:
                return wsb.m();
            case 1325:
                return wmx.h((wlg) this.a.sx.get());
            case 1326:
                return wsb.n();
            case 1327:
                return wsb.c();
            case 1328:
                return wmx.w((wlg) this.a.sx.get());
            case 1329:
                return wsb.d();
            case 1330:
                return wsb.e();
            case 1331:
                return wsb.f();
            case 1332:
                return wsb.o();
            case 1333:
                return wsb.g();
            case 1334:
                return wsb.p();
            case 1335:
                return wsb.h();
            case 1336:
                dyo dyoVar13 = this.a;
                return sno.e((Executor) dyoVar13.h.get(), (abeb) dyoVar13.lM.get(), (abec) dyoVar13.lL.get(), (wwf) dyoVar13.rQ.get());
            case 1337:
                dyo dyoVar14 = this.a;
                return new wtc(dyoVar14.sL, dyoVar14.sM, dyoVar14.sP);
            case 1338:
                return new wth(this.a.y);
            case 1339:
                dyo dyoVar15 = this.a;
                return new wwd((wkn) dyoVar15.cY.get(), (wvw) dyoVar15.sO.get(), (aadd) dyoVar15.K.get());
            case 1340:
                dyo dyoVar16 = this.a;
                aadd aaddVar = (aadd) dyoVar16.K.get();
                return new wvw((wkn) dyoVar16.cY.get(), (wnb) dyoVar16.sN.get());
            case 1341:
                return wmx.d(this.a.hy);
            case 1342:
                dyo dyoVar17 = this.a;
                azqb azqbVar = dyoVar17.rT;
                azqb azqbVar2 = dyoVar17.y;
                azqb azqbVar3 = dyoVar17.sR;
                azqb azqbVar4 = dyoVar17.sx;
                wwf wwfVar2 = (wwf) dyoVar17.rQ.get();
                return new wvg(azqbVar, azqbVar2, azqbVar3, azqbVar4);
            case 1343:
                return tfq.k();
            case 1344:
                return wmx.a((yni) this.a.y.get());
            case 1345:
                dyo dyoVar18 = this.a;
                return i.l(dyoVar18.rT, (wwf) dyoVar18.rQ.get(), (wnj) dyoVar18.sU.get());
            case 1346:
                dyo dyoVar19 = this.a;
                return oql.g((aynx) dyoVar19.eR.get(), (wwf) dyoVar19.rQ.get());
            case 1347:
                return wmx.j(this.a.rT);
            case 1348:
                return wmx.k(this.a.rT);
            case 1349:
                return wmx.l(this.a.rT);
            case 1350:
                return wmx.m(this.a.rT);
            case 1351:
                dyo dyoVar20 = this.a;
                return new wvt(dyoVar20.rT, dyoVar20.rW);
            case 1352:
                dyo dyoVar21 = this.a;
                azqb azqbVar5 = dyoVar21.sP;
                azqb azqbVar6 = dyoVar21.sL;
                wwf wwfVar3 = (wwf) dyoVar21.rQ.get();
                return new wtq(azqbVar5, azqbVar6);
            case 1353:
                return new wne((airr) this.a.fO.get());
            case 1354:
                dyo dyoVar22 = this.a;
                return wjv.c(dyoVar22.sx, dyoVar22.sg, dyoVar22.se, dyoVar22.sD, dyoVar22.sE, dyoVar22.tf, (yni) dyoVar22.y.get(), (wwf) dyoVar22.rQ.get(), (aadd) dyoVar22.K.get());
            case 1355:
                dyo dyoVar23 = this.a;
                return wpp.e(dyoVar23.rT, (wwf) dyoVar23.rQ.get());
            case 1356:
                return wmx.c((wwf) this.a.rQ.get());
            case 1357:
                return wlw.b;
            case 1358:
                dyo dyoVar24 = this.a;
                return txr.e(dyoVar24.rT, dyoVar24.sk, dyoVar24.td, dyoVar24.tn, (Executor) dyoVar24.x.get());
            case 1359:
                dyo dyoVar25 = this.a;
                return sno.h(dyoVar25.b.a, (aizr) dyoVar25.tl.get(), (aizp) dyoVar25.tk.get(), (aynx) dyoVar25.tm.get());
            case 1360:
                dyo dyoVar26 = this.a;
                return wdw.c(dyoVar26.b.a, dyoVar26.tk, dyoVar26.kC, (aiix) dyoVar26.fH.get(), (Executor) dyoVar26.h.get(), (Executor) dyoVar26.x.get());
            case 1361:
                return wsb.k();
            case 1362:
                return aheb.E((aidn) this.a.eQ.get());
            case 1363:
                dyo dyoVar27 = this.a;
                return new wrd(dyoVar27.rT, dyoVar27.sk, dyoVar27.tg, dyoVar27.td, dyoVar27.se, dyoVar27.tp, (Executor) dyoVar27.x.get());
            case 1364:
                return new adwd(this.a.ki);
            case 1365:
                dyo dyoVar28 = this.a;
                return i.i(dyoVar28.rT, dyoVar28.tr, dyoVar28.st);
            case 1366:
                return new wvk(this.a.rT);
            case 1367:
                dyo dyoVar29 = this.a;
                azqb azqbVar7 = dyoVar29.K;
                azqb azqbVar8 = dyoVar29.se;
                azqb azqbVar9 = dyoVar29.td;
                azqb azqbVar10 = dyoVar29.rU;
                azqb azqbVar11 = dyoVar29.tt;
                azqb azqbVar12 = dyoVar29.sU;
                azqb azqbVar13 = dyoVar29.tv;
                azqb azqbVar14 = dyoVar29.rT;
                return new wrm(azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, azqbVar13, azqbVar14, azqbVar14, dyoVar29.tr, dyoVar29.tw, dyoVar29.st, dyoVar29.y, (Executor) dyoVar29.aA.get(), (Executor) dyoVar29.x.get(), (CopyOnWriteArrayList) dyoVar29.tx.get(), (wwf) dyoVar29.rQ.get(), dyoVar29.ty);
            case 1368:
                return wmx.e(this.a.hV);
            case 1369:
                dyo dyoVar30 = this.a;
                return new aggi(dyoVar30.tu, dyoVar30.gS);
            case 1370:
                dyo dyoVar31 = this.a;
                return oql.n(dyoVar31.lK, dyoVar31.v);
            case 1371:
                dyo dyoVar32 = this.a;
                azqb azqbVar15 = dyoVar32.rT;
                azqb azqbVar16 = dyoVar32.st;
                wwf wwfVar4 = (wwf) dyoVar32.rQ.get();
                return new wvp(azqbVar15, azqbVar16);
            case 1372:
                return tfq.i();
            case 1373:
                dyo dyoVar33 = this.a;
                aadd aaddVar2 = (aadd) dyoVar33.K.get();
                return i.f((Executor) dyoVar33.aA.get(), (Executor) dyoVar33.x.get());
            case 1374:
                return new ecl(this.a.rT);
            case 1375:
                dyo dyoVar34 = this.a;
                return new wrl(dyoVar34.rT, dyoVar34.td, dyoVar34.tB, dyoVar34.sH, dyoVar34.tC, dyoVar34.rN, (wwf) dyoVar34.rQ.get());
            case 1376:
                dyo dyoVar35 = this.a;
                return new wwh(dyoVar35.sv, dyoVar35.sH, dyoVar35.sr, (wwf) dyoVar35.rQ.get());
            case 1377:
                dyo dyoVar36 = this.a;
                return new edr(dyoVar36.rT, (udt) dyoVar36.tE.get(), null);
            case 1378:
                return new udt();
            case 1379:
                return wmx.g((amup) this.a.ud.get());
            case 1380:
                dyo dyoVar37 = this.a;
                azqb azqbVar17 = dyoVar37.tM;
                azqb azqbVar18 = dyoVar37.tN;
                azqb azqbVar19 = dyoVar37.tO;
                azqb azqbVar20 = dyoVar37.tP;
                azqb azqbVar21 = dyoVar37.tQ;
                azqb azqbVar22 = dyoVar37.tR;
                azqb azqbVar23 = dyoVar37.tZ;
                azqb azqbVar24 = dyoVar37.ua;
                azqb azqbVar25 = dyoVar37.ub;
                azqb azqbVar26 = dyoVar37.uc;
                amum h = amup.h();
                h.f(apcd.SLOT_TYPE_BELOW_PLAYER, azqbVar17);
                h.f(apcd.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, azqbVar18);
                h.f(apcd.SLOT_TYPE_FORECASTING, azqbVar19);
                h.f(apcd.SLOT_TYPE_IN_PLAYER, azqbVar20);
                h.f(apcd.SLOT_TYPE_LOCKSCREEN, azqbVar22);
                h.f(apcd.SLOT_TYPE_FIXED_FOOTER, azqbVar21);
                h.f(apcd.SLOT_TYPE_PLAYER_BYTES, azqbVar23);
                h.f(apcd.SLOT_TYPE_FULLSCREEN_ENGAGEMENT, azqbVar24);
                h.f(apcd.SLOT_TYPE_PLAYBACK_TRACKING, azqbVar25);
                h.f(apcd.SLOT_TYPE_SEQUENCE_ITEM_IN_PLAYER, azqbVar26);
                return h.b();
            case 1381:
                dyo dyoVar38 = this.a;
                return txr.d(dyoVar38.rT, dyoVar38.tK, (Executor) dyoVar38.h.get(), (Executor) dyoVar38.x.get(), (wwf) dyoVar38.rQ.get());
            case 1382:
                dyo dyoVar39 = this.a;
                wwf wwfVar5 = (wwf) dyoVar39.rQ.get();
                return new wvx((wnb) dyoVar39.sN.get(), (wvy) dyoVar39.tH.get(), (wwc) dyoVar39.tI.get(), (wvw) dyoVar39.sO.get(), (wwe) dyoVar39.tJ.get());
            case 1383:
                return wsb.i();
            case 1384:
                dyo dyoVar40 = this.a;
                return wpp.f((aadd) dyoVar40.K.get(), (wvw) dyoVar40.sO.get());
            case 1385:
                dyo dyoVar41 = this.a;
                return wze.b((aadd) dyoVar41.K.get(), (snc) dyoVar41.v.get(), (wkl) dyoVar41.cZ.get());
            case 1386:
                dyo dyoVar42 = this.a;
                wkn wknVar = (wkn) dyoVar42.cY.get();
                aadd aaddVar3 = (aadd) dyoVar42.K.get();
                snc sncVar = (snc) dyoVar42.v.get();
                acrr acrrVar = (acrr) dyoVar42.aw.get();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) dyoVar42.h.get();
                Context context = dyoVar42.b.a;
                return new xir(wknVar, aaddVar3, sncVar, acrrVar, scheduledExecutorService, (wwe) dyoVar42.tJ.get());
            case 1387:
                dyo dyoVar43 = this.a;
                return new edg(dyoVar43.rT, dyoVar43.tK, (Executor) dyoVar43.h.get(), (Executor) dyoVar43.x.get(), 2, null);
            case 1388:
                dyo dyoVar44 = this.a;
                aadd aaddVar4 = (aadd) dyoVar44.K.get();
                azqb azqbVar27 = dyoVar44.tK;
                Executor executor = (Executor) dyoVar44.h.get();
                Executor executor2 = (Executor) dyoVar44.x.get();
                return wjs.d(dyoVar44.rT, (wnb) dyoVar44.sN.get(), azqbVar27, (snc) dyoVar44.v.get());
            case 1389:
                dyo dyoVar45 = this.a;
                return wpp.b(dyoVar45.rT, dyoVar45.tK);
            case 1390:
                dyo dyoVar46 = this.a;
                return new wpo(dyoVar46.rT, dyoVar46.tK, 1);
            case 1391:
                dyo dyoVar47 = this.a;
                return wpp.o(dyoVar47.rT, dyoVar47.tK);
            case 1392:
                dyo dyoVar48 = this.a;
                return new aggm(dyoVar48.cY, dyoVar48.tU, dyoVar48.f15if, dyoVar48.rT, dyoVar48.tK, dyoVar48.tW, dyoVar48.sV, dyoVar48.K, dyoVar48.tX, dyoVar48.tc, dyoVar48.tY, dyoVar48.lK, dyoVar48.hL, dyoVar48.sj, dyoVar48.jg, dyoVar48.v, dyoVar48.la, (Executor) dyoVar48.x.get(), (Executor) dyoVar48.Q.get());
            case 1393:
                dyo dyoVar49 = this.a;
                return sno.d(dyoVar49.lK, dyoVar49.tS, (aasu) dyoVar49.tT.get(), (yni) dyoVar49.y.get());
            case 1394:
                return wsb.j();
            case 1395:
                dyo dyoVar50 = this.a;
                return new aasu((aaqj) dyoVar50.er.get(), (aaqf) dyoVar50.eV.get(), (afvn) dyoVar50.au.get(), (yqw) dyoVar50.fD.get(), (snc) dyoVar50.v.get());
            case 1396:
                dyo dyoVar51 = this.a;
                return txr.h((snc) dyoVar51.v.get(), (wnb) dyoVar51.sN.get(), (wmu) dyoVar51.tV.get(), dyoVar51.jg, (wwf) dyoVar51.rQ.get());
            case 1397:
                return ooq.j((aaqp) this.a.ih.get());
            case 1398:
                dyo dyoVar52 = this.a;
                return new wtg(dyoVar52.sL, dyoVar52.sP);
            case 1399:
                return new aggh(this.a.gS);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        int i = this.b;
        switch (i) {
            case 1400:
                dyo dyoVar = this.a;
                return new edg(dyoVar.rT, dyoVar.tK, (Executor) dyoVar.x.get(), (Executor) dyoVar.h.get(), 1);
            case 1401:
                dyo dyoVar2 = this.a;
                azqb azqbVar = dyoVar2.rT;
                azqb azqbVar2 = dyoVar2.tK;
                Executor executor = (Executor) dyoVar2.h.get();
                Executor executor2 = (Executor) dyoVar2.x.get();
                return new wpo(azqbVar, azqbVar2, 3, null);
            case 1402:
                dyo dyoVar3 = this.a;
                return new edg(dyoVar3.rT, dyoVar3.tK, (Executor) dyoVar3.x.get(), (Executor) dyoVar3.h.get());
            case 1403:
                dyo dyoVar4 = this.a;
                azqb azqbVar3 = dyoVar4.sJ;
                azqb azqbVar4 = dyoVar4.rW;
                azqb azqbVar5 = dyoVar4.sS;
                azqb azqbVar6 = dyoVar4.sX;
                azqb azqbVar7 = dyoVar4.sY;
                azqb azqbVar8 = dyoVar4.sZ;
                azqb azqbVar9 = dyoVar4.ta;
                azqb azqbVar10 = dyoVar4.rV;
                azqb azqbVar11 = dyoVar4.sV;
                azqb azqbVar12 = dyoVar4.sW;
                azqb azqbVar13 = dyoVar4.tr;
                azqb azqbVar14 = dyoVar4.tw;
                azqb azqbVar15 = dyoVar4.uf;
                azqb azqbVar16 = dyoVar4.ug;
                azqb azqbVar17 = dyoVar4.tf;
                HashMap hashMap = new HashMap();
                vzx.d(hashMap, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, azqbVar13, azqbVar14, azqbVar15, azqbVar17);
                hashMap.put(apcf.TRIGGER_TYPE_REEL_ITEM_SEQUENCE_ABANDONED, azqbVar16);
                hashMap.put(apcf.TRIGGER_TYPE_SEQUENCE_ITEM_IN_PLAYER_SPACE_AVAILABLE, azqbVar16);
                hashMap.put(apcf.TRIGGER_TYPE_SEQUENCE_ITEM_IN_PLAYER_SPACE_UNAVAILABLE, azqbVar16);
                return hashMap;
            case 1404:
                dyo dyoVar5 = this.a;
                azqb azqbVar18 = dyoVar5.rT;
                azqb azqbVar19 = dyoVar5.ue;
                azqb azqbVar20 = dyoVar5.rW;
                aadd aaddVar = (aadd) dyoVar5.K.get();
                return txr.g(azqbVar18, azqbVar19, azqbVar20, (wwf) dyoVar5.rQ.get());
            case 1405:
                return wmx.f((wwf) this.a.rQ.get());
            case 1406:
                dyo dyoVar6 = this.a;
                return new edv(dyoVar6.rT, (edd) dyoVar6.rS.get());
            case 1407:
                amvn w = amvn.w(apcd.SLOT_TYPE_PLAYER_BYTES, apcd.SLOT_TYPE_BELOW_PLAYER, apcd.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, apcd.SLOT_TYPE_IN_PLAYER, apcd.SLOT_TYPE_LOCKSCREEN, apcd.SLOT_TYPE_FIXED_FOOTER, apcd.SLOT_TYPE_FORECASTING, apcd.SLOT_TYPE_FULLSCREEN_ENGAGEMENT, apcd.SLOT_TYPE_IN_FEED, apcd.SLOT_TYPE_ABOVE_FEED, apcd.SLOT_TYPE_PAGE_TOP, apcd.SLOT_TYPE_PLAYBACK_TRACKING, apcd.SLOT_TYPE_SEQUENCE_ITEM_IN_PLAYER);
                axzl.o(w);
                return w;
            case 1408:
                dyo dyoVar7 = this.a;
                return new edu(dyoVar7.sL, dyoVar7.sP);
            case 1409:
                dyo dyoVar8 = this.a;
                return wdw.b((wmd) dyoVar8.sx.get(), (wna) dyoVar8.sH.get(), (wve) dyoVar8.rW.get(), (wtj) dyoVar8.uj.get(), (wte) dyoVar8.uk.get(), (wvu) dyoVar8.tf.get());
            case 1410:
                dyo dyoVar9 = this.a;
                return new wtj(dyoVar9.sL, (wle) dyoVar9.sK.get(), dyoVar9.tw, dyoVar9.sP, (amvn) dyoVar9.uh.get(), (aadd) dyoVar9.K.get(), (aacz) dyoVar9.D.get(), dyoVar9.ui);
            case 1411:
                dyo dyoVar10 = this.a;
                return sno.f(dyoVar10.sP, dyoVar10.sL, dyoVar10.rW, (Executor) dyoVar10.x.get());
            case 1412:
                dyo dyoVar11 = this.a;
                return sno.g(dyoVar11.sL, dyoVar11.sP, (amvn) dyoVar11.uh.get(), (aadd) dyoVar11.K.get());
            case 1413:
                dyo dyoVar12 = this.a;
                return txr.b((wmd) dyoVar12.sx.get(), (wna) dyoVar12.sH.get(), (wve) dyoVar12.rW.get(), (wtj) dyoVar12.uj.get(), (wvu) dyoVar12.tf.get());
            case 1414:
                dyo dyoVar13 = this.a;
                return new ecs((edd) dyoVar13.rS.get(), dyoVar13.sP, dyoVar13.tK, dyoVar13.rT, dyoVar13.tg, dyoVar13.uo, (Executor) dyoVar13.x.get());
            case 1415:
                dyo dyoVar14 = this.a;
                return new ect(dyoVar14.td, dyoVar14.sH, dyoVar14.tC, (wwf) dyoVar14.rQ.get());
            case 1416:
                dyo dyoVar15 = this.a;
                return acrd.c((xir) dyoVar15.tL.get(), (wwf) dyoVar15.rQ.get(), dyoVar15.hW(), dyoVar15.hX(), dyoVar15.hU(), dyoVar15.hV(), dyoVar15.hR(), (Set) dyoVar15.ul.get(), (Set) dyoVar15.um.get(), dyoVar15.hS());
            case 1417:
                dyo dyoVar16 = this.a;
                return new lbl(dyoVar16.uz, dyoVar16.uA, (afvn) dyoVar16.au.get());
            case 1418:
                dyo dyoVar17 = this.a;
                aadd aaddVar2 = (aadd) dyoVar17.K.get();
                aacz aaczVar = (aacz) dyoVar17.D.get();
                return egd.O(aaddVar2, (SharedPreferences) dyoVar17.t.get(), (akhv) dyoVar17.uu.get(), dyoVar17.b.a, (afvn) dyoVar17.au.get(), (vzm) dyoVar17.dh.get(), (ScheduledExecutorService) dyoVar17.h.get(), (snc) dyoVar17.v.get(), (lbe) dyoVar17.uv.get(), (akhf) dyoVar17.oq.get(), (akhi) dyoVar17.or.get(), (akgp) dyoVar17.uw.get(), dyoVar17.fE(), (akhn) dyoVar17.ux.get(), (lbf) dyoVar17.uy.get());
            case 1419:
                dyo dyoVar18 = this.a;
                return egd.t((yqw) dyoVar18.ut.get(), (akid) dyoVar18.os.get(), (snc) dyoVar18.v.get());
            case 1420:
                dyo dyoVar19 = this.a;
                yqw b = ((yqy) dyoVar19.fx.get()).b(new cfh(), yqx.a((yqj) dyoVar19.fy.get(), null), anjk.a, null, "suggest");
                axzl.o(b);
                return b;
            case 1421:
                return this.a.ak();
            case 1422:
                return new akgp(this.a.b.a);
            case 1423:
                dyo dyoVar20 = this.a;
                return new akhc((akgt) dyoVar20.mB.get(), new akhd((akhv) dyoVar20.uu.get()), new akgy((akgt) dyoVar20.mB.get(), (akgx) dyoVar20.mC.get()), (ScheduledExecutorService) dyoVar20.h.get());
            case 1424:
                return egd.r();
            case 1425:
                return this.a.al();
            case 1426:
                dyo dyoVar21 = this.a;
                aadd aaddVar3 = (aadd) dyoVar21.K.get();
                aacz aaczVar2 = (aacz) dyoVar21.D.get();
                return egd.P(aaddVar3, (SharedPreferences) dyoVar21.t.get(), (akhv) dyoVar21.uu.get(), dyoVar21.b.a, (afvn) dyoVar21.au.get(), (vzm) dyoVar21.dh.get(), (ScheduledExecutorService) dyoVar21.h.get(), (snc) dyoVar21.v.get(), (lbe) dyoVar21.uv.get(), (akhf) dyoVar21.oq.get(), (akhi) dyoVar21.or.get(), dyoVar21.fE(), (akhn) dyoVar21.ux.get(), (lbf) dyoVar21.uy.get());
            case 1427:
                qrq qrqVar = qrq.a;
                axzl.o(qrqVar);
                return qrqVar;
            case 1428:
                dyo dyoVar22 = this.a;
                return new acxc((acxr) dyoVar22.mA.get(), dyoVar22.ai);
            case 1429:
                dyo dyoVar23 = this.a;
                uiy uiyVar = new uiy();
                uiyVar.a = (uiz) dyoVar23.rn.get();
                return uiyVar;
            case 1430:
                dyo dyoVar24 = this.a;
                return new ujp((uhh) dyoVar24.qR.get(), (ude) dyoVar24.qP.get(), (ucs) dyoVar24.qb.get(), (ufe) dyoVar24.rb.get(), (ues) dyoVar24.qC.get());
            case 1431:
                dyo dyoVar25 = this.a;
                ugx ugxVar = (ugx) dyoVar25.qY.get();
                ucs ucsVar = (ucs) dyoVar25.qb.get();
                return new ujr();
            case 1432:
                dyo dyoVar26 = this.a;
                axot.a(dyoVar26.rb);
                ueo ueoVar = (ueo) dyoVar26.qf.get();
                ude udeVar = (ude) dyoVar26.qP.get();
                uib uibVar = (uib) dyoVar26.rm.get();
                ues uesVar = (ues) dyoVar26.qC.get();
                dyoVar26.au();
                return new uid();
            case 1433:
                dyo dyoVar27 = this.a;
                return new udx(axot.a(dyoVar27.qB), axot.a(dyoVar27.qP), axot.a(dyoVar27.qb), axot.a(dyoVar27.rb), axot.a(axpa.a));
            case 1434:
                return new udy();
            case 1435:
                return this.a.aA();
            case 1436:
                dyo dyoVar28 = this.a;
                return new udp((ues) dyoVar28.qC.get(), (uiy) dyoVar28.uD.get(), 1);
            case 1437:
                dyo dyoVar29 = this.a;
                return new udm((udo) dyoVar29.uF.get(), (ufe) dyoVar29.rb.get(), (ugx) dyoVar29.qY.get(), (ues) dyoVar29.qC.get(), (uiy) dyoVar29.uD.get(), (ucs) dyoVar29.qb.get(), (uen) dyoVar29.rp.get(), (uhh) dyoVar29.qR.get(), axot.a(axpa.a), dyoVar29.au());
            case 1438:
                dyo dyoVar30 = this.a;
                return new udo((ucs) dyoVar30.qb.get(), (uhz) dyoVar30.ql.get());
            case 1439:
                dyo dyoVar31 = this.a;
                return new udp((uiy) dyoVar31.uD.get(), (ues) dyoVar31.qC.get());
            case 1440:
                dyo dyoVar32 = this.a;
                return new udq((ucj) dyoVar32.qc.get(), (uiy) dyoVar32.uD.get(), (ujo) dyoVar32.uE.get(), dyoVar32.aK(), (ujk) dyoVar32.qg.get(), amyg.a, (ues) dyoVar32.qC.get(), (ufa) dyoVar32.uG.get());
            case 1441:
                dyo dyoVar33 = this.a;
                return new ufb((ujk) dyoVar33.qg.get(), (ucs) dyoVar33.qb.get(), (udc) dyoVar33.rc.get(), (ues) dyoVar33.qC.get(), amyg.a);
            case 1442:
                dyo dyoVar34 = this.a;
                return new udv((ufe) dyoVar34.rb.get(), (ucs) dyoVar34.qb.get(), (ude) dyoVar34.qP.get(), amyg.a);
            case 1443:
                dyo dyoVar35 = this.a;
                return new udp((uiy) dyoVar35.uD.get(), (ues) dyoVar35.qC.get(), 2);
            case 1444:
                dyo dyoVar36 = this.a;
                return new ahkv(dyoVar36.b.a, (yni) dyoVar36.y.get(), (aijf) dyoVar36.gH.get(), (afio) dyoVar36.hR.get(), (afiy) dyoVar36.hS.get(), dyoVar36.uH, (axdi) dyoVar36.hw.get());
            case 1445:
                return new ahjr(this.a.b.a);
            case 1446:
                dyo dyoVar37 = this.a;
                return new ajot(dyoVar37.ko, new ajnp(axot.a(dyoVar37.cT)), ampq.j(dyoVar37.kx), amon.a);
            case 1447:
                return new amhc(this.a.uJ);
            case 1448:
                return new dxt(this.a);
            case 1449:
                return this.a.dQ();
            case 1450:
                return new aikf(this.a.b.a);
            case 1451:
                return new ajft((ScheduledExecutorService) this.a.h.get());
            case 1452:
                dyo dyoVar38 = this.a;
                return ainr.d((aaqj) dyoVar38.er.get(), (aaqf) dyoVar38.eV.get(), (afvn) dyoVar38.au.get(), (yqw) dyoVar38.fD.get());
            case 1453:
                return ahdx.K((aidn) this.a.eQ.get());
            case 1454:
                return zie.a();
            case 1455:
                dyo dyoVar39 = this.a;
                ajba h = abgl.h(axot.a(dyoVar39.fO), (aant) dyoVar39.fU.get(), (snc) dyoVar39.v.get(), (aynx) dyoVar39.oE.get(), (aacz) dyoVar39.D.get());
                h.w();
                return h;
            case 1456:
                return aheb.b(this.a.b.a);
            case 1457:
                return new ainx();
            case 1458:
                dyo dyoVar40 = this.a;
                return wtk.c(dyoVar40.b.a, (aizp) dyoVar40.jI.get(), (aizn) dyoVar40.jA.get(), (airw) dyoVar40.fP.get(), ahef.c(dyoVar40.b.a, dyoVar40.uU, (aizp) dyoVar40.jI.get(), (ahfm) dyoVar40.bd.get(), dyoVar40.jE), (ainq) dyoVar40.uV.get(), (snc) dyoVar40.v.get(), (aioe) dyoVar40.uX.get(), (List) dyoVar40.vg.get());
            case 1459:
                return this.a.g();
            case 1460:
                dyo dyoVar41 = this.a;
                return new ainq(dyoVar41.mf, (aacz) dyoVar41.D.get(), (ainx) dyoVar41.uT.get(), dyoVar41.jD);
            case 1461:
                dyo dyoVar42 = this.a;
                return new aiog(dyoVar42.cI(), (airw) dyoVar42.fP.get(), (aynx) dyoVar42.uW.get());
            case 1462:
                return afku.f();
            case 1463:
                return this.a.hE();
            case 1464:
                return ahdx.e((aiob) this.a.uY.get());
            case 1465:
                dyo dyoVar43 = this.a;
                return ahed.j((aizp) dyoVar43.jI.get(), (aizn) dyoVar43.jA.get());
            case 1466:
                return ahdx.d((ainz) this.a.va.get());
            case 1467:
                dyo dyoVar44 = this.a;
                return ahed.i((aizp) dyoVar44.jI.get(), (aizn) dyoVar44.jA.get());
            case 1468:
                return ahdx.i((aiob) this.a.vc.get());
            case 1469:
                dyo dyoVar45 = this.a;
                return ahed.x((aizp) dyoVar45.jI.get(), (aizn) dyoVar45.jA.get());
            case 1470:
                return ahdx.c((ainp) this.a.ve.get());
            case 1471:
                return aheb.h((aizn) this.a.jA.get());
            case 1472:
                dyo dyoVar46 = this.a;
                return new aiiv((yni) dyoVar46.y.get(), (aynx) dyoVar46.tm.get(), (aijh) dyoVar46.sl.get(), (aiqo) dyoVar46.vi.get(), (aynx) dyoVar46.vj.get(), (aynx) dyoVar46.vk.get());
            case 1473:
                return ahdx.I((aidn) this.a.eQ.get());
            case 1474:
                return ahdx.L((aidn) this.a.eQ.get());
            case 1475:
                return ahdx.M((aidn) this.a.eQ.get());
            case 1476:
                dyo dyoVar47 = this.a;
                yrj yrjVar = (yrj) dyoVar47.as.get();
                wzz wzzVar = (wzz) dyoVar47.vm.get();
                whp whpVar = (whp) dyoVar47.df.get();
                wpu wpuVar = (wpu) dyoVar47.vn.get();
                return new vyx((wge) dyoVar47.mH.get(), (yni) dyoVar47.y.get(), (afvn) dyoVar47.au.get(), wgq.a);
            case 1477:
                return new wzz();
            case 1478:
                return new wpu();
            case 1479:
                return new aiow((yve) this.a.vp.get());
            case 1480:
                dyo dyoVar48 = this.a;
                Context context = dyoVar48.b.a;
                azqb azqbVar21 = dyoVar48.j;
                vjf a = vjg.a(context);
                a.e("player");
                a.f("playability_settings.pb");
                Uri a2 = a.a();
                yvh d = yvi.d(dyoVar48.t, (ankw) dyoVar48.h.get());
                d.a = zto.p;
                d.b(aihl.g);
                d.b = aihl.f;
                d.c = agvc.l;
                yvi a3 = d.a();
                vli a4 = vlj.a();
                a4.e(awvh.a);
                a4.f(a2);
                a4.b(a3);
                return new yvc(vmu.b(((vlk) azqbVar21.get()).a(a4.a())), awvh.a);
            case 1481:
                dyo dyoVar49 = this.a;
                return ahed.e((acvh) dyoVar49.ef.get(), (aiix) dyoVar49.fH.get());
            case 1482:
                dyo dyoVar50 = this.a;
                return ahed.d((acvh) dyoVar50.ef.get(), (aiix) dyoVar50.fH.get());
            case 1483:
                return tjk.d(this.a.b.a);
            case 1484:
                return new ajav();
            case 1485:
                yve b2 = eon.b(this.a.vv);
                axzl.o(b2);
                return b2;
            case 1486:
                dyo dyoVar51 = this.a;
                Context context2 = dyoVar51.b.a;
                ankw ankwVar = (ankw) dyoVar51.h.get();
                vlk vlkVar = (vlk) dyoVar51.j.get();
                final eoj eojVar = (eoj) dyoVar51.gX();
                return ((yke) dyoVar51.p.get()).a(ymf.d(context2, dyo.jp(), ankwVar, vlkVar, eon.a, eog.a(context2), eof.a, new vlp() { // from class: eok
                    @Override // defpackage.vlp
                    public final aoqu a(vlq vlqVar, aoqu aoquVar) {
                        final eoj eojVar2 = eoj.this;
                        eof eofVar = (eof) aoquVar;
                        fdd fddVar = new fdd(vlqVar, 1);
                        final eol eolVar = new eol(vlqVar);
                        final fdi fdiVar = new fdi(vlqVar, 1);
                        amum amumVar = new amum();
                        amumVar.f(eog.SHOW_BACKGROUND_PLAYBACK_SETTINGS_DIALOG, new fdf(fdiVar, fddVar, 1));
                        amumVar.f(eog.BACKGROUND_AUDIO_POLICY, new zdq() { // from class: eom
                            @Override // defpackage.zdq
                            public final void a(Object obj, Object obj2) {
                                ampt amptVar = ampt.this;
                                eoj eojVar3 = eojVar2;
                                eol eolVar2 = eolVar;
                                String str = (String) obj;
                                amvn amvnVar = eon.a;
                                if (amptVar.a(str)) {
                                    eoe a5 = eojVar3.a(eolVar2.a.d(str, null));
                                    aopa aopaVar = (aopa) obj2;
                                    aopaVar.copyOnWrite();
                                    eof eofVar2 = (eof) aopaVar.instance;
                                    eof eofVar3 = eof.a;
                                    eofVar2.c = a5.e;
                                    eofVar2.b |= 1;
                                }
                            }
                        });
                        amvn amvnVar = eon.a;
                        aopa createBuilder = eof.a.createBuilder();
                        ymf.g(amvnVar, createBuilder, amumVar.b());
                        return (eof) createBuilder.mo39build();
                    }
                }), eof.a);
            case 1487:
                return this.a.s();
            case 1488:
                return azpd.ar().ax();
            case 1489:
                return azpd.ar().ax();
            case 1490:
                dyo dyoVar52 = this.a;
                final eob eobVar = new eob((aino) dyoVar52.uZ.get(), (aino) dyoVar52.vb.get(), (aino) dyoVar52.vd.get(), (aino) dyoVar52.vf.get(), new eoc((aizn) dyoVar52.jA.get()), new eod((aizn) dyoVar52.jA.get()));
                final axnm a5 = axot.a(dyoVar52.vh);
                ((airw) dyoVar52.fP.get()).ae(egf.o, egf.p).H().G(aypa.a()).aa(new ayqb() { // from class: eoa
                    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
                    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
                    @Override // defpackage.ayqb
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void a(java.lang.Object r7) {
                        /*
                            r6 = this;
                            eob r0 = defpackage.eob.this
                            axnm r1 = r2
                            ahhg r7 = (defpackage.ahhg) r7
                            java.lang.Object r1 = r1.get()
                            ainw r1 = (defpackage.ainw) r1
                            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r7 = r7.a()
                            asaa r7 = r7.t()
                            int r2 = r7.b
                            r2 = r2 & 1024(0x400, float:1.435E-42)
                            if (r2 == 0) goto L3c
                            arzr r7 = r7.j
                            if (r7 != 0) goto L20
                            arzr r7 = defpackage.arzr.a
                        L20:
                            int r2 = r7.b
                            r3 = 64657230(0x3da974e, float:1.2847626E-36)
                            if (r2 != r3) goto L3c
                            java.lang.Object r7 = r7.c
                            apkl r7 = (defpackage.apkl) r7
                            int r2 = r7.b
                            r2 = r2 & 4
                            if (r2 == 0) goto L3c
                            apkj r7 = r7.e
                            if (r7 != 0) goto L37
                            apkj r7 = defpackage.apkj.b
                        L37:
                            ampq r7 = defpackage.ampq.j(r7)
                            goto L3e
                        L3c:
                            amon r7 = defpackage.amon.a
                        L3e:
                            boolean r2 = r7.h()
                            if (r2 != 0) goto L48
                            r1.e()
                            return
                        L48:
                            java.lang.Object r7 = r7.c()
                            apkj r7 = (defpackage.apkj) r7
                            aops r2 = new aops
                            aopq r3 = r7.d
                            aopr r4 = defpackage.apkj.a
                            r2.<init>(r3, r4)
                            boolean r3 = r2.isEmpty()
                            if (r3 != 0) goto Le0
                            java.util.ArrayList r3 = new java.util.ArrayList
                            r3.<init>()
                            java.util.Iterator r2 = r2.iterator()
                        L66:
                            boolean r4 = r2.hasNext()
                            if (r4 == 0) goto Lba
                            java.lang.Object r4 = r2.next()
                            apkc r4 = (defpackage.apkc) r4
                            apkc r5 = defpackage.apkc.BACKGROUND_PLAYBACK_BUTTON_TYPE_UNKNOWN
                            int r4 = r4.ordinal()
                            switch(r4) {
                                case 0: goto La8;
                                case 1: goto La1;
                                case 2: goto L9a;
                                case 3: goto L93;
                                case 4: goto L8c;
                                case 5: goto L85;
                                case 6: goto L7e;
                                default: goto L7b;
                            }
                        L7b:
                            amon r4 = defpackage.amon.a
                            goto Laa
                        L7e:
                            eod r4 = r0.f
                            ampq r4 = defpackage.ampq.j(r4)
                            goto Laa
                        L85:
                            eoc r4 = r0.e
                            ampq r4 = defpackage.ampq.j(r4)
                            goto Laa
                        L8c:
                            aino r4 = r0.d
                            ampq r4 = defpackage.ampq.j(r4)
                            goto Laa
                        L93:
                            aino r4 = r0.c
                            ampq r4 = defpackage.ampq.j(r4)
                            goto Laa
                        L9a:
                            aino r4 = r0.a
                            ampq r4 = defpackage.ampq.j(r4)
                            goto Laa
                        La1:
                            aino r4 = r0.b
                            ampq r4 = defpackage.ampq.j(r4)
                            goto Laa
                        La8:
                            amon r4 = defpackage.amon.a
                        Laa:
                            boolean r5 = r4.h()
                            if (r5 == 0) goto L66
                            java.lang.Object r4 = r4.c()
                            aino r4 = (defpackage.aino) r4
                            r3.add(r4)
                            goto L66
                        Lba:
                            r1.f(r3)
                            int r1 = r7.c
                            r1 = r1 & 1
                            if (r1 == 0) goto Lce
                            eoc r1 = r0.e
                            int r2 = r7.e
                            long r2 = (long) r2
                            j$.time.Duration r2 = j$.time.Duration.ofSeconds(r2)
                            r1.a = r2
                        Lce:
                            int r1 = r7.c
                            r1 = r1 & 2
                            if (r1 == 0) goto Ldf
                            eod r0 = r0.f
                            int r7 = r7.f
                            long r1 = (long) r7
                            j$.time.Duration r7 = j$.time.Duration.ofSeconds(r1)
                            r0.a = r7
                        Ldf:
                            return
                        Le0:
                            r1.e()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.eoa.a(java.lang.Object):void");
                    }
                }, dzq.g);
                return eobVar;
            case 1491:
                return new ajfm(this.a.hT());
            case 1492:
                return new ajas();
            case 1493:
                bame av = ((aidn) this.a.eQ.get()).a.av();
                axzl.o(av);
                return av;
            case 1494:
                bame aw = ((aidn) this.a.eQ.get()).a.aw();
                axzl.o(aw);
                return aw;
            case 1495:
                bame at = ((aidn) this.a.eQ.get()).a.at();
                axzl.o(at);
                return at;
            case 1496:
                bame au = ((aidn) this.a.eQ.get()).a.au();
                axzl.o(au);
                return au;
            case 1497:
                dyo dyoVar53 = this.a;
                return new aizr(dyoVar53.b.a, dyoVar53.jI, dyoVar53.kC, (aiix) dyoVar53.fH.get(), (Executor) dyoVar53.h.get(), (Executor) dyoVar53.x.get());
            case 1498:
                return new fgj();
            case 1499:
                dyo dyoVar54 = this.a;
                aadd aaddVar4 = (aadd) dyoVar54.K.get();
                return new axxq((aacz) dyoVar54.D.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        int i = this.b;
        switch (i) {
            case 200:
                uzp uzpVar = new uzp();
                uzpVar.a = 10;
                uzpVar.b = true;
                uzpVar.d = new vsr();
                uzpVar.c = 2;
                Integer num = uzpVar.a;
                if (num != null && uzpVar.d != null && uzpVar.b != null) {
                    return new uzq(num.intValue(), uzpVar.d, uzpVar.b.booleanValue(), null, null);
                }
                StringBuilder sb = new StringBuilder();
                if (uzpVar.c == 0) {
                    sb.append(" enablement");
                }
                if (uzpVar.a == null) {
                    sb.append(" rateLimitPerSecond");
                }
                if (uzpVar.d == null) {
                    sb.append(" dynamicSampler");
                }
                if (uzpVar.b == null) {
                    sb.append(" recordTimerDuration");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            case 201:
                uzs c = uzt.c();
                c.b(false);
                return c.a();
            case 202:
                return axwl.a.get().a(this.a.b.a);
            case 203:
                dyo dyoVar = this.a;
                uvn aQ = dyoVar.aQ();
                Executor executor = (Executor) dyoVar.bD.get();
                return new uzo(aQ, axot.a(dyoVar.cl), dyoVar.cm, dyoVar.aW());
            case 204:
                uzl uzlVar = (uzl) ((azqb) ampq.j(this.a.ch).e(usw.b)).get();
                axzl.o(uzlVar);
                return uzlVar;
            case 205:
                return axwi.a.get().a(this.a.b.a);
            case 206:
                uzo uzoVar = (uzo) this.a.cn.get();
                return new uzm(amon.a);
            case 207:
                dyo dyoVar2 = this.a;
                uvn aQ2 = dyoVar2.aQ();
                snc sncVar = (snc) dyoVar2.bE.get();
                return new uxu(aQ2, dyoVar2.b.a, (uxt) dyoVar2.co.get(), (ankx) dyoVar2.bA.get(), axot.a(dyoVar2.cp), new uxy(dyoVar2.cp, dyoVar2.b.a), (uto) dyoVar2.bx.get(), dyoVar2.cq, (Executor) dyoVar2.bD.get());
            case 208:
                dyo dyoVar3 = this.a;
                return new uxt((uui) dyoVar3.bC.get(), (ankx) dyoVar3.bA.get());
            case 209:
                uxk uxkVar = new uxk(null);
                uxkVar.a = 3;
                uxkVar.b = false;
                uxkVar.c = amon.a;
                uxkVar.d = false;
                uxkVar.f = true;
                uxkVar.e = false;
                uxkVar.g = 2;
                Integer num2 = uxkVar.a;
                if (num2 != null && uxkVar.b != null && uxkVar.d != null && uxkVar.e != null && uxkVar.f != null) {
                    return new uxl(num2.intValue(), uxkVar.b.booleanValue(), uxkVar.c, uxkVar.d.booleanValue(), uxkVar.e.booleanValue(), uxkVar.f.booleanValue());
                }
                StringBuilder sb3 = new StringBuilder();
                if (uxkVar.g == 0) {
                    sb3.append(" enablement");
                }
                if (uxkVar.a == null) {
                    sb3.append(" rateLimitPerSecond");
                }
                if (uxkVar.b == null) {
                    sb3.append(" recordMetricPerProcess");
                }
                if (uxkVar.d == null) {
                    sb3.append(" forceGcBeforeRecordMemory");
                }
                if (uxkVar.e == null) {
                    sb3.append(" captureDebugMetrics");
                }
                if (uxkVar.f == null) {
                    sb3.append(" captureMemoryInfo");
                }
                String valueOf2 = String.valueOf(sb3);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                sb4.append("Missing required properties:");
                sb4.append(valueOf2);
                throw new IllegalStateException(sb4.toString());
            case 210:
                return axvw.a.get().a(this.a.b.a);
            case 211:
                dyo dyoVar4 = this.a;
                return new uyz(dyoVar4.aQ(), (ankx) dyoVar4.bA.get(), (Executor) dyoVar4.bD.get(), axot.a(dyoVar4.cs), dyoVar4.ct, axot.a(dyoVar4.cl));
            case 212:
                uyk uykVar = new uyk(null);
                return new uyl(uykVar.a, uykVar.b);
            case 213:
                return axwc.a.get().b(this.a.b.a);
            case 214:
                return Boolean.valueOf(axwc.a.get().c(this.a.b.a));
            case 215:
                return Long.valueOf(axwc.a.get().a(this.a.b.a));
            case 216:
                return amic.a;
            case 217:
                return amvn.r(this.a.hm());
            case 218:
                dyo dyoVar5 = this.a;
                return new dzb(dyoVar5.e(), dyoVar5.cD, dyoVar5.V, dyoVar5.dm, dyoVar5.cS, (Executor) dyoVar5.h.get(), dyoVar5.cA, (ywk) dyoVar5.B.get());
            case 219:
                dyo dyoVar6 = this.a;
                return new aacy(dyoVar6.cA, (Executor) dyoVar6.h.get(), (aacv) dyoVar6.cC.get());
            case 220:
                dyo dyoVar7 = this.a;
                return yry.h(dyoVar7.b.a, (String) dyoVar7.cz.get());
            case 221:
                return "main";
            case 222:
                return new aacv(this.a.cB);
            case 223:
                dyo dyoVar8 = this.a;
                Context context = dyoVar8.b.a;
                vjf a = vjg.a(context);
                a.e("common");
                a.f("common_settings_bootstrap.pb");
                Uri a2 = a.a();
                vli a3 = vlj.a();
                a3.e(aouc.a);
                a3.f(a2);
                vlo d = vlr.d(context, (ankw) dyoVar8.h.get());
                d.c = dyo.jp();
                d.b();
                d.d("com.google.android.libraries.youtube.innertube.pref.startup_uncaught_exception_count");
                d.e(fdg.n);
                a3.b(d.a());
                return new yvc(vmu.b(((vlk) dyoVar8.j.get()).a(a3.a())), aouc.a);
            case 224:
                dyo dyoVar9 = this.a;
                efl eflVar = (efl) (((efz) dyoVar9.cQ.get()).a ? dyoVar9.dl.get() : dyoVar9.dk.get());
                axzl.o(eflVar);
                return eflVar;
            case 225:
                dyo dyoVar10 = this.a;
                int i2 = efj.f;
                return new efz((yxe) dyoVar10.X.get(), (aksv) dyoVar10.cO.get(), dyoVar10.D, dyoVar10.cP);
            case 226:
                dyo dyoVar11 = this.a;
                return new aksv((akwh) dyoVar11.cE.get(), dyoVar11.cG, dyoVar11.cH, dyoVar11.cK, dyoVar11.cL, dyoVar11.cM, dyoVar11.cN);
            case 227:
                dyo dyoVar12 = this.a;
                return new akwh(dyoVar12.b.a, (snc) dyoVar12.v.get(), (ScheduledExecutorService) dyoVar12.h.get(), (ywr) dyoVar12.A.get(), (ywk) dyoVar12.B.get(), Optional.of((zds) dyoVar12.z.get()));
            case 228:
                dyo dyoVar13 = this.a;
                return new akwb((akwh) dyoVar13.cE.get(), (akvt) dyoVar13.cF.get());
            case 229:
                return this.a.fL();
            case 230:
                return this.a.fO();
            case 231:
                return this.a.fM();
            case 232:
                dyo dyoVar14 = this.a;
                return new akwf((akwh) dyoVar14.cE.get(), dyoVar14.cJ);
            case 233:
                dyo dyoVar15 = this.a;
                return new akwg((akwh) dyoVar15.cE.get(), dyoVar15.cI);
            case 234:
                dyo dyoVar16 = this.a;
                return new aktp(dyoVar16.b.a, (yrj) dyoVar16.as.get());
            case 235:
                return new NativeCrashDetectorV2((akwh) this.a.cE.get());
            case 236:
                return this.a.fH();
            case 237:
                return this.a.fI();
            case 238:
                return new amxp();
            case 239:
                return new akcq();
            case 240:
                dyo dyoVar17 = this.a;
                return new efq((Executor) dyoVar17.U.get(), (Executor) dyoVar17.Q.get(), (Executor) dyoVar17.h.get(), (ykv) dyoVar17.V.get(), (ywk) dyoVar17.B.get(), (efz) dyoVar17.cQ.get(), dyoVar17.cO, dyoVar17.D, dyoVar17.cA, dyoVar17.cX, dyoVar17.v, dyoVar17.da, dyoVar17.y, dyoVar17.au, dyoVar17.dh, dyoVar17.di, dyoVar17.cD, dyoVar17.dj, dyoVar17.aZ);
            case 241:
                dyo dyoVar18 = this.a;
                boolean c2 = yih.c(null);
                azqb azqbVar = dyoVar18.cT;
                Context context2 = dyoVar18.b.a;
                return new zej(c2, azqbVar, (Executor) dyoVar18.h.get(), (zeh) dyoVar18.cW.get(), new zei(dyoVar18.b.a));
            case 242:
                dyo dyoVar19 = this.a;
                return wdw.e(null, (yrr) dyoVar19.cR.get(), dyoVar19.b.a, (yme) dyoVar19.M.get(), (File) dyoVar19.cS.get(), dyoVar19.cV);
            case 243:
                dyo dyoVar20 = this.a;
                return new yrr((yme) dyoVar20.M.get(), dyoVar20.b.a, (ExecutorService) dyoVar20.h.get(), (ExecutorService) dyoVar20.T.get());
            case 244:
                dyo dyoVar21 = this.a;
                return wze.c(dyoVar21.b.a, null, yii.b((Executor) dyoVar21.h.get()));
            case 245:
                dyo dyoVar22 = this.a;
                return yrn.e((Executor) dyoVar22.h.get(), dyoVar22.cU);
            case 246:
                return yry.b((CronetEngine) this.a.cT.get());
            case 247:
                return new zeh(this.a.b.a);
            case 248:
                return this.a.bn();
            case 249:
                return this.a.be();
            case 250:
                return ooq.i((aacz) this.a.D.get());
            case 251:
                return this.a.bm();
            case 252:
                return oql.b(amon.a, this.a.dg);
            case 253:
                dyo dyoVar23 = this.a;
                return sno.c((vzw) dyoVar23.db.get(), dyoVar23.b.a, dyoVar23.iQ(), (whp) dyoVar23.df.get());
            case 254:
                return ooq.g((yni) this.a.y.get());
            case PrivateKeyType.INVALID /* 255 */:
                dyo dyoVar24 = this.a;
                Set a4 = ((vwk) dyoVar24.de.get()).a();
                axzl.o(a4);
                return new whp(amgc.b(dyoVar24.b.a), (whn) dyoVar24.dd.get(), a4, dyoVar24.b.a);
            case 256:
                return oql.c(amon.a, this.a.dc);
            case 257:
                return new whn(this.a.iQ());
            case 258:
                return new ebr();
            case 259:
                return new yqg(this.a.am);
            case 260:
                return aabv.e((aaau) this.a.C.get());
            case 261:
                dyo dyoVar25 = this.a;
                azqb azqbVar2 = dyoVar25.U;
                Executor executor2 = (Executor) dyoVar25.Q.get();
                Executor executor3 = (Executor) dyoVar25.h.get();
                ykv ykvVar = (ykv) dyoVar25.V.get();
                return new eft(azqbVar2, executor2, executor3, (ywk) dyoVar25.B.get(), (efz) dyoVar25.cQ.get(), dyoVar25.cO, dyoVar25.D, dyoVar25.cA, dyoVar25.cX, dyoVar25.v, dyoVar25.da, dyoVar25.y, dyoVar25.au, dyoVar25.dh, dyoVar25.di, dyoVar25.cD, dyoVar25.dj, dyoVar25.aZ);
            case 262:
                dyo dyoVar26 = this.a;
                ankx ankxVar = (ankx) dyoVar26.g.get();
                bpq bpqVar = new bpq();
                bpqVar.a = ankxVar;
                bpqVar.d = new amgb((amfd) dyoVar26.G.get());
                bpqVar.c = ankxVar;
                bpqVar.b = (bqt) dyoVar26.ni.get();
                return bpqVar.a();
            case 263:
                dyo dyoVar27 = this.a;
                amvn<bqt> t = amvn.t(new oqd(), new yjp(dyoVar27.ng), new amga(amup.k("com.google.apps.tiktok.sync.impl.workmanager.SyncWorker", dyoVar27.nh), (amly) dyoVar27.bm.get()));
                bpy bpyVar = new bpy();
                for (bqt bqtVar : t) {
                    bpyVar.a.add(bqtVar);
                }
                return bpyVar;
            case 264:
                return new yjl(this.a.lX);
            case 265:
                return this.a.bz();
            case 266:
                dyo dyoVar28 = this.a;
                azqb azqbVar3 = dyoVar28.kn;
                azqb azqbVar4 = dyoVar28.kE;
                azqb azqbVar5 = dyoVar28.kF;
                azqb azqbVar6 = dyoVar28.D;
                azqbVar6.getClass();
                aacz aaczVar = (aacz) azqbVar6.get();
                aaczVar.getClass();
                return new est(azqbVar3, azqbVar4, azqbVar5, aaczVar);
            case 267:
                dyo dyoVar29 = this.a;
                aaqj aaqjVar = (aaqj) dyoVar29.er.get();
                aaqf aaqfVar = (aaqf) dyoVar29.eV.get();
                afvn afvnVar = (afvn) dyoVar29.au.get();
                yqw bJ = dyoVar29.bJ();
                aacz aaczVar2 = (aacz) dyoVar29.D.get();
                aadd aaddVar = (aadd) dyoVar29.K.get();
                amvl j = amvn.j(8);
                amyg amygVar = amyg.a;
                axzl.o(amygVar);
                j.j(amygVar);
                j.c(new itz(dyoVar29.b.a));
                final isr isrVar = (isr) dyoVar29.fe.get();
                j.c(new aatg() { // from class: ity
                    @Override // defpackage.aatg
                    public final void a(aatf aatfVar) {
                        for (aukj aukjVar : isr.this.c()) {
                            aatfVar.u.add(aukjVar);
                        }
                    }
                });
                j.c((aatg) dyoVar29.iv.get());
                j.c((aatg) dyoVar29.iB.get());
                j.c((aatg) dyoVar29.iD.get());
                j.c((aatg) dyoVar29.iE.get());
                j.c(dyoVar29.cY());
                return new aath(aaqjVar, aaqfVar, afvnVar, bJ, aaczVar2, aaddVar, j.g(), new aate((aaqj) dyoVar29.er.get(), dyoVar29.bJ(), dyoVar29.hM()), (yni) dyoVar29.y.get(), (zdz) dyoVar29.dy.get(), dyoVar29.hM());
            case 268:
                return aabv.b(this.a.cl());
            case 269:
                return ooq.f((vzm) this.a.dh.get());
            case 270:
                dyo dyoVar30 = this.a;
                amvl j2 = amvn.j(3);
                j2.j((Iterable) dyoVar30.dq.get());
                j2.j((Iterable) dyoVar30.dt.get());
                j2.c((afxq) dyoVar30.du.get());
                return j2.g();
            case 271:
                return amvn.r(this.a.ec());
            case 272:
                dyo dyoVar31 = this.a;
                azqb azqbVar7 = dyoVar31.r;
                azqb azqbVar8 = dyoVar31.ak;
                afsf.b(dyoVar31.dU());
                return new aadh(azqbVar7, azqbVar8);
            case 273:
                dyo dyoVar32 = this.a;
                return yrn.h((aadd) dyoVar32.K.get(), dyoVar32.ds);
            case 274:
                dyo dyoVar33 = this.a;
                return new aare((aarc) dyoVar33.dr.get(), (ScheduledExecutorService) dyoVar33.h.get(), (snc) dyoVar33.v.get(), (aadd) dyoVar33.K.get());
            case 275:
                return aabv.f(this.a.b.a);
            case 276:
                dyo dyoVar34 = this.a;
                return new afzt((SharedPreferences) dyoVar34.t.get(), (afvn) dyoVar34.au.get());
            case 277:
                dyo dyoVar35 = this.a;
                return amvn.t((aaqx) dyoVar35.dj.get(), (aaqx) dyoVar35.dv.get(), (aaqx) dyoVar35.dw.get());
            case 278:
                dyo dyoVar36 = this.a;
                return new aarf((SharedPreferences) dyoVar36.t.get(), (afvn) dyoVar36.au.get());
            case 279:
                return new aaok((yni) this.a.y.get());
            case 280:
                return this.a.dU();
            case 281:
                dyo dyoVar37 = this.a;
                zgt zgtVar = (zgt) dyoVar37.dx.get();
                return new zdz((snc) dyoVar37.v.get(), new zea());
            case 282:
                return yie.r();
            case 283:
                dyo dyoVar38 = this.a;
                return wxf.i(ampq.j(new esq((acrr) dyoVar38.aw.get(), (yrj) dyoVar38.as.get())));
            case 284:
                dyo dyoVar39 = this.a;
                Context context3 = dyoVar39.b.a;
                return wze.i(amvn.s((aapu) dyoVar39.dN.get(), (aapu) dyoVar39.ep.get()), (aadd) dyoVar39.K.get());
            case 285:
                dyo dyoVar40 = this.a;
                return yrn.k((aajg) dyoVar40.dM.get(), (aaki) dyoVar40.dC.get());
            case 286:
                dyo dyoVar41 = this.a;
                return sno.l((aagi) dyoVar41.dD.get(), (aahf) dyoVar41.dK.get(), (aajd) dyoVar41.dL.get(), (aaki) dyoVar41.dC.get());
            case 287:
                dyo dyoVar42 = this.a;
                return wtk.k((afvn) dyoVar42.au.get(), dyoVar42.dz, (yni) dyoVar42.y.get(), dyoVar42.dA, (aaki) dyoVar42.dC.get(), dyoVar42.hG(), (Executor) dyoVar42.aA.get(), (abgb) dyoVar42.dE.get());
            case 288:
                dyo dyoVar43 = this.a;
                return new wfn(axot.a(dyoVar43.au), axot.a(dyoVar43.au), (yni) dyoVar43.y.get(), (SharedPreferences) dyoVar43.t.get(), (wea) dyoVar43.I.get(), (abfh) dyoVar43.r.get(), (snc) dyoVar43.v.get(), (acrq) dyoVar43.ax.get(), (aacz) dyoVar43.D.get());
            case 289:
                return dyo.je();
            case 290:
                dyo dyoVar44 = this.a;
                Context context4 = dyoVar44.b.a;
                return yrn.i(dyoVar44.dB);
            case 291:
                return new aakh((snc) this.a.v.get());
            case 292:
                dyo dyoVar45 = this.a;
                return new aakf((snc) dyoVar45.v.get(), (aadd) dyoVar45.K.get());
            case 293:
                aacz aaczVar3 = (aacz) this.a.D.get();
                return aabv.G();
            case 294:
                return this.a.ch();
            case 295:
                return aabv.F(this.a.dG);
            case 296:
                dyo dyoVar46 = this.a;
                return new vnq(dyoVar46.by, dyoVar46.h, dyoVar46.dF);
            case 297:
                return new voj();
            case 298:
                dyo dyoVar47 = this.a;
                return new aahc((aacz) dyoVar47.D.get(), (acrq) dyoVar47.ax.get());
            case 299:
                dyo dyoVar48 = this.a;
                return amvn.t((aahn) dyoVar48.dH.get(), (aahn) dyoVar48.dI.get(), (aahn) dyoVar48.dJ.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        int i = this.b;
        boolean z = false;
        Boolean bool = false;
        switch (i) {
            case 1500:
                return new aafd();
            case 1501:
                dyo dyoVar = this.a;
                return new isn((Executor) dyoVar.h.get(), (aaru) dyoVar.iC.get());
            case 1502:
                return new mch();
            case 1503:
                dyo dyoVar2 = this.a;
                aihy aihyVar = new aihy((aadd) dyoVar2.K.get(), (yve) dyoVar2.fW.get());
                aihyVar.b();
                return aihyVar;
            case 1504:
                dyo dyoVar3 = this.a;
                final aicv aicvVar = new aicv((aiix) dyoVar3.fH.get());
                new aypf().d(((airw) dyoVar3.fP.get()).ab().aa(new ayqb() { // from class: aicu
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        aicv aicvVar2 = aicv.this;
                        ahic ahicVar = (ahic) obj;
                        ajff a = ahicVar.a();
                        aujo aujoVar = aiix.d(aicvVar2.a.a).m;
                        if (aujoVar == null) {
                            aujoVar = aujo.a;
                        }
                        if (!aujoVar.b || a == null) {
                            return;
                        }
                        aicvVar2.b = ampq.i(ahicVar.a().d());
                    }
                }, aiax.g));
                return aicvVar;
            case 1505:
                return this.a.fo();
            case 1506:
                dyo dyoVar4 = this.a;
                aiqa aiqaVar = (aiqa) dyoVar4.vP.get();
                return new aimr((yni) dyoVar4.y.get(), (abeb) dyoVar4.lM.get(), (abec) dyoVar4.lL.get());
            case 1507:
                return new aiqa();
            case 1508:
                return new ahdg((snc) this.a.v.get());
            case 1509:
                dyo dyoVar5 = this.a;
                return new jjt(dyoVar5.b.a, (agrf) dyoVar5.gS.get(), (aacz) dyoVar5.D.get());
            case 1510:
                dyo dyoVar6 = this.a;
                return new jka((jml) dyoVar6.nz.get(), (aadd) dyoVar6.K.get(), (aacz) dyoVar6.D.get());
            case 1511:
                return this.a.ah();
            case 1512:
                dyo dyoVar7 = this.a;
                ihp ihpVar = (ihp) dyoVar7.vV.get();
                ifn S = dyoVar7.S();
                ifm ifmVar = (ifm) dyoVar7.vX.get();
                amqo gs = dyoVar7.gs();
                aanz ci = dyoVar7.ci();
                aadd aaddVar = (aadd) dyoVar7.K.get();
                ayor a = azpj.a();
                axzl.o(a);
                return new igh(ihpVar, S, ifmVar, gs, ci, (Executor) dyoVar7.h.get(), a, (snc) dyoVar7.v.get());
            case 1513:
                dyo dyoVar8 = this.a;
                return new ihp((aaqj) dyoVar8.er.get(), (aaqf) dyoVar8.eV.get(), (afvn) dyoVar8.au.get(), (yqw) dyoVar8.jj.get(), (aacz) dyoVar8.D.get());
            case 1514:
                dyo dyoVar9 = this.a;
                dxn dxnVar = new dxn(dyoVar9.c);
                Object obj = (airw) dyoVar9.fP.get();
                auld auldVar = ((aadd) dyoVar9.K.get()).a().u;
                if (auldVar == null) {
                    auldVar = auld.a;
                }
                aull aullVar = auldVar.d;
                if (aullVar == null) {
                    aullVar = aull.a;
                }
                if (aullVar.C) {
                    obj = dxnVar.a();
                }
                axzl.o(obj);
                return obj;
            case 1515:
                return new ifm();
            case 1516:
                dyo dyoVar10 = this.a;
                return new aitp((snc) dyoVar10.v.get(), (Executor) dyoVar10.h.get(), (Handler) dyoVar10.an.get(), (SecureRandom) dyoVar10.eb.get(), (aawx) dyoVar10.vZ.get(), dyoVar10.hC(), (ahfm) dyoVar10.bd.get(), (aiix) dyoVar10.fH.get(), (acrr) dyoVar10.aw.get());
            case 1517:
                dyo dyoVar11 = this.a;
                return new aawx((aaqj) dyoVar11.er.get(), (aaqf) dyoVar11.eV.get(), (afvn) dyoVar11.au.get(), (yqw) dyoVar11.fD.get());
            case 1518:
                dyo dyoVar12 = this.a;
                return new aity((afwu) dyoVar12.hL.get(), (yrj) dyoVar12.as.get(), (afst) dyoVar12.hx.get(), ((wwk) dyoVar12.eH.get()).a(), (Executor) dyoVar12.h.get(), (ajjh) dyoVar12.wb.get(), (acrr) dyoVar12.aw.get(), (aadd) dyoVar12.K.get(), wjw.c((wwm) dyoVar12.so.get()), null, null, null);
            case 1519:
                return this.a.bu();
            case 1520:
                return aheb.d((afsv) this.a.hK.get());
            case 1521:
                dyo dyoVar13 = this.a;
                return ahfa.a((zah) dyoVar13.av.get(), (ahfm) dyoVar13.bd.get());
            case 1522:
                dyo dyoVar14 = this.a;
                return adzp.k((aadd) dyoVar14.K.get(), dyoVar14.b.a, axot.a(dyoVar14.G));
            case 1523:
                dyo dyoVar15 = this.a;
                return new alhc((snc) dyoVar15.v.get(), (ScheduledExecutorService) dyoVar15.h.get(), (aadd) dyoVar15.K.get(), (akzp) dyoVar15.mQ.get(), (akze) dyoVar15.mS.get(), (albf) dyoVar15.mT.get(), (alfb) dyoVar15.mV.get());
            case 1524:
                dyo dyoVar16 = this.a;
                return new alez((akzd) dyoVar16.wh.get(), (akze) dyoVar16.mS.get());
            case 1525:
                return new akzd(this.a.b.a);
            case 1526:
                dyo dyoVar17 = this.a;
                return new albc((aaqj) dyoVar17.er.get(), (aaqf) dyoVar17.eV.get(), (afvn) dyoVar17.au.get(), (yqw) dyoVar17.fB.get(), (aacz) dyoVar17.D.get());
            case 1527:
                dyo dyoVar18 = this.a;
                return new abdu((aaqj) dyoVar18.er.get(), (aaqf) dyoVar18.eV.get(), (afvn) dyoVar18.au.get(), (yqw) dyoVar18.fD.get());
            case 1528:
                return new aldl(this.a.b.a);
            case 1529:
                dyo dyoVar19 = this.a;
                return new alaz(dyoVar19.al, (snc) dyoVar19.v.get(), (ScheduledExecutorService) dyoVar19.h.get(), dyoVar19.wj);
            case 1530:
                dyo dyoVar20 = this.a;
                return new aazu((aaqj) dyoVar20.er.get(), (aaqf) dyoVar20.eV.get(), (afvn) dyoVar20.au.get(), (yqw) dyoVar20.fD.get());
            case 1531:
                dyo dyoVar21 = this.a;
                afvn afvnVar = (afvn) dyoVar21.au.get();
                return new abbr((aaqj) dyoVar21.er.get(), (aaqf) dyoVar21.eV.get(), (yqw) dyoVar21.fB.get(), (aacz) dyoVar21.D.get());
            case 1532:
                dyo dyoVar22 = this.a;
                return new aghf((SharedPreferences) dyoVar22.t.get(), dyoVar22.bS());
            case 1533:
                return this.a.eN();
            case 1534:
                return this.a.fp();
            case 1535:
                return afku.e();
            case 1536:
                dyo dyoVar23 = this.a;
                return ((wkn) dyoVar23.cY.get()).k ? new agge() : new aggd((wns) dyoVar23.wr.get());
            case 1537:
                dyo dyoVar24 = this.a;
                return new wns((snc) dyoVar24.v.get(), (wnb) dyoVar24.sN.get(), (aaqp) dyoVar24.ih.get(), dyoVar24.jg);
            case 1538:
                return new feu();
            case 1539:
                dyo dyoVar25 = this.a;
                Object obj2 = (lof) dyoVar25.ww.get();
                Object obj3 = (lub) dyoVar25.wu.get();
                aqxe aqxeVar = ((axxh) dyoVar25.kG.get()).b.b().C;
                if (aqxeVar == null) {
                    aqxeVar = aqxe.a;
                }
                if (aqxeVar.a(45357241L)) {
                    aoqp aoqpVar = aqxeVar.b;
                    if (!aoqpVar.containsKey(45357241L)) {
                        throw new IllegalArgumentException();
                    }
                    aqxf aqxfVar = (aqxf) aoqpVar.get(45357241L);
                    if (aqxfVar.b == 1) {
                        z = ((Boolean) aqxfVar.c).booleanValue();
                    }
                    bool = Boolean.valueOf(z);
                }
                if (true != bool.booleanValue()) {
                    obj2 = obj3;
                }
                axzl.o(obj2);
                return obj2;
            case 1540:
                dyo dyoVar26 = this.a;
                return new lof(dyoVar26.b.a, dyoVar26.C(), (lub) dyoVar26.wu.get(), (jfv) dyoVar26.wv.get());
            case 1541:
                dyo dyoVar27 = this.a;
                return new lub(dyoVar27.b.a, dyoVar27.gS, (fcl) dyoVar27.kI.get(), (fbj) dyoVar27.kH.get());
            case 1542:
                return this.a.aa();
            case 1543:
                dyo dyoVar28 = this.a;
                return new jgi(dyoVar28.eO(), (Executor) dyoVar28.h.get());
            case 1544:
                return new lmm((adoa) this.a.jq.get());
            case 1545:
                return this.a.p();
            case 1546:
                final Context context = this.a.b.a;
                return (zgu) amon.a.b(new ampg() { // from class: yny
                    @Override // defpackage.ampg
                    public final Object apply(Object obj4) {
                        zgu zguVar = (zgu) obj4;
                        return zgu.a.equals(zguVar) ? zag.v(context) : zguVar;
                    }
                }).d(new nfd(context, 11));
            case 1547:
                return new efc();
            case 1548:
                dyo dyoVar29 = this.a;
                etw etwVar = new etw((etn) dyoVar29.np.get(), dyoVar29.ol, dyoVar29.om, (acvh) dyoVar29.ef.get());
                aqxe aqxeVar2 = ((axwr) dyoVar29.wB.get()).a.b().C;
                if (aqxeVar2 == null) {
                    aqxeVar2 = aqxe.a;
                }
                if (aqxeVar2.a(45352594L)) {
                    aoqp aoqpVar2 = aqxeVar2.b;
                    if (!aoqpVar2.containsKey(45352594L)) {
                        throw new IllegalArgumentException();
                    }
                    aqxf aqxfVar2 = (aqxf) aoqpVar2.get(45352594L);
                    if (aqxfVar2.b == 1) {
                        z = ((Boolean) aqxfVar2.c).booleanValue();
                    }
                    bool = Boolean.valueOf(z);
                }
                return bool.booleanValue() ? etwVar : new ets();
            case 1549:
                dyo dyoVar30 = this.a;
                aadd aaddVar2 = (aadd) dyoVar30.K.get();
                return new axwr((aacz) dyoVar30.D.get());
            case 1550:
                amlp l = amna.l("provideExtensionRegistry");
                try {
                    aoos b = aoos.b();
                    l.close();
                    axzl.o(b);
                    return b;
                } catch (Throwable th) {
                    try {
                        l.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            case 1551:
                return this.a.gR();
            case 1552:
                return new amdu(this.a.gi());
            case 1553:
                dyo dyoVar31 = this.a;
                return new whh(dyoVar31.gi(), (ambo) dyoVar31.gO(), dyoVar31.gl(), (afvn) dyoVar31.au.get(), (amcj) dyoVar31.aV.get(), dyoVar31.bc());
            case 1554:
                return this.a.ff();
            case 1555:
                return new osz();
            case 1556:
                abcc abccVar = (abcc) this.a.wH.get();
                abccVar.getClass();
                return new gbt(abccVar);
            case 1557:
                dyo dyoVar32 = this.a;
                return new abcc((ces) dyoVar32.nw.get(), (Executor) dyoVar32.h.get(), (aaqp) dyoVar32.ih.get());
            case 1558:
                return this.a.gB();
            case 1559:
                dyo dyoVar33 = this.a;
                return new ahso((ahkv) dyoVar33.uI.get(), (afka) dyoVar33.ga.get(), dyoVar33.fO, dyoVar33.wK, new ahsu((yve) dyoVar33.wM.get()));
            case 1560:
                Context context2 = this.a.b.a;
                if (zew.c == null) {
                    zew.c = Boolean.valueOf(context2.getPackageManager().hasSystemFeature("android.hardware.sensor.gyroscope"));
                }
                return Boolean.valueOf(zew.c.booleanValue());
            case 1561:
                yve yveVar = (yve) this.a.wL.get();
                axzl.o(yveVar);
                return yveVar;
            case 1562:
                dyo dyoVar34 = this.a;
                Context context3 = dyoVar34.b.a;
                vlo d = vlr.d(context3, (ankw) dyoVar34.h.get());
                d.b();
                d.c = dyo.jp();
                d.d("youtube.vr.selected_platform", "com.google.android.libraries.youtube.player.pref.vr_mode_first_time_use");
                d.e(adiz.g);
                vlr a2 = d.a();
                vli a3 = vlj.a();
                a3.f(yhr.a(context3, "player", "features/settings.pb"));
                a3.e(awvd.a);
                a3.b(a2);
                return new yvc(vmu.b(((vlk) dyoVar34.j.get()).a(a3.a())), awvd.a);
            case 1563:
                dyo dyoVar35 = this.a;
                return new aawh((aaqj) dyoVar35.er.get(), (aaqf) dyoVar35.eV.get(), (afvn) dyoVar35.au.get(), (yqw) dyoVar35.fD.get());
            case 1564:
                return this.a.x();
            case 1565:
                dyo dyoVar36 = this.a;
                return new akui(dyoVar36.wV, (Executor) dyoVar36.x.get(), (ankw) dyoVar36.ay.get(), (akvm) dyoVar36.hl.get());
            case 1566:
                dyo dyoVar37 = this.a;
                return amvn.w((akuk) dyoVar37.wP.get(), (akuk) dyoVar37.wQ.get(), (akuk) dyoVar37.ou.get(), (akuk) dyoVar37.wR.get(), (akuk) dyoVar37.wS.get(), (akuk) dyoVar37.wT.get(), (akuk) dyoVar37.wU.get());
            case 1567:
                return new xxg();
            case 1568:
                dyo dyoVar38 = this.a;
                eyl eylVar = new eyl((aacz) dyoVar38.D.get());
                yni yniVar = (yni) dyoVar38.y.get();
                airw airwVar = (airw) dyoVar38.fP.get();
                if (eog.aq(eylVar.a)) {
                    eylVar.g(airwVar);
                } else {
                    yniVar.g(eylVar);
                }
                return eylVar;
            case 1569:
                return new jja((jnn) this.a.hf.get());
            case 1570:
                return new xxg(1);
            case 1571:
                dyo dyoVar39 = this.a;
                return new alcj((akzp) dyoVar39.mQ.get(), (aacz) dyoVar39.D.get(), (afvn) dyoVar39.au.get());
            case 1572:
                return new rbi(this.a.b.a);
            case 1573:
                dyo dyoVar40 = this.a;
                return new fao(dyoVar40.b.a, (Executor) dyoVar40.x.get(), (agcp) dyoVar40.et.get(), (agbd) dyoVar40.eu.get());
            case 1574:
                return this.a.fu();
            case 1575:
                return new yxz(this.a.b.a);
            case 1576:
                dyo dyoVar41 = this.a;
                return new wia((aaqj) dyoVar41.er.get(), (aaqf) dyoVar41.eV.get(), (afvn) dyoVar41.au.get(), (yqw) dyoVar41.fB.get());
            case 1577:
                return new wig();
            case 1578:
                dyo dyoVar42 = this.a;
                return new aasl((aaqj) dyoVar42.er.get(), (aaqf) dyoVar42.eV.get(), (afvn) dyoVar42.au.get(), (yqw) dyoVar42.fD.get());
            case 1579:
                dyo dyoVar43 = this.a;
                return new aasp((aaqj) dyoVar43.er.get(), (aaqf) dyoVar43.eV.get(), (afvn) dyoVar43.au.get(), (yqw) dyoVar43.fD.get());
            case 1580:
                return new ijc((ajmy) this.a.kC.get());
            case 1581:
                dyo dyoVar44 = this.a;
                return aolu.w(((Boolean) dyoVar44.ed.get()).booleanValue(), axot.a(dyoVar44.xg), axot.a(dyoVar44.eh), axot.a(dyoVar44.aA), axot.a(dyoVar44.xh));
            case 1582:
                return new aolu();
            case 1583:
                dyo dyoVar45 = this.a;
                Context context4 = dyoVar45.b.a;
                return new ajiy(((ajjr) dyoVar45.dU.get()).a().j, new Random());
            case 1584:
                dyo dyoVar46 = this.a;
                return new evm((acvh) dyoVar46.ef.get(), (etn) dyoVar46.np.get(), (aiix) dyoVar46.fH.get());
            case 1585:
                dyo dyoVar47 = this.a;
                return new kka(dyoVar47.aj(), dyoVar47.xk, (Executor) dyoVar47.x.get(), (ahxv) dyoVar47.xl.get());
            case 1586:
                dyo dyoVar48 = this.a;
                vjf a4 = vjg.a(dyoVar48.b.a);
                a4.e("accessibility");
                a4.f("accessibility.pb");
                Uri a5 = a4.a();
                vli a6 = vlj.a();
                a6.e(kkb.a);
                a6.f(a5);
                return ((vlk) dyoVar48.j.get()).a(a6.a());
            case 1587:
                return this.a.fg();
            case 1588:
                return aisw.c();
            case 1589:
                dyo dyoVar49 = this.a;
                return new aihr((ajmy) dyoVar49.kC.get(), (Executor) dyoVar49.x.get(), (ScheduledExecutorService) dyoVar49.h.get(), (aijf) dyoVar49.gH.get(), (airw) dyoVar49.fP.get(), (aadd) dyoVar49.K.get(), (acvh) dyoVar49.ef.get());
            case 1590:
                dyo dyoVar50 = this.a;
                yqw yqwVar = (yqw) dyoVar50.fD.get();
                Set emptySet = Collections.emptySet();
                axzl.o(emptySet);
                return new aaza((aaqj) dyoVar50.er.get(), (aaqf) dyoVar50.eV.get(), (afvn) dyoVar50.au.get(), yqwVar, amvn.p(emptySet));
            case 1591:
                dyo dyoVar51 = this.a;
                return new aayw((aaqj) dyoVar51.er.get(), (aaqf) dyoVar51.eV.get(), (afvn) dyoVar51.au.get(), (yqw) dyoVar51.fB.get());
            case 1592:
                return new ajvj();
            case 1593:
                return new abkl();
            case 1594:
                dyo dyoVar52 = this.a;
                return new ajvm((ajmy) dyoVar52.kC.get(), (Executor) dyoVar52.x.get());
            case 1595:
                return new abks();
            case 1596:
                return new abjx((acrr) this.a.aw.get());
            case 1597:
                return new abky();
            case 1598:
                return new abse();
            case 1599:
                dyo dyoVar53 = this.a;
                return aolu.w(((Boolean) dyoVar53.ed.get()).booleanValue(), axot.a(dyoVar53.xg), axot.a(dyoVar53.eh), axot.a(dyoVar53.aA), axot.a(dyoVar53.xh));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        int c;
        int i = this.b;
        switch (i) {
            case 1100:
                return this.a.hO();
            case 1101:
                return this.a.hP();
            case 1102:
                dyo dyoVar = this.a;
                return new jnp((fcu) dyoVar.gY.get(), (agsd) dyoVar.lo.get(), (yni) dyoVar.y.get(), (afvn) dyoVar.au.get(), (ayor) dyoVar.aq.get(), (jsf) dyoVar.pj.get());
            case 1103:
                dyo dyoVar2 = this.a;
                return new jsf((fbh) dyoVar2.pi.get(), (yrj) dyoVar2.as.get());
            case 1104:
                dyo dyoVar3 = this.a;
                return new fbh((aahf) dyoVar3.dK.get(), (afvn) dyoVar3.au.get(), (snc) dyoVar3.v.get());
            case 1105:
                dyo dyoVar4 = this.a;
                return new adxy((aacz) dyoVar4.D.get(), (adxw) dyoVar4.ge.get());
            case 1106:
                dyo dyoVar5 = this.a;
                return new adyt((aepl) dyoVar5.gw.get(), axot.a(dyoVar5.gO), dyoVar5.dv(), dyoVar5.fS, (afhf) dyoVar5.gK.get(), (axxl) dyoVar5.fF.get());
            case 1107:
                dyo dyoVar6 = this.a;
                return new dys(dyoVar6.et, (ankt) dyoVar6.ol.get());
            case 1108:
                dyo dyoVar7 = this.a;
                return wdw.h((Executor) dyoVar7.h.get(), (ywk) dyoVar7.B.get(), (aadd) dyoVar7.K.get(), dyoVar7.aw, dyoVar7.at, dyoVar7.pt);
            case 1109:
                dyo dyoVar8 = this.a;
                return amvn.t((afuc) dyoVar8.pp.get(), (afuc) dyoVar8.pq.get(), (afuc) dyoVar8.ps.get());
            case 1110:
                dyo dyoVar9 = this.a;
                afzk afzkVar = (afzk) dyoVar9.ak.get();
                return wtk.b((acrf) dyoVar9.mF.get(), (aazp) dyoVar9.po.get(), dyoVar9.f197J.get(), (afvn) dyoVar9.au.get(), (afso) dyoVar9.N.get(), (ykw) dyoVar9.Z.get(), (afug) dyoVar9.at.get());
            case 1111:
                dyo dyoVar10 = this.a;
                afvn afvnVar = (afvn) dyoVar10.au.get();
                return new aazp((aaqj) dyoVar10.er.get(), (aaqf) dyoVar10.eV.get(), (yqw) dyoVar10.fD.get(), (aacz) dyoVar10.D.get());
            case 1112:
                dyo dyoVar11 = this.a;
                return wdw.i((acrf) dyoVar11.mF.get(), dyoVar11.f197J.get(), (aazp) dyoVar11.po.get(), (afvn) dyoVar11.au.get(), (ykw) dyoVar11.Z.get(), (afug) dyoVar11.at.get());
            case 1113:
                return this.a.fm();
            case 1114:
                return this.a.cn();
            case 1115:
                return this.a.as();
            case 1116:
                return new akpx(this.a.ev);
            case 1117:
                dyo dyoVar12 = this.a;
                return new aksw(dyoVar12.bt, (aksv) dyoVar12.cO.get(), dyoVar12.px, dyoVar12.py, dyoVar12.pw, dyoVar12.pC);
            case 1118:
                return this.a.fN();
            case 1119:
                return this.a.fK();
            case 1120:
                return this.a.gU();
            case 1121:
                return this.a.gT();
            case 1122:
                dyo dyoVar13 = this.a;
                return new NativeCrashDetector(dyoVar13.b.a, (akwr) dyoVar13.bt.get(), (acrr) dyoVar13.aw.get());
            case 1123:
                dyo dyoVar14 = this.a;
                return new akus(dyoVar14.e(), (yni) dyoVar14.y.get(), (snc) dyoVar14.v.get(), (ScheduledExecutorService) dyoVar14.h.get(), dyoVar14.cI, dyoVar14.pA, dyoVar14.pz, dyoVar14.pB, dyoVar14.bu);
            case 1124:
                dyo dyoVar15 = this.a;
                return new akut(dyoVar15.b.a, dyoVar15.pz, dyoVar15.fn, dyoVar15.D);
            case 1125:
                return new akuu(this.a.cI);
            case 1126:
                return new akwq();
            case 1127:
                dyo dyoVar16 = this.a;
                return new xyt((vzc) dyoVar16.hY.get(), (aadd) dyoVar16.K.get(), dyoVar16.b.a, (afvn) dyoVar16.au.get(), (abfh) dyoVar16.r.get(), (yrj) dyoVar16.as.get());
            case 1128:
                dyo dyoVar17 = this.a;
                return new gss((yjs) dyoVar17.ai.get(), (aacz) dyoVar17.D.get());
            case 1129:
                dyo dyoVar18 = this.a;
                return new fab((aacz) dyoVar18.D.get(), (yjs) dyoVar18.ai.get());
            case 1130:
                dyo dyoVar19 = this.a;
                return egd.E((ScheduledExecutorService) dyoVar19.h.get(), (aacz) dyoVar19.D.get());
            case 1131:
                dyo dyoVar20 = this.a;
                return egd.D((ylg) dyoVar20.pH.get(), (Executor) dyoVar20.h.get(), (aacz) dyoVar20.D.get());
            case 1132:
                dyo dyoVar21 = this.a;
                aacr aacrVar = new aacr((aacz) dyoVar21.D.get(), dyoVar21.eK);
                aacrVar.a = axot.a(dyoVar21.pJ);
                return aacrVar;
            case 1133:
                FirebaseAnalytics w = egd.w(this.a.b.a);
                axzl.o(w);
                return w;
            case 1134:
                dyo dyoVar22 = this.a;
                Context context = dyoVar22.b.a;
                Executor executor = (Executor) dyoVar22.x.get();
                return new yik((Executor) dyoVar22.h.get(), dyoVar22.pL, dyoVar22.pN, dyoVar22.pO, dyoVar22.pP, dyoVar22.iF, dyoVar22.M, dyoVar22.y, dyoVar22.T, dyoVar22.pQ);
            case 1135:
                return Boolean.valueOf(ymf.a(((yme) this.a.M.get()).a()).f);
            case 1136:
                yqc yqcVar = (yqc) this.a.pM.get();
                axzl.o(yqcVar);
                return yqcVar;
            case 1137:
                dyo dyoVar23 = this.a;
                return new yqc(dyoVar23.b.a, dyoVar23.ar, (zdj) dyoVar23.al.get());
            case 1138:
                dyo dyoVar24 = this.a;
                final Context context2 = dyoVar24.b.a;
                final azqb azqbVar = dyoVar24.v;
                final azqb azqbVar2 = dyoVar24.h;
                return (yxv) amon.a.d(new amqo() { // from class: yil
                    @Override // defpackage.amqo
                    public final Object get() {
                        Context context3 = context2;
                        azqb azqbVar3 = azqbVar;
                        azqb azqbVar4 = azqbVar2;
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new ymo("ScheduledTaskProto"));
                        return new yxv(new yxw(new ymk(context3, "com.google.android.libraries.youtube.common.task.ScheduledTaskStore", arrayList)), Executors.newScheduledThreadPool(1, new yli("taskSched")), (snc) azqbVar3.get(), (Executor) azqbVar4.get());
                    }
                });
            case 1139:
                dyo dyoVar25 = this.a;
                yxs yxsVar = new yxs((yni) dyoVar25.y.get(), (yrj) dyoVar25.as.get());
                HashMap hashMap = new HashMap();
                hashMap.put(yxs.e, yxsVar);
                return new yxp(hashMap, anlz.g((Executor) dyoVar25.h.get()));
            case 1140:
                Context context3 = this.a.b.a;
                int i2 = egd.a;
                ampq.j(true);
                return new adph();
            case 1141:
                throw new IllegalArgumentException("Do not directly use the WorkManager or Configuration types. See go/tiktok/dev/androidx/work.");
            case 1142:
                dyo dyoVar26 = this.a;
                return new aaaw(dyoVar26.eL, dyoVar26.by, dyoVar26.dD, dyoVar26.dK, dyoVar26.fD, dyoVar26.jj, dyoVar26.ih);
            case 1143:
                return yry.d(amyg.a);
            case 1144:
                dyo dyoVar27 = this.a;
                aidn aidnVar = (aidn) dyoVar27.eQ.get();
                ((aflx) dyoVar27.gb.get()).b = aidnVar.a.aC();
                aisl F = aidnVar.a.F();
                axzl.o(F);
                return F;
            case 1145:
                return new aidn((airw) this.a.fP.get());
            case 1146:
                dyo dyoVar28 = this.a;
                return new yus((yur) dyoVar28.pW.get(), dyoVar28.b.a);
            case 1147:
                return new fah();
            case 1148:
                dyo dyoVar29 = this.a;
                return new fae(dyoVar29.K, dyoVar29.ai, (snc) dyoVar29.v.get());
            case 1149:
                dyo dyoVar30 = this.a;
                akws akwsVar = new akws();
                akwsVar.a = (akyu) dyoVar30.pZ.get();
                akwsVar.b = (akye) dyoVar30.nd.get();
                return akwsVar;
            case 1150:
                dyo dyoVar31 = this.a;
                return new akyu((snc) dyoVar31.v.get(), (aacz) dyoVar31.D.get(), (yni) dyoVar31.y.get(), (afvn) dyoVar31.au.get(), (aagi) dyoVar31.dD.get(), (akzp) dyoVar31.mQ.get(), (alak) dyoVar31.mU.get(), (algq) dyoVar31.mW.get());
            case 1151:
                dyo dyoVar32 = this.a;
                return new agal(dyoVar32.rq, dyoVar32.hY, dyoVar32.au, dyoVar32.hg, (aacz) dyoVar32.D.get());
            case 1152:
                dyo dyoVar33 = this.a;
                ufl uflVar = (ufl) dyoVar33.qe.get();
                uen uenVar = (uen) dyoVar33.rp.get();
                return new uix((ucs) dyoVar33.qb.get(), (uiz) dyoVar33.rn.get(), (ujc) dyoVar33.ro.get());
            case 1153:
                return new ucy(this.a.b.a);
            case 1154:
                dyo dyoVar34 = this.a;
                return new ufo(dyoVar34.b.a, (ucj) dyoVar34.qc.get(), (ufk) dyoVar34.qd.get());
            case 1155:
                return this.a.ax();
            case 1156:
                return new ufn();
            case 1157:
                dyo dyoVar35 = this.a;
                return new uiz(dyoVar35.au(), (ueo) dyoVar35.qf.get(), (ucj) dyoVar35.qc.get(), (ugj) dyoVar35.qX.get(), (ucs) dyoVar35.qb.get(), (uib) dyoVar35.rm.get(), (ugh) dyoVar35.qD.get(), ampq.j((agax) dyoVar35.rd.get()), dyoVar35.aK());
            case 1158:
                return new ueo((ucs) this.a.qb.get());
            case 1159:
                dyo dyoVar36 = this.a;
                Context context4 = dyoVar36.b.a;
                ujk ujkVar = (ujk) dyoVar36.qg.get();
                ucv ucvVar = (ucv) dyoVar36.qh.get();
                axnm a = axot.a(dyoVar36.re);
                axnm a2 = axot.a(dyoVar36.rf);
                axnm a3 = axot.a(dyoVar36.rg);
                axnm a4 = axot.a(dyoVar36.rh);
                axnm a5 = axot.a(dyoVar36.ri);
                axot.a(dyoVar36.rj);
                axot.a(dyoVar36.rk);
                axot.a(dyoVar36.rl);
                return new ugn(context4, ujkVar, ucvVar, a, a2, a3, a4, a5);
            case 1160:
                dyo dyoVar37 = this.a;
                return new ujn(dyoVar37.b.a, new ujl((ucj) dyoVar37.qc.get()));
            case 1161:
                dyo dyoVar38 = this.a;
                return new uda(dyoVar38.b.a, (ucs) dyoVar38.qb.get());
            case 1162:
                dyo dyoVar39 = this.a;
                ugq ugqVar = new ugq((ufs) dyoVar39.qF.get());
                ugqVar.a = dyoVar39.hI();
                return ugqVar;
            case 1163:
                dyo dyoVar40 = this.a;
                ufw ufwVar = (ufw) dyoVar40.qk.get();
                uje ujeVar = (uje) dyoVar40.qo.get();
                Object obj = dyoVar40.qt.get();
                Object obj2 = dyoVar40.qu.get();
                ugb ugbVar = (ugb) dyoVar40.qv.get();
                umn umnVar = (umn) dyoVar40.qw.get();
                ugc ugcVar = (ugc) dyoVar40.qx.get();
                Object obj3 = dyoVar40.qy.get();
                uge ugeVar = (uge) dyoVar40.qz.get();
                Object obj4 = dyoVar40.qA.get();
                ugh ughVar = (ugh) dyoVar40.qD.get();
                uqb uqbVar = (uqb) dyoVar40.qE.get();
                umr umrVar = (umr) obj3;
                return new ufz(ufwVar, ujeVar, (ugb) obj, (uga) obj2, ugbVar, ugcVar, ugeVar, (ugg) obj4, ughVar, (ues) dyoVar40.qC.get(), null);
            case 1164:
                dyo dyoVar41 = this.a;
                return new ufw((ucj) dyoVar41.qc.get(), (ufv) dyoVar41.qj.get());
            case 1165:
                dyo dyoVar42 = this.a;
                Context context5 = dyoVar42.b.a;
                ucj ucjVar = (ucj) dyoVar42.qc.get();
                urq urqVar = (urq) dyoVar42.qi.get();
                return new ugi(context5, (ufl) dyoVar42.qe.get());
            case 1166:
                ucj ucjVar2 = (ucj) this.a.qc.get();
                return new urq();
            case 1167:
                dyo dyoVar43 = this.a;
                ujg ujgVar = new ujg();
                ujgVar.a = (ujh) dyoVar43.qn.get();
                return ujgVar;
            case 1168:
                dyo dyoVar44 = this.a;
                return new ujh((uhz) dyoVar44.ql.get(), (ucj) dyoVar44.qc.get(), axot.a(dyoVar44.qm));
            case 1169:
                dyo dyoVar45 = this.a;
                uhz uhzVar = new uhz();
                uhzVar.a = dyoVar45.b.a;
                return uhzVar;
            case 1170:
                return new agap((yqw) this.a.fB.get());
            case 1171:
                dyo dyoVar46 = this.a;
                return new ugb((ucj) dyoVar46.qc.get(), (ufv) dyoVar46.qj.get(), (ufu) dyoVar46.qs.get());
            case 1172:
                dyo dyoVar47 = this.a;
                return new ugf(dyoVar47.b.a, (ucj) dyoVar47.qc.get(), (uhe) dyoVar47.qp.get(), new ufx(axpa.a, dyoVar47.qq), (ugd) dyoVar47.qr.get());
            case 1173:
                dyo dyoVar48 = this.a;
                uhk uhkVar = new uhk();
                uhkVar.a = dyoVar48.b.a;
                uhkVar.b = (ucj) dyoVar48.qc.get();
                return uhkVar;
            case 1174:
                aopa createBuilder = aomm.a.createBuilder();
                if (axqk.e() && (c = ujr.c(axqk.c().b)) != 0 && c != 1) {
                    aopa createBuilder2 = aoml.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    aoml aomlVar = (aoml) createBuilder2.instance;
                    aomlVar.b |= 1;
                    aomlVar.c = true;
                    createBuilder.copyOnWrite();
                    aomm aommVar = (aomm) createBuilder.instance;
                    aoml aomlVar2 = (aoml) createBuilder2.mo39build();
                    aomlVar2.getClass();
                    aommVar.c = aomlVar2;
                    aommVar.b = 1 | aommVar.b;
                }
                aomm aommVar2 = (aomm) createBuilder.mo39build();
                axzl.o(aommVar2);
                return amvn.r(aommVar2);
            case 1175:
                return new ugd(this.a.b.a);
            case 1176:
                dyo dyoVar49 = this.a;
                return new uga((ucj) dyoVar49.qc.get(), (ufv) dyoVar49.qj.get());
            case 1177:
                dyo dyoVar50 = this.a;
                return new ugb((ucj) dyoVar50.qc.get(), (ufu) dyoVar50.qs.get(), (ufv) dyoVar50.qj.get());
            case 1178:
                dyo dyoVar51 = this.a;
                ucj ucjVar3 = (ucj) dyoVar51.qc.get();
                ufu ufuVar = (ufu) dyoVar51.qs.get();
                ufv ufvVar = (ufv) dyoVar51.qj.get();
                return new umn();
            case 1179:
                dyo dyoVar52 = this.a;
                return new ugc((ucj) dyoVar52.qc.get(), (ufu) dyoVar52.qs.get(), (ufv) dyoVar52.qj.get());
            case 1180:
                dyo dyoVar53 = this.a;
                ucj ucjVar4 = (ucj) dyoVar53.qc.get();
                ufv ufvVar2 = (ufv) dyoVar53.qj.get();
                return new umr();
            case 1181:
                dyo dyoVar54 = this.a;
                return new uge((ucj) dyoVar54.qc.get(), (ufl) dyoVar54.qe.get(), (ufv) dyoVar54.qj.get());
            case 1182:
                dyo dyoVar55 = this.a;
                return new ugg((ucj) dyoVar55.qc.get(), (ufv) dyoVar55.qj.get());
            case 1183:
                dyo dyoVar56 = this.a;
                ucj ucjVar5 = (ucj) dyoVar56.qc.get();
                ufl uflVar2 = (ufl) dyoVar56.qe.get();
                ufu ufuVar2 = (ufu) dyoVar56.qs.get();
                ufv ufvVar3 = (ufv) dyoVar56.qj.get();
                urq urqVar2 = (urq) dyoVar56.qi.get();
                return new ugh(ucjVar5, uflVar2, ufuVar2, ufvVar3, (ues) dyoVar56.qC.get());
            case 1184:
                return this.a.aF();
            case 1185:
                return new trz();
            case 1186:
                dyo dyoVar57 = this.a;
                ueh uehVar = new ueh();
                uehVar.a = dyoVar57.b.a;
                uehVar.b = dyoVar57.ic();
                return uehVar;
            case 1187:
                ucj ucjVar6 = (ucj) this.a.qc.get();
                return new uqb();
            case 1188:
                dyo dyoVar58 = this.a;
                return new ugy((ufe) dyoVar58.rb.get(), (ucs) dyoVar58.qb.get(), (udc) dyoVar58.rc.get(), (ufc) dyoVar58.qU.get(), (ues) dyoVar58.qC.get(), amyg.a, dyoVar58.au());
            case 1189:
                dyo dyoVar59 = this.a;
                return new ufh((uee) dyoVar59.qB.get(), (uff) dyoVar59.qV.get(), (ufi) dyoVar59.qW.get(), new ufj((ufs) dyoVar59.qF.get(), (ugx) dyoVar59.qY.get(), (ufc) dyoVar59.qU.get(), axot.a(dyoVar59.ra)));
            case 1190:
                return this.a.hb();
            case 1191:
                dyo dyoVar60 = this.a;
                return new ufd((uhh) dyoVar60.qR.get(), axot.a(axpa.a), axot.a(dyoVar60.qT), (ues) dyoVar60.qC.get(), dyoVar60.au());
            case 1192:
                dyo dyoVar61 = this.a;
                return new uhp(dyoVar61.b.a, ampq.j((uit) dyoVar61.qG.get()), (uhf) dyoVar61.qN.get(), (ude) dyoVar61.qP.get(), (uhe) dyoVar61.qp.get(), (uhm) dyoVar61.qK.get(), (ues) dyoVar61.qC.get(), (ucj) dyoVar61.qc.get(), amup.k(1, (uii) dyoVar61.qQ.get()), dyoVar61.au());
            case 1193:
                return new agaw(Optional.of(this.a.cg()), afku.j(), null, null);
            case 1194:
                return new uho((uhj) this.a.qM.get());
            case 1195:
                dyo dyoVar62 = this.a;
                return new uhj(dyoVar62.b.a, (ucj) dyoVar62.qc.get(), (uex) dyoVar62.qH.get(), (uhm) dyoVar62.qK.get(), axot.a(dyoVar62.qL), (uhe) dyoVar62.qp.get(), (ues) dyoVar62.qC.get());
            case 1196:
                dyo dyoVar63 = this.a;
                uey ueyVar = new uey();
                ueyVar.a = dyoVar63.b.a;
                return ueyVar;
            case 1197:
                dyo dyoVar64 = this.a;
                return new uhm(dyoVar64.b.a, (ucj) dyoVar64.qc.get(), ampq.j((uis) dyoVar64.qJ.get()));
            case 1198:
                return new agas(this.a.qI);
            case 1199:
                return this.a.f();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object a() {
        amdk amdkVar;
        int i = this.b;
        switch (i) {
            case 0:
                return egd.i((abfh) this.a.r.get());
            case 1:
                dyo dyoVar = this.a;
                return yrn.n(dyoVar.k, dyoVar.q);
            case 2:
                dyo dyoVar2 = this.a;
                return aaly.d(dyoVar2.b.a, dyo.jp(), (ankw) dyoVar2.h.get(), (vlk) dyoVar2.j.get());
            case 3:
                return wpp.l(amon.a, (ankx) this.a.g.get());
            case 4:
                dyo dyoVar3 = this.a;
                ankx ankxVar = (ankx) dyoVar3.f.get();
                axzl.o(ankxVar);
                dyoVar3.jd();
                return i.b(ankxVar, ampq.j(false), dyo.jf());
            case 5:
                dyo dyoVar4 = this.a;
                return txr.a((ankx) dyoVar4.d.get(), snr.b(ampq.j(16)), amon.a, dyoVar4.av(), ampq.j((yxm) dyoVar4.e.get()));
            case 6:
                return ooq.b(dyo.jf());
            case 7:
                return new yxm();
            case 8:
                dyo dyoVar5 = this.a;
                return yrn.f((Executor) dyoVar5.h.get(), (vjb) dyoVar5.i.get());
            case 9:
                return yvv.c(this.a.b.a);
            case 10:
                dyo dyoVar6 = this.a;
                return ((yke) dyoVar6.p.get()).b(dyoVar6.l);
            case 11:
                dyo dyoVar7 = this.a;
                return aaly.c(dyoVar7.b.a, dyo.jp(), (ankw) dyoVar7.h.get(), (vlk) dyoVar7.j.get());
            case 12:
                dyo dyoVar8 = this.a;
                return wze.d((Executor) dyoVar8.h.get(), (yjt) dyoVar8.m.get(), (Runnable) dyoVar8.o.get());
            case 13:
                return yie.d();
            case 14:
                return yie.e((Runnable) this.a.n.get());
            case 15:
                final Context context = this.a.b.a;
                return new Runnable() { // from class: efu
                    @Override // java.lang.Runnable
                    public final void run() {
                        YouTubeBackupAgent.e(context);
                    }
                };
            case 16:
                return egd.e((isi) this.a.ba.get());
            case 17:
                dyo dyoVar9 = this.a;
                return new isi(dyoVar9.b.a, (SharedPreferences) dyoVar9.t.get(), dyoVar9.u, axot.a(dyoVar9.H), dyoVar9.aZ, dyoVar9.r);
            case 18:
                return wpp.i(this.a.b.a, dyo.jp());
            case 19:
                arot x = egd.x();
                axzl.o(x);
                return x;
            case 20:
                dyo dyoVar10 = this.a;
                return new acqx(dyoVar10.b.a, (aacz) dyoVar10.D.get(), (yuu) dyoVar10.E.get(), (snc) dyoVar10.v.get(), (ScheduledExecutorService) dyoVar10.h.get(), axot.a(dyoVar10.G));
            case 21:
                return aabv.c((aaau) this.a.C.get());
            case 22:
                dyo dyoVar11 = this.a;
                return new aaau((SharedPreferences) dyoVar11.t.get(), (snc) dyoVar11.v.get(), dyoVar11.y, (ywk) dyoVar11.B.get(), dyoVar11.b.a);
            case 23:
                return opf.c();
            case 24:
                dyo dyoVar12 = this.a;
                return new yni((Executor) dyoVar12.x.get(), (snc) dyoVar12.v.get());
            case 25:
                return ooq.c((snc) this.a.v.get());
            case 26:
                dyo dyoVar13 = this.a;
                ywm k = sno.k(dyoVar13.b.a, Optional.of((zds) dyoVar13.z.get()), (ScheduledExecutorService) dyoVar13.h.get());
                k.b((ywr) dyoVar13.A.get());
                return k;
            case 27:
                return aapy.b;
            case 28:
                Context context2 = this.a.b.a;
                return yry.e();
            case 29:
                return new yut(this.a.b.a);
            case 30:
                return ajfk.c((Looper) this.a.F.get());
            case 31:
                return opf.d();
            case 32:
                dyo dyoVar14 = this.a;
                return new jvk(new jve(dyoVar14.b.a), dyoVar14.b.a, (wal) dyoVar14.au.get());
            case 33:
                dyo dyoVar15 = this.a;
                Context context3 = dyoVar15.b.a;
                return new vzv((SharedPreferences) dyoVar15.t.get(), (wea) dyoVar15.I.get(), (ywk) dyoVar15.B.get(), dyoVar15.aX, (vzs) dyoVar15.aY.get(), dyoVar15.ax);
            case 34:
                dyo dyoVar16 = this.a;
                return wdw.a(dyoVar16.t, (aacz) dyoVar16.D.get(), dyoVar16.b.a, (ankw) dyoVar16.h.get(), (vlk) dyoVar16.j.get(), dyo.jp());
            case 35:
                return aabv.j((acrr) this.a.aw.get());
            case 36:
                dyo dyoVar17 = this.a;
                Context context4 = dyoVar17.b.a;
                afzk afzkVar = (afzk) dyoVar17.ak.get();
                return wjv.e(dyoVar17.f197J.get(), (afug) dyoVar17.at.get(), (afvn) dyoVar17.au.get(), (snc) dyoVar17.v.get(), (zah) dyoVar17.av.get(), (ykw) dyoVar17.Z.get(), Optional.empty());
            case 37:
                dyo dyoVar18 = this.a;
                return yrn.o((aacz) dyoVar18.D.get(), (snc) dyoVar18.v.get());
            case 38:
                dyo dyoVar19 = this.a;
                afso afsoVar = (afso) dyoVar19.N.get();
                afuj afujVar = (afuj) dyoVar19.ad.get();
                afuf afufVar = (afuf) dyoVar19.af.get();
                yjs yjsVar = (yjs) dyoVar19.ai.get();
                afzk afzkVar2 = (afzk) dyoVar19.ak.get();
                return wjs.h(afsoVar, afujVar, afufVar, yjsVar, (snc) dyoVar19.v.get(), (yrj) dyoVar19.as.get());
            case 39:
                return adyg.m((yme) this.a.M.get());
            case 40:
                return wxf.c((yme) this.a.L.get());
            case 41:
                return new aada(this.a.D);
            case 42:
                return aabv.d((aaau) this.a.C.get());
            case 43:
                dyo dyoVar20 = this.a;
                afuj afujVar2 = ((ywk) dyoVar20.B.get()).c(ywk.S) == 1 ? (afuj) dyoVar20.ac.get() : (afuj) dyoVar20.aa.get();
                axzl.o(afujVar2);
                return afujVar2;
            case 44:
                dyo dyoVar21 = this.a;
                afso afsoVar2 = (afso) dyoVar21.N.get();
                return aasx.i((afum) dyoVar21.aa.get(), (afun) dyoVar21.ab.get(), (ywk) dyoVar21.B.get());
            case 45:
                dyo dyoVar22 = this.a;
                return aasx.j((afso) dyoVar22.N.get(), (snc) dyoVar22.v.get(), (ymq) dyoVar22.P.get(), (ykw) dyoVar22.Z.get());
            case 46:
                dyo dyoVar23 = this.a;
                return adzp.d(dyoVar23.b.a, (String) dyoVar23.O.get(), amon.a);
            case 47:
                return "com.google.android.libraries.youtube.net.delayedevents.DelayedEventStore";
            case 48:
                dyo dyoVar24 = this.a;
                azqb azqbVar = dyoVar24.Y;
                return new ykw((ywk) dyoVar24.B.get(), (ScheduledExecutorService) dyoVar24.h.get(), (Executor) dyoVar24.h.get(), azqbVar, azqbVar);
            case 49:
                dyo dyoVar25 = this.a;
                return wze.g(dyoVar25.hY(), dyoVar25.b.a, dyo.jf());
            case 50:
                dyo dyoVar26 = this.a;
                return new yxe(dyoVar26.h, dyoVar26.Q, dyoVar26.T, dyoVar26.U, dyoVar26.V, (snc) dyoVar26.v.get(), (zdb) dyoVar26.W.get(), (ywk) dyoVar26.B.get(), (yxm) dyoVar26.e.get(), null, null);
            case 51:
                dyo dyoVar27 = this.a;
                return wze.e(dyoVar27.hY(), dyoVar27.b.a, dyo.jf());
            case 52:
                dyo dyoVar28 = this.a;
                return wze.f(amvn.r((ylo) dyoVar28.S.get()), dyoVar28.b.a, dyo.jf());
            case 53:
                dyo dyoVar29 = this.a;
                Context context5 = dyoVar29.b.a;
                return wpp.m(dyoVar29.R);
            case 54:
                return new ylb((Executor) this.a.x.get());
            case 55:
                return new ylc();
            case 56:
                Context context6 = this.a.b.a;
                return new ylq(2, new yli(8, "initCrit"));
            case 57:
                return new ykv(((ywk) this.a.B.get()).c(ywk.I));
            case 58:
                ywk ywkVar = (ywk) this.a.B.get();
                return new zdb();
            case 59:
                return afku.a();
            case 60:
                dyo dyoVar30 = this.a;
                amup v = egd.v();
                axzl.o(v);
                return new afuf((yme) dyoVar30.M.get(), v, (yve) dyoVar30.ae.get());
            case 61:
                dyo dyoVar31 = this.a;
                return adzp.i(dyoVar31.b.a, (ankw) dyoVar31.h.get(), (vlk) dyoVar31.j.get());
            case 62:
                dyo dyoVar32 = this.a;
                return wpp.k(dyoVar32.ag, (yjr) dyoVar32.ah.get());
            case 63:
                return brq.h(this.a.b.a);
            case 64:
                return new yjq();
            case 65:
                return ahdx.b(this.a.aj);
            case 66:
                dyo dyoVar33 = this.a;
                return adxx.q(dyoVar33.b.a, dyoVar33.j);
            case 67:
                dyo dyoVar34 = this.a;
                ConnectivityManager j = dyoVar34.j();
                azqb azqbVar2 = dyoVar34.ar;
                Executor executor = (Executor) dyoVar34.h.get();
                return txr.i((yug) dyoVar34.am.get(), j, azqbVar2, dyoVar34.ao.get());
            case 68:
                dyo dyoVar35 = this.a;
                return new yuf(dyoVar35.j(), amgf.b(dyoVar35.b.a), (zdj) dyoVar35.al.get());
            case 69:
                return yry.f(this.a.b.a);
            case 70:
                dyo dyoVar36 = this.a;
                return sno.j(dyoVar36.y, dyoVar36.ao.get(), (axxb) dyoVar36.ap.get(), (ayor) dyoVar36.aq.get());
            case 71:
                dyo dyoVar37 = this.a;
                return wze.h(dyoVar37.b.a, (yme) dyoVar37.M.get(), (Handler) dyoVar37.an.get());
            case 72:
                return wxf.d(this.a.b.a);
            case 73:
                dyo dyoVar38 = this.a;
                return new axxb((aacz) dyoVar38.D.get(), (aadd) dyoVar38.K.get());
            case 74:
                dyo dyoVar39 = this.a;
                return wpp.n((Executor) dyoVar39.h.get(), (ywk) dyoVar39.B.get());
            case 75:
                return new zah((snc) this.a.v.get());
            case 76:
                dyo dyoVar40 = this.a;
                return new whc((amag) dyoVar40.aT.get(), dyoVar40.gi(), (amcj) dyoVar40.aV.get(), (ankw) dyoVar40.aA.get(), (Executor) dyoVar40.x.get());
            case 77:
                dyo dyoVar41 = this.a;
                return new amak(new alzw(dyoVar41.gi()), ampq.j(dyoVar41.aW), (ankx) dyoVar41.w.get());
            case 78:
                dyo dyoVar42 = this.a;
                ankw gv = dyoVar42.gv();
                Context context7 = dyoVar42.b.a;
                azqb azqbVar3 = dyoVar42.ay;
                azqb azqbVar4 = dyoVar42.g;
                azqb azqbVar5 = dyoVar42.aA;
                vne vneVar = (vne) dyoVar42.aC.get();
                if (((Boolean) ((ampv) ampq.j(amhv.b())).a).booleanValue()) {
                    ankw ankwVar = (ankw) azqbVar3.get();
                    amdkVar = new amdk(context7, (ankw) azqbVar3.get(), vneVar);
                } else {
                    ankw ankwVar2 = (ankw) azqbVar5.get();
                    amdkVar = new amdk(context7, (ankw) azqbVar4.get(), vneVar);
                }
                dyoVar42.jv();
                amdn amdnVar = new amdn(gv, amdkVar);
                dyoVar42.jv();
                dyoVar42.gv();
                amcu amcuVar = new amcu();
                ankw gv2 = dyoVar42.gv();
                amif a = amig.a();
                a.a = "AccountData";
                a.b(amdp.a);
                amdi amdiVar = new amdi(amdnVar.b, amdnVar);
                if (a.c == null) {
                    a.c = amuk.f();
                }
                a.c.h(amdiVar);
                a.d = amcuVar;
                a.f = gv2;
                return dyoVar42.gn().a(a.a(), (vjb) dyoVar42.aB.get());
            case 79:
                dyo dyoVar43 = this.a;
                ankx gw = dyoVar43.gw();
                dyoVar43.jd();
                return i.c(gw, ampq.j(false), dyo.jf());
            case 80:
                dyo dyoVar44 = this.a;
                return i.e((ankx) dyoVar44.d.get(), dyoVar44.av(), ampq.j((yxm) dyoVar44.e.get()));
            case 81:
                dyo dyoVar45 = this.a;
                ankx ankxVar2 = (ankx) dyoVar45.az.get();
                axzl.o(ankxVar2);
                dyoVar45.jd();
                return i.d(ankxVar2, ampq.j(false), dyo.jf());
            case 82:
                dyo dyoVar46 = this.a;
                return sno.a((ankx) dyoVar46.d.get(), snr.c(), dyoVar46.av(), amon.a, ampq.j((yxm) dyoVar46.e.get()));
            case 83:
                dyo dyoVar47 = this.a;
                ankw gv3 = dyoVar47.gv();
                amif a2 = amig.a();
                a2.a = "TikTokAccountStoreMigration";
                a2.b(amdr.a);
                a2.f = gv3;
                return dyoVar47.gn().a(a2.a(), (vjb) dyoVar47.aB.get());
            case 84:
                return new amid(this.a.b.a);
            case 85:
                Context context8 = this.a.b.a;
                sre.c();
                return new vjb(amuk.r(vje.q(context8).a()));
            case 86:
                dyo dyoVar48 = this.a;
                final amgk amgkVar = (amgk) dyoVar48.aD.get();
                ambt ambtVar = new ambt() { // from class: amcp
                    @Override // defpackage.ambt
                    public final ankt a() {
                        amgk amgkVar2 = amgk.this;
                        ankt q = anlz.q(null);
                        amgkVar2.a(q);
                        return q;
                    }
                };
                final amjh amjhVar = (amjh) dyoVar48.aS.get();
                return amvn.s(ambtVar, new ambt() { // from class: amjr
                    @Override // defpackage.ambt
                    public final ankt a() {
                        return amjh.this.d();
                    }
                });
            case 87:
                return new amgk(null);
            case 88:
                dyo dyoVar49 = this.a;
                return new amjh((snc) dyoVar49.v.get(), dyoVar49.b.a, (ankw) dyoVar49.g.get(), (ankx) dyoVar49.g.get(), (amee) dyoVar49.aI.get(), ampq.j(dyoVar49.gi()), (amjo) dyoVar49.aJ.get(), amyg.a, amyg.a, amup.m(amil.ON_CHARGER, dyoVar49.aL, amil.ON_NETWORK_CONNECTED, dyoVar49.aN, amil.ON_NETWORK_UNMETERED, dyoVar49.aP), new amke((amfr) dyoVar49.aQ.get(), new amjz((snc) dyoVar49.v.get(), (amjo) dyoVar49.aJ.get(), new amjs(dyoVar49.aR), (ankw) dyoVar49.g.get()), (snc) dyoVar49.v.get(), (Executor) dyoVar49.aA.get()));
            case 89:
                dyo dyoVar50 = this.a;
                Context context9 = dyoVar50.b.a;
                PowerManager powerManager = (PowerManager) context9.getSystemService("power");
                axzl.o(powerManager);
                amef amefVar = (amef) dyoVar50.aE.get();
                ankx ankxVar3 = (ankx) dyoVar50.w.get();
                ameq ameqVar = (ameq) dyoVar50.aG.get();
                return new amee(context9, powerManager, ankxVar3, amup.k("main_process_service_key", dyoVar50.aH), (ankx) dyoVar50.g.get(), (ankx) dyoVar50.ay.get(), dyoVar50.aX());
            case 90:
                Context context10 = this.a.b.a;
                return new amef();
            case 91:
                dyo dyoVar51 = this.a;
                axzl.o((NotificationManager) dyoVar51.b.a.getSystemService("notification"));
                return new ameq(dyoVar51.b.a, (ameh) dyoVar51.aF.get(), (Executor) dyoVar51.g.get());
            case 92:
                return new ameh();
            case 93:
                return AndroidFuturesService.class;
            case 94:
                dyo dyoVar52 = this.a;
                return new amjo(dyoVar52.b.a, (ankw) dyoVar52.g.get(), (snc) dyoVar52.v.get());
            case 95:
                amiq amiqVar = (amiq) this.a.aK.get();
                axzl.o(amiqVar);
                return amiqVar;
            case 96:
                return new amiq(this.a.b.a);
            case 97:
                amir amirVar = (amir) this.a.aM.get();
                axzl.o(amirVar);
                return amirVar;
            case 98:
                dyo dyoVar53 = this.a;
                return new amir(dyoVar53.b.a, dyoVar53.j(), 1);
            case 99:
                amir amirVar2 = (amir) this.a.aO.get();
                axzl.o(amirVar2);
                return amirVar2;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.b;
        boolean z = false;
        switch (i) {
            case 1000:
                dyo dyoVar = this.a;
                acux acuxVar = (((ywk) dyoVar.B.get()).c(ywk.E) & 65536) != 0 ? (acux) dyoVar.nr.get() : (acux) dyoVar.nt.get();
                axzl.o(acuxVar);
                return acuxVar;
            case 1001:
                dyo dyoVar2 = this.a;
                return new acuz(amvn.s((acuw) dyoVar2.np.get(), (acuw) dyoVar2.ns.get()));
            case 1002:
                dyo dyoVar3 = this.a;
                return new etn(dyoVar3.no, (yni) dyoVar3.y.get());
            case 1003:
                dyo dyoVar4 = this.a;
                edw edwVar = (edw) (((efz) dyoVar4.cQ.get()).a ? dyoVar4.nr.get() : dyoVar4.nq.get());
                axzl.o(edwVar);
                return edwVar;
            case 1004:
                return new edx(this.a.b.a);
            case 1005:
                return new edy(this.a.b.a);
            case 1006:
                dyo dyoVar5 = this.a;
                return new ite(dyoVar5.kn, (snc) dyoVar5.v.get(), (etq) dyoVar5.nu.get(), (aacz) dyoVar5.D.get(), (aadd) dyoVar5.K.get(), dyoVar5.oh, dyoVar5.lS, dyoVar5.as, (Executor) dyoVar5.x.get(), (Executor) dyoVar5.Q.get(), (ayor) dyoVar5.iz.get(), (ScheduledExecutorService) dyoVar5.h.get(), new jne((yrj) dyoVar5.as.get(), dyoVar5.D(), dyoVar5.oi, dyoVar5.kG), dyoVar5.D(), (axxh) dyoVar5.kG.get());
            case 1007:
                dyo dyoVar6 = this.a;
                return new etq((yni) dyoVar6.y.get(), (yxe) dyoVar6.X.get());
            case 1008:
                dyo dyoVar7 = this.a;
                Executor executor = (Executor) dyoVar7.h.get();
                Executor executor2 = (Executor) dyoVar7.x.get();
                return new jnj((ayor) dyoVar7.aq.get(), dyoVar7.ny, dyoVar7.og);
            case 1009:
                dyo dyoVar8 = this.a;
                return new jnk(dyoVar8.kF, dyoVar8.nv, dyoVar8.D, axot.a(dyoVar8.nx), dyoVar8.aw, dyoVar8.kI, dyoVar8.as);
            case 1010:
                return this.a.v();
            case 1011:
                return this.a.ja();
            case 1012:
                dyo dyoVar9 = this.a;
                return new yuk((File) dyoVar9.cS.get(), ((aaay) dyoVar9.bb.get()).b);
            case 1013:
                dyo dyoVar10 = this.a;
                return new jnl(dyoVar10.kI, dyoVar10.gS, dyoVar10.nz);
            case 1014:
                return new jml((jmm) this.a.of.get());
            case 1015:
                dyo dyoVar11 = this.a;
                amum i2 = amup.i(25);
                i2.f(ohn.j(agqv.class, aqfa.class), (jmf) dyoVar11.nB.get());
                i2.f(ohn.j(agqh.class, aqdv.class), new jmh(dyoVar11.b.a));
                i2.f(ohn.j(fcl.class, atfa.class), (jmf) dyoVar11.nC.get());
                i2.f(ohn.j(fcl.class, aslu.class), (jmf) dyoVar11.nD.get());
                i2.f(ohn.j(agqv.class, ater.class), (jmf) dyoVar11.nE.get());
                i2.f(ohn.j(agqo.class, ater.class), (jmf) dyoVar11.nF.get());
                i2.f(ohn.j(agqh.class, ater.class), (jmf) dyoVar11.nG.get());
                i2.f(ohn.j(agqh.class, auqh.class), new jmk(dyoVar11.b.a, dyoVar11.gS, dyoVar11.nz, dyoVar11.K));
                i2.f(ohn.j(agqh.class, aucu.class), new jmj(dyoVar11.b.a, (aadd) dyoVar11.K.get(), dyoVar11.gS, (axxi) dyoVar11.it.get()));
                i2.f(ohn.j(agqv.class, auex.class), new jmr(dyoVar11.b.a, dyoVar11.nz));
                i2.f(ohn.j(agqo.class, auex.class), (jmf) dyoVar11.nH.get());
                i2.f(ohn.j(fcl.class, apke.class), (jmf) dyoVar11.nI.get());
                i2.f(ohn.j(Void.class, aqel.class), (jmf) dyoVar11.nJ.get());
                i2.f(ohn.j(Void.class, avny.class), (jmf) dyoVar11.nK.get());
                i2.f(ohn.j(agqo.class, auxn.class), (jmf) dyoVar11.nL.get());
                i2.f(ohn.j(awjm.class, aqtb.class), (jmf) dyoVar11.nU.get());
                i2.f(ohn.j(awjr.class, aqtb.class), (jmf) dyoVar11.nV.get());
                i2.f(ohn.j(asyq.class, aqtb.class), (jmf) dyoVar11.nW.get());
                i2.f(ohn.j(jbe.class, audg.class), (jmf) dyoVar11.nX.get());
                i2.f(ohn.j(jbc.class, audk.class), (jmf) dyoVar11.nY.get());
                i2.f(ohn.j(jbc.class, auxn.class), (jmf) dyoVar11.nZ.get());
                i2.f(ohn.j(jbc.class, aube.class), (jmf) dyoVar11.oa.get());
                i2.f(ohn.j(jbc.class, asgt.class), (jmf) dyoVar11.ob.get());
                i2.f(ohn.j(agqh.class, kso.class), (jmf) dyoVar11.oc.get());
                i2.f(ohn.j(agqv.class, kso.class), (jmf) dyoVar11.oe.get());
                return new jmm(i2.b());
            case 1016:
                dyo dyoVar12 = this.a;
                return new jmp(dyoVar12.b.a, dyoVar12.nz, (fbx) dyoVar12.nA.get(), (snc) dyoVar12.v.get());
            case 1017:
                return new fbx((aacz) this.a.D.get());
            case 1018:
                dyo dyoVar13 = this.a;
                return new jmo(dyoVar13.gS, dyoVar13.b.a);
            case 1019:
                dyo dyoVar14 = this.a;
                return new jmn(dyoVar14.gS, (fcl) dyoVar14.kI.get(), dyoVar14.b.a);
            case 1020:
                return new jmq();
            case 1021:
                dyo dyoVar15 = this.a;
                return new jms(dyoVar15.nz, dyoVar15.gS);
            case 1022:
                return new jmi();
            case 1023:
                dyo dyoVar16 = this.a;
                return new jmt(dyoVar16.nz, dyoVar16.gS);
            case 1024:
                return new jmd(this.a.b.a);
            case 1025:
                return new jmv(this.a.b.a);
            case 1026:
                return new jmw(this.a.b.a);
            case 1027:
                return new jmu(this.a.b.a);
            case 1028:
                dyo dyoVar17 = this.a;
                return new jlu((jgn) dyoVar17.nS.get(), dyoVar17.nT);
            case 1029:
                dyo dyoVar18 = this.a;
                return new jgn(dyoVar18.b.a, (aadd) dyoVar18.K.get(), (ankw) dyoVar18.h.get(), (axxa) dyoVar18.nM.get(), (axwt) dyoVar18.nN.get(), (jgo) dyoVar18.nR.get());
            case 1030:
                dyo dyoVar19 = this.a;
                aadd aaddVar = (aadd) dyoVar19.K.get();
                return new axxa((aacz) dyoVar19.D.get());
            case 1031:
                dyo dyoVar20 = this.a;
                return new axwt((aacz) dyoVar20.D.get(), (aadd) dyoVar20.K.get());
            case 1032:
                dyo dyoVar21 = this.a;
                return new jgo(dyoVar21.b.a, dyoVar21.y, (jgz) dyoVar21.nQ.get());
            case 1033:
                dyo dyoVar22 = this.a;
                return new jgz(dyoVar22.b.a, (ankw) dyoVar22.h.get(), new jgu((tdb) dyoVar22.nO.get(), (gfr) dyoVar22.nP.get(), (gfu) dyoVar22.eA.get(), (ankw) dyoVar22.h.get()), (aapv) dyoVar22.eq.get(), (afvn) dyoVar22.au.get());
            case 1034:
                dyo dyoVar23 = this.a;
                Context context = dyoVar23.b.a;
                return new aage(dyoVar23.dA, (aagi) dyoVar23.dD.get());
            case 1035:
                return new gfq((tdb) this.a.nO.get());
            case 1036:
                return new fci();
            case 1037:
                return new jlv((jgn) this.a.nS.get());
            case 1038:
                return new jme((jgn) this.a.nS.get());
            case 1039:
                dyo dyoVar24 = this.a;
                return new jlx(dyoVar24.b.a, (aadd) dyoVar24.K.get(), dyoVar24.nz);
            case 1040:
                return new jlz();
            case 1041:
                return new jma(this.a.b.a);
            case 1042:
                return new jly(this.a.b.a);
            case 1043:
                return new jmc(this.a.nz);
            case 1044:
                return new ksp(this.a.gS);
            case 1045:
                return new ksq(this.a.ac());
            case 1046:
                return new fcd();
            case 1047:
                return new ohn();
            case 1048:
                dyo dyoVar25 = this.a;
                final Context context2 = dyoVar25.b.a;
                final yve yveVar = (yve) dyoVar25.ok.get();
                ankt r = anlz.r(anii.h(yveVar.a(), new ampg() { // from class: zfj
                    @Override // defpackage.ampg
                    public final Object apply(Object obj) {
                        Context context3 = context2;
                        yve yveVar2 = yveVar;
                        String str = ((aoud) obj).c;
                        String c = zfm.c(context3.getApplicationContext());
                        boolean z2 = !c.equals(str);
                        if (z2) {
                            ylx.m(yveVar2.b(new wdx(c, 8)), ngc.m);
                        }
                        return Boolean.valueOf(z2);
                    }
                }, anjk.a));
                axzl.o(r);
                return r;
            case 1049:
                dyo dyoVar26 = this.a;
                Context context3 = dyoVar26.b.a;
                vjf a = vjg.a(context3);
                a.e("common");
                a.f("common_settings.pb");
                Uri a2 = a.a();
                vli a3 = vlj.a();
                a3.e(aoud.a);
                a3.f(a2);
                vlo d = vlr.d(context3, (ankw) dyoVar26.h.get());
                d.c = dyo.jp();
                d.b();
                d.d("version");
                d.e(fdg.o);
                a3.b(d.a());
                return new yvc(vmu.b(((vlk) dyoVar26.j.get()).a(a3.a())), aoud.a);
            case 1050:
                if (((SharedPreferences) this.a.t.get()).getString("visitor_id", null) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1051:
                dyo dyoVar27 = this.a;
                return new afuw((Executor) dyoVar27.h.get(), dyoVar27.hL, axot.a(dyoVar27.hx), (yme) dyoVar27.M.get(), dyoVar27.fp, amon.a);
            case 1052:
                dyo dyoVar28 = this.a;
                return new acrk(dyoVar28.b.a, (snc) dyoVar28.v.get(), dyoVar28.fg);
            case 1053:
                dyo dyoVar29 = this.a;
                return yrn.l((Executor) dyoVar29.h.get(), (afuw) dyoVar29.on.get());
            case 1054:
                return new akhf((snc) this.a.v.get());
            case 1055:
                return new akhi();
            case 1056:
                return new akid((File) this.a.cS.get());
            case 1057:
                dyo dyoVar30 = this.a;
                return new WatchVideoIndexer(new gpi(new ndc((afvn) dyoVar30.au.get(), (vzc) dyoVar30.hY.get()), null), (agbu) dyoVar30.lY.get(), dyoVar30.b.a, (yni) dyoVar30.y.get(), (airw) dyoVar30.fP.get(), (aacz) dyoVar30.D.get());
            case 1058:
                return new akum(this.a.y);
            case 1059:
                dyo dyoVar31 = this.a;
                return new akuw(dyoVar31.ov, dyoVar31.D, dyoVar31.aA, dyoVar31.y);
            case 1060:
                return rtd.b(this.a.b.a);
            case 1061:
                dyo dyoVar32 = this.a;
                return new aktf(dyoVar32.af, (snc) dyoVar32.v.get());
            case 1062:
                dyo dyoVar33 = this.a;
                return new aktg((afug) dyoVar33.at.get(), (snc) dyoVar33.v.get());
            case 1063:
                return this.a.fF();
            case 1064:
                dyo dyoVar34 = this.a;
                return new afxg(dyoVar34.as, dyoVar34.fD, dyoVar34.v);
            case 1065:
                dyo dyoVar35 = this.a;
                return amvn.s((exn) dyoVar35.oB.get(), (exn) dyoVar35.oC.get());
            case 1066:
                return new exm(new ymi((snc) this.a.v.get()));
            case 1067:
                dyo dyoVar36 = this.a;
                return new exp(dyoVar36.b.a, (snc) dyoVar36.v.get());
            case 1068:
                dyo dyoVar37 = this.a;
                return new aggc(dyoVar37.lo, dyoVar37.gS, dyoVar37.oF, ampq.j((aguo) dyoVar37.oG.get()));
            case 1069:
                dyo dyoVar38 = this.a;
                return new agtc((agsd) dyoVar38.lo.get(), (snc) dyoVar38.v.get(), (aynx) dyoVar38.oE.get());
            case 1070:
                return ahdx.N((aidn) this.a.eQ.get());
            case 1071:
                dyo dyoVar39 = this.a;
                return new aguo((agrf) dyoVar39.gS.get(), (aynx) dyoVar39.oE.get(), (ayor) dyoVar39.aq.get(), (axwu) dyoVar39.gZ.get());
            case 1072:
                dyo dyoVar40 = this.a;
                return new gsz((aagi) dyoVar40.dD.get(), (aahf) dyoVar40.dK.get(), (Executor) dyoVar40.h.get());
            case 1073:
                dyo dyoVar41 = this.a;
                return new gtu((aagi) dyoVar41.dD.get(), (afvn) dyoVar41.au.get(), axot.a(dyoVar41.kC), (Executor) dyoVar41.h.get(), dyoVar41.y, dyoVar41.D);
            case 1074:
                dyo dyoVar42 = this.a;
                return new jcq(dyoVar42.oK, dyoVar42.y, dyoVar42.gS, dyoVar42.dD, (Executor) dyoVar42.h.get(), dyoVar42.ef, dyoVar42.oQ, dyoVar42.oY, dyoVar42.pb, dyoVar42.pc, dyoVar42.aq);
            case 1075:
                dyo dyoVar43 = this.a;
                Executor executor3 = (Executor) dyoVar43.h.get();
                return (((ywk) dyoVar43.B.get()).c(ywk.K) & 4) != 0 ? new azmw(anlz.g(executor3)) : azpj.b(anlz.g(executor3));
            case 1076:
                dyo dyoVar44 = this.a;
                return amvn.v((jap) dyoVar44.oL.get(), (jap) dyoVar44.oM.get(), (jap) dyoVar44.oN.get(), (jap) dyoVar44.oO.get(), (jap) dyoVar44.oP.get());
            case 1077:
                return new jbf();
            case 1078:
                return new jdc(this.a.gS);
            case 1079:
                return new jdd();
            case 1080:
                return new jde((aagi) this.a.dD.get());
            case 1081:
                dyo dyoVar45 = this.a;
                return new jdi(dyoVar45.gS, (axxh) dyoVar45.kG.get());
            case 1082:
                dyo dyoVar46 = this.a;
                return amvn.w((jau) dyoVar46.oR.get(), (jau) dyoVar46.oS.get(), (jau) dyoVar46.oT.get(), (jau) dyoVar46.oU.get(), (jau) dyoVar46.oV.get(), (jau) dyoVar46.oW.get(), (jau) dyoVar46.oX.get());
            case 1083:
                return new jao(this.a.gS);
            case 1084:
                return new jcr();
            case 1085:
                return new jcs((aacz) this.a.D.get());
            case 1086:
                return new jct(this.a.gS);
            case 1087:
                return new jcv(this.a.gS);
            case 1088:
                return new jcx();
            case 1089:
                return new jcz();
            case 1090:
                dyo dyoVar47 = this.a;
                return amvn.v((jat) dyoVar47.oZ.get(), (jat) dyoVar47.pa.get(), new jda(), new jdf(dyoVar47.nT), new jdg());
            case 1091:
                return new jax();
            case 1092:
                return new jcy();
            case 1093:
                return new fbt((aacz) this.a.D.get());
            case 1094:
                dyo dyoVar48 = this.a;
                return new jhp(dyoVar48.dD, dyoVar48.pe, dyoVar48.pf, dyoVar48.pg, dyoVar48.y, dyoVar48.aq);
            case 1095:
                dyo dyoVar49 = this.a;
                return new jhm((aagi) dyoVar49.dD.get(), (aahf) dyoVar49.dK.get(), (fbw) dyoVar49.le.get(), dyoVar49.hO(), dyoVar49.hP(), dyoVar49.aq);
            case 1096:
                dyo dyoVar50 = this.a;
                return new jiv((aagi) dyoVar50.dD.get(), dyoVar50.ad(), dyoVar50.ae(), dyoVar50.af(), dyoVar50.ab(), (yve) dyoVar50.hb.get(), dyoVar50.ac(), (fbx) dyoVar50.nA.get(), (fbw) dyoVar50.le.get());
            case 1097:
                dyo dyoVar51 = this.a;
                return new jig((aahf) dyoVar51.dK.get(), (afvn) dyoVar51.au.get(), dyoVar51.ag(), dyoVar51.ae(), dyoVar51.af(), (yve) dyoVar51.hb.get(), dyoVar51.ac(), (fbw) dyoVar51.le.get());
            case 1098:
                dyo dyoVar52 = this.a;
                return new jis(dyoVar52.b.a, (aagi) dyoVar52.dD.get(), dyoVar52.ad(), dyoVar52.ae(), dyoVar52.af(), dyoVar52.ab(), dyoVar52.ac(), (fbx) dyoVar52.nA.get(), (fbw) dyoVar52.le.get());
            case 1099:
                return this.a.ag();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object m() {
        int i = this.b;
        boolean z = true;
        switch (i) {
            case 300:
                return agni.c();
            case 301:
                return agni.a();
            case 302:
                return agni.b();
            case 303:
                dyo dyoVar = this.a;
                return yrn.j(dyoVar.dA, (aagi) dyoVar.dD.get());
            case 304:
                ajiq ajiqVar = (ajiq) this.a.el.get();
                int i2 = ajjn.a;
                axzl.o(ajiqVar);
                return ajiqVar;
            case 305:
                dyo dyoVar2 = this.a;
                return new ajiq(axot.a(dyoVar2.dX), (aadd) dyoVar2.K.get(), (teb) dyoVar2.dZ.get(), (ajik) dyoVar2.dY.get(), axot.a(dyoVar2.eo));
            case 306:
                dyo dyoVar3 = this.a;
                return sza.o(ampq.j((Boolean) dyoVar3.dQ.get()), ampq.j((Boolean) dyoVar3.dR.get()), dyoVar3.hw(), dyoVar3.dS, ampq.j((Boolean) dyoVar3.dW.get()), ampq.j(Integer.valueOf(dyoVar3.b())));
            case 307:
                dyo dyoVar4 = this.a;
                ajmd ajmdVar = (ajmd) dyoVar4.dP.get();
                Context context = dyoVar4.b.a;
                int i3 = ajjn.a;
                return false;
            case 308:
                Context context2 = this.a.b.a;
                return ajmd.a;
            case 309:
                return new yvc(vmu.b((vne) this.a.dO.get()), awtj.a);
            case 310:
                dyo dyoVar5 = this.a;
                vjf a = vjg.a(dyoVar5.b.a);
                a.e("elements");
                a.f("elements_settings.pb");
                Uri a2 = a.a();
                vli a3 = vlj.a();
                a3.e(awtj.a);
                a3.f(a2);
                return ((vlk) dyoVar5.j.get()).a(a3.a());
            case 311:
                dyo dyoVar6 = this.a;
                ajmd ajmdVar2 = (ajmd) dyoVar6.dP.get();
                Context context3 = dyoVar6.b.a;
                int i4 = ajjn.a;
                return false;
            case 312:
                dyo dyoVar7 = this.a;
                return sza.l(ampq.j((Boolean) dyoVar7.dR.get()), dyoVar7.hw(), dyoVar7.dT, dyoVar7.b.a);
            case 313:
                dyo dyoVar8 = this.a;
                return sza.k(ampq.j((Boolean) dyoVar8.dR.get()), dyoVar8.b.a, dyoVar8.dS, ampq.j(dyoVar8.aw()));
            case 314:
                return Boolean.valueOf(ajjn.p((ajke) this.a.dV.get()));
            case 315:
                return ajjn.e((ajjr) this.a.dU.get());
            case 316:
                dyo dyoVar9 = this.a;
                Context context4 = dyoVar9.b.a;
                return new ajjr(new ajjq((aacz) dyoVar9.D.get()));
            case 317:
                return ajjn.c(this.a.fv());
            case 318:
                return ajjn.d();
            case 319:
                dyo dyoVar10 = this.a;
                return new ajix((teb) dyoVar10.dZ.get(), (aadd) dyoVar10.K.get(), (aacz) dyoVar10.D.get(), axot.a(dyoVar10.ek), dyoVar10.b.a, (ResourceLoaderDelegate) dyoVar10.em.get(), axot.a(dyoVar10.en), ampq.j((Boolean) dyoVar10.dQ.get()));
            case 320:
                dyo dyoVar11 = this.a;
                return new stg(((Boolean) dyoVar11.ed.get()).booleanValue(), (thu) dyoVar11.eh.get(), (ste) axot.a(dyoVar11.ei).get(), dyoVar11.ej, amup.m(arde.class, new ajlv((aacz) dyoVar11.D.get()), ardg.class, new ajlw((aadd) dyoVar11.K.get()), asvp.class, new ajlx((acrr) dyoVar11.aw.get())));
            case 321:
                dyo dyoVar12 = this.a;
                ajjr ajjrVar = (ajjr) dyoVar12.dU.get();
                akwp akwpVar = (akwp) dyoVar12.ec.get();
                ajmd ajmdVar3 = (ajmd) dyoVar12.dP.get();
                Context context5 = dyoVar12.b.a;
                if (!ajjrVar.a().h || !akwpVar.b(ajjrVar.a().i, akvj.ELEMENT_PERF_SAMPLING)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 322:
                dyo dyoVar13 = this.a;
                return new akwn((yve) dyoVar13.ea.get(), axot.a(dyoVar13.eb));
            case 323:
                dyo dyoVar14 = this.a;
                return aqmv.q(dyoVar14.b.a, (ankw) dyoVar14.h.get(), dyo.jp(), (vlk) dyoVar14.j.get());
            case 324:
                return yrn.g((zej) this.a.cX.get(), Optional.empty());
            case 325:
                dyo dyoVar15 = this.a;
                axnm a4 = axot.a(dyoVar15.eg);
                Executor executor = (Executor) dyoVar15.h.get();
                Context context6 = dyoVar15.b.a;
                thu thuVar = (!((Boolean) dyoVar15.ed.get()).booleanValue() || ((ajke) dyoVar15.dV.get()).k != 1) ? thu.a : (thu) a4.get();
                axzl.o(thuVar);
                return thuVar;
            case 326:
                return new ajhf((acvh) this.a.ef.get());
            case 327:
                dyo dyoVar16 = this.a;
                Context context7 = dyoVar16.b.a;
                return new acvf((SharedPreferences) dyoVar16.t.get(), (zfq) dyoVar16.ee.get(), (snc) dyoVar16.v.get(), (acrr) dyoVar16.aw.get(), (Executor) dyoVar16.h.get());
            case 328:
                return new zfq(axot.a(this.a.eb));
            case 329:
                return ajjn.r((aacz) this.a.D.get());
            case 330:
                smc.b();
                JSModuleCache create = JSModuleCache.create();
                if (create == null) {
                    throw new RuntimeException("JS Module Cache not created - was it included in the .so?");
                }
                return create;
            case 331:
                dyo dyoVar17 = this.a;
                return new ajjp((ajiq) dyoVar17.el.get(), (teb) dyoVar17.dZ.get());
            case 332:
                return ajjn.f();
            case 333:
                return new aapp((snc) this.a.v.get());
            case 334:
                dyo dyoVar18 = this.a;
                return aasx.d(dyoVar18.im.get(), dyoVar18.f198io.get(), dyoVar18.ip.get(), (aacb) dyoVar18.iq.get());
            case 335:
                dyo dyoVar19 = this.a;
                return aasx.c((SharedPreferences) dyoVar19.t.get(), dyoVar19.il, dyoVar19.ax, (Executor) dyoVar19.h.get());
            case 336:
                dyo dyoVar20 = this.a;
                return new aaxg((aaqj) dyoVar20.er.get(), (aaqf) dyoVar20.eV.get(), dyoVar20.bJ(), dyoVar20.cj());
            case 337:
                return yry.j(this.a.eU);
            case 338:
                dyo dyoVar21 = this.a;
                amvl j = amvn.j(11);
                j.c(new agbv((agbd) dyoVar21.eu.get(), dyoVar21.b.a, (aadd) dyoVar21.K.get()));
                j.c((aaqw) dyoVar21.ey.get());
                j.c((aaqw) dyoVar21.eB.get());
                Context context8 = dyoVar21.b.a;
                j.c(new aaps());
                j.c(new aaqe((afvn) dyoVar21.au.get()));
                j.c((aaqw) dyoVar21.eF.get());
                j.c((aaqw) dyoVar21.eG.get());
                j.c((aaqw) dyoVar21.eI.get());
                j.j(dyoVar21.hL());
                j.c((aaqw) dyoVar21.eP.get());
                j.c((aaqw) dyoVar21.eT.get());
                return j.g();
            case 339:
                dyo dyoVar22 = this.a;
                return new fap((agcp) dyoVar22.et.get(), (snc) dyoVar22.v.get(), (aadd) dyoVar22.K.get());
            case 340:
                dyo dyoVar23 = this.a;
                return new agcl((SharedPreferences) dyoVar23.t.get(), (yve) dyoVar23.es.get(), (Executor) dyoVar23.x.get());
            case 341:
                dyo dyoVar24 = this.a;
                Context context9 = dyoVar24.b.a;
                azqb azqbVar = dyoVar24.j;
                azqb azqbVar2 = dyoVar24.t;
                ankw ankwVar = (ankw) dyoVar24.h.get();
                vjf a5 = vjg.a(context9);
                a5.e("notification");
                a5.f("notification.pb");
                Uri a6 = a5.a();
                yvh d = yvi.d(azqbVar2, ankwVar);
                d.a = zto.i;
                d.b(adrz.r);
                d.b = adrz.q;
                d.c = agvc.b;
                yvi a7 = d.a();
                vlo d2 = vlr.d(context9, ankwVar);
                d2.d("DeviceContextCache.KEY_PROTO", "DeviceContextCache.KEY_TIMESTAMP", "gcm_registration_id", "com.google.android.libraries.youtube.notification.pref.last_notification_registration_time", "pending_notification_registration", "com.google.android.libraries.youtube.notification.pref.last_os_notifications_enabled", "com.google.android.libraries.youtube.notification.pref.LAST_OS_NOTIFICATIONS_CHANGED_TIME_MS", "com.google.android.libraries.youtube.notification.pref.last_notifications_settings_enabled", "device_context_app_last_opened");
                d2.b();
                d2.c = dyo.jp();
                d2.e(adiz.f);
                vlr a8 = d2.a();
                vli a9 = vlj.a();
                a9.e(awux.a);
                a9.f(a6);
                a9.b(a7);
                a9.b(a8);
                return new yvc(vmu.b(((vlk) azqbVar.get()).a(a9.a())), awux.a);
            case 342:
                dyo dyoVar25 = this.a;
                return new akpy(dyoVar25.ev, dyoVar25.ex, (aacz) dyoVar25.D.get());
            case 343:
                dyo dyoVar26 = this.a;
                return new amfg((aacz) dyoVar26.D.get(), dyoVar26.b.a, (Executor) dyoVar26.h.get(), (ScheduledExecutorService) dyoVar26.h.get());
            case 344:
                dyo dyoVar27 = this.a;
                Executor executor2 = (Executor) dyoVar27.h.get();
                return new akqb((aynx) dyoVar27.ew.get(), (yrj) dyoVar27.as.get(), (Executor) dyoVar27.aA.get(), (yme) dyoVar27.M.get());
            case 345:
                aynx aynxVar = (aynx) ((yui) this.a.cV.get()).b.get();
                axzl.o(aynxVar);
                return aynxVar;
            case 346:
                dyo dyoVar28 = this.a;
                Context context10 = dyoVar28.b.a;
                return new isj((gfu) dyoVar28.eA.get());
            case 347:
                dyo dyoVar29 = this.a;
                return new gfx(dyoVar29.b.a, (yve) dyoVar29.ez.get());
            case 348:
                dyo dyoVar30 = this.a;
                return gfy.b(dyoVar30.b.a, dyoVar30.j, (ankw) dyoVar30.h.get(), dyo.jp());
            case 349:
                return new zio((zin) this.a.eE.get());
            case 350:
                dyo dyoVar31 = this.a;
                return new zik((yrj) dyoVar31.as.get(), (Executor) dyoVar31.h.get(), dyoVar31.eD, (aadd) dyoVar31.K.get(), dyoVar31.b.a, new zih((snc) dyoVar31.v.get(), (acrr) dyoVar31.aw.get()));
            case 351:
                dyo dyoVar32 = this.a;
                return new zim((Executor) dyoVar32.h.get(), (rrd) dyoVar32.eC.get());
            case 352:
                return new rqy(this.a.b.a, new rrc());
            case 353:
                return new ajii((ajiq) this.a.el.get());
            case 354:
                return new xin(this.a.eH);
            case 355:
                return new wwk((wwl) this.a.da.get());
            case 356:
                return new aakt((abfh) this.a.r.get());
            case 357:
                dyo dyoVar33 = this.a;
                Context context11 = dyoVar33.b.a;
                afsm afsmVar = (afsm) dyoVar33.dp.get();
                SharedPreferences sharedPreferences = (SharedPreferences) dyoVar33.t.get();
                return sno.m(wjw.d((aapk) dyoVar33.eO.get()));
            case 358:
                dyo dyoVar34 = this.a;
                return aaib.c(dyoVar34.b.a, aaaz.c((aaay) dyoVar34.bb.get()), amge.b(dyoVar34.b.a), (snc) dyoVar34.v.get(), dyoVar34.eK, dyoVar34.eL, (aadd) dyoVar34.K.get(), (aacz) dyoVar34.D.get(), ((aaay) dyoVar34.bb.get()).e, (yrj) dyoVar34.as.get(), (aakl) dyoVar34.eM.get(), (axwp) dyoVar34.eN.get(), (ankw) dyoVar34.aA.get());
            case 359:
                Context context12 = this.a.b.a;
                qrq qrqVar = qrq.a;
                return Integer.valueOf(qse.a(context12));
            case 360:
                return new aara(this.a.b.a);
            case 361:
                dyo dyoVar35 = this.a;
                azqb azqbVar3 = dyoVar35.r;
                zfq zfqVar = (zfq) dyoVar35.ee.get();
                return new aakl(azqbVar3, amyc.b);
            case 362:
                dyo dyoVar36 = this.a;
                aadd aaddVar = (aadd) dyoVar36.K.get();
                return new axwp((aacz) dyoVar36.D.get());
            case 363:
                return new adcw();
            case 364:
                dyo dyoVar37 = this.a;
                return new aikm((aynx) dyoVar37.eR.get(), (aynx) dyoVar37.eS.get());
            case 365:
                return ahdx.O((aidn) this.a.eQ.get());
            case 366:
                return aheb.I(new dxc(this.a.c));
            case 367:
                return aheb.D((aidn) this.a.eQ.get());
            case 368:
                dyo dyoVar38 = this.a;
                return adxx.p((yqy) dyoVar38.fx.get(), (yqx) dyoVar38.fA.get());
            case 369:
                dyo dyoVar39 = this.a;
                return adzp.f(amon.a, new afys(dyoVar39.eY, dyoVar39.eZ), (yqy) dyoVar39.fw.get());
            case 370:
                dyo dyoVar40 = this.a;
                return adxx.r(dyoVar40.eX, dyoVar40.h);
            case 371:
                dyo dyoVar41 = this.a;
                return adzp.j(dyoVar41.aA, dyoVar41.eW, dyoVar41.v);
            case 372:
                return adyg.p(axoz.b(this.a.eb));
            case 373:
                return this.a.gy();
            case 374:
                dyo dyoVar42 = this.a;
                return new ysy((snc) dyoVar42.v.get(), dyoVar42.cT, dyoVar42.fb, dyoVar42.fd, dyoVar42.gy(), (yme) dyoVar42.M.get(), (ScheduledExecutorService) dyoVar42.h.get(), (yqm) dyoVar42.ft.get(), (Executor) dyoVar42.fu.get(), dyoVar42.fv, dyoVar42.bK(), (zex) dyoVar42.fr.get());
            case 375:
                return new ysr((String) this.a.fa.get());
            case 376:
                return yrn.d(this.a.b.a, amon.a);
            case 377:
                return new zgr((zgq) this.a.fc.get());
            case 378:
                return new zgq(this.a.b.a);
            case 379:
                dyo dyoVar43 = this.a;
                return aqmv.p((yme) dyoVar43.M.get(), dyoVar43.fs);
            case 380:
                dyo dyoVar44 = this.a;
                arey areyVar = (arey) dyoVar44.fo.get();
                return abgl.i((acud) dyoVar44.fn.get(), (yme) dyoVar44.M.get(), (snc) dyoVar44.v.get(), (zex) dyoVar44.fr.get());
            case 381:
                dyo dyoVar45 = this.a;
                return acrd.b((zfq) dyoVar45.ee.get(), (yni) dyoVar45.y.get(), (actm) dyoVar45.fj.get(), (actr) dyoVar45.fk.get(), (acuf) dyoVar45.fl.get(), dyoVar45.b.a, (aadd) dyoVar45.K.get(), (aacz) dyoVar45.D.get(), dyoVar45.fm, dyoVar45.fg);
            case 382:
                dyo dyoVar46 = this.a;
                return acrd.d(dyoVar46.b.a, (yni) dyoVar46.y.get(), (acrr) dyoVar46.aw.get(), (aacz) dyoVar46.D.get(), amup.l(aswa.LOGGING_QUEUE_TYPE_PIXIE_DUST, new isl((isr) dyoVar46.fe.get()), aswa.LOGGING_QUEUE_TYPE_UNKNOWN, acsv.c()), (acst) dyoVar46.ff.get(), (actp) dyoVar46.fh.get(), (acss) dyoVar46.fi.get(), (aadd) dyoVar46.K.get(), (axxb) dyoVar46.ap.get());
            case 383:
                dyo dyoVar47 = this.a;
                return new isr((snc) dyoVar47.v.get(), (aadd) dyoVar47.K.get());
            case 384:
                return acsv.a();
            case 385:
                dyo dyoVar48 = this.a;
                dyoVar48.dV();
                Context context13 = dyoVar48.b.a;
                return new actp((SharedPreferences) dyoVar48.t.get(), (yve) dyoVar48.fg.get(), (acrr) dyoVar48.aw.get(), (aadd) dyoVar48.K.get());
            case 386:
                dyo dyoVar49 = this.a;
                return abgl.c((aacz) dyoVar49.D.get(), dyoVar49.b.a, dyo.jp(), (ankw) dyoVar49.h.get(), (vlk) dyoVar49.j.get());
            case 387:
                dyo dyoVar50 = this.a;
                return new acss((acrr) dyoVar50.aw.get(), dyoVar50.e(), (ScheduledExecutorService) dyoVar50.h.get(), (zah) dyoVar50.av.get(), (snc) dyoVar50.v.get(), (aadd) dyoVar50.K.get(), (yni) dyoVar50.y.get(), (ykw) dyoVar50.Z.get(), (afvn) dyoVar50.au.get(), (yve) dyoVar50.fg.get());
            case 388:
                return acsv.d();
            case 389:
                return new acuf();
            case 390:
                return aabv.h(this.a.bN());
            case 391:
                return ajnk.e();
            case 392:
                dyo dyoVar51 = this.a;
                return aksx.c((acrm) dyoVar51.fp.get(), (axwx) dyoVar51.fq.get(), new akto());
            case 393:
                return aabv.i((acrr) this.a.aw.get());
            case 394:
                dyo dyoVar52 = this.a;
                aadd aaddVar2 = (aadd) dyoVar52.K.get();
                return new axwx((aacz) dyoVar52.D.get());
            case 395:
                dyo dyoVar53 = this.a;
                return aqmv.r((yme) dyoVar53.M.get(), dyoVar53.h);
            case 396:
                return yry.c(amon.a);
            case 397:
                return wxf.f((snc) this.a.v.get());
            case 398:
                dyo dyoVar54 = this.a;
                return adzp.h((snc) dyoVar54.v.get(), (yqj) dyoVar54.fy.get(), (afsx) dyoVar54.fz.get());
            case 399:
                return yie.c();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        int i = this.b;
        switch (i) {
            case 1600:
                dyo dyoVar = this.a;
                return new abds((aaqj) dyoVar.er.get(), (aaqf) dyoVar.eV.get(), (afvn) dyoVar.au.get(), (yqw) dyoVar.fD.get());
            case 1601:
                return new fgo((yve) this.a.iy.get());
            case 1602:
                return new fnn((yve) this.a.xA.get());
            case 1603:
                dyo dyoVar2 = this.a;
                Context context = dyoVar2.b.a;
                String[] strArr = llp.a;
                vjf a = vjg.a(context);
                a.e("settings");
                a.f("back_up_settings.pb");
                Uri a2 = a.a();
                vlo d = vlr.d(context, (ankw) dyoVar2.h.get());
                d.c = dyo.jp();
                d.b();
                d.d(llp.a);
                d.e(fdg.i);
                vlr a3 = d.a();
                vli a4 = vlj.a();
                a4.e(llp.a());
                a4.f(a2);
                a4.b(a3);
                return ((yke) dyoVar2.p.get()).a(vmu.b(((vlk) dyoVar2.j.get()).a(a4.a())), llp.a());
            case 1604:
                dyo dyoVar3 = this.a;
                return new gdk(dyoVar3.b.a, dyoVar3.xC, (Handler) dyoVar3.an.get());
            case 1605:
                dyo dyoVar4 = this.a;
                return new gdh(dyoVar4.b.a, (aadd) dyoVar4.K.get(), dyoVar4.xB);
            case 1606:
                dyo dyoVar5 = this.a;
                return new ehn(dyoVar5.aw, (aadd) dyoVar5.K.get(), (aacz) dyoVar5.D.get(), axot.a(dyoVar5.iu), axot.a(dyoVar5.is), (Handler) dyoVar5.an.get(), (ayor) dyoVar5.iz.get(), (Executor) dyoVar5.h.get(), (snc) dyoVar5.v.get());
            case 1607:
                dyo dyoVar6 = this.a;
                Executor executor = (Executor) dyoVar6.h.get();
                afwu afwuVar = (afwu) dyoVar6.hL.get();
                afsw afswVar = (afsw) dyoVar6.wd.get();
                afzo afzoVar = (afzo) dyoVar6.sj.get();
                afvn afvnVar = (afvn) dyoVar6.au.get();
                return new aiak(1);
            case 1608:
                return aheb.F((aidn) this.a.eQ.get());
            case 1609:
                dyo dyoVar7 = this.a;
                return ymf.c(dyoVar7.b.a, "renderingui", "frequency_cap_proto.pb", (vlk) dyoVar7.j.get(), awvj.a);
            case 1610:
                return new akdh();
            case 1611:
                return new ydq();
            case 1612:
                dyo dyoVar8 = this.a;
                Context context2 = dyoVar8.b.a;
                return ((yke) dyoVar8.p.get()).a(ymf.d(context2, dyo.jp(), (ankw) dyoVar8.h.get(), (vlk) dyoVar8.j.get(), nwn.a, nwp.a(context2), nwo.a, fdg.j), nwo.a);
            case 1613:
                return new iqy((axwq) this.a.iG.get());
            case 1614:
                dyo dyoVar9 = this.a;
                return new ahcu((agvq) dyoVar9.hf.get(), (ahdl) dyoVar9.ln.get(), (Executor) dyoVar9.x.get(), (ankw) dyoVar9.h.get(), (aadd) dyoVar9.K.get());
            case 1615:
                dyo dyoVar10 = this.a;
                return new joh((fcn) dyoVar10.kL.get(), dyoVar10.gS, (yni) dyoVar10.y.get(), (agsd) dyoVar10.lo.get(), (ahdf) dyoVar10.ha.get());
            case 1616:
                return new pku();
            case 1617:
                dyo dyoVar11 = this.a;
                return new jln((yrj) dyoVar11.as.get(), (snc) dyoVar11.v.get(), (fcu) dyoVar11.gY.get(), dyoVar11.gS, dyoVar11.kY);
            case 1618:
                return this.a.eO();
            case 1619:
                dyo dyoVar12 = this.a;
                return new agkl((aguv) dyoVar12.kY.get(), dyoVar12.gS);
            case 1620:
                dyo dyoVar13 = this.a;
                return new gos((afvn) dyoVar13.au.get(), (vzc) dyoVar13.hY.get(), (Executor) dyoVar13.h.get());
            case 1621:
                dyo dyoVar14 = this.a;
                return new gpg((SecureRandom) dyoVar14.eb.get(), (vne) dyoVar14.xT.get());
            case 1622:
                dyo dyoVar15 = this.a;
                vjf a5 = vjg.a(dyoVar15.b.a);
                a5.e("uri_flow_module");
                a5.f("uri_flow.pb");
                Uri a6 = a5.a();
                vli a7 = vlj.a();
                a7.f(a6);
                a7.e(aotg.a);
                return ((vlk) dyoVar15.j.get()).a(a7.a());
            case 1623:
                dyo dyoVar16 = this.a;
                Context context3 = dyoVar16.b.a;
                return new enm(dyoVar16.hl, (wkl) dyoVar16.cZ.get());
            case 1624:
                dyo dyoVar17 = this.a;
                return new aaun((aaqj) dyoVar17.er.get(), (aaqf) dyoVar17.eV.get(), (afvn) dyoVar17.au.get(), (yqw) dyoVar17.fD.get());
            case 1625:
                return azpd.ar().ax();
            case 1626:
                dyo dyoVar18 = this.a;
                return new aatp((aaqj) dyoVar18.er.get(), (aaqf) dyoVar18.eV.get(), (afvn) dyoVar18.au.get(), (yqw) dyoVar18.fD.get());
            case 1627:
                dyo dyoVar19 = this.a;
                return new aaxb((aaqj) dyoVar19.er.get(), (aaqf) dyoVar19.eV.get(), (afvn) dyoVar19.au.get(), (yqw) dyoVar19.fD.get());
            case 1628:
                return new xxk((acrr) this.a.aw.get());
            case 1629:
                return new akul(this.a.b.a);
            case 1630:
                dyo dyoVar20 = this.a;
                return new abaz((aaqj) dyoVar20.er.get(), (aaqf) dyoVar20.eV.get(), (afvn) dyoVar20.au.get(), (yqw) dyoVar20.fD.get());
            case 1631:
                dyo dyoVar21 = this.a;
                return new aawn((aaqj) dyoVar21.er.get(), (aaqf) dyoVar21.eV.get(), (afvn) dyoVar21.au.get(), (yqw) dyoVar21.fB.get());
            case 1632:
                return new acuu();
            case 1633:
                dyo dyoVar22 = this.a;
                return new aaub((aaqj) dyoVar22.er.get(), (aaqf) dyoVar22.eV.get(), (afvn) dyoVar22.au.get(), (yqw) dyoVar22.fD.get());
            case 1634:
                dyo dyoVar23 = this.a;
                return new aavu((aaqj) dyoVar23.er.get(), (aaqf) dyoVar23.eV.get(), (afvn) dyoVar23.au.get(), (yqw) dyoVar23.fD.get());
            case 1635:
                dyo dyoVar24 = this.a;
                return new abar((aaqj) dyoVar24.er.get(), (aaqf) dyoVar24.eV.get(), (afvn) dyoVar24.au.get(), (yqw) dyoVar24.fD.get());
            case 1636:
                dyo dyoVar25 = this.a;
                return new abbu((aaqj) dyoVar25.er.get(), (aaqf) dyoVar25.eV.get(), (afvn) dyoVar25.au.get(), (yqw) dyoVar25.fD.get());
            case 1637:
                dyo dyoVar26 = this.a;
                return new abdm((aaqj) dyoVar26.er.get(), (aaqf) dyoVar26.eV.get(), (afvn) dyoVar26.au.get(), (yqw) dyoVar26.fB.get());
            case 1638:
                dyo dyoVar27 = this.a;
                final agxa agxaVar = new agxa((ScheduledExecutorService) dyoVar27.h.get(), (aagi) dyoVar27.dD.get(), dyoVar27.hf, dyoVar27.yk, dyoVar27.gS);
                agxaVar.b.c().g(awab.class).X(azpj.b(agxaVar.a)).as(new ayqb() { // from class: agww
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        agxa agxaVar2 = agxa.this;
                        awab awabVar = (awab) ((aajp) obj).c;
                        if (awabVar != null) {
                            String videoId = awabVar.getVideoId();
                            long longValue = awabVar.getLastPlaybackPositionSeconds().longValue();
                            agwh m = ((agrf) agxaVar2.e.get()).a().m();
                            agqv e = m.e(videoId);
                            if (e == null || e.h == longValue) {
                                return;
                            }
                            m.D(videoId, longValue);
                        }
                    }
                });
                return agxaVar;
            case 1639:
                dyo dyoVar28 = this.a;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) dyoVar28.h.get();
                return new agvk((aaqj) dyoVar28.er.get(), (aaqf) dyoVar28.eV.get(), (afvn) dyoVar28.au.get(), (yqw) dyoVar28.fD.get());
            case 1640:
                return new amfg();
            case 1641:
                dyo dyoVar29 = this.a;
                aadd aaddVar = (aadd) dyoVar29.K.get();
                return new axxt((aacz) dyoVar29.D.get());
            case 1642:
                dyo dyoVar30 = this.a;
                return new abap((aaqj) dyoVar30.er.get(), (aaqf) dyoVar30.eV.get(), (afvn) dyoVar30.au.get(), (yqw) dyoVar30.fD.get());
            case 1643:
                dyo dyoVar31 = this.a;
                return new acta(acuc.OVERLAY, (zfq) dyoVar31.ee.get(), (yni) dyoVar31.y.get(), (actm) dyoVar31.fj.get(), (actr) dyoVar31.fk.get(), (acuf) dyoVar31.fl.get(), dyoVar31.b.a, (aadd) dyoVar31.K.get(), (aacz) dyoVar31.D.get(), dyoVar31.fm, dyoVar31.fg);
            case 1644:
                dyo dyoVar32 = this.a;
                return new aaxm((aaqj) dyoVar32.er.get(), (aaqf) dyoVar32.eV.get(), (afvn) dyoVar32.au.get(), (yqw) dyoVar32.fB.get());
            case 1645:
                dyo dyoVar33 = this.a;
                return new jor(dyoVar33.gR, dyoVar33.gS, dyoVar33.ys, (Handler) dyoVar33.an.get());
            case 1646:
                dyo dyoVar34 = this.a;
                return new joo((jol) dyoVar34.yr.get(), (Handler) dyoVar34.an.get());
            case 1647:
                dyo dyoVar35 = this.a;
                return new jol((ahdn) dyoVar35.gR.get(), dyoVar35.gS, dyoVar35.lc, dyoVar35.gT, dyoVar35.hN, (snc) dyoVar35.v.get(), (ExecutorService) dyoVar35.h.get());
            case 1648:
                dyo dyoVar36 = this.a;
                return egd.B((aacz) dyoVar36.D.get(), (abbe) dyoVar36.mr.get());
            case 1649:
                dyo dyoVar37 = this.a;
                afvn afvnVar2 = (afvn) dyoVar37.au.get();
                return new aash((aaqj) dyoVar37.er.get(), (aaqf) dyoVar37.eV.get(), (yqw) dyoVar37.fD.get());
            case 1650:
                dyo dyoVar38 = this.a;
                return new aidi(axot.a(dyoVar38.ii), axot.a(dyoVar38.yw), 1);
            case 1651:
                return this.a.T();
            case 1652:
                return new eti(this.a.kE);
            case 1653:
                dyo dyoVar39 = this.a;
                return new lay((aaqp) dyoVar39.ih.get(), (Executor) dyoVar39.h.get(), (Handler) dyoVar39.an.get());
            case 1654:
                return new eri();
            case 1655:
                dyo dyoVar40 = this.a;
                return new aavx((aaqj) dyoVar40.er.get(), (aaqf) dyoVar40.eV.get(), (afvn) dyoVar40.au.get(), (yqw) dyoVar40.fD.get());
            case 1656:
                return new gpc();
            case 1657:
                dyo dyoVar41 = this.a;
                return new aaxk((aaqj) dyoVar41.er.get(), (aaqf) dyoVar41.eV.get(), (afvn) dyoVar41.au.get(), (yqw) dyoVar41.fB.get());
            case 1658:
                dyo dyoVar42 = this.a;
                return new aaxi((aaqj) dyoVar42.er.get(), (aaqf) dyoVar42.eV.get(), (afvn) dyoVar42.au.get(), (yqw) dyoVar42.fB.get());
            case 1659:
                dyo dyoVar43 = this.a;
                return new aban((aaqf) dyoVar43.eV.get(), dyoVar43.bJ(), (afvn) dyoVar43.au.get(), (aacz) dyoVar43.D.get(), (aaqj) dyoVar43.er.get());
            case 1660:
                return Build.VERSION.SDK_INT < 23 ? new wcz() : new wde(this.a.b.a);
            case 1661:
                return egd.R();
            case 1662:
                dyo dyoVar44 = this.a;
                return new wkz((xir) dyoVar44.tL.get(), amvn.r((wkw) dyoVar44.ur.get()));
            case 1663:
                return new xse((Executor) this.a.x.get());
            case 1664:
                return ((azpb) this.a.xX.get()).A();
            case 1665:
                dyo dyoVar45 = this.a;
                Object aktsVar = dyoVar45.fI().f() == 2 ? (aktx) dyoVar45.yL.get() : new akts();
                axzl.o(aktsVar);
                return aktsVar;
            case 1666:
                dyo dyoVar46 = this.a;
                return new aktr(dyoVar46.fI(), (ankx) dyoVar46.h.get());
            case 1667:
                return new xyf();
            case 1668:
                return new acly();
            case 1669:
                dyo dyoVar47 = this.a;
                return new hkl((aadd) dyoVar47.K.get(), (axww) dyoVar47.mZ.get(), (axxb) dyoVar47.ap.get());
            case 1670:
                dyo dyoVar48 = this.a;
                afvn afvnVar3 = (afvn) dyoVar48.au.get();
                return new aars((aaqj) dyoVar48.er.get(), (aaqf) dyoVar48.eV.get(), (yqw) dyoVar48.fD.get());
            case 1671:
                dyo dyoVar49 = this.a;
                return new aazg((aaqj) dyoVar49.er.get(), (aaqf) dyoVar49.eV.get(), (afvn) dyoVar49.au.get(), (yqw) dyoVar49.fD.get());
            case 1672:
                dyo dyoVar50 = this.a;
                return new aazj((aaqj) dyoVar50.er.get(), (aaqf) dyoVar50.eV.get(), (afvn) dyoVar50.au.get(), (yqw) dyoVar50.fD.get());
            case 1673:
                return this.a.a.J();
            case 1674:
                return this.a.a.G();
            case 1675:
                return this.a.a.H();
            case 1676:
                dxs dxsVar = this.a.a;
                return new aayn((aaqj) dxsVar.bF.c.er.get(), (aaqf) dxsVar.bF.c.eV.get(), (afvn) dxsVar.bF.c.au.get(), (yqw) dxsVar.bF.c.fD.get());
            case 1677:
                return this.a.a.I();
            case 1678:
                return this.a.a.K();
            case 1679:
                dxs dxsVar2 = this.a.a;
                return new aazl((aaqj) dxsVar2.bF.c.er.get(), (aaqf) dxsVar2.bF.c.eV.get(), (afvn) dxsVar2.bF.c.au.get(), (yqw) dxsVar2.bF.c.fD.get());
            case 1680:
                dxs dxsVar3 = this.a.a;
                return new aazn((aaqj) dxsVar3.bF.c.er.get(), (aaqf) dxsVar3.bF.c.eV.get(), (afvn) dxsVar3.bF.c.au.get(), (yqw) dxsVar3.bF.c.fD.get());
            case 1681:
                dxs dxsVar4 = this.a.a;
                dyo dyoVar51 = dxsVar4.bF.c;
                Context context4 = dyoVar51.b.a;
                azqb azqbVar = dyoVar51.t;
                vjf a8 = vjg.a(context4);
                a8.e("effectvisit");
                a8.f("effectvisit.pb");
                Uri a9 = a8.a();
                vli a10 = vlj.a();
                a10.f(a9);
                a10.e(awti.a);
                yvh d2 = yvi.d(azqbVar, (ankw) dxsVar4.bF.c.h.get());
                d2.a = zto.a;
                d2.b(ydy.l);
                d2.b = ydy.k;
                d2.c = lto.p;
                a10.b(d2.a());
                return ((vlk) dyoVar51.j.get()).a(a10.a());
            case 1682:
                return this.a.a.N();
            case 1683:
                return this.a.a.F();
            case 1684:
                dxs dxsVar5 = this.a.a;
                return new abde((aaqj) dxsVar5.bF.c.er.get(), (aaqf) dxsVar5.bF.c.eV.get(), (afvn) dxsVar5.bF.c.au.get(), (yqw) dxsVar5.bF.c.fD.get(), (Executor) dxsVar5.bF.c.x.get());
            case 1685:
                dyo dyoVar52 = this.a;
                aacz aaczVar = (aacz) dyoVar52.D.get();
                return new axxe((aadd) dyoVar52.K.get());
            case 1686:
                return this.a.a.z();
            case 1687:
                return this.a.a.C();
            case 1688:
                return this.a.a.ah();
            case 1689:
                return new xyb();
            case 1690:
                return new xyd();
            case 1691:
                dxs dxsVar6 = this.a.a;
                return new aiej((afvn) dxsVar6.bF.c.au.get(), (aids) dxsVar6.bF.c.fN.get(), (afvd) dxsVar6.o.get(), dxsVar6.bF.c.dR());
            case 1692:
                return this.a.a.R().b(gsh.r);
            case 1693:
                dxs dxsVar7 = this.a.a;
                return new abfx((afvn) dxsVar7.bF.c.au.get(), (afvd) dxsVar7.r.get());
            case 1694:
                dxs dxsVar8 = this.a.a;
                afvb R = dxsVar8.R();
                final afvd afvdVar = (afvd) dxsVar8.q.get();
                return R.a(new ampg() { // from class: abfz
                    @Override // defpackage.ampg
                    public final Object apply(Object obj) {
                        return new abfw((abfp) afvd.this.a((afvm) obj).e(abfy.a));
                    }
                });
            case 1695:
                dxs dxsVar9 = this.a.a;
                return dxsVar9.R().b(new uvy(dxsVar9.p, 6));
            case 1696:
                return this.a.a.M();
            case 1697:
                return this.a.a.ae();
            case 1698:
                return this.a.a.B();
            case 1699:
                return new yih();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object n() {
        tyk tytVar;
        Object a;
        int i = this.b;
        switch (i) {
            case 400:
                dyo dyoVar = this.a;
                afsz afszVar = (afsz) dyoVar.s.get();
                return adxx.o(dyoVar.ak);
            case 401:
                return this.a.bI();
            case 402:
                return this.a.l();
            case 403:
                return yie.k();
            case 404:
                dyo dyoVar2 = this.a;
                return amvn.s((aaoo) dyoVar2.fL.get(), (aaoo) dyoVar2.ik.get());
            case 405:
                dyo dyoVar3 = this.a;
                return new aaav((ces) dyoVar3.fC.get(), (aidg) dyoVar3.fK.get());
            case 406:
                dyo dyoVar4 = this.a;
                return new aidg(dyoVar4.fI, (aios) dyoVar4.fJ.get());
            case 407:
                dyo dyoVar5 = this.a;
                return wjv.g((aaqj) dyoVar5.fE.get(), (aaqf) dyoVar5.eV.get(), new ainb(dyoVar5.ee, axpa.a, dyoVar5.fH), (afvn) dyoVar5.au.get(), dyoVar5.hC(), (yni) dyoVar5.y.get(), (aacz) dyoVar5.D.get(), (aadd) dyoVar5.K.get(), (zdz) dyoVar5.dy.get());
            case 408:
                return yry.k(this.a.cl());
            case 409:
                return this.a.fi();
            case 410:
                dyo dyoVar6 = this.a;
                return new axxl((aacz) dyoVar6.D.get(), (aadd) dyoVar6.K.get());
            case 411:
                dyo dyoVar7 = this.a;
                aacz aaczVar = (aacz) dyoVar7.D.get();
                return new axxj((aadd) dyoVar7.K.get());
            case 412:
                return ahdx.J((aidn) this.a.eQ.get());
            case 413:
                dyo dyoVar8 = this.a;
                return new aidi(axot.a(dyoVar8.ii), axot.a(dyoVar8.ij));
            case 414:
                return this.a.fe();
            case 415:
                dyo dyoVar9 = this.a;
                Context context = dyoVar9.b.a;
                return aasx.n((ailf) dyoVar9.fM.get(), (Executor) dyoVar9.h.get(), (aadd) dyoVar9.K.get());
            case 416:
                return ahdx.G((aidn) this.a.eQ.get());
            case 417:
                return ahdx.E((aidn) this.a.eQ.get());
            case 418:
                return ahdx.D((aidn) this.a.eQ.get());
            case 419:
                dyo dyoVar10 = this.a;
                return aasx.e((aegi) dyoVar10.hn.get(), (aegq) dyoVar10.hO.get(), (Executor) dyoVar10.h.get(), (aegt) dyoVar10.hv.get());
            case 420:
                return this.a.dA();
            case 421:
                return this.a.dx();
            case 422:
                dyo dyoVar11 = this.a;
                return adxj.a((aken) dyoVar11.fQ.get(), yih.a(dyoVar11.b.a, null));
            case 423:
                return new aken(true);
            case 424:
                return new zew();
            case 425:
                return this.a.bS();
            case 426:
                dyo dyoVar12 = this.a;
                return dyoVar12.bS().b((SharedPreferences) dyoVar12.t.get());
            case 427:
                return new aant(this.a.r);
            case 428:
                dyo dyoVar13 = this.a;
                return adxx.e((snc) dyoVar13.v.get(), (aant) dyoVar13.fU.get());
            case 429:
                dyo dyoVar14 = this.a;
                Context context2 = dyoVar14.b.a;
                return wze.l((Executor) dyoVar14.h.get(), (afjz) dyoVar14.ga.get());
            case 430:
                dyo dyoVar15 = this.a;
                return ysz.b(dyoVar15.b.a, (yve) dyoVar15.fW.get(), amon.a, (yrj) dyoVar15.as.get(), (aadd) dyoVar15.K.get(), (aacz) dyoVar15.D.get(), (afmq) dyoVar15.fY.get(), afmf.b((yrj) dyoVar15.as.get()), (afsz) dyoVar15.s.get(), (axxl) dyoVar15.fF.get(), (axxm) dyoVar15.fZ.get(), (axxj) dyoVar15.fG.get());
            case 431:
                dyo dyoVar16 = this.a;
                return adyg.g(aefu.b(dyoVar16.b.a, dyoVar16.t, (ankw) dyoVar16.h.get(), dyoVar16.j));
            case 432:
                dyo dyoVar17 = this.a;
                return aasx.h((yve) dyoVar17.fW.get(), (aynx) dyoVar17.fX.get(), (aadd) dyoVar17.K.get(), (axxl) dyoVar17.fF.get());
            case 433:
                return this.a.gI();
            case 434:
                dyo dyoVar18 = this.a;
                return new axxm((aacz) dyoVar18.D.get(), (aadd) dyoVar18.K.get());
            case 435:
                dyo dyoVar19 = this.a;
                return adxx.a(dyoVar19.gc, dyoVar19.gd);
            case 436:
                return this.a.m288if();
            case 437:
                return this.a.hh();
            case 438:
                return adyg.e((snc) this.a.v.get());
            case 439:
                dyo dyoVar20 = this.a;
                return new aflx((yni) dyoVar20.y.get(), (snc) dyoVar20.v.get());
            case 440:
                return this.a.ig();
            case 441:
                return this.a.dF();
            case 442:
                return this.a.dG();
            case 443:
                dyo dyoVar21 = this.a;
                return wjv.f((aant) dyoVar21.fU.get(), (aadd) dyoVar21.K.get(), (aepv) dyoVar21.gf.get(), (aeqt) dyoVar21.gg.get(), (ScheduledExecutorService) dyoVar21.h.get(), (ywk) dyoVar21.B.get(), axot.a(dyoVar21.aw), axot.a(dyoVar21.gh), axot.a(dyoVar21.gv));
            case 444:
                dyo dyoVar22 = this.a;
                return new aepv((yrj) dyoVar22.as.get(), (yve) dyoVar22.fW.get(), (ScheduledExecutorService) dyoVar22.h.get(), (aadd) dyoVar22.K.get());
            case 445:
                dyo dyoVar23 = this.a;
                return aasx.g((yve) dyoVar23.fW.get(), (ScheduledExecutorService) dyoVar23.h.get(), (aadd) dyoVar23.K.get(), (acrr) dyoVar23.aw.get());
            case 446:
                return new afhj(this.a.b.a);
            case 447:
                dyo dyoVar24 = this.a;
                return wze.j((axxl) dyoVar24.fF.get(), axot.a(dyoVar24.gr), axot.a(dyoVar24.gu));
            case 448:
                dyo dyoVar25 = this.a;
                return wze.k(ampq.j(dyoVar25.ca()), (acrr) dyoVar25.aw.get(), (ankw) dyoVar25.h.get());
            case 449:
                return this.a.bZ();
            case 450:
                dyo dyoVar26 = this.a;
                Context context3 = dyoVar26.b.a;
                ankw ankwVar = (ankw) dyoVar26.h.get();
                aafa aafaVar = new aafa(dyoVar26.gj, (vne) dyoVar26.gk.get(), dyoVar26.ai);
                ampq j = ampq.j((tzo) dyoVar26.gm.get());
                amon amonVar = amon.a;
                ampq j2 = ampq.j((aaeq) dyoVar26.gp.get());
                ampq j3 = ampq.j((trv) dyoVar26.gq.get());
                amon amonVar2 = amon.a;
                ampq j4 = ampq.j((tqe) dyoVar26.gn.get());
                tre treVar = new tre();
                treVar.b = context3.getApplicationContext();
                ankwVar.getClass();
                treVar.c = ankwVar;
                treVar.d.addAll((amuk) dyoVar26.gi.get());
                treVar.e = ampq.i(aafaVar);
                treVar.f = (vjb) dyoVar26.i.get();
                treVar.g = (tzq) dyoVar26.gl.get();
                treVar.h = j;
                treVar.i = (amqo) dyoVar26.go.get();
                treVar.k = amonVar;
                treVar.l = j2;
                treVar.m = j3;
                treVar.n = amonVar2;
                treVar.j = (vlk) dyoVar26.j.get();
                treVar.o = j4;
                treVar.b.getClass();
                treVar.e.getClass();
                treVar.f.getClass();
                treVar.j.getClass();
                treVar.g.getClass();
                treVar.h.getClass();
                treVar.i.getClass();
                Executor g = anlz.g(treVar.c);
                treVar.a.a = new txg(treVar.b);
                treVar.a.c = new txl(g);
                treVar.a.b = new txj(treVar.k, treVar.i);
                tqe tqeVar = (tqe) treVar.o.e(new trd());
                if (treVar.l.h()) {
                    tytVar = new tyr(treVar.b, (aaeq) treVar.l.c());
                } else {
                    tytVar = new tyt();
                }
                tyk tykVar = tytVar;
                treVar.p = ampq.j(new trz(treVar.b));
                treVar.a.d = new txo(treVar.f, treVar.g, tykVar, treVar.h, treVar.m, treVar.n, treVar.q, treVar.p, tqeVar);
                treVar.a.e = new txt(treVar.c, treVar.j);
                txi txiVar = treVar.a;
                axzl.n(txiVar.a, txg.class);
                axzl.n(txiVar.b, txj.class);
                axzl.n(txiVar.c, txl.class);
                axzl.n(txiVar.d, txo.class);
                axzl.n(txiVar.e, txt.class);
                txw txwVar = new txw(txiVar.a, txiVar.b, txiVar.c, txiVar.d, txiVar.e);
                treVar.b.getApplicationContext();
                anlz.g(g);
                if (treVar.h.h()) {
                    ampq.j((tzl) treVar.h.c());
                }
                new HashMap();
                tyq tyqVar = (tyq) txwVar.l.get();
                return new tru(treVar.b, (tyk) txwVar.b.get(), new tvs(txh.b(txwVar.a), (tyk) txwVar.b.get(), txwVar.b(), (twy) txwVar.h.get(), txwVar.a(), (tul) txwVar.j.get(), new tsy(txh.b(txwVar.a), (tul) txwVar.j.get(), txwVar.b(), (twy) txwVar.h.get(), (tyk) txwVar.b.get(), (snc) txwVar.i.get(), (vjb) txwVar.f.get(), (ampq) txwVar.d.get(), (trv) txwVar.c.get(), (Executor) txwVar.g.get()), (trv) txwVar.c.get(), new tyz(txh.b(txwVar.a), (tul) txwVar.j.get(), txwVar.b(), (vjb) txwVar.f.get(), (tyk) txwVar.b.get(), (trv) txwVar.c.get(), (ampq) txwVar.d.get(), (Executor) txwVar.g.get(), (tqe) txwVar.e.get()), new tyo(txwVar.a(), (tul) txwVar.j.get(), (tyk) txwVar.b.get(), (Executor) txwVar.g.get(), (tqe) txwVar.e.get()), new tys(txh.b(txwVar.a), (tyk) txwVar.b.get(), (ampq) txwVar.d.get(), (tqe) txwVar.e.get()), (ampq) txwVar.d.get(), (Executor) txwVar.g.get(), (ampq) txwVar.k.get(), (tqe) txwVar.e.get()), g, treVar.d, treVar.e, treVar.f, treVar.h);
            case 451:
                amuk q = amuk.q();
                axzl.o(q);
                return q;
            case 452:
                return Boolean.valueOf(this.a.iv());
            case 453:
                dyo dyoVar27 = this.a;
                vjf a2 = vjg.a(dyoVar27.b.a);
                a2.e("mdd");
                a2.f("TaskPeriods.pb");
                Uri a3 = a2.a();
                vli a4 = vlj.a();
                a4.f(a3);
                a4.e(tzt.a);
                return ((vlk) dyoVar27.j.get()).a(a4.a());
            case 454:
                return new tzq(this.a.b.a);
            case 455:
                dyo dyoVar28 = this.a;
                return new tzo((snc) dyoVar28.v.get(), (ankw) dyoVar28.h.get());
            case 456:
                dyo dyoVar29 = this.a;
                Context context4 = dyoVar29.b.a;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) dyoVar29.ay.get();
                vjb vjbVar = (vjb) dyoVar29.i.get();
                return new tso(scheduledExecutorService, (tqe) dyoVar29.gn.get(), axot.a(dyoVar29.cT), context4, ampq.j((tzo) dyoVar29.gm.get()), vjbVar);
            case 457:
                return new aafb((axwp) this.a.eN.get());
            case 458:
                return this.a.cb();
            case 459:
                dyo dyoVar30 = this.a;
                return new tzr(dyoVar30.b.a, (tqe) dyoVar30.gn.get());
            case 460:
                return this.a.hi();
            case 461:
                return new aaem();
            case 462:
                dyo dyoVar31 = this.a;
                return abgl.d((akqq) dyoVar31.gt.get(), (yqw) dyoVar31.fB.get(), (ScheduledExecutorService) dyoVar31.h.get(), (afvn) dyoVar31.au.get(), (acrr) dyoVar31.aw.get());
            case 463:
                dyo dyoVar32 = this.a;
                return akvn.c(dyoVar32.b.a, (Executor) dyoVar32.h.get(), dyoVar32.gs);
            case 464:
                return ajnk.c();
            case 465:
                return this.a.dO();
            case 466:
                return this.a.eE();
            case 467:
                return this.a.dy();
            case 468:
                return adyg.f(this.a.dN());
            case 469:
                return new aeln((afjz) this.a.ga.get());
            case 470:
                return acsv.f();
            case 471:
                return new afkf();
            case 472:
                return this.a.dz();
            case 473:
                return acsv.o();
            case 474:
                dyo dyoVar33 = this.a;
                return adzp.a(dyoVar33.v, (aepf) dyoVar33.gx.get(), dyoVar33.dJ());
            case 475:
                dyo dyoVar34 = this.a;
                return adxx.l((aadd) dyoVar34.K.get(), (Executor) dyoVar34.x.get());
            case 476:
                return adyg.h((aepf) this.a.gx.get());
            case 477:
                dyo dyoVar35 = this.a;
                return adxx.i((snc) dyoVar35.v.get(), (afkf) dyoVar35.gD.get());
            case 478:
                dyo dyoVar36 = this.a;
                return adxx.h((snc) dyoVar36.v.get(), (afkf) dyoVar36.gD.get());
            case 479:
                return this.a.dI();
            case 480:
                return ahdx.B((aidn) this.a.eQ.get());
            case 481:
                return this.a.dw();
            case 482:
                return afku.l();
            case 483:
                return acsv.j();
            case 484:
                dyo dyoVar37 = this.a;
                return wdw.j(adyq.c((afjz) dyoVar37.ga.get(), (afhy) dyoVar37.gM.get(), (afhw) dyoVar37.gN.get()), (ankx) dyoVar37.h.get(), (afjz) dyoVar37.ga.get(), (acvh) dyoVar37.ef.get(), (acrr) dyoVar37.aw.get(), (afvn) dyoVar37.au.get());
            case 485:
                return adyg.i(this.a.b.a);
            case 486:
                return acsv.k();
            case 487:
                return acsv.g();
            case 488:
                return this.a.eF();
            case 489:
                return this.a.bO();
            case 490:
                dyo dyoVar38 = this.a;
                return new ahdn((SharedPreferences) dyoVar38.t.get(), (afvn) dyoVar38.au.get());
            case 491:
                dyo dyoVar39 = this.a;
                aacz aaczVar2 = (aacz) dyoVar39.D.get();
                return new aguj((aadd) dyoVar39.K.get(), dyoVar39.gS, dyoVar39.hh, (ScheduledExecutorService) dyoVar39.h.get());
            case 492:
                return this.a.eI();
            case 493:
                dyo dyoVar40 = this.a;
                zew zewVar = (zew) dyoVar40.fR.get();
                return new agvw((SharedPreferences) dyoVar40.t.get(), (aacz) dyoVar40.D.get(), (afvn) dyoVar40.au.get(), dyoVar40.gS);
            case 494:
                dyo dyoVar41 = this.a;
                SharedPreferences sharedPreferences = (SharedPreferences) dyoVar41.t.get();
                fcu fcuVar = (fcu) dyoVar41.gY.get();
                aadd aaddVar = (aadd) dyoVar41.K.get();
                int intValue = dyoVar41.gM().intValue();
                yrj yrjVar = (yrj) dyoVar41.as.get();
                ahdf ahdfVar = (ahdf) dyoVar41.ha.get();
                return new jnn(sharedPreferences, fcuVar, aaddVar, intValue, yrjVar, (agvn) dyoVar41.hd.get(), (snc) dyoVar41.v.get(), (fbv) dyoVar41.he.get());
            case 495:
                dyo dyoVar42 = this.a;
                return new fcu((yve) dyoVar42.gW.get(), (yve) dyoVar42.gX.get(), dyoVar42.gV);
            case 496:
                dyo dyoVar43 = this.a;
                azqb azqbVar = dyoVar43.gU;
                azqb azqbVar2 = dyoVar43.au;
                azqb azqbVar3 = dyoVar43.gV;
                if (fdl.d((aacz) dyoVar43.D.get())) {
                    a = (yve) azqbVar3.get();
                } else {
                    a = ((yvl) azqbVar.get()).a(new agvo((afvn) azqbVar2.get(), 1), fdj.a, fda.a);
                }
                axzl.o(a);
                return a;
            case 497:
                return this.a.bN();
            case 498:
                dyo dyoVar44 = this.a;
                return fdl.c(dyoVar44.b.a, (ankw) dyoVar44.h.get(), dyo.jp(), (vlk) dyoVar44.j.get(), dyoVar44.t, (aacz) dyoVar44.D.get());
            case 499:
                dyo dyoVar45 = this.a;
                azqb azqbVar4 = dyoVar45.gU;
                Context context5 = dyoVar45.b.a;
                ankw ankwVar2 = (ankw) dyoVar45.h.get();
                vlk vlkVar = (vlk) dyoVar45.j.get();
                azqb azqbVar5 = dyoVar45.t;
                azqb azqbVar6 = dyoVar45.p;
                if (fdl.d((aacz) dyoVar45.D.get())) {
                    vjf a5 = vjg.a(context5);
                    a5.e("offline");
                    a5.f("offlinemainbackedup.pb");
                    Uri a6 = a5.a();
                    vli a7 = vlj.a();
                    a7.e(fcy.a);
                    a7.f(a6);
                    vlo d = vlr.d(context5, ankwVar2);
                    d.c = dyo.jp();
                    d.d((String[]) fdl.a.toArray(new String[fdl.a.size()]));
                    d.e(fdg.b);
                    a7.b(d.a());
                    yvh d2 = yvi.d(azqbVar5, ankwVar2);
                    d2.a = ejw.l;
                    d2.b(fcq.g);
                    d2.b = fcq.f;
                    d2.c = fdj.c;
                    a7.b(d2.a());
                    return ((yke) azqbVar6.get()).a(vmu.b(vlkVar.a(a7.a())), fcy.a);
                }
                return ((yvl) azqbVar4.get()).a(fcq.e, fdj.b, fcy.a);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object o() {
        InetAddress byAddress;
        yve yveVar;
        yve yveVar2;
        int i = this.b;
        int i2 = 3600;
        switch (i) {
            case 500:
                dyo dyoVar = this.a;
                return new ahdf((aadd) dyoVar.K.get(), (aacz) dyoVar.D.get(), (axwu) dyoVar.gZ.get());
            case 501:
                dyo dyoVar2 = this.a;
                aadd aaddVar = (aadd) dyoVar2.K.get();
                return new axwu((aacz) dyoVar2.D.get());
            case 502:
                dyo dyoVar3 = this.a;
                return new agvn((yve) dyoVar3.hb.get(), (yve) dyoVar3.hc.get());
            case 503:
                dyo dyoVar4 = this.a;
                vjf a = vjg.a(dyoVar4.b.a);
                a.e("offline");
                a.f("offline_settings.schema.pb");
                Uri a2 = a.a();
                vli a3 = vlj.a();
                a3.e(awvb.a);
                a3.f(a2);
                return new yvc(vmu.b(((vlk) dyoVar4.j.get()).a(a3.a())), awvb.a);
            case 504:
                dyo dyoVar5 = this.a;
                return dyoVar5.bN().a(new agvo((afvn) dyoVar5.au.get()), agvc.f, awvb.a);
            case 505:
                return new fbv((aacz) this.a.D.get());
            case 506:
                dyo dyoVar6 = this.a;
                return new acse((acrr) dyoVar6.aw.get(), (zfq) dyoVar6.ee.get(), (aacz) dyoVar6.D.get());
            case 507:
                dyo dyoVar7 = this.a;
                return new agkd((yni) dyoVar7.y.get(), (aadd) dyoVar7.K.get(), (ScheduledExecutorService) dyoVar7.h.get(), dyoVar7.fO, dyoVar7.gS, dyoVar7.hk, dyoVar7.hl, dyoVar7.hh);
            case 508:
                dyo dyoVar8 = this.a;
                return new agwt((aacz) dyoVar8.D.get(), dyoVar8.gS, dyoVar8.hi, dyoVar8.hj);
            case 509:
                return new agwm((adzz) this.a.gB.get());
            case 510:
                dyo dyoVar9 = this.a;
                return new agwq((agrf) dyoVar9.gS.get(), (Key) dyoVar9.fT.get());
            case 511:
                return this.a.fJ();
            case 512:
                return new akvo((acrr) this.a.aw.get());
            case 513:
                return new agpq((acvh) this.a.ef.get());
            case 514:
                dyo dyoVar10 = this.a;
                Context context = dyoVar10.b.a;
                afjz afjzVar = (afjz) dyoVar10.ga.get();
                aeoc aeocVar = (aeoc) dyoVar10.hs.get();
                yrj yrjVar = (yrj) dyoVar10.as.get();
                afle dP = dyoVar10.dP();
                afbz afbzVar = (afbz) dyoVar10.gF.get();
                azqb azqbVar = dyoVar10.ht;
                afmw dS = dyoVar10.dS();
                String str = (String) dyoVar10.fa.get();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) dyoVar10.h.get();
                axnm a4 = axot.a(dyoVar10.G);
                aepf aepfVar = (aepf) dyoVar10.gx.get();
                afjm afjmVar = (afjm) dyoVar10.hu.get();
                aant aantVar = (aant) dyoVar10.fU.get();
                aadd aaddVar2 = (aadd) dyoVar10.K.get();
                aeai aeaiVar = (aeai) dyoVar10.gB.get();
                aeha dB = dyoVar10.dB();
                pwx pwxVar = (pwx) dyoVar10.gP.get();
                axdi axdiVar = (axdi) dyoVar10.hw.get();
                aesh aeshVar = (aesh) dyoVar10.hA.get();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) dyoVar10.h.get();
                snc sncVar = (snc) dyoVar10.v.get();
                snc sncVar2 = (snc) dyoVar10.hB.get();
                aeju aejuVar = (aeju) dyoVar10.gG.get();
                afhj afhjVar = (afhj) dyoVar10.gh.get();
                adzt adztVar = (adzt) dyoVar10.gI.get();
                afkd afkdVar = (afkd) dyoVar10.hD.get();
                aeln aelnVar = (aeln) dyoVar10.gz.get();
                afex afexVar = (afex) dyoVar10.gL.get();
                aegt aegtVar = (aegt) dyoVar10.hv.get();
                azqb azqbVar2 = dyoVar10.hE;
                afaa afaaVar = (afaa) dyoVar10.hF.get();
                affu affuVar = (affu) dyoVar10.hG.get();
                afgz dJ = dyoVar10.dJ();
                afbq c = afby.c((yrj) dyoVar10.as.get(), dyoVar10.dJ(), (afjz) dyoVar10.ga.get());
                agpr agprVar = (agpr) dyoVar10.gJ.get();
                return adyk.b(context, afjzVar, aeocVar, yrjVar, dP, azqbVar, dS, str, scheduledExecutorService, a4, aepfVar, afjmVar, aantVar, aeaiVar, dB, pwxVar, axdiVar, aeshVar, sncVar, sncVar2, aejuVar, afhjVar, afkdVar, aelnVar, afexVar, aegtVar, azqbVar2, afaaVar, affuVar, dJ, c, (yrd) dyoVar10.hI.get(), (afig) dyoVar10.gO.get(), (aeaf) dyoVar10.gA.get(), (afja) dyoVar10.hU.get());
            case 515:
                return new aipl((aipk) this.a.hr.get());
            case 516:
                dyo dyoVar11 = this.a;
                amup l = amup.l("/pudl", new agud((snc) dyoVar11.v.get(), (afjm) dyoVar11.ho.get()), "/exocache", new aipg((afjm) dyoVar11.hp.get()));
                boolean booleanValue = ((Boolean) dyoVar11.hq.get()).booleanValue();
                ahfm ahfmVar = (ahfm) dyoVar11.bd.get();
                aacz aaczVar = (aacz) dyoVar11.D.get();
                try {
                    aipk aipkVar = new aipk(l, booleanValue);
                    aipkVar.e = new ServerSocket();
                    ServerSocket serverSocket = aipkVar.e;
                    if (aipkVar.d) {
                        byAddress = InetAddress.getByAddress("loopback", new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1});
                    } else {
                        byAddress = InetAddress.getByAddress("loopback", new byte[]{Byte.MAX_VALUE, 0, 0, 1});
                    }
                    serverSocket.bind(new InetSocketAddress(byAddress, 0));
                    aipkVar.f = Executors.newSingleThreadExecutor(new yli("mediaReq"));
                    aipkVar.f.execute(new aiph(aipkVar));
                    return aipkVar;
                } catch (Exception e) {
                    zep.d("Exception starting MediaServer", e);
                    return null;
                }
            case 517:
                dyo dyoVar12 = this.a;
                return afla.b((afla) dyoVar12.gE.get(), afla.b(new agsx((aghd) dyoVar12.gC.get(), dyoVar12.dK(), (afkf) dyoVar12.gD.get(), (axxl) dyoVar12.fF.get()), agwo.b));
            case 518:
                return this.a.dM();
            case 519:
                dyo dyoVar13 = this.a;
                return new adxh((aadd) dyoVar13.K.get(), (aeab) dyoVar13.fS.get());
            case 520:
                return false;
            case 521:
                aerh a5 = ((agrf) this.a.gS.get()).a().a();
                axzl.o(a5);
                return a5;
            case 522:
                dyo dyoVar14 = this.a;
                return adxx.f((aant) dyoVar14.fU.get(), dyoVar14.dP());
            case 523:
                dyo dyoVar15 = this.a;
                return adxx.k((afjz) dyoVar15.ga.get(), (snc) dyoVar15.v.get());
            case 524:
                return acsv.h();
            case 525:
                dyo dyoVar16 = this.a;
                return adzp.c(dyoVar16.dH(), dyoVar16.ec(), (afxq) dyoVar16.hz.get());
            case 526:
                dyo dyoVar17 = this.a;
                return adxx.n((afsz) dyoVar17.s.get(), dyoVar17.b.a);
            case 527:
                return this.a.bT();
            case 528:
                dyo dyoVar18 = this.a;
                return oql.d(dyoVar18.b.a, (afsm) dyoVar18.dp.get());
            case 529:
                return this.a.gA();
            case 530:
                dyo dyoVar19 = this.a;
                return adxx.j((aadd) dyoVar19.K.get(), new zgi(), (aflq) dyoVar19.fV.get());
            case 531:
                return this.a.gM();
            case 532:
                return acsv.n();
            case 533:
                return rvq.a(this.a.b.a);
            case 534:
                return acsv.i();
            case 535:
                dyo dyoVar20 = this.a;
                return adxx.m((afjz) dyoVar20.ga.get(), (snc) dyoVar20.v.get());
            case 536:
                dyo dyoVar21 = this.a;
                yrd yrdVar = (yrd) dyoVar21.hH.get();
                adxx.g((aadd) dyoVar21.K.get(), yrdVar);
                return yrdVar;
            case 537:
                return wxf.e(this.a.bK());
            case 538:
                dyo dyoVar22 = this.a;
                return new afja((snc) dyoVar22.v.get(), (snc) dyoVar22.hB.get(), dyoVar22.b.a, (afst) dyoVar22.hx.get(), (aadd) dyoVar22.K.get(), new afjd((afwu) dyoVar22.hL.get(), (afsw) dyoVar22.hM.get(), (yrj) dyoVar22.as.get(), (zdp) dyoVar22.hN.get(), (afst) dyoVar22.hx.get(), (afkf) dyoVar22.gD.get(), (ScheduledExecutorService) dyoVar22.h.get(), (Executor) dyoVar22.h.get(), (afvn) dyoVar22.au.get(), axot.a(dyoVar22.hP), axot.a(dyoVar22.hQ), axot.a(dyoVar22.gI), (List) dyoVar22.hT.get(), dyoVar22.b.a, (aeab) dyoVar22.fS.get(), (afjz) dyoVar22.ga.get()));
            case 539:
                dyo dyoVar23 = this.a;
                return dyoVar23.eb().a(dyoVar23.hZ());
            case 540:
                return this.a.dZ();
            case 541:
                return adyg.k((ymk) this.a.hJ.get());
            case 542:
                return this.a.bE();
            case 543:
                return "keyValueByteStores";
            case 544:
                return new aftb((yme) this.a.M.get());
            case 545:
                return ooq.e((vzm) this.a.dh.get());
            case 546:
                return new afwx((yjs) this.a.ai.get());
            case 547:
                return aheb.c((afsv) this.a.hK.get());
            case 548:
                return this.a.bR();
            case 549:
                return this.a.gr();
            case 550:
                return adyg.b((aeov) this.a.hO.get());
            case 551:
                dyo dyoVar24 = this.a;
                return ahed.c((afio) dyoVar24.hR.get(), (afiy) dyoVar24.hS.get());
            case 552:
                return acsv.l();
            case 553:
                return acsv.m();
            case 554:
                dyo dyoVar25 = this.a;
                return new WillAutonavInformer((yve) dyoVar25.hX.get(), (yni) dyoVar25.y.get(), (vzc) dyoVar25.hY.get(), (afvn) dyoVar25.au.get(), ampq.j(Boolean.valueOf(egd.J((aacz) dyoVar25.D.get()))), (axxu) dyoVar25.hZ.get());
            case 555:
                yve yveVar3 = (yve) this.a.hW.get();
                axzl.o(yveVar3);
                return yveVar3;
            case 556:
                return this.a.bD();
            case 557:
                return this.a.aZ();
            case 558:
                dyo dyoVar26 = this.a;
                return new axxu((aacz) dyoVar26.D.get(), (aadd) dyoVar26.K.get());
            case 559:
                return this.a.fd();
            case 560:
                return ahdx.A((aidn) this.a.eQ.get());
            case 561:
                dyo dyoVar27 = this.a;
                return new jxn((yve) dyoVar27.hX.get(), (yve) dyoVar27.ie.get(), (Executor) dyoVar27.x.get(), (WillAutonavInformer) dyoVar27.ia.get());
            case 562:
                dyo dyoVar28 = this.a;
                azqb azqbVar3 = dyoVar28.ic;
                azqb azqbVar4 = dyoVar28.id;
                athd athdVar = ((aacz) dyoVar28.D.get()).b().o;
                if (athdVar == null) {
                    athdVar = athd.a;
                }
                aujq aujqVar = athdVar.g;
                if (aujqVar == null) {
                    aujqVar = aujq.a;
                }
                if (aujqVar.d) {
                    yveVar = (yve) azqbVar4.get();
                } else {
                    yveVar = (yve) azqbVar3.get();
                }
                axzl.o(yveVar);
                return yveVar;
            case 563:
                yvl bN = this.a.bN();
                final fgl fglVar = fgl.a;
                return bN.a(new ampg() { // from class: fgk
                    @Override // defpackage.ampg
                    public final Object apply(Object obj) {
                        fgl fglVar2 = fgl.this;
                        SharedPreferences sharedPreferences = (SharedPreferences) obj;
                        if (sharedPreferences != null) {
                            aopa createBuilder = fgl.a.createBuilder();
                            if (sharedPreferences.contains(etk.AUTONAV_TOGGLE_USER_EDU_TRIGGERS_REMAINING)) {
                                int i3 = sharedPreferences.getInt(etk.AUTONAV_TOGGLE_USER_EDU_TRIGGERS_REMAINING, 1);
                                createBuilder.copyOnWrite();
                                fgl fglVar3 = (fgl) createBuilder.instance;
                                fglVar3.b = 1 | fglVar3.b;
                                fglVar3.c = i3;
                            }
                            return (fgl) createBuilder.mo39build();
                        }
                        return fglVar2;
                    }
                }, fdj.e, fglVar);
            case 564:
                return this.a.bC();
            case 565:
                dyo dyoVar29 = this.a;
                return new aaqp(dyoVar29.eq, (aadd) dyoVar29.K.get(), (afvn) dyoVar29.au.get());
            case 566:
                return this.a.fh();
            case 567:
                dyo dyoVar30 = this.a;
                return abgl.b((SharedPreferences) dyoVar30.t.get(), dyoVar30.il, dyoVar30.ax, (aabw) dyoVar30.in.get(), (Executor) dyoVar30.h.get());
            case 568:
                return yie.l();
            case 569:
                return yie.n();
            case 570:
                return yie.m();
            case 571:
                return this.a.U();
            case 572:
                return this.a.q();
            case 573:
                dyo dyoVar31 = this.a;
                return ymf.c(dyoVar31.b.a, "commonui", "bedtime_proto.pb", (vlk) dyoVar31.j.get(), egw.a);
            case 574:
                dyo dyoVar32 = this.a;
                return ymf.c(dyoVar32.b.a, "commonui", "bedtime_setting_proto.pb", (vlk) dyoVar32.j.get(), egy.a);
            case 575:
                dyo dyoVar33 = this.a;
                return new eil(dyoVar33.b.a, dyoVar33.ir, (aacz) dyoVar33.D.get(), (efz) dyoVar33.cQ.get(), (Executor) dyoVar33.h.get(), (ayor) dyoVar33.aq.get());
            case 576:
                return new vwj(this.a.b.a);
            case 577:
                dyo dyoVar34 = this.a;
                return new axxi((aacz) dyoVar34.D.get(), (aadd) dyoVar34.K.get());
            case 578:
                return new fzm((fyx) this.a.iA.get());
            case 579:
                dyo dyoVar35 = this.a;
                return new fyx((yni) dyoVar35.y.get(), (yrj) dyoVar35.as.get(), (aadd) dyoVar35.K.get(), (yve) dyoVar35.iy.get(), (aynx) dyoVar35.fX.get(), (Executor) dyoVar35.x.get(), (ayor) dyoVar35.iz.get(), (ayor) dyoVar35.aq.get());
            case 580:
                dyo dyoVar36 = this.a;
                azqb azqbVar5 = dyoVar36.iw;
                azqb azqbVar6 = dyoVar36.ix;
                String[] strArr = fgs.a;
                athd athdVar2 = ((aacz) dyoVar36.D.get()).b().o;
                if (athdVar2 == null) {
                    athdVar2 = athd.a;
                }
                aujq aujqVar2 = athdVar2.g;
                if (aujqVar2 == null) {
                    aujqVar2 = aujq.a;
                }
                if (aujqVar2.d) {
                    yveVar2 = (yve) azqbVar6.get();
                } else {
                    yveVar2 = (yve) azqbVar5.get();
                }
                axzl.o(yveVar2);
                return yveVar2;
            case 581:
                dyo dyoVar37 = this.a;
                yvl bN2 = dyoVar37.bN();
                final afvn afvnVar = (afvn) dyoVar37.au.get();
                String[] strArr2 = fgs.a;
                final fgu fguVar = fgu.a;
                return bN2.a(new ampg() { // from class: fgr
                    @Override // defpackage.ampg
                    public final Object apply(Object obj) {
                        fgu fguVar2 = fgu.this;
                        afvn afvnVar2 = afvnVar;
                        fgm fgmVar = new fgm((SharedPreferences) obj);
                        fgu a6 = fgs.a(fguVar2, fgmVar);
                        String b = ezv.b("bollard_enabled", afvnVar2);
                        aopa createBuilder = fgp.a.createBuilder();
                        boolean z = true;
                        if (fgmVar.b(b)) {
                            boolean c2 = fgmVar.c(b);
                            createBuilder.copyOnWrite();
                            fgp fgpVar = (fgp) createBuilder.instance;
                            fgpVar.b |= 1;
                            fgpVar.c = c2;
                        } else {
                            z = false;
                        }
                        String b2 = ezv.b("bollard_frequency_mins", afvnVar2);
                        if (fgmVar.b(b2)) {
                            int a7 = fgmVar.a(b2, 0);
                            createBuilder.copyOnWrite();
                            fgp fgpVar2 = (fgp) createBuilder.instance;
                            fgpVar2.b |= 2;
                            fgpVar2.d = a7;
                        } else if (!z) {
                            return a6;
                        }
                        aopa mo52toBuilder = a6.mo52toBuilder();
                        mo52toBuilder.j(afvnVar2.c().d(), (fgp) createBuilder.mo39build());
                        return (fgu) mo52toBuilder.mo39build();
                    }
                }, fdj.g, fguVar);
            case 582:
                dyo dyoVar38 = this.a;
                Context context2 = dyoVar38.b.a;
                azqb azqbVar7 = dyoVar38.t;
                ankw ankwVar = (ankw) dyoVar38.h.get();
                String[] strArr3 = fgs.a;
                final fgu fguVar2 = fgu.a;
                vlo d = vlr.d(context2, ankwVar);
                d.b();
                d.c = dyo.jp();
                d.d(fgs.a);
                d.e(new vlp() { // from class: fgq
                    @Override // defpackage.vlp
                    public final aoqu a(vlq vlqVar, aoqu aoquVar) {
                        fgu fguVar3 = (fgu) aoquVar;
                        return fgs.a(fgu.this, new fgm(vlqVar));
                    }
                });
                vlr a6 = d.a();
                vli a7 = vlj.a();
                a7.f(yhr.a(context2, "watch", "watchstorage.pb"));
                a7.e(fguVar2);
                a7.b(a6);
                yvh d2 = yvi.d(azqbVar7, ankwVar);
                d2.a = ejw.q;
                d2.b(fcq.k);
                d2.b = fcq.j;
                d2.c = fdj.f;
                a7.b(d2.a());
                return new yvc(vmu.b(((vlk) dyoVar38.j.get()).a(a7.a())), fgu.a);
            case 583:
                dyo dyoVar39 = this.a;
                Executor executor = (Executor) dyoVar39.x.get();
                if ((((ywk) dyoVar39.B.get()).c(ywk.K) & 4) != 0) {
                    return new azmw(executor);
                }
                return azpj.b(executor);
            case 584:
                return new aatj((aaru) this.a.iC.get());
            case 585:
                dyo dyoVar40 = this.a;
                return new aaru((aacz) dyoVar40.D.get(), dyoVar40.h());
            case 586:
                dyo dyoVar41 = this.a;
                return new jad(dyoVar41.b.a, (agbd) dyoVar41.eu.get());
            case 587:
                return new aczy(this.a.jK);
            case 588:
                dyo dyoVar42 = this.a;
                return new adpt((Executor) dyoVar42.h.get(), (adas) dyoVar42.iK.get(), dyoVar42.iL, dyoVar42.km, dyoVar42.jq, (adbe) dyoVar42.jb.get(), (yni) dyoVar42.y.get());
            case 589:
                dyo dyoVar43 = this.a;
                return new adas((yqh) dyoVar43.iI.get(), (yqw) dyoVar43.iJ.get(), dyoVar43.hy());
            case 590:
                dyo dyoVar44 = this.a;
                yqn yqnVar = (yqn) dyoVar44.iF.get();
                int i3 = ((acwu) dyoVar44.iH.get()).T;
                if (i3 > 0) {
                    i2 = i3;
                }
                return yqnVar.a(aear.f(i2));
            case 591:
                return this.a.bL();
            case 592:
                return new ysi((String) this.a.fa.get());
            case 593:
                return this.a.cO();
            case 594:
                dyo dyoVar45 = this.a;
                return new axwq((aacz) dyoVar45.D.get(), (aadd) dyoVar45.K.get());
            case 595:
                dyo dyoVar46 = this.a;
                yqy yqyVar = (yqy) dyoVar46.fx.get();
                afsx afsxVar = (afsx) dyoVar46.fz.get();
                snc sncVar3 = (snc) dyoVar46.v.get();
                int i4 = ((acwu) dyoVar46.iH.get()).T;
                if (i4 > 0) {
                    i2 = i4;
                }
                yqw a8 = yqyVar.a(new cfh(), yqx.a(aear.f(i2), new afxz(afsxVar, sncVar3)), "mdx-dialcheck");
                a8.c();
                axzl.o(a8);
                return a8;
            case 596:
                dyo dyoVar47 = this.a;
                return new adwc(dyoVar47.as, ((SharedPreferences) dyoVar47.t.get()).getBoolean("MdxEnableFirstNetworkInterface", false), (SharedPreferences) dyoVar47.t.get());
            case 597:
                dyo dyoVar48 = this.a;
                return new adqq(dyoVar48.b.a, (ankw) dyoVar48.h.get(), (adkm) dyoVar48.iP.get(), dyoVar48.jq, (adkc) dyoVar48.iY.get(), (adkg) dyoVar48.kl.get(), (adkl) dyoVar48.iU.get());
            case 598:
                dyo dyoVar49 = this.a;
                return new adkj((yqh) dyoVar49.iM.get(), (adkh) dyoVar49.iO.get());
            case 599:
                return ((yqn) this.a.iF.get()).a(aear.g(3000, 5000));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        int i = this.b;
        switch (i) {
            case 1800:
                return this.a.a.d();
            case 1801:
                dxs dxsVar = this.a.a;
                return new jaz((aagi) dxsVar.bF.c.dD.get(), (Executor) dxsVar.bF.c.h.get());
            case 1802:
                dyo dyoVar = this.a;
                return new joc((fcl) dyoVar.kI.get(), dyoVar.gS, (aagi) dyoVar.dD.get(), (aahf) dyoVar.dK.get());
            case 1803:
                dxs dxsVar2 = this.a.a;
                return new adbv((adoa) dxsVar2.bF.c.jq.get(), (tdb) dxsVar2.bF.c.nO.get());
            case 1804:
                return this.a.a.m();
            case 1805:
                dyo dyoVar2 = this.a.a.bF.c;
                return new adhh(dyoVar2.fO, (aczr) dyoVar2.bg.get());
            case 1806:
                dxs dxsVar3 = this.a.a;
                dyo dyoVar3 = dxsVar3.bF.c;
                return new xrw(dyoVar3.b.a, (Executor) dyoVar3.h.get(), (Executor) dxsVar3.bF.c.x.get(), (xry) dxsVar3.ax.get(), (afts) dxsVar3.bF.c.zl.get());
            case 1807:
                dxs dxsVar4 = this.a.a;
                return new xry((vzm) dxsVar4.bF.c.dh.get(), (afvn) dxsVar4.bF.c.au.get(), wsb.l());
            case 1808:
                dxs dxsVar5 = this.a.a;
                return new xqj(dxsVar5.bF.c.b.a, (xpx) dxsVar5.az.get(), (Executor) dxsVar5.bF.c.h.get(), (Executor) dxsVar5.bF.c.x.get());
            case 1809:
                dyo dyoVar4 = this.a.a.bF.c;
                return new xpx(dyoVar4.b.a, (afts) dyoVar4.zl.get());
            case 1810:
                return new acus();
            case 1811:
                return new ajfm();
            case 1812:
                return new ljx();
            case 1813:
                return new ekw();
            case 1814:
                return new xxt();
            case 1815:
                return new xye();
            case 1816:
                return new yfg();
            case 1817:
                dyo dyoVar5 = this.a;
                return new jnw((fcl) dyoVar5.kI.get(), dyoVar5.gS, (Executor) dyoVar5.x.get(), (ExecutorService) dyoVar5.h.get());
            case 1818:
                dyo dyoVar6 = this.a;
                return new jki(dyoVar6.b.a, dyoVar6.gS, dyoVar6.kI, (jpg) dyoVar6.zU.get(), (fbj) dyoVar6.kH.get());
            case 1819:
                dyo dyoVar7 = this.a;
                return new jpg(dyoVar7.b.a, (jqb) dyoVar7.zS.get(), (jqb) dyoVar7.zT.get(), (fbx) dyoVar7.nA.get(), (snc) dyoVar7.v.get(), null);
            case 1820:
                dyo dyoVar8 = this.a;
                return new jqb((yrj) dyoVar8.as.get(), (fcd) dyoVar8.od.get(), (aghg) dyoVar8.lx.get(), dyoVar8.hf, (ahdf) dyoVar8.ha.get());
            case 1821:
                dyo dyoVar9 = this.a;
                return new jqb((yrj) dyoVar9.as.get(), (fcd) dyoVar9.od.get(), (aghg) dyoVar9.lx.get(), dyoVar9.hf, (ahdf) dyoVar9.ha.get(), 1);
            case 1822:
                return new jpe(this.a.b.a);
            case 1823:
                dyo dyoVar10 = this.a;
                return new fbr((snc) dyoVar10.v.get(), (yni) dyoVar10.y.get(), (ScheduledExecutorService) dyoVar10.h.get(), (Executor) dyoVar10.x.get());
            case 1824:
                return new mmb();
            case 1825:
                dyo dyoVar11 = this.a;
                Context context = dyoVar11.b.a;
                akze akzeVar = (akze) dyoVar11.mS.get();
                return egd.H(dyoVar11.b.a, (aacz) dyoVar11.D.get(), new alco(), (akze) dyoVar11.mS.get());
            case 1826:
                return new fbu((aacz) this.a.D.get());
            case 1827:
                return new jsd((fbw) this.a.le.get());
            case 1828:
                return new jsj(this.a.ef);
            case 1829:
                return new jjd();
            case 1830:
                dyo dyoVar12 = this.a;
                return new eml((aagi) dyoVar12.dD.get(), dyoVar12.r());
            case 1831:
                dyo dyoVar13 = this.a;
                aadd aaddVar = (aadd) dyoVar13.K.get();
                return new axxy((aacz) dyoVar13.D.get());
            case 1832:
                return new yln();
            case 1833:
                return this.a.a.b();
            case 1834:
                dxs dxsVar6 = this.a.a;
                aaqj aaqjVar = (aaqj) dxsVar6.bF.c.er.get();
                aaqf aaqfVar = (aaqf) dxsVar6.bF.c.eV.get();
                afvn afvnVar = (afvn) dxsVar6.bF.c.au.get();
                return new abdb(aaqjVar, aaqfVar, (yqw) dxsVar6.bF.c.fB.get(), (aacz) dxsVar6.bF.c.D.get(), (Executor) dxsVar6.bF.c.h.get());
            case 1835:
                return this.a.a.p();
            case 1836:
                dyo dyoVar14 = this.a.a.bF.c;
                vjf a = vjg.a(dyoVar14.b.a);
                a.e("shorts");
                a.f("ShortsData.pb");
                Uri a2 = a.a();
                vli a3 = vlj.a();
                a3.e(hiv.a);
                a3.f(a2);
                return ((vlk) dyoVar14.j.get()).a(a3.a());
            case 1837:
                dxs dxsVar7 = this.a.a;
                return new abcx((aaqj) dxsVar7.bF.c.er.get(), (aaqf) dxsVar7.bF.c.eV.get(), (afvn) dxsVar7.bF.c.au.get(), (yqw) dxsVar7.bF.c.fB.get());
            case 1838:
                return new hwq((aadd) this.a.a.bF.c.K.get());
            case 1839:
                dxs dxsVar8 = this.a.a;
                return new abdx((aaqj) dxsVar8.bF.c.er.get(), (aaqf) dxsVar8.bF.c.eV.get(), (afvn) dxsVar8.bF.c.au.get(), (yqw) dxsVar8.bF.c.fD.get(), (aacz) dxsVar8.bF.c.D.get());
            case 1840:
                dyo dyoVar15 = this.a.a.bF.c;
                vjf a4 = vjg.a(dyoVar15.b.a);
                a4.e("reeledu");
                a4.f("reeledu.pb");
                Uri a5 = a4.a();
                vli a6 = vlj.a();
                a6.e(ihr.a);
                a6.f(a5);
                return ((vlk) dyoVar15.j.get()).a(a6.a());
            case 1841:
                dxs dxsVar9 = this.a.a;
                return new ifu((igh) dxsVar9.bF.c.vY.get(), (aafd) dxsVar9.bF.c.vJ.get(), (hyl) dxsVar9.R.get(), (snc) dxsVar9.bF.c.v.get(), (Executor) dxsVar9.bF.c.x.get(), (acvf) dxsVar9.bF.c.ef.get(), (aego) dxsVar9.bF.c.hV.get(), dxsVar9.bF.c.gs(), (airw) dxsVar9.bF.c.vW.get(), (aapv) dxsVar9.bF.c.eq.get(), (afvn) dxsVar9.bF.c.au.get(), (hqp) dxsVar9.aJ.get(), null, null);
            case 1842:
                return gad.u();
            case 1843:
                dyo dyoVar16 = this.a.a.bF.c;
                vjf a7 = vjg.a(dyoVar16.b.a);
                a7.e("reelwatch");
                a7.f("reelwatch.pb");
                Uri a8 = a7.a();
                vli a9 = vlj.a();
                a9.e(ihs.a);
                a9.f(a8);
                return ((vlk) dyoVar16.j.get()).a(a9.a());
            case 1844:
                return this.a.a.u();
            case 1845:
                return this.a.a.t();
            case 1846:
                dyo dyoVar17 = this.a.a.bF.c;
                Context context2 = dyoVar17.b.a;
                final uqh uqhVar = new uqh();
                uqhVar.a = context2.getApplicationContext();
                uqhVar.b = (ExecutorService) dyoVar17.h.get();
                uqhVar.a.getClass();
                if (uqhVar.b == null) {
                    ExecutorService executorService = uqhVar.c;
                    if (executorService == null) {
                        executorService = Executors.newCachedThreadPool((ThreadFactory) uqhVar.g.get());
                    }
                    uqhVar.b = executorService;
                }
                if (uqhVar.c == null) {
                    uqhVar.c = Executors.newSingleThreadScheduledExecutor((ThreadFactory) uqhVar.g.get());
                }
                return new uqn(uqhVar.b, new amqo() { // from class: uqf
                    @Override // defpackage.amqo
                    public final Object get() {
                        final uqh uqhVar2 = uqh.this;
                        final upg upgVar = new upg(uqhVar2.a, uqhVar2.c);
                        amqo amqoVar = new amqo() { // from class: uqg
                            @Override // defpackage.amqo
                            public final Object get() {
                                uqh uqhVar3 = uqh.this;
                                upg upgVar2 = upgVar;
                                uqo uqoVar = new uqo();
                                uqoVar.a = uqhVar3.a.getApplicationContext();
                                uqoVar.b = uqhVar3.b;
                                uqoVar.c = upgVar2;
                                uqoVar.a.getClass();
                                uqoVar.b.getClass();
                                rsi rsiVar = new rsi();
                                rsiVar.a = 641;
                                qnm.d(true, "Must provide valid client application ID!");
                                rsj rsjVar = new rsj(rsiVar);
                                qst b = rsk.b(uqoVar.a, rsjVar);
                                rsf a10 = rsk.a(uqoVar.a, rsjVar);
                                qst c = rsk.c(uqoVar.a, rsjVar);
                                Context context3 = uqoVar.a;
                                return new urz(new urt(context3, b, a10, c, new upz(context3, uqoVar.b), uqoVar.b, qrq.a), 2, uqoVar.c, uqoVar.a.getPackageName());
                            }
                        };
                        if (uqhVar2.d.h(uqhVar2.a, 19621000) != 0) {
                            return amqoVar.get();
                        }
                        uqn uqnVar = new uqn(uqhVar2.b, amqoVar);
                        if (uqhVar2.e == null) {
                            rrm rrmVar = new rrm(uqhVar2.a);
                            vjd q = vje.q(uqhVar2.a);
                            q.b = rrmVar;
                            vjb vjbVar = new vjb(amuk.r(q.a()));
                            vll vllVar = new vll();
                            vllVar.a = uqhVar2.b;
                            vllVar.b = vjbVar;
                            vllVar.b(vmf.a);
                            vlk a10 = vllVar.a();
                            tzy tzyVar = new tzy();
                            Context context3 = uqhVar2.a;
                            context3.getClass();
                            tzyVar.a = context3;
                            ExecutorService executorService2 = uqhVar2.b;
                            executorService2.getClass();
                            tzyVar.b = executorService2;
                            tzyVar.d = vjbVar;
                            tzyVar.c = a10;
                            tzyVar.e = "OneGoogle";
                            Context context4 = tzyVar.a;
                            context4.getClass();
                            Executor executor = tzyVar.b;
                            executor.getClass();
                            vlk vlkVar = tzyVar.c;
                            vlkVar.getClass();
                            vjb vjbVar2 = tzyVar.d;
                            vjbVar2.getClass();
                            String str = tzyVar.e;
                            str.getClass();
                            tzv tzvVar = new tzv(context4);
                            HandlerThread handlerThread = new HandlerThread("ProtoDataStore-Message-Handler");
                            handlerThread.start();
                            Handler handler = new Handler(handlerThread.getLooper());
                            vkz vkzVar = new vkz();
                            vkzVar.a = context4.getApplicationContext();
                            vkzVar.c = "com.google.android.gms.permission.INTERNAL_BROADCAST";
                            vkzVar.b = g.o;
                            vkzVar.d = handler;
                            uqhVar2.e = new uat(context4, executor, str, vjbVar2, vlkVar, tzvVar, new vlc(vkzVar));
                        }
                        Context context5 = uqhVar2.a;
                        return new urn(new urz(new ura(context5, uqhVar2.e, new upz(context5, uqhVar2.b), upgVar, Build.VERSION.SDK_INT >= 26 ? new uqv() : new uqv(1)), 1, upgVar, uqhVar2.a.getPackageName()), uqnVar);
                    }
                });
            case 1847:
                dxs dxsVar10 = this.a.a;
                return new tor(dxsVar10.P, dxsVar10.Q, dxsVar10.aD);
            case 1848:
                dxs dxsVar11 = this.a.a;
                tln tlnVar = (tln) dxsVar11.M.get();
                snc sncVar = (snc) dxsVar11.bF.c.v.get();
                return new tmg();
            case 1849:
                dxs dxsVar12 = this.a.a;
                dyo dyoVar18 = dxsVar12.bF.c;
                uob a10 = uoc.a(dyoVar18.b.a, ulx.class);
                a10.d((umq) dxsVar12.aN.get());
                a10.e((ExecutorService) dyoVar18.h.get());
                a10.c = new uow();
                a10.f((toq) dxsVar12.aO.get());
                return a10.a();
            case 1850:
                return this.a.a.n();
            case 1851:
                return new wdv();
            case 1852:
                return this.a.a.e();
            case 1853:
                return this.a.a.c();
            case 1854:
                return this.a.a.f();
            case 1855:
                return this.a.a.aj();
            case 1856:
                return this.a.a.h();
            case 1857:
                return this.a.a.al();
            case 1858:
                return new jtr(this.a.a.bF.c.nz, 7, (float[]) null);
            case 1859:
                return this.a.a.ak();
            case 1860:
                return this.a.a.am();
            case 1861:
                return this.a.a.j();
            case 1862:
                return this.a.a.g();
            case 1863:
                return this.a.a.i();
            case 1864:
                dyo dyoVar19 = this.a.a.bF.c;
                return new jtt(dyoVar19.nz, dyoVar19.K, dyoVar19.as, dyoVar19.kI);
            case 1865:
                return new jtr(this.a.a.bF.c.nS, 2, (byte[]) null);
            case 1866:
                return this.a.a.Y();
            case 1867:
                dyo dyoVar20 = this.a.a.bF.c;
                return new ajph(dyoVar20.kC, dyoVar20.cP, dyoVar20.hl);
            case 1868:
                return this.a.a.a();
            case 1869:
                dxs dxsVar13 = this.a.a;
                aadd aaddVar2 = (aadd) dxsVar13.bF.c.K.get();
                return new axxv((aacz) dxsVar13.bF.c.D.get());
            case 1870:
                return egd.d(this.a.a.bF.c.b.a);
            case 1871:
                return this.a.a.ao();
            case 1872:
                dxs dxsVar14 = this.a.a;
                aaqf aaqfVar2 = (aaqf) dxsVar14.bF.c.eV.get();
                afvn afvnVar2 = (afvn) dxsVar14.bF.c.au.get();
                yqw bJ = dxsVar14.bF.c.bJ();
                aacz aaczVar = (aacz) dxsVar14.bF.c.D.get();
                amvn p = amvn.p(egd.M((aadd) dxsVar14.bF.c.K.get(), (axxn) dxsVar14.aZ.get(), (kug) dxsVar14.ba.get(), (isp) dxsVar14.bb.get(), (fzm) dxsVar14.bF.c.iB.get()));
                yqw bJ2 = dxsVar14.bF.c.bJ();
                aaqj aaqjVar2 = (aaqj) dxsVar14.bF.c.er.get();
                aaoq cj = dxsVar14.bF.c.cj();
                if (!((aaay) dxsVar14.bF.c.bb.get()).g) {
                    cj = aaoq.a;
                }
                return new abcg(aaqfVar2, afvnVar2, bJ, aaczVar, p, new abcd(aaqjVar2, bJ2, cj), (yni) dxsVar14.bF.c.y.get());
            case 1873:
                dxs dxsVar15 = this.a.a;
                aacz aaczVar2 = (aacz) dxsVar15.bF.c.D.get();
                return new axxn((aadd) dxsVar15.bF.c.K.get());
            case 1874:
                return this.a.a.k();
            case 1875:
                return this.a.a.l();
            case 1876:
                return new isp((aaru) this.a.a.bF.c.iC.get());
            case 1877:
                dxs dxsVar16 = this.a.a;
                return aolu.w(((Boolean) dxsVar16.bF.c.ed.get()).booleanValue(), axot.a(dxsVar16.bF.c.xg), axot.a(dxsVar16.bF.c.eh), axot.a(dxsVar16.bF.c.aA), axot.a(dxsVar16.bF.c.xh));
            case 1878:
                return gad.l();
            case 1879:
                dyo dyoVar21 = this.a.a.bF.c;
                return ymf.c(dyoVar21.b.a, "premium_filter", "premium_filter_schema.pb", (vlk) dyoVar21.j.get(), kud.a);
            case 1880:
                return new fby((aacz) this.a.a.bF.c.D.get());
            case 1881:
                dxs dxsVar17 = this.a.a;
                aacz aaczVar3 = (aacz) dxsVar17.bF.c.D.get();
                return new axxg((aadd) dxsVar17.bF.c.K.get());
            case 1882:
                return new akpj();
            case 1883:
                return new aknz();
            case 1884:
                dxs dxsVar18 = this.a.a;
                return new wbg((wea) dxsVar18.bF.c.I.get(), (wac) dxsVar18.bF.c.au.get(), (Executor) dxsVar18.bF.c.h.get());
            case 1885:
                return new wgd();
            case 1886:
                dxs dxsVar19 = this.a.a;
                return new xrl(dxsVar19.bF.c.b.a, (xpx) dxsVar19.az.get(), (Executor) dxsVar19.bF.c.x.get(), (Executor) dxsVar19.bF.c.h.get());
            case 1887:
                dxs dxsVar20 = this.a.a;
                dyo dyoVar22 = dxsVar20.bF.c;
                Context context3 = dyoVar22.b.a;
                vjf a11 = vjg.a(context3);
                a11.e("comment");
                a11.f("comment.pb");
                Uri a12 = a11.a();
                vli a13 = vlj.a();
                a13.f(a12);
                a13.e(awtg.a);
                vlo d = vlr.d(context3, (ankw) dyoVar22.h.get());
                d.c = dyo.jp();
                d.b();
                d.d("preview_tooltip_image_preview_tool");
                d.e(fdg.m);
                a13.b(d.a());
                return ((vlk) dxsVar20.bF.c.j.get()).a(a13.a());
            case 1888:
                return new ache();
            case 1889:
                dxs dxsVar21 = this.a.a;
                return new aayl((aaqj) dxsVar21.bF.c.er.get(), (aaqf) dxsVar21.bF.c.eV.get(), (afvn) dxsVar21.bF.c.au.get(), (yqw) dxsVar21.bF.c.fD.get());
            case 1890:
                return new acty();
            case 1891:
                return this.a.fV();
            case 1892:
                dxs dxsVar22 = this.a.a;
                return new abzb((aaqj) dxsVar22.bF.c.er.get(), (aaqf) dxsVar22.bF.c.eV.get(), (afvn) dxsVar22.bF.c.au.get(), (yqw) dxsVar22.bF.c.fD.get(), (Executor) dxsVar22.bF.c.h.get());
            case 1893:
                return this.a.a.ai();
            case 1894:
                return false;
            case 1895:
                dxs dxsVar23 = this.a.a;
                dyo dyoVar23 = dxsVar23.bF.c;
                Context context4 = dyoVar23.b.a;
                vjf a14 = vjg.a(context4);
                a14.e("mdx");
                a14.f("smart_remote.pb");
                Uri a15 = a14.a();
                vlo d2 = vlr.d(context4, (ankw) dyoVar23.h.get());
                d2.c = dyo.jp();
                d2.b();
                d2.d("MDx.SmartRemote.isDisconnectTipAlreadyShown", "MDx.SmartRemote.isPrivacyDialogShown");
                d2.e(adiz.c);
                vlr a16 = d2.a();
                vli a17 = vlj.a();
                a17.f(a15);
                a17.e(awtz.a);
                a17.b(a16);
                return ((vlk) dxsVar23.bF.c.j.get()).a(a17.a());
            case 1896:
                return this.a.a.U();
            case 1897:
                return new akpi();
            case 1898:
                return egd.y();
            case 1899:
                dxs dxsVar24 = this.a.a;
                dyo dyoVar24 = dxsVar24.bF.c;
                Context context5 = dyoVar24.b.a;
                vjf a18 = vjg.a(context5);
                a18.e("edit");
                a18.f("camera.pb");
                Uri a19 = a18.a();
                vlo d3 = vlr.d(context5, (ankw) dyoVar24.h.get());
                d3.d("camera_facing");
                d3.b();
                d3.c = dyo.jp();
                d3.e(fdg.p);
                vlr a20 = d3.a();
                vli a21 = vlj.a();
                a21.e(znc.a);
                a21.f(a19);
                a21.b(a20);
                return ((vlk) dxsVar24.bF.c.j.get()).a(a21.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        int i = this.b;
        switch (i) {
            case 1700:
                return new yic();
            case 1701:
                return this.a.a.D();
            case 1702:
                return new emy();
            case 1703:
                return new ycs();
            case 1704:
                return new ylr();
            case 1705:
                dxs dxsVar = this.a.a;
                return new abeo((aaqj) dxsVar.bF.c.er.get(), (aaqf) dxsVar.bF.c.eV.get(), (afvn) dxsVar.bF.c.au.get(), (yqw) dxsVar.bF.c.fD.get());
            case 1706:
                return this.a.a.W();
            case 1707:
                return new akdr((yve) this.a.yX.get());
            case 1708:
                dyo dyoVar = this.a;
                Context context = dyoVar.b.a;
                yme ymeVar = (yme) dyoVar.M.get();
                vjf a = vjg.a(context);
                a.e("rendering");
                a.f("rendering_settings.pb");
                Uri a2 = a.a();
                vli a3 = vlj.a();
                a3.e(aoue.a);
                a3.f(a2);
                vlo d = vlr.d(context, (ankw) dyoVar.h.get());
                d.c = dyo.jp();
                d.b();
                d.d("permissions_requested");
                d.e(adiz.i);
                a3.b(d.a());
                return new yvc(vmu.b(((vlk) dyoVar.j.get()).a(a3.a())), aoue.a);
            case 1709:
                return new aqmv();
            case 1710:
                return ampq.j(this.a.aw());
            case 1711:
                return new ajil((yxz) this.a.xa.get());
            case 1712:
                dyo dyoVar2 = this.a;
                return new aaxo((aaqj) dyoVar2.er.get(), (aaqf) dyoVar2.eV.get(), (yqw) dyoVar2.fB.get());
            case 1713:
                dyo dyoVar3 = this.a;
                return new aksf((aaqj) dyoVar3.er.get(), (aaqf) dyoVar3.eV.get(), (afvn) dyoVar3.au.get(), (yqw) dyoVar3.fD.get(), (Executor) dyoVar3.x.get());
            case 1714:
                dyo dyoVar4 = this.a;
                return ((Boolean) dyoVar4.ed.get()).booleanValue() ? new tgu((aolu) axot.a(dyoVar4.xg).get(), (thu) axot.a(dyoVar4.eh).get(), (Executor) axot.a(dyoVar4.aA).get(), (ajiy) axot.a(dyoVar4.xh).get(), null, null, null, null) : tcw.a;
            case 1715:
                Context context2 = this.a.b.a;
                int i2 = ajjn.a;
                return false;
            case 1716:
                return ajjn.t((aacz) this.a.D.get());
            case 1717:
                return ajjn.g((aadd) this.a.K.get());
            case 1718:
                return this.a.aw();
            case 1719:
                dyo dyoVar5 = this.a;
                Context context3 = dyoVar5.b.a;
                ajmd ajmdVar = (ajmd) dyoVar5.dP.get();
                return ajjn.x((tdb) dyoVar5.nO.get(), context3, dyoVar5.hx());
            case 1720:
                dyo dyoVar6 = this.a;
                ajmd ajmdVar2 = (ajmd) dyoVar6.dP.get();
                Context context4 = dyoVar6.b.a;
                int i3 = ajjn.a;
                return false;
            case 1721:
                return ajjn.s(axot.a(this.a.ek));
            case 1722:
                dyo dyoVar7 = this.a;
                Context context5 = dyoVar7.b.a;
                return xsf.d((aacz) dyoVar7.D.get()) ? new eym(context5) : new ajmi(context5);
            case 1723:
                dyo dyoVar8 = this.a;
                return new afqj((aaqj) dyoVar8.er.get(), (aaqf) dyoVar8.eV.get(), (afvn) dyoVar8.au.get(), (yqw) dyoVar8.fD.get(), (Executor) dyoVar8.x.get());
            case 1724:
                return new wml((wrc) this.a.rZ.get());
            case 1725:
                ajmy ajmyVar = (ajmy) this.a.kC.get();
                amum h = amup.h();
                h.f(zyz.SIMPLE_CARD, new zzk(ajmyVar));
                h.f(zyz.VIDEO_CARD, new zzd(ajmyVar, 2, null));
                h.f(zyz.PLAYLIST_CARD, new zzd(ajmyVar));
                h.f(zyz.COLLABORATOR_CARD, new zzd(ajmyVar, 1));
                h.f(zyz.SHOPPING_CARD, new zzh(ajmyVar));
                return new aaao(new EnumMap(h.b()));
            case 1726:
                dyo dyoVar9 = this.a;
                aacz aaczVar = (aacz) dyoVar9.D.get();
                return new axxx((aadd) dyoVar9.K.get());
            case 1727:
                dxs dxsVar2 = this.a.a;
                wge wgeVar = (wge) dxsVar2.bF.c.mH.get();
                wac wacVar = (wac) dxsVar2.bF.c.au.get();
                whp whpVar = (whp) dxsVar2.bF.c.df.get();
                aasc aascVar = (aasc) dxsVar2.bF.c.mG.get();
                wcw wcwVar = (wcw) dxsVar2.A.get();
                return new wgp(wgeVar, wacVar, whpVar, aascVar, (yni) dxsVar2.bF.c.y.get());
            case 1728:
                return new wcw();
            case CardboardDevice$DeviceParams.INTERNAL_FIELD_NUMBER /* 1729 */:
                return this.a.a.w();
            case 1730:
                dyo dyoVar10 = this.a;
                azqb azqbVar = dyoVar10.zr;
                asxj asxjVar = ((aacz) dyoVar10.D.get()).b().e;
                if (asxjVar == null) {
                    asxjVar = asxj.a;
                }
                adfl adflVar = asxjVar.bv ? (adfl) azqbVar.get() : adfl.a;
                axzl.o(adflVar);
                return adflVar;
            case 1731:
                aecq aecqVar = (aecq) this.a.zq.get();
                return new adfp();
            case 1732:
                gad.l();
                return new aecq();
            case 1733:
                return new lya();
            case 1734:
                dyo dyoVar11 = this.a;
                vjb vjbVar = (vjb) dyoVar11.i.get();
                return okx.b(dyoVar11.b.a, dyoVar11.j, (ankw) dyoVar11.h.get(), dyo.jp(), (yke) dyoVar11.p.get());
            case 1735:
                dyo dyoVar12 = this.a;
                vjb vjbVar2 = (vjb) dyoVar12.i.get();
                return lxx.b(dyoVar12.b.a, dyoVar12.j, (ankw) dyoVar12.h.get(), dyo.jp(), (yke) dyoVar12.p.get());
            case 1736:
                return new akjb();
            case 1737:
                return egd.s((snc) this.a.v.get());
            case 1738:
                aacz aaczVar2 = (aacz) this.a.D.get();
                apyy b = aaczVar2.b();
                if (b != null) {
                    asxj asxjVar2 = b.e;
                    if (asxjVar2 == null) {
                        asxjVar2 = asxj.a;
                    }
                    if (asxjVar2.bm) {
                        return new let(VoiceSearchActivityV2.class);
                    }
                }
                return eog.ba(aaczVar2) ? new let(VoiceSearchHalfPlateV0Activity.class) : new let(VoiceSearchActivity.class);
            case 1739:
                return new lxh();
            case 1740:
                dyo dyoVar13 = this.a;
                return new lur((aadd) dyoVar13.K.get(), dyoVar13.b.a, (aahf) dyoVar13.dK.get(), (aagi) dyoVar13.dD.get(), (afvn) dyoVar13.au.get(), (itg) dyoVar13.zB.get(), (yve) dyoVar13.ez.get(), (gfu) dyoVar13.eA.get(), (fzr) dyoVar13.lV.get(), (ajmy) dyoVar13.kC.get());
            case 1741:
                return this.a.V();
            case 1742:
                dyo dyoVar14 = this.a;
                return egd.g((aaqj) dyoVar14.er.get(), (aaqf) dyoVar14.eV.get(), (afvn) dyoVar14.au.get(), (yqw) dyoVar14.fD.get(), dyoVar14.b.a);
            case 1743:
                return new GuideControllerImpl$WatchWhileLifecycleObserver();
            case 1744:
                dyo dyoVar15 = this.a;
                aadd aaddVar = (aadd) dyoVar15.K.get();
                return new axxf((aacz) dyoVar15.D.get());
            case 1745:
                dyo dyoVar16 = this.a;
                return new ilv((gak) dyoVar16.zD.get(), (ayor) dyoVar16.iz.get(), (aagi) dyoVar16.dD.get(), (aacz) dyoVar16.D.get());
            case 1746:
                return new gak((aacz) this.a.D.get());
            case 1747:
                dyo dyoVar17 = this.a;
                return new ilu((gak) dyoVar17.zD.get(), (ayor) dyoVar17.iz.get(), (aagi) dyoVar17.dD.get(), (aacz) dyoVar17.D.get());
            case 1748:
                return new acun();
            case 1749:
                dxs dxsVar3 = this.a.a;
                return new acgf(dxsVar3.E, dxsVar3.O());
            case 1750:
                dxs dxsVar4 = this.a.a;
                dyo dyoVar18 = dxsVar4.bF.c;
                Context context6 = dyoVar18.b.a;
                vjf a4 = vjg.a(context6);
                a4.e("livecreation");
                a4.f("livecreation.pb");
                Uri a5 = a4.a();
                vlo d2 = vlr.d(context6, (ankw) dyoVar18.h.get());
                d2.d("SHARED_PREF_STREAM_CONFIG_KEY", "PREF_HAS_SEEN_ORIENTATION_TOOLTIP", "HAS_SEEN_SCREENCAST_TOOLTIP", "IS_FIRST_STREAM", "SHARED_PREF_PORTRAIT_COUNT_KEY", "SHARED_PREF_LS_TIMESTAMP_KEY");
                d2.b();
                d2.c = dyo.jp();
                d2.e(fdg.r);
                vlr a6 = d2.a();
                vli a7 = vlj.a();
                a7.e(aotz.a);
                a7.f(a5);
                a7.b(a6);
                return ((vlk) dxsVar4.bF.c.j.get()).a(a7.a());
            case 1751:
                return new tmn((tmt) this.a.a.O.get());
            case 1752:
                dxs dxsVar5 = this.a.a;
                amyg amygVar = amyg.a;
                anay anayVar = tol.a;
                amvl i4 = amvn.i();
                i4.j(amygVar);
                i4.c(((tmy) dxsVar5.N.get()).d);
                return new tmt(i4.g());
            case 1753:
                return this.a.a.q();
            case 1754:
                return this.a.a.o();
            case 1755:
                dxs dxsVar6 = this.a.a;
                tnt tntVar = new tnt((tom) dxsVar6.G.get(), (tlu) dxsVar6.H.get(), new tof((tnq) dxsVar6.I.get()));
                tnq tnqVar = (tnq) dxsVar6.I.get();
                return amvn.s(tntVar, new tnx((tom) dxsVar6.G.get(), (tlu) dxsVar6.H.get(), new toh((tnq) dxsVar6.K.get(), (tnq) dxsVar6.L.get())));
            case 1756:
                return this.a.a.s();
            case 1757:
                return this.a.a.ag();
            case 1758:
                return this.a.a.r();
            case 1759:
                toc tocVar = toc.c;
                axzl.o(tocVar);
                return tocVar;
            case 1760:
                toc tocVar2 = toc.e;
                axzl.o(tocVar2);
                return tocVar2;
            case 1761:
                toc tocVar3 = toc.b;
                axzl.o(tocVar3);
                return tocVar3;
            case 1762:
                toc tocVar4 = toc.d;
                axzl.o(tocVar4);
                return tocVar4;
            case 1763:
                toc tocVar5 = toc.g;
                axzl.o(tocVar5);
                return tocVar5;
            case 1764:
                return new tnq(amup.k(100000012, this.a.a.f192J));
            case 1765:
                toc tocVar6 = toc.f;
                axzl.o(tocVar6);
                return tocVar6;
            case 1766:
                return new tnq(amyc.b);
            case 1767:
                return ((tmn) this.a.a.P.get()).a;
            case 1768:
                return new hyl();
            case 1769:
                dxs dxsVar7 = this.a.a;
                return new fnp((akqq) dxsVar7.bF.c.gt.get(), (afvn) dxsVar7.bF.c.au.get(), dxsVar7.bF.c.cD(), (acgf) dxsVar7.T.get(), null);
            case 1770:
                return new acgf((vne) this.a.a.S.get());
            case 1771:
                dyo dyoVar19 = this.a.a.bF.c;
                vjf a8 = vjg.a(dyoVar19.b.a);
                a8.e("settings");
                a8.f("settings.pb");
                Uri a9 = a8.a();
                vli a10 = vlj.a();
                a10.e(llq.a);
                a10.f(a9);
                return ((vlk) dyoVar19.j.get()).a(a10.a());
            case 1772:
                return new akjm();
            case 1773:
                return this.a.a.V();
            case 1774:
                dxs dxsVar8 = this.a.a;
                dyo dyoVar20 = dxsVar8.bF.c;
                Context context7 = dyoVar20.b.a;
                SharedPreferences sharedPreferences = (SharedPreferences) dyoVar20.t.get();
                admw admwVar = (admw) dxsVar8.W.get();
                acwu acwuVar = (acwu) dxsVar8.bF.c.iH.get();
                amvn amvnVar = ((acwu) dxsVar8.bF.c.iH.get()).e;
                axzl.o(amvnVar);
                amvn amvnVar2 = ((acwu) dxsVar8.bF.c.iH.get()).f;
                axzl.o(amvnVar2);
                adei df = dxsVar8.bF.c.df();
                adoa adoaVar = (adoa) dxsVar8.bF.c.jq.get();
                snc sncVar = (snc) dxsVar8.bF.c.v.get();
                aeik aeikVar = (aeik) dxsVar8.X.get();
                return new admc(sharedPreferences, admwVar, acwuVar, amvnVar, amvnVar2, df, adoaVar, sncVar, (acwn) dxsVar8.bF.c.mz.get(), dxsVar8.bF.c.dq());
            case 1775:
                dxs dxsVar9 = this.a.a;
                dyo dyoVar21 = dxsVar9.bF.c;
                Context context8 = dyoVar21.b.a;
                airr airrVar = (airr) dyoVar21.fO.get();
                adei df2 = dxsVar9.bF.c.df();
                dyo dyoVar22 = dxsVar9.bF.c;
                admw admwVar2 = new admw(airrVar, df2, dyoVar22.jB, (bgo) dyoVar22.jC.get(), (adgc) dxsVar9.bF.c.jT.get(), (advw) dxsVar9.bF.c.ke.get(), (snc) dxsVar9.bF.c.v.get());
                airw airwVar = (airw) dxsVar9.bF.c.fP.get();
                admwVar2.j.g(airwVar);
                admwVar2.a.g(airwVar);
                ((yni) dxsVar9.bF.c.y.get()).g(admwVar2);
                return admwVar2;
            case 1776:
                return new aeik();
            case 1777:
                return this.a.a.L();
            case 1778:
                return this.a.a.P();
            case 1779:
                dyo dyoVar23 = this.a.a.bF.c;
                vjf a11 = vjg.a(dyoVar23.b.a);
                a11.e("mdx");
                a11.f("autoconnect_prompt_record.pb");
                Uri a12 = a11.a();
                vli a13 = vlj.a();
                a13.f(a12);
                a13.e(awtv.a);
                return ((vlk) dyoVar23.j.get()).a(a13.a());
            case 1780:
                return new adcs();
            case 1781:
                dxs dxsVar10 = this.a.a;
                return new MdxSmartRemoteDialListener((adbe) dxsVar10.bF.c.jb.get(), (adoa) dxsVar10.bF.c.jq.get(), (yni) dxsVar10.bF.c.y.get(), (acwu) dxsVar10.bF.c.iH.get());
            case 1782:
                dxs dxsVar11 = this.a.a;
                return new SuggestVideoStateSubscriber((snc) dxsVar11.bF.c.v.get(), (yni) dxsVar11.bF.c.y.get(), (airw) dxsVar11.bF.c.fP.get(), (aacz) dxsVar11.bF.c.D.get());
            case 1783:
                dyo dyoVar24 = this.a.a.bF.c;
                vjf a14 = vjg.a(dyoVar24.b.a);
                a14.e("mdx");
                a14.f("mdx_tvsignin.pb");
                Uri a15 = a14.a();
                vli a16 = vlj.a();
                a16.f(a15);
                a16.e(awua.a);
                return ((vlk) dyoVar24.j.get()).a(a16.a());
            case 1784:
                dxs dxsVar12 = this.a.a;
                dyo dyoVar25 = dxsVar12.bF.c;
                return new aduz((yqh) dxsVar12.bF.c.iM.get(), dyoVar25.b.a, (ankw) dyoVar25.ay.get());
            case 1785:
                return this.a.a.X();
            case 1786:
                return this.a.a.E();
            case 1787:
                dyo dyoVar26 = this.a.a.bF.c;
                vjf a17 = vjg.a(dyoVar26.b.a);
                a17.e("upload");
                a17.f("upload_storage.schema.pb");
                Uri a18 = a17.a();
                vli a19 = vlj.a();
                a19.e(aldy.a);
                a19.f(a18);
                return ((vlk) dyoVar26.j.get()).a(a19.a());
            case 1788:
                return new akrh();
            case 1789:
                dxs dxsVar13 = this.a.a;
                return new axxo((aacz) dxsVar13.bF.c.D.get(), (aadd) dxsVar13.bF.c.K.get());
            case 1790:
                return this.a.gY();
            case 1791:
                dyo dyoVar27 = this.a.a.bF.c;
                return ymf.c(dyoVar27.b.a, "datasavingsetting", "data_saving_setting_schema.pb", (vlk) dyoVar27.j.get(), ljp.a);
            case 1792:
                return this.a.a.aa();
            case 1793:
            case 1794:
                return false;
            case 1795:
                dxs dxsVar14 = this.a.a;
                return new ooc((yni) dxsVar14.bF.c.y.get(), (Handler) dxsVar14.bF.c.an.get());
            case 1796:
                dxs dxsVar15 = this.a.a;
                return new onf((ooc) dxsVar15.ap.get(), (yni) dxsVar15.bF.c.y.get(), (yrj) dxsVar15.bF.c.as.get(), (airr) dxsVar15.bF.c.fO.get());
            case 1797:
                return new aomw(null);
            case 1798:
                dxs dxsVar16 = this.a.a;
                dyo dyoVar28 = dxsVar16.bF.c;
                return ltp.b(dyoVar28.b.a, dyoVar28.j, (ankw) dyoVar28.h.get(), dyo.jp(), (yke) dxsVar16.bF.c.p.get());
            case 1799:
                dxs dxsVar17 = this.a.a;
                dyo dyoVar29 = dxsVar17.bF.c;
                return new jot((yrj) dxsVar17.bF.c.as.get(), (snc) dxsVar17.bF.c.v.get(), (fcl) dxsVar17.bF.c.kI.get(), (fcu) dxsVar17.bF.c.gY.get(), dyoVar29.gS, dyoVar29.yl);
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.azqb
    public final Object get() {
        Object istVar;
        dzs dzsVar;
        int i = this.b;
        switch (i / 100) {
            case 0:
                return a();
            case 1:
                return b();
            case 2:
                return l();
            case 3:
                return m();
            case 4:
                return n();
            case 5:
                return o();
            case 6:
                return p();
            case 7:
                return q();
            case 8:
                switch (i) {
                    case 800:
                        return this.a.gJ();
                    case 801:
                        return this.a.eU();
                    case 802:
                        return this.a.eX();
                    case 803:
                        return this.a.eW();
                    case 804:
                        return new agyk();
                    case 805:
                        return this.a.hp();
                    case 806:
                        return new agys();
                    case 807:
                        return new agyq();
                    case 808:
                        return azpa.as(agxv.INACTIVE);
                    case NetError.ERR_DNS_NAME_HTTPS_ONLY /* 809 */:
                        return this.a.eJ();
                    case 810:
                        return this.a.ib();
                    case 811:
                        return new agzz(1);
                    case 812:
                        return this.a.fa();
                    case 813:
                        return this.a.fb();
                    case 814:
                        return this.a.cF();
                    case 815:
                        return this.a.cG();
                    case 816:
                        dyo dyoVar = this.a;
                        istVar = new ist((Executor) dyoVar.h.get(), (aaru) dyoVar.iC.get(), (aacz) dyoVar.D.get());
                        break;
                    case 817:
                        dyo dyoVar2 = this.a;
                        istVar = new ood((aacz) dyoVar2.D.get(), (ony) dyoVar2.lC.get());
                        break;
                    case 818:
                        return this.a.aq();
                    case 819:
                        return this.a.J();
                    case 820:
                        return this.a.N();
                    case 821:
                        return this.a.M();
                    case 822:
                        return this.a.gG();
                    case 823:
                        return this.a.L();
                    case 824:
                        return this.a.at();
                    case 825:
                        return this.a.ao();
                    case 826:
                        return this.a.gu();
                    case 827:
                        return this.a.bp();
                    case 828:
                        return this.a.bo();
                    case 829:
                        return this.a.bM();
                    case 830:
                        return this.a.iT();
                    case 831:
                        return this.a.fj();
                    case 832:
                        return this.a.hD();
                    case 833:
                        return this.a.eY();
                    case 834:
                        return this.a.eZ();
                    case 835:
                        return this.a.bB();
                    case 836:
                        return this.a.eD();
                    case 837:
                        return this.a.jD();
                    case 838:
                        return this.a.bA();
                    case 839:
                        return this.a.cc();
                    case 840:
                        return this.a.w();
                    case 841:
                        return this.a.cD();
                    case 842:
                        return this.a.hC();
                    case 843:
                        return this.a.dY();
                    case 844:
                        return this.a.ho();
                    case 845:
                        return this.a.z();
                    case 846:
                        return this.a.ef();
                    case 847:
                        return this.a.H();
                    case 848:
                        return this.a.ev();
                    case 849:
                        return this.a.ep();
                    case 850:
                        return this.a.et();
                    case 851:
                        return this.a.cA();
                    case 852:
                        return this.a.hr();
                    case 853:
                        return this.a.eu();
                    case 854:
                        return this.a.hk();
                    case 855:
                        return this.a.en();
                    case 856:
                        return this.a.el();
                    case 857:
                        return this.a.em();
                    case 858:
                        FirebaseMessaging a = FirebaseMessaging.a();
                        axzl.o(a);
                        return a;
                    case 859:
                        return new agdb();
                    case 860:
                        return new zhn();
                    case 861:
                        return this.a.eq();
                    case 862:
                        return this.a.cf();
                    case 863:
                        return this.a.ce();
                    case 864:
                        return this.a.cd();
                    case 865:
                        return this.a.Q();
                    case 866:
                        return this.a.R();
                    case 867:
                        return new gts();
                    case 868:
                        return this.a.jw();
                    case 869:
                        return this.a.u();
                    case 870:
                        return this.a.dd();
                    case 871:
                        return this.a.cP();
                    case 872:
                        return this.a.cQ();
                    case 873:
                        return this.a.k();
                    case 874:
                        return this.a.gL();
                    case 875:
                        return this.a.jx();
                    case 876:
                        return this.a.jB();
                    case 877:
                        return this.a.eo();
                    case 878:
                        return this.a.hN();
                    case 879:
                        return this.a.ed();
                    case 880:
                        return this.a.jA();
                    case 881:
                        return this.a.jz();
                    case 882:
                        return this.a.jF();
                    case 883:
                        return this.a.bU();
                    case 884:
                        return this.a.cv();
                    case 885:
                        return this.a.bW();
                    case 886:
                        return this.a.bV();
                    case 887:
                        return this.a.es();
                    case 888:
                        return this.a.cy();
                    case 889:
                        return this.a.cx();
                    case 890:
                        return this.a.cg();
                    case 891:
                        return this.a.E();
                    case 892:
                        return this.a.fz();
                    case 893:
                        return this.a.t();
                    case 894:
                        return this.a.cB();
                    case 895:
                        return this.a.by();
                    case 896:
                        return this.a.cp();
                    case 897:
                        return new abgc();
                    case 898:
                        return this.a.F();
                    case 899:
                        return this.a.cE();
                    default:
                        throw new AssertionError(i);
                }
                return istVar;
            case 9:
                switch (i) {
                    case 900:
                        return this.a.bv();
                    case 901:
                        return adyg.l(this.a.eb());
                    case 902:
                        return this.a.cC();
                    case 903:
                        return this.a.iZ();
                    case 904:
                        return this.a.ee();
                    case 905:
                        return new agee();
                    case 906:
                        return this.a.o();
                    case 907:
                        return this.a.P();
                    case 908:
                        return this.a.ek();
                    case 909:
                        return this.a.cz();
                    case 910:
                        dzsVar = new agbp(this.a.as);
                        break;
                    case 911:
                        return this.a.eg();
                    case 912:
                        return this.a.eh();
                    case 913:
                        return this.a.ej();
                    case 914:
                        return this.a.ei();
                    case 915:
                        return this.a.cT();
                    case 916:
                        return this.a.cR();
                    case 917:
                        return this.a.dm();
                    case 918:
                        return this.a.dn();
                    case 919:
                        return this.a.hd();
                    case 920:
                        return this.a.iY();
                    case 921:
                        return Boolean.valueOf(this.a.iF());
                    case 922:
                        return this.a.cS();
                    case 923:
                        return this.a.dj();
                    case 924:
                        return this.a.dh();
                    case 925:
                        return this.a.cN();
                    case 926:
                        return this.a.dk();
                    case 927:
                        return this.a.er();
                    case 928:
                        return this.a.fC();
                    case 929:
                        return this.a.fB();
                    case 930:
                        return this.a.fA();
                    case 931:
                        return this.a.fD();
                    case 932:
                        return new alwb();
                    case 933:
                        return new wga();
                    case 934:
                        return this.a.aY();
                    case 935:
                        return this.a.hQ();
                    case 936:
                        return this.a.cH();
                    case 937:
                        return this.a.bb();
                    case 938:
                        return this.a.cm();
                    case 939:
                        return this.a.hL();
                    case 940:
                        return this.a.gE();
                    case 941:
                        return this.a.hl();
                    case 942:
                        return this.a.eB();
                    case 943:
                        return this.a.eA();
                    case 944:
                        return this.a.jE();
                    case 945:
                        return this.a.eS();
                    case 946:
                        return this.a.eT();
                    case 947:
                        return this.a.jC();
                    case 948:
                        return this.a.Y();
                    case 949:
                        return this.a.co();
                    case 950:
                        return this.a.ew();
                    case 951:
                        return this.a.W();
                    case 952:
                        return this.a.X();
                    case 953:
                        return this.a.ai();
                    case 954:
                        return this.a.Z();
                    case 955:
                        return this.a.ez();
                    case 956:
                        return this.a.eK();
                    case 957:
                        return this.a.ey();
                    case 958:
                        return this.a.eL();
                    case 959:
                        return this.a.eC();
                    case 960:
                        return this.a.jG();
                    case 961:
                        return this.a.fR();
                    case 962:
                        return this.a.fS();
                    case 963:
                        return this.a.jJ();
                    case 964:
                        return this.a.fW();
                    case 965:
                        return this.a.gg();
                    case 966:
                        return this.a.fZ();
                    case 967:
                        return this.a.fT();
                    case 968:
                        return this.a.fY();
                    case 969:
                        return this.a.ge();
                    case 970:
                        return this.a.fX();
                    case 971:
                        return this.a.gc();
                    case 972:
                        return this.a.gf();
                    case 973:
                        return this.a.gd();
                    case 974:
                        dzsVar = new alck(this.a.b.a);
                        break;
                    case 975:
                        return this.a.gb();
                    case 976:
                        return this.a.fQ();
                    case 977:
                        return this.a.fU();
                    case 978:
                        return this.a.gC();
                    case 979:
                        return this.a.gF();
                    case 980:
                        return this.a.gD();
                    case 981:
                        return this.a.fP();
                    case 982:
                        return this.a.ga();
                    case 983:
                        return this.a.cr();
                    case 984:
                        return this.a.ct();
                    case 985:
                        return this.a.cq();
                    case 986:
                        return this.a.cs();
                    case 987:
                        return this.a.ck();
                    case 988:
                        return this.a.cu();
                    case 989:
                        return this.a.jy();
                    case 990:
                        return this.a.dW();
                    case 991:
                        return this.a.ea();
                    case 992:
                        dzsVar = new amkf((amkc) this.a.aS.get());
                        break;
                    case 993:
                        return this.a.n();
                    case 994:
                        dyo dyoVar3 = this.a;
                        dzs dzsVar2 = new dzs(dyoVar3.b.a, (ajms) dyoVar3.nl.get(), dyoVar3.jB, dyoVar3.nm, (ywk) dyoVar3.B.get());
                        dzsVar2.a = (ykv) dyoVar3.V.get();
                        dzsVar2.c = dyoVar3.nn;
                        dzsVar2.d = dyoVar3.no;
                        dzsVar2.e = dyoVar3.oj;
                        dzsVar2.f = (ankt) dyoVar3.ol.get();
                        dzsVar2.g = dyoVar3.om;
                        dzsVar2.h = dyoVar3.y;
                        dzsVar2.i = dyoVar3.on;
                        dzsVar2.j = axot.a(dyoVar3.oo);
                        dzsVar2.k = axot.a(dyoVar3.hx);
                        dzsVar2.l = dyoVar3.op;
                        dzsVar2.m = dyoVar3.lW;
                        dzsVar2.n = dyoVar3.oq;
                        dzsVar2.o = dyoVar3.or;
                        dzsVar2.p = axot.a(dyoVar3.os);
                        dzsVar2.q = axot.a(dyoVar3.ot);
                        dzsVar2.r = dyoVar3.kE;
                        dzsVar2.s = dyoVar3.kF;
                        dzsVar2.t = dyoVar3.lT;
                        dzsVar2.u = dyoVar3.ou;
                        dzsVar2.v = dyoVar3.ow;
                        dzsVar2.w = dyoVar3.jD;
                        dzsVar2.x = dyoVar3.ox;
                        dzsVar2.y = dyoVar3.oy;
                        dzsVar2.z = axot.a(dyoVar3.oz);
                        dzsVar2.A = axot.a(dyoVar3.fi);
                        dzsVar2.B = dyoVar3.oA;
                        dzsVar2.C = dyoVar3.nf;
                        dzsVar2.D = dyoVar3.oD;
                        dzsVar2.E = dyoVar3.kb;
                        dzsVar2.F = dyoVar3.mM;
                        dzsVar2.G = dyoVar3.gD;
                        dzsVar2.H = dyoVar3.oH;
                        dzsVar2.I = axot.a(dyoVar3.oI);
                        dzsVar2.f199J = axot.a(dyoVar3.oJ);
                        dzsVar2.K = axot.a(dyoVar3.pd);
                        dzsVar2.L = dyoVar3.ph;
                        dzsVar2.M = dyoVar3.nR;
                        dzsVar2.N = dyoVar3.kH;
                        dzsVar2.O = dyoVar3.pk;
                        dzsVar2.P = axot.a(dyoVar3.fB);
                        dzsVar2.Q = (adxy) dyoVar3.pl.get();
                        dzsVar2.R = (adyt) dyoVar3.pm.get();
                        dzsVar2.S = (dys) dyoVar3.pn.get();
                        dzsVar2.T = (acrb) dyoVar3.pu.get();
                        dzsVar2.U = (akpx) dyoVar3.pv.get();
                        dzsVar2.V = dyoVar3.pD;
                        dzsVar2.W = axot.a(dyoVar3.pE);
                        dzsVar2.X = dyoVar3.kn;
                        dzsVar2.Y = dyoVar3.eO;
                        dzsVar2.Z = dyoVar3.ba;
                        dzsVar2.aa = dyoVar3.lK;
                        dzsVar2.ab = dyoVar3.eE;
                        dzsVar2.ac = dyoVar3.pF;
                        dzsVar2.ad = dyoVar3.pG;
                        dzsVar2.ae = dyoVar3.lU;
                        dzsVar2.af = dyoVar3.np;
                        dzsVar2.ag = dyoVar3.pH;
                        dzsVar2.ah = dyoVar3.pI;
                        dzsVar2.ai = dyoVar3.lY;
                        dzsVar2.aj = dyoVar3.pK;
                        dzsVar2.ak = axot.a(dyoVar3.fC);
                        dzsVar2.al = dyoVar3.h;
                        dzsVar2.am = (ayor) dyoVar3.aq.get();
                        dzsVar2.an = dyoVar3.t;
                        dzsVar2.ao = dyoVar3.ai;
                        dzsVar2.ap = dyoVar3.as;
                        dzsVar2.aq = dyoVar3.cS;
                        dzsVar2.ar = dyoVar3.gQ;
                        dzsVar2.as = dyoVar3.K;
                        dzsVar2.at = dyoVar3.D;
                        dzsVar2.au = dyoVar3.ns;
                        dzsVar2.av = dyoVar3.cA;
                        dzsVar2.aw = dyoVar3.cD;
                        dzsVar2.ax = dyoVar3.pR;
                        dzsVar2.ay = dyoVar3.pS;
                        dzsVar2.az = dyoVar3.pT;
                        dzsVar2.aA = dyoVar3.lJ;
                        dzsVar2.aB = dyoVar3.pU;
                        dzsVar2.aC = dyoVar3.fO;
                        dzsVar2.aD = dyoVar3.pV;
                        dzsVar2.aE = dyoVar3.ik;
                        dzsVar2.aF = dyoVar3.aw;
                        dzsVar2.aG = dyoVar3.v;
                        dzsVar2.aH = dyoVar3.pX;
                        dzsVar2.aI = dyoVar3.pY;
                        dzsVar2.aJ = dyoVar3.qa;
                        dzsVar2.aK = axot.a(dyoVar3.nx);
                        axot.a(dyoVar3.j);
                        dzsVar2.aL = dyoVar3.nk;
                        dzsVar2.aM = dyoVar3.rr;
                        dzsVar2.aN = dyoVar3.lD;
                        dzsVar2.aO = dyoVar3.cQ;
                        dzsVar2.aP = dyoVar3.rs;
                        dzsVar2.aQ = dyoVar3.T;
                        dzsVar2.aR = dyoVar3.C;
                        dzsVar2.aS = dyoVar3.rt;
                        dzsVar2.aT = dyoVar3.x;
                        dzsVar2.aU = dyoVar3.rv;
                        dzsVar2.aV = dyoVar3.rw;
                        dzsVar2.aW = dyoVar3.rx;
                        dzsVar2.aX = dyoVar3.rC;
                        dzsVar2.aY = dyoVar3.rE;
                        dzsVar2.aZ = (aaca) dyoVar3.rF.get();
                        dzsVar2.ba = dyoVar3.rI;
                        aqvb aqvbVar = (aqvb) dyoVar3.rJ.get();
                        dzsVar2.bb = dyoVar3.rL;
                        dzsVar = dzsVar2;
                        break;
                    case 995:
                        return this.a.fx();
                    case 996:
                        return this.a.fG();
                    case 997:
                        return this.a.dT();
                    case 998:
                        return this.a.dX();
                    case 999:
                        return this.a.hu();
                    default:
                        throw new AssertionError(i);
                }
                return dzsVar;
            case 10:
                return c();
            case 11:
                return d();
            case 12:
                return e();
            case 13:
                return f();
            case 14:
                return g();
            case 15:
                return h();
            case 16:
                return i();
            case 17:
                return j();
            case 18:
                return k();
            default:
                switch (i) {
                    case 1900:
                        return this.a.a.v();
                    case 1901:
                        return this.a.a.O();
                    case 1902:
                        return this.a.a.T();
                    case 1903:
                        return this.a.a.ac();
                    case 1904:
                        return this.a.a.S();
                    case 1905:
                        return this.a.a.ab();
                    case 1906:
                        return this.a.a.y();
                    case 1907:
                        return this.a.a.x();
                    case 1908:
                        return this.a.a.an();
                    case 1909:
                        return this.a.a.Q();
                    case 1910:
                        return this.a.a.af();
                    case 1911:
                        return this.a.hT();
                    case 1912:
                        return this.a.a.Z();
                    default:
                        throw new AssertionError(i);
                }
        }
    }

    private final Object q() {
        int i = this.b;
        switch (i) {
            case 700:
                return this.a.cK();
            case 701:
                return this.a.hZ();
            case 702:
                return Boolean.valueOf(egd.A((ywk) this.a.B.get()));
            case 703:
                return new adah();
            case 704:
                dyo dyoVar = this.a;
                return new adhv(dyoVar.b.a, dyoVar.jq);
            case 705:
                return this.a.dc();
            case 706:
                dyo dyoVar2 = this.a;
                acwu acwuVar = (acwu) dyoVar2.iH.get();
                return new advw((advr) dyoVar2.kd.get(), (snc) dyoVar2.v.get(), (SharedPreferences) dyoVar2.t.get());
            case 707:
                dyo dyoVar3 = this.a;
                return new advr(dyoVar3.kc, (snc) dyoVar3.v.get());
            case 708:
                dyo dyoVar4 = this.a;
                Context context = dyoVar4.b.a;
                vjf a = vjg.a(context);
                a.e("mdx");
                a.f("mdx_profile.pb");
                Uri a2 = a.a();
                vlo d = vlr.d(context, (ankw) dyoVar4.h.get());
                d.b();
                d.c = dyo.jp();
                d.d("user-stats-timestamp", "mdx-last-connection-timestamp", "mdx-profile-creation-timestamp", "mdx-connection-count", "cast-available-session-count");
                d.e(adiz.d);
                vlr a3 = d.a();
                vli a4 = vlj.a();
                a4.f(a2);
                a4.e(awub.a);
                a4.b(a3);
                return new yvc(vmu.b(((vlk) dyoVar4.j.get()).a(a4.a())), awub.a);
            case 709:
                return this.a.db();
            case 710:
                dyo dyoVar5 = this.a;
                yqw a5 = ((yqy) dyoVar5.fx.get()).a(new cfh(), yqx.a(aear.g(5000, 10000), new afxz((afsx) dyoVar5.fz.get(), (snc) dyoVar5.v.get())), "mdx-insecure");
                a5.c();
                axzl.o(a5);
                return a5;
            case 711:
                dyo dyoVar6 = this.a;
                return new adwt((yni) dyoVar6.y.get(), (ailf) dyoVar6.fM.get(), (airw) dyoVar6.fP.get(), (adwq) dyoVar6.kh.get());
            case 712:
                adwq h = egd.h(this.a.kg);
                axzl.o(h);
                return h;
            case 713:
                dyo dyoVar7 = this.a;
                adwv adwvVar = new adwv();
                adwvVar.a.g(adwvVar.g((airw) dyoVar7.fP.get()));
                return adwvVar;
            case 714:
                return this.a.cX();
            case 715:
                return new adkg((vne) this.a.kk.get());
            case 716:
                dyo dyoVar8 = this.a;
                Context context2 = dyoVar8.b.a;
                vjf a6 = vjg.a(context2);
                a6.e("mdx");
                a6.f("manual_pairing_screens.pb");
                Uri a7 = a6.a();
                vlo d2 = vlr.d(context2, (ankw) dyoVar8.h.get());
                d2.c = dyo.jp();
                d2.b();
                d2.d("deviceIds", "screenIds", "screenNames");
                d2.e(fdg.u);
                vlr a8 = d2.a();
                vli a9 = vlj.a();
                a9.f(a7);
                a9.e(aoub.a);
                a9.b(a8);
                return ((vlk) dyoVar8.j.get()).a(a9.a());
            case 717:
                return this.a.df();
            case 718:
                dyo dyoVar9 = this.a;
                return new isk(dyoVar9.kn, (Executor) dyoVar9.h.get());
            case 719:
                dyo dyoVar10 = this.a;
                return new ish(dyoVar10.b.a, dyoVar10.kC, (aacz) dyoVar10.D.get());
            case 720:
                dyo dyoVar11 = this.a;
                ajmy p = egd.p(dyoVar11.gx(), dyoVar11.kA, dyoVar11.kB);
                axzl.o(p);
                return p;
            case 721:
                dyo dyoVar12 = this.a;
                return new ajod(dyoVar12.b.a, dyoVar12.kz, dyoVar12.ko, dyoVar12.hl, dyoVar12.ec);
            case 722:
                dyo dyoVar13 = this.a;
                ajmr ajmrVar = dyoVar13.gx().b ? (ajmr) dyoVar13.kp.get() : (ajmr) dyoVar13.ky.get();
                axzl.o(ajmrVar);
                return ajmrVar;
            case 723:
                dyo dyoVar14 = this.a;
                return new ajnw(dyoVar14.b.a, (Executor) dyoVar14.h.get(), dyoVar14.hl, dyoVar14.ko, dyoVar14.ec);
            case 724:
                return this.a.gx();
            case 725:
                return this.a.jb();
            case 726:
                return yrn.a(this.a.kq, amon.a);
            case 727:
                return this.a.bG();
            case 728:
                return new ajos(((ajno) this.a.kt.get()).a);
            case 729:
                dyo dyoVar15 = this.a;
                Context context3 = dyoVar15.b.a;
                SharedPreferences sharedPreferences = (SharedPreferences) dyoVar15.t.get();
                ajno ajnoVar = (ajno) dyoVar15.ks.get();
                int i2 = egd.a;
                axzl.o(ajnoVar);
                return ajnoVar;
            case 730:
                return this.a.fy();
            case 731:
                dyo dyoVar16 = this.a;
                ajox ajoxVar = dyoVar16.gx().A ? (ajox) dyoVar16.kv.get() : (ajox) dyoVar16.kw.get();
                axzl.o(ajoxVar);
                return ajoxVar;
            case 732:
                dyo dyoVar17 = this.a;
                agpe agpeVar = new agpe((aahf) dyoVar17.dK.get(), (afvn) dyoVar17.au.get(), (yni) dyoVar17.y.get(), (Executor) dyoVar17.h.get(), (aahn) dyoVar17.dJ.get(), (amfg) dyoVar17.ev.get(), dyoVar17.gx().B, dyoVar17.gx().C, new aomw(null), null);
                agpeVar.c.g(agpeVar);
                agpeVar.b();
                return agpeVar;
            case 733:
                return new agpc();
            case 734:
                return this.a.fw();
            case 735:
                dyo dyoVar18 = this.a;
                return new itf((aacz) dyoVar18.D.get(), axot.a(dyoVar18.aw));
            case 736:
                return this.a.cj();
            case 737:
                return egd.K((yjs) this.a.ai.get());
            case 738:
                dyo dyoVar19 = this.a;
                Context context4 = dyoVar19.b.a;
                afvn afvnVar = (afvn) dyoVar19.au.get();
                snc sncVar = (snc) dyoVar19.v.get();
                Executor executor = (Executor) dyoVar19.h.get();
                ess v = dyoVar19.v();
                esp espVar = (esp) dyoVar19.kJ.get();
                aacu aacuVar = (aacu) dyoVar19.cD.get();
                aacz aaczVar = (aacz) dyoVar19.D.get();
                aaqp aaqpVar = (aaqp) dyoVar19.ih.get();
                fcn fcnVar = (fcn) dyoVar19.kL.get();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) dyoVar19.h.get();
                return new etd(context4, afvnVar, sncVar, executor, v, espVar, aacuVar, aaqpVar);
            case 739:
                dyo dyoVar20 = this.a;
                return new fcl(dyoVar20.gR, dyoVar20.gS, dyoVar20.kF, (axxh) dyoVar20.kG.get(), (ayor) dyoVar20.aq.get(), (afvn) dyoVar20.au.get(), (aahf) dyoVar20.dK.get(), dyoVar20.A());
            case 740:
                dyo dyoVar21 = this.a;
                return new axxh((aacz) dyoVar21.D.get(), (aadd) dyoVar21.K.get());
            case 741:
                return new fbd((fbj) this.a.kH.get());
            case 742:
                return new fbj(this.a.y);
            case 743:
                return new esp((zen) this.a.cA.get());
            case 744:
                return new fcn((yve) this.a.kK.get());
            case 745:
                dyo dyoVar22 = this.a;
                return fdl.a(dyoVar22.b.a, dyoVar22.j);
            case 746:
                dyo dyoVar23 = this.a;
                Object obj = (aghb) dyoVar23.kM.get();
                Object obj2 = (agha) dyoVar23.lR.get();
                if (true == ((ahdf) dyoVar23.ha.get()).b()) {
                    obj = obj2;
                }
                axzl.o(obj);
                return obj;
            case 747:
                return new aghb(this.a.b.a, 1);
            case 748:
                return new agha((agyf) this.a.kR.get(), 1);
            case 749:
                dyo dyoVar24 = this.a;
                return new agyf((agzh) dyoVar24.lQ.get(), (ahdf) dyoVar24.ha.get());
            case 750:
                dyo dyoVar25 = this.a;
                Context context5 = dyoVar25.b.a;
                Executor executor2 = (Executor) dyoVar25.h.get();
                azqb azqbVar = dyoVar25.hf;
                azqb azqbVar2 = dyoVar25.gS;
                azqb azqbVar3 = dyoVar25.lv;
                SharedPreferences sharedPreferences2 = (SharedPreferences) dyoVar25.t.get();
                agyc eV = dyoVar25.eV();
                agpn agpnVar = (agpn) dyoVar25.lz.get();
                agxd agxdVar = (agxd) dyoVar25.kO.get();
                Executor executor3 = (Executor) dyoVar25.lA.get();
                agyz d3 = afku.d(dyoVar25.gS, (amqo) dyoVar25.fS.get(), (snc) dyoVar25.v.get(), dyoVar25.gy, (pwx) dyoVar25.gP.get(), ampq.j(dyoVar25.dL()), amup.n(5, dyoVar25.lB, 4, dyoVar25.lN, 3, dyoVar25.lO, 2, dyoVar25.lP));
                agvn agvnVar = (agvn) dyoVar25.hd.get();
                String canonicalName = ((ahdf) dyoVar25.ha.get()).f() ? OfflineKeepAliveService.class.getCanonicalName() : "DummyServicePath";
                axzl.o(canonicalName);
                return new agzh(context5, executor2, azqbVar, azqbVar2, azqbVar3, sharedPreferences2, eV, agpnVar, agxdVar, executor3, d3, agvnVar, canonicalName, (agro) dyoVar25.kN.get(), (ahdf) dyoVar25.ha.get());
            case 751:
                dyo dyoVar26 = this.a;
                Context context6 = dyoVar26.b.a;
                snc sncVar2 = (snc) dyoVar26.v.get();
                agro agroVar = (agro) dyoVar26.kN.get();
                azqb azqbVar4 = dyoVar26.gS;
                agrm agrmVar = (agrm) dyoVar26.kT.get();
                azqb azqbVar5 = dyoVar26.kC;
                jjo jjoVar = (jjo) dyoVar26.kU.get();
                yrj yrjVar = (yrj) dyoVar26.as.get();
                ezv ezvVar = (ezv) dyoVar26.kV.get();
                return new jjn(context6, sncVar2, agroVar, azqbVar4, agrmVar, azqbVar5, jjoVar, yrjVar, (jjp) dyoVar26.kW.get(), dyoVar26.lo, (ahdf) dyoVar26.ha.get());
            case 752:
                return new agro(this.a.b.a);
            case 753:
                dyo dyoVar27 = this.a;
                return new agrm((agro) dyoVar27.kN.get(), (agyr) dyoVar27.kS.get(), (ahdf) dyoVar27.ha.get());
            case 754:
                dyo dyoVar28 = this.a;
                agyr agyrVar = ((ahdf) dyoVar28.ha.get()).b() ? (agyr) dyoVar28.kR.get() : (agyr) dyoVar28.kQ.get();
                axzl.o(agyrVar);
                return agyrVar;
            case 755:
                dyo dyoVar29 = this.a;
                return new agyn(dyoVar29.b.a, (ylm) dyoVar29.kP.get());
            case 756:
                return new agzj(OfflineTransferService.class, (agxd) this.a.kO.get());
            case 757:
                return new agxd(axot.a(this.a.gS));
            case 758:
                return new jjo(this.a.ap(), jjd.a(), pns.l());
            case 759:
                return new ezv();
            case 760:
                return new jjp(this.a.cI());
            case 761:
                dyo dyoVar30 = this.a;
                return new agsd(dyoVar30.lr, axot.a(dyoVar30.ls), dyoVar30.lt, dyoVar30.as, dyoVar30.fX, dyoVar30.dK, (yni) dyoVar30.y.get(), (afvn) dyoVar30.au.get(), dyoVar30.lu, (ScheduledExecutorService) dyoVar30.h.get());
            case 762:
                dyo dyoVar31 = this.a;
                return new agrz(dyoVar31.hJ(), (snc) dyoVar31.v.get());
            case 763:
                dyo dyoVar32 = this.a;
                return new agpg((agrf) dyoVar32.gS.get(), (aguu) dyoVar32.kX.get());
            case 764:
                return this.a.eQ();
            case 765:
                return this.a.eR();
            case 766:
                return this.a.ex();
            case 767:
                dyo dyoVar33 = this.a;
                return new agvf(dyoVar33.b.a, (aaqj) dyoVar33.er.get(), (aaqf) dyoVar33.eV.get(), (afvn) dyoVar33.au.get(), (yqw) dyoVar33.fD.get());
            case 768:
                return this.a.eG();
            case 769:
                dyo dyoVar34 = this.a;
                return new agut((aguv) dyoVar34.kY.get(), (agvf) dyoVar34.kZ.get(), (snc) dyoVar34.v.get(), (SharedPreferences) dyoVar34.t.get(), (aadd) dyoVar34.K.get(), (agkp) dyoVar34.la.get(), (yni) dyoVar34.y.get());
            case 770:
                dyo dyoVar35 = this.a;
                return new agph((agux) dyoVar35.lc.get(), (agvq) dyoVar35.hf.get(), (agrf) dyoVar35.gS.get(), (ahdn) dyoVar35.gR.get(), (yni) dyoVar35.y.get());
            case 771:
                return new agux((agvi) this.a.lb.get());
            case 772:
                dyo dyoVar36 = this.a;
                return new agvi((aaqj) dyoVar36.er.get(), (aaqf) dyoVar36.eV.get(), (afvn) dyoVar36.au.get(), (yqw) dyoVar36.fD.get(), (aadd) dyoVar36.K.get());
            case 773:
                dyo dyoVar37 = this.a;
                return new jht((aahf) dyoVar37.dK.get(), dyoVar37.lf, dyoVar37.le);
            case 774:
                dyo dyoVar38 = this.a;
                return new jfr(dyoVar38.ld, dyoVar38.gT, (fcu) dyoVar38.gY.get(), (fbw) dyoVar38.le.get(), (Executor) dyoVar38.h.get());
            case 775:
                dyo dyoVar39 = this.a;
                Executor executor4 = (Executor) dyoVar39.h.get();
                return new jnd((aaqj) dyoVar39.er.get(), (aaqf) dyoVar39.eV.get(), (afvn) dyoVar39.au.get(), (yqw) dyoVar39.fD.get());
            case 776:
                dyo dyoVar40 = this.a;
                return new fbw((aacz) dyoVar40.D.get(), (aadd) dyoVar40.K.get());
            case 777:
                return new jhs((aahf) this.a.dK.get());
            case 778:
                dyo dyoVar41 = this.a;
                return new agpf(dyoVar41.gS, (aahf) dyoVar41.dK.get(), (axxh) dyoVar41.kG.get());
            case 779:
                dyo dyoVar42 = this.a;
                return new agoz(dyoVar42.ln, dyoVar42.jg, dyoVar42.gS, (snc) dyoVar42.v.get(), (yni) dyoVar42.y.get(), (aahf) dyoVar42.dK.get());
            case 780:
                dyo dyoVar43 = this.a;
                return new ahdl((snc) dyoVar43.v.get(), (afvn) dyoVar43.au.get(), dyoVar43.jn, dyoVar43.fI, dyoVar43.fJ, (ailw) dyoVar43.lg.get(), (aimx) dyoVar43.lh.get(), dyoVar43.lj, dyoVar43.lk, dyoVar43.lm);
            case 781:
                ailw y = ((aidn) this.a.eQ.get()).a.y();
                axzl.o(y);
                return y;
            case 782:
                return null;
            case 783:
                dyo dyoVar44 = this.a;
                Context context7 = dyoVar44.b.a;
                ahde ahdeVar = (ahde) dyoVar44.li.get();
                axzl.o(ahdeVar);
                return ahdeVar;
            case 784:
                return new ahde(this.a.hO);
            case 785:
                dyo dyoVar45 = this.a;
                Executor executor5 = (Executor) dyoVar45.h.get();
                yqh yqhVar = (yqh) dyoVar45.kr.get();
                yqhVar.getClass();
                executor5.getClass();
                aftg aftgVar = new aftg();
                afyg afygVar = new afyg();
                return afyk.b(new yko(100), afxe.b(executor5, new afyi(new afxv(yqhVar, aftgVar, aftgVar), new afxv(yqhVar, afygVar, afygVar))), (snc) dyoVar45.v.get(), 1800000L);
            case 786:
                dyo dyoVar46 = this.a;
                Context context8 = dyoVar46.b.a;
                afxq ec = dyoVar46.ec();
                afxq afxqVar = (afxq) dyoVar46.hz.get();
                aesi dH = dyoVar46.dH();
                azqb azqbVar6 = dyoVar46.by;
                azqb azqbVar7 = dyoVar46.ll;
                azqb azqbVar8 = dyoVar46.ht;
                azqbVar6.getClass();
                azqbVar8.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ec);
                if (afxqVar != null) {
                    arrayList.add(afxqVar);
                }
                aesh a10 = dH.a(amuk.o(arrayList));
                Context context9 = (Context) azqbVar6.get();
                context9.getClass();
                afjm afjmVar = (afjm) azqbVar7.get();
                afjmVar.getClass();
                return new aeqv(context9, afjmVar, azqbVar8, a10);
            case 787:
                return this.a.dN();
            case 788:
                dyo dyoVar47 = this.a;
                azqb azqbVar9 = dyoVar47.ln;
                azqb azqbVar10 = dyoVar47.lm;
                azqb azqbVar11 = dyoVar47.gS;
                aahf aahfVar = (aahf) dyoVar47.dK.get();
                zey bT = dyoVar47.bT();
                yni yniVar = (yni) dyoVar47.y.get();
                snc sncVar3 = (snc) dyoVar47.v.get();
                agoy agoyVar = (agoy) dyoVar47.lp.get();
                return new agow(azqbVar9, azqbVar10, azqbVar11, aahfVar, bT, yniVar, sncVar3, (ahdd) dyoVar47.lq.get(), (ahdf) dyoVar47.ha.get());
            case 789:
                dyo dyoVar48 = this.a;
                agoy agoyVar2 = new agoy((aahf) dyoVar48.dK.get(), (afvn) dyoVar48.au.get(), (Executor) dyoVar48.h.get(), (yni) dyoVar48.y.get(), dyoVar48.lo);
                agoyVar2.a();
                agoyVar2.a.g(agoyVar2);
                return agoyVar2;
            case 790:
                return this.a.fc();
            case 791:
                dyo dyoVar49 = this.a;
                return new agpb((agvq) dyoVar49.hf.get(), (agrf) dyoVar49.gS.get(), (ankw) dyoVar49.h.get(), (ScheduledExecutorService) dyoVar49.h.get());
            case 792:
                dyo dyoVar50 = this.a;
                return new agsj((ankw) dyoVar50.h.get(), (ScheduledExecutorService) dyoVar50.h.get(), dyoVar50.hJ(), (agsd) dyoVar50.lo.get(), (agrz) dyoVar50.lr.get(), (snc) dyoVar50.v.get());
            case 793:
                return this.a.eM();
            case 794:
                dyo dyoVar51 = this.a;
                aadd aaddVar = (aadd) dyoVar51.K.get();
                return new axxr((aacz) dyoVar51.D.get());
            case 795:
                dyo dyoVar52 = this.a;
                return new agsh(dyoVar52.as, dyoVar52.hg, dyoVar52.lr);
            case 796:
                dyo dyoVar53 = this.a;
                return new agwa(dyoVar53.b.a, (yni) dyoVar53.y.get(), (ScheduledExecutorService) dyoVar53.h.get(), (agvw) dyoVar53.gT.get());
            case 797:
                return new agxj(this.a.b.a);
            case 798:
                dyo dyoVar54 = this.a;
                return new aghg(dyoVar54.b.a, (aadd) dyoVar54.K.get());
            case 799:
                dyo dyoVar55 = this.a;
                return new agyp(dyoVar55.b.a, (aynx) dyoVar55.ly.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        Long l;
        int i = this.b;
        Uri[] uriArr = null;
        switch (i) {
            case 1200:
                return this.a.aG();
            case 1201:
                return this.a.iP();
            case 1202:
                return this.a.az();
            case 1203:
                dyo dyoVar = this.a;
                return new uij((uhj) dyoVar.qM.get(), dyoVar.b.a, (ucj) dyoVar.qc.get(), (ues) dyoVar.qC.get(), dyoVar.au());
            case 1204:
                return ampq.j((agay) this.a.qS.get());
            case 1205:
                return new agay((aadd) this.a.K.get());
            case 1206:
                dyo dyoVar2 = this.a;
                return new ufi((ucv) dyoVar2.qh.get(), (ucs) dyoVar2.qb.get(), (uff) dyoVar2.qV.get(), (ujk) dyoVar2.qg.get(), dyoVar2.au());
            case 1207:
                return this.a.aJ();
            case 1208:
                dyo dyoVar3 = this.a;
                return amup.l(1, (uhg) dyoVar3.qZ.get(), 2, new uhn((uhh) dyoVar3.qR.get(), ampq.j((uit) dyoVar3.qG.get()), (ues) dyoVar3.qC.get()));
            case 1209:
                dyo dyoVar4 = this.a;
                Context context = dyoVar4.b.a;
                return new uhi(ampq.j((uit) dyoVar4.qG.get()), (ues) dyoVar4.qC.get());
            case 1210:
                dyo dyoVar5 = this.a;
                return new udc((udd) dyoVar5.qO.get(), dyoVar5.au());
            case 1211:
                dyo dyoVar6 = this.a;
                return new ugz((ufe) dyoVar6.rb.get(), (ucs) dyoVar6.qb.get(), (ues) dyoVar6.qC.get(), dyoVar6.au());
            case 1212:
                return this.a.gZ();
            case 1213:
                dyo dyoVar7 = this.a;
                return new ujb((ucs) dyoVar7.qb.get(), (uhz) dyoVar7.ql.get(), dyoVar7.au(), ampq.j((agax) dyoVar7.rd.get()), (ugx) dyoVar7.qY.get());
            case 1214:
                return new agax((acsf) this.a.hg.get());
            case 1215:
                dyo dyoVar8 = this.a;
                return new uja((ucs) dyoVar8.qb.get(), ampq.j((agax) dyoVar8.rd.get()));
            case 1216:
                dyo dyoVar9 = this.a;
                ugr ugrVar = new ugr((ufs) dyoVar9.qF.get(), (udc) dyoVar9.rc.get());
                ugrVar.a = dyoVar9.hI();
                return ugrVar;
            case 1217:
                dyo dyoVar10 = this.a;
                ugs ugsVar = new ugs((ufs) dyoVar10.qF.get());
                ugsVar.a = dyoVar10.hI();
                return ugsVar;
            case 1218:
                dyo dyoVar11 = this.a;
                ugv ugvVar = new ugv((ufs) dyoVar11.qF.get());
                ugvVar.a = dyoVar11.hI();
                return ugvVar;
            case 1219:
                return this.a.aH();
            case 1220:
                return this.a.aI();
            case 1221:
                dyo dyoVar12 = this.a;
                ugp ugpVar = new ugp((ufs) dyoVar12.qF.get(), (ucv) dyoVar12.qh.get());
                ugpVar.a = dyoVar12.hI();
                return ugpVar;
            case 1222:
                dyo dyoVar13 = this.a;
                ugu uguVar = new ugu((ufs) dyoVar13.qF.get(), (ucv) dyoVar13.qh.get());
                uguVar.a = dyoVar13.hI();
                return uguVar;
            case 1223:
                dyo dyoVar14 = this.a;
                uic uicVar = new uic();
                uicVar.a = dyoVar14.b.a;
                return uicVar;
            case 1224:
                dyo dyoVar15 = this.a;
                return new ujc((ugj) dyoVar15.qX.get(), (ucs) dyoVar15.qb.get(), (ueo) dyoVar15.qf.get(), ampq.j((agax) dyoVar15.rd.get()));
            case 1225:
                return this.a.aE();
            case 1226:
                apyy b = ((aacz) this.a.D.get()).b();
                atfw atfwVar = b.k;
                if (atfwVar == null) {
                    atfwVar = atfw.a;
                }
                apfn apfnVar = atfwVar.p;
                if (apfnVar == null) {
                    apfnVar = apfn.a;
                }
                apfz a = ymf.a(b);
                if (a.g.size() > 0) {
                    uriArr = new Uri[a.g.size()];
                    for (int i2 = 0; i2 < a.g.size(); i2++) {
                        uriArr[i2] = Uri.parse((String) a.g.get(i2));
                    }
                }
                if (uriArr == null) {
                    return yqi.a;
                }
                boolean z = apfnVar.f;
                return new yqi(uriArr);
            case 1227:
                return this.a.ca();
            case 1228:
                return new lbm(axot.a(this.a.ru));
            case 1229:
                akgv Q = egd.Q(this.a.mD);
                axzl.o(Q);
                return Q;
            case 1230:
                dyo dyoVar16 = this.a;
                final lbk lbkVar = new lbk(dyoVar16.ru, (akgt) dyoVar16.mB.get());
                ((aadd) dyoVar16.K.get()).a.V(ktg.d).B().X((ayor) dyoVar16.aq.get()).at(new ayqb() { // from class: lbj
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        boolean z2;
                        lbk lbkVar2 = lbk.this;
                        aupg aupgVar = (aupg) obj;
                        boolean z3 = lbkVar2.b;
                        boolean z4 = aupgVar.c;
                        boolean z5 = true;
                        if (z3 != z4) {
                            lbkVar2.b = z4;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        boolean z6 = lbkVar2.c;
                        boolean z7 = aupgVar.e;
                        if (z6 != z7) {
                            lbkVar2.c = z7;
                            z2 = true;
                        }
                        String str = (String) lbkVar2.e.e().e("");
                        if (!lbkVar2.d.equals(aupgVar.d) && awwc.d(aupgVar.d, str)) {
                            lbkVar2.d = aupgVar.d;
                            if ((lbkVar2.b && !lbkVar2.c) || !z5 || aupgVar.d.isEmpty()) {
                                return;
                            }
                            ((akgv) lbkVar2.a.get()).a();
                        }
                        z5 = z2;
                        if (lbkVar2.b) {
                        }
                        ((akgv) lbkVar2.a.get()).a();
                    }
                }, kjt.i);
                return lbkVar;
            case 1231:
                return this.a.ft();
            case 1232:
                dyo dyoVar17 = this.a;
                return new fnl((aacz) dyoVar17.D.get(), (fnf) dyoVar17.rB.get());
            case 1233:
                dyo dyoVar18 = this.a;
                hve hveVar = (hve) dyoVar18.ry.get();
                return egd.N((aacz) dyoVar18.D.get(), (fnk) dyoVar18.rA.get());
            case 1234:
                dyo dyoVar19 = this.a;
                SharedPreferences sharedPreferences = (SharedPreferences) dyoVar19.t.get();
                snc sncVar = (snc) dyoVar19.v.get();
                return new hve();
            case 1235:
                dyo dyoVar20 = this.a;
                return new fnk(dyoVar20.rz, (snc) dyoVar20.v.get());
            case 1236:
                dyo dyoVar21 = this.a;
                Context context2 = dyoVar21.b.a;
                String[] strArr = fnd.a;
                vjf a2 = vjg.a(context2);
                a2.e("restorecontext");
                a2.f("restore_context.pb");
                Uri a3 = a2.a();
                vli a4 = vlj.a();
                a4.e(fng.a);
                a4.f(a3);
                vlo d = vlr.d(context2, (ankw) dyoVar21.h.get());
                d.c = dyo.jp();
                d.b();
                d.d(fnd.a);
                d.e(fdg.d);
                a4.b(d.a());
                return new yvc(vmu.b(((vlk) dyoVar21.j.get()).a(a4.a())), fng.a);
            case 1237:
                return yvv.a(axot.a(this.a.rD));
            case 1238:
                return this.a.hK();
            case 1239:
                return this.a.jq();
            case 1240:
                return this.a.js();
            case 1241:
                return this.a.gW();
            case 1242:
                return this.a.bF();
            case 1243:
                return this.a.bX();
            case 1244:
                return new akti(axot.a(this.a.rH));
            case 1245:
                azqb azqbVar = this.a.rG;
                int i3 = utd.b;
                ute uteVar = (ute) azqbVar.get();
                axzl.o(uteVar);
                utd utdVar = new utd(uteVar);
                utd.b(new uta(utdVar));
                return utdVar;
            case 1246:
                dyo dyoVar22 = this.a;
                Context context3 = dyoVar22.b.a;
                azqb azqbVar2 = dyoVar22.cu;
                azqb azqbVar3 = dyoVar22.bX;
                azqb azqbVar4 = dyoVar22.cr;
                return new utf((uto) dyoVar22.bx.get(), azqbVar2, azqbVar3, azqbVar4, azqbVar4, dyoVar22.cc, (vgt) dyoVar22.bB.get(), null);
            case 1247:
                return this.a.aP();
            case 1248:
                return new uxe();
            case 1249:
                return this.a.hj();
            case 1250:
                uxh uxhVar = new uxh();
                uxhVar.c = 1;
                uxhVar.a = Long.valueOf(TimeUnit.MINUTES.toMillis(5L) + TimeUnit.SECONDS.toMillis(20L));
                uxhVar.c = 2;
                if (uxhVar.b == null) {
                    uxhVar.b = amyg.a;
                }
                int i4 = uxhVar.c;
                if (i4 != 0 && (l = uxhVar.a) != null) {
                    return new uxi(i4, l.longValue(), uxhVar.b);
                }
                StringBuilder sb = new StringBuilder();
                if (uxhVar.c == 0) {
                    sb.append(" enablement");
                }
                if (uxhVar.a == null) {
                    sb.append(" debugMemoryServiceThrottleMs");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            case 1251:
                dyo dyoVar23 = this.a;
                ampq.j(dyoVar23.cd);
                vsc vscVar = uxe.g() ? (vsc) dyoVar23.cg.get() : new vsc();
                axzl.o(vscVar);
                return vscVar;
            case 1252:
                dyo dyoVar24 = this.a;
                ampq.j(dyoVar24.ch);
                uzm uzmVar = (uzm) dyoVar24.cn.get();
                axzl.o(uzmVar);
                return uzmVar;
            case 1253:
                return new vtm();
            case 1254:
                return this.a.aU();
            case 1255:
                return this.a.ht();
            case 1256:
                return new aqvb();
            case 1257:
                dyo dyoVar25 = this.a;
                return new egc(dyoVar25.rK, (aacz) dyoVar25.D.get(), dyoVar25.aw, (Executor) dyoVar25.h.get(), dyoVar25.cA);
            case 1258:
                dyo dyoVar26 = this.a;
                return new rdj(dyoVar26.b.a, (Executor) dyoVar26.h.get());
            case 1259:
                dyo dyoVar27 = this.a;
                eai eaiVar = new eai();
                eaiVar.a = (Executor) dyoVar27.h.get();
                eaiVar.b = (ayor) dyoVar27.aq.get();
                eaiVar.c = (SharedPreferences) dyoVar27.t.get();
                eaiVar.bu = (aacz) dyoVar27.D.get();
                eaiVar.d = (efz) dyoVar27.cQ.get();
                eaiVar.e = (snc) dyoVar27.v.get();
                eaiVar.f = dyoVar27.e();
                eaiVar.g = (ywk) dyoVar27.B.get();
                eaiVar.h = (aaau) dyoVar27.C.get();
                eaiVar.i = (ankt) dyoVar27.ol.get();
                eaiVar.j = dyoVar27.no;
                eaiVar.k = dyoVar27.oj;
                eaiVar.l = dyoVar27.nk;
                eaiVar.m = dyoVar27.rx;
                eaiVar.n = dyoVar27.ef;
                eaiVar.o = dyoVar27.dV;
                eaiVar.p = dyoVar27.rO;
                eaiVar.q = dyoVar27.hO;
                eaiVar.r = dyoVar27.tB;
                eaiVar.s = dyoVar27.s;
                eaiVar.t = dyoVar27.bb;
                eaiVar.u = dyoVar27.bc;
                eaiVar.v = dyoVar27.bd;
                eaiVar.w = dyoVar27.be;
                eaiVar.x = dyoVar27.bf;
                eaiVar.y = dyoVar27.bg;
                eaiVar.z = dyoVar27.y;
                eaiVar.A = dyoVar27.on;
                eaiVar.B = dyoVar27.op;
                eaiVar.C = dyoVar27.lW;
                eaiVar.D = dyoVar27.oq;
                eaiVar.E = dyoVar27.or;
                eaiVar.F = dyoVar27.kF;
                eaiVar.G = dyoVar27.ou;
                eaiVar.H = dyoVar27.ow;
                eaiVar.I = dyoVar27.jD;
                eaiVar.f200J = dyoVar27.oA;
                eaiVar.K = dyoVar27.nf;
                eaiVar.L = dyoVar27.oD;
                eaiVar.M = dyoVar27.kb;
                eaiVar.N = dyoVar27.mM;
                eaiVar.O = dyoVar27.ph;
                eaiVar.P = dyoVar27.nR;
                eaiVar.Q = dyoVar27.kH;
                eaiVar.R = dyoVar27.pk;
                eaiVar.S = dyoVar27.gD;
                eaiVar.T = dyoVar27.oH;
                eaiVar.U = dyoVar27.lY;
                eaiVar.V = dyoVar27.nn;
                eaiVar.W = dyoVar27.pl;
                eaiVar.X = dyoVar27.pm;
                eaiVar.Y = dyoVar27.pn;
                eaiVar.Z = dyoVar27.pu;
                eaiVar.aa = dyoVar27.pv;
                eaiVar.ab = dyoVar27.pD;
                eaiVar.ac = dyoVar27.pR;
                eaiVar.ad = dyoVar27.pT;
                eaiVar.ae = dyoVar27.pS;
                eaiVar.af = dyoVar27.kn;
                eaiVar.ag = dyoVar27.eO;
                eaiVar.ah = dyoVar27.ba;
                eaiVar.ai = dyoVar27.lK;
                eaiVar.aj = dyoVar27.eE;
                eaiVar.ak = dyoVar27.pF;
                eaiVar.al = dyoVar27.lU;
                eaiVar.am = dyoVar27.pG;
                eaiVar.an = dyoVar27.np;
                eaiVar.ao = dyoVar27.pK;
                eaiVar.ap = dyoVar27.ai;
                eaiVar.aq = dyoVar27.as;
                eaiVar.ar = dyoVar27.gQ;
                eaiVar.as = dyoVar27.ns;
                eaiVar.at = dyoVar27.cA;
                eaiVar.au = dyoVar27.cD;
                eaiVar.av = dyoVar27.pV;
                eaiVar.aw = dyoVar27.ik;
                eaiVar.ax = dyoVar27.aw;
                eaiVar.ay = dyoVar27.ox;
                eaiVar.az = dyoVar27.oy;
                eaiVar.aA = dyoVar27.pX;
                eaiVar.aB = dyoVar27.pY;
                eaiVar.aC = dyoVar27.qa;
                eaiVar.aD = dyoVar27.rr;
                eaiVar.aE = dyoVar27.lD;
                eaiVar.aF = dyoVar27.rI;
                eaiVar.aG = dyoVar27.rJ;
                eaiVar.aH = dyoVar27.nl;
                eaiVar.aI = dyoVar27.jB;
                eaiVar.aJ = dyoVar27.aZ;
                eaiVar.aK = dyoVar27.di;
                eaiVar.aL = dyoVar27.cX;
                eaiVar.aM = dyoVar27.nm;
                eaiVar.aN = dyoVar27.rF;
                eaiVar.aO = dyoVar27.in;
                eaiVar.aP = dyoVar27.rL;
                eaiVar.aQ = dyoVar27.rs;
                eaiVar.aR = dyoVar27.cS;
                eaiVar.aS = dyoVar27.lJ;
                eaiVar.aT = dyoVar27.pU;
                eaiVar.aU = dyoVar27.fO;
                eaiVar.aV = dyoVar27.rE;
                eaiVar.aW = dyoVar27.x;
                eaiVar.aX = dyoVar27.rt;
                eaiVar.aY = dyoVar27.om;
                eaiVar.aZ = dyoVar27.kE;
                eaiVar.ba = dyoVar27.lT;
                eaiVar.bb = dyoVar27.pd;
                eaiVar.bc = dyoVar27.rv;
                eaiVar.bd = dyoVar27.rw;
                eaiVar.be = dyoVar27.rC;
                eaiVar.bf = axot.a(dyoVar27.oo);
                eaiVar.bg = axot.a(dyoVar27.hx);
                eaiVar.bh = axot.a(dyoVar27.os);
                eaiVar.bi = axot.a(dyoVar27.ot);
                eaiVar.bj = axot.a(dyoVar27.oz);
                eaiVar.bk = axot.a(dyoVar27.fi);
                eaiVar.bl = axot.a(dyoVar27.oI);
                eaiVar.bm = axot.a(dyoVar27.oJ);
                eaiVar.bn = axot.a(dyoVar27.nx);
                eaiVar.bo = axot.a(dyoVar27.pE);
                eaiVar.bp = axot.a(dyoVar27.fC);
                axot.a(dyoVar27.j);
                eaiVar.bq = axot.a(dyoVar27.fB);
                return eaiVar;
            case 1260:
                dyo dyoVar28 = this.a;
                return new ahta((aidn) dyoVar28.eQ.get(), dyoVar28.fO, (yni) dyoVar28.y.get(), new ahtx(), (axxb) dyoVar28.ap.get(), (aacz) dyoVar28.D.get(), (aadd) dyoVar28.K.get(), dyoVar28.rN, new ahtj(dyoVar28.by), null);
            case 1261:
                return this.a.cI();
            case 1262:
                dyo dyoVar29 = this.a;
                return new wty(dyoVar29.uq, amvn.s((wum) dyoVar29.rT.get(), (wum) dyoVar29.ur.get()), dyoVar29.st, (CopyOnWriteArrayList) dyoVar29.tx.get());
            case 1263:
                dyo dyoVar30 = this.a;
                return new eco(dyoVar30.un, dyoVar30.tF, dyoVar30.up, dyoVar30.ug, dyoVar30.sc);
            case 1264:
                return this.a.bh();
            case 1265:
                return this.a.bk();
            case 1266:
                return tfq.j();
            case 1267:
                dyo dyoVar31 = this.a;
                Context context4 = dyoVar31.b.a;
                aadd aaddVar = (aadd) dyoVar31.K.get();
                return wpp.g();
            case 1268:
                dyo dyoVar32 = this.a;
                azqb azqbVar5 = dyoVar32.jh;
                edd eddVar = (edd) dyoVar32.rS.get();
                azqb azqbVar6 = dyoVar32.sL;
                azqb azqbVar7 = dyoVar32.tW;
                azqb azqbVar8 = dyoVar32.sO;
                azqb azqbVar9 = dyoVar32.sP;
                azqb azqbVar10 = dyoVar32.tK;
                azqb azqbVar11 = dyoVar32.lI;
                azqb azqbVar12 = dyoVar32.sM;
                azqb azqbVar13 = dyoVar32.sT;
                azqb azqbVar14 = dyoVar32.sk;
                Executor executor = (Executor) dyoVar32.h.get();
                return new eds(azqbVar5, eddVar, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, azqbVar13, azqbVar14, (wwf) dyoVar32.rQ.get());
            case 1269:
                return new edd();
            case 1270:
                return wmx.i(this.a.rT);
            case 1271:
                return this.a.bf();
            case 1272:
                return this.a.bg();
            case 1273:
                dyo dyoVar33 = this.a;
                return new wvc(dyoVar33.rT, (amup) dyoVar33.rY.get());
            case 1274:
                dyo dyoVar34 = this.a;
                azqb azqbVar15 = dyoVar34.rX;
                azqb azqbVar16 = dyoVar34.rR;
                amum h = amup.h();
                h.f(apcd.SLOT_TYPE_BELOW_PLAYER, azqbVar16);
                h.f(apcd.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, ecp.a);
                h.f(apcd.SLOT_TYPE_IN_PLAYER, ecp.b);
                h.f(apcd.SLOT_TYPE_LOCKSCREEN, ecp.c);
                h.f(apcd.SLOT_TYPE_FIXED_FOOTER, ecp.d);
                h.f(apcd.SLOT_TYPE_FORECASTING, ecp.e);
                h.f(apcd.SLOT_TYPE_PLAYER_BYTES, azqbVar15);
                h.f(apcd.SLOT_TYPE_FULLSCREEN_ENGAGEMENT, ecp.f);
                h.f(apcd.SLOT_TYPE_PLAYBACK_TRACKING, ecp.g);
                h.f(apcd.SLOT_TYPE_SEQUENCE_ITEM_IN_PLAYER, ecp.h);
                return h.b();
            case 1275:
                dyo dyoVar35 = this.a;
                return new wuz(dyoVar35.rU, dyoVar35.y, dyoVar35.rV, dyoVar35.K, (Executor) dyoVar35.x.get(), dyoVar35.rW);
            case 1276:
                return new wnp();
            case 1277:
                return new wvh(this.a.rT);
            case 1278:
                return this.a.bl();
            case 1279:
                dyo dyoVar36 = this.a;
                return new wrj(dyoVar36.rT, (amup) dyoVar36.tG.get());
            case 1280:
                dyo dyoVar37 = this.a;
                azqb azqbVar17 = dyoVar37.sc;
                azqb azqbVar18 = dyoVar37.sf;
                azqb azqbVar19 = dyoVar37.tj;
                azqb azqbVar20 = dyoVar37.to;
                azqb azqbVar21 = dyoVar37.tq;
                azqb azqbVar22 = dyoVar37.ts;
                azqb azqbVar23 = dyoVar37.tz;
                azqb azqbVar24 = dyoVar37.tA;
                azqb azqbVar25 = dyoVar37.tD;
                azqb azqbVar26 = dyoVar37.tF;
                amum h2 = amup.h();
                h2.f(apcd.SLOT_TYPE_BELOW_PLAYER, azqbVar17);
                h2.f(apcd.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, azqbVar18);
                h2.f(apcd.SLOT_TYPE_IN_PLAYER, azqbVar19);
                h2.f(apcd.SLOT_TYPE_LOCKSCREEN, azqbVar20);
                h2.f(apcd.SLOT_TYPE_FIXED_FOOTER, azqbVar21);
                h2.f(apcd.SLOT_TYPE_FORECASTING, azqbVar22);
                h2.f(apcd.SLOT_TYPE_PLAYER_BYTES, azqbVar23);
                h2.f(apcd.SLOT_TYPE_FULLSCREEN_ENGAGEMENT, azqbVar24);
                h2.f(apcd.SLOT_TYPE_PLAYBACK_TRACKING, azqbVar25);
                h2.f(apcd.SLOT_TYPE_SEQUENCE_ITEM_IN_PLAYER, azqbVar26);
                return h2.b();
            case 1281:
                dyo dyoVar38 = this.a;
                return new edq(dyoVar38.rZ, (udt) dyoVar38.sa.get(), (wmk) dyoVar38.sb.get(), null);
            case 1282:
                return this.a.bj();
            case 1283:
                return new udt();
            case 1284:
                return new wmk();
            case 1285:
                return this.a.bi();
            case 1286:
                dyo dyoVar39 = this.a;
                wwf wwfVar = (wwf) dyoVar39.rQ.get();
                return new wmt((aafo) dyoVar39.sd.get());
            case 1287:
                return new exy();
            case 1288:
                dyo dyoVar40 = this.a;
                return wrg.a((wkn) dyoVar40.cY.get(), dyoVar40.rT, dyoVar40.sg, dyoVar40.K, dyoVar40.st, dyoVar40.sk, dyoVar40.td, dyoVar40.te, dyoVar40.tg, dyoVar40.th, dyoVar40.se, (wlw) dyoVar40.ti.get(), (aiji) dyoVar40.lJ.get(), (Executor) dyoVar40.x.get(), (yni) dyoVar40.y.get(), (wwf) dyoVar40.rQ.get());
            case 1289:
                return this.a.bq();
            case 1290:
                return this.a.bx();
            case 1291:
                dyo dyoVar41 = this.a;
                return oql.e((wzf) dyoVar41.sh.get(), (wyz) dyoVar41.si.get());
            case 1292:
                return this.a.bs();
            case 1293:
                return new zdw(this.a.b.a);
            case 1294:
                return this.a.br();
            case 1295:
                return new xix((wzx) this.a.sk.get());
            case 1296:
                return new wzx();
            case 1297:
                dyo dyoVar42 = this.a;
                snc sncVar2 = (snc) dyoVar42.v.get();
                return new xiy((aiji) dyoVar42.lJ.get(), (aijh) dyoVar42.sl.get(), (wjy) dyoVar42.sn.get(), (wzb) dyoVar42.sq.get(), (afzo) dyoVar42.sj.get(), (wzx) dyoVar42.sk.get(), (aafo) dyoVar42.sd.get());
            case 1298:
                return ahdx.C((aidn) this.a.eQ.get());
            case 1299:
                return this.a.bd();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object p() {
        advz advzVar;
        int i = this.b;
        int i2 = 8000;
        String str = "";
        switch (i) {
            case 600:
                dyo dyoVar = this.a;
                return new adkh(dyoVar.iN, dyoVar.hy(), dyoVar.b.a, (acwu) dyoVar.iH.get());
            case 601:
                String string = ((SharedPreferences) this.a.t.get()).getString("MdxServerSelection", advz.e.name());
                try {
                    advzVar = advz.a(string);
                } catch (IllegalArgumentException e) {
                    zep.f(adix.a, String.format(Locale.US, "Bogus value in shared preferences for key %s value %s, returning default value.", "MdxServerSelection", string), e);
                    advzVar = advz.e;
                }
                axzl.o(advzVar);
                return advzVar;
            case 602:
                dyo dyoVar2 = this.a;
                return new adrj(axot.a(dyoVar2.jy), (yni) dyoVar2.y.get(), (snc) dyoVar2.v.get(), axot.a(dyoVar2.jz), axot.a(dyoVar2.ef), axot.a(dyoVar2.jA), axot.a(dyoVar2.jU), axot.a(dyoVar2.jX), axot.a(dyoVar2.jW), axot.a(dyoVar2.jY), axot.a(dyoVar2.kf), (adcw) dyoVar2.eP.get(), (adwc) dyoVar2.iL.get(), axot.a(dyoVar2.jw), amvn.r((adny) dyoVar2.ki.get()), (aczd) dyoVar2.kj.get(), (acsf) dyoVar2.hg.get(), (acwu) dyoVar2.iH.get(), (aczl) dyoVar2.ju.get(), (adao) dyoVar2.ja.get());
            case 603:
                return this.a.du();
            case 604:
                dyo dyoVar3 = this.a;
                return new aiyx(dyoVar3.b.a, (aitm) dyoVar3.iR.get(), (aacz) dyoVar3.D.get());
            case 605:
                dyo dyoVar4 = this.a;
                return aise.d((axxb) dyoVar4.ap.get(), (yve) dyoVar4.iQ.get());
            case 606:
                dyo dyoVar5 = this.a;
                return abgl.g(dyoVar5.b.a, dyo.jp(), (ankw) dyoVar5.h.get(), (vlk) dyoVar5.j.get(), (yke) dyoVar5.p.get());
            case 607:
                return this.a.da();
            case 608:
                dyo dyoVar6 = this.a;
                return new adkl((yqh) dyoVar6.iT.get(), (adkh) dyoVar6.iO.get());
            case 609:
                dyo dyoVar7 = this.a;
                yqn yqnVar = (yqn) dyoVar7.iF.get();
                int i3 = ((acwu) dyoVar7.iH.get()).V;
                if (i3 > 0) {
                    i2 = i3;
                }
                return yqnVar.a(aear.f(i2));
            case 610:
                dyo dyoVar8 = this.a;
                yqn yqnVar2 = (yqn) dyoVar8.iF.get();
                int i4 = ((acwu) dyoVar8.iH.get()).U;
                if (i4 <= 0) {
                    i4 = 35000;
                }
                return yqnVar2.a(aear.f(i4));
            case 611:
                dyo dyoVar9 = this.a;
                return new adtt(new adtl((yni) dyoVar9.y.get(), (acvh) dyoVar9.ef.get(), (acwu) dyoVar9.iH.get()), (adwc) dyoVar9.iL.get(), (acrr) dyoVar9.aw.get());
            case 612:
                dyo dyoVar10 = this.a;
                final SharedPreferences sharedPreferences = (SharedPreferences) dyoVar10.t.get();
                final SecureRandom secureRandom = (SecureRandom) dyoVar10.eb.get();
                final azqb azqbVar = dyoVar10.iW;
                athd athdVar = ((aacz) dyoVar10.D.get()).b().o;
                if (athdVar == null) {
                    athdVar = athd.a;
                }
                aujq aujqVar = athdVar.g;
                if (aujqVar == null) {
                    aujqVar = aujq.a;
                }
                boolean z = aujqVar.c;
                String str2 = adix.a;
                ankt r = z ? anlz.r(anii.h(((vne) azqbVar.get()).a(), new ampg() { // from class: adiw
                    @Override // defpackage.ampg
                    public final Object apply(Object obj) {
                        SecureRandom secureRandom2 = secureRandom;
                        azqb azqbVar2 = azqbVar;
                        awtx awtxVar = (awtx) obj;
                        if (awtxVar == null || awtxVar.c.isEmpty()) {
                            String bigInteger = new BigInteger(130, secureRandom2).toString(32);
                            ylx.m(((vne) azqbVar2.get()).b(new wdx(bigInteger, 14), anjk.a), acsn.o);
                            return bigInteger;
                        }
                        return awtxVar.c;
                    }
                }, anjk.a)) : anlz.r(anii.h(anko.q(anlz.q(sharedPreferences.getString("remote_id", str))), new ampg() { // from class: adiv
                    @Override // defpackage.ampg
                    public final Object apply(Object obj) {
                        SecureRandom secureRandom2 = secureRandom;
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        String str3 = (String) obj;
                        if (amps.e(str3)) {
                            String bigInteger = new BigInteger(130, secureRandom2).toString(32);
                            sharedPreferences2.edit().putString("remote_id", bigInteger).apply();
                            ylx.m(ankq.a, acsn.p);
                            return bigInteger;
                        }
                        return str3;
                    }
                }, anjk.a));
                axzl.o(r);
                return r;
            case 613:
                dyo dyoVar11 = this.a;
                Context context = dyoVar11.b.a;
                vjf a = vjg.a(context);
                a.e("mdx");
                a.f("remote.pb");
                Uri a2 = a.a();
                vlo d = vlr.d(context, (ankw) dyoVar11.h.get());
                d.c = dyo.jp();
                d.b();
                d.d("remote_id");
                d.e(adiz.a);
                vlr a3 = d.a();
                vli a4 = vlj.a();
                a4.f(a2);
                a4.e(awtx.a);
                a4.b(a3);
                return ((vlk) dyoVar11.j.get()).a(a4.a());
            case 614:
                return this.a.m287do();
            case 615:
                dyo dyoVar12 = this.a;
                yqn yqnVar3 = (yqn) dyoVar12.iF.get();
                int i5 = ((acwu) dyoVar12.iH.get()).O;
                if (i5 > 0) {
                    i2 = i5;
                }
                return yqnVar3.a(aear.f(i2));
            case 616:
                return this.a.cZ();
            case 617:
                String str3 = ((aczr) this.a.bg.get()).d;
                axzl.o(str3);
                return str3;
            case 618:
                dyo dyoVar13 = this.a;
                return new adbo(((acwu) dyoVar13.iH.get()).g, dyoVar13.hy());
            case 619:
                dyo dyoVar14 = this.a;
                return new adao((vne) dyoVar14.iZ.get(), (snc) dyoVar14.v.get(), (acwu) dyoVar14.iH.get(), (acrr) dyoVar14.aw.get());
            case 620:
                dyo dyoVar15 = this.a;
                Context context2 = dyoVar15.b.a;
                vjf a5 = vjg.a(context2);
                a5.e("mdx");
                a5.f("device_management.pb");
                Uri a6 = a5.a();
                vlo d2 = vlr.d(context2, (ankw) dyoVar15.h.get());
                d2.c = dyo.jp();
                d2.b();
                d2.d("youtube.mdx:dial_devices");
                d2.e(adiy.a);
                vlr a7 = d2.a();
                vli a8 = vlj.a();
                a8.f(a6);
                a8.e(awts.a);
                a8.b(a7);
                return ((vlk) dyoVar15.j.get()).a(a8.a());
            case 621:
                return Boolean.valueOf(((SharedPreferences) this.a.t.get()).getBoolean("EnableSsdpResponseLogging", false));
            case 622:
                return this.a.bQ();
            case 623:
                return this.a.bP();
            case 624:
                return this.a.an();
            case 625:
                return this.a.K();
            case 626:
                return this.a.dr();
            case 627:
                return this.a.cU();
            case 628:
                return this.a.cV();
            case 629:
                dyo dyoVar16 = this.a;
                afvn afvnVar = (afvn) dyoVar16.au.get();
                afvy afvyVar = (afvy) dyoVar16.f14do.get();
                yni yniVar = (yni) dyoVar16.y.get();
                advx advxVar = new advx(afvnVar, afvyVar, yniVar, (snc) dyoVar16.v.get(), (acwu) dyoVar16.iH.get());
                yniVar.g(advxVar);
                return advxVar;
            case 630:
                dyo dyoVar17 = this.a;
                yqn yqnVar4 = (yqn) dyoVar17.iF.get();
                int i6 = ((acwu) dyoVar17.iH.get()).R;
                if (i6 <= 0) {
                    i6 = 62000;
                }
                return yqnVar4.a(aear.f(i6));
            case 631:
                dyo dyoVar18 = this.a;
                yqn yqnVar5 = (yqn) dyoVar18.iF.get();
                int i7 = ((acwu) dyoVar18.iH.get()).Q;
                if (i7 > 0) {
                    i2 = i7;
                }
                return yqnVar5.a(aear.f(i2));
            case 632:
                dyo dyoVar19 = this.a;
                adtt adttVar = (adtt) dyoVar19.iV.get();
                int c = dyoVar19.c();
                HashMap hashMap = new HashMap((Map) dyoVar19.jf.get());
                if (c == 1 && adttVar.m()) {
                    try {
                        String g = adttVar.g();
                        String str4 = adix.a;
                        String.format("Adding %s: %s", "remoteControllerUrl", g);
                        hashMap.put("remoteControllerUrl", g);
                    } catch (IllegalArgumentException e2) {
                        zep.f(adix.a, "Could not add local transport browser channel parameters", e2);
                    }
                }
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                axzl.o(unmodifiableMap);
                return unmodifiableMap;
            case 633:
                dyo dyoVar20 = this.a;
                acwu acwuVar = (acwu) dyoVar20.iH.get();
                Context context3 = dyoVar20.b.a;
                String hy = dyoVar20.hy();
                aczr aczrVar = (aczr) dyoVar20.bg.get();
                azqb azqbVar2 = dyoVar20.eL;
                String str5 = (String) dyoVar20.fa.get();
                azqb azqbVar3 = dyoVar20.eH;
                String upperCase = Build.MANUFACTURER.toUpperCase(Locale.US);
                String str6 = Build.MODEL;
                StringBuilder sb = new StringBuilder(String.valueOf(upperCase).length() + 1 + String.valueOf(str6).length());
                sb.append(upperCase);
                sb.append(" ");
                sb.append(str6);
                String sb2 = sb.toString();
                String i8 = aeik.i(zew.v(context3), zfm.c(context3), hy);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("device", "REMOTE_CONTROL");
                hashMap2.put("id", (String) ylx.g((ankt) dyoVar20.iX.get(), 1L, TimeUnit.SECONDS, str));
                hashMap2.put("name", sb2);
                hashMap2.put("app", i8);
                hashMap2.put("mdx-version", "3");
                hashMap2.put("theme", hy);
                if (acwuVar.w) {
                    try {
                        aaqz aaqzVar = ((aara) azqbVar2.get()).a;
                        String d3 = ((wwk) azqbVar3.get()).d();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("user_agent", str5);
                        jSONObject.put("window_width_points", aaqzVar != null ? aaqzVar.a : 0);
                        jSONObject.put("window_height_points", aaqzVar != null ? aaqzVar.b : 0);
                        jSONObject.put("os_name", "Android");
                        jSONObject.put("ms", d3);
                        hashMap2.put("deviceContext", jSONObject.toString());
                    } catch (JSONException e3) {
                        zep.f(adix.a, "Error building 'deviceContext' data.", e3);
                    }
                }
                String h = aear.h(acwuVar, aczrVar);
                if (h != null) {
                    hashMap2.put("capabilities", h);
                }
                amvn amvnVar = acwuVar.c;
                if (amvnVar != null && !amvnVar.isEmpty()) {
                    str = TextUtils.join(",", amvnVar);
                }
                hashMap2.put("experiments", str);
                Map unmodifiableMap2 = Collections.unmodifiableMap(hashMap2);
                axzl.o(unmodifiableMap2);
                return unmodifiableMap2;
            case 634:
                return this.a.bw();
            case 635:
                dyo dyoVar21 = this.a;
                return new aggg((yni) dyoVar21.y.get(), (ailv) dyoVar21.jn.get(), (aimy) dyoVar21.fI.get(), dyoVar21.gS, dyoVar21.jg, (aadd) dyoVar21.K.get(), (agwp) dyoVar21.jo.get(), (Executor) dyoVar21.h.get(), (Executor) dyoVar21.x.get(), amvn.r((aimx) dyoVar21.fJ.get()), dyoVar21.bT(), (ahdn) dyoVar21.gR.get(), (ahdf) dyoVar21.ha.get());
            case 636:
                dyo dyoVar22 = this.a;
                aenl dE = dyoVar22.dE();
                aacz aaczVar = (aacz) dyoVar22.D.get();
                return wjs.j((aaqf) dyoVar22.eV.get(), (aimy) dyoVar22.fI.get(), new ainh(dyoVar22.jg, dyoVar22.ji), (yqw) dyoVar22.jj.get(), (snc) dyoVar22.v.get(), dE);
            case 637:
                return this.a.ci();
            case 638:
                return amvn.r((aaoo) this.a.jh.get());
            case 639:
                return tfq.l();
            case 640:
                return this.a.bH();
            case 641:
                return this.a.dD();
            case 642:
                return new aivp((aivt) this.a.jk.get());
            case 643:
                return this.a.fn();
            case 644:
                dyo dyoVar23 = this.a;
                atts gA = dyoVar23.gA();
                Context context4 = dyoVar23.b.a;
                return wze.m((Executor) dyoVar23.h.get(), gA);
            case 645:
                return this.a.dC();
            case 646:
                return this.a.gH();
            case 647:
                return new agwp((agwt) this.a.hk.get());
            case 648:
                return new aefn();
            case 649:
                dyo dyoVar24 = this.a;
                return new adnd(dyoVar24.b.a, (yzj) dyoVar24.je.get());
            case 650:
                return this.a.cW();
            case 651:
                return this.a.ds();
            case 652:
                dyo dyoVar25 = this.a;
                return new adfg(dyoVar25.dp(), (adih) dyoVar25.jr.get(), null);
            case 653:
                dyo dyoVar26 = this.a;
                return new adks(dyoVar26.fO, (airw) dyoVar26.fP.get());
            case 654:
                dyo dyoVar27 = this.a;
                return new adlm(dyoVar27.fO, (airw) dyoVar27.fP.get());
            case 655:
                return new ivr();
            case 656:
                return this.a.dp();
            case 657:
                dyo dyoVar28 = this.a;
                return new aczl((acrr) dyoVar28.aw.get(), axot.a(dyoVar28.jq));
            case 658:
                dyo dyoVar29 = this.a;
                return new adex(dyoVar29.b.a, (acwu) dyoVar29.iH.get(), (Executor) dyoVar29.h.get());
            case 659:
                return new aczo();
            case 660:
                dyo dyoVar30 = this.a;
                return new adbt((adwc) dyoVar30.iL.get(), (acwu) dyoVar30.iH.get());
            case 661:
                dyo dyoVar31 = this.a;
                return new adnh((acrr) dyoVar31.aw.get(), (acwu) dyoVar31.iH.get(), (ankx) dyoVar31.h.get(), (snc) dyoVar31.v.get());
            case 662:
                return new adrq();
            case 663:
                return new adqu((acrr) this.a.aw.get());
            case 664:
                return this.a.fq();
            case 665:
                return this.a.dt();
            case 666:
                dyo dyoVar32 = this.a;
                azqb azqbVar4 = dyoVar32.jB;
                bgo bgoVar = (bgo) dyoVar32.jC.get();
                adgc adgcVar = (adgc) dyoVar32.jT.get();
                yrj yrjVar = (yrj) dyoVar32.as.get();
                adas adasVar = (adas) dyoVar32.iK.get();
                yni yniVar2 = (yni) dyoVar32.y.get();
                adgl adglVar = (adgl) dyoVar32.jS.get();
                return new adrn(azqbVar4, bgoVar, adgcVar, yrjVar, adasVar, yniVar2, (Executor) dyoVar32.x.get(), (ankw) dyoVar32.h.get());
            case 667:
                Context context5 = this.a.b.a;
                ylr.c();
                return bhd.b(context5);
            case 668:
                dyo dyoVar33 = this.a;
                String hz = dyoVar33.hz();
                String hA = dyoVar33.hA();
                bgn bgnVar = new bgn();
                bgnVar.c(hA);
                bgnVar.c("android.media.intent.category.LIVE_AUDIO");
                bgnVar.c(tfo.t(hz));
                bgo a9 = bgnVar.a();
                axzl.o(a9);
                return a9;
            case 669:
                dyo dyoVar34 = this.a;
                return new adgc(axot.a(dyoVar34.jB), (yni) dyoVar34.y.get(), axot.a(dyoVar34.jq), axot.a(dyoVar34.jC), axot.a(dyoVar34.gH), axot.a(dyoVar34.jD), axot.a(dyoVar34.jK), axot.a(dyoVar34.jN), axot.a(dyoVar34.jR), axot.a(dyoVar34.jS), axot.a(dyoVar34.js), axot.a(dyoVar34.jt), (adex) dyoVar34.jv.get());
            case 670:
                dyo dyoVar35 = this.a;
                return new ajad(dyoVar35.b.a, (Handler) dyoVar35.an.get(), dyoVar35.jH, (aizp) dyoVar35.jI.get(), dyoVar35.jJ, new aizy(1));
            case 671:
                return this.a.O();
            case 672:
                dyo dyoVar36 = this.a;
                return ahed.f((ajad) dyoVar36.jD.get(), (Executor) dyoVar36.x.get());
            case 673:
                return this.a.y();
            case 674:
                dyo dyoVar37 = this.a;
                return new abbz((aaqj) dyoVar37.er.get(), (aaqf) dyoVar37.eV.get(), (afvn) dyoVar37.au.get(), dyoVar37.bJ(), (yni) dyoVar37.y.get(), (abfh) dyoVar37.r.get());
            case 675:
                return this.a.cw();
            case 676:
                return aheb.e((airw) this.a.fP.get());
            case 677:
                dyo dyoVar38 = this.a;
                return egd.a(dyoVar38.b.a, dyoVar38.g());
            case 678:
                dyo dyoVar39 = this.a;
                adei df = dyoVar39.df();
                acrr acrrVar = (acrr) dyoVar39.aw.get();
                Context context6 = dyoVar39.b.a;
                return new adga(df, acrrVar, (yrj) dyoVar39.as.get(), (yni) dyoVar39.y.get(), (Executor) dyoVar39.x.get(), (acwu) dyoVar39.iH.get(), (ankw) dyoVar39.h.get());
            case 679:
                String string2 = ((SharedPreferences) this.a.t.get()).getString("MdxDeviceAllowlist", str);
                axzl.o(string2);
                return string2;
            case 680:
                dyo dyoVar40 = this.a;
                return new adgj((Executor) dyoVar40.x.get(), (ankw) dyoVar40.h.get(), dyoVar40.de());
            case 681:
                dyo dyoVar41 = this.a;
                return new adel(axot.a(dyoVar41.jB), axot.a(dyoVar41.jC), axot.a(dyoVar41.jQ));
            case 682:
                dyo dyoVar42 = this.a;
                return new adew(dyoVar42.b.a, (Executor) dyoVar42.x.get(), (ankw) dyoVar42.h.get(), dyoVar42.hA(), dyoVar42.jK, dyoVar42.jq, dyoVar42.jO, dyoVar42.jP, ((SharedPreferences) dyoVar42.t.get()).getBoolean("EnableMediaRouteDescriptionInDialog", false));
            case 683:
                dyo dyoVar43 = this.a;
                return new adof(dyoVar43.jq, gad.l(), (snc) dyoVar43.v.get());
            case 684:
                dyo dyoVar44 = this.a;
                return new adfi(dyoVar44.js, axot.a(dyoVar44.jq));
            case 685:
                dyo dyoVar45 = this.a;
                return new adgl(dyoVar45.hz(), dyoVar45.jB, dyoVar45.df());
            case 686:
                dyo dyoVar46 = this.a;
                return new adre((snc) dyoVar46.v.get(), axot.a(dyoVar46.jW), axot.a(dyoVar46.jz), axot.a(dyoVar46.jU), (acwu) dyoVar46.iH.get());
            case 687:
                return new adra((yve) this.a.jV.get());
            case 688:
                return this.a.bN().a(adch.c, aber.q, awty.a);
            case 689:
                return new adod((zah) this.a.av.get(), Executors.newSingleThreadScheduledExecutor(new yli("mdxPresence")));
            case 690:
                return this.a.dg();
            case 691:
                dyo dyoVar47 = this.a;
                adlh adlhVar = (adkt) dyoVar47.jZ.get();
                adlh adlhVar2 = (adln) dyoVar47.ka.get();
                if (true == ((aczr) dyoVar47.bg.get()).i) {
                    adlhVar = adlhVar2;
                }
                axzl.o(adlhVar);
                return adlhVar;
            case 692:
                dyo dyoVar48 = this.a;
                return new adkt((yni) dyoVar48.y.get(), (airw) dyoVar48.fP.get(), dyoVar48.fO, dyoVar48.ib, (adoa) dyoVar48.jq.get());
            case 693:
                dyo dyoVar49 = this.a;
                return new adln((yni) dyoVar49.y.get(), (airw) dyoVar49.fP.get(), dyoVar49.fO, dyoVar49.ib, (adoa) dyoVar49.jq.get());
            case 694:
                return this.a.cJ();
            case 695:
                return this.a.cL();
            case 696:
                return this.a.cM();
            case 697:
                return this.a.dV();
            case 698:
                return this.a.hB();
            case 699:
                return this.a.hv();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        amca amcaVar;
        String str;
        String str2;
        Integer num;
        int i = this.b;
        boolean z = false;
        switch (i) {
            case 100:
                dyo dyoVar = this.a;
                return new amir(dyoVar.b.a, dyoVar.j());
            case 101:
                dyo dyoVar2 = this.a;
                amup k = amup.k(amkf.class, "com.google.apps.tiktok.sync.impl.workmanager.SyncWorker");
                Executor executor = (Executor) dyoVar2.aA.get();
                return new amfz((bqo) dyoVar2.ag.get(), k);
            case 102:
                return new SecureRandom();
            case 103:
                return new Random();
            case 104:
                dyo dyoVar3 = this.a;
                final amag amagVar = (amag) dyoVar3.aT.get();
                ambs ambsVar = new ambs() { // from class: alzv
                    @Override // defpackage.ambs
                    public final ankt a(ambr ambrVar) {
                        amag.this.e();
                        return anlz.q(null);
                    }
                };
                final amgk amgkVar = (amgk) dyoVar3.aD.get();
                ambs ambsVar2 = new ambs() { // from class: amco
                    @Override // defpackage.ambs
                    public final ankt a(ambr ambrVar) {
                        amgk amgkVar2 = amgk.this;
                        ankt q = anlz.q(null);
                        amgkVar2.a(q);
                        return q;
                    }
                };
                final amjh amjhVar = (amjh) dyoVar3.aS.get();
                return amvn.t(ambsVar, ambsVar2, new ambs() { // from class: amjq
                    @Override // defpackage.ambs
                    public final ankt a(ambr ambrVar) {
                        return amjh.this.d();
                    }
                });
            case 105:
                return this.a.gt();
            case 106:
                return this.a.gj();
            case 107:
                return this.a.gQ();
            case 108:
                dyo dyoVar4 = this.a;
                amup n = amup.n("youtube-delegated", new whm((ankw) dyoVar4.h.get(), (vzv) dyoVar4.au.get(), 1), "youtube-direct", new whm((ankw) dyoVar4.h.get(), (vzv) dyoVar4.au.get()), "youtube-incognito", new whm((ankw) dyoVar4.h.get(), (vzv) dyoVar4.au.get(), 2), "pseudonymous", new amdt());
                amvl i2 = amvn.i();
                for (Map.Entry entry : n.entrySet()) {
                    amcb amcbVar = new amcb();
                    String str3 = (String) entry.getKey();
                    if (str3 == null) {
                        throw new NullPointerException("Null type");
                    }
                    amcbVar.a = str3;
                    amca amcaVar2 = (amca) entry.getValue();
                    if (amcaVar2 == null) {
                        throw new NullPointerException("Null provider");
                    }
                    amcbVar.b = amcaVar2;
                    String str4 = amcbVar.a;
                    if (str4 == null || (amcaVar = amcbVar.b) == null) {
                        StringBuilder sb = new StringBuilder();
                        if (amcbVar.a == null) {
                            sb.append(" type");
                        }
                        if (amcbVar.b == null) {
                            sb.append(" provider");
                        }
                        String valueOf = String.valueOf(sb);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                        sb2.append("Missing required properties:");
                        sb2.append(valueOf);
                        throw new IllegalStateException(sb2.toString());
                    }
                    i2.c(new amcc(str4, amcaVar));
                }
                amvn g = i2.g();
                axzl.o(g);
                return amvn.p(g);
            case 109:
                return this.a.iX();
            case 110:
                return amvn.r(new amcq((amgk) this.a.aD.get()));
            case 111:
                dyo dyoVar5 = this.a;
                try {
                    PackageInfo packageInfo = dyoVar5.h().getPackageInfo(dyoVar5.b.a.getPackageName(), 0);
                    axzl.o(packageInfo);
                    return packageInfo;
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalStateException("Can't find our own package", e);
                }
            case 112:
                return this.a.gP();
            case 113:
                return this.a.ba();
            case 114:
                return egd.j(this.a.b.a);
            case 115:
                return egd.n();
            case 116:
                return egd.m();
            case 117:
                return egd.l();
            case 118:
                aczp a = aczr.a();
                a.a = new aczq();
                a.b = "cl";
                a.e(2131232404);
                a.b(true);
                a.d(1);
                a.a(true);
                a.c();
                aczq aczqVar = a.a;
                if (aczqVar != null && (str = a.b) != null && (str2 = a.c) != null && (num = a.d) != null && a.e != null && a.f != null && a.g != null && a.h != null && a.i != null && a.j != null) {
                    return new aczr(aczqVar, str, str2, num.intValue(), a.e.booleanValue(), a.f.intValue(), a.g.booleanValue(), a.h.booleanValue(), a.i, a.j.booleanValue());
                }
                StringBuilder sb3 = new StringBuilder();
                if (a.a == null) {
                    sb3.append(" castAppIdConfigs");
                }
                if (a.b == null) {
                    sb3.append(" theme");
                }
                if (a.c == null) {
                    sb3.append(" dialAppName");
                }
                if (a.d == null) {
                    sb3.append(" remoteNotificationIconResId");
                }
                if (a.e == null) {
                    sb3.append(" lockscreenAdSupported");
                }
                if (a.f == null) {
                    sb3.append(" multiUserSession");
                }
                if (a.g == null) {
                    sb3.append(" forceQueueingEnabled");
                }
                if (a.h == null) {
                    sb3.append(" mdxPlaybackQueueEnabled");
                }
                if (a.i == null) {
                    sb3.append(" castDataChannelNameSpace");
                }
                if (a.j == null) {
                    sb3.append(" mdxLoopModeEnabled");
                }
                String valueOf2 = String.valueOf(sb3);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                sb4.append("Missing required properties:");
                sb4.append(valueOf2);
                throw new IllegalStateException(sb4.toString());
            case 119:
                Object obj = this.a.bj.get();
                amyg amygVar = amyg.a;
                ammp ammpVar = ammp.REALTIME;
                axzl.o(ammpVar);
                return new amly((amme) obj, amygVar, ammpVar);
            case 120:
                dyo dyoVar6 = this.a;
                Object obj2 = dyoVar6.bi.get();
                amky amkyVar = amky.a;
                axzl.o(amkyVar);
                return new ammg((amlk) obj2, (snc) dyoVar6.v.get(), (ankx) dyoVar6.aA.get(), dyoVar6.bk, (amms) dyoVar6.bl.get(), amkyVar);
            case 121:
                return new amlk((ExecutorService) this.a.bh.get());
            case 122:
                dyo dyoVar7 = this.a;
                ankx gw = dyoVar7.gw();
                dyoVar7.jd();
                return ((Boolean) ampq.j(false).e(false)).booleanValue() ? swm.f(gw) : soc.a(gw);
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                return amvn.r(this.a.hm());
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return new amms();
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                dyo dyoVar8 = this.a;
                vej vejVar = vej.STARTUP_LISTENERS;
                final vei aX = dyoVar8.aX();
                final amup m = amup.m("ActivityLifecycleCallbacks", dyoVar8.bo, "FirmReferenceManager", dyoVar8.bp, "AfterPackageReplaced", dyoVar8.br);
                final amup m2 = amup.m("Set BlockableFutures failure mode", dyoVar8.bs, "PrimesMetricServices", dyoVar8.cv, "PrngFixes", dyoVar8.cw);
                return new vel(amup.m(vejVar, new vek() { // from class: ves
                    @Override // defpackage.vek
                    public final void a() {
                        vei veiVar = vei.this;
                        Map map = m2;
                        Map map2 = m;
                        amlp l = amna.l("Startup Listeners");
                        try {
                            if (veiVar.a()) {
                                if (Math.random() < 0.5d) {
                                    zgd.S(map);
                                    zgd.S(map2);
                                } else {
                                    zgd.S(map2);
                                    zgd.S(map);
                                }
                            } else {
                                zgd.S(map);
                            }
                            l.close();
                        } catch (Throwable th) {
                            try {
                                l.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    }
                }, vej.LOGGING, new aoef(new aoee(axpa.a)), vej.UNCAUGHT_EXCEPTION_HANDLER, new veq(dyoVar8.cx, (snc) dyoVar8.v.get())));
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                dyo dyoVar9 = this.a;
                final Context context = dyoVar9.b.a;
                amyg amygVar2 = amyg.a;
                final azqb azqbVar = dyoVar9.bn;
                final amly amlyVar = (amly) dyoVar9.bm.get();
                amlyVar.getClass();
                final ampq j = ampq.j(new ampg() { // from class: amlz
                    @Override // defpackage.ampg
                    public final Object apply(Object obj3) {
                        return new amlx(amly.this, (Application.ActivityLifecycleCallbacks) obj3);
                    }
                });
                return new ver() { // from class: vem
                    @Override // defpackage.ver
                    public final void a() {
                        Application application = (Application) context;
                        application.registerActivityLifecycleCallbacks(new ven(application, azqbVar, j));
                    }
                };
            case 127:
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = ((ameh) this.a.aF.get()).d;
                axzl.o(activityLifecycleCallbacks);
                return amvn.r(activityLifecycleCallbacks);
            case 128:
                return new vgd(this.a.b.a);
            case 129:
                dyo dyoVar10 = this.a;
                return new amgu(dyoVar10.b.a, dyoVar10.aX(), dyoVar10.bq, (ankw) dyoVar10.g.get(), axot.a(dyoVar10.aI), dyoVar10.bm, dyoVar10.aU);
            case 130:
                dyo dyoVar11 = this.a;
                final ambw gh = dyoVar11.gh();
                amgq amgqVar = new amgq() { // from class: amcd
                    @Override // defpackage.amgq
                    public final void a() {
                        final ambw ambwVar = ambw.this;
                        ankt i3 = anhq.i(ambwVar.b.d(), Throwable.class, ammo.c(new anir() { // from class: ambv
                            @Override // defpackage.anir
                            public final ankt a(Object obj3) {
                                ambw ambwVar2 = ambw.this;
                                ((amzw) ((amzw) ((amzw) ambw.a.f()).h((Throwable) obj3)).i("com/google/apps/tiktok/account/data/AccountInvalidator", "lambda$invalidateAllAccountsInternal$0", 80, "AccountInvalidator.java")).q("Account sync failed");
                                return ambwVar2.b.g.b(amcf.a, anjk.a);
                            }
                        }), anjk.a);
                        ambwVar.b.c(i3);
                        amee.b(i3, "Failed account invalidation.", new Object[0]);
                    }
                };
                final Context context2 = dyoVar11.b.a;
                return amvn.t(amgqVar, new amgq() { // from class: amib
                    @Override // defpackage.amgq
                    public final void a() {
                        Context context3 = context2;
                        try {
                            PackageInfo packageInfo2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0);
                            if (Build.VERSION.SDK_INT >= 24 && packageInfo2.applicationInfo.targetSdkVersion >= 24) {
                                return;
                            }
                            try {
                                Os.chmod(packageInfo2.applicationInfo.dataDir, 448);
                            } catch (Exception e2) {
                                throw new IOException(e2);
                            }
                        } catch (PackageManager.NameNotFoundException | IOException unused) {
                        }
                    }
                }, new amka(dyoVar11.aS));
            case 131:
                soz sozVar = soz.LOG_ERROR;
                axzl.o(sozVar);
                final ampq j2 = ampq.j(sozVar);
                return new ver() { // from class: soy
                    @Override // defpackage.ver
                    public final void a() {
                        soz sozVar2 = (soz) ((ampv) ampq.this).a;
                    }
                };
            case 132:
                dyo dyoVar12 = this.a;
                final azqb azqbVar2 = dyoVar12.cu;
                final Context context3 = dyoVar12.b.a;
                return new ver() { // from class: uvr
                    @Override // defpackage.ver
                    public final void a() {
                        Context context4 = context3;
                        azqb azqbVar3 = azqbVar2;
                        Boolean bool = false;
                        if (bool.booleanValue() && veg.b()) {
                            String a2 = veg.a(context4);
                            if (a2 != null && a2.endsWith(":primes_lifeboat")) {
                                return;
                            }
                            for (uvo uvoVar : (Set) azqbVar3.get()) {
                                uvoVar.a();
                            }
                        }
                    }
                };
            case 133:
                dyo dyoVar13 = this.a;
                amvl j3 = amvn.j(11);
                Iterable r = Build.VERSION.SDK_INT >= 30 ? amvn.r((uvo) dyoVar13.bK.get()) : amyg.a;
                axzl.o(r);
                j3.j(r);
                ampq.j(dyoVar13.bL);
                Iterable r2 = uwp.b() ? amvn.r((uvo) dyoVar13.bM.get()) : amyg.a;
                axzl.o(r2);
                j3.j(r2);
                amyg amygVar3 = amyg.a;
                axzl.o(amygVar3);
                j3.j(amygVar3);
                ampq.j(dyoVar13.bV);
                j3.j(amvn.r((uvo) dyoVar13.bX.get()));
                ampq.j(dyoVar13.bY);
                j3.j(amvn.r((uyi) dyoVar13.cc.get()));
                amyg amygVar4 = amyg.a;
                axzl.o(amygVar4);
                j3.j(amygVar4);
                ampq.j(dyoVar13.cd);
                Iterable r3 = uxe.g() ? amvn.r((uvo) dyoVar13.cg.get()) : amyg.a;
                axzl.o(r3);
                j3.j(r3);
                ampq.j(dyoVar13.ch);
                j3.j(amvn.r((uvo) dyoVar13.cn.get()));
                amyg amygVar5 = amyg.a;
                axzl.o(amygVar5);
                j3.j(amygVar5);
                j3.c((uvo) dyoVar13.cr.get());
                j3.c(dyoVar13.ht());
                return j3.g();
            case 134:
                return this.a.gV();
            case 135:
                return new uvk(axot.a(this.a.bv));
            case 136:
                dyo dyoVar14 = this.a;
                return amvn.s((var) dyoVar14.bu.get(), new van(dyoVar14.b.a, amyg.a, amyg.a));
            case 137:
                dyo dyoVar15 = this.a;
                return new aktl((yni) dyoVar15.y.get(), (akwr) dyoVar15.bt.get());
            case 138:
                dyo dyoVar16 = this.a;
                Context context4 = dyoVar16.b.a;
                SharedPreferences sharedPreferences = (SharedPreferences) dyoVar16.t.get();
                return new akwr((yme) dyoVar16.M.get());
            case 139:
                dyo dyoVar17 = this.a;
                return new uvq(dyoVar17.b.a, (String) dyoVar17.bw.get());
            case 140:
                Context context5 = this.a.b.a;
                PackageManager packageManager = context5.getPackageManager();
                String packageName = context5.getPackageName();
                try {
                    return packageManager.getPackageInfo(packageName, 0).versionName;
                } catch (PackageManager.NameNotFoundException e2) {
                    ((amzw) ((amzw) ((amzw) uvs.a.g()).h(e2)).i("com/google/android/libraries/performance/primes/metrics/core/PrimesCoreMetricDaggerModule", "provideVersionName", 84, "PrimesCoreMetricDaggerModule.java")).s("Failed to get PackageInfo for: %s", packageName);
                    return null;
                }
            case 141:
                return new uto();
            case 142:
                dyo dyoVar18 = this.a;
                return new vah(dyoVar18.by, dyoVar18.bD, dyoVar18.bH, dyoVar18.bI);
            case 143:
                return this.a.b.a;
            case 144:
                return this.a.ia();
            case 145:
                return this.a.aL();
            case 146:
                utn utnVar = (utn) this.a.bz.get();
                sof jf = dyo.jf();
                int i3 = utnVar.b;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i3, new utk(utnVar.a), new uti());
                scheduledThreadPoolExecutor.setMaximumPoolSize(i3);
                ankx a2 = jf.a(anlz.f(scheduledThreadPoolExecutor));
                axzl.o(a2);
                return a2;
            case 147:
                utm utmVar = new utm();
                utmVar.a = 11;
                utmVar.b = 2;
                utmVar.c = true;
                Integer num2 = utmVar.a;
                if (num2 != null && utmVar.b != null && utmVar.c != null) {
                    utn utnVar2 = new utn(num2.intValue(), utmVar.b.intValue(), utmVar.c.booleanValue());
                    int i4 = utnVar2.b;
                    if (i4 > 0 && i4 <= 2) {
                        z = true;
                    }
                    aqxo.A(z, "Thread pool size must be less than or equal to %s", 2);
                    return utnVar2;
                }
                StringBuilder sb5 = new StringBuilder();
                if (utmVar.a == null) {
                    sb5.append(" primesMetricExecutorPriority");
                }
                if (utmVar.b == null) {
                    sb5.append(" primesMetricExecutorPoolSize");
                }
                if (utmVar.c == null) {
                    sb5.append(" enableDeferredTasks");
                }
                String valueOf3 = String.valueOf(sb5);
                StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf3).length() + 28);
                sb6.append("Missing required properties:");
                sb6.append(valueOf3);
                throw new IllegalStateException(sb6.toString());
            case 148:
                return this.a.aM();
            case 149:
                return this.a.aN();
            case 150:
                return this.a.hc();
            case 151:
                return this.a.jI();
            case 152:
                dyo dyoVar19 = this.a;
                return new vak((Random) dyoVar19.bF.get(), (uzy) dyoVar19.bG.get(), (snc) dyoVar19.bE.get());
            case 153:
                return new Random(((snc) this.a.bE.get()).d());
            case 154:
                return (snc) ampq.j((snc) this.a.v.get()).e(new zgi(1));
            case 155:
                return this.a.aV();
            case 156:
                return true;
            case 157:
                return amon.a;
            case 158:
                return new utv();
            case 159:
                Object obj3 = new nfd(this.a.b.a, 5).get();
                axzl.o(obj3);
                return obj3;
            case 160:
                return new uwm(null);
            case 161:
                return Boolean.valueOf(this.a.iA());
            case 162:
                return this.a.id();
            case 163:
                return this.a.aO();
            case 164:
                return this.a.ha();
            case 165:
                uus uusVar = (uus) ((azqb) ampq.j(this.a.bL).e(usw.a)).get();
                axzl.o(uusVar);
                return uusVar;
            case 166:
                return this.a.ie();
            case 167:
                dyo dyoVar20 = this.a;
                return new uxa(dyoVar20.aQ(), dyoVar20.b.a, (uui) dyoVar20.bC.get(), axot.a(dyoVar20.bN), (uwu) dyoVar20.bO.get(), dyoVar20.bP, dyoVar20.bQ, (Executor) dyoVar20.bD.get(), dyoVar20.bR, (uvu) dyoVar20.bT.get(), dyoVar20.bU, false);
            case 168:
                uxc uxcVar = new uxc();
                uxcVar.a = 10;
                uxcVar.b = 2;
                Integer num3 = uxcVar.a;
                if (num3 != null) {
                    return new uxd(num3.intValue());
                }
                StringBuilder sb7 = new StringBuilder();
                if (uxcVar.b == 0) {
                    sb7.append(" enablement");
                }
                if (uxcVar.a == null) {
                    sb7.append(" rateLimitPerSecond");
                }
                String valueOf4 = String.valueOf(sb7);
                StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf4).length() + 28);
                sb8.append("Missing required properties:");
                sb8.append(valueOf4);
                throw new IllegalStateException(sb8.toString());
            case 169:
                return this.a.gS();
            case 170:
                return Boolean.valueOf(this.a.iB());
            case 171:
                return new uxb((snc) this.a.bE.get());
            case 172:
                return axvt.a.get().b(this.a.b.a);
            case 173:
                return Boolean.valueOf(this.a.iC());
            case 174:
                return new uvu((amqu) this.a.bS.get());
            case 175:
                return new utg((snc) this.a.bE.get());
            case 176:
                return this.a.aS();
            case 177:
                return Boolean.valueOf(this.a.iD());
            case 178:
                return this.a.aR();
            case 179:
                return this.a.hg();
            case 180:
                uwe uweVar = (uwe) ((azqb) ampq.j(this.a.bV).e(usw.c)).get();
                axzl.o(uweVar);
                return uweVar;
            case 181:
                return new NativeCrashHandlerImpl(ampq.j(this.a.bW));
            case 182:
                return Boolean.valueOf(this.a.ix());
            case 183:
                return Boolean.valueOf(this.a.iE());
            case 184:
                return this.a.aT();
            case 185:
                return new akto();
            case 186:
                dyo dyoVar21 = this.a;
                return new uyi(dyoVar21.aQ(), dyoVar21.b.a, (uui) dyoVar21.bC.get(), (ankx) dyoVar21.bA.get(), axot.a(dyoVar21.bZ), axot.a(dyoVar21.ca), dyoVar21.cb, (Executor) dyoVar21.bD.get());
            case 187:
                uyb uybVar = (uyb) ((azqb) ampq.j(this.a.bY).e(usw.d)).get();
                axzl.o(uybVar);
                return uybVar;
            case 188:
                return new uyd(this.a.bZ);
            case 189:
                return axvz.a.get().a(this.a.b.a);
            case 190:
                return this.a.he();
            case 191:
                uvv uvvVar = new uvv();
                uvvVar.a = 2097152;
                uvvVar.b = 30000;
                uvvVar.c = 5000;
                uvvVar.d = 1000;
                uvvVar.e = Double.valueOf(5.0d);
                uvvVar.f = 1;
                Integer num4 = uvvVar.a;
                if (num4 != null && uvvVar.b != null && uvvVar.c != null && uvvVar.d != null && uvvVar.e != null) {
                    return new uvw(num4.intValue(), uvvVar.b.intValue(), uvvVar.c.intValue(), uvvVar.d.intValue(), uvvVar.e.doubleValue());
                }
                StringBuilder sb9 = new StringBuilder();
                if (uvvVar.f == 0) {
                    sb9.append(" enablement");
                }
                if (uvvVar.a == null) {
                    sb9.append(" maxBufferSizeBytes");
                }
                if (uvvVar.b == null) {
                    sb9.append(" sampleDurationMs");
                }
                if (uvvVar.c == null) {
                    sb9.append(" sampleDurationSkewMs");
                }
                if (uvvVar.d == null) {
                    sb9.append(" sampleFrequencyMicro");
                }
                if (uvvVar.e == null) {
                    sb9.append(" samplesPerEpoch");
                }
                String valueOf5 = String.valueOf(sb9);
                StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf5).length() + 28);
                sb10.append("Missing required properties:");
                sb10.append(valueOf5);
                throw new IllegalStateException(sb10.toString());
            case 192:
                return axvn.a.get().a(this.a.b.a);
            case 193:
                return this.a.hf();
            case 194:
                uzf c = uzg.c();
                avfd avfdVar = ((akwr) this.a.bt.get()).get().e;
                if (avfdVar == null) {
                    avfdVar = avfd.a;
                }
                c.b(avfdVar.e);
                return c.a();
            case 195:
                dyo dyoVar22 = this.a;
                return new uzi(dyoVar22.aQ(), dyoVar22.b.a, (uui) dyoVar22.bC.get(), (Executor) dyoVar22.bD.get(), axot.a(dyoVar22.ce), new uzz(dyoVar22.b.a, (snc) dyoVar22.bE.get(), dyoVar22.bJ), dyoVar22.cf);
            case 196:
                uzg uzgVar = (uzg) ((azqb) ampq.j(this.a.cd).e(usw.e)).get();
                axzl.o(uzgVar);
                return uzgVar;
            case 197:
                return axwf.a.get().a(this.a.b.a);
            case 198:
                uzk c2 = uzl.c();
                avfd avfdVar2 = ((akwr) this.a.bt.get()).get().e;
                if (avfdVar2 == null) {
                    avfdVar2 = avfd.a;
                }
                c2.b(avfdVar2.o);
                return c2.a();
            case 199:
                dyo dyoVar23 = this.a;
                return new uzw(dyoVar23.aQ(), (ankx) dyoVar23.bA.get(), axot.a(dyoVar23.ci), axot.a(dyoVar23.cj), dyoVar23.ck, dyoVar23.aW());
            default:
                throw new AssertionError(i);
        }
    }
}
