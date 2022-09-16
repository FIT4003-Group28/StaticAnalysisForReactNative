package defpackage;

import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: kin  reason: default package */
/* loaded from: classes3.dex */
public final class kin implements aiby {
    final /* synthetic */ YouTubeControlsOverlay b;
    private int d;
    boolean a = false;
    private long c = -1;

    public kin(YouTubeControlsOverlay youTubeControlsOverlay) {
        this.b = youTubeControlsOverlay;
    }

    @Override // defpackage.aiby
    public final void nt(int i, long j) {
        Optional empty;
        this.b.n.c(j);
        YouTubeControlsOverlay youTubeControlsOverlay = this.b;
        aihh aihhVar = youTubeControlsOverlay.n.d;
        if (aihhVar == null) {
            youTubeControlsOverlay.D();
            aihhVar = this.b.n.d;
        }
        if (i == 1) {
            this.b.f149J.a(true);
            this.b.a.h(true);
            this.b.P();
            if (aihhVar != null && aihhVar.g()) {
                this.a = true;
                aihhVar.nt(i, j);
            }
            this.b.g.q();
        } else if (i == 2) {
            this.b.P();
            this.b.n.nU();
            if (aihhVar != null && aihhVar.g() && this.a) {
                aihhVar.nt(i, j);
                aihhVar.f(true);
            }
            this.b.g.p(j);
        } else if (i != 3 && i != 4) {
            if (eog.K(this.b.H)) {
                this.c = j;
                this.b.I.n(new acte(actj.PLAYER_SCRUBBER));
            }
            YouTubeControlsOverlay youTubeControlsOverlay2 = this.b;
            if (!youTubeControlsOverlay2.Q) {
                return;
            }
            if (youTubeControlsOverlay2.K.a()) {
                YouTubeControlsOverlay youTubeControlsOverlay3 = this.b;
                this.d = youTubeControlsOverlay3.t;
                youTubeControlsOverlay3.B();
                return;
            }
            this.b.P();
        } else {
            if (eog.K(this.b.H)) {
                acti actiVar = this.b.I;
                acte acteVar = new acte(actj.PLAYER_SCRUBBER);
                long j2 = this.c;
                if (i == 3) {
                    if (j2 < 0) {
                        empty = Optional.empty();
                    } else {
                        aopa createBuilder = asjs.a.createBuilder();
                        createBuilder.copyOnWrite();
                        asjs asjsVar = (asjs) createBuilder.instance;
                        asjsVar.b |= 1;
                        asjsVar.c = almu.v(j - j2);
                        createBuilder.copyOnWrite();
                        asjs asjsVar2 = (asjs) createBuilder.instance;
                        asjsVar2.b = 2 | asjsVar2.b;
                        asjsVar2.d = false;
                        asjs asjsVar3 = (asjs) createBuilder.mo39build();
                        aopa createBuilder2 = asjj.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        asjj asjjVar = (asjj) createBuilder2.instance;
                        asjsVar3.getClass();
                        asjjVar.E = asjsVar3;
                        asjjVar.c |= 8388608;
                        empty = Optional.of((asjj) createBuilder2.mo39build());
                    }
                } else if (i == 4) {
                    aopa createBuilder3 = asjs.a.createBuilder();
                    createBuilder3.copyOnWrite();
                    asjs asjsVar4 = (asjs) createBuilder3.instance;
                    asjsVar4.b = 2 | asjsVar4.b;
                    asjsVar4.d = true;
                    asjs asjsVar5 = (asjs) createBuilder3.mo39build();
                    aopa createBuilder4 = asjj.a.createBuilder();
                    createBuilder4.copyOnWrite();
                    asjj asjjVar2 = (asjj) createBuilder4.instance;
                    asjsVar5.getClass();
                    asjjVar2.E = asjsVar5;
                    asjjVar2.c |= 8388608;
                    empty = Optional.of((asjj) createBuilder4.mo39build());
                } else {
                    empty = Optional.empty();
                }
                actiVar.H(3, acteVar, (asjj) empty.orElse(null));
            }
            this.b.a.h(false);
            this.b.f149J.a(false);
            this.b.n.nU();
            if (!this.b.K.a()) {
                this.b.B();
            } else if (this.d != 0) {
                this.b.P();
            } else if (i == 3) {
                this.b.nf();
            } else {
                this.b.O(true);
            }
            this.b.E();
            this.c = -1L;
            if (aihhVar != null && aihhVar.g() && this.a) {
                this.a = false;
                aihhVar.nt(i, j);
            }
            this.b.n.ob();
            YouTubeControlsOverlay youTubeControlsOverlay4 = this.b;
            if (youTubeControlsOverlay4.Q && i == 4) {
                return;
            }
            youTubeControlsOverlay4.c.a();
            this.b.g.r(j);
        }
    }
}
