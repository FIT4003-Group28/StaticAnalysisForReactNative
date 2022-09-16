package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.FancyDismissibleDialogRendererWrapper;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends dvd implements c {
    public g a;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.h b;
    private final Handler c;

    public b(g gVar, Handler handler) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayClient");
        gVar.getClass();
        this.a = gVar;
        handler.getClass();
        this.c = handler;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void a(final int i, final int i2, final int i3) {
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.c
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b.this;
                int i4 = i;
                int i5 = i2;
                int i6 = i3;
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g gVar = bVar.a;
                if (gVar != null) {
                    gVar.l(i4, i5, i6);
                }
            }
        });
    }

    public final void b() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.h hVar = this.b;
        if (hVar != null) {
            hVar.a = null;
            this.b = null;
        }
        this.a = null;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void f(final int i) {
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.a
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b.this;
                int i2 = i;
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g gVar = bVar.a;
                if (gVar != null) {
                    gVar.m(i2);
                }
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void g(final f fVar) {
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.e
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b.this;
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.f fVar2 = fVar;
                if (bVar.a != null) {
                    bVar.b = new h(fVar2);
                    ((n) bVar.a).b = bVar.b;
                }
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void h(CharSequence charSequence) {
        this.c.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.g(this, charSequence, 1));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void i(final Bitmap bitmap) {
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.d
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b.this;
                Bitmap bitmap2 = bitmap;
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g gVar = bVar.a;
                if (gVar != null) {
                    gVar.p(bitmap2);
                }
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void j(boolean z) {
        this.c.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.b(this, z, 2));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void k(boolean z) {
        this.c.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.b(this, z, 3));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void l(boolean z) {
        this.c.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.b(this, z, 4));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void m(boolean z) {
        this.c.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.b(this, z, 1));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void n(boolean z) {
        this.c.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.b(this, z));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void o(FancyDismissibleDialogRendererWrapper fancyDismissibleDialogRendererWrapper) {
        final aqxq aqxqVar = (aqxq) fancyDismissibleDialogRendererWrapper.a;
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.f
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b.this;
                aqxq aqxqVar2 = aqxqVar;
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g gVar = bVar.a;
                if (gVar != null) {
                    gVar.y(aqxqVar2);
                }
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c
    public final void p(CharSequence charSequence) {
        this.c.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.g(this, charSequence));
    }

    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayClient");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        f dVar;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    dVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.IAdOverlayServiceListener");
                    if (queryLocalInterface instanceof f) {
                        dVar = (f) queryLocalInterface;
                    } else {
                        dVar = new d(readStrongBinder);
                    }
                }
                g(dVar);
                break;
            case 2:
                n(dve.j(parcel));
                break;
            case 3:
                k(dve.j(parcel));
                break;
            case 4:
                h(dve.b(parcel));
                break;
            case 5:
                a(parcel.readInt(), parcel.readInt(), parcel.readInt());
                break;
            case 6:
                i((Bitmap) dve.a(parcel, Bitmap.CREATOR));
                break;
            case 7:
                j(dve.j(parcel));
                break;
            case 8:
                p(dve.b(parcel));
                break;
            case 9:
                m(dve.j(parcel));
                break;
            case 10:
                l(dve.j(parcel));
                break;
            case 11:
                f(parcel.readInt());
                break;
            case 12:
                o((FancyDismissibleDialogRendererWrapper) dve.a(parcel, FancyDismissibleDialogRendererWrapper.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
