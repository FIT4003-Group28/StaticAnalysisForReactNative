package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends dvc implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.IApiMediaViewClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final int a() {
        Parcel pw = pw(2, pv());
        int readInt = pw.readInt();
        pw.recycle();
        return readInt;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final int f() {
        Parcel pw = pw(1, pv());
        int readInt = pw.readInt();
        pw.recycle();
        return readInt;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final void g(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        px(6, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final void h() {
        px(8, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final void i(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        px(7, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final void j() {
        px(4, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final void k(int i, int i2) {
        Parcel pv = pv();
        pv.writeInt(i);
        pv.writeInt(i2);
        px(3, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final void l(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        px(5, pv);
    }
}
