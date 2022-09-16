package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared;

import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends dvc implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.IPaidContentOverlayClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c
    public final void a(boolean z) {
        Parcel pv = pv();
        dve.e(pv, false);
        px(2, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c
    public final void f(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(6, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c
    public final void g(long j) {
        Parcel pv = pv();
        pv.writeLong(j);
        px(4, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c
    public final void h(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(5, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c
    public final void i(CharSequence charSequence) {
        Parcel pv = pv();
        dve.f(pv, charSequence);
        px(3, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c
    public final void j() {
        px(1, pv());
    }
}
