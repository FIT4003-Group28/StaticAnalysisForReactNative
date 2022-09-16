package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d extends dvc implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayServiceListener");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void A(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        px(9, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void B() {
        px(21, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void a() {
        px(10, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void f() {
        px(12, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void g() {
        px(7, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void h() {
        px(24, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void i() {
        px(2, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void j() {
        px(1, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void k() {
        px(17, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void l() {
        px(8, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void m() {
        px(5, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void n() {
        px(4, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void o() {
        px(15, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void p() {
        px(14, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void q() {
        px(3, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void r(long j) {
        Parcel pv = pv();
        pv.writeLong(j);
        px(6, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void s() {
        px(23, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void t() {
        px(22, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void u() {
        px(11, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void v() {
        px(19, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void w(SubscriptionNotificationMenuItem subscriptionNotificationMenuItem) {
        Parcel pv = pv();
        dve.g(pv, subscriptionNotificationMenuItem);
        px(20, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void x() {
        px(18, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void y(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(13, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f
    public final void z(SubtitleTrack subtitleTrack) {
        Parcel pv = pv();
        dve.g(pv, subtitleTrack);
        px(16, pv);
    }
}
