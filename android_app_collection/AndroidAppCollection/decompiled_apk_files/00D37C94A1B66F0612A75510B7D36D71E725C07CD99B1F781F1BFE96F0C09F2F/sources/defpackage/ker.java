package defpackage;

import com.google.android.apps.youtube.app.player.overlay.InteractiveInlineMutedControlsOverlay;
/* compiled from: PG */
/* renamed from: ker  reason: default package */
/* loaded from: classes3.dex */
public final class ker implements aiby {
    final /* synthetic */ InteractiveInlineMutedControlsOverlay b;
    boolean a = false;
    private long c = -1;

    public ker(InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay) {
        this.b = interactiveInlineMutedControlsOverlay;
    }

    @Override // defpackage.aiby
    public final void nt(int i, long j) {
        this.b.g.c(j);
        InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay = this.b;
        aihh aihhVar = interactiveInlineMutedControlsOverlay.g.d;
        if (i == 1) {
            if (eog.K(interactiveInlineMutedControlsOverlay.h)) {
                this.c = j;
                this.b.f.oi().n(new acte(actj.PLAYER_SCRUBBER));
            }
            if (aihhVar != null && aihhVar.g()) {
                this.a = true;
                aihhVar.nt(i, j);
            }
            this.b.o.nt(i, j);
        } else if (i != 2) {
            if (i == 3) {
                if (eog.K(interactiveInlineMutedControlsOverlay.h)) {
                    long j2 = this.c;
                    if (j2 >= 0) {
                        long abs = Math.abs(j - j2);
                        aopa createBuilder = asjs.a.createBuilder();
                        createBuilder.copyOnWrite();
                        asjs asjsVar = (asjs) createBuilder.instance;
                        asjsVar.b = 1 | asjsVar.b;
                        asjsVar.c = almu.v(abs);
                        asjs asjsVar2 = (asjs) createBuilder.mo39build();
                        aopa createBuilder2 = asjj.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        asjj asjjVar = (asjj) createBuilder2.instance;
                        asjsVar2.getClass();
                        asjjVar.E = asjsVar2;
                        asjjVar.c |= 8388608;
                        this.b.f.oi().H(3, new acte(actj.PLAYER_SCRUBBER), (asjj) createBuilder2.mo39build());
                    }
                }
                atzd a = atze.a();
                long j3 = this.c;
                a.copyOnWrite();
                atze.d((atze) a.instance, (float) (j3 / 1000));
                a.copyOnWrite();
                atze.e((atze) a.instance, (float) (j / 1000));
                String str = this.b.p;
                if (str != null) {
                    a.copyOnWrite();
                    atze.c((atze) a.instance, str);
                }
                arrf a2 = arrh.a();
                a2.copyOnWrite();
                ((arrh) a2.instance).dv((atze) a.mo39build());
                this.b.n.c((arrh) a2.mo39build());
                ggt ggtVar = this.b.G.c;
                this.b.i.a = ggtVar != null ? ggtVar.f() : "";
            } else if (i != 4) {
                return;
            }
            this.c = -1L;
            if (aihhVar != null && aihhVar.g() && this.a) {
                this.a = false;
                aihhVar.nt(i, j);
            }
            this.b.g.ob();
            this.b.m.i(j);
            this.b.o.nt(i, j);
        } else {
            if (aihhVar != null && aihhVar.g() && this.a) {
                aihhVar.nt(i, j);
                aihhVar.f(true);
            }
            this.b.o.nt(i, j);
        }
    }
}
