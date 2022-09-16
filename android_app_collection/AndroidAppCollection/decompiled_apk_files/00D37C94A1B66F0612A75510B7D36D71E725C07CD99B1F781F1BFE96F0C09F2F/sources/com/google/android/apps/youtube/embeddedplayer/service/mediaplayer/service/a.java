package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service;

import android.graphics.Bitmap;
import android.os.RemoteException;
import android.view.SurfaceControl;
import android.view.View;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class a implements afnh {
    public com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c a;
    protected afng b;

    public a(com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.afmu
    public final /* synthetic */ int c() {
        return 0;
    }

    @Override // defpackage.afmu
    public final /* synthetic */ int e() {
        return 0;
    }

    @Override // defpackage.afnh
    public final /* synthetic */ SurfaceControl f() {
        return null;
    }

    @Override // defpackage.afnh
    public final void g(int i) {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.l(i);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.afnh
    public final View h() {
        return null;
    }

    @Override // defpackage.afnh
    public final /* synthetic */ pgg i() {
        return null;
    }

    @Override // defpackage.afnh
    public final /* synthetic */ pxs j() {
        return null;
    }

    @Override // defpackage.afnh
    public final void k() {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.h();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.afmu
    public final void l(Bitmap bitmap, yiw yiwVar) {
        yiwVar.a(bitmap, new Exception());
    }

    @Override // defpackage.afnh
    public final /* synthetic */ void m(Object obj) {
    }

    @Override // defpackage.afnh
    public final void n(int i) {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.i(i);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.afnh
    public final void o() {
        if (this.a != null) {
            afng afngVar = this.b;
            if (afngVar != null) {
                afngVar.d();
            }
            try {
                com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar = this.a;
                if (cVar == null) {
                    return;
                }
                cVar.j();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.afnh
    public final void p() {
    }

    @Override // defpackage.afnh
    public final /* synthetic */ void q() {
    }

    @Override // defpackage.afnh
    public final /* synthetic */ void r(boolean z, byte[] bArr, long j, long j2) {
    }

    @Override // defpackage.afnh
    public final void rO(int i) {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.g(i);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.afmu
    public final int rP() {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                return cVar.a();
            } catch (RemoteException unused) {
                return 0;
            }
        }
        return 0;
    }

    @Override // defpackage.afmu
    public final int rQ() {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                return cVar.f();
            } catch (RemoteException unused) {
                return 0;
            }
        }
        return 0;
    }

    @Override // defpackage.afnh
    public final void s(afng afngVar) {
        this.b = afngVar;
    }

    @Override // defpackage.afnh
    public final void t(afnk afnkVar) {
    }

    @Override // defpackage.afnh
    public final /* synthetic */ void u(afnn afnnVar) {
    }

    @Override // defpackage.afmu
    public final void v(int i, int i2) {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.k(i, i2);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.afnh
    public final /* synthetic */ void w(boolean z) {
    }

    @Override // defpackage.afmu
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // defpackage.afnh
    public final /* synthetic */ void y(boolean z, float f, float f2, int i) {
    }

    @Override // defpackage.afnh
    public final /* synthetic */ void z() {
    }
}
