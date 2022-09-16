package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.support.constraint.ConstraintLayout;
import android.util.Pair;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.CaptioningManager;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.window.java.layout.WindowInfoRepositoryCallbackAdapter;
import androidx.window.layout.WindowInfoRepository;
import com.google.android.apps.youtube.app.common.ads.WatchLayoutStateMonitor;
import com.google.android.apps.youtube.app.common.command.modal.ModalDialogController;
import com.google.android.apps.youtube.app.common.endpoint.LoggingUrlsPingController;
import com.google.android.apps.youtube.app.common.inappupdate.DefaultInAppUpdateController;
import com.google.android.apps.youtube.app.common.notification.NotificationOsSettingEntityController;
import com.google.android.apps.youtube.app.common.player.PlaybackLifecycleMonitor;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBarWrapper;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.apps.youtube.app.common.playervideoviewlayoutdelegate.PlayerVideoViewLayoutDelegateController;
import com.google.android.apps.youtube.app.common.subscriptions.controller.SubscriptionNotificationOptionsDialogFragmentControllerImpl;
import com.google.android.apps.youtube.app.common.tvfilm.RentalActivationOverlay;
import com.google.android.apps.youtube.app.common.tvfilm.TrailerOverlayPresenter;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateLifecycleController;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerLayoutDelegate;
import com.google.android.apps.youtube.app.common.ui.inline.LoopController;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneFragmentOrientationLocker;
import com.google.android.apps.youtube.app.common.ui.pip.NoOpPipController;
import com.google.android.apps.youtube.app.common.ui.pip.PipObserver;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
import com.google.android.apps.youtube.app.common.ui.systemui.PipWindowInsetsHelper;
import com.google.android.apps.youtube.app.common.ui.theme.elements.ThemeStoreLifecycleController;
import com.google.android.apps.youtube.app.common.ui.tooltip.TooltipPlayerResponseMonitor;
import com.google.android.apps.youtube.app.common.ui.tooltip.TooltipPlayerViewModeMonitor;
import com.google.android.apps.youtube.app.common.util.NfcHelper;
import com.google.android.apps.youtube.app.extensions.livecreation.MainLiveCreationActivity;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity;
import com.google.android.apps.youtube.app.extensions.reel.edit.activity.ReelCameraActivity;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelSnackbarController;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivity;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivityCaptionsLifecycleObserver;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivityLifecycleObserver;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelPlaybackErrorLogger;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import com.google.android.apps.youtube.app.mdx.MdxOverlaysPresenter;
import com.google.android.apps.youtube.app.mdx.WatchOnTvMenuItem;
import com.google.android.apps.youtube.app.offline.OfflineModeChangedMealbarController;
import com.google.android.apps.youtube.app.offline.OfflineModeChangedRefreshController;
import com.google.android.apps.youtube.app.offline.controller.OfflineSlimStatusBarConnectivityController;
import com.google.android.apps.youtube.app.player.PlayerResponseServiceEndpointListener;
import com.google.android.apps.youtube.app.player.autonav.AutonavToggleController;
import com.google.android.apps.youtube.app.player.controls.MusicDeeplinkMenuItemController;
import com.google.android.apps.youtube.app.player.controls.ReportVideoController;
import com.google.android.apps.youtube.app.player.controls.SingleLoopMenuItemController;
import com.google.android.apps.youtube.app.player.infocards.YouTubeInfoCardOverlayPresenter;
import com.google.android.apps.youtube.app.player.overlay.InteractiveInlineMutedControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.MiniPlayerErrorOverlay;
import com.google.android.apps.youtube.app.player.overlay.NoSoundMemoOverlay;
import com.google.android.apps.youtube.app.player.overlay.PipPaidProductBadgeOverlay;
import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.YouTubeInlineAdOverlay;
import com.google.android.apps.youtube.app.player.overlay.accessibility.TimebarAccessibilityController;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
import com.google.android.apps.youtube.app.ui.MultiPageMenuDialogFragmentController;
import com.google.android.apps.youtube.app.ui.PlaylistEditToastController;
import com.google.android.apps.youtube.app.ui.WatchUpsellDialogController;
import com.google.android.apps.youtube.app.ui.YpcOffersListDialogFragmentController;
import com.google.android.apps.youtube.app.ui.actionbar.ElevatedAppBarLayout;
import com.google.android.apps.youtube.app.ui.inline.DefaultInlinePlayerControls;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import com.google.android.apps.youtube.app.ui.presenter.DismissalFollowUpDialogFragmentController;
import com.google.android.apps.youtube.app.watch.bottomsheet.PlayerOverflowBottomSheetController;
import com.google.android.apps.youtube.app.watch.engagementpanel.MainAppEngagementPanelDataProvider;
import com.google.android.apps.youtube.app.watch.engagementpanel.WatchEngagementPanelViewContainerController;
import com.google.android.apps.youtube.app.watch.navigation.WatchHistoryPreviousNextController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.VideoStageMonitor;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.FullscreenExitController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.UpForFullController;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.apps.youtube.app.watch.playback.SingleLoopPlaybackMonitor;
import com.google.android.apps.youtube.app.watch.playback.WatchResponseCoordinator;
import com.google.android.apps.youtube.app.watchwhile.StartupSignalStream;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import com.google.android.apps.youtube.app.webviewfallback.WebViewFallbackActivity;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import com.google.android.libraries.youtube.comment.endpoint.ChangeCommentsMarkersVisibilityCommandHelper;
import com.google.android.libraries.youtube.commerce.red.entity.LayerableFilterEntityController;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioSelectionActivity;
import com.google.android.libraries.youtube.edit.gallery.GalleryActivity;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInControllerImpl;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.libraries.youtube.player.features.markers.sync.NoOpTimedSyncObserver;
import com.google.android.libraries.youtube.player.features.markers.sync.TimedSyncObserverImpl;
import com.google.android.libraries.youtube.player.features.mediacontroller.VolumeControlsManager;
import com.google.android.libraries.youtube.player.features.overlay.live.LiveOverlayPresenter;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import com.google.android.youtube.R;
import com.google.apps.tiktok.concurrent.futuresmixin.FuturesMixinImpl;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protos.youtube.api.innertube.RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint;
import com.google.protos.youtube.api.innertube.RunAttestationCommandOuterClass$RunAttestationCommand;
import com.google.protos.youtube.api.innertube.ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.Supplier;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.NetError;
import org.chromium.net.PrivateKeyType;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dwp  reason: default package */
/* loaded from: classes3.dex */
public final class dwp implements azqb {
    private final dwq a;
    private final int b;

    public dwp(dwq dwqVar, int i) {
        this.a = dwqVar;
        this.b = i;
    }

    private final Object i() {
        int i = this.b;
        switch (i) {
            case 500:
                dwq dwqVar = this.a;
                vxp vxpVar = (vxp) dwqVar.fZ.get();
                vxpVar.i(dwqVar.cx());
                axzl.o(vxpVar);
                return vxpVar;
            case 501:
                dwq dwqVar2 = this.a;
                return new vxp((dt) dwqVar2.s.get(), (yni) dwqVar2.a.y.get(), (srv) dwqVar2.fC.get(), dwqVar2.a.cI(), (aadd) dwqVar2.a.K.get());
            case 502:
                dwq dwqVar3 = this.a;
                vxp vxpVar2 = (vxp) dwqVar3.fZ.get();
                fqd fqdVar = (fqd) dwqVar3.I.get();
                fqdVar.g(new ohs(vxpVar2, 1));
                fqdVar.f(new ohq(vxpVar2, 1));
                if (fqdVar.b) {
                    vxpVar2.f();
                }
                axzl.o(vxpVar2);
                return vxpVar2;
            case 503:
                dwq dwqVar4 = this.a;
                vxp vxpVar3 = (vxp) dwqVar4.fZ.get();
                fqd fqdVar2 = (fqd) dwqVar4.I.get();
                fqdVar2.g(new ohs(vxpVar3));
                fqdVar2.f(new ohq(vxpVar3));
                if (fqdVar2.b) {
                    vxpVar3.f();
                }
                axzl.o(vxpVar3);
                return vxpVar3;
            case 504:
                return this.a.ft();
            case 505:
                return this.a.lf();
            case 506:
                return this.a.cC();
            case 507:
                return this.a.le();
            case 508:
                return this.a.Q();
            case 509:
                return this.a.bl();
            case 510:
                return this.a.hj();
            case 511:
                return this.a.kS();
            case 512:
                return this.a.kX();
            case 513:
                return this.a.iw();
            case 514:
                return this.a.T();
            case 515:
                return this.a.kM();
            case 516:
                return this.a.fF();
            case 517:
                return this.a.kY();
            case 518:
                return new xna();
            case 519:
                return this.a.fN();
            case 520:
                dwq dwqVar5 = this.a;
                return new gnm(dwqVar5.gc, (airr) dwqVar5.a.fO.get());
            case 521:
                return this.a.fG();
            case 522:
                dwq dwqVar6 = this.a;
                return new xoa((xli) dwqVar6.gh.get(), (acth) dwqVar6.L.get());
            case 523:
                return this.a.fI();
            case 524:
                return this.a.h();
            case 525:
                return new xyc();
            case 526:
                return this.a.fH();
            case 527:
                return new xxx((ajqa) this.a.a.mq.get());
            case 528:
                return new xkb();
            case 529:
                return this.a.fQ();
            case 530:
                return this.a.fP();
            case 531:
                return this.a.fO();
            case 532:
                return this.a.bm();
            case 533:
                return new kql((dt) this.a.s.get());
            case 534:
                return this.a.bn();
            case 535:
                dwq dwqVar7 = this.a;
                return new gjc((yrj) dwqVar7.a.as.get(), (lmo) dwqVar7.a.jc.get(), new lnd(dwqVar7.f, dwqVar7.dy, dwqVar7.H, dwqVar7.gj, dwqVar7.a.y));
            case 536:
                return this.a.hM();
            case 537:
                dwq dwqVar8 = this.a;
                return new epm((aaub) dwqVar8.a.yf.get(), (yzj) dwqVar8.a.je.get(), (aafo) dwqVar8.H.get(), (Executor) dwqVar8.a.x.get(), (dt) dwqVar8.s.get());
            case 538:
                dwq dwqVar9 = this.a;
                return new glb(dwqVar9.a(), (abdu) dwqVar9.a.wk.get(), (yni) dwqVar9.a.y.get(), (Executor) dwqVar9.a.x.get(), (akys) dwqVar9.a.mY.get());
            case 539:
                return new epn(this.a.aS());
            case 540:
                return new gjg((jxn) this.a.a.f15if.get(), 1);
            case 541:
                return new ajhe((ajgz) this.a.cA.get());
            case 542:
                dwq dwqVar10 = this.a;
                return new eps((aavu) dwqVar10.a.yg.get(), (yzj) dwqVar10.a.je.get(), (aafo) dwqVar10.H.get());
            case 543:
                dwq dwqVar11 = this.a;
                return new akmf((aaun) dwqVar11.a.xW.get(), (yzj) dwqVar11.a.je.get(), (aafo) dwqVar11.H.get(), (ajqa) dwqVar11.a.mq.get(), dwqVar11.a(), (agbd) dwqVar11.a.eu.get());
            case 544:
                dwq dwqVar12 = this.a;
                return new epv(dwqVar12.a(), dwqVar12.gj(), (yni) dwqVar12.a.y.get());
            case 545:
                return new gjg((jxn) this.a.a.f15if.get());
            case 546:
                return new ahsb((ahso) this.a.a.wN.get());
            case 547:
                dwq dwqVar13 = this.a;
                return new aafz((aajg) dwqVar13.a.dM.get(), (afvn) dwqVar13.a.au.get());
            case 548:
                dwq dwqVar14 = this.a;
                return new gjo((mrx) dwqVar14.dO.get(), (aath) dwqVar14.a.kn.get(), (acth) dwqVar14.L.get(), (Executor) dwqVar14.a.x.get());
            case 549:
                dwq dwqVar15 = this.a;
                return new aawm(dwqVar15.a(), (aawn) dwqVar15.a.yd.get(), (yzj) dwqVar15.a.je.get(), (aafo) dwqVar15.H.get());
            case 550:
                dwq dwqVar16 = this.a;
                return new epy(dwqVar16.gn, (ibm) dwqVar16.gr.get());
            case 551:
                dwq dwqVar17 = this.a;
                return new ReportVideoController(dwqVar17.a(), (yrj) dwqVar17.a.as.get(), (afvn) dwqVar17.a.au.get(), (yzj) dwqVar17.a.je.get(), (afwc) dwqVar17.a.vo.get(), dwqVar17.iu(), (jyh) dwqVar17.gl.get(), (jyn) dwqVar17.gm.get(), (yni) dwqVar17.a.y.get(), (airw) dwqVar17.n.get(), (aacz) dwqVar17.a.D.get());
            case 552:
                dwq dwqVar18 = this.a;
                return new jyh(dwqVar18.a(), (aafo) dwqVar18.H.get(), dwqVar18.gk);
            case 553:
                return this.a.jc();
            case 554:
                dwq dwqVar19 = this.a;
                return new jyn(dwqVar19.ir(), (ajuw) dwqVar19.cy.get(), dwqVar19.iN());
            case 555:
                dwq dwqVar20 = this.a;
                ibm ibmVar = (ibm) ((azqb) Map.EL.getOrDefault(amup.k(ReelWatchActivity.class, dwqVar20.gq), dwqVar20.a().getClass(), ecp.k)).get();
                axzl.o(ibmVar);
                return ibmVar;
            case 556:
                return new hwx(this.a.gp);
            case 557:
                dwq dwqVar21 = this.a;
                aacz aaczVar = (aacz) dwqVar21.a.D.get();
                aadd aaddVar = (aadd) dwqVar21.a.K.get();
                dt dtVar = (dt) dwqVar21.s.get();
                ypf gk = dwqVar21.gk();
                hxd hxdVar = hxd.a;
                final SfvAudioItemPlaybackController sfvAudioItemPlaybackController = (SfvAudioItemPlaybackController) dwqVar21.go.get();
                amup l = amup.l(ReelWatchEndpointOuterClass$ReelWatchEndpoint.class, hxdVar, apnv.class, new gtp() { // from class: hxc
                    @Override // defpackage.gtp
                    public final dp a(apzg apzgVar, Bundle bundle) {
                        SfvAudioItemPlaybackController sfvAudioItemPlaybackController2 = SfvAudioItemPlaybackController.this;
                        guo aG = guo.aG(apzgVar);
                        aG.X.c(sfvAudioItemPlaybackController2);
                        return aG;
                    }
                });
                azqb azqbVar = dwqVar21.L;
                aqxo.q(true, "Invalid resource identifier: 0");
                return new gtm(aaczVar, aaddVar, dtVar, gk, l, azqbVar, (snc) dwqVar21.a.v.get(), (ayor) dwqVar21.a.iz.get());
            case 558:
                dwq dwqVar22 = this.a;
                Activity a = dwqVar22.a();
                airw fk = dwqVar22.a.fk();
                azqb azqbVar2 = dwqVar22.a.dD;
                ayor a2 = azpj.a();
                axzl.o(a2);
                return new SfvAudioItemPlaybackController(a, fk, azqbVar2, a2, dwqVar22.hb(), (Executor) dwqVar22.a.h.get(), (Executor) dwqVar22.a.x.get(), (acvh) dwqVar22.a.ef.get(), (acth) dwqVar22.L.get());
            case 559:
                return new exv(this.a.ck, 12, (boolean[][]) null);
            case 560:
                dwq dwqVar23 = this.a;
                return new gml((xfc) dwqVar23.a.ss.get(), (wzb) dwqVar23.a.sq.get(), (aafo) dwqVar23.H.get());
            case 561:
                dwq dwqVar24 = this.a;
                return new gjr(dwqVar24.a(), (abar) dwqVar24.a.yh.get(), (aafo) dwqVar24.H.get(), (Executor) dwqVar24.a.x.get(), (ajmy) dwqVar24.a.kC.get(), (acth) dwqVar24.L.get());
            case 562:
                dwq dwqVar25 = this.a;
                dyo dyoVar = dwqVar25.a;
                return new gne((aagi) dwqVar25.a.dD.get(), (snc) dwqVar25.a.v.get(), (xfc) dwqVar25.a.ss.get(), (wzb) dwqVar25.a.sq.get(), dyoVar.st, dyoVar.ue);
            case 563:
                dwq dwqVar26 = this.a;
                return new gou(dwqVar26.a(), (ajmy) dwqVar26.a.kC.get(), (aafo) dwqVar26.H.get(), dwqVar26.a.cI(), (ajxz) dwqVar26.a.lV.get(), (ajgz) dwqVar26.cA.get());
            case 564:
                return new epz((was) this.a.gs.get());
            case 565:
                dwq dwqVar27 = this.a;
                yni yniVar = (yni) dwqVar27.a.y.get();
                fqd fqdVar3 = (fqd) dwqVar27.I.get();
                wan wanVar = new wan((dt) dwqVar27.s.get(), (aafo) dwqVar27.H.get());
                fqdVar3.g(new oht(wanVar));
                fqdVar3.f(new ohu(wanVar));
                if (fqdVar3.b) {
                    wanVar.f();
                }
                return wanVar;
            case 566:
                dwq dwqVar28 = this.a;
                return new abbs((abbu) dwqVar28.a.yi.get(), dwqVar28.gt, (Executor) dwqVar28.a.x.get());
            case 567:
                dwq dwqVar29 = this.a;
                return new xnc((ajuw) dwqVar29.cy.get(), (yzj) dwqVar29.a.je.get(), dwqVar29.iN());
            case 568:
                dwq dwqVar30 = this.a;
                return new kph((dt) dwqVar30.s.get(), (afvn) dwqVar30.a.au.get(), (afwc) dwqVar30.a.vo.get(), (yzj) dwqVar30.a.je.get(), (axwo) dwqVar30.a.wJ.get());
            case 569:
                dwq dwqVar31 = this.a;
                return new gjt((abdm) dwqVar31.a.yj.get(), (HatsController) dwqVar31.gu.get(), (Executor) dwqVar31.a.x.get(), (acth) dwqVar31.L.get());
            case 570:
                dwq dwqVar32 = this.a;
                return new gmm(dwqVar32.gj(), (aafo) dwqVar32.a.jd.get(), dwqVar32.a.b.a);
            case 571:
                return new gnx((yni) this.a.a.y.get(), 11, (int[][]) null);
            case 572:
                return new gnx((yni) this.a.a.y.get(), 12, (boolean[][]) null);
            case 573:
                return new exv(this.a.gw, 2, (byte[]) null);
            case 574:
                return new luk((fzo) this.a.gv.get());
            case 575:
                dwq dwqVar33 = this.a;
                return new fzo(dwqVar33.a(), (acth) dwqVar33.L.get(), (fyx) dwqVar33.a.iA.get());
            case 576:
                dwq dwqVar34 = this.a;
                return new mcy((mcj) dwqVar34.bG.get(), (acth) dwqVar34.L.get(), dwqVar34.H);
            case 577:
                dwq dwqVar35 = this.a;
                return new gnj((acth) dwqVar35.L.get(), (aafo) dwqVar35.aI.get(), 1);
            case 578:
                dwq dwqVar36 = this.a;
                return new iwh((adoa) dwqVar36.a.jq.get(), dwqVar36.im(), (yzj) dwqVar36.a.je.get(), dwqVar36.a.b.a, dwqVar36.in());
            case 579:
                dwq dwqVar37 = this.a;
                return new eqb(dwqVar37.a(), (niw) dwqVar37.ab.get(), dwqVar37.ir(), (ezi) dwqVar37.aE.get(), (aadd) dwqVar37.a.K.get());
            case 580:
                dwq dwqVar38 = this.a;
                return new eqj((dt) dwqVar38.s.get(), (yni) dwqVar38.a.y.get(), (aaxt) dwqVar38.a.jG.get(), (yzj) dwqVar38.a.je.get(), (afwc) dwqVar38.a.vo.get(), (afvn) dwqVar38.a.au.get(), (aafo) dwqVar38.H.get(), (aadd) dwqVar38.a.K.get(), (aagi) dwqVar38.a.dD.get(), (Executor) dwqVar38.a.x.get());
            case 581:
                dwq dwqVar39 = this.a;
                return new abjk((aaza) dwqVar39.a.xo.get(), (abha) dwqVar39.cj.get(), (yzj) dwqVar39.a.je.get(), (Executor) dwqVar39.a.x.get(), 1);
            case 582:
                dwq dwqVar40 = this.a;
                return new iui(dwqVar40.a(), (aafo) dwqVar40.H.get());
            case 583:
                dwq dwqVar41 = this.a;
                return new abwd(dwqVar41.a(), (abie) dwqVar41.cB.get(), dwqVar41.hk());
            case 584:
                dwq dwqVar42 = this.a;
                return new abji(dwqVar42.a(), (afvn) dwqVar42.a.au.get(), (afwc) dwqVar42.a.vo.get());
            case 585:
                dwq dwqVar43 = this.a;
                dyo dyoVar2 = dwqVar43.a;
                return new eqk((agvq) dwqVar43.a.hf.get(), dyoVar2.gS, (agxa) dyoVar2.yl.get());
            case 586:
                return new yau((acrr) this.a.a.aw.get());
            case 587:
                return new yav((acrr) this.a.a.aw.get());
            case 588:
                return new gkh((YpcOffersListDialogFragmentController) this.a.gx.get());
            case 589:
                dwq dwqVar44 = this.a;
                return new YpcOffersListDialogFragmentController((dt) dwqVar44.s.get(), (ajgz) dwqVar44.cA.get());
            case 590:
                dwq dwqVar45 = this.a;
                return new gmo((aagi) dwqVar45.a.dD.get(), (snc) dwqVar45.a.v.get());
            case 591:
                dwq dwqVar46 = this.a;
                return gad.c((dt) dwqVar46.s.get(), (aafo) dwqVar46.H.get(), (ajxz) dwqVar46.a.lV.get(), dwqVar46.iI(), (ltu) dwqVar46.gy.get(), (acth) dwqVar46.L.get(), (aakn) dwqVar46.a.wx.get(), (lmm) dwqVar46.a.wy.get(), (ajgz) dwqVar46.cA.get());
            case 592:
                ltu aJ = ((ndm) this.a.ag.get()).aJ();
                axzl.o(aJ);
                return aJ;
            case 593:
                dwq dwqVar47 = this.a;
                dyo dyoVar3 = dwqVar47.a;
                gad.l();
                return new iwt((adgc) dwqVar47.a.jT.get(), dyoVar3.b.a, (adgl) dyoVar3.jS.get(), (snc) dwqVar47.a.v.get(), dwqVar47.a.dl(), dwqVar47.a.di(), (ankx) dwqVar47.a.w.get(), (yni) dwqVar47.a.y.get(), (aafo) dwqVar47.H.get(), (eo) dwqVar47.t.get(), (bgo) dwqVar47.a.jC.get(), (dt) dwqVar47.s.get(), (fvf) dwqVar47.bf.get(), (adoa) dwqVar47.a.jq.get(), dwqVar47.ir(), (amfg) dwqVar47.a.ym.get(), null, null);
            case 594:
                dwq dwqVar48 = this.a;
                return new abjm((aaza) dwqVar48.a.xo.get(), (abha) dwqVar48.cj.get(), (yzj) dwqVar48.a.je.get());
            case 595:
                dwq dwqVar49 = this.a;
                return new abjk((aaza) dwqVar49.a.xo.get(), (abha) dwqVar49.cj.get(), (yzj) dwqVar49.a.je.get(), (Executor) dwqVar49.a.x.get());
            case 596:
                return new eqm((ModalDialogController) this.a.gz.get());
            case 597:
                dwq dwqVar50 = this.a;
                return new ModalDialogController(dwqVar50.a(), dwqVar50.iO(), (acth) dwqVar50.L.get(), dwqVar50.iV(), dwqVar50.ir());
            case 598:
                dwq dwqVar51 = this.a;
                dyo dyoVar4 = dwqVar51.a;
                return new fnx(dyoVar4.b.a, (abab) dyoVar4.mp.get(), dwqVar51.H, (yzj) dwqVar51.a.je.get(), (ajqa) dwqVar51.a.mq.get(), (agbd) dwqVar51.a.eu.get(), (Executor) dwqVar51.a.x.get());
            case 599:
                dwq dwqVar52 = this.a;
                return new gkk(new lqb(dwqVar52.a(), (ajmy) dwqVar52.a.kC.get(), (aafo) dwqVar52.H.get(), (acth) dwqVar52.L.get(), (gts) dwqVar52.a.me.get()));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        int i = this.b;
        switch (i) {
            case 200:
                return new aiba(this.a.a());
            case 201:
                dwq dwqVar = this.a;
                return new InteractiveInlineMutedControlsOverlay(dwqVar.a(), dwqVar.bD, (InlinePlaybackController) dwqVar.bL.get(), (InlinePlaybackLifecycleController) dwqVar.x.get(), (aadd) dwqVar.a.K.get(), (aacz) dwqVar.a.D.get(), (SubtitleButtonController) dwqVar.bM.get(), (acth) dwqVar.L.get(), (aihr) dwqVar.a.xn.get(), (ahwz) dwqVar.aT.get(), (aign) dwqVar.aH.get(), (kce) dwqVar.bP.get(), dwqVar.iu(), (ViewGroup) dwqVar.bQ.get(), (ViewGroup) dwqVar.bR.get(), (airw) dwqVar.n.get(), (mcz) dwqVar.a.lG.get(), (acrr) dwqVar.a.aw.get(), dwqVar.m284do(), (axwt) dwqVar.a.nN.get());
            case 202:
                return this.a.ek();
            case 203:
                return new mcl(this.a.bE);
            case 204:
                zao a = ((emo) this.a.ab.get()).a();
                axzl.o(a);
                return a;
            case 205:
                dwq dwqVar2 = this.a;
                return new mcj((aadd) dwqVar2.a.K.get(), dwqVar2.ir(), (InlinePlaybackLifecycleController) dwqVar2.x.get(), (Handler) dwqVar2.a.an.get(), (ActiveStateLifecycleController) dwqVar2.bF.get());
            case 206:
                return this.a.aJ();
            case 207:
                dwq dwqVar3 = this.a;
                return new mdk((ezh) dwqVar3.A.get(), (InlinePlaybackLifecycleController) dwqVar3.x.get());
            case 208:
                dwq dwqVar4 = this.a;
                return new mcn((fyy) dwqVar4.am.get(), (InlinePlaybackLifecycleController) dwqVar4.x.get(), (ScrollSelectionController) dwqVar4.m.get(), (Handler) dwqVar4.a.an.get());
            case 209:
                return this.a.eh();
            case 210:
                return this.a.cT();
            case 211:
                return this.a.eg();
            case 212:
                return this.a.ei();
            case 213:
                dwq dwqVar5 = this.a;
                return new euc((yni) dwqVar5.a.y.get(), (aadd) dwqVar5.a.K.get());
            case 214:
                return this.a.af();
            case 215:
                dwq dwqVar6 = this.a;
                return new LoopController(dwqVar6.bJ, dwqVar6.bK, (InlinePlaybackLifecycleController) dwqVar6.x.get());
            case 216:
                ahvz p = this.a.dB().p();
                axzl.o(p);
                return p;
            case 217:
                return this.a.dB();
            case 218:
                return this.a.ds();
            case 219:
                return this.a.dj();
            case 220:
                return azpm.e().aO();
            case 221:
                return new koo(this.a.a());
            case 222:
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.a.a()).inflate(R.layout.inline_muted_time_bar_overlay, (ViewGroup) null);
                axzl.o(viewGroup);
                return viewGroup;
            case 223:
                ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(this.a.a()).inflate(R.layout.inline_muted_scrim_overlay, (ViewGroup) null);
                axzl.o(viewGroup2);
                return viewGroup2;
            case 224:
                dwq dwqVar7 = this.a;
                return new jxc(dwqVar7.a(), (ajmy) dwqVar7.a.kC.get(), (aadd) dwqVar7.a.K.get(), (fgc) dwqVar7.bv.get(), (feh) dwqVar7.aV.get(), (jwo) dwqVar7.bS.get());
            case 225:
                return this.a.kw();
            case 226:
                Activity a2 = this.a.a();
                return new ivs(a2, a2.getResources().getDimensionPixelSize(R.dimen.mdx_playing_on_tv_padding));
            case 227:
                return this.a.id();
            case 228:
                return new kaa(this.a.a());
            case 229:
                return this.a.gz();
            case 230:
                return new fpm(this.a.a());
            case 231:
                dwq dwqVar8 = this.a;
                return new RentalActivationOverlay(dwqVar8.a(), (ezh) dwqVar8.A.get());
            case 232:
                dwq dwqVar9 = this.a;
                return new YouTubeInlineAdOverlay(dwqVar9.a(), (ghd) dwqVar9.ay.get(), (acti) dwqVar9.au.get(), (ajmy) dwqVar9.a.kC.get(), (ezh) dwqVar9.A.get(), (aafo) dwqVar9.aI.get(), (wzx) dwqVar9.a.sk.get(), (aizb) dwqVar9.ao.get(), dwqVar9.iV(), (ken) dwqVar9.bZ.get(), (ImageView) dwqVar9.ca.get(), (aice) dwqVar9.cb.get(), (yni) dwqVar9.a.y.get(), (aadd) dwqVar9.a.K.get());
            case 233:
                return new ken((ajmy) this.a.a.kC.get());
            case 234:
                ImageView imageView = (ImageView) LayoutInflater.from(this.a.a()).inflate(R.layout.youtube_controls_overlay_ad_overflow_menu_button, (ViewGroup) null);
                imageView.setVisibility(8);
                axzl.o(imageView);
                return imageView;
            case 235:
                ket ketVar = ((YouTubeControlsOverlay) this.a.by.get()).q;
                axzl.o(ketVar);
                return ketVar;
            case 236:
                dwq dwqVar10 = this.a;
                return new kkz(dwqVar10.a(), (ajmy) dwqVar10.a.kC.get(), ((YouTubeControlsOverlay) dwqVar10.by.get()).z(), dwqVar10.am());
            case 237:
                dwq dwqVar11 = this.a;
                return new kkv(dwqVar11.a(), axot.a(dwqVar11.cd), dwqVar11.iz(), (aafo) dwqVar11.aI.get(), ((YouTubeControlsOverlay) dwqVar11.by.get()).z());
            case 238:
                return this.a.iF();
            case 239:
                dwq dwqVar12 = this.a;
                return new klx(dwqVar12.a(), (ahzv) dwqVar12.by.get(), (Handler) dwqVar12.a.an.get());
            case 240:
                dwq dwqVar13 = this.a;
                Activity a3 = dwqVar13.a();
                ajmr ajmrVar = (ajmr) dwqVar13.a.kz.get();
                ((YouTubeControlsOverlay) dwqVar13.by.get()).z();
                return new xfz(a3);
            case 241:
                return new ivx(this.a.a());
            case 242:
                dwq dwqVar14 = this.a;
                return new jxf(dwqVar14.a(), (adoa) dwqVar14.a.jq.get());
            case 243:
                dwq dwqVar15 = this.a;
                swq kz = dwqVar15.kz();
                dwqVar15.fr();
                return new iuq(dwqVar15.f(), dwqVar15.ck, (ajyi) dwqVar15.cx.get(), dwqVar15.cB, dwqVar15.iK(), (abhz) dwqVar15.cC.get(), dwqVar15.hr(), dwqVar15.hs(), dwqVar15.hk(), (ayom) dwqVar15.cY.get(), kz, (ajjr) dwqVar15.a.dU.get(), (tdu) dwqVar15.a.xx.get(), dwqVar15.aL);
            case 244:
                return this.a.aV();
            case 245:
                gfs gfsVar = gfs.DARK;
                axzl.o(gfsVar);
                return gfsVar;
            case 246:
                gfs gfsVar2 = gfs.DARK;
                axzl.o(gfsVar2);
                return gfsVar2;
            case 247:
                dwq dwqVar16 = this.a;
                dyo dyoVar = dwqVar16.a;
                azqb azqbVar = dyoVar.by;
                azqb azqbVar2 = dyoVar.xo;
                azqb azqbVar3 = dyoVar.xp;
                azqb azqbVar4 = dyoVar.lZ;
                azqb azqbVar5 = dyoVar.y;
                azqb azqbVar6 = dyoVar.fO;
                azqb azqbVar7 = dyoVar.je;
                azqb azqbVar8 = dyoVar.an;
                azqb azqbVar9 = dyoVar.xq;
                azqb azqbVar10 = dyoVar.xr;
                azqb azqbVar11 = dwqVar16.cg;
                azqb azqbVar12 = dwqVar16.ch;
                azqb azqbVar13 = dwqVar16.bb;
                azqb azqbVar14 = dyoVar.dD;
                azqb azqbVar15 = dwqVar16.ci;
                azqbVar.getClass();
                azqbVar2.getClass();
                azqbVar3.getClass();
                azqbVar5.getClass();
                azqbVar6.getClass();
                azqbVar7.getClass();
                azqbVar8.getClass();
                azqbVar9.getClass();
                azqbVar10.getClass();
                azqbVar11.getClass();
                azqbVar12.getClass();
                azqbVar13.getClass();
                azqbVar14.getClass();
                azqbVar15.getClass();
                return abir.a((abha) dwqVar16.cj.get(), dwqVar16.a.cI(), (acth) dwqVar16.L.get(), azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, azqbVar13, azqbVar14, azqbVar15);
            case 248:
                return new abic((Handler) this.a.a.an.get());
            case 249:
                dwq dwqVar17 = this.a;
                dwqVar17.a();
                return new abiy((Handler) dwqVar17.a.an.get());
            case 250:
                return this.a.hl();
            case 251:
                dwq dwqVar18 = this.a;
                return new abha((aafo) dwqVar18.H.get(), (acth) dwqVar18.L.get());
            case 252:
                dwq dwqVar19 = this.a;
                return new iuw(dwqVar19.cl, dwqVar19.cm, dwqVar19.cn, dwqVar19.co, dwqVar19.cp, dwqVar19.cq, dwqVar19.cr, dwqVar19.cs, dwqVar19.ct, dwqVar19.cu, dwqVar19.cv, dwqVar19.cw);
            case 253:
                dwq dwqVar20 = this.a;
                return new acmg(dwqVar20.a(), (ajmy) dwqVar20.a.kC.get(), (ajxz) dwqVar20.a.lV.get(), (aafo) dwqVar20.H.get(), (afvn) dwqVar20.a.au.get(), (ajvm) dwqVar20.a.xs.get(), (abkl) dwqVar20.a.xr.get(), dwqVar20.hk(), dwqVar20.gq());
            case 254:
                dwq dwqVar21 = this.a;
                return new acmc(dwqVar21.a(), (ajmy) dwqVar21.a.kC.get());
            case PrivateKeyType.INVALID /* 255 */:
                dwq dwqVar22 = this.a;
                return new acmd(dwqVar22.f(), (aafo) dwqVar22.H.get(), (ajxz) dwqVar22.a.lV.get());
            case 256:
                dwq dwqVar23 = this.a;
                return new acme(dwqVar23.a(), (ajmr) dwqVar23.a.kz.get(), (acth) dwqVar23.L.get(), (aafo) dwqVar23.H.get(), (ajvm) dwqVar23.a.xs.get(), (ajxz) dwqVar23.a.lV.get(), dwqVar23.hl());
            case 257:
                dwq dwqVar24 = this.a;
                return new acmf(dwqVar24.ck, dwqVar24.f(), (aafo) dwqVar24.H.get(), (ajxz) dwqVar24.a.lV.get());
            case 258:
                dwq dwqVar25 = this.a;
                return new abnr(dwqVar25.a(), (acth) dwqVar25.L.get(), (aafo) dwqVar25.H.get(), (ajmr) dwqVar25.a.kz.get());
            case 259:
                dwq dwqVar26 = this.a;
                return new abnt(dwqVar26.a(), (acth) dwqVar26.L.get(), (aafo) dwqVar26.H.get(), (ajmr) dwqVar26.a.kz.get());
            case 260:
                dwq dwqVar27 = this.a;
                return new abnq(dwqVar27.a(), (ajmr) dwqVar27.a.kz.get(), (acth) dwqVar27.L.get(), (aafo) dwqVar27.H.get(), (ajod) dwqVar27.a.kA.get(), dwqVar27.gq());
            case 261:
                dwq dwqVar28 = this.a;
                return new abns(dwqVar28.a(), (acth) dwqVar28.L.get(), (aafo) dwqVar28.H.get(), (ajmr) dwqVar28.a.kz.get());
            case 262:
                dwq dwqVar29 = this.a;
                return new abnp(dwqVar29.a(), (acth) dwqVar29.L.get(), (ajmy) dwqVar29.a.kC.get(), (ajvm) dwqVar29.a.xs.get(), (aafo) dwqVar29.H.get(), (ajxz) dwqVar29.a.lV.get());
            case 263:
                dwq dwqVar30 = this.a;
                return new abno(dwqVar30.f(), (ajmr) dwqVar30.a.kz.get(), (aafo) dwqVar30.H.get(), (acth) dwqVar30.L.get());
            case 264:
                return this.a.iy();
            case 265:
                dwq dwqVar31 = this.a;
                return new abie(dwqVar31.a(), (aafo) dwqVar31.H.get(), (ajuw) dwqVar31.cy.get(), (abha) dwqVar31.cj.get(), dwqVar31.cz, (ajgz) dwqVar31.cA.get());
            case 266:
                dwq dwqVar32 = this.a;
                Context h = dwqVar32.h();
                acsx cI = dwqVar32.a.cI();
                zhf gr = dwqVar32.gr();
                aken jc = dwqVar32.jc();
                return new ajuw(new ContextThemeWrapper(h, gr.a), (aafo) dwqVar32.H.get(), cI, jc);
            case 267:
                dwq dwqVar33 = this.a;
                Activity a4 = dwqVar33.a();
                zhf gr2 = dwqVar33.gr();
                return new ajun(new ContextThemeWrapper(a4, gr2.a), gr2, (aafo) dwqVar33.H.get());
            case 268:
                return new ajgz();
            case 269:
                dwq dwqVar34 = this.a;
                return new abhz((abha) dwqVar34.cj.get(), (aafo) dwqVar34.H.get(), (yzj) dwqVar34.a.je.get(), (ajvj) dwqVar34.a.xq.get(), (abiq) dwqVar34.ck.get(), dwqVar34.a());
            case 270:
                dwq dwqVar35 = this.a;
                return new ivc(dwqVar35.cD, dwqVar35.cE, dwqVar35.cF, dwqVar35.cG, dwqVar35.cH, dwqVar35.cI, dwqVar35.cJ, dwqVar35.cK, dwqVar35.cL, new iuy(dwqVar35.cM, dwqVar35.H, dwqVar35.ck), dwqVar35.cN, dwqVar35.cO, dwqVar35.cP, dwqVar35.cQ);
            case 271:
                dwq dwqVar36 = this.a;
                return new abny(dwqVar36.a(), (ajmy) dwqVar36.a.kC.get(), (aafo) dwqVar36.H.get(), (ajxz) dwqVar36.a.lV.get(), (ajvm) dwqVar36.a.xs.get(), (abkl) dwqVar36.a.xr.get(), dwqVar36.hk(), dwqVar36.gq());
            case 272:
                dwq dwqVar37 = this.a;
                return new abnn(dwqVar37.a(), (ajmy) dwqVar37.a.kC.get());
            case 273:
                dwq dwqVar38 = this.a;
                return new iva(dwqVar38.f(), (aafo) dwqVar38.H.get(), (ajxz) dwqVar38.a.lV.get());
            case 274:
                dwq dwqVar39 = this.a;
                return new abnu(dwqVar39.a(), (ajmr) dwqVar39.a.kz.get(), (acth) dwqVar39.L.get(), (aafo) dwqVar39.H.get(), (ajvm) dwqVar39.a.xs.get(), (ajxz) dwqVar39.a.lV.get(), dwqVar39.hl());
            case 275:
                dwq dwqVar40 = this.a;
                return new ive(dwqVar40.a(), (acth) dwqVar40.L.get(), (aafo) dwqVar40.H.get(), (ajmr) dwqVar40.a.kz.get());
            case 276:
                dwq dwqVar41 = this.a;
                return new ivf(dwqVar41.a(), (acth) dwqVar41.L.get(), (aafo) dwqVar41.H.get(), (ajmr) dwqVar41.a.kz.get());
            case 277:
                dwq dwqVar42 = this.a;
                return new abnd(dwqVar42.a(), (acth) dwqVar42.L.get(), (aafo) dwqVar42.H.get(), (ajmr) dwqVar42.a.kz.get());
            case 278:
                dwq dwqVar43 = this.a;
                return new abmr(dwqVar43.f(), (aafo) dwqVar43.H.get());
            case 279:
                dwq dwqVar44 = this.a;
                return new ivg(dwqVar44.ck, dwqVar44.f(), (aafo) dwqVar44.H.get(), (ajxz) dwqVar44.a.lV.get());
            case 280:
                return this.a.f();
            case 281:
                dwq dwqVar45 = this.a;
                return new abnv(dwqVar45.a(), (ajmr) dwqVar45.a.kz.get(), (acth) dwqVar45.L.get(), (aafo) dwqVar45.H.get(), (ajod) dwqVar45.a.kA.get(), dwqVar45.gq());
            case 282:
                dwq dwqVar46 = this.a;
                return new abmg(dwqVar46.a(), (acth) dwqVar46.L.get(), (ajmy) dwqVar46.a.kC.get(), (ajvm) dwqVar46.a.xs.get(), (aafo) dwqVar46.H.get(), (ajxz) dwqVar46.a.lV.get());
            case 283:
                dwq dwqVar47 = this.a;
                return new abnm(dwqVar47.f(), (ajmr) dwqVar47.a.kz.get(), (aafo) dwqVar47.H.get(), (acth) dwqVar47.L.get());
            case 284:
                return this.a.iz();
            case 285:
                dwq dwqVar48 = this.a;
                return new abkj(dwqVar48.a.b.a, dwqVar48.iY(), (ajyi) dwqVar48.cU.get(), (ajvj) dwqVar48.a.xq.get(), (ajxz) dwqVar48.a.lV.get(), (ajvm) dwqVar48.a.xs.get());
            case 286:
                dwq dwqVar49 = this.a;
                return new akcl(dwqVar49.cS, dwqVar49.cT);
            case 287:
                return this.a.iW();
            case 288:
                return this.a.iZ();
            case 289:
                return this.a.ja();
            case 290:
                return this.a.gq();
            case 291:
                dwq dwqVar50 = this.a;
                return new abpu(dwqVar50.f(), (abgz) dwqVar50.ck.get(), dwqVar50.ck, dwqVar50.a(), (abky) dwqVar50.a.xv.get(), (yni) dwqVar50.a.y.get(), (aafo) dwqVar50.H.get(), (abha) dwqVar50.cj.get(), dwqVar50.hq(), new akge(dwqVar50.je(), (aafo) dwqVar50.H.get(), (acth) dwqVar50.L.get()), dwqVar50.hk());
            case 292:
                return this.a.hh();
            case 293:
                return this.a.iV();
            case 294:
                dwq dwqVar51 = this.a;
                return new akcl(dwqVar51.cX, dwqVar51.cQ, 1);
            case 295:
                dwq dwqVar52 = this.a;
                return new ablx(dwqVar52.a(), (ajmy) dwqVar52.a.kC.get(), (aafo) dwqVar52.H.get(), (ajxz) dwqVar52.a.lV.get(), (ajvm) dwqVar52.a.xs.get(), (abkl) dwqVar52.a.xr.get(), dwqVar52.hk());
            case 296:
                return azpm.e().aO();
            case 297:
                dwq dwqVar53 = this.a;
                return new kke(dwqVar53.a(), (kkm) dwqVar53.da.get(), (kkq) dwqVar53.db.get(), (kkr) dwqVar53.dd.get());
            case 298:
                dwq dwqVar54 = this.a;
                return new kkm(dwqVar54.a(), (ajmy) dwqVar54.a.kC.get(), (aadd) dwqVar54.a.K.get());
            case 299:
                dwq dwqVar55 = this.a;
                return new kkq(dwqVar55.a(), (ajmy) dwqVar55.a.kC.get(), dwqVar55.am(), (aadd) dwqVar55.a.K.get());
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v419, types: [java.lang.Object, nml] */
    private final Object h() {
        int i = this.b;
        CaptioningManager captioningManager = null;
        switch (i) {
            case 400:
                dwq dwqVar = this.a;
                return new kkh((kke) dwqVar.de.get(), (aafo) dwqVar.aI.get(), (wxc) dwqVar.a.sg.get(), (acti) dwqVar.au.get(), new zgi(), (aiji) dwqVar.a.lJ.get(), (aadd) dwqVar.a.K.get());
            case 401:
                dwq dwqVar2 = this.a;
                klz klzVar = new klz((kly) dwqVar2.dh.get(), axot.a(dwqVar2.cd), dwqVar2.iz(), (acti) dwqVar2.au.get(), (tdb) dwqVar2.a.nO.get(), (kbl) dwqVar2.bh.get());
                ((aibz) dwqVar2.bs.get()).kP(klzVar);
                ((aigl) dwqVar2.aM.get()).c.a(klzVar);
                ((CreatorEndscreenOverlayPresenter) dwqVar2.eF.get()).e.add(klzVar);
                return klzVar;
            case 402:
                return this.a.J();
            case 403:
                return this.a.K();
            case 404:
                dwq dwqVar3 = this.a;
                return new ece((feh) dwqVar3.aV.get(), (yni) dwqVar3.a.y.get(), (afvn) dwqVar3.a.au.get(), (aafo) dwqVar3.H.get(), (ajqa) dwqVar3.a.mq.get(), (feb) dwqVar3.eh.get(), dwqVar3.ab, (ezh) dwqVar3.A.get());
            case 405:
                dwq dwqVar4 = this.a;
                return new fpx((feh) dwqVar4.aV.get(), (RentalActivationOverlay) dwqVar4.bY.get(), (yni) dwqVar4.a.y.get(), (airw) dwqVar4.n.get(), (aacz) dwqVar4.a.D.get());
            case 406:
                dwq dwqVar5 = this.a;
                return new ofl(dwqVar5.a(), (feh) dwqVar5.aV.get(), (ezh) dwqVar5.A.get());
            case 407:
                dwq dwqVar6 = this.a;
                return new iuv((feh) dwqVar6.aV.get(), (iuq) dwqVar6.cZ.get(), (abkg) dwqVar6.bk.get(), (aafo) dwqVar6.aI.get(), (abje) dwqVar6.eY.get(), (yni) dwqVar6.a.y.get(), (ayoi) dwqVar6.aZ.get(), (airw) dwqVar6.n.get(), (aacz) dwqVar6.a.D.get(), dwqVar6.a.cI(), dwqVar6.hk());
            case 408:
                return new abje();
            case 409:
                dwq dwqVar7 = this.a;
                return new kev((feh) dwqVar7.aV.get(), (yni) dwqVar7.a.y.get(), (ahwz) dwqVar7.aT.get(), (ezd) dwqVar7.bm.get(), (ahwo) dwqVar7.fa.get(), (kbl) dwqVar7.bh.get());
            case 410:
                return new ahwo((Vibrator) this.a.a().getSystemService("vibrator"));
            case 411:
                dwq dwqVar8 = this.a;
                return new ofk((feh) dwqVar8.aV.get(), (yni) dwqVar8.a.y.get(), dwqVar8.o, dwqVar8.bm, dwqVar8.ab);
            case 412:
                dwq dwqVar9 = this.a;
                feh fehVar = (feh) dwqVar9.aV.get();
                aafo aafoVar = (aafo) dwqVar9.aI.get();
                ntw ntwVar = (ntw) dwqVar9.dX.get();
                aias aiasVar = (aias) dwqVar9.ez.get();
                PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor = (PlaybackLoopShuffleMonitor) dwqVar9.fd.get();
                aacz aaczVar = (aacz) dwqVar9.a.D.get();
                aizu P = ((airw) dwqVar9.n.get()).P();
                axzl.o(P);
                WatchHistoryPreviousNextController watchHistoryPreviousNextController = new WatchHistoryPreviousNextController(fehVar, aafoVar, ntwVar, aiasVar, playbackLoopShuffleMonitor, aaczVar, P, (yni) dwqVar9.a.y.get(), (airw) dwqVar9.n.get(), dwqVar9.fe);
                watchHistoryPreviousNextController.c.g(watchHistoryPreviousNextController);
                return watchHistoryPreviousNextController;
            case 413:
                dwq dwqVar10 = this.a;
                return new PlaybackLoopShuffleMonitor((yni) dwqVar10.a.y.get(), (airw) dwqVar10.n.get(), (aacz) dwqVar10.a.D.get());
            case 414:
                return this.a.ip();
            case 415:
                dwq dwqVar11 = this.a;
                return new ofq((feh) dwqVar11.aV.get(), (yni) dwqVar11.a.y.get(), dwqVar11.o);
            case 416:
                dwq dwqVar12 = this.a;
                return new ofr((feh) dwqVar12.aV.get(), (ydq) dwqVar12.a.xJ.get(), dwqVar12.o, dwqVar12.H, dwqVar12.eh);
            case 417:
                dwq dwqVar13 = this.a;
                return new nwl((feh) dwqVar13.aV.get(), (ezh) dwqVar13.A.get(), (oet) dwqVar13.aF.get(), (snc) dwqVar13.a.v.get(), new nwm((yve) dwqVar13.a.xK.get()), (akfo) dwqVar13.af.get(), (apy) dwqVar13.s.get());
            case 418:
                dwq dwqVar14 = this.a;
                return new niv(dwqVar14.a(), (yni) dwqVar14.a.y.get(), (yve) dwqVar14.a.wM.get(), (feh) dwqVar14.aV.get(), dwqVar14.o, (ahso) dwqVar14.a.wN.get(), (airw) dwqVar14.n.get(), (aacz) dwqVar14.a.D.get());
            case 419:
                dwq dwqVar15 = this.a;
                Activity a = dwqVar15.a();
                aiwb it = dwqVar15.it();
                aiyx aiyxVar = (aiyx) dwqVar15.a.iS.get();
                aiau aiauVar = (aiau) dwqVar15.eI.get();
                feh fehVar2 = (feh) dwqVar15.aV.get();
                ezh ezhVar = (ezh) dwqVar15.A.get();
                if (a.getSystemService("captioning") != null) {
                    captioningManager = (CaptioningManager) a.getSystemService("captioning");
                }
                return new keh(a, captioningManager, it, aiyxVar, aiauVar, fehVar2, ezhVar);
            case 420:
                return this.a.es();
            case 421:
                dwq dwqVar16 = this.a;
                return new ahrf((acti) dwqVar16.au.get(), dwqVar16.a(), (ViewGroup) dwqVar16.dk.get(), (ajmy) dwqVar16.a.kC.get(), (aafo) dwqVar16.aI.get());
            case 422:
                dwq dwqVar17 = this.a;
                return new fzl((jvo) dwqVar17.u.get(), (aacz) dwqVar17.a.D.get(), (yni) dwqVar17.a.y.get(), dwqVar17.ao, (airw) dwqVar17.n.get(), (feh) dwqVar17.aV.get(), (ezh) dwqVar17.A.get(), (InlinePlaybackLifecycleController) dwqVar17.x.get());
            case 423:
                dwq dwqVar18 = this.a;
                return new ofp((feh) dwqVar18.aV.get(), (ezd) dwqVar18.bm.get(), (ezh) dwqVar18.A.get(), dwqVar18.aB());
            case 424:
                return new ois(this.a.fe(), gad.i());
            case 425:
                return this.a.eW();
            case 426:
                return new FullscreenExitController((ezh) this.a.A.get());
            case 427:
                dwq dwqVar19 = this.a;
                return new gcf(dwqVar19.a(), (gcc) dwqVar19.ap.get(), (ntt) dwqVar19.ax.get());
            case 428:
                dwq dwqVar20 = this.a;
                return new olu((yni) dwqVar20.a.y.get(), (ghd) dwqVar20.ay.get(), (PipWindowInsetsHelper) dwqVar20.ft.get(), (yzm) dwqVar20.B.get(), (adoa) dwqVar20.a.jq.get(), dwqVar20.ir(), (ezh) dwqVar20.A.get(), (ofs) dwqVar20.aB.get(), (aadd) dwqVar20.a.K.get(), (axxu) dwqVar20.a.hZ.get(), (ofu) dwqVar20.ak.get(), (olv) dwqVar20.fu.get());
            case 429:
                return new PipWindowInsetsHelper(this.a.A);
            case 430:
                return new olv((gbq) this.a.l.get());
            case 431:
                return new ojm();
            case 432:
                return new nfg(this.a.a.b.a);
            case 433:
                return this.a.cR();
            case 434:
                dwq dwqVar21 = this.a;
                Activity a2 = dwqVar21.a();
                afvn afvnVar = (afvn) dwqVar21.a.au.get();
                agrf agrfVar = (agrf) dwqVar21.a.gS.get();
                afwc afwcVar = (afwc) dwqVar21.a.vo.get();
                yzj yzjVar = (yzj) dwqVar21.a.je.get();
                yrj yrjVar = (yrj) dwqVar21.a.as.get();
                agvq agvqVar = (agvq) dwqVar21.a.hf.get();
                ahcz ahczVar = (ahcz) dwqVar21.fD.get();
                ahcf ahcfVar = (ahcf) dwqVar21.fD.get();
                ahcd ahcdVar = (ahcd) dwqVar21.fz.get();
                yzv yzvVar = (yzv) dwqVar21.a.jc.get();
                jpu jpuVar = (jpu) dwqVar21.fG.get();
                agvw agvwVar = (agvw) dwqVar21.a.gT.get();
                aghg aghgVar = (aghg) dwqVar21.a.lx.get();
                ahdf ahdfVar = (ahdf) dwqVar21.a.ha.get();
                jnn jnnVar = (jnn) dwqVar21.a.hf.get();
                agsd agsdVar = (agsd) dwqVar21.a.lo.get();
                pku pkuVar = (pku) dwqVar21.a.xO.get();
                return new jpl(a2, afvnVar, agrfVar, afwcVar, yzjVar, yrjVar, agvqVar, ahczVar, ahcfVar, ahcdVar, yzvVar, jpuVar, agvwVar, aghgVar, ahdfVar, jnnVar, (axxa) dwqVar21.a.nM.get());
            case 435:
                dwq dwqVar22 = this.a;
                Context context = dwqVar22.a.b.a;
                dt dtVar = (dt) dwqVar22.s.get();
                ahcu ahcuVar = (ahcu) dwqVar22.a.xM.get();
                jnn jnnVar2 = (jnn) dwqVar22.a.hf.get();
                fcu fcuVar = (fcu) dwqVar22.a.gY.get();
                dyo dyoVar = dwqVar22.a;
                return new jer(context, dtVar, ahcuVar, jnnVar2, fcuVar, dyoVar.gS, dyoVar.as, (fbv) dyoVar.he.get(), (jgn) dwqVar22.a.nS.get(), (jdy) dwqVar22.fA.get(), (srv) dwqVar22.fC.get(), (srr) dwqVar22.dQ.get(), (fcl) dwqVar22.a.kI.get(), dwqVar22.a.bT(), (axxh) dwqVar22.a.kG.get(), (axxa) dwqVar22.a.nM.get());
            case 436:
                dwq dwqVar23 = this.a;
                dt dtVar2 = (dt) dwqVar23.s.get();
                ahcu ahcuVar2 = (ahcu) dwqVar23.a.xM.get();
                agvq agvqVar2 = (agvq) dwqVar23.a.hf.get();
                aafo aafoVar2 = (aafo) dwqVar23.H.get();
                fcu fcuVar2 = (fcu) dwqVar23.a.gY.get();
                dyo dyoVar2 = dwqVar23.a;
                return new jdy(dtVar2, ahcuVar2, agvqVar2, aafoVar2, fcuVar2, dyoVar2.gS, dyoVar2.as, (ahcd) dwqVar23.fz.get(), new akge(dwqVar23.je(), (aafo) dwqVar23.H.get(), (acth) dwqVar23.L.get()), (fcl) dwqVar23.a.kI.get());
            case 437:
                dwq dwqVar24 = this.a;
                return new jpj(dwqVar24.a(), dwqVar24.a(), (aafo) dwqVar24.H.get(), dwqVar24.hS(), new jpa(dwqVar24.a()), (ajgz) dwqVar24.cA.get());
            case 438:
                return this.a.iG();
            case 439:
                dwq dwqVar25 = this.a;
                return new jpu((dt) dwqVar25.s.get(), (akfg) dwqVar25.fF.get(), (aafo) dwqVar25.H.get(), (joh) dwqVar25.a.xN.get(), (acth) dwqVar25.L.get());
            case 440:
                dwq dwqVar26 = this.a;
                Activity a3 = dwqVar26.a();
                azqb azqbVar = dwqVar26.fE;
                azqb azqbVar2 = dwqVar26.bf;
                akfg akfgVar = (akfg) ((azqb) amup.n(ReelWatchActivity.class, azqbVar, MainLiveCreationActivity.class, azqbVar2, ShortsCreationActivity.class, azqbVar2, WatchWhileActivity.class, azqbVar2).get(a3.getClass())).get();
                axzl.o(akfgVar);
                return akfgVar;
            case 441:
                return new hzg(this.a.h());
            case 442:
                dwq dwqVar27 = this.a;
                pku pkuVar2 = (pku) dwqVar27.a.xO.get();
                return new jpo(dwqVar27.a(), (afvn) dwqVar27.a.au.get(), (agrf) dwqVar27.a.gS.get(), (aguv) dwqVar27.a.kY.get(), (afwc) dwqVar27.a.vo.get(), (yzj) dwqVar27.a.je.get(), (yrj) dwqVar27.a.as.get(), (jnn) dwqVar27.a.hf.get(), (ahcz) dwqVar27.fD.get(), (ahcd) dwqVar27.fz.get(), (yzv) dwqVar27.a.jc.get(), (jpu) dwqVar27.fG.get(), (jpv) dwqVar27.fI.get(), (agsd) dwqVar27.a.lo.get(), gad.m(), (aghg) dwqVar27.a.lx.get(), (fcl) dwqVar27.a.kI.get(), (ahdf) dwqVar27.a.ha.get(), dwqVar27.a.eH(), (Executor) dwqVar27.a.x.get(), (axxa) dwqVar27.a.nM.get());
            case 443:
                dwq dwqVar28 = this.a;
                return new jpv(dwqVar28.a(), (aafo) dwqVar28.H.get(), dwqVar28.a.cI(), (ahcz) dwqVar28.fD.get(), (yrj) dwqVar28.a.as.get(), (ajgz) dwqVar28.cA.get());
            case 444:
                return this.a.bp();
            case 445:
                return new esc(2);
            case 446:
                dwq dwqVar29 = this.a;
                return new gnu((dt) dwqVar29.s.get(), (aafo) dwqVar29.H.get(), (niz) dwqVar29.ab.get(), (niy) dwqVar29.ab.get(), dwqVar29.a.cI(), dwqVar29.ir(), (oet) dwqVar29.aF.get(), (gbh) dwqVar29.aa.get());
            case 447:
                return new exv(this.a.fN, 11, (int[][]) null);
            case 448:
                return new xnb((dt) this.a.s.get(), yie.p(), null, null);
            case 449:
                return new gnx((yni) this.a.a.y.get(), 9, (char[][]) null);
            case 450:
                return this.a.kW();
            case 451:
                return new gnx((yni) this.a.a.y.get(), 8, (byte[][]) null);
            case 452:
                return new xok((xov) this.a.fO.get());
            case 453:
                return new xov();
            case 454:
                return this.a.bJ();
            case 455:
                return this.a.bN();
            case 456:
                return this.a.bO();
            case 457:
                return new gpb((acrr) this.a.a.aw.get());
            case 458:
                return this.a.bM();
            case 459:
                return this.a.ik();
            case 460:
                dwq dwqVar30 = this.a;
                return new aiii((Handler) dwqVar30.a.an.get(), (airw) dwqVar30.n.get(), dwqVar30.ir(), (zah) dwqVar30.a.av.get(), (acrr) dwqVar30.a.aw.get(), (acti) dwqVar30.au.get(), (aafo) dwqVar30.H.get(), (ofv) dwqVar30.fP.get());
            case 461:
                return new ofv((akfg) this.a.bf.get());
            case 462:
                return this.a.L();
            case 463:
                return this.a.M();
            case 464:
                return this.a.N();
            case 465:
                return this.a.bf();
            case 466:
                return this.a.aB();
            case 467:
                return this.a.cK();
            case 468:
                return this.a.kF();
            case 469:
                return this.a.bF();
            case 470:
                return this.a.bE();
            case 471:
                return this.a.H();
            case 472:
                return this.a.G();
            case 473:
                return this.a.bG();
            case 474:
                return this.a.by();
            case 475:
                return this.a.r();
            case 476:
                return new yiv();
            case 477:
                return this.a.kJ();
            case 478:
                return this.a.kG();
            case 479:
                return this.a.O();
            case 480:
                return this.a.bz();
            case 481:
                return this.a.bA();
            case 482:
                return this.a.bB();
            case 483:
                return this.a.P();
            case 484:
                return this.a.S();
            case 485:
                return this.a.bg();
            case 486:
                return this.a.fz();
            case 487:
                return new foj((bame) this.a.a.xX.get());
            case 488:
                return new eqw((nmu) this.a.fW.get());
            case 489:
                dwq dwqVar31 = this.a;
                return new nmu(axot.a(dwqVar31.bq), axot.a(dwqVar31.fV), (ezh) dwqVar31.A.get());
            case 490:
                dwq dwqVar32 = this.a;
                dww dwwVar = new dww(dwqVar32.a, dwqVar32.b);
                dwwVar.b(false);
                ?? d = ((dwy) dwwVar.a()).d();
                ((nmv) dwqVar32.fU.get()).a(d);
                return d;
            case 491:
                return new nmv();
            case 492:
                return new gju((lwb) this.a.fX.get());
            case 493:
                return new lwb();
            case 494:
                return new gju((lwb) this.a.fX.get(), 1);
            case 495:
                dwq dwqVar33 = this.a;
                return new gng(dwqVar33.a(), (aafo) dwqVar33.H.get());
            case 496:
                return this.a.bk();
            case 497:
                return this.a.cU();
            case 498:
                return new exv(this.a.ga);
            case 499:
                return this.a.fu();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        Object obj;
        int i = this.b;
        switch (i) {
            case 600:
                dwq dwqVar = this.a;
                return new eqq((yni) dwqVar.a.y.get(), (aafo) dwqVar.H.get());
            case 601:
                dwq dwqVar2 = this.a;
                return new gko((dt) dwqVar2.s.get(), (abab) dwqVar2.a.mp.get(), (yzj) dwqVar2.a.je.get(), (aafo) dwqVar2.H.get(), (Executor) dwqVar2.a.x.get());
            case 602:
                dwq dwqVar3 = this.a;
                return new eqr((gbh) dwqVar3.aa.get(), (yni) dwqVar3.a.y.get(), pns.l(), jjd.a());
            case 603:
                return new eqs((ahce) this.a.fH.get());
            case 604:
                dwq dwqVar4 = this.a;
                ahcy ahcyVar = (ahcy) dwqVar4.fJ.get();
                fcl fclVar = (fcl) dwqVar4.a.kI.get();
                azqb azqbVar = dwqVar4.a.gS;
                ahcy ahcyVar2 = (ahcy) dwqVar4.fJ.get();
                dyo dyoVar = dwqVar4.a;
                return new equ(ahcyVar, fclVar, azqbVar, new jem(ahcyVar2, dyoVar.xQ, dyoVar.gS, (Executor) dyoVar.x.get(), (Executor) dwqVar4.a.h.get(), dwqVar4.a.b.a), (Executor) dwqVar4.a.x.get(), (axxt) dwqVar4.a.yn.get());
            case 605:
                return new eqv((ahcy) this.a.fJ.get());
            case 606:
                return new xog((xoe) this.a.gi.get());
            case 607:
                dwq dwqVar5 = this.a;
                return new gkt(dwqVar5.a(), (aafo) dwqVar5.H.get(), new esc(8), (eo) dwqVar5.t.get(), dwqVar5.hS(), (acth) dwqVar5.L.get(), dwqVar5.cA, null);
            case 608:
                dwq dwqVar6 = this.a;
                return new iul(dwqVar6.a(), (abap) dwqVar6.a.yo.get(), (iuh) dwqVar6.gA.get(), (Executor) dwqVar6.a.x.get());
            case 609:
                return this.a.cF();
            case 610:
                dwq dwqVar7 = this.a;
                return new gkw(dwqVar7.a(), (yni) dwqVar7.a.y.get(), (aaxb) dwqVar7.a.xZ.get(), (yzj) dwqVar7.a.je.get(), (Executor) dwqVar7.a.x.get());
            case 611:
                dwq dwqVar8 = this.a;
                azqb azqbVar2 = dwqVar8.H;
                return new xoh((aavc) dwqVar8.a.mt.get(), azqbVar2, new xmn((aafo) azqbVar2.get(), (xko) dwqVar8.gf.get(), (yzj) dwqVar8.a.je.get()), (aacz) dwqVar8.a.D.get(), (Executor) dwqVar8.a.x.get());
            case 612:
                return new esc(6);
            case 613:
                dwq dwqVar9 = this.a;
                return new imy((imx) dwqVar9.gB.get(), (aafo) dwqVar9.H.get());
            case 614:
                return this.a.cy();
            case 615:
                dwq dwqVar10 = this.a;
                return new abgv((aaxm) dwqVar10.a.yq.get(), (Executor) dwqVar10.a.x.get(), (aafo) dwqVar10.H.get());
            case 616:
                return new eox(this.a.a(), 4);
            case 617:
                return new esc(1);
            case 618:
                dwq dwqVar11 = this.a;
                return new eqy(dwqVar11.ir(), (aiua) dwqVar11.a.jk.get());
            case 619:
                return new eqz((ffs) this.a.aO.get());
            case 620:
                dwq dwqVar12 = this.a;
                return new erc((abbe) dwqVar12.a.mr.get(), dwqVar12.H, (yzj) dwqVar12.a.je.get(), dwqVar12.a(), (afvn) dwqVar12.a.au.get(), (afwc) dwqVar12.a.vo.get(), (jor) dwqVar12.a.yt.get(), (kse) dwqVar12.a.yu.get());
            case 621:
                return new hiu((dt) this.a.s.get(), 2);
            case 622:
                dwq dwqVar13 = this.a;
                return new akmi(dwqVar13.a(), (aaun) dwqVar13.a.xW.get(), (aacz) dwqVar13.a.D.get());
            case 623:
                dwq dwqVar14 = this.a;
                return new gms((alsc) dwqVar14.gC.get(), (efz) dwqVar14.a.cQ.get(), (Executor) dwqVar14.a.h.get(), (ayor) dwqVar14.a.aq.get(), (aacz) dwqVar14.a.D.get());
            case 624:
                return new alsc(new alsf(akpq.m(this.a.a.b.a)));
            case 625:
                return new eaz((ebn) this.a.gD.get());
            case 626:
                return this.a.t();
            case 627:
                dwq dwqVar15 = this.a;
                return new abad((abab) dwqVar15.a.mp.get(), dwqVar15.H, (Executor) dwqVar15.a.x.get());
            case 628:
                return new iso((isr) this.a.a.fe.get());
            case 629:
                return new abjn((abic) this.a.cg.get());
            case 630:
                return new hko(new hnv(this.a.k()));
            case 631:
                eo mL = ((ReelCameraActivity) this.a.a()).b.mL();
                axzl.o(mL);
                return mL;
            case 632:
                ShortsCreationActivity cb = this.a.cb();
                gve gveVar = cb.b;
                if (gveVar != null) {
                    if (cb.c) {
                        throw new IllegalStateException("peer() called after destroyed.");
                    }
                    gveVar.a(0L);
                    eo mL2 = gveVar.a.mL();
                    axzl.o(mL2);
                    return mL2;
                }
                throw new IllegalStateException("peer() called before initialized.");
            case 633:
                eo b = ((nfk) this.a.aE.get()).b();
                axzl.o(b);
                return b;
            case 634:
                dwq dwqVar16 = this.a;
                return new hyi(new igu(dwqVar16.s, dwqVar16.gE), (aafo) dwqVar16.H.get(), (gte) dwqVar16.gF.get(), (Executor) dwqVar16.a.x.get());
            case 635:
                dwq dwqVar17 = this.a;
                return new ihl(dwqVar17.a(), (Executor) dwqVar17.a.x.get(), (afvn) dwqVar17.a.au.get(), (alaz) dwqVar17.a.wm.get(), (ajmr) dwqVar17.a.kz.get(), (akys) dwqVar17.a.mY.get(), (aafo) dwqVar17.H.get(), (ajmy) dwqVar17.a.kC.get(), (ajxz) dwqVar17.a.lV.get(), (acth) dwqVar17.L.get());
            case 636:
                dwq dwqVar18 = this.a;
                return new gte((Executor) dwqVar18.a.x.get(), (akys) dwqVar18.a.mY.get(), (afvn) dwqVar18.a.au.get());
            case 637:
                dwq dwqVar19 = this.a;
                return new glf(dwqVar19.a(), (aafo) dwqVar19.H.get(), (fvf) dwqVar19.bf.get());
            case 638:
                return new aati(axot.a(this.a.a.yx), 1);
            case 639:
                dwq dwqVar20 = this.a;
                return new gll(dwqVar20.a(), (adoa) dwqVar20.a.jq.get(), hxb.c(), (iak) dwqVar20.a.md.get(), (ifk) dwqVar20.a.mc.get(), (gts) dwqVar20.a.me.get(), (snc) dwqVar20.a.v.get(), axot.a(dwqVar20.gG), Optional.empty(), (aacz) dwqVar20.a.D.get(), (aadd) dwqVar20.a.K.get(), (PipObserver) dwqVar20.gH.get(), (ajmy) dwqVar20.a.kC.get(), (aagi) dwqVar20.a.dD.get(), dwqVar20.a.bT(), (igh) dwqVar20.a.vY.get(), dwqVar20.a.S());
            case 640:
                dwq dwqVar21 = this.a;
                return new PipObserver(dwqVar21.a(), (azpx) dwqVar21.q.get());
            case 641:
                return new hre(this.a.k());
            case 642:
                dwq dwqVar22 = this.a;
                dyo dyoVar2 = dwqVar22.a;
                return new ere(amvn.s((Runnable) dwqVar22.a.yy.get(), new jlo(dyoVar2.kY, dyoVar2.gS)));
            case 643:
                dwq dwqVar23 = this.a;
                return new gls((yzj) dwqVar23.a.je.get(), (acti) dwqVar23.au.get(), new glr(dwqVar23.cE(), (yni) dwqVar23.a.y.get(), (yzj) dwqVar23.a.je.get(), (acti) dwqVar23.au.get()));
            case 644:
                dyo dyoVar3 = this.a.a;
                return new iwx(dyoVar3.b.a, (adoa) dyoVar3.jq.get());
            case 645:
                return new gnx((yni) this.a.a.y.get(), 15, (char[][][]) null);
            case 646:
                dwq dwqVar24 = this.a;
                return new erk((abab) dwqVar24.a.mp.get(), (aafo) dwqVar24.H.get(), (yzj) dwqVar24.a.je.get());
            case 647:
                return new gnx((yni) this.a.a.y.get(), 1);
            case 648:
                dwq dwqVar25 = this.a;
                return new isv((ajqa) dwqVar25.a.mq.get(), (yni) dwqVar25.a.y.get());
            case 649:
                return new erl((nml) this.a.bq.get());
            case 650:
                dwq dwqVar26 = this.a;
                return new glt(dwqVar26.a(), (yni) dwqVar26.a.y.get(), (aaxb) dwqVar26.a.xZ.get(), (yzj) dwqVar26.a.je.get(), (Executor) dwqVar26.a.x.get());
            case 651:
                dwq dwqVar27 = this.a;
                return new kng(dwqVar27.aO(), (aizb) dwqVar27.ao.get());
            case 652:
                return new ero((akfb) this.a.dt.get());
            case 653:
                dwq dwqVar28 = this.a;
                return new glv((gbh) dwqVar28.aa.get(), (SharedPreferences) dwqVar28.a.t.get(), (lay) dwqVar28.a.yz.get(), pku.i(), pku.j());
            case 654:
                return new erg((eri) this.a.a.yA.get());
            case 655:
                return new gnx((yni) this.a.a.y.get(), 14, (byte[][][]) null);
            case 656:
                dwq dwqVar29 = this.a;
                return new abjo((aaza) dwqVar29.a.xo.get(), (abha) dwqVar29.cj.get());
            case 657:
                dwq dwqVar30 = this.a;
                return new abjk((aaza) dwqVar30.a.xo.get(), (abha) dwqVar30.cj.get(), (yzj) dwqVar30.a.je.get(), (Executor) dwqVar30.a.x.get(), 2, null);
            case 658:
                dwq dwqVar31 = this.a;
                return new akml((aaun) dwqVar31.a.xW.get(), (yzj) dwqVar31.a.je.get(), (aafo) dwqVar31.H.get(), (acth) dwqVar31.L.get());
            case 659:
                dwq dwqVar32 = this.a;
                return new akmo(dwqVar32.a(), (aazu) dwqVar32.a.wn.get(), (aafo) dwqVar32.H.get(), dwqVar32.a.cI());
            case 660:
                dwq dwqVar33 = this.a;
                return new akms((aafo) dwqVar33.H.get(), (Executor) dwqVar33.a.x.get(), (aaun) dwqVar33.a.xW.get());
            case 661:
                return new akmp(new akkk(this.a.a()));
            case 662:
                return new eox(this.a.a(), 5);
            case 663:
                dwq dwqVar34 = this.a;
                return new isx(dwqVar34.a(), (gfu) dwqVar34.a.eA.get());
            case 664:
                return this.a.gY();
            case 665:
                dwq dwqVar35 = this.a;
                aafo aafoVar = (aafo) dwqVar35.H.get();
                agcp agcpVar = (agcp) dwqVar35.a.et.get();
                lfv lfvVar = (lfv) dwqVar35.gI.get();
                dyo dyoVar4 = dwqVar35.a;
                return new err(aafoVar, agcpVar, lfvVar, dyoVar4.gY, dyoVar4.au, (Executor) dyoVar4.h.get(), (Executor) dwqVar35.a.x.get());
            case 666:
                return this.a.dJ();
            case 667:
                dwq dwqVar36 = this.a;
                return new glw(dwqVar36.ir(), dwqVar36.iu());
            case 668:
                return new glx((YouTubeControlsOverlay) this.a.by.get());
            case 669:
                dwq dwqVar37 = this.a;
                return new abcs(dwqVar37.a.cD(), dwqVar37.H, (yzj) dwqVar37.a.je.get(), (Executor) dwqVar37.a.x.get());
            case 670:
                return new exv(this.a.dn, 3, (char[]) null);
            case 671:
                dwq dwqVar38 = this.a;
                return new gpd((gpc) dwqVar38.a.yC.get(), (aafo) dwqVar38.H.get());
            case 672:
                return new gnx((yni) this.a.a.y.get(), 2, (byte[]) null);
            case 673:
                return new exv(this.a.fW, 6, (boolean[]) null);
            case 674:
                dwq dwqVar39 = this.a;
                return new gny((dt) dwqVar39.s.get(), (airr) dwqVar39.a.fO.get());
            case 675:
                return this.a.bI();
            case 676:
                return new gnz((oet) this.a.aF.get());
            case 677:
                dwq dwqVar40 = this.a;
                return new abgs((aaxk) dwqVar40.a.yD.get(), (Executor) dwqVar40.a.x.get(), (aafo) dwqVar40.H.get());
            case 678:
                return this.a.hg();
            case 679:
                return new isq((fwx) this.a.gJ.get());
            case 680:
                return this.a.aG();
            case 681:
                return this.a.aH();
            case 682:
                dwq dwqVar41 = this.a;
                aacz aaczVar = (aacz) dwqVar41.a.D.get();
                Activity a = dwqVar41.a();
                ajxz ajxzVar = (ajxz) dwqVar41.a.lV.get();
                asxj asxjVar = aaczVar.b().e;
                if (asxjVar == null) {
                    asxjVar = asxj.a;
                }
                if (asxjVar.I) {
                    return new fwv(a, ajxzVar, aaczVar);
                }
                return new fxe(a, ajxzVar);
            case 683:
                return this.a.aF();
            case 684:
                dwq dwqVar42 = this.a;
                return new ert((nmu) dwqVar42.fW.get(), (aacz) dwqVar42.a.D.get(), dwqVar42.ab, axot.a(dwqVar42.gP), axot.a(dwqVar42.A), (npe) dwqVar42.gQ.get());
            case 685:
                dwq dwqVar43 = this.a;
                return new nqr((nzy) dwqVar43.gO.get(), (ezh) dwqVar43.A.get(), (aizb) dwqVar43.ao.get(), (aacz) dwqVar43.a.D.get());
            case 686:
                return this.a.eN();
            case 687:
                return new fqj();
            case 688:
                return Boolean.valueOf(nvp.g(this.a.a()));
            case 689:
                return this.a.eD();
            case 690:
                return new nuo();
            case 691:
                dwq dwqVar44 = this.a;
                aacz aaczVar2 = (aacz) dwqVar44.a.D.get();
                azqb azqbVar3 = dwqVar44.dq;
                azqb azqbVar4 = dwqVar44.gN;
                if (!eog.aY(aaczVar2)) {
                    obj = new koj();
                } else if (eog.aE(aaczVar2)) {
                    obj = (nxc) azqbVar4.get();
                } else {
                    obj = (nxc) azqbVar3.get();
                }
                axzl.o(obj);
                return obj;
            case 692:
                dwq dwqVar45 = this.a;
                return new kot((koi) dwqVar45.dq.get(), (kok) dwqVar45.bw.get());
            case 693:
                dwq dwqVar46 = this.a;
                return new npe((apy) dwqVar46.s.get(), (nmu) dwqVar46.fW.get(), (aban) dwqVar46.a.yF.get(), (Executor) dwqVar46.a.x.get(), (yzj) dwqVar46.a.je.get(), dwqVar46.ab, (aafo) dwqVar46.H.get());
            case 694:
                return new eqw((nmu) this.a.fW.get(), 1);
            case 695:
                dwq dwqVar47 = this.a;
                return new ery((nmu) dwqVar47.fW.get(), (aacz) dwqVar47.a.D.get());
            case 696:
                return new eqw((nmu) this.a.fW.get(), 2);
            case 697:
                return this.a.gH();
            case 698:
                return new wbh(this.a.gR);
            case 699:
                dwq dwqVar48 = this.a;
                return new wbw((aafo) dwqVar48.H.get(), (Handler) dwqVar48.a.an.get(), (wdc) dwqVar48.a.yG.get(), (dt) dwqVar48.s.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        ampq ampqVar;
        ohb ohbVar;
        Iterable iterable;
        int i = this.b;
        switch (i) {
            case 1000:
                return this.a.ew();
            case 1001:
                return ((ofo) this.a.ir.get()).f;
            case 1002:
                return this.a.jz();
            case 1003:
                return ((ofo) this.a.ir.get()).e;
            case 1004:
                return this.a.jy();
            case 1005:
                return this.a.lh();
            case 1006:
                dwq dwqVar = this.a;
                return new evn((yni) dwqVar.a.y.get(), (acvp) dwqVar.a.kb.get(), (aacz) dwqVar.a.D.get());
            case 1007:
                dwq dwqVar2 = this.a;
                afwc afwcVar = (afwc) dwqVar2.a.vo.get();
                return new ojx(dwqVar2.fe(), (ojl) dwqVar2.E.get(), (oio) dwqVar2.iw.get(), (afwc) dwqVar2.a.a.B.get(), (afvn) dwqVar2.a.au.get(), (wai) dwqVar2.a.a.C.get(), (aafo) dwqVar2.H.get(), (eza) dwqVar2.a.jF.get(), (fvf) dwqVar2.bf.get(), dwqVar2.iT, (afvt) dwqVar2.a.dz.get(), (wal) dwqVar2.a.au.get(), (fqd) dwqVar2.I.get(), (aadd) dwqVar2.a.K.get(), (aacz) dwqVar2.a.D.get(), dwqVar2.iU, dwqVar2.fy(), dwqVar2.iR);
            case 1008:
                dwq dwqVar3 = this.a;
                SharedPreferences sharedPreferences = (SharedPreferences) dwqVar3.a.t.get();
                return new oio(dwqVar3.fe());
            case 1009:
                return this.a.ff();
            case 1010:
                return this.a.jC();
            case 1011:
                return this.a.ax();
            case 1012:
                return this.a.cJ();
            case 1013:
                dwq dwqVar4 = this.a;
                return new lvm((gbu) dwqVar4.E.get(), (yrj) dwqVar4.a.as.get(), (sdb) dwqVar4.ee.get(), (yzv) dwqVar4.a.jc.get(), pku.i(), null);
            case 1014:
                dwq dwqVar5 = this.a;
                return new WatchOnTvMenuItem(dwqVar5.a(), (gfu) dwqVar5.a.eA.get(), (acwn) dwqVar5.a.mz.get());
            case 1015:
                return this.a.ay();
            case 1016:
                return new MultiPageMenuDialogFragmentController((dt) this.a.s.get());
            case 1017:
                return this.a.fg();
            case 1018:
                dwq dwqVar6 = this.a;
                Activity a = dwqVar6.a();
                aacz aaczVar = (aacz) dwqVar6.a.D.get();
                return eog.aR(aaczVar) ? new lui(a, aaczVar, (aafo) dwqVar6.H.get()) : lvl.d;
            case 1019:
                dwq dwqVar7 = this.a;
                oa oaVar = (oa) dwqVar7.j.get();
                AppTabsBar appTabsBar = (AppTabsBar) dwqVar7.iE.get();
                ViewGroup viewGroup = (ViewGroup) ((ViewGroup) dwqVar7.aC.get()).findViewById(R.id.pane_fragment_container);
                axzl.o(viewGroup);
                ConstraintLayout constraintLayout = (ConstraintLayout) dwqVar7.iD.get();
                luf lufVar = (luf) dwqVar7.iF.get();
                azqb azqbVar = dwqVar7.ai;
                azqb azqbVar2 = dwqVar7.iG;
                acth acthVar = (acth) dwqVar7.L.get();
                aacz aaczVar2 = (aacz) dwqVar7.a.D.get();
                fsc fscVar = (fsc) dwqVar7.iH.get();
                lvw lvwVar = (lvw) dwqVar7.iJ.get();
                lwk lwkVar = (lwk) dwqVar7.iL.get();
                lyq lyqVar = (lyq) dwqVar7.iN.get();
                azqb azqbVar3 = dwqVar7.iP;
                if (eog.C((aadd) dwqVar7.a.K.get())) {
                    ampqVar = ampq.j((lzd) azqbVar3.get());
                } else {
                    ampqVar = amon.a;
                }
                lvu lvuVar = new lvu(oaVar, appTabsBar, viewGroup, constraintLayout, lufVar, azqbVar, azqbVar2, acthVar, aaczVar2, fscVar, lvwVar, lwkVar, lyqVar, ampqVar, (ElevatedAppBarLayout) dwqVar7.iI.get(), (frw) dwqVar7.iQ.get(), pku.j(), (aadd) dwqVar7.a.K.get(), (ayor) dwqVar7.a.iz.get(), (nxh) dwqVar7.r.get(), dwqVar7.gk(), (gbq) dwqVar7.l.get(), (yzm) dwqVar7.B.get());
                lvuVar.g.d().Z(new lvq(lvuVar, 1));
                return lvuVar;
            case 1020:
                return this.a.aw();
            case 1021:
                return this.a.j();
            case 1022:
                yzh mD = this.a.F().mD();
                axzl.o(mD);
                return mD;
            case 1023:
                dwq dwqVar8 = this.a;
                return new oik(dwqVar8.a(), (oah) dwqVar8.w.get(), (aynx) dwqVar8.C.get());
            case 1024:
                dwq dwqVar9 = this.a;
                return new lvw(dwqVar9.a(), axot.a(dwqVar9.iI), axot.a(dwqVar9.cd), dwqVar9.iz());
            case 1025:
                return this.a.ea();
            case 1026:
                return this.a.ec();
            case 1027:
                return this.a.p();
            case 1028:
                return this.a.ed();
            case 1029:
                dwq dwqVar10 = this.a;
                return new lyq(axot.a(dwqVar10.iM), dwqVar10.a(), axot.a(dwqVar10.iI), (axxi) dwqVar10.a.it.get(), (ayor) dwqVar10.a.iz.get(), dwqVar10.gk());
            case 1030:
                dwq dwqVar11 = this.a;
                Activity a2 = dwqVar11.a();
                aacz aaczVar3 = (aacz) dwqVar11.a.D.get();
                ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(a2).inflate(R.layout.mysubs_filter_bar, (ViewGroup) null);
                axzl.o(viewGroup2);
                return viewGroup2;
            case 1031:
                dwq dwqVar12 = this.a;
                return new lzd(dwqVar12.a(), axot.a(dwqVar12.iO), axot.a(dwqVar12.iI), (aadd) dwqVar12.a.K.get());
            case 1032:
                return this.a.q();
            case 1033:
                return this.a.av();
            case 1034:
                return new etr((yni) this.a.a.y.get());
            case 1035:
                return this.a.jM();
            case 1036:
                return new olr((gbq) this.a.l.get(), (olc) dwq.kB());
            case 1037:
                dwq dwqVar13 = this.a;
                return new ecc((afvn) dwqVar13.a.au.get(), (dt) dwqVar13.s.get(), (aasc) dwqVar13.a.mG.get(), (whp) dwqVar13.a.df.get(), (wge) dwqVar13.a.mH.get(), (yni) dwqVar13.a.y.get(), (abdm) dwqVar13.a.yj.get(), (HatsController) dwqVar13.gu.get(), (Executor) dwqVar13.a.x.get(), (gcc) dwqVar13.ap.get(), (yrj) dwqVar13.a.as.get(), (axwo) dwqVar13.a.wJ.get());
            case 1038:
                return this.a.jQ();
            case 1039:
                dwq dwqVar14 = this.a;
                oa oaVar2 = (oa) dwqVar14.j.get();
                aafo aafoVar = (aafo) dwqVar14.H.get();
                ajgz ajgzVar = (ajgz) dwqVar14.cA.get();
                afvn afvnVar = (afvn) dwqVar14.a.au.get();
                eza ezaVar = (eza) dwqVar14.a.jF.get();
                evn evnVar = (evn) dwqVar14.iv.get();
                azqb azqbVar4 = dwqVar14.eT;
                azqb azqbVar5 = dwqVar14.dn;
                ond ondVar = (ond) dwqVar14.iW.get();
                eid eidVar = (eid) dwqVar14.iX.get();
                ojl ojlVar = (ojl) dwqVar14.E.get();
                emo emoVar = (emo) dwqVar14.ab.get();
                oiy oiyVar = (oiy) dwqVar14.ec.get();
                dyo dyoVar = dwqVar14.a;
                return new oiw(oaVar2, aafoVar, ajgzVar, afvnVar, ezaVar, evnVar, azqbVar4, azqbVar5, ondVar, eidVar, ojlVar, emoVar, oiyVar, dyoVar.hl, (Executor) dyoVar.x.get(), (aacz) dwqVar14.a.D.get(), (yni) dwqVar14.a.y.get(), dwqVar14.a.rN, pku.j(), gad.i(), fyv.a(), (acrr) dwqVar14.a.aw.get(), (evm) dwqVar14.a.xj.get(), (acvp) dwqVar14.a.kb.get(), null);
            case 1040:
                return new ond((aafo) this.a.H.get());
            case 1041:
                dwq dwqVar15 = this.a;
                return new eid(dwqVar15.H, (aacz) dwqVar15.a.D.get());
            case 1042:
                return new gax();
            case 1043:
                return this.a.fs();
            case 1044:
                return new abss(null);
            case 1045:
                dwq dwqVar16 = this.a;
                return yie.j(axot.a(dwqVar16.jh), axot.a(dwqVar16.ji), dwqVar16.a.b.a);
            case 1046:
                return yie.h();
            case 1047:
                return yie.i();
            case 1048:
                dwq dwqVar17 = this.a;
                return new hkg(dwqVar17.a.fV(), (albf) dwqVar17.a.mT.get(), (akyh) dwqVar17.a.nc.get(), (hkl) dwqVar17.a.yP.get(), (Executor) dwqVar17.a.h.get());
            case 1049:
                return gad.u();
            case 1050:
                return this.a.gl();
            case 1051:
                return this.a.kg();
            case 1052:
                return this.a.km();
            case 1053:
                return this.a.fc();
            case 1054:
                return amvn.r(ogt.a);
            case 1055:
                return this.a.kj();
            case 1056:
                dwq dwqVar18 = this.a;
                return new NfcHelper(dwqVar18.a(), (Executor) dwqVar18.a.x.get(), dwqVar18.o);
            case 1057:
                return new ThemeStoreLifecycleController((gfr) this.a.a.nP.get());
            case 1058:
                dwq dwqVar19 = this.a;
                dyo dyoVar2 = dwqVar19.a;
                return new NotificationOsSettingEntityController((aagi) dwqVar19.a.dD.get(), dyoVar2.b.a, (agbd) dyoVar2.eu.get());
            case 1059:
                return amvn.r(ogt.a);
            case 1060:
                dwq dwqVar20 = this.a;
                return new StartupSignalStream((yni) dwqVar20.a.y.get(), (efz) dwqVar20.a.cQ.get(), (efc) dwqVar20.a.wA.get(), (ohb) dwqVar20.jn.get());
            case 1061:
                dwq dwqVar21 = this.a;
                azqb azqbVar6 = dwqVar21.jm;
                asxj asxjVar = ((aacz) dwqVar21.a.D.get()).b().e;
                if (asxjVar == null) {
                    asxjVar = asxj.a;
                }
                if (asxjVar.cG) {
                    ohbVar = (ohb) azqbVar6.get();
                } else {
                    ohbVar = ohb.a;
                }
                axzl.o(ohbVar);
                return ohbVar;
            case 1062:
                return new ohg((acrr) this.a.a.aw.get());
            case 1063:
                return amvn.r((gbp) this.a.a.zD.get());
            case 1064:
                return this.a.kC();
            case 1065:
                return this.a.kf();
            case 1066:
                dwq dwqVar22 = this.a;
                amvl j = amvn.j(5);
                azqb azqbVar7 = dwqVar22.jp;
                auld auldVar = ((aadd) dwqVar22.a.K.get()).a().u;
                if (auldVar == null) {
                    auldVar = auld.a;
                }
                if (!auldVar.i) {
                    iterable = amyg.a;
                } else {
                    iterable = amvn.r((apx) azqbVar7.get());
                }
                axzl.o(iterable);
                j.j(iterable);
                j.c((apx) dwqVar22.jq.get());
                j.c((apx) dwqVar22.jr.get());
                j.c((apx) dwqVar22.js.get());
                j.c((apx) dwqVar22.fY.get());
                return j.g();
            case 1067:
                dwq dwqVar23 = this.a;
                return new ReelWatchActivityCaptionsLifecycleObserver((jyu) dwqVar23.bg.get(), dwqVar23.iq());
            case 1068:
                return this.a.ci();
            case 1069:
                dwq dwqVar24 = this.a;
                return new ReelSnackbarController((dt) dwqVar24.s.get(), (yni) dwqVar24.a.y.get(), (akfg) dwqVar24.bf.get(), dwqVar24.aE(), (acth) dwqVar24.L.get(), dwqVar24.aB());
            case 1070:
                dwq dwqVar25 = this.a;
                return new ReelWatchActivityLifecycleObserver((gts) dwqVar25.a.me.get(), (aafo) dwqVar25.H.get(), (aadd) dwqVar25.a.K.get());
            case 1071:
                dwq dwqVar26 = this.a;
                return new SettingsDataAccess(dwqVar26.a(), (yni) dwqVar26.a.y.get(), dwqVar26.a.cD(), (etd) dwqVar26.a.kF.get(), (aacz) dwqVar26.a.D.get(), (fnp) dwqVar26.a.a.U.get(), (akjm) dwqVar26.a.zG.get(), (Executor) dwqVar26.a.h.get(), (yrj) dwqVar26.a.as.get(), (acti) dwqVar26.K.get());
            case 1072:
                return this.a.kl();
            case 1073:
                return this.a.bQ();
            case 1074:
                dwq dwqVar27 = this.a;
                return new ils(dwqVar27.a(), (ayor) dwqVar27.a.iz.get(), (fvf) dwqVar27.bf.get(), (aagi) dwqVar27.a.dD.get(), (aafo) dwqVar27.H.get(), (aacz) dwqVar27.a.D.get());
            case 1075:
                return this.a.cO();
            case 1076:
                dwq dwqVar28 = this.a;
                return new PaneFragmentOrientationLocker((gbu) dwqVar28.E.get(), (gcc) dwqVar28.ap.get());
            case 1077:
                return this.a.eL();
            case 1078:
                return this.a.bK();
            case 1079:
                return this.a.jS();
            case 1080:
                dwq dwqVar29 = this.a;
                vjf a3 = vjg.a(dwqVar29.a.b.a);
                a3.e("commonui");
                a3.f("inappreviews_proto.pb");
                Uri a4 = a3.a();
                vli a5 = vlj.a();
                a5.f(a4);
                a5.e(mbn.a);
                return new yvc(vmu.b(((vlk) dwqVar29.a.j.get()).a(a5.a())), mbn.a);
            case 1081:
                return new InlinePlayerLayoutDelegate((fzl) this.a.fn.get());
            case 1082:
                dwq dwqVar30 = this.a;
                return new PlayerVideoViewLayoutDelegateController((jvo) dwqVar30.u.get(), (ezh) dwqVar30.A.get(), (InlinePlayerLayoutDelegate) dwqVar30.jv.get(), (ofh) dwqVar30.is.get());
            case 1083:
                return this.a.dg();
            case 1084:
                return this.a.x();
            case 1085:
                return this.a.y();
            case 1086:
                return this.a.dz();
            case 1087:
                return this.a.cL();
            case 1088:
                return this.a.cN();
            case 1089:
                return this.a.cM();
            case 1090:
                return this.a.eX();
            case 1091:
                dwq dwqVar31 = this.a;
                return new OfflineModeChangedMealbarController(dwqVar31.a(), dwqVar31.ir(), (gbq) dwqVar31.l.get(), (gnn) dwqVar31.hS.get(), (sdb) dwqVar31.ee.get(), (akfd) dwqVar31.gT.get(), (acth) dwqVar31.L.get(), (yrj) dwqVar31.a.as.get(), (ezh) dwqVar31.A.get(), (fcl) dwqVar31.a.kI.get(), (oet) dwqVar31.aF.get(), (oez) dwqVar31.bm.get(), (yni) dwqVar31.a.y.get(), (airw) dwqVar31.n.get(), (aacz) dwqVar31.a.D.get(), pns.l(), null);
            case 1092:
                dwq dwqVar32 = this.a;
                OfflineModeChangedRefreshController offlineModeChangedRefreshController = new OfflineModeChangedRefreshController((gbq) dwqVar32.l.get(), (ezh) dwqVar32.A.get(), (feb) dwqVar32.eh.get(), (aacz) dwqVar32.a.D.get(), (aadd) dwqVar32.a.K.get(), dwqVar32.ir(), (oet) dwqVar32.aF.get(), (okf) dwqVar32.iT.get(), (yni) dwqVar32.a.y.get(), (airw) dwqVar32.n.get(), gad.j(), gad.i(), gad.k());
                ((sdb) dwqVar32.ee.get()).a(offlineModeChangedRefreshController);
                return offlineModeChangedRefreshController;
            case 1093:
                dwq dwqVar33 = this.a;
                return new PlaylistEditToastController(dwqVar33.a(), (akfg) dwqVar33.fF.get(), (aadd) dwqVar33.a.K.get(), (yni) dwqVar33.a.y.get());
            case 1094:
                dwq dwqVar34 = this.a;
                return new TrailerOverlayPresenter(dwqVar34.a(), (fpm) dwqVar34.bX.get(), (ydq) dwqVar34.a.xJ.get(), (airw) dwqVar34.n.get(), (aacz) dwqVar34.a.D.get(), (yni) dwqVar34.a.y.get());
            case 1095:
                dwq dwqVar35 = this.a;
                TooltipPlayerResponseMonitor tooltipPlayerResponseMonitor = new TooltipPlayerResponseMonitor((akfw) dwqVar35.gX.get(), (yni) dwqVar35.a.y.get(), (airw) dwqVar35.n.get(), (aacz) dwqVar35.a.D.get());
                ((ezh) dwqVar35.A.get()).i(tooltipPlayerResponseMonitor);
                return tooltipPlayerResponseMonitor;
            case 1096:
                dwq dwqVar36 = this.a;
                return new TooltipPlayerViewModeMonitor((akge) dwqVar36.af.get(), (ezh) dwqVar36.A.get());
            case 1097:
                dwq dwqVar37 = this.a;
                return new VolumeControlsManager(axot.a(dwqVar37.a.jE), (ajad) dwqVar37.a.jD.get(), dwqVar37.a());
            case 1098:
                dwq dwqVar38 = this.a;
                return new WatchUpsellDialogController(dwqVar38.ir(), dwqVar38.hS(), dwqVar38.a.cI(), (feu) dwqVar38.a.wt.get(), (yni) dwqVar38.a.y.get(), (airw) dwqVar38.n.get(), (aacz) dwqVar38.a.D.get(), (aafo) dwqVar38.H.get(), dwqVar38.jb());
            case 1099:
                dwq dwqVar39 = this.a;
                return new WatchResponseCoordinator((axxb) dwqVar39.a.ap.get(), (ahta) dwqVar39.a.rO.get(), (oez) dwqVar39.bm.get(), (airw) dwqVar39.n.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        int i = this.b;
        switch (i) {
            case 1200:
                return this.a.A();
            case 1201:
                dwq dwqVar = this.a;
                final Context h = dwqVar.h();
                final gem aT = dwqVar.aT();
                final ajyi ajyiVar = (ajyi) dwqVar.ah.get();
                return new ajry() { // from class: hxf
                    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ajsa] */
                    @Override // defpackage.ajry
                    public final ajru b(ViewGroup viewGroup) {
                        return new ajqk(h, aT, ajyiVar.get());
                    }
                };
            case 1202:
                dwq dwqVar2 = this.a;
                return new ksj(dwqVar2.a(), (afvn) dwqVar2.a.au.get(), (afwc) dwqVar2.a.vo.get(), (aaxt) dwqVar2.a.jG.get(), (yzj) dwqVar2.a.je.get(), (yni) dwqVar2.a.y.get(), (aafo) dwqVar2.H.get(), (Executor) dwqVar2.a.x.get());
            case 1203:
                dwq dwqVar3 = this.a;
                return new jae((sdb) dwqVar3.ee.get(), (gbq) dwqVar3.l.get(), dwqVar3.a.kI, gad.j(), gad.i(), gad.k(), null);
            case 1204:
                final nfv nfvVar = (nfv) this.a.jc.get();
                nfvVar.getClass();
                return new akem(new amqo() { // from class: nfw
                    @Override // defpackage.amqo
                    public final Object get() {
                        return Boolean.valueOf(nfv.this.a());
                    }
                });
            case 1205:
                return this.a.an();
            case 1206:
                return new akel();
            case 1207:
                return this.a.iQ();
            case 1208:
                dwq dwqVar4 = this.a;
                Activity a = dwqVar4.a();
                aacz aaczVar = (aacz) dwqVar4.a.D.get();
                fqd fqdVar = (fqd) dwqVar4.I.get();
                aitm aitmVar = (aitm) dwqVar4.a.iR.get();
                asxj asxjVar = aaczVar.b().e;
                if (asxjVar == null) {
                    asxjVar = asxj.a;
                }
                return asxjVar.r ? new lni(a, aaczVar, fqdVar, aitmVar) : lmu.a;
            case 1209:
                return acsv.e();
            case 1210:
                return this.a.iO();
            case 1211:
                return this.a.az();
            case 1212:
                dwq dwqVar5 = this.a;
                return new akov(dwqVar5.a(), (aafo) dwqVar5.H.get(), 1);
            case 1213:
                return new lbd();
            case 1214:
                return new krb(this.a.le, 1);
            case 1215:
                dwq dwqVar6 = this.a;
                return new ekx(dwqVar6.a(), (ajmy) dwqVar6.a.kC.get(), (aafo) dwqVar6.H.get(), (xff) dwqVar6.a.mv.get(), (fpa) dwqVar6.as.get(), dwqVar6.an(), dwqVar6.C(), dwqVar6.aq(), new sqn(dwqVar6.f, dwqVar6.a.kC, dwqVar6.H), (ekw) dwqVar6.a.zN.get(), (gts) dwqVar6.a.me.get(), (gte) dwqVar6.gF.get(), (akfb) dwqVar6.dt.get(), dwqVar6.iV(), null);
            case 1216:
                return new xno((Handler) this.a.a.an.get());
            case 1217:
                return this.a.iN();
            case 1218:
                return acsv.e();
            case 1219:
                dwq dwqVar7 = this.a;
                return new jpd((jpu) dwqVar7.fG.get(), (jpb) dwqVar7.lj.get(), (fbj) dwqVar7.a.kH.get());
            case 1220:
                dwq dwqVar8 = this.a;
                return new jpb((dt) dwqVar8.s.get(), (aakn) dwqVar8.a.wx.get(), (aafo) dwqVar8.H.get(), (ajxz) dwqVar8.a.lV.get());
            case 1221:
                return acsv.e();
            case 1222:
                return this.a.aq();
            case 1223:
                return acsv.e();
            case 1224:
                return new DismissalFollowUpDialogFragmentController((dt) this.a.s.get());
            case 1225:
                dwq dwqVar9 = this.a;
                dwqVar9.a();
                return new ivt((adoa) dwqVar9.a.jq.get());
            case 1226:
                dwq dwqVar10 = this.a;
                return new mkm(dwqVar10.f, dwqVar10.jd, dwqVar10.x, dwqVar10.lq, dwqVar10.lw);
            case 1227:
                return new fyv();
            case 1228:
                dwq dwqVar11 = this.a;
                azqb azqbVar = dwqVar11.f;
                dyo dyoVar = dwqVar11.a;
                return gad.o(azqbVar, dyoVar.kC, dyoVar.lV, dwqVar11.H, dwqVar11.kX, dwqVar11.bI, dwqVar11.am, dwqVar11.bG, dwqVar11.lr, dwqVar11.ls, dwqVar11.lt, dyoVar.D, dwqVar11.kY, dwqVar11.lu, dwqVar11.lv);
            case 1229:
                dwq dwqVar12 = this.a;
                return new emg(dwqVar12.f, dwqVar12.kV, dwqVar12.lm);
            case 1230:
                dwq dwqVar13 = this.a;
                return new ajrb(dwqVar13.a(), (aafo) dwqVar13.H.get(), (acuh) dwqVar13.ll.get());
            case 1231:
                dyo dyoVar2 = this.a.a;
                return new jkv(dyoVar2.h, dyoVar2.x, dyoVar2.gS, dyoVar2.y, dyoVar2.gR, dyoVar2.od, dyoVar2.kH);
            case 1232:
                dwq dwqVar14 = this.a;
                return new mlp(dwqVar14.f, dwqVar14.a.kC);
            case 1233:
                dwq dwqVar15 = this.a;
                return new kua(dwqVar15.a.lV, dwqVar15.f);
            case 1234:
                return acsv.e();
            case 1235:
                return this.a.C();
            case 1236:
                return acsv.e();
            case 1237:
                dwq dwqVar16 = this.a;
                final fmx fmxVar = new fmx((oet) dwqVar16.aF.get());
                ((ezh) dwqVar16.A.get()).h().as(new ayqb() { // from class: fmv
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        oeu oeuVar;
                        nwa nwaVar;
                        fmx fmxVar2 = fmx.this;
                        int i2 = 0;
                        if (((ezx) obj).j() && (oeuVar = fmxVar2.a.a) != null && (nwaVar = ((DefaultWatchPanelViewController) oeuVar).i) != null) {
                            i2 = ((nvp) nwaVar).e;
                        }
                        if (fmxVar2.c != i2) {
                            fmxVar2.c = i2;
                            if (fmxVar2.b.isEmpty()) {
                                return;
                            }
                            for (fmw fmwVar : fmxVar2.b) {
                                fmwVar.a(fmxVar2.c);
                            }
                        }
                    }
                });
                return fmxVar;
            case 1238:
                return this.a.iH();
            case 1239:
                return this.a.fK();
            case 1240:
                dwq dwqVar17 = this.a;
                dyo dyoVar3 = dwqVar17.a;
                return new jeh(dyoVar3.gR, (Executor) dyoVar3.x.get(), (jnw) dwqVar17.a.zR.get());
            case 1241:
                dwq dwqVar18 = this.a;
                dwqVar18.a();
                afuw afuwVar = (afuw) dwqVar18.a.on.get();
                tdb tdbVar = (tdb) dwqVar18.a.nO.get();
                return new ajit((Executor) dwqVar18.a.aA.get());
            case 1242:
                return this.a.hq();
            case 1243:
                return new abkw((abkv) this.a.lH.get());
            case 1244:
                abkv abkvVar = ((gfs) this.a.cf.get()) == gfs.DARK ? abkv.DARK : abkv.LIGHT;
                axzl.o(abkvVar);
                return abkvVar;
            case 1245:
                return this.a.hk();
            case 1246:
                return this.a.hs();
            case 1247:
                return this.a.hr();
            case 1248:
                dwq dwqVar19 = this.a;
                return new npr(dwqVar19.a(), (acti) dwqVar19.au.get(), (Handler) dwqVar19.a.an.get(), (xng) dwqVar19.hk.get());
            case 1249:
                return this.a.am();
            case 1250:
                return this.a.aU();
            case 1251:
                return new npg();
            case 1252:
                dwq dwqVar20 = this.a;
                return new ygd(dwqVar20.a(), (vzc) dwqVar20.a.hY.get(), (afvn) dwqVar20.a.au.get(), (yfv) dwqVar20.hf.get(), (acvh) dwqVar20.a.ef.get(), (aadd) dwqVar20.a.K.get(), (axxc) dwqVar20.a.a.y.get(), (Executor) dwqVar20.a.h.get());
            case 1253:
                dwq dwqVar21 = this.a;
                return new hef(dwqVar21.gx(), dwqVar21.gw(), (hkl) dwqVar21.a.yP.get(), new hed((abdb) dwqVar21.a.a.aC.get(), (afvn) dwqVar21.a.au.get(), (Executor) dwqVar21.a.h.get()));
            case 1254:
                return new hey((aafo) this.a.H.get());
            case 1255:
                return new hho();
            case 1256:
                dwq dwqVar22 = this.a;
                azqb azqbVar2 = dwqVar22.f;
                azqb azqbVar3 = dwqVar22.dE;
                azqb azqbVar4 = dwqVar22.ah;
                azqb azqbVar5 = dwqVar22.H;
                dyo dyoVar4 = dwqVar22.a;
                return new iim(azqbVar2, azqbVar3, azqbVar4, azqbVar5, dyoVar4.aw, dyoVar4.ee);
            case 1257:
                return new akho((snc) this.a.a.v.get());
            case 1258:
                dwq dwqVar23 = this.a;
                return new zwj((zne) dwqVar23.lW.get(), new zwc(dwqVar23.a()), (Executor) dwqVar23.a.x.get(), (Executor) dwqVar23.a.h.get());
            case 1259:
                return new zne(this.a.a());
            case 1260:
                return new Intent(this.a.a.b.a, AudioSelectionActivity.class);
            case 1261:
                return new hpq((acvh) this.a.a.ef.get());
            case 1262:
                return new icx();
            case 1263:
                dwq dwqVar24 = this.a;
                return new ReelPlaybackErrorLogger(dwqVar24.iq(), (acrr) dwqVar24.a.aw.get(), (aeov) dwqVar24.a.hO.get(), (yni) dwqVar24.a.y.get(), (airw) dwqVar24.a.vW.get(), (aacz) dwqVar24.a.D.get());
            case 1264:
                return this.a.iq();
            case 1265:
                return new iez();
            case 1266:
                dwq dwqVar25 = this.a;
                return new hzo(dwqVar25.a(), (aafo) dwqVar25.H.get(), (yzj) dwqVar25.a.je.get(), dwqVar25.cz);
            case 1267:
                return this.a.eb();
            case 1268:
                return this.a.aS();
            case 1269:
                return new aiiv((yni) this.a.a.y.get());
            case 1270:
                dwq dwqVar26 = this.a;
                advc advcVar = (advc) dwqVar26.jC.get();
                adux aduxVar = (adux) dwqVar26.a.a.af.get();
                dxs dxsVar = dwqVar26.a.a;
                adup adupVar = new adup((adas) dxsVar.bF.c.iK.get(), (snc) dxsVar.bF.c.v.get(), Executors.newSingleThreadScheduledExecutor(new yli("passiveAuthCodeRetriever")));
                advo advoVar = (advo) dwqVar26.jB.get();
                dxs dxsVar2 = dwqVar26.a.a;
                azqb azqbVar6 = dxsVar2.aP;
                azqb azqbVar7 = dxsVar2.aQ;
                uqe uqeVar = (uqe) dxsVar2.aM.get();
                acsx cI = dwqVar26.a.cI();
                dyo dyoVar5 = dwqVar26.a;
                return new adui(advcVar, aduxVar, adupVar, advoVar, azqbVar6, azqbVar7, uqeVar, cI, dyoVar5.a.ae, (snc) dyoVar5.v.get(), (yni) dwqVar26.a.y.get());
            case 1271:
                return new ajte((ajst) this.a.mq.get());
            case 1272:
                dwq dwqVar27 = this.a;
                azqb azqbVar8 = dwqVar27.mj;
                azqb azqbVar9 = dwqVar27.mk;
                azqb azqbVar10 = dwqVar27.ml;
                azqb azqbVar11 = dwqVar27.mm;
                amup amupVar = amyc.b;
                amup k = amup.k(mnh.class, dwqVar27.mn);
                amup k2 = amup.k(fkg.class, dwqVar27.mo);
                amup k3 = amup.k(new ajtv(fkg.class, fkg.class), dwqVar27.mp);
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : k3.entrySet()) {
                    ajtw ajtwVar = (ajtw) entry.getKey();
                    hashMap.put(new jj(ajtwVar.a(), ajtwVar.b()), (azqb) entry.getValue());
                }
                ajst ajstVar = new ajst();
                ajstVar.a.c(azqbVar8);
                ajstVar.b.c(azqbVar9);
                ajstVar.c.c(azqbVar10);
                ajstVar.d.c(azqbVar11);
                ajstVar.a.b(amupVar);
                ajstVar.b.b(k);
                ajstVar.c.b(k2);
                ajstVar.d.b(hashMap);
                return ajstVar;
            case 1273:
                return new ajtr();
            case 1274:
                return new ajuc();
            case 1275:
                return new ajue();
            case 1276:
                return new ajtz();
            case 1277:
                return new mng(axot.a(this.a.mk));
            case 1278:
                return new fke(axot.a(this.a.ml));
            case 1279:
                return new fkf(axot.a(this.a.mm));
            case 1280:
                return new aksb((aksc) this.a.hV.get());
            case 1281:
                ViewGroup viewGroup = (ViewGroup) ((ViewGroup) this.a.iM.get()).findViewById(R.id.avatar_row_container);
                axzl.o(viewGroup);
                return viewGroup;
            case 1282:
                dwq dwqVar28 = this.a;
                Activity a2 = dwqVar28.a();
                aafo aafoVar = (aafo) dwqVar28.H.get();
                acsx cI2 = dwqVar28.a.cI();
                lfv lfvVar = (lfv) dwqVar28.gI.get();
                akjm akjmVar = (akjm) dwqVar28.a.zG.get();
                lez lezVar = new lez(dwqVar28.f, dwqVar28.mu, dwqVar28.L);
                lgr lgrVar = new lgr(dwqVar28.f, dwqVar28.mv, dwqVar28.L);
                azqb azqbVar12 = dwqVar28.f;
                azqb azqbVar13 = dwqVar28.H;
                dyo dyoVar6 = dwqVar28.a;
                return new lfw(a2, aafoVar, cI2, lfvVar, akjmVar, lezVar, lgrVar, new zyv(azqbVar12, azqbVar13, dyoVar6.kC, dyoVar6.dD), (wcy) dwqVar28.a.yG.get(), (wdv) dwqVar28.a.a.aS.get(), (afvn) dwqVar28.a.au.get());
            case 1283:
                dwq dwqVar29 = this.a;
                azqb azqbVar14 = dwqVar29.f;
                azqb azqbVar15 = dwqVar29.jd;
                azqb azqbVar16 = dwqVar29.H;
                dyo dyoVar7 = dwqVar29.a;
                return new lkn(azqbVar14, azqbVar15, azqbVar16, dyoVar7.zG, dyoVar7.zL);
            case 1284:
                dwq dwqVar30 = this.a;
                azqb azqbVar17 = dwqVar30.f;
                azqb azqbVar18 = dwqVar30.jd;
                azqb azqbVar19 = dwqVar30.H;
                dyo dyoVar8 = dwqVar30.a;
                return new lkt(azqbVar17, azqbVar18, azqbVar19, dyoVar8.zM, dyoVar8.zG);
            case 1285:
                dwq dwqVar31 = this.a;
                return new oiz(dwqVar31.iT, dwqVar31.ak);
            case 1286:
                return this.a.iI();
            case 1287:
                dwq dwqVar32 = this.a;
                return new jvp((YouTubePlayerOverlaysLayout) dwqVar32.dj.get(), (ahkv) dwqVar32.a.uI.get(), (xgp) dwqVar32.a.tg.get(), (wty) dwqVar32.a.tB.get(), (jyf) dwqVar32.mA.get(), (feh) dwqVar32.aV.get(), (feo) dwqVar32.ei.get(), (ahyo) dwqVar32.mB.get(), (jwj) dwqVar32.v.get(), (YouTubeControlsOverlay) dwqVar32.by.get(), (khy) dwqVar32.bs.get(), (ahqu) dwqVar32.dl.get(), (ahqy) dwqVar32.eH.get(), (ahzd) dwqVar32.mC.get(), (ahzd) dwqVar32.mD.get(), (xjz) dwqVar32.mE.get(), (jxh) dwqVar32.bT.get(), (ahrd) dwqVar32.dU.get(), (ahrf) dwqVar32.fl.get(), (nit) dwqVar32.fm.get(), (kdj) dwqVar32.f11do.get(), (xfm) dwqVar32.mF.get(), (ahyz) dwqVar32.dm.get(), (xgm) dwqVar32.bo.get(), (xfx) dwqVar32.mG.get(), (kkj) dwqVar32.mH.get(), (CreatorEndscreenOverlayPresenter) dwqVar32.eF.get(), (aict) dwqVar32.eG.get(), (aiah) dwqVar32.eK.get(), (ahqb) dwqVar32.dp.get(), (ahqt) dwqVar32.eM.get(), (jxj) dwqVar32.dY.get(), (jzp) dwqVar32.eO.get(), (aacz) dwqVar32.a.D.get(), (airw) dwqVar32.n.get(), (ahiw) dwqVar32.a.ig.get(), (zbq) dwqVar32.aG.get(), (MdxOverlaysPresenter) dwqVar32.eP.get(), (SuggestedActionsMainController) dwqVar32.bt.get(), (udt) dwqVar32.a.sa.get(), new edc((acti) dwqVar32.au.get(), dwqVar32.cQ, axoz.b(dwqVar32.cd)), null);
            case 1288:
                dwq dwqVar33 = this.a;
                return new jyf((dt) dwqVar33.s.get(), (yve) dwqVar33.a.hX.get(), (adoa) dwqVar33.a.jq.get());
            case 1289:
                return new ahzg();
            case 1290:
                dwq dwqVar34 = this.a;
                return dwqVar34.ia().a((ahqu) dwqVar34.dl.get(), new aibc());
            case 1291:
                dwq dwqVar35 = this.a;
                return dwqVar35.ia().a((YouTubeControlsOverlay) dwqVar35.by.get(), new aibc());
            case 1292:
                dwq dwqVar36 = this.a;
                return new xjz(dwqVar36.a().getResources(), (acti) dwqVar36.au.get(), (wzx) dwqVar36.a.sk.get());
            case 1293:
                return this.a.fD();
            case 1294:
                dwq dwqVar37 = this.a;
                return new xfx((kkz) dwqVar37.cc.get(), (ajmy) dwqVar37.a.kC.get(), (aafo) dwqVar37.aI.get(), (yzm) dwqVar37.B.get(), (xiw) dwqVar37.a.st.get(), (wkt) dwqVar37.a.rT.get(), (wwd) dwqVar37.a.sP.get(), (wvx) dwqVar37.a.tK.get(), (acti) dwqVar37.au.get());
            case 1295:
                dwq dwqVar38 = this.a;
                kkj kkjVar = new kkj((kkv) dwqVar38.ce.get(), (yzm) dwqVar38.B.get(), (xiw) dwqVar38.a.st.get(), (wkt) dwqVar38.a.rT.get(), (wwd) dwqVar38.a.sP.get(), (wvx) dwqVar38.a.tK.get(), (ezh) dwqVar38.A.get(), (acti) dwqVar38.au.get());
                kkjVar.a.d = kkjVar;
                return kkjVar;
            case 1296:
                dwq dwqVar39 = this.a;
                return new jvn(dwqVar39.a(), (niw) dwqVar39.ab.get(), (aafo) dwqVar39.H.get(), (acth) dwqVar39.L.get(), (ajgz) dwqVar39.cA.get());
            case 1297:
                aijc e = ((emo) this.a.ab.get()).e();
                axzl.o(e);
                return e;
            case 1298:
                dwq dwqVar40 = this.a;
                return new jvl(dwqVar40.ir(), (ezh) dwqVar40.A.get());
            case 1299:
                return this.a.in();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object a() {
        nfv nfvVar;
        aafl aaflVar;
        int i = this.b;
        switch (i) {
            case 0:
                return new Intent(this.a.a.b.a, WebViewFallbackActivity.class);
            case 1:
                return this.a.jm();
            case 2:
                return amhv.a(this.a.js(), null);
            case 3:
                return this.a.jn();
            case 4:
                return dwq.kA();
            case 5:
                dwq dwqVar = this.a;
                return new amhb((amhu) dwqVar.d.get(), dwqVar.kD());
            case 6:
                return ampq.j(this.a.jl());
            case 7:
                dwq dwqVar2 = this.a;
                final amhu amhuVar = (amhu) dwqVar2.d.get();
                amhuVar.getClass();
                return new FuturesMixinImpl(new azqb() { // from class: amfk
                    @Override // defpackage.azqb
                    public final Object get() {
                        return amhu.this.b();
                    }
                }, amhuVar.getLifecycle(), (ankx) dwqVar2.a.w.get());
            case 8:
                return this.a.a();
            case 9:
                return this.a.aT();
            case 10:
                dwq dwqVar3 = this.a;
                Activity a = dwqVar3.a();
                amup n = amup.n(MainLiveCreationActivity.class, dwqVar3.g, ReelWatchActivity.class, dwqVar3.h, ShortsCreationActivity.class, dwqVar3.i, WatchWhileActivity.class, dwqVar3.jb);
                aadd aaddVar = (aadd) dwqVar3.a.K.get();
                if (n.get(a.getClass()) != null) {
                    nfvVar = (nfv) ((azqb) n.get(a.getClass())).get();
                } else {
                    nfvVar = new nfv(aaddVar, gsh.d);
                }
                axzl.o(nfvVar);
                return nfvVar;
            case 11:
                return new nfv((aadd) this.a.a.K.get(), gsh.a);
            case 12:
                return new nfv((aadd) this.a.a.K.get(), gsh.c);
            case 13:
                return new nfv((aadd) this.a.a.K.get(), gsh.b);
            case 14:
                dwq dwqVar4 = this.a;
                final gbh gbhVar = (gbh) dwqVar4.aa.get();
                final ind i2 = gad.i();
                final emo emoVar = (emo) dwqVar4.ab.get();
                return new nfv((aadd) dwqVar4.a.K.get(), new amqo() { // from class: ohj
                    @Override // defpackage.amqo
                    public final Object get() {
                        emo emoVar2 = emo.this;
                        gbh gbhVar2 = gbhVar;
                        ind indVar = i2;
                        if (emoVar2.i()) {
                            return false;
                        }
                        if (gbhVar2.a() == null) {
                            return true;
                        }
                        return Boolean.valueOf(indVar.i(gbhVar2.a()));
                    }
                });
            case 15:
                dwq dwqVar5 = this.a;
                final azqb azqbVar = dwqVar5.ja;
                azqbVar.getClass();
                gbh gbhVar2 = (gbh) ((Optional) dwqVar5.gG.get()).orElseGet(new Supplier() { // from class: ohr
                    @Override // j$.util.function.Supplier
                    /* renamed from: get */
                    public final Object mo515get() {
                        return (gbh) azqb.this.get();
                    }
                });
                axzl.o(gbhVar2);
                return gbhVar2;
            case 16:
                dwq dwqVar6 = this.a;
                Activity a2 = dwqVar6.a();
                azqb azqbVar2 = dwqVar6.E;
                if (a2 instanceof WatchWhileActivity) {
                    return Optional.of((gbh) azqbVar2.get());
                }
                return Optional.empty();
            case 17:
                dwq dwqVar7 = this.a;
                ems F = dwqVar7.F();
                gbq gbqVar = (gbq) dwqVar7.l.get();
                ScrollSelectionController scrollSelectionController = (ScrollSelectionController) dwqVar7.m.get();
                ofu ofuVar = (ofu) dwqVar7.ak.get();
                sdb sdbVar = (sdb) dwqVar7.ee.get();
                jvc jvcVar = (jvc) dwqVar7.eg.get();
                evn evnVar = (evn) dwqVar7.iv.get();
                lnj lnjVar = (lnj) dwqVar7.dR.get();
                ois oisVar = (ois) dwqVar7.fp.get();
                fqd fqdVar = (fqd) dwqVar7.I.get();
                aadd aaddVar2 = (aadd) dwqVar7.a.K.get();
                azqb azqbVar3 = dwqVar7.ab;
                azqb azqbVar4 = dwqVar7.iV;
                azqb azqbVar5 = dwqVar7.iT;
                dyo dyoVar = dwqVar7.a;
                return new ojl(F, gbqVar, scrollSelectionController, ofuVar, sdbVar, jvcVar, evnVar, lnjVar, oisVar, fqdVar, aaddVar2, azqbVar3, azqbVar4, azqbVar5, dyoVar.kF, dyoVar.kI, gad.j(), (isd) dwqVar7.hI.get(), gad.i(), pns.l(), pku.i(), pku.j(), fyv.a(), dwqVar7.iR, (ojm) dwqVar7.fw.get(), (aacz) dwqVar7.a.D.get(), (ogl) dwqVar7.iZ.get(), null);
            case 18:
                return this.a.aN();
            case 19:
                return this.a.l();
            case 20:
                return this.a.gF();
            case 21:
                return new aafq(1);
            case 22:
                return new ScrollSelectionController();
            case 23:
                dwq dwqVar8 = this.a;
                return new ofg(dwqVar8.a(), dwqVar8.o, (ofo) dwqVar8.ir.get(), (nxh) dwqVar8.r.get(), (aacz) dwqVar8.a.D.get(), (fqj) dwqVar8.gK.get(), new ofj(dwqVar8.a(), dwqVar8.eI(), dwqVar8.eJ(), dwqVar8.eK()), (ofh) dwqVar8.is.get(), (ezh) dwqVar8.A.get(), (ntt) dwqVar8.ax.get(), (FullscreenExitController) dwqVar8.fq.get(), (WatchEngagementPanelViewContainerController) dwqVar8.it.get(), dwqVar8.gk(), (ayor) dwqVar8.a.iz.get(), (olv) dwqVar8.iu.get(), (aadd) dwqVar8.a.K.get(), null);
            case 24:
                return this.a.ir();
            case 25:
                airw airwVar = ((aidn) this.a.a.eQ.get()).a;
                axzl.o(airwVar);
                return airwVar;
            case 26:
                dwq dwqVar9 = this.a;
                return new ofo(dwqVar9.iq, (oet) dwqVar9.aF.get(), (ezh) dwqVar9.A.get(), dwqVar9.bm);
            case 27:
                return this.a.jN();
            case 28:
                return this.a.aC();
            case 29:
                dwq dwqVar10 = this.a;
                return new okd((ftl) dwqVar10.p.get(), (ezh) dwqVar10.A.get(), (yzm) dwqVar10.B.get(), (aynx) dwqVar10.C.get(), dwqVar10.dQ);
            case 30:
                return this.a.aA();
            case 31:
                dwq dwqVar11 = this.a;
                ezh ezhVar = (ezh) (amup.k(WatchWhileActivity.class, true).containsKey(dwqVar11.a().getClass()) ? dwqVar11.y.get() : dwqVar11.z.get());
                axzl.o(ezhVar);
                return ezhVar;
            case 32:
                return this.a.ah();
            case 33:
                return azpm.aI(false).aO();
            case 34:
                return new nxh();
            case 35:
                dwq dwqVar12 = this.a;
                oah oahVar = new oah(dwqVar12.v);
                ((nxh) dwqVar12.r.get()).a(oahVar);
                return oahVar;
            case 36:
                dwq dwqVar13 = this.a;
                return new jwj(dwqVar13.ir(), dwqVar13.il(), (jvo) dwqVar13.u.get());
            case 37:
                return this.a.cS();
            case 38:
                eo supportFragmentManager = ((dt) this.a.s.get()).getSupportFragmentManager();
                axzl.o(supportFragmentManager);
                return supportFragmentManager;
            case 39:
                return this.a.a();
            case 40:
                return new InlinePlaybackLifecycleController((Handler) this.a.a.an.get());
            case 41:
                return new fgx();
            case 42:
                return this.a.gm();
            case 43:
                return this.a.jw();
            case 44:
                return this.a.iB();
            case 45:
                return this.a.kz();
            case 46:
                return this.a.ka();
            case 47:
                dwq dwqVar14 = this.a;
                Collection b = szb.b(dwqVar14.kd());
                Collection a3 = szb.a(dwqVar14.kd());
                Pair create = Pair.create(new ajle(), asvz.a.getParserForType());
                axzl.o(create);
                Pair create2 = Pair.create(new ajmb(), auoi.a.getParserForType());
                axzl.o(create2);
                return sza.a(b, a3, sza.c(amup.l(asvz.class, create, ajmb.class, create2), amyg.a), dwqVar14.fr(), ampq.j((ampt) dwqVar14.a.zg.get()));
            case 48:
                return this.a.jH();
            case 49:
                return new sro();
            case 50:
                return this.a.ix();
            case 51:
                return this.a.fn();
            case 52:
                return this.a.fo();
            case 53:
                dwq dwqVar15 = this.a;
                ampq j = ampq.j((Boolean) dwqVar15.a.dR.get());
                dyo dyoVar2 = dwqVar15.a;
                return sza.k(j, dyoVar2.b.a, dwqVar15.D, ampq.j(dyoVar2.aw()));
            case 54:
                return this.a.gI();
            case 55:
                aafe g = aafi.g();
                g.c(amup.k(aphv.class, (aakm) this.a.G.get()));
                return g.a();
            case 56:
                return this.a.gW();
            case 57:
                dwq dwqVar16 = this.a;
                return new oir(dwqVar16.a(), (eyj) dwqVar16.a.wX.get(), (gbu) dwqVar16.E.get());
            case 58:
                dwq dwqVar17 = this.a;
                amum i3 = amup.i(12);
                i3.f(avvk.class, dwqVar17.O);
                i3.f(apiw.class, dwqVar17.P);
                i3.f(atfv.class, dwqVar17.Q);
                i3.f(awmt.class, dwqVar17.S);
                i3.f(aphv.class, dwqVar17.G);
                i3.f(aqsi.class, dwqVar17.T);
                i3.f(atwl.class, dwqVar17.W);
                i3.f(RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.class, dwqVar17.X);
                i3.f(ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint.class, dwqVar17.Y);
                i3.f(atwn.class, dwqVar17.Z);
                i3.f(atwm.class, dwqVar17.Z);
                i3.f(atwk.class, dwqVar17.Z);
                amup b2 = i3.b();
                aafe g2 = aafi.g();
                g2.b(b2);
                g2.d((aafo) dwqVar17.a.jd.get());
                return g2.a();
            case 59:
                dwq dwqVar18 = this.a;
                Activity a4 = dwqVar18.a();
                wxc wxcVar = (wxc) dwqVar18.a.sg.get();
                enc encVar = (enc) dwqVar18.M.get();
                final LoggingUrlsPingController loggingUrlsPingController = (LoggingUrlsPingController) dwqVar18.N.get();
                loggingUrlsPingController.getClass();
                return new eyg(a4, wxcVar, encVar, new eyf() { // from class: eyc
                    @Override // defpackage.eyf
                    public final Uri a(String str, java.util.Map map) {
                        return LoggingUrlsPingController.this.g(str, map);
                    }
                }, (ajgr) dwqVar18.a.wZ.get(), (acth) dwqVar18.L.get(), (Executor) dwqVar18.a.x.get(), (axwt) dwqVar18.a.nN.get(), (yxz) dwqVar18.a.xa.get());
            case 60:
                dwq dwqVar19 = this.a;
                return new enc((fqd) dwqVar19.I.get(), (aafo) dwqVar19.H.get(), (acth) dwqVar19.L.get());
            case 61:
                return this.a.au();
            case 62:
                dwq dwqVar20 = this.a;
                amvl j2 = amvn.j(2);
                j2.c((fqc) dwqVar20.a.wY.get());
                j2.j((Iterable) dwqVar20.f185J.get());
                return j2.g();
            case 63:
                return this.a.kh();
            case 64:
                return this.a.kk();
            case 65:
                dwq dwqVar21 = this.a;
                return new iir((ajqa) dwqVar21.a.mq.get(), dwqVar21.a.fC);
            case 66:
                dwq dwqVar22 = this.a;
                return new oip((aafo) dwqVar22.H.get(), (aafo) dwqVar22.a.sd.get(), (fqd) dwqVar22.I.get());
            case 67:
                return this.a.jE();
            case 68:
                return this.a.et();
            case 69:
                return this.a.hG();
            case 70:
                return this.a.hI();
            case 71:
                final acsx cI = this.a.a.cI();
                return new acth() { // from class: hxe
                    @Override // defpackage.acth
                    public final acti oi() {
                        return acsx.this;
                    }
                };
            case 72:
                return (ReelCameraActivity) this.a.a();
            case 73:
                return this.a.fe();
            case 74:
                return this.a.ad();
            case 75:
                return this.a.kK();
            case 76:
                return new ijs((ike) this.a.a());
            case 77:
                return this.a.iC();
            case 78:
                return new iiz((iiy) this.a.a());
            case 79:
                dwq dwqVar23 = this.a;
                wig wigVar = (wig) dwqVar23.a.xc.get();
                return new whr((wia) dwqVar23.a.xb.get(), (eo) dwqVar23.t.get(), ((Integer) dwqVar23.U.get()).intValue(), (aafo) dwqVar23.H.get());
            case 80:
                return this.a.jB();
            case 81:
                return Integer.valueOf((int) R.id.verification_edit_container);
            case 82:
                return Integer.valueOf((int) R.id.phone_verification_container);
            case 83:
                return new whs((aasl) this.a.a.xd.get());
            case 84:
                return new wht((aasp) this.a.a.xe.get());
            case 85:
                return new ijt((ijc) this.a.a.xf.get());
            case 86:
                dwq dwqVar24 = this.a;
                java.util.Map kc = dwqVar24.kc();
                amup l = amup.l(atwl.class, dwqVar24.V, RunAttestationCommandOuterClass$RunAttestationCommand.class, dwqVar24.hE);
                HashMap hashMap = new HashMap();
                hashMap.putAll(kc);
                hashMap.putAll(l);
                aafe g3 = aafi.g();
                g3.b(hashMap);
                return g3.a();
            case 87:
                dwq dwqVar25 = this.a;
                azqb azqbVar6 = dwqVar25.fL;
                azqb azqbVar7 = dwqVar25.fM;
                if (((axxh) dwqVar25.a.kG.get()).b().booleanValue()) {
                    aaflVar = (aafl) azqbVar7.get();
                } else {
                    aaflVar = (aafl) azqbVar6.get();
                }
                axzl.o(aaflVar);
                return aaflVar;
            case 88:
                dwq dwqVar26 = this.a;
                Object obj = dwqVar26.fy.get();
                dyo dyoVar3 = dwqVar26.a;
                return new gks((gin) obj, (Executor) dwqVar26.a.h.get(), (Executor) dwqVar26.a.x.get(), (fce) dwqVar26.fK.get(), dyoVar3.gS, dyoVar3.eO());
            case 89:
                return this.a.jF();
            case 90:
                dwq dwqVar27 = this.a;
                Activity a5 = dwqVar27.a();
                azqb azqbVar8 = dwqVar27.ab;
                if (!(a5 instanceof WatchWhileActivity)) {
                    return null;
                }
                return (emp) azqbVar8.get();
            case 91:
                dwq dwqVar28 = this.a;
                ems F2 = dwqVar28.F();
                azqb azqbVar9 = dwqVar28.aa;
                azqb azqbVar10 = dwqVar28.E;
                oiy oiyVar = (oiy) dwqVar28.ec.get();
                ScrollSelectionController scrollSelectionController2 = (ScrollSelectionController) dwqVar28.m.get();
                ActiveStateScrollSelectionController activeStateScrollSelectionController = (ActiveStateScrollSelectionController) dwqVar28.ed.get();
                eza ezaVar = (eza) dwqVar28.a.jF.get();
                fpg fpgVar = (fpg) dwqVar28.ad.get();
                ofu ofuVar2 = (ofu) dwqVar28.ak.get();
                ezh ezhVar2 = (ezh) dwqVar28.A.get();
                gck gckVar = (gck) dwqVar28.az.get();
                jvc jvcVar2 = (jvc) dwqVar28.eg.get();
                dyo dyoVar4 = dwqVar28.a;
                ojq ojqVar = new ojq(F2, azqbVar9, azqbVar10, oiyVar, scrollSelectionController2, activeStateScrollSelectionController, ezaVar, fpgVar, ofuVar2, ezhVar2, gckVar, jvcVar2, dyoVar4.uI, (aacz) dyoVar4.D.get(), (aadd) dwqVar28.a.K.get(), (gdi) dwqVar28.ea.get(), dwqVar28.a.wN, (ajgz) dwqVar28.cA.get(), (aara) dwqVar28.a.eL.get(), (aizb) dwqVar28.ao.get(), (lnj) dwqVar28.dR.get(), (jwj) dwqVar28.v.get(), (YouTubePlayerOverlaysLayout) dwqVar28.dj.get(), (jwa) dwqVar28.eh.get(), (yni) dwqVar28.a.y.get(), (adoa) dwqVar28.a.jq.get(), (feo) dwqVar28.ei.get(), axot.a(dwqVar28.bL), (fyy) dwqVar28.am.get(), (ahub) dwqVar28.a.rO.get(), (aiak) dwqVar28.a.xF.get(), (acti) dwqVar28.au.get(), (ntv) dwqVar28.ej.get(), axot.a(dwqVar28.ek), (jvo) dwqVar28.u.get(), dwqVar28.el, amvn.w((fdm) dwqVar28.em.get(), (fdm) dwqVar28.eS.get(), (fdm) dwqVar28.eT.get(), (fdm) dwqVar28.eU.get(), (fdm) dwqVar28.eV.get(), (fdm) dwqVar28.eW.get(), (fdm) dwqVar28.bp.get(), (fdm) dwqVar28.eX.get(), (fdm) dwqVar28.eZ.get(), (fdm) dwqVar28.fb.get(), (fdm) dwqVar28.fc.get(), (fdm) dwqVar28.ff.get(), (fdm) dwqVar28.fg.get(), (fdm) dwqVar28.fh.get(), (fdm) dwqVar28.fi.get(), (fdm) dwqVar28.fj.get(), (fdm) dwqVar28.fk.get(), (fdm) dwqVar28.fm.get(), (fdm) dwqVar28.dq.get(), (fdm) dwqVar28.fn.get(), (fdm) dwqVar28.fo.get()), (ois) dwqVar28.fp.get(), (airw) dwqVar28.n.get(), (yzm) dwqVar28.B.get(), (feh) dwqVar28.aV.get(), dwqVar28.fs, (olu) dwqVar28.fv.get(), (azpx) dwqVar28.q.get(), fyv.a(), (aiix) dwqVar28.a.fH.get(), dwqVar28.a.xL, (ghd) dwqVar28.ay.get(), dwqVar28.fe(), (ojm) dwqVar28.fw.get(), (srr) dwqVar28.dQ.get(), axot.a(dwqVar28.fx), null, null);
                ojqVar.z.g(((ayoi) dwqVar28.ba.get()).as(new ojo(ojqVar, 1)), ojqVar.s.as(new ojo(ojqVar)));
                return ojqVar;
            case 92:
                dwq dwqVar29 = this.a;
                return new oiy((oa) dwqVar29.j.get(), dwqVar29.E, dwqVar29.ab, dwqVar29.as, dwqVar29.aE, dwqVar29.a.wN, (oet) dwqVar29.aF.get(), (jvo) dwqVar29.u.get(), dwqVar29.dN, (ofu) dwqVar29.ak.get(), (ezh) dwqVar29.A.get(), (mrx) dwqVar29.dO.get(), (lnj) dwqVar29.dR.get(), (gbq) dwqVar29.l.get(), (gdi) dwqVar29.ea.get(), (ces) dwqVar29.a.fC.get(), (adof) dwqVar29.a.jO.get(), (aadd) dwqVar29.a.K.get(), (mdp) dwqVar29.eb.get());
            case 93:
                return this.a.eq();
            case 94:
                dwq dwqVar30 = this.a;
                return new fpg((Handler) dwqVar30.a.an.get(), (fpd) dwqVar30.ac.get());
            case 95:
                return new fpd();
            case 96:
                dwq dwqVar31 = this.a;
                return new akge(dwqVar31.je(), (aafo) dwqVar31.H.get(), (acth) dwqVar31.L.get());
            case 97:
                return new ajsk();
            case 98:
                dwq dwqVar32 = this.a;
                return new nge(dwqVar32.a(), (fcu) dwqVar32.a.gY.get(), (akfo) dwqVar32.af.get(), (ezf) dwqVar32.ab.get());
            case 99:
                return this.a.aY();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        int i = this.b;
        Boolean bool = null;
        boolean z = false;
        switch (i) {
            case 300:
                dwq dwqVar = this.a;
                return new kkr(axot.a(dwqVar.dc), dwqVar.iz(), dwqVar.a.cI());
            case 301:
                return this.a.iE();
            case 302:
                return new NoSoundMemoOverlay(this.a.a());
            case 303:
                return new kfq(this.a.a());
            case 304:
                return new kly(this.a.a());
            case 305:
                return this.a.dk();
            case 306:
                return new abkd(this.a.a());
            case 307:
                return this.a.hT();
            case 308:
                return this.a.dm();
            case 309:
                return this.a.dy();
            case 310:
                return this.a.du();
            case 311:
                return this.a.jd();
            case 312:
                return this.a.aW();
            case 313:
                return this.a.iU();
            case 314:
                return this.a.dv();
            case 315:
                dwq dwqVar2 = this.a;
                azqb azqbVar = dwqVar2.H;
                dyo dyoVar = dwqVar2.a;
                return new mqg(azqbVar, dyoVar.lV, dwqVar2.f, dwqVar2.dv, dyoVar.y, dyoVar.dD);
            case 316:
                dwq dwqVar3 = this.a;
                return new frr((ezh) dwqVar3.A.get(), (Handler) dwqVar3.a.an.get(), (Executor) dwqVar3.a.x.get(), (snc) dwqVar3.a.v.get(), (fqd) dwqVar3.I.get(), dwqVar3.a.xy);
            case 317:
                dwq dwqVar4 = this.a;
                azqb azqbVar2 = dwqVar4.H;
                dyo dyoVar2 = dwqVar4.a;
                return new mpu(azqbVar2, dyoVar2.lV, dwqVar4.f, dyoVar2.y, dyoVar2.dD, dyoVar2.D, dyoVar2.iz, dyoVar2.as, dyoVar2.t);
            case 318:
                return this.a.dw();
            case 319:
                dwq dwqVar5 = this.a;
                return new fow((yni) dwqVar5.a.y.get(), (snc) dwqVar5.a.v.get(), (ezh) dwqVar5.A.get(), new Handler(), (airw) dwqVar5.n.get(), (aacz) dwqVar5.a.D.get(), (fqd) dwqVar5.I.get());
            case 320:
                return this.a.ao();
            case 321:
                dwq dwqVar6 = this.a;
                return new fzs(dwqVar6.a(), (ajxz) dwqVar6.a.lV.get());
            case 322:
                return this.a.ar();
            case 323:
                return new SubscriptionNotificationOptionsDialogFragmentControllerImpl((dt) this.a.s.get());
            case 324:
                dwq dwqVar7 = this.a;
                azqb azqbVar3 = dwqVar7.s;
                azqb azqbVar4 = dwqVar7.dB;
                azqb azqbVar5 = dwqVar7.dt;
                dyo dyoVar3 = dwqVar7.a;
                return new foi(azqbVar3, azqbVar4, azqbVar5, dyoVar3.as, dwqVar7.ae, dyoVar3.eu, dwqVar7.dC, dyoVar3.dD, dyoVar3.D);
            case 325:
                return this.a.aX();
            case 326:
                return this.a.hR();
            case 327:
                return this.a.kR();
            case 328:
                return this.a.dx();
            case 329:
                return this.a.iK();
            case 330:
                dwq dwqVar8 = this.a;
                return new kgi((ezh) dwqVar8.A.get(), dwqVar8.iz(), axot.a(dwqVar8.bb), (acti) dwqVar8.au.get(), (airw) dwqVar8.n.get(), (ezd) dwqVar8.bm.get(), (axxu) dwqVar8.a.hZ.get());
            case 331:
                dwq dwqVar9 = this.a;
                return new View[]{(MediaRouteButton) dwqVar9.dH.get(), ((aaam) dwqVar9.bx.get()).a(), (TouchImageView) dwqVar9.bj.get(), (ImageView) dwqVar9.ca.get()};
            case 332:
                dwq dwqVar10 = this.a;
                MediaRouteButton c = oky.c(dwqVar10.a(), (aadd) dwqVar10.a.K.get());
                axzl.o(c);
                return c;
            case 333:
                return this.a.eM();
            case 334:
                dwq dwqVar11 = this.a;
                kgn kgnVar = new kgn((aacz) dwqVar11.a.D.get(), dwqVar11.bq);
                if (kgnVar.a) {
                    ((nml) kgnVar.b.get()).g().a(kgnVar);
                    kgnVar.d = aynx.e(kgnVar.c, ((nml) kgnVar.b.get()).h().j, new eho(18)).n().L().aj().b(0);
                } else {
                    kgnVar.d = aynx.B(true);
                }
                return kgnVar;
            case 335:
                return this.a.dp();
            case 336:
                return this.a.hX();
            case 337:
                return new NoOpTimedSyncObserver();
            case 338:
                dwq dwqVar12 = this.a;
                dyo dyoVar4 = dwqVar12.a;
                return new TimedSyncObserverImpl((airw) dwqVar12.a.fP.get(), new ahxn(dyoVar4.dD, dyoVar4.au, dwqVar12.H));
            case 339:
                dwq dwqVar13 = this.a;
                return new mrx(dwqVar13.a(), (fqd) dwqVar13.I.get(), dwqVar13.dB, dwqVar13.dP, (ezh) dwqVar13.A.get(), new mrr(dwqVar13.a.kn), dwqVar13.iK(), (fyy) dwqVar13.am.get(), (yzj) dwqVar13.a.je.get());
            case 340:
                dwq dwqVar14 = this.a;
                return new jzf(dwqVar14.f, dwqVar14.a.kC, dwqVar14.dO, 4, (short[]) null);
            case 341:
                return this.a.dS();
            case 342:
                dwq dwqVar15 = this.a;
                Object noOpPipController = ((gdh) dwqVar15.dS.get()).b() == 1 ? new NoOpPipController() : (gdi) dwqVar15.dZ.get();
                axzl.o(noOpPipController);
                return noOpPipController;
            case 343:
                return this.a.aQ();
            case 344:
                return this.a.aR();
            case 345:
                dwq dwqVar16 = this.a;
                aadd aaddVar = (aadd) dwqVar16.a.K.get();
                return new gdo((dt) dwqVar16.s.get(), dwqVar16.o, dwqVar16.A);
            case 346:
                dwq dwqVar17 = this.a;
                return new gde(dwqVar17.a(), dwqVar17.ir(), (airw) dwqVar17.n.get(), (gdn) dwqVar17.dT.get(), (ahiq) dwqVar17.dY.get(), (xgp) dwqVar17.a.tg.get());
            case 347:
                return new gdn();
            case 348:
                dwq dwqVar18 = this.a;
                ahix ahixVar = (ahix) dwqVar18.dV.get();
                jxn jxnVar = (jxn) dwqVar18.a.f15if.get();
                feu feuVar = (feu) dwqVar18.a.wt.get();
                aafo aafoVar = (aafo) dwqVar18.dW.get();
                acti actiVar = (acti) dwqVar18.au.get();
                aire ip = dwqVar18.ip();
                zah zahVar = (zah) dwqVar18.a.av.get();
                yrj yrjVar = (yrj) dwqVar18.a.as.get();
                egn egnVar = (egn) dwqVar18.a.xE.get();
                yni yniVar = (yni) dwqVar18.a.y.get();
                aadd aaddVar2 = (aadd) dwqVar18.a.K.get();
                nub nubVar = (nub) dwqVar18.dX.get();
                frr frrVar = (frr) dwqVar18.dv.get();
                ajdz S = ((airw) dwqVar18.n.get()).S();
                axzl.o(S);
                jxj jxjVar = new jxj(ahixVar, jxnVar, feuVar, aafoVar, actiVar, ip, zahVar, yrjVar, egnVar, yniVar, aaddVar2, nubVar, frrVar, S, dwqVar18.af(), dwqVar18.a.vs);
                ((aibz) dwqVar18.bs.get()).kP(jxjVar);
                ((klt) dwqVar18.dF.get()).b(jxjVar);
                ((ezh) dwqVar18.A.get()).i(jxjVar);
                return jxjVar;
            case 349:
                dwq dwqVar19 = this.a;
                return new ahix((jxh) dwqVar19.bT.get(), (ahrd) dwqVar19.dU.get());
            case 350:
                dwq dwqVar20 = this.a;
                return new ahrd(dwqVar20.a(), (ajmy) dwqVar20.a.kC.get(), (ViewGroup) dwqVar20.dk.get());
            case 351:
                return this.a.gJ();
            case 352:
                return this.a.eC();
            case 353:
                return this.a.el();
            case 354:
                return this.a.iu();
            case 355:
                return this.a.aK();
            case 356:
                dwq dwqVar21 = this.a;
                return new OfflineSlimStatusBarConnectivityController(dwqVar21.a(), (yrj) dwqVar21.a.as.get(), (sdb) dwqVar21.ee.get(), (ezh) dwqVar21.A.get(), dwqVar21.ir(), (jfq) dwqVar21.ef.get(), (afvt) dwqVar21.a.dz.get(), (afvn) dwqVar21.a.au.get(), (yni) dwqVar21.a.y.get(), (airw) dwqVar21.n.get(), (aacz) dwqVar21.a.D.get(), null);
            case 357:
                dwq dwqVar22 = this.a;
                yrj yrjVar2 = (yrj) dwqVar22.a.as.get();
                Bundle a = ((oa) dwqVar22.j.get()).getSavedStateRegistry().a("bundle_is_in_offline_mode");
                if (a != null) {
                    bool = Boolean.valueOf(a.getBoolean("is_in_offline_mode"));
                }
                if (bool != null) {
                    z = bool.booleanValue();
                } else if (!yrjVar2.o()) {
                    z = true;
                }
                return new sdb(z);
            case 358:
                dwq dwqVar23 = this.a;
                aacz aaczVar = (aacz) dwqVar23.a.D.get();
                return new jfq(dwqVar23.a(), (sdb) dwqVar23.ee.get(), (acth) dwqVar23.L.get(), null);
            case 359:
                return new jwa();
            case 360:
                return new feo();
            case 361:
                dwq dwqVar24 = this.a;
                return new ntv((ezh) dwqVar24.A.get(), (acti) dwqVar24.au.get());
            case 362:
                return this.a.cP();
            case 363:
                ocz oczVar = new ocz();
                if (((adoa) this.a.a.jq.get()).e() != null) {
                    z = true;
                }
                oczVar.b(z);
                return oczVar;
            case 364:
                return this.a.I();
            case 365:
                mcc mccVar = ((DefaultInlinePlayerControls) this.a.bH.get()).d;
                axzl.o(mccVar);
                return mccVar;
            case 366:
                dwq dwqVar25 = this.a;
                ahkv ahkvVar = (ahkv) dwqVar25.a.uI.get();
                dyo dyoVar5 = dwqVar25.a;
                return new jvy(ahkvVar, dyoVar5.wN, (yni) dyoVar5.y.get(), (jzb) dwqVar25.ep.get(), (feh) dwqVar25.aV.get(), (xfp) dwqVar25.eq.get(), (ahyz) dwqVar25.dm.get(), (ahyd) dwqVar25.es.get(), (aibi) dwqVar25.et.get(), (aicj) dwqVar25.eu.get(), (aian) dwqVar25.ex.get(), (aias) dwqVar25.ez.get(), (kfy) dwqVar25.eA.get(), (xgm) dwqVar25.bo.get(), (LiveOverlayPresenter) dwqVar25.eC.get(), (ahvu) dwqVar25.eE.get(), (CreatorEndscreenOverlayPresenter) dwqVar25.eF.get(), (aict) dwqVar25.eG.get(), (SubtitlesOverlayPresenter) dwqVar25.eJ.get(), (aiah) dwqVar25.eK.get(), (ahqb) dwqVar25.dp.get(), (ahqt) dwqVar25.eM.get(), (aiak) dwqVar25.eN.get(), (jxj) dwqVar25.dY.get(), (jzp) dwqVar25.eO.get(), (MdxOverlaysPresenter) dwqVar25.eP.get(), (kkh) dwqVar25.eQ.get(), (klz) dwqVar25.eR.get(), (NoSoundMemoOverlay) dwqVar25.df.get(), (khk) dwqVar25.aP.get(), (kfq) dwqVar25.dg.get(), (aacz) dwqVar25.a.D.get(), (airw) dwqVar25.n.get(), (abkf) dwqVar25.eD.get());
            case 367:
                dwq dwqVar26 = this.a;
                return new jzb((dt) dwqVar26.s.get(), (jyz) dwqVar26.en.get(), (jza) dwqVar26.eo.get(), (Handler) dwqVar26.a.an.get(), (aadd) dwqVar26.a.K.get(), (akfg) dwqVar26.bf.get());
            case 368:
                dp f = ((dt) this.a.s.get()).getSupportFragmentManager().f("VIDEO_QUALITIES_MENU_BOTTOM_SHEET_FRAGMENT");
                if (f != null) {
                    return (nkd) f;
                }
                return new nkd();
            case 369:
                dp f2 = ((dt) this.a.s.get()).getSupportFragmentManager().f("VIDEO_QUALITIES_QUICK_MENU_BOTTOM_SHEET_FRAGMENT");
                if (f2 != null) {
                    return (nkf) f2;
                }
                return new nkf();
            case 370:
                return this.a.fE();
            case 371:
                return this.a.hY();
            case 372:
                return this.a.cX();
            case 373:
                dp f3 = ((dt) this.a.s.get()).getSupportFragmentManager().f("AUDIO_TRACKS_MENU_BOTTOM_SHEET_FRAGMENT");
                if (f3 != null) {
                    return (nje) f3;
                }
                return new nje();
            case 374:
                dwq dwqVar27 = this.a;
                return new aibi(dwqVar27.ir(), (jyu) dwqVar27.bg.get());
            case 375:
                return this.a.hO();
            case 376:
                return this.a.m285if();
            case 377:
                dwq dwqVar28 = this.a;
                return new aian(dwqVar28.ir(), (jyk) dwqVar28.ew.get());
            case 378:
                dwq dwqVar29 = this.a;
                return new jyk((dt) dwqVar29.s.get(), (jyj) dwqVar29.ev.get());
            case 379:
                dp f4 = ((dt) this.a.s.get()).getSupportFragmentManager().f("PLAYBACK_RATE_MENU_BOTTOM_SHEET_FRAGMENT");
                if (f4 != null) {
                    return (njv) f4;
                }
                return new njv();
            case 380:
                dwq dwqVar30 = this.a;
                return new aias(dwqVar30.ir(), dwqVar30.ip(), (aiao) dwqVar30.ey.get());
            case 381:
                return this.a.ie();
            case 382:
                return new kfy((kgc) this.a.bc.get());
            case 383:
                return this.a.ic();
            case 384:
                dwq dwqVar31 = this.a;
                kjk kjkVar = new kjk((kjg) dwqVar31.bA.get(), (PlaybackLifecycleMonitor) dwqVar31.eB.get(), (feh) dwqVar31.aV.get(), (yni) dwqVar31.a.y.get(), (airw) dwqVar31.n.get(), (aacz) dwqVar31.a.D.get(), (jvo) dwqVar31.u.get());
                ezh ezhVar = (ezh) dwqVar31.A.get();
                kjkVar.b.i(kjkVar);
                kjkVar.c.a(kjkVar);
                kjkVar.g = ezhVar;
                ezhVar.i(kjkVar);
                ((ezd) dwqVar31.bm.get()).e(kjkVar);
                ((InlinePlaybackLifecycleController) dwqVar31.x.get()).l(kjkVar);
                return kjkVar;
            case 385:
                dwq dwqVar32 = this.a;
                PlaybackLifecycleMonitor playbackLifecycleMonitor = new PlaybackLifecycleMonitor(dwqVar32.ir(), (yni) dwqVar32.a.y.get(), (airw) dwqVar32.n.get(), (aacz) dwqVar32.a.D.get());
                ((ezd) dwqVar32.bm.get()).d(playbackLifecycleMonitor);
                ((feh) dwqVar32.aV.get()).a(playbackLifecycleMonitor);
                return playbackLifecycleMonitor;
            case 386:
                dwq dwqVar33 = this.a;
                kad kadVar = new kad(dwqVar33.a(), (kaa) dwqVar33.bV.get(), (ajmy) dwqVar33.a.kC.get(), (aafo) dwqVar33.aI.get(), (yzm) dwqVar33.B.get(), (afwu) dwqVar33.a.hL.get(), (afzo) dwqVar33.a.sj.get(), (acti) dwqVar33.au.get(), (ahvv) dwqVar33.a.tg.get(), (nor) dwqVar33.bw.get(), (ahzk) dwqVar33.eD.get());
                ((ahiq) dwqVar33.dY.get()).s(kadVar);
                return kadVar;
            case 387:
                return this.a.hm();
            case 388:
                return this.a.hV();
            case 389:
                return this.a.de();
            case 390:
                dwq dwqVar34 = this.a;
                dwqVar34.a();
                return new aict((aicn) dwqVar34.bB.get(), (aafo) dwqVar34.H.get(), (ajxz) dwqVar34.a.lV.get(), dwqVar34.au);
            case 391:
                dwq dwqVar35 = this.a;
                return new SubtitlesOverlayPresenter((aiau) dwqVar35.eI.get(), (aiwj) dwqVar35.a.wq.get(), (aiyx) dwqVar35.a.iS.get(), dwqVar35.it(), (Executor) dwqVar35.a.h.get(), (Executor) dwqVar35.a.x.get(), (aacz) dwqVar35.a.D.get());
            case 392:
                dwq dwqVar36 = this.a;
                return new aiat((kmm) dwqVar36.bC.get(), (aiba) dwqVar36.bD.get(), (ahqy) dwqVar36.eH.get());
            case 393:
                dwq dwqVar37 = this.a;
                return new ahqy((ViewGroup) dwqVar37.dk.get(), dwqVar37.a());
            case 394:
                dwq dwqVar38 = this.a;
                return new aiah((aiaj) dwqVar38.bU.get(), dwqVar38.a(), ampq.j((yve) dwqVar38.a.hX.get()), (afkf) dwqVar38.a.gD.get(), (afst) dwqVar38.a.hx.get(), (yrj) dwqVar38.a.as.get(), (zdp) dwqVar38.a.hN.get(), dwqVar38.a.dS(), dwqVar38.a.gq(), dwqVar38.a.gp(), dwqVar38.a.gr(), dwqVar38.a.jH(), (airw) dwqVar38.n.get());
            case 395:
                dwq dwqVar39 = this.a;
                TouchImageView touchImageView = (TouchImageView) LayoutInflater.from(dwqVar39.a()).inflate(R.layout.vr_button, (ViewGroup) null);
                ((YouTubeControlsOverlay) dwqVar39.by.get()).d.a(touchImageView);
                return new ahqt(dwqVar39.a.wN, new ahqx(touchImageView), (jzd) dwqVar39.eL.get());
            case 396:
                dwq dwqVar40 = this.a;
                return new jzd(dwqVar40.a(), (acti) dwqVar40.au.get());
            case 397:
                dwq dwqVar41 = this.a;
                dwqVar41.ir();
                return new aiak(dwqVar41.a());
            case 398:
                return this.a.dd();
            case 399:
                return this.a.cI();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        int i = this.b;
        switch (i) {
            case 1100:
                return this.a.eE();
            case 1101:
                dwq dwqVar = this.a;
                dwqVar.a();
                YouTubeInfoCardOverlayPresenter youTubeInfoCardOverlayPresenter = new YouTubeInfoCardOverlayPresenter((aaai) dwqVar.bW.get(), (yzm) dwqVar.B.get(), (aaar) dwqVar.dn.get(), (aaan) dwqVar.a.zo.get(), (xgp) dwqVar.a.tg.get(), (ahvu) dwqVar.eE.get(), (yni) dwqVar.a.y.get());
                ((aaar) dwqVar.dn.get()).u = youTubeInfoCardOverlayPresenter;
                ((klt) dwqVar.dF.get()).b(youTubeInfoCardOverlayPresenter);
                return youTubeInfoCardOverlayPresenter;
            case 1102:
                dwq dwqVar2 = this.a;
                MiniPlayerErrorOverlay miniPlayerErrorOverlay = new MiniPlayerErrorOverlay(dwqVar2.a(), (airw) dwqVar2.n.get());
                ((YouTubePlayerOverlaysLayout) dwqVar2.dj.get()).pM(miniPlayerErrorOverlay);
                return miniPlayerErrorOverlay;
            case 1103:
                dwq dwqVar3 = this.a;
                PipPaidProductBadgeOverlay pipPaidProductBadgeOverlay = new PipPaidProductBadgeOverlay(dwqVar3.a(), (airw) dwqVar3.n.get(), (Handler) dwqVar3.a.an.get(), (snc) dwqVar3.a.v.get(), (aadd) dwqVar3.a.K.get());
                ((YouTubePlayerOverlaysLayout) dwqVar3.dj.get()).pM(pipPaidProductBadgeOverlay);
                return pipPaidProductBadgeOverlay;
            case 1104:
                return this.a.al();
            case 1105:
                dwq dwqVar4 = this.a;
                return new MainAppEngagementPanelDataProvider(dwqVar4.a(), (tdb) dwqVar4.a.nO.get(), (nmu) dwqVar4.fW.get(), (ezh) dwqVar4.A.get());
            case 1106:
                dwq dwqVar5 = this.a;
                return new UpForFullController(dwqVar5.a(), (aadd) dwqVar5.a.K.get(), (airw) dwqVar5.n.get());
            case 1107:
                return this.a.df();
            case 1108:
                dwq dwqVar6 = this.a;
                return new WatchLayoutStateMonitor((wlg) dwqVar6.a.sx.get(), (xgp) dwqVar6.a.tg.get(), dwqVar6.a(), (nzy) dwqVar6.gO.get());
            case 1109:
                dwq dwqVar7 = this.a;
                return new SingleLoopMenuItemController(dwqVar7.a(), (PlaybackLoopShuffleMonitor) dwqVar7.fd.get(), (airw) dwqVar7.n.get(), (acti) dwqVar7.au.get());
            case 1110:
                dwq dwqVar8 = this.a;
                return new SingleLoopPlaybackMonitor(dwqVar8.a(), (PlaybackLoopShuffleMonitor) dwqVar8.fd.get(), (fgo) dwqVar8.a.xz.get(), (akfg) dwqVar8.bf.get(), (airw) dwqVar8.n.get(), (acti) dwqVar8.au.get(), (aadd) dwqVar8.a.K.get());
            case 1111:
                return new LayerableFilterEntityController((tdb) this.a.a.nO.get());
            case 1112:
                dwq dwqVar9 = this.a;
                return new VideoStageMonitor((airw) dwqVar9.n.get(), (nun) dwqVar9.gM.get(), (aibz) dwqVar9.bs.get());
            case 1113:
                dwq dwqVar10 = this.a;
                return new MusicDeeplinkMenuItemController(dwqVar10.a(), (airw) dwqVar10.n.get(), (aafo) dwqVar10.H.get(), (ajxz) dwqVar10.a.lV.get());
            case 1114:
                dwq dwqVar11 = this.a;
                return new TimebarAccessibilityController((ffo) dwqVar11.bs.get(), (ahxv) dwqVar11.a.xl.get(), (kbl) dwqVar11.bh.get());
            case 1115:
                dwq dwqVar12 = this.a;
                return new TvSignInControllerImpl((adbe) dwqVar12.a.jb.get(), (yni) dwqVar12.a.y.get(), (acrr) dwqVar12.a.aw.get(), dwqVar12.a.hy(), (wal) dwqVar12.a.au.get(), (afvn) dwqVar12.a.au.get(), (acwu) dwqVar12.a.iH.get(), dwqVar12.a.a.ae, (dt) dwqVar12.s.get(), (advo) dwqVar12.jB.get(), (adoa) dwqVar12.a.jq.get(), (adux) dwqVar12.a.a.af.get(), (Executor) dwqVar12.a.x.get(), (ScheduledExecutorService) dwqVar12.a.h.get());
            case 1116:
                dwq dwqVar13 = this.a;
                return new advo(dwqVar13.a(), (akfg) dwqVar13.fF.get(), (acth) dwqVar13.L.get());
            case 1117:
                dwq dwqVar14 = this.a;
                return new kjv((dt) dwqVar14.s.get(), (kjn) dwqVar14.a.a.ag.get(), dwqVar14.a.aj(), (aacz) dwqVar14.a.D.get(), (airw) dwqVar14.n.get(), (akfd) dwqVar14.gT.get(), (snc) dwqVar14.a.v.get(), (acti) dwqVar14.au.get());
            case 1118:
                return this.a.jJ();
            case 1119:
                return new kma();
            case 1120:
                dwq dwqVar15 = this.a;
                return new PlayerResponseServiceEndpointListener((airw) dwqVar15.n.get(), (aafo) dwqVar15.H.get());
            case 1121:
                return this.a.kn();
            case 1122:
                dwq dwqVar16 = this.a;
                final ajpf ajpfVar = new ajpf(dwqVar16.a(), (SharedPreferences) dwqVar16.a.t.get(), (actp) dwqVar16.a.fh.get());
                return new f(ajpfVar) { // from class: com.google.android.libraries.youtube.rendering.logging.InteractionLoggingOverlayController$Observer
                    private final ajpf a;

                    {
                        this.a = ajpfVar;
                    }

                    @Override // defpackage.f, defpackage.g
                    public final /* synthetic */ void kG(apy apyVar) {
                    }

                    @Override // defpackage.f, defpackage.g
                    public final /* synthetic */ void lc(apy apyVar) {
                    }

                    @Override // defpackage.f, defpackage.g
                    public final void ld(apy apyVar) {
                        ajpf ajpfVar2 = this.a;
                        ajpfVar2.a.c.remove(ajpfVar2);
                    }

                    @Override // defpackage.g
                    public final /* synthetic */ void nA(apy apyVar) {
                    }

                    @Override // defpackage.g
                    public final /* synthetic */ void nv(apy apyVar) {
                    }

                    @Override // defpackage.f, defpackage.g
                    public final void nz(apy apyVar) {
                        ajpf ajpfVar2 = this.a;
                        ajpfVar2.a.c.add(ajpfVar2);
                    }
                };
            case 1123:
                return this.a.ki();
            case 1124:
                dwq dwqVar17 = this.a;
                return new ilx(dwqVar17.a(), (aafo) dwqVar17.H.get(), (ajmy) dwqVar17.a.kC.get());
            case 1125:
                return this.a.cw();
            case 1126:
                return amvn.r(new hkh((hhl) this.a.jH.get()));
            case 1127:
                dyo dyoVar = this.a.a;
                return new hhl(dyoVar.b.a, (acse) dyoVar.hg.get());
            case 1128:
                return new iln(this.a.iV());
            case 1129:
                return this.a.jf();
            case 1130:
                return new apwt();
            case 1131:
                return this.a.dH();
            case 1132:
                dwq dwqVar18 = this.a;
                return new lgm(dwqVar18.a(), (fcl) dwqVar18.a.kI.get(), (SettingsDataAccess) dwqVar18.jt.get());
            case 1133:
                dwq dwqVar19 = this.a;
                return new isc((oa) dwqVar19.j.get(), dwqVar19.gk(), (ViewGroup) ((ViewGroup) dwqVar19.jN.get()).findViewById(R.id.settings_selection_detail_parent_container), dwqVar19.cA());
            case 1134:
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.a.a()).inflate(R.layout.new_settings_with_toolbar, (ViewGroup) null);
                axzl.o(viewGroup);
                return viewGroup;
            case 1135:
                return this.a.dM();
            case 1136:
                return this.a.iP();
            case 1137:
                return new ajxq(2);
            case 1138:
                return new ajxq(2);
            case 1139:
                return new fqh();
            case 1140:
                return new mer((gbq) this.a.l.get());
            case 1141:
                return this.a.aL();
            case 1142:
                dwq dwqVar20 = this.a;
                afvn afvnVar = (afvn) dwqVar20.a.au.get();
                wpu wpuVar = (wpu) dwqVar20.a.vn.get();
                dxs dxsVar = dwqVar20.a.a;
                return new adfa(afvnVar, (aczr) dwqVar20.a.bg.get(), (eo) dwqVar20.t.get(), dxsVar.an, dxsVar.ao);
            case 1143:
                return this.a.dY();
            case 1144:
                return this.a.ep();
            case 1145:
                Activity a = this.a.a();
                Configuration configuration = new Configuration();
                configuration.uiMode = (configuration.uiMode & (-49)) | 32;
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(a, 2132083882);
                contextThemeWrapper.applyOverrideConfiguration(configuration);
                return contextThemeWrapper;
            case 1146:
                return this.a.c();
            case 1147:
                return this.a.hS();
            case 1148:
                return this.a.dQ();
            case 1149:
                return this.a.dR();
            case 1150:
                dwq dwqVar21 = this.a;
                return new ooa((aacz) dwqVar21.a.D.get(), (ony) dwqVar21.a.lC.get(), dwqVar21.il(), axot.a(dwqVar21.jZ), axot.a(dwqVar21.a.a.aq), (ayor) dwqVar21.a.iz.get());
            case 1151:
                dwq dwqVar22 = this.a;
                return new onj((ony) dwqVar22.a.lC.get(), (ooc) dwqVar22.a.a.ap.get(), (aacz) dwqVar22.a.D.get(), (yni) dwqVar22.a.y.get(), (ezh) dwqVar22.A.get(), (sdb) dwqVar22.ee.get(), (adoa) dwqVar22.a.jq.get(), (gck) dwqVar22.az.get(), (ofu) dwqVar22.ak.get(), dwqVar22.ir(), (aafo) dwqVar22.H.get(), (Handler) dwqVar22.a.an.get(), (ayor) dwqVar22.a.iz.get(), null);
            case 1152:
                return this.a.dW();
            case 1153:
                dwq dwqVar23 = this.a;
                return new ltn(dwqVar23.a(), (yni) dwqVar23.a.y.get(), (akfd) dwqVar23.gT.get(), dwqVar23.o, (airw) dwqVar23.n.get(), (aacz) dwqVar23.a.D.get(), (yve) dwqVar23.a.a.ar.get(), (apy) dwqVar23.s.get());
            case 1154:
                dwq dwqVar24 = this.a;
                return new lrt((dt) dwqVar24.s.get(), (ajft) dwqVar24.a.uN.get(), dwqVar24.hZ, new fna((aafo) dwqVar24.H.get(), (acti) dwqVar24.au.get(), (yrj) dwqVar24.a.as.get(), (snc) dwqVar24.a.v.get(), (SharedPreferences) dwqVar24.a.t.get(), (akfg) dwqVar24.fF.get()), (acti) dwqVar24.au.get());
            case 1155:
                return this.a.dP();
            case 1156:
                dwq dwqVar25 = this.a;
                return new fpt((acrr) dwqVar25.a.aw.get(), dwqVar25.aD(), (Handler) dwqVar25.a.an.get(), (akfd) dwqVar25.gT.get(), (fpv) dwqVar25.kf.get(), (adbe) dwqVar25.a.jb.get(), dwqVar25.hf());
            case 1157:
                dwq dwqVar26 = this.a;
                return new fpv((yqw) dwqVar26.a.fB.get(), dwqVar26.a.iN);
            case 1158:
                dwq dwqVar27 = this.a;
                return new oje(dwqVar27.a(), (gbq) dwqVar27.l.get(), (ezh) dwqVar27.A.get(), dwqVar27.aE, (olv) dwqVar27.kh.get(), dwqVar27.gk(), (aadd) dwqVar27.a.K.get(), null);
            case 1159:
                return new olv((iyt) this.a.ek.get());
            case 1160:
                dwq dwqVar28 = this.a;
                return new ojz((oa) dwqVar28.j.get(), (ydq) dwqVar28.a.xJ.get(), dwqVar28.a.kE);
            case 1161:
                dwq dwqVar29 = this.a;
                oa oaVar = (oa) dwqVar29.j.get();
                yni yniVar = (yni) dwqVar29.a.y.get();
                azqb azqbVar = dwqVar29.ee;
                yzv yzvVar = (yzv) dwqVar29.a.jc.get();
                jvc jvcVar = (jvc) dwqVar29.eg.get();
                azqb azqbVar2 = dwqVar29.kk;
                dyo dyoVar2 = dwqVar29.a;
                azqb azqbVar3 = dyoVar2.pd;
                azqb azqbVar4 = dyoVar2.a.as;
                joh johVar = (joh) dyoVar2.xN.get();
                dyo dyoVar3 = dwqVar29.a;
                return new ojg(oaVar, yniVar, azqbVar, yzvVar, jvcVar, azqbVar2, azqbVar3, azqbVar4, johVar, dyoVar3.a.at, dyoVar3.zJ, (acth) dwqVar29.L.get());
            case 1162:
                dwq dwqVar30 = this.a;
                return new jej((dt) dwqVar30.s.get(), (akfg) dwqVar30.fF.get(), (fcu) dwqVar30.a.gY.get());
            case 1163:
                dwq dwqVar31 = this.a;
                aacz aaczVar = (aacz) dwqVar31.a.D.get();
                akfg akfgVar = (akfg) dwqVar31.bf.get();
                hve hveVar = (hve) dwqVar31.a.ry.get();
                return new ojv(aaczVar, akfgVar, (fnk) dwqVar31.a.rA.get(), (snc) dwqVar31.a.v.get(), (acrr) dwqVar31.a.aw.get(), (fnf) dwqVar31.a.rB.get(), (yni) dwqVar31.a.y.get(), (dt) dwqVar31.s.get());
            case 1164:
                dwq dwqVar32 = this.a;
                WatchWhileActivity fe = dwqVar32.fe();
                aacz aaczVar2 = (aacz) dwqVar32.a.D.get();
                fvf fvfVar = (fvf) dwqVar32.bf.get();
                fqd fqdVar = (fqd) dwqVar32.I.get();
                gfu gfuVar = (gfu) dwqVar32.a.eA.get();
                acth acthVar = (acth) dwqVar32.L.get();
                return new lrw(fe, fe, aaczVar2, fvfVar, fqdVar, gfuVar, (yve) dwqVar32.a.ez.get());
            case 1165:
                return this.a.dT();
            case 1166:
                return this.a.fb();
            case 1167:
                return this.a.z();
            case 1168:
                return this.a.gk();
            case 1169:
                return new mix();
            case 1170:
                dwq dwqVar33 = this.a;
                return amvn.r(new oga((aacz) dwqVar33.a.D.get(), (YouTubePlayerOverlaysLayout) dwqVar33.dj.get(), axot.a(dwqVar33.di)));
            case 1171:
                dwq dwqVar34 = this.a;
                return new oji((StartupSignalStream) dwqVar34.jo.get(), (aacz) dwqVar34.a.D.get(), dwqVar34.gk(), (ayor) dwqVar34.a.iz.get());
            case 1172:
                dwq dwqVar35 = this.a;
                yni yniVar2 = (yni) dwqVar35.a.y.get();
                dyo dyoVar4 = dwqVar35.a;
                azqb azqbVar5 = dyoVar4.jB;
                azqb azqbVar6 = dyoVar4.jC;
                ixe l = gad.l();
                adhh adhhVar = (adhh) dwqVar35.a.a.aw.get();
                adoa adoaVar = (adoa) dwqVar35.a.jq.get();
                dyo dyoVar5 = dwqVar35.a;
                return new adft(yniVar2, azqbVar5, azqbVar6, l, adhhVar, adoaVar, dyoVar5.jT, (acyz) dyoVar5.jw.get(), (aczd) dwqVar35.a.kj.get(), (acwu) dwqVar35.a.iH.get(), (acwn) dwqVar35.a.mz.get(), (mdv) dwqVar35.jV());
            case 1173:
                dwq dwqVar36 = this.a;
                return new iwb((adft) dwqVar36.kv.get(), (iwa) dwqVar36.ix.get());
            case 1174:
                dwq dwqVar37 = this.a;
                dyo dyoVar6 = dwqVar37.a;
                return new ngb(dwqVar37.a(), (oja) dwqVar37.ky.get(), (fpg) dwqVar37.ad.get(), (iwa) dwqVar37.ix.get(), dyoVar6.jB, dyoVar6.jT);
            case 1175:
                dwq dwqVar38 = this.a;
                Activity a2 = dwqVar38.a();
                azqb azqbVar7 = dwqVar38.kx;
                if (!(a2 instanceof WatchWhileActivity)) {
                    return null;
                }
                return (oja) azqbVar7.get();
            case 1176:
                dwq dwqVar39 = this.a;
                return new oja(dwqVar39.iR, (emo) dwqVar39.ab.get());
            case 1177:
                dwq dwqVar40 = this.a;
                return new ogp(axot.a(dwqVar40.kA), (aacz) dwqVar40.a.D.get(), dwqVar40.F(), (StartupSignalStream) dwqVar40.jo.get(), dwqVar40.gk(), (SharedPreferences) dwqVar40.a.t.get());
            case 1178:
                return this.a.fd();
            case 1179:
                return this.a.F();
            case 1180:
                WebViewFallbackActivity webViewFallbackActivity = (WebViewFallbackActivity) this.a.a();
                webViewFallbackActivity.setContentView(R.layout.web_view_fallback_activity);
                return webViewFallbackActivity;
            case 1181:
                nj supportActionBar = ((oa) this.a.j.get()).getSupportActionBar();
                supportActionBar.getClass();
                return new olz(supportActionBar);
            case 1182:
                ViewGroup viewGroup2 = (ViewGroup) ((WebViewFallbackActivity) this.a.kC.get()).findViewById(R.id.web_view_custom_view_container);
                axzl.o(viewGroup2);
                return new omh(viewGroup2);
            case 1183:
                dwq dwqVar41 = this.a;
                Object obj = dwqVar41.kI.get();
                omj p = gad.p();
                omj p2 = gad.p();
                CookieManager q = gad.q();
                URI create = URI.create(((omq) dwqVar41.kI.get()).d());
                axzl.o(create);
                return new omn((omq) obj, p, p2, new omu(q, create, dwqVar41.kJ), (Executor) dwqVar41.a.x.get());
            case 1184:
                dwq dwqVar42 = this.a;
                Object obj2 = dwqVar42.kF.get();
                azqb azqbVar8 = dwqVar42.kG;
                azqb azqbVar9 = dwqVar42.kH;
                if (true == ((omc) obj2).a) {
                    azqbVar8 = azqbVar9;
                }
                omq omqVar = (omq) azqbVar8.get();
                axzl.o(omqVar);
                return omqVar;
            case 1185:
                return this.a.jD();
            case 1186:
                return new omp((aadd) this.a.a.K.get());
            case 1187:
                return new omo();
            case 1188:
                Locale locale = ((WebViewFallbackActivity) this.a.kC.get()).getResources().getConfiguration().locale;
                axzl.o(locale);
                return locale;
            case 1189:
                dwq dwqVar43 = this.a;
                WebView o = dwqVar43.o();
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ((WebViewFallbackActivity) dwqVar43.kC.get()).findViewById(R.id.web_view_refresh_layout);
                axzl.o(swipeRefreshLayout);
                return new onb(o, swipeRefreshLayout, (omn) dwqVar43.kK.get());
            case 1190:
                return this.a.a.ap().a();
            case 1191:
                dwq dwqVar44 = this.a;
                return tfq.h(dwqVar44.a(), dwqVar44.ke());
            case 1192:
                wiy wiyVar = (wiy) ((EditVideoActivity) this.a.a()).getSupportFragmentManager().f("verification_fragment_tag");
                axzl.o(wiyVar);
                return wiyVar;
            case 1193:
                wiy wiyVar2 = (wiy) this.a.hB().getSupportFragmentManager().f("LIVE_ENABLEMENT_FRAGMENT_NAME");
                axzl.o(wiyVar2);
                return wiyVar2;
            case 1194:
                wiy wiyVar3 = (wiy) ((oa) this.a.a()).getSupportFragmentManager().f("verification_fragment_tag");
                axzl.o(wiyVar3);
                return wiyVar3;
            case 1195:
                wiy wiyVar4 = (wiy) this.a.cx().getSupportFragmentManager().f("verificationFragmentTag");
                axzl.o(wiyVar4);
                return wiyVar4;
            case 1196:
                wiy wiyVar5 = (wiy) this.a.hB().getSupportFragmentManager().f("LIVE_ENABLEMENT_FRAGMENT_NAME");
                axzl.o(wiyVar5);
                return wiyVar5;
            case 1197:
                return new agdk(this.a.kO);
            case 1198:
                return new agdl(this.a.a.mp);
            case 1199:
                return this.a.jp();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        int i = this.b;
        switch (i) {
            case 700:
                return new exv(this.a.gS, 10, (short[][]) null);
            case 701:
                dwq dwqVar = this.a;
                return new wcb((aafo) dwqVar.H.get(), (Handler) dwqVar.a.an.get(), (wdc) dwqVar.a.yG.get(), dwqVar.a());
            case 702:
                dwq dwqVar2 = this.a;
                return new isz((acth) dwqVar2.L.get(), dwqVar2.bc(), (ggk) dwqVar2.aq.get());
            case 703:
                dwq dwqVar3 = this.a;
                return new abjt(dwqVar3.a(), dwqVar3.hh(), (ajmr) dwqVar3.a.kz.get(), (aafo) dwqVar3.H.get(), dwqVar3.a.cI());
            case 704:
                dwq dwqVar4 = this.a;
                return new abju(dwqVar4.a(), (acth) dwqVar4.L.get());
            case 705:
                dwq dwqVar5 = this.a;
                return new fwh((MealbarPromoController) dwqVar5.gV.get(), (acth) dwqVar5.L.get());
            case 706:
                dwq dwqVar6 = this.a;
                return new MealbarPromoController(dwqVar6.a(), (acti) dwqVar6.au.get(), (akfd) dwqVar6.gT.get(), new fuw(dwqVar6.H, dwqVar6.a.v, dwqVar6.L), dwqVar6.aD(), (yni) dwqVar6.a.y.get(), (airw) dwqVar6.n.get(), (aacz) dwqVar6.a.D.get(), dwqVar6.iV(), (ezh) dwqVar6.A.get(), dwqVar6.jb(), dwqVar6.em(), (fuq) dwqVar6.gU.get());
            case 707:
                dwq dwqVar7 = this.a;
                return new fun(dwqVar7.aB(), (Handler) dwqVar7.a.an.get(), (ajmy) dwqVar7.a.kC.get());
            case 708:
                dwq dwqVar8 = this.a;
                return new fuq((aafo) dwqVar8.H.get(), (acth) dwqVar8.L.get(), dwqVar8.jb(), (srr) dwqVar8.dQ.get());
            case 709:
                return new erv((SubscriptionNotificationOptionsDialogFragmentControllerImpl) this.a.dA.get(), 1);
            case 710:
                return new gnx((yni) this.a.a.y.get(), 3, (char[]) null);
            case 711:
                return new erv((SubscriptionNotificationOptionsDialogFragmentControllerImpl) this.a.dA.get());
            case 712:
                dwq dwqVar9 = this.a;
                return new fwj(dwqVar9.a(), (HatsController) dwqVar9.gu.get(), new fwk(dwqVar9.a()));
            case 713:
                dwq dwqVar10 = this.a;
                return new erw((akfc) dwqVar10.dt.get(), (acth) dwqVar10.L.get(), (akfw) dwqVar10.gX.get());
            case 714:
                dwq dwqVar11 = this.a;
                ggs ggsVar = (ggs) dwqVar11.a.yH.get();
                return new akfw((akge) dwqVar11.af.get(), (ajsk) dwqVar11.ae.get(), (ajyz) dwqVar11.gW.get());
            case 715:
                return new ajyz();
            case 716:
                dwq dwqVar12 = this.a;
                return new ebc((dt) dwqVar12.s.get(), (afwc) dwqVar12.a.vo.get(), (afvn) dwqVar12.a.au.get(), (afvt) dwqVar12.a.dz.get(), (wge) dwqVar12.a.mH.get(), (wea) dwqVar12.a.I.get(), (Executor) dwqVar12.a.h.get());
            case 717:
                dwq dwqVar13 = this.a;
                return new ebe((afwc) dwqVar13.a.vo.get(), (afvt) dwqVar13.a.dz.get(), (aafo) dwqVar13.H.get(), (dt) dwqVar13.s.get());
            case 718:
                return new esd((aafo) this.a.H.get(), 1);
            case 719:
                return new esg(this.a.a.b.a);
            case 720:
                dwq dwqVar14 = this.a;
                return new esb((abdq) dwqVar14.gY.get(), (yzj) dwqVar14.a.je.get(), (aafo) dwqVar14.H.get(), (Executor) dwqVar14.a.x.get(), (dt) dwqVar14.s.get(), (aagi) dwqVar14.a.dD.get(), (afvn) dwqVar14.a.au.get(), dwqVar14.a.cI());
            case 721:
                dwq dwqVar15 = this.a;
                return new abdq((aaqj) dwqVar15.a.er.get(), (aaqf) dwqVar15.a.eV.get(), (afvn) dwqVar15.a.au.get(), (yqw) dwqVar15.a.fB.get());
            case 722:
                dwq dwqVar16 = this.a;
                return new gnb((aagi) dwqVar16.a.dD.get(), (afvn) dwqVar16.a.au.get(), dwqVar16.ab, (aizb) dwqVar16.ao.get(), (ezh) dwqVar16.A.get());
            case 723:
                return new exv(this.a.a.aw, 4, (short[]) null);
            case 724:
                return new ahwk((ahwz) this.a.aT.get());
            case 725:
                return this.a.kL();
            case 726:
                dwq dwqVar17 = this.a;
                return new yco((ydl) dwqVar17.gZ.get(), (ydq) dwqVar17.a.xJ.get());
            case 727:
                return this.a.gh();
            case 728:
                dwq dwqVar18 = this.a;
                return new yda(dwqVar18.a(), (aafo) dwqVar18.H.get(), new abeq((aaqj) dwqVar18.a.er.get(), (aaqf) dwqVar18.a.eV.get(), (afvn) dwqVar18.a.au.get(), (yqw) dwqVar18.a.fD.get()), (ydo) dwqVar18.ha.get(), (yzj) dwqVar18.a.je.get(), (Executor) dwqVar18.a.x.get());
            case 729:
                dwq dwqVar19 = this.a;
                dt dtVar = (dt) dwqVar19.s.get();
                dyo dyoVar = dwqVar19.a;
                return new ydo(dtVar, dyoVar.r, (vzc) dyoVar.hY.get(), (afvn) dwqVar19.a.au.get(), dwqVar19.a.b.a);
            case 730:
                dwq dwqVar20 = this.a;
                return new gyl(dwqVar20.a(), (airr) dwqVar20.a.fO.get());
            case 731:
                dwq dwqVar21 = this.a;
                return new hya((yrj) dwqVar21.a.as.get(), (lmo) dwqVar21.a.jc.get(), (igr) dwqVar21.hc.get());
            case 732:
                dwq dwqVar22 = this.a;
                return new igr((eo) dwqVar22.t.get(), dwqVar22.h(), dwqVar22.iA(), dwqVar22.iz(), (aafo) dwqVar22.H.get(), (iee) dwqVar22.hb.get(), (acth) dwqVar22.L.get(), Optional.of((ajgz) dwqVar22.cA.get()), dwqVar22.a() instanceof ReelWatchActivity);
            case 733:
                dwq dwqVar23 = this.a;
                return new iee(dwqVar23.iq(), dwqVar23.jA(), new ich((ibm) dwqVar23.gr.get()), (aadd) dwqVar23.a.K.get());
            case 734:
                return new hxw((igr) this.a.hc.get());
            case 735:
                return new enh((mas) this.a.he.get());
            case 736:
                dwq dwqVar24 = this.a;
                azqb azqbVar = dwqVar24.hd;
                airr ir = dwqVar24.ir();
                apdl n = xrz.n((aacz) dwqVar24.a.D.get());
                if (n != null && n.m) {
                    return new mas(azqbVar, ir);
                }
                return null;
            case 737:
                return new maq(this.a.a());
            case 738:
                return new enh((mas) this.a.he.get(), 1);
            case 739:
                dwq dwqVar25 = this.a;
                return new yfs(dwqVar25.a(), (aafo) dwqVar25.H.get(), new abeg((aaqj) dwqVar25.a.er.get(), (aaqf) dwqVar25.a.eV.get(), (afvn) dwqVar25.a.au.get(), (yqw) dwqVar25.a.fD.get()), (aagi) dwqVar25.a.dD.get(), (yzj) dwqVar25.a.je.get(), (acth) dwqVar25.L.get(), (Executor) dwqVar25.a.x.get());
            case 740:
                return new ygf((yfv) this.a.hf.get());
            case 741:
                dwq dwqVar26 = this.a;
                return new yfv((dt) dwqVar26.s.get(), (vzc) dwqVar26.a.hY.get(), (afvn) dwqVar26.a.au.get(), (ankw) dwqVar26.a.h.get());
            case 742:
                return new hyk((gts) this.a.a.me.get(), 1);
            case 743:
                return new hyk((gts) this.a.a.me.get());
            case 744:
                return new acsg((acsf) this.a.a.hg.get());
            case 745:
                return new xom((xse) this.a.a.yJ.get(), 1);
            case 746:
                return new xom((xse) this.a.a.yJ.get());
            case 747:
                return new hxp((igq) this.a.hj.get());
            case 748:
                dwq dwqVar27 = this.a;
                eo eoVar = (eo) dwqVar27.t.get();
                Context h = dwqVar27.h();
                aafo aafoVar = (aafo) dwqVar27.H.get();
                aath aathVar = (aath) dwqVar27.a.kn.get();
                zjb zjbVar = (zjb) dwqVar27.a.mm.get();
                aacz aaczVar = (aacz) dwqVar27.a.D.get();
                aadd aaddVar = (aadd) dwqVar27.a.K.get();
                dyo dyoVar2 = dwqVar27.a;
                return new igq(eoVar, h, aafoVar, new hqj(aathVar, zjbVar, aaczVar, aaddVar, dyoVar2.lS, dyoVar2.as, (ite) dyoVar2.oj.get()), (acth) dwqVar27.L.get(), (ajyi) dwqVar27.ah.get(), dwqVar27.iT(), dwqVar27.aU(), (aath) dwqVar27.a.kn.get(), dwqVar27.iH(), (tdu) dwqVar27.a.xx.get(), (aapv) dwqVar27.a.eq.get(), (afvn) dwqVar27.a.au.get());
            case 749:
                return new ajyx();
            case 750:
                return this.a.fr();
            case 751:
                return new eci((wlz) this.a.a.ur.get());
            case 752:
                dwq dwqVar28 = this.a;
                return new hyf((yrj) dwqVar28.a.as.get(), (lmo) dwqVar28.a.jc.get(), (igq) dwqVar28.hj.get());
            case 753:
                return new zif((zin) this.a.a.eE.get());
            case 754:
                return new ahxq(this.a.hX());
            case 755:
                return this.a.D();
            case 756:
                return gad.h((hyx) this.a.hl.get());
            case 757:
                dwq dwqVar29 = this.a;
                hyx hyxVar = new hyx(dwqVar29.h(), (dt) dwqVar29.s.get(), (yni) dwqVar29.a.y.get(), (acth) dwqVar29.L.get(), (yzj) dwqVar29.a.je.get(), (aath) dwqVar29.a.kn.get(), (ajyi) dwqVar29.ah.get(), dwqVar29.fL(), dwqVar29.iK(), (gfu) dwqVar29.a.eA.get(), (aadd) dwqVar29.a.K.get(), (aynx) dwqVar29.a.yK.get());
                ((vxk) dwqVar29.ga.get()).i(hyxVar);
                return hyxVar;
            case 758:
                return new xln((snc) this.a.a.v.get());
            case 759:
                return new xng();
            case 760:
                return this.a.hW();
            case 761:
                return new ahxg();
            case 762:
                dwq dwqVar30 = this.a;
                return new ahxe((ahwz) dwqVar30.aT.get(), (aagi) dwqVar30.a.dD.get(), (afvn) dwqVar30.a.au.get(), amup.l(aicb.TIMESTAMP_MARKER, new ahxh((ahwz) dwqVar30.aT.get()), aicb.CHAPTER, new ahxh((ahwz) dwqVar30.aT.get(), 1)));
            case 763:
                return this.a.U().a(gjx.d);
            case 764:
                return new eox((dt) this.a.s.get(), 7, null);
            case 765:
                dt dtVar2 = (dt) this.a.s.get();
                return ohn.a(dtVar2, new ohm(dtVar2));
            case 766:
                dt dtVar3 = (dt) this.a.s.get();
                return ohn.a(dtVar3, new ohm(dtVar3, 2));
            case 767:
                dwq dwqVar31 = this.a;
                Object obj = (gir) dwqVar31.hm.get();
                Object obj2 = (esf) dwqVar31.hn.get();
                if (true != GalleryActivity.k()) {
                    obj = obj2;
                }
                axzl.o(obj);
                return obj;
            case 768:
                return this.a.bj();
            case 769:
                dwq dwqVar32 = this.a;
                return new esf(dwqVar32.a(), dwqVar32.gj(), dwqVar32.a.cI());
            case 770:
                dwq dwqVar33 = this.a;
                return new eqx((gbh) dwqVar33.aa.get(), (yni) dwqVar33.a.y.get(), ohl.b);
            case 771:
                dwq dwqVar34 = this.a;
                return new ept((gbh) dwqVar34.aa.get(), (yni) dwqVar34.a.y.get(), pns.l());
            case 772:
                dwq dwqVar35 = this.a;
                dt dtVar4 = (dt) dwqVar35.s.get();
                dwqVar35.a.hn();
                return ohn.a(dtVar4, new ohm(dtVar4, 1));
            case 773:
                dwq dwqVar36 = this.a;
                return new eqx((gbh) dwqVar36.aa.get(), (yni) dwqVar36.a.y.get(), ohl.a);
            case 774:
                return this.a.U().a(gjx.e);
            case 775:
                return this.a.U().a(gjx.b);
            case 776:
                dt dtVar5 = (dt) this.a.s.get();
                return ohn.a(dtVar5, new ohm(dtVar5, 3));
            case 777:
                dt dtVar6 = (dt) this.a.s.get();
                return ohn.a(dtVar6, new ohm(dtVar6, 4));
            case 778:
                return this.a.U().a(gjx.c);
            case 779:
                return new xnv((ChangeCommentsMarkersVisibilityCommandHelper) this.a.ho.get(), 1);
            case 780:
                return this.a.fM();
            case 781:
                return new xnv((ChangeCommentsMarkersVisibilityCommandHelper) this.a.ho.get());
            case 782:
                return new hiu((dt) this.a.s.get(), 3);
            case 783:
                return new xol();
            case 784:
                return new gpt((gps) this.a.a.lF.get());
            case 785:
                return new eox(this.a.a(), 8);
            case 786:
                dwq dwqVar37 = this.a;
                return new gyk((aafo) dwqVar37.H.get(), (airr) dwqVar37.a.fO.get(), (hkl) dwqVar37.a.yP.get());
            case 787:
                dwq dwqVar38 = this.a;
                return new eyr(dwqVar38.hr, (aacz) dwqVar38.a.D.get());
            case 788:
                dwq dwqVar39 = this.a;
                return new DefaultInAppUpdateController(dwqVar39.a(), (akfg) dwqVar39.bf.get(), (alqy) dwqVar39.hp.get(), (eyq) dwqVar39.hq.get());
            case 789:
                alqy alqyVar = (alqy) anqx.l(this.a.a()).a.get();
                axzl.o(alqyVar);
                return alqyVar;
            case 790:
                return new eyq((acsf) this.a.a.hg.get());
            case 791:
                return new abwk((abwi) this.a.hs.get());
            case 792:
                return this.a.hB();
            case 793:
                dwq dwqVar40 = this.a;
                return new abwr(dwqVar40.a(), (abzn) dwqVar40.ht.get(), (abws) dwqVar40.hu.get(), (afre) dwqVar40.hv.get(), dwqVar40.gw(), (Executor) dwqVar40.a.x.get(), (ankw) dwqVar40.a.aA.get());
            case 794:
                dwq dwqVar41 = this.a;
                dwqVar41.a();
                acut hM = dwqVar41.hM();
                dyo dyoVar3 = dwqVar41.a;
                azqb azqbVar2 = dyoVar3.yQ;
                azqb azqbVar3 = dyoVar3.yR;
                azqb azqbVar4 = dyoVar3.yS;
                dxs dxsVar = dyoVar3.a;
                azqb azqbVar5 = dxsVar.a;
                azqb azqbVar6 = dxsVar.b;
                azqb azqbVar7 = dxsVar.c;
                azqb azqbVar8 = dxsVar.d;
                azqb azqbVar9 = dxsVar.e;
                azqb azqbVar10 = dxsVar.f;
                azqb azqbVar11 = dyoVar3.wn;
                azqb azqbVar12 = dxsVar.g;
                azqb azqbVar13 = dxsVar.h;
                azqb azqbVar14 = dyoVar3.wk;
                azqb azqbVar15 = dyoVar3.an;
                azqb azqbVar16 = dyoVar3.x;
                azqb azqbVar17 = dyoVar3.h;
                azqb azqbVar18 = dyoVar3.v;
                azqbVar2.getClass();
                azqbVar3.getClass();
                azqbVar4.getClass();
                azqbVar11.getClass();
                azqbVar14.getClass();
                azqbVar15.getClass();
                azqbVar16.getClass();
                azqbVar17.getClass();
                azqbVar18.getClass();
                return acaz.a(hM, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, azqbVar13, azqbVar14, azqbVar15, azqbVar16, azqbVar17, azqbVar18);
            case 795:
                dwq dwqVar42 = this.a;
                return new afqn(dwqVar42.a(), (aadd) dwqVar42.a.K.get());
            case 796:
                dwq dwqVar43 = this.a;
                return new abwb(dwqVar43.a(), (abyy) dwqVar43.a.a.j.get(), (abwe) dwqVar43.hw.get(), (aafo) dwqVar43.H.get(), (Executor) dwqVar43.a.x.get());
            case 797:
                dwq dwqVar44 = this.a;
                return new abwc((ajhr) dwqVar44.dQ.get(), (aafo) dwqVar44.H.get(), (achm) dwqVar44.hy.get());
            case 798:
                return this.a.kr();
            case 799:
                return new achm();
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.azqb
    public final Object get() {
        Object ycmVar;
        Object yddVar;
        int i = this.b;
        switch (i / 100) {
            case 0:
                return a();
            case 1:
                return b();
            case 2:
                return f();
            case 3:
                return g();
            case 4:
                return h();
            case 5:
                return i();
            case 6:
                return j();
            case 7:
                return k();
            case 8:
                switch (i) {
                    case 800:
                        return this.a.ha();
                    case 801:
                        return this.a.hy();
                    case 802:
                        return this.a.hc();
                    case 803:
                        return this.a.ld();
                    case 804:
                        return this.a.hx();
                    case 805:
                        return this.a.hN();
                    case 806:
                        return this.a.gZ();
                    case 807:
                        return this.a.aa();
                    case 808:
                        return this.a.R();
                    case NetError.ERR_DNS_NAME_HTTPS_ONLY /* 809 */:
                        return this.a.gX();
                    case 810:
                        return this.a.s();
                    case 811:
                        return this.a.bY();
                    case 812:
                        return this.a.kO();
                    case 813:
                        return this.a.cf();
                    case 814:
                        return this.a.cd();
                    case 815:
                        return this.a.ce();
                    case 816:
                        return this.a.cc();
                    case 817:
                        return this.a.jK();
                    case 818:
                        return this.a.ca();
                    case 819:
                        return new zrg();
                    case 820:
                        return new gyy();
                    case 821:
                        return this.a.bS();
                    case 822:
                        return this.a.bR();
                    case 823:
                        return this.a.ij();
                    case 824:
                        return this.a.lb();
                    case 825:
                        return this.a.gD();
                    case 826:
                        return this.a.gC();
                    case 827:
                        return this.a.gM();
                    case 828:
                        return this.a.kV();
                    case 829:
                        return this.a.gR();
                    case 830:
                        return this.a.la();
                    case 831:
                        return this.a.gN();
                    case 832:
                        return new esc(3);
                    case 833:
                        return this.a.cg();
                    case 834:
                        return this.a.gO();
                    case 835:
                        return this.a.dN();
                    case 836:
                        return this.a.dO();
                    case 837:
                        return this.a.kP();
                    case 838:
                        return this.a.bq();
                    case 839:
                        return this.a.dX();
                    case 840:
                        return this.a.kI();
                    case 841:
                        return this.a.jY();
                    case 842:
                        return this.a.cj();
                    case 843:
                        return this.a.ck();
                    case 844:
                        return this.a.cn();
                    case 845:
                        return this.a.as();
                    case 846:
                        return this.a.at();
                    case 847:
                        return this.a.cl();
                    case 848:
                        return this.a.g();
                    case 849:
                        return this.a.fR();
                    case 850:
                        return this.a.kZ();
                    case 851:
                        return this.a.co();
                    case 852:
                        return this.a.jZ();
                    case 853:
                        return this.a.cr();
                    case 854:
                        return new xmh();
                    case 855:
                        return this.a.fS();
                    case 856:
                        return this.a.fT();
                    case 857:
                        return this.a.cm();
                    case 858:
                        return this.a.cp();
                    case 859:
                        return gad.s();
                    case 860:
                        return this.a.gS();
                    case 861:
                        return new lil();
                    case 862:
                        return this.a.gG();
                    case 863:
                        return this.a.gP();
                    case 864:
                        return this.a.gT();
                    case 865:
                        return this.a.gU();
                    case 866:
                        return this.a.gV();
                    case 867:
                        return this.a.gQ();
                    case 868:
                        return this.a.bH();
                    case 869:
                        return this.a.bh();
                    case 870:
                        return this.a.bi();
                    case 871:
                        return this.a.cz();
                    case 872:
                        return this.a.li();
                    case 873:
                        return this.a.cB();
                    case 874:
                        return this.a.bo();
                    case 875:
                        return new esc(7);
                    case 876:
                        return this.a.fw();
                    case 877:
                        return this.a.Y();
                    case 878:
                        return this.a.kH();
                    case 879:
                        return this.a.lc();
                    case 880:
                        return this.a.dC();
                    case 881:
                        return this.a.kQ();
                    case 882:
                        return this.a.gi();
                    case 883:
                        return this.a.fW();
                    case 884:
                        return this.a.br();
                    case 885:
                        return this.a.ky();
                    case 886:
                        return new esc(5);
                    case 887:
                        return new esc();
                    case 888:
                        return this.a.Z();
                    case 889:
                        return this.a.ap();
                    case 890:
                        return this.a.kE();
                    case 891:
                        return this.a.jG();
                    case 892:
                        return this.a.E();
                    case 893:
                        return this.a.bx();
                    case 894:
                        return this.a.bw();
                    case 895:
                        return this.a.bC();
                    case 896:
                        return this.a.gd();
                    case 897:
                        return this.a.gf();
                    case 898:
                        return new ycl((ydq) this.a.a.xJ.get());
                    case 899:
                        dwq dwqVar = this.a;
                        return new ycg((yar) dwqVar.hM.get(), (ydq) dwqVar.a.xJ.get(), (aafo) dwqVar.H.get());
                    default:
                        throw new AssertionError(i);
                }
            case 9:
                switch (i) {
                    case 900:
                        return this.a.ga();
                    case 901:
                        return this.a.bs();
                    case 902:
                        return this.a.fZ();
                    case 903:
                        return this.a.fY();
                    case 904:
                        return this.a.fX();
                    case 905:
                        return this.a.gg();
                    case 906:
                        return this.a.cQ();
                    case 907:
                        return this.a.ab();
                    case 908:
                        return this.a.bt();
                    case 909:
                        dwq dwqVar2 = this.a;
                        ycmVar = new ycm((aafo) dwqVar2.H.get(), new abek((aaqj) dwqVar2.a.er.get(), (aaqf) dwqVar2.a.eV.get(), (afvn) dwqVar2.a.au.get(), (yqw) dwqVar2.a.fD.get()), (yzj) dwqVar2.a.je.get());
                        return ycmVar;
                    case 910:
                        return this.a.ge();
                    case 911:
                        return this.a.W();
                    case 912:
                        dwq dwqVar3 = this.a;
                        ycmVar = new yck((acth) dwqVar3.L.get(), new ybc(dwqVar3.a(), dwqVar3.iV(), (aafo) dwqVar3.H.get()));
                        return ycmVar;
                    case 913:
                        dwq dwqVar4 = this.a;
                        yddVar = new ydd(dwqVar4.a(), new abev((aaqj) dwqVar4.a.er.get(), (aaqf) dwqVar4.a.eV.get(), (afvn) dwqVar4.a.au.get(), (yqw) dwqVar4.a.fD.get()), (yzj) dwqVar4.a.je.get(), (ydq) dwqVar4.a.xJ.get(), (acrr) dwqVar4.a.aw.get(), (aafo) dwqVar4.H.get());
                        return yddVar;
                    case 914:
                        dwq dwqVar5 = this.a;
                        yddVar = new ydh(dwqVar5.a(), new abex((aaqj) dwqVar5.a.er.get(), (aaqf) dwqVar5.a.eV.get(), (afvn) dwqVar5.a.au.get(), (yqw) dwqVar5.a.fD.get()), (yzj) dwqVar5.a.je.get(), (ydq) dwqVar5.a.xJ.get(), (acrr) dwqVar5.a.aw.get(), (aafo) dwqVar5.H.get());
                        return yddVar;
                    case 915:
                        return this.a.bu();
                    case 916:
                        return this.a.gc();
                    case 917:
                        return this.a.X();
                    case 918:
                        return this.a.kU();
                    case 919:
                        return this.a.dD();
                    case 920:
                        return this.a.kT();
                    case 921:
                        return this.a.V();
                    case 922:
                        return this.a.gE();
                    case 923:
                        return this.a.bD();
                    case 924:
                        return this.a.jg();
                    case 925:
                        return this.a.bV();
                    case 926:
                        return this.a.bU();
                    case 927:
                        return this.a.kN();
                    case 928:
                        return this.a.bW();
                    case 929:
                        dwq dwqVar6 = this.a;
                        yddVar = new xyi(dwqVar6.a(), new abei((aaqj) dwqVar6.a.er.get(), (aaqf) dwqVar6.a.eV.get(), (afvn) dwqVar6.a.au.get(), (yqw) dwqVar6.a.fD.get()), (acth) dwqVar6.L.get(), (yzj) dwqVar6.a.je.get(), (aafo) dwqVar6.H.get(), (Executor) dwqVar6.a.x.get());
                        return yddVar;
                    case 930:
                        return this.a.bv();
                    case 931:
                        return this.a.hC();
                    case 932:
                        return this.a.iD();
                    case 933:
                        return this.a.fi();
                    case 934:
                        return this.a.jU();
                    case 935:
                        return this.a.hw();
                    case 936:
                        return this.a.ks();
                    case 937:
                        return new acho();
                    case 938:
                        return this.a.ej();
                    case 939:
                        return this.a.aI();
                    case 940:
                        return this.a.jW();
                    case 941:
                        return new akrk();
                    case 942:
                        return new aksc();
                    case 943:
                        return this.a.jI();
                    case 944:
                        return this.a.fp();
                    case 945:
                        return this.a.fk();
                    case 946:
                        return tde.a;
                    case 947:
                        return this.a.ju();
                    case 948:
                        return this.a.fm();
                    case 949:
                        return this.a.fl();
                    case 950:
                        return this.a.fq();
                    case 951:
                        dwq dwqVar7 = this.a;
                        afts aftsVar = (afts) dwqVar7.a.zl.get();
                        tcu tcuVar = (tcu) dwqVar7.R.get();
                        ajmm ajmmVar = (ajmm) dwqVar7.a.ku.get();
                        snc sncVar = (snc) dwqVar7.a.v.get();
                        sxm fj = dwqVar7.fj();
                        final ajkw ajkwVar = new ajkw(dwqVar7.fr(), tcuVar, (ajmy) dwqVar7.a.kC.get(), (Executor) dwqVar7.a.aA.get(), aftsVar, ajmmVar, sncVar, ((ajke) dwqVar7.a.dV.get()).o, dwqVar7.a.iG(), fj);
                        return swa.b((tei) dwqVar7.hW.get(), new svy() { // from class: ajkx
                            @Override // defpackage.svy
                            public final cyp a(cyv cyvVar, tda tdaVar, Object obj, String str, aodt aodtVar, suc sucVar, List list) {
                                tfl tflVar;
                                ajkw ajkwVar2 = ajkw.this;
                                axnc axncVar = (axnc) obj;
                                teb tebVar = ajkwVar2.a;
                                tcu tcuVar2 = ajkwVar2.b;
                                ajmy ajmyVar = ajkwVar2.c;
                                Executor executor = ajkwVar2.d;
                                afts aftsVar2 = ajkwVar2.e;
                                ajmm ajmmVar2 = ajkwVar2.f;
                                snc sncVar2 = ajkwVar2.g;
                                int i2 = ajkwVar2.h;
                                boolean z = ajkwVar2.i;
                                teh tehVar = ajkwVar2.j;
                                aodt aM = axncVar.aM();
                                if (aM == null) {
                                    throw new ted("ImageType.image missing");
                                }
                                awmt awmtVar = null;
                                if (aM.Z() == 4 || aM.Z() == 3) {
                                    tfy tfyVar = new tfy(tebVar);
                                    tfw g = tfyVar.g(axncVar.aJ());
                                    tfw g2 = tfyVar.g(axncVar.aI());
                                    awmt a = g != null ? g.a() : null;
                                    if (g2 != null) {
                                        awmtVar = g2.a();
                                    }
                                    tflVar = new tfl(a, awmtVar, tcuVar2, axncVar);
                                } else {
                                    tflVar = null;
                                }
                                ajkt ajktVar = new ajkt();
                                ajkt.c(ajktVar, cyvVar, new ajkv());
                                ajktVar.a.f58J = aM;
                                ajktVar.d.set(3);
                                ajktVar.a.y = tebVar;
                                ajktVar.d.set(9);
                                ajktVar.a.g = ajmyVar;
                                ajktVar.d.set(5);
                                ajktVar.a.x = axncVar.aG();
                                ajktVar.d.set(8);
                                ajktVar.a.e = executor;
                                ajktVar.d.set(2);
                                ajktVar.a.d = tdaVar;
                                boolean z2 = true;
                                ajktVar.d.set(1);
                                ajkv ajkvVar = ajktVar.a;
                                ajkvVar.b = tflVar;
                                ajkvVar.A = aftsVar2;
                                ajkvVar.f = ajmmVar2;
                                ajktVar.d.set(4);
                                ajktVar.a.c = sncVar2;
                                ajktVar.d.set(0);
                                ajktVar.a.B = i2;
                                ajktVar.d.set(11);
                                ajktVar.a.z = z;
                                ajktVar.d.set(10);
                                ajktVar.a.w = tehVar;
                                ajktVar.d.set(7);
                                if (aodtVar != null) {
                                    axml axmlVar = new axml();
                                    if (!tfy.l(aodtVar, axmlVar, 168774763, tcf.e) || !"primary_image".equals(axmlVar.X())) {
                                        z2 = false;
                                    }
                                    ajktVar.a.a = Boolean.valueOf(z2);
                                }
                                if (axncVar.aK() != null) {
                                    ajktVar.a.H = axncVar.aK();
                                }
                                if (axncVar.aL() != null) {
                                    ajktVar.a.I = axncVar.aL();
                                }
                                ajktVar.a.v = tdaVar.g;
                                ajktVar.d.set(6);
                                return ajktVar;
                            }
                        }, 158796345, svn.k);
                    case 952:
                        return this.a.hP();
                    case 953:
                        return this.a.hd();
                    case 954:
                        return this.a.iT();
                    case 955:
                        return this.a.jj();
                    case 956:
                        return this.a.bT();
                    case 957:
                        return azpq.e().aO();
                    case 958:
                        return this.a.w();
                    case 959:
                        return this.a.v();
                    case 960:
                        return this.a.er();
                    case 961:
                        return this.a.eV();
                    case 962:
                        return this.a.iL();
                    case 963:
                        return new oek();
                    case 964:
                        return new oei();
                    case 965:
                        return this.a.hi();
                    case 966:
                        return new abis();
                    case 967:
                        return this.a.cE();
                    case 968:
                        return this.a.eU();
                    case 969:
                        return new ajxt();
                    case 970:
                        return this.a.cD();
                    case 971:
                        return this.a.eR();
                    case 972:
                        return this.a.eO();
                    case 973:
                        return this.a.eS();
                    case 974:
                        return new akab();
                    case 975:
                        return new odk();
                    case 976:
                        return this.a.fL();
                    case 977:
                        return this.a.dV();
                    case 978:
                        return this.a.dU();
                    case 979:
                        return this.a.ai();
                    case 980:
                        return this.a.ak();
                    case 981:
                        return ampq.j(dyo.jc());
                    case 982:
                        return this.a.eH();
                    case 983:
                        return this.a.eF();
                    case 984:
                        return new xga(new xfk[0]);
                    case 985:
                        return this.a.jO();
                    case 986:
                        return this.a.eG();
                    case 987:
                        return new wkb();
                    case 988:
                        return this.a.eT();
                    case 989:
                        return this.a.be();
                    case 990:
                        return this.a.ez();
                    case 991:
                        return this.a.ey();
                    case 992:
                        return this.a.en();
                    case 993:
                        return this.a.eo();
                    case 994:
                        return this.a.eQ();
                    case 995:
                        return this.a.ex();
                    case 996:
                        return this.a.eP();
                    case 997:
                        return this.a.eZ();
                    case 998:
                        return this.a.eA();
                    case 999:
                        return this.a.eB();
                    default:
                        throw new AssertionError(i);
                }
            case 10:
                return c();
            case 11:
                return d();
            case 12:
                return e();
            default:
                switch (i) {
                    case 1300:
                        return this.a.ef();
                    case 1301:
                        return this.a.aj();
                    case 1302:
                        return this.a.jh();
                    case 1303:
                        return this.a.ji();
                    case 1304:
                        return this.a.cY();
                    case 1305:
                        return this.a.cZ();
                    case 1306:
                        return this.a.da();
                    case 1307:
                        return this.a.bL();
                    case 1308:
                        return this.a.u();
                    case 1309:
                        return this.a.jR();
                    case 1310:
                        return this.a.fA();
                    case 1311:
                        return this.a.fB();
                    case 1312:
                        return this.a.fC();
                    case 1313:
                        return this.a.gu();
                    case 1314:
                        return this.a.fV();
                    case 1315:
                        return this.a.fU();
                    case 1316:
                        return this.a.gK();
                    case 1317:
                        return this.a.cH();
                    case 1318:
                        return this.a.cG();
                    case 1319:
                        return this.a.hn();
                    case 1320:
                        return this.a.ho();
                    case 1321:
                        return this.a.hp();
                    case 1322:
                        return this.a.ht();
                    case 1323:
                        return this.a.iR();
                    case 1324:
                        return this.a.hF();
                    case 1325:
                        return this.a.hv();
                    case 1326:
                        return this.a.hE();
                    case 1327:
                        return this.a.hE();
                    case 1328:
                        return this.a.hE();
                    case 1329:
                        return this.a.hz();
                    case 1330:
                        return this.a.hu();
                    case 1331:
                        return this.a.hA();
                    case 1332:
                        return this.a.jT();
                    case 1333:
                        return this.a.jX();
                    default:
                        throw new AssertionError(i);
                }
        }
    }

    private final Object b() {
        int i = this.b;
        switch (i) {
            case 100:
                return this.a.aZ();
            case 101:
                return this.a.iJ();
            case 102:
                ajyi dF = ((ndm) this.a.ag.get()).dF();
                axzl.o(dF);
                return dF;
            case 103:
                dwq dwqVar = this.a;
                dxv dxvVar = new dxv(dwqVar.a, dwqVar.b);
                dxvVar.a = dwqVar.h();
                return dxvVar.a();
            case 104:
                return this.a.d();
            case 105:
                return this.a.aM();
            case 106:
                return this.a.ba();
            case 107:
                return this.a.ag();
            case 108:
                return this.a.aP();
            case 109:
                return new ojy(this.a.a());
            case 110:
                return new aizb((aant) this.a.a.fU.get());
            case 111:
                return acsv.e();
            case 112:
                dwq dwqVar2 = this.a;
                return new nfq(dwqVar2.fe(), (SharedPreferences) dwqVar2.a.t.get(), (gck) dwqVar2.az.get(), (eo) dwqVar2.t.get(), (fyy) dwqVar2.am.get(), (acth) dwqVar2.L.get(), (ezh) dwqVar2.A.get(), (gbq) dwqVar2.l.get(), (fqd) dwqVar2.I.get(), (yzm) dwqVar2.B.get(), (eze) dwqVar2.aA.get(), (gcc) dwqVar2.ap.get(), (yel) dwqVar2.aq.get(), dwqVar2.ir(), (airw) dwqVar2.n.get());
            case 113:
                dwq dwqVar3 = this.a;
                Activity a = dwqVar3.a();
                fqd fqdVar = (fqd) dwqVar3.I.get();
                ezh ezhVar = (ezh) dwqVar3.A.get();
                aacz aaczVar = (aacz) dwqVar3.a.D.get();
                gcc gccVar = (gcc) dwqVar3.ap.get();
                yzf yzfVar = (yzf) dwqVar3.at.get();
                aizb aizbVar = (aizb) dwqVar3.ao.get();
                Handler handler = (Handler) dwqVar3.a.an.get();
                return new gck(a, fqdVar, ezhVar, aaczVar, gccVar, new gcj(new gca(a, (ghd) dwqVar3.ay.get()), handler), yzfVar, (gch) dwqVar3.ak.get(), aizbVar, (acti) dwqVar3.au.get(), (ntt) dwqVar3.ax.get(), handler);
            case 114:
                return this.a.gn();
            case 115:
                dwq dwqVar4 = this.a;
                return new ntt((zbc) dwqVar4.aw.get(), (aynx) dwqVar4.C.get());
            case 116:
                return this.a.jP();
            case 117:
                return this.a.gp();
            case 118:
                dwq dwqVar5 = this.a;
                dwqVar5.a();
                return new zbl((WindowInfoRepositoryCallbackAdapter) dwqVar5.av.get(), dwqVar5.gk(), (Executor) dwqVar5.a.x.get(), (ayor) dwqVar5.a.iz.get(), (ayor) dwqVar5.a.aq.get());
            case 119:
                return new WindowInfoRepositoryCallbackAdapter(WindowInfoRepository.CC.getOrCreate(this.a.a()));
            case 120:
                return this.a.bb();
            case 121:
                dwq dwqVar6 = this.a;
                return new lpt((yzm) dwqVar6.B.get(), axot.a(dwqVar6.aB), axot.a(dwqVar6.aD));
            case 122:
                return this.a.fa();
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                return this.a.m();
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return this.a.n();
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return new oet();
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return amvn.r((fef) this.a.by.get());
            case 127:
                dwq dwqVar7 = this.a;
                Activity a2 = dwqVar7.a();
                zbq zbqVar = (zbq) dwqVar7.aG.get();
                aigl aiglVar = (aigl) dwqVar7.aM.get();
                kfi kfiVar = (kfi) dwqVar7.aQ.get();
                acti actiVar = (acti) dwqVar7.aR.get();
                oet oetVar = (oet) dwqVar7.aF.get();
                ahwz ahwzVar = (ahwz) dwqVar7.aT.get();
                aifm aifmVar = (aifm) dwqVar7.aU.get();
                ahjc ahjcVar = new ahjc((snc) dwqVar7.a.v.get(), (acvh) dwqVar7.a.ef.get(), (zfq) dwqVar7.a.ee.get(), (aadd) dwqVar7.a.K.get());
                airw airwVar = (airw) dwqVar7.a.fP.get();
                aypf aypfVar = new aypf();
                aypfVar.d(aiwv.j(airwVar.V(), agix.u).Z(new ahjb(ahjcVar, 3)));
                aypfVar.d(aiwv.j(airwVar.V(), ahja.b).Z(new ahjb(ahjcVar, 4)));
                aypfVar.d(aiwv.j(airwVar.V(), agix.s).Z(new ahjb(ahjcVar, 2)));
                aypfVar.d(aiwv.j(airwVar.V(), agix.t).Z(new ahjb(ahjcVar, 1)));
                aypfVar.d(aiwv.j(airwVar.ab(), ahja.a).Z(new ahjb(ahjcVar)));
                khc khcVar = (khc) dwqVar7.bk.get();
                kda kdaVar = new kda(dwqVar7.aM, dwqVar7.ao, dwqVar7.a.hZ);
                kcu kcuVar = new kcu(dwqVar7.ao, dwqVar7.a.D, dwqVar7.au, dwqVar7.ab);
                SuggestedActionsMainController suggestedActionsMainController = (SuggestedActionsMainController) dwqVar7.bt.get();
                kol kolVar = (kol) dwqVar7.dr.get();
                aikh kt = dwqVar7.kt();
                koo kooVar = (koo) dwqVar7.bO.get();
                khd khdVar = (khd) dwqVar7.aY.get();
                klt kltVar = (klt) dwqVar7.dF.get();
                kgi kgiVar = (kgi) dwqVar7.dG.get();
                yni yniVar = (yni) dwqVar7.a.y.get();
                airw airwVar2 = (airw) dwqVar7.n.get();
                aacz aaczVar2 = (aacz) dwqVar7.a.D.get();
                aadd aaddVar = (aadd) dwqVar7.a.K.get();
                khy khyVar = (khy) dwqVar7.bs.get();
                aihr aihrVar = (aihr) dwqVar7.a.xn.get();
                ahxx ahxxVar = (ahxx) dwqVar7.a.xm.get();
                ajve iO = dwqVar7.iO();
                kfb kfbVar = (kfb) dwqVar7.aN.get();
                ntt nttVar = (ntt) dwqVar7.ax.get();
                View[] viewArr = (View[]) dwqVar7.dI.get();
                nyx nyxVar = (nyx) dwqVar7.dJ.get();
                kbu kbuVar = (kbu) dwqVar7.aO.get();
                kbl kblVar = (kbl) dwqVar7.bh.get();
                aire ip = dwqVar7.ip();
                kce kceVar = (kce) dwqVar7.bP.get();
                kch kchVar = new kch(dwqVar7.a(), (aacz) dwqVar7.a.D.get(), (kce) dwqVar7.bP.get(), (aynx) dwqVar7.C.get());
                final kgr kgrVar = new kgr((Handler) dwqVar7.a.an.get(), (kbl) dwqVar7.bh.get(), (azpx) dwqVar7.bN.get(), (aacz) dwqVar7.a.D.get(), (acti) dwqVar7.au.get(), (kgn) dwqVar7.dK.get());
                kgrVar.b.a(kgrVar);
                ((ffo) dwqVar7.bs.get()).r(new ffn() { // from class: kgo
                    @Override // defpackage.ffn
                    public final void a(MotionEvent motionEvent) {
                        kgr kgrVar2 = kgr.this;
                        if (kgrVar2.k || kgrVar2.d.a()) {
                            if (!kgrVar2.k && kgrVar2.d.a() && kgrVar2.l) {
                                return;
                            }
                            int action = motionEvent.getAction();
                            if (action != 0) {
                                if (action != 1 && action != 3) {
                                    return;
                                }
                                kgrVar2.a();
                            } else if (kgrVar2.i || kgrVar2.h) {
                            } else {
                                kgrVar2.a.postDelayed(kgrVar2.c, kgrVar2.f);
                            }
                        }
                    }
                });
                kgt kgtVar = new kgt(new kgk((yve) dwqVar7.a.iy.get(), (axxu) dwqVar7.a.hZ.get()));
                ((kbl) dwqVar7.bh.get()).a(kgtVar);
                kgn kgnVar = (kgn) dwqVar7.dK.get();
                kiy kiyVar = new kiy(dwqVar7.f, dwqVar7.aT, dwqVar7.aM, dwqVar7.a.D, dwqVar7.dK, dwqVar7.bs, dwqVar7.dL, dwqVar7.dM);
                kje kjeVar = new kje(dwqVar7.aT, dwqVar7.aR, dwqVar7.aI, dwqVar7.a.hZ);
                final kdo kdoVar = new kdo((ahwz) dwqVar7.aT.get(), (ffo) dwqVar7.bs.get(), (kbl) dwqVar7.bh.get(), (airw) dwqVar7.n.get(), (aacz) dwqVar7.a.D.get());
                if (kdoVar.d) {
                    kdoVar.a.i(aicb.HEATMAP_MARKER, kdoVar);
                    kdoVar.a.i(aicb.CHAPTER, kdoVar);
                    kdoVar.b.kP(kdoVar);
                    kdoVar.f.a(kdoVar);
                    kdoVar.e.G().e.aa(new ayqb() { // from class: kdl
                        @Override // defpackage.ayqb
                        public final void a(Object obj) {
                            kdo kdoVar2 = kdo.this;
                            ahhx ahhxVar = (ahhx) obj;
                            if (ahhxVar.f() == kdoVar2.i) {
                                return;
                            }
                            kdoVar2.i = ahhxVar.f();
                            kdoVar2.d();
                        }
                    }, jww.j);
                }
                YouTubeControlsOverlay youTubeControlsOverlay = new YouTubeControlsOverlay(a2, zbqVar, aiglVar, kfiVar, actiVar, oetVar, ahwzVar, aifmVar, ahjcVar, khcVar, kdaVar, kcuVar, suggestedActionsMainController, kolVar, kt, kooVar, khdVar, kltVar, kgiVar, yniVar, airwVar2, aaczVar2, aaddVar, khyVar, aihrVar, ahxxVar, iO, kfbVar, nttVar, viewArr, nyxVar, kbuVar, kblVar, ip, kceVar, kchVar, kgrVar, kgtVar, kgnVar, kiyVar, kjeVar, kdoVar, (axxu) dwqVar7.a.hZ.get(), axot.a(dwqVar7.a.xz), axot.a(dwqVar7.bd), axot.a(dwqVar7.bf));
                ((fgc) dwqVar7.bv.get()).a.Z(new kic(youTubeControlsOverlay, 11));
                ((ayoi) dwqVar7.cY.get()).as(new kic(youTubeControlsOverlay));
                ((ayoi) dwqVar7.bN.get()).as(new kic(youTubeControlsOverlay, 2));
                youTubeControlsOverlay.P.d = youTubeControlsOverlay;
                youTubeControlsOverlay.G = new kim(youTubeControlsOverlay);
                youTubeControlsOverlay.h.c.a(youTubeControlsOverlay.G);
                return youTubeControlsOverlay;
            case 128:
                return new zbq();
            case 129:
                return this.a.dc();
            case 130:
                return new aign();
            case 131:
                return this.a.kx();
            case 132:
                return ezv.h((aafo) this.a.H.get());
            case 133:
                return new ajsn();
            case 134:
                return svo.n(amup.k(IntersectionObserver.class, this.a.aK));
            case 135:
                return svo.m(svo.l(this.a.fr()));
            case 136:
                return this.a.db();
            case 137:
                return this.a.dr();
            case 138:
                return this.a.dq();
            case 139:
                dwq dwqVar8 = this.a;
                return new aifs(dwqVar8.a(), (yve) dwqVar8.a.hX.get());
            case 140:
                dwq dwqVar9 = this.a;
                Activity a3 = dwqVar9.a();
                dyo dyoVar = dwqVar9.a;
                return new khk(a3, dyoVar.wN, (ajod) dyoVar.kA.get(), (fqd) dwqVar9.I.get(), dwqVar9.aO, (aacz) dwqVar9.a.D.get());
            case 141:
                return this.a.di();
            case 142:
                return this.a.hK();
            case 143:
                dwq dwqVar10 = this.a;
                return new ahwz((aafo) dwqVar10.H.get(), (ahwx) dwqVar10.aS.get());
            case 144:
                return new ahwx();
            case 145:
                return this.a.ii();
            case 146:
                return this.a.ih();
            case 147:
                dwq dwqVar11 = this.a;
                fzr fzrVar = (fzr) dwqVar11.a.lV.get();
                khd khdVar2 = (khd) dwqVar11.aY.get();
                ayom ayomVar = (ayom) dwqVar11.aZ.get();
                kbc kbcVar = new kbc(dwqVar11.A, dwqVar11.ba, dwqVar11.au);
                kgc kgcVar = (kgc) dwqVar11.bc.get();
                njb njbVar = (njb) dwqVar11.bd.get();
                jwq jwqVar = (jwq) dwqVar11.aW.get();
                AutonavToggleController autonavToggleController = (AutonavToggleController) dwqVar11.aX.get();
                jyu jyuVar = (jyu) dwqVar11.bg.get();
                return new khc(fzrVar, khdVar2, ayomVar, kbcVar, kgcVar, njbVar, jwqVar, autonavToggleController, (SubtitleButtonController) dwqVar11.bi.get(), (TouchImageView) dwqVar11.bj.get());
            case 148:
                dwq dwqVar12 = this.a;
                return new khd((adoa) dwqVar12.a.jq.get(), (jwq) dwqVar12.aW.get(), (AutonavToggleController) dwqVar12.aX.get(), (aacz) dwqVar12.a.D.get());
            case 149:
                return this.a.cV();
            case 150:
                return new feh();
            case 151:
                return this.a.cW();
            case 152:
                return this.a.hJ();
            case 153:
                return azpq.e().aO();
            case 154:
                return azpq.e().aO();
            case 155:
                dwq dwqVar13 = this.a;
                return new kgc(dwqVar13.a(), dwqVar13.iz(), axot.a(dwqVar13.bb), (acti) dwqVar13.au.get());
            case 156:
                return this.a.iA();
            case 157:
                dwq dwqVar14 = this.a;
                return new PlayerOverflowBottomSheetController((dt) dwqVar14.s.get(), dwqVar14.o, (aafo) dwqVar14.H.get(), (airw) dwqVar14.n.get());
            case 158:
                dwq dwqVar15 = this.a;
                return new jyu(dwqVar15.h(), (dt) dwqVar15.s.get(), dwqVar15.ir(), (jyt) dwqVar15.be.get(), (akfg) dwqVar15.bf.get(), (aacz) dwqVar15.a.D.get());
            case 159:
                dp f = ((dt) this.a.s.get()).getSupportFragmentManager().f("SUBTITLE_MENU_BOTTOM_SHEET_FRAGMENT");
                return f != null ? (njz) f : new njz();
            case 160:
                dwq dwqVar16 = this.a;
                return new fvf(dwqVar16.aB(), (Handler) dwqVar16.a.an.get());
            case 161:
                return this.a.dt();
            case 162:
                return new kbl();
            case 163:
                return this.a.go();
            case 164:
                dwq dwqVar17 = this.a;
                knf knfVar = new knf(dwqVar17.A, dwqVar17.ao, dwqVar17.u, dwqVar17.bl, dwqVar17.bp, dwqVar17.bh);
                kob kobVar = new kob(dwqVar17.a.y, dwqVar17.bh);
                kmt kmtVar = new kmt(dwqVar17.n, dwqVar17.bh, dwqVar17.a.x);
                kmy kmyVar = new kmy(dwqVar17.n, dwqVar17.bh, dwqVar17.bq, dwqVar17.A, dwqVar17.a.iy);
                azqb azqbVar = dwqVar17.f;
                azqb azqbVar2 = dwqVar17.H;
                dyo dyoVar2 = dwqVar17.a;
                SuggestedActionsMainController suggestedActionsMainController2 = new SuggestedActionsMainController(knfVar, kobVar, kmtVar, kmyVar, new knp(azqbVar, azqbVar2, dyoVar2.lV, dyoVar2.kC, dyoVar2.D, dwqVar17.br, dyoVar2.iy), (acti) dwqVar17.au.get(), (aibz) dwqVar17.bs.get(), (ghd) dwqVar17.ay.get(), (airw) dwqVar17.n.get(), (Handler) dwqVar17.a.an.get());
                suggestedActionsMainController2.i.kP(suggestedActionsMainController2);
                return suggestedActionsMainController2;
            case 165:
                return this.a.aO();
            case 166:
                return this.a.ae();
            case 167:
                return this.a.eY();
            case 168:
                dwq dwqVar18 = this.a;
                azqb azqbVar3 = dwqVar18.au;
                aafo aafoVar = (aafo) dwqVar18.H.get();
                kiv kivVar = (kiv) dwqVar18.bn.get();
                wkt wktVar = (wkt) dwqVar18.a.rT.get();
                wwd wwdVar = (wwd) dwqVar18.a.sP.get();
                wvx wvxVar = (wvx) dwqVar18.a.tK.get();
                snc sncVar = (snc) dwqVar18.a.v.get();
                final yzm yzmVar = (yzm) dwqVar18.B.get();
                yzmVar.getClass();
                return new xgm(azqbVar3, aafoVar, kivVar, sncVar, new zdt() { // from class: xgf
                    @Override // defpackage.zdt
                    public final void a(Object obj) {
                        yzm.this.j(((Boolean) obj).booleanValue());
                    }
                }, (xiw) dwqVar18.a.st.get(), wktVar, wwdVar, wvxVar);
            case 169:
                dwq dwqVar19 = this.a;
                return new kiv(dwqVar19.a(), (ajmy) dwqVar19.a.kC.get());
            case 170:
                return this.a.ev();
            case 171:
                return new nmv();
            case 172:
                dwq dwqVar20 = this.a;
                knx knxVar = new knx(dwqVar20.a(), (kbl) dwqVar20.bh.get(), (aacz) dwqVar20.a.D.get());
                if (knxVar.a) {
                    knxVar.b.a(knxVar);
                }
                return knxVar;
            case 173:
                dwq dwqVar21 = this.a;
                khy khyVar2 = new khy((axxu) dwqVar21.a.hZ.get());
                Activity a4 = dwqVar21.a();
                if (!khyVar2.i) {
                    khyVar2.j = new InlineTimeBarWrapper(a4);
                    khyVar2.o(khyVar2.j.a, gka.r);
                    khyVar2.z(ezx.NONE);
                }
                return khyVar2;
            case 174:
                dwq dwqVar22 = this.a;
                Object kojVar = eog.aY((aacz) dwqVar22.a.D.get()) ? (kol) dwqVar22.dq.get() : new koj();
                axzl.o(kojVar);
                return kojVar;
            case 175:
                return this.a.dA();
            case 176:
                return this.a.gB();
            case 177:
                return this.a.gA();
            case 178:
                return this.a.gy();
            case 179:
                dwq dwqVar23 = this.a;
                return new jzx(dwqVar23.a(), (Handler) dwqVar23.a.an.get(), (ajmy) dwqVar23.a.kC.get(), dwqVar23.au, dwqVar23.bw);
            case 180:
                return this.a.dl();
            case 181:
                dwq dwqVar24 = this.a;
                return new fgc((yzm) dwqVar24.B.get(), (ghs) dwqVar24.bu.get());
            case 182:
                return this.a.bd();
            case 183:
                return this.a.jx();
            case 184:
                return this.a.hZ();
            case 185:
                return this.a.ib();
            case 186:
                dwq dwqVar25 = this.a;
                return new ahqu((ViewGroup) dwqVar25.dk.get(), dwqVar25.a());
            case 187:
                ViewGroup viewGroup = ((YouTubePlayerOverlaysLayout) this.a.dj.get()).d;
                axzl.o(viewGroup);
                return viewGroup;
            case 188:
                dwq dwqVar26 = this.a;
                Activity a5 = dwqVar26.a();
                zbq zbqVar2 = (zbq) dwqVar26.aG.get();
                axnm a6 = axot.a(dwqVar26.di);
                fgc fgcVar = (fgc) dwqVar26.bv.get();
                yzm yzmVar2 = (yzm) dwqVar26.B.get();
                YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout = (YouTubePlayerOverlaysLayout) a5.getLayoutInflater().inflate(R.layout.player_overlays, (ViewGroup) null);
                asxj asxjVar = ((aacz) dwqVar26.a.D.get()).b().e;
                if (asxjVar == null) {
                    asxjVar = asxj.a;
                }
                aizf[] aizfVarArr = asxjVar.ce ? new aizf[0] : (aizf[]) a6.get();
                youTubePlayerOverlaysLayout.a = new ArrayList();
                youTubePlayerOverlaysLayout.b = new HashMap();
                youTubePlayerOverlaysLayout.c = ezx.NONE;
                youTubePlayerOverlaysLayout.g(yzmVar2);
                youTubePlayerOverlaysLayout.f = zbqVar2;
                youTubePlayerOverlaysLayout.e = fgcVar;
                zbp zbpVar = new zbp(ViewConfiguration.get(youTubePlayerOverlaysLayout.getContext()));
                fes fesVar = new fes(youTubePlayerOverlaysLayout);
                zbpVar.d = fesVar;
                zbpVar.b = fesVar;
                zbqVar2.b(zbpVar);
                youTubePlayerOverlaysLayout.pM(aizfVarArr);
                axzl.o(youTubePlayerOverlaysLayout);
                return youTubePlayerOverlaysLayout;
            case 189:
                return this.a.kq();
            case 190:
                return new kgd(this.a.a());
            case 191:
                dwq dwqVar27 = this.a;
                return new kjg(dwqVar27.a(), (ajmy) dwqVar27.a.kC.get(), (fer) dwqVar27.bz.get(), (aadd) dwqVar27.a.K.get());
            case 192:
                dwq dwqVar28 = this.a;
                return new fer((yni) dwqVar28.a.y.get(), (yme) dwqVar28.a.M.get());
            case 193:
                return new aibn(this.a.a());
            case 194:
                return this.a.ig();
            case 195:
                return this.a.hU();
            case 196:
                dwq dwqVar29 = this.a;
                kmm kmmVar = new kmm(dwqVar29.a(), (kok) dwqVar29.bw.get(), (aadd) dwqVar29.a.K.get());
                ((aigl) dwqVar29.aM.get()).c.a(kmmVar);
                return kmmVar;
            case 197:
                return this.a.dn();
            case 198:
                return this.a.dh();
            case 199:
                return new kfl(this.a.a());
            default:
                throw new AssertionError(i);
        }
    }
}
