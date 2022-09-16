package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service;

import android.view.Surface;
import android.view.SurfaceHolder;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c extends a implements SurfaceHolder.Callback {
    private final SurfaceHolder c;
    private boolean d;

    public c(SurfaceHolder surfaceHolder, com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar) {
        super(cVar);
        surfaceHolder.getClass();
        this.c = surfaceHolder;
        surfaceHolder.addCallback(this);
    }

    @Override // defpackage.afnh
    public final Surface A() {
        return ((b) this.c).d;
    }

    @Override // defpackage.afnh
    public final SurfaceHolder B() {
        return this.c;
    }

    @Override // defpackage.afnh
    public final afnk C() {
        return afnk.SURFACE;
    }

    @Override // defpackage.afmu
    public final void D() {
        Surface surface = ((b) this.c).d;
        if (surface != null) {
            surface.release();
        }
    }

    @Override // defpackage.afmu
    public final boolean E() {
        return this.d;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        afng afngVar = this.b;
        if (afngVar != null) {
            afngVar.b();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.d = true;
        afng afngVar = this.b;
        if (afngVar != null) {
            afngVar.c();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.d = false;
        afng afngVar = this.b;
        if (afngVar != null) {
            afngVar.d();
        }
    }
}
