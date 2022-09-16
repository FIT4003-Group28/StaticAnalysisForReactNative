package defpackage;

import android.app.Service;
import com.google.android.libraries.youtube.player.background.service.BackgroundPlayerService;
/* compiled from: PG */
/* renamed from: ahfj  reason: default package */
/* loaded from: classes.dex */
public abstract class ahfj extends Service implements axoo {
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

    public final void b() {
        if (!this.c) {
            this.c = true;
            BackgroundPlayerService backgroundPlayerService = (BackgroundPlayerService) this;
            eap eapVar = (eap) lI();
            backgroundPlayerService.a = (airr) eapVar.a.fO.get();
            backgroundPlayerService.b = (ainq) eapVar.a.uV.get();
            backgroundPlayerService.c = (aijf) eapVar.a.gH.get();
            backgroundPlayerService.d = (bame) eapVar.a.vx.get();
            backgroundPlayerService.e = (bame) eapVar.a.vy.get();
            backgroundPlayerService.f = (airy) eapVar.a.a.bD.get();
            aiix aiixVar = (aiix) eapVar.a.fH.get();
        }
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // android.app.Service
    public void onCreate() {
        b();
        super.onCreate();
    }
}
