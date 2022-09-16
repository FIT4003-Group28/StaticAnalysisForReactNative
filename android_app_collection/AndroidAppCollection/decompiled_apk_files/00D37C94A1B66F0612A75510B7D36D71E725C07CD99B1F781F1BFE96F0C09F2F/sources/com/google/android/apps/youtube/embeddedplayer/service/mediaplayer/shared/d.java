package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.graphics.Rect;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d extends dvc implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceHolderClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final Rect a() {
        Parcel pw = pw(3, pv());
        Rect rect = (Rect) dve.a(pw, Rect.CREATOR);
        pw.recycle();
        return rect;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final void f(int i, int i2) {
        Parcel pv = pv();
        pv.writeInt(i);
        pv.writeInt(i2);
        px(5, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final void g(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        px(6, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final void h(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(4, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final void i() {
        px(7, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final void j(i iVar) {
        Parcel pv = pv();
        dve.i(pv, iVar);
        px(1, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final void k(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        px(8, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final boolean l() {
        Parcel pw = pw(2, pv());
        boolean j = dve.j(pw);
        pw.recycle();
        return j;
    }
}
