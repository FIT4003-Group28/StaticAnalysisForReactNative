package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared;

import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d extends dvc implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f
    public final void a(i iVar) {
        Parcel pv = pv();
        dve.i(pv, iVar);
        px(1, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f
    public final void f(int i, boolean z) {
        Parcel pv = pv();
        pv.writeInt(i);
        dve.e(pv, z);
        px(2, pv);
    }
}
