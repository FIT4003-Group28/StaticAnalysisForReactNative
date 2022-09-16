package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared;

import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class g extends dvc implements i {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarService");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.i
    public final void a(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        px(1, pv);
    }
}
