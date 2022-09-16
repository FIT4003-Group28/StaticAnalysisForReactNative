package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service;

import android.view.Surface;
import android.view.SurfaceHolder;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e extends a {
    public Surface c;

    public e(com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar) {
        super(cVar);
    }

    @Override // defpackage.afnh
    public final Surface A() {
        return this.c;
    }

    @Override // defpackage.afnh
    public final SurfaceHolder B() {
        return null;
    }

    @Override // defpackage.afnh
    public final afnk C() {
        return afnk.TEXTURE;
    }

    @Override // defpackage.afmu
    public final void D() {
        Surface surface = this.c;
        if (surface != null) {
            surface.release();
        }
    }

    @Override // defpackage.afmu
    public final boolean E() {
        return this.c != null;
    }
}
