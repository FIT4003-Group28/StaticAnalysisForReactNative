package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends dvc implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.ISurveyOverlayClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void a() {
        px(7, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void f() {
        px(2, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void g(f fVar) {
        Parcel pv = pv();
        dve.i(pv, fVar);
        px(1, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void h(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(3, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void i() {
        px(5, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void j(String str, List list, boolean z) {
        Parcel pv = pv();
        pv.writeString(str);
        pv.writeStringList(list);
        dve.e(pv, z);
        px(4, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void k(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        px(6, pv);
    }
}
