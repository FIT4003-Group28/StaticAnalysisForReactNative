package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ah implements aiby {
    final /* synthetic */ al a;

    public ah(al alVar) {
        this.a = alVar;
    }

    @Override // defpackage.aiby
    public final void nt(int i, long j) {
        aibs.K(this.a.i, j);
        boolean z = true;
        if (i == 1) {
            al alVar = this.a;
            alVar.N = true;
            alVar.G();
            al alVar2 = this.a;
            if (alVar2.O) {
                alVar2.nf();
                this.a.w.f(true);
                this.a.H(actj.DOUBLE_TAP_TO_SEEK_SCRUB_USER_EDUCATION.II);
            }
            this.a.b.q();
        } else if (i == 2) {
            this.a.b.p(j);
        } else if (i != 3 && i != 4) {
        } else {
            this.a.h.kN();
            al alVar3 = this.a;
            if (j != alVar3.i.a) {
                z = false;
            }
            alVar3.R(z);
            al alVar4 = this.a;
            if (alVar4.O) {
                alVar4.w.f(false);
                this.a.pI();
            }
            this.a.b.r(j);
            this.a.N = false;
        }
    }
}
