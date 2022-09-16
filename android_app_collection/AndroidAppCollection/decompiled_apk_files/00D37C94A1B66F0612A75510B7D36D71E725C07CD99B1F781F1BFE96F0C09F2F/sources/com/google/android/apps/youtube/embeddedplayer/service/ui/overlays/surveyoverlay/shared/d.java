package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d extends dvc implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.ISurveyOverlayServiceListener");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.f
    public final void a(Bundle bundle) {
        Parcel pv = pv();
        dve.g(pv, null);
        px(3, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.f
    public final void f(int[] iArr) {
        Parcel pv = pv();
        pv.writeIntArray(iArr);
        px(2, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.f
    public final void g(int i, int i2) {
        Parcel pv = pv();
        pv.writeInt(i);
        pv.writeInt(i2);
        px(1, pv);
    }
}
