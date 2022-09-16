package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends dvc implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.IThumbnailOverlayClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c
    public final void a() {
        px(2, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c
    public final void f() {
        px(3, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c
    public final void g(Bitmap bitmap) {
        Parcel pv = pv();
        dve.g(pv, bitmap);
        px(4, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c
    public final void h() {
        px(1, pv());
    }
}
