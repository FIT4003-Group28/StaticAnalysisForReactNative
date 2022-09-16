package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.service;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.e;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a implements xge {
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c a;
    private final e b;

    public a(Handler handler, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c cVar) {
        this.a = cVar;
        e eVar = new e(handler);
        this.b = eVar;
        try {
            cVar.g(eVar);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.xge
    public final void d() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.a();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.xge
    public final void f() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.f();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.xge
    public final void g(xgd xgdVar) {
        this.b.a = xgdVar;
    }

    @Override // defpackage.xge
    public final void j(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.h(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.xge
    public final void k() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.i();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.xge
    public final void l(int i) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.k(i);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.xge
    public final void o(String str, List list, boolean z, int i) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.j(str, list, z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.xge
    public final kiu p() {
        return null;
    }
}
