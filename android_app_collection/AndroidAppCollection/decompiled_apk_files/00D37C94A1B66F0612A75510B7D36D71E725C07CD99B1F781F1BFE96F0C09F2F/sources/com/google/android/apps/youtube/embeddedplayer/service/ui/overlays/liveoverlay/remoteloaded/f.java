package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded;

import android.os.RemoteException;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f implements ahzl {
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.f a;

    public f(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.f fVar) {
        fVar.getClass();
        this.a = fVar;
    }

    @Override // defpackage.ahzl
    public final void rU() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.rV();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }

    @Override // defpackage.ahzl
    public final void rV() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.rV();
            } catch (RemoteException e) {
                pcu.h(e);
            }
        }
    }
}
