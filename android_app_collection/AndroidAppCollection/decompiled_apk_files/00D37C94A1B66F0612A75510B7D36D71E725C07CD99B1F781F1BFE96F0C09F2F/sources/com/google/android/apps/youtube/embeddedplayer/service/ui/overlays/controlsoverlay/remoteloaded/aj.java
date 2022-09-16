package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.view.MotionEvent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aj implements zbo {
    final /* synthetic */ al a;

    public aj(al alVar) {
        this.a = alVar;
    }

    @Override // defpackage.zbo
    public final void nM(MotionEvent motionEvent, boolean z) {
        if (this.a.T(motionEvent)) {
            al alVar = this.a;
            alVar.F.a(motionEvent, alVar.g);
        }
    }

    @Override // defpackage.zbo
    public final boolean nQ(MotionEvent motionEvent, boolean z) {
        if (this.a.nI()) {
            al alVar = this.a;
            if (alVar.O && !alVar.F.e && aifr.b((int) motionEvent.getX(), this.a.g.getWidth(), false) != 0) {
                return true;
            }
        }
        return false;
    }
}
