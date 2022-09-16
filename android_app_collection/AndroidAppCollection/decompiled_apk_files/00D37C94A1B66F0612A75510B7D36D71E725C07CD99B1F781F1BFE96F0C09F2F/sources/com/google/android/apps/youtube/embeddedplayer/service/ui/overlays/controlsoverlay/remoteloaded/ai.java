package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ai implements aifv {
    final /* synthetic */ al a;

    public ai(al alVar) {
        this.a = alVar;
    }

    @Override // defpackage.aifv
    public final void I() {
        al alVar = this.a;
        if (alVar.P) {
            return;
        }
        alVar.P = true;
        alVar.U();
    }

    @Override // defpackage.aifv
    public final void J() {
        al alVar = this.a;
        if (!alVar.P) {
            return;
        }
        alVar.P = false;
        alVar.U();
    }
}
