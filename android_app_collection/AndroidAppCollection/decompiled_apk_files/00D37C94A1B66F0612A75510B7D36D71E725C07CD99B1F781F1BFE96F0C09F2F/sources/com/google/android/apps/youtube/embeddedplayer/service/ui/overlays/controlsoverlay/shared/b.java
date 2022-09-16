package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PlayerErrorMessageRendererWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.k;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.o;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.q;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.u;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends dvd implements c {
    public final ahyp a;
    public final aibg b;
    public final aich c;
    public final aiaq d;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b e;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c f;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b g;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b h;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b i;
    public final h j;
    public u k;
    private final Handler l;

    public b(ahyp ahypVar, aibg aibgVar, aich aichVar, aiaq aiaqVar, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b bVar, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c cVar, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b bVar2, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b bVar3, com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b bVar4, h hVar, Handler handler) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayClient");
        ahypVar.getClass();
        this.a = ahypVar;
        aibgVar.getClass();
        this.b = aibgVar;
        aichVar.getClass();
        this.c = aichVar;
        aiaqVar.getClass();
        this.d = aiaqVar;
        bVar.getClass();
        this.e = bVar;
        cVar.getClass();
        this.f = cVar;
        bVar2.getClass();
        this.g = bVar2;
        bVar3.getClass();
        this.h = bVar3;
        bVar4.getClass();
        this.i = bVar4;
        hVar.getClass();
        this.j = hVar;
        handler.getClass();
        this.l = handler;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void A(final SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        this.l.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.d
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b.this;
                bVar.g.w(subscriptionNotificationButtonData);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void B(final SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        this.l.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.e
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b.this;
                bVar.g.pF(subscriptionNotificationMenuData);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void C(boolean z) {
        this.l.post(new o(this, z, 10));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void D(Map map) {
        final HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            try {
                aicb aicbVar = (aicb) entry.getKey();
                Parcelable[] parcelableArr = (Parcelable[]) entry.getValue();
                if (parcelableArr != null) {
                    TimelineMarker[] timelineMarkerArr = new TimelineMarker[parcelableArr.length];
                    for (int i = 0; i < parcelableArr.length; i++) {
                        timelineMarkerArr[i] = (TimelineMarker) parcelableArr[i];
                    }
                    hashMap.put(aicbVar, timelineMarkerArr);
                }
            } catch (ClassCastException unused) {
            }
        }
        this.l.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.n
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b.this;
                bVar.a.nP(hashMap);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void E(final long j, final long j2, final long j3, final long j4) {
        this.l.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.r
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b.this;
                bVar.a.o(j, j2, j3, j4);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void F(final VideoDetails videoDetails) {
        this.l.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.a
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b.this;
                bVar.e.C(videoDetails);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void G(final VideoQuality[] videoQualityArr, final int i, final boolean z) {
        this.l.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.p
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b.this;
                bVar.c.pH(videoQualityArr, i, z);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void H(final WatchLaterButtonData watchLaterButtonData) {
        this.l.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.f
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b.this;
                bVar.h.E(watchLaterButtonData);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void I() {
        this.l.post(new k(this, 3));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void J(final List list) {
        this.l.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.m
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b.this;
                bVar.b.r(list);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void K() {
        this.l.post(new k(this, 4));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void L(int i, KeyEvent keyEvent) {
        this.l.post(new q(this, i, keyEvent, 1));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void M(int i, KeyEvent keyEvent) {
        this.l.post(new q(this, i, keyEvent));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void a() {
        this.l.post(new k(this, 1));
    }

    public final void b() {
        u uVar = this.k;
        if (uVar != null) {
            uVar.a = null;
            this.k = null;
        }
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        f dVar;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    dVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayServiceListener");
                    if (queryLocalInterface instanceof f) {
                        dVar = (f) queryLocalInterface;
                    } else {
                        dVar = new d(readStrongBinder);
                    }
                }
                j(dVar);
                parcel2.writeNoException();
                break;
            case 2:
                y((ControlsOverlayStyle) dve.a(parcel, ControlsOverlayStyle.CREATOR));
                parcel2.writeNoException();
                break;
            case 3:
                u(dve.j(parcel));
                parcel2.writeNoException();
                break;
            case 4:
                i((Bitmap) dve.a(parcel, Bitmap.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                F((VideoDetails) dve.a(parcel, VideoDetails.CREATOR));
                parcel2.writeNoException();
                break;
            case 6:
                z((SubscribeButtonData) dve.a(parcel, SubscribeButtonData.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                A((SubscriptionNotificationButtonData) dve.a(parcel, SubscriptionNotificationButtonData.CREATOR));
                parcel2.writeNoException();
                break;
            case 8:
                B((SubscriptionNotificationMenuData) dve.a(parcel, SubscriptionNotificationMenuData.CREATOR));
                parcel2.writeNoException();
                break;
            case 9:
                H((WatchLaterButtonData) dve.a(parcel, WatchLaterButtonData.CREATOR));
                parcel2.writeNoException();
                break;
            case 10:
                C(dve.j(parcel));
                parcel2.writeNoException();
                break;
            case 11:
                G((VideoQuality[]) parcel.createTypedArray(VideoQuality.CREATOR), parcel.readInt(), dve.j(parcel));
                parcel2.writeNoException();
                break;
            case 12:
                n(dve.j(parcel));
                parcel2.writeNoException();
                break;
            case 13:
                s(dve.j(parcel));
                parcel2.writeNoException();
                break;
            case 14:
                p(dve.j(parcel));
                parcel2.writeNoException();
                break;
            case 15:
                q(dve.j(parcel));
                parcel2.writeNoException();
                break;
            case 16:
                I();
                parcel2.writeNoException();
                break;
            case 17:
                a();
                parcel2.writeNoException();
                break;
            case 18:
                k((ControlsState) dve.a(parcel, ControlsState.CREATOR));
                parcel2.writeNoException();
                break;
            case 19:
                l(parcel.readString(), dve.j(parcel));
                parcel2.writeNoException();
                break;
            case 20:
                m((PlayerErrorMessageRendererWrapper) dve.a(parcel, PlayerErrorMessageRendererWrapper.CREATOR), dve.j(parcel));
                parcel2.writeNoException();
                break;
            case 21:
                v(dve.j(parcel));
                parcel2.writeNoException();
                break;
            case 22:
                E(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
                break;
            case 23:
                g();
                parcel2.writeNoException();
                break;
            case 24:
                f();
                parcel2.writeNoException();
                break;
            case 25:
                L(parcel.readInt(), (KeyEvent) dve.a(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                dve.e(parcel2, true);
                break;
            case 26:
                M(parcel.readInt(), (KeyEvent) dve.a(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                dve.e(parcel2, true);
                break;
            case 27:
                o(dve.j(parcel));
                parcel2.writeNoException();
                break;
            case 28:
                h(dve.j(parcel));
                parcel2.writeNoException();
                break;
            case 29:
                w((SubtitleTrack) dve.a(parcel, SubtitleTrack.CREATOR));
                parcel2.writeNoException();
                break;
            case 30:
                D(dve.d(parcel));
                parcel2.writeNoException();
                break;
            case 31:
                K();
                parcel2.writeNoException();
                break;
            case 32:
                J(parcel.createTypedArrayList(SubtitleTrack.CREATOR));
                parcel2.writeNoException();
                break;
            case 33:
                x(dve.j(parcel));
                parcel2.writeNoException();
                break;
            case 34:
                t(parcel.readString());
                parcel2.writeNoException();
                break;
            case 35:
                r(dve.j(parcel));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void f() {
        this.l.post(new k(this));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void g() {
        this.l.post(new k(this, 2));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void h(boolean z) {
        this.l.post(new o(this, z, 1));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void i(final Bitmap bitmap) {
        this.l.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.s
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b.this;
                bVar.e.n(bitmap);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void j(final f fVar) {
        this.l.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.b
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b.this;
                bVar.k = new u(fVar);
                bVar.a.i(bVar.k);
                bVar.b.m(bVar.k);
                bVar.c.q(bVar.k);
                bVar.d.pD(bVar.k);
                bVar.e.B(bVar.k);
                bVar.f.t(bVar.k);
                bVar.g.v(bVar.k);
                bVar.h.D(bVar.k);
                bVar.i.pE(bVar.k);
                bVar.j.b(bVar.k);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void k(final ControlsState controlsState) {
        this.l.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.h
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b.this;
                bVar.a.f(controlsState);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void l(final String str, final boolean z) {
        this.l.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.l
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b.this;
                bVar.a.nh(str, z);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void m(final PlayerErrorMessageRendererWrapper playerErrorMessageRendererWrapper, final boolean z) {
        this.l.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.t
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b.this;
                PlayerErrorMessageRendererWrapper playerErrorMessageRendererWrapper2 = playerErrorMessageRendererWrapper;
                bVar.a.y((auad) playerErrorMessageRendererWrapper2.a, z);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void n(boolean z) {
        this.l.post(new o(this, z));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void o(boolean z) {
        this.l.post(new o(this, z, 2));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void p(boolean z) {
        this.l.post(new o(this, z, 3));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void q(boolean z) {
        this.l.post(new o(this, z, 4));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void r(boolean z) {
        this.l.post(new o(this, z, 5));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void s(boolean z) {
        this.l.post(new o(this, z, 6));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void t(final String str) {
        this.l.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.j
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b.this;
                bVar.a.nN(str);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void u(boolean z) {
        this.l.post(new o(this, z, 7));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void v(boolean z) {
        this.l.post(new o(this, z, 8));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void w(final SubtitleTrack subtitleTrack) {
        this.l.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.i
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b.this;
                bVar.b.k(subtitleTrack);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void x(boolean z) {
        this.l.post(new o(this, z, 9));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void y(final ControlsOverlayStyle controlsOverlayStyle) {
        this.l.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.g
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b.this;
                bVar.a.l(controlsOverlayStyle);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c
    public final void z(final SubscribeButtonData subscribeButtonData) {
        this.l.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.c
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b.this;
                bVar.f.u(subscribeButtonData);
            }
        });
    }

    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.IControlsOverlayClient");
    }
}
