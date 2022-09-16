package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class j extends dvc implements l {
    public j(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceTextureClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.l
    public final void a(o oVar) {
        Parcel pv = pv();
        dve.i(pv, oVar);
        px(1, pv);
    }
}
