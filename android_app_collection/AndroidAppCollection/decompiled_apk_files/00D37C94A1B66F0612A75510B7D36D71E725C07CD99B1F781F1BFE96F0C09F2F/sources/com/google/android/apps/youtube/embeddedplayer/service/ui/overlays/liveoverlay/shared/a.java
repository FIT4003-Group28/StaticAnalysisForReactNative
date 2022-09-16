package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends dvc implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.ILiveOverlayClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final int a() {
        Parcel pw = pw(6, pv());
        int readInt = pw.readInt();
        pw.recycle();
        return readInt;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final int f() {
        Parcel pw = pw(5, pv());
        int readInt = pw.readInt();
        pw.recycle();
        return readInt;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final void g() {
        px(4, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final void h(Bitmap bitmap) {
        Parcel pv = pv();
        dve.g(pv, bitmap);
        px(7, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final void i(f fVar) {
        Parcel pv = pv();
        dve.i(pv, fVar);
        px(1, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final void j(CharSequence charSequence, CharSequence charSequence2, boolean z, CharSequence charSequence3, int i, CharSequence charSequence4, int i2) {
        Parcel pv = pv();
        dve.f(pv, charSequence);
        dve.f(pv, charSequence2);
        dve.e(pv, z);
        dve.f(pv, charSequence3);
        pv.writeInt(i);
        dve.f(pv, charSequence4);
        pv.writeInt(i2);
        px(2, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c
    public final void k(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        Parcel pv = pv();
        dve.f(pv, charSequence);
        dve.f(pv, charSequence2);
        dve.f(pv, charSequence3);
        px(3, pv);
    }
}
