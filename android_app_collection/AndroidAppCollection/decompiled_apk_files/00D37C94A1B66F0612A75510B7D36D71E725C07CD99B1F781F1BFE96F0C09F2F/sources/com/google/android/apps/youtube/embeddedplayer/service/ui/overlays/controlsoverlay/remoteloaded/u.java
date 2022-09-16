package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class u implements ahyo, aibf, aicg, aiap, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.b, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a, com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g {
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f a;

    public u(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar) {
        fVar.getClass();
        this.a = fVar;
    }

    @Override // defpackage.aiap
    public final void a() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.g();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // defpackage.aiap
    public final void b() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.l();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // defpackage.ahyo
    public final void c() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.a();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // defpackage.ahyo
    public final void d() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.f();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // defpackage.ahyo
    public final void e() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.i();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // defpackage.ahyo
    public final void f() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.j();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a
    public final void g() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.v();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d
    public final void h(SubscriptionNotificationMenuItem subscriptionNotificationMenuItem) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.w(subscriptionNotificationMenuItem);
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.b
    public final void i() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.x();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a
    public final void j() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.B();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // defpackage.ahyo
    public final void k() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.k();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // defpackage.ahyo
    public final void l() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.m();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // defpackage.ahyo
    public final void m() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.n();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // defpackage.ahyo
    public final void n() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.o();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // defpackage.ahyo
    public final void o() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.p();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // defpackage.ahyo
    public final void p(long j) {
    }

    @Override // defpackage.aibf
    public final void pA(SubtitleTrack subtitleTrack) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.z(subtitleTrack);
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g
    public final void pz() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.h();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // defpackage.ahyo
    public final void q() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.q();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // defpackage.ahyo
    public final void r(long j) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.r(j);
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d
    public final void s() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.s();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d
    public final void t() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.t();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // defpackage.ahyo
    public final void u() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.u();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // defpackage.ahyo
    public final void v(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.y(z);
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // defpackage.aicg
    public final void w(int i) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.A(i);
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // defpackage.aicg
    public final void x(awan awanVar) {
    }
}
