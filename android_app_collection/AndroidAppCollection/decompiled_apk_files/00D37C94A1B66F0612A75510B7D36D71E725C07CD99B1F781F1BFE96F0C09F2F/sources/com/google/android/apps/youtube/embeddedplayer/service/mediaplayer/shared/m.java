package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class m extends dvc implements o {
    public m(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceTextureServiceListener");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.o
    public final void a(int i, int i2) {
        Parcel pv = pv();
        pv.writeInt(i);
        pv.writeInt(i2);
        px(2, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.o
    public final void f(Surface surface) {
        Parcel pv = pv();
        dve.g(pv, surface);
        px(1, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.o
    public final void g() {
        px(4, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.o
    public final void h() {
        px(3, pv());
    }
}
