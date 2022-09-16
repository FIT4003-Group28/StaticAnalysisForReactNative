package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared;

import android.os.Handler;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.h;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class h extends dvd implements i {
    public b a;
    private final Handler b;

    public h(Handler handler) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.IHostAppVerificationErrorOverlayServiceListener");
        this.b = handler;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.i
    public final void a() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.service.a
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.b bVar = h.this.a;
                if (bVar != null) {
                    bVar.a();
                }
            }
        });
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }

    public h() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.IHostAppVerificationErrorOverlayServiceListener");
    }
}
