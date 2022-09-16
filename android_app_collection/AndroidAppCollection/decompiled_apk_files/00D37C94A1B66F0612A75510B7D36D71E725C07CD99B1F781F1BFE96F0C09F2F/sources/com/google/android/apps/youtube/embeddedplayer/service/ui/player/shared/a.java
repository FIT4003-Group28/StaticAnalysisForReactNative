package com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared;

import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends dvc implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.IPlayerUiClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.c
    public final void a(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(2, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.c
    public final void f(f fVar) {
        Parcel pv = pv();
        dve.i(pv, fVar);
        px(1, pv);
    }
}
