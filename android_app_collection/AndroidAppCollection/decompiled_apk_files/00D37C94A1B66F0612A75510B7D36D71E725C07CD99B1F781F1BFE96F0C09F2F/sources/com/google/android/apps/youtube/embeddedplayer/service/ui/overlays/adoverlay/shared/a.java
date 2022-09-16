package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.FancyDismissibleDialogRendererWrapper;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends dvc implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void a(int i, int i2, int i3) {
        Parcel pv = pv();
        pv.writeInt(i);
        pv.writeInt(i2);
        pv.writeInt(i3);
        px(5, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void f(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        px(11, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void g(f fVar) {
        Parcel pv = pv();
        dve.i(pv, fVar);
        px(1, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void h(CharSequence charSequence) {
        Parcel pv = pv();
        dve.f(pv, charSequence);
        px(4, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void i(Bitmap bitmap) {
        Parcel pv = pv();
        dve.g(pv, bitmap);
        px(6, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void j(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(7, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void k(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(3, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void l(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(10, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void m(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(9, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void n(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(2, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void o(FancyDismissibleDialogRendererWrapper fancyDismissibleDialogRendererWrapper) {
        Parcel pv = pv();
        dve.g(pv, fancyDismissibleDialogRendererWrapper);
        px(12, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void p(CharSequence charSequence) {
        Parcel pv = pv();
        dve.f(pv, charSequence);
        px(8, pv);
    }
}
