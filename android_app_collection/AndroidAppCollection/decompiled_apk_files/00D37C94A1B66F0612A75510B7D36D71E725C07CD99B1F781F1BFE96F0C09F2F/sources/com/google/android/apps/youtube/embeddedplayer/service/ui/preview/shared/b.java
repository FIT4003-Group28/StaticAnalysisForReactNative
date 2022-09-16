package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.o;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.p;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends dvd implements c {
    public final aibj a;
    private final Handler b;

    public b(aibj aibjVar, Handler handler) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.IThumbnailOverlayClient");
        aibjVar.getClass();
        this.a = aibjVar;
        handler.getClass();
        this.b = handler;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c
    public final void a() {
        this.b.post(new o(this));
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            h();
        } else if (i == 2) {
            a();
        } else if (i == 3) {
            f();
        } else if (i != 4) {
            return false;
        } else {
            g((Bitmap) dve.a(parcel, Bitmap.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c
    public final void f() {
        this.b.post(new o(this, 2));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c
    public final void g(Bitmap bitmap) {
        this.b.post(new p(this, bitmap));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c
    public final void h() {
        this.b.post(new o(this, 1));
    }

    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.IThumbnailOverlayClient");
    }
}
