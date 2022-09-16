package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.view.MotionEvent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ak implements zbs {
    final /* synthetic */ al a;

    public ak(al alVar) {
        this.a = alVar;
    }

    @Override // defpackage.zbs
    public final void b(MotionEvent motionEvent) {
        if (!this.a.nI()) {
            return;
        }
        if (this.a.T(motionEvent)) {
            al alVar = this.a;
            ar arVar = alVar.F;
            if (arVar.e) {
                arVar.a(motionEvent, alVar.g);
                return;
            }
        }
        al alVar2 = this.a;
        if (alVar2.K) {
            if (alVar2.f156J.o) {
                return;
            }
            alVar2.N();
        } else if (!alVar2.S()) {
        } else {
            this.a.G();
            this.a.P(true);
        }
    }
}
