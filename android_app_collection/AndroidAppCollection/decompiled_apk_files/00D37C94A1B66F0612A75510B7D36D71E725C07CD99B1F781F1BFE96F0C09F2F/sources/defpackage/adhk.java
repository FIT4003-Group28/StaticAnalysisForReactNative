package defpackage;

import android.app.Service;
import com.google.android.libraries.youtube.mdx.mediaroute.service.RemotePlaybackControlsService;
/* compiled from: PG */
/* renamed from: adhk  reason: default package */
/* loaded from: classes.dex */
public abstract class adhk extends Service implements axoo {
    private volatile axog a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.axoo
    /* renamed from: a */
    public final axog lH() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new axog(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            RemotePlaybackControlsService remotePlaybackControlsService = (RemotePlaybackControlsService) this;
            eap eapVar = (eap) lI();
            remotePlaybackControlsService.a = (yni) eapVar.a.y.get();
            remotePlaybackControlsService.c = (airw) eapVar.a.fP.get();
            remotePlaybackControlsService.d = (ainw) eapVar.a.a.bz.get();
            remotePlaybackControlsService.e = (ainw) eapVar.a.a.bA.get();
            remotePlaybackControlsService.f = (ainz) eapVar.a.va.get();
            remotePlaybackControlsService.n = (adhl) eapVar.a.a.bB.get();
            remotePlaybackControlsService.g = (adhl) eapVar.a.a.bC.get();
            remotePlaybackControlsService.h = (ainq) eapVar.a.uV.get();
            dyo dyoVar = eapVar.a;
            remotePlaybackControlsService.i = dyoVar.jT;
            remotePlaybackControlsService.j = dyoVar.jq;
            remotePlaybackControlsService.k = (aczr) dyoVar.bg.get();
            remotePlaybackControlsService.l = (ainx) eapVar.a.uT.get();
        }
        super.onCreate();
    }
}
