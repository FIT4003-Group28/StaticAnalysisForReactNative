package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared;

import android.os.Parcel;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e extends dvd implements f, ahzl {
    public ahzl a;

    public e() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.ILiveOverlayServiceListener");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            rV();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }

    @Override // defpackage.ahzl
    public final void rU() {
        this.a.rU();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.f
    public final void rV() {
        this.a.rV();
    }
}
