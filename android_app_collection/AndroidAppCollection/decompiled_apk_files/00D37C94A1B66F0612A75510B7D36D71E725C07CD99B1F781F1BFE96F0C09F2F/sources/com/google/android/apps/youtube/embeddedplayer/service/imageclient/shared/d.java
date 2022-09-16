package com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d extends dvc implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.IEmbedImageClientServiceClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f
    public final void a(BitmapKey bitmapKey, Bitmap bitmap) {
        Parcel pv = pv();
        dve.g(pv, bitmapKey);
        dve.g(pv, bitmap);
        px(2, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f
    public final void f(c cVar) {
        Parcel pv = pv();
        dve.i(pv, cVar);
        px(1, pv);
    }
}
