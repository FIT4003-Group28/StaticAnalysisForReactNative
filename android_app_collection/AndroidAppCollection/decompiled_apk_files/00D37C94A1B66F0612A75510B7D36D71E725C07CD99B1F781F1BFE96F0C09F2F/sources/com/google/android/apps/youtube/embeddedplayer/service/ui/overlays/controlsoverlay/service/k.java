package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.RemoteException;
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
public final class k implements ahyp, aibg, aich, aiaq, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h {
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c a;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e b;

    public k(Handler handler, yni yniVar, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar, com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f fVar) {
        this.a = cVar;
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e(handler, yniVar, fVar);
        this.b = eVar;
        try {
            cVar.j(eVar);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void B(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.b bVar) {
        this.b.e = bVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void C(VideoDetails videoDetails) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.F(videoDetails);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b
    public final void D(com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a aVar) {
        this.b.h = aVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b
    public final void E(WatchLaterButtonData watchLaterButtonData) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.H(watchLaterButtonData);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h
    public final void b(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g gVar) {
    }

    @Override // defpackage.aibg
    public final void e(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.h(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahyp
    public final void f(ControlsState controlsState) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.k(controlsState);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.aibg
    public final void g(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.o(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahyp
    public final void i(ahyo ahyoVar) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.e eVar = this.b;
        ahyoVar.getClass();
        eVar.a = ahyoVar;
    }

    @Override // defpackage.ahyp
    public final void j(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.v(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.aibg
    public final void k(SubtitleTrack subtitleTrack) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.w(subtitleTrack);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahyp
    public final void l(ControlsOverlayStyle controlsOverlayStyle) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.y(controlsOverlayStyle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.aibg
    public final void m(aibf aibfVar) {
        this.b.b = aibfVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void n(Bitmap bitmap) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.i(bitmap);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.aiaq
    public final void nK(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.q(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahyp
    public final void nN(CharSequence charSequence) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.t(charSequence.toString());
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahyp
    public final void nO(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.x(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahyp
    public final void nP(Map map) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.D(map);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahyp
    public final void nf() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.a();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahyp
    public final void ng() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.f();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahyp
    public final void nh(String str, boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.l(str, z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahyp
    public final void ni(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.n(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahyp
    public final void nj(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.s(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahyp
    public final void ny() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.g();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahyp
    public final void o(long j, long j2, long j3, long j4) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.E(j, j2, j3, j4);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahyp
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.L(i, keyEvent);
                return true;
            } catch (RemoteException unused) {
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.ahyp
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.M(i, keyEvent);
                return true;
            } catch (RemoteException unused) {
                return true;
            }
        }
        return true;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void p(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.u(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.aiaq
    public final void pB(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.p(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h
    public final void pC(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.r(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.aiaq
    public final void pD(aiap aiapVar) {
        this.b.d = aiapVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b
    public final void pE(com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d dVar) {
        this.b.i = dVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void pF(SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.B(subscriptionNotificationMenuData);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.aich
    public final void pG(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.C(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.aich
    public final void pH(VideoQuality[] videoQualityArr, int i, boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.G(videoQualityArr, i, z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahyp
    public final void pI() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.I();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahyp
    public final void pJ() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.K();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.aich
    public final void q(aicg aicgVar) {
        this.b.c = aicgVar;
    }

    @Override // defpackage.aibg
    public final void r(List list) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.J(list);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c
    public final void t(com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a aVar) {
        this.b.f = aVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c
    public final void u(SubscribeButtonData subscribeButtonData) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.z(subscribeButtonData);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void v(com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d dVar) {
        this.b.g = dVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void w(SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.A(subscriptionNotificationButtonData);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahyp
    public final /* synthetic */ void x() {
        ahfo.a(this);
    }

    @Override // defpackage.ahyp
    public final void y(auad auadVar, boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.m(new PlayerErrorMessageRendererWrapper(auadVar), z);
            } catch (RemoteException unused) {
            }
        }
    }
}
