package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class g extends dvc implements i {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceHolderServiceListener");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.i
    public final void a(int i, int i2, int i3) {
        Parcel pv = pv();
        pv.writeInt(i);
        pv.writeInt(i2);
        pv.writeInt(i3);
        px(2, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.i
    public final void f(Surface surface) {
        Parcel pv = pv();
        dve.g(pv, surface);
        px(1, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.i
    public final void g() {
        px(3, pv());
    }
}
