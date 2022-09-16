package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends dvc implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.ISubtitlesOverlayClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c
    public final void a() {
        px(2, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c
    public final void f() {
        px(3, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c
    public final void g(float f) {
        Parcel pv = pv();
        pv.writeFloat(f);
        px(4, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c
    public final void h(int i, int i2) {
        Parcel pv = pv();
        pv.writeInt(i);
        pv.writeInt(0);
        px(6, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c
    public final void i(SubtitlesStyle subtitlesStyle) {
        Parcel pv = pv();
        dve.g(pv, subtitlesStyle);
        px(5, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c
    public final void j(List list) {
        Parcel pv = pv();
        pv.writeTypedList(list);
        px(1, pv);
    }
}
