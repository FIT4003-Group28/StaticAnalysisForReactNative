package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bh implements com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.b {
    final /* synthetic */ bp a;

    public bh(bp bpVar) {
        this.a = bpVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.b
    public final void a() {
        this.a.x.l();
        try {
            this.a.c.N();
        } catch (RemoteException e) {
            pcu.h(e);
        }
        com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.h hVar = this.a.B;
        hVar.k = 0;
        hVar.j = 0;
        hVar.i = 0;
        if (hVar.f.hasMessages(0)) {
            hVar.l = "Surface was destroyed. Please make sure the fragment is fully visible on screen.";
            hVar.d.b();
        }
        this.a.k = false;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.b
    public final void b() {
        bp bpVar = this.a;
        bpVar.k = true;
        if (bpVar.l) {
            bpVar.b();
        }
    }
}
