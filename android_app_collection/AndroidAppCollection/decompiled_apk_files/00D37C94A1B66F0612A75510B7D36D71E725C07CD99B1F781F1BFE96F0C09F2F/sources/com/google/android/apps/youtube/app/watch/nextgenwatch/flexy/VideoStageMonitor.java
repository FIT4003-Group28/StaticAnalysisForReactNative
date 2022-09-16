package com.google.android.apps.youtube.app.watch.nextgenwatch.flexy;

import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.VideoStageMonitor;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class VideoStageMonitor implements f, aiby {
    private static final nue b = new nue(2, 1.777f, 1.777f);
    private final airw c;
    private final nun d;
    private final aibz e;
    private boolean g;
    public aika a = aika.NEW;
    private final aypf f = new aypf();

    public VideoStageMonitor(airw airwVar, nun nunVar, aibz aibzVar) {
        this.c = airwVar;
        this.d = nunVar;
        this.e = aibzVar;
    }

    public final void g() {
        if (akzj.f(this.a, aika.ENDED)) {
            if (this.g) {
                return;
            }
            this.d.h(b);
        } else if (!this.a.d() || this.d.f(2) == null) {
        } else {
            this.d.g(0, false);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.f.c();
        this.e.q(this);
    }

    @Override // defpackage.aiby
    public final void nt(int i, long j) {
        boolean z = this.g;
        boolean z2 = true;
        if (i != 1 && i != 2) {
            z2 = false;
        }
        this.g = z2;
        if (z != z2) {
            g();
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.f.c();
        this.f.d(this.c.G().a.I().aa(new ayqb() { // from class: nvd
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                VideoStageMonitor videoStageMonitor = VideoStageMonitor.this;
                ahhw ahhwVar = (ahhw) obj;
                if (akzj.f(videoStageMonitor.a, ahhwVar.c())) {
                    return;
                }
                videoStageMonitor.a = ahhwVar.c();
                videoStageMonitor.g();
            }
        }, npy.h));
        this.e.kP(this);
    }
}
