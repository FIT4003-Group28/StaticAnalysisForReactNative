package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.RemoteException;
import android.view.View;
import j$.util.Optional;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ar implements Runnable {
    public final /* synthetic */ ax a;
    private final /* synthetic */ int b;

    public /* synthetic */ ar(ax axVar) {
        this.a = axVar;
    }

    public /* synthetic */ ar(ax axVar, int i) {
        this.b = i;
        this.a = axVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            ax axVar = this.a;
            com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.c cVar = axVar.c;
            cVar.h.d(axVar.j);
        } else if (i == 1) {
            try {
                this.a.k.g();
            } catch (RemoteException unused) {
                aqvb.k("Problem dismissing fullscreen view.", new Object[0]);
            }
        } else {
            Optional a = this.a.c.h.a();
            if (!a.isPresent()) {
                return;
            }
            ((View) a.get()).setVisibility(0);
        }
    }
}
