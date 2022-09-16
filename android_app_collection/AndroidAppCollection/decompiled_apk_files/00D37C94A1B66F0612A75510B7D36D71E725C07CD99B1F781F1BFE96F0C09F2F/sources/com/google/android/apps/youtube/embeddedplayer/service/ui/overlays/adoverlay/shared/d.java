package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d extends dvc implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayServiceListener");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.f
    public final void a(Bundle bundle) {
        Parcel pv = pv();
        dve.g(pv, null);
        px(2, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.f
    public final void b() {
        px(1, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.f
    public final void d() {
        px(3, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.f
    public final void e(int i, int i2) {
        Parcel pv = pv();
        pv.writeInt(i);
        pv.writeInt(i2);
        px(4, pv);
    }
}
