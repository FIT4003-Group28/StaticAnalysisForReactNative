package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared;

import android.os.Handler;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded.d;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends dvd implements c {
    public final aicn a;
    private final Handler b;

    public b(aicn aicnVar, Handler handler) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.IPaidContentOverlayClient");
        aicnVar.getClass();
        this.a = aicnVar;
        handler.getClass();
        this.b = handler;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c
    public final void a(boolean z) {
        this.b.post(new d(this, z, 1));
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                j();
                break;
            case 2:
                a(dve.j(parcel));
                break;
            case 3:
                i(dve.b(parcel));
                break;
            case 4:
                g(parcel.readLong());
                break;
            case 5:
                h(dve.j(parcel));
                break;
            case 6:
                f(dve.j(parcel));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c
    public final void f(boolean z) {
        this.b.post(new d(this, z));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c
    public final void g(final long j) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded.b
            @Override // java.lang.Runnable
            public final void run() {
                ((aicm) com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b.this.a).c = j;
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c
    public final void h(boolean z) {
        this.b.post(new d(this, z, 2));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c
    public final void i(final CharSequence charSequence) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded.c
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b.this;
                bVar.a.g(charSequence);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c
    public final void j() {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded.a
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b.this.a.h();
            }
        });
    }

    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.IPaidContentOverlayClient");
    }
}
