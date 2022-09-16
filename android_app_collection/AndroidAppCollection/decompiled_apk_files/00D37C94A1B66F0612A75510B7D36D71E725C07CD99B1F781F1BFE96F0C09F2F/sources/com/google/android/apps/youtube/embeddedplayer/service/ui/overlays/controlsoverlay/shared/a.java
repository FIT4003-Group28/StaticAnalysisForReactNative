package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PlayerErrorMessageRendererWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends dvc implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void A(SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        Parcel pv = pv();
        dve.g(pv, subscriptionNotificationButtonData);
        px(7, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void B(SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        Parcel pv = pv();
        dve.g(pv, subscriptionNotificationMenuData);
        px(8, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void C(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(10, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void D(Map map) {
        Parcel pv = pv();
        pv.writeMap(map);
        px(30, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void E(long j, long j2, long j3, long j4) {
        Parcel pv = pv();
        pv.writeLong(j);
        pv.writeLong(j2);
        pv.writeLong(j3);
        pv.writeLong(j4);
        px(22, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void F(VideoDetails videoDetails) {
        Parcel pv = pv();
        dve.g(pv, videoDetails);
        px(5, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void G(VideoQuality[] videoQualityArr, int i, boolean z) {
        Parcel pv = pv();
        pv.writeTypedArray(videoQualityArr, 0);
        pv.writeInt(i);
        dve.e(pv, z);
        px(11, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void H(WatchLaterButtonData watchLaterButtonData) {
        Parcel pv = pv();
        dve.g(pv, watchLaterButtonData);
        px(9, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void I() {
        px(16, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void J(List list) {
        Parcel pv = pv();
        pv.writeTypedList(list);
        px(32, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void K() {
        px(31, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void L(int i, KeyEvent keyEvent) {
        Parcel pv = pv();
        pv.writeInt(i);
        dve.g(pv, keyEvent);
        Parcel pw = pw(25, pv);
        dve.j(pw);
        pw.recycle();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void M(int i, KeyEvent keyEvent) {
        Parcel pv = pv();
        pv.writeInt(i);
        dve.g(pv, keyEvent);
        Parcel pw = pw(26, pv);
        dve.j(pw);
        pw.recycle();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void a() {
        px(17, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void f() {
        px(24, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void g() {
        px(23, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void h(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(28, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void i(Bitmap bitmap) {
        Parcel pv = pv();
        dve.g(pv, bitmap);
        px(4, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void j(f fVar) {
        Parcel pv = pv();
        dve.i(pv, fVar);
        px(1, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void k(ControlsState controlsState) {
        Parcel pv = pv();
        dve.g(pv, controlsState);
        px(18, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void l(String str, boolean z) {
        Parcel pv = pv();
        pv.writeString(str);
        dve.e(pv, z);
        px(19, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void m(PlayerErrorMessageRendererWrapper playerErrorMessageRendererWrapper, boolean z) {
        Parcel pv = pv();
        dve.g(pv, playerErrorMessageRendererWrapper);
        dve.e(pv, z);
        px(20, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void n(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(12, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void o(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(27, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void p(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(14, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void q(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(15, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void r(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(35, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void s(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(13, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void t(String str) {
        Parcel pv = pv();
        pv.writeString(str);
        px(34, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void u(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(3, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void v(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(21, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void w(SubtitleTrack subtitleTrack) {
        Parcel pv = pv();
        dve.g(pv, subtitleTrack);
        px(29, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void x(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(33, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void y(ControlsOverlayStyle controlsOverlayStyle) {
        Parcel pv = pv();
        dve.g(pv, controlsOverlayStyle);
        px(2, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void z(SubscribeButtonData subscribeButtonData) {
        Parcel pv = pv();
        dve.g(pv, subscribeButtonData);
        px(6, pv);
    }
}
